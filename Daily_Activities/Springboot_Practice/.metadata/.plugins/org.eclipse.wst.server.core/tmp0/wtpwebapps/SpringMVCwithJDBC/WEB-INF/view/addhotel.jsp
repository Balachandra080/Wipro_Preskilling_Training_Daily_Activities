<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hotel Add Form</title>
</head>
<body>
    <h4>Add New Hotel</h4>

    <form action="savehotel" method="post">
        <div>
            <label>Hotel Name : </label>
            <input type="text" required name="name" />
        </div>
        <br>
        <div>
            <label>Address : </label>
            <input type="text" required name="address" />
        </div>
        <br>
        <button type="submit">Add Hotel</button>
    </form>
</body>
</html>
