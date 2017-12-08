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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the contentuniqueinformation service. Represents a row in the &quot;chola_contentuniqueinformation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.chola.ppcontent.model.impl.contentuniqueinformationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.chola.ppcontent.model.impl.contentuniqueinformationImpl}.
 * </p>
 *
 * @author cloverliferay01
 * @see contentuniqueinformation
 * @see com.chola.ppcontent.model.impl.contentuniqueinformationImpl
 * @see com.chola.ppcontent.model.impl.contentuniqueinformationModelImpl
 * @generated
 */
@ProviderType
public interface contentuniqueinformationModel extends BaseModel<contentuniqueinformation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a contentuniqueinformation model instance should use the {@link contentuniqueinformation} interface instead.
	 */

	/**
	 * Returns the primary key of this contentuniqueinformation.
	 *
	 * @return the primary key of this contentuniqueinformation
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this contentuniqueinformation.
	 *
	 * @param primaryKey the primary key of this contentuniqueinformation
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this contentuniqueinformation.
	 *
	 * @return the ID of this contentuniqueinformation
	 */
	public long getId();

	/**
	 * Sets the ID of this contentuniqueinformation.
	 *
	 * @param id the ID of this contentuniqueinformation
	 */
	public void setId(long id);

	/**
	 * Returns the content_id of this contentuniqueinformation.
	 *
	 * @return the content_id of this contentuniqueinformation
	 */
	public long getContent_id();

	/**
	 * Sets the content_id of this contentuniqueinformation.
	 *
	 * @param content_id the content_id of this contentuniqueinformation
	 */
	public void setContent_id(long content_id);

	/**
	 * Returns the status of this contentuniqueinformation.
	 *
	 * @return the status of this contentuniqueinformation
	 */
	public long getStatus();

	/**
	 * Sets the status of this contentuniqueinformation.
	 *
	 * @param status the status of this contentuniqueinformation
	 */
	public void setStatus(long status);

	/**
	 * Returns the udflag of this contentuniqueinformation.
	 *
	 * @return the udflag of this contentuniqueinformation
	 */
	public long getUdflag();

	/**
	 * Sets the udflag of this contentuniqueinformation.
	 *
	 * @param udflag the udflag of this contentuniqueinformation
	 */
	public void setUdflag(long udflag);

	/**
	 * Returns the content_type of this contentuniqueinformation.
	 *
	 * @return the content_type of this contentuniqueinformation
	 */
	@AutoEscape
	public String getContent_type();

	/**
	 * Sets the content_type of this contentuniqueinformation.
	 *
	 * @param content_type the content_type of this contentuniqueinformation
	 */
	public void setContent_type(String content_type);

	/**
	 * Returns the notification_text of this contentuniqueinformation.
	 *
	 * @return the notification_text of this contentuniqueinformation
	 */
	@AutoEscape
	public String getNotification_text();

	/**
	 * Sets the notification_text of this contentuniqueinformation.
	 *
	 * @param notification_text the notification_text of this contentuniqueinformation
	 */
	public void setNotification_text(String notification_text);

	/**
	 * Returns the pageurl of this contentuniqueinformation.
	 *
	 * @return the pageurl of this contentuniqueinformation
	 */
	@AutoEscape
	public String getPageurl();

	/**
	 * Sets the pageurl of this contentuniqueinformation.
	 *
	 * @param pageurl the pageurl of this contentuniqueinformation
	 */
	public void setPageurl(String pageurl);

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
	public int compareTo(
		com.chola.ppcontent.model.contentuniqueinformation contentuniqueinformation);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.chola.ppcontent.model.contentuniqueinformation> toCacheModel();

	@Override
	public com.chola.ppcontent.model.contentuniqueinformation toEscapedModel();

	@Override
	public com.chola.ppcontent.model.contentuniqueinformation toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}