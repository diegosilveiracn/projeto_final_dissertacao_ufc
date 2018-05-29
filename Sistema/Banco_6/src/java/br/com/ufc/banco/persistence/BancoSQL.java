package br.com.ufc.banco.persistence;

import br.com.ufc.banco.model.Conta;

/**
 * Classe para persistência JDBC com DAO
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 05/02/2007
 */
public class BancoSQL {

	DAOFactory daoFactory;

	ContaDAO contaDao;

	/**
	 * Construtor para uma instância de BancoSQL
	 * 
	 * @version 1.0.0
	 * @since 05/02/2007
	 */
	public BancoSQL() {

		daoFactory = DAOFactory.getDAOFactory(DAOFactory.ORACLE);
		contaDao = daoFactory.getContaDAO();
	}

	/**
	 * Método para cadastrar conta no banco de dados
	 * 
	 * @param conta
	 *            Objeto conta
	 * @version 1.0.0
	 * @since 05/02/2007
	 */
	public void inserir(Conta conta) {

		contaDao.inserir(conta);
	}

	/**
	 * Método para excluir conta no banco de dados
	 * 
	 * @param conta
	 *            Objeto Conta
	 * @version 1.0.0
	 * @since 05/02/2007
	 */
	public void excluir(Conta conta) {

		contaDao.excluir(conta);
	}

	public void atualizar(Conta conta) {

		contaDao.atualizar(conta);
	}

	/**
	 * Método para buscar conta no bando de dados
	 * 
	 * @param conta
	 *            Objeto Conta
	 * @return
	 */
	public Conta procurar(Conta conta) {

		return contaDao.procurar(conta);
	}
}