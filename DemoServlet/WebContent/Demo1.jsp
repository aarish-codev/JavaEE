<%@page import="java.util.Date"%>
<%@page import="org.aarish.march.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demo1</title>
</head>
<body>

<h2>Hello from JSP</h2>
This is Aarish Saxena
<h1><center>Java Code</center></h1>
<%= new Date() %>

<%
		Demo2 obj = new Demo2();
		out.println("\n");
		out.println(obj.getInfo());
%>
</body> 
</html>