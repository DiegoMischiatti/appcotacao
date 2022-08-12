package br.edu.infnet.appcotacao.model.domain;


public class Informatica extends Produto {
	
	public String ano;
	public float peso; 
	public boolean wireless;
	
	@Override
	public float CalcularValordecompra() {
		
		float valorWireless = wireless ? 50 : 0;
		
		return super.CalcularValordecompra() + valorWireless  ;
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
}
