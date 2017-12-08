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

package com.service.compliance.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import com.service.compliance.service.ClpSerializer;
import com.service.compliance.service.complianceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @generated
 */
@ProviderType
public class complianceClp extends BaseModelImpl<compliance>
	implements compliance {
	public complianceClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return compliance.class;
	}

	@Override
	public String getModelClassName() {
		return compliance.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _compliance_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCompliance_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _compliance_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("compliance_id", getCompliance_id());
		attributes.put("compliance_tite", getCompliance_tite());
		attributes.put("compliance_shortdescription",
			getCompliance_shortdescription());
		attributes.put("compliance_description", getCompliance_description());
		attributes.put("compliance_document_name", getCompliance_document_name());
		attributes.put("compliance_document_extension",
			getCompliance_document_extension());
		attributes.put("compliance_document_path", getCompliance_document_path());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long compliance_id = (Long)attributes.get("compliance_id");

		if (compliance_id != null) {
			setCompliance_id(compliance_id);
		}

		String compliance_tite = (String)attributes.get("compliance_tite");

		if (compliance_tite != null) {
			setCompliance_tite(compliance_tite);
		}

		String compliance_shortdescription = (String)attributes.get(
				"compliance_shortdescription");

		if (compliance_shortdescription != null) {
			setCompliance_shortdescription(compliance_shortdescription);
		}

		String compliance_description = (String)attributes.get(
				"compliance_description");

		if (compliance_description != null) {
			setCompliance_description(compliance_description);
		}

		String compliance_document_name = (String)attributes.get(
				"compliance_document_name");

		if (compliance_document_name != null) {
			setCompliance_document_name(compliance_document_name);
		}

		String compliance_document_extension = (String)attributes.get(
				"compliance_document_extension");

		if (compliance_document_extension != null) {
			setCompliance_document_extension(compliance_document_extension);
		}

		String compliance_document_path = (String)attributes.get(
				"compliance_document_path");

		if (compliance_document_path != null) {
			setCompliance_document_path(compliance_document_path);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getCompliance_id() {
		return _compliance_id;
	}

	@Override
	public void setCompliance_id(long compliance_id) {
		_compliance_id = compliance_id;

		if (_complianceRemoteModel != null) {
			try {
				Class<?> clazz = _complianceRemoteModel.getClass();

				Method method = clazz.getMethod("setCompliance_id", long.class);

				method.invoke(_complianceRemoteModel, compliance_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCompliance_tite() {
		return _compliance_tite;
	}

	@Override
	public void setCompliance_tite(String compliance_tite) {
		_compliance_tite = compliance_tite;

		if (_complianceRemoteModel != null) {
			try {
				Class<?> clazz = _complianceRemoteModel.getClass();

				Method method = clazz.getMethod("setCompliance_tite",
						String.class);

				method.invoke(_complianceRemoteModel, compliance_tite);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCompliance_shortdescription() {
		return _compliance_shortdescription;
	}

	@Override
	public void setCompliance_shortdescription(
		String compliance_shortdescription) {
		_compliance_shortdescription = compliance_shortdescription;

		if (_complianceRemoteModel != null) {
			try {
				Class<?> clazz = _complianceRemoteModel.getClass();

				Method method = clazz.getMethod("setCompliance_shortdescription",
						String.class);

				method.invoke(_complianceRemoteModel,
					compliance_shortdescription);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCompliance_description() {
		return _compliance_description;
	}

	@Override
	public void setCompliance_description(String compliance_description) {
		_compliance_description = compliance_description;

		if (_complianceRemoteModel != null) {
			try {
				Class<?> clazz = _complianceRemoteModel.getClass();

				Method method = clazz.getMethod("setCompliance_description",
						String.class);

				method.invoke(_complianceRemoteModel, compliance_description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCompliance_document_name() {
		return _compliance_document_name;
	}

	@Override
	public void setCompliance_document_name(String compliance_document_name) {
		_compliance_document_name = compliance_document_name;

		if (_complianceRemoteModel != null) {
			try {
				Class<?> clazz = _complianceRemoteModel.getClass();

				Method method = clazz.getMethod("setCompliance_document_name",
						String.class);

				method.invoke(_complianceRemoteModel, compliance_document_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCompliance_document_extension() {
		return _compliance_document_extension;
	}

	@Override
	public void setCompliance_document_extension(
		String compliance_document_extension) {
		_compliance_document_extension = compliance_document_extension;

		if (_complianceRemoteModel != null) {
			try {
				Class<?> clazz = _complianceRemoteModel.getClass();

				Method method = clazz.getMethod("setCompliance_document_extension",
						String.class);

				method.invoke(_complianceRemoteModel,
					compliance_document_extension);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCompliance_document_path() {
		return _compliance_document_path;
	}

	@Override
	public void setCompliance_document_path(String compliance_document_path) {
		_compliance_document_path = compliance_document_path;

		if (_complianceRemoteModel != null) {
			try {
				Class<?> clazz = _complianceRemoteModel.getClass();

				Method method = clazz.getMethod("setCompliance_document_path",
						String.class);

				method.invoke(_complianceRemoteModel, compliance_document_path);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_complianceRemoteModel != null) {
			try {
				Class<?> clazz = _complianceRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_complianceRemoteModel, createDate);
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

		if (_complianceRemoteModel != null) {
			try {
				Class<?> clazz = _complianceRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_complianceRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getcomplianceRemoteModel() {
		return _complianceRemoteModel;
	}

	public void setcomplianceRemoteModel(BaseModel<?> complianceRemoteModel) {
		_complianceRemoteModel = complianceRemoteModel;
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

		Class<?> remoteModelClass = _complianceRemoteModel.getClass();

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

		Object returnValue = method.invoke(_complianceRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			complianceLocalServiceUtil.addcompliance(this);
		}
		else {
			complianceLocalServiceUtil.updatecompliance(this);
		}
	}

	@Override
	public compliance toEscapedModel() {
		return (compliance)ProxyUtil.newProxyInstance(compliance.class.getClassLoader(),
			new Class[] { compliance.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		complianceClp clone = new complianceClp();

		clone.setCompliance_id(getCompliance_id());
		clone.setCompliance_tite(getCompliance_tite());
		clone.setCompliance_shortdescription(getCompliance_shortdescription());
		clone.setCompliance_description(getCompliance_description());
		clone.setCompliance_document_name(getCompliance_document_name());
		clone.setCompliance_document_extension(getCompliance_document_extension());
		clone.setCompliance_document_path(getCompliance_document_path());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(compliance compliance) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), compliance.getCreateDate());

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

		if (!(obj instanceof complianceClp)) {
			return false;
		}

		complianceClp compliance = (complianceClp)obj;

		long primaryKey = compliance.getPrimaryKey();

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

		sb.append("{compliance_id=");
		sb.append(getCompliance_id());
		sb.append(", compliance_tite=");
		sb.append(getCompliance_tite());
		sb.append(", compliance_shortdescription=");
		sb.append(getCompliance_shortdescription());
		sb.append(", compliance_description=");
		sb.append(getCompliance_description());
		sb.append(", compliance_document_name=");
		sb.append(getCompliance_document_name());
		sb.append(", compliance_document_extension=");
		sb.append(getCompliance_document_extension());
		sb.append(", compliance_document_path=");
		sb.append(getCompliance_document_path());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.service.compliance.model.compliance");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>compliance_id</column-name><column-value><![CDATA[");
		sb.append(getCompliance_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>compliance_tite</column-name><column-value><![CDATA[");
		sb.append(getCompliance_tite());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>compliance_shortdescription</column-name><column-value><![CDATA[");
		sb.append(getCompliance_shortdescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>compliance_description</column-name><column-value><![CDATA[");
		sb.append(getCompliance_description());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>compliance_document_name</column-name><column-value><![CDATA[");
		sb.append(getCompliance_document_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>compliance_document_extension</column-name><column-value><![CDATA[");
		sb.append(getCompliance_document_extension());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>compliance_document_path</column-name><column-value><![CDATA[");
		sb.append(getCompliance_document_path());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _compliance_id;
	private String _compliance_tite;
	private String _compliance_shortdescription;
	private String _compliance_description;
	private String _compliance_document_name;
	private String _compliance_document_extension;
	private String _compliance_document_path;
	private Date _createDate;
	private Date _modifiedDate;
	private BaseModel<?> _complianceRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}