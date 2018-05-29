package br.com.ufc.banco.persistence;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import br.com.ufc.banco.model.Conta;

/**
 * Classe para persistência JDBC com DAO
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 05/02/2007
 */
public class BancoSQL {

	private SessionFactory factory;

	/**
	 * Construtor para uma instância de BancoSQL
	 * 
	 * @version 1.0.0
	 * @since 05/02/2007
	 */
	public BancoSQL() {

		factory = new Configuration().configure().buildSessionFactory();
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

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(conta);
		transaction.commit();
		session.flush();
		session.close();
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

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(conta);
		transaction.commit();
		session.flush();
		session.close();
	}

	public void atualizar(Conta conta) {

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(conta);
		transaction.commit();
		session.flush();
		session.close();
	}

	/**
	 * Método para buscar conta no bando de dados
	 * 
	 * @param conta
	 *            Objeto Conta
	 * @return
	 */
	public Conta procurar(Conta conta) {

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Query query = session
				.getNamedQuery("br.com.ufc.banco.model.query.ContaQuery.contaPorNumero");
		query.setString("numeroConta", conta.getNumero().toString());

		List contas = query.list();

		transaction.commit();
		session.close();

		if (contas.size() == 0) {
			return null;
		} else {
			return (Conta) contas.get(0);
		}
	}
}