package com.company;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/employees")
public class EmployeeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        resp.getWriter().println("<h2>Employee List</h2>");
        resp.getWriter().println("<ul>");
        resp.getWriter().println("<li>Amit - Dev</li>");
        resp.getWriter().println("<li>Neha - QA</li>");
        resp.getWriter().println("<li>Rahul - DevOps</li>");
        resp.getWriter().println("</ul>");
    }
}
