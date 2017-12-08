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

package com.organizationAnnouncement.model;

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
 * This class is a wrapper for {@link organization}.
 * </p>
 *
 * @author adms.java1
 * @see organization
 * @generated
 */
@ProviderType
public class organizationWrapper implements organization,
	ModelWrapper<organization> {
	public organizationWrapper(organization organization) {
		_organization = organization;
	}

	@Override
	public Class<?> getModelClass() {
		return organization.class;
	}

	@Override
	public String getModelClassName() {
		return organization.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("organization_id", getOrganization_id());
		attributes.put("organization_tite", getOrganization_tite());
		attributes.put("organization_description", getOrganization_description());
		attributes.put("organization_image_name", getOrganization_image_name());
		attributes.put("organization_image_path", getOrganization_image_path());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long organization_id = (Long)attributes.get("organization_id");

		if (organization_id != null) {
			setOrganization_id(organization_id);
		}

		String organization_tite = (String)attributes.get("organization_tite");

		if (organization_tite != null) {
			setOrganization_tite(organization_tite);
		}

		String organization_description = (String)attributes.get(
				"organization_description");

		if (organization_description != null) {
			setOrganization_description(organization_description);
		}

		String organization_image_name = (String)attributes.get(
				"organization_image_name");

		if (organization_image_name != null) {
			setOrganization_image_name(organization_image_name);
		}

		String organization_image_path = (String)attributes.get(
				"organization_image_path");

		if (organization_image_path != null) {
			setOrganization_image_path(organization_image_path);
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
		return _organization.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _organization.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _organization.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _organization.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.organizationAnnouncement.model.organization> toCacheModel() {
		return _organization.toCacheModel();
	}

	@Override
	public com.organizationAnnouncement.model.organization toEscapedModel() {
		return new organizationWrapper(_organization.toEscapedModel());
	}

	@Override
	public com.organizationAnnouncement.model.organization toUnescapedModel() {
		return new organizationWrapper(_organization.toUnescapedModel());
	}

	@Override
	public int compareTo(
		com.organizationAnnouncement.model.organization organization) {
		return _organization.compareTo(organization);
	}

	@Override
	public int hashCode() {
		return _organization.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _organization.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new organizationWrapper((organization)_organization.clone());
	}

	/**
	* Returns the organization_description of this organization.
	*
	* @return the organization_description of this organization
	*/
	@Override
	public java.lang.String getOrganization_description() {
		return _organization.getOrganization_description();
	}

	/**
	* Returns the organization_image_name of this organization.
	*
	* @return the organization_image_name of this organization
	*/
	@Override
	public java.lang.String getOrganization_image_name() {
		return _organization.getOrganization_image_name();
	}

	/**
	* Returns the organization_image_path of this organization.
	*
	* @return the organization_image_path of this organization
	*/
	@Override
	public java.lang.String getOrganization_image_path() {
		return _organization.getOrganization_image_path();
	}

	/**
	* Returns the organization_tite of this organization.
	*
	* @return the organization_tite of this organization
	*/
	@Override
	public java.lang.String getOrganization_tite() {
		return _organization.getOrganization_tite();
	}

	@Override
	public java.lang.String toString() {
		return _organization.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _organization.toXmlString();
	}

	/**
	* Returns the create date of this organization.
	*
	* @return the create date of this organization
	*/
	@Override
	public Date getCreateDate() {
		return _organization.getCreateDate();
	}

	/**
	* Returns the modified date of this organization.
	*
	* @return the modified date of this organization
	*/
	@Override
	public Date getModifiedDate() {
		return _organization.getModifiedDate();
	}

	/**
	* Returns the organization_id of this organization.
	*
	* @return the organization_id of this organization
	*/
	@Override
	public long getOrganization_id() {
		return _organization.getOrganization_id();
	}

	/**
	* Returns the primary key of this organization.
	*
	* @return the primary key of this organization
	*/
	@Override
	public long getPrimaryKey() {
		return _organization.getPrimaryKey();
	}

	@Override
	public void persist() {
		_organization.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_organization.setCachedModel(cachedModel);
	}

	/**
	* Sets the create date of this organization.
	*
	* @param createDate the create date of this organization
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_organization.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_organization.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_organization.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_organization.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified date of this organization.
	*
	* @param modifiedDate the modified date of this organization
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_organization.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_organization.setNew(n);
	}

	/**
	* Sets the organization_description of this organization.
	*
	* @param organization_description the organization_description of this organization
	*/
	@Override
	public void setOrganization_description(
		java.lang.String organization_description) {
		_organization.setOrganization_description(organization_description);
	}

	/**
	* Sets the organization_id of this organization.
	*
	* @param organization_id the organization_id of this organization
	*/
	@Override
	public void setOrganization_id(long organization_id) {
		_organization.setOrganization_id(organization_id);
	}

	/**
	* Sets the organization_image_name of this organization.
	*
	* @param organization_image_name the organization_image_name of this organization
	*/
	@Override
	public void setOrganization_image_name(
		java.lang.String organization_image_name) {
		_organization.setOrganization_image_name(organization_image_name);
	}

	/**
	* Sets the organization_image_path of this organization.
	*
	* @param organization_image_path the organization_image_path of this organization
	*/
	@Override
	public void setOrganization_image_path(
		java.lang.String organization_image_path) {
		_organization.setOrganization_image_path(organization_image_path);
	}

	/**
	* Sets the organization_tite of this organization.
	*
	* @param organization_tite the organization_tite of this organization
	*/
	@Override
	public void setOrganization_tite(java.lang.String organization_tite) {
		_organization.setOrganization_tite(organization_tite);
	}

	/**
	* Sets the primary key of this organization.
	*
	* @param primaryKey the primary key of this organization
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_organization.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_organization.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof organizationWrapper)) {
			return false;
		}

		organizationWrapper organizationWrapper = (organizationWrapper)obj;

		if (Objects.equals(_organization, organizationWrapper._organization)) {
			return true;
		}

		return false;
	}

	@Override
	public organization getWrappedModel() {
		return _organization;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _organization.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _organization.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_organization.resetOriginalValues();
	}

	private final organization _organization;
}