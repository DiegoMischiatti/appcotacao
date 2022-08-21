package br.edu.infnet.appcotacao.model.domain;

import br.edu.infnet.appcotacao.interfaces.IPrinter;

public abstract class Produto implements IPrinter{
	
	private Integer id;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
	//	if (getClass() != obj.getClass())
	//		return false;
		Produto other = (Produto) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
