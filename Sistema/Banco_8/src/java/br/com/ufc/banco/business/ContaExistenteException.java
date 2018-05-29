package br.com.ufc.banco.business;

/**
 * Classe de excessão de conta existente
 * 
 * @author Diego Diego Silveira / Josá Maria
 * @version 1.0.0
 * @since 20/01/2007
 */
public class ContaExistenteException extends Exception {

	/**
	 * Construtor para uma instância de ContaExistenteException
	 * 
	 * @param numeroConta
	 *            Número da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public ContaExistenteException(String numeroConta) {
		super("Conta \"" + numeroConta + "\" já cadastrada!");
	}
}