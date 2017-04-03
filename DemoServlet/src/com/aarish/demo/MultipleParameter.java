package com.aarish.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MultipleParameter
 */
public class MultipleParameter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	    	System.out.println("Inside Get Method");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Mapped to MultipleParameters.html
	    	response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String prof=request.getParameter("prof");
		String[] loc = request.getParameterValues("location");
		System.out.println("Inside Post Method");
		
		pw.println("First Name: "+fname);
		pw.println("<br>");
		pw.println("Last Name: "+lname);
		pw.println("<br>");
		pw.println("Profession: "+prof);
		pw.println("<br>");
		pw.println("Locations are: ");
		pw.println("<br>");
		
		for(String s1:loc)
		{
		    pw.println(s1);
		    pw.println("<br>");
		}
		
	}

}
