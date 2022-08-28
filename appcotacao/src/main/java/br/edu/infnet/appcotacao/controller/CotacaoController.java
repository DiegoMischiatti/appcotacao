package br.edu.infnet.appcotacao.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appcotacao.model.domain.Cotacao;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Controller
public class CotacaoController{
	
	private static Map<Integer, Cotacao> mapaCotacao = new HashMap<Integer, Cotacao>();
	private static Integer id = 1;
	
	public static void incluir(Cotacao cotacao){
		
		cotacao.setId(id++);
		
		mapaCotacao.put(cotacao.getId(), cotacao);
		
		AppImpressao.relatorio("inf cotacao " + cotacao.getValidacao() + "incluido", cotacao);

	}
	
	public static Collection<Cotacao> obterLista(){
		return mapaCotacao.values();
		
		
	}
 	
	public static void excluir(Integer id) {
		mapaCotacao.remove(id);
	}
	
	@GetMapping (value = "/cotacao/lista")
	public String telaLista(Model model){
		
		model.addAttribute("listagem", obterLista());
		
		return "cotacao/lista";
		
	}
	@GetMapping(value = "/cotacao/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/cotacao/lista";
		
	}	

}
