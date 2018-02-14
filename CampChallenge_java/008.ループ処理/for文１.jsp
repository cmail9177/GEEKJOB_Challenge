<%-- 
    Document   : newjsp1
    Created on : 2018/01/29, 12:55:00
    Author     : guest1Day
--%>

<%@ page import="java.util.HashMap" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         
    </head>
    <body><h2>
           <%@ page import="java.util.ArrayList" %>
       <%    
           
      int bb=8;  
            int BB=8;
            for(int i =1;i <=20;i++){    
                bb=bb*BB;                  
                out.println(bb+"<br>");
            }
%>
        
        
        </h2>
    </body>
</html>
