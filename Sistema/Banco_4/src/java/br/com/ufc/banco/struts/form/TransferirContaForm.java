package br.com.ufc.banco.struts.form;

import org.apache.struts.action.ActionForm;

/**
 * Classe de formulário para transferir conta
 * 
 * @author Diego Silveira
 * @author José Maria
 * @version 1.0.0
 * @since 25/02/2007
 */
public class TransferirContaForm extends ActionForm {

	// Número da conta de origem
	private String numeroContaOrigem;

	// Número da conta de origem
	private String numeroContaDestino;

	// Valor da transferência
	private String valor;

	// Método a ser executado
	private String method;

	/**
	 * Método getNumeroContaOrigem
	 * 
	 * @return Número da conta de origem Exemplo: 1
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public String getNumeroContaOrigem() {
		return numeroContaOrigem;
	}

	/**
	 * Método setNumeroContaOrigem
	 * 
	 * @param numeroConta
	 *            Número da conta de origem Exemplo: 1
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public void setNumeroContaOrigem(String numeroContaOrigem) {
		this.numeroContaOrigem = numeroContaOrigem;
	}

	/**
	 * Método getNumeroContaDestino
	 * 
	 * @return Número da conta de destino Exemplo: 2
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public String getNumeroContaDestino() {
		return numeroContaDestino;
	}

	/**
	 * Método setNumeroContaDestino
	 * 
	 * @param numeroConta
	 *            Número da conta de destino Exemplo: 2
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public void setNumeroContaDestino(String numeroContaDestino) {
		this.numeroContaDestino = numeroContaDestino;
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
