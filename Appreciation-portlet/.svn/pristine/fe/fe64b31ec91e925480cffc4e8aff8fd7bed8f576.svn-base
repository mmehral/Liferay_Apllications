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

package com.chola.appcorner.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.appcorner.exception.NoSuchpostException;
import com.chola.appcorner.model.impl.postImpl;
import com.chola.appcorner.model.impl.postModelImpl;
import com.chola.appcorner.model.post;
import com.chola.appcorner.service.persistence.postFinder;
import com.chola.appcorner.service.persistence.postPersistence;

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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


@ProviderType
public class postFinderImpl extends postFinderBaseImpl
	implements postFinder {
	
	public boolean insertNotificationData(int syscode, int val, String sysname, int status, int sttsflag,long usernotifyId) {
        boolean flag = false;
        Session session = null;
        try {
            session = openSession();
            String sql = CustomSQLUtil.get("notifycat");
            SQLQuery queryObject = session.createSQLQuery(sql);
            queryObject.setCacheable(false);
            QueryPos qPos = QueryPos.getInstance(queryObject);
            qPos.add(syscode);
            qPos.add(val);
            qPos.add(sysname);
            qPos.add(status);
            qPos.add(sttsflag);
            qPos.add(usernotifyId);
            int i = queryObject.executeUpdate();
            System.out.println("Update Value=====" + i);
            if (i != 0) {
                flag = true;
            }
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeSession(session);
        }

        return flag;
    }
	
	public List<Object[]> SyscodeCustomMsg(int syscode) {
        boolean flag = false;
        Session session = null;
        try {
            session = openSession();
            String sql = CustomSQLUtil.get("syscode");
            SQLQuery queryObject = session.createSQLQuery(sql);
            queryObject.setCacheable(false);
            QueryPos qPos = QueryPos.getInstance(queryObject);
            qPos.add(syscode);
            
            return (List<Object[]>) queryObject.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeSession(session);
        }
        return null;
    }
	
	}