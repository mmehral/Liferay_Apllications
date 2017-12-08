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

package com.chola.conferenceroombooking.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author adms.java1
 * @generated
 */
@ProviderType
public class conferenceroombookingdetailsFinderUtil {
	public static java.util.List<java.lang.Object[]> syscodeCustomMsg(
		int syscode) {
		return getFinder().syscodeCustomMsg(syscode);
	}

	public static java.util.List<java.lang.Object[]> state() {
		return getFinder().state();
	}

	public static java.util.List<java.lang.Object[]> location(int stateid) {
		return getFinder().location(stateid);
	}

	public static java.util.List<java.lang.Object[]> conferenceroom(
		int stateid, int locationid) {
		return getFinder().conferenceroom(stateid, locationid);
	}

	public static java.util.List<java.lang.Long> getroomId(int stateid,
		int locid) {
		return getFinder().getroomId(stateid, locid);
	}

	public static java.util.List<java.lang.Object[]> getConferenceList(
		java.lang.String startime, java.lang.String endtime, int roomid,
		java.lang.String startdate) {
		return getFinder()
				   .getConferenceList(startime, endtime, roomid, startdate);
	}

	public static java.lang.Object[] getRoomMaster(int stateid, int locid,
		int id) {
		return getFinder().getRoomMaster(stateid, locid, id);
	}

	public static java.util.List<java.lang.Object[]> mybookinglist(
		long userid, int status) {
		return getFinder().mybookinglist(userid, status);
	}

	public static boolean updateMybooking(int status, long userid, long bookid) {
		return getFinder().updateMybooking(status, userid, bookid);
	}

	public static java.util.List<java.lang.Object[]> allBookingList(
		java.lang.String startdate, java.lang.String endate,
		java.lang.String stateid, java.lang.String locid) {
		return getFinder().allBookingList(startdate, endate, stateid, locid);
	}

	public static java.util.List<java.lang.Object[]> defaultallBookingList(
		java.lang.String startdate, java.lang.String endate) {
		return getFinder().defaultallBookingList(startdate, endate);
	}

	public static java.lang.String getStatename(long stateId) {
		return getFinder().getStatename(stateId);
	}

	public static java.lang.String getlocationname(long locationId) {
		return getFinder().getlocationname(locationId);
	}

	public static java.lang.String getfloorname(long floorId) {
		return getFinder().getfloorname(floorId);
	}

	public static conferenceroombookingdetailsFinder getFinder() {
		if (_finder == null) {
			_finder = (conferenceroombookingdetailsFinder)PortletBeanLocatorUtil.locate(com.chola.conferenceroombooking.service.ClpSerializer.getServletContextName(),
					conferenceroombookingdetailsFinder.class.getName());

			ReferenceRegistry.registerReference(conferenceroombookingdetailsFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(conferenceroombookingdetailsFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(conferenceroombookingdetailsFinderUtil.class,
			"_finder");
	}

	private static conferenceroombookingdetailsFinder _finder;
}