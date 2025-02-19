package com.s_demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/empinfo")
public class Employee extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fname = req.getParameter("fname");
		String lname =req.getParameter("lname");
		String gender = req.getParameter("gender");
		String dob = req.getParameter("dob");
		String connum = req.getParameter("cnumber");
		String email = req.getParameter("email");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String sal = req.getParameter("sal");
		String joindate = req.getParameter("jdate");
		String role = req.getParameter("role");
		String typeofwork = req.getParameter("wtype");
		String pass = req.getParameter("password");
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(gender);
		System.out.println(dob);
		System.out.println(connum);
		System.out.println(email);
		System.out.println(city);
		System.out.println(state);
		System.out.println(sal);
		System.out.println(joindate);
		System.out.println(role);
		System.out.println(typeofwork);
		System.out.println(pass);
		
		PrintWriter out = resp.getWriter();
		out.println(fname);
		out.println(lname);
		out.println(gender);
		out.println(dob);
		out.println(connum);
		out.println(email);
		out.println(city);
		out.println(state);
		out.println(sal);
		out.println(joindate);
		out.println(role);
		out.println(typeofwork);
		out.println(pass);
	}
	

}
