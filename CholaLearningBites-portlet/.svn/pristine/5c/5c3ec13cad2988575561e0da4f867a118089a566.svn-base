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

import com.chola.learningbites.exception.NoSuchlbdetailsException;
import com.chola.learningbites.model.impl.lbdetailsImpl;
import com.chola.learningbites.model.impl.lbdetailsModelImpl;
import com.chola.learningbites.model.lbdetails;
import com.chola.learningbites.service.persistence.lbdetailsPersistence;

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
 * The persistence implementation for the lbdetails service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see lbdetailsPersistence
 * @see com.chola.learningbites.service.persistence.lbdetailsUtil
 * @generated
 */
@ProviderType
public class lbdetailsPersistenceImpl extends BasePersistenceImpl<lbdetails>
	implements lbdetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link lbdetailsUtil} to access the lbdetails persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = lbdetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(lbdetailsModelImpl.ENTITY_CACHE_ENABLED,
			lbdetailsModelImpl.FINDER_CACHE_ENABLED, lbdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(lbdetailsModelImpl.ENTITY_CACHE_ENABLED,
			lbdetailsModelImpl.FINDER_CACHE_ENABLED, lbdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(lbdetailsModelImpl.ENTITY_CACHE_ENABLED,
			lbdetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(lbdetailsModelImpl.ENTITY_CACHE_ENABLED,
			lbdetailsModelImpl.FINDER_CACHE_ENABLED, lbdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCONTENT_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(lbdetailsModelImpl.ENTITY_CACHE_ENABLED,
			lbdetailsModelImpl.FINDER_CACHE_ENABLED, lbdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCONTENT_ID",
			new String[] { Long.class.getName() },
			lbdetailsModelImpl.CONTENT_ID_COLUMN_BITMASK |
			lbdetailsModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTENT_ID = new FinderPath(lbdetailsModelImpl.ENTITY_CACHE_ENABLED,
			lbdetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCONTENT_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the lbdetailses where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the matching lbdetailses
	 */
	@Override
	public List<lbdetails> findByCONTENT_ID(long content_id) {
		return findByCONTENT_ID(content_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lbdetailses where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of lbdetailses
	 * @param end the upper bound of the range of lbdetailses (not inclusive)
	 * @return the range of matching lbdetailses
	 */
	@Override
	public List<lbdetails> findByCONTENT_ID(long content_id, int start, int end) {
		return findByCONTENT_ID(content_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the lbdetailses where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of lbdetailses
	 * @param end the upper bound of the range of lbdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching lbdetailses
	 */
	@Override
	public List<lbdetails> findByCONTENT_ID(long content_id, int start,
		int end, OrderByComparator<lbdetails> orderByComparator) {
		return findByCONTENT_ID(content_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the lbdetailses where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of lbdetailses
	 * @param end the upper bound of the range of lbdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching lbdetailses
	 */
	@Override
	public List<lbdetails> findByCONTENT_ID(long content_id, int start,
		int end, OrderByComparator<lbdetails> orderByComparator,
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

		List<lbdetails> list = null;

		if (retrieveFromCache) {
			list = (List<lbdetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (lbdetails lbdetails : list) {
					if ((content_id != lbdetails.getContent_id())) {
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

			query.append(_SQL_SELECT_LBDETAILS_WHERE);

			query.append(_FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(lbdetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(content_id);

				if (!pagination) {
					list = (List<lbdetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<lbdetails>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first lbdetails in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lbdetails
	 * @throws NoSuchlbdetailsException if a matching lbdetails could not be found
	 */
	@Override
	public lbdetails findByCONTENT_ID_First(long content_id,
		OrderByComparator<lbdetails> orderByComparator)
		throws NoSuchlbdetailsException {
		lbdetails lbdetails = fetchByCONTENT_ID_First(content_id,
				orderByComparator);

		if (lbdetails != null) {
			return lbdetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchlbdetailsException(msg.toString());
	}

	/**
	 * Returns the first lbdetails in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching lbdetails, or <code>null</code> if a matching lbdetails could not be found
	 */
	@Override
	public lbdetails fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<lbdetails> orderByComparator) {
		List<lbdetails> list = findByCONTENT_ID(content_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last lbdetails in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lbdetails
	 * @throws NoSuchlbdetailsException if a matching lbdetails could not be found
	 */
	@Override
	public lbdetails findByCONTENT_ID_Last(long content_id,
		OrderByComparator<lbdetails> orderByComparator)
		throws NoSuchlbdetailsException {
		lbdetails lbdetails = fetchByCONTENT_ID_Last(content_id,
				orderByComparator);

		if (lbdetails != null) {
			return lbdetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchlbdetailsException(msg.toString());
	}

	/**
	 * Returns the last lbdetails in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching lbdetails, or <code>null</code> if a matching lbdetails could not be found
	 */
	@Override
	public lbdetails fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<lbdetails> orderByComparator) {
		int count = countByCONTENT_ID(content_id);

		if (count == 0) {
			return null;
		}

		List<lbdetails> list = findByCONTENT_ID(content_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the lbdetailses before and after the current lbdetails in the ordered set where content_id = &#63;.
	 *
	 * @param id the primary key of the current lbdetails
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next lbdetails
	 * @throws NoSuchlbdetailsException if a lbdetails with the primary key could not be found
	 */
	@Override
	public lbdetails[] findByCONTENT_ID_PrevAndNext(long id, long content_id,
		OrderByComparator<lbdetails> orderByComparator)
		throws NoSuchlbdetailsException {
		lbdetails lbdetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			lbdetails[] array = new lbdetailsImpl[3];

			array[0] = getByCONTENT_ID_PrevAndNext(session, lbdetails,
					content_id, orderByComparator, true);

			array[1] = lbdetails;

			array[2] = getByCONTENT_ID_PrevAndNext(session, lbdetails,
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

	protected lbdetails getByCONTENT_ID_PrevAndNext(Session session,
		lbdetails lbdetails, long content_id,
		OrderByComparator<lbdetails> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_LBDETAILS_WHERE);

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
			query.append(lbdetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(content_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(lbdetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<lbdetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the lbdetailses where content_id = &#63; from the database.
	 *
	 * @param content_id the content_id
	 */
	@Override
	public void removeByCONTENT_ID(long content_id) {
		for (lbdetails lbdetails : findByCONTENT_ID(content_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(lbdetails);
		}
	}

	/**
	 * Returns the number of lbdetailses where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the number of matching lbdetailses
	 */
	@Override
	public int countByCONTENT_ID(long content_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTENT_ID;

		Object[] finderArgs = new Object[] { content_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_LBDETAILS_WHERE);

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

	private static final String _FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2 = "lbdetails.content_id = ?";

	public lbdetailsPersistenceImpl() {
		setModelClass(lbdetails.class);
	}

	/**
	 * Caches the lbdetails in the entity cache if it is enabled.
	 *
	 * @param lbdetails the lbdetails
	 */
	@Override
	public void cacheResult(lbdetails lbdetails) {
		entityCache.putResult(lbdetailsModelImpl.ENTITY_CACHE_ENABLED,
			lbdetailsImpl.class, lbdetails.getPrimaryKey(), lbdetails);

		lbdetails.resetOriginalValues();
	}

	/**
	 * Caches the lbdetailses in the entity cache if it is enabled.
	 *
	 * @param lbdetailses the lbdetailses
	 */
	@Override
	public void cacheResult(List<lbdetails> lbdetailses) {
		for (lbdetails lbdetails : lbdetailses) {
			if (entityCache.getResult(lbdetailsModelImpl.ENTITY_CACHE_ENABLED,
						lbdetailsImpl.class, lbdetails.getPrimaryKey()) == null) {
				cacheResult(lbdetails);
			}
			else {
				lbdetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all lbdetailses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(lbdetailsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the lbdetails.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(lbdetails lbdetails) {
		entityCache.removeResult(lbdetailsModelImpl.ENTITY_CACHE_ENABLED,
			lbdetailsImpl.class, lbdetails.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<lbdetails> lbdetailses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (lbdetails lbdetails : lbdetailses) {
			entityCache.removeResult(lbdetailsModelImpl.ENTITY_CACHE_ENABLED,
				lbdetailsImpl.class, lbdetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new lbdetails with the primary key. Does not add the lbdetails to the database.
	 *
	 * @param id the primary key for the new lbdetails
	 * @return the new lbdetails
	 */
	@Override
	public lbdetails create(long id) {
		lbdetails lbdetails = new lbdetailsImpl();

		lbdetails.setNew(true);
		lbdetails.setPrimaryKey(id);

		return lbdetails;
	}

	/**
	 * Removes the lbdetails with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the lbdetails
	 * @return the lbdetails that was removed
	 * @throws NoSuchlbdetailsException if a lbdetails with the primary key could not be found
	 */
	@Override
	public lbdetails remove(long id) throws NoSuchlbdetailsException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the lbdetails with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the lbdetails
	 * @return the lbdetails that was removed
	 * @throws NoSuchlbdetailsException if a lbdetails with the primary key could not be found
	 */
	@Override
	public lbdetails remove(Serializable primaryKey)
		throws NoSuchlbdetailsException {
		Session session = null;

		try {
			session = openSession();

			lbdetails lbdetails = (lbdetails)session.get(lbdetailsImpl.class,
					primaryKey);

			if (lbdetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchlbdetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(lbdetails);
		}
		catch (NoSuchlbdetailsException nsee) {
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
	protected lbdetails removeImpl(lbdetails lbdetails) {
		lbdetails = toUnwrappedModel(lbdetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(lbdetails)) {
				lbdetails = (lbdetails)session.get(lbdetailsImpl.class,
						lbdetails.getPrimaryKeyObj());
			}

			if (lbdetails != null) {
				session.delete(lbdetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (lbdetails != null) {
			clearCache(lbdetails);
		}

		return lbdetails;
	}

	@Override
	public lbdetails updateImpl(lbdetails lbdetails) {
		lbdetails = toUnwrappedModel(lbdetails);

		boolean isNew = lbdetails.isNew();

		lbdetailsModelImpl lbdetailsModelImpl = (lbdetailsModelImpl)lbdetails;

		Session session = null;

		try {
			session = openSession();

			if (lbdetails.isNew()) {
				session.save(lbdetails);

				lbdetails.setNew(false);
			}
			else {
				lbdetails = (lbdetails)session.merge(lbdetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !lbdetailsModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((lbdetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						lbdetailsModelImpl.getOriginalContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);

				args = new Object[] { lbdetailsModelImpl.getContent_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);
			}
		}

		entityCache.putResult(lbdetailsModelImpl.ENTITY_CACHE_ENABLED,
			lbdetailsImpl.class, lbdetails.getPrimaryKey(), lbdetails, false);

		lbdetails.resetOriginalValues();

		return lbdetails;
	}

	protected lbdetails toUnwrappedModel(lbdetails lbdetails) {
		if (lbdetails instanceof lbdetailsImpl) {
			return lbdetails;
		}

		lbdetailsImpl lbdetailsImpl = new lbdetailsImpl();

		lbdetailsImpl.setNew(lbdetails.isNew());
		lbdetailsImpl.setPrimaryKey(lbdetails.getPrimaryKey());

		lbdetailsImpl.setId(lbdetails.getId());
		lbdetailsImpl.setContent_id(lbdetails.getContent_id());
		lbdetailsImpl.setLbtitle(lbdetails.getLbtitle());
		lbdetailsImpl.setLbdescription(lbdetails.getLbdescription());
		lbdetailsImpl.setLbfilename(lbdetails.getLbfilename());
		lbdetailsImpl.setLbfilepath(lbdetails.getLbfilepath());
		lbdetailsImpl.setCreateddate(lbdetails.getCreateddate());
		lbdetailsImpl.setCreatedby(lbdetails.getCreatedby());
		lbdetailsImpl.setModifieddate(lbdetails.getModifieddate());
		lbdetailsImpl.setModifiedby(lbdetails.getModifiedby());
		lbdetailsImpl.setFlag(lbdetails.getFlag());

		return lbdetailsImpl;
	}

	/**
	 * Returns the lbdetails with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the lbdetails
	 * @return the lbdetails
	 * @throws NoSuchlbdetailsException if a lbdetails with the primary key could not be found
	 */
	@Override
	public lbdetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchlbdetailsException {
		lbdetails lbdetails = fetchByPrimaryKey(primaryKey);

		if (lbdetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchlbdetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return lbdetails;
	}

	/**
	 * Returns the lbdetails with the primary key or throws a {@link NoSuchlbdetailsException} if it could not be found.
	 *
	 * @param id the primary key of the lbdetails
	 * @return the lbdetails
	 * @throws NoSuchlbdetailsException if a lbdetails with the primary key could not be found
	 */
	@Override
	public lbdetails findByPrimaryKey(long id) throws NoSuchlbdetailsException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the lbdetails with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the lbdetails
	 * @return the lbdetails, or <code>null</code> if a lbdetails with the primary key could not be found
	 */
	@Override
	public lbdetails fetchByPrimaryKey(Serializable primaryKey) {
		lbdetails lbdetails = (lbdetails)entityCache.getResult(lbdetailsModelImpl.ENTITY_CACHE_ENABLED,
				lbdetailsImpl.class, primaryKey);

		if (lbdetails == _nulllbdetails) {
			return null;
		}

		if (lbdetails == null) {
			Session session = null;

			try {
				session = openSession();

				lbdetails = (lbdetails)session.get(lbdetailsImpl.class,
						primaryKey);

				if (lbdetails != null) {
					cacheResult(lbdetails);
				}
				else {
					entityCache.putResult(lbdetailsModelImpl.ENTITY_CACHE_ENABLED,
						lbdetailsImpl.class, primaryKey, _nulllbdetails);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(lbdetailsModelImpl.ENTITY_CACHE_ENABLED,
					lbdetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return lbdetails;
	}

	/**
	 * Returns the lbdetails with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the lbdetails
	 * @return the lbdetails, or <code>null</code> if a lbdetails with the primary key could not be found
	 */
	@Override
	public lbdetails fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, lbdetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, lbdetails> map = new HashMap<Serializable, lbdetails>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			lbdetails lbdetails = fetchByPrimaryKey(primaryKey);

			if (lbdetails != null) {
				map.put(primaryKey, lbdetails);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			lbdetails lbdetails = (lbdetails)entityCache.getResult(lbdetailsModelImpl.ENTITY_CACHE_ENABLED,
					lbdetailsImpl.class, primaryKey);

			if (lbdetails == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, lbdetails);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_LBDETAILS_WHERE_PKS_IN);

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

			for (lbdetails lbdetails : (List<lbdetails>)q.list()) {
				map.put(lbdetails.getPrimaryKeyObj(), lbdetails);

				cacheResult(lbdetails);

				uncachedPrimaryKeys.remove(lbdetails.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(lbdetailsModelImpl.ENTITY_CACHE_ENABLED,
					lbdetailsImpl.class, primaryKey, _nulllbdetails);
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
	 * Returns all the lbdetailses.
	 *
	 * @return the lbdetailses
	 */
	@Override
	public List<lbdetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the lbdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lbdetailses
	 * @param end the upper bound of the range of lbdetailses (not inclusive)
	 * @return the range of lbdetailses
	 */
	@Override
	public List<lbdetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the lbdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lbdetailses
	 * @param end the upper bound of the range of lbdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of lbdetailses
	 */
	@Override
	public List<lbdetails> findAll(int start, int end,
		OrderByComparator<lbdetails> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the lbdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of lbdetailses
	 * @param end the upper bound of the range of lbdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of lbdetailses
	 */
	@Override
	public List<lbdetails> findAll(int start, int end,
		OrderByComparator<lbdetails> orderByComparator,
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

		List<lbdetails> list = null;

		if (retrieveFromCache) {
			list = (List<lbdetails>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_LBDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LBDETAILS;

				if (pagination) {
					sql = sql.concat(lbdetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<lbdetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<lbdetails>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the lbdetailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (lbdetails lbdetails : findAll()) {
			remove(lbdetails);
		}
	}

	/**
	 * Returns the number of lbdetailses.
	 *
	 * @return the number of lbdetailses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LBDETAILS);

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
		return lbdetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the lbdetails persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(lbdetailsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_LBDETAILS = "SELECT lbdetails FROM lbdetails lbdetails";
	private static final String _SQL_SELECT_LBDETAILS_WHERE_PKS_IN = "SELECT lbdetails FROM lbdetails lbdetails WHERE id_ IN (";
	private static final String _SQL_SELECT_LBDETAILS_WHERE = "SELECT lbdetails FROM lbdetails lbdetails WHERE ";
	private static final String _SQL_COUNT_LBDETAILS = "SELECT COUNT(lbdetails) FROM lbdetails lbdetails";
	private static final String _SQL_COUNT_LBDETAILS_WHERE = "SELECT COUNT(lbdetails) FROM lbdetails lbdetails WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "lbdetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No lbdetails exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No lbdetails exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(lbdetailsPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final lbdetails _nulllbdetails = new lbdetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<lbdetails> toCacheModel() {
				return _nulllbdetailsCacheModel;
			}
		};

	private static final CacheModel<lbdetails> _nulllbdetailsCacheModel = new CacheModel<lbdetails>() {
			@Override
			public lbdetails toEntityModel() {
				return _nulllbdetails;
			}
		};
}