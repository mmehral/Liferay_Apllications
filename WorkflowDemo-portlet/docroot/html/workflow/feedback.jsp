<%@page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@ include file="init.jsp"%>
<portlet:actionURL var="submitFeedBack" windowState="<%=LiferayWindowState.NORMAL.toString()%>"name="submitFeedback">
</portlet:actionURL>
<a href="<portlet:renderURL />">&laquo;Home</a>
<div class="separator"></div>
<fieldset>
<legend>Feedback Form</legend>
<%-- <c:if test='<%= SessionMessages.contains(renderRequest.getPortletSession(),"feedback-submit-success")%>'>
<liferay-ui:success key="feedback-submit-success" message="Feedback has been submited successfully." />
</c:if>
<c:if test='<%= SessionMessages.contains(renderRequest.getPortletSession(),"workflow-not-enabled")%>'>
<liferay-ui:success key="workflow-not-enabled" message="Feedback not enabled with workflow please enable workflow." />
</c:if>
<c:if test='<%= SessionErrors.contains(renderRequest.getPortletSession(),"feedback-submit-failed")%>'>
<liferay-ui:success key="feedback-submit-failed" message="There is problem of submit feedback please try again.." />
</c:if> --%>



<form action="<%=submitFeedBack%>" method="post" name="feedbackForm">
<br>
FeedBackSubject<br><input label="Feedback Subject" name="<portlet:namespace/>feedbackSubject" id="<portlet:namespace/>feedbackSubject" type="text" ><br><br>
FeedBackmessege<br><input name="<portlet:namespace/>feedbackMessage" id="<portlet:namespace/>feedbackMessage" label="Feedback Message" type="text" /><br>
<span style=" float: left;">Characters Left&nbsp;</span><p id="<portlet:namespace/>textCounter"></p><br>
<input type="submit" value="Submit Feedback" name="submit"/>
</form>



</fieldset><aui:script>
AUI().use('aui-char-counter', function(A) {
new A.CharCounter({
counter : '#<portlet:namespace/>textCounter',
input : '#<portlet:namespace/>feedbackMessage',
maxLength : 75,
on : {
maxLength : function(event) {
alert('The max length limit was reached');
}
}
});
});
</aui:script>
