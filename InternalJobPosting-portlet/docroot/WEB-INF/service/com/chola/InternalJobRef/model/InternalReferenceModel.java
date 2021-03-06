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

package com.chola.InternalJobRef.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the InternalReference service. Represents a row in the &quot;empp_InternalReference&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.chola.InternalJobRef.model.impl.InternalReferenceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.chola.InternalJobRef.model.impl.InternalReferenceImpl}.
 * </p>
 *
 * @author CloverLiferay03
 * @see InternalReference
 * @see com.chola.InternalJobRef.model.impl.InternalReferenceImpl
 * @see com.chola.InternalJobRef.model.impl.InternalReferenceModelImpl
 * @generated
 */
@ProviderType
public interface InternalReferenceModel extends BaseModel<InternalReference> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a internal reference model instance should use the {@link InternalReference} interface instead.
	 */

	/**
	 * Returns the primary key of this internal reference.
	 *
	 * @return the primary key of this internal reference
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this internal reference.
	 *
	 * @param primaryKey the primary key of this internal reference
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ref ID of this internal reference.
	 *
	 * @return the ref ID of this internal reference
	 */
	public long getRefId();

	/**
	 * Sets the ref ID of this internal reference.
	 *
	 * @param refId the ref ID of this internal reference
	 */
	public void setRefId(long refId);

	/**
	 * Returns the title of this internal reference.
	 *
	 * @return the title of this internal reference
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this internal reference.
	 *
	 * @param title the title of this internal reference
	 */
	public void setTitle(String title);

	/**
	 * Returns the from of this internal reference.
	 *
	 * @return the from of this internal reference
	 */
	@AutoEscape
	public String getFrom();

	/**
	 * Sets the from of this internal reference.
	 *
	 * @param from the from of this internal reference
	 */
	public void setFrom(String from);

	/**
	 * Returns the to of this internal reference.
	 *
	 * @return the to of this internal reference
	 */
	@AutoEscape
	public String getTo();

	/**
	 * Sets the to of this internal reference.
	 *
	 * @param to the to of this internal reference
	 */
	public void setTo(String to);

	/**
	 * Returns the body of this internal reference.
	 *
	 * @return the body of this internal reference
	 */
	@AutoEscape
	public String getBody();

	/**
	 * Sets the body of this internal reference.
	 *
	 * @param body the body of this internal reference
	 */
	public void setBody(String body);

	/**
	 * Returns the flag of this internal reference.
	 *
	 * @return the flag of this internal reference
	 */
	public long getFlag();

	/**
	 * Sets the flag of this internal reference.
	 *
	 * @param flag the flag of this internal reference
	 */
	public void setFlag(long flag);

	/**
	 * Returns the create date of this internal reference.
	 *
	 * @return the create date of this internal reference
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this internal reference.
	 *
	 * @param createDate the create date of this internal reference
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this internal reference.
	 *
	 * @return the modified date of this internal reference
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this internal reference.
	 *
	 * @param modifiedDate the modified date of this internal reference
	 */
	public void setModifiedDate(Date modifiedDate);

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
	public int compareTo(InternalReference internalReference);

	@Override
	public int hashCode();

	@Override
	public CacheModel<InternalReference> toCacheModel();

	@Override
	public InternalReference toEscapedModel();

	@Override
	public InternalReference toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}