<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login - Pizza App</title>
    <style>
        body {
            font-family: 'Poppins', sans-serif;
            background: linear-gradient(135deg, #ff4b2b, #ff416c);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            margin: 0;
        }
        .login-container {
            background: #fff;
            border-radius: 15px;
            box-shadow: 0 10px 25px rgba(0,0,0,0.2);
            padding: 40px;
            width: 350px;
            text-align: center;
        }
        h2 {
            margin-bottom: 20px;
            color: #ff416c;
        }
        input {
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
    <div class="login-container">
        <h2>Login</h2>
        <form action="/auth/login" method="post">
            <input type="text" name="username" placeholder="Username" required />
            <input type="password" name="password" placeholder="Password" required />
            <button type="submit">Login</button>
        </form>
        <a href="/auth/register">Don't have an account? Register</a>
    </div>
</body>
</html>
