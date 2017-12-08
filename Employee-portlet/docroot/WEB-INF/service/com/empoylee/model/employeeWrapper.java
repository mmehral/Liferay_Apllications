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

package com.empoylee.model;

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
 * This class is a wrapper for {@link employee}.
 * </p>
 *
 * @author CloverLiferay01
 * @see employee
 * @generated
 */
@ProviderType
public class employeeWrapper implements employee, ModelWrapper<employee> {
	public employeeWrapper(employee employee) {
		_employee = employee;
	}

	@Override
	public Class<?> getModelClass() {
		return employee.class;
	}

	@Override
	public String getModelClassName() {
		return employee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("empId", getEmpId());
		attributes.put("name", getName());
		attributes.put("email", getEmail());
		attributes.put("desigation", getDesigation());
		attributes.put("mobileNO", getMobileNO());
		attributes.put("salary", getSalary());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long empId = (Long)attributes.get("empId");

		if (empId != null) {
			setEmpId(empId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String desigation = (String)attributes.get("desigation");

		if (desigation != null) {
			setDesigation(desigation);
		}

		Integer mobileNO = (Integer)attributes.get("mobileNO");

		if (mobileNO != null) {
			setMobileNO(mobileNO);
		}

		Float salary = (Float)attributes.get("salary");

		if (salary != null) {
			setSalary(salary);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _employee.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _employee.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _employee.isNew();
	}

	@Override
	public com.empoylee.model.employee toEscapedModel() {
		return new employeeWrapper(_employee.toEscapedModel());
	}

	@Override
	public com.empoylee.model.employee toUnescapedModel() {
		return new employeeWrapper(_employee.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _employee.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.empoylee.model.employee> toCacheModel() {
		return _employee.toCacheModel();
	}

	/**
	* Returns the salary of this employee.
	*
	* @return the salary of this employee
	*/
	@Override
	public float getSalary() {
		return _employee.getSalary();
	}

	@Override
	public int compareTo(com.empoylee.model.employee employee) {
		return _employee.compareTo(employee);
	}

	/**
	* Returns the mobile n o of this employee.
	*
	* @return the mobile n o of this employee
	*/
	@Override
	public int getMobileNO() {
		return _employee.getMobileNO();
	}

	@Override
	public int hashCode() {
		return _employee.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employee.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new employeeWrapper((employee)_employee.clone());
	}

	/**
	* Returns the desigation of this employee.
	*
	* @return the desigation of this employee
	*/
	@Override
	public java.lang.String getDesigation() {
		return _employee.getDesigation();
	}

	/**
	* Returns the email of this employee.
	*
	* @return the email of this employee
	*/
	@Override
	public java.lang.String getEmail() {
		return _employee.getEmail();
	}

	/**
	* Returns the name of this employee.
	*
	* @return the name of this employee
	*/
	@Override
	public java.lang.String getName() {
		return _employee.getName();
	}

	@Override
	public java.lang.String toString() {
		return _employee.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employee.toXmlString();
	}

	/**
	* Returns the emp ID of this employee.
	*
	* @return the emp ID of this employee
	*/
	@Override
	public long getEmpId() {
		return _employee.getEmpId();
	}

	/**
	* Returns the primary key of this employee.
	*
	* @return the primary key of this employee
	*/
	@Override
	public long getPrimaryKey() {
		return _employee.getPrimaryKey();
	}

	@Override
	public void persist() {
		_employee.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employee.setCachedModel(cachedModel);
	}

	/**
	* Sets the desigation of this employee.
	*
	* @param desigation the desigation of this employee
	*/
	@Override
	public void setDesigation(java.lang.String desigation) {
		_employee.setDesigation(desigation);
	}

	/**
	* Sets the email of this employee.
	*
	* @param email the email of this employee
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_employee.setEmail(email);
	}

	/**
	* Sets the emp ID of this employee.
	*
	* @param empId the emp ID of this employee
	*/
	@Override
	public void setEmpId(long empId) {
		_employee.setEmpId(empId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_employee.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_employee.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_employee.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the mobile n o of this employee.
	*
	* @param mobileNO the mobile n o of this employee
	*/
	@Override
	public void setMobileNO(int mobileNO) {
		_employee.setMobileNO(mobileNO);
	}

	/**
	* Sets the name of this employee.
	*
	* @param name the name of this employee
	*/
	@Override
	public void setName(java.lang.String name) {
		_employee.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_employee.setNew(n);
	}

	/**
	* Sets the primary key of this employee.
	*
	* @param primaryKey the primary key of this employee
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employee.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_employee.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the salary of this employee.
	*
	* @param salary the salary of this employee
	*/
	@Override
	public void setSalary(float salary) {
		_employee.setSalary(salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof employeeWrapper)) {
			return false;
		}

		employeeWrapper employeeWrapper = (employeeWrapper)obj;

		if (Objects.equals(_employee, employeeWrapper._employee)) {
			return true;
		}

		return false;
	}

	@Override
	public employee getWrappedModel() {
		return _employee;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _employee.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _employee.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_employee.resetOriginalValues();
	}

	private final employee _employee;
}