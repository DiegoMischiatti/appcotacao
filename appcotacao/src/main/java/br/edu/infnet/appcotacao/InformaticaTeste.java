package br.edu.infnet.appcotacao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.model.domain.Informatica;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Component
public class InformaticaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("####Informatica");
		
		Informatica i1 = new Informatica();
		i1.setCodigo(1);
		i1.setTipo("camera");
		i1.setValor(500);
		i1.setAno("2000");
		i1.setPeso(3.14f);
		i1.setWireless(false);
		System.out.println(i1);
		
		AppImpressao.relatorio("inf informatica camera", i1);
		
		
		Informatica i2 = new Informatica();
		i2.setCodigo(2);
		i2.setTipo("roteador");
		i2.setValor(1000);
		i2.setAno("2022");
		i2.setPeso(10f);
		i2.setWireless(true);
		System.out.println(i2);
		
		AppImpressao.relatorio("inf informatica roteador", i2);
		
		
		Informatica i3 = new Informatica();
		i3.setCodigo(3);
		i3.setTipo("teclado");
		i3.setValor(1500);
		i3.setAno("2015");
		i3.setPeso(15f);
		i3.setWireless(false);
		System.out.println(i3);
		
		AppImpressao.relatorio("inf informatica teclado", i3);
		
	}

}
