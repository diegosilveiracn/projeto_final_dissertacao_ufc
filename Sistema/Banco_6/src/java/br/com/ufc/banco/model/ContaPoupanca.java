package br.com.ufc.banco.model;

/**
 * Classe modelo para conta poupan�a
 * 
 * @author Diego Silveira / Jos� Maria
 * @version 1.0.0
 * @since 13/01/2007
 */
public class ContaPoupanca extends Conta {

	/**
	 * Construtor para uma inst�ncia de ContaPoupanca
	 * 
	 * @version 1.0.0
	 * @since 13/01/2007
	 */

	public ContaPoupanca() {

	}

	/**
	 * Construtor para uma inst�ncia de ContaPoupanca
	 * 
	 * @param numero
	 *            N�mero da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 13/01/2007
	 */
	public ContaPoupanca(Integer numero) {
		super(numero);
	}

	/**
	 * M�todo para render juros
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