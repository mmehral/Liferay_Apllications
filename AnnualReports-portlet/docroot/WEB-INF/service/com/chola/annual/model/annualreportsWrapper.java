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

package com.chola.annual.model;

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
 * This class is a wrapper for {@link annualreports}.
 * </p>
 *
 * @author CloverLiferay02
 * @see annualreports
 * @generated
 */
@ProviderType
public class annualreportsWrapper implements annualreports,
	ModelWrapper<annualreports> {
	public annualreportsWrapper(annualreports annualreports) {
		_annualreports = annualreports;
	}

	@Override
	public Class<?> getModelClass() {
		return annualreports.class;
	}

	@Override
	public String getModelClassName() {
		return annualreports.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("details", getDetails());
		attributes.put("updatedon", getUpdatedon());
		attributes.put("updatedby", getUpdatedby());
		attributes.put("uniquecontentid", getUniquecontentid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String details = (String)attributes.get("details");

		if (details != null) {
			setDetails(details);
		}

		Date updatedon = (Date)attributes.get("updatedon");

		if (updatedon != null) {
			setUpdatedon(updatedon);
		}

		Long updatedby = (Long)attributes.get("updatedby");

		if (updatedby != null) {
			setUpdatedby(updatedby);
		}

		Long uniquecontentid = (Long)attributes.get("uniquecontentid");

		if (uniquecontentid != null) {
			setUniquecontentid(uniquecontentid);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _annualreports.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _annualreports.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _annualreports.isNew();
	}

	@Override
	public com.chola.annual.model.annualreports toEscapedModel() {
		return new annualreportsWrapper(_annualreports.toEscapedModel());
	}

	@Override
	public com.chola.annual.model.annualreports toUnescapedModel() {
		return new annualreportsWrapper(_annualreports.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _annualreports.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.annual.model.annualreports> toCacheModel() {
		return _annualreports.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.annual.model.annualreports annualreports) {
		return _annualreports.compareTo(annualreports);
	}

	@Override
	public int hashCode() {
		return _annualreports.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _annualreports.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new annualreportsWrapper((annualreports)_annualreports.clone());
	}

	/**
	* Returns the details of this annualreports.
	*
	* @return the details of this annualreports
	*/
	@Override
	public java.lang.String getDetails() {
		return _annualreports.getDetails();
	}

	@Override
	public java.lang.String toString() {
		return _annualreports.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _annualreports.toXmlString();
	}

	/**
	* Returns the updatedon of this annualreports.
	*
	* @return the updatedon of this annualreports
	*/
	@Override
	public Date getUpdatedon() {
		return _annualreports.getUpdatedon();
	}

	/**
	* Returns the ID of this annualreports.
	*
	* @return the ID of this annualreports
	*/
	@Override
	public long getId() {
		return _annualreports.getId();
	}

	/**
	* Returns the primary key of this annualreports.
	*
	* @return the primary key of this annualreports
	*/
	@Override
	public long getPrimaryKey() {
		return _annualreports.getPrimaryKey();
	}

	/**
	* Returns the uniquecontentid of this annualreports.
	*
	* @return the uniquecontentid of this annualreports
	*/
	@Override
	public long getUniquecontentid() {
		return _annualreports.getUniquecontentid();
	}

	/**
	* Returns the updatedby of this annualreports.
	*
	* @return the updatedby of this annualreports
	*/
	@Override
	public long getUpdatedby() {
		return _annualreports.getUpdatedby();
	}

	@Override
	public void persist() {
		_annualreports.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_annualreports.setCachedModel(cachedModel);
	}

	/**
	* Sets the details of this annualreports.
	*
	* @param details the details of this annualreports
	*/
	@Override
	public void setDetails(java.lang.String details) {
		_annualreports.setDetails(details);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_annualreports.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_annualreports.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_annualreports.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this annualreports.
	*
	* @param id the ID of this annualreports
	*/
	@Override
	public void setId(long id) {
		_annualreports.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_annualreports.setNew(n);
	}

	/**
	* Sets the primary key of this annualreports.
	*
	* @param primaryKey the primary key of this annualreports
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_annualreports.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_annualreports.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the uniquecontentid of this annualreports.
	*
	* @param uniquecontentid the uniquecontentid of this annualreports
	*/
	@Override
	public void setUniquecontentid(long uniquecontentid) {
		_annualreports.setUniquecontentid(uniquecontentid);
	}

	/**
	* Sets the updatedby of this annualreports.
	*
	* @param updatedby the updatedby of this annualreports
	*/
	@Override
	public void setUpdatedby(long updatedby) {
		_annualreports.setUpdatedby(updatedby);
	}

	/**
	* Sets the updatedon of this annualreports.
	*
	* @param updatedon the updatedon of this annualreports
	*/
	@Override
	public void setUpdatedon(Date updatedon) {
		_annualreports.setUpdatedon(updatedon);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof annualreportsWrapper)) {
			return false;
		}

		annualreportsWrapper annualreportsWrapper = (annualreportsWrapper)obj;

		if (Objects.equals(_annualreports, annualreportsWrapper._annualreports)) {
			return true;
		}

		return false;
	}

	@Override
	public annualreports getWrappedModel() {
		return _annualreports;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _annualreports.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _annualreports.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_annualreports.resetOriginalValues();
	}

	private final annualreports _annualreports;
}