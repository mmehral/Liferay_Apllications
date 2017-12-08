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

package com.chola.conferenceroombooking.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.conferenceroombooking.model.conferenceroombookingdetails;

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
 * The cache model class for representing conferenceroombookingdetails in entity cache.
 *
 * @author adms.java1
 * @see conferenceroombookingdetails
 * @generated
 */
@ProviderType
public class conferenceroombookingdetailsCacheModel implements CacheModel<conferenceroombookingdetails>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof conferenceroombookingdetailsCacheModel)) {
			return false;
		}

		conferenceroombookingdetailsCacheModel conferenceroombookingdetailsCacheModel =
			(conferenceroombookingdetailsCacheModel)obj;

		if (bookid == conferenceroombookingdetailsCacheModel.bookid) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, bookid);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{bookid=");
		sb.append(bookid);
		sb.append(", startdate=");
		sb.append(startdate);
		sb.append(", startime=");
		sb.append(startime);
		sb.append(", endtime=");
		sb.append(endtime);
		sb.append(", roomid=");
		sb.append(roomid);
		sb.append(", meeting_emailid=");
		sb.append(meeting_emailid);
		sb.append(", meeting_title=");
		sb.append(meeting_title);
		sb.append(", meeting_agenda=");
		sb.append(meeting_agenda);
		sb.append(", status=");
		sb.append(status);
		sb.append(", userid=");
		sb.append(userid);
		sb.append(", username=");
		sb.append(username);
		sb.append(", createdate=");
		sb.append(createdate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public conferenceroombookingdetails toEntityModel() {
		conferenceroombookingdetailsImpl conferenceroombookingdetailsImpl = new conferenceroombookingdetailsImpl();

		conferenceroombookingdetailsImpl.setBookid(bookid);

		if (startdate == Long.MIN_VALUE) {
			conferenceroombookingdetailsImpl.setStartdate(null);
		}
		else {
			conferenceroombookingdetailsImpl.setStartdate(new Date(startdate));
		}

		if (startime == null) {
			conferenceroombookingdetailsImpl.setStartime(StringPool.BLANK);
		}
		else {
			conferenceroombookingdetailsImpl.setStartime(startime);
		}

		if (endtime == null) {
			conferenceroombookingdetailsImpl.setEndtime(StringPool.BLANK);
		}
		else {
			conferenceroombookingdetailsImpl.setEndtime(endtime);
		}

		conferenceroombookingdetailsImpl.setRoomid(roomid);

		if (meeting_emailid == null) {
			conferenceroombookingdetailsImpl.setMeeting_emailid(StringPool.BLANK);
		}
		else {
			conferenceroombookingdetailsImpl.setMeeting_emailid(meeting_emailid);
		}

		if (meeting_title == null) {
			conferenceroombookingdetailsImpl.setMeeting_title(StringPool.BLANK);
		}
		else {
			conferenceroombookingdetailsImpl.setMeeting_title(meeting_title);
		}

		if (meeting_agenda == null) {
			conferenceroombookingdetailsImpl.setMeeting_agenda(StringPool.BLANK);
		}
		else {
			conferenceroombookingdetailsImpl.setMeeting_agenda(meeting_agenda);
		}

		conferenceroombookingdetailsImpl.setStatus(status);
		conferenceroombookingdetailsImpl.setUserid(userid);

		if (username == null) {
			conferenceroombookingdetailsImpl.setUsername(StringPool.BLANK);
		}
		else {
			conferenceroombookingdetailsImpl.setUsername(username);
		}

		if (createdate == Long.MIN_VALUE) {
			conferenceroombookingdetailsImpl.setCreatedate(null);
		}
		else {
			conferenceroombookingdetailsImpl.setCreatedate(new Date(createdate));
		}

		conferenceroombookingdetailsImpl.resetOriginalValues();

		return conferenceroombookingdetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		bookid = objectInput.readLong();
		startdate = objectInput.readLong();
		startime = objectInput.readUTF();
		endtime = objectInput.readUTF();

		roomid = objectInput.readInt();
		meeting_emailid = objectInput.readUTF();
		meeting_title = objectInput.readUTF();
		meeting_agenda = objectInput.readUTF();

		status = objectInput.readInt();

		userid = objectInput.readLong();
		username = objectInput.readUTF();
		createdate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(bookid);
		objectOutput.writeLong(startdate);

		if (startime == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(startime);
		}

		if (endtime == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(endtime);
		}

		objectOutput.writeInt(roomid);

		if (meeting_emailid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(meeting_emailid);
		}

		if (meeting_title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(meeting_title);
		}

		if (meeting_agenda == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(meeting_agenda);
		}

		objectOutput.writeInt(status);

		objectOutput.writeLong(userid);

		if (username == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(username);
		}

		objectOutput.writeLong(createdate);
	}

	public long bookid;
	public long startdate;
	public String startime;
	public String endtime;
	public int roomid;
	public String meeting_emailid;
	public String meeting_title;
	public String meeting_agenda;
	public int status;
	public long userid;
	public String username;
	public long createdate;
}