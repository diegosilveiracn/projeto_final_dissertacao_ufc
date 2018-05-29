package br.com.ufc.banco.struts.form;

import org.apache.struts.action.ActionForm;

/**
 * Classe de formulário para render juros conta
 * 
 * @author Diego Silveira
 * @author José Maria
 * @version 1.0.0
 * @since 25/02/2007
 */
public class RenderJurosContaForm extends ActionForm {

	// Número da conta
	private String numeroConta;

	// Valor juros
	private String valor;

	// Método a ser executado
	private String method;

	/**
	 * Método getNumeroConta
	 * 
	 * @return Número da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public String getNumeroConta() {
		return numeroConta;
	}

	/**
	 * Método setNumeroConta
	 * 
	 * @param numeroConta
	 *            Número da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	/**
	 * Métogo bean getValor
	 * 
	 * @return Retorna o valor do juros Exemplo: 0.01
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * Métogo bean setValor
	 * 
	 * @param valor
	 *            Retorna o valor do juros Exemplo: 0.01
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}

	/**
	 * Método bean getMethod
	 * 
	 * @return Método de execução Exemplo: cadastrar
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * Método bean setMethod
	 * 
	 * @param method
	 *            Método de execução Exemplo: cadastrar
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public void setMethod(String method) {
		this.method = method;
	}
}