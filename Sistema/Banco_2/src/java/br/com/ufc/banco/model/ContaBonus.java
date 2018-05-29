package br.com.ufc.banco.model;

/**
 * Classe modelo para conta b�nus
 * 
 * @author Diego Silveira / Jos� Maria
 * @version 1.0.0
 * @since 13/01/2007
 */
public class ContaBonus extends Conta {

	// Atributo que guarda o b�nus
	private Double bonus;

	/**
	 * Construtor para uma inst�ncia de ContaBonus
	 * 
	 * @version 1.0.0
	 * @since 13/01/2007
	 */
	public ContaBonus() {

	}

	/**
	 * Construtor para uma inst�ncia de ContaBonus
	 * 
	 * @param numero
	 *            N�mero da canta Exemplo: 1
	 * @version 1.0.0
	 * @since 13/01/2007
	 */
	public ContaBonus(Integer numero) {
		super(numero);
		this.bonus = 0d;
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
		this.bonus = this.bonus + (valor * 0.01);
		super.credito(valor);
	}

	/**
	 * M�todo para render b�nus
	 * 
	 * @version 1.0.0
	 * @since 13/01/2007
	 */
	public void rendeBonus() {
		super.credito(this.bonus);
		this.bonus = 0d;
	}

	/**
	 * M�todo bean getBonus
	 * 
	 * @return Valor do b�nus
	 * @version 1.0.0
	 * @since 13/01/2007
	 */
	public double getBonus() {
		return this.bonus;
	}

	/**
	 * M�todo bean setBonus
	 * 
	 * @param Valor
	 *            do b�nus
	 * @version 1.0.0
	 * @since 05/02/2007
	 */
	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
}