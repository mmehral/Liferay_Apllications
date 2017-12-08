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

package com.chola.trainingcalendar.model;

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
 * This class is a wrapper for {@link trainingcalendardata}.
 * </p>
 *
 * @author CloverLiferay01
 * @see trainingcalendardata
 * @generated
 */
@ProviderType
public class trainingcalendardataWrapper implements trainingcalendardata,
	ModelWrapper<trainingcalendardata> {
	public trainingcalendardataWrapper(
		trainingcalendardata trainingcalendardata) {
		_trainingcalendardata = trainingcalendardata;
	}

	@Override
	public Class<?> getModelClass() {
		return trainingcalendardata.class;
	}

	@Override
	public String getModelClassName() {
		return trainingcalendardata.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("schedulestartdate", getSchedulestartdate());
		attributes.put("scheduleenddate", getScheduleenddate());
		attributes.put("location", getLocation());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date schedulestartdate = (Date)attributes.get("schedulestartdate");

		if (schedulestartdate != null) {
			setSchedulestartdate(schedulestartdate);
		}

		Date scheduleenddate = (Date)attributes.get("scheduleenddate");

		if (scheduleenddate != null) {
			setScheduleenddate(scheduleenddate);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _trainingcalendardata.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _trainingcalendardata.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _trainingcalendardata.isNew();
	}

	@Override
	public com.chola.trainingcalendar.model.trainingcalendardata toEscapedModel() {
		return new trainingcalendardataWrapper(_trainingcalendardata.toEscapedModel());
	}

	@Override
	public com.chola.trainingcalendar.model.trainingcalendardata toUnescapedModel() {
		return new trainingcalendardataWrapper(_trainingcalendardata.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _trainingcalendardata.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.trainingcalendar.model.trainingcalendardata> toCacheModel() {
		return _trainingcalendardata.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.trainingcalendar.model.trainingcalendardata trainingcalendardata) {
		return _trainingcalendardata.compareTo(trainingcalendardata);
	}

	@Override
	public int hashCode() {
		return _trainingcalendardata.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _trainingcalendardata.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new trainingcalendardataWrapper((trainingcalendardata)_trainingcalendardata.clone());
	}

	/**
	* Returns the description of this trainingcalendardata.
	*
	* @return the description of this trainingcalendardata
	*/
	@Override
	public java.lang.String getDescription() {
		return _trainingcalendardata.getDescription();
	}

	/**
	* Returns the location of this trainingcalendardata.
	*
	* @return the location of this trainingcalendardata
	*/
	@Override
	public java.lang.String getLocation() {
		return _trainingcalendardata.getLocation();
	}

	/**
	* Returns the title of this trainingcalendardata.
	*
	* @return the title of this trainingcalendardata
	*/
	@Override
	public java.lang.String getTitle() {
		return _trainingcalendardata.getTitle();
	}

	@Override
	public java.lang.String toString() {
		return _trainingcalendardata.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _trainingcalendardata.toXmlString();
	}

	/**
	* Returns the scheduleenddate of this trainingcalendardata.
	*
	* @return the scheduleenddate of this trainingcalendardata
	*/
	@Override
	public Date getScheduleenddate() {
		return _trainingcalendardata.getScheduleenddate();
	}

	/**
	* Returns the schedulestartdate of this trainingcalendardata.
	*
	* @return the schedulestartdate of this trainingcalendardata
	*/
	@Override
	public Date getSchedulestartdate() {
		return _trainingcalendardata.getSchedulestartdate();
	}

	/**
	* Returns the ID of this trainingcalendardata.
	*
	* @return the ID of this trainingcalendardata
	*/
	@Override
	public long getId() {
		return _trainingcalendardata.getId();
	}

	/**
	* Returns the primary key of this trainingcalendardata.
	*
	* @return the primary key of this trainingcalendardata
	*/
	@Override
	public long getPrimaryKey() {
		return _trainingcalendardata.getPrimaryKey();
	}

	@Override
	public void persist() {
		_trainingcalendardata.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_trainingcalendardata.setCachedModel(cachedModel);
	}

	/**
	* Sets the description of this trainingcalendardata.
	*
	* @param description the description of this trainingcalendardata
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_trainingcalendardata.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_trainingcalendardata.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_trainingcalendardata.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_trainingcalendardata.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this trainingcalendardata.
	*
	* @param id the ID of this trainingcalendardata
	*/
	@Override
	public void setId(long id) {
		_trainingcalendardata.setId(id);
	}

	/**
	* Sets the location of this trainingcalendardata.
	*
	* @param location the location of this trainingcalendardata
	*/
	@Override
	public void setLocation(java.lang.String location) {
		_trainingcalendardata.setLocation(location);
	}

	@Override
	public void setNew(boolean n) {
		_trainingcalendardata.setNew(n);
	}

	/**
	* Sets the primary key of this trainingcalendardata.
	*
	* @param primaryKey the primary key of this trainingcalendardata
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_trainingcalendardata.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_trainingcalendardata.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the scheduleenddate of this trainingcalendardata.
	*
	* @param scheduleenddate the scheduleenddate of this trainingcalendardata
	*/
	@Override
	public void setScheduleenddate(Date scheduleenddate) {
		_trainingcalendardata.setScheduleenddate(scheduleenddate);
	}

	/**
	* Sets the schedulestartdate of this trainingcalendardata.
	*
	* @param schedulestartdate the schedulestartdate of this trainingcalendardata
	*/
	@Override
	public void setSchedulestartdate(Date schedulestartdate) {
		_trainingcalendardata.setSchedulestartdate(schedulestartdate);
	}

	/**
	* Sets the title of this trainingcalendardata.
	*
	* @param title the title of this trainingcalendardata
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_trainingcalendardata.setTitle(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof trainingcalendardataWrapper)) {
			return false;
		}

		trainingcalendardataWrapper trainingcalendardataWrapper = (trainingcalendardataWrapper)obj;

		if (Objects.equals(_trainingcalendardata,
					trainingcalendardataWrapper._trainingcalendardata)) {
			return true;
		}

		return false;
	}

	@Override
	public trainingcalendardata getWrappedModel() {
		return _trainingcalendardata;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _trainingcalendardata.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _trainingcalendardata.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_trainingcalendardata.resetOriginalValues();
	}

	private final trainingcalendardata _trainingcalendardata;
}