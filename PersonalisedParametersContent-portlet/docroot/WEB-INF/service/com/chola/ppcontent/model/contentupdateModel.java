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

package com.chola.ppcontent.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the contentupdate service. Represents a row in the &quot;chola_contentupdate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.chola.ppcontent.model.impl.contentupdateModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.chola.ppcontent.model.impl.contentupdateImpl}.
 * </p>
 *
 * @author cloverliferay01
 * @see contentupdate
 * @see com.chola.ppcontent.model.impl.contentupdateImpl
 * @see com.chola.ppcontent.model.impl.contentupdateModelImpl
 * @generated
 */
@ProviderType
public interface contentupdateModel extends BaseModel<contentupdate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a contentupdate model instance should use the {@link contentupdate} interface instead.
	 */

	/**
	 * Returns the primary key of this contentupdate.
	 *
	 * @return the primary key of this contentupdate
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this contentupdate.
	 *
	 * @param primaryKey the primary key of this contentupdate
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this contentupdate.
	 *
	 * @return the ID of this contentupdate
	 */
	public long getId();

	/**
	 * Sets the ID of this contentupdate.
	 *
	 * @param id the ID of this contentupdate
	 */
	public void setId(long id);

	/**
	 * Returns the content_id of this contentupdate.
	 *
	 * @return the content_id of this contentupdate
	 */
	public long getContent_id();

	/**
	 * Sets the content_id of this contentupdate.
	 *
	 * @param content_id the content_id of this contentupdate
	 */
	public void setContent_id(long content_id);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.chola.ppcontent.model.contentupdate contentupdate);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.chola.ppcontent.model.contentupdate> toCacheModel();

	@Override
	public com.chola.ppcontent.model.contentupdate toEscapedModel();

	@Override
	public com.chola.ppcontent.model.contentupdate toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}