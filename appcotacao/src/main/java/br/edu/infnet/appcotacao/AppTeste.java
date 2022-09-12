package br.edu.infnet.appcotacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.model.domain.app.Atributo;
import br.edu.infnet.appcotacao.model.domain.app.Classe;
import br.edu.infnet.appcotacao.model.domain.app.Projeto;
import br.edu.infnet.appcotacao.model.service.AppService;

@Component
public class AppTeste implements ApplicationRunner {
	
	
	@Autowired
	private AppService appService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		String dir = "c:/dev/";
		String arq = "app.txt";

		try {

			try {

				FileReader fileReader = new FileReader(dir + arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				Projeto projeto = null;
				List<Classe> classes = null;
				List<Atributo> atributos = null;

				String linha = leitura.readLine();
				while (linha != null) {

					String[] campos = linha.split(";");

					switch (campos[0].toUpperCase()) {
					case "P":
						
						classes = new ArrayList<Classe>();
						
						projeto = new Projeto();
						projeto.setNome(campos[1]);
						projeto.setDescricao(campos[2]);
						projeto.setClasses(classes);
						


						break;

					case "C":
						
						atributos = new ArrayList<Atributo>();
						
						Classe classe = new Classe();
						classe.setNome(campos[1]);
						classe.setAtributos(atributos);
						
						classes.add(classe);
						break;
						
					case "A":
						
						Atributo atributo = new Atributo(campos[1], campos[2], campos[3]);
						
						atributos.add(atributo);

						break;

					default:
						System.out.println("Invalido");
						break;

					}
					
					linha = leitura.readLine();
				}
				
				
				appService.incluir(projeto);
				
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
