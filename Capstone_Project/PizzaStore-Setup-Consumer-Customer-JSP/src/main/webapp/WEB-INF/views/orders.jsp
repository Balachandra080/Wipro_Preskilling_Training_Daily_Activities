<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2>My Orders</h2>

<table border="1" cellpadding="5">
    <tr>
        <th>Order ID</th>
        <th>Items</th>
        <th>Total Price</th>
        <th>Status</th>
        <th>Delivery Status</th>
    </tr>
    <c:forEach var="order" items="${orders}">
        <tr>
            <td>${order.id}</td>
            <td>
                <c:forEach var="item" items="${order.items}">
                    ${item.name} (${item.quantity})<br/>
                </c:forEach>
            </td>
            <td>${order.totalPrice}</td>
            <td>${order.status}</td>
            <td>${order.deliveryStatus}</td>
        </tr>
    </c:forEach>
</table>

<a href="/dashboard">Back to Dashboard</a>
