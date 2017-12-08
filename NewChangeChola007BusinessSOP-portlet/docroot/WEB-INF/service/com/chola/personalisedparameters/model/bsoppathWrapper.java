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

package com.chola.personalisedparameters.model;

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
 * This class is a wrapper for {@link bsoppath}.
 * </p>
 *
 * @author cloverliferay01
 * @see bsoppath
 * @generated
 */
@ProviderType
public class bsoppathWrapper implements bsoppath, ModelWrapper<bsoppath> {
	public bsoppathWrapper(bsoppath bsoppath) {
		_bsoppath = bsoppath;
	}

	@Override
	public Class<?> getModelClass() {
		return bsoppath.class;
	}

	@Override
	public String getModelClassName() {
		return bsoppath.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("bdoc", getBdoc());
		attributes.put("bpath", getBpath());
		attributes.put("createddate", getCreateddate());
		attributes.put("createdby", getCreatedby());
		attributes.put("flag", getFlag());
		attributes.put("bdetails_id", getBdetails_id());
		attributes.put("bdetailscontent_id", getBdetailscontent_id());
		attributes.put("filename", getFilename());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String bdoc = (String)attributes.get("bdoc");

		if (bdoc != null) {
			setBdoc(bdoc);
		}

		String bpath = (String)attributes.get("bpath");

		if (bpath != null) {
			setBpath(bpath);
		}

		Date createddate = (Date)attributes.get("createddate");

		if (createddate != null) {
			setCreateddate(createddate);
		}

		String createdby = (String)attributes.get("createdby");

		if (createdby != null) {
			setCreatedby(createdby);
		}

		String flag = (String)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
		}

		Long bdetails_id = (Long)attributes.get("bdetails_id");

		if (bdetails_id != null) {
			setBdetails_id(bdetails_id);
		}

		Long bdetailscontent_id = (Long)attributes.get("bdetailscontent_id");

		if (bdetailscontent_id != null) {
			setBdetailscontent_id(bdetailscontent_id);
		}

		String filename = (String)attributes.get("filename");

		if (filename != null) {
			setFilename(filename);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _bsoppath.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _bsoppath.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _bsoppath.isNew();
	}

	@Override
	public com.chola.personalisedparameters.model.bsoppath toEscapedModel() {
		return new bsoppathWrapper(_bsoppath.toEscapedModel());
	}

