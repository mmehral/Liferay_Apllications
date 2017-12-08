
<%@page import="com.chola.shutterspeed.service.shutterspeedgalleryLocalServiceUtil"%>
<%@page import="com.chola.shutterspeed.model.shutterspeedgallery"%>
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
		<aui:select showEmptyOption="true" required="true" name="albumSelect" id="albumSelect" label ="Select an Album to remove">
		<%
		List<shutterspeedgallery> img = shutterspeedgalleryLocalServiceUtil.getshutterspeedgalleries(0, shutterspeedgalleryLocalServiceUtil.getshutterspeedgalleriesCount());

		for(shutterspeedgallery imageGallery : img)
		{
		if(imageGallery.getFlag().equalsIgnoreCase("1"))
		{
		%>
		<aui:option  value="<%=imageGallery.getId()%>"><%=imageGallery.getAlbumName()%></aui:option>
		<%
		}
		}
		%>
		</aui:select>
		
		<aui:button-row>
          <aui:button type="submit" value="Submit"/>
      </aui:button-row>
</aui:form>
</body>
</html>
