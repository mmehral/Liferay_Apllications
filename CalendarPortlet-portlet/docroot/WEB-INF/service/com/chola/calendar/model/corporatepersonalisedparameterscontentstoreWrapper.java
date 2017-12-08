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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link corporatepersonalisedparameterscontentstore}.
 * </p>
 *
 * @author adms.java1
 * @see corporatepersonalisedparameterscontentstore
 * @generated
 */
@ProviderType
public class corporatepersonalisedparameterscontentstoreWrapper
	implements corporatepersonalisedparameterscontentstore,
		ModelWrapper<corporatepersonalisedparameterscontentstore> {
	public corporatepersonalisedparameterscontentstoreWrapper(
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore) {
		_corporatepersonalisedparameterscontentstore = corporatepersonalisedparameterscontentstore;
	}

	@Override
	public Class<?> getModelClass() {
		return corporatepersonalisedparameterscontentstore.class;
	}

	@Override
	public String getModelClassName() {
		return corporatepersonalisedparameterscontentstore.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("content_id", getContent_id());
		attributes.put("business", getBusiness());
		attributes.put("unit", getUnit());
		attributes.put("function", getFunction());
		attributes.put("department", getDepartment());
		attributes.put("designation", getDesignation());
		attributes.put("product", getProduct());
		attributes.put("zone", getZone());
		attributes.put("branch", getBranch());
		attributes.put("grade", getGrade());
		attributes.put("region", getRegion());
		attributes.put("location", getLocation());
		attributes.put("user_id", getUser_id());
		attributes.put("gender", getGender());
		attributes.put("age_type", getAge_type());
		attributes.put("age_value", getAge_value());
		attributes.put("notification_type", getNotification_type());

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

		String business = (String)attributes.get("business");

		if (business != null) {
			setBusiness(business);
		}

		String unit = (String)attributes.get("unit");

		if (unit != null) {
			setUnit(unit);
		}

		String function = (String)attributes.get("function");

		if (function != null) {
			setFunction(function);
		}

		String department = (String)attributes.get("department");

		if (department != null) {
			setDepartment(department);
		}

		String designation = (String)attributes.get("designation");

		if (designation != null) {
			setDesignation(designation);
		}

		String product = (String)attributes.get("product");

		if (product != null) {
			setProduct(product);
		}

		String zone = (String)attributes.get("zone");

		if (zone != null) {
			setZone(zone);
		}

		String branch = (String)attributes.get("branch");

		if (branch != null) {
			setBranch(branch);
		}

		String grade = (String)attributes.get("grade");

		if (grade != null) {
			setGrade(grade);
		}

		String region = (String)attributes.get("region");

		if (region != null) {
			setRegion(region);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String user_id = (String)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String age_type = (String)attributes.get("age_type");

		if (age_type != null) {
			setAge_type(age_type);
		}

		String age_value = (String)attributes.get("age_value");

		if (age_value != null) {
			setAge_value(age_value);
		}

		Long notification_type = (Long)attributes.get("notification_type");

		if (notification_type != null) {
			setNotification_type(notification_type);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _corporatepersonalisedparameterscontentstore.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _corporatepersonalisedparameterscontentstore.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _corporatepersonalisedparameterscontentstore.isNew();
	}

	@Override
	public com.chola.calendar.model.corporatepersonalisedparameterscontentstore toEscapedModel() {
		return new corporatepersonalisedparameterscontentstoreWrapper(_corporatepersonalisedparameterscontentstore.toEscapedModel());
	}

	@Override
	public com.chola.calendar.model.corporatepersonalisedparameterscontentstore toUnescapedModel() {
		return new corporatepersonalisedparameterscontentstoreWrapper(_corporatepersonalisedparameterscontentstore.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _corporatepersonalisedparameterscontentstore.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.calendar.model.corporatepersonalisedparameterscontentstore> toCacheModel() {
		return _corporatepersonalisedparameterscontentstore.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.calendar.model.corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore) {
		return _corporatepersonalisedparameterscontentstore.compareTo(corporatepersonalisedparameterscontentstore);
	}

	@Override
	public int hashCode() {
		return _corporatepersonalisedparameterscontentstore.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _corporatepersonalisedparameterscontentstore.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new corporatepersonalisedparameterscontentstoreWrapper((corporatepersonalisedparameterscontentstore)_corporatepersonalisedparameterscontentstore.clone());
	}

	/**
	* Returns the age_type of this corporatepersonalisedparameterscontentstore.
	*
	* @return the age_type of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getAge_type() {
		return _corporatepersonalisedparameterscontentstore.getAge_type();
	}

	/**
	* Returns the age_value of this corporatepersonalisedparameterscontentstore.
	*
	* @return the age_value of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getAge_value() {
		return _corporatepersonalisedparameterscontentstore.getAge_value();
	}

	/**
	* Returns the branch of this corporatepersonalisedparameterscontentstore.
	*
	* @return the branch of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getBranch() {
		return _corporatepersonalisedparameterscontentstore.getBranch();
	}

	/**
	* Returns the business of this corporatepersonalisedparameterscontentstore.
	*
	* @return the business of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getBusiness() {
		return _corporatepersonalisedparameterscontentstore.getBusiness();
	}

	/**
	* Returns the department of this corporatepersonalisedparameterscontentstore.
	*
	* @return the department of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getDepartment() {
		return _corporatepersonalisedparameterscontentstore.getDepartment();
	}

	/**
	* Returns the designation of this corporatepersonalisedparameterscontentstore.
	*
	* @return the designation of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getDesignation() {
		return _corporatepersonalisedparameterscontentstore.getDesignation();
	}

	/**
	* Returns the function of this corporatepersonalisedparameterscontentstore.
	*
	* @return the function of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getFunction() {
		return _corporatepersonalisedparameterscontentstore.getFunction();
	}

	/**
	* Returns the gender of this corporatepersonalisedparameterscontentstore.
	*
	* @return the gender of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getGender() {
		return _corporatepersonalisedparameterscontentstore.getGender();
	}

	/**
	* Returns the grade of this corporatepersonalisedparameterscontentstore.
	*
	* @return the grade of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getGrade() {
		return _corporatepersonalisedparameterscontentstore.getGrade();
	}

	/**
	* Returns the location of this corporatepersonalisedparameterscontentstore.
	*
	* @return the location of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getLocation() {
		return _corporatepersonalisedparameterscontentstore.getLocation();
	}

	/**
	* Returns the product of this corporatepersonalisedparameterscontentstore.
	*
	* @return the product of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getProduct() {
		return _corporatepersonalisedparameterscontentstore.getProduct();
	}

	/**
	* Returns the region of this corporatepersonalisedparameterscontentstore.
	*
	* @return the region of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getRegion() {
		return _corporatepersonalisedparameterscontentstore.getRegion();
	}

	/**
	* Returns the unit of this corporatepersonalisedparameterscontentstore.
	*
	* @return the unit of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getUnit() {
		return _corporatepersonalisedparameterscontentstore.getUnit();
	}

	/**
	* Returns the user_id of this corporatepersonalisedparameterscontentstore.
	*
	* @return the user_id of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getUser_id() {
		return _corporatepersonalisedparameterscontentstore.getUser_id();
	}

	/**
	* Returns the zone of this corporatepersonalisedparameterscontentstore.
	*
	* @return the zone of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getZone() {
		return _corporatepersonalisedparameterscontentstore.getZone();
	}

	@Override
	public java.lang.String toString() {
		return _corporatepersonalisedparameterscontentstore.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _corporatepersonalisedparameterscontentstore.toXmlString();
	}

	/**
	* Returns the content_id of this corporatepersonalisedparameterscontentstore.
	*
	* @return the content_id of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public long getContent_id() {
		return _corporatepersonalisedparameterscontentstore.getContent_id();
	}

	/**
	* Returns the ID of this corporatepersonalisedparameterscontentstore.
	*
	* @return the ID of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public long getId() {
		return _corporatepersonalisedparameterscontentstore.getId();
	}

	/**
	* Returns the notification_type of this corporatepersonalisedparameterscontentstore.
	*
	* @return the notification_type of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public long getNotification_type() {
		return _corporatepersonalisedparameterscontentstore.getNotification_type();
	}

	/**
	* Returns the primary key of this corporatepersonalisedparameterscontentstore.
	*
	* @return the primary key of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public long getPrimaryKey() {
		return _corporatepersonalisedparameterscontentstore.getPrimaryKey();
	}

	@Override
	public void persist() {
		_corporatepersonalisedparameterscontentstore.persist();
	}

	/**
	* Sets the age_type of this corporatepersonalisedparameterscontentstore.
	*
	* @param age_type the age_type of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public void setAge_type(java.lang.String age_type) {
		_corporatepersonalisedparameterscontentstore.setAge_type(age_type);
	}

	/**
	* Sets the age_value of this corporatepersonalisedparameterscontentstore.
	*
	* @param age_value the age_value of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public void setAge_value(java.lang.String age_value) {
		_corporatepersonalisedparameterscontentstore.setAge_value(age_value);
	}

	/**
	* Sets the branch of this corporatepersonalisedparameterscontentstore.
	*
	* @param branch the branch of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public void setBranch(java.lang.String branch) {
		_corporatepersonalisedparameterscontentstore.setBranch(branch);
	}

	/**
	* Sets the business of this corporatepersonalisedparameterscontentstore.
	*
	* @param business the business of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public void setBusiness(java.lang.String business) {
		_corporatepersonalisedparameterscontentstore.setBusiness(business);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_corporatepersonalisedparameterscontentstore.setCachedModel(cachedModel);
	}

	/**
	* Sets the content_id of this corporatepersonalisedparameterscontentstore.
	*
	* @param content_id the content_id of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public void setContent_id(long content_id) {
		_corporatepersonalisedparameterscontentstore.setContent_id(content_id);
	}

	/**
	* Sets the department of this corporatepersonalisedparameterscontentstore.
	*
	* @param department the department of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public void setDepartment(java.lang.String department) {
		_corporatepersonalisedparameterscontentstore.setDepartment(department);
	}

	/**
	* Sets the designation of this corporatepersonalisedparameterscontentstore.
	*
	* @param designation the designation of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public void setDesignation(java.lang.String designation) {
		_corporatepersonalisedparameterscontentstore.setDesignation(designation);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_corporatepersonalisedparameterscontentstore.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_corporatepersonalisedparameterscontentstore.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_corporatepersonalisedparameterscontentstore.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the function of this corporatepersonalisedparameterscontentstore.
	*
	* @param function the function of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public void setFunction(java.lang.String function) {
		_corporatepersonalisedparameterscontentstore.setFunction(function);
	}

	/**
	* Sets the gender of this corporatepersonalisedparameterscontentstore.
	*
	* @param gender the gender of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public void setGender(java.lang.String gender) {
		_corporatepersonalisedparameterscontentstore.setGender(gender);
	}

	/**
	* Sets the grade of this corporatepersonalisedparameterscontentstore.
	*
	* @param grade the grade of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public void setGrade(java.lang.String grade) {
		_corporatepersonalisedparameterscontentstore.setGrade(grade);
	}

	/**
	* Sets the ID of this corporatepersonalisedparameterscontentstore.
	*
	* @param id the ID of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public void setId(long id) {
		_corporatepersonalisedparameterscontentstore.setId(id);
	}

	/**
	* Sets the location of this corporatepersonalisedparameterscontentstore.
	*
	* @param location the location of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public void setLocation(java.lang.String location) {
		_corporatepersonalisedparameterscontentstore.setLocation(location);
	}

	@Override
	public void setNew(boolean n) {
		_corporatepersonalisedparameterscontentstore.setNew(n);
	}

	/**
	* Sets the notification_type of this corporatepersonalisedparameterscontentstore.
	*
	* @param notification_type the notification_type of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public void setNotification_type(long notification_type) {
		_corporatepersonalisedparameterscontentstore.setNotification_type(notification_type);
	}

	/**
	* Sets the primary key of this corporatepersonalisedparameterscontentstore.
	*
	* @param primaryKey the primary key of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_corporatepersonalisedparameterscontentstore.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_corporatepersonalisedparameterscontentstore.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product of this corporatepersonalisedparameterscontentstore.
	*
	* @param product the product of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public void setProduct(java.lang.String product) {
		_corporatepersonalisedparameterscontentstore.setProduct(product);
	}

	/**
	* Sets the region of this corporatepersonalisedparameterscontentstore.
	*
	* @param region the region of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public void setRegion(java.lang.String region) {
		_corporatepersonalisedparameterscontentstore.setRegion(region);
	}

	/**
	* Sets the unit of this corporatepersonalisedparameterscontentstore.
	*
	* @param unit the unit of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public void setUnit(java.lang.String unit) {
		_corporatepersonalisedparameterscontentstore.setUnit(unit);
	}

	/**
	* Sets the user_id of this corporatepersonalisedparameterscontentstore.
	*
	* @param user_id the user_id of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public void setUser_id(java.lang.String user_id) {
		_corporatepersonalisedparameterscontentstore.setUser_id(user_id);
	}

	/**
	* Sets the zone of this corporatepersonalisedparameterscontentstore.
	*
	* @param zone the zone of this corporatepersonalisedparameterscontentstore
	*/
	@Override
	public void setZone(java.lang.String zone) {
		_corporatepersonalisedparameterscontentstore.setZone(zone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof corporatepersonalisedparameterscontentstoreWrapper)) {
			return false;
		}

		corporatepersonalisedparameterscontentstoreWrapper corporatepersonalisedparameterscontentstoreWrapper =
			(corporatepersonalisedparameterscontentstoreWrapper)obj;

		if (Objects.equals(_corporatepersonalisedparameterscontentstore,
					corporatepersonalisedparameterscontentstoreWrapper._corporatepersonalisedparameterscontentstore)) {
			return true;
		}

		return false;
	}

	@Override
	public corporatepersonalisedparameterscontentstore getWrappedModel() {
		return _corporatepersonalisedparameterscontentstore;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _corporatepersonalisedparameterscontentstore.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _corporatepersonalisedparameterscontentstore.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_corporatepersonalisedparameterscontentstore.resetOriginalValues();
	}

	private final corporatepersonalisedparameterscontentstore _corporatepersonalisedparameterscontentstore;
}