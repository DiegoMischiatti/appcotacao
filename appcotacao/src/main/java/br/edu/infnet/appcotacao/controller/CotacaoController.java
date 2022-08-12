package br.edu.infnet.appcotacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CotacaoController{
	
	@GetMapping (value = "/cotacao/lista")
	public String telaLista(){
		return "cotacao/lista";
		
	}

}
