package br.edu.infnet.appcotacao.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcotacao.model.domain.Cotacao;
import br.edu.infnet.appcotacao.model.domain.Informatica;

@Repository
public interface CotacaoRepository extends CrudRepository<Cotacao, Integer>{

	
	@Query("from Cotacao c where c.usuario.id = :idUsuario")
	Collection<Cotacao> findAll(Integer idUsuario);
	
	

}
