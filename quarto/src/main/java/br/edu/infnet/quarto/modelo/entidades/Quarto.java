package br.edu.infnet.quarto.modelo.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quarto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long codigo;
	
	private String nome;
	
	private Double preco;
	
	public Quarto() {
		
		
	}

	@Override
	public String toString() {
		return "Quarto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "]";
	}



	public Long getCodigo() {
		return codigo;
	}



	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Double getPreco() {
		return preco;
	}



	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	

}
