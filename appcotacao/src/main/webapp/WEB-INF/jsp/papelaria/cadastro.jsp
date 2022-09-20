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
		<h2>Cadastramento de papelaria</h2>
		<form action="/papelaria/incluir" method="post">

			<c:import url="/WEB-INF/jsp/produto/cadastro.jsp" />
			<div class="mb-3 mt-3">
				<label> quantidade:</label> <input type="text"
					class="form-control" placeholder="quantas unidades vem na embalagem"
					name="ano">
			</div>
			<div class="mb-3 mt-3">
				<label> material:</label> <input type="text"
					class="form-control" placeholder="do que o material é feito"
					name="peso">
			</div>
			<div class="mb-3 mt-3">
				<label for="validade">Email:</label> <label class="radio-inline">
					<input type="radio" name="validade" value="verdade" checked> yes
				</label> <label class="radio-inline"> 
				<input type="radio" name="validade" value="false" checked> no
				</label>
			</div>



			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>

</body>
</html>
