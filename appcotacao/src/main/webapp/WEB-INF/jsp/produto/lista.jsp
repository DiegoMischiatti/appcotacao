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
	  
	  <h3>Classe Produto</h3>        
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
	        <td>tipo</td>
	        <td>string</td>
	        <td>nome do produto</td>
	      </tr>
	      <tr>
	        <td>valor</td>
	        <td>float</td>
	        <td>qual o valor do Produto</td>
	      </tr>
	      <tr>
	        <td>codigo</td>
	        <td>int</td>
	        <td>codigo de produto</td>
	        </tr>
	    </tbody>
	  </table>
	</div>
</body>
</html>
