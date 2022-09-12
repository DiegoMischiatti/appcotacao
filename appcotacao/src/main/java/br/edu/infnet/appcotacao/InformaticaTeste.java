package br.edu.infnet.appcotacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.model.domain.Informatica;
import br.edu.infnet.appcotacao.model.domain.exceptions.PesoInformaticaInvalidoException;
import br.edu.infnet.appcotacao.model.service.InformaticaService;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Component
public class InformaticaTeste implements ApplicationRunner {

	@Autowired

	private InformaticaService informaticaService;

	@Override
	public void run(ApplicationArguments args) {
		System.out.println("####Informatica");

		try {
			Informatica i1 = new Informatica();
			i1.setCodigo(1);
			i1.setTipo("camera");
			i1.setValor(500);
			i1.setAno("2000");
			i1.setPeso(3);
			i1.setWireless(false);
			informaticaService.incluir(i1);
			System.out.println("CalcularValordecompra: " + i1.CalcularValordecompra());
			AppImpressao.relatorio("cotacao informatica 1", i1);
		} catch (PesoInformaticaInvalidoException e) {
			System.out.println("erro informatica" + e.getMessage());

		}

		try {
			Informatica i2 = new Informatica();
			i2.setCodigo(2);
			i2.setTipo("roteador");
			i2.setValor(1000);
			i2.setAno("2022");
			i2.setPeso(10);
			i2.setWireless(true);
			informaticaService.incluir(i2);
			System.out.println("CalcularValordecompra: " + i2.CalcularValordecompra());
			AppImpressao.relatorio("cotacao informatica 2", i2);
		} catch (PesoInformaticaInvalidoException e) {
			System.out.println("erro informatica" + e.getMessage());
		}

		try {
			Informatica i3 = new Informatica();
			i3.setCodigo(3);
			i3.setTipo("teclado");
			i3.setValor(1500);
			i3.setAno("2015");
			i3.setPeso(15);
			i3.setWireless(false);
			informaticaService.incluir(i3);
			System.out.println("CalcularValordecompra: " + i3.CalcularValordecompra());
			AppImpressao.relatorio("informatica 3", i3);
		} catch (PesoInformaticaInvalidoException e) {
			System.out.println("erro informatica" + e.getMessage());
		}

		try {
			Informatica i4 = new Informatica();
			i4.setCodigo(3);
			i4.setTipo("teclado");
			i4.setValor(1500);
			i4.setAno("2015");
			i4.setPeso(1);
			i4.setWireless(false);
			informaticaService.incluir(i4);
			System.out.println("CalcularValordecompra: " + i4.CalcularValordecompra());
			AppImpressao.relatorio("cotacao papelaria 1", i4);
		} catch (PesoInformaticaInvalidoException e) {
			System.out.println("erro informatica" + e.getMessage());
		}
	}

}
