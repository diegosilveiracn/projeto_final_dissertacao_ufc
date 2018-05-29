package br.com.ufc.banco.model;

/**
 * Classe modelo para conta
 * 
 * @author Diego Silveira
 * @author Jos� Maria
 * @version 1.0.0
 * @since 13/01/2007
 */
public class Conta {

	// Atriburo que guarda o n�mero da conta
	private Integer numero;

	// Atriburo que guarda o saldo da conta
	private Double saldo;

	/**
	 * Construtor para uma inst�ncia de Conta
	 * 
	 * @version 1.0.0
	 * @since 22/02/2007
	 */
	public Conta() {

	}

	/**
	 * Construtor para uma inst�ncia de Conta
	 * 
	 * @param cont
	 *            N�mero da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 13/01/2007
	 */
	public Conta(Integer numero) {
		this.numero = numero;
		saldo = 0d;
	}

	/**
	 * M�todo para creditar o saldo
	 * 
	 * @param valor
	 *            Valor a ser creditado Exemplo: 100.00
	 * @version 1.0.0
	 * @since 13/01/2007
	 */
	public void credito(Double valor) {
		saldo = saldo + valor;
	}

	/**
	 * M�todo para debitar o saldo
	 * 
	 * @param valor
	 *            Valor a ser debitado Exemplo: 100.00
	 * @version 1.0.0
	 * @since 13/01/2007
	 */
	public void debito(Double valor) {
		saldo = saldo - valor;
	}

	/**
	 * M�todo bean getNumero
	 * 
	 * @return O n�mero da conta
	 * @version 1.0.0
	 * @since 13/01/2007
	 */
	public Integer getNumero() {
		return this.numero;
	}

	/**
	 * M�todo bean setNumero
	 * 
	 * @param numero
	 *            O n�mero da conta
	 * @version 1.0.0
	 * @since 13/01/2007
	 */

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * M�todo bean getSaldo
	 * 
	 * @return Saldo da conta Exemplo: 1000.00
	 * @version 1.0.0
	 * @since 13/01/2007
	 */
	public double getSaldo() {
		return this.saldo;
	}

	/**
	 * M�todo bean setSaldo
	 * 
	 * @param saldo
	 *            Saldo da conta Exemplo: 1000.00
	 * @version 1.0.0
	 * @since 05/02/2007
	 */
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}