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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.book.service.http.bookdetailsServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.chola.book.service.http.bookdetailsServiceSoap
 * @generated
 */
@ProviderType
public class bookdetailsSoap implements Serializable {
	public static bookdetailsSoap toSoapModel(bookdetails model) {
		bookdetailsSoap soapModel = new bookdetailsSoap();

		soapModel.setId(model.getId());
		soapModel.setBooktitle(model.getBooktitle());
		soapModel.setBookname(model.getBookname());
		soapModel.setBookpath(model.getBookpath());
		soapModel.setCreateddate(model.getCreateddate());
		soapModel.setCreatedby(model.getCreatedby());
		soapModel.setModifieddate(model.getModifieddate());
		soapModel.setModifiedby(model.getModifiedby());
		soapModel.setFlag(model.getFlag());
		soapModel.setContent_id(model.getContent_id());

		return soapModel;
	}

	public static bookdetailsSoap[] toSoapModels(bookdetails[] models) {
		bookdetailsSoap[] soapModels = new bookdetailsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static bookdetailsSoap[][] toSoapModels(bookdetails[][] models) {
		bookdetailsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new bookdetailsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new bookdetailsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static bookdetailsSoap[] toSoapModels(List<bookdetails> models) {
		List<bookdetailsSoap> soapModels = new ArrayList<bookdetailsSoap>(models.size());

		for (bookdetails model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new bookdetailsSoap[soapModels.size()]);
	}

	public bookdetailsSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getBooktitle() {
		return _booktitle;
	}

	public void setBooktitle(String booktitle) {
		_booktitle = booktitle;
	}

	public String getBookname() {
		return _bookname;
	}

	public void setBookname(String bookname) {
		_bookname = bookname;
	}

	public String getBookpath() {
		return _bookpath;
	}

	public void setBookpath(String bookpath) {
		_bookpath = bookpath;
	}

	public Date getCreateddate() {
		return _createddate;
	}

	public void setCreateddate(Date createddate) {
		_createddate = createddate;
	}

	public long getCreatedby() {
		return _createdby;
	}

	public void setCreatedby(long createdby) {
		_createdby = createdby;
	}

	public Date getModifieddate() {
		return _modifieddate;
	}

	public void setModifieddate(Date modifieddate) {
		_modifieddate = modifieddate;
	}

	public long getModifiedby() {
		return _modifiedby;
	}

	public void setModifiedby(long modifiedby) {
		_modifiedby = modifiedby;
	}

	public String getFlag() {
		return _flag;
	}

	public void setFlag(String flag) {
		_flag = flag;
	}

	public long getContent_id() {
		return _content_id;
	}

	public void setContent_id(long content_id) {
		_content_id = content_id;
	}

	private long _id;
	private String _booktitle;
	private String _bookname;
	private String _bookpath;
	private Date _createddate;
	private long _createdby;
	private Date _modifieddate;
	private long _modifiedby;
	private String _flag;
	private long _content_id;
}