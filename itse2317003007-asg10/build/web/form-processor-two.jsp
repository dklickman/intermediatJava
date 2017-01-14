<!DOCTYPE html>
<%@ page import="java.io.*,java.util.*" %>

<html>
    <head>
        <title>Display Favorite College Teams</title>
        <link rel="stylesheet" href="css/css-1.css">
    </head>
    <body>
        <% 
            // get params from the request object
            String favoriteSport = request.getParameter("favoriteSport");
            String favoriteTeam = request.getParameter("favoriteTeam");
            String favoritePlayer = request.getParameter("favoritePlayer");
            String reasonFavorite = request.getParameter("reasonFavorite");
        %>
        <div class="center">
            <h1>Thank you for your input</h1>
                        
            <table class="inline-block">
                <tr><th id="th-id2" colspan="2">Team Information Entered</th></tr>
                <tr>
                    <td>Favorite Sport:</td>
                    <td><%= favoriteSport %></td>
                </tr>
                <tr>
                    <td>Favorite Team:</td>
                    <td><%= favoriteTeam %></td>
                </tr>
                <tr>
                    <td>Favorite Player:</td>
                    <td><%= favoritePlayer %></td>
                </tr>
                <tr>
                    <td>Reasons:</td>
                    <td><%= reasonFavorite %></td>
                </tr>
           
            </table>
                
                        
            
            
        </div>
            
    </body>
</html>
