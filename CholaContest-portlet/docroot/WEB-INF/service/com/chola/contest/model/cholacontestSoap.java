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

package com.chola.contest.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.chola.contest.service.http.cholacontestServiceSoap}.
 *
 * @author cloverliferay01
 * @see com.chola.contest.service.http.cholacontestServiceSoap
 * @generated
 */
@ProviderType
public class cholacontestSoap implements Serializable {
	public static cholacontestSoap toSoapModel(cholacontest model) {
		cholacontestSoap soapModel = new cholacontestSoap();

		soapModel.setId(model.getId());
		soapModel.setContent_id(model.getContent_id());
		soapModel.setContent(model.getContent());
		soapModel.setStartdate(model.getStartdate());
		soapModel.setEnddate(model.getEnddate());
		soapModel.setFeedback(model.getFeedback());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setContest_code(model.getContest_code());
		soapModel.setContest_val(model.getContest_val());
		soapModel.setContest_desc(model.getContest_desc());
		soapModel.setContest_doc(model.getContest_doc());
		soapModel.setContest_path(model.getContest_path());
		soapModel.setContest_title(model.getContest_title());
		soapModel.setUser_id(model.getUser_id());

		return soapModel;
	}

	public static cholacontestSoap[] toSoapModels(cholacontest[] models) {
		cholacontestSoap[] soapModels = new cholacontestSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static cholacontestSoap[][] toSoapModels(cholacontest[][] models) {
		cholacontestSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new cholacontestSoap[models.length][models[0].length];
		}
		else {
			soapModels = new cholacontestSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static cholacontestSoap[] toSoapModels(List<cholacontest> models) {
		List<cholacontestSoap> soapModels = new ArrayList<cholacontestSoap>(models.size());

		for (cholacontest model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new cholacontestSoap[soapModels.size()]);
	}

	public cholacontestSoap() {
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

	public long getContent_id() {
		return _content_id;
	}

	public void setContent_id(long content_id) {
		_content_id = content_id;
	}

	public String getContent() {
		return _content;
	}

	public void setContent(String content) {
		_content = content;
	}

	public Date getStartdate() {
		return _startdate;
	}

	public void setStartdate(Date startdate) {
		_startdate = startdate;
	}

	public Date getEnddate() {
		return _enddate;
	}

	public void setEnddate(Date enddate) {
		_enddate = enddate;
	}

	public String getFeedback() {
		return _feedback;
	}

	public void setFeedback(String feedback) {
		_feedback = feedback;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public int getContest_code() {
		return _contest_code;
	}

	public void setContest_code(int contest_code) {
		_contest_code = contest_code;
	}

	public int getContest_val() {
		return _contest_val;
	}

	public void setContest_val(int contest_val) {
		_contest_val = contest_val;
	}

	public String getContest_desc() {
		return _contest_desc;
	}

	public void setContest_desc(String contest_desc) {
		_contest_desc = contest_desc;
	}

	public String getContest_doc() {
		return _contest_doc;
	}

	public void setContest_doc(String contest_doc) {
		_contest_doc = contest_doc;
	}

	public String getContest_path() {
		return _contest_path;
	}

	public void setContest_path(String contest_path) {
		_contest_path = contest_path;
	}

	public String getContest_title() {
		return _contest_title;
	}

	public void setContest_title(String contest_title) {
		_contest_title = contest_title;
	}

	public String getUser_id() {
		return _user_id;
	}

	public void setUser_id(String user_id) {
		_user_id = user_id;
	}

	private long _id;
	private long _content_id;
	private String _content;
	private Date _startdate;
	private Date _enddate;
	private String _feedback;
	private Date _createDate;
	private int _contest_code;
	private int _contest_val;
	private String _contest_desc;
	private String _contest_doc;
	private String _contest_path;
	private String _contest_title;
	private String _user_id;
}