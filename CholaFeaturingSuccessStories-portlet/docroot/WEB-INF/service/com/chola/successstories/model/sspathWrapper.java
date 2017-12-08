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

package com.chola.successstories.model;

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
 * This class is a wrapper for {@link sspath}.
 * </p>
 *
 * @author cloverliferay01
 * @see sspath
 * @generated
 */
@ProviderType
public class sspathWrapper implements sspath, ModelWrapper<sspath> {
	public sspathWrapper(sspath sspath) {
		_sspath = sspath;
	}

	@Override
	public Class<?> getModelClass() {
		return sspath.class;
	}

	@Override
	public String getModelClassName() {
		return sspath.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("ssfiledoc", getSsfiledoc());
		attributes.put("ssfilepath", getSsfilepath());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("flag", getFlag());
		attributes.put("ssdetails_id", getSsdetails_id());
		attributes.put("content_id", getContent_id());
		attributes.put("ssfilename", getSsfilename());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String ssfiledoc = (String)attributes.get("ssfiledoc");

		if (ssfiledoc != null) {
			setSsfiledoc(ssfiledoc);
		}

		String ssfilepath = (String)attributes.get("ssfilepath");

		if (ssfilepath != null) {
			setSsfilepath(ssfilepath);
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

		Long ssdetails_id = (Long)attributes.get("ssdetails_id");

		if (ssdetails_id != null) {
			setSsdetails_id(ssdetails_id);
		}

		Long content_id = (Long)attributes.get("content_id");

		if (content_id != null) {
			setContent_id(content_id);
		}

		String ssfilename = (String)attributes.get("ssfilename");

		if (ssfilename != null) {
			setSsfilename(ssfilename);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _sspath.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _sspath.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _sspath.isNew();
	}

	@Override
	public com.chola.successstories.model.sspath toEscapedModel() {
		return new sspathWrapper(_sspath.toEscapedModel());
	}

	@Override
	public com.chola.successstories.model.sspath toUnescapedModel() {
		return new sspathWrapper(_sspath.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _sspath.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.successstories.model.sspath> toCacheModel() {
		return _sspath.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.successstories.model.sspath sspath) {
		return _sspath.compareTo(sspath);
	}

	@Override
	public int hashCode() {
		return _sspath.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sspath.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new sspathWrapper((sspath)_sspath.clone());
	}

	/**
	* Returns the flag of this sspath.
	*
	* @return the flag of this sspath
	*/
	@Override
	public java.lang.String getFlag() {
		return _sspath.getFlag();
	}

	/**
	* Returns the ssfiledoc of this sspath.
	*
	* @return the ssfiledoc of this sspath
	*/
	@Override
	public java.lang.String getSsfiledoc() {
		return _sspath.getSsfiledoc();
	}

	/**
	* Returns the ssfilename of this sspath.
	*
	* @return the ssfilename of this sspath
	*/
	@Override
	public java.lang.String getSsfilename() {
		return _sspath.getSsfilename();
	}

	/**
	* Returns the ssfilepath of this sspath.
	*
	* @return the ssfilepath of this sspath
	*/
	@Override
	public java.lang.String getSsfilepath() {
		return _sspath.getSsfilepath();
	}

	@Override
	public java.lang.String toString() {
		return _sspath.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _sspath.toXmlString();
	}

	/**
	* Returns the created date of this sspath.
	*
	* @return the created date of this sspath
	*/
	@Override
	public Date getCreatedDate() {
		return _sspath.getCreatedDate();
	}

	/**
	* Returns the content_id of this sspath.
	*
	* @return the content_id of this sspath
	*/
	@Override
	public long getContent_id() {
		return _sspath.getContent_id();
	}

	/**
	* Returns the created by of this sspath.
	*
	* @return the created by of this sspath
	*/
	@Override
	public long getCreatedBy() {
		return _sspath.getCreatedBy();
	}

	/**
	* Returns the ID of this sspath.
	*
	* @return the ID of this sspath
	*/
	@Override
	public long getId() {
		return _sspath.getId();
	}

	/**
	* Returns the primary key of this sspath.
	*
	* @return the primary key of this sspath
	*/
	@Override
	public long getPrimaryKey() {
		return _sspath.getPrimaryKey();
	}

	/**
	* Returns the ssdetails_id of this sspath.
	*
	* @return the ssdetails_id of this sspath
	*/
	@Override
	public long getSsdetails_id() {
		return _sspath.getSsdetails_id();
	}

	@Override
	public void persist() {
		_sspath.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_sspath.setCachedModel(cachedModel);
	}

	/**
	* Sets the content_id of this sspath.
	*
	* @param content_id the content_id of this sspath
	*/
	@Override
	public void setContent_id(long content_id) {
		_sspath.setContent_id(content_id);
	}

	/**
	* Sets the created by of this sspath.
	*
	* @param createdBy the created by of this sspath
	*/
	@Override
	public void setCreatedBy(long createdBy) {
		_sspath.setCreatedBy(createdBy);
	}

	/**
	* Sets the created date of this sspath.
	*
	* @param createdDate the created date of this sspath
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_sspath.setCreatedDate(createdDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_sspath.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_sspath.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_sspath.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the flag of this sspath.
	*
	* @param flag the flag of this sspath
	*/
	@Override
	public void setFlag(java.lang.String flag) {
		_sspath.setFlag(flag);
	}

	/**
	* Sets the ID of this sspath.
	*
	* @param id the ID of this sspath
	*/
	@Override
	public void setId(long id) {
		_sspath.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_sspath.setNew(n);
	}

	/**
	* Sets the primary key of this sspath.
	*
	* @param primaryKey the primary key of this sspath
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_sspath.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_sspath.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the ssdetails_id of this sspath.
	*
	* @param ssdetails_id the ssdetails_id of this sspath
	*/
	@Override
	public void setSsdetails_id(long ssdetails_id) {
		_sspath.setSsdetails_id(ssdetails_id);
	}

	/**
	* Sets the ssfiledoc of this sspath.
	*
	* @param ssfiledoc the ssfiledoc of this sspath
	*/
	@Override
	public void setSsfiledoc(java.lang.String ssfiledoc) {
		_sspath.setSsfiledoc(ssfiledoc);
	}

	/**
	* Sets the ssfilename of this sspath.
	*
	* @param ssfilename the ssfilename of this sspath
	*/
	@Override
	public void setSsfilename(java.lang.String ssfilename) {
		_sspath.setSsfilename(ssfilename);
	}

	/**
	* Sets the ssfilepath of this sspath.
	*
	* @param ssfilepath the ssfilepath of this sspath
	*/
	@Override
	public void setSsfilepath(java.lang.String ssfilepath) {
		_sspath.setSsfilepath(ssfilepath);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof sspathWrapper)) {
			return false;
		}

		sspathWrapper sspathWrapper = (sspathWrapper)obj;

		if (Objects.equals(_sspath, sspathWrapper._sspath)) {
			return true;
		}

		return false;
	}

	@Override
	public sspath getWrappedModel() {
		return _sspath;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _sspath.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _sspath.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_sspath.resetOriginalValues();
	}

	private final sspath _sspath;
}