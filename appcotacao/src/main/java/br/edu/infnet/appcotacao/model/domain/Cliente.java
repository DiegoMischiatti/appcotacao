package br.edu.infnet.appcotacao.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import br.edu.infnet.appcotacao.interfaces.IPrinter;
import br.edu.infnet.appcotacao.model.domain.exceptions.NomeInvalidoException;



@Entity
@Table(name = "TCliente")
public class Cliente implements IPrinter{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String endereco; 
	private String email;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	public Cliente() {
		
		
	}
	
	public Cliente(String nome , String endereco, String email) throws NomeInvalidoException {
		
		if(nome ==null){
			throw new NomeInvalidoException("nome nulo");
		}
		
		if(nome.isEmpty()){
			throw new NomeInvalidoException("nome sem preenchimento");
		}
		
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	
	}
	
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return nome + ";" + endereco + ";" + email;
	}

	@Override
	public void impressao() {
		System.out.println("#cliente");
		System.out.println(this);
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}	
	
	
}

