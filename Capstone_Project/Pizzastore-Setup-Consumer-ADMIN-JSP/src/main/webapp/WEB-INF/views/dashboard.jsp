<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Pizza Store Dashboard</title>
    <style>
        body {
            margin: 0;
            font-family: 'Poppins', sans-serif;
            background: #f8f8f8;
        }

        /* Navbar */
        .navbar {
            background: #ff4b2b;
            color: white;
            padding: 15px 40px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .navbar h1 {
            margin: 0;
            font-size: 24px;
        }
        .navbar a {
            color: white;
            margin: 0 15px;
            text-decoration: none;
            font-weight: bold;
        }
        .navbar a:hover {
            text-decoration: underline;
        }

        /* Hero Section */
        .hero {
            background: url("https://images.unsplash.com/photo-1601924928376-3ec3c2d31a42") no-repeat center center/cover;
            height: 300px;
            display: flex;
            align-items: center;
            justify-content: center;
            color: white;
            text-shadow: 2px 2px 6px rgba(0,0,0,0.6);
        }
        .hero h2 {
            font-size: 40px;
            margin: 0;
        }

        /* Dashboard Content */
        .container {
            padding: 40px;
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
            gap: 20px;
        }

        .card {
            background: white;
            border-radius: 10px;
            box-shadow: 0 6px 15px rgba(0,0,0,0.1);
            padding: 20px;
            text-align: center;
            transition: transform 0.2s;
        }
        .card:hover {
            transform: scale(1.05);
        }
        .card img {
            max-width: 100%;
            border-radius: 10px;
        }
        .card h3 {
            margin: 15px 0 10px;
        }
        .card button {
            padding: 10px 15px;
            border: none;
            border-radius: 8px;
            background: #ff4b2b;
            color: white;
            cursor: pointer;
            font-weight: bold;
        }
        .card button:hover {
            background: #ff416c;
        }
    </style>
</head>
<body>

    <!-- Navbar -->
    <div class="navbar">
        <h1>🍕 Pizza Store</h1>
        <div>
            <a href="/categories">Categories</a>
            <a href="/items">Items</a>
            <a href="/orders">Orders</a>
            <a href="/delivery">Delivery Status</a>
            <a href="/auth/logout">Logout</a>
        </div>
    </div>

    <!-- Hero Section -->
    <div class="hero">
        <h2>Welcome to Pizza Heaven!</h2>
    </div>

    <!-- Dashboard Content -->
    <div class="container">
        <!-- Category Card -->
        <div class="card">
            <img src="https://images.unsplash.com/photo-1601925029157-13e2c1a4a8eb" alt="Categories">
            <h3>Categories</h3>
            <p>View all pizza, beverages & more</p>
            <button onclick="location.href='/categories'">Explore</button>
        </div>

        <!-- Items Card -->
        <div class="card">
            <img src="https://images.unsplash.com/photo-1600891964599-f61ba0e24092" alt="Items">
            <h3>Menu Items</h3>
            <p>Check our delicious menu</p>
            <button onclick="location.href='/items'">View Menu</button>
        </div>

        <!-- Orders Card -->
        <div class="card">
            <img src="https://images.unsplash.com/photo-1600891964015-9fd7f3c81a30" alt="Orders">
            <h3>Orders</h3>
            <p>Manage customer orders</p>
            <button onclick="location.href='/orders'">Manage Orders</button>
        </div>

        <!-- Delivery Status Card -->
        <div class="card">
            <img src="https://images.unsplash.com/photo-1521017432531-fbd92d768814" alt="Delivery">
            <h3>Delivery Status</h3>
            <p>Track and update delivery</p>
            <button onclick="location.href='/delivery'">Track Now</button>
        </div>
    </div>

</body>
</html>
