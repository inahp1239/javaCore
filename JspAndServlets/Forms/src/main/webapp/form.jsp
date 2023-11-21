<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>

<form action="<%= request.getContextPath()%>/Submit" method="post">
	Name : <input type="text" name="name" required> <br/>
	Gender : <input type="radio" name="gender" value="Male" checked>Male
			 <input type="radio" name="gender" value="Female">Female<br/>
	Language : <input type="checkbox"  name="language" value="English">English
			   <input type="checkbox"  name="language" value="Japanesh">Japanesh
			   <input type="checkbox"  name="language" value="Chinese">chinese<br/>
	Country : <select name="country">
			  	<option value="India">India</option>
			  	<option value="Japan">Japan</option>
		  		<option value="China">China</option>
		  	  </select><br/>
	<input type="submit">
</form>

</body>
</html>