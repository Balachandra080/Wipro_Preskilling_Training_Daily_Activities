<html>
<head>
    <meta charset="UTF-8">
    <title>Home page</title>
</head>
<body>
    <!--
    Steps to protect this page:
    1. We need to check if session data exists or not
    2. If session data is available → user is logged in
    3. If session data is not available → redirect to login.jsp
    

        <%
        // session variable called "loginuser"
        String loginUser = (String) session.getAttribute("loginuser");

        if (loginUser == null) {
            response.sendRedirect("login.jsp");
        }
        %>
     -->
     
     <jsp:include page="login-checker.jsp"></jsp:include>

    <h2>Welcome to my secure application</h2>
    <a href="logout.jsp"> Logout</a>
</body>
</html>
