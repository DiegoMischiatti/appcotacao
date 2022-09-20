package br.edu.infnet.appcotacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcotacao.model.domain.Cliente;
import br.edu.infnet.appcotacao.model.domain.Usuario;
import br.edu.infnet.appcotacao.model.service.ClienteService;
import br.edu.infnet.appcotacao.model.service.InformaticaService;

@Controller
public class ClienteController {

	@Autowired

	private ClienteService clienteService;

	@GetMapping(value = "/cliente/lista")
	public String telaLista(Model model) {
		
		
		model.addAttribute("listagem", clienteService.obterLista());
		 
		return "cliente/lista";

	}

	@GetMapping(value = "/cliente")
	public String telaCadastro() {
		return "cliente/cadastro";
	}

	@PostMapping(value = "/cliente/incluir")
	public String incluir(Cliente cliente) {

		clienteService.incluir(cliente);

		return "redirect:/cliente/lista";
	}
	
	
	@GetMapping(value = "/cliente/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		clienteService.excluir(id);
		
		return "redirect:/cliente/lista";
		
		
	}
}
