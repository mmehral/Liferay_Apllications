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

package com.chola.calendar.model;

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
 * This class is a wrapper for {@link corporatecontentuniqueinformation}.
 * </p>
 *
 * @author adms.java1
 * @see corporatecontentuniqueinformation
 * @generated
 */
@ProviderType
public class corporatecontentuniqueinformationWrapper
	implements corporatecontentuniqueinformation,
		ModelWrapper<corporatecontentuniqueinformation> {
	public corporatecontentuniqueinformationWrapper(
		corporatecontentuniqueinformation corporatecontentuniqueinformation) {
		_corporatecontentuniqueinformation = corporatecontentuniqueinformation;
	}

	@Override
	public Class<?> getModelClass() {
		return corporatecontentuniqueinformation.class;
	}

	@Override
	public String getModelClassName() {
		return corporatecontentuniqueinformation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("corporatevent_id", getCorporatevent_id());
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

		Long corporatevent_id = (Long)attributes.get("corporatevent_id");

		if (corporatevent_id != null) {
			setCorporatevent_id(corporatevent_id);
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
		return _corporatecontentuniqueinformation.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _corporatecontentuniqueinformation.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _corporatecontentuniqueinformation.isNew();
	}

	@Override
	public com.chola.calendar.model.corporatecontentuniqueinformation toEscapedModel() {
		return new corporatecontentuniqueinformationWrapper(_corporatecontentuniqueinformation.toEscapedModel());
	}

	@Override
	public com.chola.calendar.model.corporatecontentuniqueinformation toUnescapedModel() {
		return new corporatecontentuniqueinformationWrapper(_corporatecontentuniqueinformation.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _corporatecontentuniqueinformation.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.calendar.model.corporatecontentuniqueinformation> toCacheModel() {
		return _corporatecontentuniqueinformation.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.calendar.model.corporatecontentuniqueinformation corporatecontentuniqueinformation) {
		return _corporatecontentuniqueinformation.compareTo(corporatecontentuniqueinformation);
	}

	@Override
	public int hashCode() {
		return _corporatecontentuniqueinformation.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _corporatecontentuniqueinformation.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new corporatecontentuniqueinformationWrapper((corporatecontentuniqueinformation)_corporatecontentuniqueinformation.clone());
	}

	/**
	* Returns the content_type of this corporatecontentuniqueinformation.
	*
	* @return the content_type of this corporatecontentuniqueinformation
	*/
	@Override
	public java.lang.String getContent_type() {
		return _corporatecontentuniqueinformation.getContent_type();
	}

	/**
	* Returns the notification_text of this corporatecontentuniqueinformation.
	*
	* @return the notification_text of this corporatecontentuniqueinformation
	*/
	@Override
	public java.lang.String getNotification_text() {
		return _corporatecontentuniqueinformation.getNotification_text();
	}

	/**
	* Returns the pageurl of this corporatecontentuniqueinformation.
	*
	* @return the pageurl of this corporatecontentuniqueinformation
	*/
	@Override
	public java.lang.String getPageurl() {
		return _corporatecontentuniqueinformation.getPageurl();
	}

	@Override
	public java.lang.String toString() {
		return _corporatecontentuniqueinformation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _corporatecontentuniqueinformation.toXmlString();
	}

	/**
	* Returns the content_id of this corporatecontentuniqueinformation.
	*
	* @return the content_id of this corporatecontentuniqueinformation
	*/
	@Override
	public long getContent_id() {
		return _corporatecontentuniqueinformation.getContent_id();
	}

	/**
	* Returns the corporatevent_id of this corporatecontentuniqueinformation.
	*
	* @return the corporatevent_id of this corporatecontentuniqueinformation
	*/
	@Override
	public long getCorporatevent_id() {
		return _corporatecontentuniqueinformation.getCorporatevent_id();
	}

	/**
	* Returns the ID of this corporatecontentuniqueinformation.
	*
	* @return the ID of this corporatecontentuniqueinformation
	*/
	@Override
	public long getId() {
		return _corporatecontentuniqueinformation.getId();
	}

	/**
	* Returns the primary key of this corporatecontentuniqueinformation.
	*
	* @return the primary key of this corporatecontentuniqueinformation
	*/
	@Override
	public long getPrimaryKey() {
		return _corporatecontentuniqueinformation.getPrimaryKey();
	}

	/**
	* Returns the status of this corporatecontentuniqueinformation.
	*
	* @return the status of this corporatecontentuniqueinformation
	*/
	@Override
	public long getStatus() {
		return _corporatecontentuniqueinformation.getStatus();
	}

	/**
	* Returns the udflag of this corporatecontentuniqueinformation.
	*
	* @return the udflag of this corporatecontentuniqueinformation
	*/
	@Override
	public long getUdflag() {
		return _corporatecontentuniqueinformation.getUdflag();
	}

	@Override
	public void persist() {
		_corporatecontentuniqueinformation.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_corporatecontentuniqueinformation.setCachedModel(cachedModel);
	}

	/**
	* Sets the content_id of this corporatecontentuniqueinformation.
	*
	* @param content_id the content_id of this corporatecontentuniqueinformation
	*/
	@Override
	public void setContent_id(long content_id) {
		_corporatecontentuniqueinformation.setContent_id(content_id);
	}

	/**
	* Sets the content_type of this corporatecontentuniqueinformation.
	*
	* @param content_type the content_type of this corporatecontentuniqueinformation
	*/
	@Override
	public void setContent_type(java.lang.String content_type) {
		_corporatecontentuniqueinformation.setContent_type(content_type);
	}

	/**
	* Sets the corporatevent_id of this corporatecontentuniqueinformation.
	*
	* @param corporatevent_id the corporatevent_id of this corporatecontentuniqueinformation
	*/
	@Override
	public void setCorporatevent_id(long corporatevent_id) {
		_corporatecontentuniqueinformation.setCorporatevent_id(corporatevent_id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_corporatecontentuniqueinformation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_corporatecontentuniqueinformation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_corporatecontentuniqueinformation.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this corporatecontentuniqueinformation.
	*
	* @param id the ID of this corporatecontentuniqueinformation
	*/
	@Override
	public void setId(long id) {
		_corporatecontentuniqueinformation.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_corporatecontentuniqueinformation.setNew(n);
	}

	/**
	* Sets the notification_text of this corporatecontentuniqueinformation.
	*
	* @param notification_text the notification_text of this corporatecontentuniqueinformation
	*/
	@Override
	public void setNotification_text(java.lang.String notification_text) {
		_corporatecontentuniqueinformation.setNotification_text(notification_text);
	}

	/**
	* Sets the pageurl of this corporatecontentuniqueinformation.
	*
	* @param pageurl the pageurl of this corporatecontentuniqueinformation
	*/
	@Override
	public void setPageurl(java.lang.String pageurl) {
		_corporatecontentuniqueinformation.setPageurl(pageurl);
	}

	/**
	* Sets the primary key of this corporatecontentuniqueinformation.
	*
	* @param primaryKey the primary key of this corporatecontentuniqueinformation
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_corporatecontentuniqueinformation.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_corporatecontentuniqueinformation.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this corporatecontentuniqueinformation.
	*
	* @param status the status of this corporatecontentuniqueinformation
	*/
	@Override
	public void setStatus(long status) {
		_corporatecontentuniqueinformation.setStatus(status);
	}

	/**
	* Sets the udflag of this corporatecontentuniqueinformation.
	*
	* @param udflag the udflag of this corporatecontentuniqueinformation
	*/
	@Override
	public void setUdflag(long udflag) {
		_corporatecontentuniqueinformation.setUdflag(udflag);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof corporatecontentuniqueinformationWrapper)) {
			return false;
		}

		corporatecontentuniqueinformationWrapper corporatecontentuniqueinformationWrapper =
			(corporatecontentuniqueinformationWrapper)obj;

		if (Objects.equals(_corporatecontentuniqueinformation,
					corporatecontentuniqueinformationWrapper._corporatecontentuniqueinformation)) {
			return true;
		}

		return false;
	}

	@Override
	public corporatecontentuniqueinformation getWrappedModel() {
		return _corporatecontentuniqueinformation;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _corporatecontentuniqueinformation.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _corporatecontentuniqueinformation.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_corporatecontentuniqueinformation.resetOriginalValues();
	}

	private final corporatecontentuniqueinformation _corporatecontentuniqueinformation;
}