package br.edu.infnet.appcotacao.model.domain;

import java.time.LocalDateTime;

public class Cotacao {
	public String validacao;
	public LocalDateTime data; 
	public boolean web;
	
	@Override
	public String toString() {
		return validacao + ";" + data + ";" + web;
	}
}
