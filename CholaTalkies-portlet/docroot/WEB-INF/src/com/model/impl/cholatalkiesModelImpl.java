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

package com.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.model.cholatalkies;
import com.model.cholatalkiesModel;
import com.model.cholatalkiesSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the cholatalkies service. Represents a row in the &quot;CholaT_cholatalkies&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link cholatalkiesModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link cholatalkiesImpl}.
 * </p>
 *
 * @author adms.java1
 * @see cholatalkiesImpl
 * @see cholatalkies
 * @see cholatalkiesModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class cholatalkiesModelImpl extends BaseModelImpl<cholatalkies>
	implements cholatalkiesModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a cholatalkies model instance should use the {@link cholatalkies} interface instead.
	 */
	public static final String TABLE_NAME = "CholaT_cholatalkies";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "content_id", Types.BIGINT },
			{ "videoName", Types.VARCHAR },
			{ "videoDesc", Types.VARCHAR },
			{ "videoId", Types.VARCHAR },
			{ "createdDate", Types.TIMESTAMP },
			{ "createdBy", Types.VARCHAR },
			{ "flag", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("content_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("videoName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("videoDesc", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("videoId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createdDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("createdBy", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("flag", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table CholaT_cholatalkies (id_ LONG not null primary key,content_id LONG,videoName VARCHAR(100) null,videoDesc VARCHAR(200) null,videoId VARCHAR(75) null,createdDate DATE null,createdBy VARCHAR(75) null,flag VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table CholaT_cholatalkies";
	public static final String ORDER_BY_JPQL = " ORDER BY cholatalkies.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CholaT_cholatalkies.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.model.cholatalkies"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.model.cholatalkies"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.model.cholatalkies"),
			true);
	public static final long CONTENT_ID_COLUMN_BITMASK = 1L;
	public static final long ID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static cholatalkies toModel(cholatalkiesSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		cholatalkies model = new cholatalkiesImpl();

		model.setId(soapModel.getId());
		model.setContent_id(soapModel.getContent_id());
		model.setVideoName(soapModel.getVideoName());
		model.setVideoDesc(soapModel.getVideoDesc());
		model.setVideoId(soapModel.getVideoId());
		model.setCreatedDate(soapModel.getCreatedDate());
		model.setCreatedBy(soapModel.getCreatedBy());
		model.setFlag(soapModel.getFlag());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<cholatalkies> toModels(cholatalkiesSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<cholatalkies> models = new ArrayList<cholatalkies>(soapModels.length);

		for (cholatalkiesSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.model.cholatalkies"));

	public cholatalkiesModelImpl() {
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
		return cholatalkies.class;
	}

	@Override
	public String getModelClassName() {
		return cholatalkies.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("content_id", getContent_id());
		attributes.put("videoName", getVideoName());
		attributes.put("videoDesc", getVideoDesc());
		attributes.put("videoId", getVideoId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdBy", getCreatedBy());
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

		String videoName = (String)attributes.get("videoName");

		if (videoName != null) {
			setVideoName(videoName);
		}

		String videoDesc = (String)attributes.get("videoDesc");

		if (videoDesc != null) {
			setVideoDesc(videoDesc);
		}

		String videoId = (String)attributes.get("videoId");

		if (videoId != null) {
			setVideoId(videoId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String createdBy = (String)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
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
	public String getVideoName() {
		if (_videoName == null) {
			return StringPool.BLANK;
		}
		else {
			return _videoName;
		}
	}

	@Override
	public void setVideoName(String videoName) {
		_videoName = videoName;
	}

	@JSON
	@Override
	public String getVideoDesc() {
		if (_videoDesc == null) {
			return StringPool.BLANK;
		}
		else {
			return _videoDesc;
		}
	}

	@Override
	public void setVideoDesc(String videoDesc) {
		_videoDesc = videoDesc;
	}

	@JSON
	@Override
	public String getVideoId() {
		if (_videoId == null) {
			return StringPool.BLANK;
		}
		else {
			return _videoId;
		}
	}

	@Override
	public void setVideoId(String videoId) {
		_videoId = videoId;
	}

	@JSON
	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
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
			cholatalkies.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public cholatalkies toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (cholatalkies)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		cholatalkiesImpl cholatalkiesImpl = new cholatalkiesImpl();

		cholatalkiesImpl.setId(getId());
		cholatalkiesImpl.setContent_id(getContent_id());
		cholatalkiesImpl.setVideoName(getVideoName());
		cholatalkiesImpl.setVideoDesc(getVideoDesc());
		cholatalkiesImpl.setVideoId(getVideoId());
		cholatalkiesImpl.setCreatedDate(getCreatedDate());
		cholatalkiesImpl.setCreatedBy(getCreatedBy());
		cholatalkiesImpl.setFlag(getFlag());

		cholatalkiesImpl.resetOriginalValues();

		return cholatalkiesImpl;
	}

	@Override
	public int compareTo(cholatalkies cholatalkies) {
		long primaryKey = cholatalkies.getPrimaryKey();

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

		if (!(obj instanceof cholatalkies)) {
			return false;
		}

		cholatalkies cholatalkies = (cholatalkies)obj;

		long primaryKey = cholatalkies.getPrimaryKey();

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
		cholatalkiesModelImpl cholatalkiesModelImpl = this;

		cholatalkiesModelImpl._originalContent_id = cholatalkiesModelImpl._content_id;

		cholatalkiesModelImpl._setOriginalContent_id = false;

		cholatalkiesModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<cholatalkies> toCacheModel() {
		cholatalkiesCacheModel cholatalkiesCacheModel = new cholatalkiesCacheModel();

		cholatalkiesCacheModel.id = getId();

		cholatalkiesCacheModel.content_id = getContent_id();

		cholatalkiesCacheModel.videoName = getVideoName();

		String videoName = cholatalkiesCacheModel.videoName;

		if ((videoName != null) && (videoName.length() == 0)) {
			cholatalkiesCacheModel.videoName = null;
		}

		cholatalkiesCacheModel.videoDesc = getVideoDesc();

		String videoDesc = cholatalkiesCacheModel.videoDesc;

		if ((videoDesc != null) && (videoDesc.length() == 0)) {
			cholatalkiesCacheModel.videoDesc = null;
		}

		cholatalkiesCacheModel.videoId = getVideoId();

		String videoId = cholatalkiesCacheModel.videoId;

		if ((videoId != null) && (videoId.length() == 0)) {
			cholatalkiesCacheModel.videoId = null;
		}

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			cholatalkiesCacheModel.createdDate = createdDate.getTime();
		}
		else {
			cholatalkiesCacheModel.createdDate = Long.MIN_VALUE;
		}

		cholatalkiesCacheModel.createdBy = getCreatedBy();

		String createdBy = cholatalkiesCacheModel.createdBy;

		if ((createdBy != null) && (createdBy.length() == 0)) {
			cholatalkiesCacheModel.createdBy = null;
		}

		cholatalkiesCacheModel.flag = getFlag();

		String flag = cholatalkiesCacheModel.flag;

		if ((flag != null) && (flag.length() == 0)) {
			cholatalkiesCacheModel.flag = null;
		}

		return cholatalkiesCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", content_id=");
		sb.append(getContent_id());
		sb.append(", videoName=");
		sb.append(getVideoName());
		sb.append(", videoDesc=");
		sb.append(getVideoDesc());
		sb.append(", videoId=");
		sb.append(getVideoId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", createdBy=");
		sb.append(getCreatedBy());
		sb.append(", flag=");
		sb.append(getFlag());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.model.cholatalkies");
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
			"<column><column-name>videoName</column-name><column-value><![CDATA[");
		sb.append(getVideoName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>videoDesc</column-name><column-value><![CDATA[");
		sb.append(getVideoDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>videoId</column-name><column-value><![CDATA[");
		sb.append(getVideoId());
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
			"<column><column-name>flag</column-name><column-value><![CDATA[");
		sb.append(getFlag());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = cholatalkies.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			cholatalkies.class
		};
	private long _id;
	private long _content_id;
	private long _originalContent_id;
	private boolean _setOriginalContent_id;
	private String _videoName;
	private String _videoDesc;
	private String _videoId;
	private Date _createdDate;
	private String _createdBy;
	private String _flag;
	private long _columnBitmask;
	private cholatalkies _escapedModel;
}