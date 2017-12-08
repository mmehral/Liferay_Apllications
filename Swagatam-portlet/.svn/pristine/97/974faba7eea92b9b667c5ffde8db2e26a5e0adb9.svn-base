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

package com.chola.swagatam.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.swagatam.service.ClpSerializer;
import com.chola.swagatam.service.swagatampathLocalServiceUtil;

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
public class swagatampathClp extends BaseModelImpl<swagatampath>
	implements swagatampath {
	public swagatampathClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return swagatampath.class;
	}

	@Override
	public String getModelClassName() {
		return swagatampath.class.getName();
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
		attributes.put("inductionid", getInductionid());
		attributes.put("videoPath", getVideoPath());
		attributes.put("videoTitle", getVideoTitle());
		attributes.put("videoDesc", getVideoDesc());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedDate", getUpdatedDate());
		attributes.put("updatedBy", getUpdatedBy());
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

		String inductionid = (String)attributes.get("inductionid");

		if (inductionid != null) {
			setInductionid(inductionid);
		}

		String videoPath = (String)attributes.get("videoPath");

		if (videoPath != null) {
			setVideoPath(videoPath);
		}

		String videoTitle = (String)attributes.get("videoTitle");

		if (videoTitle != null) {
			setVideoTitle(videoTitle);
		}

		String videoDesc = (String)attributes.get("videoDesc");

		if (videoDesc != null) {
			setVideoDesc(videoDesc);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String createdBy = (String)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Date updatedDate = (Date)attributes.get("updatedDate");

		if (updatedDate != null) {
			setUpdatedDate(updatedDate);
		}

		String updatedBy = (String)attributes.get("updatedBy");

		if (updatedBy != null) {
			setUpdatedBy(updatedBy);
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

		if (_swagatampathRemoteModel != null) {
			try {
				Class<?> clazz = _swagatampathRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_swagatampathRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInductionid() {
		return _inductionid;
	}

	@Override
	public void setInductionid(String inductionid) {
		_inductionid = inductionid;

		if (_swagatampathRemoteModel != null) {
			try {
				Class<?> clazz = _swagatampathRemoteModel.getClass();

				Method method = clazz.getMethod("setInductionid", String.class);

				method.invoke(_swagatampathRemoteModel, inductionid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVideoPath() {
		return _videoPath;
	}

	@Override
	public void setVideoPath(String videoPath) {
		_videoPath = videoPath;

		if (_swagatampathRemoteModel != null) {
			try {
				Class<?> clazz = _swagatampathRemoteModel.getClass();

				Method method = clazz.getMethod("setVideoPath", String.class);

				method.invoke(_swagatampathRemoteModel, videoPath);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getVideoTitle() {
		return _videoTitle;
	}

	@Override
	public void setVideoTitle(String videoTitle) {
		_videoTitle = videoTitle;

		if (_swagatampathRemoteModel != null) {
			try {
				Class<?> clazz = _swagatampathRemoteModel.getClass();

				Method method = clazz.getMethod("setVideoTitle", String.class);

				method.invoke(_swagatampathRemoteModel, videoTitle);
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

		if (_swagatampathRemoteModel != null) {
			try {
				Class<?> clazz = _swagatampathRemoteModel.getClass();

				Method method = clazz.getMethod("setVideoDesc", String.class);

				method.invoke(_swagatampathRemoteModel, videoDesc);
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

		if (_swagatampathRemoteModel != null) {
			try {
				Class<?> clazz = _swagatampathRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_swagatampathRemoteModel, createdDate);
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

		if (_swagatampathRemoteModel != null) {
			try {
				Class<?> clazz = _swagatampathRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_swagatampathRemoteModel, createdBy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getUpdatedDate() {
		return _updatedDate;
	}

	@Override
	public void setUpdatedDate(Date updatedDate) {
		_updatedDate = updatedDate;

		if (_swagatampathRemoteModel != null) {
			try {
				Class<?> clazz = _swagatampathRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdatedDate", Date.class);

				method.invoke(_swagatampathRemoteModel, updatedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUpdatedBy() {
		return _updatedBy;
	}

	@Override
	public void setUpdatedBy(String updatedBy) {
		_updatedBy = updatedBy;

		if (_swagatampathRemoteModel != null) {
			try {
				Class<?> clazz = _swagatampathRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdatedBy", String.class);

				method.invoke(_swagatampathRemoteModel, updatedBy);
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

		if (_swagatampathRemoteModel != null) {
			try {
				Class<?> clazz = _swagatampathRemoteModel.getClass();

				Method method = clazz.getMethod("setFlag", String.class);

				method.invoke(_swagatampathRemoteModel, flag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getswagatampathRemoteModel() {
		return _swagatampathRemoteModel;
	}

	public void setswagatampathRemoteModel(BaseModel<?> swagatampathRemoteModel) {
		_swagatampathRemoteModel = swagatampathRemoteModel;
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

		Class<?> remoteModelClass = _swagatampathRemoteModel.getClass();

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

		Object returnValue = method.invoke(_swagatampathRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			swagatampathLocalServiceUtil.addswagatampath(this);
		}
		else {
			swagatampathLocalServiceUtil.updateswagatampath(this);
		}
	}

	@Override
	public swagatampath toEscapedModel() {
		return (swagatampath)ProxyUtil.newProxyInstance(swagatampath.class.getClassLoader(),
			new Class[] { swagatampath.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		swagatampathClp clone = new swagatampathClp();

		clone.setId(getId());
		clone.setInductionid(getInductionid());
		clone.setVideoPath(getVideoPath());
		clone.setVideoTitle(getVideoTitle());
		clone.setVideoDesc(getVideoDesc());
		clone.setCreatedDate(getCreatedDate());
		clone.setCreatedBy(getCreatedBy());
		clone.setUpdatedDate(getUpdatedDate());
		clone.setUpdatedBy(getUpdatedBy());
		clone.setFlag(getFlag());

		return clone;
	}

	@Override
	public int compareTo(swagatampath swagatampath) {
		long primaryKey = swagatampath.getPrimaryKey();

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

		if (!(obj instanceof swagatampathClp)) {
			return false;
		}

		swagatampathClp swagatampath = (swagatampathClp)obj;

		long primaryKey = swagatampath.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", inductionid=");
		sb.append(getInductionid());
		sb.append(", videoPath=");
		sb.append(getVideoPath());
		sb.append(", videoTitle=");
		sb.append(getVideoTitle());
		sb.append(", videoDesc=");
		sb.append(getVideoDesc());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", updatedDate=");
		sb.append(getUpdatedDate());
		sb.append(", updatedBy=");
		sb.append(getUpdatedBy());
		sb.append(", flag=");
		sb.append(getFlag());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.chola.swagatam.model.swagatampath");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inductionid</column-name><column-value><![CDATA[");
		sb.append(getInductionid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>videoPath</column-name><column-value><![CDATA[");
		sb.append(getVideoPath());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>videoTitle</column-name><column-value><![CDATA[");
		sb.append(getVideoTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>videoDesc</column-name><column-value><![CDATA[");
		sb.append(getVideoDesc());
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
			"<column><column-name>updatedDate</column-name><column-value><![CDATA[");
		sb.append(getUpdatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updatedBy</column-name><column-value><![CDATA[");
		sb.append(getUpdatedBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flag</column-name><column-value><![CDATA[");
		sb.append(getFlag());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _inductionid;
	private String _videoPath;
	private String _videoTitle;
	private String _videoDesc;
	private Date _createdDate;
	private String _createdBy;
	private Date _updatedDate;
	private String _updatedBy;
	private String _flag;
	private BaseModel<?> _swagatampathRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}