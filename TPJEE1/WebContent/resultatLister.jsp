<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List,metier.Client"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des clients</title>
</head>
<body>

	<p>La liste des clients sur la base de données:</p>

	<%
		List<Client> clients = ((List<Client>) request.getAttribute("lesClients"));
	%>

	<div id="content">
		<div class="block">
			<h2>Lister les clients</h2>

			<table>
				<tr>
					<th>ID</th>
					<th>Nom</th>
					<th>Prenom</th>
					<th>Couleur des yeux</th>
					<th>Age</th>
				</tr>
				<%
					for (Client c : clients) {
				%>
				<tr>
					<td><%=c.getId()%></td>
					<td><%=c.getNom()%> </td>
					<td><%=c.getPrenom()%></td>
					<td><%=c.getYeux()%></td>
					<td><%=c.getAge()%></td>

				</tr>
				<%
					}
				%>




			</table>


		</div>



	</div>
</body>
</html>