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

package com.chola.trainingcalendar.model;

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
 * This class is a wrapper for {@link trainingcontentuniqueinformation}.
 * </p>
 *
 * @author CloverLiferay01
 * @see trainingcontentuniqueinformation
 * @generated
 */
@ProviderType
public class trainingcontentuniqueinformationWrapper
	implements trainingcontentuniqueinformation,
		ModelWrapper<trainingcontentuniqueinformation> {
	public trainingcontentuniqueinformationWrapper(
		trainingcontentuniqueinformation trainingcontentuniqueinformation) {
		_trainingcontentuniqueinformation = trainingcontentuniqueinformation;
	}

	@Override
	public Class<?> getModelClass() {
		return trainingcontentuniqueinformation.class;
	}

	@Override
	public String getModelClassName() {
		return trainingcontentuniqueinformation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("training_id", getTraining_id());
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

		Long training_id = (Long)attributes.get("training_id");

		if (training_id != null) {
			setTraining_id(training_id);
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
		return _trainingcontentuniqueinformation.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _trainingcontentuniqueinformation.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _trainingcontentuniqueinformation.isNew();
	}

	@Override
	public com.chola.trainingcalendar.model.trainingcontentuniqueinformation toEscapedModel() {
		return new trainingcontentuniqueinformationWrapper(_trainingcontentuniqueinformation.toEscapedModel());
	}

	@Override
	public com.chola.trainingcalendar.model.trainingcontentuniqueinformation toUnescapedModel() {
		return new trainingcontentuniqueinformationWrapper(_trainingcontentuniqueinformation.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _trainingcontentuniqueinformation.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.trainingcalendar.model.trainingcontentuniqueinformation> toCacheModel() {
		return _trainingcontentuniqueinformation.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.trainingcalendar.model.trainingcontentuniqueinformation trainingcontentuniqueinformation) {
		return _trainingcontentuniqueinformation.compareTo(trainingcontentuniqueinformation);
	}

	@Override
	public int hashCode() {
		return _trainingcontentuniqueinformation.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _trainingcontentuniqueinformation.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new trainingcontentuniqueinformationWrapper((trainingcontentuniqueinformation)_trainingcontentuniqueinformation.clone());
	}

	/**
	* Returns the content_type of this trainingcontentuniqueinformation.
	*
	* @return the content_type of this trainingcontentuniqueinformation
	*/
	@Override
	public java.lang.String getContent_type() {
		return _trainingcontentuniqueinformation.getContent_type();
	}

	/**
	* Returns the notification_text of this trainingcontentuniqueinformation.
	*
	* @return the notification_text of this trainingcontentuniqueinformation
	*/
	@Override
	public java.lang.String getNotification_text() {
		return _trainingcontentuniqueinformation.getNotification_text();
	}

	/**
	* Returns the pageurl of this trainingcontentuniqueinformation.
	*
	* @return the pageurl of this trainingcontentuniqueinformation
	*/
	@Override
	public java.lang.String getPageurl() {
		return _trainingcontentuniqueinformation.getPageurl();
	}

	@Override
	public java.lang.String toString() {
		return _trainingcontentuniqueinformation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _trainingcontentuniqueinformation.toXmlString();
	}

	/**
	* Returns the content_id of this trainingcontentuniqueinformation.
	*
	* @return the content_id of this trainingcontentuniqueinformation
	*/
	@Override
	public long getContent_id() {
		return _trainingcontentuniqueinformation.getContent_id();
	}

	/**
	* Returns the ID of this trainingcontentuniqueinformation.
	*
	* @return the ID of this trainingcontentuniqueinformation
	*/
	@Override
	public long getId() {
		return _trainingcontentuniqueinformation.getId();
	}

	/**
	* Returns the primary key of this trainingcontentuniqueinformation.
	*
	* @return the primary key of this trainingcontentuniqueinformation
	*/
	@Override
	public long getPrimaryKey() {
		return _trainingcontentuniqueinformation.getPrimaryKey();
	}

	/**
	* Returns the status of this trainingcontentuniqueinformation.
	*
	* @return the status of this trainingcontentuniqueinformation
	*/
	@Override
	public long getStatus() {
		return _trainingcontentuniqueinformation.getStatus();
	}

	/**
	* Returns the training_id of this trainingcontentuniqueinformation.
	*
	* @return the training_id of this trainingcontentuniqueinformation
	*/
	@Override
	public long getTraining_id() {
		return _trainingcontentuniqueinformation.getTraining_id();
	}

	/**
	* Returns the udflag of this trainingcontentuniqueinformation.
	*
	* @return the udflag of this trainingcontentuniqueinformation
	*/
	@Override
	public long getUdflag() {
		return _trainingcontentuniqueinformation.getUdflag();
	}

	@Override
	public void persist() {
		_trainingcontentuniqueinformation.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_trainingcontentuniqueinformation.setCachedModel(cachedModel);
	}

	/**
	* Sets the content_id of this trainingcontentuniqueinformation.
	*
	* @param content_id the content_id of this trainingcontentuniqueinformation
	*/
	@Override
	public void setContent_id(long content_id) {
		_trainingcontentuniqueinformation.setContent_id(content_id);
	}

	/**
	* Sets the content_type of this trainingcontentuniqueinformation.
	*
	* @param content_type the content_type of this trainingcontentuniqueinformation
	*/
	@Override
	public void setContent_type(java.lang.String content_type) {
		_trainingcontentuniqueinformation.setContent_type(content_type);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_trainingcontentuniqueinformation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_trainingcontentuniqueinformation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_trainingcontentuniqueinformation.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this trainingcontentuniqueinformation.
	*
	* @param id the ID of this trainingcontentuniqueinformation
	*/
	@Override
	public void setId(long id) {
		_trainingcontentuniqueinformation.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_trainingcontentuniqueinformation.setNew(n);
	}

	/**
	* Sets the notification_text of this trainingcontentuniqueinformation.
	*
	* @param notification_text the notification_text of this trainingcontentuniqueinformation
	*/
	@Override
	public void setNotification_text(java.lang.String notification_text) {
		_trainingcontentuniqueinformation.setNotification_text(notification_text);
	}

	/**
	* Sets the pageurl of this trainingcontentuniqueinformation.
	*
	* @param pageurl the pageurl of this trainingcontentuniqueinformation
	*/
	@Override
	public void setPageurl(java.lang.String pageurl) {
		_trainingcontentuniqueinformation.setPageurl(pageurl);
	}

	/**
	* Sets the primary key of this trainingcontentuniqueinformation.
	*
	* @param primaryKey the primary key of this trainingcontentuniqueinformation
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_trainingcontentuniqueinformation.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_trainingcontentuniqueinformation.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this trainingcontentuniqueinformation.
	*
	* @param status the status of this trainingcontentuniqueinformation
	*/
	@Override
	public void setStatus(long status) {
		_trainingcontentuniqueinformation.setStatus(status);
	}

	/**
	* Sets the training_id of this trainingcontentuniqueinformation.
	*
	* @param training_id the training_id of this trainingcontentuniqueinformation
	*/
	@Override
	public void setTraining_id(long training_id) {
		_trainingcontentuniqueinformation.setTraining_id(training_id);
	}

	/**
	* Sets the udflag of this trainingcontentuniqueinformation.
	*
	* @param udflag the udflag of this trainingcontentuniqueinformation
	*/
	@Override
	public void setUdflag(long udflag) {
		_trainingcontentuniqueinformation.setUdflag(udflag);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof trainingcontentuniqueinformationWrapper)) {
			return false;
		}

		trainingcontentuniqueinformationWrapper trainingcontentuniqueinformationWrapper =
			(trainingcontentuniqueinformationWrapper)obj;

		if (Objects.equals(_trainingcontentuniqueinformation,
					trainingcontentuniqueinformationWrapper._trainingcontentuniqueinformation)) {
			return true;
		}

		return false;
	}

	@Override
	public trainingcontentuniqueinformation getWrappedModel() {
		return _trainingcontentuniqueinformation;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _trainingcontentuniqueinformation.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _trainingcontentuniqueinformation.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_trainingcontentuniqueinformation.resetOriginalValues();
	}

	private final trainingcontentuniqueinformation _trainingcontentuniqueinformation;
}