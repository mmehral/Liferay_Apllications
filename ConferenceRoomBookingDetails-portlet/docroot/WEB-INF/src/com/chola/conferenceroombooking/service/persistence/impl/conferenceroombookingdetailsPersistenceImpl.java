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

package com.chola.conferenceroombooking.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.conferenceroombooking.exception.NoSuchconferenceroombookingdetailsException;
import com.chola.conferenceroombooking.model.conferenceroombookingdetails;
import com.chola.conferenceroombooking.model.impl.conferenceroombookingdetailsImpl;
import com.chola.conferenceroombooking.model.impl.conferenceroombookingdetailsModelImpl;
import com.chola.conferenceroombooking.service.persistence.conferenceroombookingdetailsPersistence;

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
 * The persistence implementation for the conferenceroombookingdetails service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see conferenceroombookingdetailsPersistence
 * @see com.chola.conferenceroombooking.service.persistence.conferenceroombookingdetailsUtil
 * @generated
 */
@ProviderType
public class conferenceroombookingdetailsPersistenceImpl
	extends BasePersistenceImpl<conferenceroombookingdetails>
	implements conferenceroombookingdetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link conferenceroombookingdetailsUtil} to access the conferenceroombookingdetails persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = conferenceroombookingdetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(conferenceroombookingdetailsModelImpl.ENTITY_CACHE_ENABLED,
			conferenceroombookingdetailsModelImpl.FINDER_CACHE_ENABLED,
			conferenceroombookingdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(conferenceroombookingdetailsModelImpl.ENTITY_CACHE_ENABLED,
			conferenceroombookingdetailsModelImpl.FINDER_CACHE_ENABLED,
			conferenceroombookingdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(conferenceroombookingdetailsModelImpl.ENTITY_CACHE_ENABLED,
			conferenceroombookingdetailsModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MY_BOOKING =
		new FinderPath(conferenceroombookingdetailsModelImpl.ENTITY_CACHE_ENABLED,
			conferenceroombookingdetailsModelImpl.FINDER_CACHE_ENABLED,
			conferenceroombookingdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMY_BOOKING",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MY_BOOKING =
		new FinderPath(conferenceroombookingdetailsModelImpl.ENTITY_CACHE_ENABLED,
			conferenceroombookingdetailsModelImpl.FINDER_CACHE_ENABLED,
			conferenceroombookingdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMY_BOOKING",
			new String[] { Long.class.getName(), Integer.class.getName() },
			conferenceroombookingdetailsModelImpl.USERID_COLUMN_BITMASK |
			conferenceroombookingdetailsModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MY_BOOKING = new FinderPath(conferenceroombookingdetailsModelImpl.ENTITY_CACHE_ENABLED,
			conferenceroombookingdetailsModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByMY_BOOKING",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the conferenceroombookingdetailses where userid = &#63; and status = &#63;.
	 *
	 * @param userid the userid
	 * @param status the status
	 * @return the matching conferenceroombookingdetailses
	 */
	@Override
	public List<conferenceroombookingdetails> findByMY_BOOKING(long userid,
		int status) {
		return findByMY_BOOKING(userid, status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the conferenceroombookingdetailses where userid = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userid the userid
	 * @param status the status
	 * @param start the lower bound of the range of conferenceroombookingdetailses
	 * @param end the upper bound of the range of conferenceroombookingdetailses (not inclusive)
	 * @return the range of matching conferenceroombookingdetailses
	 */
	@Override
	public List<conferenceroombookingdetails> findByMY_BOOKING(long userid,
		int status, int start, int end) {
		return findByMY_BOOKING(userid, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the conferenceroombookingdetailses where userid = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userid the userid
	 * @param status the status
	 * @param start the lower bound of the range of conferenceroombookingdetailses
	 * @param end the upper bound of the range of conferenceroombookingdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching conferenceroombookingdetailses
	 */
	@Override
	public List<conferenceroombookingdetails> findByMY_BOOKING(long userid,
		int status, int start, int end,
		OrderByComparator<conferenceroombookingdetails> orderByComparator) {
		return findByMY_BOOKING(userid, status, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the conferenceroombookingdetailses where userid = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userid the userid
	 * @param status the status
	 * @param start the lower bound of the range of conferenceroombookingdetailses
	 * @param end the upper bound of the range of conferenceroombookingdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching conferenceroombookingdetailses
	 */
	@Override
	public List<conferenceroombookingdetails> findByMY_BOOKING(long userid,
		int status, int start, int end,
		OrderByComparator<conferenceroombookingdetails> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MY_BOOKING;
			finderArgs = new Object[] { userid, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MY_BOOKING;
			finderArgs = new Object[] {
					userid, status,
					
					start, end, orderByComparator
				};
		}

		List<conferenceroombookingdetails> list = null;

		if (retrieveFromCache) {
			list = (List<conferenceroombookingdetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (conferenceroombookingdetails conferenceroombookingdetails : list) {
					if ((userid != conferenceroombookingdetails.getUserid()) ||
							(status != conferenceroombookingdetails.getStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_CONFERENCEROOMBOOKINGDETAILS_WHERE);

			query.append(_FINDER_COLUMN_MY_BOOKING_USERID_2);

			query.append(_FINDER_COLUMN_MY_BOOKING_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(conferenceroombookingdetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userid);

				qPos.add(status);

				if (!pagination) {
					list = (List<conferenceroombookingdetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<conferenceroombookingdetails>)QueryUtil.list(q,
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
	 * Returns the first conferenceroombookingdetails in the ordered set where userid = &#63; and status = &#63;.
	 *
	 * @param userid the userid
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching conferenceroombookingdetails
	 * @throws NoSuchconferenceroombookingdetailsException if a matching conferenceroombookingdetails could not be found
	 */
	@Override
	public conferenceroombookingdetails findByMY_BOOKING_First(long userid,
		int status,
		OrderByComparator<conferenceroombookingdetails> orderByComparator)
		throws NoSuchconferenceroombookingdetailsException {
		conferenceroombookingdetails conferenceroombookingdetails = fetchByMY_BOOKING_First(userid,
				status, orderByComparator);

		if (conferenceroombookingdetails != null) {
			return conferenceroombookingdetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userid=");
		msg.append(userid);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchconferenceroombookingdetailsException(msg.toString());
	}

	/**
	 * Returns the first conferenceroombookingdetails in the ordered set where userid = &#63; and status = &#63;.
	 *
	 * @param userid the userid
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching conferenceroombookingdetails, or <code>null</code> if a matching conferenceroombookingdetails could not be found
	 */
	@Override
	public conferenceroombookingdetails fetchByMY_BOOKING_First(long userid,
		int status,
		OrderByComparator<conferenceroombookingdetails> orderByComparator) {
		List<conferenceroombookingdetails> list = findByMY_BOOKING(userid,
				status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last conferenceroombookingdetails in the ordered set where userid = &#63; and status = &#63;.
	 *
	 * @param userid the userid
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching conferenceroombookingdetails
	 * @throws NoSuchconferenceroombookingdetailsException if a matching conferenceroombookingdetails could not be found
	 */
	@Override
	public conferenceroombookingdetails findByMY_BOOKING_Last(long userid,
		int status,
		OrderByComparator<conferenceroombookingdetails> orderByComparator)
		throws NoSuchconferenceroombookingdetailsException {
		conferenceroombookingdetails conferenceroombookingdetails = fetchByMY_BOOKING_Last(userid,
				status, orderByComparator);

		if (conferenceroombookingdetails != null) {
			return conferenceroombookingdetails;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userid=");
		msg.append(userid);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchconferenceroombookingdetailsException(msg.toString());
	}

	/**
	 * Returns the last conferenceroombookingdetails in the ordered set where userid = &#63; and status = &#63;.
	 *
	 * @param userid the userid
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching conferenceroombookingdetails, or <code>null</code> if a matching conferenceroombookingdetails could not be found
	 */
	@Override
	public conferenceroombookingdetails fetchByMY_BOOKING_Last(long userid,
		int status,
		OrderByComparator<conferenceroombookingdetails> orderByComparator) {
		int count = countByMY_BOOKING(userid, status);

		if (count == 0) {
			return null;
		}

		List<conferenceroombookingdetails> list = findByMY_BOOKING(userid,
				status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the conferenceroombookingdetailses before and after the current conferenceroombookingdetails in the ordered set where userid = &#63; and status = &#63;.
	 *
	 * @param bookid the primary key of the current conferenceroombookingdetails
	 * @param userid the userid
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next conferenceroombookingdetails
	 * @throws NoSuchconferenceroombookingdetailsException if a conferenceroombookingdetails with the primary key could not be found
	 */
	@Override
	public conferenceroombookingdetails[] findByMY_BOOKING_PrevAndNext(
		long bookid, long userid, int status,
		OrderByComparator<conferenceroombookingdetails> orderByComparator)
		throws NoSuchconferenceroombookingdetailsException {
		conferenceroombookingdetails conferenceroombookingdetails = findByPrimaryKey(bookid);

		Session session = null;

		try {
			session = openSession();

			conferenceroombookingdetails[] array = new conferenceroombookingdetailsImpl[3];

			array[0] = getByMY_BOOKING_PrevAndNext(session,
					conferenceroombookingdetails, userid, status,
					orderByComparator, true);

			array[1] = conferenceroombookingdetails;

			array[2] = getByMY_BOOKING_PrevAndNext(session,
					conferenceroombookingdetails, userid, status,
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

	protected conferenceroombookingdetails getByMY_BOOKING_PrevAndNext(
		Session session,
		conferenceroombookingdetails conferenceroombookingdetails, long userid,
		int status,
		OrderByComparator<conferenceroombookingdetails> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CONFERENCEROOMBOOKINGDETAILS_WHERE);

		query.append(_FINDER_COLUMN_MY_BOOKING_USERID_2);

		query.append(_FINDER_COLUMN_MY_BOOKING_STATUS_2);

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
			query.append(conferenceroombookingdetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userid);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(conferenceroombookingdetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<conferenceroombookingdetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the conferenceroombookingdetailses where userid = &#63; and status = &#63; from the database.
	 *
	 * @param userid the userid
	 * @param status the status
	 */
	@Override
	public void removeByMY_BOOKING(long userid, int status) {
		for (conferenceroombookingdetails conferenceroombookingdetails : findByMY_BOOKING(
				userid, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(conferenceroombookingdetails);
		}
	}

	/**
	 * Returns the number of conferenceroombookingdetailses where userid = &#63; and status = &#63;.
	 *
	 * @param userid the userid
	 * @param status the status
	 * @return the number of matching conferenceroombookingdetailses
	 */
	@Override
	public int countByMY_BOOKING(long userid, int status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MY_BOOKING;

		Object[] finderArgs = new Object[] { userid, status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CONFERENCEROOMBOOKINGDETAILS_WHERE);

			query.append(_FINDER_COLUMN_MY_BOOKING_USERID_2);

			query.append(_FINDER_COLUMN_MY_BOOKING_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userid);

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_MY_BOOKING_USERID_2 = "conferenceroombookingdetails.userid = ? AND ";
	private static final String _FINDER_COLUMN_MY_BOOKING_STATUS_2 = "conferenceroombookingdetails.status = ?";

	public conferenceroombookingdetailsPersistenceImpl() {
		setModelClass(conferenceroombookingdetails.class);
	}

	/**
	 * Caches the conferenceroombookingdetails in the entity cache if it is enabled.
	 *
	 * @param conferenceroombookingdetails the conferenceroombookingdetails
	 */
	@Override
	public void cacheResult(
		conferenceroombookingdetails conferenceroombookingdetails) {
		entityCache.putResult(conferenceroombookingdetailsModelImpl.ENTITY_CACHE_ENABLED,
			conferenceroombookingdetailsImpl.class,
			conferenceroombookingdetails.getPrimaryKey(),
			conferenceroombookingdetails);

		conferenceroombookingdetails.resetOriginalValues();
	}

	/**
	 * Caches the conferenceroombookingdetailses in the entity cache if it is enabled.
	 *
	 * @param conferenceroombookingdetailses the conferenceroombookingdetailses
	 */
	@Override
	public void cacheResult(
		List<conferenceroombookingdetails> conferenceroombookingdetailses) {
		for (conferenceroombookingdetails conferenceroombookingdetails : conferenceroombookingdetailses) {
			if (entityCache.getResult(
						conferenceroombookingdetailsModelImpl.ENTITY_CACHE_ENABLED,
						conferenceroombookingdetailsImpl.class,
						conferenceroombookingdetails.getPrimaryKey()) == null) {
				cacheResult(conferenceroombookingdetails);
			}
			else {
				conferenceroombookingdetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all conferenceroombookingdetailses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(conferenceroombookingdetailsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the conferenceroombookingdetails.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		conferenceroombookingdetails conferenceroombookingdetails) {
		entityCache.removeResult(conferenceroombookingdetailsModelImpl.ENTITY_CACHE_ENABLED,
			conferenceroombookingdetailsImpl.class,
			conferenceroombookingdetails.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<conferenceroombookingdetails> conferenceroombookingdetailses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (conferenceroombookingdetails conferenceroombookingdetails : conferenceroombookingdetailses) {
			entityCache.removeResult(conferenceroombookingdetailsModelImpl.ENTITY_CACHE_ENABLED,
				conferenceroombookingdetailsImpl.class,
				conferenceroombookingdetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new conferenceroombookingdetails with the primary key. Does not add the conferenceroombookingdetails to the database.
	 *
	 * @param bookid the primary key for the new conferenceroombookingdetails
	 * @return the new conferenceroombookingdetails
	 */
	@Override
	public conferenceroombookingdetails create(long bookid) {
		conferenceroombookingdetails conferenceroombookingdetails = new conferenceroombookingdetailsImpl();

		conferenceroombookingdetails.setNew(true);
		conferenceroombookingdetails.setPrimaryKey(bookid);

		return conferenceroombookingdetails;
	}

	/**
	 * Removes the conferenceroombookingdetails with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookid the primary key of the conferenceroombookingdetails
	 * @return the conferenceroombookingdetails that was removed
	 * @throws NoSuchconferenceroombookingdetailsException if a conferenceroombookingdetails with the primary key could not be found
	 */
	@Override
	public conferenceroombookingdetails remove(long bookid)
		throws NoSuchconferenceroombookingdetailsException {
		return remove((Serializable)bookid);
	}

	/**
	 * Removes the conferenceroombookingdetails with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the conferenceroombookingdetails
	 * @return the conferenceroombookingdetails that was removed
	 * @throws NoSuchconferenceroombookingdetailsException if a conferenceroombookingdetails with the primary key could not be found
	 */
	@Override
	public conferenceroombookingdetails remove(Serializable primaryKey)
		throws NoSuchconferenceroombookingdetailsException {
		Session session = null;

		try {
			session = openSession();

			conferenceroombookingdetails conferenceroombookingdetails = (conferenceroombookingdetails)session.get(conferenceroombookingdetailsImpl.class,
					primaryKey);

			if (conferenceroombookingdetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchconferenceroombookingdetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(conferenceroombookingdetails);
		}
		catch (NoSuchconferenceroombookingdetailsException nsee) {
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
	protected conferenceroombookingdetails removeImpl(
		conferenceroombookingdetails conferenceroombookingdetails) {
		conferenceroombookingdetails = toUnwrappedModel(conferenceroombookingdetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(conferenceroombookingdetails)) {
				conferenceroombookingdetails = (conferenceroombookingdetails)session.get(conferenceroombookingdetailsImpl.class,
						conferenceroombookingdetails.getPrimaryKeyObj());
			}

			if (conferenceroombookingdetails != null) {
				session.delete(conferenceroombookingdetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (conferenceroombookingdetails != null) {
			clearCache(conferenceroombookingdetails);
		}

		return conferenceroombookingdetails;
	}

	@Override
	public conferenceroombookingdetails updateImpl(
		conferenceroombookingdetails conferenceroombookingdetails) {
		conferenceroombookingdetails = toUnwrappedModel(conferenceroombookingdetails);

		boolean isNew = conferenceroombookingdetails.isNew();

		conferenceroombookingdetailsModelImpl conferenceroombookingdetailsModelImpl =
			(conferenceroombookingdetailsModelImpl)conferenceroombookingdetails;

		Session session = null;

		try {
			session = openSession();

			if (conferenceroombookingdetails.isNew()) {
				session.save(conferenceroombookingdetails);

				conferenceroombookingdetails.setNew(false);
			}
			else {
				conferenceroombookingdetails = (conferenceroombookingdetails)session.merge(conferenceroombookingdetails);
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
				!conferenceroombookingdetailsModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((conferenceroombookingdetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MY_BOOKING.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						conferenceroombookingdetailsModelImpl.getOriginalUserid(),
						conferenceroombookingdetailsModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MY_BOOKING, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MY_BOOKING,
					args);

				args = new Object[] {
						conferenceroombookingdetailsModelImpl.getUserid(),
						conferenceroombookingdetailsModelImpl.getStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_MY_BOOKING, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MY_BOOKING,
					args);
			}
		}

		entityCache.putResult(conferenceroombookingdetailsModelImpl.ENTITY_CACHE_ENABLED,
			conferenceroombookingdetailsImpl.class,
			conferenceroombookingdetails.getPrimaryKey(),
			conferenceroombookingdetails, false);

		conferenceroombookingdetails.resetOriginalValues();

		return conferenceroombookingdetails;
	}

	protected conferenceroombookingdetails toUnwrappedModel(
		conferenceroombookingdetails conferenceroombookingdetails) {
		if (conferenceroombookingdetails instanceof conferenceroombookingdetailsImpl) {
			return conferenceroombookingdetails;
		}

		conferenceroombookingdetailsImpl conferenceroombookingdetailsImpl = new conferenceroombookingdetailsImpl();

		conferenceroombookingdetailsImpl.setNew(conferenceroombookingdetails.isNew());
		conferenceroombookingdetailsImpl.setPrimaryKey(conferenceroombookingdetails.getPrimaryKey());

		conferenceroombookingdetailsImpl.setBookid(conferenceroombookingdetails.getBookid());
		conferenceroombookingdetailsImpl.setStartdate(conferenceroombookingdetails.getStartdate());
		conferenceroombookingdetailsImpl.setStartime(conferenceroombookingdetails.getStartime());
		conferenceroombookingdetailsImpl.setEndtime(conferenceroombookingdetails.getEndtime());
		conferenceroombookingdetailsImpl.setRoomid(conferenceroombookingdetails.getRoomid());
		conferenceroombookingdetailsImpl.setMeeting_emailid(conferenceroombookingdetails.getMeeting_emailid());
		conferenceroombookingdetailsImpl.setMeeting_title(conferenceroombookingdetails.getMeeting_title());
		conferenceroombookingdetailsImpl.setMeeting_agenda(conferenceroombookingdetails.getMeeting_agenda());
		conferenceroombookingdetailsImpl.setStatus(conferenceroombookingdetails.getStatus());
		conferenceroombookingdetailsImpl.setUserid(conferenceroombookingdetails.getUserid());
		conferenceroombookingdetailsImpl.setUsername(conferenceroombookingdetails.getUsername());
		conferenceroombookingdetailsImpl.setCreatedate(conferenceroombookingdetails.getCreatedate());

		return conferenceroombookingdetailsImpl;
	}

	/**
	 * Returns the conferenceroombookingdetails with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the conferenceroombookingdetails
	 * @return the conferenceroombookingdetails
	 * @throws NoSuchconferenceroombookingdetailsException if a conferenceroombookingdetails with the primary key could not be found
	 */
	@Override
	public conferenceroombookingdetails findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchconferenceroombookingdetailsException {
		conferenceroombookingdetails conferenceroombookingdetails = fetchByPrimaryKey(primaryKey);

		if (conferenceroombookingdetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchconferenceroombookingdetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return conferenceroombookingdetails;
	}

	/**
	 * Returns the conferenceroombookingdetails with the primary key or throws a {@link NoSuchconferenceroombookingdetailsException} if it could not be found.
	 *
	 * @param bookid the primary key of the conferenceroombookingdetails
	 * @return the conferenceroombookingdetails
	 * @throws NoSuchconferenceroombookingdetailsException if a conferenceroombookingdetails with the primary key could not be found
	 */
	@Override
	public conferenceroombookingdetails findByPrimaryKey(long bookid)
		throws NoSuchconferenceroombookingdetailsException {
		return findByPrimaryKey((Serializable)bookid);
	}

	/**
	 * Returns the conferenceroombookingdetails with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the conferenceroombookingdetails
	 * @return the conferenceroombookingdetails, or <code>null</code> if a conferenceroombookingdetails with the primary key could not be found
	 */
	@Override
	public conferenceroombookingdetails fetchByPrimaryKey(
		Serializable primaryKey) {
		conferenceroombookingdetails conferenceroombookingdetails = (conferenceroombookingdetails)entityCache.getResult(conferenceroombookingdetailsModelImpl.ENTITY_CACHE_ENABLED,
				conferenceroombookingdetailsImpl.class, primaryKey);

		if (conferenceroombookingdetails == _nullconferenceroombookingdetails) {
			return null;
		}

		if (conferenceroombookingdetails == null) {
			Session session = null;

			try {
				session = openSession();

				conferenceroombookingdetails = (conferenceroombookingdetails)session.get(conferenceroombookingdetailsImpl.class,
						primaryKey);

				if (conferenceroombookingdetails != null) {
					cacheResult(conferenceroombookingdetails);
				}
				else {
					entityCache.putResult(conferenceroombookingdetailsModelImpl.ENTITY_CACHE_ENABLED,
						conferenceroombookingdetailsImpl.class, primaryKey,
						_nullconferenceroombookingdetails);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(conferenceroombookingdetailsModelImpl.ENTITY_CACHE_ENABLED,
					conferenceroombookingdetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return conferenceroombookingdetails;
	}

	/**
	 * Returns the conferenceroombookingdetails with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bookid the primary key of the conferenceroombookingdetails
	 * @return the conferenceroombookingdetails, or <code>null</code> if a conferenceroombookingdetails with the primary key could not be found
	 */
	@Override
	public conferenceroombookingdetails fetchByPrimaryKey(long bookid) {
		return fetchByPrimaryKey((Serializable)bookid);
	}

	@Override
	public Map<Serializable, conferenceroombookingdetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, conferenceroombookingdetails> map = new HashMap<Serializable, conferenceroombookingdetails>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			conferenceroombookingdetails conferenceroombookingdetails = fetchByPrimaryKey(primaryKey);

			if (conferenceroombookingdetails != null) {
				map.put(primaryKey, conferenceroombookingdetails);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			conferenceroombookingdetails conferenceroombookingdetails = (conferenceroombookingdetails)entityCache.getResult(conferenceroombookingdetailsModelImpl.ENTITY_CACHE_ENABLED,
					conferenceroombookingdetailsImpl.class, primaryKey);

			if (conferenceroombookingdetails == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, conferenceroombookingdetails);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CONFERENCEROOMBOOKINGDETAILS_WHERE_PKS_IN);

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

			for (conferenceroombookingdetails conferenceroombookingdetails : (List<conferenceroombookingdetails>)q.list()) {
				map.put(conferenceroombookingdetails.getPrimaryKeyObj(),
					conferenceroombookingdetails);

				cacheResult(conferenceroombookingdetails);

				uncachedPrimaryKeys.remove(conferenceroombookingdetails.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(conferenceroombookingdetailsModelImpl.ENTITY_CACHE_ENABLED,
					conferenceroombookingdetailsImpl.class, primaryKey,
					_nullconferenceroombookingdetails);
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
	 * Returns all the conferenceroombookingdetailses.
	 *
	 * @return the conferenceroombookingdetailses
	 */
	@Override
	public List<conferenceroombookingdetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the conferenceroombookingdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of conferenceroombookingdetailses
	 * @param end the upper bound of the range of conferenceroombookingdetailses (not inclusive)
	 * @return the range of conferenceroombookingdetailses
	 */
	@Override
	public List<conferenceroombookingdetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the conferenceroombookingdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of conferenceroombookingdetailses
	 * @param end the upper bound of the range of conferenceroombookingdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of conferenceroombookingdetailses
	 */
	@Override
	public List<conferenceroombookingdetails> findAll(int start, int end,
		OrderByComparator<conferenceroombookingdetails> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the conferenceroombookingdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of conferenceroombookingdetailses
	 * @param end the upper bound of the range of conferenceroombookingdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of conferenceroombookingdetailses
	 */
	@Override
	public List<conferenceroombookingdetails> findAll(int start, int end,
		OrderByComparator<conferenceroombookingdetails> orderByComparator,
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

		List<conferenceroombookingdetails> list = null;

		if (retrieveFromCache) {
			list = (List<conferenceroombookingdetails>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CONFERENCEROOMBOOKINGDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONFERENCEROOMBOOKINGDETAILS;

				if (pagination) {
					sql = sql.concat(conferenceroombookingdetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<conferenceroombookingdetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<conferenceroombookingdetails>)QueryUtil.list(q,
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
	 * Removes all the conferenceroombookingdetailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (conferenceroombookingdetails conferenceroombookingdetails : findAll()) {
			remove(conferenceroombookingdetails);
		}
	}

	/**
	 * Returns the number of conferenceroombookingdetailses.
	 *
	 * @return the number of conferenceroombookingdetailses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CONFERENCEROOMBOOKINGDETAILS);

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
		return conferenceroombookingdetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the conferenceroombookingdetails persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(conferenceroombookingdetailsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_CONFERENCEROOMBOOKINGDETAILS = "SELECT conferenceroombookingdetails FROM conferenceroombookingdetails conferenceroombookingdetails";
	private static final String _SQL_SELECT_CONFERENCEROOMBOOKINGDETAILS_WHERE_PKS_IN =
		"SELECT conferenceroombookingdetails FROM conferenceroombookingdetails conferenceroombookingdetails WHERE bookid IN (";
	private static final String _SQL_SELECT_CONFERENCEROOMBOOKINGDETAILS_WHERE = "SELECT conferenceroombookingdetails FROM conferenceroombookingdetails conferenceroombookingdetails WHERE ";
	private static final String _SQL_COUNT_CONFERENCEROOMBOOKINGDETAILS = "SELECT COUNT(conferenceroombookingdetails) FROM conferenceroombookingdetails conferenceroombookingdetails";
	private static final String _SQL_COUNT_CONFERENCEROOMBOOKINGDETAILS_WHERE = "SELECT COUNT(conferenceroombookingdetails) FROM conferenceroombookingdetails conferenceroombookingdetails WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "conferenceroombookingdetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No conferenceroombookingdetails exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No conferenceroombookingdetails exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(conferenceroombookingdetailsPersistenceImpl.class);
	private static final conferenceroombookingdetails _nullconferenceroombookingdetails =
		new conferenceroombookingdetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<conferenceroombookingdetails> toCacheModel() {
				return _nullconferenceroombookingdetailsCacheModel;
			}
		};

	private static final CacheModel<conferenceroombookingdetails> _nullconferenceroombookingdetailsCacheModel =
		new CacheModel<conferenceroombookingdetails>() {
			@Override
			public conferenceroombookingdetails toEntityModel() {
				return _nullconferenceroombookingdetails;
			}
		};
}