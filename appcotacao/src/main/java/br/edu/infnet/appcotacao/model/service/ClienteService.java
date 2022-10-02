package br.edu.infnet.appcotacao.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcotacao.model.domain.Cliente;
import br.edu.infnet.appcotacao.model.domain.Usuario;
import br.edu.infnet.appcotacao.model.repository.ClienteRepository;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Service

public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public void incluir(Cliente cliente) {
		clienteRepository.save(cliente);

		AppImpressao.relatorio("inclusao do cliente " + cliente.getNome() + "incluido", cliente);

	}

	public Collection<Cliente> obterLista() {

		return (Collection<Cliente>) clienteRepository.findAll();

	}
	
	public Collection<Cliente> obterLista(Usuario usuario) {

		return clienteRepository.obterLista(usuario.getId());

	}

	public void excluir(Integer id) {
		clienteRepository.deleteById(id);
	}

}
