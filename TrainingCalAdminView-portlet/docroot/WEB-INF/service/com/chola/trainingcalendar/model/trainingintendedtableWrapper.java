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

package com.chola.trainingcalendar.model;

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
 * This class is a wrapper for {@link trainingintendedtable}.
 * </p>
 *
 * @author CloverLiferay01
 * @see trainingintendedtable
 * @generated
 */
@ProviderType
public class trainingintendedtableWrapper implements trainingintendedtable,
	ModelWrapper<trainingintendedtable> {
	public trainingintendedtableWrapper(
		trainingintendedtable trainingintendedtable) {
		_trainingintendedtable = trainingintendedtable;
	}

	@Override
	public Class<?> getModelClass() {
		return trainingintendedtable.class;
	}

	@Override
	public String getModelClassName() {
		return trainingintendedtable.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("trainingid", getTrainingid());
		attributes.put("userid", getUserid());
		attributes.put("screenname", getScreenname());
		attributes.put("createddate", getCreateddate());
		attributes.put("flag", getFlag());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long trainingid = (Long)attributes.get("trainingid");

		if (trainingid != null) {
			setTrainingid(trainingid);
		}

		String userid = (String)attributes.get("userid");

		if (userid != null) {
			setUserid(userid);
		}

		String screenname = (String)attributes.get("screenname");

		if (screenname != null) {
			setScreenname(screenname);
		}

		Date createddate = (Date)attributes.get("createddate");

		if (createddate != null) {
			setCreateddate(createddate);
		}

		Integer flag = (Integer)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _trainingintendedtable.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _trainingintendedtable.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _trainingintendedtable.isNew();
	}

	@Override
	public com.chola.trainingcalendar.model.trainingintendedtable toEscapedModel() {
		return new trainingintendedtableWrapper(_trainingintendedtable.toEscapedModel());
	}

	@Override
	public com.chola.trainingcalendar.model.trainingintendedtable toUnescapedModel() {
		return new trainingintendedtableWrapper(_trainingintendedtable.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _trainingintendedtable.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.trainingcalendar.model.trainingintendedtable> toCacheModel() {
		return _trainingintendedtable.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.trainingcalendar.model.trainingintendedtable trainingintendedtable) {
		return _trainingintendedtable.compareTo(trainingintendedtable);
	}

	/**
	* Returns the flag of this trainingintendedtable.
	*
	* @return the flag of this trainingintendedtable
	*/
	@Override
	public int getFlag() {
		return _trainingintendedtable.getFlag();
	}

	@Override
	public int hashCode() {
		return _trainingintendedtable.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _trainingintendedtable.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new trainingintendedtableWrapper((trainingintendedtable)_trainingintendedtable.clone());
	}

	/**
	* Returns the screenname of this trainingintendedtable.
	*
	* @return the screenname of this trainingintendedtable
	*/
	@Override
	public java.lang.String getScreenname() {
		return _trainingintendedtable.getScreenname();
	}

	/**
	* Returns the userid of this trainingintendedtable.
	*
	* @return the userid of this trainingintendedtable
	*/
	@Override
	public java.lang.String getUserid() {
		return _trainingintendedtable.getUserid();
	}

	@Override
	public java.lang.String toString() {
		return _trainingintendedtable.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _trainingintendedtable.toXmlString();
	}

	/**
	* Returns the createddate of this trainingintendedtable.
	*
	* @return the createddate of this trainingintendedtable
	*/
	@Override
	public Date getCreateddate() {
		return _trainingintendedtable.getCreateddate();
	}

	/**
	* Returns the ID of this trainingintendedtable.
	*
	* @return the ID of this trainingintendedtable
	*/
	@Override
	public long getId() {
		return _trainingintendedtable.getId();
	}

	/**
	* Returns the primary key of this trainingintendedtable.
	*
	* @return the primary key of this trainingintendedtable
	*/
	@Override
	public long getPrimaryKey() {
		return _trainingintendedtable.getPrimaryKey();
	}

	/**
	* Returns the trainingid of this trainingintendedtable.
	*
	* @return the trainingid of this trainingintendedtable
	*/
	@Override
	public long getTrainingid() {
		return _trainingintendedtable.getTrainingid();
	}

	@Override
	public void persist() {
		_trainingintendedtable.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_trainingintendedtable.setCachedModel(cachedModel);
	}

	/**
	* Sets the createddate of this trainingintendedtable.
	*
	* @param createddate the createddate of this trainingintendedtable
	*/
	@Override
	public void setCreateddate(Date createddate) {
		_trainingintendedtable.setCreateddate(createddate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_trainingintendedtable.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_trainingintendedtable.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_trainingintendedtable.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the flag of this trainingintendedtable.
	*
	* @param flag the flag of this trainingintendedtable
	*/
	@Override
	public void setFlag(int flag) {
		_trainingintendedtable.setFlag(flag);
	}

	/**
	* Sets the ID of this trainingintendedtable.
	*
	* @param id the ID of this trainingintendedtable
	*/
	@Override
	public void setId(long id) {
		_trainingintendedtable.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_trainingintendedtable.setNew(n);
	}

	/**
	* Sets the primary key of this trainingintendedtable.
	*
	* @param primaryKey the primary key of this trainingintendedtable
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_trainingintendedtable.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_trainingintendedtable.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the screenname of this trainingintendedtable.
	*
	* @param screenname the screenname of this trainingintendedtable
	*/
	@Override
	public void setScreenname(java.lang.String screenname) {
		_trainingintendedtable.setScreenname(screenname);
	}

	/**
	* Sets the trainingid of this trainingintendedtable.
	*
	* @param trainingid the trainingid of this trainingintendedtable
	*/
	@Override
	public void setTrainingid(long trainingid) {
		_trainingintendedtable.setTrainingid(trainingid);
	}

	/**
	* Sets the userid of this trainingintendedtable.
	*
	* @param userid the userid of this trainingintendedtable
	*/
	@Override
	public void setUserid(java.lang.String userid) {
		_trainingintendedtable.setUserid(userid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof trainingintendedtableWrapper)) {
			return false;
		}

		trainingintendedtableWrapper trainingintendedtableWrapper = (trainingintendedtableWrapper)obj;

		if (Objects.equals(_trainingintendedtable,
					trainingintendedtableWrapper._trainingintendedtable)) {
			return true;
		}

		return false;
	}

	@Override
	public trainingintendedtable getWrappedModel() {
		return _trainingintendedtable;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _trainingintendedtable.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _trainingintendedtable.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_trainingintendedtable.resetOriginalValues();
	}

	private final trainingintendedtable _trainingintendedtable;
}