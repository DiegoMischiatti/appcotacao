package br.edu.infnet.appcotacao.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appcotacao.model.domain.Cotacao;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Service


public class CotacaoService {
	
	
	private static Map<Integer, Cotacao> mapaCotacao = new HashMap<Integer, Cotacao>();
	private Integer id = 1;
	
	public void incluir(Cotacao cotacao){
		
		cotacao.setId(id++);
		
		mapaCotacao.put(cotacao.getId(), cotacao);
		
		AppImpressao.relatorio("inf cotacao " + cotacao.getValidacao() + "incluido", cotacao);

	}
	
	public Collection<Cotacao> obterLista(){
		return mapaCotacao.values();
		
		
	}
 	
	public void excluir(Integer id) {
		mapaCotacao.remove(id);
	}

}
