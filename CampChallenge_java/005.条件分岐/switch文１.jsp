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
            
            switch(a){
                case 1:
            out.print("one");
            break;
            
                case 2:
                out.print("two");
                break;
                
                default:
                    out.print("想定外");
                    break;
                    
                  
               
                    
            }
             
             
        
        
        
        
        
        
        %>
      
        
        
        </h2>
    </body>
</html>
