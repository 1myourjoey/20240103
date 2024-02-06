<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Cookie ck = new Cookie("loginId","admin");
ck.setMaxAge(60); // 60초 1분만 살아있는 쿠키
response.addCookie(ck);


%>

<%=ck.getName() %> <br>
<%=ck.getValue() %>
</body>
</html>