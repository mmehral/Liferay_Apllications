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
import com.chola.successstories.service.ssdetailsLocalServiceUtil;

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
public class ssdetailsClp extends BaseModelImpl<ssdetails> implements ssdetails {
	public ssdetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ssdetails.class;
	}

	@Override
	public String getModelClassName() {
		return ssdetails.class.getName();
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
		attributes.put("sstitle", getSstitle());
		attributes.put("ssdesc", getSsdesc());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("modifiedBy", getModifiedBy());
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

		Long content_id = (Long)attributes.get("content_id");

		if (content_id != null) {
			setContent_id(content_id);
		}

		String sstitle = (String)attributes.get("sstitle");

		if (sstitle != null) {
			setSstitle(sstitle);
		}

		String ssdesc = (String)attributes.get("ssdesc");

		if (ssdesc != null) {
			setSsdesc(ssdesc);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long createdBy = (Long)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long modifiedBy = (Long)attributes.get("modifiedBy");

		if (modifiedBy != null) {
			setModifiedBy(modifiedBy);
		}

		String flag = (String)attributes.get("flag");

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

		if (_ssdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _ssdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_ssdetailsRemoteModel, id);
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

		if (_ssdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _ssdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setContent_id", long.class);

				method.invoke(_ssdetailsRemoteModel, content_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSstitle() {
		return _sstitle;
	}

	@Override
	public void setSstitle(String sstitle) {
		_sstitle = sstitle;

		if (_ssdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _ssdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setSstitle", String.class);

				method.invoke(_ssdetailsRemoteModel, sstitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSsdesc() {
		return _ssdesc;
	}

	@Override
	public void setSsdesc(String ssdesc) {
		_ssdesc = ssdesc;

		if (_ssdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _ssdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setSsdesc", String.class);

				method.invoke(_ssdetailsRemoteModel, ssdesc);
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

		if (_ssdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _ssdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_ssdetailsRemoteModel, createdDate);
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

		if (_ssdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _ssdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", long.class);

				method.invoke(_ssdetailsRemoteModel, createdBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_ssdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _ssdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_ssdetailsRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getModifiedBy() {
		return _modifiedBy;
	}

	@Override
	public void setModifiedBy(long modifiedBy) {
		_modifiedBy = modifiedBy;

		if (_ssdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _ssdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", long.class);

				method.invoke(_ssdetailsRemoteModel, modifiedBy);
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

		if (_ssdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _ssdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setFlag", String.class);

				method.invoke(_ssdetailsRemoteModel, flag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getssdetailsRemoteModel() {
		return _ssdetailsRemoteModel;
	}

	public void setssdetailsRemoteModel(BaseModel<?> ssdetailsRemoteModel) {
		_ssdetailsRemoteModel = ssdetailsRemoteModel;
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

		Class<?> remoteModelClass = _ssdetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_ssdetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			ssdetailsLocalServiceUtil.addssdetails(this);
		}
		else {
			ssdetailsLocalServiceUtil.updatessdetails(this);
		}
	}

	@Override
	public ssdetails toEscapedModel() {
		return (ssdetails)ProxyUtil.newProxyInstance(ssdetails.class.getClassLoader(),
			new Class[] { ssdetails.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ssdetailsClp clone = new ssdetailsClp();

		clone.setId(getId());
		clone.setContent_id(getContent_id());
		clone.setSstitle(getSstitle());
		clone.setSsdesc(getSsdesc());
		clone.setCreatedDate(getCreatedDate());
		clone.setCreatedBy(getCreatedBy());
		clone.setModifiedDate(getModifiedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setFlag(getFlag());

		return clone;
	}

	@Override
	public int compareTo(ssdetails ssdetails) {
		int value = 0;

		value = DateUtil.compareTo(getCreatedDate(), ssdetails.getCreatedDate());

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

		if (!(obj instanceof ssdetailsClp)) {
			return false;
		}

		ssdetailsClp ssdetails = (ssdetailsClp)obj;

		long primaryKey = ssdetails.getPrimaryKey();

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
		sb.append(", content_id=");
		sb.append(getContent_id());
		sb.append(", sstitle=");
		sb.append(getSstitle());
		sb.append(", ssdesc=");
		sb.append(getSsdesc());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", modifiedBy=");
		sb.append(getModifiedBy());
		sb.append(", flag=");
		sb.append(getFlag());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.chola.successstories.model.ssdetails");
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
			"<column><column-name>sstitle</column-name><column-value><![CDATA[");
		sb.append(getSstitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ssdesc</column-name><column-value><![CDATA[");
		sb.append(getSsdesc());
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
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedBy</column-name><column-value><![CDATA[");
		sb.append(getModifiedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flag</column-name><column-value><![CDATA[");
		sb.append(getFlag());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _content_id;
	private String _sstitle;
	private String _ssdesc;
	private Date _createdDate;
	private long _createdBy;
	private Date _modifiedDate;
	private long _modifiedBy;
	private String _flag;
	private BaseModel<?> _ssdetailsRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}