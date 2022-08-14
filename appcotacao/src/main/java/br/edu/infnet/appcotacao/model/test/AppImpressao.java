package br.edu.infnet.appcotacao.model.test;

import br.edu.infnet.appcotacao.interfaces.IPrinter;

public class AppImpressao {
	
	public static void relatorio(String mensagem, IPrinter printer){
		System.out.println(mensagem);
		
		printer.impressao();
		
		
	}

}
