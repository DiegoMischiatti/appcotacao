package br.edu.infnet.appcotacao;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.model.domain.Cotacao;

@Component
public class CotacaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Cotacao");
		
		Cotacao c1 = new Cotacao();
		c1.validacao = "Cotacao 1";
		c1.data = LocalDateTime.now();
		c1.web = false;
		System.out.println(c1);
		
		Cotacao c2 = new Cotacao();
		c2.validacao = "Cotacao 2";
		c2.data = LocalDateTime.now();
		c2.web = true;
		System.out.println(c2);
		
		Cotacao c3 = new Cotacao();
		c3.validacao = "Cotacao 3";
		c3.data = LocalDateTime.now();
		c3.web = false;
		System.out.println(c3);
		
	}

}
