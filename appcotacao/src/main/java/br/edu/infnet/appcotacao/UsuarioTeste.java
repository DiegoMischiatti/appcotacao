package br.edu.infnet.appcotacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.model.domain.Cliente;
import br.edu.infnet.appcotacao.model.domain.Cotacao;
import br.edu.infnet.appcotacao.model.domain.Produto;
import br.edu.infnet.appcotacao.model.domain.Usuario;
import br.edu.infnet.appcotacao.model.domain.exceptions.ClienteNuloException;
import br.edu.infnet.appcotacao.model.domain.exceptions.CotacaoSemProdutoException;
import br.edu.infnet.appcotacao.model.domain.exceptions.NomeInvalidoException;
import br.edu.infnet.appcotacao.model.service.UsuarioService;

@Component
public class UsuarioTeste implements ApplicationRunner{
	
	@Autowired
	
	private UsuarioService usuarioService;
	
	private Usuario usuario; 

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		usuario = new Usuario();
		usuario.setEmail("email@email.com");
		usuario.setNome("adm");
		usuario.setSenha("123");
		
		usuarioService.incluir(usuario);
		
		String dir = "c:/dev/";
		String arq = "usuarios.txt";

		try {

			try {
			
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				
				String linha = leitura.readLine();
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
					usuario = new Usuario();
					usuario.setEmail(campos[0]);
					usuario.setNome(campos[1]);
					usuario.setSenha(campos[2]);
					
					usuarioService.incluir(usuario);
					
					
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
