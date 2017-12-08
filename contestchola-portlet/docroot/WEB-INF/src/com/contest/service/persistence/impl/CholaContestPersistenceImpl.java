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

package com.contest.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.contest.exception.NoSuchCholaContestException;

import com.contest.model.CholaContest;
import com.contest.model.impl.CholaContestImpl;
import com.contest.model.impl.CholaContestModelImpl;

import com.contest.service.persistence.CholaContestPersistence;

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
 * The persistence implementation for the chola contest service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see CholaContestPersistence
 * @see com.contest.service.persistence.CholaContestUtil
 * @generated
 */
@ProviderType
public class CholaContestPersistenceImpl extends BasePersistenceImpl<CholaContest>
	implements CholaContestPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CholaContestUtil} to access the chola contest persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CholaContestImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CholaContestModelImpl.ENTITY_CACHE_ENABLED,
			CholaContestModelImpl.FINDER_CACHE_ENABLED, CholaContestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CholaContestModelImpl.ENTITY_CACHE_ENABLED,
			CholaContestModelImpl.FINDER_CACHE_ENABLED, CholaContestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CholaContestModelImpl.ENTITY_CACHE_ENABLED,
			CholaContestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(CholaContestModelImpl.ENTITY_CACHE_ENABLED,
			CholaContestModelImpl.FINDER_CACHE_ENABLED, CholaContestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCONTENT_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(CholaContestModelImpl.ENTITY_CACHE_ENABLED,
			CholaContestModelImpl.FINDER_CACHE_ENABLED, CholaContestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCONTENT_ID",
			new String[] { Long.class.getName() },
			CholaContestModelImpl.CONTENT_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTENT_ID = new FinderPath(CholaContestModelImpl.ENTITY_CACHE_ENABLED,
			CholaContestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCONTENT_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the chola contests where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the matching chola contests
	 */
	@Override
	public List<CholaContest> findByCONTENT_ID(long content_id) {
		return findByCONTENT_ID(content_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the chola contests where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CholaContestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of chola contests
	 * @param end the upper bound of the range of chola contests (not inclusive)
	 * @return the range of matching chola contests
	 */
	@Override
	public List<CholaContest> findByCONTENT_ID(long content_id, int start,
		int end) {
		return findByCONTENT_ID(content_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the chola contests where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CholaContestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of chola contests
	 * @param end the upper bound of the range of chola contests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching chola contests
	 */
	@Override
	public List<CholaContest> findByCONTENT_ID(long content_id, int start,
		int end, OrderByComparator<CholaContest> orderByComparator) {
		return findByCONTENT_ID(content_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the chola contests where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CholaContestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of chola contests
	 * @param end the upper bound of the range of chola contests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching chola contests
	 */
	@Override
	public List<CholaContest> findByCONTENT_ID(long content_id, int start,
		int end, OrderByComparator<CholaContest> orderByComparator,
		boolean retrieveFromCache) {
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

		List<CholaContest> list = null;

		if (retrieveFromCache) {
			list = (List<CholaContest>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CholaContest cholaContest : list) {
					if ((content_id != cholaContest.getContent_id())) {
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

			query.append(_SQL_SELECT_CHOLACONTEST_WHERE);

			query.append(_FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CholaContestModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(content_id);

				if (!pagination) {
					list = (List<CholaContest>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CholaContest>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first chola contest in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching chola contest
	 * @throws NoSuchCholaContestException if a matching chola contest could not be found
	 */
	@Override
	public CholaContest findByCONTENT_ID_First(long content_id,
		OrderByComparator<CholaContest> orderByComparator)
		throws NoSuchCholaContestException {
		CholaContest cholaContest = fetchByCONTENT_ID_First(content_id,
				orderByComparator);

		if (cholaContest != null) {
			return cholaContest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCholaContestException(msg.toString());
	}

	/**
	 * Returns the first chola contest in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching chola contest, or <code>null</code> if a matching chola contest could not be found
	 */
	@Override
	public CholaContest fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<CholaContest> orderByComparator) {
		List<CholaContest> list = findByCONTENT_ID(content_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last chola contest in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching chola contest
	 * @throws NoSuchCholaContestException if a matching chola contest could not be found
	 */
	@Override
	public CholaContest findByCONTENT_ID_Last(long content_id,
		OrderByComparator<CholaContest> orderByComparator)
		throws NoSuchCholaContestException {
		CholaContest cholaContest = fetchByCONTENT_ID_Last(content_id,
				orderByComparator);

		if (cholaContest != null) {
			return cholaContest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCholaContestException(msg.toString());
	}

	/**
	 * Returns the last chola contest in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching chola contest, or <code>null</code> if a matching chola contest could not be found
	 */
	@Override
	public CholaContest fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<CholaContest> orderByComparator) {
		int count = countByCONTENT_ID(content_id);

		if (count == 0) {
			return null;
		}

		List<CholaContest> list = findByCONTENT_ID(content_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the chola contests before and after the current chola contest in the ordered set where content_id = &#63;.
	 *
	 * @param Id the primary key of the current chola contest
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next chola contest
	 * @throws NoSuchCholaContestException if a chola contest with the primary key could not be found
	 */
	@Override
	public CholaContest[] findByCONTENT_ID_PrevAndNext(long Id,
		long content_id, OrderByComparator<CholaContest> orderByComparator)
		throws NoSuchCholaContestException {
		CholaContest cholaContest = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			CholaContest[] array = new CholaContestImpl[3];

			array[0] = getByCONTENT_ID_PrevAndNext(session, cholaContest,
					content_id, orderByComparator, true);

			array[1] = cholaContest;

			array[2] = getByCONTENT_ID_PrevAndNext(session, cholaContest,
					content_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CholaContest getByCONTENT_ID_PrevAndNext(Session session,
		CholaContest cholaContest, long content_id,
		OrderByComparator<CholaContest> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CHOLACONTEST_WHERE);

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
			query.append(CholaContestModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(content_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cholaContest);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CholaContest> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the chola contests where content_id = &#63; from the database.
	 *
	 * @param content_id the content_id
	 */
	@Override
	public void removeByCONTENT_ID(long content_id) {
		for (CholaContest cholaContest : findByCONTENT_ID(content_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cholaContest);
		}
	}

	/**
	 * Returns the number of chola contests where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the number of matching chola contests
	 */
	@Override
	public int countByCONTENT_ID(long content_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTENT_ID;

		Object[] finderArgs = new Object[] { content_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CHOLACONTEST_WHERE);

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

	private static final String _FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2 = "cholaContest.content_id = ?";

	public CholaContestPersistenceImpl() {
		setModelClass(CholaContest.class);
	}

	/**
	 * Caches the chola contest in the entity cache if it is enabled.
	 *
	 * @param cholaContest the chola contest
	 */
	@Override
	public void cacheResult(CholaContest cholaContest) {
		entityCache.putResult(CholaContestModelImpl.ENTITY_CACHE_ENABLED,
			CholaContestImpl.class, cholaContest.getPrimaryKey(), cholaContest);

		cholaContest.resetOriginalValues();
	}

	/**
	 * Caches the chola contests in the entity cache if it is enabled.
	 *
	 * @param cholaContests the chola contests
	 */
	@Override
	public void cacheResult(List<CholaContest> cholaContests) {
		for (CholaContest cholaContest : cholaContests) {
			if (entityCache.getResult(
						CholaContestModelImpl.ENTITY_CACHE_ENABLED,
						CholaContestImpl.class, cholaContest.getPrimaryKey()) == null) {
				cacheResult(cholaContest);
			}
			else {
				cholaContest.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all chola contests.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CholaContestImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the chola contest.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CholaContest cholaContest) {
		entityCache.removeResult(CholaContestModelImpl.ENTITY_CACHE_ENABLED,
			CholaContestImpl.class, cholaContest.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CholaContest> cholaContests) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CholaContest cholaContest : cholaContests) {
			entityCache.removeResult(CholaContestModelImpl.ENTITY_CACHE_ENABLED,
				CholaContestImpl.class, cholaContest.getPrimaryKey());
		}
	}

	/**
	 * Creates a new chola contest with the primary key. Does not add the chola contest to the database.
	 *
	 * @param Id the primary key for the new chola contest
	 * @return the new chola contest
	 */
	@Override
	public CholaContest create(long Id) {
		CholaContest cholaContest = new CholaContestImpl();

		cholaContest.setNew(true);
		cholaContest.setPrimaryKey(Id);

		return cholaContest;
	}

	/**
	 * Removes the chola contest with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the chola contest
	 * @return the chola contest that was removed
	 * @throws NoSuchCholaContestException if a chola contest with the primary key could not be found
	 */
	@Override
	public CholaContest remove(long Id) throws NoSuchCholaContestException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the chola contest with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the chola contest
	 * @return the chola contest that was removed
	 * @throws NoSuchCholaContestException if a chola contest with the primary key could not be found
	 */
	@Override
	public CholaContest remove(Serializable primaryKey)
		throws NoSuchCholaContestException {
		Session session = null;

		try {
			session = openSession();

			CholaContest cholaContest = (CholaContest)session.get(CholaContestImpl.class,
					primaryKey);

			if (cholaContest == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCholaContestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cholaContest);
		}
		catch (NoSuchCholaContestException nsee) {
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
	protected CholaContest removeImpl(CholaContest cholaContest) {
		cholaContest = toUnwrappedModel(cholaContest);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cholaContest)) {
				cholaContest = (CholaContest)session.get(CholaContestImpl.class,
						cholaContest.getPrimaryKeyObj());
			}

			if (cholaContest != null) {
				session.delete(cholaContest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cholaContest != null) {
			clearCache(cholaContest);
		}

		return cholaContest;
	}

	@Override
	public CholaContest updateImpl(CholaContest cholaContest) {
		cholaContest = toUnwrappedModel(cholaContest);

		boolean isNew = cholaContest.isNew();

		CholaContestModelImpl cholaContestModelImpl = (CholaContestModelImpl)cholaContest;

		Session session = null;

		try {
			session = openSession();

			if (cholaContest.isNew()) {
				session.save(cholaContest);

				cholaContest.setNew(false);
			}
			else {
				cholaContest = (CholaContest)session.merge(cholaContest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CholaContestModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((cholaContestModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cholaContestModelImpl.getOriginalContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);

				args = new Object[] { cholaContestModelImpl.getContent_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);
			}
		}

		entityCache.putResult(CholaContestModelImpl.ENTITY_CACHE_ENABLED,
			CholaContestImpl.class, cholaContest.getPrimaryKey(), cholaContest,
			false);

		cholaContest.resetOriginalValues();

		return cholaContest;
	}

	protected CholaContest toUnwrappedModel(CholaContest cholaContest) {
		if (cholaContest instanceof CholaContestImpl) {
			return cholaContest;
		}

		CholaContestImpl cholaContestImpl = new CholaContestImpl();

		cholaContestImpl.setNew(cholaContest.isNew());
		cholaContestImpl.setPrimaryKey(cholaContest.getPrimaryKey());

		cholaContestImpl.setId(cholaContest.getId());
		cholaContestImpl.setContent_id(cholaContest.getContent_id());
		cholaContestImpl.setContent(cholaContest.getContent());
		cholaContestImpl.setStartdate(cholaContest.getStartdate());
		cholaContestImpl.setEnddate(cholaContest.getEnddate());
		cholaContestImpl.setFeedback(cholaContest.getFeedback());
		cholaContestImpl.setCreateDate(cholaContest.getCreateDate());
		cholaContestImpl.setContest_code(cholaContest.getContest_code());
		cholaContestImpl.setContest_val(cholaContest.getContest_val());
		cholaContestImpl.setContest_desc(cholaContest.getContest_desc());
		cholaContestImpl.setContest_doc(cholaContest.getContest_doc());
		cholaContestImpl.setContest_path(cholaContest.getContest_path());
		cholaContestImpl.setContest_title(cholaContest.getContest_title());
		cholaContestImpl.setUser_id(cholaContest.getUser_id());

		return cholaContestImpl;
	}

	/**
	 * Returns the chola contest with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the chola contest
	 * @return the chola contest
	 * @throws NoSuchCholaContestException if a chola contest with the primary key could not be found
	 */
	@Override
	public CholaContest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCholaContestException {
		CholaContest cholaContest = fetchByPrimaryKey(primaryKey);

		if (cholaContest == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCholaContestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cholaContest;
	}

	/**
	 * Returns the chola contest with the primary key or throws a {@link NoSuchCholaContestException} if it could not be found.
	 *
	 * @param Id the primary key of the chola contest
	 * @return the chola contest
	 * @throws NoSuchCholaContestException if a chola contest with the primary key could not be found
	 */
	@Override
	public CholaContest findByPrimaryKey(long Id)
		throws NoSuchCholaContestException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the chola contest with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the chola contest
	 * @return the chola contest, or <code>null</code> if a chola contest with the primary key could not be found
	 */
	@Override
	public CholaContest fetchByPrimaryKey(Serializable primaryKey) {
		CholaContest cholaContest = (CholaContest)entityCache.getResult(CholaContestModelImpl.ENTITY_CACHE_ENABLED,
				CholaContestImpl.class, primaryKey);

		if (cholaContest == _nullCholaContest) {
			return null;
		}

		if (cholaContest == null) {
			Session session = null;

			try {
				session = openSession();

				cholaContest = (CholaContest)session.get(CholaContestImpl.class,
						primaryKey);

				if (cholaContest != null) {
					cacheResult(cholaContest);
				}
				else {
					entityCache.putResult(CholaContestModelImpl.ENTITY_CACHE_ENABLED,
						CholaContestImpl.class, primaryKey, _nullCholaContest);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CholaContestModelImpl.ENTITY_CACHE_ENABLED,
					CholaContestImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cholaContest;
	}

	/**
	 * Returns the chola contest with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the chola contest
	 * @return the chola contest, or <code>null</code> if a chola contest with the primary key could not be found
	 */
	@Override
	public CholaContest fetchByPrimaryKey(long Id) {
		return fetchByPrimaryKey((Serializable)Id);
	}

	@Override
	public Map<Serializable, CholaContest> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CholaContest> map = new HashMap<Serializable, CholaContest>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CholaContest cholaContest = fetchByPrimaryKey(primaryKey);

			if (cholaContest != null) {
				map.put(primaryKey, cholaContest);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			CholaContest cholaContest = (CholaContest)entityCache.getResult(CholaContestModelImpl.ENTITY_CACHE_ENABLED,
					CholaContestImpl.class, primaryKey);

			if (cholaContest == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, cholaContest);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CHOLACONTEST_WHERE_PKS_IN);

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

			for (CholaContest cholaContest : (List<CholaContest>)q.list()) {
				map.put(cholaContest.getPrimaryKeyObj(), cholaContest);

				cacheResult(cholaContest);

				uncachedPrimaryKeys.remove(cholaContest.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CholaContestModelImpl.ENTITY_CACHE_ENABLED,
					CholaContestImpl.class, primaryKey, _nullCholaContest);
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
	 * Returns all the chola contests.
	 *
	 * @return the chola contests
	 */
	@Override
	public List<CholaContest> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the chola contests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CholaContestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of chola contests
	 * @param end the upper bound of the range of chola contests (not inclusive)
	 * @return the range of chola contests
	 */
	@Override
	public List<CholaContest> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the chola contests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CholaContestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of chola contests
	 * @param end the upper bound of the range of chola contests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of chola contests
	 */
	@Override
	public List<CholaContest> findAll(int start, int end,
		OrderByComparator<CholaContest> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the chola contests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CholaContestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of chola contests
	 * @param end the upper bound of the range of chola contests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of chola contests
	 */
	@Override
	public List<CholaContest> findAll(int start, int end,
		OrderByComparator<CholaContest> orderByComparator,
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

		List<CholaContest> list = null;

		if (retrieveFromCache) {
			list = (List<CholaContest>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CHOLACONTEST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CHOLACONTEST;

				if (pagination) {
					sql = sql.concat(CholaContestModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CholaContest>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CholaContest>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the chola contests from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CholaContest cholaContest : findAll()) {
			remove(cholaContest);
		}
	}

	/**
	 * Returns the number of chola contests.
	 *
	 * @return the number of chola contests
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CHOLACONTEST);

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
	protected Map<String, Integer> getTableColumnsMap() {
		return CholaContestModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the chola contest persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CholaContestImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_CHOLACONTEST = "SELECT cholaContest FROM CholaContest cholaContest";
	private static final String _SQL_SELECT_CHOLACONTEST_WHERE_PKS_IN = "SELECT cholaContest FROM CholaContest cholaContest WHERE Id IN (";
	private static final String _SQL_SELECT_CHOLACONTEST_WHERE = "SELECT cholaContest FROM CholaContest cholaContest WHERE ";
	private static final String _SQL_COUNT_CHOLACONTEST = "SELECT COUNT(cholaContest) FROM CholaContest cholaContest";
	private static final String _SQL_COUNT_CHOLACONTEST_WHERE = "SELECT COUNT(cholaContest) FROM CholaContest cholaContest WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cholaContest.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CholaContest exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CholaContest exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CholaContestPersistenceImpl.class);
	private static final CholaContest _nullCholaContest = new CholaContestImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CholaContest> toCacheModel() {
				return _nullCholaContestCacheModel;
			}
		};

	private static final CacheModel<CholaContest> _nullCholaContestCacheModel = new CacheModel<CholaContest>() {
			@Override
			public CholaContest toEntityModel() {
				return _nullCholaContest;
			}
		};
}