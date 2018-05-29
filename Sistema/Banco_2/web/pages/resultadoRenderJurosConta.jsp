<%@page import="br.com.ufc.banco.business.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Banco  -  JSP/JDBC</title>
    </head>
    <body>
       	ETI - Especializa��o em Tecnologia da Informa��o<br/>
    	UFC - Universidade Federal do Cear�

    	<hr/>

		<% 
			String numero = request.getParameter("numeroConta");
			String valor = request.getParameter("valorJuros");
	
			try {
				InterBancoBusiness bancoBusiness = new BancoBusiness();
				bancoBusiness.renderJuros(new Integer(numero), new Double(valor));
	
				out.println("Render Juros realizado com sucesso!");
			} catch (ContaInexistenteException e) {
				out.println(e.getMessage());
			} catch (ContaPoupancaException e) {
				out.println(e.getMessage());
			}
		%>

   		<br/>
		<br/>
   		<a href="<%=request.getContextPath()%>/index.html">Menu Principal</a>
    </body>
</html>
