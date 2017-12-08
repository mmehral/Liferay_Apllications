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

package com.contest.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.contest.model.CholaContest;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CholaContest in entity cache.
 *
 * @author CloverLiferay01
 * @see CholaContest
 * @generated
 */
@ProviderType
public class CholaContestCacheModel implements CacheModel<CholaContest>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CholaContestCacheModel)) {
			return false;
		}

		CholaContestCacheModel cholaContestCacheModel = (CholaContestCacheModel)obj;

		if (Id == cholaContestCacheModel.Id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", content_id=");
		sb.append(content_id);
		sb.append(", content=");
		sb.append(content);
		sb.append(", startdate=");
		sb.append(startdate);
		sb.append(", enddate=");
		sb.append(enddate);
		sb.append(", feedback=");
		sb.append(feedback);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", contest_code=");
		sb.append(contest_code);
		sb.append(", contest_val=");
		sb.append(contest_val);
		sb.append(", contest_desc=");
		sb.append(contest_desc);
		sb.append(", contest_doc=");
		sb.append(contest_doc);
		sb.append(", contest_path=");
		sb.append(contest_path);
		sb.append(", contest_title=");
		sb.append(contest_title);
		sb.append(", user_id=");
		sb.append(user_id);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CholaContest toEntityModel() {
		CholaContestImpl cholaContestImpl = new CholaContestImpl();

		cholaContestImpl.setId(Id);
		cholaContestImpl.setContent_id(content_id);

		if (content == null) {
			cholaContestImpl.setContent(StringPool.BLANK);
		}
		else {
			cholaContestImpl.setContent(content);
		}

		if (startdate == Long.MIN_VALUE) {
			cholaContestImpl.setStartdate(null);
		}
		else {
			cholaContestImpl.setStartdate(new Date(startdate));
		}

		if (enddate == Long.MIN_VALUE) {
			cholaContestImpl.setEnddate(null);
		}
		else {
			cholaContestImpl.setEnddate(new Date(enddate));
		}

		if (feedback == null) {
			cholaContestImpl.setFeedback(StringPool.BLANK);
		}
		else {
			cholaContestImpl.setFeedback(feedback);
		}

		if (createDate == Long.MIN_VALUE) {
			cholaContestImpl.setCreateDate(null);
		}
		else {
			cholaContestImpl.setCreateDate(new Date(createDate));
		}

		cholaContestImpl.setContest_code(contest_code);
		cholaContestImpl.setContest_val(contest_val);

		if (contest_desc == null) {
			cholaContestImpl.setContest_desc(StringPool.BLANK);
		}
		else {
			cholaContestImpl.setContest_desc(contest_desc);
		}

		if (contest_doc == null) {
			cholaContestImpl.setContest_doc(StringPool.BLANK);
		}
		else {
			cholaContestImpl.setContest_doc(contest_doc);
		}

		if (contest_path == null) {
			cholaContestImpl.setContest_path(StringPool.BLANK);
		}
		else {
			cholaContestImpl.setContest_path(contest_path);
		}

		if (contest_title == null) {
			cholaContestImpl.setContest_title(StringPool.BLANK);
		}
		else {
			cholaContestImpl.setContest_title(contest_title);
		}

		if (user_id == null) {
			cholaContestImpl.setUser_id(StringPool.BLANK);
		}
		else {
			cholaContestImpl.setUser_id(user_id);
		}

		cholaContestImpl.resetOriginalValues();

		return cholaContestImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();

		content_id = objectInput.readLong();
		content = objectInput.readUTF();
		startdate = objectInput.readLong();
		enddate = objectInput.readLong();
		feedback = objectInput.readUTF();
		createDate = objectInput.readLong();

		contest_code = objectInput.readInt();

		contest_val = objectInput.readInt();
		contest_desc = objectInput.readUTF();
		contest_doc = objectInput.readUTF();
		contest_path = objectInput.readUTF();
		contest_title = objectInput.readUTF();
		user_id = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		objectOutput.writeLong(content_id);

		if (content == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(content);
		}

		objectOutput.writeLong(startdate);
		objectOutput.writeLong(enddate);

		if (feedback == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(feedback);
		}

		objectOutput.writeLong(createDate);

		objectOutput.writeInt(contest_code);

		objectOutput.writeInt(contest_val);

		if (contest_desc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contest_desc);
		}

		if (contest_doc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contest_doc);
		}

		if (contest_path == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contest_path);
		}

		if (contest_title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contest_title);
		}

		if (user_id == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(user_id);
		}
	}

	public long Id;
	public long content_id;
	public String content;
	public long startdate;
	public long enddate;
	public String feedback;
	public long createDate;
	public int contest_code;
	public int contest_val;
	public String contest_desc;
	public String contest_doc;
	public String contest_path;
	public String contest_title;
	public String user_id;
}