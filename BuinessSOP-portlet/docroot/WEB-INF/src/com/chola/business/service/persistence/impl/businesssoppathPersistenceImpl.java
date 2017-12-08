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

package com.chola.business.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.business.exception.NoSuchbusinesssoppathException;
import com.chola.business.model.businesssoppath;
import com.chola.business.model.impl.businesssoppathImpl;
import com.chola.business.model.impl.businesssoppathModelImpl;
import com.chola.business.service.persistence.businesssoppathPersistence;

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
import java.util.Set;

/**
 * The persistence implementation for the businesssoppath service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see businesssoppathPersistence
 * @see com.chola.business.service.persistence.businesssoppathUtil
 * @generated
 */
@ProviderType
public class businesssoppathPersistenceImpl extends BasePersistenceImpl<businesssoppath>
	implements businesssoppathPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link businesssoppathUtil} to access the businesssoppath persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = businesssoppathImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(businesssoppathModelImpl.ENTITY_CACHE_ENABLED,
			businesssoppathModelImpl.FINDER_CACHE_ENABLED,
			businesssoppathImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(businesssoppathModelImpl.ENTITY_CACHE_ENABLED,
			businesssoppathModelImpl.FINDER_CACHE_ENABLED,
			businesssoppathImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(businesssoppathModelImpl.ENTITY_CACHE_ENABLED,
			businesssoppathModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SOP_ID = new FinderPath(businesssoppathModelImpl.ENTITY_CACHE_ENABLED,
			businesssoppathModelImpl.FINDER_CACHE_ENABLED,
			businesssoppathImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBySOP_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOP_ID =
		new FinderPath(businesssoppathModelImpl.ENTITY_CACHE_ENABLED,
			businesssoppathModelImpl.FINDER_CACHE_ENABLED,
			businesssoppathImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySOP_ID",
			new String[] { Long.class.getName() },
			businesssoppathModelImpl.BUSINESSDETAILS_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SOP_ID = new FinderPath(businesssoppathModelImpl.ENTITY_CACHE_ENABLED,
			businesssoppathModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySOP_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the businesssoppaths where businessdetails_id = &#63;.
	 *
	 * @param businessdetails_id the businessdetails_id
	 * @return the matching businesssoppaths
	 */
	@Override
	public List<businesssoppath> findBySOP_ID(long businessdetails_id) {
		return findBySOP_ID(businessdetails_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the businesssoppaths where businessdetails_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param businessdetails_id the businessdetails_id
	 * @param start the lower bound of the range of businesssoppaths
	 * @param end the upper bound of the range of businesssoppaths (not inclusive)
	 * @return the range of matching businesssoppaths
	 */
	@Override
	public List<businesssoppath> findBySOP_ID(long businessdetails_id,
		int start, int end) {
		return findBySOP_ID(businessdetails_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the businesssoppaths where businessdetails_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param businessdetails_id the businessdetails_id
	 * @param start the lower bound of the range of businesssoppaths
	 * @param end the upper bound of the range of businesssoppaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching businesssoppaths
	 */
	@Override
	public List<businesssoppath> findBySOP_ID(long businessdetails_id,
		int start, int end, OrderByComparator<businesssoppath> orderByComparator) {
		return findBySOP_ID(businessdetails_id, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the businesssoppaths where businessdetails_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param businessdetails_id the businessdetails_id
	 * @param start the lower bound of the range of businesssoppaths
	 * @param end the upper bound of the range of businesssoppaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching businesssoppaths
	 */
	@Override
	public List<businesssoppath> findBySOP_ID(long businessdetails_id,
		int start, int end,
		OrderByComparator<businesssoppath> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOP_ID;
			finderArgs = new Object[] { businessdetails_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SOP_ID;
			finderArgs = new Object[] {
					businessdetails_id,
					
					start, end, orderByComparator
				};
		}

		List<businesssoppath> list = null;

		if (retrieveFromCache) {
			list = (List<businesssoppath>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (businesssoppath businesssoppath : list) {
					if ((businessdetails_id != businesssoppath.getBusinessdetails_id())) {
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

			query.append(_SQL_SELECT_BUSINESSSOPPATH_WHERE);

			query.append(_FINDER_COLUMN_SOP_ID_BUSINESSDETAILS_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(businesssoppathModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(businessdetails_id);

				if (!pagination) {
					list = (List<businesssoppath>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<businesssoppath>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first businesssoppath in the ordered set where businessdetails_id = &#63;.
	 *
	 * @param businessdetails_id the businessdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching businesssoppath
	 * @throws NoSuchbusinesssoppathException if a matching businesssoppath could not be found
	 */
	@Override
	public businesssoppath findBySOP_ID_First(long businessdetails_id,
		OrderByComparator<businesssoppath> orderByComparator)
		throws NoSuchbusinesssoppathException {
		businesssoppath businesssoppath = fetchBySOP_ID_First(businessdetails_id,
				orderByComparator);

		if (businesssoppath != null) {
			return businesssoppath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("businessdetails_id=");
		msg.append(businessdetails_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbusinesssoppathException(msg.toString());
	}

	/**
	 * Returns the first businesssoppath in the ordered set where businessdetails_id = &#63;.
	 *
	 * @param businessdetails_id the businessdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching businesssoppath, or <code>null</code> if a matching businesssoppath could not be found
	 */
	@Override
	public businesssoppath fetchBySOP_ID_First(long businessdetails_id,
		OrderByComparator<businesssoppath> orderByComparator) {
		List<businesssoppath> list = findBySOP_ID(businessdetails_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last businesssoppath in the ordered set where businessdetails_id = &#63;.
	 *
	 * @param businessdetails_id the businessdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching businesssoppath
	 * @throws NoSuchbusinesssoppathException if a matching businesssoppath could not be found
	 */
	@Override
	public businesssoppath findBySOP_ID_Last(long businessdetails_id,
		OrderByComparator<businesssoppath> orderByComparator)
		throws NoSuchbusinesssoppathException {
		businesssoppath businesssoppath = fetchBySOP_ID_Last(businessdetails_id,
				orderByComparator);

		if (businesssoppath != null) {
			return businesssoppath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("businessdetails_id=");
		msg.append(businessdetails_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbusinesssoppathException(msg.toString());
	}

	/**
	 * Returns the last businesssoppath in the ordered set where businessdetails_id = &#63;.
	 *
	 * @param businessdetails_id the businessdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching businesssoppath, or <code>null</code> if a matching businesssoppath could not be found
	 */
	@Override
	public businesssoppath fetchBySOP_ID_Last(long businessdetails_id,
		OrderByComparator<businesssoppath> orderByComparator) {
		int count = countBySOP_ID(businessdetails_id);

		if (count == 0) {
			return null;
		}

		List<businesssoppath> list = findBySOP_ID(businessdetails_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the businesssoppaths before and after the current businesssoppath in the ordered set where businessdetails_id = &#63;.
	 *
	 * @param id the primary key of the current businesssoppath
	 * @param businessdetails_id the businessdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next businesssoppath
	 * @throws NoSuchbusinesssoppathException if a businesssoppath with the primary key could not be found
	 */
	@Override
	public businesssoppath[] findBySOP_ID_PrevAndNext(long id,
		long businessdetails_id,
		OrderByComparator<businesssoppath> orderByComparator)
		throws NoSuchbusinesssoppathException {
		businesssoppath businesssoppath = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			businesssoppath[] array = new businesssoppathImpl[3];

			array[0] = getBySOP_ID_PrevAndNext(session, businesssoppath,
					businessdetails_id, orderByComparator, true);

			array[1] = businesssoppath;

			array[2] = getBySOP_ID_PrevAndNext(session, businesssoppath,
					businessdetails_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected businesssoppath getBySOP_ID_PrevAndNext(Session session,
		businesssoppath businesssoppath, long businessdetails_id,
		OrderByComparator<businesssoppath> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BUSINESSSOPPATH_WHERE);

		query.append(_FINDER_COLUMN_SOP_ID_BUSINESSDETAILS_ID_2);

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
			query.append(businesssoppathModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(businessdetails_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(businesssoppath);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<businesssoppath> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the businesssoppaths where businessdetails_id = &#63; from the database.
	 *
	 * @param businessdetails_id the businessdetails_id
	 */
	@Override
	public void removeBySOP_ID(long businessdetails_id) {
		for (businesssoppath businesssoppath : findBySOP_ID(
				businessdetails_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(businesssoppath);
		}
	}

	/**
	 * Returns the number of businesssoppaths where businessdetails_id = &#63;.
	 *
	 * @param businessdetails_id the businessdetails_id
	 * @return the number of matching businesssoppaths
	 */
	@Override
	public int countBySOP_ID(long businessdetails_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SOP_ID;

		Object[] finderArgs = new Object[] { businessdetails_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BUSINESSSOPPATH_WHERE);

			query.append(_FINDER_COLUMN_SOP_ID_BUSINESSDETAILS_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(businessdetails_id);

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

	private static final String _FINDER_COLUMN_SOP_ID_BUSINESSDETAILS_ID_2 = "businesssoppath.businessdetails_id = ?";

	public businesssoppathPersistenceImpl() {
		setModelClass(businesssoppath.class);
	}

	/**
	 * Caches the businesssoppath in the entity cache if it is enabled.
	 *
	 * @param businesssoppath the businesssoppath
	 */
	@Override
	public void cacheResult(businesssoppath businesssoppath) {
		entityCache.putResult(businesssoppathModelImpl.ENTITY_CACHE_ENABLED,
			businesssoppathImpl.class, businesssoppath.getPrimaryKey(),
			businesssoppath);

		businesssoppath.resetOriginalValues();
	}

	/**
	 * Caches the businesssoppaths in the entity cache if it is enabled.
	 *
	 * @param businesssoppaths the businesssoppaths
	 */
	@Override
	public void cacheResult(List<businesssoppath> businesssoppaths) {
		for (businesssoppath businesssoppath : businesssoppaths) {
			if (entityCache.getResult(
						businesssoppathModelImpl.ENTITY_CACHE_ENABLED,
						businesssoppathImpl.class,
						businesssoppath.getPrimaryKey()) == null) {
				cacheResult(businesssoppath);
			}
			else {
				businesssoppath.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all businesssoppaths.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(businesssoppathImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the businesssoppath.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(businesssoppath businesssoppath) {
		entityCache.removeResult(businesssoppathModelImpl.ENTITY_CACHE_ENABLED,
			businesssoppathImpl.class, businesssoppath.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<businesssoppath> businesssoppaths) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (businesssoppath businesssoppath : businesssoppaths) {
			entityCache.removeResult(businesssoppathModelImpl.ENTITY_CACHE_ENABLED,
				businesssoppathImpl.class, businesssoppath.getPrimaryKey());
		}
	}

	/**
	 * Creates a new businesssoppath with the primary key. Does not add the businesssoppath to the database.
	 *
	 * @param id the primary key for the new businesssoppath
	 * @return the new businesssoppath
	 */
	@Override
	public businesssoppath create(long id) {
		businesssoppath businesssoppath = new businesssoppathImpl();

		businesssoppath.setNew(true);
		businesssoppath.setPrimaryKey(id);

		return businesssoppath;
	}

	/**
	 * Removes the businesssoppath with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the businesssoppath
	 * @return the businesssoppath that was removed
	 * @throws NoSuchbusinesssoppathException if a businesssoppath with the primary key could not be found
	 */
	@Override
	public businesssoppath remove(long id)
		throws NoSuchbusinesssoppathException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the businesssoppath with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the businesssoppath
	 * @return the businesssoppath that was removed
	 * @throws NoSuchbusinesssoppathException if a businesssoppath with the primary key could not be found
	 */
	@Override
	public businesssoppath remove(Serializable primaryKey)
		throws NoSuchbusinesssoppathException {
		Session session = null;

		try {
			session = openSession();

			businesssoppath businesssoppath = (businesssoppath)session.get(businesssoppathImpl.class,
					primaryKey);

			if (businesssoppath == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbusinesssoppathException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(businesssoppath);
		}
		catch (NoSuchbusinesssoppathException nsee) {
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
	protected businesssoppath removeImpl(businesssoppath businesssoppath) {
		businesssoppath = toUnwrappedModel(businesssoppath);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(businesssoppath)) {
				businesssoppath = (businesssoppath)session.get(businesssoppathImpl.class,
						businesssoppath.getPrimaryKeyObj());
			}

			if (businesssoppath != null) {
				session.delete(businesssoppath);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (businesssoppath != null) {
			clearCache(businesssoppath);
		}

		return businesssoppath;
	}

	@Override
	public businesssoppath updateImpl(businesssoppath businesssoppath) {
		businesssoppath = toUnwrappedModel(businesssoppath);

		boolean isNew = businesssoppath.isNew();

		businesssoppathModelImpl businesssoppathModelImpl = (businesssoppathModelImpl)businesssoppath;

		Session session = null;

		try {
			session = openSession();

			if (businesssoppath.isNew()) {
				session.save(businesssoppath);

				businesssoppath.setNew(false);
			}
			else {
				businesssoppath = (businesssoppath)session.merge(businesssoppath);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !businesssoppathModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((businesssoppathModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOP_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						businesssoppathModelImpl.getOriginalBusinessdetails_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SOP_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOP_ID,
					args);

				args = new Object[] {
						businesssoppathModelImpl.getBusinessdetails_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SOP_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOP_ID,
					args);
			}
		}

		entityCache.putResult(businesssoppathModelImpl.ENTITY_CACHE_ENABLED,
			businesssoppathImpl.class, businesssoppath.getPrimaryKey(),
			businesssoppath, false);

		businesssoppath.resetOriginalValues();

		return businesssoppath;
	}

	protected businesssoppath toUnwrappedModel(businesssoppath businesssoppath) {
		if (businesssoppath instanceof businesssoppathImpl) {
			return businesssoppath;
		}

		businesssoppathImpl businesssoppathImpl = new businesssoppathImpl();

		businesssoppathImpl.setNew(businesssoppath.isNew());
		businesssoppathImpl.setPrimaryKey(businesssoppath.getPrimaryKey());

		businesssoppathImpl.setId(businesssoppath.getId());
		businesssoppathImpl.setBusinessdoc(businesssoppath.getBusinessdoc());
		businesssoppathImpl.setBusinessPath(businesssoppath.getBusinessPath());
		businesssoppathImpl.setCreatedDate(businesssoppath.getCreatedDate());
		businesssoppathImpl.setCreatedBy(businesssoppath.getCreatedBy());
		businesssoppathImpl.setFlag(businesssoppath.getFlag());
		businesssoppathImpl.setBusinessdetails_id(businesssoppath.getBusinessdetails_id());

		return businesssoppathImpl;
	}

	/**
	 * Returns the businesssoppath with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the businesssoppath
	 * @return the businesssoppath
	 * @throws NoSuchbusinesssoppathException if a businesssoppath with the primary key could not be found
	 */
	@Override
	public businesssoppath findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbusinesssoppathException {
		businesssoppath businesssoppath = fetchByPrimaryKey(primaryKey);

		if (businesssoppath == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbusinesssoppathException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return businesssoppath;
	}

	/**
	 * Returns the businesssoppath with the primary key or throws a {@link NoSuchbusinesssoppathException} if it could not be found.
	 *
	 * @param id the primary key of the businesssoppath
	 * @return the businesssoppath
	 * @throws NoSuchbusinesssoppathException if a businesssoppath with the primary key could not be found
	 */
	@Override
	public businesssoppath findByPrimaryKey(long id)
		throws NoSuchbusinesssoppathException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the businesssoppath with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the businesssoppath
	 * @return the businesssoppath, or <code>null</code> if a businesssoppath with the primary key could not be found
	 */
	@Override
	public businesssoppath fetchByPrimaryKey(Serializable primaryKey) {
		businesssoppath businesssoppath = (businesssoppath)entityCache.getResult(businesssoppathModelImpl.ENTITY_CACHE_ENABLED,
				businesssoppathImpl.class, primaryKey);

		if (businesssoppath == _nullbusinesssoppath) {
			return null;
		}

		if (businesssoppath == null) {
			Session session = null;

			try {
				session = openSession();

				businesssoppath = (businesssoppath)session.get(businesssoppathImpl.class,
						primaryKey);

				if (businesssoppath != null) {
					cacheResult(businesssoppath);
				}
				else {
					entityCache.putResult(businesssoppathModelImpl.ENTITY_CACHE_ENABLED,
						businesssoppathImpl.class, primaryKey,
						_nullbusinesssoppath);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(businesssoppathModelImpl.ENTITY_CACHE_ENABLED,
					businesssoppathImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return businesssoppath;
	}

	/**
	 * Returns the businesssoppath with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the businesssoppath
	 * @return the businesssoppath, or <code>null</code> if a businesssoppath with the primary key could not be found
	 */
	@Override
	public businesssoppath fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, businesssoppath> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, businesssoppath> map = new HashMap<Serializable, businesssoppath>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			businesssoppath businesssoppath = fetchByPrimaryKey(primaryKey);

			if (businesssoppath != null) {
				map.put(primaryKey, businesssoppath);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			businesssoppath businesssoppath = (businesssoppath)entityCache.getResult(businesssoppathModelImpl.ENTITY_CACHE_ENABLED,
					businesssoppathImpl.class, primaryKey);

			if (businesssoppath == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, businesssoppath);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BUSINESSSOPPATH_WHERE_PKS_IN);

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

			for (businesssoppath businesssoppath : (List<businesssoppath>)q.list()) {
				map.put(businesssoppath.getPrimaryKeyObj(), businesssoppath);

				cacheResult(businesssoppath);

				uncachedPrimaryKeys.remove(businesssoppath.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(businesssoppathModelImpl.ENTITY_CACHE_ENABLED,
					businesssoppathImpl.class, primaryKey, _nullbusinesssoppath);
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
	 * Returns all the businesssoppaths.
	 *
	 * @return the businesssoppaths
	 */
	@Override
	public List<businesssoppath> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the businesssoppaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of businesssoppaths
	 * @param end the upper bound of the range of businesssoppaths (not inclusive)
	 * @return the range of businesssoppaths
	 */
	@Override
	public List<businesssoppath> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the businesssoppaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of businesssoppaths
	 * @param end the upper bound of the range of businesssoppaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of businesssoppaths
	 */
	@Override
	public List<businesssoppath> findAll(int start, int end,
		OrderByComparator<businesssoppath> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the businesssoppaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of businesssoppaths
	 * @param end the upper bound of the range of businesssoppaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of businesssoppaths
	 */
	@Override
	public List<businesssoppath> findAll(int start, int end,
		OrderByComparator<businesssoppath> orderByComparator,
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

		List<businesssoppath> list = null;

		if (retrieveFromCache) {
			list = (List<businesssoppath>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BUSINESSSOPPATH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BUSINESSSOPPATH;

				if (pagination) {
					sql = sql.concat(businesssoppathModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<businesssoppath>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<businesssoppath>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the businesssoppaths from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (businesssoppath businesssoppath : findAll()) {
			remove(businesssoppath);
		}
	}

	/**
	 * Returns the number of businesssoppaths.
	 *
	 * @return the number of businesssoppaths
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BUSINESSSOPPATH);

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
		return businesssoppathModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the businesssoppath persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(businesssoppathImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_BUSINESSSOPPATH = "SELECT businesssoppath FROM businesssoppath businesssoppath";
	private static final String _SQL_SELECT_BUSINESSSOPPATH_WHERE_PKS_IN = "SELECT businesssoppath FROM businesssoppath businesssoppath WHERE id_ IN (";
	private static final String _SQL_SELECT_BUSINESSSOPPATH_WHERE = "SELECT businesssoppath FROM businesssoppath businesssoppath WHERE ";
	private static final String _SQL_COUNT_BUSINESSSOPPATH = "SELECT COUNT(businesssoppath) FROM businesssoppath businesssoppath";
	private static final String _SQL_COUNT_BUSINESSSOPPATH_WHERE = "SELECT COUNT(businesssoppath) FROM businesssoppath businesssoppath WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "businesssoppath.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No businesssoppath exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No businesssoppath exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(businesssoppathPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final businesssoppath _nullbusinesssoppath = new businesssoppathImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<businesssoppath> toCacheModel() {
				return _nullbusinesssoppathCacheModel;
			}
		};

	private static final CacheModel<businesssoppath> _nullbusinesssoppathCacheModel =
		new CacheModel<businesssoppath>() {
			@Override
			public businesssoppath toEntityModel() {
				return _nullbusinesssoppath;
			}
		};
}