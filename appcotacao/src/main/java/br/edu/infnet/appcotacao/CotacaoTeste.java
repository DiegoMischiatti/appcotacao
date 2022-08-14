package br.edu.infnet.appcotacao;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.model.domain.Cotacao;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Component
public class CotacaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("####Cotacao");
		
		Cotacao c1 = new Cotacao();
	
		c1.setValidacao ("Cotacao 1");
		c1.setData (LocalDateTime.now());
		c1.setWeb (false);
		System.out.println(c1);
		
		AppImpressao.relatorio("inf informatica cotacao 1", c1);
		
		Cotacao c2 = new Cotacao();
		c2.setValidacao ("Cotacao 2");
		c2.setData (LocalDateTime.now());
		c2.setWeb (false);
		System.out.println(c2);
		
		AppImpressao.relatorio("inf informatica cotacao 2", c2);
		
		Cotacao c3 = new Cotacao();
		c3.setValidacao ("Cotacao 3");
		c3.setData (LocalDateTime.now());
		c3.setWeb (false);
		System.out.println(c3);
		
		AppImpressao.relatorio("inf informatica cotacao 3", c3);
		
	}

}
