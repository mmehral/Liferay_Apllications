<%@page import="java.util.ArrayList"%>
<%@page
	import="com.chola.service.conference.service.facilitymasterLocalServiceUtil"%>
<%@page import="com.chola.service.conference.model.facilitymaster"%>
<%@page import="com.liferay.portal.kernel.util.KeyValuePair"%>
<%@page import="java.util.List"%>
<%@page
	import="com.chola.service.conference.service.roomLocalServiceUtil"%>
<%@page import="com.chola.service.conference.model.room"%>
<%@page
	import="com.chola.service.conference.service.stateLocalServiceUtil"%>
<%@page
	import="com.chola.service.conference.service.locationLocalServiceUtil"%>
<%@page import="com.chola.service.conference.model.location"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<portlet:defineObjects />


<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script>
	$(document)
			.ready(
					function() {
						$
								.ajax({

									url : "<portlet:resourceURL id='StateCall'/>",
									type : 'POST',
									dataType : 'json',
									success : function(data) {
										console.log(JSON.stringify(data));
										for ( var i in data) {
											$("#state")
													.append(
															"<option value=" + data[i].state_id + ">"
																	+ data[i].state_name
																	+ "</option>");
										}
									},
									error : function() {
										console
												.log("There was an error. Try again please!");
									}
								});

						$("#state")
								.change(
										function() {

											$('#location').empty();
											var stateId = $(this).val();

											$
													.ajax({

														url : "<portlet:resourceURL id='locationCall'/>",
														type : 'POST',
														dataType : 'json',
														data : {
															stateId : stateId
														},
														success : function(data) {
															console
																	.log(JSON
																			.stringify(data));
															$("#location")
																	.append(
																			"<option value=" + "" + ">Select Location </option>");
															for ( var i in data) {
																$("#location")
																		.append(
																				"<option value=" + data[i].location_id + ">"
																						+ data[i].location_name
																						+ "</option>");
															}
														},
														error : function() {
															console
																	.log("There was an error. Try again please!");
														}
													});

										});

					});
	$(document)
			.ready(
					function() {
						$
								.ajax({

									url : "<portlet:resourceURL id='FloorCall'/>",
									type : 'POST',
									dataType : 'json',
									success : function(data) {
										console.log(JSON.stringify(data));
										for ( var i in data) {
											$("#floor")
													.append(
															"<option value=" + data[i].floorwing_id + ">"
																	+ data[i].floor_name
																	+ "</option>");
										}
									},
									error : function() {
										console
												.log("There was an error. Try again please!");
									}
								});
					});
</script>
<%
	List<KeyValuePair> rightList = new ArrayList<KeyValuePair>();

	long roomId = ParamUtil.getInteger(request, "roomId");
	String list1 = locationLocalServiceUtil.getroomvalues(roomId);
	System.out.println("list 1..........." + list1.length());
	String[] list2 = list1.split(",");

	System.out.println("length with separated...." + list2.length);

	System.out.println("List with separated...." + list2.toString());
	for (int i = 0; i <= list2.length - 1; i++) {

		System.out.println("in for loop list 2...... " + list2[i].toString());
		rightList.add(new KeyValuePair(list2[i].toString(), list2[i].toString()));
	}

	List<facilitymaster> list = facilitymasterLocalServiceUtil.getfacilitymasters(0,
			facilitymasterLocalServiceUtil.getfacilitymastersCount());

	System.out.print("List of facility......." + list);

	List<KeyValuePair> leftList = new ArrayList<KeyValuePair>();

	for (facilitymaster fw : list) {
		boolean flag = true;
		for (int i = 0; i <= list2.length - 1; i++) {
			if (list2[i].toString().equals(fw.getFacility_name())) {
				System.out.println("same=======");
				flag = false;
			}
	
		}
		System.out.println("flag======="+flag);
		if (flag) {
			System.out.println("different=======");
			leftList.add(new KeyValuePair(fw.getFacility_name(), fw.getFacility_name()));
		}
	}
%>

<%
	String stateName = null;
	String locationname = null;
	String floorname = null;
	//long roomId = ParamUtil.getInteger(request, "roomId");
	room rm = roomLocalServiceUtil.getroom(roomId);

	System.out.println("room Id======" + roomId);
	stateName = locationLocalServiceUtil.getStatename(rm.getState_id());
	locationname = locationLocalServiceUtil.getlocationname(rm.getLocation_id());
	floorname = locationLocalServiceUtil.getfloorname(rm.getFloor_id());

	System.out.println("State Id.." + rm.getState_id());
	System.out.println("Location Id.." + rm.getLocation_id());
	System.out.println("Floor Id.." + rm.getFloor_id());

	System.out.println("State name.." + stateName);
	System.out.println("Location name.." + locationname);
	System.out.println("Floor name.." + floorname);
	if (roomId >= 01) {
		System.out.print("...........room id.........." + roomId);
		System.out.println("####" + rm);

	}
%>
<%
	PortletURL backURL = renderResponse.createRenderURL();
	backURL.setParameter("jspPage", "/html/editRoom.jsp");
%>
<liferay-ui:header title="Edit Room Details"
	backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
<portlet:actionURL var="action" name="submitRoom"></portlet:actionURL>

<aui:form action="${action}" method="post">

	<input type="hidden" name="roomId" value="<%=rm.getRoom_id()%>">
	<br />

Select State :<select required="required" id="state" name="Selectstate">
		<option value="<%=rm.getState_id()%>"><%=stateName%></option>
	</select>
	<br>
	<br>

Select Location :<select required="required" id="location"
		name="Selectlocation">
		<option value="<%=rm.getLocation_id()%>"><%=locationname%></option>
	</select>
	<hr>

Select Floor :<select required="required" id="floor" name="Selectfloor">
		<option value="<%=rm.getFloor_id()%>"><%=floorname%></option>
	</select>
	<hr>

	<aui:input type="text" name="roomname" label="Enter Room"
		value="<%=rm.getRoom_name()%>">
		<aui:validator name="alpha" />
		<aui:validator name="required"></aui:validator>
	</aui:input>
	<br>
	<br>

	<aui:input type="text" name="capacity" label="Enter Capacity"
		value="<%=rm.getRoom_capacity()%>">
		<aui:validator name="digits" />
		<aui:validator name="required"></aui:validator>
	</aui:input>
	<br>
	<br>

	<aui:input type="text" name="extension" label="Enter Extension"
		value="<%=rm.getRoom_extension()%>">
		<aui:validator name="digits" />
		<aui:validator name="required"></aui:validator>
	</aui:input>
	<br>
	<br>

	<aui:input name="values" type="hidden" />
	<liferay-ui:input-move-boxes leftBoxName="availableValues"
		leftList="<%=leftList%>" leftReorder="true" leftTitle="available"
		rightBoxName="selectedValues" rightList="<%=rightList%>"
		rightTitle="selected" />

	<aui:button type="submit" value="Edit Room" />

</aui:form>

<aui:script use="liferay-util-list-fields">
	A.one('#<portlet:namespace/>fm').on(
			'submit',
			function(event) {
				var selectedValues = Liferay.Util
						.listSelect('#<portlet:namespace/>selectedValues');
				A.one('#<portlet:namespace/>values').val(selectedValues);
				submitForm('#<portlet:namespace/>fm');
			});
</aui:script>
	










