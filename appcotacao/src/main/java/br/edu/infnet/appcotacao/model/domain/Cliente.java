package br.edu.infnet.appcotacao.model.domain;

import br.edu.infnet.appcotacao.interfaces.IPrinter;
import br.edu.infnet.appcotacao.model.domain.exceptions.NomeInvalidoException;

public class Cliente implements IPrinter{
	
	private Integer id;
	private String nome;
	private String endereco; 
	private String email;
	
	public Cliente(String nome , String endereco, String email) throws NomeInvalidoException {
		
		if(nome ==null){
			throw new NomeInvalidoException("nome nulo");
		}
		
		if(nome.isEmpty()){
			throw new NomeInvalidoException("nome sem preenchimento");
		}
		
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


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}	
	
	
}

