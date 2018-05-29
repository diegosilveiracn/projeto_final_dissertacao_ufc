package br.com.ufc.banco.persistence;

/**
 * Classe OracleDAOFactory
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 12/02/2007
 */
public class OracleDAOFactory extends DAOFactory {

	public ContaDAO getContaDAO() {
		return new OracleContaDAO();
	}
}

