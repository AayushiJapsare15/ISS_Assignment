<html>
<head>
<title>Register</title>
<script src="js/validation.js"></script>
</head>
<body>

<h2>Register</h2>

<form action="register" method="post" onsubmit="return registerValidate()">
    Username: <input type="text" id="ruser" name="ruser"><br><br>
    Password: <input type="password" id="rpass" name="rpass"><br><br>
    <input type="submit" value="Register">
</form>

</body>
</html>
