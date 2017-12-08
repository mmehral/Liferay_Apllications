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

package com.chola.trainingcalendar.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.trainingcalendar.exception.NoSuchtrainingcontentuniqueinformationException;
import com.chola.trainingcalendar.model.impl.trainingcontentuniqueinformationImpl;
import com.chola.trainingcalendar.model.impl.trainingcontentuniqueinformationModelImpl;
import com.chola.trainingcalendar.model.trainingcontentuniqueinformation;
import com.chola.trainingcalendar.service.persistence.trainingcontentuniqueinformationPersistence;

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
 * The persistence implementation for the trainingcontentuniqueinformation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see trainingcontentuniqueinformationPersistence
 * @see com.chola.trainingcalendar.service.persistence.trainingcontentuniqueinformationUtil
 * @generated
 */
@ProviderType
public class trainingcontentuniqueinformationPersistenceImpl
	extends BasePersistenceImpl<trainingcontentuniqueinformation>
	implements trainingcontentuniqueinformationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link trainingcontentuniqueinformationUtil} to access the trainingcontentuniqueinformation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = trainingcontentuniqueinformationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(trainingcontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			trainingcontentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			trainingcontentuniqueinformationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(trainingcontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			trainingcontentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			trainingcontentuniqueinformationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(trainingcontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			trainingcontentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENTID =
		new FinderPath(trainingcontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			trainingcontentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			trainingcontentuniqueinformationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCONTENTID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID =
		new FinderPath(trainingcontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			trainingcontentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			trainingcontentuniqueinformationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCONTENTID",
			new String[] { Long.class.getName() },
			trainingcontentuniqueinformationModelImpl.CONTENT_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTENTID = new FinderPath(trainingcontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			trainingcontentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCONTENTID", new String[] { Long.class.getName() });

	/**
	 * Returns all the trainingcontentuniqueinformations where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the matching trainingcontentuniqueinformations
	 */
	@Override
	public List<trainingcontentuniqueinformation> findByCONTENTID(
		long content_id) {
		return findByCONTENTID(content_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the trainingcontentuniqueinformations where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of trainingcontentuniqueinformations
	 * @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	 * @return the range of matching trainingcontentuniqueinformations
	 */
	@Override
	public List<trainingcontentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end) {
		return findByCONTENTID(content_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the trainingcontentuniqueinformations where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of trainingcontentuniqueinformations
	 * @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching trainingcontentuniqueinformations
	 */
	@Override
	public List<trainingcontentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator) {
		return findByCONTENTID(content_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the trainingcontentuniqueinformations where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of trainingcontentuniqueinformations
	 * @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching trainingcontentuniqueinformations
	 */
	@Override
	public List<trainingcontentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator,
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

		List<trainingcontentuniqueinformation> list = null;

		if (retrieveFromCache) {
			list = (List<trainingcontentuniqueinformation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (trainingcontentuniqueinformation trainingcontentuniqueinformation : list) {
					if ((content_id != trainingcontentuniqueinformation.getContent_id())) {
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

			query.append(_SQL_SELECT_TRAININGCONTENTUNIQUEINFORMATION_WHERE);

			query.append(_FINDER_COLUMN_CONTENTID_CONTENT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(trainingcontentuniqueinformationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(content_id);

				if (!pagination) {
					list = (List<trainingcontentuniqueinformation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<trainingcontentuniqueinformation>)QueryUtil.list(q,
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
	 * Returns the first trainingcontentuniqueinformation in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching trainingcontentuniqueinformation
	 * @throws NoSuchtrainingcontentuniqueinformationException if a matching trainingcontentuniqueinformation could not be found
	 */
	@Override
	public trainingcontentuniqueinformation findByCONTENTID_First(
		long content_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator)
		throws NoSuchtrainingcontentuniqueinformationException {
		trainingcontentuniqueinformation trainingcontentuniqueinformation = fetchByCONTENTID_First(content_id,
				orderByComparator);

		if (trainingcontentuniqueinformation != null) {
			return trainingcontentuniqueinformation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchtrainingcontentuniqueinformationException(msg.toString());
	}

	/**
	 * Returns the first trainingcontentuniqueinformation in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching trainingcontentuniqueinformation, or <code>null</code> if a matching trainingcontentuniqueinformation could not be found
	 */
	@Override
	public trainingcontentuniqueinformation fetchByCONTENTID_First(
		long content_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator) {
		List<trainingcontentuniqueinformation> list = findByCONTENTID(content_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last trainingcontentuniqueinformation in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching trainingcontentuniqueinformation
	 * @throws NoSuchtrainingcontentuniqueinformationException if a matching trainingcontentuniqueinformation could not be found
	 */
	@Override
	public trainingcontentuniqueinformation findByCONTENTID_Last(
		long content_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator)
		throws NoSuchtrainingcontentuniqueinformationException {
		trainingcontentuniqueinformation trainingcontentuniqueinformation = fetchByCONTENTID_Last(content_id,
				orderByComparator);

		if (trainingcontentuniqueinformation != null) {
			return trainingcontentuniqueinformation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchtrainingcontentuniqueinformationException(msg.toString());
	}

	/**
	 * Returns the last trainingcontentuniqueinformation in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching trainingcontentuniqueinformation, or <code>null</code> if a matching trainingcontentuniqueinformation could not be found
	 */
	@Override
	public trainingcontentuniqueinformation fetchByCONTENTID_Last(
		long content_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator) {
		int count = countByCONTENTID(content_id);

		if (count == 0) {
			return null;
		}

		List<trainingcontentuniqueinformation> list = findByCONTENTID(content_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the trainingcontentuniqueinformations before and after the current trainingcontentuniqueinformation in the ordered set where content_id = &#63;.
	 *
	 * @param id the primary key of the current trainingcontentuniqueinformation
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next trainingcontentuniqueinformation
	 * @throws NoSuchtrainingcontentuniqueinformationException if a trainingcontentuniqueinformation with the primary key could not be found
	 */
	@Override
	public trainingcontentuniqueinformation[] findByCONTENTID_PrevAndNext(
		long id, long content_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator)
		throws NoSuchtrainingcontentuniqueinformationException {
		trainingcontentuniqueinformation trainingcontentuniqueinformation = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			trainingcontentuniqueinformation[] array = new trainingcontentuniqueinformationImpl[3];

			array[0] = getByCONTENTID_PrevAndNext(session,
					trainingcontentuniqueinformation, content_id,
					orderByComparator, true);

			array[1] = trainingcontentuniqueinformation;

			array[2] = getByCONTENTID_PrevAndNext(session,
					trainingcontentuniqueinformation, content_id,
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

	protected trainingcontentuniqueinformation getByCONTENTID_PrevAndNext(
		Session session,
		trainingcontentuniqueinformation trainingcontentuniqueinformation,
		long content_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator,
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

		query.append(_SQL_SELECT_TRAININGCONTENTUNIQUEINFORMATION_WHERE);

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
			query.append(trainingcontentuniqueinformationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(content_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(trainingcontentuniqueinformation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<trainingcontentuniqueinformation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the trainingcontentuniqueinformations where content_id = &#63; from the database.
	 *
	 * @param content_id the content_id
	 */
	@Override
	public void removeByCONTENTID(long content_id) {
		for (trainingcontentuniqueinformation trainingcontentuniqueinformation : findByCONTENTID(
				content_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(trainingcontentuniqueinformation);
		}
	}

	/**
	 * Returns the number of trainingcontentuniqueinformations where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the number of matching trainingcontentuniqueinformations
	 */
	@Override
	public int countByCONTENTID(long content_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTENTID;

		Object[] finderArgs = new Object[] { content_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TRAININGCONTENTUNIQUEINFORMATION_WHERE);

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

	private static final String _FINDER_COLUMN_CONTENTID_CONTENT_ID_2 = "trainingcontentuniqueinformation.content_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TRAININGID =
		new FinderPath(trainingcontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			trainingcontentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			trainingcontentuniqueinformationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTRAININGID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRAININGID =
		new FinderPath(trainingcontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			trainingcontentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			trainingcontentuniqueinformationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTRAININGID",
			new String[] { Long.class.getName() },
			trainingcontentuniqueinformationModelImpl.TRAINING_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TRAININGID = new FinderPath(trainingcontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			trainingcontentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTRAININGID", new String[] { Long.class.getName() });

	/**
	 * Returns all the trainingcontentuniqueinformations where training_id = &#63;.
	 *
	 * @param training_id the training_id
	 * @return the matching trainingcontentuniqueinformations
	 */
	@Override
	public List<trainingcontentuniqueinformation> findByTRAININGID(
		long training_id) {
		return findByTRAININGID(training_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the trainingcontentuniqueinformations where training_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param training_id the training_id
	 * @param start the lower bound of the range of trainingcontentuniqueinformations
	 * @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	 * @return the range of matching trainingcontentuniqueinformations
	 */
	@Override
	public List<trainingcontentuniqueinformation> findByTRAININGID(
		long training_id, int start, int end) {
		return findByTRAININGID(training_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the trainingcontentuniqueinformations where training_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param training_id the training_id
	 * @param start the lower bound of the range of trainingcontentuniqueinformations
	 * @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching trainingcontentuniqueinformations
	 */
	@Override
	public List<trainingcontentuniqueinformation> findByTRAININGID(
		long training_id, int start, int end,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator) {
		return findByTRAININGID(training_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the trainingcontentuniqueinformations where training_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param training_id the training_id
	 * @param start the lower bound of the range of trainingcontentuniqueinformations
	 * @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching trainingcontentuniqueinformations
	 */
	@Override
	public List<trainingcontentuniqueinformation> findByTRAININGID(
		long training_id, int start, int end,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRAININGID;
			finderArgs = new Object[] { training_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TRAININGID;
			finderArgs = new Object[] { training_id, start, end, orderByComparator };
		}

		List<trainingcontentuniqueinformation> list = null;

		if (retrieveFromCache) {
			list = (List<trainingcontentuniqueinformation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (trainingcontentuniqueinformation trainingcontentuniqueinformation : list) {
					if ((training_id != trainingcontentuniqueinformation.getTraining_id())) {
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

			query.append(_SQL_SELECT_TRAININGCONTENTUNIQUEINFORMATION_WHERE);

			query.append(_FINDER_COLUMN_TRAININGID_TRAINING_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(trainingcontentuniqueinformationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(training_id);

				if (!pagination) {
					list = (List<trainingcontentuniqueinformation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<trainingcontentuniqueinformation>)QueryUtil.list(q,
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
	 * Returns the first trainingcontentuniqueinformation in the ordered set where training_id = &#63;.
	 *
	 * @param training_id the training_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching trainingcontentuniqueinformation
	 * @throws NoSuchtrainingcontentuniqueinformationException if a matching trainingcontentuniqueinformation could not be found
	 */
	@Override
	public trainingcontentuniqueinformation findByTRAININGID_First(
		long training_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator)
		throws NoSuchtrainingcontentuniqueinformationException {
		trainingcontentuniqueinformation trainingcontentuniqueinformation = fetchByTRAININGID_First(training_id,
				orderByComparator);

		if (trainingcontentuniqueinformation != null) {
			return trainingcontentuniqueinformation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("training_id=");
		msg.append(training_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchtrainingcontentuniqueinformationException(msg.toString());
	}

	/**
	 * Returns the first trainingcontentuniqueinformation in the ordered set where training_id = &#63;.
	 *
	 * @param training_id the training_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching trainingcontentuniqueinformation, or <code>null</code> if a matching trainingcontentuniqueinformation could not be found
	 */
	@Override
	public trainingcontentuniqueinformation fetchByTRAININGID_First(
		long training_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator) {
		List<trainingcontentuniqueinformation> list = findByTRAININGID(training_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last trainingcontentuniqueinformation in the ordered set where training_id = &#63;.
	 *
	 * @param training_id the training_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching trainingcontentuniqueinformation
	 * @throws NoSuchtrainingcontentuniqueinformationException if a matching trainingcontentuniqueinformation could not be found
	 */
	@Override
	public trainingcontentuniqueinformation findByTRAININGID_Last(
		long training_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator)
		throws NoSuchtrainingcontentuniqueinformationException {
		trainingcontentuniqueinformation trainingcontentuniqueinformation = fetchByTRAININGID_Last(training_id,
				orderByComparator);

		if (trainingcontentuniqueinformation != null) {
			return trainingcontentuniqueinformation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("training_id=");
		msg.append(training_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchtrainingcontentuniqueinformationException(msg.toString());
	}

	/**
	 * Returns the last trainingcontentuniqueinformation in the ordered set where training_id = &#63;.
	 *
	 * @param training_id the training_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching trainingcontentuniqueinformation, or <code>null</code> if a matching trainingcontentuniqueinformation could not be found
	 */
	@Override
	public trainingcontentuniqueinformation fetchByTRAININGID_Last(
		long training_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator) {
		int count = countByTRAININGID(training_id);

		if (count == 0) {
			return null;
		}

		List<trainingcontentuniqueinformation> list = findByTRAININGID(training_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the trainingcontentuniqueinformations before and after the current trainingcontentuniqueinformation in the ordered set where training_id = &#63;.
	 *
	 * @param id the primary key of the current trainingcontentuniqueinformation
	 * @param training_id the training_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next trainingcontentuniqueinformation
	 * @throws NoSuchtrainingcontentuniqueinformationException if a trainingcontentuniqueinformation with the primary key could not be found
	 */
	@Override
	public trainingcontentuniqueinformation[] findByTRAININGID_PrevAndNext(
		long id, long training_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator)
		throws NoSuchtrainingcontentuniqueinformationException {
		trainingcontentuniqueinformation trainingcontentuniqueinformation = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			trainingcontentuniqueinformation[] array = new trainingcontentuniqueinformationImpl[3];

			array[0] = getByTRAININGID_PrevAndNext(session,
					trainingcontentuniqueinformation, training_id,
					orderByComparator, true);

			array[1] = trainingcontentuniqueinformation;

			array[2] = getByTRAININGID_PrevAndNext(session,
					trainingcontentuniqueinformation, training_id,
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

	protected trainingcontentuniqueinformation getByTRAININGID_PrevAndNext(
		Session session,
		trainingcontentuniqueinformation trainingcontentuniqueinformation,
		long training_id,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator,
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

		query.append(_SQL_SELECT_TRAININGCONTENTUNIQUEINFORMATION_WHERE);

		query.append(_FINDER_COLUMN_TRAININGID_TRAINING_ID_2);

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
			query.append(trainingcontentuniqueinformationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(training_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(trainingcontentuniqueinformation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<trainingcontentuniqueinformation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the trainingcontentuniqueinformations where training_id = &#63; from the database.
	 *
	 * @param training_id the training_id
	 */
	@Override
	public void removeByTRAININGID(long training_id) {
		for (trainingcontentuniqueinformation trainingcontentuniqueinformation : findByTRAININGID(
				training_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(trainingcontentuniqueinformation);
		}
	}

	/**
	 * Returns the number of trainingcontentuniqueinformations where training_id = &#63;.
	 *
	 * @param training_id the training_id
	 * @return the number of matching trainingcontentuniqueinformations
	 */
	@Override
	public int countByTRAININGID(long training_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TRAININGID;

		Object[] finderArgs = new Object[] { training_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TRAININGCONTENTUNIQUEINFORMATION_WHERE);

			query.append(_FINDER_COLUMN_TRAININGID_TRAINING_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(training_id);

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

	private static final String _FINDER_COLUMN_TRAININGID_TRAINING_ID_2 = "trainingcontentuniqueinformation.training_id = ?";

	public trainingcontentuniqueinformationPersistenceImpl() {
		setModelClass(trainingcontentuniqueinformation.class);
	}

	/**
	 * Caches the trainingcontentuniqueinformation in the entity cache if it is enabled.
	 *
	 * @param trainingcontentuniqueinformation the trainingcontentuniqueinformation
	 */
	@Override
	public void cacheResult(
		trainingcontentuniqueinformation trainingcontentuniqueinformation) {
		entityCache.putResult(trainingcontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			trainingcontentuniqueinformationImpl.class,
			trainingcontentuniqueinformation.getPrimaryKey(),
			trainingcontentuniqueinformation);

		trainingcontentuniqueinformation.resetOriginalValues();
	}

	/**
	 * Caches the trainingcontentuniqueinformations in the entity cache if it is enabled.
	 *
	 * @param trainingcontentuniqueinformations the trainingcontentuniqueinformations
	 */
	@Override
	public void cacheResult(
		List<trainingcontentuniqueinformation> trainingcontentuniqueinformations) {
		for (trainingcontentuniqueinformation trainingcontentuniqueinformation : trainingcontentuniqueinformations) {
			if (entityCache.getResult(
						trainingcontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
						trainingcontentuniqueinformationImpl.class,
						trainingcontentuniqueinformation.getPrimaryKey()) == null) {
				cacheResult(trainingcontentuniqueinformation);
			}
			else {
				trainingcontentuniqueinformation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all trainingcontentuniqueinformations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(trainingcontentuniqueinformationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the trainingcontentuniqueinformation.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		trainingcontentuniqueinformation trainingcontentuniqueinformation) {
		entityCache.removeResult(trainingcontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			trainingcontentuniqueinformationImpl.class,
			trainingcontentuniqueinformation.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<trainingcontentuniqueinformation> trainingcontentuniqueinformations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (trainingcontentuniqueinformation trainingcontentuniqueinformation : trainingcontentuniqueinformations) {
			entityCache.removeResult(trainingcontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
				trainingcontentuniqueinformationImpl.class,
				trainingcontentuniqueinformation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new trainingcontentuniqueinformation with the primary key. Does not add the trainingcontentuniqueinformation to the database.
	 *
	 * @param id the primary key for the new trainingcontentuniqueinformation
	 * @return the new trainingcontentuniqueinformation
	 */
	@Override
	public trainingcontentuniqueinformation create(long id) {
		trainingcontentuniqueinformation trainingcontentuniqueinformation = new trainingcontentuniqueinformationImpl();

		trainingcontentuniqueinformation.setNew(true);
		trainingcontentuniqueinformation.setPrimaryKey(id);

		return trainingcontentuniqueinformation;
	}

	/**
	 * Removes the trainingcontentuniqueinformation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the trainingcontentuniqueinformation
	 * @return the trainingcontentuniqueinformation that was removed
	 * @throws NoSuchtrainingcontentuniqueinformationException if a trainingcontentuniqueinformation with the primary key could not be found
	 */
	@Override
	public trainingcontentuniqueinformation remove(long id)
		throws NoSuchtrainingcontentuniqueinformationException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the trainingcontentuniqueinformation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the trainingcontentuniqueinformation
	 * @return the trainingcontentuniqueinformation that was removed
	 * @throws NoSuchtrainingcontentuniqueinformationException if a trainingcontentuniqueinformation with the primary key could not be found
	 */
	@Override
	public trainingcontentuniqueinformation remove(Serializable primaryKey)
		throws NoSuchtrainingcontentuniqueinformationException {
		Session session = null;

		try {
			session = openSession();

			trainingcontentuniqueinformation trainingcontentuniqueinformation = (trainingcontentuniqueinformation)session.get(trainingcontentuniqueinformationImpl.class,
					primaryKey);

			if (trainingcontentuniqueinformation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchtrainingcontentuniqueinformationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(trainingcontentuniqueinformation);
		}
		catch (NoSuchtrainingcontentuniqueinformationException nsee) {
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
	protected trainingcontentuniqueinformation removeImpl(
		trainingcontentuniqueinformation trainingcontentuniqueinformation) {
		trainingcontentuniqueinformation = toUnwrappedModel(trainingcontentuniqueinformation);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(trainingcontentuniqueinformation)) {
				trainingcontentuniqueinformation = (trainingcontentuniqueinformation)session.get(trainingcontentuniqueinformationImpl.class,
						trainingcontentuniqueinformation.getPrimaryKeyObj());
			}

			if (trainingcontentuniqueinformation != null) {
				session.delete(trainingcontentuniqueinformation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (trainingcontentuniqueinformation != null) {
			clearCache(trainingcontentuniqueinformation);
		}

		return trainingcontentuniqueinformation;
	}

	@Override
	public trainingcontentuniqueinformation updateImpl(
		trainingcontentuniqueinformation trainingcontentuniqueinformation) {
		trainingcontentuniqueinformation = toUnwrappedModel(trainingcontentuniqueinformation);

		boolean isNew = trainingcontentuniqueinformation.isNew();

		trainingcontentuniqueinformationModelImpl trainingcontentuniqueinformationModelImpl =
			(trainingcontentuniqueinformationModelImpl)trainingcontentuniqueinformation;

		Session session = null;

		try {
			session = openSession();

			if (trainingcontentuniqueinformation.isNew()) {
				session.save(trainingcontentuniqueinformation);

				trainingcontentuniqueinformation.setNew(false);
			}
			else {
				trainingcontentuniqueinformation = (trainingcontentuniqueinformation)session.merge(trainingcontentuniqueinformation);
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
				!trainingcontentuniqueinformationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((trainingcontentuniqueinformationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						trainingcontentuniqueinformationModelImpl.getOriginalContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID,
					args);

				args = new Object[] {
						trainingcontentuniqueinformationModelImpl.getContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID,
					args);
			}

			if ((trainingcontentuniqueinformationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRAININGID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						trainingcontentuniqueinformationModelImpl.getOriginalTraining_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TRAININGID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRAININGID,
					args);

				args = new Object[] {
						trainingcontentuniqueinformationModelImpl.getTraining_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TRAININGID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRAININGID,
					args);
			}
		}

		entityCache.putResult(trainingcontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			trainingcontentuniqueinformationImpl.class,
			trainingcontentuniqueinformation.getPrimaryKey(),
			trainingcontentuniqueinformation, false);

		trainingcontentuniqueinformation.resetOriginalValues();

		return trainingcontentuniqueinformation;
	}

	protected trainingcontentuniqueinformation toUnwrappedModel(
		trainingcontentuniqueinformation trainingcontentuniqueinformation) {
		if (trainingcontentuniqueinformation instanceof trainingcontentuniqueinformationImpl) {
			return trainingcontentuniqueinformation;
		}

		trainingcontentuniqueinformationImpl trainingcontentuniqueinformationImpl =
			new trainingcontentuniqueinformationImpl();

		trainingcontentuniqueinformationImpl.setNew(trainingcontentuniqueinformation.isNew());
		trainingcontentuniqueinformationImpl.setPrimaryKey(trainingcontentuniqueinformation.getPrimaryKey());

		trainingcontentuniqueinformationImpl.setId(trainingcontentuniqueinformation.getId());
		trainingcontentuniqueinformationImpl.setTraining_id(trainingcontentuniqueinformation.getTraining_id());
		trainingcontentuniqueinformationImpl.setContent_id(trainingcontentuniqueinformation.getContent_id());
		trainingcontentuniqueinformationImpl.setStatus(trainingcontentuniqueinformation.getStatus());
		trainingcontentuniqueinformationImpl.setUdflag(trainingcontentuniqueinformation.getUdflag());
		trainingcontentuniqueinformationImpl.setContent_type(trainingcontentuniqueinformation.getContent_type());
		trainingcontentuniqueinformationImpl.setNotification_text(trainingcontentuniqueinformation.getNotification_text());
		trainingcontentuniqueinformationImpl.setPageurl(trainingcontentuniqueinformation.getPageurl());

		return trainingcontentuniqueinformationImpl;
	}

	/**
	 * Returns the trainingcontentuniqueinformation with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the trainingcontentuniqueinformation
	 * @return the trainingcontentuniqueinformation
	 * @throws NoSuchtrainingcontentuniqueinformationException if a trainingcontentuniqueinformation with the primary key could not be found
	 */
	@Override
	public trainingcontentuniqueinformation findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchtrainingcontentuniqueinformationException {
		trainingcontentuniqueinformation trainingcontentuniqueinformation = fetchByPrimaryKey(primaryKey);

		if (trainingcontentuniqueinformation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchtrainingcontentuniqueinformationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return trainingcontentuniqueinformation;
	}

	/**
	 * Returns the trainingcontentuniqueinformation with the primary key or throws a {@link NoSuchtrainingcontentuniqueinformationException} if it could not be found.
	 *
	 * @param id the primary key of the trainingcontentuniqueinformation
	 * @return the trainingcontentuniqueinformation
	 * @throws NoSuchtrainingcontentuniqueinformationException if a trainingcontentuniqueinformation with the primary key could not be found
	 */
	@Override
	public trainingcontentuniqueinformation findByPrimaryKey(long id)
		throws NoSuchtrainingcontentuniqueinformationException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the trainingcontentuniqueinformation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the trainingcontentuniqueinformation
	 * @return the trainingcontentuniqueinformation, or <code>null</code> if a trainingcontentuniqueinformation with the primary key could not be found
	 */
	@Override
	public trainingcontentuniqueinformation fetchByPrimaryKey(
		Serializable primaryKey) {
		trainingcontentuniqueinformation trainingcontentuniqueinformation = (trainingcontentuniqueinformation)entityCache.getResult(trainingcontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
				trainingcontentuniqueinformationImpl.class, primaryKey);

		if (trainingcontentuniqueinformation == _nulltrainingcontentuniqueinformation) {
			return null;
		}

		if (trainingcontentuniqueinformation == null) {
			Session session = null;

			try {
				session = openSession();

				trainingcontentuniqueinformation = (trainingcontentuniqueinformation)session.get(trainingcontentuniqueinformationImpl.class,
						primaryKey);

				if (trainingcontentuniqueinformation != null) {
					cacheResult(trainingcontentuniqueinformation);
				}
				else {
					entityCache.putResult(trainingcontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
						trainingcontentuniqueinformationImpl.class, primaryKey,
						_nulltrainingcontentuniqueinformation);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(trainingcontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
					trainingcontentuniqueinformationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return trainingcontentuniqueinformation;
	}

	/**
	 * Returns the trainingcontentuniqueinformation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the trainingcontentuniqueinformation
	 * @return the trainingcontentuniqueinformation, or <code>null</code> if a trainingcontentuniqueinformation with the primary key could not be found
	 */
	@Override
	public trainingcontentuniqueinformation fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, trainingcontentuniqueinformation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, trainingcontentuniqueinformation> map = new HashMap<Serializable, trainingcontentuniqueinformation>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			trainingcontentuniqueinformation trainingcontentuniqueinformation = fetchByPrimaryKey(primaryKey);

			if (trainingcontentuniqueinformation != null) {
				map.put(primaryKey, trainingcontentuniqueinformation);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			trainingcontentuniqueinformation trainingcontentuniqueinformation = (trainingcontentuniqueinformation)entityCache.getResult(trainingcontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
					trainingcontentuniqueinformationImpl.class, primaryKey);

			if (trainingcontentuniqueinformation == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, trainingcontentuniqueinformation);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TRAININGCONTENTUNIQUEINFORMATION_WHERE_PKS_IN);

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

			for (trainingcontentuniqueinformation trainingcontentuniqueinformation : (List<trainingcontentuniqueinformation>)q.list()) {
				map.put(trainingcontentuniqueinformation.getPrimaryKeyObj(),
					trainingcontentuniqueinformation);

				cacheResult(trainingcontentuniqueinformation);

				uncachedPrimaryKeys.remove(trainingcontentuniqueinformation.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(trainingcontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
					trainingcontentuniqueinformationImpl.class, primaryKey,
					_nulltrainingcontentuniqueinformation);
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
	 * Returns all the trainingcontentuniqueinformations.
	 *
	 * @return the trainingcontentuniqueinformations
	 */
	@Override
	public List<trainingcontentuniqueinformation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the trainingcontentuniqueinformations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of trainingcontentuniqueinformations
	 * @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	 * @return the range of trainingcontentuniqueinformations
	 */
	@Override
	public List<trainingcontentuniqueinformation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the trainingcontentuniqueinformations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of trainingcontentuniqueinformations
	 * @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of trainingcontentuniqueinformations
	 */
	@Override
	public List<trainingcontentuniqueinformation> findAll(int start, int end,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the trainingcontentuniqueinformations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of trainingcontentuniqueinformations
	 * @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of trainingcontentuniqueinformations
	 */
	@Override
	public List<trainingcontentuniqueinformation> findAll(int start, int end,
		OrderByComparator<trainingcontentuniqueinformation> orderByComparator,
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

		List<trainingcontentuniqueinformation> list = null;

		if (retrieveFromCache) {
			list = (List<trainingcontentuniqueinformation>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TRAININGCONTENTUNIQUEINFORMATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TRAININGCONTENTUNIQUEINFORMATION;

				if (pagination) {
					sql = sql.concat(trainingcontentuniqueinformationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<trainingcontentuniqueinformation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<trainingcontentuniqueinformation>)QueryUtil.list(q,
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
	 * Removes all the trainingcontentuniqueinformations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (trainingcontentuniqueinformation trainingcontentuniqueinformation : findAll()) {
			remove(trainingcontentuniqueinformation);
		}
	}

	/**
	 * Returns the number of trainingcontentuniqueinformations.
	 *
	 * @return the number of trainingcontentuniqueinformations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TRAININGCONTENTUNIQUEINFORMATION);

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
		return trainingcontentuniqueinformationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the trainingcontentuniqueinformation persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(trainingcontentuniqueinformationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_TRAININGCONTENTUNIQUEINFORMATION = "SELECT trainingcontentuniqueinformation FROM trainingcontentuniqueinformation trainingcontentuniqueinformation";
	private static final String _SQL_SELECT_TRAININGCONTENTUNIQUEINFORMATION_WHERE_PKS_IN =
		"SELECT trainingcontentuniqueinformation FROM trainingcontentuniqueinformation trainingcontentuniqueinformation WHERE id_ IN (";
	private static final String _SQL_SELECT_TRAININGCONTENTUNIQUEINFORMATION_WHERE =
		"SELECT trainingcontentuniqueinformation FROM trainingcontentuniqueinformation trainingcontentuniqueinformation WHERE ";
	private static final String _SQL_COUNT_TRAININGCONTENTUNIQUEINFORMATION = "SELECT COUNT(trainingcontentuniqueinformation) FROM trainingcontentuniqueinformation trainingcontentuniqueinformation";
	private static final String _SQL_COUNT_TRAININGCONTENTUNIQUEINFORMATION_WHERE =
		"SELECT COUNT(trainingcontentuniqueinformation) FROM trainingcontentuniqueinformation trainingcontentuniqueinformation WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "trainingcontentuniqueinformation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No trainingcontentuniqueinformation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No trainingcontentuniqueinformation exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(trainingcontentuniqueinformationPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final trainingcontentuniqueinformation _nulltrainingcontentuniqueinformation =
		new trainingcontentuniqueinformationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<trainingcontentuniqueinformation> toCacheModel() {
				return _nulltrainingcontentuniqueinformationCacheModel;
			}
		};

	private static final CacheModel<trainingcontentuniqueinformation> _nulltrainingcontentuniqueinformationCacheModel =
		new CacheModel<trainingcontentuniqueinformation>() {
			@Override
			public trainingcontentuniqueinformation toEntityModel() {
				return _nulltrainingcontentuniqueinformation;
			}
		};
}