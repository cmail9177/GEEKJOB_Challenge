package jums;

import base.DBManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.util.ArrayList;

/**
 * ユーザー情報を格納するテーブルに対しての操作処理を包括する
 * DB接続系はDBManagerクラスに一任
 * 基本的にはやりたい1種類の動作に対して1メソッド
 * @author hayashi-s
 */
public class UserDataDAO {
    
    //インスタンスオブジェクトを返却させてコードの簡略化
    public static UserDataDAO getInstance(){
        return new UserDataDAO();
    }
    
    /**
     * データの挿入処理を行う。現在時刻は挿入直前に生成
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー 
     */
    public void insert(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            st =  con.prepareStatement("INSERT INTO user_t(name,birthday,tell,type,comment,newDate,userID) VALUES(?,?,?,?,?,?,?)");
            st.setString(1, ud.getName());
            st.setDate(2, new java.sql.Date(ud.getBirthday().getTime()));//指定のタイムスタンプ値からSQL格納用のDATE型に変更
            st.setString(3, ud.getTell());
            st.setInt(4, ud.getType());
            st.setString(5, ud.getComment());
            st.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
            st.setInt(7,ud.getUserID());
            st.executeUpdate();
            System.out.println("insert completed");
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException("DBに書き込みエラー"+"<br>"+e);
        }finally{
            if(con != null){
                con.close();
            }
        }

    }
    
    /**
     * データの検索処理を行う。
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー 
     * @return 検索結果
     */
    public UserDataDTO search(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            
            
            String sql = "SELECT * FROM user_t";
            boolean chek = false;
            
            if (!ud.getName().equals("")){
               sql += " WHERE name like '%"+ud.getName()+"%'";
               chek = true;
              }
            
            if(ud.getBirthday()!=null && chek){
                sql += " or birthday like "+new SimpleDateFormat("yyyy").format(ud.getBirthday())+"";
              }else if(ud.getBirthday()!=null &&!chek){
                  sql += " WHERE birthday like '"+new SimpleDateFormat("yyyy").format(ud.getBirthday())+"%'";
                  chek = true;
              }
            
            if (ud.getType()!=0 && chek){
               sql += " or type like "+ud.getType()+"";
            }else if(ud.getType()!=0 && !chek){
                sql += " WHERE type like "+ud.getType()+"";
            }
            
            st =  con.prepareStatement(sql);
            
            
            ResultSet rs = st.executeQuery();
            UserDataDTO resultUd = new UserDataDTO();
            
           
              rs.next();
         
              resultUd.setUserID(rs.getInt(1));
        
            resultUd.setName(rs.getString(2));
            resultUd.setBirthday(rs.getDate(3));
            resultUd.setTell(rs.getString(4));
            resultUd.setType(rs.getInt(5));
            resultUd.setComment(rs.getString(6));
            resultUd.setNewDate(rs.getTimestamp(7));
            
           
            
            return resultUd ;
            
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }

    }
    
    
    public ResultSet orizinal() throws SQLException{
        
        String SQL = "select * form user_t";
        Connection con = null;
        UserDataBeans UDB = new UserDataBeans();
        PreparedStatement st = null;
        
       try{
           con = DBManager.getConnection();
           
           
           st = con.prepareStatement(SQL);
           
           ResultSet rs =st.executeQuery();
           while(rs.next()){
               
              rs.getInt(1);
              rs.getString(2);
              rs.getDate(3);
              rs.getString(4);
              rs.getInt(5);
              rs.getString(6);
              rs.getTimestamp(7);
            
              
               
           }
           return rs;
       
       }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        
        
        //コネクション
        //データアクセス
        //プレペアードスタットメント
        //リターンでDBから検索した人のデータを全部返す。
       }
    }
    
    
    
    
    
    
    /**
     * ユーザーIDによる1件のデータの検索処理を行う。
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー 
     * @return 検索結果
     */
    public UserDataDTO searchByID(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        try{
            con = DBManager.getConnection();
            
            String sql = "SELECT * FROM user_t WHERE userID = ?";
            
            st =  con.prepareStatement(sql);
            st.setInt(1, ud.getUserID());
            
            ResultSet rs = st.executeQuery();
            
            UserDataDTO resultUd = new UserDataDTO();
            
            while(rs.next()){
            resultUd.setUserID(rs.getInt(1));
            resultUd.setName(rs.getString(2));
            resultUd.setBirthday(rs.getDate(3));
            resultUd.setTell(rs.getString(4));
            resultUd.setType(rs.getInt(5));
            resultUd.setComment(rs.getString(6));
            resultUd.setNewDate(rs.getTimestamp(7));
            }
            
            System.out.println("searchByID completed");
            return resultUd;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }

    }
}
