package br.edu.infnet.appcotacao.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.appcotacao.model.domain.exceptions.PesoInformaticaInvalidoException;

@Entity
@Table(name = "TInformatica")

public class Informatica extends Produto {
	
	private String ano;
	private float peso; 
	private boolean wireless;
	
	@Override
	public float CalcularValordecompra() throws PesoInformaticaInvalidoException {
		
		
		if(peso < 2) {
			throw new PesoInformaticaInvalidoException("o peso ("+peso+")esta invalido, digite um peso maior que 2 kg");
		}
		
		
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
