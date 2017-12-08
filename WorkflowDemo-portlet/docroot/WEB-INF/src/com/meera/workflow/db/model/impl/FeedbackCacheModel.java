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

package com.meera.workflow.db.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.meera.workflow.db.model.Feedback;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Feedback in entity cache.
 *
 * @author CloverLiferay01
 * @see Feedback
 * @generated
 */
@ProviderType
public class FeedbackCacheModel implements CacheModel<Feedback>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FeedbackCacheModel)) {
			return false;
		}

		FeedbackCacheModel feedbackCacheModel = (FeedbackCacheModel)obj;

		if (feedbackId == feedbackCacheModel.feedbackId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, feedbackId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", feedbackId=");
		sb.append(feedbackId);
		sb.append(", feedbackDate=");
		sb.append(feedbackDate);
		sb.append(", feedbackText=");
		sb.append(feedbackText);
		sb.append(", feedbackSubject=");
		sb.append(feedbackSubject);
		sb.append(", feedBackStatus=");
		sb.append(feedBackStatus);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Feedback toEntityModel() {
		FeedbackImpl feedbackImpl = new FeedbackImpl();

		if (uuid == null) {
			feedbackImpl.setUuid(StringPool.BLANK);
		}
		else {
			feedbackImpl.setUuid(uuid);
		}

		feedbackImpl.setFeedbackId(feedbackId);

		if (feedbackDate == Long.MIN_VALUE) {
			feedbackImpl.setFeedbackDate(null);
		}
		else {
			feedbackImpl.setFeedbackDate(new Date(feedbackDate));
		}

		if (feedbackText == null) {
			feedbackImpl.setFeedbackText(StringPool.BLANK);
		}
		else {
			feedbackImpl.setFeedbackText(feedbackText);
		}

		if (feedbackSubject == null) {
			feedbackImpl.setFeedbackSubject(StringPool.BLANK);
		}
		else {
			feedbackImpl.setFeedbackSubject(feedbackSubject);
		}

		feedbackImpl.setFeedBackStatus(feedBackStatus);
		feedbackImpl.setStatusByUserId(statusByUserId);

		if (statusDate == Long.MIN_VALUE) {
			feedbackImpl.setStatusDate(null);
		}
		else {
			feedbackImpl.setStatusDate(new Date(statusDate));
		}

		feedbackImpl.setCompanyId(companyId);
		feedbackImpl.setGroupId(groupId);
		feedbackImpl.setUserId(userId);

		feedbackImpl.resetOriginalValues();

		return feedbackImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		feedbackId = objectInput.readLong();
		feedbackDate = objectInput.readLong();
		feedbackText = objectInput.readUTF();
		feedbackSubject = objectInput.readUTF();

		feedBackStatus = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusDate = objectInput.readLong();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();

		userId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(feedbackId);
		objectOutput.writeLong(feedbackDate);

		if (feedbackText == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(feedbackText);
		}

		if (feedbackSubject == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(feedbackSubject);
		}

		objectOutput.writeInt(feedBackStatus);

		objectOutput.writeLong(statusByUserId);
		objectOutput.writeLong(statusDate);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(userId);
	}

	public String uuid;
	public long feedbackId;
	public long feedbackDate;
	public String feedbackText;
	public String feedbackSubject;
	public int feedBackStatus;
	public long statusByUserId;
	public long statusDate;
	public long companyId;
	public long groupId;
	public long userId;
}