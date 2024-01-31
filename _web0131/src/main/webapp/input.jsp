<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "4-7.jsp" method ="post">
	<table border="1">
	<tr>
	<td> 관심언어</td>
	<td>
	<input type="checkbox" name= "lang" value="php">PHP
	<input type="checkbox" name= "lang" value="jsp">jsp
	<input type="checkbox" name= "lang" value="asp.net">asp.net
	</tr>
	<td> 취미</td>
		<td><select name="hobby" size ="4" multiple>
			<option value ="영화">영화</option>
			<option value ="운동">운동</option>
			<option value ="독서">독서</option>
			<option value ="수영">수영</option>
			<option value ="기타">기타</option>
	
	
		</select></td>
	</table>
	<input type = "submit">
	</form>

</body>
</html>