<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>글쓰기</title></head>
<body>

<!-- writeForm.jsp -->
<!-- ... (기존 코드) -->
<form action="writeProcess.do" method="post">
    <label for="title">Title:</label>
    <input type="text" id="title" name="title" required><br>
    
    <label for="content">Content:</label>
    <textarea id="content" name="content" required></textarea><br>
    
    <label for="writerId">Writer ID:</label>
    <input type="text" id="id" name="id" required><br>

    <input type="submit" value="Submit">
</form>
<!-- ... (기존 코드) -->


</body>