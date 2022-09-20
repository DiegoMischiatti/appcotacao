package br.edu.infnet.appcotacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.model.domain.Informatica;
import br.edu.infnet.appcotacao.model.domain.Papelaria;
import br.edu.infnet.appcotacao.model.domain.exceptions.PesoInformaticaInvalidoException;
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
		
		String dir = "c:/dev/";
		String arq = "produtos.txt";

		try {

			try {
			
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				
				String linha = leitura.readLine();
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
					if("P".equalsIgnoreCase(campos[0])) {
						
						try {
							Papelaria p1 = new Papelaria();
							p1.setCodigo(Integer.valueOf(campos[1]));
							p1.setTipo(campos[2]);
							p1.setValor(Float.valueOf(campos[3]));
							p1.setMaterial(campos[4]);
							p1.setQuantidade(Float.valueOf(campos[5]));
							p1.setValidade(Boolean.valueOf(campos[6]));
							papelariaService.incluir(p1);
							System.out.println("CalcularValordecompra: " + p1.CalcularValordecompra());
							AppImpressao.relatorio("cotacao papelaria 1", p1);
						} catch (QuantidadePapelariaInvalidoException e) {
							System.out.println("erro papelaria" + e.getMessage());
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
		