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

package com.chola.successstories.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.successstories.service.ClpSerializer;
import com.chola.successstories.service.sspathLocalServiceUtil;

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
public class sspathClp extends BaseModelImpl<sspath> implements sspath {
	public sspathClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return sspath.class;
	}

	@Override
	public String getModelClassName() {
		return sspath.class.getName();
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
		attributes.put("ssfiledoc", getSsfiledoc());
		attributes.put("ssfilepath", getSsfilepath());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("flag", getFlag());
		attributes.put("ssdetails_id", getSsdetails_id());
		attributes.put("content_id", getContent_id());
		attributes.put("ssfilename", getSsfilename());

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

		String ssfiledoc = (String)attributes.get("ssfiledoc");

		if (ssfiledoc != null) {
			setSsfiledoc(ssfiledoc);
		}

		String ssfilepath = (String)attributes.get("ssfilepath");

		if (ssfilepath != null) {
			setSsfilepath(ssfilepath);
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

		Long ssdetails_id = (Long)attributes.get("ssdetails_id");

		if (ssdetails_id != null) {
			setSsdetails_id(ssdetails_id);
		}

		Long content_id = (Long)attributes.get("content_id");

		if (content_id != null) {
			setContent_id(content_id);
		}

		String ssfilename = (String)attributes.get("ssfilename");

		if (ssfilename != null) {
			setSsfilename(ssfilename);
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

		if (_sspathRemoteModel != null) {
			try {
				Class<?> clazz = _sspathRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_sspathRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSsfiledoc() {
		return _ssfiledoc;
	}

	@Override
	public void setSsfiledoc(String ssfiledoc) {
		_ssfiledoc = ssfiledoc;

		if (_sspathRemoteModel != null) {
			try {
				Class<?> clazz = _sspathRemoteModel.getClass();

				Method method = clazz.getMethod("setSsfiledoc", String.class);

				method.invoke(_sspathRemoteModel, ssfiledoc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSsfilepath() {
		return _ssfilepath;
	}

	@Override
	public void setSsfilepath(String ssfilepath) {
		_ssfilepath = ssfilepath;

		if (_sspathRemoteModel != null) {
			try {
				Class<?> clazz = _sspathRemoteModel.getClass();

				Method method = clazz.getMethod("setSsfilepath", String.class);

				method.invoke(_sspathRemoteModel, ssfilepath);
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

		if (_sspathRemoteModel != null) {
			try {
				Class<?> clazz = _sspathRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_sspathRemoteModel, createdDate);
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

		if (_sspathRemoteModel != null) {
			try {
				Class<?> clazz = _sspathRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", long.class);

				method.invoke(_sspathRemoteModel, createdBy);
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

		if (_sspathRemoteModel != null) {
			try {
				Class<?> clazz = _sspathRemoteModel.getClass();

				Method method = clazz.getMethod("setFlag", String.class);

				method.invoke(_sspathRemoteModel, flag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSsdetails_id() {
		return _ssdetails_id;
	}

	@Override
	public void setSsdetails_id(long ssdetails_id) {
		_ssdetails_id = ssdetails_id;

		if (_sspathRemoteModel != null) {
			try {
				Class<?> clazz = _sspathRemoteModel.getClass();

				Method method = clazz.getMethod("setSsdetails_id", long.class);

				method.invoke(_sspathRemoteModel, ssdetails_id);
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

		if (_sspathRemoteModel != null) {
			try {
				Class<?> clazz = _sspathRemoteModel.getClass();

				Method method = clazz.getMethod("setContent_id", long.class);

				method.invoke(_sspathRemoteModel, content_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSsfilename() {
		return _ssfilename;
	}

	@Override
	public void setSsfilename(String ssfilename) {
		_ssfilename = ssfilename;

		if (_sspathRemoteModel != null) {
			try {
				Class<?> clazz = _sspathRemoteModel.getClass();

				Method method = clazz.getMethod("setSsfilename", String.class);

				method.invoke(_sspathRemoteModel, ssfilename);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getsspathRemoteModel() {
		return _sspathRemoteModel;
	}

	public void setsspathRemoteModel(BaseModel<?> sspathRemoteModel) {
		_sspathRemoteModel = sspathRemoteModel;
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

		Class<?> remoteModelClass = _sspathRemoteModel.getClass();

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

		Object returnValue = method.invoke(_sspathRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			sspathLocalServiceUtil.addsspath(this);
		}
		else {
			sspathLocalServiceUtil.updatesspath(this);
		}
	}

	@Override
	public sspath toEscapedModel() {
		return (sspath)ProxyUtil.newProxyInstance(sspath.class.getClassLoader(),
			new Class[] { sspath.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		sspathClp clone = new sspathClp();

		clone.setId(getId());
		clone.setSsfiledoc(getSsfiledoc());
		clone.setSsfilepath(getSsfilepath());
		clone.setCreatedDate(getCreatedDate());
		clone.setCreatedBy(getCreatedBy());
		clone.setFlag(getFlag());
		clone.setSsdetails_id(getSsdetails_id());
		clone.setContent_id(getContent_id());
		clone.setSsfilename(getSsfilename());

		return clone;
	}

	@Override
	public int compareTo(sspath sspath) {
		int value = 0;

		value = DateUtil.compareTo(getCreatedDate(), sspath.getCreatedDate());

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

		if (!(obj instanceof sspathClp)) {
			return false;
		}

		sspathClp sspath = (sspathClp)obj;

		long primaryKey = sspath.getPrimaryKey();

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
		sb.append(", ssfiledoc=");
		sb.append(getSsfiledoc());
		sb.append(", ssfilepath=");
		sb.append(getSsfilepath());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", flag=");
		sb.append(getFlag());
		sb.append(", ssdetails_id=");
		sb.append(getSsdetails_id());
		sb.append(", content_id=");
		sb.append(getContent_id());
		sb.append(", ssfilename=");
		sb.append(getSsfilename());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.chola.successstories.model.sspath");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ssfiledoc</column-name><column-value><![CDATA[");
		sb.append(getSsfiledoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ssfilepath</column-name><column-value><![CDATA[");
		sb.append(getSsfilepath());
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
			"<column><column-name>ssdetails_id</column-name><column-value><![CDATA[");
		sb.append(getSsdetails_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content_id</column-name><column-value><![CDATA[");
		sb.append(getContent_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ssfilename</column-name><column-value><![CDATA[");
		sb.append(getSsfilename());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _ssfiledoc;
	private String _ssfilepath;
	private Date _createdDate;
	private long _createdBy;
	private String _flag;
	private long _ssdetails_id;
	private long _content_id;
	private String _ssfilename;
	private BaseModel<?> _sspathRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}