<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

	<nav class="navbar navbar-expand-sm bg-light navbar-light">
		<div class="container-fluid">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link active" href="/">Home</a></li>


				<c:if test="${not empty user}">
				    <li class="nav-item"><a class="nav-link" href="/usuario/lista">Usuario</a></li>
					<li class="nav-item"><a class="nav-link" href="/informatica/lista">Informatica</a></li>
					<li class="nav-item"><a class="nav-link" href="/papelaria/lista">Papelaria</a></li>
					<li class="nav-item"><a class="nav-link" href="/vestuario/lista">Vestuario</a></li>
					<li class="nav-item"><a class="nav-link" href="/produto/lista">Produto</a></li>
					<li class="nav-item"><a class="nav-link" href="/cotacao/lista">Cotacao</a></li>
					<li class="nav-item"><a class="nav-link" href="/cliente/lista">Cliente</a></li>
				</c:if>
			</ul>

			<ul class="navbar-nav">
				<c:if test="${empty user}">
					<li class="nav-item"><a class="nav-link" href="/usuario">Singup</a></li>
					<li class="nav-item"><a class="nav-link" href="/login">Login</a></li>
				</c:if>

				<c:if test="${not empty user}">
					<li class="nav-item"><a class="nav-link" href="/logout">Logout ${user}</a></li>
				</c:if>
			</ul>
		</div>
	</nav>


	