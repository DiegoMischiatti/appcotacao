package br.edu.infnet.appcotacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcotacao.model.domain.Informatica;
import br.edu.infnet.appcotacao.model.domain.Usuario;
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
	
	@GetMapping (value = "/informatica")
	public String telaCadastro() {
    	 return "informatica/cadastro";
     }
	
	@PostMapping (value = "/informatica/incluir")
	public String incluir(Informatica informatica) {
    	 
		informaticaService.incluir(informatica);
		
		return "redirect:/informatica/lista";
     }
	@GetMapping(value = "/informatica/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		informaticaService.excluir(id);
		
		return "redirect:/informatica/lista";
		
	}	

}
