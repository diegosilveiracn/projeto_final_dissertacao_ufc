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

    	<h1><h:outputText value="#{Message.LABEL_TITLE_RENDER_JUROS_CONTA}"/></h1>
    	<hr/>
		<h:form id="ContaForm">
    		<table>
    			<tr>
    				<td><h:outputText value="#{Message.LABEL_FORM_CONTA}"/><br/></td>
    				<td>
    					<h:inputText id="numeroConta" value="#{RenderJurosContaBean.numeroConta}" required="true">
    						<f:validator validatorId="IntegerValidador"/>
    					</h:inputText>
    					<h:message for="numeroConta" style="color:red"/>
    				</td>
    			</tr>
    			<tr>
    				<td><h:outputText value="#{Message.LABEL_FORM_JUROS}"/><br/></td>
    				<td>
    					<h:inputText id="valor" value="#{RenderJurosContaBean.valor}" required="true">
							<f:validator validatorId="DoubleValidador"/>
    					</h:inputText>
    					<h:message for="valor" style="color:red"/>
    				</td>
    			</tr>
    		</table>
    		<h:commandButton action="#{RenderJurosContaBean.renderJuros}" value="#{Message.LABEL_BUTTON_RENDER_JUROS}"/>
    		<input type="button" name="btnLimpar" value="Limpar" onclick="limpar();"/>
    		<br/>
			<br/>
    		<a href="<%=request.getContextPath()%>/faces/index.jsp"><h:outputText value="#{Message.LABEL_LINK_MENU_PRINCIPAL}"/></a>
    	</h:form>
    </body>
    </f:view>
    <script>
        function limpar(){
    		document.forms[0].elements["ContaForm:numeroConta"].value = "";
    		document.forms[0].elements["ContaForm:valorJuros"].value = "";
    	}
    </script>
</html>