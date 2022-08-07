package br.edu.infnet.appcotacao.model.domain;


public class Informatica extends Produto {
	
	public String ano;
	public float peso; 
	public boolean wireless;
	
	@Override
	public String toString() {
		return ano + ";" + peso + ";" + wireless + ";" + super.toString();
	}	
}
