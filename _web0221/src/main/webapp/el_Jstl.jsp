<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%
	request.setAttribute("name","홍길동"); // 포워딩 된 것으로 가정
	request.setAttribute("arr2",new int[]{1,2,3,4,5});
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="v" items="${arr2}" varStatus="st">
${v }:${st.index} : ${st.count }<br> 
</c:forEach>
--------------<br>

${intArray = [100,200,300,400,500]; ''}
<c:forEach var="v" items="${intArray}" varStatus="st">
${v }:${st.index }<br> 
</c:forEach>

********<br>
<c:forEach var="i" begin="0" end="10" step="2" varStatus="sta">
${i;''}
${sta.index } <br>
${s= s+i;'' }

</c:forEach>
1~10의 짝수 값 ${s } <br>




${name} <br>
${aaa= 100;'' } <br>
${aaa=aaa + 10 }<br>
$
</body>
</html>