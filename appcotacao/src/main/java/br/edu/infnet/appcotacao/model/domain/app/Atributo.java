package br.edu.infnet.appcotacao.model.domain.app;

import br.edu.infnet.appcotacao.interfaces.IPrinter;

public class Atributo implements IPrinter{
	
	
	private String nome;
	private String descricao;
	private String tipo;
	
	
	
	
	public Atributo(String nome, String descricao, String tipo) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s:%s", tipo, nome, descricao);
	}
	
	
	
	@Override
	public void impressao() {
		System.out.println("---" + this);
		
	}
	
	

}
