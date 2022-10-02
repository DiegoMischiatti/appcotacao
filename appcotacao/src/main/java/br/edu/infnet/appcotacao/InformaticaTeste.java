package br.edu.infnet.appcotacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.model.domain.Informatica;
import br.edu.infnet.appcotacao.model.domain.Usuario;
import br.edu.infnet.appcotacao.model.domain.exceptions.PesoInformaticaInvalidoException;
import br.edu.infnet.appcotacao.model.service.InformaticaService;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Component
@Order(3)
public class InformaticaTeste implements ApplicationRunner {

	@Autowired

	private InformaticaService informaticaService;

	@Override
	public void run(ApplicationArguments args) {
		System.out.println("####Informatica");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);

		String dir = "c:/dev/";
		String arq = "produtos.txt";

		try {

			try {
			
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				
				String linha = leitura.readLine();
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
					if("I".equalsIgnoreCase(campos[0])) {
						
						try {
							Informatica i1 = new Informatica();
							i1.setCodigo(Integer.valueOf(campos[1]));
							i1.setTipo(campos[2]);
							i1.setValor(Float.valueOf(campos[3]));
							i1.setAno(campos[4]);
							i1.setPeso(Float.valueOf(campos[5]));
							i1.setWireless(Boolean.valueOf(campos[6]));
							i1.setUsuario(usuario);
							informaticaService.incluir(i1);
							System.out.println("CalcularValordecompra: " + i1.CalcularValordecompra());
							AppImpressao.relatorio("cotacao informatica 1", i1);
						} catch (PesoInformaticaInvalidoException e) {
							System.out.println("erro informatica" + e.getMessage());
					
						}
					}
					linha = leitura.readLine();
				}
				
				leitura.close();
				fileReader.close();
				
				
			} catch (FileNotFoundException e) {
				System.out.println("ERRO ARQUIVO NAO EXISTE");
			} catch (IOException e) {
				System.out.println("PROBLEMA FECHAMENTO");
			}
		} finally {
			System.out.println("finalizado");
		}
		
	}

}
