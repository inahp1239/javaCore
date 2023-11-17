<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Not Found</title>
</head>
<body>

URL is not correct
<br/>
<a href=" <%= request.getContextPath()%>/Controller?page=back">Back</a>

</body>
</html>