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
		<h2>Cadastramento de vestuario</h2>
		<form action="/vestuario/incluir" method="post">


			<c:import url="/WEB-INF/jsp/produto/cadastro.jsp" />

			<div class="mb-3 mt-3">
				<label>classe:</label> <input type="text" class="form-control"
					placeholder="Entre com o classe de ocasiao do produto" name="ano">
			</div>
			<div class="mb-3 mt-3">
				<label> tamanho:</label> <input type="text" class="form-control"
					placeholder="Entre com o tamanho do produto" name="peso">
			</div>
			<div class="mb-3 mt-3">
				<label> infantil:</label> <label class="radio-inline"> <input
					type="radio" name="infantil" value="verdade" checked> yes
				</label> <label class="radio-inline"> <input type="radio"
					name="infantil" value="false" checked> no
				</label>
			</div>



			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>

</body>
</html>
