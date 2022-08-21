package br.edu.infnet.appcotacao.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appcotacao.model.domain.Vestuario;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Controller
public class VestuarioController{
	
	private static Map<Integer, Vestuario> mapaVestuario = new HashMap<Integer, Vestuario>();
	private static Integer id = 1;
	
	public static void incluir(Vestuario vestuario){
		
		vestuario.setId(id++);
		
		mapaVestuario.put(vestuario.getId(), vestuario);
		
		AppImpressao.relatorio("inf vestuario " + vestuario.getTipo() + "incluido", vestuario);

	}
	
	public static Collection<Vestuario> obterLista(){
		return mapaVestuario.values();
		
		
	}
	
	public static void excluir(Integer id) {
		mapaVestuario.remove(id);
	}
 	
	@GetMapping (value = "/vestuario/lista")
	public String telaLista(Model model){
		
		model.addAttribute("listagem", obterLista());
		
		return "vestuario/lista";
		
	}
	
	@GetMapping(value = "/vestuario/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		excluir(id);
		
		return "redirect:/vestuario/lista";

}

}
