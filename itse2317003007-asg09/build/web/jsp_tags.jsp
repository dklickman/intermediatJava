<!DOCTYPE html>
<!-- jsp_tags.jsp -->
<%@ include file="sample_included_file.jsp" %>
<%@ page import="java.util.*" %>

<html>
<head>
	<title>JSP Tags</title>
</head>
<body>
	<h1>JSP Tags</h1>
	<h2>Hello! The time is now <%= new Date() %></h2>
	<!--HTML comment - complied and executed but not displayed --> 
	<!-- <h2>Hello! The time is now <%= new Date() %></h2> -->
	<%-- JSP comment - not compiled, or returned to the browswer. --%>
	<%-- <h2>Hello! The time is now <%= new Date() %></h2> --%>
	<table border="1">
	<%
	// This is a comment
	/*
	This is a comment
	*/
	int localVar = 0;
	int n = 3;
	for ( int i = 0; i < n; i++) {
	%>
	<tr>
	<td>Number & localVar</td>
	<td><%= i+1 %></td>
	<td><%= localVar++ %></td>
	</tr>
	<% 
	}
	localVar = 99;
	%>
	</table>
	<% int globalCount = 0; %>
	<p>This is globalCount:<%= globalCount %></p>
	<p>This is localVar:<%= localVar %></p>
	<% ++globalCount; %>
</body>
</html>