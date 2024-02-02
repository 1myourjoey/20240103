<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<%
String url = "jdbc:oracle:thin:@localhost:1521:xe";
Class.forName("oracle.jdbc.driver.OracleDriver");
 
    try ( 
    		Connection conn = DriverManager.getConnection(
            		url, "scott", "tiger");
    	
    ) {
    	
    	String sql = 
                "create table score (" + 
                "    num  int          primary key," + 
                "    name varchar(20),             " +
                "    kor  int,                     " +    
                "    eng  int,                     " +
                "    math int                      " +    
                ")";
    	PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.executeUpdate(sql);
        out.println("성적 테이블 생성 성공 !");
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>

</body>
</html>