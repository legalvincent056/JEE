<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" href="css/style.css">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ma première JSP</title>
</head>
<body>
	<p>Bonjour, nous sommes le <span><%= new java.util.Date() %></span> 
	<p>Bonjour <%= request.getAttribute("leprenom") %> <%= request.getAttribute("lenom") %></p>
	
	<p>Le mot de passe saisi est : <%= request.getAttribute("lemdp") %></p>
	
	
	<%
	String[] loisirs = ((String[]) request.getAttribute("lesLoisirs"));
	
	if(loisirs != null){
		
		for(int i=0; i < loisirs.length ;i++){
			%><p>
			 <%=loisirs[i]%> </p>
		<%	
		}
	}
	
	%>

</body>
</html>