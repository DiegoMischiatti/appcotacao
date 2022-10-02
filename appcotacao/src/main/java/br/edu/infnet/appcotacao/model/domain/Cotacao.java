package br.edu.infnet.appcotacao.model.domain;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.edu.infnet.appcotacao.interfaces.IPrinter;
import br.edu.infnet.appcotacao.model.domain.exceptions.ClienteNuloException;
import br.edu.infnet.appcotacao.model.domain.exceptions.CotacaoSemProdutoException;

@Entity
@Table(name = "TCotacao")


public class Cotacao implements IPrinter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String validacao;
	private LocalDateTime data; 
	private boolean web;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idCliente")
    private Cliente cliente;
    @ManyToMany(cascade = CascadeType.DETACH)
	private Set<Produto> produtos;
    @ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
    
    public Cotacao() {
    	this.data = LocalDateTime.now(); 
    	this.web = true;
	}
    
    public Cotacao(Cliente cliente, Set<Produto> produtos) throws ClienteNuloException, CotacaoSemProdutoException {
    	this();
    	
    	if(cliente == null) {
    		throw new ClienteNuloException(" impossivel seguir sem um cliente");
    	}
    	
    	
    	//if(produtos == null ){
    	//    throw new CotacaoSemProdutoException ("impossivel criar uma cotacao sem uma listagem");
    	//}
    	
    	//if(produtos.size() <1 ){
    	//    throw new CotacaoSemProdutoException ("impossivel criar uma cotacao sem produto");
    	//}
    	
    	
    	this.cliente = cliente;
    	this.produtos = produtos;
	
    	
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Set<Produto> produtos) {
		this.produtos = produtos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	


}
