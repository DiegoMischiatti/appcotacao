package br.edu.infnet.appcotacao.model.domain;

import br.edu.infnet.appcotacao.interfaces.IPrinter;

public class Usuario implements IPrinter{
	
	private String nome;
	private String email; 
	private String senha;
	
	
	@Override
	public String toString() {
		return nome + ";" + email + ";" + senha;
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
	
	
}

