<!DOCTYPE html>
<%@ page import="college.*,java.io.*,java.util.*" %>

<html>
    <head>
        <title>MI-6 Mission Request</title>
        <link rel="stylesheet" href="css/css-1.css">
    </head>
    <body>
        <% 
            // get params from the request object
            String acMake = request.getParameter("acMake");
            String acModel = request.getParameter("acModel");
            String acColor = request.getParameter("acColor");
            String pilotNeeded = request.getParameter("pilotNeeded");
            // send the info into aircraft to create a new object
            Aircraft aircraft = new Aircraft(acMake, acModel, acColor, pilotNeeded);
            
            // create the second object 
            String abMake = request.getParameter("abMake");
            String abModel = request.getParameter("abModel");
            String abColor = request.getParameter("abColor");
            String bondGirlNeeded = request.getParameter("bondGirlNeeded");
            // send the info into aircraft to create a new object
            Automobile automobile = new Automobile(abMake, abModel, abColor, bondGirlNeeded);
            
        %>
        <div class="center">
            <h1>Thank you, James</h1>
                        
            <table class="inline-block">
                <tr><th id="th-id2" colspan="2">Mission Request Information:</th></tr>
                <tr>
                    <td>Aircraft Make:</td>
                    <td><%= aircraft.getAcMake() %></td>
                </tr>
                <tr>
                    <td>Aircraft Model:</td>
                    <td><%= aircraft.getAcModel() %></td>
                </tr>
                <tr>
                    <td>Aircraft Color:</td>
                    <td><%= aircraft.getAcColor() %></td>
                </tr>
                <tr>
                    <td>Pilot Needed:</td>
                    <td><%= aircraft.getPilotNeeded() %></td>
                </tr>
                
                <tr>
                    <td>Automobile Make:</td>
                    <td><%= automobile.getAbMake() %></td>
                </tr>
                <tr>
                    <td>Automobile Model:</td>
                    <td><%= automobile.getAbModel() %></td>
                </tr>
                <tr>
                    <td>Automobile Color:</td>
                    <td><%= automobile.getAbColor() %></td>
                </tr>
                <tr>
                    <td>Bond Girl Needed:</td>
                    <td><%= automobile.getBondGirlNeeded() %></td>
                </tr>
           
            </table>
                
                <img src="css/007.png" style="width:75px;height:56px;">
                <p>Happy Hunting...</p>
                
                        
            
            
        </div>
            
    </body>
</html>
