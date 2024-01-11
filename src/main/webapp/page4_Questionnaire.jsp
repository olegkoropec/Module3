<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Questionnaire</title>
</head>
<body>
<form action="/aboutUser" method="post">
    <h1><%=request.getAttribute("reply")%></h1>
    Name: <input type="text" name="name"/> <br><br>
    Surname: <input type="text" name="surname"/> <br><br>
    Age: <input type="date" name="age"><br><br>
    Country: <select name="country">
    <option></option>
    <option>Ukraine</option>
    <option>USA</option>
    <option>UK</option>
    <option>India</option>
    <option>Turkey</option>
    <option>China</option>
    <option>Germany</option>
    <br><br>
    Email: <input type="email" name="email"><br><br>
    Gender: <input type="radio" name="gender" value="madame"/>Female
    <input type="radio" name="gender" value="mister" checked/>Male <br><br>
    <input type="submit" value="ВІДПОВІСТИ">
</form>
</body>
</html>
