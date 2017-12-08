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

package com.chola.bsop.model;

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
 * This class is a wrapper for {@link bsopdetails}.
 * </p>
 *
 * @author cloverliferay01
 * @see bsopdetails
 * @generated
 */
@ProviderType
public class bsopdetailsWrapper implements bsopdetails,
	ModelWrapper<bsopdetails> {
	public bsopdetailsWrapper(bsopdetails bsopdetails) {
		_bsopdetails = bsopdetails;
	}

	@Override
	public Class<?> getModelClass() {
		return bsopdetails.class;
	}

	@Override
	public String getModelClassName() {
		return bsopdetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("content_id", getContent_id());
		attributes.put("btitle", getBtitle());
		attributes.put("bdesc", getBdesc());
		attributes.put("createddate", getCreateddate());
		attributes.put("createdby", getCreatedby());
		attributes.put("modifieddate", getModifieddate());
		attributes.put("modifiedby", getModifiedby());
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

		String btitle = (String)attributes.get("btitle");

		if (btitle != null) {
			setBtitle(btitle);
		}

		String bdesc = (String)attributes.get("bdesc");

		if (bdesc != null) {
			setBdesc(bdesc);
		}

		Date createddate = (Date)attributes.get("createddate");

		if (createddate != null) {
			setCreateddate(createddate);
		}

		String createdby = (String)attributes.get("createdby");

		if (createdby != null) {
			setCreatedby(createdby);
		}

		Date modifieddate = (Date)attributes.get("modifieddate");

		if (modifieddate != null) {
			setModifieddate(modifieddate);
		}

		Long modifiedby = (Long)attributes.get("modifiedby");

		if (modifiedby != null) {
			setModifiedby(modifiedby);
		}

		String flag = (String)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _bsopdetails.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _bsopdetails.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _bsopdetails.isNew();
	}

	@Override
	public com.chola.bsop.model.bsopdetails toEscapedModel() {
		return new bsopdetailsWrapper(_bsopdetails.toEscapedModel());
	}

	@Override
	public com.chola.bsop.model.bsopdetails toUnescapedModel() {
		return new bsopdetailsWrapper(_bsopdetails.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _bsopdetails.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.bsop.model.bsopdetails> toCacheModel() {
		return _bsopdetails.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.bsop.model.bsopdetails bsopdetails) {
		return _bsopdetails.compareTo(bsopdetails);
	}

	@Override
	public int hashCode() {
		return _bsopdetails.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bsopdetails.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new bsopdetailsWrapper((bsopdetails)_bsopdetails.clone());
	}

	/**
	* Returns the bdesc of this bsopdetails.
	*
	* @return the bdesc of this bsopdetails
	*/
	@Override
	public java.lang.String getBdesc() {
		return _bsopdetails.getBdesc();
	}

	/**
	* Returns the btitle of this bsopdetails.
	*
	* @return the btitle of this bsopdetails
	*/
	@Override
	public java.lang.String getBtitle() {
		return _bsopdetails.getBtitle();
	}

	/**
	* Returns the createdby of this bsopdetails.
	*
	* @return the createdby of this bsopdetails
	*/
	@Override
	public java.lang.String getCreatedby() {
		return _bsopdetails.getCreatedby();
	}

	/**
	* Returns the flag of this bsopdetails.
	*
	* @return the flag of this bsopdetails
	*/
	@Override
	public java.lang.String getFlag() {
		return _bsopdetails.getFlag();
	}

	@Override
	public java.lang.String toString() {
		return _bsopdetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _bsopdetails.toXmlString();
	}

	/**
	* Returns the createddate of this bsopdetails.
	*
	* @return the createddate of this bsopdetails
	*/
	@Override
	public Date getCreateddate() {
		return _bsopdetails.getCreateddate();
	}

	/**
	* Returns the modifieddate of this bsopdetails.
	*
	* @return the modifieddate of this bsopdetails
	*/
	@Override
	public Date getModifieddate() {
		return _bsopdetails.getModifieddate();
	}

	/**
	* Returns the content_id of this bsopdetails.
	*
	* @return the content_id of this bsopdetails
	*/
	@Override
	public long getContent_id() {
		return _bsopdetails.getContent_id();
	}

	/**
	* Returns the ID of this bsopdetails.
	*
	* @return the ID of this bsopdetails
	*/
	@Override
	public long getId() {
		return _bsopdetails.getId();
	}

	/**
	* Returns the modifiedby of this bsopdetails.
	*
	* @return the modifiedby of this bsopdetails
	*/
	@Override
	public long getModifiedby() {
		return _bsopdetails.getModifiedby();
	}

	/**
	* Returns the primary key of this bsopdetails.
	*
	* @return the primary key of this bsopdetails
	*/
	@Override
	public long getPrimaryKey() {
		return _bsopdetails.getPrimaryKey();
	}

	@Override
	public void persist() {
		_bsopdetails.persist();
	}

	/**
	* Sets the bdesc of this bsopdetails.
	*
	* @param bdesc the bdesc of this bsopdetails
	*/
	@Override
	public void setBdesc(java.lang.String bdesc) {
		_bsopdetails.setBdesc(bdesc);
	}

	/**
	* Sets the btitle of this bsopdetails.
	*
	* @param btitle the btitle of this bsopdetails
	*/
	@Override
	public void setBtitle(java.lang.String btitle) {
		_bsopdetails.setBtitle(btitle);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_bsopdetails.setCachedModel(cachedModel);
	}

	/**
	* Sets the content_id of this bsopdetails.
	*
	* @param content_id the content_id of this bsopdetails
	*/
	@Override
	public void setContent_id(long content_id) {
		_bsopdetails.setContent_id(content_id);
	}

	/**
	* Sets the createdby of this bsopdetails.
	*
	* @param createdby the createdby of this bsopdetails
	*/
	@Override
	public void setCreatedby(java.lang.String createdby) {
		_bsopdetails.setCreatedby(createdby);
	}

	/**
	* Sets the createddate of this bsopdetails.
	*
	* @param createddate the createddate of this bsopdetails
	*/
	@Override
	public void setCreateddate(Date createddate) {
		_bsopdetails.setCreateddate(createddate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_bsopdetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_bsopdetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_bsopdetails.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the flag of this bsopdetails.
	*
	* @param flag the flag of this bsopdetails
	*/
	@Override
	public void setFlag(java.lang.String flag) {
		_bsopdetails.setFlag(flag);
	}

	/**
	* Sets the ID of this bsopdetails.
	*
	* @param id the ID of this bsopdetails
	*/
	@Override
	public void setId(long id) {
		_bsopdetails.setId(id);
	}

	/**
	* Sets the modifiedby of this bsopdetails.
	*
	* @param modifiedby the modifiedby of this bsopdetails
	*/
	@Override
	public void setModifiedby(long modifiedby) {
		_bsopdetails.setModifiedby(modifiedby);
	}

	/**
	* Sets the modifieddate of this bsopdetails.
	*
	* @param modifieddate the modifieddate of this bsopdetails
	*/
	@Override
	public void setModifieddate(Date modifieddate) {
		_bsopdetails.setModifieddate(modifieddate);
	}

	@Override
	public void setNew(boolean n) {
		_bsopdetails.setNew(n);
	}

	/**
	* Sets the primary key of this bsopdetails.
	*
	* @param primaryKey the primary key of this bsopdetails
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_bsopdetails.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_bsopdetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof bsopdetailsWrapper)) {
			return false;
		}

		bsopdetailsWrapper bsopdetailsWrapper = (bsopdetailsWrapper)obj;

		if (Objects.equals(_bsopdetails, bsopdetailsWrapper._bsopdetails)) {
			return true;
		}

		return false;
	}

	@Override
	public bsopdetails getWrappedModel() {
		return _bsopdetails;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _bsopdetails.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _bsopdetails.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_bsopdetails.resetOriginalValues();
	}

	private final bsopdetails _bsopdetails;
}