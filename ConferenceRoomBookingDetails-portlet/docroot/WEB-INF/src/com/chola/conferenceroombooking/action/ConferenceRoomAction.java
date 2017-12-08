package com.chola.conferenceroombooking.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.chola.conferenceroombooking.model.conferenceroombookingdetails;
import com.chola.conferenceroombooking.model.facilitymaster;
import com.chola.conferenceroombooking.model.floorwing;
import com.chola.conferenceroombooking.model.location;
import com.chola.conferenceroombooking.model.room;
import com.chola.conferenceroombooking.model.state;
import com.chola.conferenceroombooking.service.conferenceroombookingdetailsLocalServiceUtil;
import com.chola.conferenceroombooking.service.facilitymasterLocalServiceUtil;
import com.chola.conferenceroombooking.service.floorwingLocalServiceUtil;
import com.chola.conferenceroombooking.service.locationLocalServiceUtil;
import com.chola.conferenceroombooking.service.roomLocalServiceUtil;
import com.chola.conferenceroombooking.service.stateLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

public class ConferenceRoomAction extends MVCPortlet
{
	private static Log logger = LogFactoryUtil.getLog(ConferenceRoomAction.class);
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException
	{
		
		logger.info("Conference Room Ajax call......");
		
		logger.info("ID : " + resourceRequest.getResourceID());
		
		if ("conferenceStateCall".equalsIgnoreCase(resourceRequest.getResourceID())) {
			String stateid = resourceRequest.getParameter("stateid");
            
			logger.info("State Id : " + stateid);
		

			List<Object[]> lt = conferenceroombookingdetailsLocalServiceUtil.location(Integer.parseInt(stateid));
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

		
			logger.info("jArray");
			writer.print(jArray);
		}

		if ("RoomMaster".equalsIgnoreCase(resourceRequest.getResourceID())) 
		{
			String stateid = resourceRequest.getParameter("stateid");
			String loctionid = resourceRequest.getParameter("loctionid");
			String startDate = resourceRequest.getParameter("startDate");
			
			String starthour = resourceRequest.getParameter("starthour");
			String startmint = resourceRequest.getParameter("startmint");
			String startPM = resourceRequest.getParameter("startPM");
			String endhour = resourceRequest.getParameter("endhour");
			String endmint = resourceRequest.getParameter("endmint");
			String endPM = resourceRequest.getParameter("endPM");

			logger.info("State Id==" + stateid);
			logger.info("Location Id==" + loctionid);
			logger.info("StartDate==" + startDate);
			logger.info("State Hour====" + starthour);
			logger.info("State Min====" + startmint);
			logger.info("State Pm====" + startPM);
			logger.info("End Hour====" + endhour);
			logger.info("End Mint====" + endmint);
			logger.info("End PM====" + endPM);
			
		
			

			List<Object[]> lt = conferenceroombookingdetailsLocalServiceUtil.conferenceroom(Integer.parseInt(stateid),
					Integer.parseInt(loctionid));
			Iterator it = lt.iterator();
			JSONArray jArray = new JSONArray();
			PrintWriter writer = resourceResponse.getWriter();
			while (it.hasNext()) {
				Object[] object = (Object[]) it.next();
				JSONObject obj = new JSONObject();
				obj.put("room_id", object[0].toString());
				obj.put("room_name", object[1].toString());
				obj.put("room_desc", object[2].toString());
				obj.put("room_capacity", object[3].toString());
				obj.put("room_extension", object[4].toString());
				obj.put("room_facility", object[5].toString());
				jArray.add(obj);
			}

			//System.out.println(jArray);
			logger.info(jArray);
			writer.print(jArray);
		}

		if ("getvalidation".equalsIgnoreCase(resourceRequest.getResourceID())) {
			boolean flag1 = false;
			boolean flag2 = false;
			boolean flag = false;
			String strthr = resourceRequest.getParameter("strthr");
			String endhr = resourceRequest.getParameter("endhr");
			String strtmnt = resourceRequest.getParameter("strtmnt");
			String endmnt = resourceRequest.getParameter("endmnt");

			String time1 = strthr + ":" + strtmnt;
			String time2 = endhr + ":" + endmnt;

			String time3 = resourceRequest.getParameter("meetstrthr");
			String time4 = resourceRequest.getParameter("meetstrtmin");

			logger.info("strthr==" + strthr);
			logger.info("endhr==" + endhr);
			logger.info("strtmnt==" + strtmnt);
			logger.info("endmnt==" + endmnt);
			logger.info("Startime and Min===" + time1);
			logger.info("Endtime and Min===" + time2);
			logger.info("Meeting Startime and Min===" + time3);
			logger.info("Meeting....Startime and Min===" + time4);
			
			//System.out.println("strthr==" + strthr);
			//System.out.println("endhr==" + endhr);
			//System.out.println("strtmnt==" + strtmnt);
			//System.out.println("endmnt==" + endmnt);
			//System.out.println("Startime and Min===" + time1);
			//System.out.println("Endtime and Min===" + time2);
			//System.out.println("Meeting Startime and Min===" + time3);
			//System.out.println("Meeting....Startime and Min===" + time4);
			flag1 = CompareMeetingDetails.getComparevalue(time3, time1);
			flag2 = CompareMeetingDetails.getComparevalue(time2, time4);
			PrintWriter writer = resourceResponse.getWriter();
			if (flag1 && flag2) {
				logger.info("Time is matching,,,,,,,");
				//System.out.println("Time is matching,,,,,,,");
				flag = true;
			} else {
				logger.info("time is not matching......");
				//System.out.println("time is not matching......");
				flag = false;
			}

			writer.print(flag);
		}

		
		try 
		{
		
		if ("StateCalls".equalsIgnoreCase(resourceRequest.getResourceID()))
		{
			logger.info("In state call action class.....");
			
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
		logger.info(jArray);
		
		writer.print(jArray);
		}

			} 
		catch (Exception e)
		{
			logger.info("contextt", e);
		
		}
		
		try 
		{
		
		if ("locationCall".equalsIgnoreCase(resourceRequest.getResourceID()))
		{
			logger.info("In location call action class.....");
		
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
		logger.info(jArray);
		
		writer.print(jArray);
		}

			} 
		catch (Exception e)
		{
			logger.info("contextt", e);
		
		}
		
		try 
		{
		
		if ("FloorCall".equalsIgnoreCase(resourceRequest.getResourceID()))
		{
			logger.info("In state call action class.....");
			
			
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
		logger.info(jArray);
		
		writer.print(jArray);
		}

			} 
		catch (Exception e)
		{
			logger.info("context", e);
		
		}		
	}

