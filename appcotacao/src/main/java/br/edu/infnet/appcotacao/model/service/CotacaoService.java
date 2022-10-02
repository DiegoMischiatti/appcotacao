package br.edu.infnet.appcotacao.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcotacao.model.domain.Cotacao;
import br.edu.infnet.appcotacao.model.domain.Usuario;
import br.edu.infnet.appcotacao.model.repository.CotacaoRepository;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Service

public class CotacaoService {

	@Autowired
	private CotacaoRepository cotacaoRepository;

	public void incluir(Cotacao cotacao) {
		cotacaoRepository.save(cotacao);

		AppImpressao.relatorio("inf cotacao " + cotacao.getValidacao() + "incluido", cotacao);

	}

	public Collection<Cotacao> obterLista() {

		return (Collection<Cotacao>) cotacaoRepository.findAll();

	}

	public Collection<Cotacao> obterLista(Usuario usuario) {

		return (Collection<Cotacao>) cotacaoRepository.findAll(usuario.getId());

	}

	public void excluir(Integer id) {
		cotacaoRepository.deleteById(id);

	}

}
