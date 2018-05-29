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
			String valor = request.getParameter("valor");
			String method = request.getParameter("method");
	
			try {
				InterBancoBusiness bancoBusiness = new BancoBusiness();
	
				if ("debitar".equals(method)) {
					bancoBusiness.efetuarDebito(new Integer(numero), new Double(
							valor));
					out.println("D�bito realizado com sucesso!");
				} else {
					bancoBusiness.efetuarCredito(new Integer(numero), new Double(
							valor));
					out.println("Cr�dito realizado com sucesso!");
				}
	
			} catch (ContaInexistenteException e) {
				out.println(e.getMessage());
			}
    	%>
    	
    	<br/>
		<br/>
    	<a href="<%=request.getContextPath()%>/index.html">Menu Principal</a>
    </body>
</html>
