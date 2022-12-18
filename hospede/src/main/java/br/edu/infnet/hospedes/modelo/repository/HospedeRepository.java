package br.edu.infnet.hospedes.modelo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.hospedes.modelo.entidades.Hospede;

@Repository
public interface HospedeRepository extends CrudRepository<Hospede, Long> {

}

