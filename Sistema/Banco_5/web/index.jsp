<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<f:loadBundle basename="bundle.Messages" var="Message"/>
<html>
	<f:view>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><h:outputText value="#{Message.BANCO}"/></title>
    </head>
    <body>
    	<h:outputText value="#{Message.ETI}"/><br/>
		<h:outputText value="#{Message.UFC}"/>
    
    	<h1><h:outputText value="#{Message.LABEL_TITLE_MENU}"/></h1>
        <a href="<%=request.getContextPath()%>/faces/pages/cadastrarConta.jsp"><h:outputText value="#{Message.LABEL_LINK_CADASTRAR_CONTA}"/></a><br/>
       	<a href="<%=request.getContextPath()%>/faces/pages/excluirConta.jsp"><h:outputText value="#{Message.LABEL_LINK_EXCLUIR_CONTA}"/></a><br/>
       	<a href="<%=request.getContextPath()%>/faces/pages/creditarDebitarConta.jsp"><h:outputText value="#{Message.LABEL_LINK_CREDITAR_DEBITAR_CONTA}"/></a><br/>
       	<a href="<%=request.getContextPath()%>/faces/pages/transferirConta.jsp"><h:outputText value="#{Message.LABEL_LINK_TRANSFERENCIA}"/></a><br/>
       	<a href="<%=request.getContextPath()%>/faces/pages/renderJurosConta.jsp"><h:outputText value="#{Message.LABEL_LINK_RENDE_JUROS}"/></a><br/>
       	<a href="<%=request.getContextPath()%>/faces/pages/renderBonusConta.jsp"><h:outputText value="#{Message.LABEL_LINK_RENDER_BONUS}"/></a><br/>       	
       	<a href="<%=request.getContextPath()%>/faces/pages/consultarSaldoConta.jsp"><h:outputText value="#{Message.LABEL_LINK_CONSULTAR_SALDO}"/></a><br/>
       	<a href="<%=request.getContextPath()%>/faces/pages/consultarBonusConta.jsp"><h:outputText value="#{Message.LABEL_LINK_CONSULTAR_BONUS}"/></a>
    </body>
    </f:view>
</html>