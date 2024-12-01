<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>Login Here</h4>
<h4 style="color:red">${errorMsg}</h4>
<form action="loginform" method="post"> 
Email:<input type="email" name="email"> <br><br>
Password: <input type="password" name="password"> <br><br>

<input type="submit" value="Login">
</form>
<br><br>
If Not Registered.....<a href="regpage">Click Here For Regiter</a>
</body>
</html>