package br.edu.infnet.appcotacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcotacao.model.domain.Cliente;
import br.edu.infnet.appcotacao.model.domain.Usuario;
import br.edu.infnet.appcotacao.model.service.ClienteService;
import br.edu.infnet.appcotacao.model.service.InformaticaService;

@Controller
public class ClienteController {

	@Autowired

	private ClienteService clienteService;
	
	private String mensagem;

	@GetMapping(value = "/cliente/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario user) {
		
		
		model.addAttribute("listagem", clienteService.obterLista(user));
		
		model.addAttribute("mensagem", mensagem);
		 
		return "cliente/lista";

	}

	@GetMapping(value = "/cliente")
	public String telaCadastro() {
		return "cliente/cadastro";
	}

	@PostMapping(value = "/cliente/incluir")
	public String incluir(Cliente cliente, @SessionAttribute("user") Usuario usuario) {
		
		cliente.setUsuario(usuario);


		clienteService.incluir(cliente);
		
		mensagem = "Inclusão do cliente" + cliente.getNome() + "Realizada com sucesso";

		return "redirect:/cliente/lista";
	}
	
	
	@GetMapping(value = "/cliente/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		try {

			clienteService.excluir(id);
			
			mensagem = "Exclusão do cliente" + id + "Realizada com sucesso";
		} catch (Exception e) {
			mensagem = "impossivel realizar a exclusao do solicitante" + id + "!!" ;
		}
	
		
		return "redirect:/cliente/lista";
		
		
	}
}
