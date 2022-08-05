package br.edu.infnet.appcotacao.model.domain;

public class Papelaria {
	public String material;
	public float quantidade; 
	public boolean validade;
	
	@Override
	public String toString() {
		return material + ";" + quantidade + ";" + validade;
	}	
}