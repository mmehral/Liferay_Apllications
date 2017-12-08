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

package com.chola.business.model;

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
 * This class is a wrapper for {@link businesssopDetails}.
 * </p>
 *
 * @author adms.java1
 * @see businesssopDetails
 * @generated
 */
@ProviderType
public class businesssopDetailsWrapper implements businesssopDetails,
	ModelWrapper<businesssopDetails> {
	public businesssopDetailsWrapper(businesssopDetails businesssopDetails) {
		_businesssopDetails = businesssopDetails;
	}

	@Override
	public Class<?> getModelClass() {
		return businesssopDetails.class;
	}

	@Override
	public String getModelClassName() {
		return businesssopDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("businesstitle", getBusinesstitle());
		attributes.put("businessDesc", getBusinessDesc());
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

		String businesstitle = (String)attributes.get("businesstitle");

		if (businesstitle != null) {
			setBusinesstitle(businesstitle);
		}

		String businessDesc = (String)attributes.get("businessDesc");

		if (businessDesc != null) {
			setBusinessDesc(businessDesc);
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
		return _businesssopDetails.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _businesssopDetails.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _businesssopDetails.isNew();
	}

	@Override
	public com.chola.business.model.businesssopDetails toEscapedModel() {
		return new businesssopDetailsWrapper(_businesssopDetails.toEscapedModel());
	}

	@Override
	public com.chola.business.model.businesssopDetails toUnescapedModel() {
		return new businesssopDetailsWrapper(_businesssopDetails.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _businesssopDetails.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.business.model.businesssopDetails> toCacheModel() {
		return _businesssopDetails.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.business.model.businesssopDetails businesssopDetails) {
		return _businesssopDetails.compareTo(businesssopDetails);
	}

	@Override
	public int hashCode() {
		return _businesssopDetails.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _businesssopDetails.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new businesssopDetailsWrapper((businesssopDetails)_businesssopDetails.clone());
	}

	/**
	* Returns the business desc of this businesssop details.
	*
	* @return the business desc of this businesssop details
	*/
	@Override
	public java.lang.String getBusinessDesc() {
		return _businesssopDetails.getBusinessDesc();
	}

	/**
	* Returns the businesstitle of this businesssop details.
	*
	* @return the businesstitle of this businesssop details
	*/
	@Override
	public java.lang.String getBusinesstitle() {
		return _businesssopDetails.getBusinesstitle();
	}

	/**
	* Returns the created by of this businesssop details.
	*
	* @return the created by of this businesssop details
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _businesssopDetails.getCreatedBy();
	}

	/**
	* Returns the flag of this businesssop details.
	*
	* @return the flag of this businesssop details
	*/
	@Override
	public java.lang.String getFlag() {
		return _businesssopDetails.getFlag();
	}

	@Override
	public java.lang.String toString() {
		return _businesssopDetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _businesssopDetails.toXmlString();
	}

	/**
	* Returns the created date of this businesssop details.
	*
	* @return the created date of this businesssop details
	*/
	@Override
	public Date getCreatedDate() {
		return _businesssopDetails.getCreatedDate();
	}

	/**
	* Returns the modified date of this businesssop details.
	*
	* @return the modified date of this businesssop details
	*/
	@Override
	public Date getModifiedDate() {
		return _businesssopDetails.getModifiedDate();
	}

	/**
	* Returns the ID of this businesssop details.
	*
	* @return the ID of this businesssop details
	*/
	@Override
	public long getId() {
		return _businesssopDetails.getId();
	}

	/**
	* Returns the modified by of this businesssop details.
	*
	* @return the modified by of this businesssop details
	*/
	@Override
	public long getModifiedBy() {
		return _businesssopDetails.getModifiedBy();
	}

	/**
	* Returns the primary key of this businesssop details.
	*
	* @return the primary key of this businesssop details
	*/
	@Override
	public long getPrimaryKey() {
		return _businesssopDetails.getPrimaryKey();
	}

	@Override
	public void persist() {
		_businesssopDetails.persist();
	}

	/**
	* Sets the business desc of this businesssop details.
	*
	* @param businessDesc the business desc of this businesssop details
	*/
	@Override
	public void setBusinessDesc(java.lang.String businessDesc) {
		_businesssopDetails.setBusinessDesc(businessDesc);
	}

	/**
	* Sets the businesstitle of this businesssop details.
	*
	* @param businesstitle the businesstitle of this businesssop details
	*/
	@Override
	public void setBusinesstitle(java.lang.String businesstitle) {
		_businesssopDetails.setBusinesstitle(businesstitle);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_businesssopDetails.setCachedModel(cachedModel);
	}

	/**
	* Sets the created by of this businesssop details.
	*
	* @param createdBy the created by of this businesssop details
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_businesssopDetails.setCreatedBy(createdBy);
	}

	/**
	* Sets the created date of this businesssop details.
	*
	* @param createdDate the created date of this businesssop details
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_businesssopDetails.setCreatedDate(createdDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_businesssopDetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_businesssopDetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_businesssopDetails.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the flag of this businesssop details.
	*
	* @param flag the flag of this businesssop details
	*/
	@Override
	public void setFlag(java.lang.String flag) {
		_businesssopDetails.setFlag(flag);
	}

	/**
	* Sets the ID of this businesssop details.
	*
	* @param id the ID of this businesssop details
	*/
	@Override
	public void setId(long id) {
		_businesssopDetails.setId(id);
	}

	/**
	* Sets the modified by of this businesssop details.
	*
	* @param modifiedBy the modified by of this businesssop details
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_businesssopDetails.setModifiedBy(modifiedBy);
	}

	/**
	* Sets the modified date of this businesssop details.
	*
	* @param modifiedDate the modified date of this businesssop details
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_businesssopDetails.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_businesssopDetails.setNew(n);
	}

	/**
	* Sets the primary key of this businesssop details.
	*
	* @param primaryKey the primary key of this businesssop details
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_businesssopDetails.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_businesssopDetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof businesssopDetailsWrapper)) {
			return false;
		}

		businesssopDetailsWrapper businesssopDetailsWrapper = (businesssopDetailsWrapper)obj;

		if (Objects.equals(_businesssopDetails,
					businesssopDetailsWrapper._businesssopDetails)) {
			return true;
		}

		return false;
	}

	@Override
	public businesssopDetails getWrappedModel() {
		return _businesssopDetails;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _businesssopDetails.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _businesssopDetails.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_businesssopDetails.resetOriginalValues();
	}

	private final businesssopDetails _businesssopDetails;
}