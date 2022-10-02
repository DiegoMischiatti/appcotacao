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
	<c:import url="/WEB-INF/jsp/menu.jsp" />


	<div class="container mt-3">
	
	<c:if test="${not empty mensagem}">
		<div class="alert alert-info">
			<strong>Info!</strong> ${mensagem}
		</div>
		</c:if>


		<h3>Cadastramento de cliente</h3>

		<h4>
			<a href="/cliente">novo cliente</a>
		</h4>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Email</th>
					<th>endereco</th>
					<th>usuario</th>
					<th></th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="cl" items="${listagem}">

					<tr>
						<td>${cl.id}</td>
						<td>${cl.nome}</td>
						<td>${cl.email}</td>
						<td>${cl.endereco}</td>
						<td>${cl.usuario.email}</td>
						<td><a href="/cliente/${cl.id}/excluir">excluir</a></td>

					</tr>

				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>