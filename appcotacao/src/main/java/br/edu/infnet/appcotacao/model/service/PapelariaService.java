package br.edu.infnet.appcotacao.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appcotacao.model.domain.Papelaria;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Service

public class PapelariaService {
	
	private static Map<Integer, Papelaria> mapaPapelaria = new HashMap<Integer, Papelaria>();
	private Integer id = 1;
	
	public void incluir(Papelaria papelaria){
		
		papelaria.setId(id++);
		
		mapaPapelaria.put(papelaria.getId(), papelaria);
		
		AppImpressao.relatorio("inf papelaria " + papelaria.getTipo() + "incluido", papelaria);

	}
	
	public Collection<Papelaria> obterLista(){
		return mapaPapelaria.values();
		
		
	}
	
	public void excluir(Integer id) {
		mapaPapelaria.remove(id);
	}

}
