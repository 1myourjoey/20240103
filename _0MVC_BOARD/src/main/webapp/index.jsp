<%@page import="dto.Member"%>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 세션에서 로그인 정보를 가져옴
HttpSession session1 = request.getSession(false);
Member member = (session1 != null) ? (Member) session1.getAttribute("member") : null;
%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>The MVC applied to all Web</title>
    <link rel="icon" href="favicon.ico" type="image/x-icon">
    <script src="https://kit.fontawesome.com/c47106c6a7.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/style.css">
    <script src="js/ie.js"></script>
</head>

<body>

    <header style="background-color: #2B3856; color: white;">
        <div class="inner">
            <h1><a href="index.jsp" style="color: white;">Joey's Project</a></h1>

            <ul id="gnb">
               
                <li><a href="list.do" style="color: white;">BOARD</a></li>
                
            </ul>

            <ul class="util">
            <li><a href="manage/manage.jsp" style="color: white;">MANAGE For ADMIN</a></li>
                
               <% if (member != null) { %>
                    <!-- 로그인된 경우 -->
                    <li><a href="logout.do" style="color: white;">Logout</a></li>
                <% } else { %>
                    <!-- 로그인되지 않은 경우 -->
                    <li><a href="loginForm.jsp" style="color: white;">Login</a></li>
                <% } %>
                <li><a href="/_0MVC_BOARD/manage/memberForm.jsp" style="color: white;">Join</a></li>
               
            </ul>
        </div>
    </header>


    <figure>
        <video src="img/humpback.mp4" autoplay muted loop></video>
        <div class="inner">
            <h1>BOARD Sampling</h1>
            <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. <br>
                Id praesentium molestias similique quaerat magni facere in a? Adipisci, possimus reprehenderit!</p>
            <a href="#">view detail</a>
        </div>
    </figure>

    
    <footer>
        <div class="inner">
            <div class="upper">
                <h1>JOEYSLAB</h1>
                <ul>
                    <li><a href="#">Policy</a></li>
                    <li><a href="#">Terms</a></li>
                    <li><a href="#">Family Site</a></li>
                    <li><a href="#">Sitemap</a></li>
                </ul>
            </div>

            <div class="lower">
                <address>
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Quas, facere.<br>
                    TEL : 031-111-1234 C.P : 010-1234-5678
                </address>
                <p>
                    2020 DOCDELAB &copy; copyright all right reserved.
                </p>
            </div>
        </div>
    </footer>




</body>

</html>