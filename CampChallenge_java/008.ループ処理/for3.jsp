<%-- 
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
               int bb=0;  
                    
            for(int i =0;i <=100;i++){     

                bb+=i;                 
                            
                
                
                out.println(bb+"<br>");}


            %>



        </h2>
    </body>
</html>
