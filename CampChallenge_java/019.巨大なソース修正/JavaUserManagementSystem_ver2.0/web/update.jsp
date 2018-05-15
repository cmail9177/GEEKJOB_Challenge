<%@page import="java.text.SimpleDateFormat"%>
<%@page import="jums.UserDataBeans"%>
<%@page import="jums.UserDataDTO"%>
<%@page import="jums.Update"%>
<%@page import="jums.JumsHelper" %>
<%
     JumsHelper jh = JumsHelper.getInstance();
     UserDataDTO udd = (UserDataDTO)request.getAttribute("DTOデータ");
     SimpleDateFormat Y = new SimpleDateFormat("yyyy");
     SimpleDateFormat M = new SimpleDateFormat("MM");
     SimpleDateFormat D = new SimpleDateFormat("dd"); 
     String s = "checked='checked'";
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS変更画面</title>
    </head>
    <body>
    <form action="UpdateResult" method="get">
        名前:
        <input type="text" name="name" value="<% out.print(udd.getName());%>">
        <br><br>

        生年月日:　
        <select name="year">
            <option value="<%out.print(Y.format(udd.getBirthday()));%>"><%out.print(Y.format(udd.getBirthday()));%></option>
            <% for(int i=1950; i<=2010; i++){ %>
            <option value="<%=i%>" ><%=i%></option>
            <% } %>
        </select>年
        <select name="month">
            <option value="<%out.print(M.format(udd.getBirthday()));%>"><%out.print(M.format(udd.getBirthday()));%></option>
            <% for(int i = 1; i<=12; i++){ %>
            <option value="<%=i%>" ><%=i%></option>
            <% } %>
        </select>月
        <select name="day">
            <option value="<%out.print(D.format(udd.getBirthday()));%>"><%out.print(D.format(udd.getBirthday()));%></option>
            <% for(int i = 1; i<=31; i++){ %>
            <option value="<%=i%>"><%=i%></option>
            <% } %>
        </select>日
        <br><br>

        種別:
        <br>
           <% for(int i = 1; i<=3; i++){ %>
           <input type="radio" name="type" value="<%=i%>" <%if(udd.getType()==i){out.print(s);};%> > <%=jh.exTypenum(i)%><br>
            <% } %>
        <br>

        電話番号:
        <input type="text" name="tell" value="<%out.print(udd.getTell());%>">
        <br><br>

        自己紹介文
        <br>
        <textarea name="comment"  rows=10 cols=50 style="resize:none" wrap="hard"><%out.print(udd.getComment());%></textarea><br><br>
        
        <button type="submit" name="更新" value="<%= udd.getUserID()%>"> 確認画面へ </button>
        
        
        
        
    </form>
        <br>
        
        <%=jh.modoru()%><br>
        
         <%=jh.kensaku()%><br>
        
        <%=jh.home()%>
    </body>
</html>

