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

import com.exception.NoSuchcholatalkiespathException;

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

import com.model.cholatalkiespath;

import com.model.impl.cholatalkiespathImpl;
import com.model.impl.cholatalkiespathModelImpl;

import com.service.persistence.cholatalkiespathPersistence;

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
 * The persistence implementation for the cholatalkiespath service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see cholatalkiespathPersistence
 * @see com.service.persistence.cholatalkiespathUtil
 * @generated
 */
@ProviderType
public class cholatalkiespathPersistenceImpl extends BasePersistenceImpl<cholatalkiespath>
	implements cholatalkiespathPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link cholatalkiespathUtil} to access the cholatalkiespath persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = cholatalkiespathImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(cholatalkiespathModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiespathModelImpl.FINDER_CACHE_ENABLED,
			cholatalkiespathImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(cholatalkiespathModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiespathModelImpl.FINDER_CACHE_ENABLED,
			cholatalkiespathImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(cholatalkiespathModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiespathModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CTDETAILS_ID =
		new FinderPath(cholatalkiespathModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiespathModelImpl.FINDER_CACHE_ENABLED,
			cholatalkiespathImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCTDETAILS_ID",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CTDETAILS_ID =
		new FinderPath(cholatalkiespathModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiespathModelImpl.FINDER_CACHE_ENABLED,
			cholatalkiespathImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCTDETAILS_ID",
			new String[] { String.class.getName() },
			cholatalkiespathModelImpl.CHOLATALKIESDETAILD_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CTDETAILS_ID = new FinderPath(cholatalkiespathModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiespathModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCTDETAILS_ID",
			new String[] { String.class.getName() });

	/**
	 * Returns all the cholatalkiespaths where cholatalkiesdetaild_id = &#63;.
	 *
	 * @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	 * @return the matching cholatalkiespaths
	 */
	@Override
	public List<cholatalkiespath> findByCTDETAILS_ID(
		String cholatalkiesdetaild_id) {
		return findByCTDETAILS_ID(cholatalkiesdetaild_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cholatalkiespaths where cholatalkiesdetaild_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	 * @param start the lower bound of the range of cholatalkiespaths
	 * @param end the upper bound of the range of cholatalkiespaths (not inclusive)
	 * @return the range of matching cholatalkiespaths
	 */
	@Override
	public List<cholatalkiespath> findByCTDETAILS_ID(
		String cholatalkiesdetaild_id, int start, int end) {
		return findByCTDETAILS_ID(cholatalkiesdetaild_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cholatalkiespaths where cholatalkiesdetaild_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	 * @param start the lower bound of the range of cholatalkiespaths
	 * @param end the upper bound of the range of cholatalkiespaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cholatalkiespaths
	 */
	@Override
	public List<cholatalkiespath> findByCTDETAILS_ID(
		String cholatalkiesdetaild_id, int start, int end,
		OrderByComparator<cholatalkiespath> orderByComparator) {
		return findByCTDETAILS_ID(cholatalkiesdetaild_id, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cholatalkiespaths where cholatalkiesdetaild_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	 * @param start the lower bound of the range of cholatalkiespaths
	 * @param end the upper bound of the range of cholatalkiespaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching cholatalkiespaths
	 */
	@Override
	public List<cholatalkiespath> findByCTDETAILS_ID(
		String cholatalkiesdetaild_id, int start, int end,
		OrderByComparator<cholatalkiespath> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CTDETAILS_ID;
			finderArgs = new Object[] { cholatalkiesdetaild_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CTDETAILS_ID;
			finderArgs = new Object[] {
					cholatalkiesdetaild_id,
					
					start, end, orderByComparator
				};
		}

		List<cholatalkiespath> list = null;

		if (retrieveFromCache) {
			list = (List<cholatalkiespath>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (cholatalkiespath cholatalkiespath : list) {
					if (!Objects.equals(cholatalkiesdetaild_id,
								cholatalkiespath.getCholatalkiesdetaild_id())) {
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

			query.append(_SQL_SELECT_CHOLATALKIESPATH_WHERE);

			boolean bindCholatalkiesdetaild_id = false;

			if (cholatalkiesdetaild_id == null) {
				query.append(_FINDER_COLUMN_CTDETAILS_ID_CHOLATALKIESDETAILD_ID_1);
			}
			else if (cholatalkiesdetaild_id.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CTDETAILS_ID_CHOLATALKIESDETAILD_ID_3);
			}
			else {
				bindCholatalkiesdetaild_id = true;

				query.append(_FINDER_COLUMN_CTDETAILS_ID_CHOLATALKIESDETAILD_ID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(cholatalkiespathModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCholatalkiesdetaild_id) {
					qPos.add(cholatalkiesdetaild_id);
				}

				if (!pagination) {
					list = (List<cholatalkiespath>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<cholatalkiespath>)QueryUtil.list(q,
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
	 * Returns the first cholatalkiespath in the ordered set where cholatalkiesdetaild_id = &#63;.
	 *
	 * @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cholatalkiespath
	 * @throws NoSuchcholatalkiespathException if a matching cholatalkiespath could not be found
	 */
	@Override
	public cholatalkiespath findByCTDETAILS_ID_First(
		String cholatalkiesdetaild_id,
		OrderByComparator<cholatalkiespath> orderByComparator)
		throws NoSuchcholatalkiespathException {
		cholatalkiespath cholatalkiespath = fetchByCTDETAILS_ID_First(cholatalkiesdetaild_id,
				orderByComparator);

		if (cholatalkiespath != null) {
			return cholatalkiespath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cholatalkiesdetaild_id=");
		msg.append(cholatalkiesdetaild_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcholatalkiespathException(msg.toString());
	}

	/**
	 * Returns the first cholatalkiespath in the ordered set where cholatalkiesdetaild_id = &#63;.
	 *
	 * @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cholatalkiespath, or <code>null</code> if a matching cholatalkiespath could not be found
	 */
	@Override
	public cholatalkiespath fetchByCTDETAILS_ID_First(
		String cholatalkiesdetaild_id,
		OrderByComparator<cholatalkiespath> orderByComparator) {
		List<cholatalkiespath> list = findByCTDETAILS_ID(cholatalkiesdetaild_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cholatalkiespath in the ordered set where cholatalkiesdetaild_id = &#63;.
	 *
	 * @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cholatalkiespath
	 * @throws NoSuchcholatalkiespathException if a matching cholatalkiespath could not be found
	 */
	@Override
	public cholatalkiespath findByCTDETAILS_ID_Last(
		String cholatalkiesdetaild_id,
		OrderByComparator<cholatalkiespath> orderByComparator)
		throws NoSuchcholatalkiespathException {
		cholatalkiespath cholatalkiespath = fetchByCTDETAILS_ID_Last(cholatalkiesdetaild_id,
				orderByComparator);

		if (cholatalkiespath != null) {
			return cholatalkiespath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cholatalkiesdetaild_id=");
		msg.append(cholatalkiesdetaild_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcholatalkiespathException(msg.toString());
	}

	/**
	 * Returns the last cholatalkiespath in the ordered set where cholatalkiesdetaild_id = &#63;.
	 *
	 * @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cholatalkiespath, or <code>null</code> if a matching cholatalkiespath could not be found
	 */
	@Override
	public cholatalkiespath fetchByCTDETAILS_ID_Last(
		String cholatalkiesdetaild_id,
		OrderByComparator<cholatalkiespath> orderByComparator) {
		int count = countByCTDETAILS_ID(cholatalkiesdetaild_id);

		if (count == 0) {
			return null;
		}

		List<cholatalkiespath> list = findByCTDETAILS_ID(cholatalkiesdetaild_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cholatalkiespaths before and after the current cholatalkiespath in the ordered set where cholatalkiesdetaild_id = &#63;.
	 *
	 * @param id the primary key of the current cholatalkiespath
	 * @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cholatalkiespath
	 * @throws NoSuchcholatalkiespathException if a cholatalkiespath with the primary key could not be found
	 */
	@Override
	public cholatalkiespath[] findByCTDETAILS_ID_PrevAndNext(long id,
		String cholatalkiesdetaild_id,
		OrderByComparator<cholatalkiespath> orderByComparator)
		throws NoSuchcholatalkiespathException {
		cholatalkiespath cholatalkiespath = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			cholatalkiespath[] array = new cholatalkiespathImpl[3];

			array[0] = getByCTDETAILS_ID_PrevAndNext(session, cholatalkiespath,
					cholatalkiesdetaild_id, orderByComparator, true);

			array[1] = cholatalkiespath;

			array[2] = getByCTDETAILS_ID_PrevAndNext(session, cholatalkiespath,
					cholatalkiesdetaild_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected cholatalkiespath getByCTDETAILS_ID_PrevAndNext(Session session,
		cholatalkiespath cholatalkiespath, String cholatalkiesdetaild_id,
		OrderByComparator<cholatalkiespath> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CHOLATALKIESPATH_WHERE);

		boolean bindCholatalkiesdetaild_id = false;

		if (cholatalkiesdetaild_id == null) {
			query.append(_FINDER_COLUMN_CTDETAILS_ID_CHOLATALKIESDETAILD_ID_1);
		}
		else if (cholatalkiesdetaild_id.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CTDETAILS_ID_CHOLATALKIESDETAILD_ID_3);
		}
		else {
			bindCholatalkiesdetaild_id = true;

			query.append(_FINDER_COLUMN_CTDETAILS_ID_CHOLATALKIESDETAILD_ID_2);
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
			query.append(cholatalkiespathModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCholatalkiesdetaild_id) {
			qPos.add(cholatalkiesdetaild_id);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cholatalkiespath);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<cholatalkiespath> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cholatalkiespaths where cholatalkiesdetaild_id = &#63; from the database.
	 *
	 * @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	 */
	@Override
	public void removeByCTDETAILS_ID(String cholatalkiesdetaild_id) {
		for (cholatalkiespath cholatalkiespath : findByCTDETAILS_ID(
				cholatalkiesdetaild_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(cholatalkiespath);
		}
	}

	/**
	 * Returns the number of cholatalkiespaths where cholatalkiesdetaild_id = &#63;.
	 *
	 * @param cholatalkiesdetaild_id the cholatalkiesdetaild_id
	 * @return the number of matching cholatalkiespaths
	 */
	@Override
	public int countByCTDETAILS_ID(String cholatalkiesdetaild_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CTDETAILS_ID;

		Object[] finderArgs = new Object[] { cholatalkiesdetaild_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CHOLATALKIESPATH_WHERE);

			boolean bindCholatalkiesdetaild_id = false;

			if (cholatalkiesdetaild_id == null) {
				query.append(_FINDER_COLUMN_CTDETAILS_ID_CHOLATALKIESDETAILD_ID_1);
			}
			else if (cholatalkiesdetaild_id.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CTDETAILS_ID_CHOLATALKIESDETAILD_ID_3);
			}
			else {
				bindCholatalkiesdetaild_id = true;

				query.append(_FINDER_COLUMN_CTDETAILS_ID_CHOLATALKIESDETAILD_ID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCholatalkiesdetaild_id) {
					qPos.add(cholatalkiesdetaild_id);
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

	private static final String _FINDER_COLUMN_CTDETAILS_ID_CHOLATALKIESDETAILD_ID_1 =
		"cholatalkiespath.cholatalkiesdetaild_id IS NULL";
	private static final String _FINDER_COLUMN_CTDETAILS_ID_CHOLATALKIESDETAILD_ID_2 =
		"cholatalkiespath.cholatalkiesdetaild_id = ?";
	private static final String _FINDER_COLUMN_CTDETAILS_ID_CHOLATALKIESDETAILD_ID_3 =
		"(cholatalkiespath.cholatalkiesdetaild_id IS NULL OR cholatalkiespath.cholatalkiesdetaild_id = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(cholatalkiespathModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiespathModelImpl.FINDER_CACHE_ENABLED,
			cholatalkiespathImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCONTENT_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(cholatalkiespathModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiespathModelImpl.FINDER_CACHE_ENABLED,
			cholatalkiespathImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCONTENT_ID",
			new String[] { Long.class.getName() },
			cholatalkiespathModelImpl.CONTENT_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTENT_ID = new FinderPath(cholatalkiespathModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiespathModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCONTENT_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the cholatalkiespaths where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the matching cholatalkiespaths
	 */
	@Override
	public List<cholatalkiespath> findByCONTENT_ID(long content_id) {
		return findByCONTENT_ID(content_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cholatalkiespaths where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of cholatalkiespaths
	 * @param end the upper bound of the range of cholatalkiespaths (not inclusive)
	 * @return the range of matching cholatalkiespaths
	 */
	@Override
	public List<cholatalkiespath> findByCONTENT_ID(long content_id, int start,
		int end) {
		return findByCONTENT_ID(content_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cholatalkiespaths where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of cholatalkiespaths
	 * @param end the upper bound of the range of cholatalkiespaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cholatalkiespaths
	 */
	@Override
	public List<cholatalkiespath> findByCONTENT_ID(long content_id, int start,
		int end, OrderByComparator<cholatalkiespath> orderByComparator) {
		return findByCONTENT_ID(content_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cholatalkiespaths where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of cholatalkiespaths
	 * @param end the upper bound of the range of cholatalkiespaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching cholatalkiespaths
	 */
	@Override
	public List<cholatalkiespath> findByCONTENT_ID(long content_id, int start,
		int end, OrderByComparator<cholatalkiespath> orderByComparator,
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

		List<cholatalkiespath> list = null;

		if (retrieveFromCache) {
			list = (List<cholatalkiespath>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (cholatalkiespath cholatalkiespath : list) {
					if ((content_id != cholatalkiespath.getContent_id())) {
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

			query.append(_SQL_SELECT_CHOLATALKIESPATH_WHERE);

			query.append(_FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(cholatalkiespathModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(content_id);

				if (!pagination) {
					list = (List<cholatalkiespath>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<cholatalkiespath>)QueryUtil.list(q,
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
	 * Returns the first cholatalkiespath in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cholatalkiespath
	 * @throws NoSuchcholatalkiespathException if a matching cholatalkiespath could not be found
	 */
	@Override
	public cholatalkiespath findByCONTENT_ID_First(long content_id,
		OrderByComparator<cholatalkiespath> orderByComparator)
		throws NoSuchcholatalkiespathException {
		cholatalkiespath cholatalkiespath = fetchByCONTENT_ID_First(content_id,
				orderByComparator);

		if (cholatalkiespath != null) {
			return cholatalkiespath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcholatalkiespathException(msg.toString());
	}

	/**
	 * Returns the first cholatalkiespath in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cholatalkiespath, or <code>null</code> if a matching cholatalkiespath could not be found
	 */
	@Override
	public cholatalkiespath fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<cholatalkiespath> orderByComparator) {
		List<cholatalkiespath> list = findByCONTENT_ID(content_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cholatalkiespath in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cholatalkiespath
	 * @throws NoSuchcholatalkiespathException if a matching cholatalkiespath could not be found
	 */
	@Override
	public cholatalkiespath findByCONTENT_ID_Last(long content_id,
		OrderByComparator<cholatalkiespath> orderByComparator)
		throws NoSuchcholatalkiespathException {
		cholatalkiespath cholatalkiespath = fetchByCONTENT_ID_Last(content_id,
				orderByComparator);

		if (cholatalkiespath != null) {
			return cholatalkiespath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcholatalkiespathException(msg.toString());
	}

	/**
	 * Returns the last cholatalkiespath in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cholatalkiespath, or <code>null</code> if a matching cholatalkiespath could not be found
	 */
	@Override
	public cholatalkiespath fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<cholatalkiespath> orderByComparator) {
		int count = countByCONTENT_ID(content_id);

		if (count == 0) {
			return null;
		}

		List<cholatalkiespath> list = findByCONTENT_ID(content_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cholatalkiespaths before and after the current cholatalkiespath in the ordered set where content_id = &#63;.
	 *
	 * @param id the primary key of the current cholatalkiespath
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cholatalkiespath
	 * @throws NoSuchcholatalkiespathException if a cholatalkiespath with the primary key could not be found
	 */
	@Override
	public cholatalkiespath[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id, OrderByComparator<cholatalkiespath> orderByComparator)
		throws NoSuchcholatalkiespathException {
		cholatalkiespath cholatalkiespath = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			cholatalkiespath[] array = new cholatalkiespathImpl[3];

			array[0] = getByCONTENT_ID_PrevAndNext(session, cholatalkiespath,
					content_id, orderByComparator, true);

			array[1] = cholatalkiespath;

			array[2] = getByCONTENT_ID_PrevAndNext(session, cholatalkiespath,
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

	protected cholatalkiespath getByCONTENT_ID_PrevAndNext(Session session,
		cholatalkiespath cholatalkiespath, long content_id,
		OrderByComparator<cholatalkiespath> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CHOLATALKIESPATH_WHERE);

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
			query.append(cholatalkiespathModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(content_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cholatalkiespath);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<cholatalkiespath> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cholatalkiespaths where content_id = &#63; from the database.
	 *
	 * @param content_id the content_id
	 */
	@Override
	public void removeByCONTENT_ID(long content_id) {
		for (cholatalkiespath cholatalkiespath : findByCONTENT_ID(content_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cholatalkiespath);
		}
	}

	/**
	 * Returns the number of cholatalkiespaths where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the number of matching cholatalkiespaths
	 */
	@Override
	public int countByCONTENT_ID(long content_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTENT_ID;

		Object[] finderArgs = new Object[] { content_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CHOLATALKIESPATH_WHERE);

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

	private static final String _FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2 = "cholatalkiespath.content_id = ?";

	public cholatalkiespathPersistenceImpl() {
		setModelClass(cholatalkiespath.class);
	}

	/**
	 * Caches the cholatalkiespath in the entity cache if it is enabled.
	 *
	 * @param cholatalkiespath the cholatalkiespath
	 */
	@Override
	public void cacheResult(cholatalkiespath cholatalkiespath) {
		entityCache.putResult(cholatalkiespathModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiespathImpl.class, cholatalkiespath.getPrimaryKey(),
			cholatalkiespath);

		cholatalkiespath.resetOriginalValues();
	}

	/**
	 * Caches the cholatalkiespaths in the entity cache if it is enabled.
	 *
	 * @param cholatalkiespaths the cholatalkiespaths
	 */
	@Override
	public void cacheResult(List<cholatalkiespath> cholatalkiespaths) {
		for (cholatalkiespath cholatalkiespath : cholatalkiespaths) {
			if (entityCache.getResult(
						cholatalkiespathModelImpl.ENTITY_CACHE_ENABLED,
						cholatalkiespathImpl.class,
						cholatalkiespath.getPrimaryKey()) == null) {
				cacheResult(cholatalkiespath);
			}
			else {
				cholatalkiespath.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cholatalkiespaths.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(cholatalkiespathImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cholatalkiespath.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(cholatalkiespath cholatalkiespath) {
		entityCache.removeResult(cholatalkiespathModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiespathImpl.class, cholatalkiespath.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<cholatalkiespath> cholatalkiespaths) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (cholatalkiespath cholatalkiespath : cholatalkiespaths) {
			entityCache.removeResult(cholatalkiespathModelImpl.ENTITY_CACHE_ENABLED,
				cholatalkiespathImpl.class, cholatalkiespath.getPrimaryKey());
		}
	}

	/**
	 * Creates a new cholatalkiespath with the primary key. Does not add the cholatalkiespath to the database.
	 *
	 * @param id the primary key for the new cholatalkiespath
	 * @return the new cholatalkiespath
	 */
	@Override
	public cholatalkiespath create(long id) {
		cholatalkiespath cholatalkiespath = new cholatalkiespathImpl();

		cholatalkiespath.setNew(true);
		cholatalkiespath.setPrimaryKey(id);

		return cholatalkiespath;
	}

	/**
	 * Removes the cholatalkiespath with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the cholatalkiespath
	 * @return the cholatalkiespath that was removed
	 * @throws NoSuchcholatalkiespathException if a cholatalkiespath with the primary key could not be found
	 */
	@Override
	public cholatalkiespath remove(long id)
		throws NoSuchcholatalkiespathException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the cholatalkiespath with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cholatalkiespath
	 * @return the cholatalkiespath that was removed
	 * @throws NoSuchcholatalkiespathException if a cholatalkiespath with the primary key could not be found
	 */
	@Override
	public cholatalkiespath remove(Serializable primaryKey)
		throws NoSuchcholatalkiespathException {
		Session session = null;

		try {
			session = openSession();

			cholatalkiespath cholatalkiespath = (cholatalkiespath)session.get(cholatalkiespathImpl.class,
					primaryKey);

			if (cholatalkiespath == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcholatalkiespathException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cholatalkiespath);
		}
		catch (NoSuchcholatalkiespathException nsee) {
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
	protected cholatalkiespath removeImpl(cholatalkiespath cholatalkiespath) {
		cholatalkiespath = toUnwrappedModel(cholatalkiespath);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cholatalkiespath)) {
				cholatalkiespath = (cholatalkiespath)session.get(cholatalkiespathImpl.class,
						cholatalkiespath.getPrimaryKeyObj());
			}

			if (cholatalkiespath != null) {
				session.delete(cholatalkiespath);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cholatalkiespath != null) {
			clearCache(cholatalkiespath);
		}

		return cholatalkiespath;
	}

	@Override
	public cholatalkiespath updateImpl(cholatalkiespath cholatalkiespath) {
		cholatalkiespath = toUnwrappedModel(cholatalkiespath);

		boolean isNew = cholatalkiespath.isNew();

		cholatalkiespathModelImpl cholatalkiespathModelImpl = (cholatalkiespathModelImpl)cholatalkiespath;

		Session session = null;

		try {
			session = openSession();

			if (cholatalkiespath.isNew()) {
				session.save(cholatalkiespath);

				cholatalkiespath.setNew(false);
			}
			else {
				cholatalkiespath = (cholatalkiespath)session.merge(cholatalkiespath);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !cholatalkiespathModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((cholatalkiespathModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CTDETAILS_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cholatalkiespathModelImpl.getOriginalCholatalkiesdetaild_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CTDETAILS_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CTDETAILS_ID,
					args);

				args = new Object[] {
						cholatalkiespathModelImpl.getCholatalkiesdetaild_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CTDETAILS_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CTDETAILS_ID,
					args);
			}

			if ((cholatalkiespathModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cholatalkiespathModelImpl.getOriginalContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);

				args = new Object[] { cholatalkiespathModelImpl.getContent_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);
			}
		}

		entityCache.putResult(cholatalkiespathModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiespathImpl.class, cholatalkiespath.getPrimaryKey(),
			cholatalkiespath, false);

		cholatalkiespath.resetOriginalValues();

		return cholatalkiespath;
	}

	protected cholatalkiespath toUnwrappedModel(
		cholatalkiespath cholatalkiespath) {
		if (cholatalkiespath instanceof cholatalkiespathImpl) {
			return cholatalkiespath;
		}

		cholatalkiespathImpl cholatalkiespathImpl = new cholatalkiespathImpl();

		cholatalkiespathImpl.setNew(cholatalkiespath.isNew());
		cholatalkiespathImpl.setPrimaryKey(cholatalkiespath.getPrimaryKey());

		cholatalkiespathImpl.setId(cholatalkiespath.getId());
		cholatalkiespathImpl.setCholatalkiesdetaild_id(cholatalkiespath.getCholatalkiesdetaild_id());
		cholatalkiespathImpl.setContent_id(cholatalkiespath.getContent_id());
		cholatalkiespathImpl.setVideoPath(cholatalkiespath.getVideoPath());
		cholatalkiespathImpl.setVideoTitle(cholatalkiespath.getVideoTitle());
		cholatalkiespathImpl.setVideoDesc(cholatalkiespath.getVideoDesc());
		cholatalkiespathImpl.setCreatedDate(cholatalkiespath.getCreatedDate());
		cholatalkiespathImpl.setCreatedBy(cholatalkiespath.getCreatedBy());
		cholatalkiespathImpl.setUpdatedDate(cholatalkiespath.getUpdatedDate());
		cholatalkiespathImpl.setUpdatedBy(cholatalkiespath.getUpdatedBy());
		cholatalkiespathImpl.setFlag(cholatalkiespath.getFlag());

		return cholatalkiespathImpl;
	}

	/**
	 * Returns the cholatalkiespath with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cholatalkiespath
	 * @return the cholatalkiespath
	 * @throws NoSuchcholatalkiespathException if a cholatalkiespath with the primary key could not be found
	 */
	@Override
	public cholatalkiespath findByPrimaryKey(Serializable primaryKey)
		throws NoSuchcholatalkiespathException {
		cholatalkiespath cholatalkiespath = fetchByPrimaryKey(primaryKey);

		if (cholatalkiespath == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcholatalkiespathException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cholatalkiespath;
	}

	/**
	 * Returns the cholatalkiespath with the primary key or throws a {@link NoSuchcholatalkiespathException} if it could not be found.
	 *
	 * @param id the primary key of the cholatalkiespath
	 * @return the cholatalkiespath
	 * @throws NoSuchcholatalkiespathException if a cholatalkiespath with the primary key could not be found
	 */
	@Override
	public cholatalkiespath findByPrimaryKey(long id)
		throws NoSuchcholatalkiespathException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the cholatalkiespath with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cholatalkiespath
	 * @return the cholatalkiespath, or <code>null</code> if a cholatalkiespath with the primary key could not be found
	 */
	@Override
	public cholatalkiespath fetchByPrimaryKey(Serializable primaryKey) {
		cholatalkiespath cholatalkiespath = (cholatalkiespath)entityCache.getResult(cholatalkiespathModelImpl.ENTITY_CACHE_ENABLED,
				cholatalkiespathImpl.class, primaryKey);

		if (cholatalkiespath == _nullcholatalkiespath) {
			return null;
		}

		if (cholatalkiespath == null) {
			Session session = null;

			try {
				session = openSession();

				cholatalkiespath = (cholatalkiespath)session.get(cholatalkiespathImpl.class,
						primaryKey);

				if (cholatalkiespath != null) {
					cacheResult(cholatalkiespath);
				}
				else {
					entityCache.putResult(cholatalkiespathModelImpl.ENTITY_CACHE_ENABLED,
						cholatalkiespathImpl.class, primaryKey,
						_nullcholatalkiespath);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(cholatalkiespathModelImpl.ENTITY_CACHE_ENABLED,
					cholatalkiespathImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cholatalkiespath;
	}

	/**
	 * Returns the cholatalkiespath with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the cholatalkiespath
	 * @return the cholatalkiespath, or <code>null</code> if a cholatalkiespath with the primary key could not be found
	 */
	@Override
	public cholatalkiespath fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, cholatalkiespath> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, cholatalkiespath> map = new HashMap<Serializable, cholatalkiespath>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			cholatalkiespath cholatalkiespath = fetchByPrimaryKey(primaryKey);

			if (cholatalkiespath != null) {
				map.put(primaryKey, cholatalkiespath);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			cholatalkiespath cholatalkiespath = (cholatalkiespath)entityCache.getResult(cholatalkiespathModelImpl.ENTITY_CACHE_ENABLED,
					cholatalkiespathImpl.class, primaryKey);

			if (cholatalkiespath == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, cholatalkiespath);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CHOLATALKIESPATH_WHERE_PKS_IN);

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

			for (cholatalkiespath cholatalkiespath : (List<cholatalkiespath>)q.list()) {
				map.put(cholatalkiespath.getPrimaryKeyObj(), cholatalkiespath);

				cacheResult(cholatalkiespath);

				uncachedPrimaryKeys.remove(cholatalkiespath.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(cholatalkiespathModelImpl.ENTITY_CACHE_ENABLED,
					cholatalkiespathImpl.class, primaryKey,
					_nullcholatalkiespath);
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
	 * Returns all the cholatalkiespaths.
	 *
	 * @return the cholatalkiespaths
	 */
	@Override
	public List<cholatalkiespath> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cholatalkiespaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cholatalkiespaths
	 * @param end the upper bound of the range of cholatalkiespaths (not inclusive)
	 * @return the range of cholatalkiespaths
	 */
	@Override
	public List<cholatalkiespath> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cholatalkiespaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cholatalkiespaths
	 * @param end the upper bound of the range of cholatalkiespaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cholatalkiespaths
	 */
	@Override
	public List<cholatalkiespath> findAll(int start, int end,
		OrderByComparator<cholatalkiespath> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cholatalkiespaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiespathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cholatalkiespaths
	 * @param end the upper bound of the range of cholatalkiespaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of cholatalkiespaths
	 */
	@Override
	public List<cholatalkiespath> findAll(int start, int end,
		OrderByComparator<cholatalkiespath> orderByComparator,
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

		List<cholatalkiespath> list = null;

		if (retrieveFromCache) {
			list = (List<cholatalkiespath>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CHOLATALKIESPATH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CHOLATALKIESPATH;

				if (pagination) {
					sql = sql.concat(cholatalkiespathModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<cholatalkiespath>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<cholatalkiespath>)QueryUtil.list(q,
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
	 * Removes all the cholatalkiespaths from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (cholatalkiespath cholatalkiespath : findAll()) {
			remove(cholatalkiespath);
		}
	}

	/**
	 * Returns the number of cholatalkiespaths.
	 *
	 * @return the number of cholatalkiespaths
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CHOLATALKIESPATH);

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
		return cholatalkiespathModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cholatalkiespath persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(cholatalkiespathImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_CHOLATALKIESPATH = "SELECT cholatalkiespath FROM cholatalkiespath cholatalkiespath";
	private static final String _SQL_SELECT_CHOLATALKIESPATH_WHERE_PKS_IN = "SELECT cholatalkiespath FROM cholatalkiespath cholatalkiespath WHERE id_ IN (";
	private static final String _SQL_SELECT_CHOLATALKIESPATH_WHERE = "SELECT cholatalkiespath FROM cholatalkiespath cholatalkiespath WHERE ";
	private static final String _SQL_COUNT_CHOLATALKIESPATH = "SELECT COUNT(cholatalkiespath) FROM cholatalkiespath cholatalkiespath";
	private static final String _SQL_COUNT_CHOLATALKIESPATH_WHERE = "SELECT COUNT(cholatalkiespath) FROM cholatalkiespath cholatalkiespath WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cholatalkiespath.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No cholatalkiespath exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No cholatalkiespath exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(cholatalkiespathPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final cholatalkiespath _nullcholatalkiespath = new cholatalkiespathImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<cholatalkiespath> toCacheModel() {
				return _nullcholatalkiespathCacheModel;
			}
		};

	private static final CacheModel<cholatalkiespath> _nullcholatalkiespathCacheModel =
		new CacheModel<cholatalkiespath>() {
			@Override
			public cholatalkiespath toEntityModel() {
				return _nullcholatalkiespath;
			}
		};
}