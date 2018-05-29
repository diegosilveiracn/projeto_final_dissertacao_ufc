package br.com.ufc.banco.jsf.bean;

import br.com.ufc.banco.business.BancoBusiness;
import br.com.ufc.banco.business.ContaInexistenteException;
import br.com.ufc.banco.business.ContaPoupancaException;
import br.com.ufc.banco.business.InterBancoBusiness;

/**
 * Classe de controle para render b�nus conta
 * 
 * @author Diego Silveira / Jos� Maria
 * @version 1.0.0
 * @since 11/02/2007
 */
public class RenderJurosContaBean {

	// Numero da conta
	private Integer numeroConta;

	// Valor do juros
	private Double valor;

	// Mensagem de sa�da
	private String mensagem;

	/**
	 * M�todo para render juros
	 * 
	 * @return String result
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public String renderJuros() {

		try {
			InterBancoBusiness bancoBusiness = new BancoBusiness();
			bancoBusiness.renderJuros(this.numeroConta, this.valor);

			this.mensagem = "Render Juros realizado com sucesso!";
		} catch (ContaInexistenteException e) {
			this.mensagem = e.getMessage();
		} catch (ContaPoupancaException e) {
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
	 * M�todo bean getValor
	 * 
	 * @return Valor a ser creditado ou debitado Exemplo: 100.00
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public Double getValor() {
		return valor;
	}

	/**
	 * M�todo bean getValor
	 * 
	 * @param valor
	 *            Valor a ser creditado ou debitado Exemplo: 100.00
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public void setValor(Double valor) {
		this.valor = valor;
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
