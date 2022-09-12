package br.edu.infnet.appcotacao.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appcotacao.model.domain.Vestuario;
import br.edu.infnet.appcotacao.model.service.UsuarioService;
import br.edu.infnet.appcotacao.model.service.VestuarioService;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Controller
public class VestuarioController{
	
@Autowired
	
	private VestuarioService vestuarioService;
 	
	@GetMapping (value = "/vestuario/lista")
	public String telaLista(Model model){
		
		model.addAttribute("listagem", vestuarioService.obterLista());
		
		return "vestuario/lista";
		
	}
	
	@GetMapping(value = "/vestuario/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		vestuarioService.excluir(id);
		
		return "redirect:/vestuario/lista";

}

}
