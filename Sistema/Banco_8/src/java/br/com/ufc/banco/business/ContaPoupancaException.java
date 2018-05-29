package br.com.ufc.banco.business;

/**
 * Classe de excessão de conta poupança
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 20/01/2007
 */
public class ContaPoupancaException extends Exception {

	/**
	 * Construtor para uma instância de ContaPoupancaExcpetion
	 * 
	 * @param numeroConta
	 *            Número da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public ContaPoupancaException(String numeroConta) {
		super("Conta \"" + numeroConta + "\" não é tipo poupança!");
	}
}