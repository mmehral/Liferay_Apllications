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

import com.chola.calendar.exception.NoSuchcorporatecontentuniqueinformationException;
import com.chola.calendar.model.corporatecontentuniqueinformation;
import com.chola.calendar.model.impl.corporatecontentuniqueinformationImpl;
import com.chola.calendar.model.impl.corporatecontentuniqueinformationModelImpl;
import com.chola.calendar.service.persistence.corporatecontentuniqueinformationPersistence;

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
 * The persistence implementation for the corporatecontentuniqueinformation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see corporatecontentuniqueinformationPersistence
 * @see com.chola.calendar.service.persistence.corporatecontentuniqueinformationUtil
 * @generated
 */
@ProviderType
public class corporatecontentuniqueinformationPersistenceImpl
	extends BasePersistenceImpl<corporatecontentuniqueinformation>
	implements corporatecontentuniqueinformationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link corporatecontentuniqueinformationUtil} to access the corporatecontentuniqueinformation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = corporatecontentuniqueinformationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(corporatecontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			corporatecontentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			corporatecontentuniqueinformationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(corporatecontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			corporatecontentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			corporatecontentuniqueinformationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(corporatecontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			corporatecontentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENTID =
		new FinderPath(corporatecontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			corporatecontentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			corporatecontentuniqueinformationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCONTENTID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID =
		new FinderPath(corporatecontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			corporatecontentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			corporatecontentuniqueinformationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCONTENTID",
			new String[] { Long.class.getName() },
			corporatecontentuniqueinformationModelImpl.CONTENT_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTENTID = new FinderPath(corporatecontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			corporatecontentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCONTENTID", new String[] { Long.class.getName() });

	/**
	 * Returns all the corporatecontentuniqueinformations where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the matching corporatecontentuniqueinformations
	 */
	@Override
	public List<corporatecontentuniqueinformation> findByCONTENTID(
		long content_id) {
		return findByCONTENTID(content_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the corporatecontentuniqueinformations where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of corporatecontentuniqueinformations
	 * @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	 * @return the range of matching corporatecontentuniqueinformations
	 */
	@Override
	public List<corporatecontentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end) {
		return findByCONTENTID(content_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the corporatecontentuniqueinformations where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of corporatecontentuniqueinformations
	 * @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching corporatecontentuniqueinformations
	 */
	@Override
	public List<corporatecontentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator) {
		return findByCONTENTID(content_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the corporatecontentuniqueinformations where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of corporatecontentuniqueinformations
	 * @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching corporatecontentuniqueinformations
	 */
	@Override
	public List<corporatecontentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator,
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

		List<corporatecontentuniqueinformation> list = null;

		if (retrieveFromCache) {
			list = (List<corporatecontentuniqueinformation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (corporatecontentuniqueinformation corporatecontentuniqueinformation : list) {
					if ((content_id != corporatecontentuniqueinformation.getContent_id())) {
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

			query.append(_SQL_SELECT_CORPORATECONTENTUNIQUEINFORMATION_WHERE);

			query.append(_FINDER_COLUMN_CONTENTID_CONTENT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(corporatecontentuniqueinformationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(content_id);

				if (!pagination) {
					list = (List<corporatecontentuniqueinformation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<corporatecontentuniqueinformation>)QueryUtil.list(q,
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
	 * Returns the first corporatecontentuniqueinformation in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching corporatecontentuniqueinformation
	 * @throws NoSuchcorporatecontentuniqueinformationException if a matching corporatecontentuniqueinformation could not be found
	 */
	@Override
	public corporatecontentuniqueinformation findByCONTENTID_First(
		long content_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator)
		throws NoSuchcorporatecontentuniqueinformationException {
		corporatecontentuniqueinformation corporatecontentuniqueinformation = fetchByCONTENTID_First(content_id,
				orderByComparator);

		if (corporatecontentuniqueinformation != null) {
			return corporatecontentuniqueinformation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcorporatecontentuniqueinformationException(msg.toString());
	}

	/**
	 * Returns the first corporatecontentuniqueinformation in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching corporatecontentuniqueinformation, or <code>null</code> if a matching corporatecontentuniqueinformation could not be found
	 */
	@Override
	public corporatecontentuniqueinformation fetchByCONTENTID_First(
		long content_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator) {
		List<corporatecontentuniqueinformation> list = findByCONTENTID(content_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last corporatecontentuniqueinformation in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching corporatecontentuniqueinformation
	 * @throws NoSuchcorporatecontentuniqueinformationException if a matching corporatecontentuniqueinformation could not be found
	 */
	@Override
	public corporatecontentuniqueinformation findByCONTENTID_Last(
		long content_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator)
		throws NoSuchcorporatecontentuniqueinformationException {
		corporatecontentuniqueinformation corporatecontentuniqueinformation = fetchByCONTENTID_Last(content_id,
				orderByComparator);

		if (corporatecontentuniqueinformation != null) {
			return corporatecontentuniqueinformation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcorporatecontentuniqueinformationException(msg.toString());
	}

	/**
	 * Returns the last corporatecontentuniqueinformation in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching corporatecontentuniqueinformation, or <code>null</code> if a matching corporatecontentuniqueinformation could not be found
	 */
	@Override
	public corporatecontentuniqueinformation fetchByCONTENTID_Last(
		long content_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator) {
		int count = countByCONTENTID(content_id);

		if (count == 0) {
			return null;
		}

		List<corporatecontentuniqueinformation> list = findByCONTENTID(content_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the corporatecontentuniqueinformations before and after the current corporatecontentuniqueinformation in the ordered set where content_id = &#63;.
	 *
	 * @param id the primary key of the current corporatecontentuniqueinformation
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next corporatecontentuniqueinformation
	 * @throws NoSuchcorporatecontentuniqueinformationException if a corporatecontentuniqueinformation with the primary key could not be found
	 */
	@Override
	public corporatecontentuniqueinformation[] findByCONTENTID_PrevAndNext(
		long id, long content_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator)
		throws NoSuchcorporatecontentuniqueinformationException {
		corporatecontentuniqueinformation corporatecontentuniqueinformation = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			corporatecontentuniqueinformation[] array = new corporatecontentuniqueinformationImpl[3];

			array[0] = getByCONTENTID_PrevAndNext(session,
					corporatecontentuniqueinformation, content_id,
					orderByComparator, true);

			array[1] = corporatecontentuniqueinformation;

			array[2] = getByCONTENTID_PrevAndNext(session,
					corporatecontentuniqueinformation, content_id,
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

	protected corporatecontentuniqueinformation getByCONTENTID_PrevAndNext(
		Session session,
		corporatecontentuniqueinformation corporatecontentuniqueinformation,
		long content_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator,
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

		query.append(_SQL_SELECT_CORPORATECONTENTUNIQUEINFORMATION_WHERE);

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
			query.append(corporatecontentuniqueinformationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(content_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(corporatecontentuniqueinformation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<corporatecontentuniqueinformation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the corporatecontentuniqueinformations where content_id = &#63; from the database.
	 *
	 * @param content_id the content_id
	 */
	@Override
	public void removeByCONTENTID(long content_id) {
		for (corporatecontentuniqueinformation corporatecontentuniqueinformation : findByCONTENTID(
				content_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(corporatecontentuniqueinformation);
		}
	}

	/**
	 * Returns the number of corporatecontentuniqueinformations where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the number of matching corporatecontentuniqueinformations
	 */
	@Override
	public int countByCONTENTID(long content_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTENTID;

		Object[] finderArgs = new Object[] { content_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CORPORATECONTENTUNIQUEINFORMATION_WHERE);

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

	private static final String _FINDER_COLUMN_CONTENTID_CONTENT_ID_2 = "corporatecontentuniqueinformation.content_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATEEVENTID =
		new FinderPath(corporatecontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			corporatecontentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			corporatecontentuniqueinformationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCORPORATEEVENTID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATEEVENTID =
		new FinderPath(corporatecontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			corporatecontentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			corporatecontentuniqueinformationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCORPORATEEVENTID", new String[] { Long.class.getName() },
			corporatecontentuniqueinformationModelImpl.CORPORATEVENT_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CORPORATEEVENTID = new FinderPath(corporatecontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			corporatecontentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCORPORATEEVENTID", new String[] { Long.class.getName() });

	/**
	 * Returns all the corporatecontentuniqueinformations where corporatevent_id = &#63;.
	 *
	 * @param corporatevent_id the corporatevent_id
	 * @return the matching corporatecontentuniqueinformations
	 */
	@Override
	public List<corporatecontentuniqueinformation> findByCORPORATEEVENTID(
		long corporatevent_id) {
		return findByCORPORATEEVENTID(corporatevent_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the corporatecontentuniqueinformations where corporatevent_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporatevent_id the corporatevent_id
	 * @param start the lower bound of the range of corporatecontentuniqueinformations
	 * @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	 * @return the range of matching corporatecontentuniqueinformations
	 */
	@Override
	public List<corporatecontentuniqueinformation> findByCORPORATEEVENTID(
		long corporatevent_id, int start, int end) {
		return findByCORPORATEEVENTID(corporatevent_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the corporatecontentuniqueinformations where corporatevent_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporatevent_id the corporatevent_id
	 * @param start the lower bound of the range of corporatecontentuniqueinformations
	 * @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching corporatecontentuniqueinformations
	 */
	@Override
	public List<corporatecontentuniqueinformation> findByCORPORATEEVENTID(
		long corporatevent_id, int start, int end,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator) {
		return findByCORPORATEEVENTID(corporatevent_id, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the corporatecontentuniqueinformations where corporatevent_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporatevent_id the corporatevent_id
	 * @param start the lower bound of the range of corporatecontentuniqueinformations
	 * @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching corporatecontentuniqueinformations
	 */
	@Override
	public List<corporatecontentuniqueinformation> findByCORPORATEEVENTID(
		long corporatevent_id, int start, int end,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATEEVENTID;
			finderArgs = new Object[] { corporatevent_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATEEVENTID;
			finderArgs = new Object[] {
					corporatevent_id,
					
					start, end, orderByComparator
				};
		}

		List<corporatecontentuniqueinformation> list = null;

		if (retrieveFromCache) {
			list = (List<corporatecontentuniqueinformation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (corporatecontentuniqueinformation corporatecontentuniqueinformation : list) {
					if ((corporatevent_id != corporatecontentuniqueinformation.getCorporatevent_id())) {
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

			query.append(_SQL_SELECT_CORPORATECONTENTUNIQUEINFORMATION_WHERE);

			query.append(_FINDER_COLUMN_CORPORATEEVENTID_CORPORATEVENT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(corporatecontentuniqueinformationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(corporatevent_id);

				if (!pagination) {
					list = (List<corporatecontentuniqueinformation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<corporatecontentuniqueinformation>)QueryUtil.list(q,
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
	 * Returns the first corporatecontentuniqueinformation in the ordered set where corporatevent_id = &#63;.
	 *
	 * @param corporatevent_id the corporatevent_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching corporatecontentuniqueinformation
	 * @throws NoSuchcorporatecontentuniqueinformationException if a matching corporatecontentuniqueinformation could not be found
	 */
	@Override
	public corporatecontentuniqueinformation findByCORPORATEEVENTID_First(
		long corporatevent_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator)
		throws NoSuchcorporatecontentuniqueinformationException {
		corporatecontentuniqueinformation corporatecontentuniqueinformation = fetchByCORPORATEEVENTID_First(corporatevent_id,
				orderByComparator);

		if (corporatecontentuniqueinformation != null) {
			return corporatecontentuniqueinformation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporatevent_id=");
		msg.append(corporatevent_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcorporatecontentuniqueinformationException(msg.toString());
	}

	/**
	 * Returns the first corporatecontentuniqueinformation in the ordered set where corporatevent_id = &#63;.
	 *
	 * @param corporatevent_id the corporatevent_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching corporatecontentuniqueinformation, or <code>null</code> if a matching corporatecontentuniqueinformation could not be found
	 */
	@Override
	public corporatecontentuniqueinformation fetchByCORPORATEEVENTID_First(
		long corporatevent_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator) {
		List<corporatecontentuniqueinformation> list = findByCORPORATEEVENTID(corporatevent_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last corporatecontentuniqueinformation in the ordered set where corporatevent_id = &#63;.
	 *
	 * @param corporatevent_id the corporatevent_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching corporatecontentuniqueinformation
	 * @throws NoSuchcorporatecontentuniqueinformationException if a matching corporatecontentuniqueinformation could not be found
	 */
	@Override
	public corporatecontentuniqueinformation findByCORPORATEEVENTID_Last(
		long corporatevent_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator)
		throws NoSuchcorporatecontentuniqueinformationException {
		corporatecontentuniqueinformation corporatecontentuniqueinformation = fetchByCORPORATEEVENTID_Last(corporatevent_id,
				orderByComparator);

		if (corporatecontentuniqueinformation != null) {
			return corporatecontentuniqueinformation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporatevent_id=");
		msg.append(corporatevent_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcorporatecontentuniqueinformationException(msg.toString());
	}

	/**
	 * Returns the last corporatecontentuniqueinformation in the ordered set where corporatevent_id = &#63;.
	 *
	 * @param corporatevent_id the corporatevent_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching corporatecontentuniqueinformation, or <code>null</code> if a matching corporatecontentuniqueinformation could not be found
	 */
	@Override
	public corporatecontentuniqueinformation fetchByCORPORATEEVENTID_Last(
		long corporatevent_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator) {
		int count = countByCORPORATEEVENTID(corporatevent_id);

		if (count == 0) {
			return null;
		}

		List<corporatecontentuniqueinformation> list = findByCORPORATEEVENTID(corporatevent_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the corporatecontentuniqueinformations before and after the current corporatecontentuniqueinformation in the ordered set where corporatevent_id = &#63;.
	 *
	 * @param id the primary key of the current corporatecontentuniqueinformation
	 * @param corporatevent_id the corporatevent_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next corporatecontentuniqueinformation
	 * @throws NoSuchcorporatecontentuniqueinformationException if a corporatecontentuniqueinformation with the primary key could not be found
	 */
	@Override
	public corporatecontentuniqueinformation[] findByCORPORATEEVENTID_PrevAndNext(
		long id, long corporatevent_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator)
		throws NoSuchcorporatecontentuniqueinformationException {
		corporatecontentuniqueinformation corporatecontentuniqueinformation = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			corporatecontentuniqueinformation[] array = new corporatecontentuniqueinformationImpl[3];

			array[0] = getByCORPORATEEVENTID_PrevAndNext(session,
					corporatecontentuniqueinformation, corporatevent_id,
					orderByComparator, true);

			array[1] = corporatecontentuniqueinformation;

			array[2] = getByCORPORATEEVENTID_PrevAndNext(session,
					corporatecontentuniqueinformation, corporatevent_id,
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

	protected corporatecontentuniqueinformation getByCORPORATEEVENTID_PrevAndNext(
		Session session,
		corporatecontentuniqueinformation corporatecontentuniqueinformation,
		long corporatevent_id,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator,
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

		query.append(_SQL_SELECT_CORPORATECONTENTUNIQUEINFORMATION_WHERE);

		query.append(_FINDER_COLUMN_CORPORATEEVENTID_CORPORATEVENT_ID_2);

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
			query.append(corporatecontentuniqueinformationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(corporatevent_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(corporatecontentuniqueinformation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<corporatecontentuniqueinformation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the corporatecontentuniqueinformations where corporatevent_id = &#63; from the database.
	 *
	 * @param corporatevent_id the corporatevent_id
	 */
	@Override
	public void removeByCORPORATEEVENTID(long corporatevent_id) {
		for (corporatecontentuniqueinformation corporatecontentuniqueinformation : findByCORPORATEEVENTID(
				corporatevent_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(corporatecontentuniqueinformation);
		}
	}

	/**
	 * Returns the number of corporatecontentuniqueinformations where corporatevent_id = &#63;.
	 *
	 * @param corporatevent_id the corporatevent_id
	 * @return the number of matching corporatecontentuniqueinformations
	 */
	@Override
	public int countByCORPORATEEVENTID(long corporatevent_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CORPORATEEVENTID;

		Object[] finderArgs = new Object[] { corporatevent_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CORPORATECONTENTUNIQUEINFORMATION_WHERE);

			query.append(_FINDER_COLUMN_CORPORATEEVENTID_CORPORATEVENT_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(corporatevent_id);

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

	private static final String _FINDER_COLUMN_CORPORATEEVENTID_CORPORATEVENT_ID_2 =
		"corporatecontentuniqueinformation.corporatevent_id = ?";

	public corporatecontentuniqueinformationPersistenceImpl() {
		setModelClass(corporatecontentuniqueinformation.class);
	}

	/**
	 * Caches the corporatecontentuniqueinformation in the entity cache if it is enabled.
	 *
	 * @param corporatecontentuniqueinformation the corporatecontentuniqueinformation
	 */
	@Override
	public void cacheResult(
		corporatecontentuniqueinformation corporatecontentuniqueinformation) {
		entityCache.putResult(corporatecontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			corporatecontentuniqueinformationImpl.class,
			corporatecontentuniqueinformation.getPrimaryKey(),
			corporatecontentuniqueinformation);

		corporatecontentuniqueinformation.resetOriginalValues();
	}

	/**
	 * Caches the corporatecontentuniqueinformations in the entity cache if it is enabled.
	 *
	 * @param corporatecontentuniqueinformations the corporatecontentuniqueinformations
	 */
	@Override
	public void cacheResult(
		List<corporatecontentuniqueinformation> corporatecontentuniqueinformations) {
		for (corporatecontentuniqueinformation corporatecontentuniqueinformation : corporatecontentuniqueinformations) {
			if (entityCache.getResult(
						corporatecontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
						corporatecontentuniqueinformationImpl.class,
						corporatecontentuniqueinformation.getPrimaryKey()) == null) {
				cacheResult(corporatecontentuniqueinformation);
			}
			else {
				corporatecontentuniqueinformation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all corporatecontentuniqueinformations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(corporatecontentuniqueinformationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the corporatecontentuniqueinformation.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		corporatecontentuniqueinformation corporatecontentuniqueinformation) {
		entityCache.removeResult(corporatecontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			corporatecontentuniqueinformationImpl.class,
			corporatecontentuniqueinformation.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<corporatecontentuniqueinformation> corporatecontentuniqueinformations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (corporatecontentuniqueinformation corporatecontentuniqueinformation : corporatecontentuniqueinformations) {
			entityCache.removeResult(corporatecontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
				corporatecontentuniqueinformationImpl.class,
				corporatecontentuniqueinformation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new corporatecontentuniqueinformation with the primary key. Does not add the corporatecontentuniqueinformation to the database.
	 *
	 * @param id the primary key for the new corporatecontentuniqueinformation
	 * @return the new corporatecontentuniqueinformation
	 */
	@Override
	public corporatecontentuniqueinformation create(long id) {
		corporatecontentuniqueinformation corporatecontentuniqueinformation = new corporatecontentuniqueinformationImpl();

		corporatecontentuniqueinformation.setNew(true);
		corporatecontentuniqueinformation.setPrimaryKey(id);

		return corporatecontentuniqueinformation;
	}

	/**
	 * Removes the corporatecontentuniqueinformation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the corporatecontentuniqueinformation
	 * @return the corporatecontentuniqueinformation that was removed
	 * @throws NoSuchcorporatecontentuniqueinformationException if a corporatecontentuniqueinformation with the primary key could not be found
	 */
	@Override
	public corporatecontentuniqueinformation remove(long id)
		throws NoSuchcorporatecontentuniqueinformationException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the corporatecontentuniqueinformation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the corporatecontentuniqueinformation
	 * @return the corporatecontentuniqueinformation that was removed
	 * @throws NoSuchcorporatecontentuniqueinformationException if a corporatecontentuniqueinformation with the primary key could not be found
	 */
	@Override
	public corporatecontentuniqueinformation remove(Serializable primaryKey)
		throws NoSuchcorporatecontentuniqueinformationException {
		Session session = null;

		try {
			session = openSession();

			corporatecontentuniqueinformation corporatecontentuniqueinformation = (corporatecontentuniqueinformation)session.get(corporatecontentuniqueinformationImpl.class,
					primaryKey);

			if (corporatecontentuniqueinformation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcorporatecontentuniqueinformationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(corporatecontentuniqueinformation);
		}
		catch (NoSuchcorporatecontentuniqueinformationException nsee) {
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
	protected corporatecontentuniqueinformation removeImpl(
		corporatecontentuniqueinformation corporatecontentuniqueinformation) {
		corporatecontentuniqueinformation = toUnwrappedModel(corporatecontentuniqueinformation);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(corporatecontentuniqueinformation)) {
				corporatecontentuniqueinformation = (corporatecontentuniqueinformation)session.get(corporatecontentuniqueinformationImpl.class,
						corporatecontentuniqueinformation.getPrimaryKeyObj());
			}

			if (corporatecontentuniqueinformation != null) {
				session.delete(corporatecontentuniqueinformation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (corporatecontentuniqueinformation != null) {
			clearCache(corporatecontentuniqueinformation);
		}

		return corporatecontentuniqueinformation;
	}

	@Override
	public corporatecontentuniqueinformation updateImpl(
		corporatecontentuniqueinformation corporatecontentuniqueinformation) {
		corporatecontentuniqueinformation = toUnwrappedModel(corporatecontentuniqueinformation);

		boolean isNew = corporatecontentuniqueinformation.isNew();

		corporatecontentuniqueinformationModelImpl corporatecontentuniqueinformationModelImpl =
			(corporatecontentuniqueinformationModelImpl)corporatecontentuniqueinformation;

		Session session = null;

		try {
			session = openSession();

			if (corporatecontentuniqueinformation.isNew()) {
				session.save(corporatecontentuniqueinformation);

				corporatecontentuniqueinformation.setNew(false);
			}
			else {
				corporatecontentuniqueinformation = (corporatecontentuniqueinformation)session.merge(corporatecontentuniqueinformation);
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
				!corporatecontentuniqueinformationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((corporatecontentuniqueinformationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						corporatecontentuniqueinformationModelImpl.getOriginalContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID,
					args);

				args = new Object[] {
						corporatecontentuniqueinformationModelImpl.getContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID,
					args);
			}

			if ((corporatecontentuniqueinformationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATEEVENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						corporatecontentuniqueinformationModelImpl.getOriginalCorporatevent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATEEVENTID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATEEVENTID,
					args);

				args = new Object[] {
						corporatecontentuniqueinformationModelImpl.getCorporatevent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CORPORATEEVENTID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATEEVENTID,
					args);
			}
		}

		entityCache.putResult(corporatecontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			corporatecontentuniqueinformationImpl.class,
			corporatecontentuniqueinformation.getPrimaryKey(),
			corporatecontentuniqueinformation, false);

		corporatecontentuniqueinformation.resetOriginalValues();

		return corporatecontentuniqueinformation;
	}

	protected corporatecontentuniqueinformation toUnwrappedModel(
		corporatecontentuniqueinformation corporatecontentuniqueinformation) {
		if (corporatecontentuniqueinformation instanceof corporatecontentuniqueinformationImpl) {
			return corporatecontentuniqueinformation;
		}

		corporatecontentuniqueinformationImpl corporatecontentuniqueinformationImpl =
			new corporatecontentuniqueinformationImpl();

		corporatecontentuniqueinformationImpl.setNew(corporatecontentuniqueinformation.isNew());
		corporatecontentuniqueinformationImpl.setPrimaryKey(corporatecontentuniqueinformation.getPrimaryKey());

		corporatecontentuniqueinformationImpl.setId(corporatecontentuniqueinformation.getId());
		corporatecontentuniqueinformationImpl.setCorporatevent_id(corporatecontentuniqueinformation.getCorporatevent_id());
		corporatecontentuniqueinformationImpl.setContent_id(corporatecontentuniqueinformation.getContent_id());
		corporatecontentuniqueinformationImpl.setStatus(corporatecontentuniqueinformation.getStatus());
		corporatecontentuniqueinformationImpl.setUdflag(corporatecontentuniqueinformation.getUdflag());
		corporatecontentuniqueinformationImpl.setContent_type(corporatecontentuniqueinformation.getContent_type());
		corporatecontentuniqueinformationImpl.setNotification_text(corporatecontentuniqueinformation.getNotification_text());
		corporatecontentuniqueinformationImpl.setPageurl(corporatecontentuniqueinformation.getPageurl());

		return corporatecontentuniqueinformationImpl;
	}

	/**
	 * Returns the corporatecontentuniqueinformation with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the corporatecontentuniqueinformation
	 * @return the corporatecontentuniqueinformation
	 * @throws NoSuchcorporatecontentuniqueinformationException if a corporatecontentuniqueinformation with the primary key could not be found
	 */
	@Override
	public corporatecontentuniqueinformation findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchcorporatecontentuniqueinformationException {
		corporatecontentuniqueinformation corporatecontentuniqueinformation = fetchByPrimaryKey(primaryKey);

		if (corporatecontentuniqueinformation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcorporatecontentuniqueinformationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return corporatecontentuniqueinformation;
	}

	/**
	 * Returns the corporatecontentuniqueinformation with the primary key or throws a {@link NoSuchcorporatecontentuniqueinformationException} if it could not be found.
	 *
	 * @param id the primary key of the corporatecontentuniqueinformation
	 * @return the corporatecontentuniqueinformation
	 * @throws NoSuchcorporatecontentuniqueinformationException if a corporatecontentuniqueinformation with the primary key could not be found
	 */
	@Override
	public corporatecontentuniqueinformation findByPrimaryKey(long id)
		throws NoSuchcorporatecontentuniqueinformationException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the corporatecontentuniqueinformation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the corporatecontentuniqueinformation
	 * @return the corporatecontentuniqueinformation, or <code>null</code> if a corporatecontentuniqueinformation with the primary key could not be found
	 */
	@Override
	public corporatecontentuniqueinformation fetchByPrimaryKey(
		Serializable primaryKey) {
		corporatecontentuniqueinformation corporatecontentuniqueinformation = (corporatecontentuniqueinformation)entityCache.getResult(corporatecontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
				corporatecontentuniqueinformationImpl.class, primaryKey);

		if (corporatecontentuniqueinformation == _nullcorporatecontentuniqueinformation) {
			return null;
		}

		if (corporatecontentuniqueinformation == null) {
			Session session = null;

			try {
				session = openSession();

				corporatecontentuniqueinformation = (corporatecontentuniqueinformation)session.get(corporatecontentuniqueinformationImpl.class,
						primaryKey);

				if (corporatecontentuniqueinformation != null) {
					cacheResult(corporatecontentuniqueinformation);
				}
				else {
					entityCache.putResult(corporatecontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
						corporatecontentuniqueinformationImpl.class,
						primaryKey, _nullcorporatecontentuniqueinformation);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(corporatecontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
					corporatecontentuniqueinformationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return corporatecontentuniqueinformation;
	}

	/**
	 * Returns the corporatecontentuniqueinformation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the corporatecontentuniqueinformation
	 * @return the corporatecontentuniqueinformation, or <code>null</code> if a corporatecontentuniqueinformation with the primary key could not be found
	 */
	@Override
	public corporatecontentuniqueinformation fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, corporatecontentuniqueinformation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, corporatecontentuniqueinformation> map = new HashMap<Serializable, corporatecontentuniqueinformation>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			corporatecontentuniqueinformation corporatecontentuniqueinformation = fetchByPrimaryKey(primaryKey);

			if (corporatecontentuniqueinformation != null) {
				map.put(primaryKey, corporatecontentuniqueinformation);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			corporatecontentuniqueinformation corporatecontentuniqueinformation = (corporatecontentuniqueinformation)entityCache.getResult(corporatecontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
					corporatecontentuniqueinformationImpl.class, primaryKey);

			if (corporatecontentuniqueinformation == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, corporatecontentuniqueinformation);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CORPORATECONTENTUNIQUEINFORMATION_WHERE_PKS_IN);

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

			for (corporatecontentuniqueinformation corporatecontentuniqueinformation : (List<corporatecontentuniqueinformation>)q.list()) {
				map.put(corporatecontentuniqueinformation.getPrimaryKeyObj(),
					corporatecontentuniqueinformation);

				cacheResult(corporatecontentuniqueinformation);

				uncachedPrimaryKeys.remove(corporatecontentuniqueinformation.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(corporatecontentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
					corporatecontentuniqueinformationImpl.class, primaryKey,
					_nullcorporatecontentuniqueinformation);
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
	 * Returns all the corporatecontentuniqueinformations.
	 *
	 * @return the corporatecontentuniqueinformations
	 */
	@Override
	public List<corporatecontentuniqueinformation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the corporatecontentuniqueinformations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of corporatecontentuniqueinformations
	 * @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	 * @return the range of corporatecontentuniqueinformations
	 */
	@Override
	public List<corporatecontentuniqueinformation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the corporatecontentuniqueinformations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of corporatecontentuniqueinformations
	 * @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of corporatecontentuniqueinformations
	 */
	@Override
	public List<corporatecontentuniqueinformation> findAll(int start, int end,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the corporatecontentuniqueinformations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of corporatecontentuniqueinformations
	 * @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of corporatecontentuniqueinformations
	 */
	@Override
	public List<corporatecontentuniqueinformation> findAll(int start, int end,
		OrderByComparator<corporatecontentuniqueinformation> orderByComparator,
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

		List<corporatecontentuniqueinformation> list = null;

		if (retrieveFromCache) {
			list = (List<corporatecontentuniqueinformation>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CORPORATECONTENTUNIQUEINFORMATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CORPORATECONTENTUNIQUEINFORMATION;

				if (pagination) {
					sql = sql.concat(corporatecontentuniqueinformationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<corporatecontentuniqueinformation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<corporatecontentuniqueinformation>)QueryUtil.list(q,
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
	 * Removes all the corporatecontentuniqueinformations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (corporatecontentuniqueinformation corporatecontentuniqueinformation : findAll()) {
			remove(corporatecontentuniqueinformation);
		}
	}

	/**
	 * Returns the number of corporatecontentuniqueinformations.
	 *
	 * @return the number of corporatecontentuniqueinformations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CORPORATECONTENTUNIQUEINFORMATION);

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
		return corporatecontentuniqueinformationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the corporatecontentuniqueinformation persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(corporatecontentuniqueinformationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_CORPORATECONTENTUNIQUEINFORMATION = "SELECT corporatecontentuniqueinformation FROM corporatecontentuniqueinformation corporatecontentuniqueinformation";
	private static final String _SQL_SELECT_CORPORATECONTENTUNIQUEINFORMATION_WHERE_PKS_IN =
		"SELECT corporatecontentuniqueinformation FROM corporatecontentuniqueinformation corporatecontentuniqueinformation WHERE id_ IN (";
	private static final String _SQL_SELECT_CORPORATECONTENTUNIQUEINFORMATION_WHERE =
		"SELECT corporatecontentuniqueinformation FROM corporatecontentuniqueinformation corporatecontentuniqueinformation WHERE ";
	private static final String _SQL_COUNT_CORPORATECONTENTUNIQUEINFORMATION = "SELECT COUNT(corporatecontentuniqueinformation) FROM corporatecontentuniqueinformation corporatecontentuniqueinformation";
	private static final String _SQL_COUNT_CORPORATECONTENTUNIQUEINFORMATION_WHERE =
		"SELECT COUNT(corporatecontentuniqueinformation) FROM corporatecontentuniqueinformation corporatecontentuniqueinformation WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "corporatecontentuniqueinformation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No corporatecontentuniqueinformation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No corporatecontentuniqueinformation exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(corporatecontentuniqueinformationPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final corporatecontentuniqueinformation _nullcorporatecontentuniqueinformation =
		new corporatecontentuniqueinformationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<corporatecontentuniqueinformation> toCacheModel() {
				return _nullcorporatecontentuniqueinformationCacheModel;
			}
		};

	private static final CacheModel<corporatecontentuniqueinformation> _nullcorporatecontentuniqueinformationCacheModel =
		new CacheModel<corporatecontentuniqueinformation>() {
			@Override
			public corporatecontentuniqueinformation toEntityModel() {
				return _nullcorporatecontentuniqueinformation;
			}
		};
}