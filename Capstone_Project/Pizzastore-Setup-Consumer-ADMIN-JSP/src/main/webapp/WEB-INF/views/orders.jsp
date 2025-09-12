<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Orders</title>
    <style>
        body { font-family: 'Poppins', sans-serif; margin: 20px; background: #f8f8f8; }
        h2 { color: #ff4b2b; }
        table { width: 100%; border-collapse: collapse; background: white; box-shadow: 0 4px 12px rgba(0,0,0,0.1); }
        th, td { padding: 12px; border: 1px solid #ddd; text-align: center; }
        th { background: #ff4b2b; color: white; }
        tr:hover { background: #f1f1f1; }
        .btn { margin-top: 20px; display: inline-block; padding: 10px 15px; background: #ff4b2b; color: white; border-radius: 5px; text-decoration: none; }
        .btn:hover { background: #ff416c; }
    </style>
</head>
<body>
    <h2>📦 Orders List</h2>
    <table>
        <tr>
            <th>Order ID</th>
            <th>Date & Time</th>
            <th>User ID</th>
        </tr>
        <c:forEach var="order" items="${orders}">
            <tr>
                <td>${order.id}</td>
                <td>${order.orderDateTime}</td>
                <td>${order.user_id}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="/dashboard" class="btn">⬅ Back to Dashboard</a>
</body>
</html>
