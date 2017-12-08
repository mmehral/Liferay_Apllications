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

package com.chola.birthday.model;

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
 * This class is a wrapper for {@link predefinedmessages}.
 * </p>
 *
 * @author CloverLiferay02
 * @see predefinedmessages
 * @generated
 */
@ProviderType
public class predefinedmessagesWrapper implements predefinedmessages,
	ModelWrapper<predefinedmessages> {
	public predefinedmessagesWrapper(predefinedmessages predefinedmessages) {
		_predefinedmessages = predefinedmessages;
	}

	@Override
	public Class<?> getModelClass() {
		return predefinedmessages.class;
	}

	@Override
	public String getModelClassName() {
		return predefinedmessages.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("message", getMessage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _predefinedmessages.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _predefinedmessages.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _predefinedmessages.isNew();
	}

	@Override
	public com.chola.birthday.model.predefinedmessages toEscapedModel() {
		return new predefinedmessagesWrapper(_predefinedmessages.toEscapedModel());
	}

	@Override
	public com.chola.birthday.model.predefinedmessages toUnescapedModel() {
		return new predefinedmessagesWrapper(_predefinedmessages.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _predefinedmessages.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.birthday.model.predefinedmessages> toCacheModel() {
		return _predefinedmessages.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.birthday.model.predefinedmessages predefinedmessages) {
		return _predefinedmessages.compareTo(predefinedmessages);
	}

	@Override
	public int hashCode() {
		return _predefinedmessages.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _predefinedmessages.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new predefinedmessagesWrapper((predefinedmessages)_predefinedmessages.clone());
	}

	/**
	* Returns the message of this predefinedmessages.
	*
	* @return the message of this predefinedmessages
	*/
	@Override
	public java.lang.String getMessage() {
		return _predefinedmessages.getMessage();
	}

	@Override
	public java.lang.String toString() {
		return _predefinedmessages.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _predefinedmessages.toXmlString();
	}

	/**
	* Returns the ID of this predefinedmessages.
	*
	* @return the ID of this predefinedmessages
	*/
	@Override
	public long getId() {
		return _predefinedmessages.getId();
	}

	/**
	* Returns the primary key of this predefinedmessages.
	*
	* @return the primary key of this predefinedmessages
	*/
	@Override
	public long getPrimaryKey() {
		return _predefinedmessages.getPrimaryKey();
	}

	@Override
	public void persist() {
		_predefinedmessages.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_predefinedmessages.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_predefinedmessages.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_predefinedmessages.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_predefinedmessages.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this predefinedmessages.
	*
	* @param id the ID of this predefinedmessages
	*/
	@Override
	public void setId(long id) {
		_predefinedmessages.setId(id);
	}

	/**
	* Sets the message of this predefinedmessages.
	*
	* @param message the message of this predefinedmessages
	*/
	@Override
	public void setMessage(java.lang.String message) {
		_predefinedmessages.setMessage(message);
	}

	@Override
	public void setNew(boolean n) {
		_predefinedmessages.setNew(n);
	}

	/**
	* Sets the primary key of this predefinedmessages.
	*
	* @param primaryKey the primary key of this predefinedmessages
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_predefinedmessages.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_predefinedmessages.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof predefinedmessagesWrapper)) {
			return false;
		}

		predefinedmessagesWrapper predefinedmessagesWrapper = (predefinedmessagesWrapper)obj;

		if (Objects.equals(_predefinedmessages,
					predefinedmessagesWrapper._predefinedmessages)) {
			return true;
		}

		return false;
	}

	@Override
	public predefinedmessages getWrappedModel() {
		return _predefinedmessages;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _predefinedmessages.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _predefinedmessages.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_predefinedmessages.resetOriginalValues();
	}

	private final predefinedmessages _predefinedmessages;
}