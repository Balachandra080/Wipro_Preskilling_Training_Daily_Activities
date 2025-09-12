<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product List</title>
</head>
<body>

<%
    ResultSet rs = (ResultSet) request.getAttribute("resultset");
%>

<table border="1" cellpadding="5" cellspacing="0">
    <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Price</th>
            <th>Discount</th>
            <th>Unit</th>
        </tr>
    </thead>
    <tbody>
    <%
        if (rs != null) {
            while (rs.next()) {
    %>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("name") %></td>
            <td><%= rs.getDouble("price") %></td>
            <td><%= rs.getDouble("discount") %></td>
            <td><%= rs.getDouble("unit") %></td>
        </tr>
    <%
            }
        } else {
    %>
        <tr>
            <td colspan="5">No records found.</td>
        </tr>
    <%
        }
    %>
    </tbody>
</table>

</body>
</html>