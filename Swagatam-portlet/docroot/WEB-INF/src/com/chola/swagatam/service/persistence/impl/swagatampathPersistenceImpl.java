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

package com.chola.swagatam.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.swagatam.exception.NoSuchswagatampathException;
import com.chola.swagatam.model.impl.swagatampathImpl;
import com.chola.swagatam.model.impl.swagatampathModelImpl;
import com.chola.swagatam.model.swagatampath;
import com.chola.swagatam.service.persistence.swagatampathPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the swagatampath service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see swagatampathPersistence
 * @see com.chola.swagatam.service.persistence.swagatampathUtil
 * @generated
 */
@ProviderType
public class swagatampathPersistenceImpl extends BasePersistenceImpl<swagatampath>
	implements swagatampathPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link swagatampathUtil} to access the swagatampath persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = swagatampathImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(swagatampathModelImpl.ENTITY_CACHE_ENABLED,
			swagatampathModelImpl.FINDER_CACHE_ENABLED, swagatampathImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(swagatampathModelImpl.ENTITY_CACHE_ENABLED,
			swagatampathModelImpl.FINDER_CACHE_ENABLED, swagatampathImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(swagatampathModelImpl.ENTITY_CACHE_ENABLED,
			swagatampathModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INDUCTIONID =
		new FinderPath(swagatampathModelImpl.ENTITY_CACHE_ENABLED,
			swagatampathModelImpl.FINDER_CACHE_ENABLED, swagatampathImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByINDUCTIONID",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INDUCTIONID =
		new FinderPath(swagatampathModelImpl.ENTITY_CACHE_ENABLED,
			swagatampathModelImpl.FINDER_CACHE_ENABLED, swagatampathImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByINDUCTIONID",
			new String[] { String.class.getName() },
			swagatampathModelImpl.INDUCTIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INDUCTIONID = new FinderPath(swagatampathModelImpl.ENTITY_CACHE_ENABLED,
			swagatampathModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByINDUCTIONID",
			new String[] { String.class.getName() });

	/**
	 * Returns all the swagatampaths where inductionid = &#63;.
	 *
	 * @param inductionid the inductionid
	 * @return the matching swagatampaths
	 */
	@Override
	public List<swagatampath> findByINDUCTIONID(String inductionid) {
		return findByINDUCTIONID(inductionid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the swagatampaths where inductionid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inductionid the inductionid
	 * @param start the lower bound of the range of swagatampaths
	 * @param end the upper bound of the range of swagatampaths (not inclusive)
	 * @return the range of matching swagatampaths
	 */
	@Override
	public List<swagatampath> findByINDUCTIONID(String inductionid, int start,
		int end) {
		return findByINDUCTIONID(inductionid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the swagatampaths where inductionid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inductionid the inductionid
	 * @param start the lower bound of the range of swagatampaths
	 * @param end the upper bound of the range of swagatampaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching swagatampaths
	 */
	@Override
	public List<swagatampath> findByINDUCTIONID(String inductionid, int start,
		int end, OrderByComparator<swagatampath> orderByComparator) {
		return findByINDUCTIONID(inductionid, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the swagatampaths where inductionid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inductionid the inductionid
	 * @param start the lower bound of the range of swagatampaths
	 * @param end the upper bound of the range of swagatampaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching swagatampaths
	 */
	@Override
	public List<swagatampath> findByINDUCTIONID(String inductionid, int start,
		int end, OrderByComparator<swagatampath> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INDUCTIONID;
			finderArgs = new Object[] { inductionid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INDUCTIONID;
			finderArgs = new Object[] { inductionid, start, end, orderByComparator };
		}

		List<swagatampath> list = null;

		if (retrieveFromCache) {
			list = (List<swagatampath>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (swagatampath swagatampath : list) {
					if (!Objects.equals(inductionid,
								swagatampath.getInductionid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_SWAGATAMPATH_WHERE);

			boolean bindInductionid = false;

			if (inductionid == null) {
				query.append(_FINDER_COLUMN_INDUCTIONID_INDUCTIONID_1);
			}
			else if (inductionid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INDUCTIONID_INDUCTIONID_3);
			}
			else {
				bindInductionid = true;

				query.append(_FINDER_COLUMN_INDUCTIONID_INDUCTIONID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(swagatampathModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInductionid) {
					qPos.add(inductionid);
				}

				if (!pagination) {
					list = (List<swagatampath>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<swagatampath>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first swagatampath in the ordered set where inductionid = &#63;.
	 *
	 * @param inductionid the inductionid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching swagatampath
	 * @throws NoSuchswagatampathException if a matching swagatampath could not be found
	 */
	@Override
	public swagatampath findByINDUCTIONID_First(String inductionid,
		OrderByComparator<swagatampath> orderByComparator)
		throws NoSuchswagatampathException {
		swagatampath swagatampath = fetchByINDUCTIONID_First(inductionid,
				orderByComparator);

		if (swagatampath != null) {
			return swagatampath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inductionid=");
		msg.append(inductionid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchswagatampathException(msg.toString());
	}

	/**
	 * Returns the first swagatampath in the ordered set where inductionid = &#63;.
	 *
	 * @param inductionid the inductionid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching swagatampath, or <code>null</code> if a matching swagatampath could not be found
	 */
	@Override
	public swagatampath fetchByINDUCTIONID_First(String inductionid,
		OrderByComparator<swagatampath> orderByComparator) {
		List<swagatampath> list = findByINDUCTIONID(inductionid, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last swagatampath in the ordered set where inductionid = &#63;.
	 *
	 * @param inductionid the inductionid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching swagatampath
	 * @throws NoSuchswagatampathException if a matching swagatampath could not be found
	 */
	@Override
	public swagatampath findByINDUCTIONID_Last(String inductionid,
		OrderByComparator<swagatampath> orderByComparator)
		throws NoSuchswagatampathException {
		swagatampath swagatampath = fetchByINDUCTIONID_Last(inductionid,
				orderByComparator);

		if (swagatampath != null) {
			return swagatampath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inductionid=");
		msg.append(inductionid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchswagatampathException(msg.toString());
	}

	/**
	 * Returns the last swagatampath in the ordered set where inductionid = &#63;.
	 *
	 * @param inductionid the inductionid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching swagatampath, or <code>null</code> if a matching swagatampath could not be found
	 */
	@Override
	public swagatampath fetchByINDUCTIONID_Last(String inductionid,
		OrderByComparator<swagatampath> orderByComparator) {
		int count = countByINDUCTIONID(inductionid);

		if (count == 0) {
			return null;
		}

		List<swagatampath> list = findByINDUCTIONID(inductionid, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the swagatampaths before and after the current swagatampath in the ordered set where inductionid = &#63;.
	 *
	 * @param id the primary key of the current swagatampath
	 * @param inductionid the inductionid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next swagatampath
	 * @throws NoSuchswagatampathException if a swagatampath with the primary key could not be found
	 */
	@Override
	public swagatampath[] findByINDUCTIONID_PrevAndNext(long id,
		String inductionid, OrderByComparator<swagatampath> orderByComparator)
		throws NoSuchswagatampathException {
		swagatampath swagatampath = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			swagatampath[] array = new swagatampathImpl[3];

			array[0] = getByINDUCTIONID_PrevAndNext(session, swagatampath,
					inductionid, orderByComparator, true);

			array[1] = swagatampath;

			array[2] = getByINDUCTIONID_PrevAndNext(session, swagatampath,
					inductionid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected swagatampath getByINDUCTIONID_PrevAndNext(Session session,
		swagatampath swagatampath, String inductionid,
		OrderByComparator<swagatampath> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SWAGATAMPATH_WHERE);

		boolean bindInductionid = false;

		if (inductionid == null) {
			query.append(_FINDER_COLUMN_INDUCTIONID_INDUCTIONID_1);
		}
		else if (inductionid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INDUCTIONID_INDUCTIONID_3);
		}
		else {
			bindInductionid = true;

			query.append(_FINDER_COLUMN_INDUCTIONID_INDUCTIONID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(swagatampathModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindInductionid) {
			qPos.add(inductionid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(swagatampath);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<swagatampath> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the swagatampaths where inductionid = &#63; from the database.
	 *
	 * @param inductionid the inductionid
	 */
	@Override
	public void removeByINDUCTIONID(String inductionid) {
		for (swagatampath swagatampath : findByINDUCTIONID(inductionid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(swagatampath);
		}
	}

	/**
	 * Returns the number of swagatampaths where inductionid = &#63;.
	 *
	 * @param inductionid the inductionid
	 * @return the number of matching swagatampaths
	 */
	@Override
	public int countByINDUCTIONID(String inductionid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INDUCTIONID;

		Object[] finderArgs = new Object[] { inductionid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SWAGATAMPATH_WHERE);

			boolean bindInductionid = false;

			if (inductionid == null) {
				query.append(_FINDER_COLUMN_INDUCTIONID_INDUCTIONID_1);
			}
			else if (inductionid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INDUCTIONID_INDUCTIONID_3);
			}
			else {
				bindInductionid = true;

				query.append(_FINDER_COLUMN_INDUCTIONID_INDUCTIONID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInductionid) {
					qPos.add(inductionid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_INDUCTIONID_INDUCTIONID_1 = "swagatampath.inductionid IS NULL";
	private static final String _FINDER_COLUMN_INDUCTIONID_INDUCTIONID_2 = "swagatampath.inductionid = ?";
	private static final String _FINDER_COLUMN_INDUCTIONID_INDUCTIONID_3 = "(swagatampath.inductionid IS NULL OR swagatampath.inductionid = '')";

	public swagatampathPersistenceImpl() {
		setModelClass(swagatampath.class);
	}

	/**
	 * Caches the swagatampath in the entity cache if it is enabled.
	 *
	 * @param swagatampath the swagatampath
	 */
	@Override
	public void cacheResult(swagatampath swagatampath) {
		entityCache.putResult(swagatampathModelImpl.ENTITY_CACHE_ENABLED,
			swagatampathImpl.class, swagatampath.getPrimaryKey(), swagatampath);

		swagatampath.resetOriginalValues();
	}

	/**
	 * Caches the swagatampaths in the entity cache if it is enabled.
	 *
	 * @param swagatampaths the swagatampaths
	 */
	@Override
	public void cacheResult(List<swagatampath> swagatampaths) {
		for (swagatampath swagatampath : swagatampaths) {
			if (entityCache.getResult(
						swagatampathModelImpl.ENTITY_CACHE_ENABLED,
						swagatampathImpl.class, swagatampath.getPrimaryKey()) == null) {
				cacheResult(swagatampath);
			}
			else {
				swagatampath.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all swagatampaths.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(swagatampathImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the swagatampath.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(swagatampath swagatampath) {
		entityCache.removeResult(swagatampathModelImpl.ENTITY_CACHE_ENABLED,
			swagatampathImpl.class, swagatampath.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<swagatampath> swagatampaths) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (swagatampath swagatampath : swagatampaths) {
			entityCache.removeResult(swagatampathModelImpl.ENTITY_CACHE_ENABLED,
				swagatampathImpl.class, swagatampath.getPrimaryKey());
		}
	}

	/**
	 * Creates a new swagatampath with the primary key. Does not add the swagatampath to the database.
	 *
	 * @param id the primary key for the new swagatampath
	 * @return the new swagatampath
	 */
	@Override
	public swagatampath create(long id) {
		swagatampath swagatampath = new swagatampathImpl();

		swagatampath.setNew(true);
		swagatampath.setPrimaryKey(id);

		return swagatampath;
	}

	/**
	 * Removes the swagatampath with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the swagatampath
	 * @return the swagatampath that was removed
	 * @throws NoSuchswagatampathException if a swagatampath with the primary key could not be found
	 */
	@Override
	public swagatampath remove(long id) throws NoSuchswagatampathException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the swagatampath with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the swagatampath
	 * @return the swagatampath that was removed
	 * @throws NoSuchswagatampathException if a swagatampath with the primary key could not be found
	 */
	@Override
	public swagatampath remove(Serializable primaryKey)
		throws NoSuchswagatampathException {
		Session session = null;

		try {
			session = openSession();

			swagatampath swagatampath = (swagatampath)session.get(swagatampathImpl.class,
					primaryKey);

			if (swagatampath == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchswagatampathException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(swagatampath);
		}
		catch (NoSuchswagatampathException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected swagatampath removeImpl(swagatampath swagatampath) {
		swagatampath = toUnwrappedModel(swagatampath);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(swagatampath)) {
				swagatampath = (swagatampath)session.get(swagatampathImpl.class,
						swagatampath.getPrimaryKeyObj());
			}

			if (swagatampath != null) {
				session.delete(swagatampath);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (swagatampath != null) {
			clearCache(swagatampath);
		}

		return swagatampath;
	}

	@Override
	public swagatampath updateImpl(swagatampath swagatampath) {
		swagatampath = toUnwrappedModel(swagatampath);

		boolean isNew = swagatampath.isNew();

		swagatampathModelImpl swagatampathModelImpl = (swagatampathModelImpl)swagatampath;

		Session session = null;

		try {
			session = openSession();

			if (swagatampath.isNew()) {
				session.save(swagatampath);

				swagatampath.setNew(false);
			}
			else {
				swagatampath = (swagatampath)session.merge(swagatampath);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !swagatampathModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((swagatampathModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INDUCTIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						swagatampathModelImpl.getOriginalInductionid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INDUCTIONID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INDUCTIONID,
					args);

				args = new Object[] { swagatampathModelImpl.getInductionid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_INDUCTIONID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INDUCTIONID,
					args);
			}
		}

		entityCache.putResult(swagatampathModelImpl.ENTITY_CACHE_ENABLED,
			swagatampathImpl.class, swagatampath.getPrimaryKey(), swagatampath,
			false);

		swagatampath.resetOriginalValues();

		return swagatampath;
	}

	protected swagatampath toUnwrappedModel(swagatampath swagatampath) {
		if (swagatampath instanceof swagatampathImpl) {
			return swagatampath;
		}

		swagatampathImpl swagatampathImpl = new swagatampathImpl();

		swagatampathImpl.setNew(swagatampath.isNew());
		swagatampathImpl.setPrimaryKey(swagatampath.getPrimaryKey());

		swagatampathImpl.setId(swagatampath.getId());
		swagatampathImpl.setInductionid(swagatampath.getInductionid());
		swagatampathImpl.setVideoPath(swagatampath.getVideoPath());
		swagatampathImpl.setVideoTitle(swagatampath.getVideoTitle());
		swagatampathImpl.setVideoDesc(swagatampath.getVideoDesc());
		swagatampathImpl.setCreatedDate(swagatampath.getCreatedDate());
		swagatampathImpl.setCreatedBy(swagatampath.getCreatedBy());
		swagatampathImpl.setUpdatedDate(swagatampath.getUpdatedDate());
		swagatampathImpl.setUpdatedBy(swagatampath.getUpdatedBy());
		swagatampathImpl.setFlag(swagatampath.getFlag());

		return swagatampathImpl;
	}

	/**
	 * Returns the swagatampath with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the swagatampath
	 * @return the swagatampath
	 * @throws NoSuchswagatampathException if a swagatampath with the primary key could not be found
	 */
	@Override
	public swagatampath findByPrimaryKey(Serializable primaryKey)
		throws NoSuchswagatampathException {
		swagatampath swagatampath = fetchByPrimaryKey(primaryKey);

		if (swagatampath == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchswagatampathException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return swagatampath;
	}

	/**
	 * Returns the swagatampath with the primary key or throws a {@link NoSuchswagatampathException} if it could not be found.
	 *
	 * @param id the primary key of the swagatampath
	 * @return the swagatampath
	 * @throws NoSuchswagatampathException if a swagatampath with the primary key could not be found
	 */
	@Override
	public swagatampath findByPrimaryKey(long id)
		throws NoSuchswagatampathException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the swagatampath with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the swagatampath
	 * @return the swagatampath, or <code>null</code> if a swagatampath with the primary key could not be found
	 */
	@Override
	public swagatampath fetchByPrimaryKey(Serializable primaryKey) {
		swagatampath swagatampath = (swagatampath)entityCache.getResult(swagatampathModelImpl.ENTITY_CACHE_ENABLED,
				swagatampathImpl.class, primaryKey);

		if (swagatampath == _nullswagatampath) {
			return null;
		}

		if (swagatampath == null) {
			Session session = null;

			try {
				session = openSession();

				swagatampath = (swagatampath)session.get(swagatampathImpl.class,
						primaryKey);

				if (swagatampath != null) {
					cacheResult(swagatampath);
				}
				else {
					entityCache.putResult(swagatampathModelImpl.ENTITY_CACHE_ENABLED,
						swagatampathImpl.class, primaryKey, _nullswagatampath);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(swagatampathModelImpl.ENTITY_CACHE_ENABLED,
					swagatampathImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return swagatampath;
	}

	/**
	 * Returns the swagatampath with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the swagatampath
	 * @return the swagatampath, or <code>null</code> if a swagatampath with the primary key could not be found
	 */
	@Override
	public swagatampath fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, swagatampath> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, swagatampath> map = new HashMap<Serializable, swagatampath>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			swagatampath swagatampath = fetchByPrimaryKey(primaryKey);

			if (swagatampath != null) {
				map.put(primaryKey, swagatampath);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			swagatampath swagatampath = (swagatampath)entityCache.getResult(swagatampathModelImpl.ENTITY_CACHE_ENABLED,
					swagatampathImpl.class, primaryKey);

			if (swagatampath == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, swagatampath);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SWAGATAMPATH_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (swagatampath swagatampath : (List<swagatampath>)q.list()) {
				map.put(swagatampath.getPrimaryKeyObj(), swagatampath);

				cacheResult(swagatampath);

				uncachedPrimaryKeys.remove(swagatampath.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(swagatampathModelImpl.ENTITY_CACHE_ENABLED,
					swagatampathImpl.class, primaryKey, _nullswagatampath);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the swagatampaths.
	 *
	 * @return the swagatampaths
	 */
	@Override
	public List<swagatampath> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the swagatampaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of swagatampaths
	 * @param end the upper bound of the range of swagatampaths (not inclusive)
	 * @return the range of swagatampaths
	 */
	@Override
	public List<swagatampath> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the swagatampaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of swagatampaths
	 * @param end the upper bound of the range of swagatampaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of swagatampaths
	 */
	@Override
	public List<swagatampath> findAll(int start, int end,
		OrderByComparator<swagatampath> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the swagatampaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of swagatampaths
	 * @param end the upper bound of the range of swagatampaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of swagatampaths
	 */
	@Override
	public List<swagatampath> findAll(int start, int end,
		OrderByComparator<swagatampath> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<swagatampath> list = null;

		if (retrieveFromCache) {
			list = (List<swagatampath>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SWAGATAMPATH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SWAGATAMPATH;

				if (pagination) {
					sql = sql.concat(swagatampathModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<swagatampath>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<swagatampath>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the swagatampaths from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (swagatampath swagatampath : findAll()) {
			remove(swagatampath);
		}
	}

	/**
	 * Returns the number of swagatampaths.
	 *
	 * @return the number of swagatampaths
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SWAGATAMPATH);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return swagatampathModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the swagatampath persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(swagatampathImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_SWAGATAMPATH = "SELECT swagatampath FROM swagatampath swagatampath";
	private static final String _SQL_SELECT_SWAGATAMPATH_WHERE_PKS_IN = "SELECT swagatampath FROM swagatampath swagatampath WHERE id_ IN (";
	private static final String _SQL_SELECT_SWAGATAMPATH_WHERE = "SELECT swagatampath FROM swagatampath swagatampath WHERE ";
	private static final String _SQL_COUNT_SWAGATAMPATH = "SELECT COUNT(swagatampath) FROM swagatampath swagatampath";
	private static final String _SQL_COUNT_SWAGATAMPATH_WHERE = "SELECT COUNT(swagatampath) FROM swagatampath swagatampath WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "swagatampath.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No swagatampath exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No swagatampath exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(swagatampathPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final swagatampath _nullswagatampath = new swagatampathImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<swagatampath> toCacheModel() {
				return _nullswagatampathCacheModel;
			}
		};

	private static final CacheModel<swagatampath> _nullswagatampathCacheModel = new CacheModel<swagatampath>() {
			@Override
			public swagatampath toEntityModel() {
				return _nullswagatampath;
			}
		};
}