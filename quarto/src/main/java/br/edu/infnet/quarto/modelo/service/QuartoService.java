package br.edu.infnet.quarto.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.quarto.modelo.entidades.Quarto;
import br.edu.infnet.quarto.modelo.repository.QuartoRepository;

@Service
public class QuartoService {
	
	@Autowired
	private QuartoRepository quartoRepository;
	
	public List<Quarto> getAll(){
	  return (List<Quarto>) quartoRepository.findAll() ;
	}

}
