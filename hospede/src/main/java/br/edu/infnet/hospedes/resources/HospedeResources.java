package br.edu.infnet.hospedes.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.hospedes.modelo.entidades.Hospede;
import br.edu.infnet.hospedes.modelo.services.HospedeService;

@RestController
@RequestMapping("/hospedes")
public class HospedeResources {
	
	private static Logger log = LoggerFactory.getLogger(HospedeResources.class);
	
	
	@Autowired
	private HospedeService hospedeService;
	
	@GetMapping("/{codigo}")
	public Hospede getHospede(@PathVariable() Long codigo) {
		log.info("chamada api de hospede com cod.: {}", codigo);
		
		return hospedeService.getByCodigo(codigo);
		
	}
	

}
