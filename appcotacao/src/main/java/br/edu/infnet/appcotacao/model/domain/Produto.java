package br.edu.infnet.appcotacao.model.domain;

import br.edu.infnet.appcotacao.interfaces.IPrinter;

public abstract class Produto implements IPrinter{
	
	private String tipo;
	private float valor; 
	private int codigo;
	
	
	public abstract float CalcularValordecompra();
	
	//public float CalcularValordecompra(){
		
	//	return valor / 2 ; 
    //}
	
	
	@Override
	public String toString() {
		return tipo + ";" + valor + ";" + codigo + ";" + CalcularValordecompra();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	

}
