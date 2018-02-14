<%-- 
    Document   : newjsp1
    Created on : 2018/01/29, 12:55:00
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         
    </head>
    <body><h2>
           <%@ page import="java.util.ArrayList" %>
           <%@ page import="java.util.HashMap" %>
           
        <%
            HashMap<String,String>AA= new HashMap<String,String>();
            AA.put("1","AAA");//("キー""変数")
            AA.put("hello","wold");
            AA.put("soeda","33");
            AA.put("20","30");
            
            
            out.print(AA);
            ArrayList<HashMap>aa=new ArrayList<HashMap>();
            aa.add(AA);
            out.print(aa);
           
            
        %>
      
        
        
        </h2>
    </body>
</html>
