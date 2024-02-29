<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.Cookie" %>
<%
    String id ="";
		Cookie[] cookies = request.getCookies();
    
   		 if (cookies != null ) { // 쿠키 생성
       		for (Cookie cookie : cookies) {    
         		System.out.println("cookie_name: " + cookie.getName() + "cookie_value: " + cookie.getValue()); // 값 제대로 받는지 확인
           	if (cookie.getName().equals("id")) {
                id = cookie.getValue();
                System.out.println("id from cookie: " + id);
                break;
                }
        }
   		 }
       
%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <!-- 부트스트랩 CDN 추가 -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <style>
        body {
            margin: 0;
            padding: 0;
            height: 100vh; /* 100% 뷰포트 높이 */
            overflow: hidden;
        }

        video {
            position: fixed;
            top: 0;
            left: 0;
            min-width: 100%;
            min-height: 100%;
            z-index: -1;
        }

        .container {
            z-index: 1; /* 다른 내용 위에 오도록 */
            position: relative;
        }

        form {
            background-color: rgba(255, 255, 255, 0.5); /* 배경의 투명도 조절 */
            padding: 20px;
            border-radius: 10px;
            margin-top: 50px;
        }
    </style>
</head>
<body>

<video autoplay loop muted>
    <source src="img/cloud.mp4" type="video/mp4">
    
</video>

<div class="container mt-5">
    <form class="col-md-4 offset-md-4" action="login.do" method="post">
        <h2 class="mb-4" onclick="toMain()">Login</h2>
        <div class="form-group">
            <label for="id">ID:</label>
            <input type="text" class="form-control" id="id" name="id" value="<%=id %>" required>
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="text" class="form-control" id="email" name="email" required>
        </div>
        <div class="form-check mb-3">
            <input type="checkbox" class="form-check-input" checked id="ck" name="ck">
            <label class="form-check-label" for="ck">Remember ID</label>
        </div>
        <button type="submit" class="btn btn-primary">로그인</button>
        <input type="button" value="Join" class="btn btn-primary" onclick="location.href='/_0MVC_BOARD/manage/memberForm.jsp'">
        <input type="button" value="HOME" class="btn btn-primary" onclick="location.href='index.jsp'">
    </form>
</div>

<!-- 부트스트랩 JS 및 Popper.js 추가 (jQuery도 필요하므로 함께 추가) -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script>
    function toMain() {
        window.location.href = "index.jsp";
    }
</script>
</body>
</html>
