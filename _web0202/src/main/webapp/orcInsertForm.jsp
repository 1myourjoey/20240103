<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head> 
<body>
<a href="index.jsp">목록으로</a>
<form action="orcInsert.jsp" method ="post">

번호<input type = "text" name="num"/> <br/>
이름<input type = "text" name="name"/> <br/>
국어<input type = "text" name="kor"/> <br/>
영어<input type = "text" name="eng"/> <br/>
수학<input type = "text" name="math"/> <br/>

<input type ="submit" value="학생 기록 생성">
<input type = "reset">

</form>
</body>
</html>