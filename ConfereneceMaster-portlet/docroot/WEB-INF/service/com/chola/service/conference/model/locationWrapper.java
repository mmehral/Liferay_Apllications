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

package com.chola.service.conference.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link location}.
 * </p>
 *
 * @author adms.java1
 * @see location
 * @generated
 */
@ProviderType
public class locationWrapper implements location, ModelWrapper<location> {
	public locationWrapper(location location) {
		_location = location;
	}

	@Override
	public Class<?> getModelClass() {
		return location.class;
	}

	@Override
	public String getModelClassName() {
		return location.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("location_id", getLocation_id());
		attributes.put("location_name", getLocation_name());
		attributes.put("state_id", getState_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long location_id = (Long)attributes.get("location_id");

		if (location_id != null) {
			setLocation_id(location_id);
		}

		String location_name = (String)attributes.get("location_name");

		if (location_name != null) {
			setLocation_name(location_name);
		}

		Long state_id = (Long)attributes.get("state_id");

		if (state_id != null) {
			setState_id(state_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _location.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _location.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _location.isNew();
	}

	@Override
	public com.chola.service.conference.model.location toEscapedModel() {
		return new locationWrapper(_location.toEscapedModel());
	}

	@Override
	public com.chola.service.conference.model.location toUnescapedModel() {
		return new locationWrapper(_location.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _location.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.service.conference.model.location> toCacheModel() {
		return _location.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.service.conference.model.location location) {
		return _location.compareTo(location);
	}

	@Override
	public int hashCode() {
		return _location.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _location.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new locationWrapper((location)_location.clone());
	}

	/**
	* Returns the location_name of this location.
	*
	* @return the location_name of this location
	*/
	@Override
	public java.lang.String getLocation_name() {
		return _location.getLocation_name();
	}

	@Override
	public java.lang.String toString() {
		return _location.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _location.toXmlString();
	}

	/**
	* Returns the location_id of this location.
	*
	* @return the location_id of this location
	*/
	@Override
	public long getLocation_id() {
		return _location.getLocation_id();
	}

	/**
	* Returns the primary key of this location.
	*
	* @return the primary key of this location
	*/
	@Override
	public long getPrimaryKey() {
		return _location.getPrimaryKey();
	}

	/**
	* Returns the state_id of this location.
	*
	* @return the state_id of this location
	*/
	@Override
	public long getState_id() {
		return _location.getState_id();
	}

	@Override
	public void persist() {
		_location.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_location.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_location.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_location.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_location.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the location_id of this location.
	*
	* @param location_id the location_id of this location
	*/
	@Override
	public void setLocation_id(long location_id) {
		_location.setLocation_id(location_id);
	}

	/**
	* Sets the location_name of this location.
	*
	* @param location_name the location_name of this location
	*/
	@Override
	public void setLocation_name(java.lang.String location_name) {
		_location.setLocation_name(location_name);
	}

	@Override
	public void setNew(boolean n) {
		_location.setNew(n);
	}

	/**
	* Sets the primary key of this location.
	*
	* @param primaryKey the primary key of this location
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_location.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_location.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the state_id of this location.
	*
	* @param state_id the state_id of this location
	*/
	@Override
	public void setState_id(long state_id) {
		_location.setState_id(state_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof locationWrapper)) {
			return false;
		}

		locationWrapper locationWrapper = (locationWrapper)obj;

		if (Objects.equals(_location, locationWrapper._location)) {
			return true;
		}

		return false;
	}

	@Override
	public location getWrappedModel() {
		return _location;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _location.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _location.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_location.resetOriginalValues();
	}

	private final location _location;
}