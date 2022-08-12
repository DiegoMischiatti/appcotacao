package br.edu.infnet.appcotacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InformaticaController{
	
	@GetMapping (value = "/informatica/lista")
	public String telaLista(){
		return "informatica/lista";
		
	}

}
