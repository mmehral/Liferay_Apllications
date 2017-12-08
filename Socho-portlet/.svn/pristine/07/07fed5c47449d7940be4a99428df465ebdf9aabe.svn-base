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

package com.chola.socho.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.socho.service.http.topicsServiceSoap}.
 *
 * @author CloverLiferay02
 * @see com.chola.socho.service.http.topicsServiceSoap
 * @generated
 */
@ProviderType
public class topicsSoap implements Serializable {
	public static topicsSoap toSoapModel(topics model) {
		topicsSoap soapModel = new topicsSoap();

		soapModel.setId(model.getId());
		soapModel.setTopicName(model.getTopicName());
		soapModel.setFlag(model.getFlag());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setCreatedOn(model.getCreatedOn());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedOn(model.getModifiedOn());

		return soapModel;
	}

	public static topicsSoap[] toSoapModels(topics[] models) {
		topicsSoap[] soapModels = new topicsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static topicsSoap[][] toSoapModels(topics[][] models) {
		topicsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new topicsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new topicsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static topicsSoap[] toSoapModels(List<topics> models) {
		List<topicsSoap> soapModels = new ArrayList<topicsSoap>(models.size());

		for (topics model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new topicsSoap[soapModels.size()]);
	}

	public topicsSoap() {
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

	public String getTopicName() {
		return _topicName;
	}

	public void setTopicName(String topicName) {
		_topicName = topicName;
	}

	public long getFlag() {
		return _flag;
	}

	public void setFlag(long flag) {
		_flag = flag;
	}

	public long getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return _createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		_createdOn = createdOn;
	}

	public long getModifiedBy() {
		return _modifiedBy;
	}

	public void setModifiedBy(long modifiedBy) {
		_modifiedBy = modifiedBy;
	}

	public Date getModifiedOn() {
		return _modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		_modifiedOn = modifiedOn;
	}

	private long _id;
	private String _topicName;
	private long _flag;
	private long _createdBy;
	private Date _createdOn;
	private long _modifiedBy;
	private Date _modifiedOn;
}