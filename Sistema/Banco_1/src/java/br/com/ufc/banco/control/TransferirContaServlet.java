package br.com.ufc.banco.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ufc.banco.business.BancoBusiness;
import br.com.ufc.banco.business.ContaInexistenteException;
import br.com.ufc.banco.business.InterBancoBusiness;
import br.com.ufc.banco.business.LimiteContaException;

/**
 * Servlet de controle para transferir valores entre conta
 * 
 * @author Diego Silveira / José Maria
 * @version 1.0.0
 * @since 07/02/2007
 */
public class TransferirContaServlet extends HttpServlet {

	/**
	 * Método para atender tando uma uma requisição doPos como doGet
	 * 
	 * @author Diego Silveira
	 * @version 1
	 * @since 07/02/2007
	 */
	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String numeroOrigem = request.getParameter("numeroContaOrigem");
		String numeroDestino = request.getParameter("numeroContaDestino");
		String valor = request.getParameter("valor");

		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"");
		out.println("\"http://www.w3.org/TR/html4/loose.dtd\">");
		out.println("<html>");
		out.println("	<head>");
		out
				.println("		<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
		out.println("		<title>Banco  -  JSP/JDBC</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		ETI - Especialização em Tecnologia da Informação<br/>");
		out.println("		UFC - Universidade Federal do Ceará");
		out.println("		<hr/>");
		try {
			InterBancoBusiness bancoBusiness = new BancoBusiness();
			bancoBusiness.efetuarTransferencia(new Integer(numeroOrigem), new Integer(
					numeroDestino), new Double(valor));

			out.println("Transferência realizada com sucesso!");
		} catch (ContaInexistenteException e) {
			out.println(e.getMessage());
		} catch (LimiteContaException e) {
			out.println(e.getMessage());
		}
		out.println("		<br/>");
		out.println("		<br/>");
		out.println("		<a href=\"/banco_1/index.html\">Menu Principal</a>");
		out.println("	</body>");
		out.println("</html>");
	}

	/**
	 * Método doGet
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @param HttpServletResponse
	 *            response
	 * @version 1.0.0
	 * @since 07/02/2007
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
	 * @since 07/02/2007
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
}
