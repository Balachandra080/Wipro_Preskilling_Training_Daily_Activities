<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2>Available Pizzas</h2>

<table border="1" cellpadding="5">
    <tr>
        <th>Name</th>
        <th>Price</th>
        <th>Category</th>
        <th>Quantity</th>
        <th>Action</th>
    </tr>
    <c:forEach var="item" items="${items}">
        <tr>
            <td>${item.name}</td>
            <td>${item.price}</td>
            <td>${item.categoryId}</td>
            <td>
                <form method="post" action="/orders/place">
                    <input type="hidden" name="itemId" value="${item.id}"/>
                    <input type="number" name="quantity" value="1" min="1"/>
                    <button type="submit">Add to Order</button>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>

<a href="/dashboard">Back to Dashboard</a>
