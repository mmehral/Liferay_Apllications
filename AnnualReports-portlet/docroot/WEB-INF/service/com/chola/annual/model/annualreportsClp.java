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

package com.chola.annual.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.annual.service.ClpSerializer;
import com.chola.annual.service.annualreportsLocalServiceUtil;

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
public class annualreportsClp extends BaseModelImpl<annualreports>
	implements annualreports {
	public annualreportsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return annualreports.class;
	}

	@Override
	public String getModelClassName() {
		return annualreports.class.getName();
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
		attributes.put("details", getDetails());
		attributes.put("updatedon", getUpdatedon());
		attributes.put("updatedby", getUpdatedby());
		attributes.put("uniquecontentid", getUniquecontentid());

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

		String details = (String)attributes.get("details");

		if (details != null) {
			setDetails(details);
		}

		Date updatedon = (Date)attributes.get("updatedon");

		if (updatedon != null) {
			setUpdatedon(updatedon);
		}

		Long updatedby = (Long)attributes.get("updatedby");

		if (updatedby != null) {
			setUpdatedby(updatedby);
		}

		Long uniquecontentid = (Long)attributes.get("uniquecontentid");

		if (uniquecontentid != null) {
			setUniquecontentid(uniquecontentid);
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

		if (_annualreportsRemoteModel != null) {
			try {
				Class<?> clazz = _annualreportsRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_annualreportsRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDetails() {
		return _details;
	}

	@Override
	public void setDetails(String details) {
		_details = details;

		if (_annualreportsRemoteModel != null) {
			try {
				Class<?> clazz = _annualreportsRemoteModel.getClass();

				Method method = clazz.getMethod("setDetails", String.class);

				method.invoke(_annualreportsRemoteModel, details);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getUpdatedon() {
		return _updatedon;
	}

	@Override
	public void setUpdatedon(Date updatedon) {
		_updatedon = updatedon;

		if (_annualreportsRemoteModel != null) {
			try {
				Class<?> clazz = _annualreportsRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdatedon", Date.class);

				method.invoke(_annualreportsRemoteModel, updatedon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUpdatedby() {
		return _updatedby;
	}

	@Override
	public void setUpdatedby(long updatedby) {
		_updatedby = updatedby;

		if (_annualreportsRemoteModel != null) {
			try {
				Class<?> clazz = _annualreportsRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdatedby", long.class);

				method.invoke(_annualreportsRemoteModel, updatedby);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUniquecontentid() {
		return _uniquecontentid;
	}

	@Override
	public void setUniquecontentid(long uniquecontentid) {
		_uniquecontentid = uniquecontentid;

		if (_annualreportsRemoteModel != null) {
			try {
				Class<?> clazz = _annualreportsRemoteModel.getClass();

				Method method = clazz.getMethod("setUniquecontentid", long.class);

				method.invoke(_annualreportsRemoteModel, uniquecontentid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getannualreportsRemoteModel() {
		return _annualreportsRemoteModel;
	}

	public void setannualreportsRemoteModel(
		BaseModel<?> annualreportsRemoteModel) {
		_annualreportsRemoteModel = annualreportsRemoteModel;
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

		Class<?> remoteModelClass = _annualreportsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_annualreportsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			annualreportsLocalServiceUtil.addannualreports(this);
		}
		else {
			annualreportsLocalServiceUtil.updateannualreports(this);
		}
	}

	@Override
	public annualreports toEscapedModel() {
		return (annualreports)ProxyUtil.newProxyInstance(annualreports.class.getClassLoader(),
			new Class[] { annualreports.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		annualreportsClp clone = new annualreportsClp();

		clone.setId(getId());
		clone.setDetails(getDetails());
		clone.setUpdatedon(getUpdatedon());
		clone.setUpdatedby(getUpdatedby());
		clone.setUniquecontentid(getUniquecontentid());

		return clone;
	}

	@Override
	public int compareTo(annualreports annualreports) {
		long primaryKey = annualreports.getPrimaryKey();

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

		if (!(obj instanceof annualreportsClp)) {
			return false;
		}

		annualreportsClp annualreports = (annualreportsClp)obj;

		long primaryKey = annualreports.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", details=");
		sb.append(getDetails());
		sb.append(", updatedon=");
		sb.append(getUpdatedon());
		sb.append(", updatedby=");
		sb.append(getUpdatedby());
		sb.append(", uniquecontentid=");
		sb.append(getUniquecontentid());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.chola.annual.model.annualreports");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>details</column-name><column-value><![CDATA[");
		sb.append(getDetails());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updatedon</column-name><column-value><![CDATA[");
		sb.append(getUpdatedon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updatedby</column-name><column-value><![CDATA[");
		sb.append(getUpdatedby());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>uniquecontentid</column-name><column-value><![CDATA[");
		sb.append(getUniquecontentid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _details;
	private Date _updatedon;
	private long _updatedby;
	private long _uniquecontentid;
	private BaseModel<?> _annualreportsRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}