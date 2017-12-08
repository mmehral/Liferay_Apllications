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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link InternalReference}.
 * </p>
 *
 * @author CloverLiferay03
 * @see InternalReference
 * @generated
 */
@ProviderType
public class InternalReferenceWrapper implements InternalReference,
	ModelWrapper<InternalReference> {
	public InternalReferenceWrapper(InternalReference internalReference) {
		_internalReference = internalReference;
	}

	@Override
	public Class<?> getModelClass() {
		return InternalReference.class;
	}

	@Override
	public String getModelClassName() {
		return InternalReference.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("refId", getRefId());
		attributes.put("title", getTitle());
		attributes.put("from", getFrom());
		attributes.put("to", getTo());
		attributes.put("body", getBody());
		attributes.put("flag", getFlag());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long refId = (Long)attributes.get("refId");

		if (refId != null) {
			setRefId(refId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String from = (String)attributes.get("from");

		if (from != null) {
			setFrom(from);
		}

		String to = (String)attributes.get("to");

		if (to != null) {
			setTo(to);
		}

		String body = (String)attributes.get("body");

		if (body != null) {
			setBody(body);
		}

		Long flag = (Long)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public InternalReference toEscapedModel() {
		return new InternalReferenceWrapper(_internalReference.toEscapedModel());
	}

	@Override
	public InternalReference toUnescapedModel() {
		return new InternalReferenceWrapper(_internalReference.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _internalReference.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _internalReference.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _internalReference.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _internalReference.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<InternalReference> toCacheModel() {
		return _internalReference.toCacheModel();
	}

	@Override
	public int compareTo(InternalReference internalReference) {
		return _internalReference.compareTo(internalReference);
	}

	@Override
	public int hashCode() {
		return _internalReference.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _internalReference.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new InternalReferenceWrapper((InternalReference)_internalReference.clone());
	}

	/**
	* Returns the body of this internal reference.
	*
	* @return the body of this internal reference
	*/
	@Override
	public java.lang.String getBody() {
		return _internalReference.getBody();
	}

	/**
	* Returns the from of this internal reference.
	*
	* @return the from of this internal reference
	*/
	@Override
	public java.lang.String getFrom() {
		return _internalReference.getFrom();
	}

	/**
	* Returns the title of this internal reference.
	*
	* @return the title of this internal reference
	*/
	@Override
	public java.lang.String getTitle() {
		return _internalReference.getTitle();
	}

	/**
	* Returns the to of this internal reference.
	*
	* @return the to of this internal reference
	*/
	@Override
	public java.lang.String getTo() {
		return _internalReference.getTo();
	}

	@Override
	public java.lang.String toString() {
		return _internalReference.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _internalReference.toXmlString();
	}

	/**
	* Returns the create date of this internal reference.
	*
	* @return the create date of this internal reference
	*/
	@Override
	public Date getCreateDate() {
		return _internalReference.getCreateDate();
	}

	/**
	* Returns the modified date of this internal reference.
	*
	* @return the modified date of this internal reference
	*/
	@Override
	public Date getModifiedDate() {
		return _internalReference.getModifiedDate();
	}

	/**
	* Returns the flag of this internal reference.
	*
	* @return the flag of this internal reference
	*/
	@Override
	public long getFlag() {
		return _internalReference.getFlag();
	}

	/**
	* Returns the primary key of this internal reference.
	*
	* @return the primary key of this internal reference
	*/
	@Override
	public long getPrimaryKey() {
		return _internalReference.getPrimaryKey();
	}

	/**
	* Returns the ref ID of this internal reference.
	*
	* @return the ref ID of this internal reference
	*/
	@Override
	public long getRefId() {
		return _internalReference.getRefId();
	}

	@Override
	public void persist() {
		_internalReference.persist();
	}

	/**
	* Sets the body of this internal reference.
	*
	* @param body the body of this internal reference
	*/
	@Override
	public void setBody(java.lang.String body) {
		_internalReference.setBody(body);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_internalReference.setCachedModel(cachedModel);
	}

	/**
	* Sets the create date of this internal reference.
	*
	* @param createDate the create date of this internal reference
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_internalReference.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_internalReference.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_internalReference.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_internalReference.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the flag of this internal reference.
	*
	* @param flag the flag of this internal reference
	*/
	@Override
	public void setFlag(long flag) {
		_internalReference.setFlag(flag);
	}

	/**
	* Sets the from of this internal reference.
	*
	* @param from the from of this internal reference
	*/
	@Override
	public void setFrom(java.lang.String from) {
		_internalReference.setFrom(from);
	}

	/**
	* Sets the modified date of this internal reference.
	*
	* @param modifiedDate the modified date of this internal reference
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_internalReference.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_internalReference.setNew(n);
	}

	/**
	* Sets the primary key of this internal reference.
	*
	* @param primaryKey the primary key of this internal reference
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_internalReference.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_internalReference.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the ref ID of this internal reference.
	*
	* @param refId the ref ID of this internal reference
	*/
	@Override
	public void setRefId(long refId) {
		_internalReference.setRefId(refId);
	}

	/**
	* Sets the title of this internal reference.
	*
	* @param title the title of this internal reference
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_internalReference.setTitle(title);
	}

	/**
	* Sets the to of this internal reference.
	*
	* @param to the to of this internal reference
	*/
	@Override
	public void setTo(java.lang.String to) {
		_internalReference.setTo(to);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InternalReferenceWrapper)) {
			return false;
		}

		InternalReferenceWrapper internalReferenceWrapper = (InternalReferenceWrapper)obj;

		if (Objects.equals(_internalReference,
					internalReferenceWrapper._internalReference)) {
			return true;
		}

		return false;
	}

	@Override
	public InternalReference getWrappedModel() {
		return _internalReference;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _internalReference.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _internalReference.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_internalReference.resetOriginalValues();
	}

	private final InternalReference _internalReference;
}