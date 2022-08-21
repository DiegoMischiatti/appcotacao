package br.edu.infnet.appcotacao.model.domain;

import java.time.LocalDateTime;
import java.util.Set;

import br.edu.infnet.appcotacao.interfaces.IPrinter;

public class Cotacao implements IPrinter {
	
	private Integer id;
	private String validacao;
	private LocalDateTime data; 
	private boolean web;
    private Cliente cliente;
    private Set<Produto> produtos;
    
    public Cotacao(Cliente cliente) {
    	this.data = LocalDateTime.now(); 
    	this.cliente = cliente;
	}
	
	@Override
	public void impressao() {
		System.out.println("#cotacao");
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return validacao + ";" + data + ";" + web + ";" + cliente + ";" + produtos.size();
	}

	public String getValidacao() {
		return validacao;
	}

	public void setValidacao(String validacao) {
		this.validacao = validacao;
	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}

	public Set<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Set<Produto> produtos) {
		this.produtos = produtos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
