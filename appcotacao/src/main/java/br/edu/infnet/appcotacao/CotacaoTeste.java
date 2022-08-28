package br.edu.infnet.appcotacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.controller.CotacaoController;
import br.edu.infnet.appcotacao.model.domain.Cliente;
import br.edu.infnet.appcotacao.model.domain.Cotacao;
import br.edu.infnet.appcotacao.model.domain.Informatica;
import br.edu.infnet.appcotacao.model.domain.Papelaria;
import br.edu.infnet.appcotacao.model.domain.Produto;
import br.edu.infnet.appcotacao.model.domain.Vestuario;
import br.edu.infnet.appcotacao.model.domain.exceptions.NomeInvalidoException;
import br.edu.infnet.appcotacao.model.domain.exceptions.ClienteNuloException;
import br.edu.infnet.appcotacao.model.domain.exceptions.CotacaoSemProdutoException;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Component
public class CotacaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args){
		System.out.println("####Cotacao");
		
		Informatica i1 = new Informatica();
		i1.setCodigo(1);
		i1.setTipo("camera");
		i1.setValor(500);
		i1.setAno("2000");
		i1.setPeso(3.14f);
		i1.setWireless(false);
		
		Papelaria p1 = new Papelaria();
		p1.setCodigo(2);
		p1.setTipo("caneta");
		p1.setValor(500);
		p1.setMaterial("plástico");
		p1.setQuantidade(3.14f);
		p1.setValidade(false);
		
		Vestuario v1 = new Vestuario();
		v1.setCodigo(3);
		v1.setTipo("camisa");
		v1.setValor(657);
		v1.setClasse("esporte");
		v1.setTamanho(5f);
		v1.setInfantil(false);
		
		
		String dir = "c:/dev/";
		String arq = "Cotacoes.txt";

		try {

			try {
			
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				
				String linha = leitura.readLine();
				while(linha != null) {
					
					
					try {
						
						
						String[] campos = linha.split(";");
						
						Set<Produto> listaProdutoC1 = new HashSet<Produto>();
						listaProdutoC1.add(i1);
						listaProdutoC1.add(p1);
						listaProdutoC1.add(v1);
						
						Cliente cl1 = new Cliente(campos[2], campos[3], campos[4]);
						
						Cotacao c1 = new Cotacao(cl1, listaProdutoC1);
						c1.setValidacao (campos[0]);
						c1.setWeb(Boolean.valueOf(campos[1]));
						CotacaoController.incluir(c1);
					} catch (NomeInvalidoException | ClienteNuloException | CotacaoSemProdutoException e) {
						System.out.println("erro cotacao" + e.getMessage());
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
