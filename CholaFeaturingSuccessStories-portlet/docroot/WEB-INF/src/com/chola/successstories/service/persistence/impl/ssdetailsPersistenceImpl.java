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

package com.chola.successstories.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.successstories.exception.NoSuchssdetailsException;
import com.chola.successstories.model.impl.ssdetailsImpl;
import com.chola.successstories.model.impl.ssdetailsModelImpl;
import com.chola.successstories.model.ssdetails;
import com.chola.successstories.service.persistence.ssdetailsPersistence;

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
 * The persistence implementation for the ssdetails service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see ssdetailsPersistence
 * @see com.chola.successstories.service.persistence.ssdetailsUtil
 * @generated
 */
@ProviderType
public class ssdetailsPersistenceImpl extends BasePersistenceImpl<ssdetails>
	implements ssdetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ssdetailsUtil} to access the ssdetails persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ssdetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ssdetailsModelImpl.ENTITY_CACHE_ENABLED,
			ssdetailsModelImpl.FINDER_CACHE_ENABLED, ssdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ssdetailsModelImpl.ENTITY_CACHE_ENABLED,
			ssdetailsModelImpl.FINDER_CACHE_ENABLED, ssdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ssdetailsModelImpl.ENTITY_CACHE_ENABLED,
			ssdetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(ssdetailsModelImpl.ENTITY_CACHE_ENABLED,
			ssdetailsModelImpl.FINDER_CACHE_ENABLED, ssdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCONTENT_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(ssdetailsModelImpl.ENTITY_CACHE_ENABLED,
			ssdetailsModelImpl.FINDER_CACHE_ENABLED, ssdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCONTENT_ID",
			new String[] { Long.class.getName() },
			ssdetailsModelImpl.CONTENT_ID_COLUMN_BITMASK |
			ssdetailsModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTENT_ID = new FinderPath(ssdetailsModelImpl.ENTITY_CACHE_ENABLED,
			ssdetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCONTENT_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the ssdetailses where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the matching ssdetailses
	 */
	@Override
	public List<ssdetails> findByCONTENT_ID(long content_id) {
		return findByCONTENT_ID(content_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ssdetailses where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of ssdetailses
	 * @param end the upper bound of the range of ssdetailses (not inclusive)
	 * @return the range of matching ssdetailses
	 */
	@Override
	public List<ssdetails> findByCONTENT_ID(long content_id, int start, int end) {
		return findByCONTENT_ID(content_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ssdetailses where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of ssdetailses
	 * @param end the upper bound of the range of ssdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ssdetailses
	 */
	@Override
	public List<ssdetails> findByCONTENT_ID(long content_id, int start,
		int end, OrderByComparator<ssdetails> orderByComparator) {
		return findByCONTENT_ID(content_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ssdetailses where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of ssdetailses
	 * @param end the upper bound of the range of ssdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ssdetailses
	 */
	@Override
	public List<ssdetails> findByCONTENT_ID(long content_id, int start,
		int end, OrderByComparator<ssdetails> orderByComparator,
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

		List<ssdetails> list = null;

		if (retrieveFromCache) {
			list = (List<ssdetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ssdetails ssdetails : list) {
					if ((content_id != ssdetails.getContent_id())) {
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

			query.append(_SQL_SELECT_SSDETAILS_WHERE);

			query.append(_FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ssdetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(content_id);

				if (!pagination) {
					list = (List<ssdetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ssdetails>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ssdetails in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ssdetails
	 * @throws NoSuchssdetailsException if a matching ssdetails could not be found
	 */
	@Override
	public ssdetails findByCONTENT_ID_First(long content_id,
		OrderByComparator<ssdetails> orderByComparator)
		throws NoSuchssdetailsException {
		ssdetails ssdetails = fetchByCONTENT_ID_First(content_id,
				orderByComparator);

		if (ssdetails != null) {
			return ssdetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchssdetailsException(msg.toString());
	}

	/**
	 * Returns the first ssdetails in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ssdetails, or <code>null</code> if a matching ssdetails could not be found
	 */
	@Override
	public ssdetails fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<ssdetails> orderByComparator) {
		List<ssdetails> list = findByCONTENT_ID(content_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ssdetails in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ssdetails
	 * @throws NoSuchssdetailsException if a matching ssdetails could not be found
	 */
	@Override
	public ssdetails findByCONTENT_ID_Last(long content_id,
		OrderByComparator<ssdetails> orderByComparator)
		throws NoSuchssdetailsException {
		ssdetails ssdetails = fetchByCONTENT_ID_Last(content_id,
				orderByComparator);

		if (ssdetails != null) {
			return ssdetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchssdetailsException(msg.toString());
	}

	/**
	 * Returns the last ssdetails in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ssdetails, or <code>null</code> if a matching ssdetails could not be found
	 */
	@Override
	public ssdetails fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<ssdetails> orderByComparator) {
		int count = countByCONTENT_ID(content_id);

		if (count == 0) {
			return null;
		}

		List<ssdetails> list = findByCONTENT_ID(content_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ssdetailses before and after the current ssdetails in the ordered set where content_id = &#63;.
	 *
	 * @param id the primary key of the current ssdetails
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ssdetails
	 * @throws NoSuchssdetailsException if a ssdetails with the primary key could not be found
	 */
	@Override
	public ssdetails[] findByCONTENT_ID_PrevAndNext(long id, long content_id,
		OrderByComparator<ssdetails> orderByComparator)
		throws NoSuchssdetailsException {
		ssdetails ssdetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ssdetails[] array = new ssdetailsImpl[3];

			array[0] = getByCONTENT_ID_PrevAndNext(session, ssdetails,
					content_id, orderByComparator, true);

			array[1] = ssdetails;

			array[2] = getByCONTENT_ID_PrevAndNext(session, ssdetails,
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

	protected ssdetails getByCONTENT_ID_PrevAndNext(Session session,
		ssdetails ssdetails, long content_id,
		OrderByComparator<ssdetails> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SSDETAILS_WHERE);

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
			query.append(ssdetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(content_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(ssdetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ssdetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ssdetailses where content_id = &#63; from the database.
	 *
	 * @param content_id the content_id
	 */
	@Override
	public void removeByCONTENT_ID(long content_id) {
		for (ssdetails ssdetails : findByCONTENT_ID(content_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(ssdetails);
		}
	}

	/**
	 * Returns the number of ssdetailses where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the number of matching ssdetailses
	 */
	@Override
	public int countByCONTENT_ID(long content_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTENT_ID;

		Object[] finderArgs = new Object[] { content_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SSDETAILS_WHERE);

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

	private static final String _FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2 = "ssdetails.content_id = ?";

	public ssdetailsPersistenceImpl() {
		setModelClass(ssdetails.class);
	}

	/**
	 * Caches the ssdetails in the entity cache if it is enabled.
	 *
	 * @param ssdetails the ssdetails
	 */
	@Override
	public void cacheResult(ssdetails ssdetails) {
		entityCache.putResult(ssdetailsModelImpl.ENTITY_CACHE_ENABLED,
			ssdetailsImpl.class, ssdetails.getPrimaryKey(), ssdetails);

		ssdetails.resetOriginalValues();
	}

	/**
	 * Caches the ssdetailses in the entity cache if it is enabled.
	 *
	 * @param ssdetailses the ssdetailses
	 */
	@Override
	public void cacheResult(List<ssdetails> ssdetailses) {
		for (ssdetails ssdetails : ssdetailses) {
			if (entityCache.getResult(ssdetailsModelImpl.ENTITY_CACHE_ENABLED,
						ssdetailsImpl.class, ssdetails.getPrimaryKey()) == null) {
				cacheResult(ssdetails);
			}
			else {
				ssdetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ssdetailses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ssdetailsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ssdetails.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ssdetails ssdetails) {
		entityCache.removeResult(ssdetailsModelImpl.ENTITY_CACHE_ENABLED,
			ssdetailsImpl.class, ssdetails.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ssdetails> ssdetailses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ssdetails ssdetails : ssdetailses) {
			entityCache.removeResult(ssdetailsModelImpl.ENTITY_CACHE_ENABLED,
				ssdetailsImpl.class, ssdetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ssdetails with the primary key. Does not add the ssdetails to the database.
	 *
	 * @param id the primary key for the new ssdetails
	 * @return the new ssdetails
	 */
	@Override
	public ssdetails create(long id) {
		ssdetails ssdetails = new ssdetailsImpl();

		ssdetails.setNew(true);
		ssdetails.setPrimaryKey(id);

		return ssdetails;
	}

	/**
	 * Removes the ssdetails with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the ssdetails
	 * @return the ssdetails that was removed
	 * @throws NoSuchssdetailsException if a ssdetails with the primary key could not be found
	 */
	@Override
	public ssdetails remove(long id) throws NoSuchssdetailsException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the ssdetails with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ssdetails
	 * @return the ssdetails that was removed
	 * @throws NoSuchssdetailsException if a ssdetails with the primary key could not be found
	 */
	@Override
	public ssdetails remove(Serializable primaryKey)
		throws NoSuchssdetailsException {
		Session session = null;

		try {
			session = openSession();

			ssdetails ssdetails = (ssdetails)session.get(ssdetailsImpl.class,
					primaryKey);

			if (ssdetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchssdetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(ssdetails);
		}
		catch (NoSuchssdetailsException nsee) {
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
	protected ssdetails removeImpl(ssdetails ssdetails) {
		ssdetails = toUnwrappedModel(ssdetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ssdetails)) {
				ssdetails = (ssdetails)session.get(ssdetailsImpl.class,
						ssdetails.getPrimaryKeyObj());
			}

			if (ssdetails != null) {
				session.delete(ssdetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (ssdetails != null) {
			clearCache(ssdetails);
		}

		return ssdetails;
	}

	@Override
	public ssdetails updateImpl(ssdetails ssdetails) {
		ssdetails = toUnwrappedModel(ssdetails);

		boolean isNew = ssdetails.isNew();

		ssdetailsModelImpl ssdetailsModelImpl = (ssdetailsModelImpl)ssdetails;

		Session session = null;

		try {
			session = openSession();

			if (ssdetails.isNew()) {
				session.save(ssdetails);

				ssdetails.setNew(false);
			}
			else {
				ssdetails = (ssdetails)session.merge(ssdetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ssdetailsModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((ssdetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						ssdetailsModelImpl.getOriginalContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);

				args = new Object[] { ssdetailsModelImpl.getContent_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);
			}
		}

		entityCache.putResult(ssdetailsModelImpl.ENTITY_CACHE_ENABLED,
			ssdetailsImpl.class, ssdetails.getPrimaryKey(), ssdetails, false);

		ssdetails.resetOriginalValues();

		return ssdetails;
	}

	protected ssdetails toUnwrappedModel(ssdetails ssdetails) {
		if (ssdetails instanceof ssdetailsImpl) {
			return ssdetails;
		}

		ssdetailsImpl ssdetailsImpl = new ssdetailsImpl();

		ssdetailsImpl.setNew(ssdetails.isNew());
		ssdetailsImpl.setPrimaryKey(ssdetails.getPrimaryKey());

		ssdetailsImpl.setId(ssdetails.getId());
		ssdetailsImpl.setContent_id(ssdetails.getContent_id());
		ssdetailsImpl.setSstitle(ssdetails.getSstitle());
		ssdetailsImpl.setSsdesc(ssdetails.getSsdesc());
		ssdetailsImpl.setCreatedDate(ssdetails.getCreatedDate());
		ssdetailsImpl.setCreatedBy(ssdetails.getCreatedBy());
		ssdetailsImpl.setModifiedDate(ssdetails.getModifiedDate());
		ssdetailsImpl.setModifiedBy(ssdetails.getModifiedBy());
		ssdetailsImpl.setFlag(ssdetails.getFlag());

		return ssdetailsImpl;
	}

	/**
	 * Returns the ssdetails with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ssdetails
	 * @return the ssdetails
	 * @throws NoSuchssdetailsException if a ssdetails with the primary key could not be found
	 */
	@Override
	public ssdetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchssdetailsException {
		ssdetails ssdetails = fetchByPrimaryKey(primaryKey);

		if (ssdetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchssdetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return ssdetails;
	}

	/**
	 * Returns the ssdetails with the primary key or throws a {@link NoSuchssdetailsException} if it could not be found.
	 *
	 * @param id the primary key of the ssdetails
	 * @return the ssdetails
	 * @throws NoSuchssdetailsException if a ssdetails with the primary key could not be found
	 */
	@Override
	public ssdetails findByPrimaryKey(long id) throws NoSuchssdetailsException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the ssdetails with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ssdetails
	 * @return the ssdetails, or <code>null</code> if a ssdetails with the primary key could not be found
	 */
	@Override
	public ssdetails fetchByPrimaryKey(Serializable primaryKey) {
		ssdetails ssdetails = (ssdetails)entityCache.getResult(ssdetailsModelImpl.ENTITY_CACHE_ENABLED,
				ssdetailsImpl.class, primaryKey);

		if (ssdetails == _nullssdetails) {
			return null;
		}

		if (ssdetails == null) {
			Session session = null;

			try {
				session = openSession();

				ssdetails = (ssdetails)session.get(ssdetailsImpl.class,
						primaryKey);

				if (ssdetails != null) {
					cacheResult(ssdetails);
				}
				else {
					entityCache.putResult(ssdetailsModelImpl.ENTITY_CACHE_ENABLED,
						ssdetailsImpl.class, primaryKey, _nullssdetails);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ssdetailsModelImpl.ENTITY_CACHE_ENABLED,
					ssdetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return ssdetails;
	}

	/**
	 * Returns the ssdetails with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the ssdetails
	 * @return the ssdetails, or <code>null</code> if a ssdetails with the primary key could not be found
	 */
	@Override
	public ssdetails fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, ssdetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ssdetails> map = new HashMap<Serializable, ssdetails>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ssdetails ssdetails = fetchByPrimaryKey(primaryKey);

			if (ssdetails != null) {
				map.put(primaryKey, ssdetails);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			ssdetails ssdetails = (ssdetails)entityCache.getResult(ssdetailsModelImpl.ENTITY_CACHE_ENABLED,
					ssdetailsImpl.class, primaryKey);

			if (ssdetails == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, ssdetails);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SSDETAILS_WHERE_PKS_IN);

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

			for (ssdetails ssdetails : (List<ssdetails>)q.list()) {
				map.put(ssdetails.getPrimaryKeyObj(), ssdetails);

				cacheResult(ssdetails);

				uncachedPrimaryKeys.remove(ssdetails.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ssdetailsModelImpl.ENTITY_CACHE_ENABLED,
					ssdetailsImpl.class, primaryKey, _nullssdetails);
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
	 * Returns all the ssdetailses.
	 *
	 * @return the ssdetailses
	 */
	@Override
	public List<ssdetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ssdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ssdetailses
	 * @param end the upper bound of the range of ssdetailses (not inclusive)
	 * @return the range of ssdetailses
	 */
	@Override
	public List<ssdetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ssdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ssdetailses
	 * @param end the upper bound of the range of ssdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ssdetailses
	 */
	@Override
	public List<ssdetails> findAll(int start, int end,
		OrderByComparator<ssdetails> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ssdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ssdetailses
	 * @param end the upper bound of the range of ssdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ssdetailses
	 */
	@Override
	public List<ssdetails> findAll(int start, int end,
		OrderByComparator<ssdetails> orderByComparator,
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

		List<ssdetails> list = null;

		if (retrieveFromCache) {
			list = (List<ssdetails>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SSDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SSDETAILS;

				if (pagination) {
					sql = sql.concat(ssdetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ssdetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ssdetails>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the ssdetailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ssdetails ssdetails : findAll()) {
			remove(ssdetails);
		}
	}

	/**
	 * Returns the number of ssdetailses.
	 *
	 * @return the number of ssdetailses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SSDETAILS);

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
		return ssdetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ssdetails persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ssdetailsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_SSDETAILS = "SELECT ssdetails FROM ssdetails ssdetails";
	private static final String _SQL_SELECT_SSDETAILS_WHERE_PKS_IN = "SELECT ssdetails FROM ssdetails ssdetails WHERE id_ IN (";
	private static final String _SQL_SELECT_SSDETAILS_WHERE = "SELECT ssdetails FROM ssdetails ssdetails WHERE ";
	private static final String _SQL_COUNT_SSDETAILS = "SELECT COUNT(ssdetails) FROM ssdetails ssdetails";
	private static final String _SQL_COUNT_SSDETAILS_WHERE = "SELECT COUNT(ssdetails) FROM ssdetails ssdetails WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "ssdetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ssdetails exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ssdetails exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ssdetailsPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final ssdetails _nullssdetails = new ssdetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ssdetails> toCacheModel() {
				return _nullssdetailsCacheModel;
			}
		};

	private static final CacheModel<ssdetails> _nullssdetailsCacheModel = new CacheModel<ssdetails>() {
			@Override
			public ssdetails toEntityModel() {
				return _nullssdetails;
			}
		};
}