package br.com.ufc.banco.business;

/**
 * Classe de excessão de limite de conta
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 20/01/2007
 */
public class LimiteContaException extends Exception {

	/**
	 * Construtor para uma instância de LimiteContaException
	 * 
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public LimiteContaException() {
		super("Saldo insuficiente!");
	}
}