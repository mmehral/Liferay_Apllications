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

package com.chola.business.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.business.service.ClpSerializer;
import com.chola.business.service.businesssoppathLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @generated
 */
@ProviderType
public class businesssoppathClp extends BaseModelImpl<businesssoppath>
	implements businesssoppath {
	public businesssoppathClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return businesssoppath.class;
	}

	@Override
	public String getModelClassName() {
		return businesssoppath.class.getName();
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
		attributes.put("businessdoc", getBusinessdoc());
		attributes.put("businessPath", getBusinessPath());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("flag", getFlag());
		attributes.put("businessdetails_id", getBusinessdetails_id());

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

		String businessdoc = (String)attributes.get("businessdoc");

		if (businessdoc != null) {
			setBusinessdoc(businessdoc);
		}

		String businessPath = (String)attributes.get("businessPath");

		if (businessPath != null) {
			setBusinessPath(businessPath);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String createdBy = (String)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		String flag = (String)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
		}

		Long businessdetails_id = (Long)attributes.get("businessdetails_id");

		if (businessdetails_id != null) {
			setBusinessdetails_id(businessdetails_id);
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

		if (_businesssoppathRemoteModel != null) {
			try {
				Class<?> clazz = _businesssoppathRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_businesssoppathRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBusinessdoc() {
		return _businessdoc;
	}

	@Override
	public void setBusinessdoc(String businessdoc) {
		_businessdoc = businessdoc;

		if (_businesssoppathRemoteModel != null) {
			try {
				Class<?> clazz = _businesssoppathRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinessdoc", String.class);

				method.invoke(_businesssoppathRemoteModel, businessdoc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBusinessPath() {
		return _businessPath;
	}

	@Override
	public void setBusinessPath(String businessPath) {
		_businessPath = businessPath;

		if (_businesssoppathRemoteModel != null) {
			try {
				Class<?> clazz = _businesssoppathRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinessPath", String.class);

				method.invoke(_businesssoppathRemoteModel, businessPath);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;

		if (_businesssoppathRemoteModel != null) {
			try {
				Class<?> clazz = _businesssoppathRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_businesssoppathRemoteModel, createdDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreatedBy() {
		return _createdBy;
	}

	@Override
	public void setCreatedBy(String createdBy) {
		_createdBy = createdBy;

		if (_businesssoppathRemoteModel != null) {
			try {
				Class<?> clazz = _businesssoppathRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_businesssoppathRemoteModel, createdBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFlag() {
		return _flag;
	}

	@Override
	public void setFlag(String flag) {
		_flag = flag;

		if (_businesssoppathRemoteModel != null) {
			try {
				Class<?> clazz = _businesssoppathRemoteModel.getClass();

				Method method = clazz.getMethod("setFlag", String.class);

				method.invoke(_businesssoppathRemoteModel, flag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getBusinessdetails_id() {
		return _businessdetails_id;
	}

	@Override
	public void setBusinessdetails_id(long businessdetails_id) {
		_businessdetails_id = businessdetails_id;

		if (_businesssoppathRemoteModel != null) {
			try {
				Class<?> clazz = _businesssoppathRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinessdetails_id",
						long.class);

				method.invoke(_businesssoppathRemoteModel, businessdetails_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getbusinesssoppathRemoteModel() {
		return _businesssoppathRemoteModel;
	}

	public void setbusinesssoppathRemoteModel(
		BaseModel<?> businesssoppathRemoteModel) {
		_businesssoppathRemoteModel = businesssoppathRemoteModel;
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

		Class<?> remoteModelClass = _businesssoppathRemoteModel.getClass();

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

		Object returnValue = method.invoke(_businesssoppathRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			businesssoppathLocalServiceUtil.addbusinesssoppath(this);
		}
		else {
			businesssoppathLocalServiceUtil.updatebusinesssoppath(this);
		}
	}

	@Override
	public businesssoppath toEscapedModel() {
		return (businesssoppath)ProxyUtil.newProxyInstance(businesssoppath.class.getClassLoader(),
			new Class[] { businesssoppath.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		businesssoppathClp clone = new businesssoppathClp();

		clone.setId(getId());
		clone.setBusinessdoc(getBusinessdoc());
		clone.setBusinessPath(getBusinessPath());
		clone.setCreatedDate(getCreatedDate());
		clone.setCreatedBy(getCreatedBy());
		clone.setFlag(getFlag());
		clone.setBusinessdetails_id(getBusinessdetails_id());

		return clone;
	}

	@Override
	public int compareTo(businesssoppath businesssoppath) {
		long primaryKey = businesssoppath.getPrimaryKey();

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

		if (!(obj instanceof businesssoppathClp)) {
			return false;
		}

		businesssoppathClp businesssoppath = (businesssoppathClp)obj;

		long primaryKey = businesssoppath.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", businessdoc=");
		sb.append(getBusinessdoc());
		sb.append(", businessPath=");
		sb.append(getBusinessPath());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", flag=");
		sb.append(getFlag());
		sb.append(", businessdetails_id=");
		sb.append(getBusinessdetails_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.chola.business.model.businesssoppath");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessdoc</column-name><column-value><![CDATA[");
		sb.append(getBusinessdoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessPath</column-name><column-value><![CDATA[");
		sb.append(getBusinessPath());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdBy</column-name><column-value><![CDATA[");
		sb.append(getCreatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flag</column-name><column-value><![CDATA[");
		sb.append(getFlag());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessdetails_id</column-name><column-value><![CDATA[");
		sb.append(getBusinessdetails_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _businessdoc;
	private String _businessPath;
	private Date _createdDate;
	private String _createdBy;
	private String _flag;
	private long _businessdetails_id;
	private BaseModel<?> _businesssoppathRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}