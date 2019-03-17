<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WYNIK PRZELICZENIA</title>
</head>
<body>


<p style text align="center"> PRZELICZENIE: 

<%= ((String)request.getAttribute("wybor")) %>
<%= ((Double)request.getAttribute("result")) %></p>



</body>
</html>