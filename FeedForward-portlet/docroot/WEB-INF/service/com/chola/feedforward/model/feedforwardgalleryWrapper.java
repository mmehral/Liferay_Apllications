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

package com.chola.feedforward.model;

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
 * This class is a wrapper for {@link feedforwardgallery}.
 * </p>
 *
 * @author CloverLiferay02
 * @see feedforwardgallery
 * @generated
 */
@ProviderType
public class feedforwardgalleryWrapper implements feedforwardgallery,
	ModelWrapper<feedforwardgallery> {
	public feedforwardgalleryWrapper(feedforwardgallery feedforwardgallery) {
		_feedforwardgallery = feedforwardgallery;
	}

	@Override
	public Class<?> getModelClass() {
		return feedforwardgallery.class;
	}

	@Override
	public String getModelClassName() {
		return feedforwardgallery.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("albumName", getAlbumName());
		attributes.put("albumDesc", getAlbumDesc());
		attributes.put("albumId", getAlbumId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedDate", getUpdatedDate());
		attributes.put("updatedBy", getUpdatedBy());
		attributes.put("flag", getFlag());
		attributes.put("content_id", getContent_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String albumName = (String)attributes.get("albumName");

		if (albumName != null) {
			setAlbumName(albumName);
		}

		String albumDesc = (String)attributes.get("albumDesc");

		if (albumDesc != null) {
			setAlbumDesc(albumDesc);
		}

		String albumId = (String)attributes.get("albumId");

		if (albumId != null) {
			setAlbumId(albumId);
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

		Long content_id = (Long)attributes.get("content_id");

		if (content_id != null) {
			setContent_id(content_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _feedforwardgallery.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _feedforwardgallery.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _feedforwardgallery.isNew();
	}

	@Override
	public com.chola.feedforward.model.feedforwardgallery toEscapedModel() {
		return new feedforwardgalleryWrapper(_feedforwardgallery.toEscapedModel());
	}

	@Override
	public com.chola.feedforward.model.feedforwardgallery toUnescapedModel() {
		return new feedforwardgalleryWrapper(_feedforwardgallery.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _feedforwardgallery.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.feedforward.model.feedforwardgallery> toCacheModel() {
		return _feedforwardgallery.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.feedforward.model.feedforwardgallery feedforwardgallery) {
		return _feedforwardgallery.compareTo(feedforwardgallery);
	}

	@Override
	public int hashCode() {
		return _feedforwardgallery.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _feedforwardgallery.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new feedforwardgalleryWrapper((feedforwardgallery)_feedforwardgallery.clone());
	}

	/**
	* Returns the album desc of this feedforwardgallery.
	*
	* @return the album desc of this feedforwardgallery
	*/
	@Override
	public java.lang.String getAlbumDesc() {
		return _feedforwardgallery.getAlbumDesc();
	}

	/**
	* Returns the album ID of this feedforwardgallery.
	*
	* @return the album ID of this feedforwardgallery
	*/
	@Override
	public java.lang.String getAlbumId() {
		return _feedforwardgallery.getAlbumId();
	}

	/**
	* Returns the album name of this feedforwardgallery.
	*
	* @return the album name of this feedforwardgallery
	*/
	@Override
	public java.lang.String getAlbumName() {
		return _feedforwardgallery.getAlbumName();
	}

	/**
	* Returns the created by of this feedforwardgallery.
	*
	* @return the created by of this feedforwardgallery
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _feedforwardgallery.getCreatedBy();
	}

	/**
	* Returns the flag of this feedforwardgallery.
	*
	* @return the flag of this feedforwardgallery
	*/
	@Override
	public java.lang.String getFlag() {
		return _feedforwardgallery.getFlag();
	}

	/**
	* Returns the updated by of this feedforwardgallery.
	*
	* @return the updated by of this feedforwardgallery
	*/
	@Override
	public java.lang.String getUpdatedBy() {
		return _feedforwardgallery.getUpdatedBy();
	}

	@Override
	public java.lang.String toString() {
		return _feedforwardgallery.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _feedforwardgallery.toXmlString();
	}

	/**
	* Returns the created date of this feedforwardgallery.
	*
	* @return the created date of this feedforwardgallery
	*/
	@Override
	public Date getCreatedDate() {
		return _feedforwardgallery.getCreatedDate();
	}

	/**
	* Returns the updated date of this feedforwardgallery.
	*
	* @return the updated date of this feedforwardgallery
	*/
	@Override
	public Date getUpdatedDate() {
		return _feedforwardgallery.getUpdatedDate();
	}

	/**
	* Returns the content_id of this feedforwardgallery.
	*
	* @return the content_id of this feedforwardgallery
	*/
	@Override
	public long getContent_id() {
		return _feedforwardgallery.getContent_id();
	}

	/**
	* Returns the ID of this feedforwardgallery.
	*
	* @return the ID of this feedforwardgallery
	*/
	@Override
	public long getId() {
		return _feedforwardgallery.getId();
	}

	/**
	* Returns the primary key of this feedforwardgallery.
	*
	* @return the primary key of this feedforwardgallery
	*/
	@Override
	public long getPrimaryKey() {
		return _feedforwardgallery.getPrimaryKey();
	}

	@Override
	public void persist() {
		_feedforwardgallery.persist();
	}

	/**
	* Sets the album desc of this feedforwardgallery.
	*
	* @param albumDesc the album desc of this feedforwardgallery
	*/
	@Override
	public void setAlbumDesc(java.lang.String albumDesc) {
		_feedforwardgallery.setAlbumDesc(albumDesc);
	}

	/**
	* Sets the album ID of this feedforwardgallery.
	*
	* @param albumId the album ID of this feedforwardgallery
	*/
	@Override
	public void setAlbumId(java.lang.String albumId) {
		_feedforwardgallery.setAlbumId(albumId);
	}

	/**
	* Sets the album name of this feedforwardgallery.
	*
	* @param albumName the album name of this feedforwardgallery
	*/
	@Override
	public void setAlbumName(java.lang.String albumName) {
		_feedforwardgallery.setAlbumName(albumName);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_feedforwardgallery.setCachedModel(cachedModel);
	}

	/**
	* Sets the content_id of this feedforwardgallery.
	*
	* @param content_id the content_id of this feedforwardgallery
	*/
	@Override
	public void setContent_id(long content_id) {
		_feedforwardgallery.setContent_id(content_id);
	}

	/**
	* Sets the created by of this feedforwardgallery.
	*
	* @param createdBy the created by of this feedforwardgallery
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_feedforwardgallery.setCreatedBy(createdBy);
	}

	/**
	* Sets the created date of this feedforwardgallery.
	*
	* @param createdDate the created date of this feedforwardgallery
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_feedforwardgallery.setCreatedDate(createdDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_feedforwardgallery.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_feedforwardgallery.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_feedforwardgallery.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the flag of this feedforwardgallery.
	*
	* @param flag the flag of this feedforwardgallery
	*/
	@Override
	public void setFlag(java.lang.String flag) {
		_feedforwardgallery.setFlag(flag);
	}

	/**
	* Sets the ID of this feedforwardgallery.
	*
	* @param id the ID of this feedforwardgallery
	*/
	@Override
	public void setId(long id) {
		_feedforwardgallery.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_feedforwardgallery.setNew(n);
	}

	/**
	* Sets the primary key of this feedforwardgallery.
	*
	* @param primaryKey the primary key of this feedforwardgallery
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_feedforwardgallery.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_feedforwardgallery.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the updated by of this feedforwardgallery.
	*
	* @param updatedBy the updated by of this feedforwardgallery
	*/
	@Override
	public void setUpdatedBy(java.lang.String updatedBy) {
		_feedforwardgallery.setUpdatedBy(updatedBy);
	}

	/**
	* Sets the updated date of this feedforwardgallery.
	*
	* @param updatedDate the updated date of this feedforwardgallery
	*/
	@Override
	public void setUpdatedDate(Date updatedDate) {
		_feedforwardgallery.setUpdatedDate(updatedDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof feedforwardgalleryWrapper)) {
			return false;
		}

		feedforwardgalleryWrapper feedforwardgalleryWrapper = (feedforwardgalleryWrapper)obj;

		if (Objects.equals(_feedforwardgallery,
					feedforwardgalleryWrapper._feedforwardgallery)) {
			return true;
		}

		return false;
	}

	@Override
	public feedforwardgallery getWrappedModel() {
		return _feedforwardgallery;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _feedforwardgallery.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _feedforwardgallery.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_feedforwardgallery.resetOriginalValues();
	}

	private final feedforwardgallery _feedforwardgallery;
}