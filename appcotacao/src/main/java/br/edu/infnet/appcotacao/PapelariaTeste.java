package br.edu.infnet.appcotacao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.controller.InformaticaController;
import br.edu.infnet.appcotacao.controller.PapelariaController;
import br.edu.infnet.appcotacao.model.domain.Papelaria;

@Component
public class PapelariaTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("####Papelaria");
		
		Papelaria p1 = new Papelaria();
		p1.setCodigo(4);
		p1.setTipo("caneta");
		p1.setValor(500);
		p1.setMaterial("plástico");
		p1.setQuantidade(3.14f);
		p1.setValidade(false);
		System.out.println(p1);
		PapelariaController.incluir(p1);
		
		Papelaria p2 = new Papelaria();
		p2.setCodigo(5);
		p2.setTipo("quadro");
		p2.setValor(20);
		p2.setMaterial("madeira");
		p2.setQuantidade(10f);
		p2.setValidade(true);
		System.out.println(p2);
		PapelariaController.incluir(p2);
		
		Papelaria p3 = new Papelaria();
		p3.setCodigo(6);
		p3.setTipo("caderno");
		p3.setValor(10);
		p3.setMaterial("papel");
		p3.setQuantidade(15f);
		p3.setValidade(false);
		System.out.println(p3);
		PapelariaController.incluir(p3);
		
		
	}
	
}	

