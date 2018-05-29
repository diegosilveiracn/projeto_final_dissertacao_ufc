<%@taglib uri="/tags/struts-bean" prefix="bean"%>
<%@taglib uri="/tags/struts-html" prefix="html"%>
<%@taglib uri="/tags/struts-logic" prefix="logic"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="BANCO"/></title>
    </head>
    <body>
    	<bean:message key="ETI"/><br/>
		<bean:message key="UFC"/>
    
    	<h1><bean:message key="LABEL.TITLE.MENU"/></h1>
        <a href="<%=request.getContextPath()%>/pages/cadastrarConta.jsp"><bean:message key="LABEL.LINK.CADASTRAR.CONTA"/></a><br/>
       	<a href="<%=request.getContextPath()%>/pages/excluirConta.jsp"><bean:message key="LABEL.LINK.EXCLUIR.CONTA"/></a><br/>
       	<a href="<%=request.getContextPath()%>/pages/creditarDebitarConta.jsp"><bean:message key="LABEL.LINK.CREDITAR.DEBITAR.CONTA"/></a><br/>
       	<a href="<%=request.getContextPath()%>/pages/transferirConta.jsp"><bean:message key="LABEL.LINK.TRANSFERENCIA"/></a><br/>
       	<a href="<%=request.getContextPath()%>/pages/renderJurosConta.jsp"><bean:message key="LABEL.LINK.RENDE.JUROS"/></a><br/>
       	<a href="<%=request.getContextPath()%>/pages/renderBonusConta.jsp"><bean:message key="LABEL.LINK.RENDER.BONUS"/></a><br/>       	
       	<a href="<%=request.getContextPath()%>/pages/consultarSaldoConta.jsp"><bean:message key="LABEL.LINK.CONSULTAR.SALDO"/></a><br/>
       	<a href="<%=request.getContextPath()%>/pages/consultarBonusConta.jsp"><bean:message key="LABEL.LINK.CONSULTAR.BONUS"/></a>
    </body>
</html:html>