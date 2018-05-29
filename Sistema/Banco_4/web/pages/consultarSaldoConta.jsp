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

    	<h1><bean:message key="LABEL.TITLE.CONSULTAR.SALDO.CONTA"/></h1>
    	<hr/>
		<html:form action="ConsultarSaldoConta" method="post">
			<html:hidden property="method" value="consultarSaldo"/>
    		<table>
    			<tr>
    				<td><bean:message key="LABEL.FORM.CONTA"/></td>
    				<td>
    					<html:text property="numeroConta"/>
    				</td>
    			</tr>
    		</table>
    		<html:button property="btnConsultarSaldo" onclick="submit();">
    			<bean:message key="LABEL.BUTTON.CONSULTAR.SALDO"/>
    		</html:button>
    		<input type="button" name="btnLimpar" value="Limpar" onclick="limpar();"/>
    		<br/>
			<br/>
    		<a href="<%=request.getContextPath()%>/index.jsp"><bean:message key="LABEL.LINK.MENU.PRINCIPAL"/></a>
    	</html:form>
    </body>
    <script type="text/javascript" language="javascript">
        function limpar(){
    		document.forms[0].elements["numeroConta"].value = "";
    	}
    </script>
</html:html>
