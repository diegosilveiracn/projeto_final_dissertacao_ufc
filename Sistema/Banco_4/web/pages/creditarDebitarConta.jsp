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

    	<h1><bean:message key="LABEL.TITLE.CREDITAR.DEBITAR.CONTA"/></h1>
    	<hr/>
		<html:form action="CreditarDebitarConta" method="post">
			<html:hidden property="method"/>
    		<table>
    			<tr>
    				<td><bean:message key="LABEL.FORM.CONTA"/></td>
    				<td>
    					<html:text property="numeroConta"/>
    				</td>
    			</tr>
    			<tr>
    				<td><bean:message key="LABEL.FORM.VALOR"/></td>
    				<td>
    					<html:text property="valor"/>
    				</td>
    			</tr>   			
    		</table>
    		<html:button property="btnCreditar" onclick="creditar();">
    			<bean:message key="LABEL.BUTTON.CREDITAR"/>
    		</html:button>
    		<html:button property="btnDebitar" onclick="debitar();">
    			<bean:message key="LABEL.BUTTON.DEBITAR"/>
    		</html:button>
    		<input type="button" name="btnLimpar" value="Limpar" onclick="limpar();"/>
    		<br/>
			<br/>
    		<a href="<%=request.getContextPath()%>/index.jsp"><bean:message key="LABEL.LINK.MENU.PRINCIPAL"/></a>
    	</html:form>
    </body>
    <script type="text/javascript" language="javascript">
       	function creditar(){
    		document.forms[0].elements["method"].value = "creditar";
    		document.forms[0].submit();
    	}
    	function debitar(){
    		document.forms[0].elements["method"].value = "debitar";
    		document.forms[0].submit();    	
    	}
    	function limpar(){
    		document.forms[0].elements["numeroConta"].value = "";
    		document.forms[0].elements["valor"].value = "";
    	}
    </script>
</html:html>