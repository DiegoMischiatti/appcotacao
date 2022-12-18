package br.edu.infnet.reserva.resources.dto;

public class HospedeDTO {
	
	
	private Long codigo;
	private String email;
	private String nome;
	private String endereço;
	
	
	public HospedeDTO () {
		
	}

	public HospedeDTO(Long codigo, String email, String nome, String endereço) {
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

	@Override
	public String toString() {
		return "ClienteDTO [codigo=" + codigo + ", email=" + email + ", nome=" + nome + ", endereço=" + endereço + "]";
	}
	
	
	

}
