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
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.chola.conferenceroombooking.model.conferenceroombookingdetails;
import com.chola.conferenceroombooking.service.conferenceroombookingdetailsLocalServiceUtil;

import com.liferay.counter.kernel.model.Counter;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

public class ConferenceRoomActionBackup extends MVCPortlet {
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		System.out.println("Conference Room Ajax call......");
		System.out.println("ID : " + resourceRequest.getResourceID());
		if (resourceRequest.getResourceID().equalsIgnoreCase("StateCall")) {
			String stateid = resourceRequest.getParameter("stateid");

			System.out.println("State Id : " + stateid);

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

			System.out.println(jArray);
			writer.print(jArray);
		}

		if (resourceRequest.getResourceID().equalsIgnoreCase("RoomMaster")) {
			String stateid = resourceRequest.getParameter("stateid");
			String loctionid = resourceRequest.getParameter("loctionid");
			String startDate = resourceRequest.getParameter("startDate");
			// String endDate = resourceRequest.getParameter("endDate");
			String starthour = resourceRequest.getParameter("starthour");
			String startmint = resourceRequest.getParameter("startmint");
			String startPM = resourceRequest.getParameter("startPM");
			String endhour = resourceRequest.getParameter("endhour");
			String endmint = resourceRequest.getParameter("endmint");
			String endPM = resourceRequest.getParameter("endPM");

			System.out.println("State Id====" + stateid);
			System.out.println("Location Id====" + loctionid);
			System.out.println("StartDate====" + startDate);
			// System.out.println("End Date===="+endDate);
			System.out.println("State Hour====" + starthour);
			System.out.println("State Min====" + startmint);
			System.out.println("State Pm====" + startPM);
			System.out.println("End Hour====" + endhour);
			System.out.println("End Mint====" + endmint);
			System.out.println("End PM====" + endPM);

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

			System.out.println(jArray);
			writer.print(jArray);
		}

