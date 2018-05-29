package br.com.ufc.banco.business;

/**
 * Classe de exece��o para conta b�nus
 * 
 * @author Diego Silveiral / Jos� Maria
 * @version 1.0.0
 * @since 20/01/2007
 */
public class ContaBonusException extends Exception {

	/**
	 * Construtor para uma inst�ncia de ContaBonusException
	 * 
	 * @param numeroConta
	 *            N�mero da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public ContaBonusException(String numeroConta) {
		super("Conta \"" + numeroConta + "\" n�o � tipo b�nus!");
	}
}