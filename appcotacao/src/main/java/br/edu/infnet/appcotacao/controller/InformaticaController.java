package br.edu.infnet.appcotacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appcotacao.model.service.InformaticaService;

@Controller
public class InformaticaController{
	
@Autowired
	
	private InformaticaService informaticaService;
	
	@GetMapping (value = "/informatica/lista")
	public String telaLista(Model model){
		
		model.addAttribute("listagem", informaticaService.obterLista());
		
		return "informatica/lista";
		
	}
	@GetMapping(value = "/informatica/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		informaticaService.excluir(id);
		
		return "redirect:/informatica/lista";
		
	}	

}
