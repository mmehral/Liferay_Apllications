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

package com.chola.halloffame.model;

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
 * This class is a wrapper for {@link users}.
 * </p>
 *
 * @author CloverLiferay02
 * @see users
 * @generated
 */
@ProviderType
public class usersWrapper implements users, ModelWrapper<users> {
	public usersWrapper(users users) {
		_users = users;
	}

	@Override
	public Class<?> getModelClass() {
		return users.class;
	}

	@Override
	public String getModelClassName() {
		return users.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("empId", getEmpId());
		attributes.put("empName", getEmpName());
		attributes.put("writeUp", getWriteUp());
		attributes.put("awardedDate", getAwardedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		String empId = (String)attributes.get("empId");

		if (empId != null) {
			setEmpId(empId);
		}

		String empName = (String)attributes.get("empName");

		if (empName != null) {
			setEmpName(empName);
		}

		String writeUp = (String)attributes.get("writeUp");

		if (writeUp != null) {
			setWriteUp(writeUp);
		}

		Date awardedDate = (Date)attributes.get("awardedDate");

		if (awardedDate != null) {
			setAwardedDate(awardedDate);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _users.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _users.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _users.isNew();
	}

	@Override
	public com.chola.halloffame.model.users toEscapedModel() {
		return new usersWrapper(_users.toEscapedModel());
	}

	@Override
	public com.chola.halloffame.model.users toUnescapedModel() {
		return new usersWrapper(_users.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _users.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.halloffame.model.users> toCacheModel() {
		return _users.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.halloffame.model.users users) {
		return _users.compareTo(users);
	}

	@Override
	public int hashCode() {
		return _users.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _users.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new usersWrapper((users)_users.clone());
	}

	/**
	* Returns the emp ID of this users.
	*
	* @return the emp ID of this users
	*/
	@Override
	public java.lang.String getEmpId() {
		return _users.getEmpId();
	}

	/**
	* Returns the emp name of this users.
	*
	* @return the emp name of this users
	*/
	@Override
	public java.lang.String getEmpName() {
		return _users.getEmpName();
	}

	/**
	* Returns the write up of this users.
	*
	* @return the write up of this users
	*/
	@Override
	public java.lang.String getWriteUp() {
		return _users.getWriteUp();
	}

	@Override
	public java.lang.String toString() {
		return _users.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _users.toXmlString();
	}

	/**
	* Returns the awarded date of this users.
	*
	* @return the awarded date of this users
	*/
	@Override
	public Date getAwardedDate() {
		return _users.getAwardedDate();
	}

	/**
	* Returns the ID of this users.
	*
	* @return the ID of this users
	*/
	@Override
	public long getId() {
		return _users.getId();
	}

	/**
	* Returns the primary key of this users.
	*
	* @return the primary key of this users
	*/
	@Override
	public long getPrimaryKey() {
		return _users.getPrimaryKey();
	}

	@Override
	public void persist() {
		_users.persist();
	}

	/**
	* Sets the awarded date of this users.
	*
	* @param awardedDate the awarded date of this users
	*/
	@Override
	public void setAwardedDate(Date awardedDate) {
		_users.setAwardedDate(awardedDate);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_users.setCachedModel(cachedModel);
	}

	/**
	* Sets the emp ID of this users.
	*
	* @param empId the emp ID of this users
	*/
	@Override
	public void setEmpId(java.lang.String empId) {
		_users.setEmpId(empId);
	}

	/**
	* Sets the emp name of this users.
	*
	* @param empName the emp name of this users
	*/
	@Override
	public void setEmpName(java.lang.String empName) {
		_users.setEmpName(empName);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_users.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_users.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_users.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this users.
	*
	* @param Id the ID of this users
	*/
	@Override
	public void setId(long Id) {
		_users.setId(Id);
	}

	@Override
	public void setNew(boolean n) {
		_users.setNew(n);
	}

	/**
	* Sets the primary key of this users.
	*
	* @param primaryKey the primary key of this users
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_users.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_users.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the write up of this users.
	*
	* @param writeUp the write up of this users
	*/
	@Override
	public void setWriteUp(java.lang.String writeUp) {
		_users.setWriteUp(writeUp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof usersWrapper)) {
			return false;
		}

		usersWrapper usersWrapper = (usersWrapper)obj;

		if (Objects.equals(_users, usersWrapper._users)) {
			return true;
		}

		return false;
	}

	@Override
	public users getWrappedModel() {
		return _users;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _users.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _users.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_users.resetOriginalValues();
	}

	private final users _users;
}