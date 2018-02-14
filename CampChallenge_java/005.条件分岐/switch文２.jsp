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
           
            char a ='A';
            
            switch(a){
                case 'あ':
            out.print("日本語"+"<br>");
            break;
            
                case 'A':
                out.print("英語");
                break;
            }
        %>
      
        
        
        </h2>
    </body>
</html>
