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
	  
	  <h3>Classe Cotacao</h3>        
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
	        <td>validacao</td>
	        <td>String</td>
	        <td>informa que a cotacao foi iniciada </td>
	      </tr>
	      <tr>
	        <td>data</td>
	        <td>LocalDataTime</td>
	        <td>Data da cotacao</td>
	      </tr>
	      <tr>
	        <td>web</td>
	        <td>boolean</td>
	        <td>Indicativo para uma cotacao online ou presencial</td>
	      </tr>
	    </tbody>
	  </table>
	  
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
	  
	  <h3>Classe Informatica</h3>        
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
	        <td>peso</td>
	        <td>float</td>
	        <td>peso da mercadoria analisada</td>
	      </tr>
	      <tr>
	        <td>wireless</td>
	        <td>boolean</td>
	        <td>se o material eh ou nao wireless</td>
	      </tr>
	      <tr>
	        <td>ano</td>
	        <td>string</td>
	        <td>so ano de fabricação do material analisado</td>
	      </tr>
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
	      <tr>
	        
	    </tbody>
	  </table>
	  
	  <h3>Classe Papelaria</h3>        
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
	        <td>Quantidade</td>
	        <td>float</td>
	        <td>quantidade de itens no pacote</td>
	      </tr>
	      <tr>
	        <td>validade</td>
	        <td>boolean</td>
	        <td>se o material eh um item que possui vencimento</td>
	      </tr>
	      <tr>
	        <td>Material</td>
	        <td>String</td>
	        <td>qual o tipo da composicao do material</td>
	        </tr>
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
	        
	  <h3>Classe Vestuario</h3>        
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
	        <td>Classe</td>
	        <td>String</td>
	        <td>qual a classe do material</td>
	      </tr>
	      
	      <tr>
	        <td>Infantil</td>
	        <td>boolean</td>
	        <td>se peca eh infantil ou adulto</td>
	      </tr>
	      <tr>
	        <td>tamanho</td>
	        <td>float</td>
	        <td>tamanho da peca</td>
	      </tr>
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
