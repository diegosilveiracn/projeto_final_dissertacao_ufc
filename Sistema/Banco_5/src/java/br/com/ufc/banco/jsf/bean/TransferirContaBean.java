package br.com.ufc.banco.jsf.bean;

import br.com.ufc.banco.business.BancoBusiness;
import br.com.ufc.banco.business.ContaInexistenteException;
import br.com.ufc.banco.business.InterBancoBusiness;
import br.com.ufc.banco.business.LimiteContaException;

/**
 * Classe de controle para transferir conta
 * 
 * @author Diego Silveira / Jos� Maria
 * @version 1.0.0
 * @since 11/02/2007
 */
public class TransferirContaBean {

	// Numero da conta de origem
	private Integer numeroContaOrigem;

	// Numero da conta de destino
	private Integer numeroContaDestino;

	// Valor transferido
	private Double valor;

	// Mensagem de sa�da
	private String mensagem;

	/**
	 * M�todo para transferir conta
	 * 
	 * @return String result
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public String transferir() {

		try {
			InterBancoBusiness bancoBusiness = new BancoBusiness();
			bancoBusiness.efetuarTransferencia(this.numeroContaOrigem,
					this.numeroContaDestino, this.valor);

			this.mensagem = "Transfer�ncia realizada com sucesso!";
		} catch (ContaInexistenteException e) {
			this.mensagem = e.getMessage();
		} catch (LimiteContaException e) {
			this.mensagem = e.getMessage();
		}

		return "result";
	}

	/**
	 * M�todo bean getNumeroContaOrigem
	 * 
	 * @return N�mero da conta de origem Exemplo: 1
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public Integer getNumeroContaOrigem() {
		return numeroContaOrigem;
	}

	/**
	 * M�todo bean getNumeroContaOrigem
	 * 
	 * @param numeroContaOrigem
	 *            N�mero da conta de origem Exemplo: 1
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public void setNumeroContaOrigem(Integer numeroContaOrigem) {
		this.numeroContaOrigem = numeroContaOrigem;
	}

	/**
	 * M�todo bean getNumeroContaDestino
	 * 
	 * @return N�mero da conta de destino Exemplo: 2
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public Integer getNumeroContaDestino() {
		return numeroContaDestino;
	}

	/**
	 * M�todo bean setNumeroContaDestino
	 * 
	 * @param numeroContaDestino
	 *            N�mero da conta de destino Exemplo: 2
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public void setNumeroContaDestino(Integer numeroContaDestino) {
		this.numeroContaDestino = numeroContaDestino;
	}

	/**
	 * M�todo bean getValor
	 * 
	 * @return Valor da transfer�ncia Exemplo: 100.00
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public Double getValor() {
		return valor;
	}

	/**
	 * M�todo bean setValor
	 * 
	 * @param valor
	 *            Valor da transfer�ncia Exemplo: 100.00
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public void setValor(Double valor) {
		this.valor = valor;
	}

	/**
	 * M�todo bean getMensagem
	 * 
	 * @return Mensagem de sa�da Exemplo: Conta cadastrada com sucesso!
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public String getMensagem() {
		return mensagem;
	}

	/**
	 * M�todo bean setMensagem
	 * 
	 * @param mensagem
	 *            Mensagem de sa�da Exemplo: Conta cadastrada com sucesso!
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}