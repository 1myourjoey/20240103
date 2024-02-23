<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 로그인</title>
<style type="text/css">
div{
	margin : 10px 10px;
	
}
input {
	width: 100%;
}
#divdid {
color : red;}
#divdemail {
	color : blue;
}
#login {
	float: right;
	background-color: #000;
	color: white;
}

</style>
</head>
<body>
<form action="login.jsp" method="post">
<div id="divdid">

<label >ID</label>
<input type = "text" name="id" id="id">
</div>

<div id="divdemail">
<label >EMAIL</label>
<input type = "text" name="email" id="email">
</div>

<button type = "submit" id="login" > 로그인 </button>



</form>
</body>
</html>