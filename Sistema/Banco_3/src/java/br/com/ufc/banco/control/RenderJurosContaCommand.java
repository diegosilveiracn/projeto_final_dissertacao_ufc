package br.com.ufc.banco.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ufc.banco.business.BancoBusiness;
import br.com.ufc.banco.business.ContaInexistenteException;
import br.com.ufc.banco.business.ContaPoupancaException;
import br.com.ufc.banco.business.InterBancoBusiness;

/**
 * Classe de comando para render juros conta
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 09/02/2007
 */
public class RenderJurosContaCommand implements Command {

	public Object execute(HttpServletRequest request,
			HttpServletResponse response) {

		String numero = request.getParameter("numeroConta");
		String valor = request.getParameter("valorJuros");

		try {
			InterBancoBusiness bancoBusiness = new BancoBusiness();
			bancoBusiness.renderJuros(new Integer(numero), new Double(valor));

			request.setAttribute("mensagem",
					"Render Juros realizado com sucesso!");
		} catch (ContaInexistenteException e) {
			request.setAttribute("mensagem", e.getMessage());
		} catch (ContaPoupancaException e) {
			request.setAttribute("mensagem", e.getMessage());
		}

		return "resultadoRenderJurosConta.jsp";
	}
}
