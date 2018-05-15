<%@page import="java.text.SimpleDateFormat"%>
<%@page import="jums.UserDataDTO"%>
<%@page import="jums.JumsHelper" %>
<%  
    UserDataDTO DTO = (UserDataDTO)request.getAttribute("DTOdate");
    JumsHelper jh = JumsHelper.getInstance();
    SimpleDateFormat s = new SimpleDateFormat("yyyy");
    SimpleDateFormat m = new SimpleDateFormat("MM");
    SimpleDateFormat d = new SimpleDateFormat("dd");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS更新結果画面</title>
    </head>
    <body>
        <h1>変更結果</h1><br>
        名前:<%=DTO.getName()%><br>
        生年月日:<%= s.format(DTO.getBirthday())%>年<%=m.format(DTO.getBirthday())%>月<%=d.format(DTO.getBirthday())%>日<br>
        種別:<%= DTO.getType()%><br>
        電話番号:<%= DTO.getTell()%><br>
        自己紹介:<%= DTO.getComment()%><br>
        以上の内容で登録しました。<br>
    
    
     <%=jh.kensaku()%><br>
    
    <%=jh.home()%>
    </body>
</html>
