package br.edu.infnet.appcotacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcotacao.model.domain.Usuario;
import br.edu.infnet.appcotacao.model.service.ProdutoService;

@Controller
public class ProdutoController{
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping (value = "/produto/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario){
		
		model.addAttribute("listagem", produtoService.obterLista(usuario));
		
		return "produto/lista";
		
	}
	@GetMapping(value = "/produto/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		try {

			produtoService.excluir(id);
		} catch (Exception e) {
			System.out.println("ERRO" + e.getMessage()); 
		}
	
		
		return "redirect:/produto/lista";
		
		
	}

}
