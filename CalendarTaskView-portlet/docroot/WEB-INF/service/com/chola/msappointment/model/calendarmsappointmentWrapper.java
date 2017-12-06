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

package com.chola.msappointment.model;

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
 * This class is a wrapper for {@link calendarmsappointment}.
 * </p>
 *
 * @author CloverLiferay01
 * @see calendarmsappointment
 * @generated
 */
@ProviderType
public class calendarmsappointmentWrapper implements calendarmsappointment,
	ModelWrapper<calendarmsappointment> {
	public calendarmsappointmentWrapper(
		calendarmsappointment calendarmsappointment) {
		_calendarmsappointment = calendarmsappointment;
	}

	@Override
	public Class<?> getModelClass() {
		return calendarmsappointment.class;
	}

	@Override
	public String getModelClassName() {
		return calendarmsappointment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _calendarmsappointment.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _calendarmsappointment.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _calendarmsappointment.isNew();
	}

	@Override
	public com.chola.msappointment.model.calendarmsappointment toEscapedModel() {
		return new calendarmsappointmentWrapper(_calendarmsappointment.toEscapedModel());
	}

	@Override
	public com.chola.msappointment.model.calendarmsappointment toUnescapedModel() {
		return new calendarmsappointmentWrapper(_calendarmsappointment.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _calendarmsappointment.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.msappointment.model.calendarmsappointment> toCacheModel() {
		return _calendarmsappointment.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.msappointment.model.calendarmsappointment calendarmsappointment) {
		return _calendarmsappointment.compareTo(calendarmsappointment);
	}

	@Override
	public int hashCode() {
		return _calendarmsappointment.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _calendarmsappointment.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new calendarmsappointmentWrapper((calendarmsappointment)_calendarmsappointment.clone());
	}

	@Override
	public java.lang.String toString() {
		return _calendarmsappointment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _calendarmsappointment.toXmlString();
	}

	/**
	* Returns the ID of this calendarmsappointment.
	*
	* @return the ID of this calendarmsappointment
	*/
	@Override
	public long getId() {
		return _calendarmsappointment.getId();
	}

	/**
	* Returns the primary key of this calendarmsappointment.
	*
	* @return the primary key of this calendarmsappointment
	*/
	@Override
	public long getPrimaryKey() {
		return _calendarmsappointment.getPrimaryKey();
	}

	@Override
	public void persist() {
		_calendarmsappointment.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_calendarmsappointment.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_calendarmsappointment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_calendarmsappointment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_calendarmsappointment.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this calendarmsappointment.
	*
	* @param id the ID of this calendarmsappointment
	*/
	@Override
	public void setId(long id) {
		_calendarmsappointment.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_calendarmsappointment.setNew(n);
	}

	/**
	* Sets the primary key of this calendarmsappointment.
	*
	* @param primaryKey the primary key of this calendarmsappointment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_calendarmsappointment.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_calendarmsappointment.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof calendarmsappointmentWrapper)) {
			return false;
		}

		calendarmsappointmentWrapper calendarmsappointmentWrapper = (calendarmsappointmentWrapper)obj;

		if (Objects.equals(_calendarmsappointment,
					calendarmsappointmentWrapper._calendarmsappointment)) {
			return true;
		}

		return false;
	}

	@Override
	public calendarmsappointment getWrappedModel() {
		return _calendarmsappointment;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _calendarmsappointment.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _calendarmsappointment.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_calendarmsappointment.resetOriginalValues();
	}

	private final calendarmsappointment _calendarmsappointment;
}