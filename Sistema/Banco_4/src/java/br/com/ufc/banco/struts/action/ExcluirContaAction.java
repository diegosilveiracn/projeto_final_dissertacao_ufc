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
import br.com.ufc.banco.struts.form.ExcluirContaForm;

/**
 * Classe de a��o para excluir conta
 * 
 * @author Diego Silveira
 * @author Jos� Maria
 * @version 1.0.0
 * @since 25/02/2007
 */
public class ExcluirContaAction extends DispatchAction {

	/**
	 * M�todo para excluir conta
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
	public ActionForward excluir(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ExcluirContaForm excluirContaForm = (ExcluirContaForm) form;

		try {
			InterBancoBusiness bancoBusiness = new BancoBusiness();
			bancoBusiness.excluirConta(new Integer(excluirContaForm
					.getNumeroConta()));

			request.setAttribute("mensagem", "Conta exclu�da com sucesso!");
		} catch (ContaInexistenteException e) {
			request.setAttribute("mensagem", e.getMessage());
		}

		return mapping.findForward("result");
	}
}
