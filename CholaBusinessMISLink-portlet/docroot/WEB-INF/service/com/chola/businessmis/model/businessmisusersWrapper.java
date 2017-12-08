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

package com.chola.businessmis.model;

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
 * This class is a wrapper for {@link businessmisusers}.
 * </p>
 *
 * @author CloverLiferay01
 * @see businessmisusers
 * @generated
 */
@ProviderType
public class businessmisusersWrapper implements businessmisusers,
	ModelWrapper<businessmisusers> {
	public businessmisusersWrapper(businessmisusers businessmisusers) {
		_businessmisusers = businessmisusers;
	}

	@Override
	public Class<?> getModelClass() {
		return businessmisusers.class;
	}

	@Override
	public String getModelClassName() {
		return businessmisusers.class.getName();
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
		return _businessmisusers.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _businessmisusers.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _businessmisusers.isNew();
	}

	@Override
	public com.chola.businessmis.model.businessmisusers toEscapedModel() {
		return new businessmisusersWrapper(_businessmisusers.toEscapedModel());
	}

	@Override
	public com.chola.businessmis.model.businessmisusers toUnescapedModel() {
		return new businessmisusersWrapper(_businessmisusers.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _businessmisusers.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.businessmis.model.businessmisusers> toCacheModel() {
		return _businessmisusers.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.businessmis.model.businessmisusers businessmisusers) {
		return _businessmisusers.compareTo(businessmisusers);
	}

	@Override
	public int hashCode() {
		return _businessmisusers.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _businessmisusers.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new businessmisusersWrapper((businessmisusers)_businessmisusers.clone());
	}

	@Override
	public java.lang.String toString() {
		return _businessmisusers.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _businessmisusers.toXmlString();
	}

	/**
	* Returns the businessdetails_id of this businessmisusers.
	*
	* @return the businessdetails_id of this businessmisusers
	*/
	@Override
	public long getBusinessdetails_id() {
		return _businessmisusers.getBusinessdetails_id();
	}

	/**
	* Returns the ID of this businessmisusers.
	*
	* @return the ID of this businessmisusers
	*/
	@Override
	public long getId() {
		return _businessmisusers.getId();
	}

	/**
	* Returns the primary key of this businessmisusers.
	*
	* @return the primary key of this businessmisusers
	*/
	@Override
	public long getPrimaryKey() {
		return _businessmisusers.getPrimaryKey();
	}

	/**
	* Returns the user_id of this businessmisusers.
	*
	* @return the user_id of this businessmisusers
	*/
	@Override
	public long getUser_id() {
		return _businessmisusers.getUser_id();
	}

	@Override
	public void persist() {
		_businessmisusers.persist();
	}

	/**
	* Sets the businessdetails_id of this businessmisusers.
	*
	* @param businessdetails_id the businessdetails_id of this businessmisusers
	*/
	@Override
	public void setBusinessdetails_id(long businessdetails_id) {
		_businessmisusers.setBusinessdetails_id(businessdetails_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_businessmisusers.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_businessmisusers.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_businessmisusers.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_businessmisusers.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this businessmisusers.
	*
	* @param id the ID of this businessmisusers
	*/
	@Override
	public void setId(long id) {
		_businessmisusers.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_businessmisusers.setNew(n);
	}

	/**
	* Sets the primary key of this businessmisusers.
	*
	* @param primaryKey the primary key of this businessmisusers
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_businessmisusers.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_businessmisusers.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user_id of this businessmisusers.
	*
	* @param user_id the user_id of this businessmisusers
	*/
	@Override
	public void setUser_id(long user_id) {
		_businessmisusers.setUser_id(user_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof businessmisusersWrapper)) {
			return false;
		}

		businessmisusersWrapper businessmisusersWrapper = (businessmisusersWrapper)obj;

		if (Objects.equals(_businessmisusers,
					businessmisusersWrapper._businessmisusers)) {
			return true;
		}

		return false;
	}

	@Override
	public businessmisusers getWrappedModel() {
		return _businessmisusers;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _businessmisusers.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _businessmisusers.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_businessmisusers.resetOriginalValues();
	}

	private final businessmisusers _businessmisusers;
}