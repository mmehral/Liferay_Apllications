
<%@page import="com.meera.workflow.db.model.Feedback"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@ include file="init.jsp"%>
<%
Feedback feedback=null;
if(request.getAttribute("feedBackObject")!=null)
feedback = (Feedback)request.getAttribute("feedBackObject");
%>
<c:if test='<%=feedback!=null%>'>
<h2><%=feedback.getFeedbackSubject()%></h2>
<br/>
Message:
<div>
<%=feedback.getFeedbackText()%>
</div>
</c:if>
