package br.com.ufc.banco.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import br.com.ufc.banco.business.BancoBusiness;
import br.com.ufc.banco.business.ContaInexistenteException;
import br.com.ufc.banco.business.InterBancoBusiness;
import br.com.ufc.banco.business.LimiteContaException;
import br.com.ufc.banco.struts.form.TransferirContaForm;

/**
 * Classe de ação para transferir conta
 * 
 * @author Diego Silveira
 * @author José Maria
 * @version 1.0.0
 * @since 25/02/2007
 */
public class TransferirContaAction extends DispatchAction {

	/**
	 * Método para transferir conta
	 * 
	 * @param mapping
	 *            Objeto ActionMapping
	 * @param form
	 *            Objeto ActionForm
	 * @param request
	 *            Objeto HttpServletRequest
	 * @param response
	 *            Objeto HttpServletResponse
	 * @return Objeto ActionForward
	 * @throws Exception
	 * @version 1.0.0
	 * @since 25/02/2007
	 */
	public ActionForward transferir(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		TransferirContaForm transferirContaForm = (TransferirContaForm) form;

		try {
			InterBancoBusiness bancoBusiness = new BancoBusiness();
			bancoBusiness.efetuarTransferencia(new Integer(transferirContaForm
					.getNumeroContaOrigem()), new Integer(transferirContaForm
					.getNumeroContaDestino()), new Double(transferirContaForm
					.getValor()));

			request.setAttribute("mensagem",
					"Transferência realizada com sucesso!");
		} catch (ContaInexistenteException e) {
			request.setAttribute("mensagem", e.getMessage());
		} catch (LimiteContaException e) {
			request.setAttribute("mensagem", e.getMessage());
		}

		return mapping.findForward("result");
	}
}
