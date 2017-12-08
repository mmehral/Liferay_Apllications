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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link cholatalkiespath}.
 * </p>
 *
 * @author adms.java1
 * @see cholatalkiespath
 * @generated
 */
@ProviderType
public class cholatalkiespathWrapper implements cholatalkiespath,
	ModelWrapper<cholatalkiespath> {
	public cholatalkiespathWrapper(cholatalkiespath cholatalkiespath) {
		_cholatalkiespath = cholatalkiespath;
	}

	@Override
	public Class<?> getModelClass() {
		return cholatalkiespath.class;
	}

	@Override
	public String getModelClassName() {
		return cholatalkiespath.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("cholatalkiesdetaild_id", getCholatalkiesdetaild_id());
		attributes.put("content_id", getContent_id());
		attributes.put("VideoPath", getVideoPath());
		attributes.put("videoTitle", getVideoTitle());
		attributes.put("videoDesc", getVideoDesc());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedDate", getUpdatedDate());
		attributes.put("updatedBy", getUpdatedBy());
		attributes.put("flag", getFlag());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String cholatalkiesdetaild_id = (String)attributes.get(
				"cholatalkiesdetaild_id");

		if (cholatalkiesdetaild_id != null) {
			setCholatalkiesdetaild_id(cholatalkiesdetaild_id);
		}

		Long content_id = (Long)attributes.get("content_id");

		if (content_id != null) {
			setContent_id(content_id);
		}

		String VideoPath = (String)attributes.get("VideoPath");

		if (VideoPath != null) {
			setVideoPath(VideoPath);
		}

		String videoTitle = (String)attributes.get("videoTitle");

		if (videoTitle != null) {
			setVideoTitle(videoTitle);
		}

		String videoDesc = (String)attributes.get("videoDesc");

		if (videoDesc != null) {
			setVideoDesc(videoDesc);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String createdBy = (String)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date updatedDate = (Date)attributes.get("updatedDate");

		if (updatedDate != null) {
			setUpdatedDate(updatedDate);
		}

		String updatedBy = (String)attributes.get("updatedBy");

		if (updatedBy != null) {
			setUpdatedBy(updatedBy);
		}

		String flag = (String)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _cholatalkiespath.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _cholatalkiespath.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _cholatalkiespath.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _cholatalkiespath.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.model.cholatalkiespath> toCacheModel() {
		return _cholatalkiespath.toCacheModel();
	}

	@Override
	public com.model.cholatalkiespath toEscapedModel() {
		return new cholatalkiespathWrapper(_cholatalkiespath.toEscapedModel());
	}

	@Override
	public com.model.cholatalkiespath toUnescapedModel() {
		return new cholatalkiespathWrapper(_cholatalkiespath.toUnescapedModel());
	}

	@Override
	public int compareTo(com.model.cholatalkiespath cholatalkiespath) {
		return _cholatalkiespath.compareTo(cholatalkiespath);
	}

	@Override
	public int hashCode() {
		return _cholatalkiespath.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cholatalkiespath.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new cholatalkiespathWrapper((cholatalkiespath)_cholatalkiespath.clone());
	}

	/**
	* Returns the cholatalkiesdetaild_id of this cholatalkiespath.
	*
	* @return the cholatalkiesdetaild_id of this cholatalkiespath
	*/
	@Override
	public java.lang.String getCholatalkiesdetaild_id() {
		return _cholatalkiespath.getCholatalkiesdetaild_id();
	}

	/**
	* Returns the created by of this cholatalkiespath.
	*
	* @return the created by of this cholatalkiespath
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _cholatalkiespath.getCreatedBy();
	}

	/**
	* Returns the flag of this cholatalkiespath.
	*
	* @return the flag of this cholatalkiespath
	*/
	@Override
	public java.lang.String getFlag() {
		return _cholatalkiespath.getFlag();
	}

	/**
	* Returns the updated by of this cholatalkiespath.
	*
	* @return the updated by of this cholatalkiespath
	*/
	@Override
	public java.lang.String getUpdatedBy() {
		return _cholatalkiespath.getUpdatedBy();
	}

	/**
	* Returns the video desc of this cholatalkiespath.
	*
	* @return the video desc of this cholatalkiespath
	*/
	@Override
	public java.lang.String getVideoDesc() {
		return _cholatalkiespath.getVideoDesc();
	}

	/**
	* Returns the video path of this cholatalkiespath.
	*
	* @return the video path of this cholatalkiespath
	*/
	@Override
	public java.lang.String getVideoPath() {
		return _cholatalkiespath.getVideoPath();
	}

	/**
	* Returns the video title of this cholatalkiespath.
	*
	* @return the video title of this cholatalkiespath
	*/
	@Override
	public java.lang.String getVideoTitle() {
		return _cholatalkiespath.getVideoTitle();
	}

	@Override
	public java.lang.String toString() {
		return _cholatalkiespath.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _cholatalkiespath.toXmlString();
	}

	/**
	* Returns the created date of this cholatalkiespath.
	*
	* @return the created date of this cholatalkiespath
	*/
	@Override
	public Date getCreatedDate() {
		return _cholatalkiespath.getCreatedDate();
	}

	/**
	* Returns the updated date of this cholatalkiespath.
	*
	* @return the updated date of this cholatalkiespath
	*/
	@Override
	public Date getUpdatedDate() {
		return _cholatalkiespath.getUpdatedDate();
	}

	/**
	* Returns the content_id of this cholatalkiespath.
	*
	* @return the content_id of this cholatalkiespath
	*/
	@Override
	public long getContent_id() {
		return _cholatalkiespath.getContent_id();
	}

	/**
	* Returns the ID of this cholatalkiespath.
	*
	* @return the ID of this cholatalkiespath
	*/
	@Override
	public long getId() {
		return _cholatalkiespath.getId();
	}

	/**
	* Returns the primary key of this cholatalkiespath.
	*
	* @return the primary key of this cholatalkiespath
	*/
	@Override
	public long getPrimaryKey() {
		return _cholatalkiespath.getPrimaryKey();
	}

	@Override
	public void persist() {
		_cholatalkiespath.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cholatalkiespath.setCachedModel(cachedModel);
	}

	/**
	* Sets the cholatalkiesdetaild_id of this cholatalkiespath.
	*
	* @param cholatalkiesdetaild_id the cholatalkiesdetaild_id of this cholatalkiespath
	*/
	@Override
	public void setCholatalkiesdetaild_id(
		java.lang.String cholatalkiesdetaild_id) {
		_cholatalkiespath.setCholatalkiesdetaild_id(cholatalkiesdetaild_id);
	}

	/**
	* Sets the content_id of this cholatalkiespath.
	*
	* @param content_id the content_id of this cholatalkiespath
	*/
	@Override
	public void setContent_id(long content_id) {
		_cholatalkiespath.setContent_id(content_id);
	}

	/**
	* Sets the created by of this cholatalkiespath.
	*
	* @param createdBy the created by of this cholatalkiespath
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_cholatalkiespath.setCreatedBy(createdBy);
	}

	/**
	* Sets the created date of this cholatalkiespath.
	*
	* @param createdDate the created date of this cholatalkiespath
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_cholatalkiespath.setCreatedDate(createdDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_cholatalkiespath.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_cholatalkiespath.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_cholatalkiespath.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the flag of this cholatalkiespath.
	*
	* @param flag the flag of this cholatalkiespath
	*/
	@Override
	public void setFlag(java.lang.String flag) {
		_cholatalkiespath.setFlag(flag);
	}

	/**
	* Sets the ID of this cholatalkiespath.
	*
	* @param id the ID of this cholatalkiespath
	*/
	@Override
	public void setId(long id) {
		_cholatalkiespath.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_cholatalkiespath.setNew(n);
	}

	/**
	* Sets the primary key of this cholatalkiespath.
	*
	* @param primaryKey the primary key of this cholatalkiespath
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cholatalkiespath.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_cholatalkiespath.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the updated by of this cholatalkiespath.
	*
	* @param updatedBy the updated by of this cholatalkiespath
	*/
	@Override
	public void setUpdatedBy(java.lang.String updatedBy) {
		_cholatalkiespath.setUpdatedBy(updatedBy);
	}

	/**
	* Sets the updated date of this cholatalkiespath.
	*
	* @param updatedDate the updated date of this cholatalkiespath
	*/
	@Override
	public void setUpdatedDate(Date updatedDate) {
		_cholatalkiespath.setUpdatedDate(updatedDate);
	}

	/**
	* Sets the video desc of this cholatalkiespath.
	*
	* @param videoDesc the video desc of this cholatalkiespath
	*/
	@Override
	public void setVideoDesc(java.lang.String videoDesc) {
		_cholatalkiespath.setVideoDesc(videoDesc);
	}

	/**
	* Sets the video path of this cholatalkiespath.
	*
	* @param VideoPath the video path of this cholatalkiespath
	*/
	@Override
	public void setVideoPath(java.lang.String VideoPath) {
		_cholatalkiespath.setVideoPath(VideoPath);
	}

	/**
	* Sets the video title of this cholatalkiespath.
	*
	* @param videoTitle the video title of this cholatalkiespath
	*/
	@Override
	public void setVideoTitle(java.lang.String videoTitle) {
		_cholatalkiespath.setVideoTitle(videoTitle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof cholatalkiespathWrapper)) {
			return false;
		}

		cholatalkiespathWrapper cholatalkiespathWrapper = (cholatalkiespathWrapper)obj;

		if (Objects.equals(_cholatalkiespath,
					cholatalkiespathWrapper._cholatalkiespath)) {
			return true;
		}

		return false;
	}

	@Override
	public cholatalkiespath getWrappedModel() {
		return _cholatalkiespath;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _cholatalkiespath.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _cholatalkiespath.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_cholatalkiespath.resetOriginalValues();
	}

	private final cholatalkiespath _cholatalkiespath;
}