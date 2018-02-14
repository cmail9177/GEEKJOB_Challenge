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
            String a="あ";
            String A="い";
            String aA="A";
                    
            int bb=8;  
            int BB=8;
            for(int i =1;i <=20;i++){     //10以下の場合繰り返す、繰り返す毎＋１
                bb=bb*BB;                  //右の結果を左に代入
                out.println(bb+"<br>");
            }
        %>
      
        
        
        </h2>
    </body>
</html>
