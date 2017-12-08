<%@page import="com.chola.service.conference.service.floorwingLocalServiceUtil"%>
<%@page import="com.chola.service.conference.model.floorwing"%>
<%@page import="com.chola.service.conference.service.roomLocalServiceUtil"%>
<%@page import="com.chola.service.conference.model.room"%>
<%@page import="com.chola.service.conference.service.stateLocalServiceUtil"%>
<%@page import="com.chola.service.conference.model.state"%>
<%@page import="com.chola.service.conference.service.locationLocalServiceUtil"%>
<%@page import="com.chola.service.conference.model.location"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<style>
#_ConfereneceMaster_WAR_ConfereneceMasterportlet_INSTANCE_qOweNJBctXHO_roomsSearchContainer_col-state-name
{
width:130px
}

#_ConfereneceMaster_WAR_ConfereneceMasterportlet_INSTANCE_qOweNJBctXHO_roomsSearchContainer_col-location-name
{
width:130px
}
#_ConfereneceMaster_WAR_ConfereneceMasterportlet_INSTANCE_qOweNJBctXHO_roomsSearchContainer_col-room-name
{
width: 130px;
}
#_ConfereneceMaster_WAR_ConfereneceMasterportlet_INSTANCE_qOweNJBctXHO_roomsSearchContainer_col-floor-name
   {
   width: 130px;
   }
   #_ConfereneceMaster_WAR_ConfereneceMasterportlet_INSTANCE_qOweNJBctXHO_roomsSearchContainer_col-room-capacity
   {
   width: 130px;
   }
 #_ConfereneceMaster_WAR_ConfereneceMasterportlet_INSTANCE_qOweNJBctXHO_roomsSearchContainer_col-room-extension
 {
 width:130px
 }
</style>
<script>
$(document).ready(function() {
	var stateid=$("#State Id").val();
	
	var state=$('.state').val();
	

})
</script>
<portlet:defineObjects/>
<%     

List<room> list = (List<room>) roomLocalServiceUtil.getrooms(0, roomLocalServiceUtil.getroomsCount());
		System.out.println("List : " + list);
		PortletURL backURL = renderResponse.createRenderURL();
		backURL.setParameter("jspPage", "/html/editDetails.jsp");
		PortletURL iteratorURL = renderResponse.createRenderURL();
		iteratorURL.setParameter("jspPage", "/html/editRoom.jsp");
%>

<liferay-ui:header title="Show Room Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
	<liferay-ui:search-container delta="3" total="<%=roomLocalServiceUtil.getroomsCount()%>" emptyResultsMessage="Sorry ,There is no Record to display"
		iteratorURL="<%=iteratorURL %>">
		
<liferay-ui:search-container-results results="<%=ListUtil.subList(list, searchContainer.getStart(),searchContainer.getEnd())%>" />
			
	
	<liferay-ui:search-container-row  modelVar="list1" className="room">
	
	
	
	<%
	
	state st = stateLocalServiceUtil.getstate(list1.getState_id());
	location lt=locationLocalServiceUtil.getlocation(list1.getLocation_id());
	floorwing fw=floorwingLocalServiceUtil.getfloorwing(list1.getFloor_id());
	%>	
	
	<liferay-ui:search-container-column-text name="State Name" value="<%=st.getState_name()%>" />
	<liferay-ui:search-container-column-text name="Location Name" value="<%=lt.getLocation_name()%>" />
	<liferay-ui:search-container-column-text name="Floor Name" value="<%=fw.getFloor_name()%>" />
	<liferay-ui:search-container-column-text name="Room Name" property="room_name" />
	<liferay-ui:search-container-column-text name="Room Capacity" property="room_capacity" />
	<liferay-ui:search-container-column-text name="Room Extension" property="room_extension" />
	<liferay-ui:search-container-column-text name="Room Facility" property="room_values" />
	<liferay-ui:search-container-column-jsp name="Actions" path="/html/editRoomMenu.jsp"/>
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
	</liferay-ui:search-container>	
	
