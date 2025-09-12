package com.gl.session;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecureServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response)
    {
    	try {
            // Get current session
            HttpSession session = req.getSession(); // false → don’t create new session
            String loginUser = (String) session.getAttribute("loginuser");

            if (loginUser == null) {
                // No user → redirect back to login
                res.sendRedirect("login.jsp");
            }
            
            PrintWriter pw = res.getWriter();
            pw.write("Iam Secure); "
            pw.close();
            
        } catch (Exception e) {
            System.out.println("Error :" + ex.getMessage());
        }
    }
}