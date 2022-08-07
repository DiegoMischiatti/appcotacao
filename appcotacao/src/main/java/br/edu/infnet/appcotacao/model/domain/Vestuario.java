package br.edu.infnet.appcotacao.model.domain;

public class Vestuario extends Produto {
	public String classe;
	public float tamanho; 
	public boolean infantil;
	
	@Override
	public String toString() {
		return classe + ";" + tamanho + ";" + infantil + ";" + super.toString();
	}	
}

