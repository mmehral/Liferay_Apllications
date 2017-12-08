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

package com.chola.book.model;

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
 * This class is a wrapper for {@link bookdetails}.
 * </p>
 *
 * @author CloverLiferay02
 * @see bookdetails
 * @generated
 */
@ProviderType
public class bookdetailsWrapper implements bookdetails,
	ModelWrapper<bookdetails> {
	public bookdetailsWrapper(bookdetails bookdetails) {
		_bookdetails = bookdetails;
	}

	@Override
	public Class<?> getModelClass() {
		return bookdetails.class;
	}

	@Override
	public String getModelClassName() {
		return bookdetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("booktitle", getBooktitle());
		attributes.put("bookname", getBookname());
		attributes.put("bookpath", getBookpath());
		attributes.put("createddate", getCreateddate());
		attributes.put("createdby", getCreatedby());
		attributes.put("modifieddate", getModifieddate());
		attributes.put("modifiedby", getModifiedby());
		attributes.put("flag", getFlag());
		attributes.put("content_id", getContent_id());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String booktitle = (String)attributes.get("booktitle");

		if (booktitle != null) {
			setBooktitle(booktitle);
		}

		String bookname = (String)attributes.get("bookname");

		if (bookname != null) {
			setBookname(bookname);
		}

		String bookpath = (String)attributes.get("bookpath");

		if (bookpath != null) {
			setBookpath(bookpath);
		}

		Date createddate = (Date)attributes.get("createddate");

		if (createddate != null) {
			setCreateddate(createddate);
		}

		Long createdby = (Long)attributes.get("createdby");

		if (createdby != null) {
			setCreatedby(createdby);
		}

		Date modifieddate = (Date)attributes.get("modifieddate");

		if (modifieddate != null) {
			setModifieddate(modifieddate);
		}

		Long modifiedby = (Long)attributes.get("modifiedby");

		if (modifiedby != null) {
			setModifiedby(modifiedby);
		}

		String flag = (String)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
		}

		Long content_id = (Long)attributes.get("content_id");

		if (content_id != null) {
			setContent_id(content_id);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _bookdetails.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _bookdetails.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _bookdetails.isNew();
	}

	@Override
	public com.chola.book.model.bookdetails toEscapedModel() {
		return new bookdetailsWrapper(_bookdetails.toEscapedModel());
	}

	@Override
	public com.chola.book.model.bookdetails toUnescapedModel() {
		return new bookdetailsWrapper(_bookdetails.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _bookdetails.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.chola.book.model.bookdetails> toCacheModel() {
		return _bookdetails.toCacheModel();
	}

	@Override
	public int compareTo(com.chola.book.model.bookdetails bookdetails) {
		return _bookdetails.compareTo(bookdetails);
	}

	@Override
	public int hashCode() {
		return _bookdetails.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _bookdetails.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new bookdetailsWrapper((bookdetails)_bookdetails.clone());
	}

	/**
	* Returns the bookname of this bookdetails.
	*
	* @return the bookname of this bookdetails
	*/
	@Override
	public java.lang.String getBookname() {
		return _bookdetails.getBookname();
	}

	/**
	* Returns the bookpath of this bookdetails.
	*
	* @return the bookpath of this bookdetails
	*/
	@Override
	public java.lang.String getBookpath() {
		return _bookdetails.getBookpath();
	}

	/**
	* Returns the booktitle of this bookdetails.
	*
	* @return the booktitle of this bookdetails
	*/
	@Override
	public java.lang.String getBooktitle() {
		return _bookdetails.getBooktitle();
	}

	/**
	* Returns the flag of this bookdetails.
	*
	* @return the flag of this bookdetails
	*/
	@Override
	public java.lang.String getFlag() {
		return _bookdetails.getFlag();
	}

	@Override
	public java.lang.String toString() {
		return _bookdetails.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _bookdetails.toXmlString();
	}

	/**
	* Returns the createddate of this bookdetails.
	*
	* @return the createddate of this bookdetails
	*/
	@Override
	public Date getCreateddate() {
		return _bookdetails.getCreateddate();
	}

	/**
	* Returns the modifieddate of this bookdetails.
	*
	* @return the modifieddate of this bookdetails
	*/
	@Override
	public Date getModifieddate() {
		return _bookdetails.getModifieddate();
	}

	/**
	* Returns the content_id of this bookdetails.
	*
	* @return the content_id of this bookdetails
	*/
	@Override
	public long getContent_id() {
		return _bookdetails.getContent_id();
	}

	/**
	* Returns the createdby of this bookdetails.
	*
	* @return the createdby of this bookdetails
	*/
	@Override
	public long getCreatedby() {
		return _bookdetails.getCreatedby();
	}

	/**
	* Returns the ID of this bookdetails.
	*
	* @return the ID of this bookdetails
	*/
	@Override
	public long getId() {
		return _bookdetails.getId();
	}

	/**
	* Returns the modifiedby of this bookdetails.
	*
	* @return the modifiedby of this bookdetails
	*/
	@Override
	public long getModifiedby() {
		return _bookdetails.getModifiedby();
	}

	/**
	* Returns the primary key of this bookdetails.
	*
	* @return the primary key of this bookdetails
	*/
	@Override
	public long getPrimaryKey() {
		return _bookdetails.getPrimaryKey();
	}

	@Override
	public void persist() {
		_bookdetails.persist();
	}

	/**
	* Sets the bookname of this bookdetails.
	*
	* @param bookname the bookname of this bookdetails
	*/
	@Override
	public void setBookname(java.lang.String bookname) {
		_bookdetails.setBookname(bookname);
	}

	/**
	* Sets the bookpath of this bookdetails.
	*
	* @param bookpath the bookpath of this bookdetails
	*/
	@Override
	public void setBookpath(java.lang.String bookpath) {
		_bookdetails.setBookpath(bookpath);
	}

	/**
	* Sets the booktitle of this bookdetails.
	*
	* @param booktitle the booktitle of this bookdetails
	*/
	@Override
	public void setBooktitle(java.lang.String booktitle) {
		_bookdetails.setBooktitle(booktitle);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_bookdetails.setCachedModel(cachedModel);
	}

	/**
	* Sets the content_id of this bookdetails.
	*
	* @param content_id the content_id of this bookdetails
	*/
	@Override
	public void setContent_id(long content_id) {
		_bookdetails.setContent_id(content_id);
	}

	/**
	* Sets the createdby of this bookdetails.
	*
	* @param createdby the createdby of this bookdetails
	*/
	@Override
	public void setCreatedby(long createdby) {
		_bookdetails.setCreatedby(createdby);
	}

	/**
	* Sets the createddate of this bookdetails.
	*
	* @param createddate the createddate of this bookdetails
	*/
	@Override
	public void setCreateddate(Date createddate) {
		_bookdetails.setCreateddate(createddate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_bookdetails.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_bookdetails.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_bookdetails.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the flag of this bookdetails.
	*
	* @param flag the flag of this bookdetails
	*/
	@Override
	public void setFlag(java.lang.String flag) {
		_bookdetails.setFlag(flag);
	}

	/**
	* Sets the ID of this bookdetails.
	*
	* @param id the ID of this bookdetails
	*/
	@Override
	public void setId(long id) {
		_bookdetails.setId(id);
	}

	/**
	* Sets the modifiedby of this bookdetails.
	*
	* @param modifiedby the modifiedby of this bookdetails
	*/
	@Override
	public void setModifiedby(long modifiedby) {
		_bookdetails.setModifiedby(modifiedby);
	}

	/**
	* Sets the modifieddate of this bookdetails.
	*
	* @param modifieddate the modifieddate of this bookdetails
	*/
	@Override
	public void setModifieddate(Date modifieddate) {
		_bookdetails.setModifieddate(modifieddate);
	}

	@Override
	public void setNew(boolean n) {
		_bookdetails.setNew(n);
	}

	/**
	* Sets the primary key of this bookdetails.
	*
	* @param primaryKey the primary key of this bookdetails
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_bookdetails.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_bookdetails.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof bookdetailsWrapper)) {
			return false;
		}

		bookdetailsWrapper bookdetailsWrapper = (bookdetailsWrapper)obj;

		if (Objects.equals(_bookdetails, bookdetailsWrapper._bookdetails)) {
			return true;
		}

		return false;
	}

	@Override
	public bookdetails getWrappedModel() {
		return _bookdetails;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _bookdetails.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _bookdetails.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_bookdetails.resetOriginalValues();
	}

	private final bookdetails _bookdetails;
}