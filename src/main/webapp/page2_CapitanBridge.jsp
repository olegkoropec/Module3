<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Capitan Bridge</title>
</head>
<body>
<form action="/take-call2" method="post">
    <h1><%= request.getAttribute("reply")%></h1>
    <h1> Піднятися на капітанський місток?</h1>
    Так <input type="radio" name="option" id="yes" value="responseYes"><br><br>
    Ні <input type="radio" name="option" id="no" value="responseNo"><br><br>
    <input type="submit" value="ВІДПОВІСТИ">
</form>
</body>
</html>
