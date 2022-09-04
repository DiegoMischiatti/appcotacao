package br.edu.infnet.appcotacao;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.controller.UsuarioController;
import br.edu.infnet.appcotacao.model.domain.Usuario;

@Component
public class UsuarioTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setEmail("email@email.com");
		usuario.setNome("adm");
		usuario.setSenha("123");
		
		UsuarioController.incluir(usuario);
	}
	

}
