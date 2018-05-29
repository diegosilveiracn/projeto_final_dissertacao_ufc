package br.com.ufc.banco.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import br.com.ufc.banco.business.BancoBusiness;
import br.com.ufc.banco.business.ContaBonusException;
import br.com.ufc.banco.business.ContaInexistenteException;
import br.com.ufc.banco.business.InterBancoBusiness;
import br.com.ufc.banco.struts.form.RenderBonusContaForm;

/**
 * Classe de ação para render bônus conta
 * 
 * @author Diego Silveira
 * @author José Maria
 * @version 1.0.0
 * @since 25/02/2007
 */
public class RenderBonusContaAction extends DispatchAction {

	/**
	 * Método para render bônus conta
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
	public ActionForward renderBonus(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		RenderBonusContaForm renderBonusContaForm = (RenderBonusContaForm) form;

		try {
			InterBancoBusiness bancoBusiness = new BancoBusiness();
			bancoBusiness.renderBonus(new Integer(renderBonusContaForm
					.getNumeroConta()));

			request.setAttribute("mensagem",
					"Render Bônus realizado com sucesso!");
		} catch (ContaInexistenteException e) {
			request.setAttribute("mensagem", e.getMessage());
		} catch (ContaBonusException e) {
			request.setAttribute("mensagem", e.getMessage());
		}

		return mapping.findForward("result");
	}
}
