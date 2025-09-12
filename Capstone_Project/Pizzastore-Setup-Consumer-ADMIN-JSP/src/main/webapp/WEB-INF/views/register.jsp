<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register - Pizza App</title>
    <style>
        body {
            font-family: 'Poppins', sans-serif;
            background: linear-gradient(135deg, #ff416c, #ff4b2b);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            margin: 0;
        }
        .register-container {
            background: #fff;
            border-radius: 15px;
            box-shadow: 0 10px 25px rgba(0,0,0,0.2);
            padding: 40px;
            width: 400px;
            text-align: center;
        }
        h2 {
            margin-bottom: 20px;
            color: #ff416c;
        }
        input, select {
            width: 100%;
            padding: 12px;
            margin: 8px 0;
            border-radius: 8px;
            border: 1px solid #ccc;
            background: #f9f9f9;
        }
        button {
            width: 100%;
            padding: 12px;
            background: #ff416c;
            border: none;
            border-radius: 8px;
            color: #fff;
            font-weight: bold;
            cursor: pointer;
            margin-top: 10px;
        }
        button:hover {
            background: #ff4b2b;
        }
        a {
            display: block;
            margin-top: 15px;
            color: #555;
            text-decoration: none;
        }
        a:hover { color: #ff416c; }
    </style>
</head>
<body>
    <div class="register-container">
        <h2>Create Account</h2>
        <form action="/auth/register" method="post">
            <input type="text" name="username" placeholder="Username" required />
            <input type="password" name="password" placeholder="Password" required />
            <select name="userRole" required>
                <option value="ADMIN">Admin</option>
                <option value="CUSTOMER">Customer</option>
            </select>
            <button type="submit">Register</button>
        </form>
        <a href="/auth/login">Already have an account? Login</a>
    </div>
</body>
</html>
