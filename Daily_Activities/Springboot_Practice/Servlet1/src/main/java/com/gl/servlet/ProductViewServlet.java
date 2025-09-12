package com.gl.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductViewServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        try {
            // Database connection details
            String url = "jdbc:mysql://localhost:3306/wipro_2025_java_web";
            String username = "root";
            String password = "Balachandra@123";

            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, username, password);

            // SQL query
            String selectSql = "SELECT * FROM product";

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(selectSql);

            // Pass resultset to JSP
            req.setAttribute("resultset", rs);
            RequestDispatcher rd = req.getRequestDispatcher("product-list.jsp");
            rd.forward(req, res);

            // Do not close ResultSet/Connection before forwarding,
            // else JSP cannot read it properly

        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException("Database error: " + e.getMessage());
        }
    }
}
