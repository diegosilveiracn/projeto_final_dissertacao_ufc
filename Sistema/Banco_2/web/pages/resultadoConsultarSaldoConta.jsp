<%@page import="br.com.ufc.banco.business.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Banco  -  JSP/JDBC</title>
    </head>
    <body>
       	ETI - Especialização em Tecnologia da Informação<br/>
    	UFC - Universidade Federal do Ceará

    	<hr/>

		<% 
			String numero = request.getParameter("numeroConta");
	
			try {
				InterBancoBusiness bancoBusiness = new BancoBusiness();
				Double saldo = bancoBusiness.consultarSaldo(new Integer(numero));
	
				out.println("Saldo conta " + numero + " R$:" + saldo);
			} catch (ContaInexistenteException e) {
				out.println(e.getMessage());
			}
		%>

   		<br/>
		<br/>
   		<a href="<%=request.getContextPath()%>/index.html">Menu Principal</a>
    </body>
</html>
