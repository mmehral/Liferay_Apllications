<%@page import="com.chola.swagatam.model.swagatam"%>
<%@page import="com.chola.swagatam.service.swagatamLocalServiceUtil"%>
<%@page import="com.chola.swagatam.model.swagatam"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects/>
<html>
<head>

</head>
<body>
 <portlet:renderURL var="back">
   <portlet:param name="jspPage" value="/view.jsp" />
</portlet:renderURL>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=back%>" /> 
	
<portlet:actionURL name="removeAlbum" var="remove" />
<aui:form action="<%=remove %>" method="post" name="fm">
		<aui:select showEmptyOption="true" required="true" name="title" id="title" label ="Select the induction to remove">
		<%
		List<swagatam> swag = swagatamLocalServiceUtil.getswagatams(0, swagatamLocalServiceUtil.getswagatamsCount());

		for(swagatam swagatam : swag)
		{
		if(swagatam.getFlag().equalsIgnoreCase("1"))
		{
		%>
		<aui:option  value="<%=swagatam.getId()%>"><%=swagatam.getTitle()%></aui:option>
		<%
		}
		}
		%>
		</aui:select>
		
		<aui:button-row>
          <aui:button type="submit" value="Submit"/>
         <aui:button type="reset" value="Reset" last="true"/>
      </aui:button-row>
</aui:form>
</body>
</html>
