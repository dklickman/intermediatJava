<!DOCTYPE html>
<%@ page import="java.io.*,java.util.*" %>

<html>
    <head>
        <title>Display College Info</title>
        <link rel="stylesheet" href="css/css-1.css">
    </head>
    <body>
        <% 
            // get params from the request object
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String collegeName = request.getParameter("collegeName");
            String phoneNumber = request.getParameter("phoneNumber");
        %>
        <div class="center">
            <h1>Thank you for your input</h1>
                        
            <table class="inline-block">
                <tr><th id="th-id1" colspan="2">College Info Entered</th></tr>
                <tr>
                    <td>First Name:</td>
                    <td><%= firstName %></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><%= lastName %></td>
                </tr>
                <tr>
                    <td>College Name:</td>
                    <td><%= collegeName %></td>
                </tr>
                <tr>
                    <td>Phone Number:</td>
                    <td><%= phoneNumber %></td>
                </tr>
           
            </table>
                
                        
            
            
        </div>
            
    </body>
</html>
