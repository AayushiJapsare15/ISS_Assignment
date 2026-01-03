<html>
<head>
<title>Login</title>
<script src="js/validation.js"></script>
</head>
<body>

<h2>Login</h2>

<form action="login" method="post" onsubmit="return loginValidate()">
    Username: <input type="text" id="user" name="user"><br><br>
    Password: <input type="password" id="pass" name="pass"><br><br>
    <input type="submit" value="Login">
</form>

<p style="color:red">
<%= request.getAttribute("error") == null ? "" : request.getAttribute("error") %>
</p>

<a href="register.jsp">New user? Register</a>

</body>
</html>
