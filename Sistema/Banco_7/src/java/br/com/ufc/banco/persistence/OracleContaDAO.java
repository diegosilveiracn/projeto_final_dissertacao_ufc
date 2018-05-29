package br.com.ufc.banco.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.ufc.banco.model.Conta;
import br.com.ufc.banco.model.ContaBonus;
import br.com.ufc.banco.model.ContaPoupanca;
import br.com.ufc.banco.util.UtilProperties;

/**
 * Classe OracleContaDAO
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 12/02/2007
 */
public class OracleContaDAO implements ContaDAO {

	private String url;

	private Connection con;

	private Statement stmt;

	private ResultSet rs;

	/**
	 * Construtor para uma instância de OracleContaDAO
	 * 
	 * @version 1.0.0
	 * @since 12/02/2007
	 */
	public OracleContaDAO() {
		try {
			Class.forName(UtilProperties.getAcessoMapCode("DRIVER"));
			url = UtilProperties.getAcessoMapCode("URL");
			con = DriverManager.getConnection(url, UtilProperties
					.getAcessoMapCode("USERNAME"), UtilProperties
					.getAcessoMapCode("PASSWORD"));
			stmt = con.createStatement();
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void inserir(Conta conta) {

		// Tipo da conta: C - Conta simples, P - Conta poupança ou B - Conta
		// bônus
		String tipoConta;

		if (conta instanceof ContaBonus) {
			tipoConta = "B";
		} else if (conta instanceof ContaPoupanca) {
			tipoConta = "P";
		} else {
			tipoConta = "C";
		}

		String clausula;
		if ("B".equals(tipoConta)) {
			clausula = "insert into conta (numero, tipo,saldo, bonus) values("
					+ conta.getNumero() + ",\'" + tipoConta + "\',0,0)";
		} else {
			clausula = "insert into conta (numero, tipo,saldo) values("
					+ conta.getNumero() + ",\'" + tipoConta + "\',0)";
		}

		try {
			stmt.executeUpdate(clausula);
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
	}

	public void excluir(Conta conta) {

		String clausula = "delete from conta where numero ="
				+ conta.getNumero();

		try {
			stmt.executeUpdate(clausula);
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
	}

	public void atualizar(Conta conta) {

		String clausula;

		if (conta instanceof ContaBonus) {
			clausula = "update conta set saldo=" + conta.getSaldo()
					+ ", bonus= " + ((ContaBonus) conta).getBonus()
					+ "where numero = " + conta.getNumero();
		} else {
			clausula = "update conta set saldo=" + conta.getSaldo()
					+ "where numero = " + conta.getNumero();
		}

		try {
			stmt.executeUpdate(clausula);
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
	}

	public Conta procurar(Conta conta) {

		Conta c = null;

		String clausula = "select * from conta where numero = "
				+ conta.getNumero();
		try {
			rs = stmt.executeQuery(clausula);

			if (rs.next()) {

				switch (rs.getString("tipo").charAt(0)) {

				case 'C':
					c = new Conta(new Integer(rs.getString("numero")));
					c.setSaldo(new Double(rs.getString("saldo")));
					break;

				case 'P':
					c = new ContaPoupanca(new Integer(rs.getString("numero")));
					c.setSaldo(new Double(rs.getString("saldo")));
					break;

				case 'B':
					c = new ContaBonus(new Integer(rs.getString("numero")));
					c.setSaldo(new Double(rs.getString("saldo")));
					((ContaBonus) c)
							.setBonus(new Double(rs.getString("bonus")));

					break;

				}
			}
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}

		return c;
	}
}
