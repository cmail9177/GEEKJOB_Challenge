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
            String a="英語";
            String A="大文字";
            String aA="A";
                   
            for(int i =1;i <=30;i++){     //10以下の場合繰り返す、繰り返す毎＋１
                a=a+A+aA;                  //右の結果を左に代入
                out.println(a+"<br>");
            }
        %>
      
        
        
        </h2>
    </body>
</html>
