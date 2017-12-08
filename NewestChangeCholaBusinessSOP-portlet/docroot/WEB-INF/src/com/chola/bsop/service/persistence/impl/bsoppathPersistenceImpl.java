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

package com.chola.bsop.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.bsop.exception.NoSuchbsoppathException;
import com.chola.bsop.model.bsoppath;
import com.chola.bsop.model.impl.bsoppathImpl;
import com.chola.bsop.model.impl.bsoppathModelImpl;
import com.chola.bsop.service.persistence.bsoppathPersistence;

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
 * The persistence implementation for the bsoppath service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see bsoppathPersistence
 * @see com.chola.bsop.service.persistence.bsoppathUtil
 * @generated
 */
@ProviderType
public class bsoppathPersistenceImpl extends BasePersistenceImpl<bsoppath>
	implements bsoppathPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link bsoppathUtil} to access the bsoppath persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = bsoppathImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(bsoppathModelImpl.ENTITY_CACHE_ENABLED,
			bsoppathModelImpl.FINDER_CACHE_ENABLED, bsoppathImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(bsoppathModelImpl.ENTITY_CACHE_ENABLED,
			bsoppathModelImpl.FINDER_CACHE_ENABLED, bsoppathImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(bsoppathModelImpl.ENTITY_CACHE_ENABLED,
			bsoppathModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SOP_ID = new FinderPath(bsoppathModelImpl.ENTITY_CACHE_ENABLED,
			bsoppathModelImpl.FINDER_CACHE_ENABLED, bsoppathImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySOP_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOP_ID =
		new FinderPath(bsoppathModelImpl.ENTITY_CACHE_ENABLED,
			bsoppathModelImpl.FINDER_CACHE_ENABLED, bsoppathImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySOP_ID",
			new String[] { Long.class.getName() },
			bsoppathModelImpl.BDETAILS_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SOP_ID = new FinderPath(bsoppathModelImpl.ENTITY_CACHE_ENABLED,
			bsoppathModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySOP_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the bsoppaths where bdetails_id = &#63;.
	 *
	 * @param bdetails_id the bdetails_id
	 * @return the matching bsoppaths
	 */
	@Override
	public List<bsoppath> findBySOP_ID(long bdetails_id) {
		return findBySOP_ID(bdetails_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the bsoppaths where bdetails_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param bdetails_id the bdetails_id
	 * @param start the lower bound of the range of bsoppaths
	 * @param end the upper bound of the range of bsoppaths (not inclusive)
	 * @return the range of matching bsoppaths
	 */
	@Override
	public List<bsoppath> findBySOP_ID(long bdetails_id, int start, int end) {
		return findBySOP_ID(bdetails_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bsoppaths where bdetails_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param bdetails_id the bdetails_id
	 * @param start the lower bound of the range of bsoppaths
	 * @param end the upper bound of the range of bsoppaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bsoppaths
	 */
	@Override
	public List<bsoppath> findBySOP_ID(long bdetails_id, int start, int end,
		OrderByComparator<bsoppath> orderByComparator) {
		return findBySOP_ID(bdetails_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bsoppaths where bdetails_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param bdetails_id the bdetails_id
	 * @param start the lower bound of the range of bsoppaths
	 * @param end the upper bound of the range of bsoppaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching bsoppaths
	 */
	@Override
	public List<bsoppath> findBySOP_ID(long bdetails_id, int start, int end,
		OrderByComparator<bsoppath> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOP_ID;
			finderArgs = new Object[] { bdetails_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SOP_ID;
			finderArgs = new Object[] { bdetails_id, start, end, orderByComparator };
		}

		List<bsoppath> list = null;

		if (retrieveFromCache) {
			list = (List<bsoppath>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (bsoppath bsoppath : list) {
					if ((bdetails_id != bsoppath.getBdetails_id())) {
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

			query.append(_SQL_SELECT_BSOPPATH_WHERE);

			query.append(_FINDER_COLUMN_SOP_ID_BDETAILS_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(bsoppathModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(bdetails_id);

				if (!pagination) {
					list = (List<bsoppath>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<bsoppath>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first bsoppath in the ordered set where bdetails_id = &#63;.
	 *
	 * @param bdetails_id the bdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bsoppath
	 * @throws NoSuchbsoppathException if a matching bsoppath could not be found
	 */
	@Override
	public bsoppath findBySOP_ID_First(long bdetails_id,
		OrderByComparator<bsoppath> orderByComparator)
		throws NoSuchbsoppathException {
		bsoppath bsoppath = fetchBySOP_ID_First(bdetails_id, orderByComparator);

		if (bsoppath != null) {
			return bsoppath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("bdetails_id=");
		msg.append(bdetails_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbsoppathException(msg.toString());
	}

	/**
	 * Returns the first bsoppath in the ordered set where bdetails_id = &#63;.
	 *
	 * @param bdetails_id the bdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bsoppath, or <code>null</code> if a matching bsoppath could not be found
	 */
	@Override
	public bsoppath fetchBySOP_ID_First(long bdetails_id,
		OrderByComparator<bsoppath> orderByComparator) {
		List<bsoppath> list = findBySOP_ID(bdetails_id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bsoppath in the ordered set where bdetails_id = &#63;.
	 *
	 * @param bdetails_id the bdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bsoppath
	 * @throws NoSuchbsoppathException if a matching bsoppath could not be found
	 */
	@Override
	public bsoppath findBySOP_ID_Last(long bdetails_id,
		OrderByComparator<bsoppath> orderByComparator)
		throws NoSuchbsoppathException {
		bsoppath bsoppath = fetchBySOP_ID_Last(bdetails_id, orderByComparator);

		if (bsoppath != null) {
			return bsoppath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("bdetails_id=");
		msg.append(bdetails_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbsoppathException(msg.toString());
	}

	/**
	 * Returns the last bsoppath in the ordered set where bdetails_id = &#63;.
	 *
	 * @param bdetails_id the bdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bsoppath, or <code>null</code> if a matching bsoppath could not be found
	 */
	@Override
	public bsoppath fetchBySOP_ID_Last(long bdetails_id,
		OrderByComparator<bsoppath> orderByComparator) {
		int count = countBySOP_ID(bdetails_id);

		if (count == 0) {
			return null;
		}

		List<bsoppath> list = findBySOP_ID(bdetails_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bsoppaths before and after the current bsoppath in the ordered set where bdetails_id = &#63;.
	 *
	 * @param id the primary key of the current bsoppath
	 * @param bdetails_id the bdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bsoppath
	 * @throws NoSuchbsoppathException if a bsoppath with the primary key could not be found
	 */
	@Override
	public bsoppath[] findBySOP_ID_PrevAndNext(long id, long bdetails_id,
		OrderByComparator<bsoppath> orderByComparator)
		throws NoSuchbsoppathException {
		bsoppath bsoppath = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			bsoppath[] array = new bsoppathImpl[3];

			array[0] = getBySOP_ID_PrevAndNext(session, bsoppath, bdetails_id,
					orderByComparator, true);

			array[1] = bsoppath;

			array[2] = getBySOP_ID_PrevAndNext(session, bsoppath, bdetails_id,
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

	protected bsoppath getBySOP_ID_PrevAndNext(Session session,
		bsoppath bsoppath, long bdetails_id,
		OrderByComparator<bsoppath> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BSOPPATH_WHERE);

		query.append(_FINDER_COLUMN_SOP_ID_BDETAILS_ID_2);

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
			query.append(bsoppathModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(bdetails_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(bsoppath);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<bsoppath> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bsoppaths where bdetails_id = &#63; from the database.
	 *
	 * @param bdetails_id the bdetails_id
	 */
	@Override
	public void removeBySOP_ID(long bdetails_id) {
		for (bsoppath bsoppath : findBySOP_ID(bdetails_id, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(bsoppath);
		}
	}

	/**
	 * Returns the number of bsoppaths where bdetails_id = &#63;.
	 *
	 * @param bdetails_id the bdetails_id
	 * @return the number of matching bsoppaths
	 */
	@Override
	public int countBySOP_ID(long bdetails_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SOP_ID;

		Object[] finderArgs = new Object[] { bdetails_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BSOPPATH_WHERE);

			query.append(_FINDER_COLUMN_SOP_ID_BDETAILS_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(bdetails_id);

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

	private static final String _FINDER_COLUMN_SOP_ID_BDETAILS_ID_2 = "bsoppath.bdetails_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(bsoppathModelImpl.ENTITY_CACHE_ENABLED,
			bsoppathModelImpl.FINDER_CACHE_ENABLED, bsoppathImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCONTENT_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(bsoppathModelImpl.ENTITY_CACHE_ENABLED,
			bsoppathModelImpl.FINDER_CACHE_ENABLED, bsoppathImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCONTENT_ID",
			new String[] { Long.class.getName() },
			bsoppathModelImpl.BDETAILSCONTENT_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTENT_ID = new FinderPath(bsoppathModelImpl.ENTITY_CACHE_ENABLED,
			bsoppathModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCONTENT_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the bsoppaths where bdetailscontent_id = &#63;.
	 *
	 * @param bdetailscontent_id the bdetailscontent_id
	 * @return the matching bsoppaths
	 */
	@Override
	public List<bsoppath> findByCONTENT_ID(long bdetailscontent_id) {
		return findByCONTENT_ID(bdetailscontent_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bsoppaths where bdetailscontent_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param bdetailscontent_id the bdetailscontent_id
	 * @param start the lower bound of the range of bsoppaths
	 * @param end the upper bound of the range of bsoppaths (not inclusive)
	 * @return the range of matching bsoppaths
	 */
	@Override
	public List<bsoppath> findByCONTENT_ID(long bdetailscontent_id, int start,
		int end) {
		return findByCONTENT_ID(bdetailscontent_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bsoppaths where bdetailscontent_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param bdetailscontent_id the bdetailscontent_id
	 * @param start the lower bound of the range of bsoppaths
	 * @param end the upper bound of the range of bsoppaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bsoppaths
	 */
	@Override
	public List<bsoppath> findByCONTENT_ID(long bdetailscontent_id, int start,
		int end, OrderByComparator<bsoppath> orderByComparator) {
		return findByCONTENT_ID(bdetailscontent_id, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bsoppaths where bdetailscontent_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param bdetailscontent_id the bdetailscontent_id
	 * @param start the lower bound of the range of bsoppaths
	 * @param end the upper bound of the range of bsoppaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching bsoppaths
	 */
	@Override
	public List<bsoppath> findByCONTENT_ID(long bdetailscontent_id, int start,
		int end, OrderByComparator<bsoppath> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID;
			finderArgs = new Object[] { bdetailscontent_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENT_ID;
			finderArgs = new Object[] {
					bdetailscontent_id,
					
					start, end, orderByComparator
				};
		}

		List<bsoppath> list = null;

		if (retrieveFromCache) {
			list = (List<bsoppath>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (bsoppath bsoppath : list) {
					if ((bdetailscontent_id != bsoppath.getBdetailscontent_id())) {
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

			query.append(_SQL_SELECT_BSOPPATH_WHERE);

			query.append(_FINDER_COLUMN_CONTENT_ID_BDETAILSCONTENT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(bsoppathModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(bdetailscontent_id);

				if (!pagination) {
					list = (List<bsoppath>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<bsoppath>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first bsoppath in the ordered set where bdetailscontent_id = &#63;.
	 *
	 * @param bdetailscontent_id the bdetailscontent_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bsoppath
	 * @throws NoSuchbsoppathException if a matching bsoppath could not be found
	 */
	@Override
	public bsoppath findByCONTENT_ID_First(long bdetailscontent_id,
		OrderByComparator<bsoppath> orderByComparator)
		throws NoSuchbsoppathException {
		bsoppath bsoppath = fetchByCONTENT_ID_First(bdetailscontent_id,
				orderByComparator);

		if (bsoppath != null) {
			return bsoppath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("bdetailscontent_id=");
		msg.append(bdetailscontent_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbsoppathException(msg.toString());
	}

	/**
	 * Returns the first bsoppath in the ordered set where bdetailscontent_id = &#63;.
	 *
	 * @param bdetailscontent_id the bdetailscontent_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bsoppath, or <code>null</code> if a matching bsoppath could not be found
	 */
	@Override
	public bsoppath fetchByCONTENT_ID_First(long bdetailscontent_id,
		OrderByComparator<bsoppath> orderByComparator) {
		List<bsoppath> list = findByCONTENT_ID(bdetailscontent_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bsoppath in the ordered set where bdetailscontent_id = &#63;.
	 *
	 * @param bdetailscontent_id the bdetailscontent_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bsoppath
	 * @throws NoSuchbsoppathException if a matching bsoppath could not be found
	 */
	@Override
	public bsoppath findByCONTENT_ID_Last(long bdetailscontent_id,
		OrderByComparator<bsoppath> orderByComparator)
		throws NoSuchbsoppathException {
		bsoppath bsoppath = fetchByCONTENT_ID_Last(bdetailscontent_id,
				orderByComparator);

		if (bsoppath != null) {
			return bsoppath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("bdetailscontent_id=");
		msg.append(bdetailscontent_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbsoppathException(msg.toString());
	}

	/**
	 * Returns the last bsoppath in the ordered set where bdetailscontent_id = &#63;.
	 *
	 * @param bdetailscontent_id the bdetailscontent_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bsoppath, or <code>null</code> if a matching bsoppath could not be found
	 */
	@Override
	public bsoppath fetchByCONTENT_ID_Last(long bdetailscontent_id,
		OrderByComparator<bsoppath> orderByComparator) {
		int count = countByCONTENT_ID(bdetailscontent_id);

		if (count == 0) {
			return null;
		}

		List<bsoppath> list = findByCONTENT_ID(bdetailscontent_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bsoppaths before and after the current bsoppath in the ordered set where bdetailscontent_id = &#63;.
	 *
	 * @param id the primary key of the current bsoppath
	 * @param bdetailscontent_id the bdetailscontent_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bsoppath
	 * @throws NoSuchbsoppathException if a bsoppath with the primary key could not be found
	 */
	@Override
	public bsoppath[] findByCONTENT_ID_PrevAndNext(long id,
		long bdetailscontent_id, OrderByComparator<bsoppath> orderByComparator)
		throws NoSuchbsoppathException {
		bsoppath bsoppath = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			bsoppath[] array = new bsoppathImpl[3];

			array[0] = getByCONTENT_ID_PrevAndNext(session, bsoppath,
					bdetailscontent_id, orderByComparator, true);

			array[1] = bsoppath;

			array[2] = getByCONTENT_ID_PrevAndNext(session, bsoppath,
					bdetailscontent_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected bsoppath getByCONTENT_ID_PrevAndNext(Session session,
		bsoppath bsoppath, long bdetailscontent_id,
		OrderByComparator<bsoppath> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BSOPPATH_WHERE);

		query.append(_FINDER_COLUMN_CONTENT_ID_BDETAILSCONTENT_ID_2);

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
			query.append(bsoppathModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(bdetailscontent_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(bsoppath);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<bsoppath> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bsoppaths where bdetailscontent_id = &#63; from the database.
	 *
	 * @param bdetailscontent_id the bdetailscontent_id
	 */
	@Override
	public void removeByCONTENT_ID(long bdetailscontent_id) {
		for (bsoppath bsoppath : findByCONTENT_ID(bdetailscontent_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(bsoppath);
		}
	}

	/**
	 * Returns the number of bsoppaths where bdetailscontent_id = &#63;.
	 *
	 * @param bdetailscontent_id the bdetailscontent_id
	 * @return the number of matching bsoppaths
	 */
	@Override
	public int countByCONTENT_ID(long bdetailscontent_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTENT_ID;

		Object[] finderArgs = new Object[] { bdetailscontent_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BSOPPATH_WHERE);

			query.append(_FINDER_COLUMN_CONTENT_ID_BDETAILSCONTENT_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(bdetailscontent_id);

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

	private static final String _FINDER_COLUMN_CONTENT_ID_BDETAILSCONTENT_ID_2 = "bsoppath.bdetailscontent_id = ?";

	public bsoppathPersistenceImpl() {
		setModelClass(bsoppath.class);
	}

	/**
	 * Caches the bsoppath in the entity cache if it is enabled.
	 *
	 * @param bsoppath the bsoppath
	 */
	@Override
	public void cacheResult(bsoppath bsoppath) {
		entityCache.putResult(bsoppathModelImpl.ENTITY_CACHE_ENABLED,
			bsoppathImpl.class, bsoppath.getPrimaryKey(), bsoppath);

		bsoppath.resetOriginalValues();
	}

	/**
	 * Caches the bsoppaths in the entity cache if it is enabled.
	 *
	 * @param bsoppaths the bsoppaths
	 */
	@Override
	public void cacheResult(List<bsoppath> bsoppaths) {
		for (bsoppath bsoppath : bsoppaths) {
			if (entityCache.getResult(bsoppathModelImpl.ENTITY_CACHE_ENABLED,
						bsoppathImpl.class, bsoppath.getPrimaryKey()) == null) {
				cacheResult(bsoppath);
			}
			else {
				bsoppath.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all bsoppaths.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(bsoppathImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the bsoppath.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(bsoppath bsoppath) {
		entityCache.removeResult(bsoppathModelImpl.ENTITY_CACHE_ENABLED,
			bsoppathImpl.class, bsoppath.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<bsoppath> bsoppaths) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (bsoppath bsoppath : bsoppaths) {
			entityCache.removeResult(bsoppathModelImpl.ENTITY_CACHE_ENABLED,
				bsoppathImpl.class, bsoppath.getPrimaryKey());
		}
	}

	/**
	 * Creates a new bsoppath with the primary key. Does not add the bsoppath to the database.
	 *
	 * @param id the primary key for the new bsoppath
	 * @return the new bsoppath
	 */
	@Override
	public bsoppath create(long id) {
		bsoppath bsoppath = new bsoppathImpl();

		bsoppath.setNew(true);
		bsoppath.setPrimaryKey(id);

		return bsoppath;
	}

	/**
	 * Removes the bsoppath with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the bsoppath
	 * @return the bsoppath that was removed
	 * @throws NoSuchbsoppathException if a bsoppath with the primary key could not be found
	 */
	@Override
	public bsoppath remove(long id) throws NoSuchbsoppathException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the bsoppath with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bsoppath
	 * @return the bsoppath that was removed
	 * @throws NoSuchbsoppathException if a bsoppath with the primary key could not be found
	 */
	@Override
	public bsoppath remove(Serializable primaryKey)
		throws NoSuchbsoppathException {
		Session session = null;

		try {
			session = openSession();

			bsoppath bsoppath = (bsoppath)session.get(bsoppathImpl.class,
					primaryKey);

			if (bsoppath == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbsoppathException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(bsoppath);
		}
		catch (NoSuchbsoppathException nsee) {
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
	protected bsoppath removeImpl(bsoppath bsoppath) {
		bsoppath = toUnwrappedModel(bsoppath);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bsoppath)) {
				bsoppath = (bsoppath)session.get(bsoppathImpl.class,
						bsoppath.getPrimaryKeyObj());
			}

			if (bsoppath != null) {
				session.delete(bsoppath);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (bsoppath != null) {
			clearCache(bsoppath);
		}

		return bsoppath;
	}

	@Override
	public bsoppath updateImpl(bsoppath bsoppath) {
		bsoppath = toUnwrappedModel(bsoppath);

		boolean isNew = bsoppath.isNew();

		bsoppathModelImpl bsoppathModelImpl = (bsoppathModelImpl)bsoppath;

		Session session = null;

		try {
			session = openSession();

			if (bsoppath.isNew()) {
				session.save(bsoppath);

				bsoppath.setNew(false);
			}
			else {
				bsoppath = (bsoppath)session.merge(bsoppath);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !bsoppathModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((bsoppathModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOP_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bsoppathModelImpl.getOriginalBdetails_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SOP_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOP_ID,
					args);

				args = new Object[] { bsoppathModelImpl.getBdetails_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SOP_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOP_ID,
					args);
			}

			if ((bsoppathModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bsoppathModelImpl.getOriginalBdetailscontent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);

				args = new Object[] { bsoppathModelImpl.getBdetailscontent_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);
			}
		}

		entityCache.putResult(bsoppathModelImpl.ENTITY_CACHE_ENABLED,
			bsoppathImpl.class, bsoppath.getPrimaryKey(), bsoppath, false);

		bsoppath.resetOriginalValues();

		return bsoppath;
	}

	protected bsoppath toUnwrappedModel(bsoppath bsoppath) {
		if (bsoppath instanceof bsoppathImpl) {
			return bsoppath;
		}

		bsoppathImpl bsoppathImpl = new bsoppathImpl();

		bsoppathImpl.setNew(bsoppath.isNew());
		bsoppathImpl.setPrimaryKey(bsoppath.getPrimaryKey());

		bsoppathImpl.setId(bsoppath.getId());
		bsoppathImpl.setBdoc(bsoppath.getBdoc());
		bsoppathImpl.setBpath(bsoppath.getBpath());
		bsoppathImpl.setCreateddate(bsoppath.getCreateddate());
		bsoppathImpl.setCreatedby(bsoppath.getCreatedby());
		bsoppathImpl.setFlag(bsoppath.getFlag());
		bsoppathImpl.setBdetails_id(bsoppath.getBdetails_id());
		bsoppathImpl.setBdetailscontent_id(bsoppath.getBdetailscontent_id());
		bsoppathImpl.setFilename(bsoppath.getFilename());

		return bsoppathImpl;
	}

	/**
	 * Returns the bsoppath with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the bsoppath
	 * @return the bsoppath
	 * @throws NoSuchbsoppathException if a bsoppath with the primary key could not be found
	 */
	@Override
	public bsoppath findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbsoppathException {
		bsoppath bsoppath = fetchByPrimaryKey(primaryKey);

		if (bsoppath == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbsoppathException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return bsoppath;
	}

	/**
	 * Returns the bsoppath with the primary key or throws a {@link NoSuchbsoppathException} if it could not be found.
	 *
	 * @param id the primary key of the bsoppath
	 * @return the bsoppath
	 * @throws NoSuchbsoppathException if a bsoppath with the primary key could not be found
	 */
	@Override
	public bsoppath findByPrimaryKey(long id) throws NoSuchbsoppathException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the bsoppath with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bsoppath
	 * @return the bsoppath, or <code>null</code> if a bsoppath with the primary key could not be found
	 */
	@Override
	public bsoppath fetchByPrimaryKey(Serializable primaryKey) {
		bsoppath bsoppath = (bsoppath)entityCache.getResult(bsoppathModelImpl.ENTITY_CACHE_ENABLED,
				bsoppathImpl.class, primaryKey);

		if (bsoppath == _nullbsoppath) {
			return null;
		}

		if (bsoppath == null) {
			Session session = null;

			try {
				session = openSession();

				bsoppath = (bsoppath)session.get(bsoppathImpl.class, primaryKey);

				if (bsoppath != null) {
					cacheResult(bsoppath);
				}
				else {
					entityCache.putResult(bsoppathModelImpl.ENTITY_CACHE_ENABLED,
						bsoppathImpl.class, primaryKey, _nullbsoppath);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(bsoppathModelImpl.ENTITY_CACHE_ENABLED,
					bsoppathImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return bsoppath;
	}

	/**
	 * Returns the bsoppath with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the bsoppath
	 * @return the bsoppath, or <code>null</code> if a bsoppath with the primary key could not be found
	 */
	@Override
	public bsoppath fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, bsoppath> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, bsoppath> map = new HashMap<Serializable, bsoppath>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			bsoppath bsoppath = fetchByPrimaryKey(primaryKey);

			if (bsoppath != null) {
				map.put(primaryKey, bsoppath);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			bsoppath bsoppath = (bsoppath)entityCache.getResult(bsoppathModelImpl.ENTITY_CACHE_ENABLED,
					bsoppathImpl.class, primaryKey);

			if (bsoppath == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, bsoppath);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BSOPPATH_WHERE_PKS_IN);

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

			for (bsoppath bsoppath : (List<bsoppath>)q.list()) {
				map.put(bsoppath.getPrimaryKeyObj(), bsoppath);

				cacheResult(bsoppath);

				uncachedPrimaryKeys.remove(bsoppath.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(bsoppathModelImpl.ENTITY_CACHE_ENABLED,
					bsoppathImpl.class, primaryKey, _nullbsoppath);
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
	 * Returns all the bsoppaths.
	 *
	 * @return the bsoppaths
	 */
	@Override
	public List<bsoppath> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bsoppaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bsoppaths
	 * @param end the upper bound of the range of bsoppaths (not inclusive)
	 * @return the range of bsoppaths
	 */
	@Override
	public List<bsoppath> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bsoppaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bsoppaths
	 * @param end the upper bound of the range of bsoppaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bsoppaths
	 */
	@Override
	public List<bsoppath> findAll(int start, int end,
		OrderByComparator<bsoppath> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bsoppaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bsoppaths
	 * @param end the upper bound of the range of bsoppaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of bsoppaths
	 */
	@Override
	public List<bsoppath> findAll(int start, int end,
		OrderByComparator<bsoppath> orderByComparator, boolean retrieveFromCache) {
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

		List<bsoppath> list = null;

		if (retrieveFromCache) {
			list = (List<bsoppath>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BSOPPATH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BSOPPATH;

				if (pagination) {
					sql = sql.concat(bsoppathModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<bsoppath>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<bsoppath>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the bsoppaths from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (bsoppath bsoppath : findAll()) {
			remove(bsoppath);
		}
	}

	/**
	 * Returns the number of bsoppaths.
	 *
	 * @return the number of bsoppaths
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BSOPPATH);

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
		return bsoppathModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the bsoppath persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(bsoppathImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_BSOPPATH = "SELECT bsoppath FROM bsoppath bsoppath";
	private static final String _SQL_SELECT_BSOPPATH_WHERE_PKS_IN = "SELECT bsoppath FROM bsoppath bsoppath WHERE id_ IN (";
	private static final String _SQL_SELECT_BSOPPATH_WHERE = "SELECT bsoppath FROM bsoppath bsoppath WHERE ";
	private static final String _SQL_COUNT_BSOPPATH = "SELECT COUNT(bsoppath) FROM bsoppath bsoppath";
	private static final String _SQL_COUNT_BSOPPATH_WHERE = "SELECT COUNT(bsoppath) FROM bsoppath bsoppath WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "bsoppath.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No bsoppath exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No bsoppath exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(bsoppathPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final bsoppath _nullbsoppath = new bsoppathImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<bsoppath> toCacheModel() {
				return _nullbsoppathCacheModel;
			}
		};

	private static final CacheModel<bsoppath> _nullbsoppathCacheModel = new CacheModel<bsoppath>() {
			@Override
			public bsoppath toEntityModel() {
				return _nullbsoppath;
			}
		};
}