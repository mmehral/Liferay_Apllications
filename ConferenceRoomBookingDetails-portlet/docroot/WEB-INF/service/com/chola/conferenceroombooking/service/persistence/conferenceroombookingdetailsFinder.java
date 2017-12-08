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

/**
 * @author adms.java1
 * @generated
 */
@ProviderType
public interface conferenceroombookingdetailsFinder {
	public java.util.List<java.lang.Object[]> syscodeCustomMsg(int syscode);

	public java.util.List<java.lang.Object[]> state();

	public java.util.List<java.lang.Object[]> location(int stateid);

	public java.util.List<java.lang.Object[]> conferenceroom(int stateid,
		int locationid);

	public java.util.List<java.lang.Long> getroomId(int stateid, int locid);

	public java.util.List<java.lang.Object[]> getConferenceList(
		java.lang.String startime, java.lang.String endtime, int roomid,
		java.lang.String startdate);

	public java.lang.Object[] getRoomMaster(int stateid, int locid, int id);

	public java.util.List<java.lang.Object[]> mybookinglist(long userid,
		int status);

	public boolean updateMybooking(int status, long userid, long bookid);

	public java.util.List<java.lang.Object[]> allBookingList(
		java.lang.String startdate, java.lang.String endate,
		java.lang.String stateid, java.lang.String locid);

	public java.util.List<java.lang.Object[]> defaultallBookingList(
		java.lang.String startdate, java.lang.String endate);

	public java.lang.String getStatename(long stateId);

	public java.lang.String getlocationname(long locationId);

	public java.lang.String getfloorname(long floorId);
}