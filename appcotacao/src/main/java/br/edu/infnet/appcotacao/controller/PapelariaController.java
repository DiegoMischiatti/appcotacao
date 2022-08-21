package br.edu.infnet.appcotacao.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appcotacao.model.domain.Papelaria;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Controller
public class PapelariaController{
	
	private static Map<Integer, Papelaria> mapaPapelaria = new HashMap<Integer, Papelaria>();
	private static Integer id = 1;
	
	public static void incluir(Papelaria papelaria){
		
		papelaria.setId(id++);
		
		mapaPapelaria.put(papelaria.getId(), papelaria);
		
		AppImpressao.relatorio("inf papelaria " + papelaria.getTipo() + "incluido", papelaria);

	}
	
	public static Collection<Papelaria> obterLista(){
		return mapaPapelaria.values();
		
		
	}
	
	public static void excluir(Integer id) {
		mapaPapelaria.remove(id);
	}
 	
	@GetMapping (value = "/papelaria/lista")
	public String telaLista(Model model){
		
		model.addAttribute("listagem", obterLista());
		
		return "papelaria/lista";
		
	}
	
	@GetMapping(value = "/papelaria/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/papelaria/lista";

}
	
}