/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jums;

import base.DBManager;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author gushikentatsuya
 */
public class UserDataBeans {
    
    public ArrayList<Integer> IDchecklist(ArrayList<Integer> ID) throws SQLException{
        
        PreparedStatement st =null;
        Connection con = DBManager.getConnection();
        try {
            st = con.prepareStatement("select userID from user_t");
            ResultSet rs =st.executeQuery();
            
            ArrayList <Integer> IDlist = new ArrayList<Integer>();
            
            while(rs.next()){
            IDlist.add(rs.getInt(1));
            }
            
            return IDlist;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDataBeans.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
           con.close();
    
                   }
        return null;
    }

        public ArrayList<Integer> IDlist (ArrayList <Integer>ID){
        
        
            ArrayList<Integer> IDLIST = new ArrayList<Integer>(); 
           
            for(int i = 0; i<ID.size(); i++){
                IDLIST.add(ID.get(i));
            }
            
            
       
        
           
        return IDLIST;
        
        
            
        
}
}
