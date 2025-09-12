<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Printing the data from servlet</title>
</head>
<body>

    Name : <%= request.getAttribute("name") %>
    <br>
    Mobile : <%= request.getAttribute("mobile") %>
    <br>

</body>
</html>
