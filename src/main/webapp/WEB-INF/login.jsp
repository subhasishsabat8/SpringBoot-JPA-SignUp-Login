<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body><!-- method="post" -->
	<center>

		<form action="/submitLogin" method="post"  modelAttribute="login">
			<table>
				<tr>
					<td><label path="username">UserName: </label></td>
					<td><input type="text" path="username" id="username" name="username" /></td>
				</tr>
				<tr>
					<td><label path="password">Password</label></td>
					<td><input type="password" path="password" id="password" name="password" /></td>
				</tr>
				<tr>
					<td><input type="submit" name="submit" value="Login" /></td>
				</tr>
				<tr>
					<td><a href="/signup">New User? Register Here</a></td>
				</tr>

			</table>
		</form>

	</center>
</body>
</html>