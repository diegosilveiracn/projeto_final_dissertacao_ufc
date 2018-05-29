package br.com.ufc.banco.jsf.bean;

import br.com.ufc.banco.business.BancoBusiness;
import br.com.ufc.banco.business.ContaExistenteException;
import br.com.ufc.banco.business.InterBancoBusiness;

/**
 * Classe de controle para cadastrar conta
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 11/02/2007
 */
public class CadastrarContaBean {

	// Numero da conta
	private Integer numeroConta;

	// Tipo da conta
	private String tipoConta;

	// Mensagem de saída
	private String mensagem;

	/**
	 * Método para cadastrar conta
	 * 
	 * @return String result
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public String cadastrar() {

		try {
			InterBancoBusiness bancoBusiness = new BancoBusiness();
			bancoBusiness.cadastrarConta(this.numeroConta, this.tipoConta);

			this.mensagem = "Conta cadastrada com sucesso!";
		} catch (ContaExistenteException e) {
			this.mensagem = e.getMessage();
		}

		return "result";
	}

	/**
	 * Método bean getNumeroConta
	 * 
	 * @return Número da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public Integer getNumeroConta() {
		return numeroConta;
	}

	/**
	 * Método bean setNumeroConta
	 * 
	 * @param numeroConta
	 *            Número da conta Exemplo: 1
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	/**
	 * Método bean getTipoConta
	 * 
	 * @return Tipo da conta Exemplo: C - Conta simples, P - conta poupança ou B -
	 *         Conta bônus
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public String getTipoConta() {
		return tipoConta;
	}

	/**
	 * Método bean setTipoConta
	 * 
	 * @param tipoConta
	 *            Tipo da conta Exemplo: C - Conta simples, P - conta poupança
	 *            ou B - Conta bônus
	 * @version 1.0.0
	 * @since 11/02/2007
	 */
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
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