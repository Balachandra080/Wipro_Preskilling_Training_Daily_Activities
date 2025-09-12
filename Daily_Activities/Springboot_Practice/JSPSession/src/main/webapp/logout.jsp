<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Logout</title>
</head>
<body>

<%
    // Remove the specific session attribute
    session.removeAttribute("loginuser");

    session.invalidate(); // removes all attributes and refreshes the tunnel

    // Redirect back to login page
    response.sendRedirect("login.jsp");
%>

</body>
</html>
