package br.com.ufc.banco.business;

/**
 * Interface de negócio de banco
 * 
 * @author Diego Silveira
 * @author José Maria
 * @version 1.0.0
 * @since 20/01/2007
 */
public interface InterBancoBusiness {

	/**
	 * Método para cadastrar conta
	 * 
	 * @param numeroConta
	 *            Número da conta Exemplo: 1
	 * @param tipoConta
	 *            Tipo da conta Exemplo: C - Conta simples, P - conta poupança
	 *            ou B - Conta bônus
	 * @throws ContaExistenteException
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public void cadastrarConta(Integer numeroConta, String tipoConta)
			throws ContaExistenteException;

	/**
	 * Método para excluir conta
	 * 
	 * @param numeroConta
	 *            Número da conta Exemplo: 1
	 * @throws ContaInexistenteException
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public void excluirConta(Integer numeroConta)
			throws ContaInexistenteException;

	/**
	 * Método para creditar conta
	 * 
	 * @param numeroConta
	 *            Número da conta Exemplo: 1
	 * @param valorCredito
	 *            Valor do crédito Exemplo: 100.00
	 * @throws ContaInexistenteException
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public void efetuarCredito(Integer numeroConta, Double valorCredito)
			throws ContaInexistenteException;

	/**
	 * Método para debitar conta
	 * 
	 * @param numeroConta
	 *            Número da conta Exemplo: 1
	 * @param valorDebito
	 *            Valor do débito Exemplo: 100.00
	 * @throws ContaInexistenteException
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public void efetuarDebito(Integer numConta, Double valorDebito)
			throws ContaInexistenteException;

	/**
	 * Método para creditar bônus
	 * 
	 * @param numeroConta
	 *            Número da conta Exemplo: 1
	 * @throws ContaInexistenteException
	 * @throws ContaBonusException
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public void renderBonus(Integer numeroConta)
			throws ContaInexistenteException, ContaBonusException;

	/**
	 * Método para creditar juros
	 * 
	 * @param numeroConta
	 *            Número da conta Exemplo: 1
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
	 * Método para transferir valores entre contas
	 * 
	 * @param numeroContaOrigem
	 *            Número da conta de origem Exemplo: 1
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
	 * Método para consultar bônus
	 * 
	 * @param numeroConta
	 *            Número da conta Exemplo: 1
	 * @return Saldo do bônus Exemplo: 200.00
	 * @throws ContaInexistenteException
	 * @throws ContaBonusException
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public Double consultarBonus(Integer numeroConta)
			throws ContaInexistenteException, ContaBonusException;

	/**
	 * Método para consultar saldo da conta
	 * 
	 * @param numeroConta
	 *            Número da conta Exemplo: 1
	 * @return Saldo da conta Exemplo: 1000.00
	 * @throws ContaInexistenteException
	 * @version 1.0.0
	 * @since 20/01/2007
	 */
	public Double consultarSaldo(Integer numeroConta)
			throws ContaInexistenteException;
}