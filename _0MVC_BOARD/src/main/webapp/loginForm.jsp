<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <!-- 부트스트랩 CDN 추가 -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>

<div class="container mt-5">
    <form class="col-md-4 offset-md-4" action="login.do" method="post">
        <h2 class="mb-4" onclick = "toMain()">Login</h2>
        <div class="form-group">
            <label for="id">ID:</label>
            <input type="text" class="form-control" id="id" name="id" required>
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="text" class="form-control" id="email" name="email" required>
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
function toMain(){
	  window.location.href = "index.jsp";
}</script>
</body>
</html>
