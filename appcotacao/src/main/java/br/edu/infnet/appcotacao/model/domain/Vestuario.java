package br.edu.infnet.appcotacao.model.domain;

public class Vestuario extends Produto {
	public String classe;
	public float tamanho; 
	public boolean infantil;
	
	@Override
	public float CalcularValordecompra() {
		
		float valorTamanho = tamanho * 2; 
		
		float valorInfantil = infantil ? 0 : 30; 
		
		return valor + valorTamanho + valorInfantil;
	}
	
	@Override
	public String toString() {
		return classe + ";" + tamanho + ";" + infantil + ";" + super.toString();
	}

	@Override
	public void impressao() {
		System.out.println("#Vestuario");
		System.out.println(this);
	}	
}

