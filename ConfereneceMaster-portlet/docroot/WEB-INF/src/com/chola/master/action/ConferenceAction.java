package com.chola.master.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.chola.service.conference.model.facilitymaster;
import com.chola.service.conference.model.floorwing;
import com.chola.service.conference.model.location;
import com.chola.service.conference.model.room;
import com.chola.service.conference.model.state;
import com.chola.service.conference.service.facilitymasterLocalServiceUtil;
import com.chola.service.conference.service.floorwingLocalServiceUtil;
import com.chola.service.conference.service.locationLocalServiceUtil;
import com.chola.service.conference.service.roomLocalServiceUtil;
import com.chola.service.conference.service.stateLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.util.bridges.mvc.MVCPortlet;




public class ConferenceAction extends MVCPortlet
{
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)throws IOException, PortletException 
	{
		try 
		{
		
		if (resourceRequest.getResourceID().equalsIgnoreCase("StateCall"))
		{
			System.out.println("In state call action class.....");
			List<String> lt = locationLocalServiceUtil.getState();
		
		Iterator it = lt.iterator();
		JSONArray jArray = new JSONArray();
		PrintWriter writer = resourceResponse.getWriter();

		while (it.hasNext()) {
		Object[] object = (Object[]) it.next();
		JSONObject obj = new JSONObject();
		obj.put("state_id", object[0].toString());
		obj.put("state_name", object[1].toString());
		jArray.add(obj);
		}

		System.out.println(jArray);
		writer.print(jArray);
		}

			} 
		catch (Exception e)
		{
		e.printStackTrace();
		}
		
		try 
		{
		
		if (resourceRequest.getResourceID().equalsIgnoreCase("locationCall"))
		{
			System.out.println("In location call action class.....");
			String stateId=resourceRequest.getParameter("stateId");
			List<String> lt = locationLocalServiceUtil.getlocations(Long.parseLong(stateId));
		
		Iterator it = lt.iterator();
		JSONArray jArray = new JSONArray();
		PrintWriter writer = resourceResponse.getWriter();

		while (it.hasNext()) {
		Object[] object = (Object[]) it.next();
		JSONObject obj = new JSONObject();
		obj.put("location_id", object[0].toString());
		obj.put("location_name", object[1].toString());
		jArray.add(obj);
		}

		System.out.println(jArray);
		writer.print(jArray);
		}

			} 
		catch (Exception e)
		{
		e.printStackTrace();
		}
		
		try 
		{
		
		if (resourceRequest.getResourceID().equalsIgnoreCase("FloorCall"))
		{
			System.out.println("In state call action class.....");
			
			List<String> lt = locationLocalServiceUtil.getfloorname();
		Iterator it = lt.iterator();
		JSONArray jArray = new JSONArray();
		PrintWriter writer = resourceResponse.getWriter();

		while (it.hasNext()) {
		Object[] object = (Object[]) it.next();
		JSONObject obj = new JSONObject();
		obj.put("floorwing_id", object[0].toString());
		obj.put("floor_name", object[1].toString());
		jArray.add(obj);
		}

		System.out.println(jArray);
		writer.print(jArray);
		}

			} 
		catch (Exception e)
		{
		e.printStackTrace();
		}
		
	}
	//location start
	public void  submitLocation(ActionRequest request,ActionResponse response) throws NumberFormatException, PortalException
	{
		String stateId=request.getParameter("Selectstate");
		System.out.println("State Id.."+stateId);
		String location=request.getParameter("location");
		System.out.println("Location name :"+location);
		
	state st=stateLocalServiceUtil.getstate(Long.parseLong(stateId));
	String statename=st.getState_name();
	System.out.println("State Name::::"+st.getState_name());
		long locationId=ParamUtil.getLong(request, "locationId");
		if(locationId>=01){
			modifiedlocation(request,response,locationId,location,stateId);
			response.setRenderParameter("jspPage","/html/editLocation.jsp");
		}
		else
		{
			location lt=locationLocalServiceUtil.createlocation(CounterLocalServiceUtil.increment());
		lt.setLocation_name(location);
		lt.setState_id(Long.parseLong(stateId));
		lt=locationLocalServiceUtil.addlocation(lt);
		
		}
	}
	private void modifiedlocation(ActionRequest request, ActionResponse response, long locationId, String location,String stateId)
	{
		// TODO Auto-generated method stub
	     System.out.println("edit the forms======");
		
		System.out.println("myyyyy locationId====" + locationId);
		location lt = null;
		try {
			lt=locationLocalServiceUtil.fetchlocation(locationId);
			
			System.out.println(lt);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Validator.isNotNull(lt)) {
			lt.setLocation_name(location);
			lt.setState_id(Long.parseLong(stateId));
			
			try {
			    locationLocalServiceUtil.updatelocation(lt);
				
				System.out.println("Your location Updated Successfully");
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void deletelocationreference(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException
	{
		System.out.println("Delete Vendor======");
		long locationId = ParamUtil.getInteger(actionRequest, "locationId");
		System.out.println("referenceId===" + locationId);
		if (locationId >= 01) {
		
	 	try {
	 		locationLocalServiceUtil.deletelocation(locationId);
	 		
				System.out.println("your deleted successfully");
				actionResponse.setRenderParameter("jspPage","/html/editLocation.jsp");
			
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}
		
	}
	//location end
	public void  submitFloorWing(ActionRequest request,ActionResponse response) throws NumberFormatException, PortalException
	{
		String stateId=request.getParameter("Selectstate");
		System.out.println("State Id.."+stateId);
		
		String locationId=request.getParameter("Selectlocation");
		System.out.println("Location name :"+locationId);
		
		String floorname=request.getParameter("floorname");
		System.out.println("Floor name :"+floorname);
		
		long floorwingId=ParamUtil.getLong(request, "floorwingId");
		
	state st=stateLocalServiceUtil.getstate(Long.parseLong(stateId));
	String statename=st.getState_name();
	System.out.println("State Name::::"+st.getState_name());
		
		if(floorwingId>=01){
			modifiedfloorwing(request,response,floorwingId,stateId,locationId,floorname);
			response.setRenderParameter("jspPage","/html/editFloor.jsp");
		}
		else
		{
			floorwing fw=floorwingLocalServiceUtil.createfloorwing(CounterLocalServiceUtil.increment());
			fw.setState_id(Long.parseLong(stateId));
			fw.setLocation_id(Long.parseLong(locationId));
			fw.setFloor_name(floorname);
			fw=floorwingLocalServiceUtil.addfloorwing(fw);
			
			System.out.println("floor/wing data added successfully");
		
		}
	}
	
	private void modifiedfloorwing(ActionRequest request, ActionResponse response, long floorwingId, String stateId,String locationId,String floorname)
	{
		// TODO Auto-generated method stub
	     System.out.println("edit the forms======");
		
		System.out.println("myyyyy locationId====" + locationId);
		
		floorwing fw=null;
		try {
		
			fw=floorwingLocalServiceUtil.fetchfloorwing(floorwingId);
			
			System.out.println(fw);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Validator.isNotNull(fw)) {
			fw.setState_id(Long.parseLong(stateId));
			fw.setLocation_id(Long.parseLong(locationId));
			fw.setFloor_name(floorname);
			
			
			try {
			    floorwingLocalServiceUtil.updatefloorwing(fw);
				
				System.out.println("Your floor/wing Updated Successfully");
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void deletefloorwingreference(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException
	{
		System.out.println("Delete Vendor======");
		long floorwingId = ParamUtil.getInteger(actionRequest, "floorwingId");
		System.out.println("referenceId===" + floorwingId);
		if (floorwingId >= 01) {
		
	 	try {
	 		floorwingLocalServiceUtil.deletefloorwing(floorwingId);
	 		
	 		
				System.out.println(" deleted successfully");
				actionResponse.setRenderParameter("jspPage","/html/editFloor.jsp");
			
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}
		
	}
	
	public void submitFacilityDetails(ActionRequest request,ActionResponse response)
	{
		
		
		String facilityname=request.getParameter("facilityname");
		System.out.println("Facility Name.."+facilityname);
		
		String description=request.getParameter("description");
		System.out.println("Facility description.."+description);
		
		
		
		long facilityId=ParamUtil.getLong(request, "facilityId");
		System.out.println("Facility Id.."+facilityId);
		if(facilityId>=01)
		{
			modifiedfacility(request,response,facilityId,facilityname,description);
			response.setRenderParameter("jspPage","/html/editFacility.jsp");
		}
		else
		{
		facilitymaster fm=facilitymasterLocalServiceUtil.createfacilitymaster(CounterLocalServiceUtil.increment());
		fm.setFacility_name(facilityname);
		fm.setFacility_description(description);
		fm=facilitymasterLocalServiceUtil.addfacilitymaster(fm);
		System.out.println("success...");
		}
	}
	
	private void modifiedfacility(ActionRequest request, ActionResponse response, long facilityId, String facilityname,String description)
	{
		// TODO Auto-generated method stub
	     System.out.println("edit the forms======");
		
		System.out.println("myyyyy locationId====" + facilityId);
		facilitymaster fw=null;
		
		try 
		{
			fw=facilitymasterLocalServiceUtil.fetchfacilitymaster(facilityId);
			System.out.println(fw);
		} 
		catch (SystemException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Validator.isNotNull(fw)) {
			fw.setFacility_name(facilityname);
			fw.setFacility_description(description);
			
			
			try {
				facilitymasterLocalServiceUtil.updatefacilitymaster(fw);
			   System.out.println("Your location Updated Successfully");
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void deletefacilityreference(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException
	{
		System.out.println("Delete Vendor======");
		long facilityId = ParamUtil.getInteger(actionRequest, "facilityId");
		System.out.println("facilityId===" + facilityId);
		if (facilityId >= 01) {
		
	 	try {
	 		facilitymasterLocalServiceUtil.deletefacilitymaster(facilityId);
	 		
	 		
	 		
				System.out.println(" deleted successfully");
				actionResponse.setRenderParameter("jspPage","/html/editFacility.jsp");
			
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}
		
	}
	
	
	public void  submitRoom(ActionRequest request,ActionResponse response) throws NumberFormatException, PortalException
	{
		String stateId=request.getParameter("Selectstate");
		System.out.println("State Id.."+stateId);
		
		String locationId=request.getParameter("Selectlocation");
		System.out.println("Location name :"+locationId);
		
		String floorId=request.getParameter("Selectfloor");
		System.out.println("Floor name :"+floorId);
		
		String roomname=request.getParameter("roomname");
		System.out.println("Room name :"+roomname);
		
		String capacity=request.getParameter("capacity");
		System.out.println("Room name :"+capacity);
		
		String extension=request.getParameter("extension");
		System.out.println("Extension name :"+extension);
		
		String[] values = ParamUtil.getParameterValues(request, "values",new String[0]);
		
		//String selectedValues=ParamUtil.get(request, "selectedValues", "");
		//System.out.println("selectedValues...."+selectedValues);
		
		System.out.println("values in array..."+values.length);
		if(values.length==0)
		{
			System.out.println("In if condition sessionerrors...");
			SessionErrors.add(request, "error-key");
			SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			response.setRenderParameter("jspPage","/html/addRoom.jsp");
		}
		else
		{
		String availbalevalues=new String();
		
		for(int i=0;i<=values.length-1;i++)
		{
			
			 availbalevalues=availbalevalues.concat(values[i].toString());
			 if(i<=values.length-2)
			 {
				 availbalevalues=availbalevalues.concat(",");
			 }
			 System.out.println("Availbale values........"+availbalevalues);
			System.out.println("valuess "+values[i].toString());
			
			
			
		}
				long roomId=ParamUtil.getLong(request, "roomId");
		
		System.out.println("Availbale final values........"+availbalevalues);
		
	state st=stateLocalServiceUtil.getstate(Long.parseLong(stateId));
	String statename=st.getState_name();
	System.out.println("statename..."+statename);
	
	location ln=locationLocalServiceUtil.getlocation(Long.parseLong(locationId));
	System.out.println("State Name::::"+st.getState_name());
		
		if(roomId>=01){
			modifiedroom(request,response,roomId,stateId,locationId,floorId,roomname,capacity,extension,availbalevalues);
			response.setRenderParameter("jspPage","/html/editRoom.jsp");
		}
		else
		{
			room rm=roomLocalServiceUtil.createroom(CounterLocalServiceUtil.increment());
			rm.setState_id(Long.parseLong(stateId));
			rm.setLocation_id(Long.parseLong(locationId));
			rm.setFloor_id(Long.parseLong(floorId));
			rm.setRoom_name(roomname);
			rm.setRoom_capacity(Long.parseLong(capacity));
			rm.setRoom_extension(Long.parseLong(extension));
			rm.setRoom_values(availbalevalues);
			rm=roomLocalServiceUtil.addroom(rm);
			
			
			
			System.out.println("floor/wing data added successfully");
		
		}
		}
	}
	
	private void modifiedroom(ActionRequest request, ActionResponse response, long roomId, String stateId,String locationId,String floorId,String roomname,String capacity,String extension,String values)
	{
		// TODO Auto-generated method stub
	     System.out.println("edit the forms======");
		
		System.out.println("myyyyy locationId====" + locationId);
		
		room rm=null;
		try 
		{
		     
			rm=roomLocalServiceUtil.fetchroom(roomId);
			System.out.println(rm);
		}
		catch (SystemException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Validator.isNotNull(rm)) 
		{
			rm.setState_id(Long.parseLong(stateId));
			rm.setLocation_id(Long.parseLong(locationId));
			rm.setFloor_id(Long.parseLong(floorId));
			rm.setRoom_name(roomname);
			rm.setRoom_capacity(Long.parseLong(capacity));
			rm.setRoom_extension(Long.parseLong(extension));
			rm.setRoom_values(values);
			try 
			{
			   roomLocalServiceUtil.updateroom(rm);
			   
				
				System.out.println("Your floor/wing Updated Successfully");
			} 
			catch (SystemException e) 
			{

				e.printStackTrace();
			}
		}
	}
	
	public void deleteroomreference(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException
	{
		System.out.println("Delete Vendor======");
		long roomId = ParamUtil.getInteger(actionRequest, "roomId");
		System.out.println("facilityId===" + roomId);
		if (roomId >= 01) {
		
	 	try {
	 		roomLocalServiceUtil.deleteroom(roomId);
	 		
				System.out.println(" deleted successfully");
				actionResponse.setRenderParameter("jspPage","/html/editRoom.jsp");
			
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}
		
	}

	}
