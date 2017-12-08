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

package com.chola.knowledgebites.model;

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
 * This class is a wrapper for {@link kbpath}.
 * </p>
 *
 * @author cloverliferay01
 * @see kbpath
 * @generated
 */
@ProviderType
public class kbpathWrapper implements kbpath, ModelWrapper<kbpath> {
	public kbpathWrapper(kbpath kbpath) {
		_kbpath = kbpath;
	}

	@Override
	public Class<?> getModelClass() {
		return kbpath.class;
	}

	@Override
	public String getModelClassName() {
		return kbpath.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("kbfiledoc", getKbfiledoc());
		attributes.put("kbfilepath", getKbfilepath());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("flag", getFlag());
		attributes.put("kbdetails_id", getKbdetails_id());
		attributes.put("content_id", getContent_id());
		attributes.put("kbfilename", getKbfilename());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String kbfiledoc = (String)attributes.get("kbfiledoc");

		if (kbfiledoc != null) {
			setKbfiledoc(kbfiledoc);
		}

		String kbfilepath = (String)attributes.get("kbfilepath");

		if (kbfilepath != null) {
			setKbfilepath(kbfilepath);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long createdBy = (Long)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		String flag = (String)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
		}

		Long kbdetails_id = (Long)attributes.get("kbdetails_id");

		if (kbdetails_id != null) {
			setKbdetails_id(kbdetails_id);
		}

		Long content_id = (Long)attributes.get("content_id");

		if (content_id != null) {
			setContent_id(content_id);
		}

		String kbfilename = (String)attributes.get("kbfilename");

		if (kbfilename != null) {
			setKbfilename(kbfilename);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _kbpath.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _kbpath.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _kbpath.isNew();
	}

	@Override
	public com.chola.knowledgebites.model.kbpath toEscapedModel() {
		return new kbpathWrapper(_kbpath.toEscapedModel());
	}

	@Override
	public com.chola.knowledgebites.model.kbpath toUnescapedModel() {
		return new kbpathWrapper(_kbpath.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _kbpath.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.knowledgebites.model.kbpath> toCacheModel() {
		return _kbpath.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.knowledgebites.model.kbpath kbpath) {
		return _kbpath.compareTo(kbpath);
	}

	@Override
	public int hashCode() {
		return _kbpath.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _kbpath.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new kbpathWrapper((kbpath)_kbpath.clone());
	}

	/**
	* Returns the flag of this kbpath.
	*
	* @return the flag of this kbpath
	*/
	@Override
	public java.lang.String getFlag() {
		return _kbpath.getFlag();
	}

	/**
	* Returns the kbfiledoc of this kbpath.
	*
	* @return the kbfiledoc of this kbpath
	*/
	@Override
	public java.lang.String getKbfiledoc() {
		return _kbpath.getKbfiledoc();
	}

	/**
	* Returns the kbfilename of this kbpath.
	*
	* @return the kbfilename of this kbpath
	*/
	@Override
	public java.lang.String getKbfilename() {
		return _kbpath.getKbfilename();
	}

	/**
	* Returns the kbfilepath of this kbpath.
	*
	* @return the kbfilepath of this kbpath
	*/
	@Override
	public java.lang.String getKbfilepath() {
		return _kbpath.getKbfilepath();
	}

	@Override
	public java.lang.String toString() {
		return _kbpath.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _kbpath.toXmlString();
	}

	/**
	* Returns the created date of this kbpath.
	*
	* @return the created date of this kbpath
	*/
	@Override
	public Date getCreatedDate() {
		return _kbpath.getCreatedDate();
	}

	/**
	* Returns the content_id of this kbpath.
	*
	* @return the content_id of this kbpath
	*/
	@Override
	public long getContent_id() {
		return _kbpath.getContent_id();
	}

	/**
	* Returns the created by of this kbpath.
	*
	* @return the created by of this kbpath
	*/
	@Override
	public long getCreatedBy() {
		return _kbpath.getCreatedBy();
	}

	/**
	* Returns the ID of this kbpath.
	*
	* @return the ID of this kbpath
	*/
	@Override
	public long getId() {
		return _kbpath.getId();
	}

	/**
	* Returns the kbdetails_id of this kbpath.
	*
	* @return the kbdetails_id of this kbpath
	*/
	@Override
	public long getKbdetails_id() {
		return _kbpath.getKbdetails_id();
	}

	/**
	* Returns the primary key of this kbpath.
	*
	* @return the primary key of this kbpath
	*/
	@Override
	public long getPrimaryKey() {
		return _kbpath.getPrimaryKey();
	}

	@Override
	public void persist() {
		_kbpath.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_kbpath.setCachedModel(cachedModel);
	}

	/**
	* Sets the content_id of this kbpath.
	*
	* @param content_id the content_id of this kbpath
	*/
	@Override
	public void setContent_id(long content_id) {
		_kbpath.setContent_id(content_id);
	}

	/**
	* Sets the created by of this kbpath.
	*
	* @param createdBy the created by of this kbpath
	*/
	@Override
	public void setCreatedBy(long createdBy) {
		_kbpath.setCreatedBy(createdBy);
	}

	/**
	* Sets the created date of this kbpath.
	*
	* @param createdDate the created date of this kbpath
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_kbpath.setCreatedDate(createdDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_kbpath.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_kbpath.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_kbpath.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the flag of this kbpath.
	*
	* @param flag the flag of this kbpath
	*/
	@Override
	public void setFlag(java.lang.String flag) {
		_kbpath.setFlag(flag);
	}

	/**
	* Sets the ID of this kbpath.
	*
	* @param id the ID of this kbpath
	*/
	@Override
	public void setId(long id) {
		_kbpath.setId(id);
	}

	/**
	* Sets the kbdetails_id of this kbpath.
	*
	* @param kbdetails_id the kbdetails_id of this kbpath
	*/
	@Override
	public void setKbdetails_id(long kbdetails_id) {
		_kbpath.setKbdetails_id(kbdetails_id);
	}

	/**
	* Sets the kbfiledoc of this kbpath.
	*
	* @param kbfiledoc the kbfiledoc of this kbpath
	*/
	@Override
	public void setKbfiledoc(java.lang.String kbfiledoc) {
		_kbpath.setKbfiledoc(kbfiledoc);
	}

	/**
	* Sets the kbfilename of this kbpath.
	*
	* @param kbfilename the kbfilename of this kbpath
	*/
	@Override
	public void setKbfilename(java.lang.String kbfilename) {
		_kbpath.setKbfilename(kbfilename);
	}

	/**
	* Sets the kbfilepath of this kbpath.
	*
	* @param kbfilepath the kbfilepath of this kbpath
	*/
	@Override
	public void setKbfilepath(java.lang.String kbfilepath) {
		_kbpath.setKbfilepath(kbfilepath);
	}

	@Override
	public void setNew(boolean n) {
		_kbpath.setNew(n);
	}

	/**
	* Sets the primary key of this kbpath.
	*
	* @param primaryKey the primary key of this kbpath
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_kbpath.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_kbpath.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof kbpathWrapper)) {
			return false;
		}

		kbpathWrapper kbpathWrapper = (kbpathWrapper)obj;

		if (Objects.equals(_kbpath, kbpathWrapper._kbpath)) {
			return true;
		}

		return false;
	}

	@Override
	public kbpath getWrappedModel() {
		return _kbpath;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _kbpath.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _kbpath.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_kbpath.resetOriginalValues();
	}

	private final kbpath _kbpath;
}