package br.com.ufc.banco.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Interface de comando
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 09/02/2007
 */
public interface Command {

	/**
	 * Método para executar comando
	 * 
	 * @param request
	 *            Objeto HttpServletRequest
	 * @param response
	 *            Objeto HttpServletResponse
	 * @return Object
	 * @version 1.0.0
	 * @since 09/02/2007
	 */
	public Object execute(HttpServletRequest request,
			HttpServletResponse response);
}
