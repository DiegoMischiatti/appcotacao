package br.edu.infnet.appcotacao.model.service;

import org.springframework.stereotype.Service;

import br.edu.infnet.appcotacao.model.domain.app.Projeto;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Service
public class AppService {
	
	private Projeto projeto;
	
	public void incluir(Projeto projeto) {

		this.projeto = projeto;
		AppImpressao.relatorio("exibicao do projeto" + projeto.getNome() + "realizada com sucesso", projeto);
	
	}
	public Projeto obterProjeto() {
	 return projeto;
	}
}
