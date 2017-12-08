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

package com.chola.businessmis.model;

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
 * This class is a wrapper for {@link businessmisdetails}.
 * </p>
 *
 * @author CloverLiferay01
 * @see businessmisdetails
 * @generated
 */
@ProviderType
public class businessmisdetailsWrapper implements businessmisdetails,
	ModelWrapper<businessmisdetails> {
	public businessmisdetailsWrapper(businessmisdetails businessmisdetails) {
		_businessmisdetails = businessmisdetails;
	}

	@Override
	public Class<?> getModelClass() {
		return businessmisdetails.class;
	}

	@Override
	public String getModelClassName() {
		return businessmisdetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("content_id", getContent_id());
		attributes.put("businesstitle", getBusinesstitle());
		attributes.put("businessDesc", getBusinessDesc());
		attributes.put("businessLink", getBusinessLink());
		attributes.put("filepath", getFilepath());
		attributes.put("filename", getFilename());
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

		String businesstitle = (String)attributes.get("businesstitle");

		if (businesstitle != null) {
			setBusinesstitle(businesstitle);
		}

		String businessDesc = (String)attributes.get("businessDesc");

		if (businessDesc != null) {
			setBusinessDesc(businessDesc);
		}

		String businessLink = (String)attributes.get("businessLink");

		if (businessLink != null) {
			setBusinessLink(businessLink);
		}

		String filepath = (String)attributes.get("filepath");

		if (filepath != null) {
			setFilepath(filepath);
		}

		String filename = (String)attributes.get("filename");

		if (filename != null) {
			setFilename(filename);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String createdBy = (String)attributes.get("createdBy");

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
		return _businessmisdetails.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _businessmisdetails.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _businessmisdetails.isNew();
	}

	@Override
	public com.chola.businessmis.model.businessmisdetails toEscapedModel() {
		return new businessmisdetailsWrapper(_businessmisdetails.toEscapedModel());
	}

	@Override
	public com.chola.businessmis.model.businessmisdetails toUnescapedModel() {
		return new businessmisdetailsWrapper(_businessmisdetails.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _businessmisdetails.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.businessmis.model.businessmisdetails> toCacheModel() {
		return _businessmisdetails.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.businessmis.model.businessmisdetails businessmisdetails) {
		return _businessmisdetails.compareTo(businessmisdetails);
	}

	@Override
	public int hashCode() {
		return _businessmisdetails.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _businessmisdetails.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new businessmisdetailsWrapper((businessmisdetails)_businessmisdetails.clone());
	}

	/**
	* Returns the business desc of this businessmisdetails.
	*
	* @return the business desc of this businessmisdetails
	*/
	@Override
	public java.lang.String getBusinessDesc() {
		return _businessmisdetails.getBusinessDesc();
	}

	/**
	* Returns the business link of this businessmisdetails.
	*
	* @return the business link of this businessmisdetails
	*/
	@Override
	public java.lang.String getBusinessLink() {
		return _businessmisdetails.getBusinessLink();
	}

	/**
	* Returns the businesstitle of this businessmisdetails.
	*
	* @return the businesstitle of this businessmisdetails
	*/
	@Override
	public java.lang.String getBusinesstitle() {
		return _businessmisdetails.getBusinesstitle();
	}

	/**
	* Returns the created by of this businessmisdetails.
	*
	* @return the created by of this businessmisdetails
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _businessmisdetails.getCreatedBy();
	}

	/**
	* Returns the filename of this businessmisdetails.
	*
	* @return the filename of this businessmisdetails
	*/
	@Override
	public java.lang.String getFilename() {
		return _businessmisdetails.getFilename();
	}

	/**
	* Returns the filepath of this businessmisdetails.
	*
	* @return the filepath of this businessmisdetails
	*/
	@Override
	public java.lang.String getFilepath() {
		return _businessmisdetails.getFilepath();
	}

	/**
	* Returns the flag of this businessmisdetails.
	*
	* @return the flag of this businessmisdetails
	*/
	@Override
	public java.lang.String getFlag() {
		return _businessmisdetails.getFlag();
	}

	@Override
	public java.lang.String toString() {
		return _businessmisdetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _businessmisdetails.toXmlString();
	}

	/**
	* Returns the created date of this businessmisdetails.
	*
	* @return the created date of this businessmisdetails
	*/
	@Override
	public Date getCreatedDate() {
		return _businessmisdetails.getCreatedDate();
	}

	/**
	* Returns the modified date of this businessmisdetails.
	*
	* @return the modified date of this businessmisdetails
	*/
	@Override
	public Date getModifiedDate() {
		return _businessmisdetails.getModifiedDate();
	}

	/**
	* Returns the content_id of this businessmisdetails.
	*
	* @return the content_id of this businessmisdetails
	*/
	@Override
	public long getContent_id() {
		return _businessmisdetails.getContent_id();
	}

	/**
	* Returns the ID of this businessmisdetails.
	*
	* @return the ID of this businessmisdetails
	*/
	@Override
	public long getId() {
		return _businessmisdetails.getId();
	}

	/**
	* Returns the modified by of this businessmisdetails.
	*
	* @return the modified by of this businessmisdetails
	*/
	@Override
	public long getModifiedBy() {
		return _businessmisdetails.getModifiedBy();
	}

	/**
	* Returns the primary key of this businessmisdetails.
	*
	* @return the primary key of this businessmisdetails
	*/
	@Override
	public long getPrimaryKey() {
		return _businessmisdetails.getPrimaryKey();
	}

	@Override
	public void persist() {
		_businessmisdetails.persist();
	}

	/**
	* Sets the business desc of this businessmisdetails.
	*
	* @param businessDesc the business desc of this businessmisdetails
	*/
	@Override
	public void setBusinessDesc(java.lang.String businessDesc) {
		_businessmisdetails.setBusinessDesc(businessDesc);
	}

	/**
	* Sets the business link of this businessmisdetails.
	*
	* @param businessLink the business link of this businessmisdetails
	*/
	@Override
	public void setBusinessLink(java.lang.String businessLink) {
		_businessmisdetails.setBusinessLink(businessLink);
	}

	/**
	* Sets the businesstitle of this businessmisdetails.
	*
	* @param businesstitle the businesstitle of this businessmisdetails
	*/
	@Override
	public void setBusinesstitle(java.lang.String businesstitle) {
		_businessmisdetails.setBusinesstitle(businesstitle);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_businessmisdetails.setCachedModel(cachedModel);
	}

	/**
	* Sets the content_id of this businessmisdetails.
	*
	* @param content_id the content_id of this businessmisdetails
	*/
	@Override
	public void setContent_id(long content_id) {
		_businessmisdetails.setContent_id(content_id);
	}

	/**
	* Sets the created by of this businessmisdetails.
	*
	* @param createdBy the created by of this businessmisdetails
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_businessmisdetails.setCreatedBy(createdBy);
	}

	/**
	* Sets the created date of this businessmisdetails.
	*
	* @param createdDate the created date of this businessmisdetails
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_businessmisdetails.setCreatedDate(createdDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_businessmisdetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_businessmisdetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_businessmisdetails.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the filename of this businessmisdetails.
	*
	* @param filename the filename of this businessmisdetails
	*/
	@Override
	public void setFilename(java.lang.String filename) {
		_businessmisdetails.setFilename(filename);
	}

	/**
	* Sets the filepath of this businessmisdetails.
	*
	* @param filepath the filepath of this businessmisdetails
	*/
	@Override
	public void setFilepath(java.lang.String filepath) {
		_businessmisdetails.setFilepath(filepath);
	}

	/**
	* Sets the flag of this businessmisdetails.
	*
	* @param flag the flag of this businessmisdetails
	*/
	@Override
	public void setFlag(java.lang.String flag) {
		_businessmisdetails.setFlag(flag);
	}

	/**
	* Sets the ID of this businessmisdetails.
	*
	* @param id the ID of this businessmisdetails
	*/
	@Override
	public void setId(long id) {
		_businessmisdetails.setId(id);
	}

	/**
	* Sets the modified by of this businessmisdetails.
	*
	* @param modifiedBy the modified by of this businessmisdetails
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_businessmisdetails.setModifiedBy(modifiedBy);
	}

	/**
	* Sets the modified date of this businessmisdetails.
	*
	* @param modifiedDate the modified date of this businessmisdetails
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_businessmisdetails.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_businessmisdetails.setNew(n);
	}

	/**
	* Sets the primary key of this businessmisdetails.
	*
	* @param primaryKey the primary key of this businessmisdetails
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_businessmisdetails.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_businessmisdetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof businessmisdetailsWrapper)) {
			return false;
		}

		businessmisdetailsWrapper businessmisdetailsWrapper = (businessmisdetailsWrapper)obj;

		if (Objects.equals(_businessmisdetails,
					businessmisdetailsWrapper._businessmisdetails)) {
			return true;
		}

		return false;
	}

	@Override
	public businessmisdetails getWrappedModel() {
		return _businessmisdetails;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _businessmisdetails.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _businessmisdetails.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_businessmisdetails.resetOriginalValues();
	}

	private final businessmisdetails _businessmisdetails;
}