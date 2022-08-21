package br.edu.infnet.appcotacao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.model.domain.Cliente;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Component
public class ClienteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("####Cliente");
		
		Cliente cl1 = new Cliente("Cliente 1", "Endereco 1", "email 1");
		AppImpressao.relatorio("inf cliente cliente 1", cl1);
		
		Cliente cl2 = new Cliente("Cliente 2", "Endereco 1", "email 2" );
		AppImpressao.relatorio("inf cliente cliente 2", cl2);
		
		Cliente cl3 = new Cliente("Cliente 3", "Endereco 1", "email 3");
		AppImpressao.relatorio("inf cliente cliente 3", cl3);
		
	}

}
