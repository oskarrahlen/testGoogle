<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="/spring-mvc/login" method="POST">
<p><font color="red">${errorMessage}</font></p>
Enter your name <input type="text" name="name"/> Password: <input type="password" name="pass"/>  <input type="submit" value="Login"/>
</form>
</body>
</html>