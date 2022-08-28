package br.edu.infnet.appcotacao.model.domain.exceptions;


public class CotacaoSemProdutoException extends Exception {

	
	private static final long serialVersionUID = 1L;
	
	public CotacaoSemProdutoException(String mensagem) {
		super(mensagem);
	}


}
