package br.com.ufc.banco.control;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet de controle geral
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 09/02/2007
 */
public class FrontControllerServlet extends HttpServlet {

	private Map<String, Command> map = new HashMap<String, Command>();

	/**
	 * Construtor para uma instância de FrontControllerServlet
	 * 
	 * @author Diego Silveira / José Maria
	 * @version 1.0.0
	 * @since 09/02/2007
	 */
	public FrontControllerServlet() {

		map.put("cadastrar", new CadastrarContaCommand());
		map.put("excluir", new ExcluirContaCommand());
		map.put("creditar", new CreditarDebitarContaCommand());
		map.put("debitar", new CreditarDebitarContaCommand());
		map.put("transferir", new TransferirContaCommand());
		map.put("renderJuros", new RenderJurosContaCommand());
		map.put("renderBonus", new RenderBonusContaCommand());
		map.put("consultarSaldo", new ConsultarSaldoContaCommand());
		map.put("consultarBonus", new ConsultarBonusContaCommand());
	}

	/**
	 * Método para atender tando uma uma requisição doPos como doGet
	 * 
	 * @author Diego Silveira
	 * @version 1
	 * @since 09/02/2007
	 */
	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String method = request.getParameter("method");

		Command command = (Command) (map.get(method));
		String retorno = (String) command.execute(request, response);

		RequestDispatcher requestDispatcher = super.getServletContext()
				.getRequestDispatcher("/pages/" + retorno);
		requestDispatcher.forward(request, response);
	}

	/**
	 * Método doGet
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @param HttpServletResponse
	 *            response
	 * @version 1.0.0
	 * @since 09/02/2007
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Método doPost
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @param HttpServletResponse
	 *            response
	 * @version 1
	 * @since 09/02/2007
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
}