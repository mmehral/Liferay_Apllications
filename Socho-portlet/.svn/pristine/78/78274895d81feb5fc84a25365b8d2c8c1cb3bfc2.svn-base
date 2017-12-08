<%@page import="java.util.List"%>
<%@page import="com.chola.socho.service.topicsLocalServiceUtil"%>
<%@page import="com.chola.socho.model.topics"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects />
<html>
<head>
</head>
<body>
<portlet:renderURL var="back">
   <portlet:param name="jspPage" value="/view.jsp" />
</portlet:renderURL>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=back%>" />
	<portlet:actionURL name="share" var="shareURL" />
	<aui:form action="<%=shareURL %>" method="post" name="fm" enctype="multipart/form-data">
		<aui:select showEmptyOption="true" required="true" name="topicSelect" id="topicSelect" label ="Select a topic">
		<%
		List<topics> topic = topicsLocalServiceUtil.gettopicses(0, topicsLocalServiceUtil.gettopicsesCount());
		for(topics topics : topic)
		{
			if(topics.getFlag()==1)
			{
		%>
             <aui:option  value="<%=topics.getId()%>"><%=topics.getTopicName()%></aui:option>
        <%
		}
		}
        %>
          
 		</aui:select>
		<aui:input type="textarea" label="Share Your Idea"
                rows="5" cols="30" name="idea">
                 <aui:validator name="maxLength">5000</aui:validator>
          <aui:validator name="required"></aui:validator>
          </aui:input> 
          
          <aui:input type="file" name="uploadedFile" label="Select a file to upload">
		</aui:input>
		
       <aui:button-row>
          <aui:button type="submit" value="Submit"/>
         <aui:button type="reset" value="Reset" last="true"/>
      </aui:button-row>
 	
	</aui:form>
</body>
</html>
