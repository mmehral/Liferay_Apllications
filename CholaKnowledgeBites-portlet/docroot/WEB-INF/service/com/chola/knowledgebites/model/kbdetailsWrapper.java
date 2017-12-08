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
 * This class is a wrapper for {@link kbdetails}.
 * </p>
 *
 * @author cloverliferay01
 * @see kbdetails
 * @generated
 */
@ProviderType
public class kbdetailsWrapper implements kbdetails, ModelWrapper<kbdetails> {
	public kbdetailsWrapper(kbdetails kbdetails) {
		_kbdetails = kbdetails;
	}

	@Override
	public Class<?> getModelClass() {
		return kbdetails.class;
	}

	@Override
	public String getModelClassName() {
		return kbdetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("content_id", getContent_id());
		attributes.put("kbtitle", getKbtitle());
		attributes.put("kbdesc", getKbdesc());
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

		String kbtitle = (String)attributes.get("kbtitle");

		if (kbtitle != null) {
			setKbtitle(kbtitle);
		}

		String kbdesc = (String)attributes.get("kbdesc");

		if (kbdesc != null) {
			setKbdesc(kbdesc);
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
		return _kbdetails.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _kbdetails.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _kbdetails.isNew();
	}

	@Override
	public com.chola.knowledgebites.model.kbdetails toEscapedModel() {
		return new kbdetailsWrapper(_kbdetails.toEscapedModel());
	}

	@Override
	public com.chola.knowledgebites.model.kbdetails toUnescapedModel() {
		return new kbdetailsWrapper(_kbdetails.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _kbdetails.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.knowledgebites.model.kbdetails> toCacheModel() {
		return _kbdetails.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.knowledgebites.model.kbdetails kbdetails) {
		return _kbdetails.compareTo(kbdetails);
	}

	@Override
	public int hashCode() {
		return _kbdetails.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _kbdetails.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new kbdetailsWrapper((kbdetails)_kbdetails.clone());
	}

	/**
	* Returns the flag of this kbdetails.
	*
	* @return the flag of this kbdetails
	*/
	@Override
	public java.lang.String getFlag() {
		return _kbdetails.getFlag();
	}

	/**
	* Returns the kbdesc of this kbdetails.
	*
	* @return the kbdesc of this kbdetails
	*/
	@Override
	public java.lang.String getKbdesc() {
		return _kbdetails.getKbdesc();
	}

	/**
	* Returns the kbtitle of this kbdetails.
	*
	* @return the kbtitle of this kbdetails
	*/
	@Override
	public java.lang.String getKbtitle() {
		return _kbdetails.getKbtitle();
	}

	@Override
	public java.lang.String toString() {
		return _kbdetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _kbdetails.toXmlString();
	}

	/**
	* Returns the created date of this kbdetails.
	*
	* @return the created date of this kbdetails
	*/
	@Override
	public Date getCreatedDate() {
		return _kbdetails.getCreatedDate();
	}

	/**
	* Returns the modified date of this kbdetails.
	*
	* @return the modified date of this kbdetails
	*/
	@Override
	public Date getModifiedDate() {
		return _kbdetails.getModifiedDate();
	}

	/**
	* Returns the content_id of this kbdetails.
	*
	* @return the content_id of this kbdetails
	*/
	@Override
	public long getContent_id() {
		return _kbdetails.getContent_id();
	}

	/**
	* Returns the created by of this kbdetails.
	*
	* @return the created by of this kbdetails
	*/
	@Override
	public long getCreatedBy() {
		return _kbdetails.getCreatedBy();
	}

	/**
	* Returns the ID of this kbdetails.
	*
	* @return the ID of this kbdetails
	*/
	@Override
	public long getId() {
		return _kbdetails.getId();
	}

	/**
	* Returns the modified by of this kbdetails.
	*
	* @return the modified by of this kbdetails
	*/
	@Override
	public long getModifiedBy() {
		return _kbdetails.getModifiedBy();
	}

	/**
	* Returns the primary key of this kbdetails.
	*
	* @return the primary key of this kbdetails
	*/
	@Override
	public long getPrimaryKey() {
		return _kbdetails.getPrimaryKey();
	}

	@Override
	public void persist() {
		_kbdetails.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_kbdetails.setCachedModel(cachedModel);
	}

	/**
	* Sets the content_id of this kbdetails.
	*
	* @param content_id the content_id of this kbdetails
	*/
	@Override
	public void setContent_id(long content_id) {
		_kbdetails.setContent_id(content_id);
	}

	/**
	* Sets the created by of this kbdetails.
	*
	* @param createdBy the created by of this kbdetails
	*/
	@Override
	public void setCreatedBy(long createdBy) {
		_kbdetails.setCreatedBy(createdBy);
	}

	/**
	* Sets the created date of this kbdetails.
	*
	* @param createdDate the created date of this kbdetails
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_kbdetails.setCreatedDate(createdDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_kbdetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_kbdetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_kbdetails.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the flag of this kbdetails.
	*
	* @param flag the flag of this kbdetails
	*/
	@Override
	public void setFlag(java.lang.String flag) {
		_kbdetails.setFlag(flag);
	}

	/**
	* Sets the ID of this kbdetails.
	*
	* @param id the ID of this kbdetails
	*/
	@Override
	public void setId(long id) {
		_kbdetails.setId(id);
	}

	/**
	* Sets the kbdesc of this kbdetails.
	*
	* @param kbdesc the kbdesc of this kbdetails
	*/
	@Override
	public void setKbdesc(java.lang.String kbdesc) {
		_kbdetails.setKbdesc(kbdesc);
	}

	/**
	* Sets the kbtitle of this kbdetails.
	*
	* @param kbtitle the kbtitle of this kbdetails
	*/
	@Override
	public void setKbtitle(java.lang.String kbtitle) {
		_kbdetails.setKbtitle(kbtitle);
	}

	/**
	* Sets the modified by of this kbdetails.
	*
	* @param modifiedBy the modified by of this kbdetails
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_kbdetails.setModifiedBy(modifiedBy);
	}

	/**
	* Sets the modified date of this kbdetails.
	*
	* @param modifiedDate the modified date of this kbdetails
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_kbdetails.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_kbdetails.setNew(n);
	}

	/**
	* Sets the primary key of this kbdetails.
	*
	* @param primaryKey the primary key of this kbdetails
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_kbdetails.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_kbdetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof kbdetailsWrapper)) {
			return false;
		}

		kbdetailsWrapper kbdetailsWrapper = (kbdetailsWrapper)obj;

		if (Objects.equals(_kbdetails, kbdetailsWrapper._kbdetails)) {
			return true;
		}

		return false;
	}

	@Override
	public kbdetails getWrappedModel() {
		return _kbdetails;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _kbdetails.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _kbdetails.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_kbdetails.resetOriginalValues();
	}

	private final kbdetails _kbdetails;
}