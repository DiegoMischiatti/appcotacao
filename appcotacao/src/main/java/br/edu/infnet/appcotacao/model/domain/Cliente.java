package br.edu.infnet.appcotacao.model.domain;

public class Cliente {
	public String nome;
	public String endereco; 
	public String email;
	
	@Override
	public String toString() {
		return nome + ";" + endereco + ";" + email;
	}	
}

