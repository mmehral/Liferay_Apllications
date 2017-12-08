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

package com.service.compliance.model;

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
 * This class is a wrapper for {@link compliance}.
 * </p>
 *
 * @author adms.java1
 * @see compliance
 * @generated
 */
@ProviderType
public class complianceWrapper implements compliance, ModelWrapper<compliance> {
	public complianceWrapper(compliance compliance) {
		_compliance = compliance;
	}

	@Override
	public Class<?> getModelClass() {
		return compliance.class;
	}

	@Override
	public String getModelClassName() {
		return compliance.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("compliance_id", getCompliance_id());
		attributes.put("compliance_tite", getCompliance_tite());
		attributes.put("compliance_shortdescription",
			getCompliance_shortdescription());
		attributes.put("compliance_description", getCompliance_description());
		attributes.put("compliance_document_name", getCompliance_document_name());
		attributes.put("compliance_document_extension",
			getCompliance_document_extension());
		attributes.put("compliance_document_path", getCompliance_document_path());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long compliance_id = (Long)attributes.get("compliance_id");

		if (compliance_id != null) {
			setCompliance_id(compliance_id);
		}

		String compliance_tite = (String)attributes.get("compliance_tite");

		if (compliance_tite != null) {
			setCompliance_tite(compliance_tite);
		}

		String compliance_shortdescription = (String)attributes.get(
				"compliance_shortdescription");

		if (compliance_shortdescription != null) {
			setCompliance_shortdescription(compliance_shortdescription);
		}

		String compliance_description = (String)attributes.get(
				"compliance_description");

		if (compliance_description != null) {
			setCompliance_description(compliance_description);
		}

		String compliance_document_name = (String)attributes.get(
				"compliance_document_name");

		if (compliance_document_name != null) {
			setCompliance_document_name(compliance_document_name);
		}

		String compliance_document_extension = (String)attributes.get(
				"compliance_document_extension");

		if (compliance_document_extension != null) {
			setCompliance_document_extension(compliance_document_extension);
		}

		String compliance_document_path = (String)attributes.get(
				"compliance_document_path");

		if (compliance_document_path != null) {
			setCompliance_document_path(compliance_document_path);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _compliance.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _compliance.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _compliance.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _compliance.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.service.compliance.model.compliance> toCacheModel() {
		return _compliance.toCacheModel();
	}

	@Override
	public com.service.compliance.model.compliance toEscapedModel() {
		return new complianceWrapper(_compliance.toEscapedModel());
	}

	@Override
	public com.service.compliance.model.compliance toUnescapedModel() {
		return new complianceWrapper(_compliance.toUnescapedModel());
	}

	@Override
	public int compareTo(com.service.compliance.model.compliance compliance) {
		return _compliance.compareTo(compliance);
	}

	@Override
	public int hashCode() {
		return _compliance.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _compliance.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new complianceWrapper((compliance)_compliance.clone());
	}

	/**
	* Returns the compliance_description of this compliance.
	*
	* @return the compliance_description of this compliance
	*/
	@Override
	public java.lang.String getCompliance_description() {
		return _compliance.getCompliance_description();
	}

	/**
	* Returns the compliance_document_extension of this compliance.
	*
	* @return the compliance_document_extension of this compliance
	*/
	@Override
	public java.lang.String getCompliance_document_extension() {
		return _compliance.getCompliance_document_extension();
	}

	/**
	* Returns the compliance_document_name of this compliance.
	*
	* @return the compliance_document_name of this compliance
	*/
	@Override
	public java.lang.String getCompliance_document_name() {
		return _compliance.getCompliance_document_name();
	}

	/**
	* Returns the compliance_document_path of this compliance.
	*
	* @return the compliance_document_path of this compliance
	*/
	@Override
	public java.lang.String getCompliance_document_path() {
		return _compliance.getCompliance_document_path();
	}

	/**
	* Returns the compliance_shortdescription of this compliance.
	*
	* @return the compliance_shortdescription of this compliance
	*/
	@Override
	public java.lang.String getCompliance_shortdescription() {
		return _compliance.getCompliance_shortdescription();
	}

	/**
	* Returns the compliance_tite of this compliance.
	*
	* @return the compliance_tite of this compliance
	*/
	@Override
	public java.lang.String getCompliance_tite() {
		return _compliance.getCompliance_tite();
	}

	@Override
	public java.lang.String toString() {
		return _compliance.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _compliance.toXmlString();
	}

	/**
	* Returns the create date of this compliance.
	*
	* @return the create date of this compliance
	*/
	@Override
	public Date getCreateDate() {
		return _compliance.getCreateDate();
	}

	/**
	* Returns the modified date of this compliance.
	*
	* @return the modified date of this compliance
	*/
	@Override
	public Date getModifiedDate() {
		return _compliance.getModifiedDate();
	}

	/**
	* Returns the compliance_id of this compliance.
	*
	* @return the compliance_id of this compliance
	*/
	@Override
	public long getCompliance_id() {
		return _compliance.getCompliance_id();
	}

	/**
	* Returns the primary key of this compliance.
	*
	* @return the primary key of this compliance
	*/
	@Override
	public long getPrimaryKey() {
		return _compliance.getPrimaryKey();
	}

	@Override
	public void persist() {
		_compliance.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_compliance.setCachedModel(cachedModel);
	}

	/**
	* Sets the compliance_description of this compliance.
	*
	* @param compliance_description the compliance_description of this compliance
	*/
	@Override
	public void setCompliance_description(
		java.lang.String compliance_description) {
		_compliance.setCompliance_description(compliance_description);
	}

	/**
	* Sets the compliance_document_extension of this compliance.
	*
	* @param compliance_document_extension the compliance_document_extension of this compliance
	*/
	@Override
	public void setCompliance_document_extension(
		java.lang.String compliance_document_extension) {
		_compliance.setCompliance_document_extension(compliance_document_extension);
	}

	/**
	* Sets the compliance_document_name of this compliance.
	*
	* @param compliance_document_name the compliance_document_name of this compliance
	*/
	@Override
	public void setCompliance_document_name(
		java.lang.String compliance_document_name) {
		_compliance.setCompliance_document_name(compliance_document_name);
	}

	/**
	* Sets the compliance_document_path of this compliance.
	*
	* @param compliance_document_path the compliance_document_path of this compliance
	*/
	@Override
	public void setCompliance_document_path(
		java.lang.String compliance_document_path) {
		_compliance.setCompliance_document_path(compliance_document_path);
	}

	/**
	* Sets the compliance_id of this compliance.
	*
	* @param compliance_id the compliance_id of this compliance
	*/
	@Override
	public void setCompliance_id(long compliance_id) {
		_compliance.setCompliance_id(compliance_id);
	}

	/**
	* Sets the compliance_shortdescription of this compliance.
	*
	* @param compliance_shortdescription the compliance_shortdescription of this compliance
	*/
	@Override
	public void setCompliance_shortdescription(
		java.lang.String compliance_shortdescription) {
		_compliance.setCompliance_shortdescription(compliance_shortdescription);
	}

	/**
	* Sets the compliance_tite of this compliance.
	*
	* @param compliance_tite the compliance_tite of this compliance
	*/
	@Override
	public void setCompliance_tite(java.lang.String compliance_tite) {
		_compliance.setCompliance_tite(compliance_tite);
	}

	/**
	* Sets the create date of this compliance.
	*
	* @param createDate the create date of this compliance
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_compliance.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_compliance.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_compliance.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_compliance.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified date of this compliance.
	*
	* @param modifiedDate the modified date of this compliance
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_compliance.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_compliance.setNew(n);
	}

	/**
	* Sets the primary key of this compliance.
	*
	* @param primaryKey the primary key of this compliance
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_compliance.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_compliance.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof complianceWrapper)) {
			return false;
		}

		complianceWrapper complianceWrapper = (complianceWrapper)obj;

		if (Objects.equals(_compliance, complianceWrapper._compliance)) {
			return true;
		}

		return false;
	}

	@Override
	public compliance getWrappedModel() {
		return _compliance;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _compliance.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _compliance.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_compliance.resetOriginalValues();
	}

	private final compliance _compliance;
}