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

package com.chola.successstories.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.successstories.exception.NoSuchsspathException;
import com.chola.successstories.model.impl.sspathImpl;
import com.chola.successstories.model.impl.sspathModelImpl;
import com.chola.successstories.model.sspath;
import com.chola.successstories.service.persistence.sspathPersistence;

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
 * The persistence implementation for the sspath service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see sspathPersistence
 * @see com.chola.successstories.service.persistence.sspathUtil
 * @generated
 */
@ProviderType
public class sspathPersistenceImpl extends BasePersistenceImpl<sspath>
	implements sspathPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link sspathUtil} to access the sspath persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = sspathImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(sspathModelImpl.ENTITY_CACHE_ENABLED,
			sspathModelImpl.FINDER_CACHE_ENABLED, sspathImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(sspathModelImpl.ENTITY_CACHE_ENABLED,
			sspathModelImpl.FINDER_CACHE_ENABLED, sspathImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(sspathModelImpl.ENTITY_CACHE_ENABLED,
			sspathModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(sspathModelImpl.ENTITY_CACHE_ENABLED,
			sspathModelImpl.FINDER_CACHE_ENABLED, sspathImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCONTENT_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(sspathModelImpl.ENTITY_CACHE_ENABLED,
			sspathModelImpl.FINDER_CACHE_ENABLED, sspathImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCONTENT_ID",
			new String[] { Long.class.getName() },
			sspathModelImpl.CONTENT_ID_COLUMN_BITMASK |
			sspathModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTENT_ID = new FinderPath(sspathModelImpl.ENTITY_CACHE_ENABLED,
			sspathModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCONTENT_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the sspaths where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the matching sspaths
	 */
	@Override
	public List<sspath> findByCONTENT_ID(long content_id) {
		return findByCONTENT_ID(content_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sspaths where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sspathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of sspaths
	 * @param end the upper bound of the range of sspaths (not inclusive)
	 * @return the range of matching sspaths
	 */
	@Override
	public List<sspath> findByCONTENT_ID(long content_id, int start, int end) {
		return findByCONTENT_ID(content_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sspaths where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sspathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of sspaths
	 * @param end the upper bound of the range of sspaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sspaths
	 */
	@Override
	public List<sspath> findByCONTENT_ID(long content_id, int start, int end,
		OrderByComparator<sspath> orderByComparator) {
		return findByCONTENT_ID(content_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sspaths where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sspathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of sspaths
	 * @param end the upper bound of the range of sspaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching sspaths
	 */
	@Override
	public List<sspath> findByCONTENT_ID(long content_id, int start, int end,
		OrderByComparator<sspath> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID;
			finderArgs = new Object[] { content_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENT_ID;
			finderArgs = new Object[] { content_id, start, end, orderByComparator };
		}

		List<sspath> list = null;

		if (retrieveFromCache) {
			list = (List<sspath>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (sspath sspath : list) {
					if ((content_id != sspath.getContent_id())) {
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

			query.append(_SQL_SELECT_SSPATH_WHERE);

			query.append(_FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(sspathModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(content_id);

				if (!pagination) {
					list = (List<sspath>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<sspath>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first sspath in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sspath
	 * @throws NoSuchsspathException if a matching sspath could not be found
	 */
	@Override
	public sspath findByCONTENT_ID_First(long content_id,
		OrderByComparator<sspath> orderByComparator)
		throws NoSuchsspathException {
		sspath sspath = fetchByCONTENT_ID_First(content_id, orderByComparator);

		if (sspath != null) {
			return sspath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsspathException(msg.toString());
	}

	/**
	 * Returns the first sspath in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sspath, or <code>null</code> if a matching sspath could not be found
	 */
	@Override
	public sspath fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<sspath> orderByComparator) {
		List<sspath> list = findByCONTENT_ID(content_id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sspath in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sspath
	 * @throws NoSuchsspathException if a matching sspath could not be found
	 */
	@Override
	public sspath findByCONTENT_ID_Last(long content_id,
		OrderByComparator<sspath> orderByComparator)
		throws NoSuchsspathException {
		sspath sspath = fetchByCONTENT_ID_Last(content_id, orderByComparator);

		if (sspath != null) {
			return sspath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchsspathException(msg.toString());
	}

	/**
	 * Returns the last sspath in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sspath, or <code>null</code> if a matching sspath could not be found
	 */
	@Override
	public sspath fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<sspath> orderByComparator) {
		int count = countByCONTENT_ID(content_id);

		if (count == 0) {
			return null;
		}

		List<sspath> list = findByCONTENT_ID(content_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sspaths before and after the current sspath in the ordered set where content_id = &#63;.
	 *
	 * @param id the primary key of the current sspath
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sspath
	 * @throws NoSuchsspathException if a sspath with the primary key could not be found
	 */
	@Override
	public sspath[] findByCONTENT_ID_PrevAndNext(long id, long content_id,
		OrderByComparator<sspath> orderByComparator)
		throws NoSuchsspathException {
		sspath sspath = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			sspath[] array = new sspathImpl[3];

			array[0] = getByCONTENT_ID_PrevAndNext(session, sspath, content_id,
					orderByComparator, true);

			array[1] = sspath;

			array[2] = getByCONTENT_ID_PrevAndNext(session, sspath, content_id,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected sspath getByCONTENT_ID_PrevAndNext(Session session,
		sspath sspath, long content_id,
		OrderByComparator<sspath> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SSPATH_WHERE);

		query.append(_FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2);

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
			query.append(sspathModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(content_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(sspath);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<sspath> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sspaths where content_id = &#63; from the database.
	 *
	 * @param content_id the content_id
	 */
	@Override
	public void removeByCONTENT_ID(long content_id) {
		for (sspath sspath : findByCONTENT_ID(content_id, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(sspath);
		}
	}

	/**
	 * Returns the number of sspaths where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the number of matching sspaths
	 */
	@Override
	public int countByCONTENT_ID(long content_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTENT_ID;

		Object[] finderArgs = new Object[] { content_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SSPATH_WHERE);

			query.append(_FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(content_id);

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

	private static final String _FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2 = "sspath.content_id = ?";

	public sspathPersistenceImpl() {
		setModelClass(sspath.class);
	}

	/**
	 * Caches the sspath in the entity cache if it is enabled.
	 *
	 * @param sspath the sspath
	 */
	@Override
	public void cacheResult(sspath sspath) {
		entityCache.putResult(sspathModelImpl.ENTITY_CACHE_ENABLED,
			sspathImpl.class, sspath.getPrimaryKey(), sspath);

		sspath.resetOriginalValues();
	}

	/**
	 * Caches the sspaths in the entity cache if it is enabled.
	 *
	 * @param sspaths the sspaths
	 */
	@Override
	public void cacheResult(List<sspath> sspaths) {
		for (sspath sspath : sspaths) {
			if (entityCache.getResult(sspathModelImpl.ENTITY_CACHE_ENABLED,
						sspathImpl.class, sspath.getPrimaryKey()) == null) {
				cacheResult(sspath);
			}
			else {
				sspath.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all sspaths.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(sspathImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the sspath.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(sspath sspath) {
		entityCache.removeResult(sspathModelImpl.ENTITY_CACHE_ENABLED,
			sspathImpl.class, sspath.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<sspath> sspaths) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (sspath sspath : sspaths) {
			entityCache.removeResult(sspathModelImpl.ENTITY_CACHE_ENABLED,
				sspathImpl.class, sspath.getPrimaryKey());
		}
	}

	/**
	 * Creates a new sspath with the primary key. Does not add the sspath to the database.
	 *
	 * @param id the primary key for the new sspath
	 * @return the new sspath
	 */
	@Override
	public sspath create(long id) {
		sspath sspath = new sspathImpl();

		sspath.setNew(true);
		sspath.setPrimaryKey(id);

		return sspath;
	}

	/**
	 * Removes the sspath with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the sspath
	 * @return the sspath that was removed
	 * @throws NoSuchsspathException if a sspath with the primary key could not be found
	 */
	@Override
	public sspath remove(long id) throws NoSuchsspathException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the sspath with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sspath
	 * @return the sspath that was removed
	 * @throws NoSuchsspathException if a sspath with the primary key could not be found
	 */
	@Override
	public sspath remove(Serializable primaryKey) throws NoSuchsspathException {
		Session session = null;

		try {
			session = openSession();

			sspath sspath = (sspath)session.get(sspathImpl.class, primaryKey);

			if (sspath == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsspathException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(sspath);
		}
		catch (NoSuchsspathException nsee) {
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
	protected sspath removeImpl(sspath sspath) {
		sspath = toUnwrappedModel(sspath);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sspath)) {
				sspath = (sspath)session.get(sspathImpl.class,
						sspath.getPrimaryKeyObj());
			}

			if (sspath != null) {
				session.delete(sspath);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (sspath != null) {
			clearCache(sspath);
		}

		return sspath;
	}

	@Override
	public sspath updateImpl(sspath sspath) {
		sspath = toUnwrappedModel(sspath);

		boolean isNew = sspath.isNew();

		sspathModelImpl sspathModelImpl = (sspathModelImpl)sspath;

		Session session = null;

		try {
			session = openSession();

			if (sspath.isNew()) {
				session.save(sspath);

				sspath.setNew(false);
			}
			else {
				sspath = (sspath)session.merge(sspath);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !sspathModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((sspathModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						sspathModelImpl.getOriginalContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);

				args = new Object[] { sspathModelImpl.getContent_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);
			}
		}

		entityCache.putResult(sspathModelImpl.ENTITY_CACHE_ENABLED,
			sspathImpl.class, sspath.getPrimaryKey(), sspath, false);

		sspath.resetOriginalValues();

		return sspath;
	}

	protected sspath toUnwrappedModel(sspath sspath) {
		if (sspath instanceof sspathImpl) {
			return sspath;
		}

		sspathImpl sspathImpl = new sspathImpl();

		sspathImpl.setNew(sspath.isNew());
		sspathImpl.setPrimaryKey(sspath.getPrimaryKey());

		sspathImpl.setId(sspath.getId());
		sspathImpl.setSsfiledoc(sspath.getSsfiledoc());
		sspathImpl.setSsfilepath(sspath.getSsfilepath());
		sspathImpl.setCreatedDate(sspath.getCreatedDate());
		sspathImpl.setCreatedBy(sspath.getCreatedBy());
		sspathImpl.setFlag(sspath.getFlag());
		sspathImpl.setSsdetails_id(sspath.getSsdetails_id());
		sspathImpl.setContent_id(sspath.getContent_id());
		sspathImpl.setSsfilename(sspath.getSsfilename());

		return sspathImpl;
	}

	/**
	 * Returns the sspath with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the sspath
	 * @return the sspath
	 * @throws NoSuchsspathException if a sspath with the primary key could not be found
	 */
	@Override
	public sspath findByPrimaryKey(Serializable primaryKey)
		throws NoSuchsspathException {
		sspath sspath = fetchByPrimaryKey(primaryKey);

		if (sspath == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchsspathException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return sspath;
	}

	/**
	 * Returns the sspath with the primary key or throws a {@link NoSuchsspathException} if it could not be found.
	 *
	 * @param id the primary key of the sspath
	 * @return the sspath
	 * @throws NoSuchsspathException if a sspath with the primary key could not be found
	 */
	@Override
	public sspath findByPrimaryKey(long id) throws NoSuchsspathException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the sspath with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sspath
	 * @return the sspath, or <code>null</code> if a sspath with the primary key could not be found
	 */
	@Override
	public sspath fetchByPrimaryKey(Serializable primaryKey) {
		sspath sspath = (sspath)entityCache.getResult(sspathModelImpl.ENTITY_CACHE_ENABLED,
				sspathImpl.class, primaryKey);

		if (sspath == _nullsspath) {
			return null;
		}

		if (sspath == null) {
			Session session = null;

			try {
				session = openSession();

				sspath = (sspath)session.get(sspathImpl.class, primaryKey);

				if (sspath != null) {
					cacheResult(sspath);
				}
				else {
					entityCache.putResult(sspathModelImpl.ENTITY_CACHE_ENABLED,
						sspathImpl.class, primaryKey, _nullsspath);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(sspathModelImpl.ENTITY_CACHE_ENABLED,
					sspathImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return sspath;
	}

	/**
	 * Returns the sspath with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the sspath
	 * @return the sspath, or <code>null</code> if a sspath with the primary key could not be found
	 */
	@Override
	public sspath fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, sspath> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, sspath> map = new HashMap<Serializable, sspath>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			sspath sspath = fetchByPrimaryKey(primaryKey);

			if (sspath != null) {
				map.put(primaryKey, sspath);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			sspath sspath = (sspath)entityCache.getResult(sspathModelImpl.ENTITY_CACHE_ENABLED,
					sspathImpl.class, primaryKey);

			if (sspath == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, sspath);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SSPATH_WHERE_PKS_IN);

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

			for (sspath sspath : (List<sspath>)q.list()) {
				map.put(sspath.getPrimaryKeyObj(), sspath);

				cacheResult(sspath);

				uncachedPrimaryKeys.remove(sspath.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(sspathModelImpl.ENTITY_CACHE_ENABLED,
					sspathImpl.class, primaryKey, _nullsspath);
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
	 * Returns all the sspaths.
	 *
	 * @return the sspaths
	 */
	@Override
	public List<sspath> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sspaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sspathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of sspaths
	 * @param end the upper bound of the range of sspaths (not inclusive)
	 * @return the range of sspaths
	 */
	@Override
	public List<sspath> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sspaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sspathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of sspaths
	 * @param end the upper bound of the range of sspaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sspaths
	 */
	@Override
	public List<sspath> findAll(int start, int end,
		OrderByComparator<sspath> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sspaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sspathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of sspaths
	 * @param end the upper bound of the range of sspaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of sspaths
	 */
	@Override
	public List<sspath> findAll(int start, int end,
		OrderByComparator<sspath> orderByComparator, boolean retrieveFromCache) {
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

		List<sspath> list = null;

		if (retrieveFromCache) {
			list = (List<sspath>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SSPATH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SSPATH;

				if (pagination) {
					sql = sql.concat(sspathModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<sspath>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<sspath>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the sspaths from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (sspath sspath : findAll()) {
			remove(sspath);
		}
	}

	/**
	 * Returns the number of sspaths.
	 *
	 * @return the number of sspaths
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SSPATH);

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
		return sspathModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sspath persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(sspathImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_SSPATH = "SELECT sspath FROM sspath sspath";
	private static final String _SQL_SELECT_SSPATH_WHERE_PKS_IN = "SELECT sspath FROM sspath sspath WHERE id_ IN (";
	private static final String _SQL_SELECT_SSPATH_WHERE = "SELECT sspath FROM sspath sspath WHERE ";
	private static final String _SQL_COUNT_SSPATH = "SELECT COUNT(sspath) FROM sspath sspath";
	private static final String _SQL_COUNT_SSPATH_WHERE = "SELECT COUNT(sspath) FROM sspath sspath WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "sspath.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No sspath exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No sspath exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(sspathPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final sspath _nullsspath = new sspathImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<sspath> toCacheModel() {
				return _nullsspathCacheModel;
			}
		};

	private static final CacheModel<sspath> _nullsspathCacheModel = new CacheModel<sspath>() {
			@Override
			public sspath toEntityModel() {
				return _nullsspath;
			}
		};
}