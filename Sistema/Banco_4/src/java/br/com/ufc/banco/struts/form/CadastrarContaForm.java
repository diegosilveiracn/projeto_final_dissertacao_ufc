package br.com.ufc.banco.struts.form;

import org.apache.struts.action.ActionForm;

/**
 * Classe de formulário para Cadastrar conta
 * 
 * @author Diego Silveira
 * @author José Maria
 * @version 1.0.0
 * @since 25/02/2007
 */
public class CadastrarContaForm extends ActionForm {

	// Numero da conta
	private String numeroConta;

	// Tipo da conta
	private String tipoConta;

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
	 * Método bean getTipoConta
	 * 
	 * @return Tipo da conta Exemplo: C - Conta simples, P - conta poupança ou B -
	 *         Conta bônus
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public String getTipoConta() {
		return tipoConta;
	}

	/**
	 * Método bean setTipoConta
	 * 
	 * @param tipoConta
	 *            Tipo da conta Exemplo: C - Conta simples, P - conta poupança
	 *            ou B - Conta bônus
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
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