<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student List</title>
</head>
<body>
    <h2>List of Students</h2>
    <c:forEach var="temp" items="${studentlist}">
        Name : ${temp.name} <br>
        Age  : ${temp.age} <br><br>
    </c:forEach>
</body>
</html>
