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
import com.chola.business.service.businesssopusersLocalServiceUtil;

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
public class businesssopusersClp extends BaseModelImpl<businesssopusers>
	implements businesssopusers {
	public businesssopusersClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return businesssopusers.class;
	}

	@Override
	public String getModelClassName() {
		return businesssopusers.class.getName();
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
		attributes.put("user_id", getUser_id());
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

		Long user_id = (Long)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
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

		if (_businesssopusersRemoteModel != null) {
			try {
				Class<?> clazz = _businesssopusersRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_businesssopusersRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUser_id() {
		return _user_id;
	}

	@Override
	public void setUser_id(long user_id) {
		_user_id = user_id;

		if (_businesssopusersRemoteModel != null) {
			try {
				Class<?> clazz = _businesssopusersRemoteModel.getClass();

				Method method = clazz.getMethod("setUser_id", long.class);

				method.invoke(_businesssopusersRemoteModel, user_id);
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

		if (_businesssopusersRemoteModel != null) {
			try {
				Class<?> clazz = _businesssopusersRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinessdetails_id",
						long.class);

				method.invoke(_businesssopusersRemoteModel, businessdetails_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getbusinesssopusersRemoteModel() {
		return _businesssopusersRemoteModel;
	}

	public void setbusinesssopusersRemoteModel(
		BaseModel<?> businesssopusersRemoteModel) {
		_businesssopusersRemoteModel = businesssopusersRemoteModel;
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

		Class<?> remoteModelClass = _businesssopusersRemoteModel.getClass();

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

		Object returnValue = method.invoke(_businesssopusersRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			businesssopusersLocalServiceUtil.addbusinesssopusers(this);
		}
		else {
			businesssopusersLocalServiceUtil.updatebusinesssopusers(this);
		}
	}

	@Override
	public businesssopusers toEscapedModel() {
		return (businesssopusers)ProxyUtil.newProxyInstance(businesssopusers.class.getClassLoader(),
			new Class[] { businesssopusers.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		businesssopusersClp clone = new businesssopusersClp();

		clone.setId(getId());
		clone.setUser_id(getUser_id());
		clone.setBusinessdetails_id(getBusinessdetails_id());

		return clone;
	}

	@Override
	public int compareTo(businesssopusers businesssopusers) {
		long primaryKey = businesssopusers.getPrimaryKey();

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

		if (!(obj instanceof businesssopusersClp)) {
			return false;
		}

		businesssopusersClp businesssopusers = (businesssopusersClp)obj;

		long primaryKey = businesssopusers.getPrimaryKey();

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
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", user_id=");
		sb.append(getUser_id());
		sb.append(", businessdetails_id=");
		sb.append(getBusinessdetails_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.chola.business.model.businesssopusers");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>user_id</column-name><column-value><![CDATA[");
		sb.append(getUser_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessdetails_id</column-name><column-value><![CDATA[");
		sb.append(getBusinessdetails_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _user_id;
	private long _businessdetails_id;
	private BaseModel<?> _businesssopusersRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}