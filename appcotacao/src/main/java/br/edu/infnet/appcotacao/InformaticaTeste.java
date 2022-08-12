package br.edu.infnet.appcotacao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.model.domain.Informatica;
import br.edu.infnet.appcotacao.model.test.AppProduto;

@Component
public class InformaticaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Informatica");
		
		Informatica i1 = new Informatica();
		i1.codigo = 1;
		i1.tipo = "camera";
		i1.valor = 500;
		i1.ano = "2000";
		i1.peso = 3.14f;
		i1.wireless = false;
		System.out.println(i1);
		
		new AppProduto("inf informatica camera").relatorio(i1);
		
		
		Informatica i2 = new Informatica();
		i2.codigo = 2;
		i2.tipo = "roteador";
		i2.valor = 1000;
		i2.ano = "2022";
		i2.peso = 10f;
		i2.wireless = true;
		System.out.println(i2);
		
		new AppProduto("inf informatica roteador").relatorio(i2);
		
		
		Informatica i3 = new Informatica();
		i3.codigo = 3;
		i3.tipo = "teclado";
		i3.valor = 1500;
		i3.ano = "2015";
		i3.peso = 15f;
		i3.wireless = false;
		System.out.println(i3);
		
		new AppProduto("inf informatica teclado").relatorio(i3);
		
	}

}
