package br.com.ufc.banco.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ufc.banco.business.BancoBusiness;
import br.com.ufc.banco.business.ContaInexistenteException;
import br.com.ufc.banco.business.InterBancoBusiness;

/**
 * Classe de comando para creditar/debitar conta
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 09/02/2007
 */
public class CreditarDebitarContaCommand implements Command {

	public Object execute(HttpServletRequest request,
			HttpServletResponse response) {

		String numero = request.getParameter("numeroConta");
		String valor = request.getParameter("valor");
		String method = request.getParameter("method");

		try {
			InterBancoBusiness bancoBusiness = new BancoBusiness();

			if ("debitar".equals(method)) {
				bancoBusiness.efetuarDebito(new Integer(numero), new Double(
						valor));
				request.setAttribute("mensagem",
						"Débito realizado com sucesso!");
			} else {
				bancoBusiness.efetuarCredito(new Integer(numero), new Double(
						valor));
				request.setAttribute("mensagem",
						"Crédito realizado com sucesso!!");
			}

		} catch (ContaInexistenteException e) {
			request.setAttribute("mensagem", e.getMessage());
		}

		return "resultadoCreditarDebitarConta.jsp";
	}
}
