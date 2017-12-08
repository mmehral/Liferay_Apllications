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

package com.chola.swagatam.model;

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
 * This class is a wrapper for {@link swagatampath}.
 * </p>
 *
 * @author CloverLiferay02
 * @see swagatampath
 * @generated
 */
@ProviderType
public class swagatampathWrapper implements swagatampath,
	ModelWrapper<swagatampath> {
	public swagatampathWrapper(swagatampath swagatampath) {
		_swagatampath = swagatampath;
	}

	@Override
	public Class<?> getModelClass() {
		return swagatampath.class;
	}

	@Override
	public String getModelClassName() {
		return swagatampath.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("inductionid", getInductionid());
		attributes.put("videoPath", getVideoPath());
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

		String inductionid = (String)attributes.get("inductionid");

		if (inductionid != null) {
			setInductionid(inductionid);
		}

		String videoPath = (String)attributes.get("videoPath");

		if (videoPath != null) {
			setVideoPath(videoPath);
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
		return _swagatampath.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _swagatampath.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _swagatampath.isNew();
	}

	@Override
	public com.chola.swagatam.model.swagatampath toEscapedModel() {
		return new swagatampathWrapper(_swagatampath.toEscapedModel());
	}

	@Override
	public com.chola.swagatam.model.swagatampath toUnescapedModel() {
		return new swagatampathWrapper(_swagatampath.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _swagatampath.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.swagatam.model.swagatampath> toCacheModel() {
		return _swagatampath.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.swagatam.model.swagatampath swagatampath) {
		return _swagatampath.compareTo(swagatampath);
	}

	@Override
	public int hashCode() {
		return _swagatampath.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _swagatampath.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new swagatampathWrapper((swagatampath)_swagatampath.clone());
	}

	/**
	* Returns the created by of this swagatampath.
	*
	* @return the created by of this swagatampath
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _swagatampath.getCreatedBy();
	}

	/**
	* Returns the flag of this swagatampath.
	*
	* @return the flag of this swagatampath
	*/
	@Override
	public java.lang.String getFlag() {
		return _swagatampath.getFlag();
	}

	/**
	* Returns the inductionid of this swagatampath.
	*
	* @return the inductionid of this swagatampath
	*/
	@Override
	public java.lang.String getInductionid() {
		return _swagatampath.getInductionid();
	}

	/**
	* Returns the updated by of this swagatampath.
	*
	* @return the updated by of this swagatampath
	*/
	@Override
	public java.lang.String getUpdatedBy() {
		return _swagatampath.getUpdatedBy();
	}

	/**
	* Returns the video desc of this swagatampath.
	*
	* @return the video desc of this swagatampath
	*/
	@Override
	public java.lang.String getVideoDesc() {
		return _swagatampath.getVideoDesc();
	}

	/**
	* Returns the video path of this swagatampath.
	*
	* @return the video path of this swagatampath
	*/
	@Override
	public java.lang.String getVideoPath() {
		return _swagatampath.getVideoPath();
	}

	/**
	* Returns the video title of this swagatampath.
	*
	* @return the video title of this swagatampath
	*/
	@Override
	public java.lang.String getVideoTitle() {
		return _swagatampath.getVideoTitle();
	}

	@Override
	public java.lang.String toString() {
		return _swagatampath.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _swagatampath.toXmlString();
	}

	/**
	* Returns the created date of this swagatampath.
	*
	* @return the created date of this swagatampath
	*/
	@Override
	public Date getCreatedDate() {
		return _swagatampath.getCreatedDate();
	}

	/**
	* Returns the updated date of this swagatampath.
	*
	* @return the updated date of this swagatampath
	*/
	@Override
	public Date getUpdatedDate() {
		return _swagatampath.getUpdatedDate();
	}

	/**
	* Returns the ID of this swagatampath.
	*
	* @return the ID of this swagatampath
	*/
	@Override
	public long getId() {
		return _swagatampath.getId();
	}

	/**
	* Returns the primary key of this swagatampath.
	*
	* @return the primary key of this swagatampath
	*/
	@Override
	public long getPrimaryKey() {
		return _swagatampath.getPrimaryKey();
	}

	@Override
	public void persist() {
		_swagatampath.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_swagatampath.setCachedModel(cachedModel);
	}

	/**
	* Sets the created by of this swagatampath.
	*
	* @param createdBy the created by of this swagatampath
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_swagatampath.setCreatedBy(createdBy);
	}

	/**
	* Sets the created date of this swagatampath.
	*
	* @param createdDate the created date of this swagatampath
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_swagatampath.setCreatedDate(createdDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_swagatampath.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_swagatampath.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_swagatampath.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the flag of this swagatampath.
	*
	* @param flag the flag of this swagatampath
	*/
	@Override
	public void setFlag(java.lang.String flag) {
		_swagatampath.setFlag(flag);
	}

	/**
	* Sets the ID of this swagatampath.
	*
	* @param id the ID of this swagatampath
	*/
	@Override
	public void setId(long id) {
		_swagatampath.setId(id);
	}

	/**
	* Sets the inductionid of this swagatampath.
	*
	* @param inductionid the inductionid of this swagatampath
	*/
	@Override
	public void setInductionid(java.lang.String inductionid) {
		_swagatampath.setInductionid(inductionid);
	}

	@Override
	public void setNew(boolean n) {
		_swagatampath.setNew(n);
	}

	/**
	* Sets the primary key of this swagatampath.
	*
	* @param primaryKey the primary key of this swagatampath
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_swagatampath.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_swagatampath.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the updated by of this swagatampath.
	*
	* @param updatedBy the updated by of this swagatampath
	*/
	@Override
	public void setUpdatedBy(java.lang.String updatedBy) {
		_swagatampath.setUpdatedBy(updatedBy);
	}

	/**
	* Sets the updated date of this swagatampath.
	*
	* @param updatedDate the updated date of this swagatampath
	*/
	@Override
	public void setUpdatedDate(Date updatedDate) {
		_swagatampath.setUpdatedDate(updatedDate);
	}

	/**
	* Sets the video desc of this swagatampath.
	*
	* @param videoDesc the video desc of this swagatampath
	*/
	@Override
	public void setVideoDesc(java.lang.String videoDesc) {
		_swagatampath.setVideoDesc(videoDesc);
	}

	/**
	* Sets the video path of this swagatampath.
	*
	* @param videoPath the video path of this swagatampath
	*/
	@Override
	public void setVideoPath(java.lang.String videoPath) {
		_swagatampath.setVideoPath(videoPath);
	}

	/**
	* Sets the video title of this swagatampath.
	*
	* @param videoTitle the video title of this swagatampath
	*/
	@Override
	public void setVideoTitle(java.lang.String videoTitle) {
		_swagatampath.setVideoTitle(videoTitle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof swagatampathWrapper)) {
			return false;
		}

		swagatampathWrapper swagatampathWrapper = (swagatampathWrapper)obj;

		if (Objects.equals(_swagatampath, swagatampathWrapper._swagatampath)) {
			return true;
		}

		return false;
	}

	@Override
	public swagatampath getWrappedModel() {
		return _swagatampath;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _swagatampath.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _swagatampath.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_swagatampath.resetOriginalValues();
	}

	private final swagatampath _swagatampath;
}