	public void getConferenceRoomList(ActionRequest actionRequest, ActionResponse actionResponse)
	{
		logger.info("getConferenceRoomList========");
		//System.out.println("getConferenceRoomList========");
		List strtime = null;
		List endtime = null;
		List cnflst = new ArrayList();
		boolean cmpflag = false;
		String diff = null;
		String roomname = null;
		String floor = null;
		String facility = null;
		String capcity = null;
		String extension = null;

		Integer stateid = null;
		Integer locid = null;
		String srtdate = null;
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");

		// Step 1 geting all values from form fields
		String state = ParamUtil.getString(actionRequest, "state");
		String location = ParamUtil.getString(actionRequest, "location");
		String startDate = ParamUtil.getString(actionRequest, "startDate");
		String starthour = ParamUtil.getString(actionRequest, "starthour");
		String startmint = ParamUtil.getString(actionRequest, "startmint");
		String endhour = ParamUtil.getString(actionRequest, "endhour");
		String endmint = ParamUtil.getString(actionRequest, "endmint");
		String starttm = starthour + ":" + startmint;
		String endtm = endhour + ":" + endmint;
		logger.info("State Id====" + state);
		logger.info("Location Id====" + location);
		logger.info("StartDate====" + startDate);
		logger.info("State Time====" + starttm);
		logger.info("End Time====" + endtm);
		
		//System.out.println("State Id====" + state);
		//System.out.println("Location Id====" + location);
		//System.out.println("StartDate====" + startDate);
		//System.out.println("State Time====" + starttm);
		//System.out.println("End Time====" + endtm);
		if (!state.isEmpty()) {
			stateid = Integer.parseInt(state);
		}
		if (!location.isEmpty()) {
			locid = Integer.parseInt(location);
		}

		try {
			Date strtdt = format.parse(startDate);
			srtdate = format1.format(strtdt);
		} catch (ParseException e) 
		{
			logger.info("context", e);
			//e.printStackTrace();
		}

		List<Long> list = conferenceroombookingdetailsLocalServiceUtil.getroomId(stateid, locid);
		List<BookListPojo> bookListPojos = new ArrayList<BookListPojo>();
		logger.info("list");
		

		// Step 2 Fetching the Room Id from the Loop......
		for (Long l : list) {
			logger.info("Room Id=====" + l);
			
			
			int rmid = l.intValue();
			// Step 3 Geting the list of values from starttime and gettime in
			List<Object[]> conflist = conferenceroombookingdetailsLocalServiceUtil.getConferenceList(starttm, endtm,
					rmid, srtdate);
			Object[] obj1 = conferenceroombookingdetailsLocalServiceUtil.getRoomMaster(stateid, locid, rmid);
			logger.info("state id.....>>>>>"+obj1[0].toString());
			logger.info("location id.....>>>>>"+obj1[1].toString());
			logger.info("floor id.....>>>>>"+obj1[3].toString());
			
			
			String statename=null;
			String loactionname=null;
			String floorname=null;
			
			statename=conferenceroombookingdetailsLocalServiceUtil.getStatename(Long.parseLong(obj1[0].toString()));
			loactionname=conferenceroombookingdetailsLocalServiceUtil.getlocationname(Long.parseLong(obj1[1].toString()));
			floorname=conferenceroombookingdetailsLocalServiceUtil.getfloorname(Long.parseLong(obj1[3].toString()));
			
			logger.info("statename.....>>>>>"+statename);
			logger.info("loactionname.....>>>>>"+loactionname);
			logger.info("floorname.....>>>>>"+floorname);
			logger.info("List=====" + conflist.size());
			
		
			int size = conflist.size();
			// Step 4 Check for Book details List size
			if (size != 0) {
				strtime = new ArrayList();
				endtime = new ArrayList();
				for (Object[] obj : conflist) {
					strtime.add(obj[2].toString());
					endtime.add(obj[3].toString());
				}
				logger.info("Startime====" + strtime);
				logger.info("Endtime====" + endtime);
				
				
				// Step 5 This is For loop for get the list
				for (int i = 0; i < strtime.size(); i++) {
					BookListPojo pojo = null;
					// This condition for starting loop
					if (i == 0) {
						// Comparing the Startime and endtime is flag is true
						// ...false
						cmpflag = CompareNumber.getComparevalue(starttm, strtime.get(0).toString());
						logger.info("Compare number===>>" + cmpflag);
						
						if (cmpflag) {
							diff = TimeSlot.getTimeslots(starttm, strtime.get(0).toString());
							logger.info("diff====" + diff);
							
							if (!diff.equals("0:0")) {
								
								String endslot = AddTimeSlot.getAddTimeSlot(starttm, diff);
								logger.info("Start Time...." + starttm);
								logger.info("End Time..." + endslot);
								
								pojo = new BookListPojo();
								pojo.setStartime(starttm);
								pojo.setEndtime(endslot);
								pojo.setRoomid(rmid);
								pojo.setStardate(startDate);
								logger.info("Set State Id before state name...."+(obj1[0].toString()));
								logger.info("state name.."+statename);
							
								pojo.setStatename(statename);
								logger.info("location name.."+loactionname);
								
								pojo.setLocname(loactionname);
								pojo.setRoomname(obj1[2].toString());
								logger.info("floor name.."+floorname);
							
								pojo.setFloor(floorname);
								pojo.setFacility(obj1[4].toString());
								pojo.setCapcity(obj1[5].toString());
								pojo.setExtension(obj1[6].toString());
								bookListPojos.add(pojo);
								logger.info("data added successfully....");
								
							}
						}

						if (strtime.size() == (i + 1)) {
							cmpflag = CompareNumber.getComparevalue(endtime.get(i).toString(), endtm);
							logger.info("Compare..number=====" + cmpflag);
							
							if (cmpflag) {
								diff = TimeSlot.getTimeslots(endtime.get(i).toString(), endtm);
								if (!diff.equals("0:0")) {
									String endslot = AddTimeSlot.getAddTimeSlot(endtime.get(i).toString(), diff);
									logger.info("Start Time>>>" + endtime.get(i).toString());
									logger.info("End Time>>>" + endslot);
									
									pojo = new BookListPojo();
									pojo.setStartime(endtime.get(i).toString());
									pojo.setEndtime(endslot);
									pojo.setRoomid(rmid);
									pojo.setStardate(startDate);
									logger.info("Set State Id.."+(obj1[0].toString()));
									
									pojo.setStatename(statename);
									pojo.setLocname(loactionname);
									pojo.setRoomname(obj1[2].toString());
									pojo.setFloor(floorname);
									pojo.setFacility(obj1[4].toString());
									pojo.setCapcity(obj1[5].toString());
									pojo.setExtension(obj1[6].toString());

									bookListPojos.add(pojo);
								}
							}
						}

					} else {
						
						diff = TimeSlot.getTimeslots(endtime.get(i - 1).toString(), strtime.get(i).toString());
						if (!diff.equals("0:0")) {
							
							String avail = AddTimeSlot.getAddTimeSlot(endtime.get(i - 1).toString(), diff);
							logger.info("Start Time......" + endtime.get(i - 1).toString());
							logger.info("End Time........" + avail);
							
							pojo = new BookListPojo();
							pojo.setStartime(endtime.get(i - 1).toString());
							pojo.setEndtime(avail);
							pojo.setRoomid(rmid);
							pojo.setStardate(startDate);
							logger.info("Set State Id "+(obj1[0].toString()));
							
							pojo.setStatename(statename);
							pojo.setLocname(loactionname);
							pojo.setRoomname(obj1[2].toString());
							pojo.setFloor(floorname);
							pojo.setFacility(obj1[4].toString());
							pojo.setCapcity(obj1[5].toString());
							pojo.setExtension(obj1[6].toString());

							bookListPojos.add(pojo);
						}

						if (strtime.size() == (i + 1))
						{
							cmpflag = CompareNumber.getComparevalue(endtime.get(i).toString(), endtm);
							logger.info("Compare..number=" + cmpflag);
						
							if (cmpflag)
							{
								diff = TimeSlot.getTimeslots(endtime.get(i).toString(), endtm);
								if (!diff.equals("0:0")) 
								{
									String endslot = AddTimeSlot.getAddTimeSlot(endtime.get(i).toString(), diff);
									logger.info("Start Time......" + endtime.get(i).toString());
									logger.info("End Time........" + endslot);
									
									pojo = new BookListPojo();
									pojo.setStartime(endtime.get(i).toString());
									pojo.setEndtime(endslot);
									pojo.setRoomid(rmid);
									pojo.setStardate(startDate);
									logger.info("Set State Id "+(obj1[0].toString()));
									
									pojo.setStatename(statename);
									pojo.setLocname(loactionname);
									pojo.setRoomname(obj1[2].toString());
									pojo.setFloor(floorname);
									pojo.setFacility(obj1[4].toString());
									pojo.setCapcity(obj1[5].toString());
									pojo.setExtension(obj1[6].toString());

									bookListPojos.add(pojo);
								}
							}
						}

					}

				}

			} 
			else 
			{
				
				BookListPojo pojo = new BookListPojo();
				pojo.setStartime(starttm);
				pojo.setEndtime(endtm);
				pojo.setRoomid(rmid);
				pojo.setStardate(startDate);
				logger.info("Set State Id "+(obj1[0].toString()));
				
				pojo.setStatename(statename);
				pojo.setLocname(loactionname);
				pojo.setRoomname(obj1[2].toString());
				pojo.setFloor(floorname);
				pojo.setFacility(obj1[4].toString());
				pojo.setCapcity(obj1[5].toString());
				pojo.setExtension(obj1[6].toString());

				bookListPojos.add(pojo);
			}

		}
		logger.info(bookListPojos.size() + "##########");
		
		for (BookListPojo b : bookListPojos) {
			logger.info("Sttttttt" + b.getStartime());
			logger.info("Enddddd" + b.getEndtime());
			logger.info("StateName" + b.getStatename());
			logger.info("Location" + b.getLocname());
			logger.info("Room Name" + b.getRoomname());
			logger.info("Floor" + b.getFloor());
			logger.info("Facility" + b.getFacility());
			logger.info("Capacity" + b.getCapcity());
			logger.info("Extension" + b.getExtension());
			logger.info("Room Id======" + b.getRoomid());
			logger.info("Start Date======" + b.getStardate());
			
			
		}
		actionRequest.setAttribute("check", "1");
		actionRequest.setAttribute("list", bookListPojos);
		actionResponse.setRenderParameter("jspPage", "/html/view.jsp");
	}

