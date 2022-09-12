package br.edu.infnet.appcotacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appcotacao.model.service.ClienteService;
import br.edu.infnet.appcotacao.model.service.InformaticaService;

@Controller
public class ClienteController{
	
@Autowired
	
	private ClienteService clienteService;
	
	@GetMapping (value = "/cliente/lista")
	public String telaLista(){
		return "cliente/lista";
		
	}

}
