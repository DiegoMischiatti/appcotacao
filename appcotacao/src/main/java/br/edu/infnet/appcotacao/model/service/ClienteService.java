package br.edu.infnet.appcotacao.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appcotacao.model.domain.Cliente;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Service

public class ClienteService {

	private static Map<Integer, Cliente> mapaCliente = new HashMap<Integer, Cliente>();
	private Integer id = 1;
	
	public void incluir(Cliente cliente){
		
		cliente.setId(id++);
		
		mapaCliente.put(cliente.getId(), cliente);
		
		AppImpressao.relatorio("inclusao do cliente " + cliente.getNome() + "incluido", cliente);

	}
	
	public Collection<Cliente> obterLista(){
		return mapaCliente.values();
		
		
	}
 	
	public void excluir(Integer id) {
		mapaCliente.remove(id);
	}


}
