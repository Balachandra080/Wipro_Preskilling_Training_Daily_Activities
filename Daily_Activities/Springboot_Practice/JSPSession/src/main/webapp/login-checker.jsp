<%@ page import="java.io.PrintWriter" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
    // Check if session variable exists
    String loginUser = (String) session.getAttribute("loginuser");

    if (loginUser == null) {
        // If no session → redirect to login page
        response.sendRedirect("login.jsp");
    } else {
        // If session exists → allow access
        PrintWriter pw = response.getWriter();
        pw.write("testing");
        pw.close();
    }
%>
