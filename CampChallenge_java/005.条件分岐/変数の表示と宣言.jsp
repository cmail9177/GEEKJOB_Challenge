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
           
            int a=1;
            
            if(a==1){
               out.print("1です！");
                      
              }
             else if(a==2){
                       out.print("プログラミングキャンプ!");
                       }
          
            else {
             out.print("その他です!");
             
             }
        
        
        
        
        
        
        %>
      
        
        
        </h2>
    </body>
</html>
