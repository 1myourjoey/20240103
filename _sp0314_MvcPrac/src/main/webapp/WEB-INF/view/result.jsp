<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>RESULT PAGE</h1>
 ${loginRequest.id } 님 환영합니다.
 ${loginRequest.email}
 ${str }
 <a href ="${pageContext.request.contextPath }">TO home</a>
</body>
</html>