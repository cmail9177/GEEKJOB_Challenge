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
            <%@ page import="java.util.Map" %>

            <%
//                
//               String key="1";
//               int count=0;
//               while(key.equals("10000") == false){
//                   key=key+0;
//                   count++;
//                   out.print(key+"<br>");
//                   out.print(count+"回ループ"+"<br>");
//               }
                
               int key=1000;
           
               
               while((key>100)){
                   key=key/2;
                   
                   
                   out.print(key+"<br>");
               }
                   
               
                
                
//               int key=1;
//               int count=0;
//               while((key ==10000) == false){
//                   key=key+1;
//                   count++;
//                   out.print(key+"<br>");
//                   out.print(count+"回ループ"+"<br>");
//               }
                
                
          
            %>



        </h2>
    </body>
</html>
