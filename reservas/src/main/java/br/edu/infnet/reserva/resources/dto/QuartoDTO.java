package br.edu.infnet.reserva.resources.dto;

public class QuartoDTO {

	private Long codigo;
	
	private String nome;
	
	private Double preco;

	
	public QuartoDTO() {
		// TODO Auto-generated constructor stub
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
	
	
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "]";
	}

	
}
