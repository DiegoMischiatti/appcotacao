package br.edu.infnet.quarto.modelo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.quarto.modelo.entidades.Quarto;

@Repository
public interface QuartoRepository extends CrudRepository<Quarto, Long>{
	
	

}
