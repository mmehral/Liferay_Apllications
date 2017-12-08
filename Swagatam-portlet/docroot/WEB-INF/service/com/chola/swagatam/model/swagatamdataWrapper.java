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

package com.chola.swagatam.model;

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
 * This class is a wrapper for {@link swagatamdata}.
 * </p>
 *
 * @author CloverLiferay02
 * @see swagatamdata
 * @generated
 */
@ProviderType
public class swagatamdataWrapper implements swagatamdata,
	ModelWrapper<swagatamdata> {
	public swagatamdataWrapper(swagatamdata swagatamdata) {
		_swagatamdata = swagatamdata;
	}

	@Override
	public Class<?> getModelClass() {
		return swagatamdata.class;
	}

	@Override
	public String getModelClassName() {
		return swagatamdata.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("empId", getEmpId());
		attributes.put("watched", getWatched());
		attributes.put("acknowledged", getAcknowledged());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String empId = (String)attributes.get("empId");

		if (empId != null) {
			setEmpId(empId);
		}

		String watched = (String)attributes.get("watched");

		if (watched != null) {
			setWatched(watched);
		}

		String acknowledged = (String)attributes.get("acknowledged");

		if (acknowledged != null) {
			setAcknowledged(acknowledged);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _swagatamdata.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _swagatamdata.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _swagatamdata.isNew();
	}

	@Override
	public com.chola.swagatam.model.swagatamdata toEscapedModel() {
		return new swagatamdataWrapper(_swagatamdata.toEscapedModel());
	}

	@Override
	public com.chola.swagatam.model.swagatamdata toUnescapedModel() {
		return new swagatamdataWrapper(_swagatamdata.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _swagatamdata.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.swagatam.model.swagatamdata> toCacheModel() {
		return _swagatamdata.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.swagatam.model.swagatamdata swagatamdata) {
		return _swagatamdata.compareTo(swagatamdata);
	}

	@Override
	public int hashCode() {
		return _swagatamdata.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _swagatamdata.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new swagatamdataWrapper((swagatamdata)_swagatamdata.clone());
	}

	/**
	* Returns the acknowledged of this swagatamdata.
	*
	* @return the acknowledged of this swagatamdata
	*/
	@Override
	public java.lang.String getAcknowledged() {
		return _swagatamdata.getAcknowledged();
	}

	/**
	* Returns the emp ID of this swagatamdata.
	*
	* @return the emp ID of this swagatamdata
	*/
	@Override
	public java.lang.String getEmpId() {
		return _swagatamdata.getEmpId();
	}

	/**
	* Returns the watched of this swagatamdata.
	*
	* @return the watched of this swagatamdata
	*/
	@Override
	public java.lang.String getWatched() {
		return _swagatamdata.getWatched();
	}

	@Override
	public java.lang.String toString() {
		return _swagatamdata.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _swagatamdata.toXmlString();
	}

	/**
	* Returns the ID of this swagatamdata.
	*
	* @return the ID of this swagatamdata
	*/
	@Override
	public long getId() {
		return _swagatamdata.getId();
	}

	/**
	* Returns the primary key of this swagatamdata.
	*
	* @return the primary key of this swagatamdata
	*/
	@Override
	public long getPrimaryKey() {
		return _swagatamdata.getPrimaryKey();
	}

	@Override
	public void persist() {
		_swagatamdata.persist();
	}

	/**
	* Sets the acknowledged of this swagatamdata.
	*
	* @param acknowledged the acknowledged of this swagatamdata
	*/
	@Override
	public void setAcknowledged(java.lang.String acknowledged) {
		_swagatamdata.setAcknowledged(acknowledged);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_swagatamdata.setCachedModel(cachedModel);
	}

	/**
	* Sets the emp ID of this swagatamdata.
	*
	* @param empId the emp ID of this swagatamdata
	*/
	@Override
	public void setEmpId(java.lang.String empId) {
		_swagatamdata.setEmpId(empId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_swagatamdata.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_swagatamdata.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_swagatamdata.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this swagatamdata.
	*
	* @param id the ID of this swagatamdata
	*/
	@Override
	public void setId(long id) {
		_swagatamdata.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_swagatamdata.setNew(n);
	}

	/**
	* Sets the primary key of this swagatamdata.
	*
	* @param primaryKey the primary key of this swagatamdata
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_swagatamdata.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_swagatamdata.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the watched of this swagatamdata.
	*
	* @param watched the watched of this swagatamdata
	*/
	@Override
	public void setWatched(java.lang.String watched) {
		_swagatamdata.setWatched(watched);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof swagatamdataWrapper)) {
			return false;
		}

		swagatamdataWrapper swagatamdataWrapper = (swagatamdataWrapper)obj;

		if (Objects.equals(_swagatamdata, swagatamdataWrapper._swagatamdata)) {
			return true;
		}

		return false;
	}

	@Override
	public swagatamdata getWrappedModel() {
		return _swagatamdata;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _swagatamdata.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _swagatamdata.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_swagatamdata.resetOriginalValues();
	}

	private final swagatamdata _swagatamdata;
}