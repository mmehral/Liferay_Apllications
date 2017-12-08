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

package com.chola.book.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.book.exception.NoSuchbookdetailsException;
import com.chola.book.model.bookdetails;
import com.chola.book.model.impl.bookdetailsImpl;
import com.chola.book.model.impl.bookdetailsModelImpl;
import com.chola.book.service.persistence.bookdetailsPersistence;

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
 * The persistence implementation for the bookdetails service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see bookdetailsPersistence
 * @see com.chola.book.service.persistence.bookdetailsUtil
 * @generated
 */
@ProviderType
public class bookdetailsPersistenceImpl extends BasePersistenceImpl<bookdetails>
	implements bookdetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link bookdetailsUtil} to access the bookdetails persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = bookdetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(bookdetailsModelImpl.ENTITY_CACHE_ENABLED,
			bookdetailsModelImpl.FINDER_CACHE_ENABLED, bookdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(bookdetailsModelImpl.ENTITY_CACHE_ENABLED,
			bookdetailsModelImpl.FINDER_CACHE_ENABLED, bookdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(bookdetailsModelImpl.ENTITY_CACHE_ENABLED,
			bookdetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(bookdetailsModelImpl.ENTITY_CACHE_ENABLED,
			bookdetailsModelImpl.FINDER_CACHE_ENABLED, bookdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCONTENT_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(bookdetailsModelImpl.ENTITY_CACHE_ENABLED,
			bookdetailsModelImpl.FINDER_CACHE_ENABLED, bookdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCONTENT_ID",
			new String[] { Long.class.getName() },
			bookdetailsModelImpl.CONTENT_ID_COLUMN_BITMASK |
			bookdetailsModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTENT_ID = new FinderPath(bookdetailsModelImpl.ENTITY_CACHE_ENABLED,
			bookdetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCONTENT_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the bookdetailses where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the matching bookdetailses
	 */
	@Override
	public List<bookdetails> findByCONTENT_ID(long content_id) {
		return findByCONTENT_ID(content_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bookdetailses where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of bookdetailses
	 * @param end the upper bound of the range of bookdetailses (not inclusive)
	 * @return the range of matching bookdetailses
	 */
	@Override
	public List<bookdetails> findByCONTENT_ID(long content_id, int start,
		int end) {
		return findByCONTENT_ID(content_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bookdetailses where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of bookdetailses
	 * @param end the upper bound of the range of bookdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bookdetailses
	 */
	@Override
	public List<bookdetails> findByCONTENT_ID(long content_id, int start,
		int end, OrderByComparator<bookdetails> orderByComparator) {
		return findByCONTENT_ID(content_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bookdetailses where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of bookdetailses
	 * @param end the upper bound of the range of bookdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching bookdetailses
	 */
	@Override
	public List<bookdetails> findByCONTENT_ID(long content_id, int start,
		int end, OrderByComparator<bookdetails> orderByComparator,
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

		List<bookdetails> list = null;

		if (retrieveFromCache) {
			list = (List<bookdetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (bookdetails bookdetails : list) {
					if ((content_id != bookdetails.getContent_id())) {
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

			query.append(_SQL_SELECT_BOOKDETAILS_WHERE);

			query.append(_FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(bookdetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(content_id);

				if (!pagination) {
					list = (List<bookdetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<bookdetails>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first bookdetails in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookdetails
	 * @throws NoSuchbookdetailsException if a matching bookdetails could not be found
	 */
	@Override
	public bookdetails findByCONTENT_ID_First(long content_id,
		OrderByComparator<bookdetails> orderByComparator)
		throws NoSuchbookdetailsException {
		bookdetails bookdetails = fetchByCONTENT_ID_First(content_id,
				orderByComparator);

		if (bookdetails != null) {
			return bookdetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbookdetailsException(msg.toString());
	}

	/**
	 * Returns the first bookdetails in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookdetails, or <code>null</code> if a matching bookdetails could not be found
	 */
	@Override
	public bookdetails fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<bookdetails> orderByComparator) {
		List<bookdetails> list = findByCONTENT_ID(content_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bookdetails in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookdetails
	 * @throws NoSuchbookdetailsException if a matching bookdetails could not be found
	 */
	@Override
	public bookdetails findByCONTENT_ID_Last(long content_id,
		OrderByComparator<bookdetails> orderByComparator)
		throws NoSuchbookdetailsException {
		bookdetails bookdetails = fetchByCONTENT_ID_Last(content_id,
				orderByComparator);

		if (bookdetails != null) {
			return bookdetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbookdetailsException(msg.toString());
	}

	/**
	 * Returns the last bookdetails in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookdetails, or <code>null</code> if a matching bookdetails could not be found
	 */
	@Override
	public bookdetails fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<bookdetails> orderByComparator) {
		int count = countByCONTENT_ID(content_id);

		if (count == 0) {
			return null;
		}

		List<bookdetails> list = findByCONTENT_ID(content_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bookdetailses before and after the current bookdetails in the ordered set where content_id = &#63;.
	 *
	 * @param id the primary key of the current bookdetails
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bookdetails
	 * @throws NoSuchbookdetailsException if a bookdetails with the primary key could not be found
	 */
	@Override
	public bookdetails[] findByCONTENT_ID_PrevAndNext(long id, long content_id,
		OrderByComparator<bookdetails> orderByComparator)
		throws NoSuchbookdetailsException {
		bookdetails bookdetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			bookdetails[] array = new bookdetailsImpl[3];

			array[0] = getByCONTENT_ID_PrevAndNext(session, bookdetails,
					content_id, orderByComparator, true);

			array[1] = bookdetails;

			array[2] = getByCONTENT_ID_PrevAndNext(session, bookdetails,
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

	protected bookdetails getByCONTENT_ID_PrevAndNext(Session session,
		bookdetails bookdetails, long content_id,
		OrderByComparator<bookdetails> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BOOKDETAILS_WHERE);

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
			query.append(bookdetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(content_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(bookdetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<bookdetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bookdetailses where content_id = &#63; from the database.
	 *
	 * @param content_id the content_id
	 */
	@Override
	public void removeByCONTENT_ID(long content_id) {
		for (bookdetails bookdetails : findByCONTENT_ID(content_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(bookdetails);
		}
	}

	/**
	 * Returns the number of bookdetailses where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the number of matching bookdetailses
	 */
	@Override
	public int countByCONTENT_ID(long content_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTENT_ID;

		Object[] finderArgs = new Object[] { content_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BOOKDETAILS_WHERE);

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

	private static final String _FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2 = "bookdetails.content_id = ?";

	public bookdetailsPersistenceImpl() {
		setModelClass(bookdetails.class);
	}

	/**
	 * Caches the bookdetails in the entity cache if it is enabled.
	 *
	 * @param bookdetails the bookdetails
	 */
	@Override
	public void cacheResult(bookdetails bookdetails) {
		entityCache.putResult(bookdetailsModelImpl.ENTITY_CACHE_ENABLED,
			bookdetailsImpl.class, bookdetails.getPrimaryKey(), bookdetails);

		bookdetails.resetOriginalValues();
	}

	/**
	 * Caches the bookdetailses in the entity cache if it is enabled.
	 *
	 * @param bookdetailses the bookdetailses
	 */
	@Override
	public void cacheResult(List<bookdetails> bookdetailses) {
		for (bookdetails bookdetails : bookdetailses) {
			if (entityCache.getResult(
						bookdetailsModelImpl.ENTITY_CACHE_ENABLED,
						bookdetailsImpl.class, bookdetails.getPrimaryKey()) == null) {
				cacheResult(bookdetails);
			}
			else {
				bookdetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all bookdetailses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(bookdetailsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the bookdetails.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(bookdetails bookdetails) {
		entityCache.removeResult(bookdetailsModelImpl.ENTITY_CACHE_ENABLED,
			bookdetailsImpl.class, bookdetails.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<bookdetails> bookdetailses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (bookdetails bookdetails : bookdetailses) {
			entityCache.removeResult(bookdetailsModelImpl.ENTITY_CACHE_ENABLED,
				bookdetailsImpl.class, bookdetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new bookdetails with the primary key. Does not add the bookdetails to the database.
	 *
	 * @param id the primary key for the new bookdetails
	 * @return the new bookdetails
	 */
	@Override
	public bookdetails create(long id) {
		bookdetails bookdetails = new bookdetailsImpl();

		bookdetails.setNew(true);
		bookdetails.setPrimaryKey(id);

		return bookdetails;
	}

	/**
	 * Removes the bookdetails with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the bookdetails
	 * @return the bookdetails that was removed
	 * @throws NoSuchbookdetailsException if a bookdetails with the primary key could not be found
	 */
	@Override
	public bookdetails remove(long id) throws NoSuchbookdetailsException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the bookdetails with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bookdetails
	 * @return the bookdetails that was removed
	 * @throws NoSuchbookdetailsException if a bookdetails with the primary key could not be found
	 */
	@Override
	public bookdetails remove(Serializable primaryKey)
		throws NoSuchbookdetailsException {
		Session session = null;

		try {
			session = openSession();

			bookdetails bookdetails = (bookdetails)session.get(bookdetailsImpl.class,
					primaryKey);

			if (bookdetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbookdetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(bookdetails);
		}
		catch (NoSuchbookdetailsException nsee) {
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
	protected bookdetails removeImpl(bookdetails bookdetails) {
		bookdetails = toUnwrappedModel(bookdetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bookdetails)) {
				bookdetails = (bookdetails)session.get(bookdetailsImpl.class,
						bookdetails.getPrimaryKeyObj());
			}

			if (bookdetails != null) {
				session.delete(bookdetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (bookdetails != null) {
			clearCache(bookdetails);
		}

		return bookdetails;
	}

	@Override
	public bookdetails updateImpl(bookdetails bookdetails) {
		bookdetails = toUnwrappedModel(bookdetails);

		boolean isNew = bookdetails.isNew();

		bookdetailsModelImpl bookdetailsModelImpl = (bookdetailsModelImpl)bookdetails;

		Session session = null;

		try {
			session = openSession();

			if (bookdetails.isNew()) {
				session.save(bookdetails);

				bookdetails.setNew(false);
			}
			else {
				bookdetails = (bookdetails)session.merge(bookdetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !bookdetailsModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((bookdetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bookdetailsModelImpl.getOriginalContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);

				args = new Object[] { bookdetailsModelImpl.getContent_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);
			}
		}

		entityCache.putResult(bookdetailsModelImpl.ENTITY_CACHE_ENABLED,
			bookdetailsImpl.class, bookdetails.getPrimaryKey(), bookdetails,
			false);

		bookdetails.resetOriginalValues();

		return bookdetails;
	}

	protected bookdetails toUnwrappedModel(bookdetails bookdetails) {
		if (bookdetails instanceof bookdetailsImpl) {
			return bookdetails;
		}

		bookdetailsImpl bookdetailsImpl = new bookdetailsImpl();

		bookdetailsImpl.setNew(bookdetails.isNew());
		bookdetailsImpl.setPrimaryKey(bookdetails.getPrimaryKey());

		bookdetailsImpl.setId(bookdetails.getId());
		bookdetailsImpl.setBooktitle(bookdetails.getBooktitle());
		bookdetailsImpl.setBookname(bookdetails.getBookname());
		bookdetailsImpl.setBookpath(bookdetails.getBookpath());
		bookdetailsImpl.setCreateddate(bookdetails.getCreateddate());
		bookdetailsImpl.setCreatedby(bookdetails.getCreatedby());
		bookdetailsImpl.setModifieddate(bookdetails.getModifieddate());
		bookdetailsImpl.setModifiedby(bookdetails.getModifiedby());
		bookdetailsImpl.setFlag(bookdetails.getFlag());
		bookdetailsImpl.setContent_id(bookdetails.getContent_id());

		return bookdetailsImpl;
	}

	/**
	 * Returns the bookdetails with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the bookdetails
	 * @return the bookdetails
	 * @throws NoSuchbookdetailsException if a bookdetails with the primary key could not be found
	 */
	@Override
	public bookdetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbookdetailsException {
		bookdetails bookdetails = fetchByPrimaryKey(primaryKey);

		if (bookdetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbookdetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return bookdetails;
	}

	/**
	 * Returns the bookdetails with the primary key or throws a {@link NoSuchbookdetailsException} if it could not be found.
	 *
	 * @param id the primary key of the bookdetails
	 * @return the bookdetails
	 * @throws NoSuchbookdetailsException if a bookdetails with the primary key could not be found
	 */
	@Override
	public bookdetails findByPrimaryKey(long id)
		throws NoSuchbookdetailsException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the bookdetails with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bookdetails
	 * @return the bookdetails, or <code>null</code> if a bookdetails with the primary key could not be found
	 */
	@Override
	public bookdetails fetchByPrimaryKey(Serializable primaryKey) {
		bookdetails bookdetails = (bookdetails)entityCache.getResult(bookdetailsModelImpl.ENTITY_CACHE_ENABLED,
				bookdetailsImpl.class, primaryKey);

		if (bookdetails == _nullbookdetails) {
			return null;
		}

		if (bookdetails == null) {
			Session session = null;

			try {
				session = openSession();

				bookdetails = (bookdetails)session.get(bookdetailsImpl.class,
						primaryKey);

				if (bookdetails != null) {
					cacheResult(bookdetails);
				}
				else {
					entityCache.putResult(bookdetailsModelImpl.ENTITY_CACHE_ENABLED,
						bookdetailsImpl.class, primaryKey, _nullbookdetails);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(bookdetailsModelImpl.ENTITY_CACHE_ENABLED,
					bookdetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return bookdetails;
	}

	/**
	 * Returns the bookdetails with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the bookdetails
	 * @return the bookdetails, or <code>null</code> if a bookdetails with the primary key could not be found
	 */
	@Override
	public bookdetails fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, bookdetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, bookdetails> map = new HashMap<Serializable, bookdetails>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			bookdetails bookdetails = fetchByPrimaryKey(primaryKey);

			if (bookdetails != null) {
				map.put(primaryKey, bookdetails);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			bookdetails bookdetails = (bookdetails)entityCache.getResult(bookdetailsModelImpl.ENTITY_CACHE_ENABLED,
					bookdetailsImpl.class, primaryKey);

			if (bookdetails == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, bookdetails);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BOOKDETAILS_WHERE_PKS_IN);

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

			for (bookdetails bookdetails : (List<bookdetails>)q.list()) {
				map.put(bookdetails.getPrimaryKeyObj(), bookdetails);

				cacheResult(bookdetails);

				uncachedPrimaryKeys.remove(bookdetails.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(bookdetailsModelImpl.ENTITY_CACHE_ENABLED,
					bookdetailsImpl.class, primaryKey, _nullbookdetails);
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
	 * Returns all the bookdetailses.
	 *
	 * @return the bookdetailses
	 */
	@Override
	public List<bookdetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bookdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bookdetailses
	 * @param end the upper bound of the range of bookdetailses (not inclusive)
	 * @return the range of bookdetailses
	 */
	@Override
	public List<bookdetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bookdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bookdetailses
	 * @param end the upper bound of the range of bookdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bookdetailses
	 */
	@Override
	public List<bookdetails> findAll(int start, int end,
		OrderByComparator<bookdetails> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bookdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bookdetailses
	 * @param end the upper bound of the range of bookdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of bookdetailses
	 */
	@Override
	public List<bookdetails> findAll(int start, int end,
		OrderByComparator<bookdetails> orderByComparator,
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

		List<bookdetails> list = null;

		if (retrieveFromCache) {
			list = (List<bookdetails>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BOOKDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BOOKDETAILS;

				if (pagination) {
					sql = sql.concat(bookdetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<bookdetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<bookdetails>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the bookdetailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (bookdetails bookdetails : findAll()) {
			remove(bookdetails);
		}
	}

	/**
	 * Returns the number of bookdetailses.
	 *
	 * @return the number of bookdetailses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BOOKDETAILS);

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
		return bookdetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the bookdetails persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(bookdetailsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_BOOKDETAILS = "SELECT bookdetails FROM bookdetails bookdetails";
	private static final String _SQL_SELECT_BOOKDETAILS_WHERE_PKS_IN = "SELECT bookdetails FROM bookdetails bookdetails WHERE id_ IN (";
	private static final String _SQL_SELECT_BOOKDETAILS_WHERE = "SELECT bookdetails FROM bookdetails bookdetails WHERE ";
	private static final String _SQL_COUNT_BOOKDETAILS = "SELECT COUNT(bookdetails) FROM bookdetails bookdetails";
	private static final String _SQL_COUNT_BOOKDETAILS_WHERE = "SELECT COUNT(bookdetails) FROM bookdetails bookdetails WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "bookdetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No bookdetails exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No bookdetails exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(bookdetailsPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final bookdetails _nullbookdetails = new bookdetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<bookdetails> toCacheModel() {
				return _nullbookdetailsCacheModel;
			}
		};

	private static final CacheModel<bookdetails> _nullbookdetailsCacheModel = new CacheModel<bookdetails>() {
			@Override
			public bookdetails toEntityModel() {
				return _nullbookdetails;
			}
		};
}