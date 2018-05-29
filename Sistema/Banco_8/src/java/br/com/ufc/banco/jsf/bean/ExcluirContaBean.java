package br.com.ufc.banco.jsf.bean;

import br.com.ufc.banco.business.BancoBusiness;
import br.com.ufc.banco.business.ContaInexistenteException;
import br.com.ufc.banco.business.InterBancoBusiness;

/**
 * Classe de controle para excluir conta
 * 
 * @author Diego Silveira / Jos� Maria
 * @version 1.0.0
 * @since 11/02/2007
 */
public class ExcluirContaBean {

	// Numero da conta
	private Integer numeroConta;

	// Mensagem de sa�da
	private String mensagem;

	/**
	 * M�todo para excluir conta
	 * 
	 * @return String result
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public String excluir() {

		try {
			InterBancoBusiness bancoBusiness = new BancoBusiness();
			bancoBusiness.excluirConta(this.numeroConta);

			this.mensagem = "Conta exclu�da com sucesso!";
		} catch (ContaInexistenteException e) {
			this.mensagem = e.getMessage();
		}

		return "result";
	}

	/**
	 * M�todo bean getNumeroConta
	 * 
	 * @return N�mero da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public Integer getNumeroConta() {
		return numeroConta;
	}

	/**
	 * M�todo bean setNumeroConta
	 * 
	 * @param numeroConta
	 *            N�mero da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	/**
	 * M�todo bean getMensagem
	 * 
	 * @return Mensagem de sa�da Exemplo: Conta cadastrada com sucesso!
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public String getMensagem() {
		return mensagem;
	}

	/**
	 * M�todo bean setMensagem
	 * 
	 * @param mensagem
	 *            Mensagem de sa�da Exemplo: Conta cadastrada com sucesso!
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
