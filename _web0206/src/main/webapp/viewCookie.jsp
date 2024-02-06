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
//클라리언트쪽에 저장되어있는 쿠키정보 가져오기

Cookie cookie [] = request.getCookies();

if (cookie != null) {
	out.print("cookies num:"+cookie.length+"<br>");
}

for(Cookie co :cookie){
out.print(co.getName()+"="+co.getValue()+"<br>");
}
%>
</body>
</html>