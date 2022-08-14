package br.edu.infnet.appcotacao.model.domain;


public class Informatica extends Produto {
	
	private String ano;
	private float peso; 
	private boolean wireless;
	
	@Override
	public float CalcularValordecompra() {
		
		float valorWireless = wireless ? 50 : 0;
		
		return getValor() / 2 + valorWireless  ;
	}

	@Override
	public String toString() {
		return ano + ";" + peso + ";" + wireless + ";" + super.toString();
	}

	@Override
	public void impressao() {
		System.out.println("#informatica");
		System.out.println(this);
	}	
	
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
}
