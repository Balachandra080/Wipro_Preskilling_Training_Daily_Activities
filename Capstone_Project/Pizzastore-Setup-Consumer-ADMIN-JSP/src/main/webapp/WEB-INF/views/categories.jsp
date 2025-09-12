<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Categories</title>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            background: #f5f5f5;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: #ff4b2b;
            color: white;
            padding: 20px;
            text-align: center;
        }
        h1 {
            margin: 0;
            font-size: 2em;
        }
        .container {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            padding: 30px;
        }
        .card {
            background: white;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.2);
            margin: 15px;
            width: 220px;
            overflow: hidden;
            text-align: center;
            transition: transform 0.3s, box-shadow 0.3s;
        }
        .card:hover {
            transform: translateY(-10px);
            box-shadow: 0 12px 16px rgba(0,0,0,0.3);
        }
        .card img {
            width: 100%;
            height: 150px;
            object-fit: cover;
        }
        .card h2 {
            font-size: 1.2em;
            margin: 15px 0 5px 0;
        }
        .card p {
            color: #555;
            margin: 0 0 15px 0;
        }
        .back-btn {
            display: block;
            text-align: center;
            margin: 20px;
            text-decoration: none;
            color: #ff4b2b;
            font-weight: bold;
            border: 2px solid #ff4b2b;
            padding: 10px 20px;
            border-radius: 25px;
            transition: 0.3s;
        }
        .back-btn:hover {
            background: #ff4b2b;
            color: white;
        }
    </style>
</head>
<body>

<header>
    <h1>Our Categories</h1>
</header>

<div class="container">
    <!-- Category 1 -->
    <div class="card">
        <img src="https://images.unsplash.com/photo-1601924579513-43c548cf6d42?auto=format&fit=crop&w=400&q=80" alt="Pizza">
        <h2>Pizza</h2>
        <p>Category ID: 1</p>
    </div>

    <!-- Category 2 -->
    <div class="card">
        <img src="https://images.unsplash.com/photo-1561047029-3000d7f12e2f?auto=format&fit=crop&w=400&q=80" alt="Beverages">
        <h2>Beverages</h2>
        <p>Category ID: 2</p>
    </div>

    <!-- Add more categories as needed -->
</div>

<a class="back-btn" href="/dashboard">Back to Dashboard</a>

</body>
</html>
