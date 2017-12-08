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

package com.chola.calendar.model;

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
 * This class is a wrapper for {@link EmpInfoEntity}.
 * </p>
 *
 * @author adms.java1
 * @see EmpInfoEntity
 * @generated
 */
@ProviderType
public class EmpInfoEntityWrapper implements EmpInfoEntity,
	ModelWrapper<EmpInfoEntity> {
	public EmpInfoEntityWrapper(EmpInfoEntity empInfoEntity) {
		_empInfoEntity = empInfoEntity;
	}

	@Override
	public Class<?> getModelClass() {
		return EmpInfoEntity.class;
	}

	@Override
	public String getModelClassName() {
		return EmpInfoEntity.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("empId", getEmpId());
		attributes.put("name", getName());
		attributes.put("emailid", getEmailid());
		attributes.put("birthday", getBirthday());
		attributes.put("grade", getGrade());
		attributes.put("functionName", getFunctionName());
		attributes.put("department", getDepartment());
		attributes.put("subdepartment", getSubdepartment());
		attributes.put("location", getLocation());
		attributes.put("gender", getGender());
		attributes.put("unit", getUnit());
		attributes.put("userid", getUserid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String empId = (String)attributes.get("empId");

		if (empId != null) {
			setEmpId(empId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String emailid = (String)attributes.get("emailid");

		if (emailid != null) {
			setEmailid(emailid);
		}

		Date birthday = (Date)attributes.get("birthday");

		if (birthday != null) {
			setBirthday(birthday);
		}

		String grade = (String)attributes.get("grade");

		if (grade != null) {
			setGrade(grade);
		}

		String functionName = (String)attributes.get("functionName");

		if (functionName != null) {
			setFunctionName(functionName);
		}

		String department = (String)attributes.get("department");

		if (department != null) {
			setDepartment(department);
		}

		String subdepartment = (String)attributes.get("subdepartment");

		if (subdepartment != null) {
			setSubdepartment(subdepartment);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String unit = (String)attributes.get("unit");

		if (unit != null) {
			setUnit(unit);
		}

		String userid = (String)attributes.get("userid");

		if (userid != null) {
			setUserid(userid);
		}
	}

	@Override
	public EmpInfoEntity toEscapedModel() {
		return new EmpInfoEntityWrapper(_empInfoEntity.toEscapedModel());
	}

	@Override
	public EmpInfoEntity toUnescapedModel() {
		return new EmpInfoEntityWrapper(_empInfoEntity.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _empInfoEntity.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _empInfoEntity.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _empInfoEntity.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _empInfoEntity.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<EmpInfoEntity> toCacheModel() {
		return _empInfoEntity.toCacheModel();
	}

	@Override
	public int compareTo(EmpInfoEntity empInfoEntity) {
		return _empInfoEntity.compareTo(empInfoEntity);
	}

	@Override
	public int hashCode() {
		return _empInfoEntity.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _empInfoEntity.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new EmpInfoEntityWrapper((EmpInfoEntity)_empInfoEntity.clone());
	}

	/**
	* Returns the department of this emp info entity.
	*
	* @return the department of this emp info entity
	*/
	@Override
	public java.lang.String getDepartment() {
		return _empInfoEntity.getDepartment();
	}

	/**
	* Returns the emailid of this emp info entity.
	*
	* @return the emailid of this emp info entity
	*/
	@Override
	public java.lang.String getEmailid() {
		return _empInfoEntity.getEmailid();
	}

	/**
	* Returns the emp ID of this emp info entity.
	*
	* @return the emp ID of this emp info entity
	*/
	@Override
	public java.lang.String getEmpId() {
		return _empInfoEntity.getEmpId();
	}

	/**
	* Returns the function name of this emp info entity.
	*
	* @return the function name of this emp info entity
	*/
	@Override
	public java.lang.String getFunctionName() {
		return _empInfoEntity.getFunctionName();
	}

	/**
	* Returns the gender of this emp info entity.
	*
	* @return the gender of this emp info entity
	*/
	@Override
	public java.lang.String getGender() {
		return _empInfoEntity.getGender();
	}

	/**
	* Returns the grade of this emp info entity.
	*
	* @return the grade of this emp info entity
	*/
	@Override
	public java.lang.String getGrade() {
		return _empInfoEntity.getGrade();
	}

	/**
	* Returns the location of this emp info entity.
	*
	* @return the location of this emp info entity
	*/
	@Override
	public java.lang.String getLocation() {
		return _empInfoEntity.getLocation();
	}

	/**
	* Returns the name of this emp info entity.
	*
	* @return the name of this emp info entity
	*/
	@Override
	public java.lang.String getName() {
		return _empInfoEntity.getName();
	}

	/**
	* Returns the subdepartment of this emp info entity.
	*
	* @return the subdepartment of this emp info entity
	*/
	@Override
	public java.lang.String getSubdepartment() {
		return _empInfoEntity.getSubdepartment();
	}

	/**
	* Returns the unit of this emp info entity.
	*
	* @return the unit of this emp info entity
	*/
	@Override
	public java.lang.String getUnit() {
		return _empInfoEntity.getUnit();
	}

	/**
	* Returns the userid of this emp info entity.
	*
	* @return the userid of this emp info entity
	*/
	@Override
	public java.lang.String getUserid() {
		return _empInfoEntity.getUserid();
	}

	@Override
	public java.lang.String toString() {
		return _empInfoEntity.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _empInfoEntity.toXmlString();
	}

	/**
	* Returns the birthday of this emp info entity.
	*
	* @return the birthday of this emp info entity
	*/
	@Override
	public Date getBirthday() {
		return _empInfoEntity.getBirthday();
	}

	/**
	* Returns the ID of this emp info entity.
	*
	* @return the ID of this emp info entity
	*/
	@Override
	public long getId() {
		return _empInfoEntity.getId();
	}

	/**
	* Returns the primary key of this emp info entity.
	*
	* @return the primary key of this emp info entity
	*/
	@Override
	public long getPrimaryKey() {
		return _empInfoEntity.getPrimaryKey();
	}

	@Override
	public void persist() {
		_empInfoEntity.persist();
	}

	/**
	* Sets the birthday of this emp info entity.
	*
	* @param birthday the birthday of this emp info entity
	*/
	@Override
	public void setBirthday(Date birthday) {
		_empInfoEntity.setBirthday(birthday);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_empInfoEntity.setCachedModel(cachedModel);
	}

	/**
	* Sets the department of this emp info entity.
	*
	* @param department the department of this emp info entity
	*/
	@Override
	public void setDepartment(java.lang.String department) {
		_empInfoEntity.setDepartment(department);
	}

	/**
	* Sets the emailid of this emp info entity.
	*
	* @param emailid the emailid of this emp info entity
	*/
	@Override
	public void setEmailid(java.lang.String emailid) {
		_empInfoEntity.setEmailid(emailid);
	}

	/**
	* Sets the emp ID of this emp info entity.
	*
	* @param empId the emp ID of this emp info entity
	*/
	@Override
	public void setEmpId(java.lang.String empId) {
		_empInfoEntity.setEmpId(empId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_empInfoEntity.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_empInfoEntity.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_empInfoEntity.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the function name of this emp info entity.
	*
	* @param functionName the function name of this emp info entity
	*/
	@Override
	public void setFunctionName(java.lang.String functionName) {
		_empInfoEntity.setFunctionName(functionName);
	}

	/**
	* Sets the gender of this emp info entity.
	*
	* @param gender the gender of this emp info entity
	*/
	@Override
	public void setGender(java.lang.String gender) {
		_empInfoEntity.setGender(gender);
	}

	/**
	* Sets the grade of this emp info entity.
	*
	* @param grade the grade of this emp info entity
	*/
	@Override
	public void setGrade(java.lang.String grade) {
		_empInfoEntity.setGrade(grade);
	}

	/**
	* Sets the ID of this emp info entity.
	*
	* @param id the ID of this emp info entity
	*/
	@Override
	public void setId(long id) {
		_empInfoEntity.setId(id);
	}

	/**
	* Sets the location of this emp info entity.
	*
	* @param location the location of this emp info entity
	*/
	@Override
	public void setLocation(java.lang.String location) {
		_empInfoEntity.setLocation(location);
	}

	/**
	* Sets the name of this emp info entity.
	*
	* @param name the name of this emp info entity
	*/
	@Override
	public void setName(java.lang.String name) {
		_empInfoEntity.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_empInfoEntity.setNew(n);
	}

	/**
	* Sets the primary key of this emp info entity.
	*
	* @param primaryKey the primary key of this emp info entity
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_empInfoEntity.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_empInfoEntity.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the subdepartment of this emp info entity.
	*
	* @param subdepartment the subdepartment of this emp info entity
	*/
	@Override
	public void setSubdepartment(java.lang.String subdepartment) {
		_empInfoEntity.setSubdepartment(subdepartment);
	}

	/**
	* Sets the unit of this emp info entity.
	*
	* @param unit the unit of this emp info entity
	*/
	@Override
	public void setUnit(java.lang.String unit) {
		_empInfoEntity.setUnit(unit);
	}

	/**
	* Sets the userid of this emp info entity.
	*
	* @param userid the userid of this emp info entity
	*/
	@Override
	public void setUserid(java.lang.String userid) {
		_empInfoEntity.setUserid(userid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmpInfoEntityWrapper)) {
			return false;
		}

		EmpInfoEntityWrapper empInfoEntityWrapper = (EmpInfoEntityWrapper)obj;

		if (Objects.equals(_empInfoEntity, empInfoEntityWrapper._empInfoEntity)) {
			return true;
		}

		return false;
	}

	@Override
	public EmpInfoEntity getWrappedModel() {
		return _empInfoEntity;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _empInfoEntity.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _empInfoEntity.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_empInfoEntity.resetOriginalValues();
	}

	private final EmpInfoEntity _empInfoEntity;
}