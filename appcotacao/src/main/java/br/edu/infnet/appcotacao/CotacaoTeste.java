package br.edu.infnet.appcotacao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appcotacao.controller.CotacaoController;
import br.edu.infnet.appcotacao.model.domain.Cliente;
import br.edu.infnet.appcotacao.model.domain.Cotacao;
import br.edu.infnet.appcotacao.model.domain.Informatica;
import br.edu.infnet.appcotacao.model.domain.Papelaria;
import br.edu.infnet.appcotacao.model.domain.Produto;
import br.edu.infnet.appcotacao.model.domain.Usuario;
import br.edu.infnet.appcotacao.model.domain.Vestuario;
import br.edu.infnet.appcotacao.model.domain.exceptions.ClienteNuloException;
import br.edu.infnet.appcotacao.model.domain.exceptions.CotacaoSemProdutoException;
import br.edu.infnet.appcotacao.model.domain.exceptions.NomeInvalidoException;
import br.edu.infnet.appcotacao.model.domain.exceptions.PesoInformaticaInvalidoException;
import br.edu.infnet.appcotacao.model.service.CotacaoService;
import br.edu.infnet.appcotacao.model.test.AppImpressao;

@Component
@Order(6)
public class CotacaoTeste implements ApplicationRunner {

@Autowired
	
	private CotacaoService cotacaoService;
	
	@Override
	public void run(ApplicationArguments args){
		
		try {
			
		Usuario usuario = new Usuario();	
		usuario.setId(1);
		
		Cliente cliente = new Cliente();
		cliente.setId(1);
			
			
		Set<Produto> produtos = new HashSet<Produto>();
		
		Informatica i1 = new Informatica();
		i1.setId(1);
		Informatica i2 = new Informatica();
		i2.setId(2);
		Informatica i3 = new Informatica();
		i3.setId(3);
		
		produtos.add(i1);
		produtos.add(i2);
		produtos.add(i3);
		
		
			Cotacao cotacao = new Cotacao(cliente, produtos);
			cotacao.setValidacao ("primeira cotacao");
			cotacao.setWeb(true);
			cotacao.setUsuario(usuario);
			
			
			
			cotacaoService.incluir(cotacao);
			
		} catch (ClienteNuloException | CotacaoSemProdutoException e) {
			e.printStackTrace();
		}
		
	}
}
		
		
		
		/*String dir = "c:/dev/";
		String arq = "Cotacoes.txt";

		try {

			try {
			
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				Set<Produto> produtos = null;
				List<Cotacao>cotacao = new ArrayList<Cotacao>();
				
				String linha = leitura.readLine();
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
					switch (campos[0].toUpperCase()) {
					
					case "C":
						try {
							
							produtos = new HashSet<Produto>();
							
							
							Cliente cl1 = new Cliente(campos[3], campos[4], campos[5]);
							
							Cotacao c1 = new Cotacao(cl1, produtos);
							c1.setValidacao (campos[1]);
							c1.setWeb(Boolean.valueOf(campos[2]));
							
							cotacao.add(c1);
							
						} catch (NomeInvalidoException | ClienteNuloException | CotacaoSemProdutoException e) {
							System.out.println("erro cotacao" + e.getMessage());
						} 	
						break;
						
					case "I":
						Informatica informatica = new Informatica();
						informatica.setCodigo(Integer.valueOf(campos[1]));
						informatica.setTipo(campos[2]);
						informatica.setValor(Float.valueOf(campos[3]));
						informatica.setAno(campos[4]);
						informatica.setPeso(Float.valueOf(campos[5]));
						informatica.setWireless(Boolean.valueOf(campos[6]));
						produtos.add(informatica);
						
						
						break;
						
					case "P":
						Papelaria papelaria = new Papelaria();
						papelaria.setCodigo(Integer.valueOf(campos[1]));
						papelaria.setTipo(campos[2]);
						papelaria.setValor(Float.valueOf(campos[3]));
						papelaria.setMaterial(campos[4]);
						papelaria.setQuantidade(Float.valueOf(campos[5]));
						papelaria.setValidade(Boolean.valueOf(campos[6]));
						produtos.add(papelaria);
						break;
						
					case "V":
						
						break;
						
						
					default:
							break;
					}
					
					
					linha = leitura.readLine();
				}
				
				for(Cotacao c: cotacao) {
					cotacaoService.incluir(c);
					System.out.println(">>>>>>>>>>>>>>>>>" + c.getId() );
					System.out.println(">>>>>>>>>>>>" + c.getCliente().getNome() );
					System.out.println(">>>>>>>" + c.getProdutos().size() );
				
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
*/