	public void getradio(ActionRequest actionRequest) 
	{
		logger.info("Radio,,,,,,,,");
		
		String val = ParamUtil.getString(actionRequest, "val");
		String uname = ParamUtil.getString(actionRequest, "uname");
		logger.info("val======" + val);
		
		logger.info("uname====" + uname);
		
		if (val.equalsIgnoreCase("on")) 
		{
			logger.info("SSSS");
			
		} 
		else
		{
			logger.info("WWWW");
			
		}
	}

	public void getBookingDetails(ActionRequest actionRequest, ActionResponse actionResponse) 
	{
		logger.info("getBookingDetails========");
		
		String bookinglist = ParamUtil.getString(actionRequest, "bookinglist");
		logger.info("Booking List=====" + bookinglist);
		
		Integer bookingId = Integer.parseInt(bookinglist);
		BookListPojo pojo = null;
		
		for (int i = 0; i < bookingId; i++)
		{
			String flag = actionRequest.getParameter("bookid");
			logger.info("i========" + flag);
			
			if (flag != null) 
			{
				int chck = Integer.parseInt(flag);
				if (i == chck) 
				{
					logger.info("Not Nulllll");
					

					String statename = actionRequest.getParameter("statename_" + i);
					String location = actionRequest.getParameter("location_" + i);
					String startime = actionRequest.getParameter("startime_" + i);
					String endtime = actionRequest.getParameter("endtime_" + i);
					String roomname = actionRequest.getParameter("roomname_" + i);
					String floor = actionRequest.getParameter("floor_" + i);
					String facility = actionRequest.getParameter("facility_" + i);
					String capacity = actionRequest.getParameter("capacity_" + i);
					String extension = actionRequest.getParameter("extension_" + i);
					String roomid = actionRequest.getParameter("roomid_" + i);
					String startdate = actionRequest.getParameter("startdate_" + i);
					pojo = new BookListPojo();
					pojo.setStartime(startime);
					pojo.setEndtime(endtime);
					pojo.setStatename(statename);
					pojo.setLocname(location);
					pojo.setRoomname(roomname);
					pojo.setFloor(floor);
					pojo.setFacility(facility);
					pojo.setCapcity(capacity);
					pojo.setExtension(extension);
					pojo.setStardate(startdate);
					
					if (!roomid.isEmpty())
					{
						pojo.setRoomid(Integer.parseInt(roomid));
					}
					logger.info("DSFSDFSDFSDFSDF");
					
					actionRequest.setAttribute("pojo", pojo);

				}
				else 
				{
					logger.info("NULLLLLLLLLLLLLLL");
					
				}
			}
		}

		actionResponse.setRenderParameter("jspPage", "/html/meetingdetails.jsp");
	}

