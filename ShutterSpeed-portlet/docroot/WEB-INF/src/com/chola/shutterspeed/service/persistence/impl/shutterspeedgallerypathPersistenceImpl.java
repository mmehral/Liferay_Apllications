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

package com.chola.shutterspeed.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.shutterspeed.exception.NoSuchshutterspeedgallerypathException;
import com.chola.shutterspeed.model.impl.shutterspeedgallerypathImpl;
import com.chola.shutterspeed.model.impl.shutterspeedgallerypathModelImpl;
import com.chola.shutterspeed.model.shutterspeedgallerypath;
import com.chola.shutterspeed.service.persistence.shutterspeedgallerypathPersistence;

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
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the shutterspeedgallerypath service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see shutterspeedgallerypathPersistence
 * @see com.chola.shutterspeed.service.persistence.shutterspeedgallerypathUtil
 * @generated
 */
@ProviderType
public class shutterspeedgallerypathPersistenceImpl extends BasePersistenceImpl<shutterspeedgallerypath>
	implements shutterspeedgallerypathPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link shutterspeedgallerypathUtil} to access the shutterspeedgallerypath persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = shutterspeedgallerypathImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(shutterspeedgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgallerypathModelImpl.FINDER_CACHE_ENABLED,
			shutterspeedgallerypathImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(shutterspeedgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgallerypathModelImpl.FINDER_CACHE_ENABLED,
			shutterspeedgallerypathImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(shutterspeedgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgallerypathModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(shutterspeedgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgallerypathModelImpl.FINDER_CACHE_ENABLED,
			shutterspeedgallerypathImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCONTENT_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(shutterspeedgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgallerypathModelImpl.FINDER_CACHE_ENABLED,
			shutterspeedgallerypathImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCONTENT_ID",
			new String[] { Long.class.getName() },
			shutterspeedgallerypathModelImpl.CONTENT_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTENT_ID = new FinderPath(shutterspeedgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgallerypathModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCONTENT_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the shutterspeedgallerypaths where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the matching shutterspeedgallerypaths
	 */
	@Override
	public List<shutterspeedgallerypath> findByCONTENT_ID(long content_id) {
		return findByCONTENT_ID(content_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the shutterspeedgallerypaths where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of shutterspeedgallerypaths
	 * @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	 * @return the range of matching shutterspeedgallerypaths
	 */
	@Override
	public List<shutterspeedgallerypath> findByCONTENT_ID(long content_id,
		int start, int end) {
		return findByCONTENT_ID(content_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the shutterspeedgallerypaths where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of shutterspeedgallerypaths
	 * @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching shutterspeedgallerypaths
	 */
	@Override
	public List<shutterspeedgallerypath> findByCONTENT_ID(long content_id,
		int start, int end,
		OrderByComparator<shutterspeedgallerypath> orderByComparator) {
		return findByCONTENT_ID(content_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the shutterspeedgallerypaths where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of shutterspeedgallerypaths
	 * @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching shutterspeedgallerypaths
	 */
	@Override
	public List<shutterspeedgallerypath> findByCONTENT_ID(long content_id,
		int start, int end,
		OrderByComparator<shutterspeedgallerypath> orderByComparator,
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

		List<shutterspeedgallerypath> list = null;

		if (retrieveFromCache) {
			list = (List<shutterspeedgallerypath>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (shutterspeedgallerypath shutterspeedgallerypath : list) {
					if ((content_id != shutterspeedgallerypath.getContent_id())) {
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

			query.append(_SQL_SELECT_SHUTTERSPEEDGALLERYPATH_WHERE);

			query.append(_FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(shutterspeedgallerypathModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(content_id);

				if (!pagination) {
					list = (List<shutterspeedgallerypath>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<shutterspeedgallerypath>)QueryUtil.list(q,
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
	 * Returns the first shutterspeedgallerypath in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shutterspeedgallerypath
	 * @throws NoSuchshutterspeedgallerypathException if a matching shutterspeedgallerypath could not be found
	 */
	@Override
	public shutterspeedgallerypath findByCONTENT_ID_First(long content_id,
		OrderByComparator<shutterspeedgallerypath> orderByComparator)
		throws NoSuchshutterspeedgallerypathException {
		shutterspeedgallerypath shutterspeedgallerypath = fetchByCONTENT_ID_First(content_id,
				orderByComparator);

		if (shutterspeedgallerypath != null) {
			return shutterspeedgallerypath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchshutterspeedgallerypathException(msg.toString());
	}

	/**
	 * Returns the first shutterspeedgallerypath in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shutterspeedgallerypath, or <code>null</code> if a matching shutterspeedgallerypath could not be found
	 */
	@Override
	public shutterspeedgallerypath fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<shutterspeedgallerypath> orderByComparator) {
		List<shutterspeedgallerypath> list = findByCONTENT_ID(content_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last shutterspeedgallerypath in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shutterspeedgallerypath
	 * @throws NoSuchshutterspeedgallerypathException if a matching shutterspeedgallerypath could not be found
	 */
	@Override
	public shutterspeedgallerypath findByCONTENT_ID_Last(long content_id,
		OrderByComparator<shutterspeedgallerypath> orderByComparator)
		throws NoSuchshutterspeedgallerypathException {
		shutterspeedgallerypath shutterspeedgallerypath = fetchByCONTENT_ID_Last(content_id,
				orderByComparator);

		if (shutterspeedgallerypath != null) {
			return shutterspeedgallerypath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchshutterspeedgallerypathException(msg.toString());
	}

	/**
	 * Returns the last shutterspeedgallerypath in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shutterspeedgallerypath, or <code>null</code> if a matching shutterspeedgallerypath could not be found
	 */
	@Override
	public shutterspeedgallerypath fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<shutterspeedgallerypath> orderByComparator) {
		int count = countByCONTENT_ID(content_id);

		if (count == 0) {
			return null;
		}

		List<shutterspeedgallerypath> list = findByCONTENT_ID(content_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the shutterspeedgallerypaths before and after the current shutterspeedgallerypath in the ordered set where content_id = &#63;.
	 *
	 * @param id the primary key of the current shutterspeedgallerypath
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next shutterspeedgallerypath
	 * @throws NoSuchshutterspeedgallerypathException if a shutterspeedgallerypath with the primary key could not be found
	 */
	@Override
	public shutterspeedgallerypath[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id,
		OrderByComparator<shutterspeedgallerypath> orderByComparator)
		throws NoSuchshutterspeedgallerypathException {
		shutterspeedgallerypath shutterspeedgallerypath = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			shutterspeedgallerypath[] array = new shutterspeedgallerypathImpl[3];

			array[0] = getByCONTENT_ID_PrevAndNext(session,
					shutterspeedgallerypath, content_id, orderByComparator, true);

			array[1] = shutterspeedgallerypath;

			array[2] = getByCONTENT_ID_PrevAndNext(session,
					shutterspeedgallerypath, content_id, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected shutterspeedgallerypath getByCONTENT_ID_PrevAndNext(
		Session session, shutterspeedgallerypath shutterspeedgallerypath,
		long content_id,
		OrderByComparator<shutterspeedgallerypath> orderByComparator,
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

		query.append(_SQL_SELECT_SHUTTERSPEEDGALLERYPATH_WHERE);

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
			query.append(shutterspeedgallerypathModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(content_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(shutterspeedgallerypath);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<shutterspeedgallerypath> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the shutterspeedgallerypaths where content_id = &#63; from the database.
	 *
	 * @param content_id the content_id
	 */
	@Override
	public void removeByCONTENT_ID(long content_id) {
		for (shutterspeedgallerypath shutterspeedgallerypath : findByCONTENT_ID(
				content_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(shutterspeedgallerypath);
		}
	}

	/**
	 * Returns the number of shutterspeedgallerypaths where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the number of matching shutterspeedgallerypaths
	 */
	@Override
	public int countByCONTENT_ID(long content_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTENT_ID;

		Object[] finderArgs = new Object[] { content_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SHUTTERSPEEDGALLERYPATH_WHERE);

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

	private static final String _FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2 = "shutterspeedgallerypath.content_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ALBUM_ID = new FinderPath(shutterspeedgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgallerypathModelImpl.FINDER_CACHE_ENABLED,
			shutterspeedgallerypathImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByALBUM_ID",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUM_ID =
		new FinderPath(shutterspeedgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgallerypathModelImpl.FINDER_CACHE_ENABLED,
			shutterspeedgallerypathImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByALBUM_ID",
			new String[] { String.class.getName() },
			shutterspeedgallerypathModelImpl.ALBUMID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ALBUM_ID = new FinderPath(shutterspeedgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgallerypathModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByALBUM_ID",
			new String[] { String.class.getName() });

	/**
	 * Returns all the shutterspeedgallerypaths where albumId = &#63;.
	 *
	 * @param albumId the album ID
	 * @return the matching shutterspeedgallerypaths
	 */
	@Override
	public List<shutterspeedgallerypath> findByALBUM_ID(String albumId) {
		return findByALBUM_ID(albumId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the shutterspeedgallerypaths where albumId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param albumId the album ID
	 * @param start the lower bound of the range of shutterspeedgallerypaths
	 * @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	 * @return the range of matching shutterspeedgallerypaths
	 */
	@Override
	public List<shutterspeedgallerypath> findByALBUM_ID(String albumId,
		int start, int end) {
		return findByALBUM_ID(albumId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the shutterspeedgallerypaths where albumId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param albumId the album ID
	 * @param start the lower bound of the range of shutterspeedgallerypaths
	 * @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching shutterspeedgallerypaths
	 */
	@Override
	public List<shutterspeedgallerypath> findByALBUM_ID(String albumId,
		int start, int end,
		OrderByComparator<shutterspeedgallerypath> orderByComparator) {
		return findByALBUM_ID(albumId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the shutterspeedgallerypaths where albumId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param albumId the album ID
	 * @param start the lower bound of the range of shutterspeedgallerypaths
	 * @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching shutterspeedgallerypaths
	 */
	@Override
	public List<shutterspeedgallerypath> findByALBUM_ID(String albumId,
		int start, int end,
		OrderByComparator<shutterspeedgallerypath> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUM_ID;
			finderArgs = new Object[] { albumId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ALBUM_ID;
			finderArgs = new Object[] { albumId, start, end, orderByComparator };
		}

		List<shutterspeedgallerypath> list = null;

		if (retrieveFromCache) {
			list = (List<shutterspeedgallerypath>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (shutterspeedgallerypath shutterspeedgallerypath : list) {
					if (!Objects.equals(albumId,
								shutterspeedgallerypath.getAlbumId())) {
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

			query.append(_SQL_SELECT_SHUTTERSPEEDGALLERYPATH_WHERE);

			boolean bindAlbumId = false;

			if (albumId == null) {
				query.append(_FINDER_COLUMN_ALBUM_ID_ALBUMID_1);
			}
			else if (albumId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ALBUM_ID_ALBUMID_3);
			}
			else {
				bindAlbumId = true;

				query.append(_FINDER_COLUMN_ALBUM_ID_ALBUMID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(shutterspeedgallerypathModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindAlbumId) {
					qPos.add(albumId);
				}

				if (!pagination) {
					list = (List<shutterspeedgallerypath>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<shutterspeedgallerypath>)QueryUtil.list(q,
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
	 * Returns the first shutterspeedgallerypath in the ordered set where albumId = &#63;.
	 *
	 * @param albumId the album ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shutterspeedgallerypath
	 * @throws NoSuchshutterspeedgallerypathException if a matching shutterspeedgallerypath could not be found
	 */
	@Override
	public shutterspeedgallerypath findByALBUM_ID_First(String albumId,
		OrderByComparator<shutterspeedgallerypath> orderByComparator)
		throws NoSuchshutterspeedgallerypathException {
		shutterspeedgallerypath shutterspeedgallerypath = fetchByALBUM_ID_First(albumId,
				orderByComparator);

		if (shutterspeedgallerypath != null) {
			return shutterspeedgallerypath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("albumId=");
		msg.append(albumId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchshutterspeedgallerypathException(msg.toString());
	}

	/**
	 * Returns the first shutterspeedgallerypath in the ordered set where albumId = &#63;.
	 *
	 * @param albumId the album ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shutterspeedgallerypath, or <code>null</code> if a matching shutterspeedgallerypath could not be found
	 */
	@Override
	public shutterspeedgallerypath fetchByALBUM_ID_First(String albumId,
		OrderByComparator<shutterspeedgallerypath> orderByComparator) {
		List<shutterspeedgallerypath> list = findByALBUM_ID(albumId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last shutterspeedgallerypath in the ordered set where albumId = &#63;.
	 *
	 * @param albumId the album ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shutterspeedgallerypath
	 * @throws NoSuchshutterspeedgallerypathException if a matching shutterspeedgallerypath could not be found
	 */
	@Override
	public shutterspeedgallerypath findByALBUM_ID_Last(String albumId,
		OrderByComparator<shutterspeedgallerypath> orderByComparator)
		throws NoSuchshutterspeedgallerypathException {
		shutterspeedgallerypath shutterspeedgallerypath = fetchByALBUM_ID_Last(albumId,
				orderByComparator);

		if (shutterspeedgallerypath != null) {
			return shutterspeedgallerypath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("albumId=");
		msg.append(albumId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchshutterspeedgallerypathException(msg.toString());
	}

	/**
	 * Returns the last shutterspeedgallerypath in the ordered set where albumId = &#63;.
	 *
	 * @param albumId the album ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shutterspeedgallerypath, or <code>null</code> if a matching shutterspeedgallerypath could not be found
	 */
	@Override
	public shutterspeedgallerypath fetchByALBUM_ID_Last(String albumId,
		OrderByComparator<shutterspeedgallerypath> orderByComparator) {
		int count = countByALBUM_ID(albumId);

		if (count == 0) {
			return null;
		}

		List<shutterspeedgallerypath> list = findByALBUM_ID(albumId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the shutterspeedgallerypaths before and after the current shutterspeedgallerypath in the ordered set where albumId = &#63;.
	 *
	 * @param id the primary key of the current shutterspeedgallerypath
	 * @param albumId the album ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next shutterspeedgallerypath
	 * @throws NoSuchshutterspeedgallerypathException if a shutterspeedgallerypath with the primary key could not be found
	 */
	@Override
	public shutterspeedgallerypath[] findByALBUM_ID_PrevAndNext(long id,
		String albumId,
		OrderByComparator<shutterspeedgallerypath> orderByComparator)
		throws NoSuchshutterspeedgallerypathException {
		shutterspeedgallerypath shutterspeedgallerypath = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			shutterspeedgallerypath[] array = new shutterspeedgallerypathImpl[3];

			array[0] = getByALBUM_ID_PrevAndNext(session,
					shutterspeedgallerypath, albumId, orderByComparator, true);

			array[1] = shutterspeedgallerypath;

			array[2] = getByALBUM_ID_PrevAndNext(session,
					shutterspeedgallerypath, albumId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected shutterspeedgallerypath getByALBUM_ID_PrevAndNext(
		Session session, shutterspeedgallerypath shutterspeedgallerypath,
		String albumId,
		OrderByComparator<shutterspeedgallerypath> orderByComparator,
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

		query.append(_SQL_SELECT_SHUTTERSPEEDGALLERYPATH_WHERE);

		boolean bindAlbumId = false;

		if (albumId == null) {
			query.append(_FINDER_COLUMN_ALBUM_ID_ALBUMID_1);
		}
		else if (albumId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ALBUM_ID_ALBUMID_3);
		}
		else {
			bindAlbumId = true;

			query.append(_FINDER_COLUMN_ALBUM_ID_ALBUMID_2);
		}

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
			query.append(shutterspeedgallerypathModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindAlbumId) {
			qPos.add(albumId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(shutterspeedgallerypath);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<shutterspeedgallerypath> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the shutterspeedgallerypaths where albumId = &#63; from the database.
	 *
	 * @param albumId the album ID
	 */
	@Override
	public void removeByALBUM_ID(String albumId) {
		for (shutterspeedgallerypath shutterspeedgallerypath : findByALBUM_ID(
				albumId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(shutterspeedgallerypath);
		}
	}

	/**
	 * Returns the number of shutterspeedgallerypaths where albumId = &#63;.
	 *
	 * @param albumId the album ID
	 * @return the number of matching shutterspeedgallerypaths
	 */
	@Override
	public int countByALBUM_ID(String albumId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ALBUM_ID;

		Object[] finderArgs = new Object[] { albumId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SHUTTERSPEEDGALLERYPATH_WHERE);

			boolean bindAlbumId = false;

			if (albumId == null) {
				query.append(_FINDER_COLUMN_ALBUM_ID_ALBUMID_1);
			}
			else if (albumId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ALBUM_ID_ALBUMID_3);
			}
			else {
				bindAlbumId = true;

				query.append(_FINDER_COLUMN_ALBUM_ID_ALBUMID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindAlbumId) {
					qPos.add(albumId);
				}

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

	private static final String _FINDER_COLUMN_ALBUM_ID_ALBUMID_1 = "shutterspeedgallerypath.albumId IS NULL";
	private static final String _FINDER_COLUMN_ALBUM_ID_ALBUMID_2 = "shutterspeedgallerypath.albumId = ?";
	private static final String _FINDER_COLUMN_ALBUM_ID_ALBUMID_3 = "(shutterspeedgallerypath.albumId IS NULL OR shutterspeedgallerypath.albumId = '')";

	public shutterspeedgallerypathPersistenceImpl() {
		setModelClass(shutterspeedgallerypath.class);
	}

	/**
	 * Caches the shutterspeedgallerypath in the entity cache if it is enabled.
	 *
	 * @param shutterspeedgallerypath the shutterspeedgallerypath
	 */
	@Override
	public void cacheResult(shutterspeedgallerypath shutterspeedgallerypath) {
		entityCache.putResult(shutterspeedgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgallerypathImpl.class,
			shutterspeedgallerypath.getPrimaryKey(), shutterspeedgallerypath);

		shutterspeedgallerypath.resetOriginalValues();
	}

	/**
	 * Caches the shutterspeedgallerypaths in the entity cache if it is enabled.
	 *
	 * @param shutterspeedgallerypaths the shutterspeedgallerypaths
	 */
	@Override
	public void cacheResult(
		List<shutterspeedgallerypath> shutterspeedgallerypaths) {
		for (shutterspeedgallerypath shutterspeedgallerypath : shutterspeedgallerypaths) {
			if (entityCache.getResult(
						shutterspeedgallerypathModelImpl.ENTITY_CACHE_ENABLED,
						shutterspeedgallerypathImpl.class,
						shutterspeedgallerypath.getPrimaryKey()) == null) {
				cacheResult(shutterspeedgallerypath);
			}
			else {
				shutterspeedgallerypath.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all shutterspeedgallerypaths.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(shutterspeedgallerypathImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the shutterspeedgallerypath.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(shutterspeedgallerypath shutterspeedgallerypath) {
		entityCache.removeResult(shutterspeedgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgallerypathImpl.class,
			shutterspeedgallerypath.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<shutterspeedgallerypath> shutterspeedgallerypaths) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (shutterspeedgallerypath shutterspeedgallerypath : shutterspeedgallerypaths) {
			entityCache.removeResult(shutterspeedgallerypathModelImpl.ENTITY_CACHE_ENABLED,
				shutterspeedgallerypathImpl.class,
				shutterspeedgallerypath.getPrimaryKey());
		}
	}

	/**
	 * Creates a new shutterspeedgallerypath with the primary key. Does not add the shutterspeedgallerypath to the database.
	 *
	 * @param id the primary key for the new shutterspeedgallerypath
	 * @return the new shutterspeedgallerypath
	 */
	@Override
	public shutterspeedgallerypath create(long id) {
		shutterspeedgallerypath shutterspeedgallerypath = new shutterspeedgallerypathImpl();

		shutterspeedgallerypath.setNew(true);
		shutterspeedgallerypath.setPrimaryKey(id);

		return shutterspeedgallerypath;
	}

	/**
	 * Removes the shutterspeedgallerypath with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the shutterspeedgallerypath
	 * @return the shutterspeedgallerypath that was removed
	 * @throws NoSuchshutterspeedgallerypathException if a shutterspeedgallerypath with the primary key could not be found
	 */
	@Override
	public shutterspeedgallerypath remove(long id)
		throws NoSuchshutterspeedgallerypathException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the shutterspeedgallerypath with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the shutterspeedgallerypath
	 * @return the shutterspeedgallerypath that was removed
	 * @throws NoSuchshutterspeedgallerypathException if a shutterspeedgallerypath with the primary key could not be found
	 */
	@Override
	public shutterspeedgallerypath remove(Serializable primaryKey)
		throws NoSuchshutterspeedgallerypathException {
		Session session = null;

		try {
			session = openSession();

			shutterspeedgallerypath shutterspeedgallerypath = (shutterspeedgallerypath)session.get(shutterspeedgallerypathImpl.class,
					primaryKey);

			if (shutterspeedgallerypath == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchshutterspeedgallerypathException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(shutterspeedgallerypath);
		}
		catch (NoSuchshutterspeedgallerypathException nsee) {
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
	protected shutterspeedgallerypath removeImpl(
		shutterspeedgallerypath shutterspeedgallerypath) {
		shutterspeedgallerypath = toUnwrappedModel(shutterspeedgallerypath);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(shutterspeedgallerypath)) {
				shutterspeedgallerypath = (shutterspeedgallerypath)session.get(shutterspeedgallerypathImpl.class,
						shutterspeedgallerypath.getPrimaryKeyObj());
			}

			if (shutterspeedgallerypath != null) {
				session.delete(shutterspeedgallerypath);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (shutterspeedgallerypath != null) {
			clearCache(shutterspeedgallerypath);
		}

		return shutterspeedgallerypath;
	}

	@Override
	public shutterspeedgallerypath updateImpl(
		shutterspeedgallerypath shutterspeedgallerypath) {
		shutterspeedgallerypath = toUnwrappedModel(shutterspeedgallerypath);

		boolean isNew = shutterspeedgallerypath.isNew();

		shutterspeedgallerypathModelImpl shutterspeedgallerypathModelImpl = (shutterspeedgallerypathModelImpl)shutterspeedgallerypath;

		Session session = null;

		try {
			session = openSession();

			if (shutterspeedgallerypath.isNew()) {
				session.save(shutterspeedgallerypath);

				shutterspeedgallerypath.setNew(false);
			}
			else {
				shutterspeedgallerypath = (shutterspeedgallerypath)session.merge(shutterspeedgallerypath);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !shutterspeedgallerypathModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((shutterspeedgallerypathModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						shutterspeedgallerypathModelImpl.getOriginalContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);

				args = new Object[] {
						shutterspeedgallerypathModelImpl.getContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);
			}

			if ((shutterspeedgallerypathModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUM_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						shutterspeedgallerypathModelImpl.getOriginalAlbumId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ALBUM_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUM_ID,
					args);

				args = new Object[] {
						shutterspeedgallerypathModelImpl.getAlbumId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ALBUM_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUM_ID,
					args);
			}
		}

		entityCache.putResult(shutterspeedgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgallerypathImpl.class,
			shutterspeedgallerypath.getPrimaryKey(), shutterspeedgallerypath,
			false);

		shutterspeedgallerypath.resetOriginalValues();

		return shutterspeedgallerypath;
	}

	protected shutterspeedgallerypath toUnwrappedModel(
		shutterspeedgallerypath shutterspeedgallerypath) {
		if (shutterspeedgallerypath instanceof shutterspeedgallerypathImpl) {
			return shutterspeedgallerypath;
		}

		shutterspeedgallerypathImpl shutterspeedgallerypathImpl = new shutterspeedgallerypathImpl();

		shutterspeedgallerypathImpl.setNew(shutterspeedgallerypath.isNew());
		shutterspeedgallerypathImpl.setPrimaryKey(shutterspeedgallerypath.getPrimaryKey());

		shutterspeedgallerypathImpl.setId(shutterspeedgallerypath.getId());
		shutterspeedgallerypathImpl.setAlbumId(shutterspeedgallerypath.getAlbumId());
		shutterspeedgallerypathImpl.setAlbumImagePath(shutterspeedgallerypath.getAlbumImagePath());
		shutterspeedgallerypathImpl.setImageTitle(shutterspeedgallerypath.getImageTitle());
		shutterspeedgallerypathImpl.setCreatedDate(shutterspeedgallerypath.getCreatedDate());
		shutterspeedgallerypathImpl.setCreatedBy(shutterspeedgallerypath.getCreatedBy());
		shutterspeedgallerypathImpl.setUpdatedDate(shutterspeedgallerypath.getUpdatedDate());
		shutterspeedgallerypathImpl.setUpdatedBy(shutterspeedgallerypath.getUpdatedBy());
		shutterspeedgallerypathImpl.setFlag(shutterspeedgallerypath.getFlag());
		shutterspeedgallerypathImpl.setContent_id(shutterspeedgallerypath.getContent_id());

		return shutterspeedgallerypathImpl;
	}

	/**
	 * Returns the shutterspeedgallerypath with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the shutterspeedgallerypath
	 * @return the shutterspeedgallerypath
	 * @throws NoSuchshutterspeedgallerypathException if a shutterspeedgallerypath with the primary key could not be found
	 */
	@Override
	public shutterspeedgallerypath findByPrimaryKey(Serializable primaryKey)
		throws NoSuchshutterspeedgallerypathException {
		shutterspeedgallerypath shutterspeedgallerypath = fetchByPrimaryKey(primaryKey);

		if (shutterspeedgallerypath == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchshutterspeedgallerypathException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return shutterspeedgallerypath;
	}

	/**
	 * Returns the shutterspeedgallerypath with the primary key or throws a {@link NoSuchshutterspeedgallerypathException} if it could not be found.
	 *
	 * @param id the primary key of the shutterspeedgallerypath
	 * @return the shutterspeedgallerypath
	 * @throws NoSuchshutterspeedgallerypathException if a shutterspeedgallerypath with the primary key could not be found
	 */
	@Override
	public shutterspeedgallerypath findByPrimaryKey(long id)
		throws NoSuchshutterspeedgallerypathException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the shutterspeedgallerypath with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the shutterspeedgallerypath
	 * @return the shutterspeedgallerypath, or <code>null</code> if a shutterspeedgallerypath with the primary key could not be found
	 */
	@Override
	public shutterspeedgallerypath fetchByPrimaryKey(Serializable primaryKey) {
		shutterspeedgallerypath shutterspeedgallerypath = (shutterspeedgallerypath)entityCache.getResult(shutterspeedgallerypathModelImpl.ENTITY_CACHE_ENABLED,
				shutterspeedgallerypathImpl.class, primaryKey);

		if (shutterspeedgallerypath == _nullshutterspeedgallerypath) {
			return null;
		}

		if (shutterspeedgallerypath == null) {
			Session session = null;

			try {
				session = openSession();

				shutterspeedgallerypath = (shutterspeedgallerypath)session.get(shutterspeedgallerypathImpl.class,
						primaryKey);

				if (shutterspeedgallerypath != null) {
					cacheResult(shutterspeedgallerypath);
				}
				else {
					entityCache.putResult(shutterspeedgallerypathModelImpl.ENTITY_CACHE_ENABLED,
						shutterspeedgallerypathImpl.class, primaryKey,
						_nullshutterspeedgallerypath);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(shutterspeedgallerypathModelImpl.ENTITY_CACHE_ENABLED,
					shutterspeedgallerypathImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return shutterspeedgallerypath;
	}

	/**
	 * Returns the shutterspeedgallerypath with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the shutterspeedgallerypath
	 * @return the shutterspeedgallerypath, or <code>null</code> if a shutterspeedgallerypath with the primary key could not be found
	 */
	@Override
	public shutterspeedgallerypath fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, shutterspeedgallerypath> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, shutterspeedgallerypath> map = new HashMap<Serializable, shutterspeedgallerypath>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			shutterspeedgallerypath shutterspeedgallerypath = fetchByPrimaryKey(primaryKey);

			if (shutterspeedgallerypath != null) {
				map.put(primaryKey, shutterspeedgallerypath);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			shutterspeedgallerypath shutterspeedgallerypath = (shutterspeedgallerypath)entityCache.getResult(shutterspeedgallerypathModelImpl.ENTITY_CACHE_ENABLED,
					shutterspeedgallerypathImpl.class, primaryKey);

			if (shutterspeedgallerypath == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, shutterspeedgallerypath);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SHUTTERSPEEDGALLERYPATH_WHERE_PKS_IN);

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

			for (shutterspeedgallerypath shutterspeedgallerypath : (List<shutterspeedgallerypath>)q.list()) {
				map.put(shutterspeedgallerypath.getPrimaryKeyObj(),
					shutterspeedgallerypath);

				cacheResult(shutterspeedgallerypath);

				uncachedPrimaryKeys.remove(shutterspeedgallerypath.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(shutterspeedgallerypathModelImpl.ENTITY_CACHE_ENABLED,
					shutterspeedgallerypathImpl.class, primaryKey,
					_nullshutterspeedgallerypath);
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
	 * Returns all the shutterspeedgallerypaths.
	 *
	 * @return the shutterspeedgallerypaths
	 */
	@Override
	public List<shutterspeedgallerypath> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the shutterspeedgallerypaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of shutterspeedgallerypaths
	 * @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	 * @return the range of shutterspeedgallerypaths
	 */
	@Override
	public List<shutterspeedgallerypath> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the shutterspeedgallerypaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of shutterspeedgallerypaths
	 * @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of shutterspeedgallerypaths
	 */
	@Override
	public List<shutterspeedgallerypath> findAll(int start, int end,
		OrderByComparator<shutterspeedgallerypath> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the shutterspeedgallerypaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of shutterspeedgallerypaths
	 * @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of shutterspeedgallerypaths
	 */
	@Override
	public List<shutterspeedgallerypath> findAll(int start, int end,
		OrderByComparator<shutterspeedgallerypath> orderByComparator,
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

		List<shutterspeedgallerypath> list = null;

		if (retrieveFromCache) {
			list = (List<shutterspeedgallerypath>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SHUTTERSPEEDGALLERYPATH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SHUTTERSPEEDGALLERYPATH;

				if (pagination) {
					sql = sql.concat(shutterspeedgallerypathModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<shutterspeedgallerypath>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<shutterspeedgallerypath>)QueryUtil.list(q,
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
	 * Removes all the shutterspeedgallerypaths from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (shutterspeedgallerypath shutterspeedgallerypath : findAll()) {
			remove(shutterspeedgallerypath);
		}
	}

	/**
	 * Returns the number of shutterspeedgallerypaths.
	 *
	 * @return the number of shutterspeedgallerypaths
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SHUTTERSPEEDGALLERYPATH);

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
		return shutterspeedgallerypathModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the shutterspeedgallerypath persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(shutterspeedgallerypathImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_SHUTTERSPEEDGALLERYPATH = "SELECT shutterspeedgallerypath FROM shutterspeedgallerypath shutterspeedgallerypath";
	private static final String _SQL_SELECT_SHUTTERSPEEDGALLERYPATH_WHERE_PKS_IN =
		"SELECT shutterspeedgallerypath FROM shutterspeedgallerypath shutterspeedgallerypath WHERE id_ IN (";
	private static final String _SQL_SELECT_SHUTTERSPEEDGALLERYPATH_WHERE = "SELECT shutterspeedgallerypath FROM shutterspeedgallerypath shutterspeedgallerypath WHERE ";
	private static final String _SQL_COUNT_SHUTTERSPEEDGALLERYPATH = "SELECT COUNT(shutterspeedgallerypath) FROM shutterspeedgallerypath shutterspeedgallerypath";
	private static final String _SQL_COUNT_SHUTTERSPEEDGALLERYPATH_WHERE = "SELECT COUNT(shutterspeedgallerypath) FROM shutterspeedgallerypath shutterspeedgallerypath WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "shutterspeedgallerypath.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No shutterspeedgallerypath exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No shutterspeedgallerypath exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(shutterspeedgallerypathPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final shutterspeedgallerypath _nullshutterspeedgallerypath = new shutterspeedgallerypathImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<shutterspeedgallerypath> toCacheModel() {
				return _nullshutterspeedgallerypathCacheModel;
			}
		};

	private static final CacheModel<shutterspeedgallerypath> _nullshutterspeedgallerypathCacheModel =
		new CacheModel<shutterspeedgallerypath>() {
			@Override
			public shutterspeedgallerypath toEntityModel() {
				return _nullshutterspeedgallerypath;
			}
		};
}