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

package com.chola.bsop.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.bsop.service.ClpSerializer;
import com.chola.bsop.service.bsoppathLocalServiceUtil;

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
public class bsoppathClp extends BaseModelImpl<bsoppath> implements bsoppath {
	public bsoppathClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return bsoppath.class;
	}

	@Override
	public String getModelClassName() {
		return bsoppath.class.getName();
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
		attributes.put("bdoc", getBdoc());
		attributes.put("bpath", getBpath());
		attributes.put("createddate", getCreateddate());
		attributes.put("createdby", getCreatedby());
		attributes.put("flag", getFlag());
		attributes.put("bdetails_id", getBdetails_id());
		attributes.put("bdetailscontent_id", getBdetailscontent_id());
		attributes.put("filename", getFilename());

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

		String bdoc = (String)attributes.get("bdoc");

		if (bdoc != null) {
			setBdoc(bdoc);
		}

		String bpath = (String)attributes.get("bpath");

		if (bpath != null) {
			setBpath(bpath);
		}

		Date createddate = (Date)attributes.get("createddate");

		if (createddate != null) {
			setCreateddate(createddate);
		}

		String createdby = (String)attributes.get("createdby");

		if (createdby != null) {
			setCreatedby(createdby);
		}

		String flag = (String)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
		}

		Long bdetails_id = (Long)attributes.get("bdetails_id");

		if (bdetails_id != null) {
			setBdetails_id(bdetails_id);
		}

		Long bdetailscontent_id = (Long)attributes.get("bdetailscontent_id");

		if (bdetailscontent_id != null) {
			setBdetailscontent_id(bdetailscontent_id);
		}

		String filename = (String)attributes.get("filename");

		if (filename != null) {
			setFilename(filename);
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

		if (_bsoppathRemoteModel != null) {
			try {
				Class<?> clazz = _bsoppathRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_bsoppathRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBdoc() {
		return _bdoc;
	}

	@Override
	public void setBdoc(String bdoc) {
		_bdoc = bdoc;

		if (_bsoppathRemoteModel != null) {
			try {
				Class<?> clazz = _bsoppathRemoteModel.getClass();

				Method method = clazz.getMethod("setBdoc", String.class);

				method.invoke(_bsoppathRemoteModel, bdoc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBpath() {
		return _bpath;
	}

	@Override
	public void setBpath(String bpath) {
		_bpath = bpath;

		if (_bsoppathRemoteModel != null) {
			try {
				Class<?> clazz = _bsoppathRemoteModel.getClass();

				Method method = clazz.getMethod("setBpath", String.class);

				method.invoke(_bsoppathRemoteModel, bpath);
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

		if (_bsoppathRemoteModel != null) {
			try {
				Class<?> clazz = _bsoppathRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateddate", Date.class);

				method.invoke(_bsoppathRemoteModel, createddate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreatedby() {
		return _createdby;
	}

	@Override
	public void setCreatedby(String createdby) {
		_createdby = createdby;

		if (_bsoppathRemoteModel != null) {
			try {
				Class<?> clazz = _bsoppathRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedby", String.class);

				method.invoke(_bsoppathRemoteModel, createdby);
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

		if (_bsoppathRemoteModel != null) {
			try {
				Class<?> clazz = _bsoppathRemoteModel.getClass();

				Method method = clazz.getMethod("setFlag", String.class);

				method.invoke(_bsoppathRemoteModel, flag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getBdetails_id() {
		return _bdetails_id;
	}

	@Override
	public void setBdetails_id(long bdetails_id) {
		_bdetails_id = bdetails_id;

		if (_bsoppathRemoteModel != null) {
			try {
				Class<?> clazz = _bsoppathRemoteModel.getClass();

				Method method = clazz.getMethod("setBdetails_id", long.class);

				method.invoke(_bsoppathRemoteModel, bdetails_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getBdetailscontent_id() {
		return _bdetailscontent_id;
	}

	@Override
	public void setBdetailscontent_id(long bdetailscontent_id) {
		_bdetailscontent_id = bdetailscontent_id;

		if (_bsoppathRemoteModel != null) {
			try {
				Class<?> clazz = _bsoppathRemoteModel.getClass();

				Method method = clazz.getMethod("setBdetailscontent_id",
						long.class);

				method.invoke(_bsoppathRemoteModel, bdetailscontent_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFilename() {
		return _filename;
	}

	@Override
	public void setFilename(String filename) {
		_filename = filename;

		if (_bsoppathRemoteModel != null) {
			try {
				Class<?> clazz = _bsoppathRemoteModel.getClass();

				Method method = clazz.getMethod("setFilename", String.class);

				method.invoke(_bsoppathRemoteModel, filename);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getbsoppathRemoteModel() {
		return _bsoppathRemoteModel;
	}

	public void setbsoppathRemoteModel(BaseModel<?> bsoppathRemoteModel) {
		_bsoppathRemoteModel = bsoppathRemoteModel;
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

		Class<?> remoteModelClass = _bsoppathRemoteModel.getClass();

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

		Object returnValue = method.invoke(_bsoppathRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			bsoppathLocalServiceUtil.addbsoppath(this);
		}
		else {
			bsoppathLocalServiceUtil.updatebsoppath(this);
		}
	}

	@Override
	public bsoppath toEscapedModel() {
		return (bsoppath)ProxyUtil.newProxyInstance(bsoppath.class.getClassLoader(),
			new Class[] { bsoppath.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		bsoppathClp clone = new bsoppathClp();

		clone.setId(getId());
		clone.setBdoc(getBdoc());
		clone.setBpath(getBpath());
		clone.setCreateddate(getCreateddate());
		clone.setCreatedby(getCreatedby());
		clone.setFlag(getFlag());
		clone.setBdetails_id(getBdetails_id());
		clone.setBdetailscontent_id(getBdetailscontent_id());
		clone.setFilename(getFilename());

		return clone;
	}

	@Override
	public int compareTo(bsoppath bsoppath) {
		long primaryKey = bsoppath.getPrimaryKey();

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

		if (!(obj instanceof bsoppathClp)) {
			return false;
		}

		bsoppathClp bsoppath = (bsoppathClp)obj;

		long primaryKey = bsoppath.getPrimaryKey();

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
		sb.append(", bdoc=");
		sb.append(getBdoc());
		sb.append(", bpath=");
		sb.append(getBpath());
		sb.append(", createddate=");
		sb.append(getCreateddate());
		sb.append(", createdby=");
		sb.append(getCreatedby());
		sb.append(", flag=");
		sb.append(getFlag());
		sb.append(", bdetails_id=");
		sb.append(getBdetails_id());
		sb.append(", bdetailscontent_id=");
		sb.append(getBdetailscontent_id());
		sb.append(", filename=");
		sb.append(getFilename());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.chola.bsop.model.bsoppath");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bdoc</column-name><column-value><![CDATA[");
		sb.append(getBdoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bpath</column-name><column-value><![CDATA[");
		sb.append(getBpath());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createddate</column-name><column-value><![CDATA[");
		sb.append(getCreateddate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdby</column-name><column-value><![CDATA[");
		sb.append(getCreatedby());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flag</column-name><column-value><![CDATA[");
		sb.append(getFlag());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bdetails_id</column-name><column-value><![CDATA[");
		sb.append(getBdetails_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bdetailscontent_id</column-name><column-value><![CDATA[");
		sb.append(getBdetailscontent_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>filename</column-name><column-value><![CDATA[");
		sb.append(getFilename());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _bdoc;
	private String _bpath;
	private Date _createddate;
	private String _createdby;
	private String _flag;
	private long _bdetails_id;
	private long _bdetailscontent_id;
	private String _filename;
	private BaseModel<?> _bsoppathRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}