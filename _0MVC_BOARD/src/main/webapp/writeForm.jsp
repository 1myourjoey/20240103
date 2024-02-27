<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="dto.Member" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>글쓰기 폼</title>
</head>
<body>
    <h2>글쓰기 폼</h2>
    <form action="/write.do" method="post">
        제목: <input type="text" name="title" required><br>
        내용: <textarea name="content" rows="4" cols="50" required></textarea><br>
        <input type="submit" value="글쓰기">
    </form>
</body>
</html>
