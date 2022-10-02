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

import br.edu.infnet.appcotacao.controller.VestuarioController;
import br.edu.infnet.appcotacao.model.domain.Papelaria;
import br.edu.infnet.appcotacao.model.domain.Vestuario;
import br.edu.infnet.appcotacao.model.domain.exceptions.QuantidadePapelariaInvalidoException;
import br.edu.infnet.appcotacao.model.domain.exceptions.TamanhoVestuarioInvalidoException;
import br.edu.infnet.appcotacao.model.service.VestuarioService;
import br.edu.infnet.appcotacao.model.test.AppImpressao;




@Component
@Order(5)
public class VestuarioTeste implements ApplicationRunner {

@Autowired
	
	private VestuarioService vestuarioService;
	
	@Override
	public void run(ApplicationArguments args) {
		System.out.println("####Vestuario");
		
		String dir = "c:/dev/";
		String arq = "produtos.txt";

		try {

			try {
			
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				
				String linha = leitura.readLine();
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
					if("V".equalsIgnoreCase(campos[0])) {
						try {
							Vestuario v1 = new Vestuario();
							v1.setCodigo(Integer.valueOf(campos[1]));
							v1.setTipo(campos[2]);
							v1.setValor(Float.valueOf(campos[3]));
							v1.setClasse(campos[4]);
							v1.setTamanho(Float.valueOf(campos[5]));
							v1.setInfantil(Boolean.valueOf(campos[6]));
							vestuarioService.incluir(v1);
							System.out.println("CalcularValordecompra: " + v1.CalcularValordecompra());
							AppImpressao.relatorio("cotacao vestuario 1", v1);
						} catch (TamanhoVestuarioInvalidoException e) {
							System.out.println("erro vestuario" + e.getMessage());

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

		