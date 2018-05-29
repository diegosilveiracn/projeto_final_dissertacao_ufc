package br.com.ufc.banco.struts.form;

import org.apache.struts.action.ActionForm;

/**
 * Classe de formul�rio para Cadastrar conta
 * 
 * @author Diego Silveira
 * @author Jos� Maria
 * @version 1.0.0
 * @since 25/02/2007
 */
public class CadastrarContaForm extends ActionForm {

	// Numero da conta
	private String numeroConta;

	// Tipo da conta
	private String tipoConta;

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
	 * M�todo bean getTipoConta
	 * 
	 * @return Tipo da conta Exemplo: C - Conta simples, P - conta poupan�a ou B -
	 *         Conta b�nus
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public String getTipoConta() {
		return tipoConta;
	}

	/**
	 * M�todo bean setTipoConta
	 * 
	 * @param tipoConta
	 *            Tipo da conta Exemplo: C - Conta simples, P - conta poupan�a
	 *            ou B - Conta b�nus
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
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