package br.edu.infnet.appcotacao.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appcotacao.model.domain.Vestuario;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Service

public class VestuarioService {
	
	private static Map<Integer, Vestuario> mapaVestuario = new HashMap<Integer, Vestuario>();
	private  Integer id = 1;
	
	public void incluir(Vestuario vestuario){
		
		vestuario.setId(id++);
		
		mapaVestuario.put(vestuario.getId(), vestuario);
		
		AppImpressao.relatorio("inf vestuario " + vestuario.getTipo() + "incluido", vestuario);

	}
	
	public Collection<Vestuario> obterLista(){
		return mapaVestuario.values();
		
		
	}
	
	public void excluir(Integer id) {
		mapaVestuario.remove(id);
	}	


}
