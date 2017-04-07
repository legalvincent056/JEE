<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" href="css/style.css">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajouter un client</title>
</head>
<body>
	
	<p> Ajouter un client dont le nom sera : </p>
	<p><%= request.getAttribute("lenom") %></p>
	<p><%= request.getAttribute("leprenom") %></p>
	<p><%= request.getAttribute("lesyeux") %></p>
	<p><%= request.getAttribute("lage") %></p>
	
</body>
</html>