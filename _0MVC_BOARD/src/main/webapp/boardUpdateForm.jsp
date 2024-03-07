<%@page import="dto.Member"%>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
    String mno = request.getParameter("num");
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
    String sql = "select * from board where num = ?";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setInt(1, Integer.parseInt(mno));
    ResultSet rs = pstmt.executeQuery();
    int num = 0;
    int memberno = 0;
    String title = null;
    String content = null;

    if (rs.next()){
    	num = rs.getInt("num");  // "num" 컬럼 값 받기
        title = rs.getString("title");
        content = rs.getString("content");
        memberno = rs.getInt("memberno");  // "memberno" 컬럼 값 받기
    }
    Member loggedMember = (Member) session.getAttribute("member");

    // 로그인한 사용자와 글 작성자가 같은지 확인
    boolean Author = (loggedMember != null && memberno == loggedMember.getMemberno());
    
    // 작성자와 로그인한 사용자가 다르면 수정 불가능하도록 처리
      if (!Author) {
%>
        <script>
            alert("본인이 아니면 수정이 불가능합니다.");
            window.history.back(); // 뒤로 가기
        </script>
<%
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시글 수정</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>
    <div class="container" style="padding-top: 50px">
        <form action="boardUpdate.jsp" method="post">
            <input type="hidden" name="num" value="<%=num%>"> <!-- 숨겨진 필드에 글 번호 전달 -->
            <input type="hidden" name="memberno" value="<%=memberno%>"> <!-- 숨겨진 필드에 글 번호 전달 -->
            <div class="mb-3">
                <label for="titleInput" class="form-label">Title</label> 
                <input type="text" name="title" value="<%=title%>" class="form-control" id="title" placeholder="제목">
            </div>
            <div class="mb-3">
                <label for="contentinput" class="form-label">Content</label> 
                <textarea name="content" class="form-control" id="content" placeholder="내용" rows="5"><%=content%></textarea>
            </div>
            
            <button class="btn btn-secondary w-100 py-2" type="submit">수정</button>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>
