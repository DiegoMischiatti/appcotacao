package br.edu.infnet.appcotacao.model.domain;

public class Vestuario extends Produto {
	private String classe;
	private float tamanho; 
	private boolean infantil;
	
	@Override
	public float CalcularValordecompra() {
		
		float valorTamanho = tamanho * 2; 
		
		float valorInfantil = infantil ? 0 : 30; 
		
		return getValor() + valorTamanho + valorInfantil;
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
	
	public String getClasse() {
		return classe;
	}

	public void setClasse(String material) {
		this.classe = material;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isInfantil() {
		return infantil;
	}

	public void setInfantil(boolean infantil) {
		this.infantil = infantil;
	}
}

