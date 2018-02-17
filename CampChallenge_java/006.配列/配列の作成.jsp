<%-- 
    Document   : IF
    Created on : 2018/02/17, 10:10:27
    Author     : guest1Day
--%>
<%@page import="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%
           
            ArrayList<String> AA = new ArrayList<String>();
                
                AA.add("１０");
                AA.add("１００");
                AA.add("soeda");
                AA.add("hayashi");
                AA.add("-20");
                AA.add("118");
                AA.add("END");
                
            out.print(AA.get(0));
            out.print(AA.get(1));
            out.print(AA.get(2));
            out.print(AA.get(3));
            out.print(AA.get(4));
            out.print(AA.get(5));
            out.print(AA.get(6));
            




            %></h1>
    </body>
</html>
