package br.com.ufc.banco.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ufc.banco.business.BancoBusiness;
import br.com.ufc.banco.business.ContaExistenteException;
import br.com.ufc.banco.business.InterBancoBusiness;

/**
 * Servlet de controle para cadastrar conta
 * 
 * @author Diego Silveira / Jos� Maria
 * @version 1.0.0
 * @since 07/02/2007
 */
public class CadastrarContaServlet extends HttpServlet {

	/**
	 * M�todo para atender tando uma uma requisi��o doPos como doGet
	 * 
	 * @author Diego Silveira
	 * @version 1
	 * @since 07/02/2007
	 */
	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String numero = request.getParameter("numeroConta");
		String tipo = request.getParameter("tipoConta");

		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"");
		out.println("\"http://www.w3.org/TR/html4/loose.dtd\">");
		out.println("<html>");
		out.println("	<head>");
		out.println("		<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
		out.println("		<title>Banco  -  JSP/JDBC</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		ETI - Especializa��o em Tecnologia da Informa��o<br/>");
		out.println("		UFC - Universidade Federal do Cear�");
		out.println("		<hr/>");
		try {
			InterBancoBusiness bancoBusiness = new BancoBusiness();
			bancoBusiness.cadastrarConta(new Integer(numero), tipo);

			out.println("Conta cadastrada com sucesso!");
		} catch (ContaExistenteException e) {
			out.println(e.getMessage());
		}
		out.println("		<br/>");
		out.println("		<br/>");
		out.println("		<a href=\"/banco_1/index.html\">Menu Principal</a>");
		out.println("	</body>");
		out.println("</html>");
	}

	/**
	 * M�todo doGet
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
	 * M�todo doPost
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
