package br.edu.infnet.appcotacao.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appcotacao.model.domain.Informatica;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Controller
public class InformaticaController{
	
	private static Map<Integer, Informatica> mapaInformatica = new HashMap<Integer, Informatica>();
	private static Integer id = 1;
	
	public static void incluir(Informatica informatica){
		
		informatica.setId(id++);
		
		mapaInformatica.put(informatica.getId(), informatica);
		
		AppImpressao.relatorio("inf informatica " + informatica.getTipo() + "incluido", informatica);

	}
	
	public static Collection<Informatica> obterLista(){
		return mapaInformatica.values();
		
		
	}
 	
	public static void excluir(Integer id) {
		mapaInformatica.remove(id);
	}
	
	@GetMapping (value = "/informatica/lista")
	public String telaLista(Model model){
		
		model.addAttribute("listagem", obterLista());
		
		return "informatica/lista";
		
	}
	
	@GetMapping(value = "/informatica/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/informatica/lista";
		
	}	
}
