package com.demo.servlet;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/insertEmployee")
public class InsertEmployee extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int empId = Integer.parseInt(request.getParameter("empId"));
        String empName = request.getParameter("empName");
        double empSal = Double.parseDouble(request.getParameter("empSal"));
        String empDept = request.getParameter("empDept");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db", "root", "root");
            PreparedStatement ps = con.prepareStatement("INSERT INTO employee (empId, empName, empSal, empDept) VALUES (?, ?, ?, ?)");

            ps.setInt(1, empId);
            ps.setString(2, empName);
            ps.setDouble(3, empSal);
            ps.setString(4, empDept);

            int rows = ps.executeUpdate();

            if (rows > 0) 
            {
                request.setAttribute("message", "Employee inserted successfully!");
            } 
            else 
            {
                request.setAttribute("message", "Insertion failed!");
            }

            con.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            request.setAttribute("message", "Error: " + e.getMessage());
        }

        RequestDispatcher rd = request.getRequestDispatcher("output.jsp");
        rd.forward(request, response);
    }
}
