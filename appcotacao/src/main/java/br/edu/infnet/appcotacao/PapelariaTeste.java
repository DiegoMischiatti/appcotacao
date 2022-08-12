package br.edu.infnet.appcotacao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.model.domain.Papelaria;
import br.edu.infnet.appcotacao.model.test.AppProduto;

@Component
public class PapelariaTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("#Papelaria");
		
		Papelaria p1 = new Papelaria();
		p1.codigo = 4;
		p1.tipo = "caneta";
		p1.valor = 500;
		p1.material = "plástico";
		p1.quantidade = 3.14f;
		p1.validade = false;
		System.out.println(p1);
		
		AppProduto app = new AppProduto("inf papelaria");
		app.relatorio(p1);
		
		
		
		Papelaria p2 = new Papelaria();
		p2.codigo = 5;
		p2.tipo = "quadro";
		p2.valor = 20;
		p2.material = "madeira";
		p2.quantidade = 10f;
		p2.validade = true;
		System.out.println(p2);
		
		Papelaria p3 = new Papelaria();
		p3.codigo = 6;
		p3.tipo = "caderno";
		p3.valor = 10;
		p3.material = "papel";
		p3.quantidade = 15f;
		p3.validade = false;
		System.out.println(p3);
		
	}
	
}	

