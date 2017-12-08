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

package com.chola.feedforward.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.feedforward.exception.NoSuchfeedforwardgallerypathException;
import com.chola.feedforward.model.feedforwardgallerypath;
import com.chola.feedforward.model.impl.feedforwardgallerypathImpl;
import com.chola.feedforward.model.impl.feedforwardgallerypathModelImpl;
import com.chola.feedforward.service.persistence.feedforwardgallerypathPersistence;

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
 * The persistence implementation for the feedforwardgallerypath service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see feedforwardgallerypathPersistence
 * @see com.chola.feedforward.service.persistence.feedforwardgallerypathUtil
 * @generated
 */
@ProviderType
public class feedforwardgallerypathPersistenceImpl extends BasePersistenceImpl<feedforwardgallerypath>
	implements feedforwardgallerypathPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link feedforwardgallerypathUtil} to access the feedforwardgallerypath persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = feedforwardgallerypathImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(feedforwardgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgallerypathModelImpl.FINDER_CACHE_ENABLED,
			feedforwardgallerypathImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(feedforwardgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgallerypathModelImpl.FINDER_CACHE_ENABLED,
			feedforwardgallerypathImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(feedforwardgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgallerypathModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ALBUM_ID = new FinderPath(feedforwardgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgallerypathModelImpl.FINDER_CACHE_ENABLED,
			feedforwardgallerypathImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByALBUM_ID",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUM_ID =
		new FinderPath(feedforwardgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgallerypathModelImpl.FINDER_CACHE_ENABLED,
			feedforwardgallerypathImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByALBUM_ID",
			new String[] { String.class.getName() },
			feedforwardgallerypathModelImpl.ALBUMID_COLUMN_BITMASK |
			feedforwardgallerypathModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ALBUM_ID = new FinderPath(feedforwardgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgallerypathModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByALBUM_ID",
			new String[] { String.class.getName() });

	/**
	 * Returns all the feedforwardgallerypaths where albumId = &#63;.
	 *
	 * @param albumId the album ID
	 * @return the matching feedforwardgallerypaths
	 */
	@Override
	public List<feedforwardgallerypath> findByALBUM_ID(String albumId) {
		return findByALBUM_ID(albumId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the feedforwardgallerypaths where albumId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param albumId the album ID
	 * @param start the lower bound of the range of feedforwardgallerypaths
	 * @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	 * @return the range of matching feedforwardgallerypaths
	 */
	@Override
	public List<feedforwardgallerypath> findByALBUM_ID(String albumId,
		int start, int end) {
		return findByALBUM_ID(albumId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the feedforwardgallerypaths where albumId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param albumId the album ID
	 * @param start the lower bound of the range of feedforwardgallerypaths
	 * @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching feedforwardgallerypaths
	 */
	@Override
	public List<feedforwardgallerypath> findByALBUM_ID(String albumId,
		int start, int end,
		OrderByComparator<feedforwardgallerypath> orderByComparator) {
		return findByALBUM_ID(albumId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the feedforwardgallerypaths where albumId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param albumId the album ID
	 * @param start the lower bound of the range of feedforwardgallerypaths
	 * @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching feedforwardgallerypaths
	 */
	@Override
	public List<feedforwardgallerypath> findByALBUM_ID(String albumId,
		int start, int end,
		OrderByComparator<feedforwardgallerypath> orderByComparator,
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

		List<feedforwardgallerypath> list = null;

		if (retrieveFromCache) {
			list = (List<feedforwardgallerypath>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (feedforwardgallerypath feedforwardgallerypath : list) {
					if (!Objects.equals(albumId,
								feedforwardgallerypath.getAlbumId())) {
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

			query.append(_SQL_SELECT_FEEDFORWARDGALLERYPATH_WHERE);

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
				query.append(feedforwardgallerypathModelImpl.ORDER_BY_JPQL);
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
					list = (List<feedforwardgallerypath>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<feedforwardgallerypath>)QueryUtil.list(q,
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
	 * Returns the first feedforwardgallerypath in the ordered set where albumId = &#63;.
	 *
	 * @param albumId the album ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedforwardgallerypath
	 * @throws NoSuchfeedforwardgallerypathException if a matching feedforwardgallerypath could not be found
	 */
	@Override
	public feedforwardgallerypath findByALBUM_ID_First(String albumId,
		OrderByComparator<feedforwardgallerypath> orderByComparator)
		throws NoSuchfeedforwardgallerypathException {
		feedforwardgallerypath feedforwardgallerypath = fetchByALBUM_ID_First(albumId,
				orderByComparator);

		if (feedforwardgallerypath != null) {
			return feedforwardgallerypath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("albumId=");
		msg.append(albumId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchfeedforwardgallerypathException(msg.toString());
	}

	/**
	 * Returns the first feedforwardgallerypath in the ordered set where albumId = &#63;.
	 *
	 * @param albumId the album ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedforwardgallerypath, or <code>null</code> if a matching feedforwardgallerypath could not be found
	 */
	@Override
	public feedforwardgallerypath fetchByALBUM_ID_First(String albumId,
		OrderByComparator<feedforwardgallerypath> orderByComparator) {
		List<feedforwardgallerypath> list = findByALBUM_ID(albumId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last feedforwardgallerypath in the ordered set where albumId = &#63;.
	 *
	 * @param albumId the album ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedforwardgallerypath
	 * @throws NoSuchfeedforwardgallerypathException if a matching feedforwardgallerypath could not be found
	 */
	@Override
	public feedforwardgallerypath findByALBUM_ID_Last(String albumId,
		OrderByComparator<feedforwardgallerypath> orderByComparator)
		throws NoSuchfeedforwardgallerypathException {
		feedforwardgallerypath feedforwardgallerypath = fetchByALBUM_ID_Last(albumId,
				orderByComparator);

		if (feedforwardgallerypath != null) {
			return feedforwardgallerypath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("albumId=");
		msg.append(albumId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchfeedforwardgallerypathException(msg.toString());
	}

	/**
	 * Returns the last feedforwardgallerypath in the ordered set where albumId = &#63;.
	 *
	 * @param albumId the album ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedforwardgallerypath, or <code>null</code> if a matching feedforwardgallerypath could not be found
	 */
	@Override
	public feedforwardgallerypath fetchByALBUM_ID_Last(String albumId,
		OrderByComparator<feedforwardgallerypath> orderByComparator) {
		int count = countByALBUM_ID(albumId);

		if (count == 0) {
			return null;
		}

		List<feedforwardgallerypath> list = findByALBUM_ID(albumId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the feedforwardgallerypaths before and after the current feedforwardgallerypath in the ordered set where albumId = &#63;.
	 *
	 * @param id the primary key of the current feedforwardgallerypath
	 * @param albumId the album ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next feedforwardgallerypath
	 * @throws NoSuchfeedforwardgallerypathException if a feedforwardgallerypath with the primary key could not be found
	 */
	@Override
	public feedforwardgallerypath[] findByALBUM_ID_PrevAndNext(long id,
		String albumId,
		OrderByComparator<feedforwardgallerypath> orderByComparator)
		throws NoSuchfeedforwardgallerypathException {
		feedforwardgallerypath feedforwardgallerypath = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			feedforwardgallerypath[] array = new feedforwardgallerypathImpl[3];

			array[0] = getByALBUM_ID_PrevAndNext(session,
					feedforwardgallerypath, albumId, orderByComparator, true);

			array[1] = feedforwardgallerypath;

			array[2] = getByALBUM_ID_PrevAndNext(session,
					feedforwardgallerypath, albumId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected feedforwardgallerypath getByALBUM_ID_PrevAndNext(
		Session session, feedforwardgallerypath feedforwardgallerypath,
		String albumId,
		OrderByComparator<feedforwardgallerypath> orderByComparator,
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

		query.append(_SQL_SELECT_FEEDFORWARDGALLERYPATH_WHERE);

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
			query.append(feedforwardgallerypathModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(feedforwardgallerypath);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<feedforwardgallerypath> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the feedforwardgallerypaths where albumId = &#63; from the database.
	 *
	 * @param albumId the album ID
	 */
	@Override
	public void removeByALBUM_ID(String albumId) {
		for (feedforwardgallerypath feedforwardgallerypath : findByALBUM_ID(
				albumId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(feedforwardgallerypath);
		}
	}

	/**
	 * Returns the number of feedforwardgallerypaths where albumId = &#63;.
	 *
	 * @param albumId the album ID
	 * @return the number of matching feedforwardgallerypaths
	 */
	@Override
	public int countByALBUM_ID(String albumId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ALBUM_ID;

		Object[] finderArgs = new Object[] { albumId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FEEDFORWARDGALLERYPATH_WHERE);

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

	private static final String _FINDER_COLUMN_ALBUM_ID_ALBUMID_1 = "feedforwardgallerypath.albumId IS NULL";
	private static final String _FINDER_COLUMN_ALBUM_ID_ALBUMID_2 = "feedforwardgallerypath.albumId = ?";
	private static final String _FINDER_COLUMN_ALBUM_ID_ALBUMID_3 = "(feedforwardgallerypath.albumId IS NULL OR feedforwardgallerypath.albumId = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(feedforwardgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgallerypathModelImpl.FINDER_CACHE_ENABLED,
			feedforwardgallerypathImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCONTENT_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID =
		new FinderPath(feedforwardgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgallerypathModelImpl.FINDER_CACHE_ENABLED,
			feedforwardgallerypathImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCONTENT_ID",
			new String[] { Long.class.getName() },
			feedforwardgallerypathModelImpl.CONTENT_ID_COLUMN_BITMASK |
			feedforwardgallerypathModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTENT_ID = new FinderPath(feedforwardgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgallerypathModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCONTENT_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the feedforwardgallerypaths where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the matching feedforwardgallerypaths
	 */
	@Override
	public List<feedforwardgallerypath> findByCONTENT_ID(long content_id) {
		return findByCONTENT_ID(content_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the feedforwardgallerypaths where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of feedforwardgallerypaths
	 * @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	 * @return the range of matching feedforwardgallerypaths
	 */
	@Override
	public List<feedforwardgallerypath> findByCONTENT_ID(long content_id,
		int start, int end) {
		return findByCONTENT_ID(content_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the feedforwardgallerypaths where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of feedforwardgallerypaths
	 * @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching feedforwardgallerypaths
	 */
	@Override
	public List<feedforwardgallerypath> findByCONTENT_ID(long content_id,
		int start, int end,
		OrderByComparator<feedforwardgallerypath> orderByComparator) {
		return findByCONTENT_ID(content_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the feedforwardgallerypaths where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of feedforwardgallerypaths
	 * @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching feedforwardgallerypaths
	 */
	@Override
	public List<feedforwardgallerypath> findByCONTENT_ID(long content_id,
		int start, int end,
		OrderByComparator<feedforwardgallerypath> orderByComparator,
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

		List<feedforwardgallerypath> list = null;

		if (retrieveFromCache) {
			list = (List<feedforwardgallerypath>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (feedforwardgallerypath feedforwardgallerypath : list) {
					if ((content_id != feedforwardgallerypath.getContent_id())) {
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

			query.append(_SQL_SELECT_FEEDFORWARDGALLERYPATH_WHERE);

			query.append(_FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(feedforwardgallerypathModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(content_id);

				if (!pagination) {
					list = (List<feedforwardgallerypath>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<feedforwardgallerypath>)QueryUtil.list(q,
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
	 * Returns the first feedforwardgallerypath in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedforwardgallerypath
	 * @throws NoSuchfeedforwardgallerypathException if a matching feedforwardgallerypath could not be found
	 */
	@Override
	public feedforwardgallerypath findByCONTENT_ID_First(long content_id,
		OrderByComparator<feedforwardgallerypath> orderByComparator)
		throws NoSuchfeedforwardgallerypathException {
		feedforwardgallerypath feedforwardgallerypath = fetchByCONTENT_ID_First(content_id,
				orderByComparator);

		if (feedforwardgallerypath != null) {
			return feedforwardgallerypath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchfeedforwardgallerypathException(msg.toString());
	}

	/**
	 * Returns the first feedforwardgallerypath in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedforwardgallerypath, or <code>null</code> if a matching feedforwardgallerypath could not be found
	 */
	@Override
	public feedforwardgallerypath fetchByCONTENT_ID_First(long content_id,
		OrderByComparator<feedforwardgallerypath> orderByComparator) {
		List<feedforwardgallerypath> list = findByCONTENT_ID(content_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last feedforwardgallerypath in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedforwardgallerypath
	 * @throws NoSuchfeedforwardgallerypathException if a matching feedforwardgallerypath could not be found
	 */
	@Override
	public feedforwardgallerypath findByCONTENT_ID_Last(long content_id,
		OrderByComparator<feedforwardgallerypath> orderByComparator)
		throws NoSuchfeedforwardgallerypathException {
		feedforwardgallerypath feedforwardgallerypath = fetchByCONTENT_ID_Last(content_id,
				orderByComparator);

		if (feedforwardgallerypath != null) {
			return feedforwardgallerypath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchfeedforwardgallerypathException(msg.toString());
	}

	/**
	 * Returns the last feedforwardgallerypath in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedforwardgallerypath, or <code>null</code> if a matching feedforwardgallerypath could not be found
	 */
	@Override
	public feedforwardgallerypath fetchByCONTENT_ID_Last(long content_id,
		OrderByComparator<feedforwardgallerypath> orderByComparator) {
		int count = countByCONTENT_ID(content_id);

		if (count == 0) {
			return null;
		}

		List<feedforwardgallerypath> list = findByCONTENT_ID(content_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the feedforwardgallerypaths before and after the current feedforwardgallerypath in the ordered set where content_id = &#63;.
	 *
	 * @param id the primary key of the current feedforwardgallerypath
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next feedforwardgallerypath
	 * @throws NoSuchfeedforwardgallerypathException if a feedforwardgallerypath with the primary key could not be found
	 */
	@Override
	public feedforwardgallerypath[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id,
		OrderByComparator<feedforwardgallerypath> orderByComparator)
		throws NoSuchfeedforwardgallerypathException {
		feedforwardgallerypath feedforwardgallerypath = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			feedforwardgallerypath[] array = new feedforwardgallerypathImpl[3];

			array[0] = getByCONTENT_ID_PrevAndNext(session,
					feedforwardgallerypath, content_id, orderByComparator, true);

			array[1] = feedforwardgallerypath;

			array[2] = getByCONTENT_ID_PrevAndNext(session,
					feedforwardgallerypath, content_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected feedforwardgallerypath getByCONTENT_ID_PrevAndNext(
		Session session, feedforwardgallerypath feedforwardgallerypath,
		long content_id,
		OrderByComparator<feedforwardgallerypath> orderByComparator,
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

		query.append(_SQL_SELECT_FEEDFORWARDGALLERYPATH_WHERE);

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
			query.append(feedforwardgallerypathModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(content_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(feedforwardgallerypath);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<feedforwardgallerypath> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the feedforwardgallerypaths where content_id = &#63; from the database.
	 *
	 * @param content_id the content_id
	 */
	@Override
	public void removeByCONTENT_ID(long content_id) {
		for (feedforwardgallerypath feedforwardgallerypath : findByCONTENT_ID(
				content_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(feedforwardgallerypath);
		}
	}

	/**
	 * Returns the number of feedforwardgallerypaths where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the number of matching feedforwardgallerypaths
	 */
	@Override
	public int countByCONTENT_ID(long content_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTENT_ID;

		Object[] finderArgs = new Object[] { content_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FEEDFORWARDGALLERYPATH_WHERE);

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

	private static final String _FINDER_COLUMN_CONTENT_ID_CONTENT_ID_2 = "feedforwardgallerypath.content_id = ?";

	public feedforwardgallerypathPersistenceImpl() {
		setModelClass(feedforwardgallerypath.class);
	}

	/**
	 * Caches the feedforwardgallerypath in the entity cache if it is enabled.
	 *
	 * @param feedforwardgallerypath the feedforwardgallerypath
	 */
	@Override
	public void cacheResult(feedforwardgallerypath feedforwardgallerypath) {
		entityCache.putResult(feedforwardgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgallerypathImpl.class,
			feedforwardgallerypath.getPrimaryKey(), feedforwardgallerypath);

		feedforwardgallerypath.resetOriginalValues();
	}

	/**
	 * Caches the feedforwardgallerypaths in the entity cache if it is enabled.
	 *
	 * @param feedforwardgallerypaths the feedforwardgallerypaths
	 */
	@Override
	public void cacheResult(
		List<feedforwardgallerypath> feedforwardgallerypaths) {
		for (feedforwardgallerypath feedforwardgallerypath : feedforwardgallerypaths) {
			if (entityCache.getResult(
						feedforwardgallerypathModelImpl.ENTITY_CACHE_ENABLED,
						feedforwardgallerypathImpl.class,
						feedforwardgallerypath.getPrimaryKey()) == null) {
				cacheResult(feedforwardgallerypath);
			}
			else {
				feedforwardgallerypath.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all feedforwardgallerypaths.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(feedforwardgallerypathImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the feedforwardgallerypath.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(feedforwardgallerypath feedforwardgallerypath) {
		entityCache.removeResult(feedforwardgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgallerypathImpl.class,
			feedforwardgallerypath.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<feedforwardgallerypath> feedforwardgallerypaths) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (feedforwardgallerypath feedforwardgallerypath : feedforwardgallerypaths) {
			entityCache.removeResult(feedforwardgallerypathModelImpl.ENTITY_CACHE_ENABLED,
				feedforwardgallerypathImpl.class,
				feedforwardgallerypath.getPrimaryKey());
		}
	}

	/**
	 * Creates a new feedforwardgallerypath with the primary key. Does not add the feedforwardgallerypath to the database.
	 *
	 * @param id the primary key for the new feedforwardgallerypath
	 * @return the new feedforwardgallerypath
	 */
	@Override
	public feedforwardgallerypath create(long id) {
		feedforwardgallerypath feedforwardgallerypath = new feedforwardgallerypathImpl();

		feedforwardgallerypath.setNew(true);
		feedforwardgallerypath.setPrimaryKey(id);

		return feedforwardgallerypath;
	}

	/**
	 * Removes the feedforwardgallerypath with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the feedforwardgallerypath
	 * @return the feedforwardgallerypath that was removed
	 * @throws NoSuchfeedforwardgallerypathException if a feedforwardgallerypath with the primary key could not be found
	 */
	@Override
	public feedforwardgallerypath remove(long id)
		throws NoSuchfeedforwardgallerypathException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the feedforwardgallerypath with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the feedforwardgallerypath
	 * @return the feedforwardgallerypath that was removed
	 * @throws NoSuchfeedforwardgallerypathException if a feedforwardgallerypath with the primary key could not be found
	 */
	@Override
	public feedforwardgallerypath remove(Serializable primaryKey)
		throws NoSuchfeedforwardgallerypathException {
		Session session = null;

		try {
			session = openSession();

			feedforwardgallerypath feedforwardgallerypath = (feedforwardgallerypath)session.get(feedforwardgallerypathImpl.class,
					primaryKey);

			if (feedforwardgallerypath == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchfeedforwardgallerypathException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(feedforwardgallerypath);
		}
		catch (NoSuchfeedforwardgallerypathException nsee) {
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
	protected feedforwardgallerypath removeImpl(
		feedforwardgallerypath feedforwardgallerypath) {
		feedforwardgallerypath = toUnwrappedModel(feedforwardgallerypath);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(feedforwardgallerypath)) {
				feedforwardgallerypath = (feedforwardgallerypath)session.get(feedforwardgallerypathImpl.class,
						feedforwardgallerypath.getPrimaryKeyObj());
			}

			if (feedforwardgallerypath != null) {
				session.delete(feedforwardgallerypath);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (feedforwardgallerypath != null) {
			clearCache(feedforwardgallerypath);
		}

		return feedforwardgallerypath;
	}

	@Override
	public feedforwardgallerypath updateImpl(
		feedforwardgallerypath feedforwardgallerypath) {
		feedforwardgallerypath = toUnwrappedModel(feedforwardgallerypath);

		boolean isNew = feedforwardgallerypath.isNew();

		feedforwardgallerypathModelImpl feedforwardgallerypathModelImpl = (feedforwardgallerypathModelImpl)feedforwardgallerypath;

		Session session = null;

		try {
			session = openSession();

			if (feedforwardgallerypath.isNew()) {
				session.save(feedforwardgallerypath);

				feedforwardgallerypath.setNew(false);
			}
			else {
				feedforwardgallerypath = (feedforwardgallerypath)session.merge(feedforwardgallerypath);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !feedforwardgallerypathModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((feedforwardgallerypathModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUM_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						feedforwardgallerypathModelImpl.getOriginalAlbumId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ALBUM_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUM_ID,
					args);

				args = new Object[] { feedforwardgallerypathModelImpl.getAlbumId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ALBUM_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUM_ID,
					args);
			}

			if ((feedforwardgallerypathModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						feedforwardgallerypathModelImpl.getOriginalContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);

				args = new Object[] {
						feedforwardgallerypathModelImpl.getContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENT_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENT_ID,
					args);
			}
		}

		entityCache.putResult(feedforwardgallerypathModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgallerypathImpl.class,
			feedforwardgallerypath.getPrimaryKey(), feedforwardgallerypath,
			false);

		feedforwardgallerypath.resetOriginalValues();

		return feedforwardgallerypath;
	}

	protected feedforwardgallerypath toUnwrappedModel(
		feedforwardgallerypath feedforwardgallerypath) {
		if (feedforwardgallerypath instanceof feedforwardgallerypathImpl) {
			return feedforwardgallerypath;
		}

		feedforwardgallerypathImpl feedforwardgallerypathImpl = new feedforwardgallerypathImpl();

		feedforwardgallerypathImpl.setNew(feedforwardgallerypath.isNew());
		feedforwardgallerypathImpl.setPrimaryKey(feedforwardgallerypath.getPrimaryKey());

		feedforwardgallerypathImpl.setId(feedforwardgallerypath.getId());
		feedforwardgallerypathImpl.setAlbumId(feedforwardgallerypath.getAlbumId());
		feedforwardgallerypathImpl.setAlbumImagePath(feedforwardgallerypath.getAlbumImagePath());
		feedforwardgallerypathImpl.setImageTitle(feedforwardgallerypath.getImageTitle());
		feedforwardgallerypathImpl.setCreatedDate(feedforwardgallerypath.getCreatedDate());
		feedforwardgallerypathImpl.setCreatedBy(feedforwardgallerypath.getCreatedBy());
		feedforwardgallerypathImpl.setUpdatedDate(feedforwardgallerypath.getUpdatedDate());
		feedforwardgallerypathImpl.setUpdatedBy(feedforwardgallerypath.getUpdatedBy());
		feedforwardgallerypathImpl.setFlag(feedforwardgallerypath.getFlag());
		feedforwardgallerypathImpl.setContent_id(feedforwardgallerypath.getContent_id());

		return feedforwardgallerypathImpl;
	}

	/**
	 * Returns the feedforwardgallerypath with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the feedforwardgallerypath
	 * @return the feedforwardgallerypath
	 * @throws NoSuchfeedforwardgallerypathException if a feedforwardgallerypath with the primary key could not be found
	 */
	@Override
	public feedforwardgallerypath findByPrimaryKey(Serializable primaryKey)
		throws NoSuchfeedforwardgallerypathException {
		feedforwardgallerypath feedforwardgallerypath = fetchByPrimaryKey(primaryKey);

		if (feedforwardgallerypath == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchfeedforwardgallerypathException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return feedforwardgallerypath;
	}

	/**
	 * Returns the feedforwardgallerypath with the primary key or throws a {@link NoSuchfeedforwardgallerypathException} if it could not be found.
	 *
	 * @param id the primary key of the feedforwardgallerypath
	 * @return the feedforwardgallerypath
	 * @throws NoSuchfeedforwardgallerypathException if a feedforwardgallerypath with the primary key could not be found
	 */
	@Override
	public feedforwardgallerypath findByPrimaryKey(long id)
		throws NoSuchfeedforwardgallerypathException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the feedforwardgallerypath with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the feedforwardgallerypath
	 * @return the feedforwardgallerypath, or <code>null</code> if a feedforwardgallerypath with the primary key could not be found
	 */
	@Override
	public feedforwardgallerypath fetchByPrimaryKey(Serializable primaryKey) {
		feedforwardgallerypath feedforwardgallerypath = (feedforwardgallerypath)entityCache.getResult(feedforwardgallerypathModelImpl.ENTITY_CACHE_ENABLED,
				feedforwardgallerypathImpl.class, primaryKey);

		if (feedforwardgallerypath == _nullfeedforwardgallerypath) {
			return null;
		}

		if (feedforwardgallerypath == null) {
			Session session = null;

			try {
				session = openSession();

				feedforwardgallerypath = (feedforwardgallerypath)session.get(feedforwardgallerypathImpl.class,
						primaryKey);

				if (feedforwardgallerypath != null) {
					cacheResult(feedforwardgallerypath);
				}
				else {
					entityCache.putResult(feedforwardgallerypathModelImpl.ENTITY_CACHE_ENABLED,
						feedforwardgallerypathImpl.class, primaryKey,
						_nullfeedforwardgallerypath);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(feedforwardgallerypathModelImpl.ENTITY_CACHE_ENABLED,
					feedforwardgallerypathImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return feedforwardgallerypath;
	}

	/**
	 * Returns the feedforwardgallerypath with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the feedforwardgallerypath
	 * @return the feedforwardgallerypath, or <code>null</code> if a feedforwardgallerypath with the primary key could not be found
	 */
	@Override
	public feedforwardgallerypath fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, feedforwardgallerypath> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, feedforwardgallerypath> map = new HashMap<Serializable, feedforwardgallerypath>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			feedforwardgallerypath feedforwardgallerypath = fetchByPrimaryKey(primaryKey);

			if (feedforwardgallerypath != null) {
				map.put(primaryKey, feedforwardgallerypath);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			feedforwardgallerypath feedforwardgallerypath = (feedforwardgallerypath)entityCache.getResult(feedforwardgallerypathModelImpl.ENTITY_CACHE_ENABLED,
					feedforwardgallerypathImpl.class, primaryKey);

			if (feedforwardgallerypath == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, feedforwardgallerypath);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_FEEDFORWARDGALLERYPATH_WHERE_PKS_IN);

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

			for (feedforwardgallerypath feedforwardgallerypath : (List<feedforwardgallerypath>)q.list()) {
				map.put(feedforwardgallerypath.getPrimaryKeyObj(),
					feedforwardgallerypath);

				cacheResult(feedforwardgallerypath);

				uncachedPrimaryKeys.remove(feedforwardgallerypath.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(feedforwardgallerypathModelImpl.ENTITY_CACHE_ENABLED,
					feedforwardgallerypathImpl.class, primaryKey,
					_nullfeedforwardgallerypath);
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
	 * Returns all the feedforwardgallerypaths.
	 *
	 * @return the feedforwardgallerypaths
	 */
	@Override
	public List<feedforwardgallerypath> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the feedforwardgallerypaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of feedforwardgallerypaths
	 * @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	 * @return the range of feedforwardgallerypaths
	 */
	@Override
	public List<feedforwardgallerypath> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the feedforwardgallerypaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of feedforwardgallerypaths
	 * @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of feedforwardgallerypaths
	 */
	@Override
	public List<feedforwardgallerypath> findAll(int start, int end,
		OrderByComparator<feedforwardgallerypath> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the feedforwardgallerypaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of feedforwardgallerypaths
	 * @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of feedforwardgallerypaths
	 */
	@Override
	public List<feedforwardgallerypath> findAll(int start, int end,
		OrderByComparator<feedforwardgallerypath> orderByComparator,
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

		List<feedforwardgallerypath> list = null;

		if (retrieveFromCache) {
			list = (List<feedforwardgallerypath>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_FEEDFORWARDGALLERYPATH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FEEDFORWARDGALLERYPATH;

				if (pagination) {
					sql = sql.concat(feedforwardgallerypathModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<feedforwardgallerypath>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<feedforwardgallerypath>)QueryUtil.list(q,
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
	 * Removes all the feedforwardgallerypaths from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (feedforwardgallerypath feedforwardgallerypath : findAll()) {
			remove(feedforwardgallerypath);
		}
	}

	/**
	 * Returns the number of feedforwardgallerypaths.
	 *
	 * @return the number of feedforwardgallerypaths
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FEEDFORWARDGALLERYPATH);

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
		return feedforwardgallerypathModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the feedforwardgallerypath persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(feedforwardgallerypathImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_FEEDFORWARDGALLERYPATH = "SELECT feedforwardgallerypath FROM feedforwardgallerypath feedforwardgallerypath";
	private static final String _SQL_SELECT_FEEDFORWARDGALLERYPATH_WHERE_PKS_IN = "SELECT feedforwardgallerypath FROM feedforwardgallerypath feedforwardgallerypath WHERE id_ IN (";
	private static final String _SQL_SELECT_FEEDFORWARDGALLERYPATH_WHERE = "SELECT feedforwardgallerypath FROM feedforwardgallerypath feedforwardgallerypath WHERE ";
	private static final String _SQL_COUNT_FEEDFORWARDGALLERYPATH = "SELECT COUNT(feedforwardgallerypath) FROM feedforwardgallerypath feedforwardgallerypath";
	private static final String _SQL_COUNT_FEEDFORWARDGALLERYPATH_WHERE = "SELECT COUNT(feedforwardgallerypath) FROM feedforwardgallerypath feedforwardgallerypath WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "feedforwardgallerypath.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No feedforwardgallerypath exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No feedforwardgallerypath exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(feedforwardgallerypathPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final feedforwardgallerypath _nullfeedforwardgallerypath = new feedforwardgallerypathImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<feedforwardgallerypath> toCacheModel() {
				return _nullfeedforwardgallerypathCacheModel;
			}
		};

	private static final CacheModel<feedforwardgallerypath> _nullfeedforwardgallerypathCacheModel =
		new CacheModel<feedforwardgallerypath>() {
			@Override
			public feedforwardgallerypath toEntityModel() {
				return _nullfeedforwardgallerypath;
			}
		};
}