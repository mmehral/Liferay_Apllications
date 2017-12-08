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

package com.chola.notificationchannel.model;

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
 * This class is a wrapper for {@link NoticationCategoryCount}.
 * </p>
 *
 * @author cloverliferay01
 * @see NoticationCategoryCount
 * @generated
 */
@ProviderType
public class NoticationCategoryCountWrapper implements NoticationCategoryCount,
	ModelWrapper<NoticationCategoryCount> {
	public NoticationCategoryCountWrapper(
		NoticationCategoryCount noticationCategoryCount) {
		_noticationCategoryCount = noticationCategoryCount;
	}

	@Override
	public Class<?> getModelClass() {
		return NoticationCategoryCount.class;
	}

	@Override
	public String getModelClassName() {
		return NoticationCategoryCount.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("eventId", getEventId());
		attributes.put("username", getUsername());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long eventId = (Long)attributes.get("eventId");

		if (eventId != null) {
			setEventId(eventId);
		}

		String username = (String)attributes.get("username");

		if (username != null) {
			setUsername(username);
		}
	}

	@Override
	public NoticationCategoryCount toEscapedModel() {
		return new NoticationCategoryCountWrapper(_noticationCategoryCount.toEscapedModel());
	}

	@Override
	public NoticationCategoryCount toUnescapedModel() {
		return new NoticationCategoryCountWrapper(_noticationCategoryCount.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _noticationCategoryCount.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _noticationCategoryCount.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _noticationCategoryCount.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _noticationCategoryCount.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<NoticationCategoryCount> toCacheModel() {
		return _noticationCategoryCount.toCacheModel();
	}

	@Override
	public int compareTo(NoticationCategoryCount noticationCategoryCount) {
		return _noticationCategoryCount.compareTo(noticationCategoryCount);
	}

	@Override
	public int hashCode() {
		return _noticationCategoryCount.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _noticationCategoryCount.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new NoticationCategoryCountWrapper((NoticationCategoryCount)_noticationCategoryCount.clone());
	}

	/**
	* Returns the username of this notication category count.
	*
	* @return the username of this notication category count
	*/
	@Override
	public java.lang.String getUsername() {
		return _noticationCategoryCount.getUsername();
	}

	@Override
	public java.lang.String toString() {
		return _noticationCategoryCount.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _noticationCategoryCount.toXmlString();
	}

	/**
	* Returns the event ID of this notication category count.
	*
	* @return the event ID of this notication category count
	*/
	@Override
	public long getEventId() {
		return _noticationCategoryCount.getEventId();
	}

	/**
	* Returns the primary key of this notication category count.
	*
	* @return the primary key of this notication category count
	*/
	@Override
	public long getPrimaryKey() {
		return _noticationCategoryCount.getPrimaryKey();
	}

	@Override
	public void persist() {
		_noticationCategoryCount.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_noticationCategoryCount.setCachedModel(cachedModel);
	}

	/**
	* Sets the event ID of this notication category count.
	*
	* @param eventId the event ID of this notication category count
	*/
	@Override
	public void setEventId(long eventId) {
		_noticationCategoryCount.setEventId(eventId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_noticationCategoryCount.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_noticationCategoryCount.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_noticationCategoryCount.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_noticationCategoryCount.setNew(n);
	}

	/**
	* Sets the primary key of this notication category count.
	*
	* @param primaryKey the primary key of this notication category count
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_noticationCategoryCount.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_noticationCategoryCount.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the username of this notication category count.
	*
	* @param username the username of this notication category count
	*/
	@Override
	public void setUsername(java.lang.String username) {
		_noticationCategoryCount.setUsername(username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NoticationCategoryCountWrapper)) {
			return false;
		}

		NoticationCategoryCountWrapper noticationCategoryCountWrapper = (NoticationCategoryCountWrapper)obj;

		if (Objects.equals(_noticationCategoryCount,
					noticationCategoryCountWrapper._noticationCategoryCount)) {
			return true;
		}

		return false;
	}

	@Override
	public NoticationCategoryCount getWrappedModel() {
		return _noticationCategoryCount;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _noticationCategoryCount.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _noticationCategoryCount.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_noticationCategoryCount.resetOriginalValues();
	}

	private final NoticationCategoryCount _noticationCategoryCount;
}