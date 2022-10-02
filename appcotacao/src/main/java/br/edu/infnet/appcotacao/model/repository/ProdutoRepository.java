package br.edu.infnet.appcotacao.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcotacao.model.domain.Informatica;
import br.edu.infnet.appcotacao.model.domain.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

	
	@Query("from Produto p where p.usuario.id = :idUsuario")
	Collection<Produto> findAll(Integer idUsuario);
	
	

}
