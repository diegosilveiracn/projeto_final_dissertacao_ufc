package br.com.ufc.banco.model;

/**
 * Classe modelo para conta poupança
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 13/01/2007
 */
public class ContaPoupanca extends Conta {

	/**
	 * Construtor para uma instância de ContaPoupanca
	 * 
	 * @version 1.0.0
	 * @since 13/01/2007
	 */

	public ContaPoupanca() {

	}

	/**
	 * Construtor para uma instância de ContaPoupanca
	 * 
	 * @param numero
	 *            Número da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 13/01/2007
	 */
	public ContaPoupanca(Integer numero) {
		super(numero);
	}

	/**
	 * Método para render juros
	 * 
	 * @param taxa
	 *            Taxa de juros Exemplo: 2.25
	 * @version 1.0.0
	 * @since 13/01/2007
	 */
	public void rendeJuros(Double taxa) {
		super.credito(super.getSaldo() * taxa);
	}
}