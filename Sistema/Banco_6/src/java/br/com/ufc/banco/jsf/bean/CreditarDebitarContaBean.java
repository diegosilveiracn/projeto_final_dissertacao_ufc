package br.com.ufc.banco.jsf.bean;

import br.com.ufc.banco.business.BancoBusiness;
import br.com.ufc.banco.business.ContaInexistenteException;
import br.com.ufc.banco.business.InterBancoBusiness;

/**
 * Classe de controle para creditar debitar conta
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 11/02/2007
 */
public class CreditarDebitarContaBean {

	// Numero da conta
	private Integer numeroConta;

	// Valor do crédio ou débito
	private Double valor;

	// Mensagem de saída
	private String mensagem;

	/**
	 * Método para creditar conta
	 * 
	 * @return String resut
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public String creditar() {

		try {
			InterBancoBusiness bancoBusiness = new BancoBusiness();
			bancoBusiness.efetuarCredito(this.numeroConta, this.valor);

			this.mensagem = "Crédito realizado com sucesso!!";
		} catch (ContaInexistenteException e) {
			this.mensagem = e.getMessage();
		}

		return "result";
	}

	/**
	 * Método para débito conta
	 * 
	 * @return String resut
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public String debitar() {

		try {
			InterBancoBusiness bancoBusiness = new BancoBusiness();
			bancoBusiness.efetuarDebito(this.numeroConta, this.valor);

			this.mensagem = "Débito realizado com sucesso!";
		} catch (ContaInexistenteException e) {
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
	 * Método bean getValor
	 * 
	 * @return Valor a ser creditado ou debitado Exemplo: 100.00
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public Double getValor() {
		return valor;
	}

	/**
	 * Método bean getValor
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