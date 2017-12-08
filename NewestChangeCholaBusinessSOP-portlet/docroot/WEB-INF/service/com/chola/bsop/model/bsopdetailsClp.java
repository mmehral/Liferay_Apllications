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
import com.chola.bsop.service.bsopdetailsLocalServiceUtil;

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
public class bsopdetailsClp extends BaseModelImpl<bsopdetails>
	implements bsopdetails {
	public bsopdetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return bsopdetails.class;
	}

	@Override
	public String getModelClassName() {
		return bsopdetails.class.getName();
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
		attributes.put("btitle", getBtitle());
		attributes.put("bdesc", getBdesc());
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

		String btitle = (String)attributes.get("btitle");

		if (btitle != null) {
			setBtitle(btitle);
		}

		String bdesc = (String)attributes.get("bdesc");

		if (bdesc != null) {
			setBdesc(bdesc);
		}

		Date createddate = (Date)attributes.get("createddate");

		if (createddate != null) {
			setCreateddate(createddate);
		}

		String createdby = (String)attributes.get("createdby");

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

		if (_bsopdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _bsopdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_bsopdetailsRemoteModel, id);
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

		if (_bsopdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _bsopdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setContent_id", long.class);

				method.invoke(_bsopdetailsRemoteModel, content_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBtitle() {
		return _btitle;
	}

	@Override
	public void setBtitle(String btitle) {
		_btitle = btitle;

		if (_bsopdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _bsopdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBtitle", String.class);

				method.invoke(_bsopdetailsRemoteModel, btitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBdesc() {
		return _bdesc;
	}

	@Override
	public void setBdesc(String bdesc) {
		_bdesc = bdesc;

		if (_bsopdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _bsopdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBdesc", String.class);

				method.invoke(_bsopdetailsRemoteModel, bdesc);
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

		if (_bsopdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _bsopdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateddate", Date.class);

				method.invoke(_bsopdetailsRemoteModel, createddate);
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

		if (_bsopdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _bsopdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedby", String.class);

				method.invoke(_bsopdetailsRemoteModel, createdby);
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

		if (_bsopdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _bsopdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifieddate", Date.class);

				method.invoke(_bsopdetailsRemoteModel, modifieddate);
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

		if (_bsopdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _bsopdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedby", long.class);

				method.invoke(_bsopdetailsRemoteModel, modifiedby);
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

		if (_bsopdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _bsopdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setFlag", String.class);

				method.invoke(_bsopdetailsRemoteModel, flag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getbsopdetailsRemoteModel() {
		return _bsopdetailsRemoteModel;
	}

	public void setbsopdetailsRemoteModel(BaseModel<?> bsopdetailsRemoteModel) {
		_bsopdetailsRemoteModel = bsopdetailsRemoteModel;
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

		Class<?> remoteModelClass = _bsopdetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_bsopdetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			bsopdetailsLocalServiceUtil.addbsopdetails(this);
		}
		else {
			bsopdetailsLocalServiceUtil.updatebsopdetails(this);
		}
	}

	@Override
	public bsopdetails toEscapedModel() {
		return (bsopdetails)ProxyUtil.newProxyInstance(bsopdetails.class.getClassLoader(),
			new Class[] { bsopdetails.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		bsopdetailsClp clone = new bsopdetailsClp();

		clone.setId(getId());
		clone.setContent_id(getContent_id());
		clone.setBtitle(getBtitle());
		clone.setBdesc(getBdesc());
		clone.setCreateddate(getCreateddate());
		clone.setCreatedby(getCreatedby());
		clone.setModifieddate(getModifieddate());
		clone.setModifiedby(getModifiedby());
		clone.setFlag(getFlag());

		return clone;
	}

	@Override
	public int compareTo(bsopdetails bsopdetails) {
		long primaryKey = bsopdetails.getPrimaryKey();

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

		if (!(obj instanceof bsopdetailsClp)) {
			return false;
		}

		bsopdetailsClp bsopdetails = (bsopdetailsClp)obj;

		long primaryKey = bsopdetails.getPrimaryKey();

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
		sb.append(", btitle=");
		sb.append(getBtitle());
		sb.append(", bdesc=");
		sb.append(getBdesc());
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
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.chola.bsop.model.bsopdetails");
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
			"<column><column-name>btitle</column-name><column-value><![CDATA[");
		sb.append(getBtitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bdesc</column-name><column-value><![CDATA[");
		sb.append(getBdesc());
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
	private String _btitle;
	private String _bdesc;
	private Date _createddate;
	private String _createdby;
	private Date _modifieddate;
	private long _modifiedby;
	private String _flag;
	private BaseModel<?> _bsopdetailsRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}