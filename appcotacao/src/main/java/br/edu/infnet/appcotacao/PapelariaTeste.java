package br.edu.infnet.appcotacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.model.domain.Papelaria;
import br.edu.infnet.appcotacao.model.domain.exceptions.QuantidadePapelariaInvalidoException;
import br.edu.infnet.appcotacao.model.service.PapelariaService;
import br.edu.infnet.appcotacao.model.test.AppImpressao;



@Component
public class PapelariaTeste implements ApplicationRunner {

@Autowired
	
	private PapelariaService papelariaService;
	
	@Override
	public void run(ApplicationArguments args) {
		System.out.println("####Papelaria");

		try {
			Papelaria p1 = new Papelaria();
			p1.setCodigo(4);
			p1.setTipo("caneta");
			p1.setValor(500);
			p1.setMaterial("plástico");
			p1.setQuantidade(3.14f);
			p1.setValidade(false);
			papelariaService.incluir(p1);
			System.out.println("CalcularValordecompra: " + p1.CalcularValordecompra());
			AppImpressao.relatorio("cotacao papelaria 1", p1);
		} catch (QuantidadePapelariaInvalidoException e) {
			System.out.println("erro papelaria" + e.getMessage());
		}

		try {
			Papelaria p2 = new Papelaria();
			p2.setCodigo(5);
			p2.setTipo("quadro");
			p2.setValor(20);
			p2.setMaterial("madeira");
			p2.setQuantidade(10f);
			p2.setValidade(true);
			papelariaService.incluir(p2);
			System.out.println("CalcularValordecompra: " + p2.CalcularValordecompra());
			AppImpressao.relatorio("cotacao papelaria 2", p2);
		} catch (QuantidadePapelariaInvalidoException e) {
			System.out.println("erro papelaria" + e.getMessage());
		}

		try {
			Papelaria p3 = new Papelaria();
			p3.setCodigo(6);
			p3.setTipo("caderno");
			p3.setValor(10);
			p3.setMaterial("papel");
			p3.setQuantidade(15f);
			p3.setValidade(false);
			papelariaService.incluir(p3);
			System.out.println("CalcularValordecompra: " + p3.CalcularValordecompra());
			AppImpressao.relatorio("cotacao papelaria 3", p3);
		} catch (QuantidadePapelariaInvalidoException e) {
			System.out.println("erro informatica" + e.getMessage());
		}

		try {
			Papelaria p4 = new Papelaria();
			p4.setCodigo(6);
			p4.setTipo("caderno");
			p4.setValor(10);
			p4.setMaterial("papel");
			p4.setQuantidade(0);
			p4.setValidade(false);
			papelariaService.incluir(p4);
			System.out.println("CalcularValordecompra: " + p4.CalcularValordecompra());
			AppImpressao.relatorio("cotacao papelaria 4", p4);
		} catch (QuantidadePapelariaInvalidoException e) {
			System.out.println("erro papelaria" + e.getMessage());
		}

		try {
			Papelaria p5 = new Papelaria();
			p5.setCodigo(6);
			p5.setTipo("caderno");
			p5.setValor(10);
			p5.setMaterial("papel");
			p5.setQuantidade(-10);
			p5.setValidade(false);
			papelariaService.incluir(p5);
			System.out.println("CalcularValordecompra: " + p5.CalcularValordecompra());
			AppImpressao.relatorio("cotacao papelaria 5", p5);
		} catch (QuantidadePapelariaInvalidoException e) {
			System.out.println("erro papelaria" + e.getMessage());
		}
	}

}
