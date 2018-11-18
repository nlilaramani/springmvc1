<%-- 
    Document   : register.jsp
    Created on : Nov 17, 2018, 10:51:57 PM
    Author     : itexps
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                <h1><center>User Profile</center></h1>
		<center>
		<form action="process.htm" id="myForm" name="registrationForm" method="post">
			<table>
				<tr>
					<td class="label">Last Name:</td>
					<td><input  name="lname" type="text"/></td>
				</tr>
				<tr>
					<td class="label">First Name: </td>
					<td><input name="fname" type="text"/></td>
				</tr>
				<tr>
					<td>E-mail: </td>
					<td><input name="email" type="text"/></td>
				</tr>
				<tr>
					<td>User Name: </td>
					<td><input name="username" type="text"/></td>
				</tr>
				<tr>
					<td>Password: </td>
					<td><input name="password" type="password" class="pwd"/></td>
				</tr>
				<tr>
					<td>Gender: </td>
					<td><input type="radio" name="gender"/>Male<input type="radio" name="gender"/>Female</td>
				</tr>
				<tr>
					<td>Highest Qualification:</td>
					<td><select>
							<Option>Highschool Diploma</option>
							<Option>Bachelors</option>
							<Option>Masters</option>
							<Option>PhD</option>
						</select>
					</td>
				</tr>
				
				<tr>
					<td>Agree to terms and conditions: </td>
					<td><input checked="checked" type="checkbox" name="terms"/></td>
				</tr>
				
				<tr>
					<td></td>
					<td><input type="submit" name="register" value="Register"/></td>
				</tr>				
				<tr>
					<td></td>
					<td><a href="#" onClick='document.getElementById("myForm").reset();return false;'>   Reset Form</a></td>
				</tr>				

				</table>
		</form>
		</center>
                        </body>
</html>
