/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.chola.conferenceroombooking.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.chola.conferenceroombooking.service.base.conferenceroombookingdetailsLocalServiceBaseImpl;
import com.chola.conferenceroombooking.service.persistence.conferenceroombookingdetailsFinderUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * The implementation of the conferenceroombookingdetails local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.chola.conferenceroombooking.service.conferenceroombookingdetailsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adms.java1
 * @see conferenceroombookingdetailsLocalServiceBaseImpl
 * @see com.chola.conferenceroombooking.service.conferenceroombookingdetailsLocalServiceUtil
 */
@ProviderType
public class conferenceroombookingdetailsLocalServiceImpl
	extends conferenceroombookingdetailsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.chola.conferenceroombooking.service.conferenceroombookingdetailsLocalServiceUtil} to access the conferenceroombookingdetails local service.
	 */
	private static Log _log = LogFactoryUtil.getLog(conferenceroombookingdetailsLocalServiceImpl.class);
	public List<Object[]> syscodeCustomMsg(int syscode) {
		_log.info("Room Syscode.......");
		
		return conferenceroombookingdetailsFinderUtil.syscodeCustomMsg(syscode);
	}

	// This method is for State master........
	public List<Object[]> state() {
		_log.info("Room State.......");
	
		return conferenceroombookingdetailsFinderUtil.state();
	}

	// This method is for Location master.......
	public List<Object[]> location(int stateid) {
		_log.info("Room Location.......");
		

		return conferenceroombookingdetailsFinderUtil.location(stateid);
	}
	// This Method id for Conference Room...
		public List<Object[]> conferenceroom(int stateid, int locationid) {
			return conferenceroombookingdetailsFinderUtil.conferenceroom(stateid, locationid);
		}

		// This Method id for Get Room Id
		public List<Long> getroomId(int stateid, int locid) {
			return conferenceroombookingdetailsFinderUtil.getroomId(stateid, locid);
		}

		// This Method id for Getting room list
		public List<Object[]> getConferenceList(String startime, String endtime, int roomid, String strtdate) {
			return conferenceroombookingdetailsFinderUtil.getConferenceList(startime, endtime, roomid, strtdate);
		}

		// This Method id for Getting Room Master
		public Object[] getRoomMaster(int stateid, int locid, int id) {
			return conferenceroombookingdetailsFinderUtil.getRoomMaster(stateid, locid, id);
		}

		/*// This MEthod is for My Booking........
		public List<conferenceroombookingdetailsFinderUtil> mybookingDetail(Long userid, int status) {
			System.out.println("bookingdetails.........");
			return conferenceroombookingdetailsFinderUtil().findByMY_BOOKING(userid, status);
		}*/

		// This Method is for My Booking List
		public List<Object[]> mybookinglist(long userid, int status) {
			_log.info("My Booking Details........");
			
			return conferenceroombookingdetailsFinderUtil.mybookinglist(userid, status);
		}

		// This Method is for Updating the My Booking List.....
		public boolean updateMybooking(int status, long userid, long bookid) {
			_log.info("Update My Booking Details........");
	
			return conferenceroombookingdetailsFinderUtil.updateMybooking(status, userid, bookid);
		}

		// This Method is for Updating the All Booking .....
		public List<Object[]> allBookingList(String startdate, String endate, String stateid, String locid) {
			_log.info("All Booking Details........");
			
			return conferenceroombookingdetailsFinderUtil.allBookingList(startdate, endate, stateid, locid);
		}

		// This method is for Default All Booking..........
		public List<Object[]> defaultallBookingList(String startdate, String endate) {
			_log.info("Default....All Booking Details........");
			
			return conferenceroombookingdetailsFinderUtil.defaultallBookingList(startdate, endate);
		}
		
		public String getStatename(long stateId)
		{
			return conferenceroombookingdetailsFinderUtil.getStatename(stateId);
		}
		
		public String getlocationname(long locationId)
		{
			return conferenceroombookingdetailsFinderUtil.getlocationname(locationId);
		}
		
		public String getfloorname(long floorId)
		{
			return conferenceroombookingdetailsFinderUtil.getfloorname(floorId);
		}
}