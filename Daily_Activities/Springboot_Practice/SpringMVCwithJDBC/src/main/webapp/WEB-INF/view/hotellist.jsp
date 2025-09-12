<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hotel List</title>
</head>
<body>
    <h3>List of Hotels</h3>
    <hr>

    <c:forEach var="temp" items="${hotels}">
        Name : ${temp.name} <br>
        Address : ${temp.address} <br>
        <hr>
    </c:forEach>

</body>
</html>
