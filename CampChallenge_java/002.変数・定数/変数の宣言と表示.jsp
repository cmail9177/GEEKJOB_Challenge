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
            String a="私の";
            String A="名前は";
            String aA="具志堅です";
                   
           out.print(a+A+aA);
        %>
      
        
        
        </h2>
    </body>
</html>
