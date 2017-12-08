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

package com.chola.halloffame.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.halloffame.exception.NoSuchusersException;
import com.chola.halloffame.model.impl.usersBaseImpl;
import com.chola.halloffame.model.impl.usersImpl;
import com.chola.halloffame.model.impl.usersModelImpl;
import com.chola.halloffame.model.users;
import com.chola.halloffame.service.persistence.usersFinder;
import com.chola.halloffame.service.persistence.usersPersistence;

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
import com.liferay.portal.kernel.service.persistence.UserFinder;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
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
import java.util.Set;

/**
 * The persistence implementation for the users service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see usersPersistence
 * @see com.chola.halloffame.service.persistence.usersUtil
 * @generated
 */
@ProviderType
public class usersFinderImpl extends usersFinderBaseImpl implements usersFinder
{
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
			pos.add("HALL_OF_FAME");
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
	
	public List getEmpData(String empId) {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("empdata");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(empId);
			return queryObject.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}

}