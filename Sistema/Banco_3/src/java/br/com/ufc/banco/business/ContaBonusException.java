package br.com.ufc.banco.business;

/**
 * Classe de execeção para conta bônus
 * 
 * @author Diego Silveiral / José Maria
 * @version 1.0.0
 * @since 20/01/2007
 */
public class ContaBonusException extends Exception {

	/**
	 * Construtor para uma instância de ContaBonusException
	 * 
	 * @param numeroConta
	 *            Número da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public ContaBonusException(String numeroConta) {
		super("Conta \"" + numeroConta + "\" não é tipo bônus!");
	}
}