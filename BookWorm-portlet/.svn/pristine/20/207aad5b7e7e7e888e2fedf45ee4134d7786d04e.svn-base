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

import com.chola.book.exception.NoSuchbookusersException;
import com.chola.book.model.bookusers;
import com.chola.book.model.impl.bookusersImpl;
import com.chola.book.model.impl.bookusersModelImpl;
import com.chola.book.service.persistence.bookusersPersistence;

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
 * The persistence implementation for the bookusers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see bookusersPersistence
 * @see com.chola.book.service.persistence.bookusersUtil
 * @generated
 */
@ProviderType
public class bookusersPersistenceImpl extends BasePersistenceImpl<bookusers>
	implements bookusersPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link bookusersUtil} to access the bookusers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = bookusersImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(bookusersModelImpl.ENTITY_CACHE_ENABLED,
			bookusersModelImpl.FINDER_CACHE_ENABLED, bookusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(bookusersModelImpl.ENTITY_CACHE_ENABLED,
			bookusersModelImpl.FINDER_CACHE_ENABLED, bookusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(bookusersModelImpl.ENTITY_CACHE_ENABLED,
			bookusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BOOK_ID = new FinderPath(bookusersModelImpl.ENTITY_CACHE_ENABLED,
			bookusersModelImpl.FINDER_CACHE_ENABLED, bookusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByBOOK_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOK_ID =
		new FinderPath(bookusersModelImpl.ENTITY_CACHE_ENABLED,
			bookusersModelImpl.FINDER_CACHE_ENABLED, bookusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByBOOK_ID",
			new String[] { Long.class.getName() },
			bookusersModelImpl.BOOK_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BOOK_ID = new FinderPath(bookusersModelImpl.ENTITY_CACHE_ENABLED,
			bookusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByBOOK_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the bookuserses where book_id = &#63;.
	 *
	 * @param book_id the book_id
	 * @return the matching bookuserses
	 */
	@Override
	public List<bookusers> findByBOOK_ID(long book_id) {
		return findByBOOK_ID(book_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bookuserses where book_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param book_id the book_id
	 * @param start the lower bound of the range of bookuserses
	 * @param end the upper bound of the range of bookuserses (not inclusive)
	 * @return the range of matching bookuserses
	 */
	@Override
	public List<bookusers> findByBOOK_ID(long book_id, int start, int end) {
		return findByBOOK_ID(book_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bookuserses where book_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param book_id the book_id
	 * @param start the lower bound of the range of bookuserses
	 * @param end the upper bound of the range of bookuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bookuserses
	 */
	@Override
	public List<bookusers> findByBOOK_ID(long book_id, int start, int end,
		OrderByComparator<bookusers> orderByComparator) {
		return findByBOOK_ID(book_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bookuserses where book_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param book_id the book_id
	 * @param start the lower bound of the range of bookuserses
	 * @param end the upper bound of the range of bookuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching bookuserses
	 */
	@Override
	public List<bookusers> findByBOOK_ID(long book_id, int start, int end,
		OrderByComparator<bookusers> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOK_ID;
			finderArgs = new Object[] { book_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BOOK_ID;
			finderArgs = new Object[] { book_id, start, end, orderByComparator };
		}

		List<bookusers> list = null;

		if (retrieveFromCache) {
			list = (List<bookusers>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (bookusers bookusers : list) {
					if ((book_id != bookusers.getBook_id())) {
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

			query.append(_SQL_SELECT_BOOKUSERS_WHERE);

			query.append(_FINDER_COLUMN_BOOK_ID_BOOK_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(bookusersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(book_id);

				if (!pagination) {
					list = (List<bookusers>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<bookusers>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first bookusers in the ordered set where book_id = &#63;.
	 *
	 * @param book_id the book_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookusers
	 * @throws NoSuchbookusersException if a matching bookusers could not be found
	 */
	@Override
	public bookusers findByBOOK_ID_First(long book_id,
		OrderByComparator<bookusers> orderByComparator)
		throws NoSuchbookusersException {
		bookusers bookusers = fetchByBOOK_ID_First(book_id, orderByComparator);

		if (bookusers != null) {
			return bookusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("book_id=");
		msg.append(book_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbookusersException(msg.toString());
	}

	/**
	 * Returns the first bookusers in the ordered set where book_id = &#63;.
	 *
	 * @param book_id the book_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookusers, or <code>null</code> if a matching bookusers could not be found
	 */
	@Override
	public bookusers fetchByBOOK_ID_First(long book_id,
		OrderByComparator<bookusers> orderByComparator) {
		List<bookusers> list = findByBOOK_ID(book_id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bookusers in the ordered set where book_id = &#63;.
	 *
	 * @param book_id the book_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookusers
	 * @throws NoSuchbookusersException if a matching bookusers could not be found
	 */
	@Override
	public bookusers findByBOOK_ID_Last(long book_id,
		OrderByComparator<bookusers> orderByComparator)
		throws NoSuchbookusersException {
		bookusers bookusers = fetchByBOOK_ID_Last(book_id, orderByComparator);

		if (bookusers != null) {
			return bookusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("book_id=");
		msg.append(book_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbookusersException(msg.toString());
	}

	/**
	 * Returns the last bookusers in the ordered set where book_id = &#63;.
	 *
	 * @param book_id the book_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookusers, or <code>null</code> if a matching bookusers could not be found
	 */
	@Override
	public bookusers fetchByBOOK_ID_Last(long book_id,
		OrderByComparator<bookusers> orderByComparator) {
		int count = countByBOOK_ID(book_id);

		if (count == 0) {
			return null;
		}

		List<bookusers> list = findByBOOK_ID(book_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bookuserses before and after the current bookusers in the ordered set where book_id = &#63;.
	 *
	 * @param id the primary key of the current bookusers
	 * @param book_id the book_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bookusers
	 * @throws NoSuchbookusersException if a bookusers with the primary key could not be found
	 */
	@Override
	public bookusers[] findByBOOK_ID_PrevAndNext(long id, long book_id,
		OrderByComparator<bookusers> orderByComparator)
		throws NoSuchbookusersException {
		bookusers bookusers = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			bookusers[] array = new bookusersImpl[3];

			array[0] = getByBOOK_ID_PrevAndNext(session, bookusers, book_id,
					orderByComparator, true);

			array[1] = bookusers;

			array[2] = getByBOOK_ID_PrevAndNext(session, bookusers, book_id,
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

	protected bookusers getByBOOK_ID_PrevAndNext(Session session,
		bookusers bookusers, long book_id,
		OrderByComparator<bookusers> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BOOKUSERS_WHERE);

		query.append(_FINDER_COLUMN_BOOK_ID_BOOK_ID_2);

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
			query.append(bookusersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(book_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(bookusers);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<bookusers> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bookuserses where book_id = &#63; from the database.
	 *
	 * @param book_id the book_id
	 */
	@Override
	public void removeByBOOK_ID(long book_id) {
		for (bookusers bookusers : findByBOOK_ID(book_id, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(bookusers);
		}
	}

	/**
	 * Returns the number of bookuserses where book_id = &#63;.
	 *
	 * @param book_id the book_id
	 * @return the number of matching bookuserses
	 */
	@Override
	public int countByBOOK_ID(long book_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BOOK_ID;

		Object[] finderArgs = new Object[] { book_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BOOKUSERS_WHERE);

			query.append(_FINDER_COLUMN_BOOK_ID_BOOK_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(book_id);

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

	private static final String _FINDER_COLUMN_BOOK_ID_BOOK_ID_2 = "bookusers.book_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USER_ID = new FinderPath(bookusersModelImpl.ENTITY_CACHE_ENABLED,
			bookusersModelImpl.FINDER_CACHE_ENABLED, bookusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUSER_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID =
		new FinderPath(bookusersModelImpl.ENTITY_CACHE_ENABLED,
			bookusersModelImpl.FINDER_CACHE_ENABLED, bookusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUSER_ID",
			new String[] { Long.class.getName() },
			bookusersModelImpl.USER_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USER_ID = new FinderPath(bookusersModelImpl.ENTITY_CACHE_ENABLED,
			bookusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUSER_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the bookuserses where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @return the matching bookuserses
	 */
	@Override
	public List<bookusers> findByUSER_ID(long user_id) {
		return findByUSER_ID(user_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bookuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of bookuserses
	 * @param end the upper bound of the range of bookuserses (not inclusive)
	 * @return the range of matching bookuserses
	 */
	@Override
	public List<bookusers> findByUSER_ID(long user_id, int start, int end) {
		return findByUSER_ID(user_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bookuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of bookuserses
	 * @param end the upper bound of the range of bookuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bookuserses
	 */
	@Override
	public List<bookusers> findByUSER_ID(long user_id, int start, int end,
		OrderByComparator<bookusers> orderByComparator) {
		return findByUSER_ID(user_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bookuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of bookuserses
	 * @param end the upper bound of the range of bookuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching bookuserses
	 */
	@Override
	public List<bookusers> findByUSER_ID(long user_id, int start, int end,
		OrderByComparator<bookusers> orderByComparator,
		boolean retrieveFromCache) {
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

		List<bookusers> list = null;

		if (retrieveFromCache) {
			list = (List<bookusers>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (bookusers bookusers : list) {
					if ((user_id != bookusers.getUser_id())) {
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

			query.append(_SQL_SELECT_BOOKUSERS_WHERE);

			query.append(_FINDER_COLUMN_USER_ID_USER_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(bookusersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(user_id);

				if (!pagination) {
					list = (List<bookusers>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<bookusers>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first bookusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookusers
	 * @throws NoSuchbookusersException if a matching bookusers could not be found
	 */
	@Override
	public bookusers findByUSER_ID_First(long user_id,
		OrderByComparator<bookusers> orderByComparator)
		throws NoSuchbookusersException {
		bookusers bookusers = fetchByUSER_ID_First(user_id, orderByComparator);

		if (bookusers != null) {
			return bookusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("user_id=");
		msg.append(user_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbookusersException(msg.toString());
	}

	/**
	 * Returns the first bookusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bookusers, or <code>null</code> if a matching bookusers could not be found
	 */
	@Override
	public bookusers fetchByUSER_ID_First(long user_id,
		OrderByComparator<bookusers> orderByComparator) {
		List<bookusers> list = findByUSER_ID(user_id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bookusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookusers
	 * @throws NoSuchbookusersException if a matching bookusers could not be found
	 */
	@Override
	public bookusers findByUSER_ID_Last(long user_id,
		OrderByComparator<bookusers> orderByComparator)
		throws NoSuchbookusersException {
		bookusers bookusers = fetchByUSER_ID_Last(user_id, orderByComparator);

		if (bookusers != null) {
			return bookusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("user_id=");
		msg.append(user_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbookusersException(msg.toString());
	}

	/**
	 * Returns the last bookusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bookusers, or <code>null</code> if a matching bookusers could not be found
	 */
	@Override
	public bookusers fetchByUSER_ID_Last(long user_id,
		OrderByComparator<bookusers> orderByComparator) {
		int count = countByUSER_ID(user_id);

		if (count == 0) {
			return null;
		}

		List<bookusers> list = findByUSER_ID(user_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bookuserses before and after the current bookusers in the ordered set where user_id = &#63;.
	 *
	 * @param id the primary key of the current bookusers
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bookusers
	 * @throws NoSuchbookusersException if a bookusers with the primary key could not be found
	 */
	@Override
	public bookusers[] findByUSER_ID_PrevAndNext(long id, long user_id,
		OrderByComparator<bookusers> orderByComparator)
		throws NoSuchbookusersException {
		bookusers bookusers = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			bookusers[] array = new bookusersImpl[3];

			array[0] = getByUSER_ID_PrevAndNext(session, bookusers, user_id,
					orderByComparator, true);

			array[1] = bookusers;

			array[2] = getByUSER_ID_PrevAndNext(session, bookusers, user_id,
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

	protected bookusers getByUSER_ID_PrevAndNext(Session session,
		bookusers bookusers, long user_id,
		OrderByComparator<bookusers> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BOOKUSERS_WHERE);

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
			query.append(bookusersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(user_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(bookusers);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<bookusers> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bookuserses where user_id = &#63; from the database.
	 *
	 * @param user_id the user_id
	 */
	@Override
	public void removeByUSER_ID(long user_id) {
		for (bookusers bookusers : findByUSER_ID(user_id, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(bookusers);
		}
	}

	/**
	 * Returns the number of bookuserses where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @return the number of matching bookuserses
	 */
	@Override
	public int countByUSER_ID(long user_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USER_ID;

		Object[] finderArgs = new Object[] { user_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BOOKUSERS_WHERE);

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

	private static final String _FINDER_COLUMN_USER_ID_USER_ID_2 = "bookusers.user_id = ?";

	public bookusersPersistenceImpl() {
		setModelClass(bookusers.class);
	}

	/**
	 * Caches the bookusers in the entity cache if it is enabled.
	 *
	 * @param bookusers the bookusers
	 */
	@Override
	public void cacheResult(bookusers bookusers) {
		entityCache.putResult(bookusersModelImpl.ENTITY_CACHE_ENABLED,
			bookusersImpl.class, bookusers.getPrimaryKey(), bookusers);

		bookusers.resetOriginalValues();
	}

	/**
	 * Caches the bookuserses in the entity cache if it is enabled.
	 *
	 * @param bookuserses the bookuserses
	 */
	@Override
	public void cacheResult(List<bookusers> bookuserses) {
		for (bookusers bookusers : bookuserses) {
			if (entityCache.getResult(bookusersModelImpl.ENTITY_CACHE_ENABLED,
						bookusersImpl.class, bookusers.getPrimaryKey()) == null) {
				cacheResult(bookusers);
			}
			else {
				bookusers.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all bookuserses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(bookusersImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the bookusers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(bookusers bookusers) {
		entityCache.removeResult(bookusersModelImpl.ENTITY_CACHE_ENABLED,
			bookusersImpl.class, bookusers.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<bookusers> bookuserses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (bookusers bookusers : bookuserses) {
			entityCache.removeResult(bookusersModelImpl.ENTITY_CACHE_ENABLED,
				bookusersImpl.class, bookusers.getPrimaryKey());
		}
	}

	/**
	 * Creates a new bookusers with the primary key. Does not add the bookusers to the database.
	 *
	 * @param id the primary key for the new bookusers
	 * @return the new bookusers
	 */
	@Override
	public bookusers create(long id) {
		bookusers bookusers = new bookusersImpl();

		bookusers.setNew(true);
		bookusers.setPrimaryKey(id);

		return bookusers;
	}

	/**
	 * Removes the bookusers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the bookusers
	 * @return the bookusers that was removed
	 * @throws NoSuchbookusersException if a bookusers with the primary key could not be found
	 */
	@Override
	public bookusers remove(long id) throws NoSuchbookusersException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the bookusers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bookusers
	 * @return the bookusers that was removed
	 * @throws NoSuchbookusersException if a bookusers with the primary key could not be found
	 */
	@Override
	public bookusers remove(Serializable primaryKey)
		throws NoSuchbookusersException {
		Session session = null;

		try {
			session = openSession();

			bookusers bookusers = (bookusers)session.get(bookusersImpl.class,
					primaryKey);

			if (bookusers == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbookusersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(bookusers);
		}
		catch (NoSuchbookusersException nsee) {
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
	protected bookusers removeImpl(bookusers bookusers) {
		bookusers = toUnwrappedModel(bookusers);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bookusers)) {
				bookusers = (bookusers)session.get(bookusersImpl.class,
						bookusers.getPrimaryKeyObj());
			}

			if (bookusers != null) {
				session.delete(bookusers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (bookusers != null) {
			clearCache(bookusers);
		}

		return bookusers;
	}

	@Override
	public bookusers updateImpl(bookusers bookusers) {
		bookusers = toUnwrappedModel(bookusers);

		boolean isNew = bookusers.isNew();

		bookusersModelImpl bookusersModelImpl = (bookusersModelImpl)bookusers;

		Session session = null;

		try {
			session = openSession();

			if (bookusers.isNew()) {
				session.save(bookusers);

				bookusers.setNew(false);
			}
			else {
				bookusers = (bookusers)session.merge(bookusers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !bookusersModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((bookusersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOK_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bookusersModelImpl.getOriginalBook_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOK_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOK_ID,
					args);

				args = new Object[] { bookusersModelImpl.getBook_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BOOK_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BOOK_ID,
					args);
			}

			if ((bookusersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bookusersModelImpl.getOriginalUser_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID,
					args);

				args = new Object[] { bookusersModelImpl.getUser_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID,
					args);
			}
		}

		entityCache.putResult(bookusersModelImpl.ENTITY_CACHE_ENABLED,
			bookusersImpl.class, bookusers.getPrimaryKey(), bookusers, false);

		bookusers.resetOriginalValues();

		return bookusers;
	}

	protected bookusers toUnwrappedModel(bookusers bookusers) {
		if (bookusers instanceof bookusersImpl) {
			return bookusers;
		}

		bookusersImpl bookusersImpl = new bookusersImpl();

		bookusersImpl.setNew(bookusers.isNew());
		bookusersImpl.setPrimaryKey(bookusers.getPrimaryKey());

		bookusersImpl.setId(bookusers.getId());
		bookusersImpl.setUser_id(bookusers.getUser_id());
		bookusersImpl.setBook_id(bookusers.getBook_id());

		return bookusersImpl;
	}

	/**
	 * Returns the bookusers with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the bookusers
	 * @return the bookusers
	 * @throws NoSuchbookusersException if a bookusers with the primary key could not be found
	 */
	@Override
	public bookusers findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbookusersException {
		bookusers bookusers = fetchByPrimaryKey(primaryKey);

		if (bookusers == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbookusersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return bookusers;
	}

	/**
	 * Returns the bookusers with the primary key or throws a {@link NoSuchbookusersException} if it could not be found.
	 *
	 * @param id the primary key of the bookusers
	 * @return the bookusers
	 * @throws NoSuchbookusersException if a bookusers with the primary key could not be found
	 */
	@Override
	public bookusers findByPrimaryKey(long id) throws NoSuchbookusersException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the bookusers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bookusers
	 * @return the bookusers, or <code>null</code> if a bookusers with the primary key could not be found
	 */
	@Override
	public bookusers fetchByPrimaryKey(Serializable primaryKey) {
		bookusers bookusers = (bookusers)entityCache.getResult(bookusersModelImpl.ENTITY_CACHE_ENABLED,
				bookusersImpl.class, primaryKey);

		if (bookusers == _nullbookusers) {
			return null;
		}

		if (bookusers == null) {
			Session session = null;

			try {
				session = openSession();

				bookusers = (bookusers)session.get(bookusersImpl.class,
						primaryKey);

				if (bookusers != null) {
					cacheResult(bookusers);
				}
				else {
					entityCache.putResult(bookusersModelImpl.ENTITY_CACHE_ENABLED,
						bookusersImpl.class, primaryKey, _nullbookusers);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(bookusersModelImpl.ENTITY_CACHE_ENABLED,
					bookusersImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return bookusers;
	}

	/**
	 * Returns the bookusers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the bookusers
	 * @return the bookusers, or <code>null</code> if a bookusers with the primary key could not be found
	 */
	@Override
	public bookusers fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, bookusers> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, bookusers> map = new HashMap<Serializable, bookusers>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			bookusers bookusers = fetchByPrimaryKey(primaryKey);

			if (bookusers != null) {
				map.put(primaryKey, bookusers);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			bookusers bookusers = (bookusers)entityCache.getResult(bookusersModelImpl.ENTITY_CACHE_ENABLED,
					bookusersImpl.class, primaryKey);

			if (bookusers == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, bookusers);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BOOKUSERS_WHERE_PKS_IN);

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

			for (bookusers bookusers : (List<bookusers>)q.list()) {
				map.put(bookusers.getPrimaryKeyObj(), bookusers);

				cacheResult(bookusers);

				uncachedPrimaryKeys.remove(bookusers.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(bookusersModelImpl.ENTITY_CACHE_ENABLED,
					bookusersImpl.class, primaryKey, _nullbookusers);
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
	 * Returns all the bookuserses.
	 *
	 * @return the bookuserses
	 */
	@Override
	public List<bookusers> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bookuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bookuserses
	 * @param end the upper bound of the range of bookuserses (not inclusive)
	 * @return the range of bookuserses
	 */
	@Override
	public List<bookusers> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bookuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bookuserses
	 * @param end the upper bound of the range of bookuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bookuserses
	 */
	@Override
	public List<bookusers> findAll(int start, int end,
		OrderByComparator<bookusers> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bookuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bookuserses
	 * @param end the upper bound of the range of bookuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of bookuserses
	 */
	@Override
	public List<bookusers> findAll(int start, int end,
		OrderByComparator<bookusers> orderByComparator,
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

		List<bookusers> list = null;

		if (retrieveFromCache) {
			list = (List<bookusers>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BOOKUSERS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BOOKUSERS;

				if (pagination) {
					sql = sql.concat(bookusersModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<bookusers>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<bookusers>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the bookuserses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (bookusers bookusers : findAll()) {
			remove(bookusers);
		}
	}

	/**
	 * Returns the number of bookuserses.
	 *
	 * @return the number of bookuserses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BOOKUSERS);

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
		return bookusersModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the bookusers persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(bookusersImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_BOOKUSERS = "SELECT bookusers FROM bookusers bookusers";
	private static final String _SQL_SELECT_BOOKUSERS_WHERE_PKS_IN = "SELECT bookusers FROM bookusers bookusers WHERE id_ IN (";
	private static final String _SQL_SELECT_BOOKUSERS_WHERE = "SELECT bookusers FROM bookusers bookusers WHERE ";
	private static final String _SQL_COUNT_BOOKUSERS = "SELECT COUNT(bookusers) FROM bookusers bookusers";
	private static final String _SQL_COUNT_BOOKUSERS_WHERE = "SELECT COUNT(bookusers) FROM bookusers bookusers WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "bookusers.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No bookusers exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No bookusers exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(bookusersPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final bookusers _nullbookusers = new bookusersImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<bookusers> toCacheModel() {
				return _nullbookusersCacheModel;
			}
		};

	private static final CacheModel<bookusers> _nullbookusersCacheModel = new CacheModel<bookusers>() {
			@Override
			public bookusers toEntityModel() {
				return _nullbookusers;
			}
		};
}