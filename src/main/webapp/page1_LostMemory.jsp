<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lost memory</title>
</head>
<body>
<form action="/startConversation" method="post">
    <h1> <%= (String) session.getAttribute("namePassenger") %> </h1>
    <h1>Ви втрачаєте пам'ять. Прийнати виклик НЛО?</h1>
    Прийняти виклик <input type="radio" name="option" id="yes" value="responseYes"><br><br>
    Відхилити виклик <input type="radio" name="option" id="no" value="responseNo"><br><br>
    <input type="submit" name="option" value="ВІДПОВІСТИ">
</form>
</body>
</html>
