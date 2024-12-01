<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rgister</title>
</head>
<body>
<h4>Register Here</h4>

<c:if test="${not empty succesMsg}">

<h4 style="color:green">${succesMsg }</h4>
</c:if>

<c:if test="${not empty errorMsg}">

<h4 style="color:red">${erroMsg }</h4>
</c:if>

<form action="regform" method="post"> 
Name: <input type="text" name="name"> <br><br>
Email:<input type="email" name="email"> <br><br>
Password: <input type="password" name="password"> <br><br>

<input type="submit" value="register">
</form>
<br><br>
If Already Registered.....<a href="loginpage">Click Here For Login</a>
</body>
</html>