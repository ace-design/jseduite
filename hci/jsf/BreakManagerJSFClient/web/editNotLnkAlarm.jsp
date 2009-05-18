<%-- 
    Document   : editNotLnkAlarm
    Created on : 2009-5-17, 16:06:05
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
        <title>edit a not linked alarm</title>
    </head>
    <body>
        <h1>edit!</h1>
        <f:view>
            <h:form>
           <h:dataTable value="#{AlarmAdmin.allModel}" var="a" border="1">
            <h:column>
				<f:facet name="header">
					<h:outputText value="promo" />
				</f:facet>
				<h:outputText value="#{a.promo}" />
			</h:column>
            <h:column>
				<f:facet name="header">
					<h:outputText value="start" />
				</f:facet>
				<h:outputText value="#{a.start}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputText value="end" />
				</f:facet>
				<h:outputText value="#{a.end}" />
			</h:column>
			  <h:column>
				 <f:facet name="header">
					<h:outputText value="break type" />
				 </f:facet>
				 <h:outputText value="#{a.kind}" />
			   </h:column>
				<h:column>
				<f:facet name="header">
					<h:outputText value="Weekday" />
				</f:facet>
				<h:outputText value="#{a.day}" />
		    	</h:column>
                <h:column>
                <f:facet name="header">
					<h:outputText value="select" />
				</f:facet>
                <h:selectBooleanCheckbox  value="#{a.breakChecked}"/>
		    	</h:column>
            </h:dataTable>
            <br/>
            <h:outputText value="Content: "/>
            <h:inputText value="#{AlarmAdmin.editAlarm.alarmContent}"/>
            <br/>
            <h:commandButton action="#{AlarmAdmin.editNoLnkAlarm}" value="ok"/>
            &nbsp&nbsp<h:commandButton action="back" value="back"/>
            </h:form>
            </f:view>
    </body>
</html>