	// This Method is for Adding Booking Details
	public void getAddBookingList(ActionRequest actionRequest, ActionResponse actionResponse)
	{
		logger.info("getAddBookingList=======");
		
		Date strdate = null;
		Integer roomId = ParamUtil.getInteger(actionRequest, "roomId");
		String starthour = ParamUtil.getString(actionRequest, "starthour");
		String startmint = ParamUtil.getString(actionRequest, "startmint");
		String endhour = ParamUtil.getString(actionRequest, "endhour");
		String endmint = ParamUtil.getString(actionRequest, "endmint");
		String emailid = ParamUtil.getString(actionRequest, "emailid");
		String title = ParamUtil.getString(actionRequest, "title");
		String agenda = ParamUtil.getString(actionRequest, "agenda");
		String startdate = ParamUtil.getString(actionRequest, "startdate");
		String username = ParamUtil.getString(actionRequest, "username");
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		try
		{
			strdate = format.parse(startdate);
		} 
		catch (ParseException e) 
		{
			logger.info("context", e);
			
		}
		logger.info("Room-----" + roomId);
		logger.info("StartHour-----" + starthour);
		
		String starttm = starthour + ":" + startmint;
		String endtm = endhour + ":" + endmint;

		conferenceroombookingdetails details = conferenceroombookingdetailsLocalServiceUtil
				.createconferenceroombookingdetails(CounterLocalServiceUtil.increment());
		details.setStartdate(strdate);
		details.setStartime(starttm);
		details.setEndtime(endtm);
		details.setRoomid(roomId);
		details.setStatus(1);
		details.setCreatedate(new Date());
		details.setMeeting_emailid(emailid);
		details.setMeeting_title(title);
		details.setMeeting_agenda(agenda);
		details.setUsername(username);
		details.setUserid(themeDisplay.getUserId());
	    conferenceroombookingdetailsLocalServiceUtil.addconferenceroombookingdetails(details);
		actionResponse.setRenderParameter("jspPage", "/html/view.jsp");
	}

