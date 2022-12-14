package br.edu.infnet.appcotacao.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcotacao.model.domain.Informatica;
import br.edu.infnet.appcotacao.model.domain.Papelaria;
import br.edu.infnet.appcotacao.model.service.InformaticaService;
import br.edu.infnet.appcotacao.model.service.PapelariaService;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Controller
public class PapelariaController{
	
@Autowired
	
	private PapelariaService papelariaService;
 	
	@GetMapping (value = "/papelaria/lista")
	public String telaLista(Model model){
		
		model.addAttribute("listagem", papelariaService.obterLista());
		
		return "papelaria/lista";
		
	}
	
	@GetMapping (value = "/papelaria")
	public String telaCadastro() {
    	 return "papelaria/cadastro";
     }
	
	@PostMapping (value = "/papelaria/incluir")
	public String incluir(Papelaria papelaria) {
    	 
		papelariaService.incluir(papelaria);
		
		return "redirect:/papelaria/lista";
     }
	
	@GetMapping(value = "/papelaria/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		try {

			papelariaService.excluir(id);
		} catch (Exception e) {
			System.out.println("ERRO" + e.getMessage()); 
		}
	
		
		return "redirect:/papelaria/lista";
		
		
	}
	
}