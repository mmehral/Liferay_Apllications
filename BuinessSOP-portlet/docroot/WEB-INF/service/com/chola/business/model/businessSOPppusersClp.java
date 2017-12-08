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
import com.chola.business.service.businessSOPppusersLocalServiceUtil;

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
public class businessSOPppusersClp extends BaseModelImpl<businessSOPppusers>
	implements businessSOPppusers {
	public businessSOPppusersClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return businessSOPppusers.class;
	}

	@Override
	public String getModelClassName() {
		return businessSOPppusers.class.getName();
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
		attributes.put("businesssop_uniqueid", getBusinesssop_uniqueid());
		attributes.put("user_id", getUser_id());

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

		String businesssop_uniqueid = (String)attributes.get(
				"businesssop_uniqueid");

		if (businesssop_uniqueid != null) {
			setBusinesssop_uniqueid(businesssop_uniqueid);
		}

		String user_id = (String)attributes.get("user_id");

		if (user_id != null) {
			setUser_id(user_id);
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

		if (_businessSOPppusersRemoteModel != null) {
			try {
				Class<?> clazz = _businessSOPppusersRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_businessSOPppusersRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBusinesssop_uniqueid() {
		return _businesssop_uniqueid;
	}

	@Override
	public void setBusinesssop_uniqueid(String businesssop_uniqueid) {
		_businesssop_uniqueid = businesssop_uniqueid;

		if (_businessSOPppusersRemoteModel != null) {
			try {
				Class<?> clazz = _businessSOPppusersRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinesssop_uniqueid",
						String.class);

				method.invoke(_businessSOPppusersRemoteModel,
					businesssop_uniqueid);
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

		if (_businessSOPppusersRemoteModel != null) {
			try {
				Class<?> clazz = _businessSOPppusersRemoteModel.getClass();

				Method method = clazz.getMethod("setUser_id", String.class);

				method.invoke(_businessSOPppusersRemoteModel, user_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getbusinessSOPppusersRemoteModel() {
		return _businessSOPppusersRemoteModel;
	}

	public void setbusinessSOPppusersRemoteModel(
		BaseModel<?> businessSOPppusersRemoteModel) {
		_businessSOPppusersRemoteModel = businessSOPppusersRemoteModel;
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

		Class<?> remoteModelClass = _businessSOPppusersRemoteModel.getClass();

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

		Object returnValue = method.invoke(_businessSOPppusersRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			businessSOPppusersLocalServiceUtil.addbusinessSOPppusers(this);
		}
		else {
			businessSOPppusersLocalServiceUtil.updatebusinessSOPppusers(this);
		}
	}

	@Override
	public businessSOPppusers toEscapedModel() {
		return (businessSOPppusers)ProxyUtil.newProxyInstance(businessSOPppusers.class.getClassLoader(),
			new Class[] { businessSOPppusers.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		businessSOPppusersClp clone = new businessSOPppusersClp();

		clone.setId(getId());
		clone.setBusinesssop_uniqueid(getBusinesssop_uniqueid());
		clone.setUser_id(getUser_id());

		return clone;
	}

	@Override
	public int compareTo(businessSOPppusers businessSOPppusers) {
		long primaryKey = businessSOPppusers.getPrimaryKey();

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

		if (!(obj instanceof businessSOPppusersClp)) {
			return false;
		}

		businessSOPppusersClp businessSOPppusers = (businessSOPppusersClp)obj;

		long primaryKey = businessSOPppusers.getPrimaryKey();

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
		sb.append(", businesssop_uniqueid=");
		sb.append(getBusinesssop_uniqueid());
		sb.append(", user_id=");
		sb.append(getUser_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.chola.business.model.businessSOPppusers");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businesssop_uniqueid</column-name><column-value><![CDATA[");
		sb.append(getBusinesssop_uniqueid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>user_id</column-name><column-value><![CDATA[");
		sb.append(getUser_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _businesssop_uniqueid;
	private String _user_id;
	private BaseModel<?> _businessSOPppusersRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}