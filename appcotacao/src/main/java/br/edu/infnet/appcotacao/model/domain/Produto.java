package br.edu.infnet.appcotacao.model.domain;

public abstract class Produto {
	public String tipo;
	public float valor; 
	public int codigo;
	
	
	public abstract void impressao();
	
	
	public float CalcularValordecompra(){
		
		return valor / 2 ; 
    }
	
	
	@Override
	public String toString() {
		return tipo + ";" + valor + ";" + codigo + ";" + CalcularValordecompra();
	}	

}
