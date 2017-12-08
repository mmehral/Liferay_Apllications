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

package com.chola.popularlinks.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.popularlinks.service.http.popularlinksServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.popularlinks.service.http.popularlinksServiceSoap
 * @generated
 */
@ProviderType
public class popularlinksSoap implements Serializable {
	public static popularlinksSoap toSoapModel(popularlinks model) {
		popularlinksSoap soapModel = new popularlinksSoap();

		soapModel.setId(model.getId());
		soapModel.setUserid(model.getUserid());
		soapModel.setUrl(model.getUrl());
		soapModel.setTag(model.getTag());
		soapModel.setCount(model.getCount());
		soapModel.setFlag(model.getFlag());
		soapModel.setCreateDate(model.getCreateDate());

		return soapModel;
	}

	public static popularlinksSoap[] toSoapModels(popularlinks[] models) {
		popularlinksSoap[] soapModels = new popularlinksSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static popularlinksSoap[][] toSoapModels(popularlinks[][] models) {
		popularlinksSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new popularlinksSoap[models.length][models[0].length];
		}
		else {
			soapModels = new popularlinksSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static popularlinksSoap[] toSoapModels(List<popularlinks> models) {
		List<popularlinksSoap> soapModels = new ArrayList<popularlinksSoap>(models.size());

		for (popularlinks model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new popularlinksSoap[soapModels.size()]);
	}

	public popularlinksSoap() {
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

	public long getUserid() {
		return _userid;
	}

	public void setUserid(long userid) {
		_userid = userid;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	public String getTag() {
		return _tag;
	}

	public void setTag(String tag) {
		_tag = tag;
	}

	public long getCount() {
		return _count;
	}

	public void setCount(long count) {
		_count = count;
	}

	public int getFlag() {
		return _flag;
	}

	public void setFlag(int flag) {
		_flag = flag;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	private long _id;
	private long _userid;
	private String _url;
	private String _tag;
	private long _count;
	private int _flag;
	private Date _createDate;
}