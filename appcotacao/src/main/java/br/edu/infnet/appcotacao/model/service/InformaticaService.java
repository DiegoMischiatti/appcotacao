package br.edu.infnet.appcotacao.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appcotacao.model.domain.Informatica;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Service

public class InformaticaService {
	


	private static Map<Integer, Informatica> mapaInformatica = new HashMap<Integer, Informatica>();

	
	private Integer id = 1;
	public void incluir(Informatica informatica) {

		informatica.setId(id++);

		mapaInformatica.put(informatica.getId(), informatica);

		AppImpressao.relatorio("inf informatica " + informatica.getAno() + "incluido", informatica);

	}

	public Collection<Informatica> obterLista() {
		return mapaInformatica.values();

	}

	public void excluir(Integer id) {
		mapaInformatica.remove(id);
	}

	@GetMapping(value = "/informatica/lista")
	public String telaLista(Model model) {

		model.addAttribute("listagem", obterLista());

		return "informatica/lista";

	}

}
