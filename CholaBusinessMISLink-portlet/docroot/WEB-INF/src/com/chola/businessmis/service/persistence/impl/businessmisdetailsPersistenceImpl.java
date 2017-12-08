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

package com.chola.businessmis.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.businessmis.exception.NoSuchbusinessmisdetailsException;
import com.chola.businessmis.model.businessmisdetails;
import com.chola.businessmis.model.impl.businessmisdetailsImpl;
import com.chola.businessmis.model.impl.businessmisdetailsModelImpl;
import com.chola.businessmis.service.persistence.businessmisdetailsPersistence;

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
 * The persistence implementation for the businessmisdetails service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see businessmisdetailsPersistence
 * @see com.chola.businessmis.service.persistence.businessmisdetailsUtil
 * @generated
 */
@ProviderType
public class businessmisdetailsPersistenceImpl extends BasePersistenceImpl<businessmisdetails>
	implements businessmisdetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link businessmisdetailsUtil} to access the businessmisdetails persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = businessmisdetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(businessmisdetailsModelImpl.ENTITY_CACHE_ENABLED,
			businessmisdetailsModelImpl.FINDER_CACHE_ENABLED,
			businessmisdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(businessmisdetailsModelImpl.ENTITY_CACHE_ENABLED,
			businessmisdetailsModelImpl.FINDER_CACHE_ENABLED,
			businessmisdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(businessmisdetailsModelImpl.ENTITY_CACHE_ENABLED,
			businessmisdetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(businessmisdetailsModelImpl.ENTITY_CACHE_ENABLED,
			businessmisdetailsModelImpl.FINDER_CACHE_ENABLED,
			businessmisdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCONTENT_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(businessmisdetailsModelImpl.ENTITY_CACHE_ENABLED,
			businessmisdetailsModelImpl.FINDER_CACHE_ENABLED,
			businessmisdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCONTENT_ID",
			new String[] { Long.class.getName() },
			businessmisdetailsModelImpl.CONTENT_ID_COLUMN_BITMASK |
			businessmisdetailsModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTENT_ID = new FinderPath(businessmisdetailsModelImpl.ENTITY_CACHE_ENABLED,
			businessmisdetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCONTENT_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the businessmisdetailses where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the matching businessmisdetailses
	 */
	@Override
	public List<businessmisdetails> findByCONTENT_ID(long content_id) {
		return findByCONTENT_ID(content_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the businessmisdetailses where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of businessmisdetailses
	 * @param end the upper bound of the range of businessmisdetailses (not inclusive)
	 * @return the range of matching businessmisdetailses
	 */
	@Override
	public List<businessmisdetails> findByCONTENT_ID(long content_id,
		int start, int end) {
		return findByCONTENT_ID(content_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the businessmisdetailses where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of businessmisdetailses
	 * @param end the upper bound of the range of businessmisdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching businessmisdetailses
	 */
	@Override
	public List<businessmisdetails> findByCONTENT_ID(long content_id,
		int start, int end,
		OrderByComparator<businessmisdetails> orderByComparator) {
		return findByCONTENT_ID(content_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the businessmisdetailses where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of businessmisdetailses
	 * @param end the upper bound of the range of businessmisdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching businessmisdetailses
	 */
	@Override
	public List<businessmisdetails> findByCONTENT_ID(long content_id,
		int start, int end,
		OrderByComparator<businessmisdetails> orderByComparator,
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

		List<businessmisdetails> list = null;

		if (retrieveFromCache) {
			list = (List<businessmisdetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (businessmisdetails businessmisdetails : list) {
					if ((content_id != businessmisdetails.getContent_id())) {
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

			query.append(_SQL_SELECT_BUSINESSMISDETAILS_WHERE);

			query.append(_FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(businessmisdetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(content_id);

				if (!pagination) {
					list = (List<businessmisdetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<businessmisdetails>)QueryUtil.list(q,
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
	 * Returns the first businessmisdetails in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching businessmisdetails
	 * @throws NoSuchbusinessmisdetailsException if a matching businessmisdetails could not be found
	 */
	@Override
	public businessmisdetails findByCONTENT_ID_First(long content_id,
		OrderByComparator<businessmisdetails> orderByComparator)
		throws NoSuchbusinessmisdetailsException {
		businessmisdetails businessmisdetails = fetchByCONTENT_ID_First(content_id,
				orderByComparator);

		if (businessmisdetails != null) {
			return businessmisdetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbusinessmisdetailsException(msg.toString());
	}

	/**
	 * Returns the first businessmisdetails in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching businessmisdetails, or <code>null</code> if a matching businessmisdetails could not be found
	 */
	@Override
	public businessmisdetails fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<businessmisdetails> orderByComparator) {
		List<businessmisdetails> list = findByCONTENT_ID(content_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last businessmisdetails in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching businessmisdetails
	 * @throws NoSuchbusinessmisdetailsException if a matching businessmisdetails could not be found
	 */
	@Override
	public businessmisdetails findByCONTENT_ID_Last(long content_id,
		OrderByComparator<businessmisdetails> orderByComparator)
		throws NoSuchbusinessmisdetailsException {
		businessmisdetails businessmisdetails = fetchByCONTENT_ID_Last(content_id,
				orderByComparator);

		if (businessmisdetails != null) {
			return businessmisdetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbusinessmisdetailsException(msg.toString());
	}

	/**
	 * Returns the last businessmisdetails in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching businessmisdetails, or <code>null</code> if a matching businessmisdetails could not be found
	 */
	@Override
	public businessmisdetails fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<businessmisdetails> orderByComparator) {
		int count = countByCONTENT_ID(content_id);

		if (count == 0) {
			return null;
		}

		List<businessmisdetails> list = findByCONTENT_ID(content_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the businessmisdetailses before and after the current businessmisdetails in the ordered set where content_id = &#63;.
	 *
	 * @param id the primary key of the current businessmisdetails
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next businessmisdetails
	 * @throws NoSuchbusinessmisdetailsException if a businessmisdetails with the primary key could not be found
	 */
	@Override
	public businessmisdetails[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id, OrderByComparator<businessmisdetails> orderByComparator)
		throws NoSuchbusinessmisdetailsException {
		businessmisdetails businessmisdetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			businessmisdetails[] array = new businessmisdetailsImpl[3];

			array[0] = getByCONTENT_ID_PrevAndNext(session, businessmisdetails,
					content_id, orderByComparator, true);

			array[1] = businessmisdetails;

			array[2] = getByCONTENT_ID_PrevAndNext(session, businessmisdetails,
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

	protected businessmisdetails getByCONTENT_ID_PrevAndNext(Session session,
		businessmisdetails businessmisdetails, long content_id,
		OrderByComparator<businessmisdetails> orderByComparator,
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

		query.append(_SQL_SELECT_BUSINESSMISDETAILS_WHERE);

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
			query.append(businessmisdetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(content_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(businessmisdetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<businessmisdetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the businessmisdetailses where content_id = &#63; from the database.
	 *
	 * @param content_id the content_id
	 */
	@Override
	public void removeByCONTENT_ID(long content_id) {
		for (businessmisdetails businessmisdetails : findByCONTENT_ID(
				content_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(businessmisdetails);
		}
	}

	/**
	 * Returns the number of businessmisdetailses where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the number of matching businessmisdetailses
	 */
	@Override
	public int countByCONTENT_ID(long content_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTENT_ID;

		Object[] finderArgs = new Object[] { content_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BUSINESSMISDETAILS_WHERE);

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

	private static final String _FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2 = "businessmisdetails.content_id = ?";

	public businessmisdetailsPersistenceImpl() {
		setModelClass(businessmisdetails.class);
	}

	/**
	 * Caches the businessmisdetails in the entity cache if it is enabled.
	 *
	 * @param businessmisdetails the businessmisdetails
	 */
	@Override
	public void cacheResult(businessmisdetails businessmisdetails) {
		entityCache.putResult(businessmisdetailsModelImpl.ENTITY_CACHE_ENABLED,
			businessmisdetailsImpl.class, businessmisdetails.getPrimaryKey(),
			businessmisdetails);

		businessmisdetails.resetOriginalValues();
	}

	/**
	 * Caches the businessmisdetailses in the entity cache if it is enabled.
	 *
	 * @param businessmisdetailses the businessmisdetailses
	 */
	@Override
	public void cacheResult(List<businessmisdetails> businessmisdetailses) {
		for (businessmisdetails businessmisdetails : businessmisdetailses) {
			if (entityCache.getResult(
						businessmisdetailsModelImpl.ENTITY_CACHE_ENABLED,
						businessmisdetailsImpl.class,
						businessmisdetails.getPrimaryKey()) == null) {
				cacheResult(businessmisdetails);
			}
			else {
				businessmisdetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all businessmisdetailses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(businessmisdetailsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the businessmisdetails.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(businessmisdetails businessmisdetails) {
		entityCache.removeResult(businessmisdetailsModelImpl.ENTITY_CACHE_ENABLED,
			businessmisdetailsImpl.class, businessmisdetails.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<businessmisdetails> businessmisdetailses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (businessmisdetails businessmisdetails : businessmisdetailses) {
			entityCache.removeResult(businessmisdetailsModelImpl.ENTITY_CACHE_ENABLED,
				businessmisdetailsImpl.class, businessmisdetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new businessmisdetails with the primary key. Does not add the businessmisdetails to the database.
	 *
	 * @param id the primary key for the new businessmisdetails
	 * @return the new businessmisdetails
	 */
	@Override
	public businessmisdetails create(long id) {
		businessmisdetails businessmisdetails = new businessmisdetailsImpl();

		businessmisdetails.setNew(true);
		businessmisdetails.setPrimaryKey(id);

		return businessmisdetails;
	}

	/**
	 * Removes the businessmisdetails with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the businessmisdetails
	 * @return the businessmisdetails that was removed
	 * @throws NoSuchbusinessmisdetailsException if a businessmisdetails with the primary key could not be found
	 */
	@Override
	public businessmisdetails remove(long id)
		throws NoSuchbusinessmisdetailsException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the businessmisdetails with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the businessmisdetails
	 * @return the businessmisdetails that was removed
	 * @throws NoSuchbusinessmisdetailsException if a businessmisdetails with the primary key could not be found
	 */
	@Override
	public businessmisdetails remove(Serializable primaryKey)
		throws NoSuchbusinessmisdetailsException {
		Session session = null;

		try {
			session = openSession();

			businessmisdetails businessmisdetails = (businessmisdetails)session.get(businessmisdetailsImpl.class,
					primaryKey);

			if (businessmisdetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbusinessmisdetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(businessmisdetails);
		}
		catch (NoSuchbusinessmisdetailsException nsee) {
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
	protected businessmisdetails removeImpl(
		businessmisdetails businessmisdetails) {
		businessmisdetails = toUnwrappedModel(businessmisdetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(businessmisdetails)) {
				businessmisdetails = (businessmisdetails)session.get(businessmisdetailsImpl.class,
						businessmisdetails.getPrimaryKeyObj());
			}

			if (businessmisdetails != null) {
				session.delete(businessmisdetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (businessmisdetails != null) {
			clearCache(businessmisdetails);
		}

		return businessmisdetails;
	}

	@Override
	public businessmisdetails updateImpl(businessmisdetails businessmisdetails) {
		businessmisdetails = toUnwrappedModel(businessmisdetails);

		boolean isNew = businessmisdetails.isNew();

		businessmisdetailsModelImpl businessmisdetailsModelImpl = (businessmisdetailsModelImpl)businessmisdetails;

		Session session = null;

		try {
			session = openSession();

			if (businessmisdetails.isNew()) {
				session.save(businessmisdetails);

				businessmisdetails.setNew(false);
			}
			else {
				businessmisdetails = (businessmisdetails)session.merge(businessmisdetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !businessmisdetailsModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((businessmisdetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						businessmisdetailsModelImpl.getOriginalContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);

				args = new Object[] { businessmisdetailsModelImpl.getContent_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);
			}
		}

		entityCache.putResult(businessmisdetailsModelImpl.ENTITY_CACHE_ENABLED,
			businessmisdetailsImpl.class, businessmisdetails.getPrimaryKey(),
			businessmisdetails, false);

		businessmisdetails.resetOriginalValues();

		return businessmisdetails;
	}

	protected businessmisdetails toUnwrappedModel(
		businessmisdetails businessmisdetails) {
		if (businessmisdetails instanceof businessmisdetailsImpl) {
			return businessmisdetails;
		}

		businessmisdetailsImpl businessmisdetailsImpl = new businessmisdetailsImpl();

		businessmisdetailsImpl.setNew(businessmisdetails.isNew());
		businessmisdetailsImpl.setPrimaryKey(businessmisdetails.getPrimaryKey());

		businessmisdetailsImpl.setId(businessmisdetails.getId());
		businessmisdetailsImpl.setContent_id(businessmisdetails.getContent_id());
		businessmisdetailsImpl.setBusinesstitle(businessmisdetails.getBusinesstitle());
		businessmisdetailsImpl.setBusinessDesc(businessmisdetails.getBusinessDesc());
		businessmisdetailsImpl.setBusinessLink(businessmisdetails.getBusinessLink());
		businessmisdetailsImpl.setFilepath(businessmisdetails.getFilepath());
		businessmisdetailsImpl.setFilename(businessmisdetails.getFilename());
		businessmisdetailsImpl.setCreatedDate(businessmisdetails.getCreatedDate());
		businessmisdetailsImpl.setCreatedBy(businessmisdetails.getCreatedBy());
		businessmisdetailsImpl.setModifiedDate(businessmisdetails.getModifiedDate());
		businessmisdetailsImpl.setModifiedBy(businessmisdetails.getModifiedBy());
		businessmisdetailsImpl.setFlag(businessmisdetails.getFlag());

		return businessmisdetailsImpl;
	}

	/**
	 * Returns the businessmisdetails with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the businessmisdetails
	 * @return the businessmisdetails
	 * @throws NoSuchbusinessmisdetailsException if a businessmisdetails with the primary key could not be found
	 */
	@Override
	public businessmisdetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbusinessmisdetailsException {
		businessmisdetails businessmisdetails = fetchByPrimaryKey(primaryKey);

		if (businessmisdetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbusinessmisdetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return businessmisdetails;
	}

	/**
	 * Returns the businessmisdetails with the primary key or throws a {@link NoSuchbusinessmisdetailsException} if it could not be found.
	 *
	 * @param id the primary key of the businessmisdetails
	 * @return the businessmisdetails
	 * @throws NoSuchbusinessmisdetailsException if a businessmisdetails with the primary key could not be found
	 */
	@Override
	public businessmisdetails findByPrimaryKey(long id)
		throws NoSuchbusinessmisdetailsException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the businessmisdetails with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the businessmisdetails
	 * @return the businessmisdetails, or <code>null</code> if a businessmisdetails with the primary key could not be found
	 */
	@Override
	public businessmisdetails fetchByPrimaryKey(Serializable primaryKey) {
		businessmisdetails businessmisdetails = (businessmisdetails)entityCache.getResult(businessmisdetailsModelImpl.ENTITY_CACHE_ENABLED,
				businessmisdetailsImpl.class, primaryKey);

		if (businessmisdetails == _nullbusinessmisdetails) {
			return null;
		}

		if (businessmisdetails == null) {
			Session session = null;

			try {
				session = openSession();

				businessmisdetails = (businessmisdetails)session.get(businessmisdetailsImpl.class,
						primaryKey);

				if (businessmisdetails != null) {
					cacheResult(businessmisdetails);
				}
				else {
					entityCache.putResult(businessmisdetailsModelImpl.ENTITY_CACHE_ENABLED,
						businessmisdetailsImpl.class, primaryKey,
						_nullbusinessmisdetails);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(businessmisdetailsModelImpl.ENTITY_CACHE_ENABLED,
					businessmisdetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return businessmisdetails;
	}

	/**
	 * Returns the businessmisdetails with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the businessmisdetails
	 * @return the businessmisdetails, or <code>null</code> if a businessmisdetails with the primary key could not be found
	 */
	@Override
	public businessmisdetails fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, businessmisdetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, businessmisdetails> map = new HashMap<Serializable, businessmisdetails>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			businessmisdetails businessmisdetails = fetchByPrimaryKey(primaryKey);

			if (businessmisdetails != null) {
				map.put(primaryKey, businessmisdetails);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			businessmisdetails businessmisdetails = (businessmisdetails)entityCache.getResult(businessmisdetailsModelImpl.ENTITY_CACHE_ENABLED,
					businessmisdetailsImpl.class, primaryKey);

			if (businessmisdetails == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, businessmisdetails);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BUSINESSMISDETAILS_WHERE_PKS_IN);

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

			for (businessmisdetails businessmisdetails : (List<businessmisdetails>)q.list()) {
				map.put(businessmisdetails.getPrimaryKeyObj(),
					businessmisdetails);

				cacheResult(businessmisdetails);

				uncachedPrimaryKeys.remove(businessmisdetails.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(businessmisdetailsModelImpl.ENTITY_CACHE_ENABLED,
					businessmisdetailsImpl.class, primaryKey,
					_nullbusinessmisdetails);
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
	 * Returns all the businessmisdetailses.
	 *
	 * @return the businessmisdetailses
	 */
	@Override
	public List<businessmisdetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the businessmisdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of businessmisdetailses
	 * @param end the upper bound of the range of businessmisdetailses (not inclusive)
	 * @return the range of businessmisdetailses
	 */
	@Override
	public List<businessmisdetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the businessmisdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of businessmisdetailses
	 * @param end the upper bound of the range of businessmisdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of businessmisdetailses
	 */
	@Override
	public List<businessmisdetails> findAll(int start, int end,
		OrderByComparator<businessmisdetails> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the businessmisdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of businessmisdetailses
	 * @param end the upper bound of the range of businessmisdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of businessmisdetailses
	 */
	@Override
	public List<businessmisdetails> findAll(int start, int end,
		OrderByComparator<businessmisdetails> orderByComparator,
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

		List<businessmisdetails> list = null;

		if (retrieveFromCache) {
			list = (List<businessmisdetails>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BUSINESSMISDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BUSINESSMISDETAILS;

				if (pagination) {
					sql = sql.concat(businessmisdetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<businessmisdetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<businessmisdetails>)QueryUtil.list(q,
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
	 * Removes all the businessmisdetailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (businessmisdetails businessmisdetails : findAll()) {
			remove(businessmisdetails);
		}
	}

	/**
	 * Returns the number of businessmisdetailses.
	 *
	 * @return the number of businessmisdetailses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BUSINESSMISDETAILS);

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
		return businessmisdetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the businessmisdetails persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(businessmisdetailsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_BUSINESSMISDETAILS = "SELECT businessmisdetails FROM businessmisdetails businessmisdetails";
	private static final String _SQL_SELECT_BUSINESSMISDETAILS_WHERE_PKS_IN = "SELECT businessmisdetails FROM businessmisdetails businessmisdetails WHERE id_ IN (";
	private static final String _SQL_SELECT_BUSINESSMISDETAILS_WHERE = "SELECT businessmisdetails FROM businessmisdetails businessmisdetails WHERE ";
	private static final String _SQL_COUNT_BUSINESSMISDETAILS = "SELECT COUNT(businessmisdetails) FROM businessmisdetails businessmisdetails";
	private static final String _SQL_COUNT_BUSINESSMISDETAILS_WHERE = "SELECT COUNT(businessmisdetails) FROM businessmisdetails businessmisdetails WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "businessmisdetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No businessmisdetails exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No businessmisdetails exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(businessmisdetailsPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final businessmisdetails _nullbusinessmisdetails = new businessmisdetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<businessmisdetails> toCacheModel() {
				return _nullbusinessmisdetailsCacheModel;
			}
		};

	private static final CacheModel<businessmisdetails> _nullbusinessmisdetailsCacheModel =
		new CacheModel<businessmisdetails>() {
			@Override
			public businessmisdetails toEntityModel() {
				return _nullbusinessmisdetails;
			}
		};
}