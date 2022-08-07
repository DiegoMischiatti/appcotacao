package br.edu.infnet.appcotacao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.model.domain.Cliente;

@Component
public class ClienteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Cliente");
		
		Cliente i1 = new Cliente("Cliente 1", "Endereco 1", "email 1");
		
		System.out.println(i1);
		
		Cliente i2 = new Cliente("Cliente 2", "Endereco 1", "email 2" );
		
		System.out.println(i2);
		
		Cliente i3 = new Cliente("Cliente 3", "Endereco 1", "email 3");
		
		System.out.println(i3);
		
	}

}
