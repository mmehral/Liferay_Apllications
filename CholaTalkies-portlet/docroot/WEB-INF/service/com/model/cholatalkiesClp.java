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

package com.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import com.service.ClpSerializer;
import com.service.cholatalkiesLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @generated
 */
@ProviderType
public class cholatalkiesClp extends BaseModelImpl<cholatalkies>
	implements cholatalkies {
	public cholatalkiesClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return cholatalkies.class;
	}

	@Override
	public String getModelClassName() {
		return cholatalkies.class.getName();
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
		attributes.put("videoName", getVideoName());
		attributes.put("videoDesc", getVideoDesc());
		attributes.put("videoId", getVideoId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
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

		String videoName = (String)attributes.get("videoName");

		if (videoName != null) {
			setVideoName(videoName);
		}

		String videoDesc = (String)attributes.get("videoDesc");

		if (videoDesc != null) {
			setVideoDesc(videoDesc);
		}

		String videoId = (String)attributes.get("videoId");

		if (videoId != null) {
			setVideoId(videoId);
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

		if (_cholatalkiesRemoteModel != null) {
			try {
				Class<?> clazz = _cholatalkiesRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_cholatalkiesRemoteModel, id);
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

		if (_cholatalkiesRemoteModel != null) {
			try {
				Class<?> clazz = _cholatalkiesRemoteModel.getClass();

				Method method = clazz.getMethod("setContent_id", long.class);

				method.invoke(_cholatalkiesRemoteModel, content_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVideoName() {
		return _videoName;
	}

	@Override
	public void setVideoName(String videoName) {
		_videoName = videoName;

		if (_cholatalkiesRemoteModel != null) {
			try {
				Class<?> clazz = _cholatalkiesRemoteModel.getClass();

				Method method = clazz.getMethod("setVideoName", String.class);

				method.invoke(_cholatalkiesRemoteModel, videoName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVideoDesc() {
		return _videoDesc;
	}

	@Override
	public void setVideoDesc(String videoDesc) {
		_videoDesc = videoDesc;

		if (_cholatalkiesRemoteModel != null) {
			try {
				Class<?> clazz = _cholatalkiesRemoteModel.getClass();

				Method method = clazz.getMethod("setVideoDesc", String.class);

				method.invoke(_cholatalkiesRemoteModel, videoDesc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVideoId() {
		return _videoId;
	}

	@Override
	public void setVideoId(String videoId) {
		_videoId = videoId;

		if (_cholatalkiesRemoteModel != null) {
			try {
				Class<?> clazz = _cholatalkiesRemoteModel.getClass();

				Method method = clazz.getMethod("setVideoId", String.class);

				method.invoke(_cholatalkiesRemoteModel, videoId);
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

		if (_cholatalkiesRemoteModel != null) {
			try {
				Class<?> clazz = _cholatalkiesRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_cholatalkiesRemoteModel, createdDate);
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

		if (_cholatalkiesRemoteModel != null) {
			try {
				Class<?> clazz = _cholatalkiesRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_cholatalkiesRemoteModel, createdBy);
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

		if (_cholatalkiesRemoteModel != null) {
			try {
				Class<?> clazz = _cholatalkiesRemoteModel.getClass();

				Method method = clazz.getMethod("setFlag", String.class);

				method.invoke(_cholatalkiesRemoteModel, flag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getcholatalkiesRemoteModel() {
		return _cholatalkiesRemoteModel;
	}

	public void setcholatalkiesRemoteModel(BaseModel<?> cholatalkiesRemoteModel) {
		_cholatalkiesRemoteModel = cholatalkiesRemoteModel;
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

		Class<?> remoteModelClass = _cholatalkiesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_cholatalkiesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			cholatalkiesLocalServiceUtil.addcholatalkies(this);
		}
		else {
			cholatalkiesLocalServiceUtil.updatecholatalkies(this);
		}
	}

	@Override
	public cholatalkies toEscapedModel() {
		return (cholatalkies)ProxyUtil.newProxyInstance(cholatalkies.class.getClassLoader(),
			new Class[] { cholatalkies.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		cholatalkiesClp clone = new cholatalkiesClp();

		clone.setId(getId());
		clone.setContent_id(getContent_id());
		clone.setVideoName(getVideoName());
		clone.setVideoDesc(getVideoDesc());
		clone.setVideoId(getVideoId());
		clone.setCreatedDate(getCreatedDate());
		clone.setCreatedBy(getCreatedBy());
		clone.setFlag(getFlag());

		return clone;
	}

	@Override
	public int compareTo(cholatalkies cholatalkies) {
		long primaryKey = cholatalkies.getPrimaryKey();

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

		if (!(obj instanceof cholatalkiesClp)) {
			return false;
		}

		cholatalkiesClp cholatalkies = (cholatalkiesClp)obj;

		long primaryKey = cholatalkies.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", content_id=");
		sb.append(getContent_id());
		sb.append(", videoName=");
		sb.append(getVideoName());
		sb.append(", videoDesc=");
		sb.append(getVideoDesc());
		sb.append(", videoId=");
		sb.append(getVideoId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", flag=");
		sb.append(getFlag());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.model.cholatalkies");
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
			"<column><column-name>videoName</column-name><column-value><![CDATA[");
		sb.append(getVideoName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>videoDesc</column-name><column-value><![CDATA[");
		sb.append(getVideoDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>videoId</column-name><column-value><![CDATA[");
		sb.append(getVideoId());
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

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _content_id;
	private String _videoName;
	private String _videoDesc;
	private String _videoId;
	private Date _createdDate;
	private String _createdBy;
	private String _flag;
	private BaseModel<?> _cholatalkiesRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}