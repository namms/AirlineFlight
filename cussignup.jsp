<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method = "post" action = "CusSignupServlet">

<table>
			<tr>
				<td>Full Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td>Email id:</td>
				<td><input type="text" name="emailid"></td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><input type="text" name="phonenumber"></td>
			</tr>
			
			
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>Confirm Password:</td>
				<td><input type="password" name="cpassword"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Signup"></td>
			</tr>
		</table>
</form>
</body>
</html>