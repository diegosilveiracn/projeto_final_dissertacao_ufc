package br.com.ufc.banco.business;

/**
 * Classe de excessão de conta inexistente
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 20/01/2007
 */
public class ContaInexistenteException extends Exception {

	/**
	 * Construtor para uma instância de ContaInexixtenteException
	 * 
	 * @param numeroConta
	 *            Número da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public ContaInexistenteException(String numeroConta) {
		super("Conta \"" + numeroConta + "\" Inexistente!");
	}
}