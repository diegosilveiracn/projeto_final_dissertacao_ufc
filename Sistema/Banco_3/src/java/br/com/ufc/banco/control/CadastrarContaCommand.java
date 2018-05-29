package br.com.ufc.banco.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ufc.banco.business.BancoBusiness;
import br.com.ufc.banco.business.ContaExistenteException;
import br.com.ufc.banco.business.InterBancoBusiness;

/**
 * Classe de comando para cadastrar conta
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 09/02/2007
 */
public class CadastrarContaCommand implements Command {

	public Object execute(HttpServletRequest request,
			HttpServletResponse response) {

		String numero = request.getParameter("numeroConta");
		String tipo = request.getParameter("tipoConta");

		try {
			InterBancoBusiness bancoBusiness = new BancoBusiness();
			bancoBusiness.cadastrarConta(new Integer(numero), tipo);

			request.setAttribute("mensagem", "Conta cadastrada com sucesso!");
		} catch (ContaExistenteException e) {
			request.setAttribute("mensagem", e.getMessage());
		}

		return "resultadoCadastrarConta.jsp";
	}
}