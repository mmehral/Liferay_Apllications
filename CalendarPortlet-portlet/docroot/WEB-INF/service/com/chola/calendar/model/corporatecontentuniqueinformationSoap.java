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

package com.chola.calendar.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.calendar.service.http.corporatecontentuniqueinformationServiceSoap}.
 *
 * @author adms.java1
 * @see com.chola.calendar.service.http.corporatecontentuniqueinformationServiceSoap
 * @generated
 */
@ProviderType
public class corporatecontentuniqueinformationSoap implements Serializable {
	public static corporatecontentuniqueinformationSoap toSoapModel(
		corporatecontentuniqueinformation model) {
		corporatecontentuniqueinformationSoap soapModel = new corporatecontentuniqueinformationSoap();

		soapModel.setId(model.getId());
		soapModel.setCorporatevent_id(model.getCorporatevent_id());
		soapModel.setContent_id(model.getContent_id());
		soapModel.setStatus(model.getStatus());
		soapModel.setUdflag(model.getUdflag());
		soapModel.setContent_type(model.getContent_type());
		soapModel.setNotification_text(model.getNotification_text());
		soapModel.setPageurl(model.getPageurl());

		return soapModel;
	}

	public static corporatecontentuniqueinformationSoap[] toSoapModels(
		corporatecontentuniqueinformation[] models) {
		corporatecontentuniqueinformationSoap[] soapModels = new corporatecontentuniqueinformationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static corporatecontentuniqueinformationSoap[][] toSoapModels(
		corporatecontentuniqueinformation[][] models) {
		corporatecontentuniqueinformationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new corporatecontentuniqueinformationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new corporatecontentuniqueinformationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static corporatecontentuniqueinformationSoap[] toSoapModels(
		List<corporatecontentuniqueinformation> models) {
		List<corporatecontentuniqueinformationSoap> soapModels = new ArrayList<corporatecontentuniqueinformationSoap>(models.size());

		for (corporatecontentuniqueinformation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new corporatecontentuniqueinformationSoap[soapModels.size()]);
	}

	public corporatecontentuniqueinformationSoap() {
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

	public long getCorporatevent_id() {
		return _corporatevent_id;
	}

	public void setCorporatevent_id(long corporatevent_id) {
		_corporatevent_id = corporatevent_id;
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
	private long _corporatevent_id;
	private long _content_id;
	private long _status;
	private long _udflag;
	private String _content_type;
	private String _notification_text;
	private String _pageurl;
}