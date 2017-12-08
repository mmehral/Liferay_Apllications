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
import com.chola.trainingcalendar.service.trainingintendedtableLocalServiceUtil;

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
public class trainingintendedtableClp extends BaseModelImpl<trainingintendedtable>
	implements trainingintendedtable {
	public trainingintendedtableClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return trainingintendedtable.class;
	}

	@Override
	public String getModelClassName() {
		return trainingintendedtable.class.getName();
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
		attributes.put("trainingid", getTrainingid());
		attributes.put("userid", getUserid());
		attributes.put("screenname", getScreenname());
		attributes.put("createddate", getCreateddate());
		attributes.put("flag", getFlag());

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

		Long trainingid = (Long)attributes.get("trainingid");

		if (trainingid != null) {
			setTrainingid(trainingid);
		}

		String userid = (String)attributes.get("userid");

		if (userid != null) {
			setUserid(userid);
		}

		String screenname = (String)attributes.get("screenname");

		if (screenname != null) {
			setScreenname(screenname);
		}

		Date createddate = (Date)attributes.get("createddate");

		if (createddate != null) {
			setCreateddate(createddate);
		}

		Integer flag = (Integer)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
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

		if (_trainingintendedtableRemoteModel != null) {
			try {
				Class<?> clazz = _trainingintendedtableRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_trainingintendedtableRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTrainingid() {
		return _trainingid;
	}

	@Override
	public void setTrainingid(long trainingid) {
		_trainingid = trainingid;

		if (_trainingintendedtableRemoteModel != null) {
			try {
				Class<?> clazz = _trainingintendedtableRemoteModel.getClass();

				Method method = clazz.getMethod("setTrainingid", long.class);

				method.invoke(_trainingintendedtableRemoteModel, trainingid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserid() {
		return _userid;
	}

	@Override
	public void setUserid(String userid) {
		_userid = userid;

		if (_trainingintendedtableRemoteModel != null) {
			try {
				Class<?> clazz = _trainingintendedtableRemoteModel.getClass();

				Method method = clazz.getMethod("setUserid", String.class);

				method.invoke(_trainingintendedtableRemoteModel, userid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getScreenname() {
		return _screenname;
	}

	@Override
	public void setScreenname(String screenname) {
		_screenname = screenname;

		if (_trainingintendedtableRemoteModel != null) {
			try {
				Class<?> clazz = _trainingintendedtableRemoteModel.getClass();

				Method method = clazz.getMethod("setScreenname", String.class);

				method.invoke(_trainingintendedtableRemoteModel, screenname);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateddate() {
		return _createddate;
	}

	@Override
	public void setCreateddate(Date createddate) {
		_createddate = createddate;

		if (_trainingintendedtableRemoteModel != null) {
			try {
				Class<?> clazz = _trainingintendedtableRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateddate", Date.class);

				method.invoke(_trainingintendedtableRemoteModel, createddate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getFlag() {
		return _flag;
	}

	@Override
	public void setFlag(int flag) {
		_flag = flag;

		if (_trainingintendedtableRemoteModel != null) {
			try {
				Class<?> clazz = _trainingintendedtableRemoteModel.getClass();

				Method method = clazz.getMethod("setFlag", int.class);

				method.invoke(_trainingintendedtableRemoteModel, flag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> gettrainingintendedtableRemoteModel() {
		return _trainingintendedtableRemoteModel;
	}

	public void settrainingintendedtableRemoteModel(
		BaseModel<?> trainingintendedtableRemoteModel) {
		_trainingintendedtableRemoteModel = trainingintendedtableRemoteModel;
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

		Class<?> remoteModelClass = _trainingintendedtableRemoteModel.getClass();

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

		Object returnValue = method.invoke(_trainingintendedtableRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			trainingintendedtableLocalServiceUtil.addtrainingintendedtable(this);
		}
		else {
			trainingintendedtableLocalServiceUtil.updatetrainingintendedtable(this);
		}
	}

	@Override
	public trainingintendedtable toEscapedModel() {
		return (trainingintendedtable)ProxyUtil.newProxyInstance(trainingintendedtable.class.getClassLoader(),
			new Class[] { trainingintendedtable.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		trainingintendedtableClp clone = new trainingintendedtableClp();

		clone.setId(getId());
		clone.setTrainingid(getTrainingid());
		clone.setUserid(getUserid());
		clone.setScreenname(getScreenname());
		clone.setCreateddate(getCreateddate());
		clone.setFlag(getFlag());

		return clone;
	}

	@Override
	public int compareTo(trainingintendedtable trainingintendedtable) {
		long primaryKey = trainingintendedtable.getPrimaryKey();

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

		if (!(obj instanceof trainingintendedtableClp)) {
			return false;
		}

		trainingintendedtableClp trainingintendedtable = (trainingintendedtableClp)obj;

		long primaryKey = trainingintendedtable.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", trainingid=");
		sb.append(getTrainingid());
		sb.append(", userid=");
		sb.append(getUserid());
		sb.append(", screenname=");
		sb.append(getScreenname());
		sb.append(", createddate=");
		sb.append(getCreateddate());
		sb.append(", flag=");
		sb.append(getFlag());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.chola.trainingcalendar.model.trainingintendedtable");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trainingid</column-name><column-value><![CDATA[");
		sb.append(getTrainingid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userid</column-name><column-value><![CDATA[");
		sb.append(getUserid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>screenname</column-name><column-value><![CDATA[");
		sb.append(getScreenname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createddate</column-name><column-value><![CDATA[");
		sb.append(getCreateddate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flag</column-name><column-value><![CDATA[");
		sb.append(getFlag());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _trainingid;
	private String _userid;
	private String _screenname;
	private Date _createddate;
	private int _flag;
	private BaseModel<?> _trainingintendedtableRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}