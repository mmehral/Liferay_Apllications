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

import com.chola.trainingcalendar.service.ClpSerializer;
import com.chola.trainingcalendar.service.trainingpersonalisedparameterscontentstoreLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @generated
 */
@ProviderType
public class trainingpersonalisedparameterscontentstoreClp extends BaseModelImpl<trainingpersonalisedparameterscontentstore>
	implements trainingpersonalisedparameterscontentstore {
	public trainingpersonalisedparameterscontentstoreClp() {
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
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_trainingpersonalisedparameterscontentstoreRemoteModel != null) {
			try {
				Class<?> clazz = _trainingpersonalisedparameterscontentstoreRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_trainingpersonalisedparameterscontentstoreRemoteModel,
					id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getContent_id() {
		return _content_id;
	}

	@Override
	public void setContent_id(long content_id) {
		_content_id = content_id;

		if (_trainingpersonalisedparameterscontentstoreRemoteModel != null) {
			try {
				Class<?> clazz = _trainingpersonalisedparameterscontentstoreRemoteModel.getClass();

				Method method = clazz.getMethod("setContent_id", long.class);

				method.invoke(_trainingpersonalisedparameterscontentstoreRemoteModel,
					content_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBusiness() {
		return _business;
	}

	@Override
	public void setBusiness(String business) {
		_business = business;

		if (_trainingpersonalisedparameterscontentstoreRemoteModel != null) {
			try {
				Class<?> clazz = _trainingpersonalisedparameterscontentstoreRemoteModel.getClass();

				Method method = clazz.getMethod("setBusiness", String.class);

				method.invoke(_trainingpersonalisedparameterscontentstoreRemoteModel,
					business);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnit() {
		return _unit;
	}

	@Override
	public void setUnit(String unit) {
		_unit = unit;

		if (_trainingpersonalisedparameterscontentstoreRemoteModel != null) {
			try {
				Class<?> clazz = _trainingpersonalisedparameterscontentstoreRemoteModel.getClass();

				Method method = clazz.getMethod("setUnit", String.class);

				method.invoke(_trainingpersonalisedparameterscontentstoreRemoteModel,
					unit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFunction() {
		return _function;
	}

	@Override
	public void setFunction(String function) {
		_function = function;

		if (_trainingpersonalisedparameterscontentstoreRemoteModel != null) {
			try {
				Class<?> clazz = _trainingpersonalisedparameterscontentstoreRemoteModel.getClass();

				Method method = clazz.getMethod("setFunction", String.class);

				method.invoke(_trainingpersonalisedparameterscontentstoreRemoteModel,
					function);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDepartment() {
		return _department;
	}

	@Override
	public void setDepartment(String department) {
		_department = department;

		if (_trainingpersonalisedparameterscontentstoreRemoteModel != null) {
			try {
				Class<?> clazz = _trainingpersonalisedparameterscontentstoreRemoteModel.getClass();

				Method method = clazz.getMethod("setDepartment", String.class);

				method.invoke(_trainingpersonalisedparameterscontentstoreRemoteModel,
					department);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDesignation() {
		return _designation;
	}

	@Override
	public void setDesignation(String designation) {
		_designation = designation;

		if (_trainingpersonalisedparameterscontentstoreRemoteModel != null) {
			try {
				Class<?> clazz = _trainingpersonalisedparameterscontentstoreRemoteModel.getClass();

				Method method = clazz.getMethod("setDesignation", String.class);

				method.invoke(_trainingpersonalisedparameterscontentstoreRemoteModel,
					designation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getProduct() {
		return _product;
	}

	@Override
	public void setProduct(String product) {
		_product = product;

		if (_trainingpersonalisedparameterscontentstoreRemoteModel != null) {
			try {
				Class<?> clazz = _trainingpersonalisedparameterscontentstoreRemoteModel.getClass();

				Method method = clazz.getMethod("setProduct", String.class);

				method.invoke(_trainingpersonalisedparameterscontentstoreRemoteModel,
					product);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getZone() {
		return _zone;
	}

	@Override
	public void setZone(String zone) {
		_zone = zone;

		if (_trainingpersonalisedparameterscontentstoreRemoteModel != null) {
			try {
				Class<?> clazz = _trainingpersonalisedparameterscontentstoreRemoteModel.getClass();

				Method method = clazz.getMethod("setZone", String.class);

				method.invoke(_trainingpersonalisedparameterscontentstoreRemoteModel,
					zone);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBranch() {
		return _branch;
	}

	@Override
	public void setBranch(String branch) {
		_branch = branch;

		if (_trainingpersonalisedparameterscontentstoreRemoteModel != null) {
			try {
				Class<?> clazz = _trainingpersonalisedparameterscontentstoreRemoteModel.getClass();

				Method method = clazz.getMethod("setBranch", String.class);

				method.invoke(_trainingpersonalisedparameterscontentstoreRemoteModel,
					branch);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGrade() {
		return _grade;
	}

	@Override
	public void setGrade(String grade) {
		_grade = grade;

		if (_trainingpersonalisedparameterscontentstoreRemoteModel != null) {
			try {
				Class<?> clazz = _trainingpersonalisedparameterscontentstoreRemoteModel.getClass();

				Method method = clazz.getMethod("setGrade", String.class);

				method.invoke(_trainingpersonalisedparameterscontentstoreRemoteModel,
					grade);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRegion() {
		return _region;
	}

	@Override
	public void setRegion(String region) {
		_region = region;

		if (_trainingpersonalisedparameterscontentstoreRemoteModel != null) {
			try {
				Class<?> clazz = _trainingpersonalisedparameterscontentstoreRemoteModel.getClass();

				Method method = clazz.getMethod("setRegion", String.class);

				method.invoke(_trainingpersonalisedparameterscontentstoreRemoteModel,
					region);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLocation() {
		return _location;
	}

	@Override
	public void setLocation(String location) {
		_location = location;

		if (_trainingpersonalisedparameterscontentstoreRemoteModel != null) {
			try {
				Class<?> clazz = _trainingpersonalisedparameterscontentstoreRemoteModel.getClass();

				Method method = clazz.getMethod("setLocation", String.class);

				method.invoke(_trainingpersonalisedparameterscontentstoreRemoteModel,
					location);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUser_id() {
		return _user_id;
	}

	@Override
	public void setUser_id(String user_id) {
		_user_id = user_id;

		if (_trainingpersonalisedparameterscontentstoreRemoteModel != null) {
			try {
				Class<?> clazz = _trainingpersonalisedparameterscontentstoreRemoteModel.getClass();

				Method method = clazz.getMethod("setUser_id", String.class);

				method.invoke(_trainingpersonalisedparameterscontentstoreRemoteModel,
					user_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGender() {
		return _gender;
	}

	@Override
	public void setGender(String gender) {
		_gender = gender;

		if (_trainingpersonalisedparameterscontentstoreRemoteModel != null) {
			try {
				Class<?> clazz = _trainingpersonalisedparameterscontentstoreRemoteModel.getClass();

				Method method = clazz.getMethod("setGender", String.class);

				method.invoke(_trainingpersonalisedparameterscontentstoreRemoteModel,
					gender);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAge_type() {
		return _age_type;
	}

	@Override
	public void setAge_type(String age_type) {
		_age_type = age_type;

		if (_trainingpersonalisedparameterscontentstoreRemoteModel != null) {
			try {
				Class<?> clazz = _trainingpersonalisedparameterscontentstoreRemoteModel.getClass();

				Method method = clazz.getMethod("setAge_type", String.class);

				method.invoke(_trainingpersonalisedparameterscontentstoreRemoteModel,
					age_type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAge_value() {
		return _age_value;
	}

	@Override
	public void setAge_value(String age_value) {
		_age_value = age_value;

		if (_trainingpersonalisedparameterscontentstoreRemoteModel != null) {
			try {
				Class<?> clazz = _trainingpersonalisedparameterscontentstoreRemoteModel.getClass();

				Method method = clazz.getMethod("setAge_value", String.class);

				method.invoke(_trainingpersonalisedparameterscontentstoreRemoteModel,
					age_value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNotification_type() {
		return _notification_type;
	}

	@Override
	public void setNotification_type(long notification_type) {
		_notification_type = notification_type;

		if (_trainingpersonalisedparameterscontentstoreRemoteModel != null) {
			try {
				Class<?> clazz = _trainingpersonalisedparameterscontentstoreRemoteModel.getClass();

				Method method = clazz.getMethod("setNotification_type",
						long.class);

				method.invoke(_trainingpersonalisedparameterscontentstoreRemoteModel,
					notification_type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> gettrainingpersonalisedparameterscontentstoreRemoteModel() {
		return _trainingpersonalisedparameterscontentstoreRemoteModel;
	}

	public void settrainingpersonalisedparameterscontentstoreRemoteModel(
		BaseModel<?> trainingpersonalisedparameterscontentstoreRemoteModel) {
		_trainingpersonalisedparameterscontentstoreRemoteModel = trainingpersonalisedparameterscontentstoreRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _trainingpersonalisedparameterscontentstoreRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_trainingpersonalisedparameterscontentstoreRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			trainingpersonalisedparameterscontentstoreLocalServiceUtil.addtrainingpersonalisedparameterscontentstore(this);
		}
		else {
			trainingpersonalisedparameterscontentstoreLocalServiceUtil.updatetrainingpersonalisedparameterscontentstore(this);
		}
	}

	@Override
	public trainingpersonalisedparameterscontentstore toEscapedModel() {
		return (trainingpersonalisedparameterscontentstore)ProxyUtil.newProxyInstance(trainingpersonalisedparameterscontentstore.class.getClassLoader(),
			new Class[] { trainingpersonalisedparameterscontentstore.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		trainingpersonalisedparameterscontentstoreClp clone = new trainingpersonalisedparameterscontentstoreClp();

		clone.setId(getId());
		clone.setContent_id(getContent_id());
		clone.setBusiness(getBusiness());
		clone.setUnit(getUnit());
		clone.setFunction(getFunction());
		clone.setDepartment(getDepartment());
		clone.setDesignation(getDesignation());
		clone.setProduct(getProduct());
		clone.setZone(getZone());
		clone.setBranch(getBranch());
		clone.setGrade(getGrade());
		clone.setRegion(getRegion());
		clone.setLocation(getLocation());
		clone.setUser_id(getUser_id());
		clone.setGender(getGender());
		clone.setAge_type(getAge_type());
		clone.setAge_value(getAge_value());
		clone.setNotification_type(getNotification_type());

		return clone;
	}

	@Override
	public int compareTo(
		trainingpersonalisedparameterscontentstore trainingpersonalisedparameterscontentstore) {
		long primaryKey = trainingpersonalisedparameterscontentstore.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof trainingpersonalisedparameterscontentstoreClp)) {
			return false;
		}

		trainingpersonalisedparameterscontentstoreClp trainingpersonalisedparameterscontentstore =
			(trainingpersonalisedparameterscontentstoreClp)obj;

		long primaryKey = trainingpersonalisedparameterscontentstore.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", content_id=");
		sb.append(getContent_id());
		sb.append(", business=");
		sb.append(getBusiness());
		sb.append(", unit=");
		sb.append(getUnit());
		sb.append(", function=");
		sb.append(getFunction());
		sb.append(", department=");
		sb.append(getDepartment());
		sb.append(", designation=");
		sb.append(getDesignation());
		sb.append(", product=");
		sb.append(getProduct());
		sb.append(", zone=");
		sb.append(getZone());
		sb.append(", branch=");
		sb.append(getBranch());
		sb.append(", grade=");
		sb.append(getGrade());
		sb.append(", region=");
		sb.append(getRegion());
		sb.append(", location=");
		sb.append(getLocation());
		sb.append(", user_id=");
		sb.append(getUser_id());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append(", age_type=");
		sb.append(getAge_type());
		sb.append(", age_value=");
		sb.append(getAge_value());
		sb.append(", notification_type=");
		sb.append(getNotification_type());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append(
			"com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content_id</column-name><column-value><![CDATA[");
		sb.append(getContent_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>business</column-name><column-value><![CDATA[");
		sb.append(getBusiness());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>unit</column-name><column-value><![CDATA[");
		sb.append(getUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>function</column-name><column-value><![CDATA[");
		sb.append(getFunction());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>department</column-name><column-value><![CDATA[");
		sb.append(getDepartment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>designation</column-name><column-value><![CDATA[");
		sb.append(getDesignation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>product</column-name><column-value><![CDATA[");
		sb.append(getProduct());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>zone</column-name><column-value><![CDATA[");
		sb.append(getZone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>branch</column-name><column-value><![CDATA[");
		sb.append(getBranch());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>grade</column-name><column-value><![CDATA[");
		sb.append(getGrade());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>region</column-name><column-value><![CDATA[");
		sb.append(getRegion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>location</column-name><column-value><![CDATA[");
		sb.append(getLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>user_id</column-name><column-value><![CDATA[");
		sb.append(getUser_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>age_type</column-name><column-value><![CDATA[");
		sb.append(getAge_type());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>age_value</column-name><column-value><![CDATA[");
		sb.append(getAge_value());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>notification_type</column-name><column-value><![CDATA[");
		sb.append(getNotification_type());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _content_id;
	private String _business;
	private String _unit;
	private String _function;
	private String _department;
	private String _designation;
	private String _product;
	private String _zone;
	private String _branch;
	private String _grade;
	private String _region;
	private String _location;
	private String _user_id;
	private String _gender;
	private String _age_type;
	private String _age_value;
	private long _notification_type;
	private BaseModel<?> _trainingpersonalisedparameterscontentstoreRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}