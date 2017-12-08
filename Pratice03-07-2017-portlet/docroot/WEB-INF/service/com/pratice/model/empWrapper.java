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

package com.pratice.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link emp}.
 * </p>
 *
 * @author CloverLiferay02
 * @see emp
 * @generated
 */
@ProviderType
public class empWrapper implements emp, ModelWrapper<emp> {
	public empWrapper(emp emp) {
		_emp = emp;
	}

	@Override
	public Class<?> getModelClass() {
		return emp.class;
	}

	@Override
	public String getModelClassName() {
		return emp.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("empId", getEmpId());
		attributes.put("empName", getEmpName());
		attributes.put("dept", getDept());
		attributes.put("salary", getSalary());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long empId = (Long)attributes.get("empId");

		if (empId != null) {
			setEmpId(empId);
		}

		String empName = (String)attributes.get("empName");

		if (empName != null) {
			setEmpName(empName);
		}

		String dept = (String)attributes.get("dept");

		if (dept != null) {
			setDept(dept);
		}

		String salary = (String)attributes.get("salary");

		if (salary != null) {
			setSalary(salary);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _emp.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _emp.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _emp.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _emp.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.pratice.model.emp> toCacheModel() {
		return _emp.toCacheModel();
	}

	@Override
	public com.pratice.model.emp toEscapedModel() {
		return new empWrapper(_emp.toEscapedModel());
	}

	@Override
	public com.pratice.model.emp toUnescapedModel() {
		return new empWrapper(_emp.toUnescapedModel());
	}

	@Override
	public int compareTo(com.pratice.model.emp emp) {
		return _emp.compareTo(emp);
	}

	@Override
	public int hashCode() {
		return _emp.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _emp.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new empWrapper((emp)_emp.clone());
	}

	/**
	* Returns the dept of this emp.
	*
	* @return the dept of this emp
	*/
	@Override
	public java.lang.String getDept() {
		return _emp.getDept();
	}

	/**
	* Returns the emp name of this emp.
	*
	* @return the emp name of this emp
	*/
	@Override
	public java.lang.String getEmpName() {
		return _emp.getEmpName();
	}

	/**
	* Returns the salary of this emp.
	*
	* @return the salary of this emp
	*/
	@Override
	public java.lang.String getSalary() {
		return _emp.getSalary();
	}

	@Override
	public java.lang.String toString() {
		return _emp.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _emp.toXmlString();
	}

	/**
	* Returns the emp ID of this emp.
	*
	* @return the emp ID of this emp
	*/
	@Override
	public long getEmpId() {
		return _emp.getEmpId();
	}

	/**
	* Returns the primary key of this emp.
	*
	* @return the primary key of this emp
	*/
	@Override
	public long getPrimaryKey() {
		return _emp.getPrimaryKey();
	}

	@Override
	public void persist() {
		_emp.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_emp.setCachedModel(cachedModel);
	}

	/**
	* Sets the dept of this emp.
	*
	* @param dept the dept of this emp
	*/
	@Override
	public void setDept(java.lang.String dept) {
		_emp.setDept(dept);
	}

	/**
	* Sets the emp ID of this emp.
	*
	* @param empId the emp ID of this emp
	*/
	@Override
	public void setEmpId(long empId) {
		_emp.setEmpId(empId);
	}

	/**
	* Sets the emp name of this emp.
	*
	* @param empName the emp name of this emp
	*/
	@Override
	public void setEmpName(java.lang.String empName) {
		_emp.setEmpName(empName);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_emp.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_emp.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_emp.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_emp.setNew(n);
	}

	/**
	* Sets the primary key of this emp.
	*
	* @param primaryKey the primary key of this emp
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_emp.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_emp.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the salary of this emp.
	*
	* @param salary the salary of this emp
	*/
	@Override
	public void setSalary(java.lang.String salary) {
		_emp.setSalary(salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof empWrapper)) {
			return false;
		}

		empWrapper empWrapper = (empWrapper)obj;

		if (Objects.equals(_emp, empWrapper._emp)) {
			return true;
		}

		return false;
	}

	@Override
	public emp getWrappedModel() {
		return _emp;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _emp.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _emp.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_emp.resetOriginalValues();
	}

	private final emp _emp;
}