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

	<c:set var="ativaBotao" value="" />

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h2>Cadastramento de cotacao</h2>
		<form action="/cotacao/incluir" method="post">




			<div class="mb-3 mt-3">
				<label>Validacao:</label> <input type="text" class="form-control"
					placeholder="Entre com a validacao da cotacao" value="cotacao 1"
					name="validacao">
			</div>

			<div class="mb-3 mt-3">
				<c:if test="${not empty clientes}">
					<label>Cliente:</label>
					<select name="cliente" class="form-control" id="sel1">
						<c:forEach var="cl" items="${clientes}">
							<option value="${cl.id}">${cl.nome}</option>
						</c:forEach>
					</select>
				</c:if>
				<c:if test="${empty clientes}">
					<label>Não temos clientes cadastrados</label>
					<c:set var="ativaBotao" value="disabled" />
					
				</c:if>
			</div>

			<div class="mb-3 mt-3">
			<c:if test="${not empty produtos}">
				<label>Produtos:</label>
				<c:forEach var="pr" items="${produtos}">
					<div class="checkbox">
						<label><input type="checkbox" name="produtos"
							value="${pr.id}">${pr.tipo}</label>
					</div>
				</c:forEach>
				</c:if>
				<c:if test="${empty produtos}">
				<label>Não temos produtos cadastrados:</label>
				<c:set var="ativaBotao" value="disabled" />
				
				</c:if>
			</div>





			<button  ${ativaBotao} type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>

</body>
</html>
