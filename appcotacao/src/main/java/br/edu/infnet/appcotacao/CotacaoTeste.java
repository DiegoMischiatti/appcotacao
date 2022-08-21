package br.edu.infnet.appcotacao;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.model.domain.Cliente;
import br.edu.infnet.appcotacao.model.domain.Cotacao;
import br.edu.infnet.appcotacao.model.domain.Informatica;
import br.edu.infnet.appcotacao.model.domain.Papelaria;
import br.edu.infnet.appcotacao.model.domain.Produto;
import br.edu.infnet.appcotacao.model.domain.Vestuario;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Component
public class CotacaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("####Cotacao");
		
		Informatica i1 = new Informatica();
		i1.setCodigo(1);
		i1.setTipo("camera");
		i1.setValor(500);
		i1.setAno("2000");
		i1.setPeso(3.14f);
		i1.setWireless(false);
		
		Papelaria p1 = new Papelaria();
		p1.setCodigo(1);
		p1.setTipo("caneta");
		p1.setValor(500);
		p1.setMaterial("plástico");
		p1.setQuantidade(3.14f);
		p1.setValidade(false);
		
		Vestuario v1 = new Vestuario();
		v1.setCodigo(1);
		v1.setTipo("camisa");
		v1.setValor(657);
		v1.setClasse("esporte");
		v1.setTamanho(5f);
		v1.setInfantil(false);
		
		Set<Produto> listaProdutoC1 = new HashSet<Produto>();
		listaProdutoC1.add(i1);
		listaProdutoC1.add(p1);
		
		
		
		Cliente cl1 = new Cliente("Cliente 1", "Endereco 1", "email 1");
		
		Cotacao c1 = new Cotacao(cl1);
		c1.setValidacao ("Cotacao 1");
		c1.setWeb (false);
		c1.setProdutos(listaProdutoC1);
		AppImpressao.relatorio("inf cotacao 1", c1);
		
		Set<Produto> listaProdutoC2 = new HashSet<Produto>();
		listaProdutoC2.add(v1);

		Cliente cl2 = new Cliente("Cliente 2", "Endereco 1", "email 2" );
		
		Cotacao c2 = new Cotacao(cl2);
		c2.setValidacao ("Cotacao 2");
		c2.setWeb (false);
		c2.setProdutos(listaProdutoC2);
		AppImpressao.relatorio("inf cotacao 2", c2);
		
		Set<Produto> listaProdutoC3 = new HashSet<Produto>();
		listaProdutoC3.add(v1);
		listaProdutoC3.add(i1);
		listaProdutoC3.add(p1);
		

		Cliente cl3 = new Cliente("Cliente 3", "Endereco 1", "email 3");
		
		Cotacao c3 = new Cotacao(cl3);
		c3.setValidacao ("Cotacao 3");
		c3.setWeb (false);
		c3.setProdutos(listaProdutoC3);
		AppImpressao.relatorio("inf cotacao 3", c3);
		
	}

}
