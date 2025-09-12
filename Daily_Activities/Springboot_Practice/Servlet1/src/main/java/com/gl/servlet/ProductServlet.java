package com.gl.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res ) {
		String name = req.getParameter("name");
		double price = Double.parseDouble(req.getParameter("price"));
		double discount = Double.parseDouble(req.getParameter("discount"));
		double unit = Double.parseDouble(req.getParameter("unit"));

		double productPrice = price - discount;
		double productTotal = productPrice * unit;

		String url = "jdbc:mysql://localhost:3306/wipro_2025_java_web";
		String username = "root";
		String password = "Balachandra@123";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);

			String insertSql = "insert into product (name, price, discount, unit) values (?, ?, ?, ?)";
			PreparedStatement ps =  con.prepareStatement (insertSql);

			ps.setString(1, name);

			ps.setDouble(2, price);

			ps.setDouble(3, discount);

			ps.setDouble(4, unit);

			ps.execute();

			ps.close();

			con.close();

		} catch(Exception ex) {
			System.out.println("Error in db action : " + ex.getMessage());
		}


		req.setAttribute("name", name);
		req.setAttribute("price", price);
		req.setAttribute("discount", discount);
		req.setAttribute("unit", unit);
		req.setAttribute("productPrice", productPrice);
		req.setAttribute("productTotal", productTotal);

		RequestDispatcher rd = req.getRequestDispatcher("product-info.jsp");
		try {
			rd.forward(req, res);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}