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
 * This class is a wrapper for {@link businessSOPppusers}.
 * </p>
 *
 * @author adms.java1
 * @see businessSOPppusers
 * @generated
 */
@ProviderType
public class businessSOPppusersWrapper implements businessSOPppusers,
	ModelWrapper<businessSOPppusers> {
	public businessSOPppusersWrapper(businessSOPppusers businessSOPppusers) {
		_businessSOPppusers = businessSOPppusers;
	}

	@Override
	public Class<?> getModelClass() {
		return businessSOPppusers.class;
	}

	@Override
	public String getModelClassName() {
		return businessSOPppusers.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("businesssop_uniqueid", getBusinesssop_uniqueid());
		attributes.put("user_id", getUser_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String businesssop_uniqueid = (String)attributes.get(
				"businesssop_uniqueid");

		if (businesssop_uniqueid != null) {
			setBusinesssop_uniqueid(businesssop_uniqueid);
		}

		String user_id = (String)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _businessSOPppusers.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _businessSOPppusers.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _businessSOPppusers.isNew();
	}

	@Override
	public com.chola.business.model.businessSOPppusers toEscapedModel() {
		return new businessSOPppusersWrapper(_businessSOPppusers.toEscapedModel());
	}

	@Override
	public com.chola.business.model.businessSOPppusers toUnescapedModel() {
		return new businessSOPppusersWrapper(_businessSOPppusers.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _businessSOPppusers.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.business.model.businessSOPppusers> toCacheModel() {
		return _businessSOPppusers.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.business.model.businessSOPppusers businessSOPppusers) {
		return _businessSOPppusers.compareTo(businessSOPppusers);
	}

	@Override
	public int hashCode() {
		return _businessSOPppusers.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _businessSOPppusers.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new businessSOPppusersWrapper((businessSOPppusers)_businessSOPppusers.clone());
	}

	/**
	* Returns the businesssop_uniqueid of this business s o pppusers.
	*
	* @return the businesssop_uniqueid of this business s o pppusers
	*/
	@Override
	public java.lang.String getBusinesssop_uniqueid() {
		return _businessSOPppusers.getBusinesssop_uniqueid();
	}

	/**
	* Returns the user_id of this business s o pppusers.
	*
	* @return the user_id of this business s o pppusers
	*/
	@Override
	public java.lang.String getUser_id() {
		return _businessSOPppusers.getUser_id();
	}

	@Override
	public java.lang.String toString() {
		return _businessSOPppusers.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _businessSOPppusers.toXmlString();
	}

	/**
	* Returns the ID of this business s o pppusers.
	*
	* @return the ID of this business s o pppusers
	*/
	@Override
	public long getId() {
		return _businessSOPppusers.getId();
	}

	/**
	* Returns the primary key of this business s o pppusers.
	*
	* @return the primary key of this business s o pppusers
	*/
	@Override
	public long getPrimaryKey() {
		return _businessSOPppusers.getPrimaryKey();
	}

	@Override
	public void persist() {
		_businessSOPppusers.persist();
	}

	/**
	* Sets the businesssop_uniqueid of this business s o pppusers.
	*
	* @param businesssop_uniqueid the businesssop_uniqueid of this business s o pppusers
	*/
	@Override
	public void setBusinesssop_uniqueid(java.lang.String businesssop_uniqueid) {
		_businessSOPppusers.setBusinesssop_uniqueid(businesssop_uniqueid);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_businessSOPppusers.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_businessSOPppusers.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_businessSOPppusers.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_businessSOPppusers.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this business s o pppusers.
	*
	* @param id the ID of this business s o pppusers
	*/
	@Override
	public void setId(long id) {
		_businessSOPppusers.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_businessSOPppusers.setNew(n);
	}

	/**
	* Sets the primary key of this business s o pppusers.
	*
	* @param primaryKey the primary key of this business s o pppusers
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_businessSOPppusers.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_businessSOPppusers.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user_id of this business s o pppusers.
	*
	* @param user_id the user_id of this business s o pppusers
	*/
	@Override
	public void setUser_id(java.lang.String user_id) {
		_businessSOPppusers.setUser_id(user_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof businessSOPppusersWrapper)) {
			return false;
		}

		businessSOPppusersWrapper businessSOPppusersWrapper = (businessSOPppusersWrapper)obj;

		if (Objects.equals(_businessSOPppusers,
					businessSOPppusersWrapper._businessSOPppusers)) {
			return true;
		}

		return false;
	}

	@Override
	public businessSOPppusers getWrappedModel() {
		return _businessSOPppusers;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _businessSOPppusers.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _businessSOPppusers.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_businessSOPppusers.resetOriginalValues();
	}

	private final businessSOPppusers _businessSOPppusers;
}