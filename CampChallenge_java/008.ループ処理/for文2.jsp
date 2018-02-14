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
        <%
 String a="A";
            String A="大文字";
            String aA="A";
                   
            for(int i =1;i <=30;i++){    
                a=a+a;                 
                out.println(a+"<br>");


     }
    
        %>
      
        
        
        </h2>
    </body>
</html>
