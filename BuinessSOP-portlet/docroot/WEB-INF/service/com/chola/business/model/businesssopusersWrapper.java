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

package com.chola.business.model;

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
 * This class is a wrapper for {@link businesssopusers}.
 * </p>
 *
 * @author adms.java1
 * @see businesssopusers
 * @generated
 */
@ProviderType
public class businesssopusersWrapper implements businesssopusers,
	ModelWrapper<businesssopusers> {
	public businesssopusersWrapper(businesssopusers businesssopusers) {
		_businesssopusers = businesssopusers;
	}

	@Override
	public Class<?> getModelClass() {
		return businesssopusers.class;
	}

	@Override
	public String getModelClassName() {
		return businesssopusers.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("user_id", getUser_id());
		attributes.put("businessdetails_id", getBusinessdetails_id());

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

		Long businessdetails_id = (Long)attributes.get("businessdetails_id");

		if (businessdetails_id != null) {
			setBusinessdetails_id(businessdetails_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _businesssopusers.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _businesssopusers.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _businesssopusers.isNew();
	}

	@Override
	public com.chola.business.model.businesssopusers toEscapedModel() {
		return new businesssopusersWrapper(_businesssopusers.toEscapedModel());
	}

	@Override
	public com.chola.business.model.businesssopusers toUnescapedModel() {
		return new businesssopusersWrapper(_businesssopusers.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _businesssopusers.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.business.model.businesssopusers> toCacheModel() {
		return _businesssopusers.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.business.model.businesssopusers businesssopusers) {
		return _businesssopusers.compareTo(businesssopusers);
	}

	@Override
	public int hashCode() {
		return _businesssopusers.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _businesssopusers.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new businesssopusersWrapper((businesssopusers)_businesssopusers.clone());
	}

	@Override
	public java.lang.String toString() {
		return _businesssopusers.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _businesssopusers.toXmlString();
	}

	/**
	* Returns the businessdetails_id of this businesssopusers.
	*
	* @return the businessdetails_id of this businesssopusers
	*/
	@Override
	public long getBusinessdetails_id() {
		return _businesssopusers.getBusinessdetails_id();
	}

	/**
	* Returns the ID of this businesssopusers.
	*
	* @return the ID of this businesssopusers
	*/
	@Override
	public long getId() {
		return _businesssopusers.getId();
	}

	/**
	* Returns the primary key of this businesssopusers.
	*
	* @return the primary key of this businesssopusers
	*/
	@Override
	public long getPrimaryKey() {
		return _businesssopusers.getPrimaryKey();
	}

	/**
	* Returns the user_id of this businesssopusers.
	*
	* @return the user_id of this businesssopusers
	*/
	@Override
	public long getUser_id() {
		return _businesssopusers.getUser_id();
	}

	@Override
	public void persist() {
		_businesssopusers.persist();
	}

	/**
	* Sets the businessdetails_id of this businesssopusers.
	*
	* @param businessdetails_id the businessdetails_id of this businesssopusers
	*/
	@Override
	public void setBusinessdetails_id(long businessdetails_id) {
		_businesssopusers.setBusinessdetails_id(businessdetails_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_businesssopusers.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_businesssopusers.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_businesssopusers.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_businesssopusers.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this businesssopusers.
	*
	* @param id the ID of this businesssopusers
	*/
	@Override
	public void setId(long id) {
		_businesssopusers.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_businesssopusers.setNew(n);
	}

	/**
	* Sets the primary key of this businesssopusers.
	*
	* @param primaryKey the primary key of this businesssopusers
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_businesssopusers.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_businesssopusers.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user_id of this businesssopusers.
	*
	* @param user_id the user_id of this businesssopusers
	*/
	@Override
	public void setUser_id(long user_id) {
		_businesssopusers.setUser_id(user_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof businesssopusersWrapper)) {
			return false;
		}

		businesssopusersWrapper businesssopusersWrapper = (businesssopusersWrapper)obj;

		if (Objects.equals(_businesssopusers,
					businesssopusersWrapper._businesssopusers)) {
			return true;
		}

		return false;
	}

	@Override
	public businesssopusers getWrappedModel() {
		return _businesssopusers;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _businesssopusers.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _businesssopusers.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_businesssopusers.resetOriginalValues();
	}

	private final businesssopusers _businesssopusers;
}