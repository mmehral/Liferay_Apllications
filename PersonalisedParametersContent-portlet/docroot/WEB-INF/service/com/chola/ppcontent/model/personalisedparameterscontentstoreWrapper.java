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

package com.chola.ppcontent.model;

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
 * This class is a wrapper for {@link personalisedparameterscontentstore}.
 * </p>
 *
 * @author cloverliferay01
 * @see personalisedparameterscontentstore
 * @generated
 */
@ProviderType
public class personalisedparameterscontentstoreWrapper
	implements personalisedparameterscontentstore,
		ModelWrapper<personalisedparameterscontentstore> {
	public personalisedparameterscontentstoreWrapper(
		personalisedparameterscontentstore personalisedparameterscontentstore) {
		_personalisedparameterscontentstore = personalisedparameterscontentstore;
	}

	@Override
	public Class<?> getModelClass() {
		return personalisedparameterscontentstore.class;
	}

	@Override
	public String getModelClassName() {
		return personalisedparameterscontentstore.class.getName();
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
		return _personalisedparameterscontentstore.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _personalisedparameterscontentstore.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _personalisedparameterscontentstore.isNew();
	}

	@Override
	public com.chola.ppcontent.model.personalisedparameterscontentstore toEscapedModel() {
		return new personalisedparameterscontentstoreWrapper(_personalisedparameterscontentstore.toEscapedModel());
	}

	@Override
	public com.chola.ppcontent.model.personalisedparameterscontentstore toUnescapedModel() {
		return new personalisedparameterscontentstoreWrapper(_personalisedparameterscontentstore.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _personalisedparameterscontentstore.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.ppcontent.model.personalisedparameterscontentstore> toCacheModel() {
		return _personalisedparameterscontentstore.toCacheModel();
	}

	@Override
	public int compareTo(
		com.chola.ppcontent.model.personalisedparameterscontentstore personalisedparameterscontentstore) {
		return _personalisedparameterscontentstore.compareTo(personalisedparameterscontentstore);
	}

	@Override
	public int hashCode() {
		return _personalisedparameterscontentstore.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _personalisedparameterscontentstore.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new personalisedparameterscontentstoreWrapper((personalisedparameterscontentstore)_personalisedparameterscontentstore.clone());
	}

	/**
	* Returns the age_type of this personalisedparameterscontentstore.
	*
	* @return the age_type of this personalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getAge_type() {
		return _personalisedparameterscontentstore.getAge_type();
	}

	/**
	* Returns the age_value of this personalisedparameterscontentstore.
	*
	* @return the age_value of this personalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getAge_value() {
		return _personalisedparameterscontentstore.getAge_value();
	}

	/**
	* Returns the branch of this personalisedparameterscontentstore.
	*
	* @return the branch of this personalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getBranch() {
		return _personalisedparameterscontentstore.getBranch();
	}

	/**
	* Returns the business of this personalisedparameterscontentstore.
	*
	* @return the business of this personalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getBusiness() {
		return _personalisedparameterscontentstore.getBusiness();
	}

	/**
	* Returns the department of this personalisedparameterscontentstore.
	*
	* @return the department of this personalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getDepartment() {
		return _personalisedparameterscontentstore.getDepartment();
	}

	/**
	* Returns the designation of this personalisedparameterscontentstore.
	*
	* @return the designation of this personalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getDesignation() {
		return _personalisedparameterscontentstore.getDesignation();
	}

	/**
	* Returns the function of this personalisedparameterscontentstore.
	*
	* @return the function of this personalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getFunction() {
		return _personalisedparameterscontentstore.getFunction();
	}

	/**
	* Returns the gender of this personalisedparameterscontentstore.
	*
	* @return the gender of this personalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getGender() {
		return _personalisedparameterscontentstore.getGender();
	}

	/**
	* Returns the grade of this personalisedparameterscontentstore.
	*
	* @return the grade of this personalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getGrade() {
		return _personalisedparameterscontentstore.getGrade();
	}

	/**
	* Returns the location of this personalisedparameterscontentstore.
	*
	* @return the location of this personalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getLocation() {
		return _personalisedparameterscontentstore.getLocation();
	}

	/**
	* Returns the product of this personalisedparameterscontentstore.
	*
	* @return the product of this personalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getProduct() {
		return _personalisedparameterscontentstore.getProduct();
	}

	/**
	* Returns the region of this personalisedparameterscontentstore.
	*
	* @return the region of this personalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getRegion() {
		return _personalisedparameterscontentstore.getRegion();
	}

	/**
	* Returns the unit of this personalisedparameterscontentstore.
	*
	* @return the unit of this personalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getUnit() {
		return _personalisedparameterscontentstore.getUnit();
	}

	/**
	* Returns the user_id of this personalisedparameterscontentstore.
	*
	* @return the user_id of this personalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getUser_id() {
		return _personalisedparameterscontentstore.getUser_id();
	}

	/**
	* Returns the zone of this personalisedparameterscontentstore.
	*
	* @return the zone of this personalisedparameterscontentstore
	*/
	@Override
	public java.lang.String getZone() {
		return _personalisedparameterscontentstore.getZone();
	}

	@Override
	public java.lang.String toString() {
		return _personalisedparameterscontentstore.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _personalisedparameterscontentstore.toXmlString();
	}

	/**
	* Returns the content_id of this personalisedparameterscontentstore.
	*
	* @return the content_id of this personalisedparameterscontentstore
	*/
	@Override
	public long getContent_id() {
		return _personalisedparameterscontentstore.getContent_id();
	}

	/**
	* Returns the ID of this personalisedparameterscontentstore.
	*
	* @return the ID of this personalisedparameterscontentstore
	*/
	@Override
	public long getId() {
		return _personalisedparameterscontentstore.getId();
	}

	/**
	* Returns the notification_type of this personalisedparameterscontentstore.
	*
	* @return the notification_type of this personalisedparameterscontentstore
	*/
	@Override
	public long getNotification_type() {
		return _personalisedparameterscontentstore.getNotification_type();
	}

	/**
	* Returns the primary key of this personalisedparameterscontentstore.
	*
	* @return the primary key of this personalisedparameterscontentstore
	*/
	@Override
	public long getPrimaryKey() {
		return _personalisedparameterscontentstore.getPrimaryKey();
	}

	@Override
	public void persist() {
		_personalisedparameterscontentstore.persist();
	}

	/**
	* Sets the age_type of this personalisedparameterscontentstore.
	*
	* @param age_type the age_type of this personalisedparameterscontentstore
	*/
	@Override
	public void setAge_type(java.lang.String age_type) {
		_personalisedparameterscontentstore.setAge_type(age_type);
	}

	/**
	* Sets the age_value of this personalisedparameterscontentstore.
	*
	* @param age_value the age_value of this personalisedparameterscontentstore
	*/
	@Override
	public void setAge_value(java.lang.String age_value) {
		_personalisedparameterscontentstore.setAge_value(age_value);
	}

	/**
	* Sets the branch of this personalisedparameterscontentstore.
	*
	* @param branch the branch of this personalisedparameterscontentstore
	*/
	@Override
	public void setBranch(java.lang.String branch) {
		_personalisedparameterscontentstore.setBranch(branch);
	}

	/**
	* Sets the business of this personalisedparameterscontentstore.
	*
	* @param business the business of this personalisedparameterscontentstore
	*/
	@Override
	public void setBusiness(java.lang.String business) {
		_personalisedparameterscontentstore.setBusiness(business);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_personalisedparameterscontentstore.setCachedModel(cachedModel);
	}

	/**
	* Sets the content_id of this personalisedparameterscontentstore.
	*
	* @param content_id the content_id of this personalisedparameterscontentstore
	*/
	@Override
	public void setContent_id(long content_id) {
		_personalisedparameterscontentstore.setContent_id(content_id);
	}

	/**
	* Sets the department of this personalisedparameterscontentstore.
	*
	* @param department the department of this personalisedparameterscontentstore
	*/
	@Override
	public void setDepartment(java.lang.String department) {
		_personalisedparameterscontentstore.setDepartment(department);
	}

	/**
	* Sets the designation of this personalisedparameterscontentstore.
	*
	* @param designation the designation of this personalisedparameterscontentstore
	*/
	@Override
	public void setDesignation(java.lang.String designation) {
		_personalisedparameterscontentstore.setDesignation(designation);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_personalisedparameterscontentstore.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_personalisedparameterscontentstore.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_personalisedparameterscontentstore.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the function of this personalisedparameterscontentstore.
	*
	* @param function the function of this personalisedparameterscontentstore
	*/
	@Override
	public void setFunction(java.lang.String function) {
		_personalisedparameterscontentstore.setFunction(function);
	}

	/**
	* Sets the gender of this personalisedparameterscontentstore.
	*
	* @param gender the gender of this personalisedparameterscontentstore
	*/
	@Override
	public void setGender(java.lang.String gender) {
		_personalisedparameterscontentstore.setGender(gender);
	}

	/**
	* Sets the grade of this personalisedparameterscontentstore.
	*
	* @param grade the grade of this personalisedparameterscontentstore
	*/
	@Override
	public void setGrade(java.lang.String grade) {
		_personalisedparameterscontentstore.setGrade(grade);
	}

	/**
	* Sets the ID of this personalisedparameterscontentstore.
	*
	* @param id the ID of this personalisedparameterscontentstore
	*/
	@Override
	public void setId(long id) {
		_personalisedparameterscontentstore.setId(id);
	}

	/**
	* Sets the location of this personalisedparameterscontentstore.
	*
	* @param location the location of this personalisedparameterscontentstore
	*/
	@Override
	public void setLocation(java.lang.String location) {
		_personalisedparameterscontentstore.setLocation(location);
	}

	@Override
	public void setNew(boolean n) {
		_personalisedparameterscontentstore.setNew(n);
	}

	/**
	* Sets the notification_type of this personalisedparameterscontentstore.
	*
	* @param notification_type the notification_type of this personalisedparameterscontentstore
	*/
	@Override
	public void setNotification_type(long notification_type) {
		_personalisedparameterscontentstore.setNotification_type(notification_type);
	}

	/**
	* Sets the primary key of this personalisedparameterscontentstore.
	*
	* @param primaryKey the primary key of this personalisedparameterscontentstore
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_personalisedparameterscontentstore.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_personalisedparameterscontentstore.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product of this personalisedparameterscontentstore.
	*
	* @param product the product of this personalisedparameterscontentstore
	*/
	@Override
	public void setProduct(java.lang.String product) {
		_personalisedparameterscontentstore.setProduct(product);
	}

	/**
	* Sets the region of this personalisedparameterscontentstore.
	*
	* @param region the region of this personalisedparameterscontentstore
	*/
	@Override
	public void setRegion(java.lang.String region) {
		_personalisedparameterscontentstore.setRegion(region);
	}

	/**
	* Sets the unit of this personalisedparameterscontentstore.
	*
	* @param unit the unit of this personalisedparameterscontentstore
	*/
	@Override
	public void setUnit(java.lang.String unit) {
		_personalisedparameterscontentstore.setUnit(unit);
	}

	/**
	* Sets the user_id of this personalisedparameterscontentstore.
	*
	* @param user_id the user_id of this personalisedparameterscontentstore
	*/
	@Override
	public void setUser_id(java.lang.String user_id) {
		_personalisedparameterscontentstore.setUser_id(user_id);
	}

	/**
	* Sets the zone of this personalisedparameterscontentstore.
	*
	* @param zone the zone of this personalisedparameterscontentstore
	*/
	@Override
	public void setZone(java.lang.String zone) {
		_personalisedparameterscontentstore.setZone(zone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof personalisedparameterscontentstoreWrapper)) {
			return false;
		}

		personalisedparameterscontentstoreWrapper personalisedparameterscontentstoreWrapper =
			(personalisedparameterscontentstoreWrapper)obj;

		if (Objects.equals(_personalisedparameterscontentstore,
					personalisedparameterscontentstoreWrapper._personalisedparameterscontentstore)) {
			return true;
		}

		return false;
	}

	@Override
	public personalisedparameterscontentstore getWrappedModel() {
		return _personalisedparameterscontentstore;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _personalisedparameterscontentstore.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _personalisedparameterscontentstore.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_personalisedparameterscontentstore.resetOriginalValues();
	}

	private final personalisedparameterscontentstore _personalisedparameterscontentstore;
}