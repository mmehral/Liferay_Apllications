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

package com.chola.ppcontent.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.ppcontent.exception.NoSuchpersonalisedparameterscontentstoreException;
import com.chola.ppcontent.model.impl.personalisedparameterscontentstoreImpl;
import com.chola.ppcontent.model.impl.personalisedparameterscontentstoreModelImpl;
import com.chola.ppcontent.model.personalisedparameterscontentstore;
import com.chola.ppcontent.service.persistence.personalisedparameterscontentstorePersistence;

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
 * The persistence implementation for the personalisedparameterscontentstore service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see personalisedparameterscontentstorePersistence
 * @see com.chola.ppcontent.service.persistence.personalisedparameterscontentstoreUtil
 * @generated
 */
@ProviderType
public class personalisedparameterscontentstorePersistenceImpl
	extends BasePersistenceImpl<personalisedparameterscontentstore>
	implements personalisedparameterscontentstorePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link personalisedparameterscontentstoreUtil} to access the personalisedparameterscontentstore persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = personalisedparameterscontentstoreImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(personalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
			personalisedparameterscontentstoreModelImpl.FINDER_CACHE_ENABLED,
			personalisedparameterscontentstoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(personalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
			personalisedparameterscontentstoreModelImpl.FINDER_CACHE_ENABLED,
			personalisedparameterscontentstoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(personalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
			personalisedparameterscontentstoreModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENTID =
		new FinderPath(personalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
			personalisedparameterscontentstoreModelImpl.FINDER_CACHE_ENABLED,
			personalisedparameterscontentstoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCONTENTID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID =
		new FinderPath(personalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
			personalisedparameterscontentstoreModelImpl.FINDER_CACHE_ENABLED,
			personalisedparameterscontentstoreImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCONTENTID",
			new String[] { Long.class.getName() },
			personalisedparameterscontentstoreModelImpl.CONTENT_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTENTID = new FinderPath(personalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
			personalisedparameterscontentstoreModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCONTENTID", new String[] { Long.class.getName() });

	/**
	 * Returns all the personalisedparameterscontentstores where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the matching personalisedparameterscontentstores
	 */
	@Override
	public List<personalisedparameterscontentstore> findByCONTENTID(
		long content_id) {
		return findByCONTENTID(content_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the personalisedparameterscontentstores where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link personalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of personalisedparameterscontentstores
	 * @param end the upper bound of the range of personalisedparameterscontentstores (not inclusive)
	 * @return the range of matching personalisedparameterscontentstores
	 */
	@Override
	public List<personalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end) {
		return findByCONTENTID(content_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the personalisedparameterscontentstores where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link personalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of personalisedparameterscontentstores
	 * @param end the upper bound of the range of personalisedparameterscontentstores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching personalisedparameterscontentstores
	 */
	@Override
	public List<personalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end,
		OrderByComparator<personalisedparameterscontentstore> orderByComparator) {
		return findByCONTENTID(content_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the personalisedparameterscontentstores where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link personalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of personalisedparameterscontentstores
	 * @param end the upper bound of the range of personalisedparameterscontentstores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching personalisedparameterscontentstores
	 */
	@Override
	public List<personalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end,
		OrderByComparator<personalisedparameterscontentstore> orderByComparator,
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

		List<personalisedparameterscontentstore> list = null;

		if (retrieveFromCache) {
			list = (List<personalisedparameterscontentstore>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (personalisedparameterscontentstore personalisedparameterscontentstore : list) {
					if ((content_id != personalisedparameterscontentstore.getContent_id())) {
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

			query.append(_SQL_SELECT_PERSONALISEDPARAMETERSCONTENTSTORE_WHERE);

			query.append(_FINDER_COLUMN_CONTENTID_CONTENT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(personalisedparameterscontentstoreModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(content_id);

				if (!pagination) {
					list = (List<personalisedparameterscontentstore>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<personalisedparameterscontentstore>)QueryUtil.list(q,
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
	 * Returns the first personalisedparameterscontentstore in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personalisedparameterscontentstore
	 * @throws NoSuchpersonalisedparameterscontentstoreException if a matching personalisedparameterscontentstore could not be found
	 */
	@Override
	public personalisedparameterscontentstore findByCONTENTID_First(
		long content_id,
		OrderByComparator<personalisedparameterscontentstore> orderByComparator)
		throws NoSuchpersonalisedparameterscontentstoreException {
		personalisedparameterscontentstore personalisedparameterscontentstore = fetchByCONTENTID_First(content_id,
				orderByComparator);

		if (personalisedparameterscontentstore != null) {
			return personalisedparameterscontentstore;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchpersonalisedparameterscontentstoreException(msg.toString());
	}

	/**
	 * Returns the first personalisedparameterscontentstore in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching personalisedparameterscontentstore, or <code>null</code> if a matching personalisedparameterscontentstore could not be found
	 */
	@Override
	public personalisedparameterscontentstore fetchByCONTENTID_First(
		long content_id,
		OrderByComparator<personalisedparameterscontentstore> orderByComparator) {
		List<personalisedparameterscontentstore> list = findByCONTENTID(content_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last personalisedparameterscontentstore in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personalisedparameterscontentstore
	 * @throws NoSuchpersonalisedparameterscontentstoreException if a matching personalisedparameterscontentstore could not be found
	 */
	@Override
	public personalisedparameterscontentstore findByCONTENTID_Last(
		long content_id,
		OrderByComparator<personalisedparameterscontentstore> orderByComparator)
		throws NoSuchpersonalisedparameterscontentstoreException {
		personalisedparameterscontentstore personalisedparameterscontentstore = fetchByCONTENTID_Last(content_id,
				orderByComparator);

		if (personalisedparameterscontentstore != null) {
			return personalisedparameterscontentstore;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchpersonalisedparameterscontentstoreException(msg.toString());
	}

	/**
	 * Returns the last personalisedparameterscontentstore in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching personalisedparameterscontentstore, or <code>null</code> if a matching personalisedparameterscontentstore could not be found
	 */
	@Override
	public personalisedparameterscontentstore fetchByCONTENTID_Last(
		long content_id,
		OrderByComparator<personalisedparameterscontentstore> orderByComparator) {
		int count = countByCONTENTID(content_id);

		if (count == 0) {
			return null;
		}

		List<personalisedparameterscontentstore> list = findByCONTENTID(content_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the personalisedparameterscontentstores before and after the current personalisedparameterscontentstore in the ordered set where content_id = &#63;.
	 *
	 * @param id the primary key of the current personalisedparameterscontentstore
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next personalisedparameterscontentstore
	 * @throws NoSuchpersonalisedparameterscontentstoreException if a personalisedparameterscontentstore with the primary key could not be found
	 */
	@Override
	public personalisedparameterscontentstore[] findByCONTENTID_PrevAndNext(
		long id, long content_id,
		OrderByComparator<personalisedparameterscontentstore> orderByComparator)
		throws NoSuchpersonalisedparameterscontentstoreException {
		personalisedparameterscontentstore personalisedparameterscontentstore = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			personalisedparameterscontentstore[] array = new personalisedparameterscontentstoreImpl[3];

			array[0] = getByCONTENTID_PrevAndNext(session,
					personalisedparameterscontentstore, content_id,
					orderByComparator, true);

			array[1] = personalisedparameterscontentstore;

			array[2] = getByCONTENTID_PrevAndNext(session,
					personalisedparameterscontentstore, content_id,
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

	protected personalisedparameterscontentstore getByCONTENTID_PrevAndNext(
		Session session,
		personalisedparameterscontentstore personalisedparameterscontentstore,
		long content_id,
		OrderByComparator<personalisedparameterscontentstore> orderByComparator,
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

		query.append(_SQL_SELECT_PERSONALISEDPARAMETERSCONTENTSTORE_WHERE);

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
			query.append(personalisedparameterscontentstoreModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(content_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(personalisedparameterscontentstore);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<personalisedparameterscontentstore> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the personalisedparameterscontentstores where content_id = &#63; from the database.
	 *
	 * @param content_id the content_id
	 */
	@Override
	public void removeByCONTENTID(long content_id) {
		for (personalisedparameterscontentstore personalisedparameterscontentstore : findByCONTENTID(
				content_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(personalisedparameterscontentstore);
		}
	}

	/**
	 * Returns the number of personalisedparameterscontentstores where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the number of matching personalisedparameterscontentstores
	 */
	@Override
	public int countByCONTENTID(long content_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTENTID;

		Object[] finderArgs = new Object[] { content_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PERSONALISEDPARAMETERSCONTENTSTORE_WHERE);

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

	private static final String _FINDER_COLUMN_CONTENTID_CONTENT_ID_2 = "personalisedparameterscontentstore.content_id = ?";

	public personalisedparameterscontentstorePersistenceImpl() {
		setModelClass(personalisedparameterscontentstore.class);
	}

	/**
	 * Caches the personalisedparameterscontentstore in the entity cache if it is enabled.
	 *
	 * @param personalisedparameterscontentstore the personalisedparameterscontentstore
	 */
	@Override
	public void cacheResult(
		personalisedparameterscontentstore personalisedparameterscontentstore) {
		entityCache.putResult(personalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
			personalisedparameterscontentstoreImpl.class,
			personalisedparameterscontentstore.getPrimaryKey(),
			personalisedparameterscontentstore);

		personalisedparameterscontentstore.resetOriginalValues();
	}

	/**
	 * Caches the personalisedparameterscontentstores in the entity cache if it is enabled.
	 *
	 * @param personalisedparameterscontentstores the personalisedparameterscontentstores
	 */
	@Override
	public void cacheResult(
		List<personalisedparameterscontentstore> personalisedparameterscontentstores) {
		for (personalisedparameterscontentstore personalisedparameterscontentstore : personalisedparameterscontentstores) {
			if (entityCache.getResult(
						personalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
						personalisedparameterscontentstoreImpl.class,
						personalisedparameterscontentstore.getPrimaryKey()) == null) {
				cacheResult(personalisedparameterscontentstore);
			}
			else {
				personalisedparameterscontentstore.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all personalisedparameterscontentstores.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(personalisedparameterscontentstoreImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the personalisedparameterscontentstore.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		personalisedparameterscontentstore personalisedparameterscontentstore) {
		entityCache.removeResult(personalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
			personalisedparameterscontentstoreImpl.class,
			personalisedparameterscontentstore.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<personalisedparameterscontentstore> personalisedparameterscontentstores) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (personalisedparameterscontentstore personalisedparameterscontentstore : personalisedparameterscontentstores) {
			entityCache.removeResult(personalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
				personalisedparameterscontentstoreImpl.class,
				personalisedparameterscontentstore.getPrimaryKey());
		}
	}

	/**
	 * Creates a new personalisedparameterscontentstore with the primary key. Does not add the personalisedparameterscontentstore to the database.
	 *
	 * @param id the primary key for the new personalisedparameterscontentstore
	 * @return the new personalisedparameterscontentstore
	 */
	@Override
	public personalisedparameterscontentstore create(long id) {
		personalisedparameterscontentstore personalisedparameterscontentstore = new personalisedparameterscontentstoreImpl();

		personalisedparameterscontentstore.setNew(true);
		personalisedparameterscontentstore.setPrimaryKey(id);

		return personalisedparameterscontentstore;
	}

	/**
	 * Removes the personalisedparameterscontentstore with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the personalisedparameterscontentstore
	 * @return the personalisedparameterscontentstore that was removed
	 * @throws NoSuchpersonalisedparameterscontentstoreException if a personalisedparameterscontentstore with the primary key could not be found
	 */
	@Override
	public personalisedparameterscontentstore remove(long id)
		throws NoSuchpersonalisedparameterscontentstoreException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the personalisedparameterscontentstore with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the personalisedparameterscontentstore
	 * @return the personalisedparameterscontentstore that was removed
	 * @throws NoSuchpersonalisedparameterscontentstoreException if a personalisedparameterscontentstore with the primary key could not be found
	 */
	@Override
	public personalisedparameterscontentstore remove(Serializable primaryKey)
		throws NoSuchpersonalisedparameterscontentstoreException {
		Session session = null;

		try {
			session = openSession();

			personalisedparameterscontentstore personalisedparameterscontentstore =
				(personalisedparameterscontentstore)session.get(personalisedparameterscontentstoreImpl.class,
					primaryKey);

			if (personalisedparameterscontentstore == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchpersonalisedparameterscontentstoreException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(personalisedparameterscontentstore);
		}
		catch (NoSuchpersonalisedparameterscontentstoreException nsee) {
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
	protected personalisedparameterscontentstore removeImpl(
		personalisedparameterscontentstore personalisedparameterscontentstore) {
		personalisedparameterscontentstore = toUnwrappedModel(personalisedparameterscontentstore);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(personalisedparameterscontentstore)) {
				personalisedparameterscontentstore = (personalisedparameterscontentstore)session.get(personalisedparameterscontentstoreImpl.class,
						personalisedparameterscontentstore.getPrimaryKeyObj());
			}

			if (personalisedparameterscontentstore != null) {
				session.delete(personalisedparameterscontentstore);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (personalisedparameterscontentstore != null) {
			clearCache(personalisedparameterscontentstore);
		}

		return personalisedparameterscontentstore;
	}

	@Override
	public personalisedparameterscontentstore updateImpl(
		personalisedparameterscontentstore personalisedparameterscontentstore) {
		personalisedparameterscontentstore = toUnwrappedModel(personalisedparameterscontentstore);

		boolean isNew = personalisedparameterscontentstore.isNew();

		personalisedparameterscontentstoreModelImpl personalisedparameterscontentstoreModelImpl =
			(personalisedparameterscontentstoreModelImpl)personalisedparameterscontentstore;

		Session session = null;

		try {
			session = openSession();

			if (personalisedparameterscontentstore.isNew()) {
				session.save(personalisedparameterscontentstore);

				personalisedparameterscontentstore.setNew(false);
			}
			else {
				personalisedparameterscontentstore = (personalisedparameterscontentstore)session.merge(personalisedparameterscontentstore);
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
				!personalisedparameterscontentstoreModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((personalisedparameterscontentstoreModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						personalisedparameterscontentstoreModelImpl.getOriginalContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID,
					args);

				args = new Object[] {
						personalisedparameterscontentstoreModelImpl.getContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID,
					args);
			}
		}

		entityCache.putResult(personalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
			personalisedparameterscontentstoreImpl.class,
			personalisedparameterscontentstore.getPrimaryKey(),
			personalisedparameterscontentstore, false);

		personalisedparameterscontentstore.resetOriginalValues();

		return personalisedparameterscontentstore;
	}

	protected personalisedparameterscontentstore toUnwrappedModel(
		personalisedparameterscontentstore personalisedparameterscontentstore) {
		if (personalisedparameterscontentstore instanceof personalisedparameterscontentstoreImpl) {
			return personalisedparameterscontentstore;
		}

		personalisedparameterscontentstoreImpl personalisedparameterscontentstoreImpl =
			new personalisedparameterscontentstoreImpl();

		personalisedparameterscontentstoreImpl.setNew(personalisedparameterscontentstore.isNew());
		personalisedparameterscontentstoreImpl.setPrimaryKey(personalisedparameterscontentstore.getPrimaryKey());

		personalisedparameterscontentstoreImpl.setId(personalisedparameterscontentstore.getId());
		personalisedparameterscontentstoreImpl.setContent_id(personalisedparameterscontentstore.getContent_id());
		personalisedparameterscontentstoreImpl.setBusiness(personalisedparameterscontentstore.getBusiness());
		personalisedparameterscontentstoreImpl.setUnit(personalisedparameterscontentstore.getUnit());
		personalisedparameterscontentstoreImpl.setFunction(personalisedparameterscontentstore.getFunction());
		personalisedparameterscontentstoreImpl.setDepartment(personalisedparameterscontentstore.getDepartment());
		personalisedparameterscontentstoreImpl.setDesignation(personalisedparameterscontentstore.getDesignation());
		personalisedparameterscontentstoreImpl.setProduct(personalisedparameterscontentstore.getProduct());
		personalisedparameterscontentstoreImpl.setZone(personalisedparameterscontentstore.getZone());
		personalisedparameterscontentstoreImpl.setBranch(personalisedparameterscontentstore.getBranch());
		personalisedparameterscontentstoreImpl.setGrade(personalisedparameterscontentstore.getGrade());
		personalisedparameterscontentstoreImpl.setRegion(personalisedparameterscontentstore.getRegion());
		personalisedparameterscontentstoreImpl.setLocation(personalisedparameterscontentstore.getLocation());
		personalisedparameterscontentstoreImpl.setUser_id(personalisedparameterscontentstore.getUser_id());
		personalisedparameterscontentstoreImpl.setGender(personalisedparameterscontentstore.getGender());
		personalisedparameterscontentstoreImpl.setAge_type(personalisedparameterscontentstore.getAge_type());
		personalisedparameterscontentstoreImpl.setAge_value(personalisedparameterscontentstore.getAge_value());
		personalisedparameterscontentstoreImpl.setNotification_type(personalisedparameterscontentstore.getNotification_type());

		return personalisedparameterscontentstoreImpl;
	}

	/**
	 * Returns the personalisedparameterscontentstore with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the personalisedparameterscontentstore
	 * @return the personalisedparameterscontentstore
	 * @throws NoSuchpersonalisedparameterscontentstoreException if a personalisedparameterscontentstore with the primary key could not be found
	 */
	@Override
	public personalisedparameterscontentstore findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchpersonalisedparameterscontentstoreException {
		personalisedparameterscontentstore personalisedparameterscontentstore = fetchByPrimaryKey(primaryKey);

		if (personalisedparameterscontentstore == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchpersonalisedparameterscontentstoreException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return personalisedparameterscontentstore;
	}

	/**
	 * Returns the personalisedparameterscontentstore with the primary key or throws a {@link NoSuchpersonalisedparameterscontentstoreException} if it could not be found.
	 *
	 * @param id the primary key of the personalisedparameterscontentstore
	 * @return the personalisedparameterscontentstore
	 * @throws NoSuchpersonalisedparameterscontentstoreException if a personalisedparameterscontentstore with the primary key could not be found
	 */
	@Override
	public personalisedparameterscontentstore findByPrimaryKey(long id)
		throws NoSuchpersonalisedparameterscontentstoreException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the personalisedparameterscontentstore with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the personalisedparameterscontentstore
	 * @return the personalisedparameterscontentstore, or <code>null</code> if a personalisedparameterscontentstore with the primary key could not be found
	 */
	@Override
	public personalisedparameterscontentstore fetchByPrimaryKey(
		Serializable primaryKey) {
		personalisedparameterscontentstore personalisedparameterscontentstore = (personalisedparameterscontentstore)entityCache.getResult(personalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
				personalisedparameterscontentstoreImpl.class, primaryKey);

		if (personalisedparameterscontentstore == _nullpersonalisedparameterscontentstore) {
			return null;
		}

		if (personalisedparameterscontentstore == null) {
			Session session = null;

			try {
				session = openSession();

				personalisedparameterscontentstore = (personalisedparameterscontentstore)session.get(personalisedparameterscontentstoreImpl.class,
						primaryKey);

				if (personalisedparameterscontentstore != null) {
					cacheResult(personalisedparameterscontentstore);
				}
				else {
					entityCache.putResult(personalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
						personalisedparameterscontentstoreImpl.class,
						primaryKey, _nullpersonalisedparameterscontentstore);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(personalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
					personalisedparameterscontentstoreImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return personalisedparameterscontentstore;
	}

	/**
	 * Returns the personalisedparameterscontentstore with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the personalisedparameterscontentstore
	 * @return the personalisedparameterscontentstore, or <code>null</code> if a personalisedparameterscontentstore with the primary key could not be found
	 */
	@Override
	public personalisedparameterscontentstore fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, personalisedparameterscontentstore> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, personalisedparameterscontentstore> map = new HashMap<Serializable, personalisedparameterscontentstore>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			personalisedparameterscontentstore personalisedparameterscontentstore =
				fetchByPrimaryKey(primaryKey);

			if (personalisedparameterscontentstore != null) {
				map.put(primaryKey, personalisedparameterscontentstore);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			personalisedparameterscontentstore personalisedparameterscontentstore =
				(personalisedparameterscontentstore)entityCache.getResult(personalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
					personalisedparameterscontentstoreImpl.class, primaryKey);

			if (personalisedparameterscontentstore == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, personalisedparameterscontentstore);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PERSONALISEDPARAMETERSCONTENTSTORE_WHERE_PKS_IN);

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

			for (personalisedparameterscontentstore personalisedparameterscontentstore : (List<personalisedparameterscontentstore>)q.list()) {
				map.put(personalisedparameterscontentstore.getPrimaryKeyObj(),
					personalisedparameterscontentstore);

				cacheResult(personalisedparameterscontentstore);

				uncachedPrimaryKeys.remove(personalisedparameterscontentstore.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(personalisedparameterscontentstoreModelImpl.ENTITY_CACHE_ENABLED,
					personalisedparameterscontentstoreImpl.class, primaryKey,
					_nullpersonalisedparameterscontentstore);
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
	 * Returns all the personalisedparameterscontentstores.
	 *
	 * @return the personalisedparameterscontentstores
	 */
	@Override
	public List<personalisedparameterscontentstore> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the personalisedparameterscontentstores.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link personalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of personalisedparameterscontentstores
	 * @param end the upper bound of the range of personalisedparameterscontentstores (not inclusive)
	 * @return the range of personalisedparameterscontentstores
	 */
	@Override
	public List<personalisedparameterscontentstore> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the personalisedparameterscontentstores.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link personalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of personalisedparameterscontentstores
	 * @param end the upper bound of the range of personalisedparameterscontentstores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of personalisedparameterscontentstores
	 */
	@Override
	public List<personalisedparameterscontentstore> findAll(int start, int end,
		OrderByComparator<personalisedparameterscontentstore> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the personalisedparameterscontentstores.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link personalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of personalisedparameterscontentstores
	 * @param end the upper bound of the range of personalisedparameterscontentstores (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of personalisedparameterscontentstores
	 */
	@Override
	public List<personalisedparameterscontentstore> findAll(int start, int end,
		OrderByComparator<personalisedparameterscontentstore> orderByComparator,
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

		List<personalisedparameterscontentstore> list = null;

		if (retrieveFromCache) {
			list = (List<personalisedparameterscontentstore>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PERSONALISEDPARAMETERSCONTENTSTORE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PERSONALISEDPARAMETERSCONTENTSTORE;

				if (pagination) {
					sql = sql.concat(personalisedparameterscontentstoreModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<personalisedparameterscontentstore>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<personalisedparameterscontentstore>)QueryUtil.list(q,
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
	 * Removes all the personalisedparameterscontentstores from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (personalisedparameterscontentstore personalisedparameterscontentstore : findAll()) {
			remove(personalisedparameterscontentstore);
		}
	}

	/**
	 * Returns the number of personalisedparameterscontentstores.
	 *
	 * @return the number of personalisedparameterscontentstores
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PERSONALISEDPARAMETERSCONTENTSTORE);

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
		return personalisedparameterscontentstoreModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the personalisedparameterscontentstore persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(personalisedparameterscontentstoreImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_PERSONALISEDPARAMETERSCONTENTSTORE = "SELECT personalisedparameterscontentstore FROM personalisedparameterscontentstore personalisedparameterscontentstore";
	private static final String _SQL_SELECT_PERSONALISEDPARAMETERSCONTENTSTORE_WHERE_PKS_IN =
		"SELECT personalisedparameterscontentstore FROM personalisedparameterscontentstore personalisedparameterscontentstore WHERE id_ IN (";
	private static final String _SQL_SELECT_PERSONALISEDPARAMETERSCONTENTSTORE_WHERE =
		"SELECT personalisedparameterscontentstore FROM personalisedparameterscontentstore personalisedparameterscontentstore WHERE ";
	private static final String _SQL_COUNT_PERSONALISEDPARAMETERSCONTENTSTORE = "SELECT COUNT(personalisedparameterscontentstore) FROM personalisedparameterscontentstore personalisedparameterscontentstore";
	private static final String _SQL_COUNT_PERSONALISEDPARAMETERSCONTENTSTORE_WHERE =
		"SELECT COUNT(personalisedparameterscontentstore) FROM personalisedparameterscontentstore personalisedparameterscontentstore WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "personalisedparameterscontentstore.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No personalisedparameterscontentstore exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No personalisedparameterscontentstore exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(personalisedparameterscontentstorePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final personalisedparameterscontentstore _nullpersonalisedparameterscontentstore =
		new personalisedparameterscontentstoreImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<personalisedparameterscontentstore> toCacheModel() {
				return _nullpersonalisedparameterscontentstoreCacheModel;
			}
		};

	private static final CacheModel<personalisedparameterscontentstore> _nullpersonalisedparameterscontentstoreCacheModel =
		new CacheModel<personalisedparameterscontentstore>() {
			@Override
			public personalisedparameterscontentstore toEntityModel() {
				return _nullpersonalisedparameterscontentstore;
			}
		};
}