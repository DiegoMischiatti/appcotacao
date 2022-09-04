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
	<c:import url="/WEB-INF/jsp/menu.jsp"/>


	<div class="container mt-3">
	  <h2>AppCotacao</h2>
	  <p>Projeto Para Cotacao de Fretes</p>   
	  
	  
	  <h3>Classe Cliente</h3>        
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descricao</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>nome</td>
	        <td>String</td>
	        <td>nome da empresa</td>
	      </tr>
	      <tr>
	        <td>Endereco</td>
	        <td>String</td>
	        <td>Endereco da empresa</td>
	      </tr>
	      <tr>
	        <td>email</td>
	        <td>String</td>
	        <td>email da empresa</td>
	      </tr>
	    </tbody>
	  </table>
	  
	  
	</div>
</body>
</html>
