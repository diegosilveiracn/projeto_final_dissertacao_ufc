package br.com.ufc.banco.business;

import br.com.ufc.banco.model.Conta;
import br.com.ufc.banco.model.ContaBonus;
import br.com.ufc.banco.model.ContaPoupanca;
import br.com.ufc.banco.persistence.BancoSQL;

/**
 * Classe de negócios de banco
 * 
 * @author Diego Silveira
 * @author José Maria
 * @version 1.0.0
 * @since 20/01/2007
 */
public class BancoBusiness implements InterBancoBusiness {

	private BancoSQL bancoSQL;

	public BancoBusiness() {
		bancoSQL = new BancoSQL();
	}

	public void cadastrarConta(Integer numeroConta, String tipoConta)
			throws ContaExistenteException {

		Conta conta = null;

		if (this.existeConta(numeroConta)) {
			throw new ContaExistenteException(numeroConta.toString());
		}

		if ("C".equals(tipoConta)) {
			conta = new Conta(numeroConta);
		}

		if ("P".equals(tipoConta)) {
			conta = new ContaPoupanca(numeroConta);
		}

		if ("B".equals(tipoConta)) {
			conta = new ContaBonus(numeroConta);
		}

		bancoSQL.inserir(conta);
	}

	public void excluirConta(Integer numeroConta)
			throws ContaInexistenteException {

		Conta conta = procurarConta(numeroConta);
		bancoSQL.excluir(conta);
	}

	public void efetuarCredito(Integer numeroConta, Double valorCredito)
			throws ContaInexistenteException {

		Conta conta = procurarConta(numeroConta);
		conta.credito(valorCredito);
		bancoSQL.atualizar(conta);
	}

	public void efetuarDebito(Integer numeroConta, Double valorDebito)
			throws ContaInexistenteException {

		Conta conta = procurarConta(numeroConta);
		conta.debito(valorDebito);
		bancoSQL.atualizar(conta);
	}

	public void renderBonus(Integer numeroConta)
			throws ContaInexistenteException, ContaBonusException {

		Conta conta = procurarConta(numeroConta);

		if (conta instanceof ContaBonus) {
			((ContaBonus) conta).rendeBonus();
			bancoSQL.atualizar(conta);
		} else {
			throw new ContaBonusException(numeroConta.toString());
		}

	}

	public void renderJuros(Integer numeroConta, Double valorJuros)
			throws ContaInexistenteException, ContaPoupancaException {

		Conta conta = this.procurarConta(numeroConta);

		if (conta instanceof ContaPoupanca) {
			((ContaPoupanca) conta).rendeJuros(valorJuros);
			bancoSQL.atualizar(conta);
		} else {
			throw new ContaPoupancaException(numeroConta.toString());
		}
	}

	public void efetuarTransferencia(Integer numeroContaOrigem,
			Integer numeroContaDestino, Double valorTransferencia)
			throws ContaInexistenteException, LimiteContaException {

		Conta contaOrigem = procurarConta(numeroContaOrigem);
		Conta contaDestino = procurarConta(numeroContaDestino);

		if (contaOrigem.getSaldo() >= valorTransferencia) {
			contaOrigem.debito(valorTransferencia);
			contaDestino.credito(valorTransferencia);

			bancoSQL.atualizar(contaOrigem);
			bancoSQL.atualizar(contaDestino);
		} else {
			throw new LimiteContaException();
		}

	}

	public Double consultarBonus(Integer numeroConta)
			throws ContaInexistenteException, ContaBonusException {

		Conta conta = this.procurarConta(numeroConta);

		if (conta instanceof ContaBonus) {
			return ((ContaBonus) conta).getBonus();
		} else {
			throw new ContaBonusException(numeroConta.toString());
		}
	}

	public Double consultarSaldo(Integer numeroConta)
			throws ContaInexistenteException {

		Conta conta;
		conta = this.procurarConta(numeroConta);
		return conta.getSaldo();

	}

	/**
	 * Método para procurar conta
	 * 
	 * @param numeroConta
	 *            Número da conta Exemplo: 1
	 * @return Objeto Conta
	 * @throws ContaInexistenteException
	 * @version 1.0.0
	 * @since 05/02/2007
	 */
	private Conta procurarConta(Integer numeroConta)
			throws ContaInexistenteException {

		Conta conta = (Conta) bancoSQL.procurar(new Conta(numeroConta));

		if (null == conta) {
			throw new ContaInexistenteException(numeroConta.toString());
		}
		return conta;
	}

	/**
	 * Método para verificar a existência da conta
	 * 
	 * @param numeroConta
	 *            Número da conta Exemplo: 1
	 * @return Objeto Boolean
	 * @version 1.0.0
	 * @since 05/02/2007
	 */
	private Boolean existeConta(Integer numeroConta) {

		Conta c = bancoSQL.procurar(new Conta(numeroConta));
		if (c == null) {
			return new Boolean(Boolean.FALSE);
		} else {
			return new Boolean(Boolean.TRUE);
		}
	}
}