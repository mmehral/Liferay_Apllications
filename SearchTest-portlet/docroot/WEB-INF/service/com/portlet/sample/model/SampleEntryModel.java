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

package com.portlet.sample.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the SampleEntry service. Represents a row in the &quot;Sample_SampleEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.portlet.sample.model.impl.SampleEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.portlet.sample.model.impl.SampleEntryImpl}.
 * </p>
 *
 * @author CloverLiferay01
 * @see SampleEntry
 * @see com.portlet.sample.model.impl.SampleEntryImpl
 * @see com.portlet.sample.model.impl.SampleEntryModelImpl
 * @generated
 */
@ProviderType
public interface SampleEntryModel extends BaseModel<SampleEntry>, GroupedModel,
	ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sample entry model instance should use the {@link SampleEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this sample entry.
	 *
	 * @return the primary key of this sample entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sample entry.
	 *
	 * @param primaryKey the primary key of this sample entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this sample entry.
	 *
	 * @return the uuid of this sample entry
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this sample entry.
	 *
	 * @param uuid the uuid of this sample entry
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the entry ID of this sample entry.
	 *
	 * @return the entry ID of this sample entry
	 */
	public long getEntryId();

	/**
	 * Sets the entry ID of this sample entry.
	 *
	 * @param entryId the entry ID of this sample entry
	 */
	public void setEntryId(long entryId);

	/**
	 * Returns the company ID of this sample entry.
	 *
	 * @return the company ID of this sample entry
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this sample entry.
	 *
	 * @param companyId the company ID of this sample entry
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this sample entry.
	 *
	 * @return the group ID of this sample entry
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this sample entry.
	 *
	 * @param groupId the group ID of this sample entry
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this sample entry.
	 *
	 * @return the user ID of this sample entry
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this sample entry.
	 *
	 * @param userId the user ID of this sample entry
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this sample entry.
	 *
	 * @return the user uuid of this sample entry
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this sample entry.
	 *
	 * @param userUuid the user uuid of this sample entry
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this sample entry.
	 *
	 * @return the user name of this sample entry
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this sample entry.
	 *
	 * @param userName the user name of this sample entry
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the title of this sample entry.
	 *
	 * @return the title of this sample entry
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this sample entry.
	 *
	 * @param title the title of this sample entry
	 */
	public void setTitle(String title);

	/**
	 * Returns the content of this sample entry.
	 *
	 * @return the content of this sample entry
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this sample entry.
	 *
	 * @param content the content of this sample entry
	 */
	public void setContent(String content);

	/**
	 * Returns the create date of this sample entry.
	 *
	 * @return the create date of this sample entry
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this sample entry.
	 *
	 * @param createDate the create date of this sample entry
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this sample entry.
	 *
	 * @return the modified date of this sample entry
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this sample entry.
	 *
	 * @param modifiedDate the modified date of this sample entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the status of this sample entry.
	 *
	 * @return the status of this sample entry
	 */
	public boolean getStatus();

	/**
	 * Returns <code>true</code> if this sample entry is status.
	 *
	 * @return <code>true</code> if this sample entry is status; <code>false</code> otherwise
	 */
	public boolean isStatus();

	/**
	 * Sets whether this sample entry is status.
	 *
	 * @param status the status of this sample entry
	 */
	public void setStatus(boolean status);

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
	public int compareTo(SampleEntry sampleEntry);

	@Override
	public int hashCode();

	@Override
	public CacheModel<SampleEntry> toCacheModel();

	@Override
	public SampleEntry toEscapedModel();

	@Override
	public SampleEntry toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}