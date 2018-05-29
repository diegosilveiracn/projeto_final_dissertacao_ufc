package br.com.ufc.banco.persistence;

/**
 * Classe DAOFactory
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 12/02/2007
 */
public abstract class DAOFactory {

	public static final int ORACLE = 1;

	public abstract ContaDAO getContaDAO();

	public static DAOFactory getDAOFactory(int dataBase) {

		switch (dataBase) {
		case ORACLE:
			return new OracleDAOFactory();
		default:
			return null;
		}
	}
}