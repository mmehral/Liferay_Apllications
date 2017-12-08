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

package com.chola.ppcontent.model;

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
 * This class is a wrapper for {@link contentuniqueinformation}.
 * </p>
 *
 * @author cloverliferay01
 * @see contentuniqueinformation
 * @generated
 */
@ProviderType
public class contentuniqueinformationWrapper implements contentuniqueinformation,
	ModelWrapper<contentuniqueinformation> {
	public contentuniqueinformationWrapper(
		contentuniqueinformation contentuniqueinformation) {
		_contentuniqueinformation = contentuniqueinformation;
	}

	@Override
	public Class<?> getModelClass() {
		return contentuniqueinformation.class;
	}

	@Override
	public String getModelClassName() {
		return contentuniqueinformation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("content_id", getContent_id());
		attributes.put("status", getStatus());
		attributes.put("udflag", getUdflag());
		attributes.put("content_type", getContent_type());
		attributes.put("notification_text", getNotification_text());
		attributes.put("pageurl", getPageurl());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long content_id = (Long)attributes.get("content_id");

		if (content_id != null) {
			setContent_id(content_id);
		}

		Long status = (Long)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long udflag = (Long)attributes.get("udflag");

		if (udflag != null) {
			setUdflag(udflag);
		}

		String content_type = (String)attributes.get("content_type");

		if (content_type != null) {
			setContent_type(content_type);
		}

		String notification_text = (String)attributes.get("notification_text");

		if (notification_text != null) {
			setNotification_text(notification_text);
		}

		String pageurl = (String)attributes.get("pageurl");

		if (pageurl != null) {
			setPageurl(pageurl);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _contentuniqueinformation.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _contentuniqueinformation.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _contentuniqueinformation.isNew();
	}

	@Override
	public com.chola.ppcontent.model.contentuniqueinformation toEscapedModel() {
		return new contentuniqueinformationWrapper(_contentuniqueinformation.toEscapedModel());
	}

	@Override
	public com.chola.ppcontent.model.contentuniqueinformation toUnescapedModel() {
		return new contentuniqueinformationWrapper(_contentuniqueinformation.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _contentuniqueinformation.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.ppcontent.model.contentuniqueinformation> toCacheModel() {
		return _contentuniqueinformation.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.ppcontent.model.contentuniqueinformation contentuniqueinformation) {
		return _contentuniqueinformation.compareTo(contentuniqueinformation);
	}

	@Override
	public int hashCode() {
		return _contentuniqueinformation.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _contentuniqueinformation.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new contentuniqueinformationWrapper((contentuniqueinformation)_contentuniqueinformation.clone());
	}

	/**
	* Returns the content_type of this contentuniqueinformation.
	*
	* @return the content_type of this contentuniqueinformation
	*/
	@Override
	public java.lang.String getContent_type() {
		return _contentuniqueinformation.getContent_type();
	}

	/**
	* Returns the notification_text of this contentuniqueinformation.
	*
	* @return the notification_text of this contentuniqueinformation
	*/
	@Override
	public java.lang.String getNotification_text() {
		return _contentuniqueinformation.getNotification_text();
	}

	/**
	* Returns the pageurl of this contentuniqueinformation.
	*
	* @return the pageurl of this contentuniqueinformation
	*/
	@Override
	public java.lang.String getPageurl() {
		return _contentuniqueinformation.getPageurl();
	}

	@Override
	public java.lang.String toString() {
		return _contentuniqueinformation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _contentuniqueinformation.toXmlString();
	}

	/**
	* Returns the content_id of this contentuniqueinformation.
	*
	* @return the content_id of this contentuniqueinformation
	*/
	@Override
	public long getContent_id() {
		return _contentuniqueinformation.getContent_id();
	}

	/**
	* Returns the ID of this contentuniqueinformation.
	*
	* @return the ID of this contentuniqueinformation
	*/
	@Override
	public long getId() {
		return _contentuniqueinformation.getId();
	}

	/**
	* Returns the primary key of this contentuniqueinformation.
	*
	* @return the primary key of this contentuniqueinformation
	*/
	@Override
	public long getPrimaryKey() {
		return _contentuniqueinformation.getPrimaryKey();
	}

	/**
	* Returns the status of this contentuniqueinformation.
	*
	* @return the status of this contentuniqueinformation
	*/
	@Override
	public long getStatus() {
		return _contentuniqueinformation.getStatus();
	}

	/**
	* Returns the udflag of this contentuniqueinformation.
	*
	* @return the udflag of this contentuniqueinformation
	*/
	@Override
	public long getUdflag() {
		return _contentuniqueinformation.getUdflag();
	}

	@Override
	public void persist() {
		_contentuniqueinformation.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_contentuniqueinformation.setCachedModel(cachedModel);
	}

	/**
	* Sets the content_id of this contentuniqueinformation.
	*
	* @param content_id the content_id of this contentuniqueinformation
	*/
	@Override
	public void setContent_id(long content_id) {
		_contentuniqueinformation.setContent_id(content_id);
	}

	/**
	* Sets the content_type of this contentuniqueinformation.
	*
	* @param content_type the content_type of this contentuniqueinformation
	*/
	@Override
	public void setContent_type(java.lang.String content_type) {
		_contentuniqueinformation.setContent_type(content_type);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_contentuniqueinformation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_contentuniqueinformation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_contentuniqueinformation.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this contentuniqueinformation.
	*
	* @param id the ID of this contentuniqueinformation
	*/
	@Override
	public void setId(long id) {
		_contentuniqueinformation.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_contentuniqueinformation.setNew(n);
	}

	/**
	* Sets the notification_text of this contentuniqueinformation.
	*
	* @param notification_text the notification_text of this contentuniqueinformation
	*/
	@Override
	public void setNotification_text(java.lang.String notification_text) {
		_contentuniqueinformation.setNotification_text(notification_text);
	}

	/**
	* Sets the pageurl of this contentuniqueinformation.
	*
	* @param pageurl the pageurl of this contentuniqueinformation
	*/
	@Override
	public void setPageurl(java.lang.String pageurl) {
		_contentuniqueinformation.setPageurl(pageurl);
	}

	/**
	* Sets the primary key of this contentuniqueinformation.
	*
	* @param primaryKey the primary key of this contentuniqueinformation
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_contentuniqueinformation.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_contentuniqueinformation.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this contentuniqueinformation.
	*
	* @param status the status of this contentuniqueinformation
	*/
	@Override
	public void setStatus(long status) {
		_contentuniqueinformation.setStatus(status);
	}

	/**
	* Sets the udflag of this contentuniqueinformation.
	*
	* @param udflag the udflag of this contentuniqueinformation
	*/
	@Override
	public void setUdflag(long udflag) {
		_contentuniqueinformation.setUdflag(udflag);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof contentuniqueinformationWrapper)) {
			return false;
		}

		contentuniqueinformationWrapper contentuniqueinformationWrapper = (contentuniqueinformationWrapper)obj;

		if (Objects.equals(_contentuniqueinformation,
					contentuniqueinformationWrapper._contentuniqueinformation)) {
			return true;
		}

		return false;
	}

	@Override
	public contentuniqueinformation getWrappedModel() {
		return _contentuniqueinformation;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _contentuniqueinformation.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _contentuniqueinformation.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_contentuniqueinformation.resetOriginalValues();
	}

	private final contentuniqueinformation _contentuniqueinformation;
}