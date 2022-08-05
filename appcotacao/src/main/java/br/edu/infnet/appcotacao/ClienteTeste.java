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
		
		Cliente i1 = new Cliente();
		i1.nome = "Cliente 1";
		i1.endereco = "Endereco 1";
		i1.email = "email 1";
		System.out.println(i1);
		
		Cliente i2 = new Cliente();
		i2.nome = "Cliente 2";
		i2.endereco = "Endereco 1";
		i2.email = "email 2";
		System.out.println(i2);
		
		Cliente i3 = new Cliente();
		i3.nome = "Cliente 3";
		i3.endereco = "Endereco 1";
		i3.email = "email 3";
		System.out.println(i3);
		
	}

}
