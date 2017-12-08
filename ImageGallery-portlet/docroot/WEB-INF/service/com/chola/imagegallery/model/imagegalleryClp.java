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

package com.chola.imagegallery.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.imagegallery.service.ClpSerializer;
import com.chola.imagegallery.service.imagegalleryLocalServiceUtil;

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
public class imagegalleryClp extends BaseModelImpl<imagegallery>
	implements imagegallery {
	public imagegalleryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return imagegallery.class;
	}

	@Override
	public String getModelClassName() {
		return imagegallery.class.getName();
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
		attributes.put("albumName", getAlbumName());
		attributes.put("albumDesc", getAlbumDesc());
		attributes.put("albumId", getAlbumId());
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

		String albumName = (String)attributes.get("albumName");

		if (albumName != null) {
			setAlbumName(albumName);
		}

		String albumDesc = (String)attributes.get("albumDesc");

		if (albumDesc != null) {
			setAlbumDesc(albumDesc);
		}

		String albumId = (String)attributes.get("albumId");

		if (albumId != null) {
			setAlbumId(albumId);
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

		if (_imagegalleryRemoteModel != null) {
			try {
				Class<?> clazz = _imagegalleryRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_imagegalleryRemoteModel, id);
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

		if (_imagegalleryRemoteModel != null) {
			try {
				Class<?> clazz = _imagegalleryRemoteModel.getClass();

				Method method = clazz.getMethod("setContent_id", long.class);

				method.invoke(_imagegalleryRemoteModel, content_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAlbumName() {
		return _albumName;
	}

	@Override
	public void setAlbumName(String albumName) {
		_albumName = albumName;

		if (_imagegalleryRemoteModel != null) {
			try {
				Class<?> clazz = _imagegalleryRemoteModel.getClass();

				Method method = clazz.getMethod("setAlbumName", String.class);

				method.invoke(_imagegalleryRemoteModel, albumName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAlbumDesc() {
		return _albumDesc;
	}

	@Override
	public void setAlbumDesc(String albumDesc) {
		_albumDesc = albumDesc;

		if (_imagegalleryRemoteModel != null) {
			try {
				Class<?> clazz = _imagegalleryRemoteModel.getClass();

				Method method = clazz.getMethod("setAlbumDesc", String.class);

				method.invoke(_imagegalleryRemoteModel, albumDesc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAlbumId() {
		return _albumId;
	}

	@Override
	public void setAlbumId(String albumId) {
		_albumId = albumId;

		if (_imagegalleryRemoteModel != null) {
			try {
				Class<?> clazz = _imagegalleryRemoteModel.getClass();

				Method method = clazz.getMethod("setAlbumId", String.class);

				method.invoke(_imagegalleryRemoteModel, albumId);
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

		if (_imagegalleryRemoteModel != null) {
			try {
				Class<?> clazz = _imagegalleryRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_imagegalleryRemoteModel, createdDate);
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

		if (_imagegalleryRemoteModel != null) {
			try {
				Class<?> clazz = _imagegalleryRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_imagegalleryRemoteModel, createdBy);
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

		if (_imagegalleryRemoteModel != null) {
			try {
				Class<?> clazz = _imagegalleryRemoteModel.getClass();

				Method method = clazz.getMethod("setFlag", String.class);

				method.invoke(_imagegalleryRemoteModel, flag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getimagegalleryRemoteModel() {
		return _imagegalleryRemoteModel;
	}

	public void setimagegalleryRemoteModel(BaseModel<?> imagegalleryRemoteModel) {
		_imagegalleryRemoteModel = imagegalleryRemoteModel;
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

		Class<?> remoteModelClass = _imagegalleryRemoteModel.getClass();

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

		Object returnValue = method.invoke(_imagegalleryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			imagegalleryLocalServiceUtil.addimagegallery(this);
		}
		else {
			imagegalleryLocalServiceUtil.updateimagegallery(this);
		}
	}

	@Override
	public imagegallery toEscapedModel() {
		return (imagegallery)ProxyUtil.newProxyInstance(imagegallery.class.getClassLoader(),
			new Class[] { imagegallery.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		imagegalleryClp clone = new imagegalleryClp();

		clone.setId(getId());
		clone.setContent_id(getContent_id());
		clone.setAlbumName(getAlbumName());
		clone.setAlbumDesc(getAlbumDesc());
		clone.setAlbumId(getAlbumId());
		clone.setCreatedDate(getCreatedDate());
		clone.setCreatedBy(getCreatedBy());
		clone.setFlag(getFlag());

		return clone;
	}

	@Override
	public int compareTo(imagegallery imagegallery) {
		int value = 0;

		value = DateUtil.compareTo(getCreatedDate(),
				imagegallery.getCreatedDate());

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

		if (!(obj instanceof imagegalleryClp)) {
			return false;
		}

		imagegalleryClp imagegallery = (imagegalleryClp)obj;

		long primaryKey = imagegallery.getPrimaryKey();

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
		sb.append(", albumName=");
		sb.append(getAlbumName());
		sb.append(", albumDesc=");
		sb.append(getAlbumDesc());
		sb.append(", albumId=");
		sb.append(getAlbumId());
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
		sb.append("com.chola.imagegallery.model.imagegallery");
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
			"<column><column-name>albumName</column-name><column-value><![CDATA[");
		sb.append(getAlbumName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>albumDesc</column-name><column-value><![CDATA[");
		sb.append(getAlbumDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>albumId</column-name><column-value><![CDATA[");
		sb.append(getAlbumId());
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
	private String _albumName;
	private String _albumDesc;
	private String _albumId;
	private Date _createdDate;
	private String _createdBy;
	private String _flag;
	private BaseModel<?> _imagegalleryRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}