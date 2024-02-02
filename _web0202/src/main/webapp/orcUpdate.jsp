<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
    <button onclick="location.href='index.jsp'"> HOME </button>
    
    <form action="orcUpdateForm.jsp" method="post">
        <label for="num">번호:</label>
        <input type="text" name="num" value="<%=request.getParameter("num")%>" readonly /><br/>
        <label for="name">이름:</label>
        <input type="text" name="name" value="<%=request.getParameter("name")%>" /><br/>
        <label for="kor">국어:</label>
        <input type="text" name="kor" value="<%=request.getParameter("kor")%>" /><br/>
        <label for="eng">영어:</label>
        <input type="text" name="eng" value="<%=request.getParameter("eng")%>" /><br/>
        <label for="math">수학:</label>
        <input type="text" name="math" value="<%=request.getParameter("math")%>" /><br/>
        <input type="submit" value="수정"/>
    </form>
</body>
</html>
