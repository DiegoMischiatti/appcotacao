package br.edu.infnet.appcotacao.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcotacao.model.domain.Informatica;
import br.edu.infnet.appcotacao.model.domain.Usuario;
import br.edu.infnet.appcotacao.model.repository.InformaticaRepository;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Service

public class InformaticaService {
	
	
	@Autowired
	private InformaticaRepository informaticaRepository;
	

	public void incluir(Informatica informatica) {
		
		informaticaRepository.save(informatica);

		AppImpressao.relatorio("inf informatica " + informatica.getAno() + "incluido", informatica);

	}

	public Collection<Informatica> obterLista() {
		return (Collection<Informatica>) informaticaRepository.findAll();

	}
	
	public Collection<Informatica> obterLista(Usuario usuario) {
		return (Collection<Informatica>) informaticaRepository.findAll(usuario.getId());

	}

	public void excluir(Integer id) {
		informaticaRepository.deleteById(id);
	}


	

}
