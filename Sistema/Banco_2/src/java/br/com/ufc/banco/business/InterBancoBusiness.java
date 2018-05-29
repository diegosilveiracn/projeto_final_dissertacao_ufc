package br.com.ufc.banco.business;

/**
 * Interface de neg�cio de banco
 * 
 * @author Diego Silveira
 * @author Jos� Maria
 * @version 1.0.0
 * @since 20/01/2007
 */
public interface InterBancoBusiness {

	/**
	 * M�todo para cadastrar conta
	 * 
	 * @param numeroConta
	 *            N�mero da conta Exemplo: 1
	 * @param tipoConta
	 *            Tipo da conta Exemplo: C - Conta simples, P - conta poupan�a
	 *            ou B - Conta b�nus
	 * @throws ContaExistenteException
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public void cadastrarConta(Integer numeroConta, String tipoConta)
			throws ContaExistenteException;

	/**
	 * M�todo para excluir conta
	 * 
	 * @param numeroConta
	 *            N�mero da conta Exemplo: 1
	 * @throws ContaInexistenteException
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public void excluirConta(Integer numeroConta)
			throws ContaInexistenteException;

	/**
	 * M�todo para creditar conta
	 * 
	 * @param numeroConta
	 *            N�mero da conta Exemplo: 1
	 * @param valorCredito
	 *            Valor do cr�dito Exemplo: 100.00
	 * @throws ContaInexistenteException
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public void efetuarCredito(Integer numeroConta, Double valorCredito)
			throws ContaInexistenteException;

	/**
	 * M�todo para debitar conta
	 * 
	 * @param numeroConta
	 *            N�mero da conta Exemplo: 1
	 * @param valorDebito
	 *            Valor do d�bito Exemplo: 100.00
	 * @throws ContaInexistenteException
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public void efetuarDebito(Integer numConta, Double valorDebito)
			throws ContaInexistenteException;

	/**
	 * M�todo para creditar b�nus
	 * 
	 * @param numeroConta
	 *            N�mero da conta Exemplo: 1
	 * @throws ContaInexistenteException
	 * @throws ContaBonusException
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public void renderBonus(Integer numeroConta)
			throws ContaInexistenteException, ContaBonusException;

	/**
	 * M�todo para creditar juros
	 * 
	 * @param numeroConta
	 *            N�mero da conta Exemplo: 1
	 * @param valorJuros
	 *            Valor do juros Exemplo: 0.1
	 * @throws ContaInexistenteException
	 * @throws ContaPoupancaException
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public void renderJuros(Integer numeroConta, Double valorJuros)
			throws ContaInexistenteException, ContaPoupancaException;

	/**
	 * M�todo para transferir valores entre contas
	 * 
	 * @param numeroContaOrigem
	 *            N�mero da conta de origem Exemplo: 1
	 * @param numeroContaDestino
	 *            Numero da conta de destino Exemplo: 2
	 * @param valorTransferencia
	 *            Valor Transferido Exemplo: 100.00
	 * @throws ContaInexistenteException
	 * @throws LimiteContaException
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public void efetuarTransferencia(Integer numeroContaOrigem,
			Integer numeroContaDestino, Double valorTransferencia)
			throws ContaInexistenteException, LimiteContaException;

	/**
	 * M�todo para consultar b�nus
	 * 
	 * @param numeroConta
	 *            N�mero da conta Exemplo: 1
	 * @return Saldo do b�nus Exemplo: 200.00
	 * @throws ContaInexistenteException
	 * @throws ContaBonusException
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public Double consultarBonus(Integer numeroConta)
			throws ContaInexistenteException, ContaBonusException;

	/**
	 * M�todo para consultar saldo da conta
	 * 
	 * @param numeroConta
	 *            N�mero da conta Exemplo: 1
	 * @return Saldo da conta Exemplo: 1000.00
	 * @throws ContaInexistenteException
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public Double consultarSaldo(Integer numeroConta)
			throws ContaInexistenteException;
}