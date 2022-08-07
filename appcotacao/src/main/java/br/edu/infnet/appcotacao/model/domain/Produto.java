package br.edu.infnet.appcotacao.model.domain;

public class Produto {
	public String tipo;
	public float valor; 
	public int codigo;
	
	@Override
	public String toString() {
		return tipo + ";" + valor + ";" + codigo;
	}	

}
