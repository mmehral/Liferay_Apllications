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

package com.chola.contest.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.contest.exception.NoSuchcontestException;
import com.chola.contest.model.cholacontest;
import com.chola.contest.model.impl.cholacontestImpl;
import com.chola.contest.model.impl.cholacontestModelImpl;
import com.chola.contest.service.persistence.cholacontestPersistence;

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
 * The persistence implementation for the cholacontest service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see cholacontestPersistence
 * @see com.chola.contest.service.persistence.cholacontestUtil
 * @generated
 */
@ProviderType
public class cholacontestPersistenceImpl extends BasePersistenceImpl<cholacontest>
	implements cholacontestPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link cholacontestUtil} to access the cholacontest persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = cholacontestImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(cholacontestModelImpl.ENTITY_CACHE_ENABLED,
			cholacontestModelImpl.FINDER_CACHE_ENABLED, cholacontestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(cholacontestModelImpl.ENTITY_CACHE_ENABLED,
			cholacontestModelImpl.FINDER_CACHE_ENABLED, cholacontestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(cholacontestModelImpl.ENTITY_CACHE_ENABLED,
			cholacontestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(cholacontestModelImpl.ENTITY_CACHE_ENABLED,
			cholacontestModelImpl.FINDER_CACHE_ENABLED, cholacontestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCONTENT_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(cholacontestModelImpl.ENTITY_CACHE_ENABLED,
			cholacontestModelImpl.FINDER_CACHE_ENABLED, cholacontestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCONTENT_ID",
			new String[] { Long.class.getName() },
			cholacontestModelImpl.CONTENT_ID_COLUMN_BITMASK |
			cholacontestModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTENT_ID = new FinderPath(cholacontestModelImpl.ENTITY_CACHE_ENABLED,
			cholacontestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCONTENT_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the cholacontests where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the matching cholacontests
	 */
	@Override
	public List<cholacontest> findByCONTENT_ID(long content_id) {
		return findByCONTENT_ID(content_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cholacontests where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of cholacontests
	 * @param end the upper bound of the range of cholacontests (not inclusive)
	 * @return the range of matching cholacontests
	 */
	@Override
	public List<cholacontest> findByCONTENT_ID(long content_id, int start,
		int end) {
		return findByCONTENT_ID(content_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cholacontests where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of cholacontests
	 * @param end the upper bound of the range of cholacontests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cholacontests
	 */
	@Override
	public List<cholacontest> findByCONTENT_ID(long content_id, int start,
		int end, OrderByComparator<cholacontest> orderByComparator) {
		return findByCONTENT_ID(content_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cholacontests where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of cholacontests
	 * @param end the upper bound of the range of cholacontests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching cholacontests
	 */
	@Override
	public List<cholacontest> findByCONTENT_ID(long content_id, int start,
		int end, OrderByComparator<cholacontest> orderByComparator,
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

		List<cholacontest> list = null;

		if (retrieveFromCache) {
			list = (List<cholacontest>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (cholacontest cholacontest : list) {
					if ((content_id != cholacontest.getContent_id())) {
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
				query.append(cholacontestModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(content_id);

				if (!pagination) {
					list = (List<cholacontest>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<cholacontest>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first cholacontest in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cholacontest
	 * @throws NoSuchcontestException if a matching cholacontest could not be found
	 */
	@Override
	public cholacontest findByCONTENT_ID_First(long content_id,
		OrderByComparator<cholacontest> orderByComparator)
		throws NoSuchcontestException {
		cholacontest cholacontest = fetchByCONTENT_ID_First(content_id,
				orderByComparator);

		if (cholacontest != null) {
			return cholacontest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcontestException(msg.toString());
	}

	/**
	 * Returns the first cholacontest in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cholacontest, or <code>null</code> if a matching cholacontest could not be found
	 */
	@Override
	public cholacontest fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<cholacontest> orderByComparator) {
		List<cholacontest> list = findByCONTENT_ID(content_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cholacontest in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cholacontest
	 * @throws NoSuchcontestException if a matching cholacontest could not be found
	 */
	@Override
	public cholacontest findByCONTENT_ID_Last(long content_id,
		OrderByComparator<cholacontest> orderByComparator)
		throws NoSuchcontestException {
		cholacontest cholacontest = fetchByCONTENT_ID_Last(content_id,
				orderByComparator);

		if (cholacontest != null) {
			return cholacontest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcontestException(msg.toString());
	}

	/**
	 * Returns the last cholacontest in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cholacontest, or <code>null</code> if a matching cholacontest could not be found
	 */
	@Override
	public cholacontest fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<cholacontest> orderByComparator) {
		int count = countByCONTENT_ID(content_id);

		if (count == 0) {
			return null;
		}

		List<cholacontest> list = findByCONTENT_ID(content_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cholacontests before and after the current cholacontest in the ordered set where content_id = &#63;.
	 *
	 * @param id the primary key of the current cholacontest
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cholacontest
	 * @throws NoSuchcontestException if a cholacontest with the primary key could not be found
	 */
	@Override
	public cholacontest[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id, OrderByComparator<cholacontest> orderByComparator)
		throws NoSuchcontestException {
		cholacontest cholacontest = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			cholacontest[] array = new cholacontestImpl[3];

			array[0] = getByCONTENT_ID_PrevAndNext(session, cholacontest,
					content_id, orderByComparator, true);

			array[1] = cholacontest;

			array[2] = getByCONTENT_ID_PrevAndNext(session, cholacontest,
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

	protected cholacontest getByCONTENT_ID_PrevAndNext(Session session,
		cholacontest cholacontest, long content_id,
		OrderByComparator<cholacontest> orderByComparator, boolean previous) {
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
			query.append(cholacontestModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(content_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cholacontest);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<cholacontest> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cholacontests where content_id = &#63; from the database.
	 *
	 * @param content_id the content_id
	 */
	@Override
	public void removeByCONTENT_ID(long content_id) {
		for (cholacontest cholacontest : findByCONTENT_ID(content_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cholacontest);
		}
	}

	/**
	 * Returns the number of cholacontests where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the number of matching cholacontests
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

	private static final String _FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2 = "cholacontest.content_id = ?";

	public cholacontestPersistenceImpl() {
		setModelClass(cholacontest.class);
	}

	/**
	 * Caches the cholacontest in the entity cache if it is enabled.
	 *
	 * @param cholacontest the cholacontest
	 */
	@Override
	public void cacheResult(cholacontest cholacontest) {
		entityCache.putResult(cholacontestModelImpl.ENTITY_CACHE_ENABLED,
			cholacontestImpl.class, cholacontest.getPrimaryKey(), cholacontest);

		cholacontest.resetOriginalValues();
	}

	/**
	 * Caches the cholacontests in the entity cache if it is enabled.
	 *
	 * @param cholacontests the cholacontests
	 */
	@Override
	public void cacheResult(List<cholacontest> cholacontests) {
		for (cholacontest cholacontest : cholacontests) {
			if (entityCache.getResult(
						cholacontestModelImpl.ENTITY_CACHE_ENABLED,
						cholacontestImpl.class, cholacontest.getPrimaryKey()) == null) {
				cacheResult(cholacontest);
			}
			else {
				cholacontest.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cholacontests.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(cholacontestImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cholacontest.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(cholacontest cholacontest) {
		entityCache.removeResult(cholacontestModelImpl.ENTITY_CACHE_ENABLED,
			cholacontestImpl.class, cholacontest.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<cholacontest> cholacontests) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (cholacontest cholacontest : cholacontests) {
			entityCache.removeResult(cholacontestModelImpl.ENTITY_CACHE_ENABLED,
				cholacontestImpl.class, cholacontest.getPrimaryKey());
		}
	}

	/**
	 * Creates a new cholacontest with the primary key. Does not add the cholacontest to the database.
	 *
	 * @param id the primary key for the new cholacontest
	 * @return the new cholacontest
	 */
	@Override
	public cholacontest create(long id) {
		cholacontest cholacontest = new cholacontestImpl();

		cholacontest.setNew(true);
		cholacontest.setPrimaryKey(id);

		return cholacontest;
	}

	/**
	 * Removes the cholacontest with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the cholacontest
	 * @return the cholacontest that was removed
	 * @throws NoSuchcontestException if a cholacontest with the primary key could not be found
	 */
	@Override
	public cholacontest remove(long id) throws NoSuchcontestException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the cholacontest with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cholacontest
	 * @return the cholacontest that was removed
	 * @throws NoSuchcontestException if a cholacontest with the primary key could not be found
	 */
	@Override
	public cholacontest remove(Serializable primaryKey)
		throws NoSuchcontestException {
		Session session = null;

		try {
			session = openSession();

			cholacontest cholacontest = (cholacontest)session.get(cholacontestImpl.class,
					primaryKey);

			if (cholacontest == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcontestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cholacontest);
		}
		catch (NoSuchcontestException nsee) {
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
	protected cholacontest removeImpl(cholacontest cholacontest) {
		cholacontest = toUnwrappedModel(cholacontest);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cholacontest)) {
				cholacontest = (cholacontest)session.get(cholacontestImpl.class,
						cholacontest.getPrimaryKeyObj());
			}

			if (cholacontest != null) {
				session.delete(cholacontest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cholacontest != null) {
			clearCache(cholacontest);
		}

		return cholacontest;
	}

	@Override
	public cholacontest updateImpl(cholacontest cholacontest) {
		cholacontest = toUnwrappedModel(cholacontest);

		boolean isNew = cholacontest.isNew();

		cholacontestModelImpl cholacontestModelImpl = (cholacontestModelImpl)cholacontest;

		Session session = null;

		try {
			session = openSession();

			if (cholacontest.isNew()) {
				session.save(cholacontest);

				cholacontest.setNew(false);
			}
			else {
				cholacontest = (cholacontest)session.merge(cholacontest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !cholacontestModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((cholacontestModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cholacontestModelImpl.getOriginalContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);

				args = new Object[] { cholacontestModelImpl.getContent_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);
			}
		}

		entityCache.putResult(cholacontestModelImpl.ENTITY_CACHE_ENABLED,
			cholacontestImpl.class, cholacontest.getPrimaryKey(), cholacontest,
			false);

		cholacontest.resetOriginalValues();

		return cholacontest;
	}

	protected cholacontest toUnwrappedModel(cholacontest cholacontest) {
		if (cholacontest instanceof cholacontestImpl) {
			return cholacontest;
		}

		cholacontestImpl cholacontestImpl = new cholacontestImpl();

		cholacontestImpl.setNew(cholacontest.isNew());
		cholacontestImpl.setPrimaryKey(cholacontest.getPrimaryKey());

		cholacontestImpl.setId(cholacontest.getId());
		cholacontestImpl.setContent_id(cholacontest.getContent_id());
		cholacontestImpl.setContent(cholacontest.getContent());
		cholacontestImpl.setStartdate(cholacontest.getStartdate());
		cholacontestImpl.setEnddate(cholacontest.getEnddate());
		cholacontestImpl.setFeedback(cholacontest.getFeedback());
		cholacontestImpl.setCreateDate(cholacontest.getCreateDate());
		cholacontestImpl.setContest_code(cholacontest.getContest_code());
		cholacontestImpl.setContest_val(cholacontest.getContest_val());
		cholacontestImpl.setContest_desc(cholacontest.getContest_desc());
		cholacontestImpl.setContest_doc(cholacontest.getContest_doc());
		cholacontestImpl.setContest_path(cholacontest.getContest_path());
		cholacontestImpl.setContest_title(cholacontest.getContest_title());
		cholacontestImpl.setUser_id(cholacontest.getUser_id());

		return cholacontestImpl;
	}

	/**
	 * Returns the cholacontest with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cholacontest
	 * @return the cholacontest
	 * @throws NoSuchcontestException if a cholacontest with the primary key could not be found
	 */
	@Override
	public cholacontest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchcontestException {
		cholacontest cholacontest = fetchByPrimaryKey(primaryKey);

		if (cholacontest == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcontestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cholacontest;
	}

	/**
	 * Returns the cholacontest with the primary key or throws a {@link NoSuchcontestException} if it could not be found.
	 *
	 * @param id the primary key of the cholacontest
	 * @return the cholacontest
	 * @throws NoSuchcontestException if a cholacontest with the primary key could not be found
	 */
	@Override
	public cholacontest findByPrimaryKey(long id) throws NoSuchcontestException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the cholacontest with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cholacontest
	 * @return the cholacontest, or <code>null</code> if a cholacontest with the primary key could not be found
	 */
	@Override
	public cholacontest fetchByPrimaryKey(Serializable primaryKey) {
		cholacontest cholacontest = (cholacontest)entityCache.getResult(cholacontestModelImpl.ENTITY_CACHE_ENABLED,
				cholacontestImpl.class, primaryKey);

		if (cholacontest == _nullcholacontest) {
			return null;
		}

		if (cholacontest == null) {
			Session session = null;

			try {
				session = openSession();

				cholacontest = (cholacontest)session.get(cholacontestImpl.class,
						primaryKey);

				if (cholacontest != null) {
					cacheResult(cholacontest);
				}
				else {
					entityCache.putResult(cholacontestModelImpl.ENTITY_CACHE_ENABLED,
						cholacontestImpl.class, primaryKey, _nullcholacontest);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(cholacontestModelImpl.ENTITY_CACHE_ENABLED,
					cholacontestImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cholacontest;
	}

	/**
	 * Returns the cholacontest with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the cholacontest
	 * @return the cholacontest, or <code>null</code> if a cholacontest with the primary key could not be found
	 */
	@Override
	public cholacontest fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, cholacontest> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, cholacontest> map = new HashMap<Serializable, cholacontest>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			cholacontest cholacontest = fetchByPrimaryKey(primaryKey);

			if (cholacontest != null) {
				map.put(primaryKey, cholacontest);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			cholacontest cholacontest = (cholacontest)entityCache.getResult(cholacontestModelImpl.ENTITY_CACHE_ENABLED,
					cholacontestImpl.class, primaryKey);

			if (cholacontest == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, cholacontest);
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

			for (cholacontest cholacontest : (List<cholacontest>)q.list()) {
				map.put(cholacontest.getPrimaryKeyObj(), cholacontest);

				cacheResult(cholacontest);

				uncachedPrimaryKeys.remove(cholacontest.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(cholacontestModelImpl.ENTITY_CACHE_ENABLED,
					cholacontestImpl.class, primaryKey, _nullcholacontest);
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
	 * Returns all the cholacontests.
	 *
	 * @return the cholacontests
	 */
	@Override
	public List<cholacontest> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cholacontests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cholacontests
	 * @param end the upper bound of the range of cholacontests (not inclusive)
	 * @return the range of cholacontests
	 */
	@Override
	public List<cholacontest> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cholacontests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cholacontests
	 * @param end the upper bound of the range of cholacontests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cholacontests
	 */
	@Override
	public List<cholacontest> findAll(int start, int end,
		OrderByComparator<cholacontest> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cholacontests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cholacontests
	 * @param end the upper bound of the range of cholacontests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of cholacontests
	 */
	@Override
	public List<cholacontest> findAll(int start, int end,
		OrderByComparator<cholacontest> orderByComparator,
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

		List<cholacontest> list = null;

		if (retrieveFromCache) {
			list = (List<cholacontest>)finderCache.getResult(finderPath,
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
					sql = sql.concat(cholacontestModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<cholacontest>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<cholacontest>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the cholacontests from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (cholacontest cholacontest : findAll()) {
			remove(cholacontest);
		}
	}

	/**
	 * Returns the number of cholacontests.
	 *
	 * @return the number of cholacontests
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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return cholacontestModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cholacontest persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(cholacontestImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_CHOLACONTEST = "SELECT cholacontest FROM cholacontest cholacontest";
	private static final String _SQL_SELECT_CHOLACONTEST_WHERE_PKS_IN = "SELECT cholacontest FROM cholacontest cholacontest WHERE id_ IN (";
	private static final String _SQL_SELECT_CHOLACONTEST_WHERE = "SELECT cholacontest FROM cholacontest cholacontest WHERE ";
	private static final String _SQL_COUNT_CHOLACONTEST = "SELECT COUNT(cholacontest) FROM cholacontest cholacontest";
	private static final String _SQL_COUNT_CHOLACONTEST_WHERE = "SELECT COUNT(cholacontest) FROM cholacontest cholacontest WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cholacontest.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No cholacontest exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No cholacontest exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(cholacontestPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final cholacontest _nullcholacontest = new cholacontestImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<cholacontest> toCacheModel() {
				return _nullcholacontestCacheModel;
			}
		};

	private static final CacheModel<cholacontest> _nullcholacontestCacheModel = new CacheModel<cholacontest>() {
			@Override
			public cholacontest toEntityModel() {
				return _nullcholacontest;
			}
		};
}