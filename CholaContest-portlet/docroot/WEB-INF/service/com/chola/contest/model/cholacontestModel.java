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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the cholacontest service. Represents a row in the &quot;chola_cholacontest&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.chola.contest.model.impl.cholacontestModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.chola.contest.model.impl.cholacontestImpl}.
 * </p>
 *
 * @author cloverliferay01
 * @see cholacontest
 * @see com.chola.contest.model.impl.cholacontestImpl
 * @see com.chola.contest.model.impl.cholacontestModelImpl
 * @generated
 */
@ProviderType
public interface cholacontestModel extends BaseModel<cholacontest> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a cholacontest model instance should use the {@link cholacontest} interface instead.
	 */

	/**
	 * Returns the primary key of this cholacontest.
	 *
	 * @return the primary key of this cholacontest
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this cholacontest.
	 *
	 * @param primaryKey the primary key of this cholacontest
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this cholacontest.
	 *
	 * @return the ID of this cholacontest
	 */
	public long getId();

	/**
	 * Sets the ID of this cholacontest.
	 *
	 * @param id the ID of this cholacontest
	 */
	public void setId(long id);

	/**
	 * Returns the content_id of this cholacontest.
	 *
	 * @return the content_id of this cholacontest
	 */
	public long getContent_id();

	/**
	 * Sets the content_id of this cholacontest.
	 *
	 * @param content_id the content_id of this cholacontest
	 */
	public void setContent_id(long content_id);

	/**
	 * Returns the content of this cholacontest.
	 *
	 * @return the content of this cholacontest
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this cholacontest.
	 *
	 * @param content the content of this cholacontest
	 */
	public void setContent(String content);

	/**
	 * Returns the startdate of this cholacontest.
	 *
	 * @return the startdate of this cholacontest
	 */
	public Date getStartdate();

	/**
	 * Sets the startdate of this cholacontest.
	 *
	 * @param startdate the startdate of this cholacontest
	 */
	public void setStartdate(Date startdate);

	/**
	 * Returns the enddate of this cholacontest.
	 *
	 * @return the enddate of this cholacontest
	 */
	public Date getEnddate();

	/**
	 * Sets the enddate of this cholacontest.
	 *
	 * @param enddate the enddate of this cholacontest
	 */
	public void setEnddate(Date enddate);

	/**
	 * Returns the feedback of this cholacontest.
	 *
	 * @return the feedback of this cholacontest
	 */
	@AutoEscape
	public String getFeedback();

	/**
	 * Sets the feedback of this cholacontest.
	 *
	 * @param feedback the feedback of this cholacontest
	 */
	public void setFeedback(String feedback);

	/**
	 * Returns the create date of this cholacontest.
	 *
	 * @return the create date of this cholacontest
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this cholacontest.
	 *
	 * @param createDate the create date of this cholacontest
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the contest_code of this cholacontest.
	 *
	 * @return the contest_code of this cholacontest
	 */
	public int getContest_code();

	/**
	 * Sets the contest_code of this cholacontest.
	 *
	 * @param contest_code the contest_code of this cholacontest
	 */
	public void setContest_code(int contest_code);

	/**
	 * Returns the contest_val of this cholacontest.
	 *
	 * @return the contest_val of this cholacontest
	 */
	public int getContest_val();

	/**
	 * Sets the contest_val of this cholacontest.
	 *
	 * @param contest_val the contest_val of this cholacontest
	 */
	public void setContest_val(int contest_val);

	/**
	 * Returns the contest_desc of this cholacontest.
	 *
	 * @return the contest_desc of this cholacontest
	 */
	@AutoEscape
	public String getContest_desc();

	/**
	 * Sets the contest_desc of this cholacontest.
	 *
	 * @param contest_desc the contest_desc of this cholacontest
	 */
	public void setContest_desc(String contest_desc);

	/**
	 * Returns the contest_doc of this cholacontest.
	 *
	 * @return the contest_doc of this cholacontest
	 */
	@AutoEscape
	public String getContest_doc();

	/**
	 * Sets the contest_doc of this cholacontest.
	 *
	 * @param contest_doc the contest_doc of this cholacontest
	 */
	public void setContest_doc(String contest_doc);

	/**
	 * Returns the contest_path of this cholacontest.
	 *
	 * @return the contest_path of this cholacontest
	 */
	@AutoEscape
	public String getContest_path();

	/**
	 * Sets the contest_path of this cholacontest.
	 *
	 * @param contest_path the contest_path of this cholacontest
	 */
	public void setContest_path(String contest_path);

	/**
	 * Returns the contest_title of this cholacontest.
	 *
	 * @return the contest_title of this cholacontest
	 */
	@AutoEscape
	public String getContest_title();

	/**
	 * Sets the contest_title of this cholacontest.
	 *
	 * @param contest_title the contest_title of this cholacontest
	 */
	public void setContest_title(String contest_title);

	/**
	 * Returns the user_id of this cholacontest.
	 *
	 * @return the user_id of this cholacontest
	 */
	@AutoEscape
	public String getUser_id();

	/**
	 * Sets the user_id of this cholacontest.
	 *
	 * @param user_id the user_id of this cholacontest
	 */
	public void setUser_id(String user_id);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.chola.contest.model.cholacontest cholacontest);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.chola.contest.model.cholacontest> toCacheModel();

	@Override
	public com.chola.contest.model.cholacontest toEscapedModel();

	@Override
	public com.chola.contest.model.cholacontest toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}