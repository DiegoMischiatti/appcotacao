package br.edu.infnet.appcotacao.model.domain;

import java.time.LocalDateTime;

public class Cotacao {
	private String validacao;
	private LocalDateTime data; 
	private boolean web;
	
	public void impressao() {
		System.out.println("#cotacao");
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return validacao + ";" + data + ";" + web;
	}

	public String getValidacao() {
		return validacao;
	}

	public void setValidacao(String validacao) {
		this.validacao = validacao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}
}
