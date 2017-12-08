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

package com.chola.businessmis.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.businessmis.model.businessmisdetails;
import com.chola.businessmis.model.businessmisdetailsModel;
import com.chola.businessmis.model.businessmisdetailsSoap;

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
 * The base model implementation for the businessmisdetails service. Represents a row in the &quot;chola_businessmisdetails&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link businessmisdetailsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link businessmisdetailsImpl}.
 * </p>
 *
 * @author CloverLiferay01
 * @see businessmisdetailsImpl
 * @see businessmisdetails
 * @see businessmisdetailsModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class businessmisdetailsModelImpl extends BaseModelImpl<businessmisdetails>
	implements businessmisdetailsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a businessmisdetails model instance should use the {@link businessmisdetails} interface instead.
	 */
	public static final String TABLE_NAME = "chola_businessmisdetails";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "content_id", Types.BIGINT },
			{ "businesstitle", Types.VARCHAR },
			{ "businessDesc", Types.VARCHAR },
			{ "businessLink", Types.VARCHAR },
			{ "filepath", Types.VARCHAR },
			{ "filename", Types.VARCHAR },
			{ "createdDate", Types.TIMESTAMP },
			{ "createdBy", Types.VARCHAR },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "modifiedBy", Types.BIGINT },
			{ "flag", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("content_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("businesstitle", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("businessDesc", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("businessLink", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("filepath", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("filename", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createdDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("createdBy", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedBy", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("flag", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table chola_businessmisdetails (id_ LONG not null primary key,content_id LONG,businesstitle VARCHAR(100) null,businessDesc VARCHAR(200) null,businessLink VARCHAR(200) null,filepath VARCHAR(75) null,filename VARCHAR(75) null,createdDate DATE null,createdBy VARCHAR(75) null,modifiedDate DATE null,modifiedBy LONG,flag VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table chola_businessmisdetails";
	public static final String ORDER_BY_JPQL = " ORDER BY businessmisdetails.createdDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY chola_businessmisdetails.createdDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.chola.businessmis.model.businessmisdetails"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.chola.businessmis.model.businessmisdetails"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.chola.businessmis.model.businessmisdetails"),
			true);
	public static final long CONTENT_ID_COLUMN_BITMASK = 1L;
	public static final long CREATEDDATE_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static businessmisdetails toModel(businessmisdetailsSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		businessmisdetails model = new businessmisdetailsImpl();

		model.setId(soapModel.getId());
		model.setContent_id(soapModel.getContent_id());
		model.setBusinesstitle(soapModel.getBusinesstitle());
		model.setBusinessDesc(soapModel.getBusinessDesc());
		model.setBusinessLink(soapModel.getBusinessLink());
		model.setFilepath(soapModel.getFilepath());
		model.setFilename(soapModel.getFilename());
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
	public static List<businessmisdetails> toModels(
		businessmisdetailsSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<businessmisdetails> models = new ArrayList<businessmisdetails>(soapModels.length);

		for (businessmisdetailsSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.chola.businessmis.model.businessmisdetails"));

	public businessmisdetailsModelImpl() {
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
		return businessmisdetails.class;
	}

	@Override
	public String getModelClassName() {
		return businessmisdetails.class.getName();
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
	public String getBusinesstitle() {
		if (_businesstitle == null) {
			return StringPool.BLANK;
		}
		else {
			return _businesstitle;
		}
	}

	@Override
	public void setBusinesstitle(String businesstitle) {
		_businesstitle = businesstitle;
	}

	@JSON
	@Override
	public String getBusinessDesc() {
		if (_businessDesc == null) {
			return StringPool.BLANK;
		}
		else {
			return _businessDesc;
		}
	}

	@Override
	public void setBusinessDesc(String businessDesc) {
		_businessDesc = businessDesc;
	}

	@JSON
	@Override
	public String getBusinessLink() {
		if (_businessLink == null) {
			return StringPool.BLANK;
		}
		else {
			return _businessLink;
		}
	}

	@Override
	public void setBusinessLink(String businessLink) {
		_businessLink = businessLink;
	}

	@JSON
	@Override
	public String getFilepath() {
		if (_filepath == null) {
			return StringPool.BLANK;
		}
		else {
			return _filepath;
		}
	}

	@Override
	public void setFilepath(String filepath) {
		_filepath = filepath;
	}

	@JSON
	@Override
	public String getFilename() {
		if (_filename == null) {
			return StringPool.BLANK;
		}
		else {
			return _filename;
		}
	}

	@Override
	public void setFilename(String filename) {
		_filename = filename;
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
	public String getCreatedBy() {
		if (_createdBy == null) {
			return StringPool.BLANK;
		}
		else {
			return _createdBy;
		}
	}

	@Override
	public void setCreatedBy(String createdBy) {
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
			businessmisdetails.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public businessmisdetails toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (businessmisdetails)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		businessmisdetailsImpl businessmisdetailsImpl = new businessmisdetailsImpl();

		businessmisdetailsImpl.setId(getId());
		businessmisdetailsImpl.setContent_id(getContent_id());
		businessmisdetailsImpl.setBusinesstitle(getBusinesstitle());
		businessmisdetailsImpl.setBusinessDesc(getBusinessDesc());
		businessmisdetailsImpl.setBusinessLink(getBusinessLink());
		businessmisdetailsImpl.setFilepath(getFilepath());
		businessmisdetailsImpl.setFilename(getFilename());
		businessmisdetailsImpl.setCreatedDate(getCreatedDate());
		businessmisdetailsImpl.setCreatedBy(getCreatedBy());
		businessmisdetailsImpl.setModifiedDate(getModifiedDate());
		businessmisdetailsImpl.setModifiedBy(getModifiedBy());
		businessmisdetailsImpl.setFlag(getFlag());

		businessmisdetailsImpl.resetOriginalValues();

		return businessmisdetailsImpl;
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

		if (!(obj instanceof businessmisdetails)) {
			return false;
		}

		businessmisdetails businessmisdetails = (businessmisdetails)obj;

		long primaryKey = businessmisdetails.getPrimaryKey();

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
		businessmisdetailsModelImpl businessmisdetailsModelImpl = this;

		businessmisdetailsModelImpl._originalContent_id = businessmisdetailsModelImpl._content_id;

		businessmisdetailsModelImpl._setOriginalContent_id = false;

		businessmisdetailsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<businessmisdetails> toCacheModel() {
		businessmisdetailsCacheModel businessmisdetailsCacheModel = new businessmisdetailsCacheModel();

		businessmisdetailsCacheModel.id = getId();

		businessmisdetailsCacheModel.content_id = getContent_id();

		businessmisdetailsCacheModel.businesstitle = getBusinesstitle();

		String businesstitle = businessmisdetailsCacheModel.businesstitle;

		if ((businesstitle != null) && (businesstitle.length() == 0)) {
			businessmisdetailsCacheModel.businesstitle = null;
		}

		businessmisdetailsCacheModel.businessDesc = getBusinessDesc();

		String businessDesc = businessmisdetailsCacheModel.businessDesc;

		if ((businessDesc != null) && (businessDesc.length() == 0)) {
			businessmisdetailsCacheModel.businessDesc = null;
		}

		businessmisdetailsCacheModel.businessLink = getBusinessLink();

		String businessLink = businessmisdetailsCacheModel.businessLink;

		if ((businessLink != null) && (businessLink.length() == 0)) {
			businessmisdetailsCacheModel.businessLink = null;
		}

		businessmisdetailsCacheModel.filepath = getFilepath();

		String filepath = businessmisdetailsCacheModel.filepath;

		if ((filepath != null) && (filepath.length() == 0)) {
			businessmisdetailsCacheModel.filepath = null;
		}

		businessmisdetailsCacheModel.filename = getFilename();

		String filename = businessmisdetailsCacheModel.filename;

		if ((filename != null) && (filename.length() == 0)) {
			businessmisdetailsCacheModel.filename = null;
		}

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			businessmisdetailsCacheModel.createdDate = createdDate.getTime();
		}
		else {
			businessmisdetailsCacheModel.createdDate = Long.MIN_VALUE;
		}

		businessmisdetailsCacheModel.createdBy = getCreatedBy();

		String createdBy = businessmisdetailsCacheModel.createdBy;

		if ((createdBy != null) && (createdBy.length() == 0)) {
			businessmisdetailsCacheModel.createdBy = null;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			businessmisdetailsCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			businessmisdetailsCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		businessmisdetailsCacheModel.modifiedBy = getModifiedBy();

		businessmisdetailsCacheModel.flag = getFlag();

		String flag = businessmisdetailsCacheModel.flag;

		if ((flag != null) && (flag.length() == 0)) {
			businessmisdetailsCacheModel.flag = null;
		}

		return businessmisdetailsCacheModel;
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

	private static final ClassLoader _classLoader = businessmisdetails.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			businessmisdetails.class
		};
	private long _id;
	private long _content_id;
	private long _originalContent_id;
	private boolean _setOriginalContent_id;
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
	private long _columnBitmask;
	private businessmisdetails _escapedModel;
}