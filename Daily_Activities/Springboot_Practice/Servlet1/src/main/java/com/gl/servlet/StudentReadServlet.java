package com.gl.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class StudentReadServlet extends HttpServlet 
{

    //service , doGet, doPost
    public void doPost(HttpServletRequest req, HttpServletResponse res) 
    {
        
        // Get parameters from request
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String mobile = req.getParameter("mobile");
        String email = req.getParameter("email");

        // Print on console (for server logs)
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("mobile : " + mobile);
        System.out.println("email : " + email);
        
        /*

        try
        {
            // Send response to browser
            PrintWriter pw = res.getWriter();
            pw.write("<html> <head> <title> Reply from servlet </title> </head> <body>");
            pw.write("name : " + name);
            pw.write("age : " + age);
            pw.write("mobile : " + mobile);
            pw.write("email : " + email);
            pw.write("</body> </html>");
            pw.close();
        } 
        catch (Exception ex) 
        {
            System.err.println("Error : " + ex.getMessage());
        }
        
        */
        
        // Sending / transfer data from servlet to JSP
        req.setAttribute("name", name);
        req.setAttribute("age", age);
        req.setAttribute("mobile", mobile);
        req.setAttribute("email", email);

        // forward with try–catch
        RequestDispatcher rd = req.getRequestDispatcher("printstudent.jsp");
        try 
        {
            rd.forward(req, res);
        } 
        catch (javax.servlet.ServletException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
