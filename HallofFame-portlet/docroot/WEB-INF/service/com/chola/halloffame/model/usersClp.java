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

import com.chola.halloffame.service.ClpSerializer;
import com.chola.halloffame.service.usersLocalServiceUtil;

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
public class usersClp extends BaseModelImpl<users> implements users {
	public usersClp() {
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
	public long getPrimaryKey() {
		return _Id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _Id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("empId", getEmpId());
		attributes.put("empName", getEmpName());
		attributes.put("writeUp", getWriteUp());
		attributes.put("awardedDate", getAwardedDate());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getId() {
		return _Id;
	}

	@Override
	public void setId(long Id) {
		_Id = Id;

		if (_usersRemoteModel != null) {
			try {
				Class<?> clazz = _usersRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_usersRemoteModel, Id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmpId() {
		return _empId;
	}

	@Override
	public void setEmpId(String empId) {
		_empId = empId;

		if (_usersRemoteModel != null) {
			try {
				Class<?> clazz = _usersRemoteModel.getClass();

				Method method = clazz.getMethod("setEmpId", String.class);

				method.invoke(_usersRemoteModel, empId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmpName() {
		return _empName;
	}

	@Override
	public void setEmpName(String empName) {
		_empName = empName;

		if (_usersRemoteModel != null) {
			try {
				Class<?> clazz = _usersRemoteModel.getClass();

				Method method = clazz.getMethod("setEmpName", String.class);

				method.invoke(_usersRemoteModel, empName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWriteUp() {
		return _writeUp;
	}

	@Override
	public void setWriteUp(String writeUp) {
		_writeUp = writeUp;

		if (_usersRemoteModel != null) {
			try {
				Class<?> clazz = _usersRemoteModel.getClass();

				Method method = clazz.getMethod("setWriteUp", String.class);

				method.invoke(_usersRemoteModel, writeUp);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getAwardedDate() {
		return _awardedDate;
	}

	@Override
	public void setAwardedDate(Date awardedDate) {
		_awardedDate = awardedDate;

		if (_usersRemoteModel != null) {
			try {
				Class<?> clazz = _usersRemoteModel.getClass();

				Method method = clazz.getMethod("setAwardedDate", Date.class);

				method.invoke(_usersRemoteModel, awardedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getusersRemoteModel() {
		return _usersRemoteModel;
	}

	public void setusersRemoteModel(BaseModel<?> usersRemoteModel) {
		_usersRemoteModel = usersRemoteModel;
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

		Class<?> remoteModelClass = _usersRemoteModel.getClass();

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

		Object returnValue = method.invoke(_usersRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			usersLocalServiceUtil.addusers(this);
		}
		else {
			usersLocalServiceUtil.updateusers(this);
		}
	}

	@Override
	public users toEscapedModel() {
		return (users)ProxyUtil.newProxyInstance(users.class.getClassLoader(),
			new Class[] { users.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		usersClp clone = new usersClp();

		clone.setId(getId());
		clone.setEmpId(getEmpId());
		clone.setEmpName(getEmpName());
		clone.setWriteUp(getWriteUp());
		clone.setAwardedDate(getAwardedDate());

		return clone;
	}

	@Override
	public int compareTo(users users) {
		long primaryKey = users.getPrimaryKey();

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

		if (!(obj instanceof usersClp)) {
			return false;
		}

		usersClp users = (usersClp)obj;

		long primaryKey = users.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{Id=");
		sb.append(getId());
		sb.append(", empId=");
		sb.append(getEmpId());
		sb.append(", empName=");
		sb.append(getEmpName());
		sb.append(", writeUp=");
		sb.append(getWriteUp());
		sb.append(", awardedDate=");
		sb.append(getAwardedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.chola.halloffame.model.users");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>Id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>empId</column-name><column-value><![CDATA[");
		sb.append(getEmpId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>empName</column-name><column-value><![CDATA[");
		sb.append(getEmpName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>writeUp</column-name><column-value><![CDATA[");
		sb.append(getWriteUp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>awardedDate</column-name><column-value><![CDATA[");
		sb.append(getAwardedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _Id;
	private String _empId;
	private String _empName;
	private String _writeUp;
	private Date _awardedDate;
	private BaseModel<?> _usersRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}