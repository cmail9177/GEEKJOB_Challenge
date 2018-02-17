<%-- 
    Document   : IF
    Created on : 2018/02/17, 10:10:27
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%
            int aa=(1);
            int BB=(2);
            
            if(aa == 1){
                out.print("１です！");
            }else if(BB==2){
                out.print("プログラミングキャンプです！");
            }else{
                out.print("その他です！");
            }
            %></h1>
    </body>
</html>
