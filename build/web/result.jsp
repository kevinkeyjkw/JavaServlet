<%-- 
    Document   : result
    Created on : Mar 31, 2014, 10:23:09 PM
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="myBean" class="myPackage.CountBean" />
        <h1>Form successfully submitted! Congratulations!!!</h1>
        <button onclick="location.href='index.jsp'" >Click me to go back to form!</button>
    </body>
</html>
