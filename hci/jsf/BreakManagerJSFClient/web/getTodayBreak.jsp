<%--
    Document   : getTodayBreak
    Created on : 2009-5-13, 12:15:11
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
        <title>get breaks for today</title>
    </head>
    <body>
        <h1>get breaks for today</h1>
         <f:view>
        <h:form>
            <h:dataTable value="#{BreakUseBean.todayModel}" var="b" border="1">
            <h:column>
				<f:facet name="header">
					<h:outputText value="promo" />
				</f:facet>
				<h:outputText value="#{b.promo}" />
			</h:column>
            <h:column>
				<f:facet name="header">
					<h:outputText value="start" />
				</f:facet>
				<h:outputText value="#{b.start}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="end" />
				</f:facet>
				<h:outputText value="#{b.end}" />
			</h:column>
					<h:column>
				<f:facet name="header">
					<h:outputText value="break type" />
				</f:facet>
				<h:outputText value="#{b.kind}" />
			</h:column>
				<h:column>
				<f:facet name="header">
					<h:outputText value="Weekday" />
				</f:facet>
				<h:outputText value="#{b.day}" />
			</h:column>
            <h:column>
				<f:facet name="header">
					<h:outputText value="alarm" />
				</f:facet>
                <h:dataTable value="#{BreakUseBean.alarmForToday}" var="a">
                    <h:column>
				    <h:outputText value="#{a.alarmContent}" />
			        </h:column>
                </h:dataTable>
			</h:column>
        </h:dataTable>
        <h:commandButton action="back" value="back"/>
        </h:form>
        </f:view>
    </body>
</html>