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

package com.model;

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
 * This class is a wrapper for {@link branchdetails}.
 * </p>
 *
 * @author adms.java1
 * @see branchdetails
 * @generated
 */
@ProviderType
public class branchdetailsWrapper implements branchdetails,
	ModelWrapper<branchdetails> {
	public branchdetailsWrapper(branchdetails branchdetails) {
		_branchdetails = branchdetails;
	}

	@Override
	public Class<?> getModelClass() {
		return branchdetails.class;
	}

	@Override
	public String getModelClassName() {
		return branchdetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("branch_id", getBranch_id());
		attributes.put("branch_code", getBranch_code());
		attributes.put("branch_address", getBranch_address());
		attributes.put("city_id", getCity_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long branch_id = (Long)attributes.get("branch_id");

		if (branch_id != null) {
			setBranch_id(branch_id);
		}

		String branch_code = (String)attributes.get("branch_code");

		if (branch_code != null) {
			setBranch_code(branch_code);
		}

		String branch_address = (String)attributes.get("branch_address");

		if (branch_address != null) {
			setBranch_address(branch_address);
		}

		Long city_id = (Long)attributes.get("city_id");

		if (city_id != null) {
			setCity_id(city_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _branchdetails.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _branchdetails.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _branchdetails.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _branchdetails.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.model.branchdetails> toCacheModel() {
		return _branchdetails.toCacheModel();
	}

	@Override
	public com.model.branchdetails toEscapedModel() {
		return new branchdetailsWrapper(_branchdetails.toEscapedModel());
	}

	@Override
	public com.model.branchdetails toUnescapedModel() {
		return new branchdetailsWrapper(_branchdetails.toUnescapedModel());
	}

	@Override
	public int compareTo(com.model.branchdetails branchdetails) {
		return _branchdetails.compareTo(branchdetails);
	}

	@Override
	public int hashCode() {
		return _branchdetails.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _branchdetails.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new branchdetailsWrapper((branchdetails)_branchdetails.clone());
	}

	/**
	* Returns the branch_address of this branchdetails.
	*
	* @return the branch_address of this branchdetails
	*/
	@Override
	public java.lang.String getBranch_address() {
		return _branchdetails.getBranch_address();
	}

	/**
	* Returns the branch_code of this branchdetails.
	*
	* @return the branch_code of this branchdetails
	*/
	@Override
	public java.lang.String getBranch_code() {
		return _branchdetails.getBranch_code();
	}

	@Override
	public java.lang.String toString() {
		return _branchdetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _branchdetails.toXmlString();
	}

	/**
	* Returns the branch_id of this branchdetails.
	*
	* @return the branch_id of this branchdetails
	*/
	@Override
	public long getBranch_id() {
		return _branchdetails.getBranch_id();
	}

	/**
	* Returns the city_id of this branchdetails.
	*
	* @return the city_id of this branchdetails
	*/
	@Override
	public long getCity_id() {
		return _branchdetails.getCity_id();
	}

	/**
	* Returns the primary key of this branchdetails.
	*
	* @return the primary key of this branchdetails
	*/
	@Override
	public long getPrimaryKey() {
		return _branchdetails.getPrimaryKey();
	}

	@Override
	public void persist() {
		_branchdetails.persist();
	}

	/**
	* Sets the branch_address of this branchdetails.
	*
	* @param branch_address the branch_address of this branchdetails
	*/
	@Override
	public void setBranch_address(java.lang.String branch_address) {
		_branchdetails.setBranch_address(branch_address);
	}

	/**
	* Sets the branch_code of this branchdetails.
	*
	* @param branch_code the branch_code of this branchdetails
	*/
	@Override
	public void setBranch_code(java.lang.String branch_code) {
		_branchdetails.setBranch_code(branch_code);
	}

	/**
	* Sets the branch_id of this branchdetails.
	*
	* @param branch_id the branch_id of this branchdetails
	*/
	@Override
	public void setBranch_id(long branch_id) {
		_branchdetails.setBranch_id(branch_id);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_branchdetails.setCachedModel(cachedModel);
	}

	/**
	* Sets the city_id of this branchdetails.
	*
	* @param city_id the city_id of this branchdetails
	*/
	@Override
	public void setCity_id(long city_id) {
		_branchdetails.setCity_id(city_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_branchdetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_branchdetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_branchdetails.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_branchdetails.setNew(n);
	}

	/**
	* Sets the primary key of this branchdetails.
	*
	* @param primaryKey the primary key of this branchdetails
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_branchdetails.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_branchdetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof branchdetailsWrapper)) {
			return false;
		}

		branchdetailsWrapper branchdetailsWrapper = (branchdetailsWrapper)obj;

		if (Objects.equals(_branchdetails, branchdetailsWrapper._branchdetails)) {
			return true;
		}

		return false;
	}

	@Override
	public branchdetails getWrappedModel() {
		return _branchdetails;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _branchdetails.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _branchdetails.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_branchdetails.resetOriginalValues();
	}

	private final branchdetails _branchdetails;
}