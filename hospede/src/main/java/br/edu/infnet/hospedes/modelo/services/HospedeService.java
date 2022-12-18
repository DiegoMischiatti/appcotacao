package br.edu.infnet.hospedes.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.hospedes.modelo.entidades.Hospede;
import br.edu.infnet.hospedes.modelo.repository.HospedeRepository;

@Service
public class HospedeService {
	
	@Autowired
	private HospedeRepository hospedeRepository;
	
	public Hospede getByCodigo(Long codigo) {
		return hospedeRepository.findById(codigo).get();
		
	}
	

}
