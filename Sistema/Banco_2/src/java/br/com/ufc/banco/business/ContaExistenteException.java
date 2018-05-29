package br.com.ufc.banco.business;

/**
 * Classe de excess�o de conta existente
 * 
 * @author Diego Diego Silveira / Jos� Maria
 * @version 1.0.0
 * @since 20/01/2007
 */
public class ContaExistenteException extends Exception {

	/**
	 * Construtor para uma inst�ncia de ContaExistenteException
	 * 
	 * @param numeroConta
	 *            N�mero da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public ContaExistenteException(String numeroConta) {
		super("Conta \"" + numeroConta + "\" j� cadastrada!");
	}
}