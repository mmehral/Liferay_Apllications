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

import com.chola.shutterspeed.exception.NoSuchshutterspeedgalleryusersException;
import com.chola.shutterspeed.model.impl.shutterspeedgalleryusersImpl;
import com.chola.shutterspeed.model.impl.shutterspeedgalleryusersModelImpl;
import com.chola.shutterspeed.model.shutterspeedgalleryusers;
import com.chola.shutterspeed.service.persistence.shutterspeedgalleryusersPersistence;

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
 * The persistence implementation for the shutterspeedgalleryusers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see shutterspeedgalleryusersPersistence
 * @see com.chola.shutterspeed.service.persistence.shutterspeedgalleryusersUtil
 * @generated
 */
@ProviderType
public class shutterspeedgalleryusersPersistenceImpl extends BasePersistenceImpl<shutterspeedgalleryusers>
	implements shutterspeedgalleryusersPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link shutterspeedgalleryusersUtil} to access the shutterspeedgalleryusers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = shutterspeedgalleryusersImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(shutterspeedgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgalleryusersModelImpl.FINDER_CACHE_ENABLED,
			shutterspeedgalleryusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(shutterspeedgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgalleryusersModelImpl.FINDER_CACHE_ENABLED,
			shutterspeedgalleryusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(shutterspeedgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgalleryusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ALBUM_ID = new FinderPath(shutterspeedgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgalleryusersModelImpl.FINDER_CACHE_ENABLED,
			shutterspeedgalleryusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByALBUM_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUM_ID =
		new FinderPath(shutterspeedgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgalleryusersModelImpl.FINDER_CACHE_ENABLED,
			shutterspeedgalleryusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByALBUM_ID",
			new String[] { Long.class.getName() },
			shutterspeedgalleryusersModelImpl.ALBUM_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ALBUM_ID = new FinderPath(shutterspeedgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgalleryusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByALBUM_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the shutterspeedgalleryuserses where album_id = &#63;.
	 *
	 * @param album_id the album_id
	 * @return the matching shutterspeedgalleryuserses
	 */
	@Override
	public List<shutterspeedgalleryusers> findByALBUM_ID(long album_id) {
		return findByALBUM_ID(album_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the shutterspeedgalleryuserses where album_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param album_id the album_id
	 * @param start the lower bound of the range of shutterspeedgalleryuserses
	 * @param end the upper bound of the range of shutterspeedgalleryuserses (not inclusive)
	 * @return the range of matching shutterspeedgalleryuserses
	 */
	@Override
	public List<shutterspeedgalleryusers> findByALBUM_ID(long album_id,
		int start, int end) {
		return findByALBUM_ID(album_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the shutterspeedgalleryuserses where album_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param album_id the album_id
	 * @param start the lower bound of the range of shutterspeedgalleryuserses
	 * @param end the upper bound of the range of shutterspeedgalleryuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching shutterspeedgalleryuserses
	 */
	@Override
	public List<shutterspeedgalleryusers> findByALBUM_ID(long album_id,
		int start, int end,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator) {
		return findByALBUM_ID(album_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the shutterspeedgalleryuserses where album_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param album_id the album_id
	 * @param start the lower bound of the range of shutterspeedgalleryuserses
	 * @param end the upper bound of the range of shutterspeedgalleryuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching shutterspeedgalleryuserses
	 */
	@Override
	public List<shutterspeedgalleryusers> findByALBUM_ID(long album_id,
		int start, int end,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUM_ID;
			finderArgs = new Object[] { album_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ALBUM_ID;
			finderArgs = new Object[] { album_id, start, end, orderByComparator };
		}

		List<shutterspeedgalleryusers> list = null;

		if (retrieveFromCache) {
			list = (List<shutterspeedgalleryusers>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (shutterspeedgalleryusers shutterspeedgalleryusers : list) {
					if ((album_id != shutterspeedgalleryusers.getAlbum_id())) {
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

			query.append(_SQL_SELECT_SHUTTERSPEEDGALLERYUSERS_WHERE);

			query.append(_FINDER_COLUMN_ALBUM_ID_ALBUM_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(shutterspeedgalleryusersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(album_id);

				if (!pagination) {
					list = (List<shutterspeedgalleryusers>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<shutterspeedgalleryusers>)QueryUtil.list(q,
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
	 * Returns the first shutterspeedgalleryusers in the ordered set where album_id = &#63;.
	 *
	 * @param album_id the album_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shutterspeedgalleryusers
	 * @throws NoSuchshutterspeedgalleryusersException if a matching shutterspeedgalleryusers could not be found
	 */
	@Override
	public shutterspeedgalleryusers findByALBUM_ID_First(long album_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator)
		throws NoSuchshutterspeedgalleryusersException {
		shutterspeedgalleryusers shutterspeedgalleryusers = fetchByALBUM_ID_First(album_id,
				orderByComparator);

		if (shutterspeedgalleryusers != null) {
			return shutterspeedgalleryusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("album_id=");
		msg.append(album_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchshutterspeedgalleryusersException(msg.toString());
	}

	/**
	 * Returns the first shutterspeedgalleryusers in the ordered set where album_id = &#63;.
	 *
	 * @param album_id the album_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shutterspeedgalleryusers, or <code>null</code> if a matching shutterspeedgalleryusers could not be found
	 */
	@Override
	public shutterspeedgalleryusers fetchByALBUM_ID_First(long album_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator) {
		List<shutterspeedgalleryusers> list = findByALBUM_ID(album_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last shutterspeedgalleryusers in the ordered set where album_id = &#63;.
	 *
	 * @param album_id the album_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shutterspeedgalleryusers
	 * @throws NoSuchshutterspeedgalleryusersException if a matching shutterspeedgalleryusers could not be found
	 */
	@Override
	public shutterspeedgalleryusers findByALBUM_ID_Last(long album_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator)
		throws NoSuchshutterspeedgalleryusersException {
		shutterspeedgalleryusers shutterspeedgalleryusers = fetchByALBUM_ID_Last(album_id,
				orderByComparator);

		if (shutterspeedgalleryusers != null) {
			return shutterspeedgalleryusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("album_id=");
		msg.append(album_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchshutterspeedgalleryusersException(msg.toString());
	}

	/**
	 * Returns the last shutterspeedgalleryusers in the ordered set where album_id = &#63;.
	 *
	 * @param album_id the album_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shutterspeedgalleryusers, or <code>null</code> if a matching shutterspeedgalleryusers could not be found
	 */
	@Override
	public shutterspeedgalleryusers fetchByALBUM_ID_Last(long album_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator) {
		int count = countByALBUM_ID(album_id);

		if (count == 0) {
			return null;
		}

		List<shutterspeedgalleryusers> list = findByALBUM_ID(album_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the shutterspeedgalleryuserses before and after the current shutterspeedgalleryusers in the ordered set where album_id = &#63;.
	 *
	 * @param id the primary key of the current shutterspeedgalleryusers
	 * @param album_id the album_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next shutterspeedgalleryusers
	 * @throws NoSuchshutterspeedgalleryusersException if a shutterspeedgalleryusers with the primary key could not be found
	 */
	@Override
	public shutterspeedgalleryusers[] findByALBUM_ID_PrevAndNext(long id,
		long album_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator)
		throws NoSuchshutterspeedgalleryusersException {
		shutterspeedgalleryusers shutterspeedgalleryusers = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			shutterspeedgalleryusers[] array = new shutterspeedgalleryusersImpl[3];

			array[0] = getByALBUM_ID_PrevAndNext(session,
					shutterspeedgalleryusers, album_id, orderByComparator, true);

			array[1] = shutterspeedgalleryusers;

			array[2] = getByALBUM_ID_PrevAndNext(session,
					shutterspeedgalleryusers, album_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected shutterspeedgalleryusers getByALBUM_ID_PrevAndNext(
		Session session, shutterspeedgalleryusers shutterspeedgalleryusers,
		long album_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator,
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

		query.append(_SQL_SELECT_SHUTTERSPEEDGALLERYUSERS_WHERE);

		query.append(_FINDER_COLUMN_ALBUM_ID_ALBUM_ID_2);

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
			query.append(shutterspeedgalleryusersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(album_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(shutterspeedgalleryusers);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<shutterspeedgalleryusers> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the shutterspeedgalleryuserses where album_id = &#63; from the database.
	 *
	 * @param album_id the album_id
	 */
	@Override
	public void removeByALBUM_ID(long album_id) {
		for (shutterspeedgalleryusers shutterspeedgalleryusers : findByALBUM_ID(
				album_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(shutterspeedgalleryusers);
		}
	}

	/**
	 * Returns the number of shutterspeedgalleryuserses where album_id = &#63;.
	 *
	 * @param album_id the album_id
	 * @return the number of matching shutterspeedgalleryuserses
	 */
	@Override
	public int countByALBUM_ID(long album_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ALBUM_ID;

		Object[] finderArgs = new Object[] { album_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SHUTTERSPEEDGALLERYUSERS_WHERE);

			query.append(_FINDER_COLUMN_ALBUM_ID_ALBUM_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(album_id);

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

	private static final String _FINDER_COLUMN_ALBUM_ID_ALBUM_ID_2 = "shutterspeedgalleryusers.album_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USER_ID = new FinderPath(shutterspeedgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgalleryusersModelImpl.FINDER_CACHE_ENABLED,
			shutterspeedgalleryusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUSER_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID =
		new FinderPath(shutterspeedgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgalleryusersModelImpl.FINDER_CACHE_ENABLED,
			shutterspeedgalleryusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUSER_ID",
			new String[] { Long.class.getName() },
			shutterspeedgalleryusersModelImpl.USER_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USER_ID = new FinderPath(shutterspeedgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgalleryusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUSER_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the shutterspeedgalleryuserses where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @return the matching shutterspeedgalleryuserses
	 */
	@Override
	public List<shutterspeedgalleryusers> findByUSER_ID(long user_id) {
		return findByUSER_ID(user_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the shutterspeedgalleryuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of shutterspeedgalleryuserses
	 * @param end the upper bound of the range of shutterspeedgalleryuserses (not inclusive)
	 * @return the range of matching shutterspeedgalleryuserses
	 */
	@Override
	public List<shutterspeedgalleryusers> findByUSER_ID(long user_id,
		int start, int end) {
		return findByUSER_ID(user_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the shutterspeedgalleryuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of shutterspeedgalleryuserses
	 * @param end the upper bound of the range of shutterspeedgalleryuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching shutterspeedgalleryuserses
	 */
	@Override
	public List<shutterspeedgalleryusers> findByUSER_ID(long user_id,
		int start, int end,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator) {
		return findByUSER_ID(user_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the shutterspeedgalleryuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of shutterspeedgalleryuserses
	 * @param end the upper bound of the range of shutterspeedgalleryuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching shutterspeedgalleryuserses
	 */
	@Override
	public List<shutterspeedgalleryusers> findByUSER_ID(long user_id,
		int start, int end,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator,
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

		List<shutterspeedgalleryusers> list = null;

		if (retrieveFromCache) {
			list = (List<shutterspeedgalleryusers>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (shutterspeedgalleryusers shutterspeedgalleryusers : list) {
					if ((user_id != shutterspeedgalleryusers.getUser_id())) {
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

			query.append(_SQL_SELECT_SHUTTERSPEEDGALLERYUSERS_WHERE);

			query.append(_FINDER_COLUMN_USER_ID_USER_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(shutterspeedgalleryusersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(user_id);

				if (!pagination) {
					list = (List<shutterspeedgalleryusers>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<shutterspeedgalleryusers>)QueryUtil.list(q,
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
	 * Returns the first shutterspeedgalleryusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shutterspeedgalleryusers
	 * @throws NoSuchshutterspeedgalleryusersException if a matching shutterspeedgalleryusers could not be found
	 */
	@Override
	public shutterspeedgalleryusers findByUSER_ID_First(long user_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator)
		throws NoSuchshutterspeedgalleryusersException {
		shutterspeedgalleryusers shutterspeedgalleryusers = fetchByUSER_ID_First(user_id,
				orderByComparator);

		if (shutterspeedgalleryusers != null) {
			return shutterspeedgalleryusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("user_id=");
		msg.append(user_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchshutterspeedgalleryusersException(msg.toString());
	}

	/**
	 * Returns the first shutterspeedgalleryusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching shutterspeedgalleryusers, or <code>null</code> if a matching shutterspeedgalleryusers could not be found
	 */
	@Override
	public shutterspeedgalleryusers fetchByUSER_ID_First(long user_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator) {
		List<shutterspeedgalleryusers> list = findByUSER_ID(user_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last shutterspeedgalleryusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shutterspeedgalleryusers
	 * @throws NoSuchshutterspeedgalleryusersException if a matching shutterspeedgalleryusers could not be found
	 */
	@Override
	public shutterspeedgalleryusers findByUSER_ID_Last(long user_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator)
		throws NoSuchshutterspeedgalleryusersException {
		shutterspeedgalleryusers shutterspeedgalleryusers = fetchByUSER_ID_Last(user_id,
				orderByComparator);

		if (shutterspeedgalleryusers != null) {
			return shutterspeedgalleryusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("user_id=");
		msg.append(user_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchshutterspeedgalleryusersException(msg.toString());
	}

	/**
	 * Returns the last shutterspeedgalleryusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching shutterspeedgalleryusers, or <code>null</code> if a matching shutterspeedgalleryusers could not be found
	 */
	@Override
	public shutterspeedgalleryusers fetchByUSER_ID_Last(long user_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator) {
		int count = countByUSER_ID(user_id);

		if (count == 0) {
			return null;
		}

		List<shutterspeedgalleryusers> list = findByUSER_ID(user_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the shutterspeedgalleryuserses before and after the current shutterspeedgalleryusers in the ordered set where user_id = &#63;.
	 *
	 * @param id the primary key of the current shutterspeedgalleryusers
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next shutterspeedgalleryusers
	 * @throws NoSuchshutterspeedgalleryusersException if a shutterspeedgalleryusers with the primary key could not be found
	 */
	@Override
	public shutterspeedgalleryusers[] findByUSER_ID_PrevAndNext(long id,
		long user_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator)
		throws NoSuchshutterspeedgalleryusersException {
		shutterspeedgalleryusers shutterspeedgalleryusers = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			shutterspeedgalleryusers[] array = new shutterspeedgalleryusersImpl[3];

			array[0] = getByUSER_ID_PrevAndNext(session,
					shutterspeedgalleryusers, user_id, orderByComparator, true);

			array[1] = shutterspeedgalleryusers;

			array[2] = getByUSER_ID_PrevAndNext(session,
					shutterspeedgalleryusers, user_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected shutterspeedgalleryusers getByUSER_ID_PrevAndNext(
		Session session, shutterspeedgalleryusers shutterspeedgalleryusers,
		long user_id,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator,
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

		query.append(_SQL_SELECT_SHUTTERSPEEDGALLERYUSERS_WHERE);

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
			query.append(shutterspeedgalleryusersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(user_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(shutterspeedgalleryusers);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<shutterspeedgalleryusers> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the shutterspeedgalleryuserses where user_id = &#63; from the database.
	 *
	 * @param user_id the user_id
	 */
	@Override
	public void removeByUSER_ID(long user_id) {
		for (shutterspeedgalleryusers shutterspeedgalleryusers : findByUSER_ID(
				user_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(shutterspeedgalleryusers);
		}
	}

	/**
	 * Returns the number of shutterspeedgalleryuserses where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @return the number of matching shutterspeedgalleryuserses
	 */
	@Override
	public int countByUSER_ID(long user_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USER_ID;

		Object[] finderArgs = new Object[] { user_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SHUTTERSPEEDGALLERYUSERS_WHERE);

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

	private static final String _FINDER_COLUMN_USER_ID_USER_ID_2 = "shutterspeedgalleryusers.user_id = ?";

	public shutterspeedgalleryusersPersistenceImpl() {
		setModelClass(shutterspeedgalleryusers.class);
	}

	/**
	 * Caches the shutterspeedgalleryusers in the entity cache if it is enabled.
	 *
	 * @param shutterspeedgalleryusers the shutterspeedgalleryusers
	 */
	@Override
	public void cacheResult(shutterspeedgalleryusers shutterspeedgalleryusers) {
		entityCache.putResult(shutterspeedgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgalleryusersImpl.class,
			shutterspeedgalleryusers.getPrimaryKey(), shutterspeedgalleryusers);

		shutterspeedgalleryusers.resetOriginalValues();
	}

	/**
	 * Caches the shutterspeedgalleryuserses in the entity cache if it is enabled.
	 *
	 * @param shutterspeedgalleryuserses the shutterspeedgalleryuserses
	 */
	@Override
	public void cacheResult(
		List<shutterspeedgalleryusers> shutterspeedgalleryuserses) {
		for (shutterspeedgalleryusers shutterspeedgalleryusers : shutterspeedgalleryuserses) {
			if (entityCache.getResult(
						shutterspeedgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
						shutterspeedgalleryusersImpl.class,
						shutterspeedgalleryusers.getPrimaryKey()) == null) {
				cacheResult(shutterspeedgalleryusers);
			}
			else {
				shutterspeedgalleryusers.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all shutterspeedgalleryuserses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(shutterspeedgalleryusersImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the shutterspeedgalleryusers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(shutterspeedgalleryusers shutterspeedgalleryusers) {
		entityCache.removeResult(shutterspeedgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgalleryusersImpl.class,
			shutterspeedgalleryusers.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<shutterspeedgalleryusers> shutterspeedgalleryuserses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (shutterspeedgalleryusers shutterspeedgalleryusers : shutterspeedgalleryuserses) {
			entityCache.removeResult(shutterspeedgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
				shutterspeedgalleryusersImpl.class,
				shutterspeedgalleryusers.getPrimaryKey());
		}
	}

	/**
	 * Creates a new shutterspeedgalleryusers with the primary key. Does not add the shutterspeedgalleryusers to the database.
	 *
	 * @param id the primary key for the new shutterspeedgalleryusers
	 * @return the new shutterspeedgalleryusers
	 */
	@Override
	public shutterspeedgalleryusers create(long id) {
		shutterspeedgalleryusers shutterspeedgalleryusers = new shutterspeedgalleryusersImpl();

		shutterspeedgalleryusers.setNew(true);
		shutterspeedgalleryusers.setPrimaryKey(id);

		return shutterspeedgalleryusers;
	}

	/**
	 * Removes the shutterspeedgalleryusers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the shutterspeedgalleryusers
	 * @return the shutterspeedgalleryusers that was removed
	 * @throws NoSuchshutterspeedgalleryusersException if a shutterspeedgalleryusers with the primary key could not be found
	 */
	@Override
	public shutterspeedgalleryusers remove(long id)
		throws NoSuchshutterspeedgalleryusersException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the shutterspeedgalleryusers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the shutterspeedgalleryusers
	 * @return the shutterspeedgalleryusers that was removed
	 * @throws NoSuchshutterspeedgalleryusersException if a shutterspeedgalleryusers with the primary key could not be found
	 */
	@Override
	public shutterspeedgalleryusers remove(Serializable primaryKey)
		throws NoSuchshutterspeedgalleryusersException {
		Session session = null;

		try {
			session = openSession();

			shutterspeedgalleryusers shutterspeedgalleryusers = (shutterspeedgalleryusers)session.get(shutterspeedgalleryusersImpl.class,
					primaryKey);

			if (shutterspeedgalleryusers == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchshutterspeedgalleryusersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(shutterspeedgalleryusers);
		}
		catch (NoSuchshutterspeedgalleryusersException nsee) {
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
	protected shutterspeedgalleryusers removeImpl(
		shutterspeedgalleryusers shutterspeedgalleryusers) {
		shutterspeedgalleryusers = toUnwrappedModel(shutterspeedgalleryusers);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(shutterspeedgalleryusers)) {
				shutterspeedgalleryusers = (shutterspeedgalleryusers)session.get(shutterspeedgalleryusersImpl.class,
						shutterspeedgalleryusers.getPrimaryKeyObj());
			}

			if (shutterspeedgalleryusers != null) {
				session.delete(shutterspeedgalleryusers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (shutterspeedgalleryusers != null) {
			clearCache(shutterspeedgalleryusers);
		}

		return shutterspeedgalleryusers;
	}

	@Override
	public shutterspeedgalleryusers updateImpl(
		shutterspeedgalleryusers shutterspeedgalleryusers) {
		shutterspeedgalleryusers = toUnwrappedModel(shutterspeedgalleryusers);

		boolean isNew = shutterspeedgalleryusers.isNew();

		shutterspeedgalleryusersModelImpl shutterspeedgalleryusersModelImpl = (shutterspeedgalleryusersModelImpl)shutterspeedgalleryusers;

		Session session = null;

		try {
			session = openSession();

			if (shutterspeedgalleryusers.isNew()) {
				session.save(shutterspeedgalleryusers);

				shutterspeedgalleryusers.setNew(false);
			}
			else {
				shutterspeedgalleryusers = (shutterspeedgalleryusers)session.merge(shutterspeedgalleryusers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !shutterspeedgalleryusersModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((shutterspeedgalleryusersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUM_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						shutterspeedgalleryusersModelImpl.getOriginalAlbum_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ALBUM_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUM_ID,
					args);

				args = new Object[] {
						shutterspeedgalleryusersModelImpl.getAlbum_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ALBUM_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUM_ID,
					args);
			}

			if ((shutterspeedgalleryusersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						shutterspeedgalleryusersModelImpl.getOriginalUser_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID,
					args);

				args = new Object[] {
						shutterspeedgalleryusersModelImpl.getUser_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID,
					args);
			}
		}

		entityCache.putResult(shutterspeedgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			shutterspeedgalleryusersImpl.class,
			shutterspeedgalleryusers.getPrimaryKey(), shutterspeedgalleryusers,
			false);

		shutterspeedgalleryusers.resetOriginalValues();

		return shutterspeedgalleryusers;
	}

	protected shutterspeedgalleryusers toUnwrappedModel(
		shutterspeedgalleryusers shutterspeedgalleryusers) {
		if (shutterspeedgalleryusers instanceof shutterspeedgalleryusersImpl) {
			return shutterspeedgalleryusers;
		}

		shutterspeedgalleryusersImpl shutterspeedgalleryusersImpl = new shutterspeedgalleryusersImpl();

		shutterspeedgalleryusersImpl.setNew(shutterspeedgalleryusers.isNew());
		shutterspeedgalleryusersImpl.setPrimaryKey(shutterspeedgalleryusers.getPrimaryKey());

		shutterspeedgalleryusersImpl.setId(shutterspeedgalleryusers.getId());
		shutterspeedgalleryusersImpl.setUser_id(shutterspeedgalleryusers.getUser_id());
		shutterspeedgalleryusersImpl.setAlbum_id(shutterspeedgalleryusers.getAlbum_id());

		return shutterspeedgalleryusersImpl;
	}

	/**
	 * Returns the shutterspeedgalleryusers with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the shutterspeedgalleryusers
	 * @return the shutterspeedgalleryusers
	 * @throws NoSuchshutterspeedgalleryusersException if a shutterspeedgalleryusers with the primary key could not be found
	 */
	@Override
	public shutterspeedgalleryusers findByPrimaryKey(Serializable primaryKey)
		throws NoSuchshutterspeedgalleryusersException {
		shutterspeedgalleryusers shutterspeedgalleryusers = fetchByPrimaryKey(primaryKey);

		if (shutterspeedgalleryusers == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchshutterspeedgalleryusersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return shutterspeedgalleryusers;
	}

	/**
	 * Returns the shutterspeedgalleryusers with the primary key or throws a {@link NoSuchshutterspeedgalleryusersException} if it could not be found.
	 *
	 * @param id the primary key of the shutterspeedgalleryusers
	 * @return the shutterspeedgalleryusers
	 * @throws NoSuchshutterspeedgalleryusersException if a shutterspeedgalleryusers with the primary key could not be found
	 */
	@Override
	public shutterspeedgalleryusers findByPrimaryKey(long id)
		throws NoSuchshutterspeedgalleryusersException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the shutterspeedgalleryusers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the shutterspeedgalleryusers
	 * @return the shutterspeedgalleryusers, or <code>null</code> if a shutterspeedgalleryusers with the primary key could not be found
	 */
	@Override
	public shutterspeedgalleryusers fetchByPrimaryKey(Serializable primaryKey) {
		shutterspeedgalleryusers shutterspeedgalleryusers = (shutterspeedgalleryusers)entityCache.getResult(shutterspeedgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
				shutterspeedgalleryusersImpl.class, primaryKey);

		if (shutterspeedgalleryusers == _nullshutterspeedgalleryusers) {
			return null;
		}

		if (shutterspeedgalleryusers == null) {
			Session session = null;

			try {
				session = openSession();

				shutterspeedgalleryusers = (shutterspeedgalleryusers)session.get(shutterspeedgalleryusersImpl.class,
						primaryKey);

				if (shutterspeedgalleryusers != null) {
					cacheResult(shutterspeedgalleryusers);
				}
				else {
					entityCache.putResult(shutterspeedgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
						shutterspeedgalleryusersImpl.class, primaryKey,
						_nullshutterspeedgalleryusers);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(shutterspeedgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
					shutterspeedgalleryusersImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return shutterspeedgalleryusers;
	}

	/**
	 * Returns the shutterspeedgalleryusers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the shutterspeedgalleryusers
	 * @return the shutterspeedgalleryusers, or <code>null</code> if a shutterspeedgalleryusers with the primary key could not be found
	 */
	@Override
	public shutterspeedgalleryusers fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, shutterspeedgalleryusers> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, shutterspeedgalleryusers> map = new HashMap<Serializable, shutterspeedgalleryusers>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			shutterspeedgalleryusers shutterspeedgalleryusers = fetchByPrimaryKey(primaryKey);

			if (shutterspeedgalleryusers != null) {
				map.put(primaryKey, shutterspeedgalleryusers);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			shutterspeedgalleryusers shutterspeedgalleryusers = (shutterspeedgalleryusers)entityCache.getResult(shutterspeedgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
					shutterspeedgalleryusersImpl.class, primaryKey);

			if (shutterspeedgalleryusers == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, shutterspeedgalleryusers);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SHUTTERSPEEDGALLERYUSERS_WHERE_PKS_IN);

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

			for (shutterspeedgalleryusers shutterspeedgalleryusers : (List<shutterspeedgalleryusers>)q.list()) {
				map.put(shutterspeedgalleryusers.getPrimaryKeyObj(),
					shutterspeedgalleryusers);

				cacheResult(shutterspeedgalleryusers);

				uncachedPrimaryKeys.remove(shutterspeedgalleryusers.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(shutterspeedgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
					shutterspeedgalleryusersImpl.class, primaryKey,
					_nullshutterspeedgalleryusers);
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
	 * Returns all the shutterspeedgalleryuserses.
	 *
	 * @return the shutterspeedgalleryuserses
	 */
	@Override
	public List<shutterspeedgalleryusers> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the shutterspeedgalleryuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of shutterspeedgalleryuserses
	 * @param end the upper bound of the range of shutterspeedgalleryuserses (not inclusive)
	 * @return the range of shutterspeedgalleryuserses
	 */
	@Override
	public List<shutterspeedgalleryusers> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the shutterspeedgalleryuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of shutterspeedgalleryuserses
	 * @param end the upper bound of the range of shutterspeedgalleryuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of shutterspeedgalleryuserses
	 */
	@Override
	public List<shutterspeedgalleryusers> findAll(int start, int end,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the shutterspeedgalleryuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of shutterspeedgalleryuserses
	 * @param end the upper bound of the range of shutterspeedgalleryuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of shutterspeedgalleryuserses
	 */
	@Override
	public List<shutterspeedgalleryusers> findAll(int start, int end,
		OrderByComparator<shutterspeedgalleryusers> orderByComparator,
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

		List<shutterspeedgalleryusers> list = null;

		if (retrieveFromCache) {
			list = (List<shutterspeedgalleryusers>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SHUTTERSPEEDGALLERYUSERS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SHUTTERSPEEDGALLERYUSERS;

				if (pagination) {
					sql = sql.concat(shutterspeedgalleryusersModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<shutterspeedgalleryusers>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<shutterspeedgalleryusers>)QueryUtil.list(q,
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
	 * Removes all the shutterspeedgalleryuserses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (shutterspeedgalleryusers shutterspeedgalleryusers : findAll()) {
			remove(shutterspeedgalleryusers);
		}
	}

	/**
	 * Returns the number of shutterspeedgalleryuserses.
	 *
	 * @return the number of shutterspeedgalleryuserses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SHUTTERSPEEDGALLERYUSERS);

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
		return shutterspeedgalleryusersModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the shutterspeedgalleryusers persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(shutterspeedgalleryusersImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_SHUTTERSPEEDGALLERYUSERS = "SELECT shutterspeedgalleryusers FROM shutterspeedgalleryusers shutterspeedgalleryusers";
	private static final String _SQL_SELECT_SHUTTERSPEEDGALLERYUSERS_WHERE_PKS_IN =
		"SELECT shutterspeedgalleryusers FROM shutterspeedgalleryusers shutterspeedgalleryusers WHERE id_ IN (";
	private static final String _SQL_SELECT_SHUTTERSPEEDGALLERYUSERS_WHERE = "SELECT shutterspeedgalleryusers FROM shutterspeedgalleryusers shutterspeedgalleryusers WHERE ";
	private static final String _SQL_COUNT_SHUTTERSPEEDGALLERYUSERS = "SELECT COUNT(shutterspeedgalleryusers) FROM shutterspeedgalleryusers shutterspeedgalleryusers";
	private static final String _SQL_COUNT_SHUTTERSPEEDGALLERYUSERS_WHERE = "SELECT COUNT(shutterspeedgalleryusers) FROM shutterspeedgalleryusers shutterspeedgalleryusers WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "shutterspeedgalleryusers.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No shutterspeedgalleryusers exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No shutterspeedgalleryusers exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(shutterspeedgalleryusersPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final shutterspeedgalleryusers _nullshutterspeedgalleryusers = new shutterspeedgalleryusersImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<shutterspeedgalleryusers> toCacheModel() {
				return _nullshutterspeedgalleryusersCacheModel;
			}
		};

	private static final CacheModel<shutterspeedgalleryusers> _nullshutterspeedgalleryusersCacheModel =
		new CacheModel<shutterspeedgalleryusers>() {
			@Override
			public shutterspeedgalleryusers toEntityModel() {
				return _nullshutterspeedgalleryusers;
			}
		};
}