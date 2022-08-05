package br.edu.infnet.appcotacao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.model.domain.Vestuario;

@Component
public class VestuarioTeste implements ApplicationRunner{


	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Vestuario");
		
		Vestuario v1 = new Vestuario();
		v1.classe = "esporte";
		v1.tamanho = 5f;
		v1.infantil = false;
		System.out.println(v1);
		
		Vestuario v2 = new Vestuario();
		v2.classe = "noite";
		v2.tamanho = 6f;
		v2.infantil = true;
		System.out.println(v2);
		
		Vestuario v3 = new Vestuario();
		v3.classe = "pijama";
		v3.tamanho = 7f;
		v3.infantil = false;
		System.out.println(v3);
		
	}

}