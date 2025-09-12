<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Delivery Status</title>
</head>
<body>
    <h2>Delivery Status</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Order ID</th>
            <th>Status</th>
            <th>Updated DateTime</th>
        </tr>
        <c:forEach var="ds" items="${statuses}">
            <tr>
                <td>${ds.id}</td>
                <td>${ds.orderId}</td>
                <td>${ds.status}</td>
                <td>${ds.updatedDateTime}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