		/*
		 * if (resourceRequest.getResourceID().equalsIgnoreCase("BookList")) {
		 * String val = resourceRequest.getParameter("val");
		 * System.out.println("Value======" + val); List<Object[]> lt =
		 * bookingdetailsLocalServiceUtil.bookinghistroy(1, 1);
		 * System.out.println("LIST========" + lt); Iterator it = lt.iterator();
		 * JSONArray jArray = new JSONArray(); PrintWriter writer =
		 * resourceResponse.getWriter(); while (it.hasNext()) { Object[] object
		 * = (Object[]) it.next(); JSONObject obj = new JSONObject();
		 * obj.put("room_id", object[0].toString()); obj.put("room_name",
		 * object[1].toString()); obj.put("room_desc", object[2].toString());
		 * obj.put("room_capacity", object[3].toString());
		 * obj.put("room_extension", object[4].toString());
		 * obj.put("room_facility", object[5].toString()); jArray.add(obj); }
		 * 
		 * System.out.println(jArray); writer.print(jArray); }
		 */

	}

	public void getConferenceRoomList(ActionRequest actionRequest, ActionResponse actionResponse) {
		System.out.println("getConferenceRoomList========");
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
		System.out.println("State Id====" + state);
		System.out.println("Location Id====" + location);
		System.out.println("StartDate====" + startDate);
		System.out.println("State Time====" + starttm);
		System.out.println("End Time====" + endtm);
		if (!state.isEmpty()) {
			stateid = Integer.parseInt(state);
		}
		if (!location.isEmpty()) {
			locid = Integer.parseInt(location);
		}

		try {
			Date strtdt = format.parse(startDate);
			srtdate = format1.format(strtdt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<Long> list = conferenceroombookingdetailsLocalServiceUtil.getroomId(stateid, locid);
		List<BookListPojo> bookListPojos = new ArrayList<BookListPojo>();
		System.out.println(list);

		// Step 2 Fetching the Room Id from the Loop......
		for (Long l : list) {
			System.out.println("Room Id=====" + l);
			int rmid = l.intValue();
			// Step 3 Geting the list of values from starttime and gettime in
			List<Object[]> conflist = conferenceroombookingdetailsLocalServiceUtil.getConferenceList(starttm, endtm,
					rmid, srtdate);
			Object[] obj1 = conferenceroombookingdetailsLocalServiceUtil.getRoomMaster(stateid, locid, rmid);
			System.out.println("List=====" + conflist.size());
			int size = conflist.size();
			// Step 4 Check for Book details List size
			if (size != 0) {
				strtime = new ArrayList();
				endtime = new ArrayList();
				for (Object[] obj : conflist) {
					strtime.add(obj[2].toString());
					endtime.add(obj[3].toString());
				}
				System.out.println("Startime====" + strtime);
				System.out.println("Endtime====" + endtime);
				// Step 5 This is For loop for get the list
				for (int i = 0; i < strtime.size(); i++) {
					BookListPojo pojo = null;
					// This condition for starting loop
					if (i == 0) {
						// Comparing the Startime and endtime is flag is true
						// ...false
						cmpflag = CompareNumber.getComparevalue(starttm, strtime.get(0).toString());
						System.out.println("Compare..number=======" + cmpflag);
						if (cmpflag) {
							diff = TimeSlot.getTimeslots(starttm, strtime.get(0).toString());
							System.out.println("diff====" + diff);
							if (!diff.equals("0:0")) {
								// System.out.println("Start Diff===="+strt);
								String endslot = AddTimeSlot.getAddTimeSlot(starttm, diff);
								System.out.println("Start Time......" + starttm);
								System.out.println("End Time........" + endslot);
								pojo = new BookListPojo();
								pojo.setStartime(starttm);
								pojo.setEndtime(endslot);
								pojo.setRoomid(rmid);
								pojo.setStardate(startDate);
								pojo.setStatename(obj1[0].toString());
								pojo.setLocname(obj1[1].toString());
								pojo.setRoomname(obj1[2].toString());
								pojo.setFloor(obj1[3].toString());
								pojo.setFacility(obj1[4].toString());
								pojo.setCapcity(obj1[5].toString());
								pojo.setExtension(obj1[6].toString());
								bookListPojos.add(pojo);
							}
						}

						if (strtime.size() == (i + 1)) {
							cmpflag = CompareNumber.getComparevalue(endtime.get(i).toString(), endtm);
							System.out.println("Compare..number=======" + cmpflag);
							if (cmpflag) {
								diff = TimeSlot.getTimeslots(endtime.get(i).toString(), endtm);
								if (!diff.equals("0:0")) {
									String endslot = AddTimeSlot.getAddTimeSlot(endtime.get(i).toString(), diff);
									System.out.println("Start Time......" + endtime.get(i).toString());
									System.out.println("End Time........" + endslot);
									pojo = new BookListPojo();
									pojo.setStartime(endtime.get(i).toString());
									pojo.setEndtime(endslot);
									pojo.setRoomid(rmid);
									pojo.setStardate(startDate);
									pojo.setStatename(obj1[0].toString());
									pojo.setLocname(obj1[1].toString());
									pojo.setRoomname(obj1[2].toString());
									pojo.setFloor(obj1[3].toString());
									pojo.setFacility(obj1[4].toString());
									pojo.setCapcity(obj1[5].toString());
									pojo.setExtension(obj1[6].toString());

									bookListPojos.add(pojo);
								}
							}
						}

					} else {
						// Difference the time slots..........
						diff = TimeSlot.getTimeslots(endtime.get(i - 1).toString(), strtime.get(i).toString());
						if (!diff.equals("0:0")) {
							// System.out.println("Start Diff===="+strt);
							String avail = AddTimeSlot.getAddTimeSlot(endtime.get(i - 1).toString(), diff);
							System.out.println("Start Time......" + endtime.get(i - 1).toString());
							System.out.println("End Time........" + avail);
							pojo = new BookListPojo();
							pojo.setStartime(endtime.get(i - 1).toString());
							pojo.setEndtime(avail);
							pojo.setRoomid(rmid);
							pojo.setStardate(startDate);
							pojo.setStatename(obj1[0].toString());
							pojo.setLocname(obj1[1].toString());
							pojo.setRoomname(obj1[2].toString());
							pojo.setFloor(obj1[3].toString());
							pojo.setFacility(obj1[4].toString());
							pojo.setCapcity(obj1[5].toString());
							pojo.setExtension(obj1[6].toString());

							bookListPojos.add(pojo);
						}

						if (strtime.size() == (i + 1)) {
							cmpflag = CompareNumber.getComparevalue(endtime.get(i).toString(), endtm);
							System.out.println("Compare..number=======" + cmpflag);
							if (cmpflag) {
								diff = TimeSlot.getTimeslots(endtime.get(i).toString(), endtm);
								if (!diff.equals("0:0")) {
									String endslot = AddTimeSlot.getAddTimeSlot(endtime.get(i).toString(), diff);
									System.out.println("Start Time......" + endtime.get(i).toString());
									System.out.println("End Time........" + endslot);
									pojo = new BookListPojo();
									pojo.setStartime(endtime.get(i).toString());
									pojo.setEndtime(endslot);
									pojo.setRoomid(rmid);
									pojo.setStardate(startDate);
									pojo.setStatename(obj1[0].toString());
									pojo.setLocname(obj1[1].toString());
									pojo.setRoomname(obj1[2].toString());
									pojo.setFloor(obj1[3].toString());
									pojo.setFacility(obj1[4].toString());
									pojo.setCapcity(obj1[5].toString());
									pojo.setExtension(obj1[6].toString());

									bookListPojos.add(pojo);
								}
							}
						}

					}

				}

			} else {
				// If List size 0 then this condition will excustive....
				BookListPojo pojo = new BookListPojo();
				pojo.setStartime(starttm);
				pojo.setEndtime(endtm);
				pojo.setRoomid(rmid);
				pojo.setStardate(startDate);
				pojo.setStatename(obj1[0].toString());
				pojo.setLocname(obj1[1].toString());
				pojo.setRoomname(obj1[2].toString());
				pojo.setFloor(obj1[3].toString());
				pojo.setFacility(obj1[4].toString());
				pojo.setCapcity(obj1[5].toString());
				pojo.setExtension(obj1[6].toString());

				bookListPojos.add(pojo);
			}

		}
		System.out.println(bookListPojos.size() + "##########");
		for (BookListPojo b : bookListPojos) {
			System.out.println("Sttttttt" + b.getStartime());
			System.out.println("Enddddd" + b.getEndtime());
			System.out.println("StateName" + b.getStatename());
			System.out.println("Location" + b.getLocname());
			System.out.println("Room Name" + b.getRoomname());
			System.out.println("Floor" + b.getFloor());
			System.out.println("Facility" + b.getFacility());
			System.out.println("Capacity" + b.getCapcity());
			System.out.println("Extension" + b.getExtension());
			System.out.println("Room Id======" + b.getRoomid());
			System.out.println("Start Date======" + b.getStardate());
		}
		actionRequest.setAttribute("check", "1");
		actionRequest.setAttribute("list", bookListPojos);
		actionResponse.setRenderParameter("jspPage", "/html/view.jsp");
	}

	public void getradio(ActionRequest actionRequest, ActionResponse actionResponse) {
		System.out.println("Radio,,,,,,,,");
		String val = ParamUtil.getString(actionRequest, "val");
		String uname = ParamUtil.getString(actionRequest, "uname");

		System.out.println("val======" + val);
		System.out.println("uname====" + uname);
		if (val.equalsIgnoreCase("on")) {
			System.out.println("SSSS");

		} else {
			System.out.println("WWWW");
		}
	}

	public void getBookingDetails(ActionRequest actionRequest, ActionResponse actionResponse) {
		System.out.println("getBookingDetails========");
		String bookinglist = ParamUtil.getString(actionRequest, "bookinglist");
		System.out.println("Booking List=====" + bookinglist);
		Integer bookingId = Integer.parseInt(bookinglist);
		BookListPojo pojo = null;
		for (int i = 0; i < bookingId; i++) {
			String flag = actionRequest.getParameter("bookid_" + i);
			System.out.println("i========" + flag);
			if (flag != null) {
				if (flag.equals("on")) {
					System.out.println("Not Nulllll");

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
					if (!roomid.isEmpty()) {
						pojo.setRoomid(Integer.parseInt(roomid));
					}
					System.out.println("DSFSDFSDFSDFSDF");
					actionRequest.setAttribute("pojo", pojo);

				} else {
					System.out.println("NULLLLLLLLLLLLLLL");
				}
			}
		}

		actionResponse.setRenderParameter("jspPage", "/html/meetingdetails.jsp");
	}

	// This Method is for Adding Booking Details
	public void getAddBookingList(ActionRequest actionRequest, ActionResponse actionResponse) {
		System.out.println("getAddBookingList=======");
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
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		try {
			strdate = format.parse(startdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Room-----" + roomId);
		System.out.println("StartHour-----" + starthour);
		String starttm = starthour + ":" + startmint;
		String endtm = endhour + ":" + endmint;

		conferenceroombookingdetails details = conferenceroombookingdetailsLocalServiceUtil.createconferenceroombookingdetails(CounterLocalServiceUtil.increment());
		details.setStartdate(strdate);
		details.setStartime(starttm);
		details.setEndtime(endtm);
		details.setRoomid(roomId);
		details.setStatus(1);
		details.setCreatedate(new Date());
		details.setMeeting_emailid(emailid);
		details.setMeeting_title(title);
		details.setMeeting_agenda(agenda);
		details.setUserid(themeDisplay.getUserId());
		details = conferenceroombookingdetailsLocalServiceUtil.addconferenceroombookingdetails(details);
		actionResponse.setRenderParameter("jspPage", "/html/view.jsp");
	}

	public void deleteMybooking(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException {
		System.out.println("deleteMybooking=======");
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		Long bookid = ParamUtil.getLong(actionRequest, "roomid");
		System.out.println("Book Id=======" + bookid);
		// boolean
		// flag=ConferenceRoomLocalServiceUtil.updateMybooking(2,themeDisplay.getUserId(),
		// roomid);
		// System.out.println("Successfully....updated..."+flag);
		conferenceroombookingdetailsLocalServiceUtil.deleteconferenceroombookingdetails(bookid);
		System.out.println("Successfully....updated...");
		actionResponse.setRenderParameter("jspPage", "/html/mybooking.jsp");
	}

	// This Method is for All Booking List........
	public void getALLBookingList(ActionRequest actionRequest, ActionResponse actionResponse) {
		System.out.println("getALLBookingList========");
		// Step 1 geting all values from form fields
		String srtdate = null;
		String enddate = null;
		String state = ParamUtil.getString(actionRequest, "state");
		String location = ParamUtil.getString(actionRequest, "location");
		String startDate = ParamUtil.getString(actionRequest, "startDate");
		String endDate = ParamUtil.getString(actionRequest, "endDate");
		System.out.println("State Id====" + state);
		System.out.println("Location Id====" + location);
		System.out.println("StartDate====" + startDate);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date strtdt = format.parse(startDate);
			srtdate = format1.format(strtdt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Date enddt = format.parse(endDate);
			enddate = format1.format(enddt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Object[]> list = conferenceroombookingdetailsLocalServiceUtil.allBookingList(srtdate, enddate, state, location);
		actionRequest.setAttribute("check", "1");
		actionRequest.setAttribute("alllist", list);
		actionResponse.setRenderParameter("jspPage", "/html/allbookinglist.jsp");
	}

}
