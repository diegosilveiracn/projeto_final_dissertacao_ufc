package br.com.ufc.banco.model;

/**
 * Classe modelo para conta
 * 
 * @author Diego Silveira
 * @author José Maria
 * @version 1.0.0
 * @since 13/01/2007
 */
public class Conta {

	// Atriburo que guarda o número da conta
	private Integer numero;

	// Atriburo que guarda o saldo da conta
	private Double saldo;

	/**
	 * Construtor para uma instância de Conta
	 * 
	 * @version 1.0.0
	 * @since 22/02/2007
	 */
	public Conta() {

	}

	/**
	 * Construtor para uma instância de Conta
	 * 
	 * @param cont
	 *            Número da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 13/01/2007
	 */
	public Conta(Integer numero) {
		this.numero = numero;
		saldo = 0d;
	}

	/**
	 * Método para creditar o saldo
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
	 * Método para debitar o saldo
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
	 * Método bean getNumero
	 * 
	 * @return O número da conta
	 * @version 1.0.0
	 * @since 13/01/2007
	 */
	public Integer getNumero() {
		return this.numero;
	}

	/**
	 * Método bean setNumero
	 * 
	 * @param numero
	 *            O número da conta
	 * @version 1.0.0
	 * @since 13/01/2007
	 */

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * Método bean getSaldo
	 * 
	 * @return Saldo da conta Exemplo: 1000.00
	 * @version 1.0.0
	 * @since 13/01/2007
	 */
	public double getSaldo() {
		return this.saldo;
	}

	/**
	 * Método bean setSaldo
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