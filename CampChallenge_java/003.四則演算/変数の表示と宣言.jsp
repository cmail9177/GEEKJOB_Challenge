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
           final int a=5;
            int b=5;
            int c=5;
            int d=5;
            
            int A=(b+c);
            
            
            out.print(++A);
            out.print(b++);
             out.print(c--);
             out.print(--d);
            
        
        
        %>
      
        
        
        </h2>
    </body>
</html>
