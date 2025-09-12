<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h2>Pizza Categories</h2>

<ul>
    <c:forEach var="category" items="${categories}">
        <li>${category.name}</li>
    </c:forEach>
</ul>

<a href="/dashboard">Back to Dashboard</a>
