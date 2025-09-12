<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Verification Page</title>
</head>
<body>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    // Hardcoded credentials for testing (admin/admin)
    if (username.equals("admin") && password.equals("admin")) 
    {
        // set session variable
        session.setAttribute("loginuser", "admin"); // update the session tunnel with the attribute
        response.sendRedirect("home.jsp");   // redirect to home if valid
    } 
    else 
    {
        response.sendRedirect("login.jsp"); //going to secure page
    }
%>

</body>
</html>
