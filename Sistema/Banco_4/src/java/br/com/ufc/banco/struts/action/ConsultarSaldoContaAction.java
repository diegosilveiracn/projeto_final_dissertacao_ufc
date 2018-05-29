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
import br.com.ufc.banco.struts.form.ConsultarSaldoContaForm;

/**
 * Classe de ação para consultar saldo conta
 * 
 * @author Diego Silveira
 * @author José Maria
 * @version 1.0.0
 * @since 25/02/2007
 */
public class ConsultarSaldoContaAction extends DispatchAction {

	/**
	 * Método para consultar saldo conta
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
	public ActionForward consultarSaldo(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ConsultarSaldoContaForm consultarSaldoContaForm = (ConsultarSaldoContaForm) form;

		try {
			InterBancoBusiness bancoBusiness = new BancoBusiness();
			Double saldo = bancoBusiness.consultarSaldo(new Integer(
					consultarSaldoContaForm.getNumeroConta()));

			request
					.setAttribute("mensagem", "Saldo conta "
							+ consultarSaldoContaForm.getNumeroConta() + " R$:"
							+ saldo);
		} catch (ContaInexistenteException e) {
			request.setAttribute("mensagem", e.getMessage());
		}

		return mapping.findForward("result");
	}
}
