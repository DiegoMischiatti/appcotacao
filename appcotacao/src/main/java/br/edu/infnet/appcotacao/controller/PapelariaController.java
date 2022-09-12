package br.edu.infnet.appcotacao.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
	
	@GetMapping(value = "/papelaria/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		papelariaService.excluir(id);
		
		return "redirect:/papelaria/lista";

}
	
}