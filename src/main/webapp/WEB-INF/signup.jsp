<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>

<form action="/register" method="post" modelAttribute="signup" >
    <table>
        <tr>
            <td><label path="name">Enter Name </label></td>
            <td><input type="text" path="name" id="name" name="name" /></td>
        </tr>
        <tr>
            <td><label path="email">Enter Email </label></td>
            <td><input type="email" id="email" name="email"></td>
        </tr>
        <tr>
            <td><label path="dob">Enter Date of Birth </label></td>
            <td><input type="date" id="dob" name="dob"></td>
        </tr>
        <tr>
            <td><label path="phone">Enter Phone No. </label></td>
            <td><input id="phone" name="phone"></td>
        </tr>
        <tr>
            <td><label path="username">Enter UserName  </label></td>
            <td><input type="text" path="username" id="username" name="username" /></td>
        </tr>
        <tr>
            <td><label path="password">Enter Password</label></td>
            <td><input type="password" path="password" id="password" name="password" /></td>
        </tr>
        <tr>
            <td><input type="submit" name="submit" value="Register" /></td>
        </tr>
        
    </table>
</form>

</center>
</body>
</html>