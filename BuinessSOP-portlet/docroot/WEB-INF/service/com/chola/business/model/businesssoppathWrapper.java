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
 * This class is a wrapper for {@link businesssoppath}.
 * </p>
 *
 * @author adms.java1
 * @see businesssoppath
 * @generated
 */
@ProviderType
public class businesssoppathWrapper implements businesssoppath,
	ModelWrapper<businesssoppath> {
	public businesssoppathWrapper(businesssoppath businesssoppath) {
		_businesssoppath = businesssoppath;
	}

	@Override
	public Class<?> getModelClass() {
		return businesssoppath.class;
	}

	@Override
	public String getModelClassName() {
		return businesssoppath.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("businessdoc", getBusinessdoc());
		attributes.put("businessPath", getBusinessPath());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("flag", getFlag());
		attributes.put("businessdetails_id", getBusinessdetails_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String businessdoc = (String)attributes.get("businessdoc");

		if (businessdoc != null) {
			setBusinessdoc(businessdoc);
		}

		String businessPath = (String)attributes.get("businessPath");

		if (businessPath != null) {
			setBusinessPath(businessPath);
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

		Long businessdetails_id = (Long)attributes.get("businessdetails_id");

		if (businessdetails_id != null) {
			setBusinessdetails_id(businessdetails_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _businesssoppath.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _businesssoppath.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _businesssoppath.isNew();
	}

	@Override
	public com.chola.business.model.businesssoppath toEscapedModel() {
		return new businesssoppathWrapper(_businesssoppath.toEscapedModel());
	}

	@Override
	public com.chola.business.model.businesssoppath toUnescapedModel() {
		return new businesssoppathWrapper(_businesssoppath.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _businesssoppath.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.business.model.businesssoppath> toCacheModel() {
		return _businesssoppath.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.business.model.businesssoppath businesssoppath) {
		return _businesssoppath.compareTo(businesssoppath);
	}

	@Override
	public int hashCode() {
		return _businesssoppath.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _businesssoppath.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new businesssoppathWrapper((businesssoppath)_businesssoppath.clone());
	}

	/**
	* Returns the business path of this businesssoppath.
	*
	* @return the business path of this businesssoppath
	*/
	@Override
	public java.lang.String getBusinessPath() {
		return _businesssoppath.getBusinessPath();
	}

	/**
	* Returns the businessdoc of this businesssoppath.
	*
	* @return the businessdoc of this businesssoppath
	*/
	@Override
	public java.lang.String getBusinessdoc() {
		return _businesssoppath.getBusinessdoc();
	}

	/**
	* Returns the created by of this businesssoppath.
	*
	* @return the created by of this businesssoppath
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _businesssoppath.getCreatedBy();
	}

	/**
	* Returns the flag of this businesssoppath.
	*
	* @return the flag of this businesssoppath
	*/
	@Override
	public java.lang.String getFlag() {
		return _businesssoppath.getFlag();
	}

	@Override
	public java.lang.String toString() {
		return _businesssoppath.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _businesssoppath.toXmlString();
	}

	/**
	* Returns the created date of this businesssoppath.
	*
	* @return the created date of this businesssoppath
	*/
	@Override
	public Date getCreatedDate() {
		return _businesssoppath.getCreatedDate();
	}

	/**
	* Returns the businessdetails_id of this businesssoppath.
	*
	* @return the businessdetails_id of this businesssoppath
	*/
	@Override
	public long getBusinessdetails_id() {
		return _businesssoppath.getBusinessdetails_id();
	}

	/**
	* Returns the ID of this businesssoppath.
	*
	* @return the ID of this businesssoppath
	*/
	@Override
	public long getId() {
		return _businesssoppath.getId();
	}

	/**
	* Returns the primary key of this businesssoppath.
	*
	* @return the primary key of this businesssoppath
	*/
	@Override
	public long getPrimaryKey() {
		return _businesssoppath.getPrimaryKey();
	}

	@Override
	public void persist() {
		_businesssoppath.persist();
	}

	/**
	* Sets the business path of this businesssoppath.
	*
	* @param businessPath the business path of this businesssoppath
	*/
	@Override
	public void setBusinessPath(java.lang.String businessPath) {
		_businesssoppath.setBusinessPath(businessPath);
	}

	/**
	* Sets the businessdetails_id of this businesssoppath.
	*
	* @param businessdetails_id the businessdetails_id of this businesssoppath
	*/
	@Override
	public void setBusinessdetails_id(long businessdetails_id) {
		_businesssoppath.setBusinessdetails_id(businessdetails_id);
	}

	/**
	* Sets the businessdoc of this businesssoppath.
	*
	* @param businessdoc the businessdoc of this businesssoppath
	*/
	@Override
	public void setBusinessdoc(java.lang.String businessdoc) {
		_businesssoppath.setBusinessdoc(businessdoc);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_businesssoppath.setCachedModel(cachedModel);
	}

	/**
	* Sets the created by of this businesssoppath.
	*
	* @param createdBy the created by of this businesssoppath
	*/
	@Override
	public void setCreatedBy(java.lang.String createdBy) {
		_businesssoppath.setCreatedBy(createdBy);
	}

	/**
	* Sets the created date of this businesssoppath.
	*
	* @param createdDate the created date of this businesssoppath
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_businesssoppath.setCreatedDate(createdDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_businesssoppath.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_businesssoppath.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_businesssoppath.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the flag of this businesssoppath.
	*
	* @param flag the flag of this businesssoppath
	*/
	@Override
	public void setFlag(java.lang.String flag) {
		_businesssoppath.setFlag(flag);
	}

	/**
	* Sets the ID of this businesssoppath.
	*
	* @param id the ID of this businesssoppath
	*/
	@Override
	public void setId(long id) {
		_businesssoppath.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_businesssoppath.setNew(n);
	}

	/**
	* Sets the primary key of this businesssoppath.
	*
	* @param primaryKey the primary key of this businesssoppath
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_businesssoppath.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_businesssoppath.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof businesssoppathWrapper)) {
			return false;
		}

		businesssoppathWrapper businesssoppathWrapper = (businesssoppathWrapper)obj;

		if (Objects.equals(_businesssoppath,
					businesssoppathWrapper._businesssoppath)) {
			return true;
		}

		return false;
	}

	@Override
	public businesssoppath getWrappedModel() {
		return _businesssoppath;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _businesssoppath.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _businesssoppath.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_businesssoppath.resetOriginalValues();
	}

	private final businesssoppath _businesssoppath;
}