	public void deleteMybooking(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException
	{
		logger.info("deleteMybooking=======");
		
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		Long bookid = ParamUtil.getLong(actionRequest, "roomid");
		logger.info("Book Id=======" + bookid);
		
		conferenceroombookingdetailsLocalServiceUtil.deleteconferenceroombookingdetails(bookid);
		logger.info("Successfully....updated...");
	
		actionResponse.setRenderParameter("jspPage", "/html/mybooking.jsp");
	}
	
	
	public void deleteMybooking1(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException
	{
		logger.info("deleteMybooking=======");
		
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		Long bookid = ParamUtil.getLong(actionRequest, "roomid");
		logger.info("Book Id=======" + bookid);
		
		conferenceroombookingdetailsLocalServiceUtil.deleteconferenceroombookingdetails(bookid);
		logger.info("Successfully....updated...");
	
		actionResponse.setRenderParameter("jspPage", "/html/allbookinglist.jsp");
	}

	// This Method is for All Booking List........
	public void getALLBookingList(ActionRequest actionRequest, ActionResponse actionResponse)
	{
		logger.info("getALLBookingList========");
	
		// Step 1 geting all values from form fields
		String srtdate = null;
		String enddate = null;
		String state = ParamUtil.getString(actionRequest, "state");
		String location = ParamUtil.getString(actionRequest, "location");
		String startDate = ParamUtil.getString(actionRequest, "startDate");
		String endDate = ParamUtil.getString(actionRequest, "endDate");
		logger.info("State Id====" + state);
		logger.info("Location Id====" + location);
		logger.info("StartDate====" + startDate);
		logger.info("EndDate====" + endDate);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		try
		{
			Date strtdt = format.parse(startDate);
			srtdate = format1.format(strtdt);
		} 
		catch (ParseException e)
		{
			
			logger.info("context", e);
		}
		try 
		{
			Date enddt = format.parse(endDate);
			enddate = format1.format(enddt);
		} 
		catch (ParseException e) 
		{
			logger.info("context", e);

			
		}
		List<Object[]> list = conferenceroombookingdetailsLocalServiceUtil.allBookingList(srtdate, enddate, state, location);
		actionRequest.setAttribute("check", "1");
		actionRequest.setAttribute("alllist", list);
		actionResponse.setRenderParameter("jspPage", "/html/allbookinglist.jsp");
	}
	
	
	

	
	//location start
	public void  submitLocation(ActionRequest request,ActionResponse response) throws NumberFormatException, PortalException
	{
		String stateId=request.getParameter("Selectstate");
		logger.info("State Id>>"+stateId);
		
		String location=request.getParameter("location");
		logger.info("Location name>>"+location);
		
		
	
	
		long locationId=ParamUtil.getLong(request, "locationId");
		logger.info("In locationid>>"+locationId);
		if(locationId>=01){
			logger.info("In if>>");
			modifiedlocation(locationId,location,stateId);
			response.setRenderParameter("jspPage","/html/editLocation.jsp");
		}
		else
		{
			logger.info("In else>>");
			location lt=locationLocalServiceUtil.createlocation(CounterLocalServiceUtil.increment());
		lt.setLocation_name(location);
		lt.setState_id(Long.parseLong(stateId));
		locationLocalServiceUtil.addlocation(lt);
		
		}
	}
	private void modifiedlocation(long locationId, String location,String stateId)
	{
		logger.info("edit the forms>>");
	    
	     logger.info("Location Id>>" + locationId);
		
		location lt = null;
		try {
			lt=locationLocalServiceUtil.fetchlocation(locationId);
			if (Validator.isNotNull(lt)) 
			{
				lt.setLocation_name(location);
				lt.setState_id(Long.parseLong(stateId));
				 locationLocalServiceUtil.updatelocation(lt);
				    logger.info("Your location Updated Successfully");
				
			logger.info(lt);
			
		} }catch (SystemException e) {
			logger.info("context", e);
			
		}
		
	}
	public void deletelocationreference(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException
	{
		logger.info("Delete Vendor...======");
		
		long locationId = ParamUtil.getInteger(actionRequest, "locationId");
		logger.info("referenceId===" + locationId);
		
		if (locationId >= 01) {
		
	 	try {
	 		locationLocalServiceUtil.deletelocation(locationId);
	 		logger.info("your deleted successfully");
				
				actionResponse.setRenderParameter("jspPage","/html/editLocation.jsp");
			
			} catch (PortalException e)
	 		{
				logger.info("context", e);
	
			} 
	 	catch (SystemException e1) {
	 		logger.info("context", e1);
				
			}
				
		}
		
	}
	//location end
	public void  submitFloorWing(ActionRequest request,ActionResponse response) throws NumberFormatException, PortalException
	{
		String stateId=request.getParameter("Selectstate");
		logger.info("State Id.."+stateId);
		
		
		String locationId=request.getParameter("Selectlocation");
		logger.info("Location name :"+locationId);
		
		
		String floorname=request.getParameter("floorname");
		logger.info("Floor name :"+floorname);
		
		
		long floorwingId=ParamUtil.getLong(request, "floorwingId");
		
	
	
		
		if(floorwingId>=01){
			modifiedfloorwing(floorwingId,stateId,locationId,floorname);
			response.setRenderParameter("jspPage","/html/editFloor.jsp");
		}
		else
		{
			floorwing fw=floorwingLocalServiceUtil.createfloorwing(CounterLocalServiceUtil.increment());
			fw.setState_id(Long.parseLong(stateId));
			fw.setLocation_id(Long.parseLong(locationId));
			fw.setFloor_name(floorname);
			floorwingLocalServiceUtil.addfloorwing(fw);
			logger.info("floor/wing data added successfully");
		
		
		}
	}
	
	private void modifiedfloorwing(long floorwingId, String stateId,String locationId,String floorname)
	{
		logger.info("edit the forms>>>>");
	     
	     logger.info("myyyyy locationId>>>" + locationId);
		
		
		floorwing fw=null;
		try {
		
			fw=floorwingLocalServiceUtil.fetchfloorwing(floorwingId);
			logger.info(fw);
			
		} catch (SystemException e) {
			logger.info("context", e);
			
		}
		if (Validator.isNotNull(fw)) {
			fw.setState_id(Long.parseLong(stateId));
			fw.setLocation_id(Long.parseLong(locationId));
			fw.setFloor_name(floorname);
			
			
			try {
			    floorwingLocalServiceUtil.updatefloorwing(fw);
			    logger.info("Your floor/wing Updated Successfully");
				
			}
			catch (SystemException e) 
			{
				logger.info("context", e);
				
			}
		}
	}
	
	public void deletefloorwingreference(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException
	{
		logger.info("Delete Vendor>>");
		
		long floorwingId = ParamUtil.getInteger(actionRequest, "floorwingId");
		logger.info("referenceId===" + floorwingId);
		
		if (floorwingId >= 01) {
		
	 	try {
	 		floorwingLocalServiceUtil.deletefloorwing(floorwingId);
	 		
	 		logger.info(" deleted successfully");
				
				actionResponse.setRenderParameter("jspPage","/html/editFloor.jsp");
			
			}
	 	catch (PortalException e)
	 	{
	 		logger.info("context", e);
				
			} 
	 	catch (SystemException e1)
	 	{
	 		logger.info("context", e1);
				
			}
				
		}
		
	}
	
	public void submitFacilityDetails(ActionRequest request,ActionResponse response)
	{
		
		
		String facilityname=request.getParameter("facilityname");
		logger.info("Facility Name.."+facilityname);
		
		
		String description=request.getParameter("description");
		logger.info("Facility description.."+description);
		
		long facilityId=ParamUtil.getLong(request, "facilityId");
		logger.info("Facility Id.."+facilityId);
		
		if(facilityId>=01)
		{
			modifiedfacility(facilityId,facilityname,description);
			response.setRenderParameter("jspPage","/html/editFacility.jsp");
		}
		else
		{
		facilitymaster fm=facilitymasterLocalServiceUtil.createfacilitymaster(CounterLocalServiceUtil.increment());
		fm.setFacility_name(facilityname);
		fm.setFacility_description(description);
		facilitymasterLocalServiceUtil.addfacilitymaster(fm);
		logger.info("success...");
		
		}
	}
	
	private void modifiedfacility(long facilityId, String facilityname,String description)
	{
		logger.info("edit the forms======");
	    
	     logger.info("myyyyy locationId====" + facilityId);
		
		facilitymaster fw=null;
		
		try 
		{
			fw=facilitymasterLocalServiceUtil.fetchfacilitymaster(facilityId);
			if (Validator.isNotNull(fw)) {
				fw.setFacility_name(facilityname);
				fw.setFacility_description(description);
				facilitymasterLocalServiceUtil.updatefacilitymaster(fw);
				logger.info("Your location Updated Successfully");
			logger.info(fw);
			
		} 
		}
		
			catch (SystemException e) {
				logger.info("context", e);
				
			}
		}
	
	
	public void deletefacilityreference(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException
	{
		logger.info("Delete Vendor======");
		
		long facilityId = ParamUtil.getInteger(actionRequest, "facilityId");
		logger.info("facilityId===" + facilityId);
	
		if (facilityId >= 01) {
		
	 	try {
	 		facilitymasterLocalServiceUtil.deletefacilitymaster(facilityId);
	 		
	 		logger.info("deleted successfully");
				
				actionResponse.setRenderParameter("jspPage","/html/editFacility.jsp");
			
			} catch (PortalException e)
	 	   {
				logger.info("context", e);
				
			} catch (SystemException e1) {
				logger.info("context", e1);
				
			}
				
		}
		
	}
	
	
	public void  submitRoom(ActionRequest request,ActionResponse response) throws NumberFormatException, PortalException
	{
		String stateId=request.getParameter("Selectstate");
		logger.info("State Id.."+stateId);
	
		
		String locationId=request.getParameter("Selectlocation");
		logger.info("Location name :"+locationId);
		
		
		String floorId=request.getParameter("Selectfloor");
		logger.info("Floor name :"+floorId);
		
		
		String roomname=request.getParameter("roomname");
		logger.info("Room name :"+roomname);
		
		
		String capacity=request.getParameter("capacity");
		logger.info("Room name :"+capacity);
		
		
		String extension=request.getParameter("extension");
		logger.info("Extension name :"+extension);
	
		
		String[] values = ParamUtil.getParameterValues(request, "values",new String[0]);
		
		
		logger.info("values in array..."+values.length);
	
		if(values.length==0)
		{
			logger.info("In if condition sessionerrors...");
			
			SessionErrors.add(request, "error-key");
			SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			response.setRenderParameter("jspPage","/html/addRoom.jsp");
		}
		else
		{
		String availbalevalues="";
		
		for(int i=0;i<=values.length-1;i++)
		{
			
			 availbalevalues=availbalevalues.concat(values[i].toString());
			 if(i<=values.length-2)
			 {
				 availbalevalues=availbalevalues.concat(",");
			 }
			 logger.info("Availbale values........"+availbalevalues);
			 logger.info("valuess "+values[i]);
			
			
			
			
			
		}
				long roomId=ParamUtil.getLong(request, "roomId");
				logger.info("Availbale final values........"+availbalevalues);
		
		
		
		
		if(roomId>=01){
			modifiedroom(roomId,stateId,locationId,floorId,roomname,capacity,extension,availbalevalues);
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
			roomLocalServiceUtil.addroom(rm);
			
			
			logger.info("floor/wing data added successfully");
			
		
		}
		}
	}
	
	private void modifiedroom(long roomId, String stateId,String locationId,String floorId,String roomname,String capacity,String extension,String values)
	{
		logger.info("edit the forms======");
		logger.info("myyyyy locationId====" + locationId);
	   
		
		room rm=null;
		try 
		{
		     
			rm=roomLocalServiceUtil.fetchroom(roomId);
			logger.info(rm);
			
		}
		catch (SystemException e)
		{
			logger.info("context", e);
		
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
			   
			   logger.info("Your floor/wing Updated Successfully");
				
			} 
			catch (SystemException e) 
			{
				logger.info("context", e);
				
			}
		}
	}
	
	public void deleteroomreference(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException
	{
		logger.info("Delete Vendor======");
		
		long roomId = ParamUtil.getInteger(actionRequest, "roomId");
		logger.info("facilityId===" + roomId);
		
		if (roomId >= 01) {
		
	 	try {
	 		roomLocalServiceUtil.deleteroom(roomId);
	 		logger.info(" deleted successfully");
				
				actionResponse.setRenderParameter("jspPage","/html/editRoom.jsp");
			
			} catch (PortalException e)
	 	{
				logger.info("context", e);
				
			} catch (SystemException e1) {
				logger.info("context", e1);
				
			}
				
		}
		
	}


}
