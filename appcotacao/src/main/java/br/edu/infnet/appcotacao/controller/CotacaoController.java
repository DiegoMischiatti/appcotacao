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
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcotacao.model.domain.Cotacao;
import br.edu.infnet.appcotacao.model.domain.Produto;
import br.edu.infnet.appcotacao.model.domain.Usuario;
import br.edu.infnet.appcotacao.model.service.ClienteService;
import br.edu.infnet.appcotacao.model.service.CotacaoService;
import br.edu.infnet.appcotacao.model.service.InformaticaService;
import br.edu.infnet.appcotacao.model.service.ProdutoService;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Controller
public class CotacaoController {
	@Autowired

	private CotacaoService cotacaoService;
	@Autowired

	private ClienteService clienteService;
	
	@Autowired

	private ProdutoService produtoService;

	@GetMapping(value = "/cotacao")
	public String telaCadastro(Model model, @SessionAttribute("user")Usuario usuario) {

		model.addAttribute("clientes", clienteService.obterLista(usuario));
		model.addAttribute("produtos", produtoService.obterLista(usuario));

		return "cotacao/cadastro";

	}

	@GetMapping(value = "/cotacao/lista")
	public String telaLista(Model model,  @SessionAttribute("user")Usuario usuario) {

		model.addAttribute("listagem", cotacaoService.obterLista(usuario));

		return "cotacao/lista";

	}

	@PostMapping(value = "/cotacao/incluir")
	public String incluir(Cotacao cotacao, @SessionAttribute("user")Usuario usuario) {
		
		cotacao.setUsuario(usuario);
		
		cotacaoService.incluir(cotacao);
		

		return "redirect:/cotacao/lista";

	}

	@GetMapping(value = "/cotacao/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		try {

			cotacaoService.excluir(id);
		} catch (Exception e) {
			System.out.println("ERRO" + e.getMessage()); 
		}
	
		
		return "redirect:/cotacao/lista";
		
		
	}
}
