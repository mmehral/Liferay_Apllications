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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link trainingpersonalisedparameterscontentstore}.
 * </p>
 *
 * @author CloverLiferay01
 * @see trainingpersonalisedparameterscontentstore
 * @generated
 */
@ProviderType
public class trainingpersonalisedparameterscontentstoreWrapper
	implements trainingpersonalisedparameterscontentstore,
		ModelWrapper<trainingpersonalisedparameterscontentstore> {
	public trainingpersonalisedparameterscontentstoreWrapper(
		trainingpersonalisedparameterscontentstore trainingpersonalisedparameterscontentstore) {
		_trainingpersonalisedparameterscontentstore = trainingpersonalisedparameterscontentstore;
	}

	@Override
	public Class<?> getModelClass() {
		return trainingpersonalisedparameterscontentstore.class;
	}

	@Override
	public String getModelClassName() {
		return trainingpersonalisedparameterscontentstore.class.getName();
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
		return _trainingpersonalisedparameterscontentstore.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _trainingpersonalisedparameterscontentstore.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _trainingpersonalisedparameterscontentstore.isNew();
	}

	@Override
	public com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore toEscapedModel() {
		return new trainingpersonalisedparameterscontentstoreWrapper(_trainingpersonalisedparameterscontentstore.toEscapedModel());
	}

	@Override
	public com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore toUnescapedModel() {
		return new trainingpersonalisedparameterscontentstoreWrapper(_trainingpersonalisedparameterscontentstore.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _trainingpersonalisedparameterscontentstore.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore> toCacheModel() {
		return _trainingpersonalisedparameterscontentstore.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore trainingpersonalisedparameterscontentstore) {
		return _trainingpersonalisedparameterscontentstore.compareTo(trainingpersonalisedparameterscontentstore);
	}

	@Override
	public int hashCode() {
		return _trainingpersonalisedparameterscontentstore.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _trainingpersonalisedparameterscontentstore.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new trainingpersonalisedparameterscontentstoreWrapper((trainingpersonalisedparameterscontentstore)_trainingpersonalisedparameterscontentstore.clone());
	}

	/**
	* Returns the age_type of this trainingpersonalisedparameterscontentstore.
	*
	* @return the age_type of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getAge_type() {
		return _trainingpersonalisedparameterscontentstore.getAge_type();
	}

	/**
	* Returns the age_value of this trainingpersonalisedparameterscontentstore.
	*
	* @return the age_value of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getAge_value() {
		return _trainingpersonalisedparameterscontentstore.getAge_value();
	}

	/**
	* Returns the branch of this trainingpersonalisedparameterscontentstore.
	*
	* @return the branch of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getBranch() {
		return _trainingpersonalisedparameterscontentstore.getBranch();
	}

	/**
	* Returns the business of this trainingpersonalisedparameterscontentstore.
	*
	* @return the business of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getBusiness() {
		return _trainingpersonalisedparameterscontentstore.getBusiness();
	}

	/**
	* Returns the department of this trainingpersonalisedparameterscontentstore.
	*
	* @return the department of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getDepartment() {
		return _trainingpersonalisedparameterscontentstore.getDepartment();
	}

	/**
	* Returns the designation of this trainingpersonalisedparameterscontentstore.
	*
	* @return the designation of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getDesignation() {
		return _trainingpersonalisedparameterscontentstore.getDesignation();
	}

	/**
	* Returns the function of this trainingpersonalisedparameterscontentstore.
	*
	* @return the function of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getFunction() {
		return _trainingpersonalisedparameterscontentstore.getFunction();
	}

	/**
	* Returns the gender of this trainingpersonalisedparameterscontentstore.
	*
	* @return the gender of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getGender() {
		return _trainingpersonalisedparameterscontentstore.getGender();
	}

	/**
	* Returns the grade of this trainingpersonalisedparameterscontentstore.
	*
	* @return the grade of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getGrade() {
		return _trainingpersonalisedparameterscontentstore.getGrade();
	}

	/**
	* Returns the location of this trainingpersonalisedparameterscontentstore.
	*
	* @return the location of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getLocation() {
		return _trainingpersonalisedparameterscontentstore.getLocation();
	}

	/**
	* Returns the product of this trainingpersonalisedparameterscontentstore.
	*
	* @return the product of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getProduct() {
		return _trainingpersonalisedparameterscontentstore.getProduct();
	}

	/**
	* Returns the region of this trainingpersonalisedparameterscontentstore.
	*
	* @return the region of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getRegion() {
		return _trainingpersonalisedparameterscontentstore.getRegion();
	}

	/**
	* Returns the unit of this trainingpersonalisedparameterscontentstore.
	*
	* @return the unit of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getUnit() {
		return _trainingpersonalisedparameterscontentstore.getUnit();
	}

	/**
	* Returns the user_id of this trainingpersonalisedparameterscontentstore.
	*
	* @return the user_id of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getUser_id() {
		return _trainingpersonalisedparameterscontentstore.getUser_id();
	}

	/**
	* Returns the zone of this trainingpersonalisedparameterscontentstore.
	*
	* @return the zone of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getZone() {
		return _trainingpersonalisedparameterscontentstore.getZone();
	}

	@Override
	public java.lang.String toString() {
		return _trainingpersonalisedparameterscontentstore.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _trainingpersonalisedparameterscontentstore.toXmlString();
	}

	/**
	* Returns the content_id of this trainingpersonalisedparameterscontentstore.
	*
	* @return the content_id of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public long getContent_id() {
		return _trainingpersonalisedparameterscontentstore.getContent_id();
	}

	/**
	* Returns the ID of this trainingpersonalisedparameterscontentstore.
	*
	* @return the ID of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public long getId() {
		return _trainingpersonalisedparameterscontentstore.getId();
	}

	/**
	* Returns the notification_type of this trainingpersonalisedparameterscontentstore.
	*
	* @return the notification_type of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public long getNotification_type() {
		return _trainingpersonalisedparameterscontentstore.getNotification_type();
	}

	/**
	* Returns the primary key of this trainingpersonalisedparameterscontentstore.
	*
	* @return the primary key of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public long getPrimaryKey() {
		return _trainingpersonalisedparameterscontentstore.getPrimaryKey();
	}

	@Override
	public void persist() {
		_trainingpersonalisedparameterscontentstore.persist();
	}

	/**
	* Sets the age_type of this trainingpersonalisedparameterscontentstore.
	*
	* @param age_type the age_type of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public void setAge_type(java.lang.String age_type) {
		_trainingpersonalisedparameterscontentstore.setAge_type(age_type);
	}

	/**
	* Sets the age_value of this trainingpersonalisedparameterscontentstore.
	*
	* @param age_value the age_value of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public void setAge_value(java.lang.String age_value) {
		_trainingpersonalisedparameterscontentstore.setAge_value(age_value);
	}

	/**
	* Sets the branch of this trainingpersonalisedparameterscontentstore.
	*
	* @param branch the branch of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public void setBranch(java.lang.String branch) {
		_trainingpersonalisedparameterscontentstore.setBranch(branch);
	}

	/**
	* Sets the business of this trainingpersonalisedparameterscontentstore.
	*
	* @param business the business of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public void setBusiness(java.lang.String business) {
		_trainingpersonalisedparameterscontentstore.setBusiness(business);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_trainingpersonalisedparameterscontentstore.setCachedModel(cachedModel);
	}

	/**
	* Sets the content_id of this trainingpersonalisedparameterscontentstore.
	*
	* @param content_id the content_id of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public void setContent_id(long content_id) {
		_trainingpersonalisedparameterscontentstore.setContent_id(content_id);
	}

	/**
	* Sets the department of this trainingpersonalisedparameterscontentstore.
	*
	* @param department the department of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public void setDepartment(java.lang.String department) {
		_trainingpersonalisedparameterscontentstore.setDepartment(department);
	}

	/**
	* Sets the designation of this trainingpersonalisedparameterscontentstore.
	*
	* @param designation the designation of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public void setDesignation(java.lang.String designation) {
		_trainingpersonalisedparameterscontentstore.setDesignation(designation);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_trainingpersonalisedparameterscontentstore.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_trainingpersonalisedparameterscontentstore.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_trainingpersonalisedparameterscontentstore.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the function of this trainingpersonalisedparameterscontentstore.
	*
	* @param function the function of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public void setFunction(java.lang.String function) {
		_trainingpersonalisedparameterscontentstore.setFunction(function);
	}

	/**
	* Sets the gender of this trainingpersonalisedparameterscontentstore.
	*
	* @param gender the gender of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public void setGender(java.lang.String gender) {
		_trainingpersonalisedparameterscontentstore.setGender(gender);
	}

	/**
	* Sets the grade of this trainingpersonalisedparameterscontentstore.
	*
	* @param grade the grade of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public void setGrade(java.lang.String grade) {
		_trainingpersonalisedparameterscontentstore.setGrade(grade);
	}

	/**
	* Sets the ID of this trainingpersonalisedparameterscontentstore.
	*
	* @param id the ID of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public void setId(long id) {
		_trainingpersonalisedparameterscontentstore.setId(id);
	}

	/**
	* Sets the location of this trainingpersonalisedparameterscontentstore.
	*
	* @param location the location of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public void setLocation(java.lang.String location) {
		_trainingpersonalisedparameterscontentstore.setLocation(location);
	}

	@Override
	public void setNew(boolean n) {
		_trainingpersonalisedparameterscontentstore.setNew(n);
	}

	/**
	* Sets the notification_type of this trainingpersonalisedparameterscontentstore.
	*
	* @param notification_type the notification_type of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public void setNotification_type(long notification_type) {
		_trainingpersonalisedparameterscontentstore.setNotification_type(notification_type);
	}

	/**
	* Sets the primary key of this trainingpersonalisedparameterscontentstore.
	*
	* @param primaryKey the primary key of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_trainingpersonalisedparameterscontentstore.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_trainingpersonalisedparameterscontentstore.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product of this trainingpersonalisedparameterscontentstore.
	*
	* @param product the product of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public void setProduct(java.lang.String product) {
		_trainingpersonalisedparameterscontentstore.setProduct(product);
	}

	/**
	* Sets the region of this trainingpersonalisedparameterscontentstore.
	*
	* @param region the region of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public void setRegion(java.lang.String region) {
		_trainingpersonalisedparameterscontentstore.setRegion(region);
	}

	/**
	* Sets the unit of this trainingpersonalisedparameterscontentstore.
	*
	* @param unit the unit of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public void setUnit(java.lang.String unit) {
		_trainingpersonalisedparameterscontentstore.setUnit(unit);
	}

	/**
	* Sets the user_id of this trainingpersonalisedparameterscontentstore.
	*
	* @param user_id the user_id of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public void setUser_id(java.lang.String user_id) {
		_trainingpersonalisedparameterscontentstore.setUser_id(user_id);
	}

	/**
	* Sets the zone of this trainingpersonalisedparameterscontentstore.
	*
	* @param zone the zone of this trainingpersonalisedparameterscontentstore
	*/
	@Override
	public void setZone(java.lang.String zone) {
		_trainingpersonalisedparameterscontentstore.setZone(zone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof trainingpersonalisedparameterscontentstoreWrapper)) {
			return false;
		}

		trainingpersonalisedparameterscontentstoreWrapper trainingpersonalisedparameterscontentstoreWrapper =
			(trainingpersonalisedparameterscontentstoreWrapper)obj;

		if (Objects.equals(_trainingpersonalisedparameterscontentstore,
					trainingpersonalisedparameterscontentstoreWrapper._trainingpersonalisedparameterscontentstore)) {
			return true;
		}

		return false;
	}

	@Override
	public trainingpersonalisedparameterscontentstore getWrappedModel() {
		return _trainingpersonalisedparameterscontentstore;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _trainingpersonalisedparameterscontentstore.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _trainingpersonalisedparameterscontentstore.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_trainingpersonalisedparameterscontentstore.resetOriginalValues();
	}

	private final trainingpersonalisedparameterscontentstore _trainingpersonalisedparameterscontentstore;
}