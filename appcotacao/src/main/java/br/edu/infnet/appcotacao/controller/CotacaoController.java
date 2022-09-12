package br.edu.infnet.appcotacao.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appcotacao.model.domain.Cotacao;
import br.edu.infnet.appcotacao.model.service.CotacaoService;
import br.edu.infnet.appcotacao.model.service.InformaticaService;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Controller
public class CotacaoController{
@Autowired
	
	private CotacaoService cotacaoService;
	
	@GetMapping (value = "/cotacao/lista")
	public String telaLista(Model model){
		
		model.addAttribute("listagem", cotacaoService.obterLista());
		
		return "cotacao/lista";
		
	}
	@GetMapping(value = "/cotacao/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		cotacaoService.excluir(id);
		
		return "redirect:/cotacao/lista";
		
	}	

}
