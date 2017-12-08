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

package com.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.exception.NoSuchcholatalkiesException;

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

import com.model.cholatalkies;

import com.model.impl.cholatalkiesImpl;
import com.model.impl.cholatalkiesModelImpl;

import com.service.persistence.cholatalkiesPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the cholatalkies service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see cholatalkiesPersistence
 * @see com.service.persistence.cholatalkiesUtil
 * @generated
 */
@ProviderType
public class cholatalkiesPersistenceImpl extends BasePersistenceImpl<cholatalkies>
	implements cholatalkiesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link cholatalkiesUtil} to access the cholatalkies persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = cholatalkiesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(cholatalkiesModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesModelImpl.FINDER_CACHE_ENABLED, cholatalkiesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(cholatalkiesModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesModelImpl.FINDER_CACHE_ENABLED, cholatalkiesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(cholatalkiesModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(cholatalkiesModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesModelImpl.FINDER_CACHE_ENABLED, cholatalkiesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCONTENT_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(cholatalkiesModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesModelImpl.FINDER_CACHE_ENABLED, cholatalkiesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCONTENT_ID",
			new String[] { Long.class.getName() },
			cholatalkiesModelImpl.CONTENT_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTENT_ID = new FinderPath(cholatalkiesModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCONTENT_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the cholatalkieses where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the matching cholatalkieses
	 */
	@Override
	public List<cholatalkies> findByCONTENT_ID(long content_id) {
		return findByCONTENT_ID(content_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cholatalkieses where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of cholatalkieses
	 * @param end the upper bound of the range of cholatalkieses (not inclusive)
	 * @return the range of matching cholatalkieses
	 */
	@Override
	public List<cholatalkies> findByCONTENT_ID(long content_id, int start,
		int end) {
		return findByCONTENT_ID(content_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cholatalkieses where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of cholatalkieses
	 * @param end the upper bound of the range of cholatalkieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cholatalkieses
	 */
	@Override
	public List<cholatalkies> findByCONTENT_ID(long content_id, int start,
		int end, OrderByComparator<cholatalkies> orderByComparator) {
		return findByCONTENT_ID(content_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cholatalkieses where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of cholatalkieses
	 * @param end the upper bound of the range of cholatalkieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching cholatalkieses
	 */
	@Override
	public List<cholatalkies> findByCONTENT_ID(long content_id, int start,
		int end, OrderByComparator<cholatalkies> orderByComparator,
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

		List<cholatalkies> list = null;

		if (retrieveFromCache) {
			list = (List<cholatalkies>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (cholatalkies cholatalkies : list) {
					if ((content_id != cholatalkies.getContent_id())) {
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

			query.append(_SQL_SELECT_CHOLATALKIES_WHERE);

			query.append(_FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(cholatalkiesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(content_id);

				if (!pagination) {
					list = (List<cholatalkies>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<cholatalkies>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first cholatalkies in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cholatalkies
	 * @throws NoSuchcholatalkiesException if a matching cholatalkies could not be found
	 */
	@Override
	public cholatalkies findByCONTENT_ID_First(long content_id,
		OrderByComparator<cholatalkies> orderByComparator)
		throws NoSuchcholatalkiesException {
		cholatalkies cholatalkies = fetchByCONTENT_ID_First(content_id,
				orderByComparator);

		if (cholatalkies != null) {
			return cholatalkies;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcholatalkiesException(msg.toString());
	}

	/**
	 * Returns the first cholatalkies in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cholatalkies, or <code>null</code> if a matching cholatalkies could not be found
	 */
	@Override
	public cholatalkies fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<cholatalkies> orderByComparator) {
		List<cholatalkies> list = findByCONTENT_ID(content_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cholatalkies in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cholatalkies
	 * @throws NoSuchcholatalkiesException if a matching cholatalkies could not be found
	 */
	@Override
	public cholatalkies findByCONTENT_ID_Last(long content_id,
		OrderByComparator<cholatalkies> orderByComparator)
		throws NoSuchcholatalkiesException {
		cholatalkies cholatalkies = fetchByCONTENT_ID_Last(content_id,
				orderByComparator);

		if (cholatalkies != null) {
			return cholatalkies;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcholatalkiesException(msg.toString());
	}

	/**
	 * Returns the last cholatalkies in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cholatalkies, or <code>null</code> if a matching cholatalkies could not be found
	 */
	@Override
	public cholatalkies fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<cholatalkies> orderByComparator) {
		int count = countByCONTENT_ID(content_id);

		if (count == 0) {
			return null;
		}

		List<cholatalkies> list = findByCONTENT_ID(content_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cholatalkieses before and after the current cholatalkies in the ordered set where content_id = &#63;.
	 *
	 * @param id the primary key of the current cholatalkies
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cholatalkies
	 * @throws NoSuchcholatalkiesException if a cholatalkies with the primary key could not be found
	 */
	@Override
	public cholatalkies[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id, OrderByComparator<cholatalkies> orderByComparator)
		throws NoSuchcholatalkiesException {
		cholatalkies cholatalkies = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			cholatalkies[] array = new cholatalkiesImpl[3];

			array[0] = getByCONTENT_ID_PrevAndNext(session, cholatalkies,
					content_id, orderByComparator, true);

			array[1] = cholatalkies;

			array[2] = getByCONTENT_ID_PrevAndNext(session, cholatalkies,
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

	protected cholatalkies getByCONTENT_ID_PrevAndNext(Session session,
		cholatalkies cholatalkies, long content_id,
		OrderByComparator<cholatalkies> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CHOLATALKIES_WHERE);

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
			query.append(cholatalkiesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(content_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cholatalkies);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<cholatalkies> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cholatalkieses where content_id = &#63; from the database.
	 *
	 * @param content_id the content_id
	 */
	@Override
	public void removeByCONTENT_ID(long content_id) {
		for (cholatalkies cholatalkies : findByCONTENT_ID(content_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cholatalkies);
		}
	}

	/**
	 * Returns the number of cholatalkieses where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the number of matching cholatalkieses
	 */
	@Override
	public int countByCONTENT_ID(long content_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTENT_ID;

		Object[] finderArgs = new Object[] { content_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CHOLATALKIES_WHERE);

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

	private static final String _FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2 = "cholatalkies.content_id = ?";

	public cholatalkiesPersistenceImpl() {
		setModelClass(cholatalkies.class);
	}

	/**
	 * Caches the cholatalkies in the entity cache if it is enabled.
	 *
	 * @param cholatalkies the cholatalkies
	 */
	@Override
	public void cacheResult(cholatalkies cholatalkies) {
		entityCache.putResult(cholatalkiesModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesImpl.class, cholatalkies.getPrimaryKey(), cholatalkies);

		cholatalkies.resetOriginalValues();
	}

	/**
	 * Caches the cholatalkieses in the entity cache if it is enabled.
	 *
	 * @param cholatalkieses the cholatalkieses
	 */
	@Override
	public void cacheResult(List<cholatalkies> cholatalkieses) {
		for (cholatalkies cholatalkies : cholatalkieses) {
			if (entityCache.getResult(
						cholatalkiesModelImpl.ENTITY_CACHE_ENABLED,
						cholatalkiesImpl.class, cholatalkies.getPrimaryKey()) == null) {
				cacheResult(cholatalkies);
			}
			else {
				cholatalkies.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cholatalkieses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(cholatalkiesImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cholatalkies.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(cholatalkies cholatalkies) {
		entityCache.removeResult(cholatalkiesModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesImpl.class, cholatalkies.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<cholatalkies> cholatalkieses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (cholatalkies cholatalkies : cholatalkieses) {
			entityCache.removeResult(cholatalkiesModelImpl.ENTITY_CACHE_ENABLED,
				cholatalkiesImpl.class, cholatalkies.getPrimaryKey());
		}
	}

	/**
	 * Creates a new cholatalkies with the primary key. Does not add the cholatalkies to the database.
	 *
	 * @param id the primary key for the new cholatalkies
	 * @return the new cholatalkies
	 */
	@Override
	public cholatalkies create(long id) {
		cholatalkies cholatalkies = new cholatalkiesImpl();

		cholatalkies.setNew(true);
		cholatalkies.setPrimaryKey(id);

		return cholatalkies;
	}

	/**
	 * Removes the cholatalkies with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the cholatalkies
	 * @return the cholatalkies that was removed
	 * @throws NoSuchcholatalkiesException if a cholatalkies with the primary key could not be found
	 */
	@Override
	public cholatalkies remove(long id) throws NoSuchcholatalkiesException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the cholatalkies with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cholatalkies
	 * @return the cholatalkies that was removed
	 * @throws NoSuchcholatalkiesException if a cholatalkies with the primary key could not be found
	 */
	@Override
	public cholatalkies remove(Serializable primaryKey)
		throws NoSuchcholatalkiesException {
		Session session = null;

		try {
			session = openSession();

			cholatalkies cholatalkies = (cholatalkies)session.get(cholatalkiesImpl.class,
					primaryKey);

			if (cholatalkies == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcholatalkiesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cholatalkies);
		}
		catch (NoSuchcholatalkiesException nsee) {
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
	protected cholatalkies removeImpl(cholatalkies cholatalkies) {
		cholatalkies = toUnwrappedModel(cholatalkies);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cholatalkies)) {
				cholatalkies = (cholatalkies)session.get(cholatalkiesImpl.class,
						cholatalkies.getPrimaryKeyObj());
			}

			if (cholatalkies != null) {
				session.delete(cholatalkies);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cholatalkies != null) {
			clearCache(cholatalkies);
		}

		return cholatalkies;
	}

	@Override
	public cholatalkies updateImpl(cholatalkies cholatalkies) {
		cholatalkies = toUnwrappedModel(cholatalkies);

		boolean isNew = cholatalkies.isNew();

		cholatalkiesModelImpl cholatalkiesModelImpl = (cholatalkiesModelImpl)cholatalkies;

		Session session = null;

		try {
			session = openSession();

			if (cholatalkies.isNew()) {
				session.save(cholatalkies);

				cholatalkies.setNew(false);
			}
			else {
				cholatalkies = (cholatalkies)session.merge(cholatalkies);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !cholatalkiesModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((cholatalkiesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cholatalkiesModelImpl.getOriginalContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);

				args = new Object[] { cholatalkiesModelImpl.getContent_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);
			}
		}

		entityCache.putResult(cholatalkiesModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesImpl.class, cholatalkies.getPrimaryKey(), cholatalkies,
			false);

		cholatalkies.resetOriginalValues();

		return cholatalkies;
	}

	protected cholatalkies toUnwrappedModel(cholatalkies cholatalkies) {
		if (cholatalkies instanceof cholatalkiesImpl) {
			return cholatalkies;
		}

		cholatalkiesImpl cholatalkiesImpl = new cholatalkiesImpl();

		cholatalkiesImpl.setNew(cholatalkies.isNew());
		cholatalkiesImpl.setPrimaryKey(cholatalkies.getPrimaryKey());

		cholatalkiesImpl.setId(cholatalkies.getId());
		cholatalkiesImpl.setContent_id(cholatalkies.getContent_id());
		cholatalkiesImpl.setVideoName(cholatalkies.getVideoName());
		cholatalkiesImpl.setVideoDesc(cholatalkies.getVideoDesc());
		cholatalkiesImpl.setVideoId(cholatalkies.getVideoId());
		cholatalkiesImpl.setCreatedDate(cholatalkies.getCreatedDate());
		cholatalkiesImpl.setCreatedBy(cholatalkies.getCreatedBy());
		cholatalkiesImpl.setFlag(cholatalkies.getFlag());

		return cholatalkiesImpl;
	}

	/**
	 * Returns the cholatalkies with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cholatalkies
	 * @return the cholatalkies
	 * @throws NoSuchcholatalkiesException if a cholatalkies with the primary key could not be found
	 */
	@Override
	public cholatalkies findByPrimaryKey(Serializable primaryKey)
		throws NoSuchcholatalkiesException {
		cholatalkies cholatalkies = fetchByPrimaryKey(primaryKey);

		if (cholatalkies == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcholatalkiesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cholatalkies;
	}

	/**
	 * Returns the cholatalkies with the primary key or throws a {@link NoSuchcholatalkiesException} if it could not be found.
	 *
	 * @param id the primary key of the cholatalkies
	 * @return the cholatalkies
	 * @throws NoSuchcholatalkiesException if a cholatalkies with the primary key could not be found
	 */
	@Override
	public cholatalkies findByPrimaryKey(long id)
		throws NoSuchcholatalkiesException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the cholatalkies with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cholatalkies
	 * @return the cholatalkies, or <code>null</code> if a cholatalkies with the primary key could not be found
	 */
	@Override
	public cholatalkies fetchByPrimaryKey(Serializable primaryKey) {
		cholatalkies cholatalkies = (cholatalkies)entityCache.getResult(cholatalkiesModelImpl.ENTITY_CACHE_ENABLED,
				cholatalkiesImpl.class, primaryKey);

		if (cholatalkies == _nullcholatalkies) {
			return null;
		}

		if (cholatalkies == null) {
			Session session = null;

			try {
				session = openSession();

				cholatalkies = (cholatalkies)session.get(cholatalkiesImpl.class,
						primaryKey);

				if (cholatalkies != null) {
					cacheResult(cholatalkies);
				}
				else {
					entityCache.putResult(cholatalkiesModelImpl.ENTITY_CACHE_ENABLED,
						cholatalkiesImpl.class, primaryKey, _nullcholatalkies);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(cholatalkiesModelImpl.ENTITY_CACHE_ENABLED,
					cholatalkiesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cholatalkies;
	}

	/**
	 * Returns the cholatalkies with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the cholatalkies
	 * @return the cholatalkies, or <code>null</code> if a cholatalkies with the primary key could not be found
	 */
	@Override
	public cholatalkies fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, cholatalkies> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, cholatalkies> map = new HashMap<Serializable, cholatalkies>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			cholatalkies cholatalkies = fetchByPrimaryKey(primaryKey);

			if (cholatalkies != null) {
				map.put(primaryKey, cholatalkies);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			cholatalkies cholatalkies = (cholatalkies)entityCache.getResult(cholatalkiesModelImpl.ENTITY_CACHE_ENABLED,
					cholatalkiesImpl.class, primaryKey);

			if (cholatalkies == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, cholatalkies);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CHOLATALKIES_WHERE_PKS_IN);

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

			for (cholatalkies cholatalkies : (List<cholatalkies>)q.list()) {
				map.put(cholatalkies.getPrimaryKeyObj(), cholatalkies);

				cacheResult(cholatalkies);

				uncachedPrimaryKeys.remove(cholatalkies.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(cholatalkiesModelImpl.ENTITY_CACHE_ENABLED,
					cholatalkiesImpl.class, primaryKey, _nullcholatalkies);
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
	 * Returns all the cholatalkieses.
	 *
	 * @return the cholatalkieses
	 */
	@Override
	public List<cholatalkies> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cholatalkieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cholatalkieses
	 * @param end the upper bound of the range of cholatalkieses (not inclusive)
	 * @return the range of cholatalkieses
	 */
	@Override
	public List<cholatalkies> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cholatalkieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cholatalkieses
	 * @param end the upper bound of the range of cholatalkieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cholatalkieses
	 */
	@Override
	public List<cholatalkies> findAll(int start, int end,
		OrderByComparator<cholatalkies> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cholatalkieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cholatalkieses
	 * @param end the upper bound of the range of cholatalkieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of cholatalkieses
	 */
	@Override
	public List<cholatalkies> findAll(int start, int end,
		OrderByComparator<cholatalkies> orderByComparator,
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

		List<cholatalkies> list = null;

		if (retrieveFromCache) {
			list = (List<cholatalkies>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CHOLATALKIES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CHOLATALKIES;

				if (pagination) {
					sql = sql.concat(cholatalkiesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<cholatalkies>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<cholatalkies>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the cholatalkieses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (cholatalkies cholatalkies : findAll()) {
			remove(cholatalkies);
		}
	}

	/**
	 * Returns the number of cholatalkieses.
	 *
	 * @return the number of cholatalkieses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CHOLATALKIES);

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
		return cholatalkiesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cholatalkies persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(cholatalkiesImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_CHOLATALKIES = "SELECT cholatalkies FROM cholatalkies cholatalkies";
	private static final String _SQL_SELECT_CHOLATALKIES_WHERE_PKS_IN = "SELECT cholatalkies FROM cholatalkies cholatalkies WHERE id_ IN (";
	private static final String _SQL_SELECT_CHOLATALKIES_WHERE = "SELECT cholatalkies FROM cholatalkies cholatalkies WHERE ";
	private static final String _SQL_COUNT_CHOLATALKIES = "SELECT COUNT(cholatalkies) FROM cholatalkies cholatalkies";
	private static final String _SQL_COUNT_CHOLATALKIES_WHERE = "SELECT COUNT(cholatalkies) FROM cholatalkies cholatalkies WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cholatalkies.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No cholatalkies exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No cholatalkies exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(cholatalkiesPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final cholatalkies _nullcholatalkies = new cholatalkiesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<cholatalkies> toCacheModel() {
				return _nullcholatalkiesCacheModel;
			}
		};

	private static final CacheModel<cholatalkies> _nullcholatalkiesCacheModel = new CacheModel<cholatalkies>() {
			@Override
			public cholatalkies toEntityModel() {
				return _nullcholatalkies;
			}
		};
}