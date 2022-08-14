package br.edu.infnet.appcotacao.model.domain;

import br.edu.infnet.appcotacao.interfaces.IPrinter;

public class Cliente implements IPrinter{
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

	@Override
	public void impressao() {
		System.out.println("#cliente");
		System.out.println(this);
		
	}	
}

