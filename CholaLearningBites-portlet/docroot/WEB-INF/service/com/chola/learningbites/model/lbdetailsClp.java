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

package com.chola.learningbites.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.learningbites.service.ClpSerializer;
import com.chola.learningbites.service.lbdetailsLocalServiceUtil;

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
public class lbdetailsClp extends BaseModelImpl<lbdetails> implements lbdetails {
	public lbdetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return lbdetails.class;
	}

	@Override
	public String getModelClassName() {
		return lbdetails.class.getName();
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
		attributes.put("lbtitle", getLbtitle());
		attributes.put("lbdescription", getLbdescription());
		attributes.put("lbfilename", getLbfilename());
		attributes.put("lbfilepath", getLbfilepath());
		attributes.put("createddate", getCreateddate());
		attributes.put("createdby", getCreatedby());
		attributes.put("modifieddate", getModifieddate());
		attributes.put("modifiedby", getModifiedby());
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

		String lbtitle = (String)attributes.get("lbtitle");

		if (lbtitle != null) {
			setLbtitle(lbtitle);
		}

		String lbdescription = (String)attributes.get("lbdescription");

		if (lbdescription != null) {
			setLbdescription(lbdescription);
		}

		String lbfilename = (String)attributes.get("lbfilename");

		if (lbfilename != null) {
			setLbfilename(lbfilename);
		}

		String lbfilepath = (String)attributes.get("lbfilepath");

		if (lbfilepath != null) {
			setLbfilepath(lbfilepath);
		}

		Date createddate = (Date)attributes.get("createddate");

		if (createddate != null) {
			setCreateddate(createddate);
		}

		Long createdby = (Long)attributes.get("createdby");

		if (createdby != null) {
			setCreatedby(createdby);
		}

		Date modifieddate = (Date)attributes.get("modifieddate");

		if (modifieddate != null) {
			setModifieddate(modifieddate);
		}

		Long modifiedby = (Long)attributes.get("modifiedby");

		if (modifiedby != null) {
			setModifiedby(modifiedby);
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

		if (_lbdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _lbdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_lbdetailsRemoteModel, id);
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

		if (_lbdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _lbdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setContent_id", long.class);

				method.invoke(_lbdetailsRemoteModel, content_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLbtitle() {
		return _lbtitle;
	}

	@Override
	public void setLbtitle(String lbtitle) {
		_lbtitle = lbtitle;

		if (_lbdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _lbdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setLbtitle", String.class);

				method.invoke(_lbdetailsRemoteModel, lbtitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLbdescription() {
		return _lbdescription;
	}

	@Override
	public void setLbdescription(String lbdescription) {
		_lbdescription = lbdescription;

		if (_lbdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _lbdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setLbdescription", String.class);

				method.invoke(_lbdetailsRemoteModel, lbdescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLbfilename() {
		return _lbfilename;
	}

	@Override
	public void setLbfilename(String lbfilename) {
		_lbfilename = lbfilename;

		if (_lbdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _lbdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setLbfilename", String.class);

				method.invoke(_lbdetailsRemoteModel, lbfilename);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLbfilepath() {
		return _lbfilepath;
	}

	@Override
	public void setLbfilepath(String lbfilepath) {
		_lbfilepath = lbfilepath;

		if (_lbdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _lbdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setLbfilepath", String.class);

				method.invoke(_lbdetailsRemoteModel, lbfilepath);
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

		if (_lbdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _lbdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateddate", Date.class);

				method.invoke(_lbdetailsRemoteModel, createddate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCreatedby() {
		return _createdby;
	}

	@Override
	public void setCreatedby(long createdby) {
		_createdby = createdby;

		if (_lbdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _lbdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedby", long.class);

				method.invoke(_lbdetailsRemoteModel, createdby);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifieddate() {
		return _modifieddate;
	}

	@Override
	public void setModifieddate(Date modifieddate) {
		_modifieddate = modifieddate;

		if (_lbdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _lbdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifieddate", Date.class);

				method.invoke(_lbdetailsRemoteModel, modifieddate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getModifiedby() {
		return _modifiedby;
	}

	@Override
	public void setModifiedby(long modifiedby) {
		_modifiedby = modifiedby;

		if (_lbdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _lbdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedby", long.class);

				method.invoke(_lbdetailsRemoteModel, modifiedby);
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

		if (_lbdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _lbdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setFlag", String.class);

				method.invoke(_lbdetailsRemoteModel, flag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getlbdetailsRemoteModel() {
		return _lbdetailsRemoteModel;
	}

	public void setlbdetailsRemoteModel(BaseModel<?> lbdetailsRemoteModel) {
		_lbdetailsRemoteModel = lbdetailsRemoteModel;
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

		Class<?> remoteModelClass = _lbdetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_lbdetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			lbdetailsLocalServiceUtil.addlbdetails(this);
		}
		else {
			lbdetailsLocalServiceUtil.updatelbdetails(this);
		}
	}

	@Override
	public lbdetails toEscapedModel() {
		return (lbdetails)ProxyUtil.newProxyInstance(lbdetails.class.getClassLoader(),
			new Class[] { lbdetails.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		lbdetailsClp clone = new lbdetailsClp();

		clone.setId(getId());
		clone.setContent_id(getContent_id());
		clone.setLbtitle(getLbtitle());
		clone.setLbdescription(getLbdescription());
		clone.setLbfilename(getLbfilename());
		clone.setLbfilepath(getLbfilepath());
		clone.setCreateddate(getCreateddate());
		clone.setCreatedby(getCreatedby());
		clone.setModifieddate(getModifieddate());
		clone.setModifiedby(getModifiedby());
		clone.setFlag(getFlag());

		return clone;
	}

	@Override
	public int compareTo(lbdetails lbdetails) {
		int value = 0;

		value = DateUtil.compareTo(getCreateddate(), lbdetails.getCreateddate());

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

		if (!(obj instanceof lbdetailsClp)) {
			return false;
		}

		lbdetailsClp lbdetails = (lbdetailsClp)obj;

		long primaryKey = lbdetails.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", content_id=");
		sb.append(getContent_id());
		sb.append(", lbtitle=");
		sb.append(getLbtitle());
		sb.append(", lbdescription=");
		sb.append(getLbdescription());
		sb.append(", lbfilename=");
		sb.append(getLbfilename());
		sb.append(", lbfilepath=");
		sb.append(getLbfilepath());
		sb.append(", createddate=");
		sb.append(getCreateddate());
		sb.append(", createdby=");
		sb.append(getCreatedby());
		sb.append(", modifieddate=");
		sb.append(getModifieddate());
		sb.append(", modifiedby=");
		sb.append(getModifiedby());
		sb.append(", flag=");
		sb.append(getFlag());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.chola.learningbites.model.lbdetails");
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
			"<column><column-name>lbtitle</column-name><column-value><![CDATA[");
		sb.append(getLbtitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lbdescription</column-name><column-value><![CDATA[");
		sb.append(getLbdescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lbfilename</column-name><column-value><![CDATA[");
		sb.append(getLbfilename());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lbfilepath</column-name><column-value><![CDATA[");
		sb.append(getLbfilepath());
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
			"<column><column-name>modifieddate</column-name><column-value><![CDATA[");
		sb.append(getModifieddate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedby</column-name><column-value><![CDATA[");
		sb.append(getModifiedby());
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
	private String _lbtitle;
	private String _lbdescription;
	private String _lbfilename;
	private String _lbfilepath;
	private Date _createddate;
	private long _createdby;
	private Date _modifieddate;
	private long _modifiedby;
	private String _flag;
	private BaseModel<?> _lbdetailsRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}