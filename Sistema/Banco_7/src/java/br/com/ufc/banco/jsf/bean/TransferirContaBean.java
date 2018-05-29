package br.com.ufc.banco.jsf.bean;

import br.com.ufc.banco.business.BancoBusiness;
import br.com.ufc.banco.business.ContaInexistenteException;
import br.com.ufc.banco.business.InterBancoBusiness;
import br.com.ufc.banco.business.LimiteContaException;

/**
 * Classe de controle para transferir conta
 * 
 * @author Diego Silveira / José Maria
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

	// Mensagem de saída
	private String mensagem;

	/**
	 * Método para transferir conta
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

			this.mensagem = "Transferência realizada com sucesso!";
		} catch (ContaInexistenteException e) {
			this.mensagem = e.getMessage();
		} catch (LimiteContaException e) {
			this.mensagem = e.getMessage();
		}

		return "result";
	}

	/**
	 * Método bean getNumeroContaOrigem
	 * 
	 * @return Número da conta de origem Exemplo: 1
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public Integer getNumeroContaOrigem() {
		return numeroContaOrigem;
	}

	/**
	 * Método bean getNumeroContaOrigem
	 * 
	 * @param numeroContaOrigem
	 *            Número da conta de origem Exemplo: 1
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public void setNumeroContaOrigem(Integer numeroContaOrigem) {
		this.numeroContaOrigem = numeroContaOrigem;
	}

	/**
	 * Método bean getNumeroContaDestino
	 * 
	 * @return Número da conta de destino Exemplo: 2
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public Integer getNumeroContaDestino() {
		return numeroContaDestino;
	}

	/**
	 * Método bean setNumeroContaDestino
	 * 
	 * @param numeroContaDestino
	 *            Número da conta de destino Exemplo: 2
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public void setNumeroContaDestino(Integer numeroContaDestino) {
		this.numeroContaDestino = numeroContaDestino;
	}

	/**
	 * Método bean getValor
	 * 
	 * @return Valor da transferência Exemplo: 100.00
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public Double getValor() {
		return valor;
	}

	/**
	 * Método bean setValor
	 * 
	 * @param valor
	 *            Valor da transferência Exemplo: 100.00
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public void setValor(Double valor) {
		this.valor = valor;
	}

	/**
	 * Método bean getMensagem
	 * 
	 * @return Mensagem de saída Exemplo: Conta cadastrada com sucesso!
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public String getMensagem() {
		return mensagem;
	}

	/**
	 * Método bean setMensagem
	 * 
	 * @param mensagem
	 *            Mensagem de saída Exemplo: Conta cadastrada com sucesso!
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}