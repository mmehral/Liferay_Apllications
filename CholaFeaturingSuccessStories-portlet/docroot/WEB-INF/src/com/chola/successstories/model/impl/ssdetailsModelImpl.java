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

package com.chola.successstories.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.successstories.model.ssdetails;
import com.chola.successstories.model.ssdetailsModel;
import com.chola.successstories.model.ssdetailsSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the ssdetails service. Represents a row in the &quot;chola_ssdetails&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ssdetailsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ssdetailsImpl}.
 * </p>
 *
 * @author cloverliferay01
 * @see ssdetailsImpl
 * @see ssdetails
 * @see ssdetailsModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class ssdetailsModelImpl extends BaseModelImpl<ssdetails>
	implements ssdetailsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ssdetails model instance should use the {@link ssdetails} interface instead.
	 */
	public static final String TABLE_NAME = "chola_ssdetails";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "content_id", Types.BIGINT },
			{ "sstitle", Types.VARCHAR },
			{ "ssdesc", Types.VARCHAR },
			{ "createdDate", Types.TIMESTAMP },
			{ "createdBy", Types.BIGINT },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "modifiedBy", Types.BIGINT },
			{ "flag", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("content_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("sstitle", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("ssdesc", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createdDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("createdBy", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedBy", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("flag", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table chola_ssdetails (id_ LONG not null primary key,content_id LONG,sstitle VARCHAR(100) null,ssdesc VARCHAR(200) null,createdDate DATE null,createdBy LONG,modifiedDate DATE null,modifiedBy LONG,flag VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table chola_ssdetails";
	public static final String ORDER_BY_JPQL = " ORDER BY ssdetails.createdDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY chola_ssdetails.createdDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.chola.successstories.model.ssdetails"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.chola.successstories.model.ssdetails"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.chola.successstories.model.ssdetails"),
			true);
	public static final long CONTENT_ID_COLUMN_BITMASK = 1L;
	public static final long CREATEDDATE_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ssdetails toModel(ssdetailsSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		ssdetails model = new ssdetailsImpl();

		model.setId(soapModel.getId());
		model.setContent_id(soapModel.getContent_id());
		model.setSstitle(soapModel.getSstitle());
		model.setSsdesc(soapModel.getSsdesc());
		model.setCreatedDate(soapModel.getCreatedDate());
		model.setCreatedBy(soapModel.getCreatedBy());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setModifiedBy(soapModel.getModifiedBy());
		model.setFlag(soapModel.getFlag());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ssdetails> toModels(ssdetailsSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<ssdetails> models = new ArrayList<ssdetails>(soapModels.length);

		for (ssdetailsSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.chola.successstories.model.ssdetails"));

	public ssdetailsModelImpl() {
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
	public Class<?> getModelClass() {
		return ssdetails.class;
	}

	@Override
	public String getModelClassName() {
		return ssdetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("content_id", getContent_id());
		attributes.put("sstitle", getSstitle());
		attributes.put("ssdesc", getSsdesc());
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

		String sstitle = (String)attributes.get("sstitle");

		if (sstitle != null) {
			setSstitle(sstitle);
		}

		String ssdesc = (String)attributes.get("ssdesc");

		if (ssdesc != null) {
			setSsdesc(ssdesc);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long createdBy = (Long)attributes.get("createdBy");

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
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@JSON
	@Override
	public long getContent_id() {
		return _content_id;
	}

	@Override
	public void setContent_id(long content_id) {
		_columnBitmask |= CONTENT_ID_COLUMN_BITMASK;

		if (!_setOriginalContent_id) {
			_setOriginalContent_id = true;

			_originalContent_id = _content_id;
		}

		_content_id = content_id;
	}

	public long getOriginalContent_id() {
		return _originalContent_id;
	}

	@JSON
	@Override
	public String getSstitle() {
		if (_sstitle == null) {
			return StringPool.BLANK;
		}
		else {
			return _sstitle;
		}
	}

	@Override
	public void setSstitle(String sstitle) {
		_sstitle = sstitle;
	}

	@JSON
	@Override
	public String getSsdesc() {
		if (_ssdesc == null) {
			return StringPool.BLANK;
		}
		else {
			return _ssdesc;
		}
	}

	@Override
	public void setSsdesc(String ssdesc) {
		_ssdesc = ssdesc;
	}

	@JSON
	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_columnBitmask = -1L;

		_createdDate = createdDate;
	}

	@JSON
	@Override
	public long getCreatedBy() {
		return _createdBy;
	}

	@Override
	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getModifiedBy() {
		return _modifiedBy;
	}

	@Override
	public void setModifiedBy(long modifiedBy) {
		_modifiedBy = modifiedBy;
	}

	@JSON
	@Override
	public String getFlag() {
		if (_flag == null) {
			return StringPool.BLANK;
		}
		else {
			return _flag;
		}
	}

	@Override
	public void setFlag(String flag) {
		_flag = flag;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			ssdetails.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ssdetails toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ssdetails)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ssdetailsImpl ssdetailsImpl = new ssdetailsImpl();

		ssdetailsImpl.setId(getId());
		ssdetailsImpl.setContent_id(getContent_id());
		ssdetailsImpl.setSstitle(getSstitle());
		ssdetailsImpl.setSsdesc(getSsdesc());
		ssdetailsImpl.setCreatedDate(getCreatedDate());
		ssdetailsImpl.setCreatedBy(getCreatedBy());
		ssdetailsImpl.setModifiedDate(getModifiedDate());
		ssdetailsImpl.setModifiedBy(getModifiedBy());
		ssdetailsImpl.setFlag(getFlag());

		ssdetailsImpl.resetOriginalValues();

		return ssdetailsImpl;
	}

	@Override
	public int compareTo(ssdetails ssdetails) {
		int value = 0;

		value = DateUtil.compareTo(getCreatedDate(), ssdetails.getCreatedDate());

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

		if (!(obj instanceof ssdetails)) {
			return false;
		}

		ssdetails ssdetails = (ssdetails)obj;

		long primaryKey = ssdetails.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		ssdetailsModelImpl ssdetailsModelImpl = this;

		ssdetailsModelImpl._originalContent_id = ssdetailsModelImpl._content_id;

		ssdetailsModelImpl._setOriginalContent_id = false;

		ssdetailsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ssdetails> toCacheModel() {
		ssdetailsCacheModel ssdetailsCacheModel = new ssdetailsCacheModel();

		ssdetailsCacheModel.id = getId();

		ssdetailsCacheModel.content_id = getContent_id();

		ssdetailsCacheModel.sstitle = getSstitle();

		String sstitle = ssdetailsCacheModel.sstitle;

		if ((sstitle != null) && (sstitle.length() == 0)) {
			ssdetailsCacheModel.sstitle = null;
		}

		ssdetailsCacheModel.ssdesc = getSsdesc();

		String ssdesc = ssdetailsCacheModel.ssdesc;

		if ((ssdesc != null) && (ssdesc.length() == 0)) {
			ssdetailsCacheModel.ssdesc = null;
		}

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			ssdetailsCacheModel.createdDate = createdDate.getTime();
		}
		else {
			ssdetailsCacheModel.createdDate = Long.MIN_VALUE;
		}

		ssdetailsCacheModel.createdBy = getCreatedBy();

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			ssdetailsCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			ssdetailsCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		ssdetailsCacheModel.modifiedBy = getModifiedBy();

		ssdetailsCacheModel.flag = getFlag();

		String flag = ssdetailsCacheModel.flag;

		if ((flag != null) && (flag.length() == 0)) {
			ssdetailsCacheModel.flag = null;
		}

		return ssdetailsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", content_id=");
		sb.append(getContent_id());
		sb.append(", sstitle=");
		sb.append(getSstitle());
		sb.append(", ssdesc=");
		sb.append(getSsdesc());
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
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.chola.successstories.model.ssdetails");
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
			"<column><column-name>sstitle</column-name><column-value><![CDATA[");
		sb.append(getSstitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ssdesc</column-name><column-value><![CDATA[");
		sb.append(getSsdesc());
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

	private static final ClassLoader _classLoader = ssdetails.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			ssdetails.class
		};
	private long _id;
	private long _content_id;
	private long _originalContent_id;
	private boolean _setOriginalContent_id;
	private String _sstitle;
	private String _ssdesc;
	private Date _createdDate;
	private long _createdBy;
	private Date _modifiedDate;
	private long _modifiedBy;
	private String _flag;
	private long _columnBitmask;
	private ssdetails _escapedModel;
}