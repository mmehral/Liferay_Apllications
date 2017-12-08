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
 * This class is a wrapper for {@link swagatam}.
 * </p>
 *
 * @author CloverLiferay02
 * @see swagatam
 * @generated
 */
@ProviderType
public class swagatamWrapper implements swagatam, ModelWrapper<swagatam> {
	public swagatamWrapper(swagatam swagatam) {
		_swagatam = swagatam;
	}

	@Override
	public Class<?> getModelClass() {
		return swagatam.class;
	}

	@Override
	public String getModelClassName() {
		return swagatam.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("inductionid", getInductionid());
		attributes.put("title", getTitle());
		attributes.put("desc", getDesc());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
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

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String desc = (String)attributes.get("desc");

		if (desc != null) {
			setDesc(desc);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String createdBy = (String)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		String flag = (String)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _swagatam.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _swagatam.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _swagatam.isNew();
	}

	@Override
	public com.chola.swagatam.model.swagatam toEscapedModel() {
		return new swagatamWrapper(_swagatam.toEscapedModel());
	}

	@Override
	public com.chola.swagatam.model.swagatam toUnescapedModel() {
		return new swagatamWrapper(_swagatam.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _swagatam.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.swagatam.model.swagatam> toCacheModel() {
		return _swagatam.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.swagatam.model.swagatam swagatam) {
		return _swagatam.compareTo(swagatam);
	}

	@Override
	public int hashCode() {
		return _swagatam.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _swagatam.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new swagatamWrapper((swagatam)_swagatam.clone());
	}

	/**
	* Returns the created by of this swagatam.
	*
	* @return the created by of this swagatam
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _swagatam.getCreatedBy();
	}

	/**
	* Returns the desc of this swagatam.
	*
	* @return the desc of this swagatam
	*/
	@Override
	public java.lang.String getDesc() {
		return _swagatam.getDesc();
	}

	/**
	* Returns the flag of this swagatam.
	*
	* @return the flag of this swagatam
	*/
	@Override
	public java.lang.String getFlag() {
		return _swagatam.getFlag();
	}

	/**
	* Returns the inductionid of this swagatam.
	*
	* @return the inductionid of this swagatam
	*/
	@Override
	public java.lang.String getInductionid() {
		return _swagatam.getInductionid();
	}

	/**
	* Returns the title of this swagatam.
	*
	* @return the title of this swagatam
	*/
	@Override
	public java.lang.String getTitle() {
		return _swagatam.getTitle();
	}

	@Override
	public java.lang.String toString() {
		return _swagatam.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _swagatam.toXmlString();
	}

	/**
	* Returns the created date of this swagatam.
	*
	* @return the created date of this swagatam
	*/
	@Override
	public Date getCreatedDate() {
		return _swagatam.getCreatedDate();
	}

	/**
	* Returns the ID of this swagatam.
	*
	* @return the ID of this swagatam
	*/
	@Override
	public long getId() {
		return _swagatam.getId();
	}

	/**
	* Returns the primary key of this swagatam.
	*
	* @return the primary key of this swagatam
	*/
	@Override
	public long getPrimaryKey() {
		return _swagatam.getPrimaryKey();
	}

	@Override
	public void persist() {
		_swagatam.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_swagatam.setCachedModel(cachedModel);
	}

	/**
	* Sets the created by of this swagatam.
	*
	* @param createdBy the created by of this swagatam
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_swagatam.setCreatedBy(createdBy);
	}

	/**
	* Sets the created date of this swagatam.
	*
	* @param createdDate the created date of this swagatam
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_swagatam.setCreatedDate(createdDate);
	}

	/**
	* Sets the desc of this swagatam.
	*
	* @param desc the desc of this swagatam
	*/
	@Override
	public void setDesc(java.lang.String desc) {
		_swagatam.setDesc(desc);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_swagatam.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_swagatam.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_swagatam.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the flag of this swagatam.
	*
	* @param flag the flag of this swagatam
	*/
	@Override
	public void setFlag(java.lang.String flag) {
		_swagatam.setFlag(flag);
	}

	/**
	* Sets the ID of this swagatam.
	*
	* @param id the ID of this swagatam
	*/
	@Override
	public void setId(long id) {
		_swagatam.setId(id);
	}

	/**
	* Sets the inductionid of this swagatam.
	*
	* @param inductionid the inductionid of this swagatam
	*/
	@Override
	public void setInductionid(java.lang.String inductionid) {
		_swagatam.setInductionid(inductionid);
	}

	@Override
	public void setNew(boolean n) {
		_swagatam.setNew(n);
	}

	/**
	* Sets the primary key of this swagatam.
	*
	* @param primaryKey the primary key of this swagatam
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_swagatam.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_swagatam.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the title of this swagatam.
	*
	* @param title the title of this swagatam
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_swagatam.setTitle(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof swagatamWrapper)) {
			return false;
		}

		swagatamWrapper swagatamWrapper = (swagatamWrapper)obj;

		if (Objects.equals(_swagatam, swagatamWrapper._swagatam)) {
			return true;
		}

		return false;
	}

	@Override
	public swagatam getWrappedModel() {
		return _swagatam;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _swagatam.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _swagatam.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_swagatam.resetOriginalValues();
	}

	private final swagatam _swagatam;
}