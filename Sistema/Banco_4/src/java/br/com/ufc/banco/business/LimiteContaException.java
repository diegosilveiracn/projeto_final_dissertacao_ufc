package br.com.ufc.banco.business;

/**
 * Classe de excess�o de limite de conta
 * 
 * @author Diego Silveira / Jos� Maria
 * @version 1.0.0
 * @since 20/01/2007
 */
public class LimiteContaException extends Exception {

	/**
	 * Construtor para uma inst�ncia de LimiteContaException
	 * 
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public LimiteContaException() {
		super("Saldo insuficiente!");
	}
}