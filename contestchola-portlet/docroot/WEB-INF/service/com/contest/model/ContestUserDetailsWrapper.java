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

package com.contest.model;

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
 * This class is a wrapper for {@link ContestUserDetails}.
 * </p>
 *
 * @author CloverLiferay01
 * @see ContestUserDetails
 * @generated
 */
@ProviderType
public class ContestUserDetailsWrapper implements ContestUserDetails,
	ModelWrapper<ContestUserDetails> {
	public ContestUserDetailsWrapper(ContestUserDetails contestUserDetails) {
		_contestUserDetails = contestUserDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return ContestUserDetails.class;
	}

	@Override
	public String getModelClassName() {
		return ContestUserDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("user_id", getUser_id());
		attributes.put("contestreference_id", getContestreference_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String user_id = (String)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
		}

		Long contestreference_id = (Long)attributes.get("contestreference_id");

		if (contestreference_id != null) {
			setContestreference_id(contestreference_id);
		}
	}

	@Override
	public ContestUserDetails toEscapedModel() {
		return new ContestUserDetailsWrapper(_contestUserDetails.toEscapedModel());
	}

	@Override
	public ContestUserDetails toUnescapedModel() {
		return new ContestUserDetailsWrapper(_contestUserDetails.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _contestUserDetails.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _contestUserDetails.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _contestUserDetails.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _contestUserDetails.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ContestUserDetails> toCacheModel() {
		return _contestUserDetails.toCacheModel();
	}

	@Override
	public int compareTo(ContestUserDetails contestUserDetails) {
		return _contestUserDetails.compareTo(contestUserDetails);
	}

	@Override
	public int hashCode() {
		return _contestUserDetails.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _contestUserDetails.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ContestUserDetailsWrapper((ContestUserDetails)_contestUserDetails.clone());
	}

	/**
	* Returns the user_id of this contest user details.
	*
	* @return the user_id of this contest user details
	*/
	@Override
	public java.lang.String getUser_id() {
		return _contestUserDetails.getUser_id();
	}

	@Override
	public java.lang.String toString() {
		return _contestUserDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _contestUserDetails.toXmlString();
	}

	/**
	* Returns the contestreference_id of this contest user details.
	*
	* @return the contestreference_id of this contest user details
	*/
	@Override
	public long getContestreference_id() {
		return _contestUserDetails.getContestreference_id();
	}

	/**
	* Returns the ID of this contest user details.
	*
	* @return the ID of this contest user details
	*/
	@Override
	public long getId() {
		return _contestUserDetails.getId();
	}

	/**
	* Returns the primary key of this contest user details.
	*
	* @return the primary key of this contest user details
	*/
	@Override
	public long getPrimaryKey() {
		return _contestUserDetails.getPrimaryKey();
	}

	@Override
	public void persist() {
		_contestUserDetails.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_contestUserDetails.setCachedModel(cachedModel);
	}

	/**
	* Sets the contestreference_id of this contest user details.
	*
	* @param contestreference_id the contestreference_id of this contest user details
	*/
	@Override
	public void setContestreference_id(long contestreference_id) {
		_contestUserDetails.setContestreference_id(contestreference_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_contestUserDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_contestUserDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_contestUserDetails.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this contest user details.
	*
	* @param id the ID of this contest user details
	*/
	@Override
	public void setId(long id) {
		_contestUserDetails.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_contestUserDetails.setNew(n);
	}

	/**
	* Sets the primary key of this contest user details.
	*
	* @param primaryKey the primary key of this contest user details
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_contestUserDetails.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_contestUserDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user_id of this contest user details.
	*
	* @param user_id the user_id of this contest user details
	*/
	@Override
	public void setUser_id(java.lang.String user_id) {
		_contestUserDetails.setUser_id(user_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ContestUserDetailsWrapper)) {
			return false;
		}

		ContestUserDetailsWrapper contestUserDetailsWrapper = (ContestUserDetailsWrapper)obj;

		if (Objects.equals(_contestUserDetails,
					contestUserDetailsWrapper._contestUserDetails)) {
			return true;
		}

		return false;
	}

	@Override
	public ContestUserDetails getWrappedModel() {
		return _contestUserDetails;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _contestUserDetails.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _contestUserDetails.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_contestUserDetails.resetOriginalValues();
	}

	private final ContestUserDetails _contestUserDetails;
}