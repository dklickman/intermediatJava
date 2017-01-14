<!DOCTYPE html> 
<head><title>sample_included_file.jsp</title></head>
<%-- sample_included_file.jsp --%>
<%@ page import="java.util.*" %>
<hr>
<h2>Hello from included file: sample_included_file.jsp</h2>
<%
	System.out.println("Printed from Java..");
	Date date = new Date();
%>

<h2>Hello! Time from an included file: <%= date %></h2>
<hr> 