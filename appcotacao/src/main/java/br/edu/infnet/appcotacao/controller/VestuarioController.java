package br.edu.infnet.appcotacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcotacao.model.domain.Vestuario;
import br.edu.infnet.appcotacao.model.service.VestuarioService;

@Controller
public class VestuarioController{
	
@Autowired
	
	private VestuarioService vestuarioService;
 	
	@GetMapping (value = "/vestuario/lista")
	public String telaLista(Model model){
		
		model.addAttribute("listagem", vestuarioService.obterLista());
		
		return "vestuario/lista";
		
	}
	
	@GetMapping (value = "/vestuario")
	public String telaCadastro() {
    	 return "vestuario/cadastro";
     }
	
	@PostMapping (value = "/vestuario/incluir")
	public String incluir(Vestuario vestuario) {
    	 
		vestuarioService.incluir(vestuario);
		
		return "redirect:/vestuario/lista";
     }
	
	@GetMapping(value = "/vestuario/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		try {

			vestuarioService.excluir(id);
		} catch (Exception e) {
			System.out.println("ERRO" + e.getMessage()); 
		}
	
		
		return "redirect:/vestuario/lista";
		
		
	}

}
