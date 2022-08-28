package br.edu.infnet.appcotacao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.model.domain.Cliente;
import br.edu.infnet.appcotacao.model.domain.exceptions.NomeInvalidoException;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Component
public class ClienteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {
		System.out.println("####Cliente");
		
		
		
		
		
		
		try {
			Cliente cl1 = new Cliente("Cliente 1", "Endereco 1", "email 1");
			AppImpressao.relatorio("inf cliente cliente 1", cl1);
		} catch (NomeInvalidoException e) {
			System.out.println("erro" + e.getMessage());
		}
		
		
		try {
			Cliente cl2 = new Cliente("Cliente 2", "Endereco 2", "email 2" );
			AppImpressao.relatorio("inf cliente cliente 2", cl2);
		} catch (NomeInvalidoException e) {
			System.out.println("erro" + e.getMessage());
		}
		
		
		try {
			Cliente cl3 = new Cliente("Cliente 3", "Endereco 3", "email 3");
			AppImpressao.relatorio("inf cliente cliente 3", cl3);
		} catch (NomeInvalidoException e) {
			System.out.println("erro" + e.getMessage());
		}
		
		try {
			Cliente cl4 = new Cliente("Cliente 4", null, "email 4");
			AppImpressao.relatorio("inf cliente cliente 4", cl4);
		} catch (NomeInvalidoException e) {
			System.out.println("erro" + e.getMessage());
		}
		
		try {
			Cliente cl5 = new Cliente("Cliente 5", "", "email 5");
			AppImpressao.relatorio("inf cliente cliente 5", cl5);
		} catch (NomeInvalidoException e) {
			System.out.println("erro" + e.getMessage());
		}
	}

}
