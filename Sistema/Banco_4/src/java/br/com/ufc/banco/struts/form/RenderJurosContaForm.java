package br.com.ufc.banco.struts.form;

import org.apache.struts.action.ActionForm;

/**
 * Classe de formul�rio para render juros conta
 * 
 * @author Diego Silveira
 * @author Jos� Maria
 * @version 1.0.0
 * @since 25/02/2007
 */
public class RenderJurosContaForm extends ActionForm {

	// N�mero da conta
	private String numeroConta;

	// Valor juros
	private String valor;

	// M�todo a ser executado
	private String method;

	/**
	 * M�todo getNumeroConta
	 * 
	 * @return N�mero da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public String getNumeroConta() {
		return numeroConta;
	}

	/**
	 * M�todo setNumeroConta
	 * 
	 * @param numeroConta
	 *            N�mero da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	/**
	 * M�togo bean getValor
	 * 
	 * @return Retorna o valor do juros Exemplo: 0.01
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * M�togo bean setValor
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
	 * M�todo bean getMethod
	 * 
	 * @return M�todo de execu��o Exemplo: cadastrar
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * M�todo bean setMethod
	 * 
	 * @param method
	 *            M�todo de execu��o Exemplo: cadastrar
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public void setMethod(String method) {
		this.method = method;
	}
}