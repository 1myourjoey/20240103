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
    <%
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        Class.forName("oracle.jdbc.driver.OracleDriver");
        try ( 
            Connection conn = DriverManager.getConnection(
                    url, "scott", "tiger");
            PreparedStatement pstmt = conn.prepareStatement("update score set name=?, kor=?, eng=?, math=? where num=?");
        ) {
            int num = Integer.parseInt(request.getParameter("num"));
            String name = request.getParameter("name");
            int kor = Integer.parseInt(request.getParameter("kor"));
            int eng = Integer.parseInt(request.getParameter("eng"));
            int math = Integer.parseInt(request.getParameter("math"));
            
            pstmt.setString(1, name);
            pstmt.setInt(2, kor);
            pstmt.setInt(3, eng);
            pstmt.setInt(4, math);
            pstmt.setInt(5, num);
            
            int result = pstmt.executeUpdate();
            
            if (result > 0) {
    %>
                <p>학생 정보가 성공적으로 업데이트되었습니다.</p>
    <%
            } else {
    %>
                <p>학생 정보 업데이트에 실패했습니다.</p>
    <%
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    %>
</body>
</html>
