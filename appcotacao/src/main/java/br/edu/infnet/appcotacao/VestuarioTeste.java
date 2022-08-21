package br.edu.infnet.appcotacao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.controller.VestuarioController;
import br.edu.infnet.appcotacao.model.domain.Vestuario;

@Component
public class VestuarioTeste implements ApplicationRunner{


	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("####Vestuario");
		
		Vestuario v1 = new Vestuario();
		v1.setCodigo(73);
		v1.setTipo("camisa");
		v1.setValor(657);
		v1.setClasse("esporte");
		v1.setTamanho(5f);
		v1.setInfantil(false);
		System.out.println(v1);
		VestuarioController.incluir(v1);
		
		Vestuario v2 = new Vestuario();
		v2.setCodigo(8);
		v2.setTipo("terno");
		v2.setValor(900);
		v2.setClasse("noite");
		v2.setTamanho(6f);
		v2.setInfantil(true);
		System.out.println(v2);
		VestuarioController.incluir(v1);
	
		Vestuario v3 = new Vestuario();
		v3.setCodigo(9);
		v3.setTipo("calca");
		v3.setValor(555);
		v3.setClasse("pijama");
		v3.setTamanho(7f);
		v3.setInfantil(false);
		System.out.println(v3);
		VestuarioController.incluir(v3);
		
		
	}

}