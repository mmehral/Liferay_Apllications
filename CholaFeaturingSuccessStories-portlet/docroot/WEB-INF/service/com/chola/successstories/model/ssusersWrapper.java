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

package com.chola.successstories.model;

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
 * This class is a wrapper for {@link ssusers}.
 * </p>
 *
 * @author cloverliferay01
 * @see ssusers
 * @generated
 */
@ProviderType
public class ssusersWrapper implements ssusers, ModelWrapper<ssusers> {
	public ssusersWrapper(ssusers ssusers) {
		_ssusers = ssusers;
	}

	@Override
	public Class<?> getModelClass() {
		return ssusers.class;
	}

	@Override
	public String getModelClassName() {
		return ssusers.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("user_id", getUser_id());
		attributes.put("ssdetails_id", getSsdetails_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long user_id = (Long)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
		}

		Long ssdetails_id = (Long)attributes.get("ssdetails_id");

		if (ssdetails_id != null) {
			setSsdetails_id(ssdetails_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _ssusers.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _ssusers.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _ssusers.isNew();
	}

	@Override
	public com.chola.successstories.model.ssusers toEscapedModel() {
		return new ssusersWrapper(_ssusers.toEscapedModel());
	}

	@Override
	public com.chola.successstories.model.ssusers toUnescapedModel() {
		return new ssusersWrapper(_ssusers.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _ssusers.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.successstories.model.ssusers> toCacheModel() {
		return _ssusers.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.successstories.model.ssusers ssusers) {
		return _ssusers.compareTo(ssusers);
	}

	@Override
	public int hashCode() {
		return _ssusers.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ssusers.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ssusersWrapper((ssusers)_ssusers.clone());
	}

	@Override
	public java.lang.String toString() {
		return _ssusers.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _ssusers.toXmlString();
	}

	/**
	* Returns the ID of this ssusers.
	*
	* @return the ID of this ssusers
	*/
	@Override
	public long getId() {
		return _ssusers.getId();
	}

	/**
	* Returns the primary key of this ssusers.
	*
	* @return the primary key of this ssusers
	*/
	@Override
	public long getPrimaryKey() {
		return _ssusers.getPrimaryKey();
	}

	/**
	* Returns the ssdetails_id of this ssusers.
	*
	* @return the ssdetails_id of this ssusers
	*/
	@Override
	public long getSsdetails_id() {
		return _ssusers.getSsdetails_id();
	}

	/**
	* Returns the user_id of this ssusers.
	*
	* @return the user_id of this ssusers
	*/
	@Override
	public long getUser_id() {
		return _ssusers.getUser_id();
	}

	@Override
	public void persist() {
		_ssusers.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_ssusers.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_ssusers.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_ssusers.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_ssusers.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this ssusers.
	*
	* @param id the ID of this ssusers
	*/
	@Override
	public void setId(long id) {
		_ssusers.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_ssusers.setNew(n);
	}

	/**
	* Sets the primary key of this ssusers.
	*
	* @param primaryKey the primary key of this ssusers
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_ssusers.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_ssusers.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the ssdetails_id of this ssusers.
	*
	* @param ssdetails_id the ssdetails_id of this ssusers
	*/
	@Override
	public void setSsdetails_id(long ssdetails_id) {
		_ssusers.setSsdetails_id(ssdetails_id);
	}

	/**
	* Sets the user_id of this ssusers.
	*
	* @param user_id the user_id of this ssusers
	*/
	@Override
	public void setUser_id(long user_id) {
		_ssusers.setUser_id(user_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ssusersWrapper)) {
			return false;
		}

		ssusersWrapper ssusersWrapper = (ssusersWrapper)obj;

		if (Objects.equals(_ssusers, ssusersWrapper._ssusers)) {
			return true;
		}

		return false;
	}

	@Override
	public ssusers getWrappedModel() {
		return _ssusers;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _ssusers.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _ssusers.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_ssusers.resetOriginalValues();
	}

	private final ssusers _ssusers;
}