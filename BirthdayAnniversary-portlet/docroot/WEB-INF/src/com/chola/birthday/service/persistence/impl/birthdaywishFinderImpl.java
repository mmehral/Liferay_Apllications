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

package com.chola.birthday.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.birthday.exception.NoSuchbirthdaywishException;
import com.chola.birthday.model.birthdaywish;
import com.chola.birthday.model.impl.birthdaywishImpl;
import com.chola.birthday.model.impl.birthdaywishModelImpl;
import com.chola.birthday.service.persistence.birthdaywishFinder;
import com.chola.birthday.service.persistence.birthdaywishPersistence;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.util.dao.orm.CustomSQLUtil;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;


public class birthdaywishFinderImpl extends birthdaywishFinderBaseImpl
implements birthdaywishFinder{

	public List getEmpInfo(String empid) {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("empid");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(empid);
			return queryObject.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public boolean insertData(String message,String postedBy,String postedOn)
	{
		boolean flag=false;
		Session session = null;
		try
		{		
			session = openSession();
			String sql=CustomSQLUtil.get("insertlist");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			pos.add(postedOn);
			pos.add(postedBy);
			pos.add(message);
			pos.add("BIRTHDAY");
			pos.add(new Date());
			int id = query.executeUpdate();
			if(id>=1)
			{
				flag = true;
			}
			System.out.println("ID : "+id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			closeSession(session);
		}
		return flag;
}
	
	public List getEmpData(String date) {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("empdata");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add("%"+date+"%");
			return queryObject.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public List getWallPost(String userId) {
		Session session = null;
		try {
			System.out.println("Userid : "+userId);
			session = openSession();
			String sql = CustomSQLUtil.get("wallpost");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(userId);
			return queryObject.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
}