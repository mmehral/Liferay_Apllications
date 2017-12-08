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

package com.chola.trainingcalendar.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.trainingcalendar.service.http.trainingcontentuniqueinformationServiceSoap}.
 *
 * @author CloverLiferay01
 * @see com.chola.trainingcalendar.service.http.trainingcontentuniqueinformationServiceSoap
 * @generated
 */
@ProviderType
public class trainingcontentuniqueinformationSoap implements Serializable {
	public static trainingcontentuniqueinformationSoap toSoapModel(
		trainingcontentuniqueinformation model) {
		trainingcontentuniqueinformationSoap soapModel = new trainingcontentuniqueinformationSoap();

		soapModel.setId(model.getId());
		soapModel.setTraining_id(model.getTraining_id());
		soapModel.setContent_id(model.getContent_id());
		soapModel.setStatus(model.getStatus());
		soapModel.setUdflag(model.getUdflag());
		soapModel.setContent_type(model.getContent_type());
		soapModel.setNotification_text(model.getNotification_text());
		soapModel.setPageurl(model.getPageurl());

		return soapModel;
	}

	public static trainingcontentuniqueinformationSoap[] toSoapModels(
		trainingcontentuniqueinformation[] models) {
		trainingcontentuniqueinformationSoap[] soapModels = new trainingcontentuniqueinformationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static trainingcontentuniqueinformationSoap[][] toSoapModels(
		trainingcontentuniqueinformation[][] models) {
		trainingcontentuniqueinformationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new trainingcontentuniqueinformationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new trainingcontentuniqueinformationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static trainingcontentuniqueinformationSoap[] toSoapModels(
		List<trainingcontentuniqueinformation> models) {
		List<trainingcontentuniqueinformationSoap> soapModels = new ArrayList<trainingcontentuniqueinformationSoap>(models.size());

		for (trainingcontentuniqueinformation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new trainingcontentuniqueinformationSoap[soapModels.size()]);
	}

	public trainingcontentuniqueinformationSoap() {
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

	public long getTraining_id() {
		return _training_id;
	}

	public void setTraining_id(long training_id) {
		_training_id = training_id;
	}

	public long getContent_id() {
		return _content_id;
	}

	public void setContent_id(long content_id) {
		_content_id = content_id;
	}

	public long getStatus() {
		return _status;
	}

	public void setStatus(long status) {
		_status = status;
	}

	public long getUdflag() {
		return _udflag;
	}

	public void setUdflag(long udflag) {
		_udflag = udflag;
	}

	public String getContent_type() {
		return _content_type;
	}

	public void setContent_type(String content_type) {
		_content_type = content_type;
	}

	public String getNotification_text() {
		return _notification_text;
	}

	public void setNotification_text(String notification_text) {
		_notification_text = notification_text;
	}

	public String getPageurl() {
		return _pageurl;
	}

	public void setPageurl(String pageurl) {
		_pageurl = pageurl;
	}

	private long _id;
	private long _training_id;
	private long _content_id;
	private long _status;
	private long _udflag;
	private String _content_type;
	private String _notification_text;
	private String _pageurl;
}