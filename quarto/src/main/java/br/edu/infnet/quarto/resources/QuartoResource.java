package br.edu.infnet.quarto.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.quarto.modelo.entidades.Quarto;
import br.edu.infnet.quarto.modelo.service.QuartoService;


@RestController
@RequestMapping("/quartos")
public class QuartoResource {

	private static Logger log = LoggerFactory.getLogger(QuartoResource.class);
	
	@Autowired
	private QuartoService quartoService;
	
	@GetMapping
	public ResponseEntity<List<Quarto>> getQuartos(){
		log.info("API de Quarto");
		
		return ResponseEntity.ok(quartoService.getAll());
	}
	
}