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

package com.chola.videogallery.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.videogallery.exception.NoSuchvideogallerypathException;
import com.chola.videogallery.model.impl.videogallerypathImpl;
import com.chola.videogallery.model.impl.videogallerypathModelImpl;
import com.chola.videogallery.model.videogallerypath;
import com.chola.videogallery.service.persistence.videogallerypathPersistence;

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
 * The persistence implementation for the videogallerypath service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see videogallerypathPersistence
 * @see com.chola.videogallery.service.persistence.videogallerypathUtil
 * @generated
 */
@ProviderType
public class videogallerypathPersistenceImpl extends BasePersistenceImpl<videogallerypath>
	implements videogallerypathPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link videogallerypathUtil} to access the videogallerypath persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = videogallerypathImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(videogallerypathModelImpl.ENTITY_CACHE_ENABLED,
			videogallerypathModelImpl.FINDER_CACHE_ENABLED,
			videogallerypathImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(videogallerypathModelImpl.ENTITY_CACHE_ENABLED,
			videogallerypathModelImpl.FINDER_CACHE_ENABLED,
			videogallerypathImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(videogallerypathModelImpl.ENTITY_CACHE_ENABLED,
			videogallerypathModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ALBUMID = new FinderPath(videogallerypathModelImpl.ENTITY_CACHE_ENABLED,
			videogallerypathModelImpl.FINDER_CACHE_ENABLED,
			videogallerypathImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByALBUMID",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUMID =
		new FinderPath(videogallerypathModelImpl.ENTITY_CACHE_ENABLED,
			videogallerypathModelImpl.FINDER_CACHE_ENABLED,
			videogallerypathImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByALBUMID",
			new String[] { String.class.getName() },
			videogallerypathModelImpl.ALBUMID_COLUMN_BITMASK |
			videogallerypathModelImpl.CREATEDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ALBUMID = new FinderPath(videogallerypathModelImpl.ENTITY_CACHE_ENABLED,
			videogallerypathModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByALBUMID",
			new String[] { String.class.getName() });

	/**
	 * Returns all the videogallerypaths where albumId = &#63;.
	 *
	 * @param albumId the album ID
	 * @return the matching videogallerypaths
	 */
	@Override
	public List<videogallerypath> findByALBUMID(String albumId) {
		return findByALBUMID(albumId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the videogallerypaths where albumId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param albumId the album ID
	 * @param start the lower bound of the range of videogallerypaths
	 * @param end the upper bound of the range of videogallerypaths (not inclusive)
	 * @return the range of matching videogallerypaths
	 */
	@Override
	public List<videogallerypath> findByALBUMID(String albumId, int start,
		int end) {
		return findByALBUMID(albumId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the videogallerypaths where albumId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param albumId the album ID
	 * @param start the lower bound of the range of videogallerypaths
	 * @param end the upper bound of the range of videogallerypaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching videogallerypaths
	 */
	@Override
	public List<videogallerypath> findByALBUMID(String albumId, int start,
		int end, OrderByComparator<videogallerypath> orderByComparator) {
		return findByALBUMID(albumId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the videogallerypaths where albumId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param albumId the album ID
	 * @param start the lower bound of the range of videogallerypaths
	 * @param end the upper bound of the range of videogallerypaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching videogallerypaths
	 */
	@Override
	public List<videogallerypath> findByALBUMID(String albumId, int start,
		int end, OrderByComparator<videogallerypath> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUMID;
			finderArgs = new Object[] { albumId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ALBUMID;
			finderArgs = new Object[] { albumId, start, end, orderByComparator };
		}

		List<videogallerypath> list = null;

		if (retrieveFromCache) {
			list = (List<videogallerypath>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (videogallerypath videogallerypath : list) {
					if (!Objects.equals(albumId, videogallerypath.getAlbumId())) {
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

			query.append(_SQL_SELECT_VIDEOGALLERYPATH_WHERE);

			boolean bindAlbumId = false;

			if (albumId == null) {
				query.append(_FINDER_COLUMN_ALBUMID_ALBUMID_1);
			}
			else if (albumId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ALBUMID_ALBUMID_3);
			}
			else {
				bindAlbumId = true;

				query.append(_FINDER_COLUMN_ALBUMID_ALBUMID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(videogallerypathModelImpl.ORDER_BY_JPQL);
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
					list = (List<videogallerypath>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<videogallerypath>)QueryUtil.list(q,
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
	 * Returns the first videogallerypath in the ordered set where albumId = &#63;.
	 *
	 * @param albumId the album ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching videogallerypath
	 * @throws NoSuchvideogallerypathException if a matching videogallerypath could not be found
	 */
	@Override
	public videogallerypath findByALBUMID_First(String albumId,
		OrderByComparator<videogallerypath> orderByComparator)
		throws NoSuchvideogallerypathException {
		videogallerypath videogallerypath = fetchByALBUMID_First(albumId,
				orderByComparator);

		if (videogallerypath != null) {
			return videogallerypath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("albumId=");
		msg.append(albumId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvideogallerypathException(msg.toString());
	}

	/**
	 * Returns the first videogallerypath in the ordered set where albumId = &#63;.
	 *
	 * @param albumId the album ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching videogallerypath, or <code>null</code> if a matching videogallerypath could not be found
	 */
	@Override
	public videogallerypath fetchByALBUMID_First(String albumId,
		OrderByComparator<videogallerypath> orderByComparator) {
		List<videogallerypath> list = findByALBUMID(albumId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last videogallerypath in the ordered set where albumId = &#63;.
	 *
	 * @param albumId the album ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching videogallerypath
	 * @throws NoSuchvideogallerypathException if a matching videogallerypath could not be found
	 */
	@Override
	public videogallerypath findByALBUMID_Last(String albumId,
		OrderByComparator<videogallerypath> orderByComparator)
		throws NoSuchvideogallerypathException {
		videogallerypath videogallerypath = fetchByALBUMID_Last(albumId,
				orderByComparator);

		if (videogallerypath != null) {
			return videogallerypath;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("albumId=");
		msg.append(albumId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchvideogallerypathException(msg.toString());
	}

	/**
	 * Returns the last videogallerypath in the ordered set where albumId = &#63;.
	 *
	 * @param albumId the album ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching videogallerypath, or <code>null</code> if a matching videogallerypath could not be found
	 */
	@Override
	public videogallerypath fetchByALBUMID_Last(String albumId,
		OrderByComparator<videogallerypath> orderByComparator) {
		int count = countByALBUMID(albumId);

		if (count == 0) {
			return null;
		}

		List<videogallerypath> list = findByALBUMID(albumId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the videogallerypaths before and after the current videogallerypath in the ordered set where albumId = &#63;.
	 *
	 * @param id the primary key of the current videogallerypath
	 * @param albumId the album ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next videogallerypath
	 * @throws NoSuchvideogallerypathException if a videogallerypath with the primary key could not be found
	 */
	@Override
	public videogallerypath[] findByALBUMID_PrevAndNext(long id,
		String albumId, OrderByComparator<videogallerypath> orderByComparator)
		throws NoSuchvideogallerypathException {
		videogallerypath videogallerypath = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			videogallerypath[] array = new videogallerypathImpl[3];

			array[0] = getByALBUMID_PrevAndNext(session, videogallerypath,
					albumId, orderByComparator, true);

			array[1] = videogallerypath;

			array[2] = getByALBUMID_PrevAndNext(session, videogallerypath,
					albumId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected videogallerypath getByALBUMID_PrevAndNext(Session session,
		videogallerypath videogallerypath, String albumId,
		OrderByComparator<videogallerypath> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_VIDEOGALLERYPATH_WHERE);

		boolean bindAlbumId = false;

		if (albumId == null) {
			query.append(_FINDER_COLUMN_ALBUMID_ALBUMID_1);
		}
		else if (albumId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ALBUMID_ALBUMID_3);
		}
		else {
			bindAlbumId = true;

			query.append(_FINDER_COLUMN_ALBUMID_ALBUMID_2);
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
			query.append(videogallerypathModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(videogallerypath);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<videogallerypath> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the videogallerypaths where albumId = &#63; from the database.
	 *
	 * @param albumId the album ID
	 */
	@Override
	public void removeByALBUMID(String albumId) {
		for (videogallerypath videogallerypath : findByALBUMID(albumId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(videogallerypath);
		}
	}

	/**
	 * Returns the number of videogallerypaths where albumId = &#63;.
	 *
	 * @param albumId the album ID
	 * @return the number of matching videogallerypaths
	 */
	@Override
	public int countByALBUMID(String albumId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ALBUMID;

		Object[] finderArgs = new Object[] { albumId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_VIDEOGALLERYPATH_WHERE);

			boolean bindAlbumId = false;

			if (albumId == null) {
				query.append(_FINDER_COLUMN_ALBUMID_ALBUMID_1);
			}
			else if (albumId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ALBUMID_ALBUMID_3);
			}
			else {
				bindAlbumId = true;

				query.append(_FINDER_COLUMN_ALBUMID_ALBUMID_2);
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

	private static final String _FINDER_COLUMN_ALBUMID_ALBUMID_1 = "videogallerypath.albumId IS NULL";
	private static final String _FINDER_COLUMN_ALBUMID_ALBUMID_2 = "videogallerypath.albumId = ?";
	private static final String _FINDER_COLUMN_ALBUMID_ALBUMID_3 = "(videogallerypath.albumId IS NULL OR videogallerypath.albumId = '')";

	public videogallerypathPersistenceImpl() {
		setModelClass(videogallerypath.class);
	}

	/**
	 * Caches the videogallerypath in the entity cache if it is enabled.
	 *
	 * @param videogallerypath the videogallerypath
	 */
	@Override
	public void cacheResult(videogallerypath videogallerypath) {
		entityCache.putResult(videogallerypathModelImpl.ENTITY_CACHE_ENABLED,
			videogallerypathImpl.class, videogallerypath.getPrimaryKey(),
			videogallerypath);

		videogallerypath.resetOriginalValues();
	}

	/**
	 * Caches the videogallerypaths in the entity cache if it is enabled.
	 *
	 * @param videogallerypaths the videogallerypaths
	 */
	@Override
	public void cacheResult(List<videogallerypath> videogallerypaths) {
		for (videogallerypath videogallerypath : videogallerypaths) {
			if (entityCache.getResult(
						videogallerypathModelImpl.ENTITY_CACHE_ENABLED,
						videogallerypathImpl.class,
						videogallerypath.getPrimaryKey()) == null) {
				cacheResult(videogallerypath);
			}
			else {
				videogallerypath.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all videogallerypaths.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(videogallerypathImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the videogallerypath.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(videogallerypath videogallerypath) {
		entityCache.removeResult(videogallerypathModelImpl.ENTITY_CACHE_ENABLED,
			videogallerypathImpl.class, videogallerypath.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<videogallerypath> videogallerypaths) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (videogallerypath videogallerypath : videogallerypaths) {
			entityCache.removeResult(videogallerypathModelImpl.ENTITY_CACHE_ENABLED,
				videogallerypathImpl.class, videogallerypath.getPrimaryKey());
		}
	}

	/**
	 * Creates a new videogallerypath with the primary key. Does not add the videogallerypath to the database.
	 *
	 * @param id the primary key for the new videogallerypath
	 * @return the new videogallerypath
	 */
	@Override
	public videogallerypath create(long id) {
		videogallerypath videogallerypath = new videogallerypathImpl();

		videogallerypath.setNew(true);
		videogallerypath.setPrimaryKey(id);

		return videogallerypath;
	}

	/**
	 * Removes the videogallerypath with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the videogallerypath
	 * @return the videogallerypath that was removed
	 * @throws NoSuchvideogallerypathException if a videogallerypath with the primary key could not be found
	 */
	@Override
	public videogallerypath remove(long id)
		throws NoSuchvideogallerypathException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the videogallerypath with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the videogallerypath
	 * @return the videogallerypath that was removed
	 * @throws NoSuchvideogallerypathException if a videogallerypath with the primary key could not be found
	 */
	@Override
	public videogallerypath remove(Serializable primaryKey)
		throws NoSuchvideogallerypathException {
		Session session = null;

		try {
			session = openSession();

			videogallerypath videogallerypath = (videogallerypath)session.get(videogallerypathImpl.class,
					primaryKey);

			if (videogallerypath == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchvideogallerypathException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(videogallerypath);
		}
		catch (NoSuchvideogallerypathException nsee) {
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
	protected videogallerypath removeImpl(videogallerypath videogallerypath) {
		videogallerypath = toUnwrappedModel(videogallerypath);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(videogallerypath)) {
				videogallerypath = (videogallerypath)session.get(videogallerypathImpl.class,
						videogallerypath.getPrimaryKeyObj());
			}

			if (videogallerypath != null) {
				session.delete(videogallerypath);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (videogallerypath != null) {
			clearCache(videogallerypath);
		}

		return videogallerypath;
	}

	@Override
	public videogallerypath updateImpl(videogallerypath videogallerypath) {
		videogallerypath = toUnwrappedModel(videogallerypath);

		boolean isNew = videogallerypath.isNew();

		videogallerypathModelImpl videogallerypathModelImpl = (videogallerypathModelImpl)videogallerypath;

		Session session = null;

		try {
			session = openSession();

			if (videogallerypath.isNew()) {
				session.save(videogallerypath);

				videogallerypath.setNew(false);
			}
			else {
				videogallerypath = (videogallerypath)session.merge(videogallerypath);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !videogallerypathModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((videogallerypathModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUMID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						videogallerypathModelImpl.getOriginalAlbumId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ALBUMID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUMID,
					args);

				args = new Object[] { videogallerypathModelImpl.getAlbumId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ALBUMID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUMID,
					args);
			}
		}

		entityCache.putResult(videogallerypathModelImpl.ENTITY_CACHE_ENABLED,
			videogallerypathImpl.class, videogallerypath.getPrimaryKey(),
			videogallerypath, false);

		videogallerypath.resetOriginalValues();

		return videogallerypath;
	}

	protected videogallerypath toUnwrappedModel(
		videogallerypath videogallerypath) {
		if (videogallerypath instanceof videogallerypathImpl) {
			return videogallerypath;
		}

		videogallerypathImpl videogallerypathImpl = new videogallerypathImpl();

		videogallerypathImpl.setNew(videogallerypath.isNew());
		videogallerypathImpl.setPrimaryKey(videogallerypath.getPrimaryKey());

		videogallerypathImpl.setId(videogallerypath.getId());
		videogallerypathImpl.setAlbumId(videogallerypath.getAlbumId());
		videogallerypathImpl.setContent_id(videogallerypath.getContent_id());
		videogallerypathImpl.setAlbumVideoPath(videogallerypath.getAlbumVideoPath());
		videogallerypathImpl.setCreatedDate(videogallerypath.getCreatedDate());
		videogallerypathImpl.setCreatedBy(videogallerypath.getCreatedBy());
		videogallerypathImpl.setUpdatedDate(videogallerypath.getUpdatedDate());
		videogallerypathImpl.setUpdatedBy(videogallerypath.getUpdatedBy());
		videogallerypathImpl.setFlag(videogallerypath.getFlag());

		return videogallerypathImpl;
	}

	/**
	 * Returns the videogallerypath with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the videogallerypath
	 * @return the videogallerypath
	 * @throws NoSuchvideogallerypathException if a videogallerypath with the primary key could not be found
	 */
	@Override
	public videogallerypath findByPrimaryKey(Serializable primaryKey)
		throws NoSuchvideogallerypathException {
		videogallerypath videogallerypath = fetchByPrimaryKey(primaryKey);

		if (videogallerypath == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchvideogallerypathException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return videogallerypath;
	}

	/**
	 * Returns the videogallerypath with the primary key or throws a {@link NoSuchvideogallerypathException} if it could not be found.
	 *
	 * @param id the primary key of the videogallerypath
	 * @return the videogallerypath
	 * @throws NoSuchvideogallerypathException if a videogallerypath with the primary key could not be found
	 */
	@Override
	public videogallerypath findByPrimaryKey(long id)
		throws NoSuchvideogallerypathException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the videogallerypath with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the videogallerypath
	 * @return the videogallerypath, or <code>null</code> if a videogallerypath with the primary key could not be found
	 */
	@Override
	public videogallerypath fetchByPrimaryKey(Serializable primaryKey) {
		videogallerypath videogallerypath = (videogallerypath)entityCache.getResult(videogallerypathModelImpl.ENTITY_CACHE_ENABLED,
				videogallerypathImpl.class, primaryKey);

		if (videogallerypath == _nullvideogallerypath) {
			return null;
		}

		if (videogallerypath == null) {
			Session session = null;

			try {
				session = openSession();

				videogallerypath = (videogallerypath)session.get(videogallerypathImpl.class,
						primaryKey);

				if (videogallerypath != null) {
					cacheResult(videogallerypath);
				}
				else {
					entityCache.putResult(videogallerypathModelImpl.ENTITY_CACHE_ENABLED,
						videogallerypathImpl.class, primaryKey,
						_nullvideogallerypath);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(videogallerypathModelImpl.ENTITY_CACHE_ENABLED,
					videogallerypathImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return videogallerypath;
	}

	/**
	 * Returns the videogallerypath with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the videogallerypath
	 * @return the videogallerypath, or <code>null</code> if a videogallerypath with the primary key could not be found
	 */
	@Override
	public videogallerypath fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, videogallerypath> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, videogallerypath> map = new HashMap<Serializable, videogallerypath>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			videogallerypath videogallerypath = fetchByPrimaryKey(primaryKey);

			if (videogallerypath != null) {
				map.put(primaryKey, videogallerypath);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			videogallerypath videogallerypath = (videogallerypath)entityCache.getResult(videogallerypathModelImpl.ENTITY_CACHE_ENABLED,
					videogallerypathImpl.class, primaryKey);

			if (videogallerypath == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, videogallerypath);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VIDEOGALLERYPATH_WHERE_PKS_IN);

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

			for (videogallerypath videogallerypath : (List<videogallerypath>)q.list()) {
				map.put(videogallerypath.getPrimaryKeyObj(), videogallerypath);

				cacheResult(videogallerypath);

				uncachedPrimaryKeys.remove(videogallerypath.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(videogallerypathModelImpl.ENTITY_CACHE_ENABLED,
					videogallerypathImpl.class, primaryKey,
					_nullvideogallerypath);
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
	 * Returns all the videogallerypaths.
	 *
	 * @return the videogallerypaths
	 */
	@Override
	public List<videogallerypath> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the videogallerypaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of videogallerypaths
	 * @param end the upper bound of the range of videogallerypaths (not inclusive)
	 * @return the range of videogallerypaths
	 */
	@Override
	public List<videogallerypath> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the videogallerypaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of videogallerypaths
	 * @param end the upper bound of the range of videogallerypaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of videogallerypaths
	 */
	@Override
	public List<videogallerypath> findAll(int start, int end,
		OrderByComparator<videogallerypath> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the videogallerypaths.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of videogallerypaths
	 * @param end the upper bound of the range of videogallerypaths (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of videogallerypaths
	 */
	@Override
	public List<videogallerypath> findAll(int start, int end,
		OrderByComparator<videogallerypath> orderByComparator,
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

		List<videogallerypath> list = null;

		if (retrieveFromCache) {
			list = (List<videogallerypath>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VIDEOGALLERYPATH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VIDEOGALLERYPATH;

				if (pagination) {
					sql = sql.concat(videogallerypathModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<videogallerypath>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<videogallerypath>)QueryUtil.list(q,
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
	 * Removes all the videogallerypaths from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (videogallerypath videogallerypath : findAll()) {
			remove(videogallerypath);
		}
	}

	/**
	 * Returns the number of videogallerypaths.
	 *
	 * @return the number of videogallerypaths
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VIDEOGALLERYPATH);

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
		return videogallerypathModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the videogallerypath persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(videogallerypathImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_VIDEOGALLERYPATH = "SELECT videogallerypath FROM videogallerypath videogallerypath";
	private static final String _SQL_SELECT_VIDEOGALLERYPATH_WHERE_PKS_IN = "SELECT videogallerypath FROM videogallerypath videogallerypath WHERE id_ IN (";
	private static final String _SQL_SELECT_VIDEOGALLERYPATH_WHERE = "SELECT videogallerypath FROM videogallerypath videogallerypath WHERE ";
	private static final String _SQL_COUNT_VIDEOGALLERYPATH = "SELECT COUNT(videogallerypath) FROM videogallerypath videogallerypath";
	private static final String _SQL_COUNT_VIDEOGALLERYPATH_WHERE = "SELECT COUNT(videogallerypath) FROM videogallerypath videogallerypath WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "videogallerypath.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No videogallerypath exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No videogallerypath exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(videogallerypathPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final videogallerypath _nullvideogallerypath = new videogallerypathImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<videogallerypath> toCacheModel() {
				return _nullvideogallerypathCacheModel;
			}
		};

	private static final CacheModel<videogallerypath> _nullvideogallerypathCacheModel =
		new CacheModel<videogallerypath>() {
			@Override
			public videogallerypath toEntityModel() {
				return _nullvideogallerypath;
			}
		};
}