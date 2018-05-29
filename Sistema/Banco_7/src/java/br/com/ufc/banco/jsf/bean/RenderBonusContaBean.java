package br.com.ufc.banco.jsf.bean;

import br.com.ufc.banco.business.BancoBusiness;
import br.com.ufc.banco.business.ContaBonusException;
import br.com.ufc.banco.business.ContaInexistenteException;
import br.com.ufc.banco.business.InterBancoBusiness;

/**
 * Classe de controle para render bônus conta
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 11/02/2007
 */
public class RenderBonusContaBean {

	// Numero da conta
	private Integer numeroConta;

	// Mensagem de saída
	private String mensagem;

	/**
	 * Método para render bônus
	 * 
	 * @return String result
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public String renderBonus() {

		try {
			InterBancoBusiness bancoBusiness = new BancoBusiness();
			bancoBusiness.renderBonus(this.numeroConta);

			this.mensagem = "Render Bônus realizado com sucesso!";
		} catch (ContaInexistenteException e) {
			this.mensagem = e.getMessage();
		} catch (ContaBonusException e) {
			this.mensagem = e.getMessage();
		}

		return "result";
	}

	/**
	 * Método bean getNumeroConta
	 * 
	 * @return Número da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public Integer getNumeroConta() {
		return numeroConta;
	}

	/**
	 * Método bean setNumeroConta
	 * 
	 * @param numeroConta
	 *            Número da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	/**
	 * Método bean getMensagem
	 * 
	 * @return Mensagem de saída Exemplo: Conta cadastrada com sucesso!
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public String getMensagem() {
		return mensagem;
	}

	/**
	 * Método bean setMensagem
	 * 
	 * @param mensagem
	 *            Mensagem de saída Exemplo: Conta cadastrada com sucesso!
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