	@Override
	public com.chola.personalisedparameters.model.bsoppath toUnescapedModel() {
		return new bsoppathWrapper(_bsoppath.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _bsoppath.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.personalisedparameters.model.bsoppath> toCacheModel() {
		return _bsoppath.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.personalisedparameters.model.bsoppath bsoppath) {
		return _bsoppath.compareTo(bsoppath);
	}

	@Override
	public int hashCode() {
		return _bsoppath.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bsoppath.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new bsoppathWrapper((bsoppath)_bsoppath.clone());
	}

	/**
	* Returns the bdoc of this bsoppath.
	*
	* @return the bdoc of this bsoppath
	*/
	@Override
	public java.lang.String getBdoc() {
		return _bsoppath.getBdoc();
	}

	/**
	* Returns the bpath of this bsoppath.
	*
	* @return the bpath of this bsoppath
	*/
	@Override
	public java.lang.String getBpath() {
		return _bsoppath.getBpath();
	}

	/**
	* Returns the createdby of this bsoppath.
	*
	* @return the createdby of this bsoppath
	*/
	@Override
	public java.lang.String getCreatedby() {
		return _bsoppath.getCreatedby();
	}

	/**
	* Returns the filename of this bsoppath.
	*
	* @return the filename of this bsoppath
	*/
	@Override
	public java.lang.String getFilename() {
		return _bsoppath.getFilename();
	}

	/**
	* Returns the flag of this bsoppath.
	*
	* @return the flag of this bsoppath
	*/
	@Override
	public java.lang.String getFlag() {
		return _bsoppath.getFlag();
	}

	@Override
	public java.lang.String toString() {
		return _bsoppath.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _bsoppath.toXmlString();
	}

	/**
	* Returns the createddate of this bsoppath.
	*
	* @return the createddate of this bsoppath
	*/
	@Override
	public Date getCreateddate() {
		return _bsoppath.getCreateddate();
	}

	/**
	* Returns the bdetails_id of this bsoppath.
	*
	* @return the bdetails_id of this bsoppath
	*/
	@Override
	public long getBdetails_id() {
		return _bsoppath.getBdetails_id();
	}

	/**
	* Returns the bdetailscontent_id of this bsoppath.
	*
	* @return the bdetailscontent_id of this bsoppath
	*/
	@Override
	public long getBdetailscontent_id() {
		return _bsoppath.getBdetailscontent_id();
	}

	/**
	* Returns the ID of this bsoppath.
	*
	* @return the ID of this bsoppath
	*/
	@Override
	public long getId() {
		return _bsoppath.getId();
	}

	/**
	* Returns the primary key of this bsoppath.
	*
	* @return the primary key of this bsoppath
	*/
	@Override
	public long getPrimaryKey() {
		return _bsoppath.getPrimaryKey();
	}

	@Override
	public void persist() {
		_bsoppath.persist();
	}

	/**
	* Sets the bdetails_id of this bsoppath.
	*
	* @param bdetails_id the bdetails_id of this bsoppath
	*/
	@Override
	public void setBdetails_id(long bdetails_id) {
		_bsoppath.setBdetails_id(bdetails_id);
	}

	/**
	* Sets the bdetailscontent_id of this bsoppath.
	*
	* @param bdetailscontent_id the bdetailscontent_id of this bsoppath
	*/
	@Override
	public void setBdetailscontent_id(long bdetailscontent_id) {
		_bsoppath.setBdetailscontent_id(bdetailscontent_id);
	}

	/**
	* Sets the bdoc of this bsoppath.
	*
	* @param bdoc the bdoc of this bsoppath
	*/
	@Override
	public void setBdoc(java.lang.String bdoc) {
		_bsoppath.setBdoc(bdoc);
	}

	/**
	* Sets the bpath of this bsoppath.
	*
	* @param bpath the bpath of this bsoppath
	*/
	@Override
	public void setBpath(java.lang.String bpath) {
		_bsoppath.setBpath(bpath);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_bsoppath.setCachedModel(cachedModel);
	}

	/**
	* Sets the createdby of this bsoppath.
	*
	* @param createdby the createdby of this bsoppath
	*/
	@Override
	public void setCreatedby(java.lang.String createdby) {
		_bsoppath.setCreatedby(createdby);
	}

	/**
	* Sets the createddate of this bsoppath.
	*
	* @param createddate the createddate of this bsoppath
	*/
	@Override
	public void setCreateddate(Date createddate) {
		_bsoppath.setCreateddate(createddate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_bsoppath.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_bsoppath.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_bsoppath.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the filename of this bsoppath.
	*
	* @param filename the filename of this bsoppath
	*/
	@Override
	public void setFilename(java.lang.String filename) {
		_bsoppath.setFilename(filename);
	}

	/**
	* Sets the flag of this bsoppath.
	*
	* @param flag the flag of this bsoppath
	*/
	@Override
	public void setFlag(java.lang.String flag) {
		_bsoppath.setFlag(flag);
	}

	/**
	* Sets the ID of this bsoppath.
	*
	* @param id the ID of this bsoppath
	*/
	@Override
	public void setId(long id) {
		_bsoppath.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_bsoppath.setNew(n);
	}

	/**
	* Sets the primary key of this bsoppath.
	*
	* @param primaryKey the primary key of this bsoppath
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_bsoppath.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_bsoppath.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof bsoppathWrapper)) {
			return false;
		}

		bsoppathWrapper bsoppathWrapper = (bsoppathWrapper)obj;

		if (Objects.equals(_bsoppath, bsoppathWrapper._bsoppath)) {
			return true;
		}

		return false;
	}

	@Override
	public bsoppath getWrappedModel() {
		return _bsoppath;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _bsoppath.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _bsoppath.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_bsoppath.resetOriginalValues();
	}

	private final bsoppath _bsoppath;
}