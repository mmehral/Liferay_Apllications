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

package com.chola.knowledgebites.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.knowledgebites.service.ClpSerializer;
import com.chola.knowledgebites.service.kbpathLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.DateUtil;
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
public class kbpathClp extends BaseModelImpl<kbpath> implements kbpath {
	public kbpathClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return kbpath.class;
	}

	@Override
	public String getModelClassName() {
		return kbpath.class.getName();
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
		attributes.put("kbfiledoc", getKbfiledoc());
		attributes.put("kbfilepath", getKbfilepath());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("flag", getFlag());
		attributes.put("kbdetails_id", getKbdetails_id());
		attributes.put("content_id", getContent_id());
		attributes.put("kbfilename", getKbfilename());

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

		String kbfiledoc = (String)attributes.get("kbfiledoc");

		if (kbfiledoc != null) {
			setKbfiledoc(kbfiledoc);
		}

		String kbfilepath = (String)attributes.get("kbfilepath");

		if (kbfilepath != null) {
			setKbfilepath(kbfilepath);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long createdBy = (Long)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		String flag = (String)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
		}

		Long kbdetails_id = (Long)attributes.get("kbdetails_id");

		if (kbdetails_id != null) {
			setKbdetails_id(kbdetails_id);
		}

		Long content_id = (Long)attributes.get("content_id");

		if (content_id != null) {
			setContent_id(content_id);
		}

		String kbfilename = (String)attributes.get("kbfilename");

		if (kbfilename != null) {
			setKbfilename(kbfilename);
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

		if (_kbpathRemoteModel != null) {
			try {
				Class<?> clazz = _kbpathRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_kbpathRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKbfiledoc() {
		return _kbfiledoc;
	}

	@Override
	public void setKbfiledoc(String kbfiledoc) {
		_kbfiledoc = kbfiledoc;

		if (_kbpathRemoteModel != null) {
			try {
				Class<?> clazz = _kbpathRemoteModel.getClass();

				Method method = clazz.getMethod("setKbfiledoc", String.class);

				method.invoke(_kbpathRemoteModel, kbfiledoc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKbfilepath() {
		return _kbfilepath;
	}

	@Override
	public void setKbfilepath(String kbfilepath) {
		_kbfilepath = kbfilepath;

		if (_kbpathRemoteModel != null) {
			try {
				Class<?> clazz = _kbpathRemoteModel.getClass();

				Method method = clazz.getMethod("setKbfilepath", String.class);

				method.invoke(_kbpathRemoteModel, kbfilepath);
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

		if (_kbpathRemoteModel != null) {
			try {
				Class<?> clazz = _kbpathRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_kbpathRemoteModel, createdDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCreatedBy() {
		return _createdBy;
	}

	@Override
	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;

		if (_kbpathRemoteModel != null) {
			try {
				Class<?> clazz = _kbpathRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", long.class);

				method.invoke(_kbpathRemoteModel, createdBy);
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

		if (_kbpathRemoteModel != null) {
			try {
				Class<?> clazz = _kbpathRemoteModel.getClass();

				Method method = clazz.getMethod("setFlag", String.class);

				method.invoke(_kbpathRemoteModel, flag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getKbdetails_id() {
		return _kbdetails_id;
	}

	@Override
	public void setKbdetails_id(long kbdetails_id) {
		_kbdetails_id = kbdetails_id;

		if (_kbpathRemoteModel != null) {
			try {
				Class<?> clazz = _kbpathRemoteModel.getClass();

				Method method = clazz.getMethod("setKbdetails_id", long.class);

				method.invoke(_kbpathRemoteModel, kbdetails_id);
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

		if (_kbpathRemoteModel != null) {
			try {
				Class<?> clazz = _kbpathRemoteModel.getClass();

				Method method = clazz.getMethod("setContent_id", long.class);

				method.invoke(_kbpathRemoteModel, content_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKbfilename() {
		return _kbfilename;
	}

	@Override
	public void setKbfilename(String kbfilename) {
		_kbfilename = kbfilename;

		if (_kbpathRemoteModel != null) {
			try {
				Class<?> clazz = _kbpathRemoteModel.getClass();

				Method method = clazz.getMethod("setKbfilename", String.class);

				method.invoke(_kbpathRemoteModel, kbfilename);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getkbpathRemoteModel() {
		return _kbpathRemoteModel;
	}

	public void setkbpathRemoteModel(BaseModel<?> kbpathRemoteModel) {
		_kbpathRemoteModel = kbpathRemoteModel;
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

		Class<?> remoteModelClass = _kbpathRemoteModel.getClass();

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

		Object returnValue = method.invoke(_kbpathRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			kbpathLocalServiceUtil.addkbpath(this);
		}
		else {
			kbpathLocalServiceUtil.updatekbpath(this);
		}
	}

	@Override
	public kbpath toEscapedModel() {
		return (kbpath)ProxyUtil.newProxyInstance(kbpath.class.getClassLoader(),
			new Class[] { kbpath.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		kbpathClp clone = new kbpathClp();

		clone.setId(getId());
		clone.setKbfiledoc(getKbfiledoc());
		clone.setKbfilepath(getKbfilepath());
		clone.setCreatedDate(getCreatedDate());
		clone.setCreatedBy(getCreatedBy());
		clone.setFlag(getFlag());
		clone.setKbdetails_id(getKbdetails_id());
		clone.setContent_id(getContent_id());
		clone.setKbfilename(getKbfilename());

		return clone;
	}

	@Override
	public int compareTo(kbpath kbpath) {
		int value = 0;

		value = DateUtil.compareTo(getCreatedDate(), kbpath.getCreatedDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof kbpathClp)) {
			return false;
		}

		kbpathClp kbpath = (kbpathClp)obj;

		long primaryKey = kbpath.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", kbfiledoc=");
		sb.append(getKbfiledoc());
		sb.append(", kbfilepath=");
		sb.append(getKbfilepath());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", flag=");
		sb.append(getFlag());
		sb.append(", kbdetails_id=");
		sb.append(getKbdetails_id());
		sb.append(", content_id=");
		sb.append(getContent_id());
		sb.append(", kbfilename=");
		sb.append(getKbfilename());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.chola.knowledgebites.model.kbpath");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kbfiledoc</column-name><column-value><![CDATA[");
		sb.append(getKbfiledoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kbfilepath</column-name><column-value><![CDATA[");
		sb.append(getKbfilepath());
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
			"<column><column-name>kbdetails_id</column-name><column-value><![CDATA[");
		sb.append(getKbdetails_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content_id</column-name><column-value><![CDATA[");
		sb.append(getContent_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kbfilename</column-name><column-value><![CDATA[");
		sb.append(getKbfilename());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _kbfiledoc;
	private String _kbfilepath;
	private Date _createdDate;
	private long _createdBy;
	private String _flag;
	private long _kbdetails_id;
	private long _content_id;
	private String _kbfilename;
	private BaseModel<?> _kbpathRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}