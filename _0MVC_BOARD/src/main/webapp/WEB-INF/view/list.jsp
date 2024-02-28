<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    Member member = (Member) session.getAttribute("member");
    if (member == null) {
        response.sendRedirect("loginForm.do");
    }
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>게시판 목록</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <style>
        .center-navbar {
            display: flex;
            justify-content: center;
        }

        .navbar-dark .navbar-nav .nav-link {
            color: white;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark" aria-label="Tenth navbar example">
    <div class="container-fluid">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsExample08"
                aria-controls="navbarsExample08" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-md-center" id="navbarsExample08">
            <ul class="navbar-nav">
            
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="write.jsp">Write</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="logout.do">Logout</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">Home</a>
                </li>
                
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-4">
    <table class="table table-bordered">
        <thead>
           		<span class="navbar-text">
            		<strong>Hello, ${member.name}!</strong>
        		</span>
    		                
                              
        <tr>
            <th scope="col">번호</th>
            <th scope="col">제목</th>
            <th scope="col">작성자</th>
            <th scope="col">작성일시</th>
            <th scope="col">조회수</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="board" items="${list}">
            <tr>
                <td>${board.num}</td>
                <td style="text-align:left;">
                    <a href="view.do?num=${board.num}">
                        ${board.title}
                    </a>
                </td>
                <td>${board.name}</td>
                <td>${board.regtime}</td>
                <td>${board.hits}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
</body>
</html>