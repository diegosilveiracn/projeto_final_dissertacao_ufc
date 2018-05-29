package br.com.ufc.banco.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ufc.banco.business.BancoBusiness;
import br.com.ufc.banco.business.ContaInexistenteException;
import br.com.ufc.banco.business.InterBancoBusiness;
import br.com.ufc.banco.business.LimiteContaException;

/**
 * Classe de comando para transferir conta
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 09/02/2007
 */
public class TransferirContaCommand implements Command {

	public Object execute(HttpServletRequest request,
			HttpServletResponse response) {

		String numeroOrigem = request.getParameter("numeroContaOrigem");
		String numeroDestino = request.getParameter("numeroContaDestino");
		String valor = request.getParameter("valor");

		try {
			InterBancoBusiness bancoBusiness = new BancoBusiness();
			bancoBusiness.efetuarTransferencia(new Integer(numeroOrigem),
					new Integer(numeroDestino), new Double(valor));

			request.setAttribute("mensagem",
					"Transferência realizada com sucesso!");
		} catch (ContaInexistenteException e) {
			request.setAttribute("mensagem", e.getMessage());
		} catch (LimiteContaException e) {
			request.setAttribute("mensagem", e.getMessage());
		}

		return "resultadoTransferirConta.jsp";
	}
}