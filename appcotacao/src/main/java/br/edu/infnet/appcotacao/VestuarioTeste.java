package br.edu.infnet.appcotacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.controller.VestuarioController;
import br.edu.infnet.appcotacao.model.domain.Vestuario;
import br.edu.infnet.appcotacao.model.domain.exceptions.TamanhoVestuarioInvalidoException;
import br.edu.infnet.appcotacao.model.service.VestuarioService;
import br.edu.infnet.appcotacao.model.test.AppImpressao;




@Component
public class VestuarioTeste implements ApplicationRunner {

@Autowired
	
	private VestuarioService vestuarioService;
	
	@Override
	public void run(ApplicationArguments args) {
		System.out.println("####Vestuario");

		try {
			Vestuario v1 = new Vestuario();
			v1.setCodigo(73);
			v1.setTipo("camisa");
			v1.setValor(657);
			v1.setClasse("esporte");
			v1.setTamanho(3);
			v1.setInfantil(false);
			vestuarioService.incluir(v1);
			System.out.println("CalcularValordecompra: " + v1.CalcularValordecompra());
			AppImpressao.relatorio("cotacao vestuario 1", v1);
		} catch (TamanhoVestuarioInvalidoException e) {
			System.out.println("erro vestuario" + e.getMessage());

		}

		try {
			Vestuario v2 = new Vestuario();
			v2.setCodigo(8);
			v2.setTipo("terno");
			v2.setValor(900);
			v2.setClasse("noite");
			v2.setTamanho(4);
			v2.setInfantil(true);
			vestuarioService.incluir(v2);
			System.out.println("CalcularValordecompra: " + v2.CalcularValordecompra());
			AppImpressao.relatorio("cotacao vestuario 2", v2);
		} catch (TamanhoVestuarioInvalidoException e) {
			System.out.println("erro vestuario" + e.getMessage());

		}

		try {
			Vestuario v3 = new Vestuario();
			v3.setCodigo(9);
			v3.setTipo("calca");
			v3.setValor(555);
			v3.setClasse("pijama");
			v3.setTamanho(2);
			v3.setInfantil(false);
			vestuarioService.incluir(v3);
			System.out.println("CalcularValordecompra: " + v3.CalcularValordecompra());
			AppImpressao.relatorio("cotacao vestuario 3", v3);
		} catch (TamanhoVestuarioInvalidoException e) {
			System.out.println("erro vestuario" + e.getMessage());

		}

		try {
			Vestuario v4 = new Vestuario();
			v4.setCodigo(9);
			v4.setTipo("calca");
			v4.setValor(555);
			v4.setClasse("pijama");
			v4.setTamanho(10);
			v4.setInfantil(false);
			vestuarioService.incluir(v4);
			System.out.println("CalcularValordecompra: " + v4.CalcularValordecompra());
			AppImpressao.relatorio("cotacao vestuario 4", v4);
		} catch (TamanhoVestuarioInvalidoException e) {
			System.out.println("erro vestuario" + e.getMessage());

		}

		try {
			Vestuario v5 = new Vestuario();
			v5.setCodigo(9);
			v5.setTipo("calca");
			v5.setValor(555);
			v5.setClasse("pijama");
			v5.setTamanho(-1);
			v5.setInfantil(false);
			vestuarioService.incluir(v5);
			System.out.println("CalcularValordecompra: " + v5.CalcularValordecompra());
			AppImpressao.relatorio("cotacao vestuario 5", v5);
		} catch (TamanhoVestuarioInvalidoException e) {
			System.out.println("erro vestuario" + e.getMessage());

		}

	}

}