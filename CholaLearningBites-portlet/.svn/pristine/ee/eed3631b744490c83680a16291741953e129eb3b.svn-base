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

package com.chola.learningbites.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.learningbites.exception.NoSuchlbusersException;
import com.chola.learningbites.model.impl.lbusersImpl;
import com.chola.learningbites.model.impl.lbusersModelImpl;
import com.chola.learningbites.model.lbusers;
import com.chola.learningbites.service.persistence.lbusersPersistence;

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
 * The persistence implementation for the lbusers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see lbusersPersistence
 * @see com.chola.learningbites.service.persistence.lbusersUtil
 * @generated
 */
@ProviderType
public class lbusersPersistenceImpl extends BasePersistenceImpl<lbusers>
	implements lbusersPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link lbusersUtil} to access the lbusers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = lbusersImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(lbusersModelImpl.ENTITY_CACHE_ENABLED,
			lbusersModelImpl.FINDER_CACHE_ENABLED, lbusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(lbusersModelImpl.ENTITY_CACHE_ENABLED,
			lbusersModelImpl.FINDER_CACHE_ENABLED, lbusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(lbusersModelImpl.ENTITY_CACHE_ENABLED,
			lbusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LB_ID = new FinderPath(lbusersModelImpl.ENTITY_CACHE_ENABLED,
			lbusersModelImpl.FINDER_CACHE_ENABLED, lbusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByLB_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LB_ID = new FinderPath(lbusersModelImpl.ENTITY_CACHE_ENABLED,
			lbusersModelImpl.FINDER_CACHE_ENABLED, lbusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLB_ID",
			new String[] { Long.class.getName() },
			lbusersModelImpl.LB_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LB_ID = new FinderPath(lbusersModelImpl.ENTITY_CACHE_ENABLED,
			lbusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLB_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the lbuserses where lb_id = &#63;.
	 *
	 * @param lb_id the lb_id
	 * @return the matching lbuserses
	 */
	@Override
	public List<lbusers> findByLB_ID(long lb_id) {
		return findByLB_ID(lb_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lbuserses where lb_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lb_id the lb_id
	 * @param start the lower bound of the range of lbuserses
	 * @param end the upper bound of the range of lbuserses (not inclusive)
	 * @return the range of matching lbuserses
	 */
	@Override
	public List<lbusers> findByLB_ID(long lb_id, int start, int end) {
		return findByLB_ID(lb_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lbuserses where lb_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lb_id the lb_id
	 * @param start the lower bound of the range of lbuserses
	 * @param end the upper bound of the range of lbuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lbuserses
	 */
	@Override
	public List<lbusers> findByLB_ID(long lb_id, int start, int end,
		OrderByComparator<lbusers> orderByComparator) {
		return findByLB_ID(lb_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the lbuserses where lb_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param lb_id the lb_id
	 * @param start the lower bound of the range of lbuserses
	 * @param end the upper bound of the range of lbuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching lbuserses
	 */
	@Override
	public List<lbusers> findByLB_ID(long lb_id, int start, int end,
		OrderByComparator<lbusers> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LB_ID;
			finderArgs = new Object[] { lb_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LB_ID;
			finderArgs = new Object[] { lb_id, start, end, orderByComparator };
		}

		List<lbusers> list = null;

		if (retrieveFromCache) {
			list = (List<lbusers>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (lbusers lbusers : list) {
					if ((lb_id != lbusers.getLb_id())) {
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

			query.append(_SQL_SELECT_LBUSERS_WHERE);

			query.append(_FINDER_COLUMN_LB_ID_LB_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(lbusersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lb_id);

				if (!pagination) {
					list = (List<lbusers>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<lbusers>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first lbusers in the ordered set where lb_id = &#63;.
	 *
	 * @param lb_id the lb_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lbusers
	 * @throws NoSuchlbusersException if a matching lbusers could not be found
	 */
	@Override
	public lbusers findByLB_ID_First(long lb_id,
		OrderByComparator<lbusers> orderByComparator)
		throws NoSuchlbusersException {
		lbusers lbusers = fetchByLB_ID_First(lb_id, orderByComparator);

		if (lbusers != null) {
			return lbusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lb_id=");
		msg.append(lb_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchlbusersException(msg.toString());
	}

	/**
	 * Returns the first lbusers in the ordered set where lb_id = &#63;.
	 *
	 * @param lb_id the lb_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lbusers, or <code>null</code> if a matching lbusers could not be found
	 */
	@Override
	public lbusers fetchByLB_ID_First(long lb_id,
		OrderByComparator<lbusers> orderByComparator) {
		List<lbusers> list = findByLB_ID(lb_id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lbusers in the ordered set where lb_id = &#63;.
	 *
	 * @param lb_id the lb_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lbusers
	 * @throws NoSuchlbusersException if a matching lbusers could not be found
	 */
	@Override
	public lbusers findByLB_ID_Last(long lb_id,
		OrderByComparator<lbusers> orderByComparator)
		throws NoSuchlbusersException {
		lbusers lbusers = fetchByLB_ID_Last(lb_id, orderByComparator);

		if (lbusers != null) {
			return lbusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("lb_id=");
		msg.append(lb_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchlbusersException(msg.toString());
	}

	/**
	 * Returns the last lbusers in the ordered set where lb_id = &#63;.
	 *
	 * @param lb_id the lb_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lbusers, or <code>null</code> if a matching lbusers could not be found
	 */
	@Override
	public lbusers fetchByLB_ID_Last(long lb_id,
		OrderByComparator<lbusers> orderByComparator) {
		int count = countByLB_ID(lb_id);

		if (count == 0) {
			return null;
		}

		List<lbusers> list = findByLB_ID(lb_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lbuserses before and after the current lbusers in the ordered set where lb_id = &#63;.
	 *
	 * @param id the primary key of the current lbusers
	 * @param lb_id the lb_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lbusers
	 * @throws NoSuchlbusersException if a lbusers with the primary key could not be found
	 */
	@Override
	public lbusers[] findByLB_ID_PrevAndNext(long id, long lb_id,
		OrderByComparator<lbusers> orderByComparator)
		throws NoSuchlbusersException {
		lbusers lbusers = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			lbusers[] array = new lbusersImpl[3];

			array[0] = getByLB_ID_PrevAndNext(session, lbusers, lb_id,
					orderByComparator, true);

			array[1] = lbusers;

			array[2] = getByLB_ID_PrevAndNext(session, lbusers, lb_id,
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

	protected lbusers getByLB_ID_PrevAndNext(Session session, lbusers lbusers,
		long lb_id, OrderByComparator<lbusers> orderByComparator,
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

		query.append(_SQL_SELECT_LBUSERS_WHERE);

		query.append(_FINDER_COLUMN_LB_ID_LB_ID_2);

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
			query.append(lbusersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(lb_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lbusers);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<lbusers> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lbuserses where lb_id = &#63; from the database.
	 *
	 * @param lb_id the lb_id
	 */
	@Override
	public void removeByLB_ID(long lb_id) {
		for (lbusers lbusers : findByLB_ID(lb_id, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(lbusers);
		}
	}

	/**
	 * Returns the number of lbuserses where lb_id = &#63;.
	 *
	 * @param lb_id the lb_id
	 * @return the number of matching lbuserses
	 */
	@Override
	public int countByLB_ID(long lb_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LB_ID;

		Object[] finderArgs = new Object[] { lb_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LBUSERS_WHERE);

			query.append(_FINDER_COLUMN_LB_ID_LB_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(lb_id);

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

	private static final String _FINDER_COLUMN_LB_ID_LB_ID_2 = "lbusers.lb_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USER_ID = new FinderPath(lbusersModelImpl.ENTITY_CACHE_ENABLED,
			lbusersModelImpl.FINDER_CACHE_ENABLED, lbusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUSER_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID =
		new FinderPath(lbusersModelImpl.ENTITY_CACHE_ENABLED,
			lbusersModelImpl.FINDER_CACHE_ENABLED, lbusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUSER_ID",
			new String[] { Long.class.getName() },
			lbusersModelImpl.USER_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USER_ID = new FinderPath(lbusersModelImpl.ENTITY_CACHE_ENABLED,
			lbusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUSER_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the lbuserses where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @return the matching lbuserses
	 */
	@Override
	public List<lbusers> findByUSER_ID(long user_id) {
		return findByUSER_ID(user_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lbuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of lbuserses
	 * @param end the upper bound of the range of lbuserses (not inclusive)
	 * @return the range of matching lbuserses
	 */
	@Override
	public List<lbusers> findByUSER_ID(long user_id, int start, int end) {
		return findByUSER_ID(user_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lbuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of lbuserses
	 * @param end the upper bound of the range of lbuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lbuserses
	 */
	@Override
	public List<lbusers> findByUSER_ID(long user_id, int start, int end,
		OrderByComparator<lbusers> orderByComparator) {
		return findByUSER_ID(user_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the lbuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of lbuserses
	 * @param end the upper bound of the range of lbuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching lbuserses
	 */
	@Override
	public List<lbusers> findByUSER_ID(long user_id, int start, int end,
		OrderByComparator<lbusers> orderByComparator, boolean retrieveFromCache) {
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

		List<lbusers> list = null;

		if (retrieveFromCache) {
			list = (List<lbusers>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (lbusers lbusers : list) {
					if ((user_id != lbusers.getUser_id())) {
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

			query.append(_SQL_SELECT_LBUSERS_WHERE);

			query.append(_FINDER_COLUMN_USER_ID_USER_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(lbusersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(user_id);

				if (!pagination) {
					list = (List<lbusers>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<lbusers>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first lbusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lbusers
	 * @throws NoSuchlbusersException if a matching lbusers could not be found
	 */
	@Override
	public lbusers findByUSER_ID_First(long user_id,
		OrderByComparator<lbusers> orderByComparator)
		throws NoSuchlbusersException {
		lbusers lbusers = fetchByUSER_ID_First(user_id, orderByComparator);

		if (lbusers != null) {
			return lbusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("user_id=");
		msg.append(user_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchlbusersException(msg.toString());
	}

	/**
	 * Returns the first lbusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lbusers, or <code>null</code> if a matching lbusers could not be found
	 */
	@Override
	public lbusers fetchByUSER_ID_First(long user_id,
		OrderByComparator<lbusers> orderByComparator) {
		List<lbusers> list = findByUSER_ID(user_id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lbusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lbusers
	 * @throws NoSuchlbusersException if a matching lbusers could not be found
	 */
	@Override
	public lbusers findByUSER_ID_Last(long user_id,
		OrderByComparator<lbusers> orderByComparator)
		throws NoSuchlbusersException {
		lbusers lbusers = fetchByUSER_ID_Last(user_id, orderByComparator);

		if (lbusers != null) {
			return lbusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("user_id=");
		msg.append(user_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchlbusersException(msg.toString());
	}

	/**
	 * Returns the last lbusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lbusers, or <code>null</code> if a matching lbusers could not be found
	 */
	@Override
	public lbusers fetchByUSER_ID_Last(long user_id,
		OrderByComparator<lbusers> orderByComparator) {
		int count = countByUSER_ID(user_id);

		if (count == 0) {
			return null;
		}

		List<lbusers> list = findByUSER_ID(user_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lbuserses before and after the current lbusers in the ordered set where user_id = &#63;.
	 *
	 * @param id the primary key of the current lbusers
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lbusers
	 * @throws NoSuchlbusersException if a lbusers with the primary key could not be found
	 */
	@Override
	public lbusers[] findByUSER_ID_PrevAndNext(long id, long user_id,
		OrderByComparator<lbusers> orderByComparator)
		throws NoSuchlbusersException {
		lbusers lbusers = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			lbusers[] array = new lbusersImpl[3];

			array[0] = getByUSER_ID_PrevAndNext(session, lbusers, user_id,
					orderByComparator, true);

			array[1] = lbusers;

			array[2] = getByUSER_ID_PrevAndNext(session, lbusers, user_id,
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

	protected lbusers getByUSER_ID_PrevAndNext(Session session,
		lbusers lbusers, long user_id,
		OrderByComparator<lbusers> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LBUSERS_WHERE);

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
			query.append(lbusersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(user_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lbusers);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<lbusers> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lbuserses where user_id = &#63; from the database.
	 *
	 * @param user_id the user_id
	 */
	@Override
	public void removeByUSER_ID(long user_id) {
		for (lbusers lbusers : findByUSER_ID(user_id, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(lbusers);
		}
	}

	/**
	 * Returns the number of lbuserses where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @return the number of matching lbuserses
	 */
	@Override
	public int countByUSER_ID(long user_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USER_ID;

		Object[] finderArgs = new Object[] { user_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LBUSERS_WHERE);

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

	private static final String _FINDER_COLUMN_USER_ID_USER_ID_2 = "lbusers.user_id = ?";

	public lbusersPersistenceImpl() {
		setModelClass(lbusers.class);
	}

	/**
	 * Caches the lbusers in the entity cache if it is enabled.
	 *
	 * @param lbusers the lbusers
	 */
	@Override
	public void cacheResult(lbusers lbusers) {
		entityCache.putResult(lbusersModelImpl.ENTITY_CACHE_ENABLED,
			lbusersImpl.class, lbusers.getPrimaryKey(), lbusers);

		lbusers.resetOriginalValues();
	}

	/**
	 * Caches the lbuserses in the entity cache if it is enabled.
	 *
	 * @param lbuserses the lbuserses
	 */
	@Override
	public void cacheResult(List<lbusers> lbuserses) {
		for (lbusers lbusers : lbuserses) {
			if (entityCache.getResult(lbusersModelImpl.ENTITY_CACHE_ENABLED,
						lbusersImpl.class, lbusers.getPrimaryKey()) == null) {
				cacheResult(lbusers);
			}
			else {
				lbusers.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all lbuserses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(lbusersImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the lbusers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(lbusers lbusers) {
		entityCache.removeResult(lbusersModelImpl.ENTITY_CACHE_ENABLED,
			lbusersImpl.class, lbusers.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<lbusers> lbuserses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (lbusers lbusers : lbuserses) {
			entityCache.removeResult(lbusersModelImpl.ENTITY_CACHE_ENABLED,
				lbusersImpl.class, lbusers.getPrimaryKey());
		}
	}

	/**
	 * Creates a new lbusers with the primary key. Does not add the lbusers to the database.
	 *
	 * @param id the primary key for the new lbusers
	 * @return the new lbusers
	 */
	@Override
	public lbusers create(long id) {
		lbusers lbusers = new lbusersImpl();

		lbusers.setNew(true);
		lbusers.setPrimaryKey(id);

		return lbusers;
	}

	/**
	 * Removes the lbusers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the lbusers
	 * @return the lbusers that was removed
	 * @throws NoSuchlbusersException if a lbusers with the primary key could not be found
	 */
	@Override
	public lbusers remove(long id) throws NoSuchlbusersException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the lbusers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the lbusers
	 * @return the lbusers that was removed
	 * @throws NoSuchlbusersException if a lbusers with the primary key could not be found
	 */
	@Override
	public lbusers remove(Serializable primaryKey)
		throws NoSuchlbusersException {
		Session session = null;

		try {
			session = openSession();

			lbusers lbusers = (lbusers)session.get(lbusersImpl.class, primaryKey);

			if (lbusers == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchlbusersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(lbusers);
		}
		catch (NoSuchlbusersException nsee) {
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
	protected lbusers removeImpl(lbusers lbusers) {
		lbusers = toUnwrappedModel(lbusers);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(lbusers)) {
				lbusers = (lbusers)session.get(lbusersImpl.class,
						lbusers.getPrimaryKeyObj());
			}

			if (lbusers != null) {
				session.delete(lbusers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (lbusers != null) {
			clearCache(lbusers);
		}

		return lbusers;
	}

	@Override
	public lbusers updateImpl(lbusers lbusers) {
		lbusers = toUnwrappedModel(lbusers);

		boolean isNew = lbusers.isNew();

		lbusersModelImpl lbusersModelImpl = (lbusersModelImpl)lbusers;

		Session session = null;

		try {
			session = openSession();

			if (lbusers.isNew()) {
				session.save(lbusers);

				lbusers.setNew(false);
			}
			else {
				lbusers = (lbusers)session.merge(lbusers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !lbusersModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((lbusersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LB_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { lbusersModelImpl.getOriginalLb_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LB_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LB_ID,
					args);

				args = new Object[] { lbusersModelImpl.getLb_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LB_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LB_ID,
					args);
			}

			if ((lbusersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lbusersModelImpl.getOriginalUser_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID,
					args);

				args = new Object[] { lbusersModelImpl.getUser_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID,
					args);
			}
		}

		entityCache.putResult(lbusersModelImpl.ENTITY_CACHE_ENABLED,
			lbusersImpl.class, lbusers.getPrimaryKey(), lbusers, false);

		lbusers.resetOriginalValues();

		return lbusers;
	}

	protected lbusers toUnwrappedModel(lbusers lbusers) {
		if (lbusers instanceof lbusersImpl) {
			return lbusers;
		}

		lbusersImpl lbusersImpl = new lbusersImpl();

		lbusersImpl.setNew(lbusers.isNew());
		lbusersImpl.setPrimaryKey(lbusers.getPrimaryKey());

		lbusersImpl.setId(lbusers.getId());
		lbusersImpl.setUser_id(lbusers.getUser_id());
		lbusersImpl.setLb_id(lbusers.getLb_id());

		return lbusersImpl;
	}

	/**
	 * Returns the lbusers with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the lbusers
	 * @return the lbusers
	 * @throws NoSuchlbusersException if a lbusers with the primary key could not be found
	 */
	@Override
	public lbusers findByPrimaryKey(Serializable primaryKey)
		throws NoSuchlbusersException {
		lbusers lbusers = fetchByPrimaryKey(primaryKey);

		if (lbusers == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchlbusersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return lbusers;
	}

	/**
	 * Returns the lbusers with the primary key or throws a {@link NoSuchlbusersException} if it could not be found.
	 *
	 * @param id the primary key of the lbusers
	 * @return the lbusers
	 * @throws NoSuchlbusersException if a lbusers with the primary key could not be found
	 */
	@Override
	public lbusers findByPrimaryKey(long id) throws NoSuchlbusersException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the lbusers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the lbusers
	 * @return the lbusers, or <code>null</code> if a lbusers with the primary key could not be found
	 */
	@Override
	public lbusers fetchByPrimaryKey(Serializable primaryKey) {
		lbusers lbusers = (lbusers)entityCache.getResult(lbusersModelImpl.ENTITY_CACHE_ENABLED,
				lbusersImpl.class, primaryKey);

		if (lbusers == _nulllbusers) {
			return null;
		}

		if (lbusers == null) {
			Session session = null;

			try {
				session = openSession();

				lbusers = (lbusers)session.get(lbusersImpl.class, primaryKey);

				if (lbusers != null) {
					cacheResult(lbusers);
				}
				else {
					entityCache.putResult(lbusersModelImpl.ENTITY_CACHE_ENABLED,
						lbusersImpl.class, primaryKey, _nulllbusers);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(lbusersModelImpl.ENTITY_CACHE_ENABLED,
					lbusersImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return lbusers;
	}

	/**
	 * Returns the lbusers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the lbusers
	 * @return the lbusers, or <code>null</code> if a lbusers with the primary key could not be found
	 */
	@Override
	public lbusers fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, lbusers> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, lbusers> map = new HashMap<Serializable, lbusers>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			lbusers lbusers = fetchByPrimaryKey(primaryKey);

			if (lbusers != null) {
				map.put(primaryKey, lbusers);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			lbusers lbusers = (lbusers)entityCache.getResult(lbusersModelImpl.ENTITY_CACHE_ENABLED,
					lbusersImpl.class, primaryKey);

			if (lbusers == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, lbusers);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_LBUSERS_WHERE_PKS_IN);

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

			for (lbusers lbusers : (List<lbusers>)q.list()) {
				map.put(lbusers.getPrimaryKeyObj(), lbusers);

				cacheResult(lbusers);

				uncachedPrimaryKeys.remove(lbusers.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(lbusersModelImpl.ENTITY_CACHE_ENABLED,
					lbusersImpl.class, primaryKey, _nulllbusers);
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
	 * Returns all the lbuserses.
	 *
	 * @return the lbuserses
	 */
	@Override
	public List<lbusers> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lbuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lbuserses
	 * @param end the upper bound of the range of lbuserses (not inclusive)
	 * @return the range of lbuserses
	 */
	@Override
	public List<lbusers> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the lbuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lbuserses
	 * @param end the upper bound of the range of lbuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of lbuserses
	 */
	@Override
	public List<lbusers> findAll(int start, int end,
		OrderByComparator<lbusers> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the lbuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lbuserses
	 * @param end the upper bound of the range of lbuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of lbuserses
	 */
	@Override
	public List<lbusers> findAll(int start, int end,
		OrderByComparator<lbusers> orderByComparator, boolean retrieveFromCache) {
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

		List<lbusers> list = null;

		if (retrieveFromCache) {
			list = (List<lbusers>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_LBUSERS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LBUSERS;

				if (pagination) {
					sql = sql.concat(lbusersModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<lbusers>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<lbusers>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the lbuserses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (lbusers lbusers : findAll()) {
			remove(lbusers);
		}
	}

	/**
	 * Returns the number of lbuserses.
	 *
	 * @return the number of lbuserses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LBUSERS);

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
		return lbusersModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the lbusers persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(lbusersImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_LBUSERS = "SELECT lbusers FROM lbusers lbusers";
	private static final String _SQL_SELECT_LBUSERS_WHERE_PKS_IN = "SELECT lbusers FROM lbusers lbusers WHERE id_ IN (";
	private static final String _SQL_SELECT_LBUSERS_WHERE = "SELECT lbusers FROM lbusers lbusers WHERE ";
	private static final String _SQL_COUNT_LBUSERS = "SELECT COUNT(lbusers) FROM lbusers lbusers";
	private static final String _SQL_COUNT_LBUSERS_WHERE = "SELECT COUNT(lbusers) FROM lbusers lbusers WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "lbusers.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No lbusers exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No lbusers exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(lbusersPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final lbusers _nulllbusers = new lbusersImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<lbusers> toCacheModel() {
				return _nulllbusersCacheModel;
			}
		};

	private static final CacheModel<lbusers> _nulllbusersCacheModel = new CacheModel<lbusers>() {
			@Override
			public lbusers toEntityModel() {
				return _nulllbusers;
			}
		};
}