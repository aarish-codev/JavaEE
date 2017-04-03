package com.aarish.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostParamterDemo
 */
public class PostParamterDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String uname = request.getParameter("userName");
		pw.println("Hello from Post method: "+uname);
//		URL-->http://localhost:8085/DemoServlet/GetParameterDemo?userName=Rishi
//		HTML File--> PostParameterDemo
	}

}
