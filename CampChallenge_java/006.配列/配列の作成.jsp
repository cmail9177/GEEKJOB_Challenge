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
           
             <%
           
            ArrayList<String> ae= new ArrayList<String>();
            
            ae.add("10");
            ae.add("100");
            ae.add("soeda");
            ae.add("hayashi");
            ae.add("⁻20");
            ae.add("118");
            ae.add("END");
            
            
            ae.set(2,"33");
            
           
            out.print(ae.get(0)+"<br>");
            out.print(ae.get(1)+"<br>");
            out.print(ae.get(2)+"<br>");
            out.print(ae.get(3)+"<br>");
            out.print(ae.get(4)+"<br>");
            out.print(ae.get(5)+"<br>");
            out.print(ae.get(6)+"<br>");
          
            
            
            %>
        </h2>
        
    </body>
</html>
