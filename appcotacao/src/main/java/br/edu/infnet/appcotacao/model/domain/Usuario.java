package br.edu.infnet.appcotacao.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.edu.infnet.appcotacao.interfaces.IPrinter;


@Entity
@Table(name = "TUsuario")
public class Usuario implements IPrinter{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email; 
	private String senha;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Cliente> clientes;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Produto> produtos;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Cotacao> cotacoes;
	
	
	@Override
	public String toString() {
		return nome + ";" + email + ";" + senha;
	}

	public List<Cotacao> getCotacoes() {
		return cotacoes;
	}

	public void setCotacoes(List<Cotacao> cotacoes) {
		this.cotacoes = cotacoes;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public void impressao() {
		System.out.println("#usuario");
		System.out.println(this);
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
}

