package br.edu.infnet.appcotacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.model.domain.Cliente;
import br.edu.infnet.appcotacao.model.domain.Usuario;
import br.edu.infnet.appcotacao.model.domain.exceptions.NomeInvalidoException;
import br.edu.infnet.appcotacao.model.service.ClienteService;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Component
public class ClienteTeste implements ApplicationRunner {

	
	@Autowired

	private ClienteService clienteService;

	
	
	@Override
	public void run(ApplicationArguments args) {
		System.out.println("####Cliente");
		
		String dir = "c:/dev/";
		String arq = "clientes.txt";

		try {

			try {
			
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				
				String linha = leitura.readLine();
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
					try {
						Cliente cl1 = new Cliente(campos[0], campos[1], campos[2]);
						clienteService.incluir(cl1);
					} catch (NomeInvalidoException e) {
						System.out.println("erro" + e.getMessage());
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
		
		