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
 * This class is a wrapper for {@link ssdetails}.
 * </p>
 *
 * @author cloverliferay01
 * @see ssdetails
 * @generated
 */
@ProviderType
public class ssdetailsWrapper implements ssdetails, ModelWrapper<ssdetails> {
	public ssdetailsWrapper(ssdetails ssdetails) {
		_ssdetails = ssdetails;
	}

	@Override
	public Class<?> getModelClass() {
		return ssdetails.class;
	}

	@Override
	public String getModelClassName() {
		return ssdetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("content_id", getContent_id());
		attributes.put("sstitle", getSstitle());
		attributes.put("ssdesc", getSsdesc());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("modifiedBy", getModifiedBy());
		attributes.put("flag", getFlag());

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

		String sstitle = (String)attributes.get("sstitle");

		if (sstitle != null) {
			setSstitle(sstitle);
		}

		String ssdesc = (String)attributes.get("ssdesc");

		if (ssdesc != null) {
			setSsdesc(ssdesc);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long createdBy = (Long)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long modifiedBy = (Long)attributes.get("modifiedBy");

		if (modifiedBy != null) {
			setModifiedBy(modifiedBy);
		}

		String flag = (String)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _ssdetails.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _ssdetails.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _ssdetails.isNew();
	}

	@Override
	public com.chola.successstories.model.ssdetails toEscapedModel() {
		return new ssdetailsWrapper(_ssdetails.toEscapedModel());
	}

	@Override
	public com.chola.successstories.model.ssdetails toUnescapedModel() {
		return new ssdetailsWrapper(_ssdetails.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _ssdetails.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.successstories.model.ssdetails> toCacheModel() {
		return _ssdetails.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.successstories.model.ssdetails ssdetails) {
		return _ssdetails.compareTo(ssdetails);
	}

	@Override
	public int hashCode() {
		return _ssdetails.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ssdetails.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ssdetailsWrapper((ssdetails)_ssdetails.clone());
	}

	/**
	* Returns the flag of this ssdetails.
	*
	* @return the flag of this ssdetails
	*/
	@Override
	public java.lang.String getFlag() {
		return _ssdetails.getFlag();
	}

	/**
	* Returns the ssdesc of this ssdetails.
	*
	* @return the ssdesc of this ssdetails
	*/
	@Override
	public java.lang.String getSsdesc() {
		return _ssdetails.getSsdesc();
	}

	/**
	* Returns the sstitle of this ssdetails.
	*
	* @return the sstitle of this ssdetails
	*/
	@Override
	public java.lang.String getSstitle() {
		return _ssdetails.getSstitle();
	}

	@Override
	public java.lang.String toString() {
		return _ssdetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _ssdetails.toXmlString();
	}

	/**
	* Returns the created date of this ssdetails.
	*
	* @return the created date of this ssdetails
	*/
	@Override
	public Date getCreatedDate() {
		return _ssdetails.getCreatedDate();
	}

	/**
	* Returns the modified date of this ssdetails.
	*
	* @return the modified date of this ssdetails
	*/
	@Override
	public Date getModifiedDate() {
		return _ssdetails.getModifiedDate();
	}

	/**
	* Returns the content_id of this ssdetails.
	*
	* @return the content_id of this ssdetails
	*/
	@Override
	public long getContent_id() {
		return _ssdetails.getContent_id();
	}

	/**
	* Returns the created by of this ssdetails.
	*
	* @return the created by of this ssdetails
	*/
	@Override
	public long getCreatedBy() {
		return _ssdetails.getCreatedBy();
	}

	/**
	* Returns the ID of this ssdetails.
	*
	* @return the ID of this ssdetails
	*/
	@Override
	public long getId() {
		return _ssdetails.getId();
	}

	/**
	* Returns the modified by of this ssdetails.
	*
	* @return the modified by of this ssdetails
	*/
	@Override
	public long getModifiedBy() {
		return _ssdetails.getModifiedBy();
	}

	/**
	* Returns the primary key of this ssdetails.
	*
	* @return the primary key of this ssdetails
	*/
	@Override
	public long getPrimaryKey() {
		return _ssdetails.getPrimaryKey();
	}

	@Override
	public void persist() {
		_ssdetails.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_ssdetails.setCachedModel(cachedModel);
	}

	/**
	* Sets the content_id of this ssdetails.
	*
	* @param content_id the content_id of this ssdetails
	*/
	@Override
	public void setContent_id(long content_id) {
		_ssdetails.setContent_id(content_id);
	}

	/**
	* Sets the created by of this ssdetails.
	*
	* @param createdBy the created by of this ssdetails
	*/
	@Override
	public void setCreatedBy(long createdBy) {
		_ssdetails.setCreatedBy(createdBy);
	}

	/**
	* Sets the created date of this ssdetails.
	*
	* @param createdDate the created date of this ssdetails
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_ssdetails.setCreatedDate(createdDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_ssdetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_ssdetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_ssdetails.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the flag of this ssdetails.
	*
	* @param flag the flag of this ssdetails
	*/
	@Override
	public void setFlag(java.lang.String flag) {
		_ssdetails.setFlag(flag);
	}

	/**
	* Sets the ID of this ssdetails.
	*
	* @param id the ID of this ssdetails
	*/
	@Override
	public void setId(long id) {
		_ssdetails.setId(id);
	}

	/**
	* Sets the modified by of this ssdetails.
	*
	* @param modifiedBy the modified by of this ssdetails
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_ssdetails.setModifiedBy(modifiedBy);
	}

	/**
	* Sets the modified date of this ssdetails.
	*
	* @param modifiedDate the modified date of this ssdetails
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_ssdetails.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_ssdetails.setNew(n);
	}

	/**
	* Sets the primary key of this ssdetails.
	*
	* @param primaryKey the primary key of this ssdetails
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_ssdetails.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_ssdetails.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the ssdesc of this ssdetails.
	*
	* @param ssdesc the ssdesc of this ssdetails
	*/
	@Override
	public void setSsdesc(java.lang.String ssdesc) {
		_ssdetails.setSsdesc(ssdesc);
	}

	/**
	* Sets the sstitle of this ssdetails.
	*
	* @param sstitle the sstitle of this ssdetails
	*/
	@Override
	public void setSstitle(java.lang.String sstitle) {
		_ssdetails.setSstitle(sstitle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ssdetailsWrapper)) {
			return false;
		}

		ssdetailsWrapper ssdetailsWrapper = (ssdetailsWrapper)obj;

		if (Objects.equals(_ssdetails, ssdetailsWrapper._ssdetails)) {
			return true;
		}

		return false;
	}

	@Override
	public ssdetails getWrappedModel() {
		return _ssdetails;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _ssdetails.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _ssdetails.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_ssdetails.resetOriginalValues();
	}

	private final ssdetails _ssdetails;
}