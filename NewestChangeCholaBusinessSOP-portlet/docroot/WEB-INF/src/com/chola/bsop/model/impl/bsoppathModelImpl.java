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

package com.chola.bsop.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.bsop.model.bsoppath;
import com.chola.bsop.model.bsoppathModel;
import com.chola.bsop.model.bsoppathSoap;

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

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the bsoppath service. Represents a row in the &quot;chola_bsoppath&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link bsoppathModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link bsoppathImpl}.
 * </p>
 *
 * @author cloverliferay01
 * @see bsoppathImpl
 * @see bsoppath
 * @see bsoppathModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class bsoppathModelImpl extends BaseModelImpl<bsoppath>
	implements bsoppathModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a bsoppath model instance should use the {@link bsoppath} interface instead.
	 */
	public static final String TABLE_NAME = "chola_bsoppath";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "bdoc", Types.VARCHAR },
			{ "bpath", Types.VARCHAR },
			{ "createddate", Types.TIMESTAMP },
			{ "createdby", Types.VARCHAR },
			{ "flag", Types.VARCHAR },
			{ "bdetails_id", Types.BIGINT },
			{ "bdetailscontent_id", Types.BIGINT },
			{ "filename", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("bdoc", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("bpath", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createddate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("createdby", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("flag", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("bdetails_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("bdetailscontent_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("filename", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table chola_bsoppath (id_ LONG not null primary key,bdoc VARCHAR(500) null,bpath VARCHAR(500) null,createddate DATE null,createdby VARCHAR(75) null,flag VARCHAR(75) null,bdetails_id LONG,bdetailscontent_id LONG,filename VARCHAR(500) null)";
	public static final String TABLE_SQL_DROP = "drop table chola_bsoppath";
	public static final String ORDER_BY_JPQL = " ORDER BY bsoppath.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY chola_bsoppath.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.chola.bsop.model.bsoppath"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.chola.bsop.model.bsoppath"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.chola.bsop.model.bsoppath"),
			true);
	public static final long BDETAILS_ID_COLUMN_BITMASK = 1L;
	public static final long BDETAILSCONTENT_ID_COLUMN_BITMASK = 2L;
	public static final long ID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static bsoppath toModel(bsoppathSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		bsoppath model = new bsoppathImpl();

		model.setId(soapModel.getId());
		model.setBdoc(soapModel.getBdoc());
		model.setBpath(soapModel.getBpath());
		model.setCreateddate(soapModel.getCreateddate());
		model.setCreatedby(soapModel.getCreatedby());
		model.setFlag(soapModel.getFlag());
		model.setBdetails_id(soapModel.getBdetails_id());
		model.setBdetailscontent_id(soapModel.getBdetailscontent_id());
		model.setFilename(soapModel.getFilename());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<bsoppath> toModels(bsoppathSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<bsoppath> models = new ArrayList<bsoppath>(soapModels.length);

		for (bsoppathSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.chola.bsop.model.bsoppath"));

	public bsoppathModelImpl() {
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
		return bsoppath.class;
	}

	@Override
	public String getModelClassName() {
		return bsoppath.class.getName();
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
	public String getBdoc() {
		if (_bdoc == null) {
			return StringPool.BLANK;
		}
		else {
			return _bdoc;
		}
	}

	@Override
	public void setBdoc(String bdoc) {
		_bdoc = bdoc;
	}

	@JSON
	@Override
	public String getBpath() {
		if (_bpath == null) {
			return StringPool.BLANK;
		}
		else {
			return _bpath;
		}
	}

	@Override
	public void setBpath(String bpath) {
		_bpath = bpath;
	}

	@JSON
	@Override
	public Date getCreateddate() {
		return _createddate;
	}

	@Override
	public void setCreateddate(Date createddate) {
		_createddate = createddate;
	}

	@JSON
	@Override
	public String getCreatedby() {
		if (_createdby == null) {
			return StringPool.BLANK;
		}
		else {
			return _createdby;
		}
	}

	@Override
	public void setCreatedby(String createdby) {
		_createdby = createdby;
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

	@JSON
	@Override
	public long getBdetails_id() {
		return _bdetails_id;
	}

	@Override
	public void setBdetails_id(long bdetails_id) {
		_columnBitmask |= BDETAILS_ID_COLUMN_BITMASK;

		if (!_setOriginalBdetails_id) {
			_setOriginalBdetails_id = true;

			_originalBdetails_id = _bdetails_id;
		}

		_bdetails_id = bdetails_id;
	}

	public long getOriginalBdetails_id() {
		return _originalBdetails_id;
	}

	@JSON
	@Override
	public long getBdetailscontent_id() {
		return _bdetailscontent_id;
	}

	@Override
	public void setBdetailscontent_id(long bdetailscontent_id) {
		_columnBitmask |= BDETAILSCONTENT_ID_COLUMN_BITMASK;

		if (!_setOriginalBdetailscontent_id) {
			_setOriginalBdetailscontent_id = true;

			_originalBdetailscontent_id = _bdetailscontent_id;
		}

		_bdetailscontent_id = bdetailscontent_id;
	}

	public long getOriginalBdetailscontent_id() {
		return _originalBdetailscontent_id;
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			bsoppath.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public bsoppath toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (bsoppath)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		bsoppathImpl bsoppathImpl = new bsoppathImpl();

		bsoppathImpl.setId(getId());
		bsoppathImpl.setBdoc(getBdoc());
		bsoppathImpl.setBpath(getBpath());
		bsoppathImpl.setCreateddate(getCreateddate());
		bsoppathImpl.setCreatedby(getCreatedby());
		bsoppathImpl.setFlag(getFlag());
		bsoppathImpl.setBdetails_id(getBdetails_id());
		bsoppathImpl.setBdetailscontent_id(getBdetailscontent_id());
		bsoppathImpl.setFilename(getFilename());

		bsoppathImpl.resetOriginalValues();

		return bsoppathImpl;
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

		if (!(obj instanceof bsoppath)) {
			return false;
		}

		bsoppath bsoppath = (bsoppath)obj;

		long primaryKey = bsoppath.getPrimaryKey();

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
		bsoppathModelImpl bsoppathModelImpl = this;

		bsoppathModelImpl._originalBdetails_id = bsoppathModelImpl._bdetails_id;

		bsoppathModelImpl._setOriginalBdetails_id = false;

		bsoppathModelImpl._originalBdetailscontent_id = bsoppathModelImpl._bdetailscontent_id;

		bsoppathModelImpl._setOriginalBdetailscontent_id = false;

		bsoppathModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<bsoppath> toCacheModel() {
		bsoppathCacheModel bsoppathCacheModel = new bsoppathCacheModel();

		bsoppathCacheModel.id = getId();

		bsoppathCacheModel.bdoc = getBdoc();

		String bdoc = bsoppathCacheModel.bdoc;

		if ((bdoc != null) && (bdoc.length() == 0)) {
			bsoppathCacheModel.bdoc = null;
		}

		bsoppathCacheModel.bpath = getBpath();

		String bpath = bsoppathCacheModel.bpath;

		if ((bpath != null) && (bpath.length() == 0)) {
			bsoppathCacheModel.bpath = null;
		}

		Date createddate = getCreateddate();

		if (createddate != null) {
			bsoppathCacheModel.createddate = createddate.getTime();
		}
		else {
			bsoppathCacheModel.createddate = Long.MIN_VALUE;
		}

		bsoppathCacheModel.createdby = getCreatedby();

		String createdby = bsoppathCacheModel.createdby;

		if ((createdby != null) && (createdby.length() == 0)) {
			bsoppathCacheModel.createdby = null;
		}

		bsoppathCacheModel.flag = getFlag();

		String flag = bsoppathCacheModel.flag;

		if ((flag != null) && (flag.length() == 0)) {
			bsoppathCacheModel.flag = null;
		}

		bsoppathCacheModel.bdetails_id = getBdetails_id();

		bsoppathCacheModel.bdetailscontent_id = getBdetailscontent_id();

		bsoppathCacheModel.filename = getFilename();

		String filename = bsoppathCacheModel.filename;

		if ((filename != null) && (filename.length() == 0)) {
			bsoppathCacheModel.filename = null;
		}

		return bsoppathCacheModel;
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

	private static final ClassLoader _classLoader = bsoppath.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			bsoppath.class
		};
	private long _id;
	private String _bdoc;
	private String _bpath;
	private Date _createddate;
	private String _createdby;
	private String _flag;
	private long _bdetails_id;
	private long _originalBdetails_id;
	private boolean _setOriginalBdetails_id;
	private long _bdetailscontent_id;
	private long _originalBdetailscontent_id;
	private boolean _setOriginalBdetailscontent_id;
	private String _filename;
	private long _columnBitmask;
	private bsoppath _escapedModel;
}