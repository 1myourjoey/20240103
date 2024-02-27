<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <title>게시물 상세보기</title>
</head>
<body style="background-color: #f8f9fa;">

<div class="container mt-4">
    <h2 class="mb-4">게시물 상세보기</h2>

    <table class="table table-bordered" style="background-color: #ffffff;">
        <tr>
            <th style="width: 20%;">제목</th>
            <td>${bd.title}</td>
        </tr>
        <tr>
            <th>작성자</th>
            <td>${bd.name}</td>
        </tr>
        <tr>
            <th>작성일시</th>
            <td>${bd.regtime}</td>
        </tr>
        <tr>
            <th>조회수</th>
            <td>${bd.hits}</td>
        </tr>
        <tr>
            <th>내용</th>
            <td>${bd.content}</td>
        </tr>
    </table>

    <div class="mt-4">
        <input type="button" class="btn btn-secondary" value="목록보기" onclick="location.href='list.do'">
        <input type="button" class="btn btn-warning" value="수정" onclick="location.href='update.do?num=${bd.num}'">
        <input type="button" class="btn btn-danger" value="삭제" onclick="location.href='deleteForm.jsp?num=${bd.num}'">
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
