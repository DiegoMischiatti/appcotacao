package br.edu.infnet.appcotacao.model.domain;

public class Cliente {
	public String nome;
	public String endereco; 
	public String email;
	
	public Cliente(String nome , String endereco, String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	
	}
	
	@Override
	public String toString() {
		return nome + ";" + endereco + ";" + email;
	}	
}
