<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Set properties</title>
</head>
<body>

<jsp:useBean id="user" class="org.example.User"  scope="session" ></jsp:useBean>

 <form action="update.jsp">
	FirstName : <input type="text" name="firstName"> <br/>
	LastName :  <input type="text" name="lastName"> <br/>
	<input type="submit" value="submit">
</form> 

<%-- <jsp:setProperty property="firstName" name="user" value="Hello"/>

<jsp:setProperty property="lastName" name="user" value="World"/>  --%>

</body>
</html>