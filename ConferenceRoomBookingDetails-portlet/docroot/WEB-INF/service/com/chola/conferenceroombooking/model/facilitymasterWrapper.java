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
 * This class is a wrapper for {@link facilitymaster}.
 * </p>
 *
 * @author adms.java1
 * @see facilitymaster
 * @generated
 */
@ProviderType
public class facilitymasterWrapper implements facilitymaster,
	ModelWrapper<facilitymaster> {
	public facilitymasterWrapper(facilitymaster facilitymaster) {
		_facilitymaster = facilitymaster;
	}

	@Override
	public Class<?> getModelClass() {
		return facilitymaster.class;
	}

	@Override
	public String getModelClassName() {
		return facilitymaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("facility_id", getFacility_id());
		attributes.put("facility_name", getFacility_name());
		attributes.put("facility_description", getFacility_description());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long facility_id = (Long)attributes.get("facility_id");

		if (facility_id != null) {
			setFacility_id(facility_id);
		}

		String facility_name = (String)attributes.get("facility_name");

		if (facility_name != null) {
			setFacility_name(facility_name);
		}

		String facility_description = (String)attributes.get(
				"facility_description");

		if (facility_description != null) {
			setFacility_description(facility_description);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _facilitymaster.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _facilitymaster.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _facilitymaster.isNew();
	}

	@Override
	public com.chola.conferenceroombooking.model.facilitymaster toEscapedModel() {
		return new facilitymasterWrapper(_facilitymaster.toEscapedModel());
	}

	@Override
	public com.chola.conferenceroombooking.model.facilitymaster toUnescapedModel() {
		return new facilitymasterWrapper(_facilitymaster.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _facilitymaster.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.conferenceroombooking.model.facilitymaster> toCacheModel() {
		return _facilitymaster.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.conferenceroombooking.model.facilitymaster facilitymaster) {
		return _facilitymaster.compareTo(facilitymaster);
	}

	@Override
	public int hashCode() {
		return _facilitymaster.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _facilitymaster.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new facilitymasterWrapper((facilitymaster)_facilitymaster.clone());
	}

	/**
	* Returns the facility_description of this facilitymaster.
	*
	* @return the facility_description of this facilitymaster
	*/
	@Override
	public java.lang.String getFacility_description() {
		return _facilitymaster.getFacility_description();
	}

	/**
	* Returns the facility_name of this facilitymaster.
	*
	* @return the facility_name of this facilitymaster
	*/
	@Override
	public java.lang.String getFacility_name() {
		return _facilitymaster.getFacility_name();
	}

	@Override
	public java.lang.String toString() {
		return _facilitymaster.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _facilitymaster.toXmlString();
	}

	/**
	* Returns the facility_id of this facilitymaster.
	*
	* @return the facility_id of this facilitymaster
	*/
	@Override
	public long getFacility_id() {
		return _facilitymaster.getFacility_id();
	}

	/**
	* Returns the primary key of this facilitymaster.
	*
	* @return the primary key of this facilitymaster
	*/
	@Override
	public long getPrimaryKey() {
		return _facilitymaster.getPrimaryKey();
	}

	@Override
	public void persist() {
		_facilitymaster.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_facilitymaster.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_facilitymaster.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_facilitymaster.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_facilitymaster.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the facility_description of this facilitymaster.
	*
	* @param facility_description the facility_description of this facilitymaster
	*/
	@Override
	public void setFacility_description(java.lang.String facility_description) {
		_facilitymaster.setFacility_description(facility_description);
	}

	/**
	* Sets the facility_id of this facilitymaster.
	*
	* @param facility_id the facility_id of this facilitymaster
	*/
	@Override
	public void setFacility_id(long facility_id) {
		_facilitymaster.setFacility_id(facility_id);
	}

	/**
	* Sets the facility_name of this facilitymaster.
	*
	* @param facility_name the facility_name of this facilitymaster
	*/
	@Override
	public void setFacility_name(java.lang.String facility_name) {
		_facilitymaster.setFacility_name(facility_name);
	}

	@Override
	public void setNew(boolean n) {
		_facilitymaster.setNew(n);
	}

	/**
	* Sets the primary key of this facilitymaster.
	*
	* @param primaryKey the primary key of this facilitymaster
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_facilitymaster.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_facilitymaster.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof facilitymasterWrapper)) {
			return false;
		}

		facilitymasterWrapper facilitymasterWrapper = (facilitymasterWrapper)obj;

		if (Objects.equals(_facilitymaster,
					facilitymasterWrapper._facilitymaster)) {
			return true;
		}

		return false;
	}

	@Override
	public facilitymaster getWrappedModel() {
		return _facilitymaster;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _facilitymaster.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _facilitymaster.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_facilitymaster.resetOriginalValues();
	}

	private final facilitymaster _facilitymaster;
}