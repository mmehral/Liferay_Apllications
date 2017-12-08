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
 * This class is a wrapper for {@link corporateeventsdata}.
 * </p>
 *
 * @author adms.java1
 * @see corporateeventsdata
 * @generated
 */
@ProviderType
public class corporateeventsdataWrapper implements corporateeventsdata,
	ModelWrapper<corporateeventsdata> {
	public corporateeventsdataWrapper(corporateeventsdata corporateeventsdata) {
		_corporateeventsdata = corporateeventsdata;
	}

	@Override
	public Class<?> getModelClass() {
		return corporateeventsdata.class;
	}

	@Override
	public String getModelClassName() {
		return corporateeventsdata.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("zone", getZone());
		attributes.put("region", getRegion());
		attributes.put("location", getLocation());
		attributes.put("personincharge", getPersonincharge());
		attributes.put("schedulestartdate", getSchedulestartdate());
		attributes.put("scheduleenddate", getScheduleenddate());

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

		String zone = (String)attributes.get("zone");

		if (zone != null) {
			setZone(zone);
		}

		String region = (String)attributes.get("region");

		if (region != null) {
			setRegion(region);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String personincharge = (String)attributes.get("personincharge");

		if (personincharge != null) {
			setPersonincharge(personincharge);
		}

		Date schedulestartdate = (Date)attributes.get("schedulestartdate");

		if (schedulestartdate != null) {
			setSchedulestartdate(schedulestartdate);
		}

		Date scheduleenddate = (Date)attributes.get("scheduleenddate");

		if (scheduleenddate != null) {
			setScheduleenddate(scheduleenddate);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _corporateeventsdata.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _corporateeventsdata.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _corporateeventsdata.isNew();
	}

	@Override
	public com.chola.calendar.model.corporateeventsdata toEscapedModel() {
		return new corporateeventsdataWrapper(_corporateeventsdata.toEscapedModel());
	}

	@Override
	public com.chola.calendar.model.corporateeventsdata toUnescapedModel() {
		return new corporateeventsdataWrapper(_corporateeventsdata.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _corporateeventsdata.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.calendar.model.corporateeventsdata> toCacheModel() {
		return _corporateeventsdata.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.calendar.model.corporateeventsdata corporateeventsdata) {
		return _corporateeventsdata.compareTo(corporateeventsdata);
	}

	@Override
	public int hashCode() {
		return _corporateeventsdata.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _corporateeventsdata.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new corporateeventsdataWrapper((corporateeventsdata)_corporateeventsdata.clone());
	}

	/**
	* Returns the description of this corporateeventsdata.
	*
	* @return the description of this corporateeventsdata
	*/
	@Override
	public java.lang.String getDescription() {
		return _corporateeventsdata.getDescription();
	}

	/**
	* Returns the location of this corporateeventsdata.
	*
	* @return the location of this corporateeventsdata
	*/
	@Override
	public java.lang.String getLocation() {
		return _corporateeventsdata.getLocation();
	}

	/**
	* Returns the personincharge of this corporateeventsdata.
	*
	* @return the personincharge of this corporateeventsdata
	*/
	@Override
	public java.lang.String getPersonincharge() {
		return _corporateeventsdata.getPersonincharge();
	}

	/**
	* Returns the region of this corporateeventsdata.
	*
	* @return the region of this corporateeventsdata
	*/
	@Override
	public java.lang.String getRegion() {
		return _corporateeventsdata.getRegion();
	}

	/**
	* Returns the title of this corporateeventsdata.
	*
	* @return the title of this corporateeventsdata
	*/
	@Override
	public java.lang.String getTitle() {
		return _corporateeventsdata.getTitle();
	}

	/**
	* Returns the zone of this corporateeventsdata.
	*
	* @return the zone of this corporateeventsdata
	*/
	@Override
	public java.lang.String getZone() {
		return _corporateeventsdata.getZone();
	}

	@Override
	public java.lang.String toString() {
		return _corporateeventsdata.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _corporateeventsdata.toXmlString();
	}

	/**
	* Returns the scheduleenddate of this corporateeventsdata.
	*
	* @return the scheduleenddate of this corporateeventsdata
	*/
	@Override
	public Date getScheduleenddate() {
		return _corporateeventsdata.getScheduleenddate();
	}

	/**
	* Returns the schedulestartdate of this corporateeventsdata.
	*
	* @return the schedulestartdate of this corporateeventsdata
	*/
	@Override
	public Date getSchedulestartdate() {
		return _corporateeventsdata.getSchedulestartdate();
	}

	/**
	* Returns the ID of this corporateeventsdata.
	*
	* @return the ID of this corporateeventsdata
	*/
	@Override
	public long getId() {
		return _corporateeventsdata.getId();
	}

	/**
	* Returns the primary key of this corporateeventsdata.
	*
	* @return the primary key of this corporateeventsdata
	*/
	@Override
	public long getPrimaryKey() {
		return _corporateeventsdata.getPrimaryKey();
	}

	@Override
	public void persist() {
		_corporateeventsdata.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_corporateeventsdata.setCachedModel(cachedModel);
	}

	/**
	* Sets the description of this corporateeventsdata.
	*
	* @param description the description of this corporateeventsdata
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_corporateeventsdata.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_corporateeventsdata.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_corporateeventsdata.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_corporateeventsdata.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this corporateeventsdata.
	*
	* @param id the ID of this corporateeventsdata
	*/
	@Override
	public void setId(long id) {
		_corporateeventsdata.setId(id);
	}

	/**
	* Sets the location of this corporateeventsdata.
	*
	* @param location the location of this corporateeventsdata
	*/
	@Override
	public void setLocation(java.lang.String location) {
		_corporateeventsdata.setLocation(location);
	}

	@Override
	public void setNew(boolean n) {
		_corporateeventsdata.setNew(n);
	}

	/**
	* Sets the personincharge of this corporateeventsdata.
	*
	* @param personincharge the personincharge of this corporateeventsdata
	*/
	@Override
	public void setPersonincharge(java.lang.String personincharge) {
		_corporateeventsdata.setPersonincharge(personincharge);
	}

	/**
	* Sets the primary key of this corporateeventsdata.
	*
	* @param primaryKey the primary key of this corporateeventsdata
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_corporateeventsdata.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_corporateeventsdata.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the region of this corporateeventsdata.
	*
	* @param region the region of this corporateeventsdata
	*/
	@Override
	public void setRegion(java.lang.String region) {
		_corporateeventsdata.setRegion(region);
	}

	/**
	* Sets the scheduleenddate of this corporateeventsdata.
	*
	* @param scheduleenddate the scheduleenddate of this corporateeventsdata
	*/
	@Override
	public void setScheduleenddate(Date scheduleenddate) {
		_corporateeventsdata.setScheduleenddate(scheduleenddate);
	}

	/**
	* Sets the schedulestartdate of this corporateeventsdata.
	*
	* @param schedulestartdate the schedulestartdate of this corporateeventsdata
	*/
	@Override
	public void setSchedulestartdate(Date schedulestartdate) {
		_corporateeventsdata.setSchedulestartdate(schedulestartdate);
	}

	/**
	* Sets the title of this corporateeventsdata.
	*
	* @param title the title of this corporateeventsdata
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_corporateeventsdata.setTitle(title);
	}

	/**
	* Sets the zone of this corporateeventsdata.
	*
	* @param zone the zone of this corporateeventsdata
	*/
	@Override
	public void setZone(java.lang.String zone) {
		_corporateeventsdata.setZone(zone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof corporateeventsdataWrapper)) {
			return false;
		}

		corporateeventsdataWrapper corporateeventsdataWrapper = (corporateeventsdataWrapper)obj;

		if (Objects.equals(_corporateeventsdata,
					corporateeventsdataWrapper._corporateeventsdata)) {
			return true;
		}

		return false;
	}

	@Override
	public corporateeventsdata getWrappedModel() {
		return _corporateeventsdata;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _corporateeventsdata.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _corporateeventsdata.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_corporateeventsdata.resetOriginalValues();
	}

	private final corporateeventsdata _corporateeventsdata;
}