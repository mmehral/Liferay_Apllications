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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link trainingcalendar}.
 * </p>
 *
 * @author CloverLiferay01
 * @see trainingcalendar
 * @generated
 */
@ProviderType
public class trainingcalendarWrapper implements trainingcalendar,
	ModelWrapper<trainingcalendar> {
	public trainingcalendarWrapper(trainingcalendar trainingcalendar) {
		_trainingcalendar = trainingcalendar;
	}

	@Override
	public Class<?> getModelClass() {
		return trainingcalendar.class;
	}

	@Override
	public String getModelClassName() {
		return trainingcalendar.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("trainingid", getTrainingid());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long trainingid = (Long)attributes.get("trainingid");

		if (trainingid != null) {
			setTrainingid(trainingid);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _trainingcalendar.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _trainingcalendar.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _trainingcalendar.isNew();
	}

	@Override
	public com.chola.trainingcalendar.model.trainingcalendar toEscapedModel() {
		return new trainingcalendarWrapper(_trainingcalendar.toEscapedModel());
	}

	@Override
	public com.chola.trainingcalendar.model.trainingcalendar toUnescapedModel() {
		return new trainingcalendarWrapper(_trainingcalendar.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _trainingcalendar.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.trainingcalendar.model.trainingcalendar> toCacheModel() {
		return _trainingcalendar.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.trainingcalendar.model.trainingcalendar trainingcalendar) {
		return _trainingcalendar.compareTo(trainingcalendar);
	}

	@Override
	public int hashCode() {
		return _trainingcalendar.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _trainingcalendar.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new trainingcalendarWrapper((trainingcalendar)_trainingcalendar.clone());
	}

	/**
	* Returns the name of this trainingcalendar.
	*
	* @return the name of this trainingcalendar
	*/
	@Override
	public java.lang.String getName() {
		return _trainingcalendar.getName();
	}

	@Override
	public java.lang.String toString() {
		return _trainingcalendar.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _trainingcalendar.toXmlString();
	}

	/**
	* Returns the primary key of this trainingcalendar.
	*
	* @return the primary key of this trainingcalendar
	*/
	@Override
	public long getPrimaryKey() {
		return _trainingcalendar.getPrimaryKey();
	}

	/**
	* Returns the trainingid of this trainingcalendar.
	*
	* @return the trainingid of this trainingcalendar
	*/
	@Override
	public long getTrainingid() {
		return _trainingcalendar.getTrainingid();
	}

	@Override
	public void persist() {
		_trainingcalendar.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_trainingcalendar.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_trainingcalendar.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_trainingcalendar.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_trainingcalendar.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the name of this trainingcalendar.
	*
	* @param name the name of this trainingcalendar
	*/
	@Override
	public void setName(java.lang.String name) {
		_trainingcalendar.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_trainingcalendar.setNew(n);
	}

	/**
	* Sets the primary key of this trainingcalendar.
	*
	* @param primaryKey the primary key of this trainingcalendar
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_trainingcalendar.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_trainingcalendar.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the trainingid of this trainingcalendar.
	*
	* @param trainingid the trainingid of this trainingcalendar
	*/
	@Override
	public void setTrainingid(long trainingid) {
		_trainingcalendar.setTrainingid(trainingid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof trainingcalendarWrapper)) {
			return false;
		}

		trainingcalendarWrapper trainingcalendarWrapper = (trainingcalendarWrapper)obj;

		if (Objects.equals(_trainingcalendar,
					trainingcalendarWrapper._trainingcalendar)) {
			return true;
		}

		return false;
	}

	@Override
	public trainingcalendar getWrappedModel() {
		return _trainingcalendar;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _trainingcalendar.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _trainingcalendar.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_trainingcalendar.resetOriginalValues();
	}

	private final trainingcalendar _trainingcalendar;
}