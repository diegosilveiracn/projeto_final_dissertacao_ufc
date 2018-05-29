package br.com.ufc.banco.struts.form;

import org.apache.struts.action.ActionForm;

/**
 * Classe de formul�rio para transferir conta
 * 
 * @author Diego Silveira
 * @author Jos� Maria
 * @version 1.0.0
 * @since 25/02/2007
 */
public class TransferirContaForm extends ActionForm {

	// N�mero da conta de origem
	private String numeroContaOrigem;

	// N�mero da conta de origem
	private String numeroContaDestino;

	// Valor da transfer�ncia
	private String valor;

	// M�todo a ser executado
	private String method;

	/**
	 * M�todo getNumeroContaOrigem
	 * 
	 * @return N�mero da conta de origem Exemplo: 1
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public String getNumeroContaOrigem() {
		return numeroContaOrigem;
	}

	/**
	 * M�todo setNumeroContaOrigem
	 * 
	 * @param numeroConta
	 *            N�mero da conta de origem Exemplo: 1
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public void setNumeroContaOrigem(String numeroContaOrigem) {
		this.numeroContaOrigem = numeroContaOrigem;
	}

	/**
	 * M�todo getNumeroContaDestino
	 * 
	 * @return N�mero da conta de destino Exemplo: 2
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public String getNumeroContaDestino() {
		return numeroContaDestino;
	}

	/**
	 * M�todo setNumeroContaDestino
	 * 
	 * @param numeroConta
	 *            N�mero da conta de destino Exemplo: 2
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public void setNumeroContaDestino(String numeroContaDestino) {
		this.numeroContaDestino = numeroContaDestino;
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
