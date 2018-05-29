package br.com.ufc.banco.business;

/**
 * Classe de excess�o de conta inexistente
 * 
 * @author Diego Silveira / Jos� Maria
 * @version 1.0.0
 * @since 20/01/2007
 */
public class ContaInexistenteException extends Exception {

	/**
	 * Construtor para uma inst�ncia de ContaInexixtenteException
	 * 
	 * @param numeroConta
	 *            N�mero da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public ContaInexistenteException(String numeroConta) {
		super("Conta \"" + numeroConta + "\" Inexistente!");
	}
}