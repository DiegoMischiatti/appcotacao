package br.edu.infnet.appcotacao.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcotacao.model.domain.Produto;
import br.edu.infnet.appcotacao.model.domain.Usuario;
import br.edu.infnet.appcotacao.model.repository.ProdutoRepository;




@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtorepository;

	public List<Produto> obterLista() {

		return (List<Produto>) produtorepository.findAll();
	}

	public List<Produto> obterLista(Usuario usuario) {

		return (List<Produto>) produtorepository.findAll(usuario.getId());
	}
	
	public void excluir(Integer id) {
		produtorepository.deleteById(id);
	}

}
