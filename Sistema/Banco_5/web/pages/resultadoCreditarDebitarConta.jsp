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

    	<hr/>  	
    	<h:outputText value="#{CreditarDebitarContaBean.mensagem}"/>
    	<br/>
		<br/>
    	<a href="<%=request.getContextPath()%>/faces/index.jsp"><h:outputText value="#{Message.LABEL_LINK_MENU_PRINCIPAL}"/></a>
    </body>
    </f:view>
</html>