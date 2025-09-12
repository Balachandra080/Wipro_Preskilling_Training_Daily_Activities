package com.gl.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

public class FirstServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) {

        PrintWriter pw;
        try 
        {
            pw = response.getWriter();
            pw.write("I am from servlet");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
