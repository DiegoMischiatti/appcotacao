package br.edu.infnet.appcotacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController{
	
	@GetMapping (value = "/cliente/lista")
	public String telaLista(){
		return "cliente/lista";
		
	}

}
