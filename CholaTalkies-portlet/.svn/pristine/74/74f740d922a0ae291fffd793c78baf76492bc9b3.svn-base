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

import com.exception.NoSuchcholatalkiesusersException;

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

import com.model.cholatalkiesusers;

import com.model.impl.cholatalkiesusersImpl;
import com.model.impl.cholatalkiesusersModelImpl;

import com.service.persistence.cholatalkiesusersPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the cholatalkiesusers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see cholatalkiesusersPersistence
 * @see com.service.persistence.cholatalkiesusersUtil
 * @generated
 */
@ProviderType
public class cholatalkiesusersPersistenceImpl extends BasePersistenceImpl<cholatalkiesusers>
	implements cholatalkiesusersPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link cholatalkiesusersUtil} to access the cholatalkiesusers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = cholatalkiesusersImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(cholatalkiesusersModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesusersModelImpl.FINDER_CACHE_ENABLED,
			cholatalkiesusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(cholatalkiesusersModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesusersModelImpl.FINDER_CACHE_ENABLED,
			cholatalkiesusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(cholatalkiesusersModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CHOLATALKIES_ID =
		new FinderPath(cholatalkiesusersModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesusersModelImpl.FINDER_CACHE_ENABLED,
			cholatalkiesusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCHOLATALKIES_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHOLATALKIES_ID =
		new FinderPath(cholatalkiesusersModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesusersModelImpl.FINDER_CACHE_ENABLED,
			cholatalkiesusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCHOLATALKIES_ID",
			new String[] { Long.class.getName() },
			cholatalkiesusersModelImpl.CHOLATALKIESDETAILS_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CHOLATALKIES_ID = new FinderPath(cholatalkiesusersModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCHOLATALKIES_ID", new String[] { Long.class.getName() });

	/**
	 * Returns all the cholatalkiesuserses where cholatalkiesdetails_id = &#63;.
	 *
	 * @param cholatalkiesdetails_id the cholatalkiesdetails_id
	 * @return the matching cholatalkiesuserses
	 */
	@Override
	public List<cholatalkiesusers> findByCHOLATALKIES_ID(
		long cholatalkiesdetails_id) {
		return findByCHOLATALKIES_ID(cholatalkiesdetails_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cholatalkiesuserses where cholatalkiesdetails_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param cholatalkiesdetails_id the cholatalkiesdetails_id
	 * @param start the lower bound of the range of cholatalkiesuserses
	 * @param end the upper bound of the range of cholatalkiesuserses (not inclusive)
	 * @return the range of matching cholatalkiesuserses
	 */
	@Override
	public List<cholatalkiesusers> findByCHOLATALKIES_ID(
		long cholatalkiesdetails_id, int start, int end) {
		return findByCHOLATALKIES_ID(cholatalkiesdetails_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cholatalkiesuserses where cholatalkiesdetails_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param cholatalkiesdetails_id the cholatalkiesdetails_id
	 * @param start the lower bound of the range of cholatalkiesuserses
	 * @param end the upper bound of the range of cholatalkiesuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cholatalkiesuserses
	 */
	@Override
	public List<cholatalkiesusers> findByCHOLATALKIES_ID(
		long cholatalkiesdetails_id, int start, int end,
		OrderByComparator<cholatalkiesusers> orderByComparator) {
		return findByCHOLATALKIES_ID(cholatalkiesdetails_id, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cholatalkiesuserses where cholatalkiesdetails_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param cholatalkiesdetails_id the cholatalkiesdetails_id
	 * @param start the lower bound of the range of cholatalkiesuserses
	 * @param end the upper bound of the range of cholatalkiesuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching cholatalkiesuserses
	 */
	@Override
	public List<cholatalkiesusers> findByCHOLATALKIES_ID(
		long cholatalkiesdetails_id, int start, int end,
		OrderByComparator<cholatalkiesusers> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHOLATALKIES_ID;
			finderArgs = new Object[] { cholatalkiesdetails_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CHOLATALKIES_ID;
			finderArgs = new Object[] {
					cholatalkiesdetails_id,
					
					start, end, orderByComparator
				};
		}

		List<cholatalkiesusers> list = null;

		if (retrieveFromCache) {
			list = (List<cholatalkiesusers>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (cholatalkiesusers cholatalkiesusers : list) {
					if ((cholatalkiesdetails_id != cholatalkiesusers.getCholatalkiesdetails_id())) {
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

			query.append(_SQL_SELECT_CHOLATALKIESUSERS_WHERE);

			query.append(_FINDER_COLUMN_CHOLATALKIES_ID_CHOLATALKIESDETAILS_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(cholatalkiesusersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(cholatalkiesdetails_id);

				if (!pagination) {
					list = (List<cholatalkiesusers>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<cholatalkiesusers>)QueryUtil.list(q,
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
	 * Returns the first cholatalkiesusers in the ordered set where cholatalkiesdetails_id = &#63;.
	 *
	 * @param cholatalkiesdetails_id the cholatalkiesdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cholatalkiesusers
	 * @throws NoSuchcholatalkiesusersException if a matching cholatalkiesusers could not be found
	 */
	@Override
	public cholatalkiesusers findByCHOLATALKIES_ID_First(
		long cholatalkiesdetails_id,
		OrderByComparator<cholatalkiesusers> orderByComparator)
		throws NoSuchcholatalkiesusersException {
		cholatalkiesusers cholatalkiesusers = fetchByCHOLATALKIES_ID_First(cholatalkiesdetails_id,
				orderByComparator);

		if (cholatalkiesusers != null) {
			return cholatalkiesusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cholatalkiesdetails_id=");
		msg.append(cholatalkiesdetails_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcholatalkiesusersException(msg.toString());
	}

	/**
	 * Returns the first cholatalkiesusers in the ordered set where cholatalkiesdetails_id = &#63;.
	 *
	 * @param cholatalkiesdetails_id the cholatalkiesdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cholatalkiesusers, or <code>null</code> if a matching cholatalkiesusers could not be found
	 */
	@Override
	public cholatalkiesusers fetchByCHOLATALKIES_ID_First(
		long cholatalkiesdetails_id,
		OrderByComparator<cholatalkiesusers> orderByComparator) {
		List<cholatalkiesusers> list = findByCHOLATALKIES_ID(cholatalkiesdetails_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cholatalkiesusers in the ordered set where cholatalkiesdetails_id = &#63;.
	 *
	 * @param cholatalkiesdetails_id the cholatalkiesdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cholatalkiesusers
	 * @throws NoSuchcholatalkiesusersException if a matching cholatalkiesusers could not be found
	 */
	@Override
	public cholatalkiesusers findByCHOLATALKIES_ID_Last(
		long cholatalkiesdetails_id,
		OrderByComparator<cholatalkiesusers> orderByComparator)
		throws NoSuchcholatalkiesusersException {
		cholatalkiesusers cholatalkiesusers = fetchByCHOLATALKIES_ID_Last(cholatalkiesdetails_id,
				orderByComparator);

		if (cholatalkiesusers != null) {
			return cholatalkiesusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cholatalkiesdetails_id=");
		msg.append(cholatalkiesdetails_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcholatalkiesusersException(msg.toString());
	}

	/**
	 * Returns the last cholatalkiesusers in the ordered set where cholatalkiesdetails_id = &#63;.
	 *
	 * @param cholatalkiesdetails_id the cholatalkiesdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cholatalkiesusers, or <code>null</code> if a matching cholatalkiesusers could not be found
	 */
	@Override
	public cholatalkiesusers fetchByCHOLATALKIES_ID_Last(
		long cholatalkiesdetails_id,
		OrderByComparator<cholatalkiesusers> orderByComparator) {
		int count = countByCHOLATALKIES_ID(cholatalkiesdetails_id);

		if (count == 0) {
			return null;
		}

		List<cholatalkiesusers> list = findByCHOLATALKIES_ID(cholatalkiesdetails_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cholatalkiesuserses before and after the current cholatalkiesusers in the ordered set where cholatalkiesdetails_id = &#63;.
	 *
	 * @param id the primary key of the current cholatalkiesusers
	 * @param cholatalkiesdetails_id the cholatalkiesdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cholatalkiesusers
	 * @throws NoSuchcholatalkiesusersException if a cholatalkiesusers with the primary key could not be found
	 */
	@Override
	public cholatalkiesusers[] findByCHOLATALKIES_ID_PrevAndNext(long id,
		long cholatalkiesdetails_id,
		OrderByComparator<cholatalkiesusers> orderByComparator)
		throws NoSuchcholatalkiesusersException {
		cholatalkiesusers cholatalkiesusers = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			cholatalkiesusers[] array = new cholatalkiesusersImpl[3];

			array[0] = getByCHOLATALKIES_ID_PrevAndNext(session,
					cholatalkiesusers, cholatalkiesdetails_id,
					orderByComparator, true);

			array[1] = cholatalkiesusers;

			array[2] = getByCHOLATALKIES_ID_PrevAndNext(session,
					cholatalkiesusers, cholatalkiesdetails_id,
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

	protected cholatalkiesusers getByCHOLATALKIES_ID_PrevAndNext(
		Session session, cholatalkiesusers cholatalkiesusers,
		long cholatalkiesdetails_id,
		OrderByComparator<cholatalkiesusers> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CHOLATALKIESUSERS_WHERE);

		query.append(_FINDER_COLUMN_CHOLATALKIES_ID_CHOLATALKIESDETAILS_ID_2);

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
			query.append(cholatalkiesusersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(cholatalkiesdetails_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cholatalkiesusers);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<cholatalkiesusers> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cholatalkiesuserses where cholatalkiesdetails_id = &#63; from the database.
	 *
	 * @param cholatalkiesdetails_id the cholatalkiesdetails_id
	 */
	@Override
	public void removeByCHOLATALKIES_ID(long cholatalkiesdetails_id) {
		for (cholatalkiesusers cholatalkiesusers : findByCHOLATALKIES_ID(
				cholatalkiesdetails_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(cholatalkiesusers);
		}
	}

	/**
	 * Returns the number of cholatalkiesuserses where cholatalkiesdetails_id = &#63;.
	 *
	 * @param cholatalkiesdetails_id the cholatalkiesdetails_id
	 * @return the number of matching cholatalkiesuserses
	 */
	@Override
	public int countByCHOLATALKIES_ID(long cholatalkiesdetails_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CHOLATALKIES_ID;

		Object[] finderArgs = new Object[] { cholatalkiesdetails_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CHOLATALKIESUSERS_WHERE);

			query.append(_FINDER_COLUMN_CHOLATALKIES_ID_CHOLATALKIESDETAILS_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(cholatalkiesdetails_id);

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

	private static final String _FINDER_COLUMN_CHOLATALKIES_ID_CHOLATALKIESDETAILS_ID_2 =
		"cholatalkiesusers.cholatalkiesdetails_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USER_ID = new FinderPath(cholatalkiesusersModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesusersModelImpl.FINDER_CACHE_ENABLED,
			cholatalkiesusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUSER_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID =
		new FinderPath(cholatalkiesusersModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesusersModelImpl.FINDER_CACHE_ENABLED,
			cholatalkiesusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUSER_ID",
			new String[] { Long.class.getName() },
			cholatalkiesusersModelImpl.USER_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USER_ID = new FinderPath(cholatalkiesusersModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUSER_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the cholatalkiesuserses where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @return the matching cholatalkiesuserses
	 */
	@Override
	public List<cholatalkiesusers> findByUSER_ID(long user_id) {
		return findByUSER_ID(user_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cholatalkiesuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of cholatalkiesuserses
	 * @param end the upper bound of the range of cholatalkiesuserses (not inclusive)
	 * @return the range of matching cholatalkiesuserses
	 */
	@Override
	public List<cholatalkiesusers> findByUSER_ID(long user_id, int start,
		int end) {
		return findByUSER_ID(user_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cholatalkiesuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of cholatalkiesuserses
	 * @param end the upper bound of the range of cholatalkiesuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cholatalkiesuserses
	 */
	@Override
	public List<cholatalkiesusers> findByUSER_ID(long user_id, int start,
		int end, OrderByComparator<cholatalkiesusers> orderByComparator) {
		return findByUSER_ID(user_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cholatalkiesuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of cholatalkiesuserses
	 * @param end the upper bound of the range of cholatalkiesuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching cholatalkiesuserses
	 */
	@Override
	public List<cholatalkiesusers> findByUSER_ID(long user_id, int start,
		int end, OrderByComparator<cholatalkiesusers> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID;
			finderArgs = new Object[] { user_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USER_ID;
			finderArgs = new Object[] { user_id, start, end, orderByComparator };
		}

		List<cholatalkiesusers> list = null;

		if (retrieveFromCache) {
			list = (List<cholatalkiesusers>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (cholatalkiesusers cholatalkiesusers : list) {
					if ((user_id != cholatalkiesusers.getUser_id())) {
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

			query.append(_SQL_SELECT_CHOLATALKIESUSERS_WHERE);

			query.append(_FINDER_COLUMN_USER_ID_USER_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(cholatalkiesusersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(user_id);

				if (!pagination) {
					list = (List<cholatalkiesusers>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<cholatalkiesusers>)QueryUtil.list(q,
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
	 * Returns the first cholatalkiesusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cholatalkiesusers
	 * @throws NoSuchcholatalkiesusersException if a matching cholatalkiesusers could not be found
	 */
	@Override
	public cholatalkiesusers findByUSER_ID_First(long user_id,
		OrderByComparator<cholatalkiesusers> orderByComparator)
		throws NoSuchcholatalkiesusersException {
		cholatalkiesusers cholatalkiesusers = fetchByUSER_ID_First(user_id,
				orderByComparator);

		if (cholatalkiesusers != null) {
			return cholatalkiesusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("user_id=");
		msg.append(user_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcholatalkiesusersException(msg.toString());
	}

	/**
	 * Returns the first cholatalkiesusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cholatalkiesusers, or <code>null</code> if a matching cholatalkiesusers could not be found
	 */
	@Override
	public cholatalkiesusers fetchByUSER_ID_First(long user_id,
		OrderByComparator<cholatalkiesusers> orderByComparator) {
		List<cholatalkiesusers> list = findByUSER_ID(user_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cholatalkiesusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cholatalkiesusers
	 * @throws NoSuchcholatalkiesusersException if a matching cholatalkiesusers could not be found
	 */
	@Override
	public cholatalkiesusers findByUSER_ID_Last(long user_id,
		OrderByComparator<cholatalkiesusers> orderByComparator)
		throws NoSuchcholatalkiesusersException {
		cholatalkiesusers cholatalkiesusers = fetchByUSER_ID_Last(user_id,
				orderByComparator);

		if (cholatalkiesusers != null) {
			return cholatalkiesusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("user_id=");
		msg.append(user_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcholatalkiesusersException(msg.toString());
	}

	/**
	 * Returns the last cholatalkiesusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cholatalkiesusers, or <code>null</code> if a matching cholatalkiesusers could not be found
	 */
	@Override
	public cholatalkiesusers fetchByUSER_ID_Last(long user_id,
		OrderByComparator<cholatalkiesusers> orderByComparator) {
		int count = countByUSER_ID(user_id);

		if (count == 0) {
			return null;
		}

		List<cholatalkiesusers> list = findByUSER_ID(user_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cholatalkiesuserses before and after the current cholatalkiesusers in the ordered set where user_id = &#63;.
	 *
	 * @param id the primary key of the current cholatalkiesusers
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cholatalkiesusers
	 * @throws NoSuchcholatalkiesusersException if a cholatalkiesusers with the primary key could not be found
	 */
	@Override
	public cholatalkiesusers[] findByUSER_ID_PrevAndNext(long id, long user_id,
		OrderByComparator<cholatalkiesusers> orderByComparator)
		throws NoSuchcholatalkiesusersException {
		cholatalkiesusers cholatalkiesusers = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			cholatalkiesusers[] array = new cholatalkiesusersImpl[3];

			array[0] = getByUSER_ID_PrevAndNext(session, cholatalkiesusers,
					user_id, orderByComparator, true);

			array[1] = cholatalkiesusers;

			array[2] = getByUSER_ID_PrevAndNext(session, cholatalkiesusers,
					user_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected cholatalkiesusers getByUSER_ID_PrevAndNext(Session session,
		cholatalkiesusers cholatalkiesusers, long user_id,
		OrderByComparator<cholatalkiesusers> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CHOLATALKIESUSERS_WHERE);

		query.append(_FINDER_COLUMN_USER_ID_USER_ID_2);

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
			query.append(cholatalkiesusersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(user_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cholatalkiesusers);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<cholatalkiesusers> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cholatalkiesuserses where user_id = &#63; from the database.
	 *
	 * @param user_id the user_id
	 */
	@Override
	public void removeByUSER_ID(long user_id) {
		for (cholatalkiesusers cholatalkiesusers : findByUSER_ID(user_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(cholatalkiesusers);
		}
	}

	/**
	 * Returns the number of cholatalkiesuserses where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @return the number of matching cholatalkiesuserses
	 */
	@Override
	public int countByUSER_ID(long user_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USER_ID;

		Object[] finderArgs = new Object[] { user_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CHOLATALKIESUSERS_WHERE);

			query.append(_FINDER_COLUMN_USER_ID_USER_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(user_id);

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

	private static final String _FINDER_COLUMN_USER_ID_USER_ID_2 = "cholatalkiesusers.user_id = ?";

	public cholatalkiesusersPersistenceImpl() {
		setModelClass(cholatalkiesusers.class);
	}

	/**
	 * Caches the cholatalkiesusers in the entity cache if it is enabled.
	 *
	 * @param cholatalkiesusers the cholatalkiesusers
	 */
	@Override
	public void cacheResult(cholatalkiesusers cholatalkiesusers) {
		entityCache.putResult(cholatalkiesusersModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesusersImpl.class, cholatalkiesusers.getPrimaryKey(),
			cholatalkiesusers);

		cholatalkiesusers.resetOriginalValues();
	}

	/**
	 * Caches the cholatalkiesuserses in the entity cache if it is enabled.
	 *
	 * @param cholatalkiesuserses the cholatalkiesuserses
	 */
	@Override
	public void cacheResult(List<cholatalkiesusers> cholatalkiesuserses) {
		for (cholatalkiesusers cholatalkiesusers : cholatalkiesuserses) {
			if (entityCache.getResult(
						cholatalkiesusersModelImpl.ENTITY_CACHE_ENABLED,
						cholatalkiesusersImpl.class,
						cholatalkiesusers.getPrimaryKey()) == null) {
				cacheResult(cholatalkiesusers);
			}
			else {
				cholatalkiesusers.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cholatalkiesuserses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(cholatalkiesusersImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cholatalkiesusers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(cholatalkiesusers cholatalkiesusers) {
		entityCache.removeResult(cholatalkiesusersModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesusersImpl.class, cholatalkiesusers.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<cholatalkiesusers> cholatalkiesuserses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (cholatalkiesusers cholatalkiesusers : cholatalkiesuserses) {
			entityCache.removeResult(cholatalkiesusersModelImpl.ENTITY_CACHE_ENABLED,
				cholatalkiesusersImpl.class, cholatalkiesusers.getPrimaryKey());
		}
	}

	/**
	 * Creates a new cholatalkiesusers with the primary key. Does not add the cholatalkiesusers to the database.
	 *
	 * @param id the primary key for the new cholatalkiesusers
	 * @return the new cholatalkiesusers
	 */
	@Override
	public cholatalkiesusers create(long id) {
		cholatalkiesusers cholatalkiesusers = new cholatalkiesusersImpl();

		cholatalkiesusers.setNew(true);
		cholatalkiesusers.setPrimaryKey(id);

		return cholatalkiesusers;
	}

	/**
	 * Removes the cholatalkiesusers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the cholatalkiesusers
	 * @return the cholatalkiesusers that was removed
	 * @throws NoSuchcholatalkiesusersException if a cholatalkiesusers with the primary key could not be found
	 */
	@Override
	public cholatalkiesusers remove(long id)
		throws NoSuchcholatalkiesusersException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the cholatalkiesusers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cholatalkiesusers
	 * @return the cholatalkiesusers that was removed
	 * @throws NoSuchcholatalkiesusersException if a cholatalkiesusers with the primary key could not be found
	 */
	@Override
	public cholatalkiesusers remove(Serializable primaryKey)
		throws NoSuchcholatalkiesusersException {
		Session session = null;

		try {
			session = openSession();

			cholatalkiesusers cholatalkiesusers = (cholatalkiesusers)session.get(cholatalkiesusersImpl.class,
					primaryKey);

			if (cholatalkiesusers == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcholatalkiesusersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cholatalkiesusers);
		}
		catch (NoSuchcholatalkiesusersException nsee) {
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
	protected cholatalkiesusers removeImpl(cholatalkiesusers cholatalkiesusers) {
		cholatalkiesusers = toUnwrappedModel(cholatalkiesusers);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cholatalkiesusers)) {
				cholatalkiesusers = (cholatalkiesusers)session.get(cholatalkiesusersImpl.class,
						cholatalkiesusers.getPrimaryKeyObj());
			}

			if (cholatalkiesusers != null) {
				session.delete(cholatalkiesusers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cholatalkiesusers != null) {
			clearCache(cholatalkiesusers);
		}

		return cholatalkiesusers;
	}

	@Override
	public cholatalkiesusers updateImpl(cholatalkiesusers cholatalkiesusers) {
		cholatalkiesusers = toUnwrappedModel(cholatalkiesusers);

		boolean isNew = cholatalkiesusers.isNew();

		cholatalkiesusersModelImpl cholatalkiesusersModelImpl = (cholatalkiesusersModelImpl)cholatalkiesusers;

		Session session = null;

		try {
			session = openSession();

			if (cholatalkiesusers.isNew()) {
				session.save(cholatalkiesusers);

				cholatalkiesusers.setNew(false);
			}
			else {
				cholatalkiesusers = (cholatalkiesusers)session.merge(cholatalkiesusers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !cholatalkiesusersModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((cholatalkiesusersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHOLATALKIES_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cholatalkiesusersModelImpl.getOriginalCholatalkiesdetails_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CHOLATALKIES_ID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHOLATALKIES_ID,
					args);

				args = new Object[] {
						cholatalkiesusersModelImpl.getCholatalkiesdetails_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CHOLATALKIES_ID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CHOLATALKIES_ID,
					args);
			}

			if ((cholatalkiesusersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cholatalkiesusersModelImpl.getOriginalUser_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID,
					args);

				args = new Object[] { cholatalkiesusersModelImpl.getUser_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID,
					args);
			}
		}

		entityCache.putResult(cholatalkiesusersModelImpl.ENTITY_CACHE_ENABLED,
			cholatalkiesusersImpl.class, cholatalkiesusers.getPrimaryKey(),
			cholatalkiesusers, false);

		cholatalkiesusers.resetOriginalValues();

		return cholatalkiesusers;
	}

	protected cholatalkiesusers toUnwrappedModel(
		cholatalkiesusers cholatalkiesusers) {
		if (cholatalkiesusers instanceof cholatalkiesusersImpl) {
			return cholatalkiesusers;
		}

		cholatalkiesusersImpl cholatalkiesusersImpl = new cholatalkiesusersImpl();

		cholatalkiesusersImpl.setNew(cholatalkiesusers.isNew());
		cholatalkiesusersImpl.setPrimaryKey(cholatalkiesusers.getPrimaryKey());

		cholatalkiesusersImpl.setId(cholatalkiesusers.getId());
		cholatalkiesusersImpl.setUser_id(cholatalkiesusers.getUser_id());
		cholatalkiesusersImpl.setCholatalkiesdetails_id(cholatalkiesusers.getCholatalkiesdetails_id());

		return cholatalkiesusersImpl;
	}

	/**
	 * Returns the cholatalkiesusers with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cholatalkiesusers
	 * @return the cholatalkiesusers
	 * @throws NoSuchcholatalkiesusersException if a cholatalkiesusers with the primary key could not be found
	 */
	@Override
	public cholatalkiesusers findByPrimaryKey(Serializable primaryKey)
		throws NoSuchcholatalkiesusersException {
		cholatalkiesusers cholatalkiesusers = fetchByPrimaryKey(primaryKey);

		if (cholatalkiesusers == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcholatalkiesusersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cholatalkiesusers;
	}

	/**
	 * Returns the cholatalkiesusers with the primary key or throws a {@link NoSuchcholatalkiesusersException} if it could not be found.
	 *
	 * @param id the primary key of the cholatalkiesusers
	 * @return the cholatalkiesusers
	 * @throws NoSuchcholatalkiesusersException if a cholatalkiesusers with the primary key could not be found
	 */
	@Override
	public cholatalkiesusers findByPrimaryKey(long id)
		throws NoSuchcholatalkiesusersException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the cholatalkiesusers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cholatalkiesusers
	 * @return the cholatalkiesusers, or <code>null</code> if a cholatalkiesusers with the primary key could not be found
	 */
	@Override
	public cholatalkiesusers fetchByPrimaryKey(Serializable primaryKey) {
		cholatalkiesusers cholatalkiesusers = (cholatalkiesusers)entityCache.getResult(cholatalkiesusersModelImpl.ENTITY_CACHE_ENABLED,
				cholatalkiesusersImpl.class, primaryKey);

		if (cholatalkiesusers == _nullcholatalkiesusers) {
			return null;
		}

		if (cholatalkiesusers == null) {
			Session session = null;

			try {
				session = openSession();

				cholatalkiesusers = (cholatalkiesusers)session.get(cholatalkiesusersImpl.class,
						primaryKey);

				if (cholatalkiesusers != null) {
					cacheResult(cholatalkiesusers);
				}
				else {
					entityCache.putResult(cholatalkiesusersModelImpl.ENTITY_CACHE_ENABLED,
						cholatalkiesusersImpl.class, primaryKey,
						_nullcholatalkiesusers);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(cholatalkiesusersModelImpl.ENTITY_CACHE_ENABLED,
					cholatalkiesusersImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cholatalkiesusers;
	}

	/**
	 * Returns the cholatalkiesusers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the cholatalkiesusers
	 * @return the cholatalkiesusers, or <code>null</code> if a cholatalkiesusers with the primary key could not be found
	 */
	@Override
	public cholatalkiesusers fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, cholatalkiesusers> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, cholatalkiesusers> map = new HashMap<Serializable, cholatalkiesusers>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			cholatalkiesusers cholatalkiesusers = fetchByPrimaryKey(primaryKey);

			if (cholatalkiesusers != null) {
				map.put(primaryKey, cholatalkiesusers);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			cholatalkiesusers cholatalkiesusers = (cholatalkiesusers)entityCache.getResult(cholatalkiesusersModelImpl.ENTITY_CACHE_ENABLED,
					cholatalkiesusersImpl.class, primaryKey);

			if (cholatalkiesusers == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, cholatalkiesusers);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CHOLATALKIESUSERS_WHERE_PKS_IN);

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

			for (cholatalkiesusers cholatalkiesusers : (List<cholatalkiesusers>)q.list()) {
				map.put(cholatalkiesusers.getPrimaryKeyObj(), cholatalkiesusers);

				cacheResult(cholatalkiesusers);

				uncachedPrimaryKeys.remove(cholatalkiesusers.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(cholatalkiesusersModelImpl.ENTITY_CACHE_ENABLED,
					cholatalkiesusersImpl.class, primaryKey,
					_nullcholatalkiesusers);
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
	 * Returns all the cholatalkiesuserses.
	 *
	 * @return the cholatalkiesuserses
	 */
	@Override
	public List<cholatalkiesusers> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cholatalkiesuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cholatalkiesuserses
	 * @param end the upper bound of the range of cholatalkiesuserses (not inclusive)
	 * @return the range of cholatalkiesuserses
	 */
	@Override
	public List<cholatalkiesusers> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cholatalkiesuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cholatalkiesuserses
	 * @param end the upper bound of the range of cholatalkiesuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cholatalkiesuserses
	 */
	@Override
	public List<cholatalkiesusers> findAll(int start, int end,
		OrderByComparator<cholatalkiesusers> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cholatalkiesuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cholatalkiesuserses
	 * @param end the upper bound of the range of cholatalkiesuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of cholatalkiesuserses
	 */
	@Override
	public List<cholatalkiesusers> findAll(int start, int end,
		OrderByComparator<cholatalkiesusers> orderByComparator,
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

		List<cholatalkiesusers> list = null;

		if (retrieveFromCache) {
			list = (List<cholatalkiesusers>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CHOLATALKIESUSERS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CHOLATALKIESUSERS;

				if (pagination) {
					sql = sql.concat(cholatalkiesusersModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<cholatalkiesusers>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<cholatalkiesusers>)QueryUtil.list(q,
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
	 * Removes all the cholatalkiesuserses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (cholatalkiesusers cholatalkiesusers : findAll()) {
			remove(cholatalkiesusers);
		}
	}

	/**
	 * Returns the number of cholatalkiesuserses.
	 *
	 * @return the number of cholatalkiesuserses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CHOLATALKIESUSERS);

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
		return cholatalkiesusersModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cholatalkiesusers persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(cholatalkiesusersImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_CHOLATALKIESUSERS = "SELECT cholatalkiesusers FROM cholatalkiesusers cholatalkiesusers";
	private static final String _SQL_SELECT_CHOLATALKIESUSERS_WHERE_PKS_IN = "SELECT cholatalkiesusers FROM cholatalkiesusers cholatalkiesusers WHERE id_ IN (";
	private static final String _SQL_SELECT_CHOLATALKIESUSERS_WHERE = "SELECT cholatalkiesusers FROM cholatalkiesusers cholatalkiesusers WHERE ";
	private static final String _SQL_COUNT_CHOLATALKIESUSERS = "SELECT COUNT(cholatalkiesusers) FROM cholatalkiesusers cholatalkiesusers";
	private static final String _SQL_COUNT_CHOLATALKIESUSERS_WHERE = "SELECT COUNT(cholatalkiesusers) FROM cholatalkiesusers cholatalkiesusers WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cholatalkiesusers.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No cholatalkiesusers exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No cholatalkiesusers exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(cholatalkiesusersPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final cholatalkiesusers _nullcholatalkiesusers = new cholatalkiesusersImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<cholatalkiesusers> toCacheModel() {
				return _nullcholatalkiesusersCacheModel;
			}
		};

	private static final CacheModel<cholatalkiesusers> _nullcholatalkiesusersCacheModel =
		new CacheModel<cholatalkiesusers>() {
			@Override
			public cholatalkiesusers toEntityModel() {
				return _nullcholatalkiesusers;
			}
		};
}