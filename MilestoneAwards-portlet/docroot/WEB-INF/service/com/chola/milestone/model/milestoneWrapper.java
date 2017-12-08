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

package com.chola.milestone.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link milestone}.
 * </p>
 *
 * @author CloverLiferay02
 * @see milestone
 * @generated
 */
@ProviderType
public class milestoneWrapper implements milestone, ModelWrapper<milestone> {
	public milestoneWrapper(milestone milestone) {
		_milestone = milestone;
	}

	@Override
	public Class<?> getModelClass() {
		return milestone.class;
	}

	@Override
	public String getModelClassName() {
		return milestone.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userId", getUserId());
		attributes.put("wishedBy", getWishedBy());
		attributes.put("message", getMessage());
		attributes.put("createdDate", getCreatedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String userId = (String)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String wishedBy = (String)attributes.get("wishedBy");

		if (wishedBy != null) {
			setWishedBy(wishedBy);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _milestone.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _milestone.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _milestone.isNew();
	}

	@Override
	public com.chola.milestone.model.milestone toEscapedModel() {
		return new milestoneWrapper(_milestone.toEscapedModel());
	}

	@Override
	public com.chola.milestone.model.milestone toUnescapedModel() {
		return new milestoneWrapper(_milestone.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _milestone.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.milestone.model.milestone> toCacheModel() {
		return _milestone.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.milestone.model.milestone milestone) {
		return _milestone.compareTo(milestone);
	}

	@Override
	public int hashCode() {
		return _milestone.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _milestone.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new milestoneWrapper((milestone)_milestone.clone());
	}

	/**
	* Returns the message of this milestone.
	*
	* @return the message of this milestone
	*/
	@Override
	public java.lang.String getMessage() {
		return _milestone.getMessage();
	}

	/**
	* Returns the user ID of this milestone.
	*
	* @return the user ID of this milestone
	*/
	@Override
	public java.lang.String getUserId() {
		return _milestone.getUserId();
	}

	/**
	* Returns the wished by of this milestone.
	*
	* @return the wished by of this milestone
	*/
	@Override
	public java.lang.String getWishedBy() {
		return _milestone.getWishedBy();
	}

	@Override
	public java.lang.String toString() {
		return _milestone.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _milestone.toXmlString();
	}

	/**
	* Returns the created date of this milestone.
	*
	* @return the created date of this milestone
	*/
	@Override
	public Date getCreatedDate() {
		return _milestone.getCreatedDate();
	}

	/**
	* Returns the ID of this milestone.
	*
	* @return the ID of this milestone
	*/
	@Override
	public long getId() {
		return _milestone.getId();
	}

	/**
	* Returns the primary key of this milestone.
	*
	* @return the primary key of this milestone
	*/
	@Override
	public long getPrimaryKey() {
		return _milestone.getPrimaryKey();
	}

	@Override
	public void persist() {
		_milestone.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_milestone.setCachedModel(cachedModel);
	}

	/**
	* Sets the created date of this milestone.
	*
	* @param createdDate the created date of this milestone
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_milestone.setCreatedDate(createdDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_milestone.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_milestone.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_milestone.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this milestone.
	*
	* @param id the ID of this milestone
	*/
	@Override
	public void setId(long id) {
		_milestone.setId(id);
	}

	/**
	* Sets the message of this milestone.
	*
	* @param message the message of this milestone
	*/
	@Override
	public void setMessage(java.lang.String message) {
		_milestone.setMessage(message);
	}

	@Override
	public void setNew(boolean n) {
		_milestone.setNew(n);
	}

	/**
	* Sets the primary key of this milestone.
	*
	* @param primaryKey the primary key of this milestone
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_milestone.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_milestone.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this milestone.
	*
	* @param userId the user ID of this milestone
	*/
	@Override
	public void setUserId(java.lang.String userId) {
		_milestone.setUserId(userId);
	}

	/**
	* Sets the wished by of this milestone.
	*
	* @param wishedBy the wished by of this milestone
	*/
	@Override
	public void setWishedBy(java.lang.String wishedBy) {
		_milestone.setWishedBy(wishedBy);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof milestoneWrapper)) {
			return false;
		}

		milestoneWrapper milestoneWrapper = (milestoneWrapper)obj;

		if (Objects.equals(_milestone, milestoneWrapper._milestone)) {
			return true;
		}

		return false;
	}

	@Override
	public milestone getWrappedModel() {
		return _milestone;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _milestone.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _milestone.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_milestone.resetOriginalValues();
	}

	private final milestone _milestone;
}