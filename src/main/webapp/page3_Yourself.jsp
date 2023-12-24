<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Talk about yourself</title>
</head>
<body>
<form action="/take-call3" method="post">
    <h1><%=request.getAttribute("reply")%></h1>
    <h1> Хто ви?</h1>
    Розповісти про себе <input type="radio" name="option" id="yes" value="responseYes"><br><br>
    Не розповідати про себе <input type="radio" name="option" id="no" value="responseNo"><br><br>
    <input type="submit" value="ВІДПОВІСТИ">
</form>

</body>
</html>
