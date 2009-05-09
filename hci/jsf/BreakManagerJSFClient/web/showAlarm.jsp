<%-- 
    Document   : showAlarm
    Created on : 2009-5-8, 20:36:41
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>this is the alarm by break id</h1>
        <f:view>
        <h:form>
            <h:dataTable value="#{alarmManage.alarmBindModel}" var="a" border="1">
		   <h:column>
				<f:facet name="header">
					<h:outputText value="alarm id" />
				</f:facet>
				<h:outputText value="#{a.alarmId}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="break id" />
				</f:facet>
				<h:outputText value="#{a.breakId}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="alarm content" />
				</f:facet>
				<h:outputText value="#{a.alarmContent}" />
			</h:column>

      </h:dataTable>
      <br/>
        <h:commandButton action="back" value="back"/>
    </h:form>
    </f:view>
    </body>
</html>