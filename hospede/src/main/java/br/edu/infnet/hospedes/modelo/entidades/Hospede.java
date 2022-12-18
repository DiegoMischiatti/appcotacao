package br.edu.infnet.hospedes.modelo.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hospede {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long codigo;
	private String email;
	private String nome;
	private String endereço;
	
	
	public Hospede () {
		
	}

	public Hospede(Long codigo, String email, String nome, String endereço) {
		super();
		this.codigo = codigo;
		this.email = email;
		this.nome = nome;
		this.endereço = endereço;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	

}
