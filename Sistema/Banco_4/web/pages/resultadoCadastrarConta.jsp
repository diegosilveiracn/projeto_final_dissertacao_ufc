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

    	<hr/>
		<bean:write name="mensagem"/>
		<br/>
		<br/>
   		<a href="<%=request.getContextPath()%>/index.jsp"><bean:message key="LABEL.LINK.MENU.PRINCIPAL"/></a>
    </body>
</html:html>
