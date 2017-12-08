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

package com.chola.appcorner.model;

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
 * This class is a wrapper for {@link replied}.
 * </p>
 *
 * @author CloverLiferay02
 * @see replied
 * @generated
 */
@ProviderType
public class repliedWrapper implements replied, ModelWrapper<replied> {
	public repliedWrapper(replied replied) {
		_replied = replied;
	}

	@Override
	public Class<?> getModelClass() {
		return replied.class;
	}

	@Override
	public String getModelClassName() {
		return replied.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("repliedOnPost", getRepliedOnPost());
		attributes.put("repliedTo", getRepliedTo());
		attributes.put("repliedBy", getRepliedBy());
		attributes.put("repliedMessage", getRepliedMessage());
		attributes.put("repliedDate", getRepliedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long repliedOnPost = (Long)attributes.get("repliedOnPost");

		if (repliedOnPost != null) {
			setRepliedOnPost(repliedOnPost);
		}

		Long repliedTo = (Long)attributes.get("repliedTo");

		if (repliedTo != null) {
			setRepliedTo(repliedTo);
		}

		Long repliedBy = (Long)attributes.get("repliedBy");

		if (repliedBy != null) {
			setRepliedBy(repliedBy);
		}

		String repliedMessage = (String)attributes.get("repliedMessage");

		if (repliedMessage != null) {
			setRepliedMessage(repliedMessage);
		}

		String repliedDate = (String)attributes.get("repliedDate");

		if (repliedDate != null) {
			setRepliedDate(repliedDate);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _replied.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _replied.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _replied.isNew();
	}

	@Override
	public com.chola.appcorner.model.replied toEscapedModel() {
		return new repliedWrapper(_replied.toEscapedModel());
	}

	@Override
	public com.chola.appcorner.model.replied toUnescapedModel() {
		return new repliedWrapper(_replied.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _replied.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.appcorner.model.replied> toCacheModel() {
		return _replied.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.appcorner.model.replied replied) {
		return _replied.compareTo(replied);
	}

	@Override
	public int hashCode() {
		return _replied.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _replied.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new repliedWrapper((replied)_replied.clone());
	}

	/**
	* Returns the replied date of this replied.
	*
	* @return the replied date of this replied
	*/
	@Override
	public java.lang.String getRepliedDate() {
		return _replied.getRepliedDate();
	}

	/**
	* Returns the replied message of this replied.
	*
	* @return the replied message of this replied
	*/
	@Override
	public java.lang.String getRepliedMessage() {
		return _replied.getRepliedMessage();
	}

	@Override
	public java.lang.String toString() {
		return _replied.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _replied.toXmlString();
	}

	/**
	* Returns the ID of this replied.
	*
	* @return the ID of this replied
	*/
	@Override
	public long getId() {
		return _replied.getId();
	}

	/**
	* Returns the primary key of this replied.
	*
	* @return the primary key of this replied
	*/
	@Override
	public long getPrimaryKey() {
		return _replied.getPrimaryKey();
	}

	/**
	* Returns the replied by of this replied.
	*
	* @return the replied by of this replied
	*/
	@Override
	public long getRepliedBy() {
		return _replied.getRepliedBy();
	}

	/**
	* Returns the replied on post of this replied.
	*
	* @return the replied on post of this replied
	*/
	@Override
	public long getRepliedOnPost() {
		return _replied.getRepliedOnPost();
	}

	/**
	* Returns the replied to of this replied.
	*
	* @return the replied to of this replied
	*/
	@Override
	public long getRepliedTo() {
		return _replied.getRepliedTo();
	}

	@Override
	public void persist() {
		_replied.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_replied.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_replied.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_replied.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_replied.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this replied.
	*
	* @param id the ID of this replied
	*/
	@Override
	public void setId(long id) {
		_replied.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_replied.setNew(n);
	}

	/**
	* Sets the primary key of this replied.
	*
	* @param primaryKey the primary key of this replied
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_replied.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_replied.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the replied by of this replied.
	*
	* @param repliedBy the replied by of this replied
	*/
	@Override
	public void setRepliedBy(long repliedBy) {
		_replied.setRepliedBy(repliedBy);
	}

	/**
	* Sets the replied date of this replied.
	*
	* @param repliedDate the replied date of this replied
	*/
	@Override
	public void setRepliedDate(java.lang.String repliedDate) {
		_replied.setRepliedDate(repliedDate);
	}

	/**
	* Sets the replied message of this replied.
	*
	* @param repliedMessage the replied message of this replied
	*/
	@Override
	public void setRepliedMessage(java.lang.String repliedMessage) {
		_replied.setRepliedMessage(repliedMessage);
	}

	/**
	* Sets the replied on post of this replied.
	*
	* @param repliedOnPost the replied on post of this replied
	*/
	@Override
	public void setRepliedOnPost(long repliedOnPost) {
		_replied.setRepliedOnPost(repliedOnPost);
	}

	/**
	* Sets the replied to of this replied.
	*
	* @param repliedTo the replied to of this replied
	*/
	@Override
	public void setRepliedTo(long repliedTo) {
		_replied.setRepliedTo(repliedTo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof repliedWrapper)) {
			return false;
		}

		repliedWrapper repliedWrapper = (repliedWrapper)obj;

		if (Objects.equals(_replied, repliedWrapper._replied)) {
			return true;
		}

		return false;
	}

	@Override
	public replied getWrappedModel() {
		return _replied;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _replied.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _replied.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_replied.resetOriginalValues();
	}

	private final replied _replied;
}