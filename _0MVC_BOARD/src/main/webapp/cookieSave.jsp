<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.Cookie" %>

<%
    String id = request.getParameter("id");
    String ck = request.getParameter("ck");
    
    if (ck != null && ck.equals("on")) { // 쿠키 생성
    	System.out.println("dsd");
        Cookie cookie = new Cookie("id", id);
        cookie.setMaxAge(60 * 24); 

        response.addCookie(cookie);
        
    } else { // 쿠키 삭제
        Cookie cookie = new Cookie("id", null);
        cookie.setMaxAge(0); 

        response.addCookie(cookie);
    }
%>