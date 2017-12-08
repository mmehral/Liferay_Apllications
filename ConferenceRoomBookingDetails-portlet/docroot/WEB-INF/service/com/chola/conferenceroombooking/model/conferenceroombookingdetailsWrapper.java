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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link conferenceroombookingdetails}.
 * </p>
 *
 * @author adms.java1
 * @see conferenceroombookingdetails
 * @generated
 */
@ProviderType
public class conferenceroombookingdetailsWrapper
	implements conferenceroombookingdetails,
		ModelWrapper<conferenceroombookingdetails> {
	public conferenceroombookingdetailsWrapper(
		conferenceroombookingdetails conferenceroombookingdetails) {
		_conferenceroombookingdetails = conferenceroombookingdetails;
	}

	@Override
	public Class<?> getModelClass() {
		return conferenceroombookingdetails.class;
	}

	@Override
	public String getModelClassName() {
		return conferenceroombookingdetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bookid", getBookid());
		attributes.put("startdate", getStartdate());
		attributes.put("startime", getStartime());
		attributes.put("endtime", getEndtime());
		attributes.put("roomid", getRoomid());
		attributes.put("meeting_emailid", getMeeting_emailid());
		attributes.put("meeting_title", getMeeting_title());
		attributes.put("meeting_agenda", getMeeting_agenda());
		attributes.put("status", getStatus());
		attributes.put("userid", getUserid());
		attributes.put("username", getUsername());
		attributes.put("createdate", getCreatedate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long bookid = (Long)attributes.get("bookid");

		if (bookid != null) {
			setBookid(bookid);
		}

		Date startdate = (Date)attributes.get("startdate");

		if (startdate != null) {
			setStartdate(startdate);
		}

		String startime = (String)attributes.get("startime");

		if (startime != null) {
			setStartime(startime);
		}

		String endtime = (String)attributes.get("endtime");

		if (endtime != null) {
			setEndtime(endtime);
		}

		Integer roomid = (Integer)attributes.get("roomid");

		if (roomid != null) {
			setRoomid(roomid);
		}

		String meeting_emailid = (String)attributes.get("meeting_emailid");

		if (meeting_emailid != null) {
			setMeeting_emailid(meeting_emailid);
		}

		String meeting_title = (String)attributes.get("meeting_title");

		if (meeting_title != null) {
			setMeeting_title(meeting_title);
		}

		String meeting_agenda = (String)attributes.get("meeting_agenda");

		if (meeting_agenda != null) {
			setMeeting_agenda(meeting_agenda);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long userid = (Long)attributes.get("userid");

		if (userid != null) {
			setUserid(userid);
		}

		String username = (String)attributes.get("username");

		if (username != null) {
			setUsername(username);
		}

		Date createdate = (Date)attributes.get("createdate");

		if (createdate != null) {
			setCreatedate(createdate);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _conferenceroombookingdetails.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _conferenceroombookingdetails.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _conferenceroombookingdetails.isNew();
	}

	@Override
	public com.chola.conferenceroombooking.model.conferenceroombookingdetails toEscapedModel() {
		return new conferenceroombookingdetailsWrapper(_conferenceroombookingdetails.toEscapedModel());
	}

	@Override
	public com.chola.conferenceroombooking.model.conferenceroombookingdetails toUnescapedModel() {
		return new conferenceroombookingdetailsWrapper(_conferenceroombookingdetails.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _conferenceroombookingdetails.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.conferenceroombooking.model.conferenceroombookingdetails> toCacheModel() {
		return _conferenceroombookingdetails.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.conferenceroombooking.model.conferenceroombookingdetails conferenceroombookingdetails) {
		return _conferenceroombookingdetails.compareTo(conferenceroombookingdetails);
	}

	/**
	* Returns the roomid of this conferenceroombookingdetails.
	*
	* @return the roomid of this conferenceroombookingdetails
	*/
	@Override
	public int getRoomid() {
		return _conferenceroombookingdetails.getRoomid();
	}

	/**
	* Returns the status of this conferenceroombookingdetails.
	*
	* @return the status of this conferenceroombookingdetails
	*/
	@Override
	public int getStatus() {
		return _conferenceroombookingdetails.getStatus();
	}

	@Override
	public int hashCode() {
		return _conferenceroombookingdetails.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _conferenceroombookingdetails.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new conferenceroombookingdetailsWrapper((conferenceroombookingdetails)_conferenceroombookingdetails.clone());
	}

	/**
	* Returns the endtime of this conferenceroombookingdetails.
	*
	* @return the endtime of this conferenceroombookingdetails
	*/
	@Override
	public java.lang.String getEndtime() {
		return _conferenceroombookingdetails.getEndtime();
	}

	/**
	* Returns the meeting_agenda of this conferenceroombookingdetails.
	*
	* @return the meeting_agenda of this conferenceroombookingdetails
	*/
	@Override
	public java.lang.String getMeeting_agenda() {
		return _conferenceroombookingdetails.getMeeting_agenda();
	}

	/**
	* Returns the meeting_emailid of this conferenceroombookingdetails.
	*
	* @return the meeting_emailid of this conferenceroombookingdetails
	*/
	@Override
	public java.lang.String getMeeting_emailid() {
		return _conferenceroombookingdetails.getMeeting_emailid();
	}

	/**
	* Returns the meeting_title of this conferenceroombookingdetails.
	*
	* @return the meeting_title of this conferenceroombookingdetails
	*/
	@Override
	public java.lang.String getMeeting_title() {
		return _conferenceroombookingdetails.getMeeting_title();
	}

	/**
	* Returns the startime of this conferenceroombookingdetails.
	*
	* @return the startime of this conferenceroombookingdetails
	*/
	@Override
	public java.lang.String getStartime() {
		return _conferenceroombookingdetails.getStartime();
	}

	/**
	* Returns the username of this conferenceroombookingdetails.
	*
	* @return the username of this conferenceroombookingdetails
	*/
	@Override
	public java.lang.String getUsername() {
		return _conferenceroombookingdetails.getUsername();
	}

	@Override
	public java.lang.String toString() {
		return _conferenceroombookingdetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _conferenceroombookingdetails.toXmlString();
	}

	/**
	* Returns the createdate of this conferenceroombookingdetails.
	*
	* @return the createdate of this conferenceroombookingdetails
	*/
	@Override
	public Date getCreatedate() {
		return _conferenceroombookingdetails.getCreatedate();
	}

	/**
	* Returns the startdate of this conferenceroombookingdetails.
	*
	* @return the startdate of this conferenceroombookingdetails
	*/
	@Override
	public Date getStartdate() {
		return _conferenceroombookingdetails.getStartdate();
	}

	/**
	* Returns the bookid of this conferenceroombookingdetails.
	*
	* @return the bookid of this conferenceroombookingdetails
	*/
	@Override
	public long getBookid() {
		return _conferenceroombookingdetails.getBookid();
	}

	/**
	* Returns the primary key of this conferenceroombookingdetails.
	*
	* @return the primary key of this conferenceroombookingdetails
	*/
	@Override
	public long getPrimaryKey() {
		return _conferenceroombookingdetails.getPrimaryKey();
	}

	/**
	* Returns the userid of this conferenceroombookingdetails.
	*
	* @return the userid of this conferenceroombookingdetails
	*/
	@Override
	public long getUserid() {
		return _conferenceroombookingdetails.getUserid();
	}

	@Override
	public void persist() {
		_conferenceroombookingdetails.persist();
	}

	/**
	* Sets the bookid of this conferenceroombookingdetails.
	*
	* @param bookid the bookid of this conferenceroombookingdetails
	*/
	@Override
	public void setBookid(long bookid) {
		_conferenceroombookingdetails.setBookid(bookid);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_conferenceroombookingdetails.setCachedModel(cachedModel);
	}

	/**
	* Sets the createdate of this conferenceroombookingdetails.
	*
	* @param createdate the createdate of this conferenceroombookingdetails
	*/
	@Override
	public void setCreatedate(Date createdate) {
		_conferenceroombookingdetails.setCreatedate(createdate);
	}

	/**
	* Sets the endtime of this conferenceroombookingdetails.
	*
	* @param endtime the endtime of this conferenceroombookingdetails
	*/
	@Override
	public void setEndtime(java.lang.String endtime) {
		_conferenceroombookingdetails.setEndtime(endtime);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_conferenceroombookingdetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_conferenceroombookingdetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_conferenceroombookingdetails.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the meeting_agenda of this conferenceroombookingdetails.
	*
	* @param meeting_agenda the meeting_agenda of this conferenceroombookingdetails
	*/
	@Override
	public void setMeeting_agenda(java.lang.String meeting_agenda) {
		_conferenceroombookingdetails.setMeeting_agenda(meeting_agenda);
	}

	/**
	* Sets the meeting_emailid of this conferenceroombookingdetails.
	*
	* @param meeting_emailid the meeting_emailid of this conferenceroombookingdetails
	*/
	@Override
	public void setMeeting_emailid(java.lang.String meeting_emailid) {
		_conferenceroombookingdetails.setMeeting_emailid(meeting_emailid);
	}

	/**
	* Sets the meeting_title of this conferenceroombookingdetails.
	*
	* @param meeting_title the meeting_title of this conferenceroombookingdetails
	*/
	@Override
	public void setMeeting_title(java.lang.String meeting_title) {
		_conferenceroombookingdetails.setMeeting_title(meeting_title);
	}

	@Override
	public void setNew(boolean n) {
		_conferenceroombookingdetails.setNew(n);
	}

	/**
	* Sets the primary key of this conferenceroombookingdetails.
	*
	* @param primaryKey the primary key of this conferenceroombookingdetails
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_conferenceroombookingdetails.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_conferenceroombookingdetails.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the roomid of this conferenceroombookingdetails.
	*
	* @param roomid the roomid of this conferenceroombookingdetails
	*/
	@Override
	public void setRoomid(int roomid) {
		_conferenceroombookingdetails.setRoomid(roomid);
	}

	/**
	* Sets the startdate of this conferenceroombookingdetails.
	*
	* @param startdate the startdate of this conferenceroombookingdetails
	*/
	@Override
	public void setStartdate(Date startdate) {
		_conferenceroombookingdetails.setStartdate(startdate);
	}

	/**
	* Sets the startime of this conferenceroombookingdetails.
	*
	* @param startime the startime of this conferenceroombookingdetails
	*/
	@Override
	public void setStartime(java.lang.String startime) {
		_conferenceroombookingdetails.setStartime(startime);
	}

	/**
	* Sets the status of this conferenceroombookingdetails.
	*
	* @param status the status of this conferenceroombookingdetails
	*/
	@Override
	public void setStatus(int status) {
		_conferenceroombookingdetails.setStatus(status);
	}

	/**
	* Sets the userid of this conferenceroombookingdetails.
	*
	* @param userid the userid of this conferenceroombookingdetails
	*/
	@Override
	public void setUserid(long userid) {
		_conferenceroombookingdetails.setUserid(userid);
	}

	/**
	* Sets the username of this conferenceroombookingdetails.
	*
	* @param username the username of this conferenceroombookingdetails
	*/
	@Override
	public void setUsername(java.lang.String username) {
		_conferenceroombookingdetails.setUsername(username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof conferenceroombookingdetailsWrapper)) {
			return false;
		}

		conferenceroombookingdetailsWrapper conferenceroombookingdetailsWrapper = (conferenceroombookingdetailsWrapper)obj;

		if (Objects.equals(_conferenceroombookingdetails,
					conferenceroombookingdetailsWrapper._conferenceroombookingdetails)) {
			return true;
		}

		return false;
	}

	@Override
	public conferenceroombookingdetails getWrappedModel() {
		return _conferenceroombookingdetails;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _conferenceroombookingdetails.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _conferenceroombookingdetails.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_conferenceroombookingdetails.resetOriginalValues();
	}

	private final conferenceroombookingdetails _conferenceroombookingdetails;
}