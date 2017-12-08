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

package com.chola.calendar.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.calendar.exception.NoSuchcorporatepersonalisedparameterscontentstoreException;
import com.chola.calendar.model.corporatepersonalisedparameterscontentstore;
import com.chola.calendar.model.impl.corporatepersonalisedparameterscontentstoreImpl;
import com.chola.calendar.model.impl.corporatepersonalisedparameterscontentstoreModelImpl;
import com.chola.calendar.service.persistence.corporatepersonalisedparameterscontentstorePersistence;

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
 * The persistence implementation for the corporatepersonalisedparameterscontentstore service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see corporatepersonalisedparameterscontentstorePersistence
 * @see com.chola.calendar.service.persistence.corporatepersonalisedparameterscontentstoreUtil
 * @generated
 */
@ProviderType
public class corporatepersonalisedparameterscontentstorePersistenceImpl
	extends BasePersistenceImpl<corporatepersonalisedparameterscontentstore>
	implements corporatepersonalisedparameterscontentstorePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link corporatepersonalisedparameterscontentstoreUtil} to access the corporatepersonalisedparameterscontentstore persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = corporatepersonalisedparameterscontentstoreImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(corporatepersonalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
			corporatepersonalisedparameterscontentstoreModelImpl.FINDER_CACHE_ENABLED,
			corporatepersonalisedparameterscontentstoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(corporatepersonalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
			corporatepersonalisedparameterscontentstoreModelImpl.FINDER_CACHE_ENABLED,
			corporatepersonalisedparameterscontentstoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(corporatepersonalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
			corporatepersonalisedparameterscontentstoreModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENTID =
		new FinderPath(corporatepersonalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
			corporatepersonalisedparameterscontentstoreModelImpl.FINDER_CACHE_ENABLED,
			corporatepersonalisedparameterscontentstoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCONTENTID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID =
		new FinderPath(corporatepersonalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
			corporatepersonalisedparameterscontentstoreModelImpl.FINDER_CACHE_ENABLED,
			corporatepersonalisedparameterscontentstoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCONTENTID",
			new String[] { Long.class.getName() },
			corporatepersonalisedparameterscontentstoreModelImpl.CONTENT_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTENTID = new FinderPath(corporatepersonalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
			corporatepersonalisedparameterscontentstoreModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCONTENTID", new String[] { Long.class.getName() });

	/**
	 * Returns all the corporatepersonalisedparameterscontentstores where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the matching corporatepersonalisedparameterscontentstores
	 */
	@Override
	public List<corporatepersonalisedparameterscontentstore> findByCONTENTID(
		long content_id) {
		return findByCONTENTID(content_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the corporatepersonalisedparameterscontentstores where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of corporatepersonalisedparameterscontentstores
	 * @param end the upper bound of the range of corporatepersonalisedparameterscontentstores (not inclusive)
	 * @return the range of matching corporatepersonalisedparameterscontentstores
	 */
	@Override
	public List<corporatepersonalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end) {
		return findByCONTENTID(content_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the corporatepersonalisedparameterscontentstores where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of corporatepersonalisedparameterscontentstores
	 * @param end the upper bound of the range of corporatepersonalisedparameterscontentstores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching corporatepersonalisedparameterscontentstores
	 */
	@Override
	public List<corporatepersonalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end,
		OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator) {
		return findByCONTENTID(content_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the corporatepersonalisedparameterscontentstores where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of corporatepersonalisedparameterscontentstores
	 * @param end the upper bound of the range of corporatepersonalisedparameterscontentstores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching corporatepersonalisedparameterscontentstores
	 */
	@Override
	public List<corporatepersonalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end,
		OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID;
			finderArgs = new Object[] { content_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENTID;
			finderArgs = new Object[] { content_id, start, end, orderByComparator };
		}

		List<corporatepersonalisedparameterscontentstore> list = null;

		if (retrieveFromCache) {
			list = (List<corporatepersonalisedparameterscontentstore>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore : list) {
					if ((content_id != corporatepersonalisedparameterscontentstore.getContent_id())) {
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

			query.append(_SQL_SELECT_CORPORATEPERSONALISEDPARAMETERSCONTENTSTORE_WHERE);

			query.append(_FINDER_COLUMN_CONTENTID_CONTENT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(corporatepersonalisedparameterscontentstoreModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(content_id);

				if (!pagination) {
					list = (List<corporatepersonalisedparameterscontentstore>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<corporatepersonalisedparameterscontentstore>)QueryUtil.list(q,
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
	 * Returns the first corporatepersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching corporatepersonalisedparameterscontentstore
	 * @throws NoSuchcorporatepersonalisedparameterscontentstoreException if a matching corporatepersonalisedparameterscontentstore could not be found
	 */
	@Override
	public corporatepersonalisedparameterscontentstore findByCONTENTID_First(
		long content_id,
		OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator)
		throws NoSuchcorporatepersonalisedparameterscontentstoreException {
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore =
			fetchByCONTENTID_First(content_id, orderByComparator);

		if (corporatepersonalisedparameterscontentstore != null) {
			return corporatepersonalisedparameterscontentstore;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcorporatepersonalisedparameterscontentstoreException(msg.toString());
	}

	/**
	 * Returns the first corporatepersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching corporatepersonalisedparameterscontentstore, or <code>null</code> if a matching corporatepersonalisedparameterscontentstore could not be found
	 */
	@Override
	public corporatepersonalisedparameterscontentstore fetchByCONTENTID_First(
		long content_id,
		OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator) {
		List<corporatepersonalisedparameterscontentstore> list = findByCONTENTID(content_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last corporatepersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching corporatepersonalisedparameterscontentstore
	 * @throws NoSuchcorporatepersonalisedparameterscontentstoreException if a matching corporatepersonalisedparameterscontentstore could not be found
	 */
	@Override
	public corporatepersonalisedparameterscontentstore findByCONTENTID_Last(
		long content_id,
		OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator)
		throws NoSuchcorporatepersonalisedparameterscontentstoreException {
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore =
			fetchByCONTENTID_Last(content_id, orderByComparator);

		if (corporatepersonalisedparameterscontentstore != null) {
			return corporatepersonalisedparameterscontentstore;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcorporatepersonalisedparameterscontentstoreException(msg.toString());
	}

	/**
	 * Returns the last corporatepersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching corporatepersonalisedparameterscontentstore, or <code>null</code> if a matching corporatepersonalisedparameterscontentstore could not be found
	 */
	@Override
	public corporatepersonalisedparameterscontentstore fetchByCONTENTID_Last(
		long content_id,
		OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator) {
		int count = countByCONTENTID(content_id);

		if (count == 0) {
			return null;
		}

		List<corporatepersonalisedparameterscontentstore> list = findByCONTENTID(content_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the corporatepersonalisedparameterscontentstores before and after the current corporatepersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	 *
	 * @param id the primary key of the current corporatepersonalisedparameterscontentstore
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next corporatepersonalisedparameterscontentstore
	 * @throws NoSuchcorporatepersonalisedparameterscontentstoreException if a corporatepersonalisedparameterscontentstore with the primary key could not be found
	 */
	@Override
	public corporatepersonalisedparameterscontentstore[] findByCONTENTID_PrevAndNext(
		long id, long content_id,
		OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator)
		throws NoSuchcorporatepersonalisedparameterscontentstoreException {
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore =
			findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			corporatepersonalisedparameterscontentstore[] array = new corporatepersonalisedparameterscontentstoreImpl[3];

			array[0] = getByCONTENTID_PrevAndNext(session,
					corporatepersonalisedparameterscontentstore, content_id,
					orderByComparator, true);

			array[1] = corporatepersonalisedparameterscontentstore;

			array[2] = getByCONTENTID_PrevAndNext(session,
					corporatepersonalisedparameterscontentstore, content_id,
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

	protected corporatepersonalisedparameterscontentstore getByCONTENTID_PrevAndNext(
		Session session,
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore,
		long content_id,
		OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CORPORATEPERSONALISEDPARAMETERSCONTENTSTORE_WHERE);

		query.append(_FINDER_COLUMN_CONTENTID_CONTENT_ID_2);

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
			query.append(corporatepersonalisedparameterscontentstoreModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(content_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(corporatepersonalisedparameterscontentstore);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<corporatepersonalisedparameterscontentstore> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the corporatepersonalisedparameterscontentstores where content_id = &#63; from the database.
	 *
	 * @param content_id the content_id
	 */
	@Override
	public void removeByCONTENTID(long content_id) {
		for (corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore : findByCONTENTID(
				content_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(corporatepersonalisedparameterscontentstore);
		}
	}

	/**
	 * Returns the number of corporatepersonalisedparameterscontentstores where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the number of matching corporatepersonalisedparameterscontentstores
	 */
	@Override
	public int countByCONTENTID(long content_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTENTID;

		Object[] finderArgs = new Object[] { content_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CORPORATEPERSONALISEDPARAMETERSCONTENTSTORE_WHERE);

			query.append(_FINDER_COLUMN_CONTENTID_CONTENT_ID_2);

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

	private static final String _FINDER_COLUMN_CONTENTID_CONTENT_ID_2 = "corporatepersonalisedparameterscontentstore.content_id = ?";

	public corporatepersonalisedparameterscontentstorePersistenceImpl() {
		setModelClass(corporatepersonalisedparameterscontentstore.class);
	}

	/**
	 * Caches the corporatepersonalisedparameterscontentstore in the entity cache if it is enabled.
	 *
	 * @param corporatepersonalisedparameterscontentstore the corporatepersonalisedparameterscontentstore
	 */
	@Override
	public void cacheResult(
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore) {
		entityCache.putResult(corporatepersonalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
			corporatepersonalisedparameterscontentstoreImpl.class,
			corporatepersonalisedparameterscontentstore.getPrimaryKey(),
			corporatepersonalisedparameterscontentstore);

		corporatepersonalisedparameterscontentstore.resetOriginalValues();
	}

	/**
	 * Caches the corporatepersonalisedparameterscontentstores in the entity cache if it is enabled.
	 *
	 * @param corporatepersonalisedparameterscontentstores the corporatepersonalisedparameterscontentstores
	 */
	@Override
	public void cacheResult(
		List<corporatepersonalisedparameterscontentstore> corporatepersonalisedparameterscontentstores) {
		for (corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore : corporatepersonalisedparameterscontentstores) {
			if (entityCache.getResult(
						corporatepersonalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
						corporatepersonalisedparameterscontentstoreImpl.class,
						corporatepersonalisedparameterscontentstore.getPrimaryKey()) == null) {
				cacheResult(corporatepersonalisedparameterscontentstore);
			}
			else {
				corporatepersonalisedparameterscontentstore.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all corporatepersonalisedparameterscontentstores.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(corporatepersonalisedparameterscontentstoreImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the corporatepersonalisedparameterscontentstore.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore) {
		entityCache.removeResult(corporatepersonalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
			corporatepersonalisedparameterscontentstoreImpl.class,
			corporatepersonalisedparameterscontentstore.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<corporatepersonalisedparameterscontentstore> corporatepersonalisedparameterscontentstores) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore : corporatepersonalisedparameterscontentstores) {
			entityCache.removeResult(corporatepersonalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
				corporatepersonalisedparameterscontentstoreImpl.class,
				corporatepersonalisedparameterscontentstore.getPrimaryKey());
		}
	}

	/**
	 * Creates a new corporatepersonalisedparameterscontentstore with the primary key. Does not add the corporatepersonalisedparameterscontentstore to the database.
	 *
	 * @param id the primary key for the new corporatepersonalisedparameterscontentstore
	 * @return the new corporatepersonalisedparameterscontentstore
	 */
	@Override
	public corporatepersonalisedparameterscontentstore create(long id) {
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore =
			new corporatepersonalisedparameterscontentstoreImpl();

		corporatepersonalisedparameterscontentstore.setNew(true);
		corporatepersonalisedparameterscontentstore.setPrimaryKey(id);

		return corporatepersonalisedparameterscontentstore;
	}

	/**
	 * Removes the corporatepersonalisedparameterscontentstore with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the corporatepersonalisedparameterscontentstore
	 * @return the corporatepersonalisedparameterscontentstore that was removed
	 * @throws NoSuchcorporatepersonalisedparameterscontentstoreException if a corporatepersonalisedparameterscontentstore with the primary key could not be found
	 */
	@Override
	public corporatepersonalisedparameterscontentstore remove(long id)
		throws NoSuchcorporatepersonalisedparameterscontentstoreException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the corporatepersonalisedparameterscontentstore with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the corporatepersonalisedparameterscontentstore
	 * @return the corporatepersonalisedparameterscontentstore that was removed
	 * @throws NoSuchcorporatepersonalisedparameterscontentstoreException if a corporatepersonalisedparameterscontentstore with the primary key could not be found
	 */
	@Override
	public corporatepersonalisedparameterscontentstore remove(
		Serializable primaryKey)
		throws NoSuchcorporatepersonalisedparameterscontentstoreException {
		Session session = null;

		try {
			session = openSession();

			corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore =
				(corporatepersonalisedparameterscontentstore)session.get(corporatepersonalisedparameterscontentstoreImpl.class,
					primaryKey);

			if (corporatepersonalisedparameterscontentstore == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcorporatepersonalisedparameterscontentstoreException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(corporatepersonalisedparameterscontentstore);
		}
		catch (NoSuchcorporatepersonalisedparameterscontentstoreException nsee) {
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
	protected corporatepersonalisedparameterscontentstore removeImpl(
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore) {
		corporatepersonalisedparameterscontentstore = toUnwrappedModel(corporatepersonalisedparameterscontentstore);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(corporatepersonalisedparameterscontentstore)) {
				corporatepersonalisedparameterscontentstore = (corporatepersonalisedparameterscontentstore)session.get(corporatepersonalisedparameterscontentstoreImpl.class,
						corporatepersonalisedparameterscontentstore.getPrimaryKeyObj());
			}

			if (corporatepersonalisedparameterscontentstore != null) {
				session.delete(corporatepersonalisedparameterscontentstore);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (corporatepersonalisedparameterscontentstore != null) {
			clearCache(corporatepersonalisedparameterscontentstore);
		}

		return corporatepersonalisedparameterscontentstore;
	}

	@Override
	public corporatepersonalisedparameterscontentstore updateImpl(
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore) {
		corporatepersonalisedparameterscontentstore = toUnwrappedModel(corporatepersonalisedparameterscontentstore);

		boolean isNew = corporatepersonalisedparameterscontentstore.isNew();

		corporatepersonalisedparameterscontentstoreModelImpl corporatepersonalisedparameterscontentstoreModelImpl =
			(corporatepersonalisedparameterscontentstoreModelImpl)corporatepersonalisedparameterscontentstore;

		Session session = null;

		try {
			session = openSession();

			if (corporatepersonalisedparameterscontentstore.isNew()) {
				session.save(corporatepersonalisedparameterscontentstore);

				corporatepersonalisedparameterscontentstore.setNew(false);
			}
			else {
				corporatepersonalisedparameterscontentstore = (corporatepersonalisedparameterscontentstore)session.merge(corporatepersonalisedparameterscontentstore);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew ||
				!corporatepersonalisedparameterscontentstoreModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((corporatepersonalisedparameterscontentstoreModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						corporatepersonalisedparameterscontentstoreModelImpl.getOriginalContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID,
					args);

				args = new Object[] {
						corporatepersonalisedparameterscontentstoreModelImpl.getContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID,
					args);
			}
		}

		entityCache.putResult(corporatepersonalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
			corporatepersonalisedparameterscontentstoreImpl.class,
			corporatepersonalisedparameterscontentstore.getPrimaryKey(),
			corporatepersonalisedparameterscontentstore, false);

		corporatepersonalisedparameterscontentstore.resetOriginalValues();

		return corporatepersonalisedparameterscontentstore;
	}

	protected corporatepersonalisedparameterscontentstore toUnwrappedModel(
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore) {
		if (corporatepersonalisedparameterscontentstore instanceof corporatepersonalisedparameterscontentstoreImpl) {
			return corporatepersonalisedparameterscontentstore;
		}

		corporatepersonalisedparameterscontentstoreImpl corporatepersonalisedparameterscontentstoreImpl =
			new corporatepersonalisedparameterscontentstoreImpl();

		corporatepersonalisedparameterscontentstoreImpl.setNew(corporatepersonalisedparameterscontentstore.isNew());
		corporatepersonalisedparameterscontentstoreImpl.setPrimaryKey(corporatepersonalisedparameterscontentstore.getPrimaryKey());

		corporatepersonalisedparameterscontentstoreImpl.setId(corporatepersonalisedparameterscontentstore.getId());
		corporatepersonalisedparameterscontentstoreImpl.setContent_id(corporatepersonalisedparameterscontentstore.getContent_id());
		corporatepersonalisedparameterscontentstoreImpl.setBusiness(corporatepersonalisedparameterscontentstore.getBusiness());
		corporatepersonalisedparameterscontentstoreImpl.setUnit(corporatepersonalisedparameterscontentstore.getUnit());
		corporatepersonalisedparameterscontentstoreImpl.setFunction(corporatepersonalisedparameterscontentstore.getFunction());
		corporatepersonalisedparameterscontentstoreImpl.setDepartment(corporatepersonalisedparameterscontentstore.getDepartment());
		corporatepersonalisedparameterscontentstoreImpl.setDesignation(corporatepersonalisedparameterscontentstore.getDesignation());
		corporatepersonalisedparameterscontentstoreImpl.setProduct(corporatepersonalisedparameterscontentstore.getProduct());
		corporatepersonalisedparameterscontentstoreImpl.setZone(corporatepersonalisedparameterscontentstore.getZone());
		corporatepersonalisedparameterscontentstoreImpl.setBranch(corporatepersonalisedparameterscontentstore.getBranch());
		corporatepersonalisedparameterscontentstoreImpl.setGrade(corporatepersonalisedparameterscontentstore.getGrade());
		corporatepersonalisedparameterscontentstoreImpl.setRegion(corporatepersonalisedparameterscontentstore.getRegion());
		corporatepersonalisedparameterscontentstoreImpl.setLocation(corporatepersonalisedparameterscontentstore.getLocation());
		corporatepersonalisedparameterscontentstoreImpl.setUser_id(corporatepersonalisedparameterscontentstore.getUser_id());
		corporatepersonalisedparameterscontentstoreImpl.setGender(corporatepersonalisedparameterscontentstore.getGender());
		corporatepersonalisedparameterscontentstoreImpl.setAge_type(corporatepersonalisedparameterscontentstore.getAge_type());
		corporatepersonalisedparameterscontentstoreImpl.setAge_value(corporatepersonalisedparameterscontentstore.getAge_value());
		corporatepersonalisedparameterscontentstoreImpl.setNotification_type(corporatepersonalisedparameterscontentstore.getNotification_type());

		return corporatepersonalisedparameterscontentstoreImpl;
	}

	/**
	 * Returns the corporatepersonalisedparameterscontentstore with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the corporatepersonalisedparameterscontentstore
	 * @return the corporatepersonalisedparameterscontentstore
	 * @throws NoSuchcorporatepersonalisedparameterscontentstoreException if a corporatepersonalisedparameterscontentstore with the primary key could not be found
	 */
	@Override
	public corporatepersonalisedparameterscontentstore findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchcorporatepersonalisedparameterscontentstoreException {
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore =
			fetchByPrimaryKey(primaryKey);

		if (corporatepersonalisedparameterscontentstore == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcorporatepersonalisedparameterscontentstoreException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return corporatepersonalisedparameterscontentstore;
	}

	/**
	 * Returns the corporatepersonalisedparameterscontentstore with the primary key or throws a {@link NoSuchcorporatepersonalisedparameterscontentstoreException} if it could not be found.
	 *
	 * @param id the primary key of the corporatepersonalisedparameterscontentstore
	 * @return the corporatepersonalisedparameterscontentstore
	 * @throws NoSuchcorporatepersonalisedparameterscontentstoreException if a corporatepersonalisedparameterscontentstore with the primary key could not be found
	 */
	@Override
	public corporatepersonalisedparameterscontentstore findByPrimaryKey(long id)
		throws NoSuchcorporatepersonalisedparameterscontentstoreException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the corporatepersonalisedparameterscontentstore with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the corporatepersonalisedparameterscontentstore
	 * @return the corporatepersonalisedparameterscontentstore, or <code>null</code> if a corporatepersonalisedparameterscontentstore with the primary key could not be found
	 */
	@Override
	public corporatepersonalisedparameterscontentstore fetchByPrimaryKey(
		Serializable primaryKey) {
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore =
			(corporatepersonalisedparameterscontentstore)entityCache.getResult(corporatepersonalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
				corporatepersonalisedparameterscontentstoreImpl.class,
				primaryKey);

		if (corporatepersonalisedparameterscontentstore == _nullcorporatepersonalisedparameterscontentstore) {
			return null;
		}

		if (corporatepersonalisedparameterscontentstore == null) {
			Session session = null;

			try {
				session = openSession();

				corporatepersonalisedparameterscontentstore = (corporatepersonalisedparameterscontentstore)session.get(corporatepersonalisedparameterscontentstoreImpl.class,
						primaryKey);

				if (corporatepersonalisedparameterscontentstore != null) {
					cacheResult(corporatepersonalisedparameterscontentstore);
				}
				else {
					entityCache.putResult(corporatepersonalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
						corporatepersonalisedparameterscontentstoreImpl.class,
						primaryKey,
						_nullcorporatepersonalisedparameterscontentstore);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(corporatepersonalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
					corporatepersonalisedparameterscontentstoreImpl.class,
					primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return corporatepersonalisedparameterscontentstore;
	}

	/**
	 * Returns the corporatepersonalisedparameterscontentstore with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the corporatepersonalisedparameterscontentstore
	 * @return the corporatepersonalisedparameterscontentstore, or <code>null</code> if a corporatepersonalisedparameterscontentstore with the primary key could not be found
	 */
	@Override
	public corporatepersonalisedparameterscontentstore fetchByPrimaryKey(
		long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, corporatepersonalisedparameterscontentstore> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, corporatepersonalisedparameterscontentstore> map = new HashMap<Serializable, corporatepersonalisedparameterscontentstore>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore =
				fetchByPrimaryKey(primaryKey);

			if (corporatepersonalisedparameterscontentstore != null) {
				map.put(primaryKey, corporatepersonalisedparameterscontentstore);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore =
				(corporatepersonalisedparameterscontentstore)entityCache.getResult(corporatepersonalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
					corporatepersonalisedparameterscontentstoreImpl.class,
					primaryKey);

			if (corporatepersonalisedparameterscontentstore == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, corporatepersonalisedparameterscontentstore);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CORPORATEPERSONALISEDPARAMETERSCONTENTSTORE_WHERE_PKS_IN);

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

			for (corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore : (List<corporatepersonalisedparameterscontentstore>)q.list()) {
				map.put(corporatepersonalisedparameterscontentstore.getPrimaryKeyObj(),
					corporatepersonalisedparameterscontentstore);

				cacheResult(corporatepersonalisedparameterscontentstore);

				uncachedPrimaryKeys.remove(corporatepersonalisedparameterscontentstore.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(corporatepersonalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
					corporatepersonalisedparameterscontentstoreImpl.class,
					primaryKey, _nullcorporatepersonalisedparameterscontentstore);
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
	 * Returns all the corporatepersonalisedparameterscontentstores.
	 *
	 * @return the corporatepersonalisedparameterscontentstores
	 */
	@Override
	public List<corporatepersonalisedparameterscontentstore> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the corporatepersonalisedparameterscontentstores.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of corporatepersonalisedparameterscontentstores
	 * @param end the upper bound of the range of corporatepersonalisedparameterscontentstores (not inclusive)
	 * @return the range of corporatepersonalisedparameterscontentstores
	 */
	@Override
	public List<corporatepersonalisedparameterscontentstore> findAll(
		int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the corporatepersonalisedparameterscontentstores.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of corporatepersonalisedparameterscontentstores
	 * @param end the upper bound of the range of corporatepersonalisedparameterscontentstores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of corporatepersonalisedparameterscontentstores
	 */
	@Override
	public List<corporatepersonalisedparameterscontentstore> findAll(
		int start, int end,
		OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the corporatepersonalisedparameterscontentstores.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of corporatepersonalisedparameterscontentstores
	 * @param end the upper bound of the range of corporatepersonalisedparameterscontentstores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of corporatepersonalisedparameterscontentstores
	 */
	@Override
	public List<corporatepersonalisedparameterscontentstore> findAll(
		int start, int end,
		OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator,
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

		List<corporatepersonalisedparameterscontentstore> list = null;

		if (retrieveFromCache) {
			list = (List<corporatepersonalisedparameterscontentstore>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CORPORATEPERSONALISEDPARAMETERSCONTENTSTORE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CORPORATEPERSONALISEDPARAMETERSCONTENTSTORE;

				if (pagination) {
					sql = sql.concat(corporatepersonalisedparameterscontentstoreModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<corporatepersonalisedparameterscontentstore>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<corporatepersonalisedparameterscontentstore>)QueryUtil.list(q,
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
	 * Removes all the corporatepersonalisedparameterscontentstores from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore : findAll()) {
			remove(corporatepersonalisedparameterscontentstore);
		}
	}

	/**
	 * Returns the number of corporatepersonalisedparameterscontentstores.
	 *
	 * @return the number of corporatepersonalisedparameterscontentstores
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CORPORATEPERSONALISEDPARAMETERSCONTENTSTORE);

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
		return corporatepersonalisedparameterscontentstoreModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the corporatepersonalisedparameterscontentstore persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(corporatepersonalisedparameterscontentstoreImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_CORPORATEPERSONALISEDPARAMETERSCONTENTSTORE =
		"SELECT corporatepersonalisedparameterscontentstore FROM corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore";
	private static final String _SQL_SELECT_CORPORATEPERSONALISEDPARAMETERSCONTENTSTORE_WHERE_PKS_IN =
		"SELECT corporatepersonalisedparameterscontentstore FROM corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore WHERE id_ IN (";
	private static final String _SQL_SELECT_CORPORATEPERSONALISEDPARAMETERSCONTENTSTORE_WHERE =
		"SELECT corporatepersonalisedparameterscontentstore FROM corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore WHERE ";
	private static final String _SQL_COUNT_CORPORATEPERSONALISEDPARAMETERSCONTENTSTORE =
		"SELECT COUNT(corporatepersonalisedparameterscontentstore) FROM corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore";
	private static final String _SQL_COUNT_CORPORATEPERSONALISEDPARAMETERSCONTENTSTORE_WHERE =
		"SELECT COUNT(corporatepersonalisedparameterscontentstore) FROM corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "corporatepersonalisedparameterscontentstore.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No corporatepersonalisedparameterscontentstore exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No corporatepersonalisedparameterscontentstore exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(corporatepersonalisedparameterscontentstorePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final corporatepersonalisedparameterscontentstore _nullcorporatepersonalisedparameterscontentstore =
		new corporatepersonalisedparameterscontentstoreImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<corporatepersonalisedparameterscontentstore> toCacheModel() {
				return _nullcorporatepersonalisedparameterscontentstoreCacheModel;
			}
		};

	private static final CacheModel<corporatepersonalisedparameterscontentstore> _nullcorporatepersonalisedparameterscontentstoreCacheModel =
		new CacheModel<corporatepersonalisedparameterscontentstore>() {
			@Override
			public corporatepersonalisedparameterscontentstore toEntityModel() {
				return _nullcorporatepersonalisedparameterscontentstore;
			}
		};
}