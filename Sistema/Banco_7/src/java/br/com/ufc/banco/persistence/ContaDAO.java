package br.com.ufc.banco.persistence;

import br.com.ufc.banco.model.Conta;

/**
 * Interface ContaDAO
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 12/02/2007
 */
public interface ContaDAO {

	/**
	 * Método para cadastrar conta no banco de dados
	 * 
	 * @param conta
	 *            Objeto conta
	 * @version 1.0.0
	 * @since 05/02/2007
	 */
	public void inserir(Conta conta);

	/**
	 * Método para excluir conta no banco de dados
	 * 
	 * @param conta
	 *            Objeto Conta
	 * @version 1.0.0
	 * @since 05/02/2007
	 */
	public void excluir(Conta conta);

	/**
	 * Método para atualizar conta no banco de dados
	 * 
	 * @param conta
	 *            Objeto Conta
	 * @version 1.0.0
	 * @since 05/02/2007
	 */
	public void atualizar(Conta conta);

	/**
	 * Método para buscar conta no bando de dados
	 * 
	 * @param conta
	 *            Objeto Conta
	 * @return Objeto Conta
	 * @version 1.0.0
	 * @since 12/02/2007
	 */
	public Conta procurar(Conta conta);
}