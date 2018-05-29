package br.com.ufc.banco.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ufc.banco.business.BancoBusiness;
import br.com.ufc.banco.business.ContaBonusException;
import br.com.ufc.banco.business.ContaInexistenteException;
import br.com.ufc.banco.business.InterBancoBusiness;

/**
 * Classe de comando para imprimir bonus conta
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 09/02/2007
 */
public class ConsultarBonusContaCommand implements Command {

	public Object execute(HttpServletRequest request,
			HttpServletResponse response) {

		String numero = request.getParameter("numeroConta");

		try {
			InterBancoBusiness bancoBusiness = new BancoBusiness();
			Double saldo = bancoBusiness.consultarBonus(new Integer(numero));

			request.setAttribute("mensagem", "Bônus conta " + numero + " R$:"
					+ saldo);
		} catch (ContaInexistenteException e) {
			request.setAttribute("mensagem", e.getMessage());
		} catch (ContaBonusException e) {
			request.setAttribute("mensagem", e.getMessage());
		}

		return "resultadoConsultarBonusConta.jsp";
	}
}
