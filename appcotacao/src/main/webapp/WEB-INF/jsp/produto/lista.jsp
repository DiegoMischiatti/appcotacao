<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>AppCotacao</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>


	<div class="container mt-3">
		<h2>AppCotacao</h2>
		<p>Projeto Para Cotacao de Fretes</p>


		<h3>cadastramento de Prosutos</h3>
		
		
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Tipo</th>
					<th>Valor</th>
					<th>Codigo</th>
					
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="p" items="${listagem}">
				
					<tr>
						<td>${p.id}</td>
						<td>${p.tipo}</td>
						<td>${p.valor}</td>
						<td>${p.codigo}</td>
						
						<td><a href="/produto/${p.id}/excluir">excluir</a> </td>
					</tr>
					
				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>
