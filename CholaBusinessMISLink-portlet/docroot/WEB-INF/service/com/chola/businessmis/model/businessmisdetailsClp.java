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

package com.chola.businessmis.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.businessmis.service.ClpSerializer;
import com.chola.businessmis.service.businessmisdetailsLocalServiceUtil;

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
public class businessmisdetailsClp extends BaseModelImpl<businessmisdetails>
	implements businessmisdetails {
	public businessmisdetailsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return businessmisdetails.class;
	}

	@Override
	public String getModelClassName() {
		return businessmisdetails.class.getName();
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
		attributes.put("businesstitle", getBusinesstitle());
		attributes.put("businessDesc", getBusinessDesc());
		attributes.put("businessLink", getBusinessLink());
		attributes.put("filepath", getFilepath());
		attributes.put("filename", getFilename());
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

		String businesstitle = (String)attributes.get("businesstitle");

		if (businesstitle != null) {
			setBusinesstitle(businesstitle);
		}

		String businessDesc = (String)attributes.get("businessDesc");

		if (businessDesc != null) {
			setBusinessDesc(businessDesc);
		}

		String businessLink = (String)attributes.get("businessLink");

		if (businessLink != null) {
			setBusinessLink(businessLink);
		}

		String filepath = (String)attributes.get("filepath");

		if (filepath != null) {
			setFilepath(filepath);
		}

		String filename = (String)attributes.get("filename");

		if (filename != null) {
			setFilename(filename);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String createdBy = (String)attributes.get("createdBy");

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

		if (_businessmisdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _businessmisdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_businessmisdetailsRemoteModel, id);
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

		if (_businessmisdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _businessmisdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setContent_id", long.class);

				method.invoke(_businessmisdetailsRemoteModel, content_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBusinesstitle() {
		return _businesstitle;
	}

	@Override
	public void setBusinesstitle(String businesstitle) {
		_businesstitle = businesstitle;

		if (_businessmisdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _businessmisdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinesstitle", String.class);

				method.invoke(_businessmisdetailsRemoteModel, businesstitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBusinessDesc() {
		return _businessDesc;
	}

	@Override
	public void setBusinessDesc(String businessDesc) {
		_businessDesc = businessDesc;

		if (_businessmisdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _businessmisdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinessDesc", String.class);

				method.invoke(_businessmisdetailsRemoteModel, businessDesc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBusinessLink() {
		return _businessLink;
	}

	@Override
	public void setBusinessLink(String businessLink) {
		_businessLink = businessLink;

		if (_businessmisdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _businessmisdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setBusinessLink", String.class);

				method.invoke(_businessmisdetailsRemoteModel, businessLink);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFilepath() {
		return _filepath;
	}

	@Override
	public void setFilepath(String filepath) {
		_filepath = filepath;

		if (_businessmisdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _businessmisdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setFilepath", String.class);

				method.invoke(_businessmisdetailsRemoteModel, filepath);
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

		if (_businessmisdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _businessmisdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setFilename", String.class);

				method.invoke(_businessmisdetailsRemoteModel, filename);
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

		if (_businessmisdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _businessmisdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedDate", Date.class);

				method.invoke(_businessmisdetailsRemoteModel, createdDate);
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

		if (_businessmisdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _businessmisdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedBy", String.class);

				method.invoke(_businessmisdetailsRemoteModel, createdBy);
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

		if (_businessmisdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _businessmisdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_businessmisdetailsRemoteModel, modifiedDate);
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

		if (_businessmisdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _businessmisdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedBy", long.class);

				method.invoke(_businessmisdetailsRemoteModel, modifiedBy);
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

		if (_businessmisdetailsRemoteModel != null) {
			try {
				Class<?> clazz = _businessmisdetailsRemoteModel.getClass();

				Method method = clazz.getMethod("setFlag", String.class);

				method.invoke(_businessmisdetailsRemoteModel, flag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getbusinessmisdetailsRemoteModel() {
		return _businessmisdetailsRemoteModel;
	}

	public void setbusinessmisdetailsRemoteModel(
		BaseModel<?> businessmisdetailsRemoteModel) {
		_businessmisdetailsRemoteModel = businessmisdetailsRemoteModel;
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

		Class<?> remoteModelClass = _businessmisdetailsRemoteModel.getClass();

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

		Object returnValue = method.invoke(_businessmisdetailsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			businessmisdetailsLocalServiceUtil.addbusinessmisdetails(this);
		}
		else {
			businessmisdetailsLocalServiceUtil.updatebusinessmisdetails(this);
		}
	}

	@Override
	public businessmisdetails toEscapedModel() {
		return (businessmisdetails)ProxyUtil.newProxyInstance(businessmisdetails.class.getClassLoader(),
			new Class[] { businessmisdetails.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		businessmisdetailsClp clone = new businessmisdetailsClp();

		clone.setId(getId());
		clone.setContent_id(getContent_id());
		clone.setBusinesstitle(getBusinesstitle());
		clone.setBusinessDesc(getBusinessDesc());
		clone.setBusinessLink(getBusinessLink());
		clone.setFilepath(getFilepath());
		clone.setFilename(getFilename());
		clone.setCreatedDate(getCreatedDate());
		clone.setCreatedBy(getCreatedBy());
		clone.setModifiedDate(getModifiedDate());
		clone.setModifiedBy(getModifiedBy());
		clone.setFlag(getFlag());

		return clone;
	}

	@Override
	public int compareTo(businessmisdetails businessmisdetails) {
		int value = 0;

		value = DateUtil.compareTo(getCreatedDate(),
				businessmisdetails.getCreatedDate());

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

		if (!(obj instanceof businessmisdetailsClp)) {
			return false;
		}

		businessmisdetailsClp businessmisdetails = (businessmisdetailsClp)obj;

		long primaryKey = businessmisdetails.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", content_id=");
		sb.append(getContent_id());
		sb.append(", businesstitle=");
		sb.append(getBusinesstitle());
		sb.append(", businessDesc=");
		sb.append(getBusinessDesc());
		sb.append(", businessLink=");
		sb.append(getBusinessLink());
		sb.append(", filepath=");
		sb.append(getFilepath());
		sb.append(", filename=");
		sb.append(getFilename());
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
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.chola.businessmis.model.businessmisdetails");
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
			"<column><column-name>businesstitle</column-name><column-value><![CDATA[");
		sb.append(getBusinesstitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessDesc</column-name><column-value><![CDATA[");
		sb.append(getBusinessDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>businessLink</column-name><column-value><![CDATA[");
		sb.append(getBusinessLink());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>filepath</column-name><column-value><![CDATA[");
		sb.append(getFilepath());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>filename</column-name><column-value><![CDATA[");
		sb.append(getFilename());
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
	private String _businesstitle;
	private String _businessDesc;
	private String _businessLink;
	private String _filepath;
	private String _filename;
	private Date _createdDate;
	private String _createdBy;
	private Date _modifiedDate;
	private long _modifiedBy;
	private String _flag;
	private BaseModel<?> _businessmisdetailsRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}