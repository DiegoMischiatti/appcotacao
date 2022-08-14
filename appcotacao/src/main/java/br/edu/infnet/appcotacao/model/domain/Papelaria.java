package br.edu.infnet.appcotacao.model.domain;


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
	public float CalcularValordecompra() {
		
		return getValor() / 2;
	}
}