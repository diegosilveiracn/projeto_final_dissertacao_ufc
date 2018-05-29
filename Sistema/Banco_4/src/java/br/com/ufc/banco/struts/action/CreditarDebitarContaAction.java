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
import br.com.ufc.banco.struts.form.CreditarDebitarContaForm;

/**
 * Classe de ação para creditar/debitar conta
 * 
 * @author Diego Silveira
 * @author José Maria
 * @version 1.0.0
 * @since 25/02/2007
 */
public class CreditarDebitarContaAction extends DispatchAction {

	/**
	 * Método para creditar conta
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
	public ActionForward creditar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		CreditarDebitarContaForm creditarDebitarContaForm = (CreditarDebitarContaForm) form;

		try {
			InterBancoBusiness bancoBusiness = new BancoBusiness();

			bancoBusiness.efetuarCredito(new Integer(creditarDebitarContaForm
					.getNumeroConta()), new Double(creditarDebitarContaForm
					.getValor()));

			request.setAttribute("mensagem", "Crédito realizado com sucesso!");

		} catch (ContaInexistenteException e) {
			request.setAttribute("mensagem", e.getMessage());
		}

		return mapping.findForward("result");
	}

	/**
	 * Método para debitar conta
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
	public ActionForward debitar(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		CreditarDebitarContaForm creditarDebitarContaForm = (CreditarDebitarContaForm) form;

		try {
			InterBancoBusiness bancoBusiness = new BancoBusiness();

			bancoBusiness.efetuarDebito(new Integer(creditarDebitarContaForm
					.getNumeroConta()), new Double(creditarDebitarContaForm
					.getValor()));
			request.setAttribute("mensagem", "Débito realizado com sucesso!");

		} catch (ContaInexistenteException e) {
			request.setAttribute("mensagem", e.getMessage());
		}

		return mapping.findForward("result");
	}
}