package br.com.ufc.banco.model;

/**
 * Classe modelo para conta bônus
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 13/01/2007
 */
public class ContaBonus extends Conta {

	// Atributo que guarda o bônus
	private Double bonus;

	/**
	 * Construtor para uma instância de ContaBonus
	 * 
	 * @version 1.0.0
	 * @since 13/01/2007
	 */
	public ContaBonus() {

	}

	/**
	 * Construtor para uma instância de ContaBonus
	 * 
	 * @param numero
	 *            Número da canta Exemplo: 1
	 * @version 1.0.0
	 * @since 13/01/2007
	 */
	public ContaBonus(Integer numero) {
		super(numero);
		this.bonus = 0d;
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
		this.bonus = this.bonus + (valor * 0.01);
		super.credito(valor);
	}

	/**
	 * Método para render bônus
	 * 
	 * @version 1.0.0
	 * @since 13/01/2007
	 */
	public void rendeBonus() {
		super.credito(this.bonus);
		this.bonus = 0d;
	}

	/**
	 * Método bean getBonus
	 * 
	 * @return Valor do bônus
	 * @version 1.0.0
	 * @since 13/01/2007
	 */
	public double getBonus() {
		return this.bonus;
	}

	/**
	 * Método bean setBonus
	 * 
	 * @param Valor
	 *            do bônus
	 * @version 1.0.0
	 * @since 05/02/2007
	 */
	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
}