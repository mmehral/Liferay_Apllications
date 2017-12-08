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

package com.organizationAnnouncement.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import com.organizationAnnouncement.service.ClpSerializer;
import com.organizationAnnouncement.service.organizationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @generated
 */
@ProviderType
public class organizationClp extends BaseModelImpl<organization>
	implements organization {
	public organizationClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return organization.class;
	}

	@Override
	public String getModelClassName() {
		return organization.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _organization_id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOrganization_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _organization_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("organization_id", getOrganization_id());
		attributes.put("organization_tite", getOrganization_tite());
		attributes.put("organization_description", getOrganization_description());
		attributes.put("organization_image_name", getOrganization_image_name());
		attributes.put("organization_image_path", getOrganization_image_path());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long organization_id = (Long)attributes.get("organization_id");

		if (organization_id != null) {
			setOrganization_id(organization_id);
		}

		String organization_tite = (String)attributes.get("organization_tite");

		if (organization_tite != null) {
			setOrganization_tite(organization_tite);
		}

		String organization_description = (String)attributes.get(
				"organization_description");

		if (organization_description != null) {
			setOrganization_description(organization_description);
		}

		String organization_image_name = (String)attributes.get(
				"organization_image_name");

		if (organization_image_name != null) {
			setOrganization_image_name(organization_image_name);
		}

		String organization_image_path = (String)attributes.get(
				"organization_image_path");

		if (organization_image_path != null) {
			setOrganization_image_path(organization_image_path);
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
	public long getOrganization_id() {
		return _organization_id;
	}

	@Override
	public void setOrganization_id(long organization_id) {
		_organization_id = organization_id;

		if (_organizationRemoteModel != null) {
			try {
				Class<?> clazz = _organizationRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganization_id", long.class);

				method.invoke(_organizationRemoteModel, organization_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOrganization_tite() {
		return _organization_tite;
	}

	@Override
	public void setOrganization_tite(String organization_tite) {
		_organization_tite = organization_tite;

		if (_organizationRemoteModel != null) {
			try {
				Class<?> clazz = _organizationRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganization_tite",
						String.class);

				method.invoke(_organizationRemoteModel, organization_tite);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOrganization_description() {
		return _organization_description;
	}

	@Override
	public void setOrganization_description(String organization_description) {
		_organization_description = organization_description;

		if (_organizationRemoteModel != null) {
			try {
				Class<?> clazz = _organizationRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganization_description",
						String.class);

				method.invoke(_organizationRemoteModel, organization_description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOrganization_image_name() {
		return _organization_image_name;
	}

	@Override
	public void setOrganization_image_name(String organization_image_name) {
		_organization_image_name = organization_image_name;

		if (_organizationRemoteModel != null) {
			try {
				Class<?> clazz = _organizationRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganization_image_name",
						String.class);

				method.invoke(_organizationRemoteModel, organization_image_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getOrganization_image_path() {
		return _organization_image_path;
	}

	@Override
	public void setOrganization_image_path(String organization_image_path) {
		_organization_image_path = organization_image_path;

		if (_organizationRemoteModel != null) {
			try {
				Class<?> clazz = _organizationRemoteModel.getClass();

				Method method = clazz.getMethod("setOrganization_image_path",
						String.class);

				method.invoke(_organizationRemoteModel, organization_image_path);
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

		if (_organizationRemoteModel != null) {
			try {
				Class<?> clazz = _organizationRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_organizationRemoteModel, createDate);
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

		if (_organizationRemoteModel != null) {
			try {
				Class<?> clazz = _organizationRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_organizationRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getorganizationRemoteModel() {
		return _organizationRemoteModel;
	}

	public void setorganizationRemoteModel(BaseModel<?> organizationRemoteModel) {
		_organizationRemoteModel = organizationRemoteModel;
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

		Class<?> remoteModelClass = _organizationRemoteModel.getClass();

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

		Object returnValue = method.invoke(_organizationRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			organizationLocalServiceUtil.addorganization(this);
		}
		else {
			organizationLocalServiceUtil.updateorganization(this);
		}
	}

	@Override
	public organization toEscapedModel() {
		return (organization)ProxyUtil.newProxyInstance(organization.class.getClassLoader(),
			new Class[] { organization.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		organizationClp clone = new organizationClp();

		clone.setOrganization_id(getOrganization_id());
		clone.setOrganization_tite(getOrganization_tite());
		clone.setOrganization_description(getOrganization_description());
		clone.setOrganization_image_name(getOrganization_image_name());
		clone.setOrganization_image_path(getOrganization_image_path());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(organization organization) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), organization.getCreateDate());

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

		if (!(obj instanceof organizationClp)) {
			return false;
		}

		organizationClp organization = (organizationClp)obj;

		long primaryKey = organization.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{organization_id=");
		sb.append(getOrganization_id());
		sb.append(", organization_tite=");
		sb.append(getOrganization_tite());
		sb.append(", organization_description=");
		sb.append(getOrganization_description());
		sb.append(", organization_image_name=");
		sb.append(getOrganization_image_name());
		sb.append(", organization_image_path=");
		sb.append(getOrganization_image_path());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.organizationAnnouncement.model.organization");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>organization_id</column-name><column-value><![CDATA[");
		sb.append(getOrganization_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organization_tite</column-name><column-value><![CDATA[");
		sb.append(getOrganization_tite());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organization_description</column-name><column-value><![CDATA[");
		sb.append(getOrganization_description());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organization_image_name</column-name><column-value><![CDATA[");
		sb.append(getOrganization_image_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>organization_image_path</column-name><column-value><![CDATA[");
		sb.append(getOrganization_image_path());
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

	private long _organization_id;
	private String _organization_tite;
	private String _organization_description;
	private String _organization_image_name;
	private String _organization_image_path;
	private Date _createDate;
	private Date _modifiedDate;
	private BaseModel<?> _organizationRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}