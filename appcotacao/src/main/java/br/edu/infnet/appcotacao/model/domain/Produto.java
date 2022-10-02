package br.edu.infnet.appcotacao.model.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.edu.infnet.appcotacao.interfaces.IPrinter;
import br.edu.infnet.appcotacao.model.domain.exceptions.PesoInformaticaInvalidoException;
import br.edu.infnet.appcotacao.model.domain.exceptions.QuantidadePapelariaInvalidoException;
import br.edu.infnet.appcotacao.model.domain.exceptions.TamanhoVestuarioInvalidoException;

@Entity
@Table(name = "TProduto")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Produto implements IPrinter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String tipo;
	private float valor;
	private int codigo;
	@ManyToMany(mappedBy = "produtos")
	private List<Cotacao> cotacoes;
	@ManyToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public abstract float CalcularValordecompra() throws PesoInformaticaInvalidoException,
			QuantidadePapelariaInvalidoException, TamanhoVestuarioInvalidoException;

	@Override
	public String toString() {
		return tipo + ";" + valor + ";" + codigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		// if (getClass() != obj.getClass())
		// return false;
		Produto other = (Produto) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public List<Cotacao> getCotacoes() {
		return cotacoes;
	}

	public void setCotacoes(List<Cotacao> cotacoes) {
		this.cotacoes = cotacoes;
	}

	
}
