<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="jums.UserDataBeans"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="base.DBManager"%>
<%@page import="jums.JumsHelper"
        import="jums.UserDataDTO"
        import="jums.UserDataDAO"%>
<%
    JumsHelper jh = JumsHelper.getInstance();
    String s = (String)request.getAttribute("resultdata");
    Connection con =null;
    PreparedStatement st = null;
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS検索結果画面</title>
    </head>
    <body>
        <h1>検索結果</h1>
        <table border=1>
            <tr>
                <th>名前</th>
                <th>生年</th>
                <th>種別</th>
                <th>登録日時</th>
            </tr>
            <% // if(udd.getName()=="" && udd.getUserID()==0){
                con =DBManager.getConnection();
                st = con.prepareStatement("select*from user_t");
                ResultSet rs =st.executeQuery();
                SimpleDateFormat S = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Calendar C = Calendar.getInstance();
                if(s==""){
                while(rs.next()){%>
                   <tr>
                <td><a href="ResultDetail?id=<%= rs.getInt(1)%>"><%= rs.getString(2)%></a></td>
                <td><%= rs.getDate(3)%></td>
                <td><%= rs.getInt(5)%></td>
                <td><%= rs.getTimestamp(7)%></td>
                  </tr>
                <%}}else{UserDataDTO udd = (UserDataDTO)request.getAttribute("resultData");%>
                
                
             
            <tr>
                <td><a href="ResultDetail?id=<%= udd.getUserID()%>"><%= udd.getName()%></a></td>
                <td><%= udd.getBirthday()%></td>
                <td><%= udd.getType()%></td>
                <td><%= udd.getNewDate()%></td>
            </tr>
              <%}%>
        </table>
            
    </body>
    <%=jh.home()%>
</html>
