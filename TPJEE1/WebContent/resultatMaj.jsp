<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<link rel="stylesheet" href="css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Modifier un client</title>
</head>
<body>
	
	<p> Le client modifié sera : </p>
	<p><%= request.getAttribute("lid") %></p>
	<p><%= request.getAttribute("lenom") %></p>
	<p><%= request.getAttribute("leprenom") %></p>
	<p><%= request.getAttribute("lesyeux") %></p>
	<p><%= request.getAttribute("lage") %></p>
	
</body>
</html>