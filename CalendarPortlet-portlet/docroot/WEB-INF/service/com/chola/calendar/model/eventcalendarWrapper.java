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

package com.chola.calendar.model;

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
 * This class is a wrapper for {@link eventcalendar}.
 * </p>
 *
 * @author adms.java1
 * @see eventcalendar
 * @generated
 */
@ProviderType
public class eventcalendarWrapper implements eventcalendar,
	ModelWrapper<eventcalendar> {
	public eventcalendarWrapper(eventcalendar eventcalendar) {
		_eventcalendar = eventcalendar;
	}

	@Override
	public Class<?> getModelClass() {
		return eventcalendar.class;
	}

	@Override
	public String getModelClassName() {
		return eventcalendar.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("startdate", getStartdate());
		attributes.put("enddate", getEnddate());
		attributes.put("color", getColor());
		attributes.put("url", getUrl());
		attributes.put("userid", getUserid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Date startdate = (Date)attributes.get("startdate");

		if (startdate != null) {
			setStartdate(startdate);
		}

		Date enddate = (Date)attributes.get("enddate");

		if (enddate != null) {
			setEnddate(enddate);
		}

		String color = (String)attributes.get("color");

		if (color != null) {
			setColor(color);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String userid = (String)attributes.get("userid");

		if (userid != null) {
			setUserid(userid);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _eventcalendar.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _eventcalendar.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _eventcalendar.isNew();
	}

	@Override
	public com.chola.calendar.model.eventcalendar toEscapedModel() {
		return new eventcalendarWrapper(_eventcalendar.toEscapedModel());
	}

	@Override
	public com.chola.calendar.model.eventcalendar toUnescapedModel() {
		return new eventcalendarWrapper(_eventcalendar.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _eventcalendar.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.calendar.model.eventcalendar> toCacheModel() {
		return _eventcalendar.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.calendar.model.eventcalendar eventcalendar) {
		return _eventcalendar.compareTo(eventcalendar);
	}

	@Override
	public int hashCode() {
		return _eventcalendar.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _eventcalendar.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new eventcalendarWrapper((eventcalendar)_eventcalendar.clone());
	}

	/**
	* Returns the color of this eventcalendar.
	*
	* @return the color of this eventcalendar
	*/
	@Override
	public java.lang.String getColor() {
		return _eventcalendar.getColor();
	}

	/**
	* Returns the name of this eventcalendar.
	*
	* @return the name of this eventcalendar
	*/
	@Override
	public java.lang.String getName() {
		return _eventcalendar.getName();
	}

	/**
	* Returns the url of this eventcalendar.
	*
	* @return the url of this eventcalendar
	*/
	@Override
	public java.lang.String getUrl() {
		return _eventcalendar.getUrl();
	}

	/**
	* Returns the userid of this eventcalendar.
	*
	* @return the userid of this eventcalendar
	*/
	@Override
	public java.lang.String getUserid() {
		return _eventcalendar.getUserid();
	}

	@Override
	public java.lang.String toString() {
		return _eventcalendar.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _eventcalendar.toXmlString();
	}

	/**
	* Returns the enddate of this eventcalendar.
	*
	* @return the enddate of this eventcalendar
	*/
	@Override
	public Date getEnddate() {
		return _eventcalendar.getEnddate();
	}

	/**
	* Returns the startdate of this eventcalendar.
	*
	* @return the startdate of this eventcalendar
	*/
	@Override
	public Date getStartdate() {
		return _eventcalendar.getStartdate();
	}

	/**
	* Returns the ID of this eventcalendar.
	*
	* @return the ID of this eventcalendar
	*/
	@Override
	public long getId() {
		return _eventcalendar.getId();
	}

	/**
	* Returns the primary key of this eventcalendar.
	*
	* @return the primary key of this eventcalendar
	*/
	@Override
	public long getPrimaryKey() {
		return _eventcalendar.getPrimaryKey();
	}

	@Override
	public void persist() {
		_eventcalendar.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_eventcalendar.setCachedModel(cachedModel);
	}

	/**
	* Sets the color of this eventcalendar.
	*
	* @param color the color of this eventcalendar
	*/
	@Override
	public void setColor(java.lang.String color) {
		_eventcalendar.setColor(color);
	}

	/**
	* Sets the enddate of this eventcalendar.
	*
	* @param enddate the enddate of this eventcalendar
	*/
	@Override
	public void setEnddate(Date enddate) {
		_eventcalendar.setEnddate(enddate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_eventcalendar.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_eventcalendar.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_eventcalendar.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this eventcalendar.
	*
	* @param id the ID of this eventcalendar
	*/
	@Override
	public void setId(long id) {
		_eventcalendar.setId(id);
	}

	/**
	* Sets the name of this eventcalendar.
	*
	* @param name the name of this eventcalendar
	*/
	@Override
	public void setName(java.lang.String name) {
		_eventcalendar.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_eventcalendar.setNew(n);
	}

	/**
	* Sets the primary key of this eventcalendar.
	*
	* @param primaryKey the primary key of this eventcalendar
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_eventcalendar.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_eventcalendar.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the startdate of this eventcalendar.
	*
	* @param startdate the startdate of this eventcalendar
	*/
	@Override
	public void setStartdate(Date startdate) {
		_eventcalendar.setStartdate(startdate);
	}

	/**
	* Sets the url of this eventcalendar.
	*
	* @param url the url of this eventcalendar
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_eventcalendar.setUrl(url);
	}

	/**
	* Sets the userid of this eventcalendar.
	*
	* @param userid the userid of this eventcalendar
	*/
	@Override
	public void setUserid(java.lang.String userid) {
		_eventcalendar.setUserid(userid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof eventcalendarWrapper)) {
			return false;
		}

		eventcalendarWrapper eventcalendarWrapper = (eventcalendarWrapper)obj;

		if (Objects.equals(_eventcalendar, eventcalendarWrapper._eventcalendar)) {
			return true;
		}

		return false;
	}

	@Override
	public eventcalendar getWrappedModel() {
		return _eventcalendar;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _eventcalendar.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _eventcalendar.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_eventcalendar.resetOriginalValues();
	}

	private final eventcalendar _eventcalendar;
}