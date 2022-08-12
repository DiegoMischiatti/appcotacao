package br.edu.infnet.appcotacao.model.domain;

public class Papelaria extends Produto {
	public String material;
	public float quantidade; 
	public boolean validade;
	
	@Override
	public String toString() {
		return material + ";" + quantidade + ";" + validade + ";" + super.toString();
	}

	@Override
	public void impressao() {
		System.out.println("#papelaria");
		System.out.println(this);
	}	
}