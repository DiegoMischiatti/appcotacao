package br.edu.infnet.appcotacao.model.domain;

import br.edu.infnet.appcotacao.model.domain.exceptions.QuantidadePapelariaInvalidoException;

public class Papelaria extends Produto {
	
	private String material;
	private float quantidade; 
	private boolean validade;
	
	@Override
	public String toString() {
		return material + ";" + quantidade + ";" + validade + ";" + super.toString();
	}

	@Override
	public void impressao() {
		System.out.println("#papelaria");
		System.out.println(this);
	}	
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isValidade() {
		return validade;
	}

	public void setValidade(boolean validade) {
		this.validade = validade;
	}

	@Override
	public float CalcularValordecompra() throws QuantidadePapelariaInvalidoException{
		
		if(quantidade <= 0) {
			throw new QuantidadePapelariaInvalidoException("a quantidade ("+quantidade+") esta invalida, digite uma quantidade maior que zero");
		}
		
		float valorQuantidade = quantidade * 2;
		return getValor() / 2 + valorQuantidade;
	}
}