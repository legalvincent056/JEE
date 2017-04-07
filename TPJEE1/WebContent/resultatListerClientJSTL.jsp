<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des clients</title>
</head>
<body>

	<p>La liste des clients sur la base de données:</p>



	<div id="content">
		<div class="block">
			<h2>Lister les clients avec le format JSTL</h2>
		<c:if test="${!empty lesClients}"> <!-- Affiche la liste des clients si elle n'est pas vide -->
			<table>
					<tr>
						<th>ID</th>
						<th>Nom</th>
						<th>Prenom</th>
						<th>Yeux</th>
						<th>Age</th>
					</tr>
				<c:forEach var="c" items="${lesClients}">
					<tr>
						<td><c:out value="${c.id}"></c:out></td>
						<td><c:out value="${c.nom}"></c:out></td>
						<td><c:out value="${c.prenom}"></c:out></td>
						<td><c:out value="${c.yeux}"></c:out></td>
						<td><c:out value="${c.age}"></c:out></td>
					</tr>
				</c:forEach>
							
			</table>

		</c:if>
		</div>

	</div>
</body>
</html>