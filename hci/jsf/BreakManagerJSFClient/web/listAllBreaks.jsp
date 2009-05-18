<%--
    Document   : listAllBreaks
    Created on : 2009-5-13, 17:13:20
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
        <title>list all the breaks</title>
    </head>
    <body>
        <h1>List all the breaks</h1>
         <f:view>
            <h:form>
                <h:dataTable value="#{BreakAdminBean.allBreakModel}" var="b" border="1">
            <h:column>
				<f:facet name="header">
					<h:outputText value="break id" />
				</f:facet>
				<h:outputText value="#{b.id}" />
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
					<h:outputText value="link with promo or not" />
				</f:facet>
				<h:outputText value="#{b.breakPromoLnk}" />
                &nbsp&nbsp
                <h:commandLink action="#{BreakAdminBean.getBreakForEdit}" value="change"/>
                &nbsp&nbsp
                <h:selectOneMenu value="Ok">
                    <f:selectItems value="#{BreakAdminBean.plistbybreak}"/>
                </h:selectOneMenu>
			    </h:column>
                <h:column>
				<f:facet name="header">
					<h:outputText value="alarm" />
				</f:facet>
                <h:dataTable value="#{BreakAdminBean.alarmModel}" var="a">
                    <h:column>
                        <h:outputText value="#{a.alarmContent}"/>
                    </h:column>
                    <h:column>
                        <h:commandLink action="#{BreakAdminBean.goToEdit}" value="edit"/>
                    </h:column>
                     <h:column>
                         <h:commandLink action="#{BreakAdminBean.deleteAlarm}" value="delete"/>
                    </h:column>
                </h:dataTable>
			    </h:column>
                <h:column>
				<f:facet name="header">
					<h:outputText value="delete" />
				</f:facet>
                <h:commandLink action="#{BreakAdminBean.deleteBreak}" value="delete"/>
			    </h:column>
          </h:dataTable>
            <br/>
             
            <hr/>
            <h2>here are the alarms no linking with breaks</h2>
            <br/>
            <h:dataTable value="#{AlarmAdmin.noLnkModel}" var="b" border="1">
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="id"/>
                     </f:facet>
                     <h:outputText value="#{b.alarmId}"/>
                </h:column>
                   <h:column>
                    <f:facet name="header">
                        <h:outputText value="content"/>
                     </f:facet>
                     <h:outputText value="#{b.alarmContent}"/>
                </h:column>
                    <h:column>
                    <f:facet name="header">
                        <h:outputText value="edit"/>
                     </f:facet>
                     <h:commandLink action="#{AlarmAdmin.goToEdit}" value="edit"/>
                </h:column>
                   <h:column>
                    <f:facet name="header">
                        <h:outputText value="delete"/>
                     </f:facet>
                     <h:commandLink action="#{AlarmAdmin.deleteNoLnkAlarm}" value="delete"/>
                </h:column>
            </h:dataTable>
            <br/>
            <br/>
             <h:commandButton action="addNewBreak" value="New Break"/>
             &nbsp&nbsp &nbsp&nbsp
             <h:commandButton action="addNewAlarm" value="New Alarm"/>
            <br/><br/>
            <h:commandButton action="back" value="back"/>
            </h:form>
        </f:view>
    </body>
</html>