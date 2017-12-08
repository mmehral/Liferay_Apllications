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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link floorwing}.
 * </p>
 *
 * @author adms.java1
 * @see floorwing
 * @generated
 */
@ProviderType
public class floorwingWrapper implements floorwing, ModelWrapper<floorwing> {
	public floorwingWrapper(floorwing floorwing) {
		_floorwing = floorwing;
	}

	@Override
	public Class<?> getModelClass() {
		return floorwing.class;
	}

	@Override
	public String getModelClassName() {
		return floorwing.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("floorwing_id", getFloorwing_id());
		attributes.put("state_id", getState_id());
		attributes.put("location_id", getLocation_id());
		attributes.put("floor_name", getFloor_name());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long floorwing_id = (Long)attributes.get("floorwing_id");

		if (floorwing_id != null) {
			setFloorwing_id(floorwing_id);
		}

		Long state_id = (Long)attributes.get("state_id");

		if (state_id != null) {
			setState_id(state_id);
		}

		Long location_id = (Long)attributes.get("location_id");

		if (location_id != null) {
			setLocation_id(location_id);
		}

		String floor_name = (String)attributes.get("floor_name");

		if (floor_name != null) {
			setFloor_name(floor_name);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _floorwing.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _floorwing.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _floorwing.isNew();
	}

	@Override
	public com.chola.conferenceroombooking.model.floorwing toEscapedModel() {
		return new floorwingWrapper(_floorwing.toEscapedModel());
	}

	@Override
	public com.chola.conferenceroombooking.model.floorwing toUnescapedModel() {
		return new floorwingWrapper(_floorwing.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _floorwing.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.conferenceroombooking.model.floorwing> toCacheModel() {
		return _floorwing.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.conferenceroombooking.model.floorwing floorwing) {
		return _floorwing.compareTo(floorwing);
	}

	@Override
	public int hashCode() {
		return _floorwing.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _floorwing.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new floorwingWrapper((floorwing)_floorwing.clone());
	}

	/**
	* Returns the floor_name of this floorwing.
	*
	* @return the floor_name of this floorwing
	*/
	@Override
	public java.lang.String getFloor_name() {
		return _floorwing.getFloor_name();
	}

	@Override
	public java.lang.String toString() {
		return _floorwing.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _floorwing.toXmlString();
	}

	/**
	* Returns the floorwing_id of this floorwing.
	*
	* @return the floorwing_id of this floorwing
	*/
	@Override
	public long getFloorwing_id() {
		return _floorwing.getFloorwing_id();
	}

	/**
	* Returns the location_id of this floorwing.
	*
	* @return the location_id of this floorwing
	*/
	@Override
	public long getLocation_id() {
		return _floorwing.getLocation_id();
	}

	/**
	* Returns the primary key of this floorwing.
	*
	* @return the primary key of this floorwing
	*/
	@Override
	public long getPrimaryKey() {
		return _floorwing.getPrimaryKey();
	}

	/**
	* Returns the state_id of this floorwing.
	*
	* @return the state_id of this floorwing
	*/
	@Override
	public long getState_id() {
		return _floorwing.getState_id();
	}

	@Override
	public void persist() {
		_floorwing.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_floorwing.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_floorwing.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_floorwing.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_floorwing.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the floor_name of this floorwing.
	*
	* @param floor_name the floor_name of this floorwing
	*/
	@Override
	public void setFloor_name(java.lang.String floor_name) {
		_floorwing.setFloor_name(floor_name);
	}

	/**
	* Sets the floorwing_id of this floorwing.
	*
	* @param floorwing_id the floorwing_id of this floorwing
	*/
	@Override
	public void setFloorwing_id(long floorwing_id) {
		_floorwing.setFloorwing_id(floorwing_id);
	}

	/**
	* Sets the location_id of this floorwing.
	*
	* @param location_id the location_id of this floorwing
	*/
	@Override
	public void setLocation_id(long location_id) {
		_floorwing.setLocation_id(location_id);
	}

	@Override
	public void setNew(boolean n) {
		_floorwing.setNew(n);
	}

	/**
	* Sets the primary key of this floorwing.
	*
	* @param primaryKey the primary key of this floorwing
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_floorwing.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_floorwing.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the state_id of this floorwing.
	*
	* @param state_id the state_id of this floorwing
	*/
	@Override
	public void setState_id(long state_id) {
		_floorwing.setState_id(state_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof floorwingWrapper)) {
			return false;
		}

		floorwingWrapper floorwingWrapper = (floorwingWrapper)obj;

		if (Objects.equals(_floorwing, floorwingWrapper._floorwing)) {
			return true;
		}

		return false;
	}

	@Override
	public floorwing getWrappedModel() {
		return _floorwing;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _floorwing.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _floorwing.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_floorwing.resetOriginalValues();
	}

	private final floorwing _floorwing;
}