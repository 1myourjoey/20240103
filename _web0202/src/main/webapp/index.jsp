<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>학생 정보관리 홈페이지</title>
    <style>
        body {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }
        
        h1 {
            text-align: center;
        }

        a, button {
            margin: 10px;
            padding: 10px 20px;
            font-size: 16px;
        }
    </style>
</head>
<body>
    <h1>학생 정보관리 홈페이지</h1>
    
    <button onclick="location.href='orcSelect.jsp'">학생목록</button>
    <button onclick="location.href='orcInsertForm.jsp'">학생입력</button>
    <button onclick="location.href='delete.jsp'">삭제</button>
</body>
</html>