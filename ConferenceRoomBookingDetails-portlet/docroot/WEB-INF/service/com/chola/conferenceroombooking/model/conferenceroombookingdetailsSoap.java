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

package com.chola.conferenceroombooking.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.conferenceroombooking.service.http.conferenceroombookingdetailsServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.conferenceroombooking.service.http.conferenceroombookingdetailsServiceSoap
 * @generated
 */
@ProviderType
public class conferenceroombookingdetailsSoap implements Serializable {
	public static conferenceroombookingdetailsSoap toSoapModel(
		conferenceroombookingdetails model) {
		conferenceroombookingdetailsSoap soapModel = new conferenceroombookingdetailsSoap();

		soapModel.setBookid(model.getBookid());
		soapModel.setStartdate(model.getStartdate());
		soapModel.setStartime(model.getStartime());
		soapModel.setEndtime(model.getEndtime());
		soapModel.setRoomid(model.getRoomid());
		soapModel.setMeeting_emailid(model.getMeeting_emailid());
		soapModel.setMeeting_title(model.getMeeting_title());
		soapModel.setMeeting_agenda(model.getMeeting_agenda());
		soapModel.setStatus(model.getStatus());
		soapModel.setUserid(model.getUserid());
		soapModel.setUsername(model.getUsername());
		soapModel.setCreatedate(model.getCreatedate());

		return soapModel;
	}

	public static conferenceroombookingdetailsSoap[] toSoapModels(
		conferenceroombookingdetails[] models) {
		conferenceroombookingdetailsSoap[] soapModels = new conferenceroombookingdetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static conferenceroombookingdetailsSoap[][] toSoapModels(
		conferenceroombookingdetails[][] models) {
		conferenceroombookingdetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new conferenceroombookingdetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new conferenceroombookingdetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static conferenceroombookingdetailsSoap[] toSoapModels(
		List<conferenceroombookingdetails> models) {
		List<conferenceroombookingdetailsSoap> soapModels = new ArrayList<conferenceroombookingdetailsSoap>(models.size());

		for (conferenceroombookingdetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new conferenceroombookingdetailsSoap[soapModels.size()]);
	}

	public conferenceroombookingdetailsSoap() {
	}

	public long getPrimaryKey() {
		return _bookid;
	}

	public void setPrimaryKey(long pk) {
		setBookid(pk);
	}

	public long getBookid() {
		return _bookid;
	}

	public void setBookid(long bookid) {
		_bookid = bookid;
	}

	public Date getStartdate() {
		return _startdate;
	}

	public void setStartdate(Date startdate) {
		_startdate = startdate;
	}

	public String getStartime() {
		return _startime;
	}

	public void setStartime(String startime) {
		_startime = startime;
	}

	public String getEndtime() {
		return _endtime;
	}

	public void setEndtime(String endtime) {
		_endtime = endtime;
	}

	public int getRoomid() {
		return _roomid;
	}

	public void setRoomid(int roomid) {
		_roomid = roomid;
	}

	public String getMeeting_emailid() {
		return _meeting_emailid;
	}

	public void setMeeting_emailid(String meeting_emailid) {
		_meeting_emailid = meeting_emailid;
	}

	public String getMeeting_title() {
		return _meeting_title;
	}

	public void setMeeting_title(String meeting_title) {
		_meeting_title = meeting_title;
	}

	public String getMeeting_agenda() {
		return _meeting_agenda;
	}

	public void setMeeting_agenda(String meeting_agenda) {
		_meeting_agenda = meeting_agenda;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getUserid() {
		return _userid;
	}

	public void setUserid(long userid) {
		_userid = userid;
	}

	public String getUsername() {
		return _username;
	}

	public void setUsername(String username) {
		_username = username;
	}

	public Date getCreatedate() {
		return _createdate;
	}

	public void setCreatedate(Date createdate) {
		_createdate = createdate;
	}

	private long _bookid;
	private Date _startdate;
	private String _startime;
	private String _endtime;
	private int _roomid;
	private String _meeting_emailid;
	private String _meeting_title;
	private String _meeting_agenda;
	private int _status;
	private long _userid;
	private String _username;
	private Date _createdate;
}