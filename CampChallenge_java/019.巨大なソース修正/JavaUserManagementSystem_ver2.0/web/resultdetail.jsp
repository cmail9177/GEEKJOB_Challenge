<%@page import="jums.JumsHelper"
        import="jums.UserDataDTO" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
    UserDataDTO udd = (UserDataDTO)request.getAttribute("resultData");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMSユーザー情報詳細画面</title>
    </head>
    <body>
        <h1>詳細情報</h1>
        UserID<%= udd.getUserID()%><br>
        名前:<%= udd.getName()%><br>
        生年月日:<%= udd.getBirthday()%><br>
        種別:<%= udd.getType()%><br>
        電話番号:<%= udd.getTell()%><br>
        自己紹介:<%= udd.getComment()%><br>
        登録日時:<%= udd.getNewDate()%><br>
        
        <form action="Update" method="get">
            <button type="submit" name="id" value="<%= udd.getUserID()%>" style="width:100px">変更</button>
        </form>
        
        <form action="Delete" method="get">
            <button type="submit"  name="id" value="<%= udd.getUserID()%>" style="width:100px">削除</button><br>
            
        </form>
            <%=jh.kensaku()%><br>
    </body>
    <%=jh.home()%>
</html>
