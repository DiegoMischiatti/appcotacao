<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>AppCotacao</title>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-light navbar-light">
		<div class="container-fluid">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link active" href="/">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/informatica/lista">Informatica</a></li>
				<li class="nav-item"><a class="nav-link" href="/papelaria/lista">Papelaria</a></li>
				<li class="nav-item"><a class="nav-link" href="/vestuario/lista">Vestuario</a></li>
				<li class="nav-item"><a class="nav-link" href="/produto/lista">Produto</a></li>
				<li class="nav-item"><a class="nav-link" href="/cotacao/lista">Cotacao</a></li>
				<li class="nav-item"><a class="nav-link" href="/cliente/lista">Cliente</a></li>
				</li>
			</ul>
		</div>
	</nav>


	<div class="container mt-3">
	  <h2>AppCotacao</h2>
	  <p>Projeto Para Cotacao de Fretes</p>   
	  
	  <h3>Classe Vestuario</h3>
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Tipo</th>
	        <th>Valor</th>
	        <th>Codigo</th>
	        <th>Classe</th>
	        <th>Tamanho</th>
	        <th>infantil</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
				<c:forEach var="v" items="${listagem}">
				
					<tr>
						<td>${v.id}</td>
						<td>${v.tipo}</td>
						<td>${v.valor}</td>
						<td>${v.codigo}</td>
						<td>${v.classe}</td>
						<td>${v.tamanho}</td>
						<td>${v.infantil}</td>
						<td><a href="/vestuario/${v.id}/excluir">excluir</a> </td>
					</tr>
					
				</c:forEach>
			</tbody>
	  </table>
	  
	</div>
</body>
</html>
	          
	  