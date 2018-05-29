package br.com.ufc.banco.business;

/**
 * Classe de excess�o de conta poupan�a
 * 
 * @author Diego Silveira / Jos� Maria
 * @version 1.0.0
 * @since 20/01/2007
 */
public class ContaPoupancaException extends Exception {

	/**
	 * Construtor para uma inst�ncia de ContaPoupancaExcpetion
	 * 
	 * @param numeroConta
	 *            N�mero da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public ContaPoupancaException(String numeroConta) {
		super("Conta \"" + numeroConta + "\" n�o � tipo poupan�a!");
	}
}