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

import com.chola.feedforward.exception.NoSuchfeedforwardgalleryusersException;
import com.chola.feedforward.model.feedforwardgalleryusers;
import com.chola.feedforward.model.impl.feedforwardgalleryusersImpl;
import com.chola.feedforward.model.impl.feedforwardgalleryusersModelImpl;
import com.chola.feedforward.service.persistence.feedforwardgalleryusersPersistence;

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
 * The persistence implementation for the feedforwardgalleryusers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see feedforwardgalleryusersPersistence
 * @see com.chola.feedforward.service.persistence.feedforwardgalleryusersUtil
 * @generated
 */
@ProviderType
public class feedforwardgalleryusersPersistenceImpl extends BasePersistenceImpl<feedforwardgalleryusers>
	implements feedforwardgalleryusersPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link feedforwardgalleryusersUtil} to access the feedforwardgalleryusers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = feedforwardgalleryusersImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(feedforwardgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgalleryusersModelImpl.FINDER_CACHE_ENABLED,
			feedforwardgalleryusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(feedforwardgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgalleryusersModelImpl.FINDER_CACHE_ENABLED,
			feedforwardgalleryusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(feedforwardgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgalleryusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ALBUM_ID = new FinderPath(feedforwardgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgalleryusersModelImpl.FINDER_CACHE_ENABLED,
			feedforwardgalleryusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByALBUM_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUM_ID =
		new FinderPath(feedforwardgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgalleryusersModelImpl.FINDER_CACHE_ENABLED,
			feedforwardgalleryusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByALBUM_ID",
			new String[] { Long.class.getName() },
			feedforwardgalleryusersModelImpl.ALBUM_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ALBUM_ID = new FinderPath(feedforwardgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgalleryusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByALBUM_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the feedforwardgalleryuserses where album_id = &#63;.
	 *
	 * @param album_id the album_id
	 * @return the matching feedforwardgalleryuserses
	 */
	@Override
	public List<feedforwardgalleryusers> findByALBUM_ID(long album_id) {
		return findByALBUM_ID(album_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the feedforwardgalleryuserses where album_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param album_id the album_id
	 * @param start the lower bound of the range of feedforwardgalleryuserses
	 * @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	 * @return the range of matching feedforwardgalleryuserses
	 */
	@Override
	public List<feedforwardgalleryusers> findByALBUM_ID(long album_id,
		int start, int end) {
		return findByALBUM_ID(album_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the feedforwardgalleryuserses where album_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param album_id the album_id
	 * @param start the lower bound of the range of feedforwardgalleryuserses
	 * @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching feedforwardgalleryuserses
	 */
	@Override
	public List<feedforwardgalleryusers> findByALBUM_ID(long album_id,
		int start, int end,
		OrderByComparator<feedforwardgalleryusers> orderByComparator) {
		return findByALBUM_ID(album_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the feedforwardgalleryuserses where album_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param album_id the album_id
	 * @param start the lower bound of the range of feedforwardgalleryuserses
	 * @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching feedforwardgalleryuserses
	 */
	@Override
	public List<feedforwardgalleryusers> findByALBUM_ID(long album_id,
		int start, int end,
		OrderByComparator<feedforwardgalleryusers> orderByComparator,
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

		List<feedforwardgalleryusers> list = null;

		if (retrieveFromCache) {
			list = (List<feedforwardgalleryusers>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (feedforwardgalleryusers feedforwardgalleryusers : list) {
					if ((album_id != feedforwardgalleryusers.getAlbum_id())) {
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

			query.append(_SQL_SELECT_FEEDFORWARDGALLERYUSERS_WHERE);

			query.append(_FINDER_COLUMN_ALBUM_ID_ALBUM_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(feedforwardgalleryusersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(album_id);

				if (!pagination) {
					list = (List<feedforwardgalleryusers>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<feedforwardgalleryusers>)QueryUtil.list(q,
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
	 * Returns the first feedforwardgalleryusers in the ordered set where album_id = &#63;.
	 *
	 * @param album_id the album_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedforwardgalleryusers
	 * @throws NoSuchfeedforwardgalleryusersException if a matching feedforwardgalleryusers could not be found
	 */
	@Override
	public feedforwardgalleryusers findByALBUM_ID_First(long album_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator)
		throws NoSuchfeedforwardgalleryusersException {
		feedforwardgalleryusers feedforwardgalleryusers = fetchByALBUM_ID_First(album_id,
				orderByComparator);

		if (feedforwardgalleryusers != null) {
			return feedforwardgalleryusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("album_id=");
		msg.append(album_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchfeedforwardgalleryusersException(msg.toString());
	}

	/**
	 * Returns the first feedforwardgalleryusers in the ordered set where album_id = &#63;.
	 *
	 * @param album_id the album_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedforwardgalleryusers, or <code>null</code> if a matching feedforwardgalleryusers could not be found
	 */
	@Override
	public feedforwardgalleryusers fetchByALBUM_ID_First(long album_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator) {
		List<feedforwardgalleryusers> list = findByALBUM_ID(album_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last feedforwardgalleryusers in the ordered set where album_id = &#63;.
	 *
	 * @param album_id the album_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedforwardgalleryusers
	 * @throws NoSuchfeedforwardgalleryusersException if a matching feedforwardgalleryusers could not be found
	 */
	@Override
	public feedforwardgalleryusers findByALBUM_ID_Last(long album_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator)
		throws NoSuchfeedforwardgalleryusersException {
		feedforwardgalleryusers feedforwardgalleryusers = fetchByALBUM_ID_Last(album_id,
				orderByComparator);

		if (feedforwardgalleryusers != null) {
			return feedforwardgalleryusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("album_id=");
		msg.append(album_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchfeedforwardgalleryusersException(msg.toString());
	}

	/**
	 * Returns the last feedforwardgalleryusers in the ordered set where album_id = &#63;.
	 *
	 * @param album_id the album_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedforwardgalleryusers, or <code>null</code> if a matching feedforwardgalleryusers could not be found
	 */
	@Override
	public feedforwardgalleryusers fetchByALBUM_ID_Last(long album_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator) {
		int count = countByALBUM_ID(album_id);

		if (count == 0) {
			return null;
		}

		List<feedforwardgalleryusers> list = findByALBUM_ID(album_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the feedforwardgalleryuserses before and after the current feedforwardgalleryusers in the ordered set where album_id = &#63;.
	 *
	 * @param id the primary key of the current feedforwardgalleryusers
	 * @param album_id the album_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next feedforwardgalleryusers
	 * @throws NoSuchfeedforwardgalleryusersException if a feedforwardgalleryusers with the primary key could not be found
	 */
	@Override
	public feedforwardgalleryusers[] findByALBUM_ID_PrevAndNext(long id,
		long album_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator)
		throws NoSuchfeedforwardgalleryusersException {
		feedforwardgalleryusers feedforwardgalleryusers = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			feedforwardgalleryusers[] array = new feedforwardgalleryusersImpl[3];

			array[0] = getByALBUM_ID_PrevAndNext(session,
					feedforwardgalleryusers, album_id, orderByComparator, true);

			array[1] = feedforwardgalleryusers;

			array[2] = getByALBUM_ID_PrevAndNext(session,
					feedforwardgalleryusers, album_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected feedforwardgalleryusers getByALBUM_ID_PrevAndNext(
		Session session, feedforwardgalleryusers feedforwardgalleryusers,
		long album_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator,
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

		query.append(_SQL_SELECT_FEEDFORWARDGALLERYUSERS_WHERE);

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
			query.append(feedforwardgalleryusersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(album_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(feedforwardgalleryusers);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<feedforwardgalleryusers> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the feedforwardgalleryuserses where album_id = &#63; from the database.
	 *
	 * @param album_id the album_id
	 */
	@Override
	public void removeByALBUM_ID(long album_id) {
		for (feedforwardgalleryusers feedforwardgalleryusers : findByALBUM_ID(
				album_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(feedforwardgalleryusers);
		}
	}

	/**
	 * Returns the number of feedforwardgalleryuserses where album_id = &#63;.
	 *
	 * @param album_id the album_id
	 * @return the number of matching feedforwardgalleryuserses
	 */
	@Override
	public int countByALBUM_ID(long album_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ALBUM_ID;

		Object[] finderArgs = new Object[] { album_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FEEDFORWARDGALLERYUSERS_WHERE);

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

	private static final String _FINDER_COLUMN_ALBUM_ID_ALBUM_ID_2 = "feedforwardgalleryusers.album_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USER_ID = new FinderPath(feedforwardgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgalleryusersModelImpl.FINDER_CACHE_ENABLED,
			feedforwardgalleryusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUSER_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID =
		new FinderPath(feedforwardgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgalleryusersModelImpl.FINDER_CACHE_ENABLED,
			feedforwardgalleryusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUSER_ID",
			new String[] { Long.class.getName() },
			feedforwardgalleryusersModelImpl.USER_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USER_ID = new FinderPath(feedforwardgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgalleryusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUSER_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the feedforwardgalleryuserses where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @return the matching feedforwardgalleryuserses
	 */
	@Override
	public List<feedforwardgalleryusers> findByUSER_ID(long user_id) {
		return findByUSER_ID(user_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the feedforwardgalleryuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of feedforwardgalleryuserses
	 * @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	 * @return the range of matching feedforwardgalleryuserses
	 */
	@Override
	public List<feedforwardgalleryusers> findByUSER_ID(long user_id, int start,
		int end) {
		return findByUSER_ID(user_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the feedforwardgalleryuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of feedforwardgalleryuserses
	 * @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching feedforwardgalleryuserses
	 */
	@Override
	public List<feedforwardgalleryusers> findByUSER_ID(long user_id, int start,
		int end, OrderByComparator<feedforwardgalleryusers> orderByComparator) {
		return findByUSER_ID(user_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the feedforwardgalleryuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of feedforwardgalleryuserses
	 * @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching feedforwardgalleryuserses
	 */
	@Override
	public List<feedforwardgalleryusers> findByUSER_ID(long user_id, int start,
		int end, OrderByComparator<feedforwardgalleryusers> orderByComparator,
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

		List<feedforwardgalleryusers> list = null;

		if (retrieveFromCache) {
			list = (List<feedforwardgalleryusers>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (feedforwardgalleryusers feedforwardgalleryusers : list) {
					if ((user_id != feedforwardgalleryusers.getUser_id())) {
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

			query.append(_SQL_SELECT_FEEDFORWARDGALLERYUSERS_WHERE);

			query.append(_FINDER_COLUMN_USER_ID_USER_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(feedforwardgalleryusersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(user_id);

				if (!pagination) {
					list = (List<feedforwardgalleryusers>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<feedforwardgalleryusers>)QueryUtil.list(q,
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
	 * Returns the first feedforwardgalleryusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedforwardgalleryusers
	 * @throws NoSuchfeedforwardgalleryusersException if a matching feedforwardgalleryusers could not be found
	 */
	@Override
	public feedforwardgalleryusers findByUSER_ID_First(long user_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator)
		throws NoSuchfeedforwardgalleryusersException {
		feedforwardgalleryusers feedforwardgalleryusers = fetchByUSER_ID_First(user_id,
				orderByComparator);

		if (feedforwardgalleryusers != null) {
			return feedforwardgalleryusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("user_id=");
		msg.append(user_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchfeedforwardgalleryusersException(msg.toString());
	}

	/**
	 * Returns the first feedforwardgalleryusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedforwardgalleryusers, or <code>null</code> if a matching feedforwardgalleryusers could not be found
	 */
	@Override
	public feedforwardgalleryusers fetchByUSER_ID_First(long user_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator) {
		List<feedforwardgalleryusers> list = findByUSER_ID(user_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last feedforwardgalleryusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedforwardgalleryusers
	 * @throws NoSuchfeedforwardgalleryusersException if a matching feedforwardgalleryusers could not be found
	 */
	@Override
	public feedforwardgalleryusers findByUSER_ID_Last(long user_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator)
		throws NoSuchfeedforwardgalleryusersException {
		feedforwardgalleryusers feedforwardgalleryusers = fetchByUSER_ID_Last(user_id,
				orderByComparator);

		if (feedforwardgalleryusers != null) {
			return feedforwardgalleryusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("user_id=");
		msg.append(user_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchfeedforwardgalleryusersException(msg.toString());
	}

	/**
	 * Returns the last feedforwardgalleryusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedforwardgalleryusers, or <code>null</code> if a matching feedforwardgalleryusers could not be found
	 */
	@Override
	public feedforwardgalleryusers fetchByUSER_ID_Last(long user_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator) {
		int count = countByUSER_ID(user_id);

		if (count == 0) {
			return null;
		}

		List<feedforwardgalleryusers> list = findByUSER_ID(user_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the feedforwardgalleryuserses before and after the current feedforwardgalleryusers in the ordered set where user_id = &#63;.
	 *
	 * @param id the primary key of the current feedforwardgalleryusers
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next feedforwardgalleryusers
	 * @throws NoSuchfeedforwardgalleryusersException if a feedforwardgalleryusers with the primary key could not be found
	 */
	@Override
	public feedforwardgalleryusers[] findByUSER_ID_PrevAndNext(long id,
		long user_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator)
		throws NoSuchfeedforwardgalleryusersException {
		feedforwardgalleryusers feedforwardgalleryusers = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			feedforwardgalleryusers[] array = new feedforwardgalleryusersImpl[3];

			array[0] = getByUSER_ID_PrevAndNext(session,
					feedforwardgalleryusers, user_id, orderByComparator, true);

			array[1] = feedforwardgalleryusers;

			array[2] = getByUSER_ID_PrevAndNext(session,
					feedforwardgalleryusers, user_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected feedforwardgalleryusers getByUSER_ID_PrevAndNext(
		Session session, feedforwardgalleryusers feedforwardgalleryusers,
		long user_id,
		OrderByComparator<feedforwardgalleryusers> orderByComparator,
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

		query.append(_SQL_SELECT_FEEDFORWARDGALLERYUSERS_WHERE);

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
			query.append(feedforwardgalleryusersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(user_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(feedforwardgalleryusers);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<feedforwardgalleryusers> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the feedforwardgalleryuserses where user_id = &#63; from the database.
	 *
	 * @param user_id the user_id
	 */
	@Override
	public void removeByUSER_ID(long user_id) {
		for (feedforwardgalleryusers feedforwardgalleryusers : findByUSER_ID(
				user_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(feedforwardgalleryusers);
		}
	}

	/**
	 * Returns the number of feedforwardgalleryuserses where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @return the number of matching feedforwardgalleryuserses
	 */
	@Override
	public int countByUSER_ID(long user_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USER_ID;

		Object[] finderArgs = new Object[] { user_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FEEDFORWARDGALLERYUSERS_WHERE);

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

	private static final String _FINDER_COLUMN_USER_ID_USER_ID_2 = "feedforwardgalleryusers.user_id = ?";

	public feedforwardgalleryusersPersistenceImpl() {
		setModelClass(feedforwardgalleryusers.class);
	}

	/**
	 * Caches the feedforwardgalleryusers in the entity cache if it is enabled.
	 *
	 * @param feedforwardgalleryusers the feedforwardgalleryusers
	 */
	@Override
	public void cacheResult(feedforwardgalleryusers feedforwardgalleryusers) {
		entityCache.putResult(feedforwardgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgalleryusersImpl.class,
			feedforwardgalleryusers.getPrimaryKey(), feedforwardgalleryusers);

		feedforwardgalleryusers.resetOriginalValues();
	}

	/**
	 * Caches the feedforwardgalleryuserses in the entity cache if it is enabled.
	 *
	 * @param feedforwardgalleryuserses the feedforwardgalleryuserses
	 */
	@Override
	public void cacheResult(
		List<feedforwardgalleryusers> feedforwardgalleryuserses) {
		for (feedforwardgalleryusers feedforwardgalleryusers : feedforwardgalleryuserses) {
			if (entityCache.getResult(
						feedforwardgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
						feedforwardgalleryusersImpl.class,
						feedforwardgalleryusers.getPrimaryKey()) == null) {
				cacheResult(feedforwardgalleryusers);
			}
			else {
				feedforwardgalleryusers.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all feedforwardgalleryuserses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(feedforwardgalleryusersImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the feedforwardgalleryusers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(feedforwardgalleryusers feedforwardgalleryusers) {
		entityCache.removeResult(feedforwardgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgalleryusersImpl.class,
			feedforwardgalleryusers.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<feedforwardgalleryusers> feedforwardgalleryuserses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (feedforwardgalleryusers feedforwardgalleryusers : feedforwardgalleryuserses) {
			entityCache.removeResult(feedforwardgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
				feedforwardgalleryusersImpl.class,
				feedforwardgalleryusers.getPrimaryKey());
		}
	}

	/**
	 * Creates a new feedforwardgalleryusers with the primary key. Does not add the feedforwardgalleryusers to the database.
	 *
	 * @param id the primary key for the new feedforwardgalleryusers
	 * @return the new feedforwardgalleryusers
	 */
	@Override
	public feedforwardgalleryusers create(long id) {
		feedforwardgalleryusers feedforwardgalleryusers = new feedforwardgalleryusersImpl();

		feedforwardgalleryusers.setNew(true);
		feedforwardgalleryusers.setPrimaryKey(id);

		return feedforwardgalleryusers;
	}

	/**
	 * Removes the feedforwardgalleryusers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the feedforwardgalleryusers
	 * @return the feedforwardgalleryusers that was removed
	 * @throws NoSuchfeedforwardgalleryusersException if a feedforwardgalleryusers with the primary key could not be found
	 */
	@Override
	public feedforwardgalleryusers remove(long id)
		throws NoSuchfeedforwardgalleryusersException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the feedforwardgalleryusers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the feedforwardgalleryusers
	 * @return the feedforwardgalleryusers that was removed
	 * @throws NoSuchfeedforwardgalleryusersException if a feedforwardgalleryusers with the primary key could not be found
	 */
	@Override
	public feedforwardgalleryusers remove(Serializable primaryKey)
		throws NoSuchfeedforwardgalleryusersException {
		Session session = null;

		try {
			session = openSession();

			feedforwardgalleryusers feedforwardgalleryusers = (feedforwardgalleryusers)session.get(feedforwardgalleryusersImpl.class,
					primaryKey);

			if (feedforwardgalleryusers == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchfeedforwardgalleryusersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(feedforwardgalleryusers);
		}
		catch (NoSuchfeedforwardgalleryusersException nsee) {
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
	protected feedforwardgalleryusers removeImpl(
		feedforwardgalleryusers feedforwardgalleryusers) {
		feedforwardgalleryusers = toUnwrappedModel(feedforwardgalleryusers);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(feedforwardgalleryusers)) {
				feedforwardgalleryusers = (feedforwardgalleryusers)session.get(feedforwardgalleryusersImpl.class,
						feedforwardgalleryusers.getPrimaryKeyObj());
			}

			if (feedforwardgalleryusers != null) {
				session.delete(feedforwardgalleryusers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (feedforwardgalleryusers != null) {
			clearCache(feedforwardgalleryusers);
		}

		return feedforwardgalleryusers;
	}

	@Override
	public feedforwardgalleryusers updateImpl(
		feedforwardgalleryusers feedforwardgalleryusers) {
		feedforwardgalleryusers = toUnwrappedModel(feedforwardgalleryusers);

		boolean isNew = feedforwardgalleryusers.isNew();

		feedforwardgalleryusersModelImpl feedforwardgalleryusersModelImpl = (feedforwardgalleryusersModelImpl)feedforwardgalleryusers;

		Session session = null;

		try {
			session = openSession();

			if (feedforwardgalleryusers.isNew()) {
				session.save(feedforwardgalleryusers);

				feedforwardgalleryusers.setNew(false);
			}
			else {
				feedforwardgalleryusers = (feedforwardgalleryusers)session.merge(feedforwardgalleryusers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !feedforwardgalleryusersModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((feedforwardgalleryusersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUM_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						feedforwardgalleryusersModelImpl.getOriginalAlbum_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ALBUM_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUM_ID,
					args);

				args = new Object[] {
						feedforwardgalleryusersModelImpl.getAlbum_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ALBUM_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALBUM_ID,
					args);
			}

			if ((feedforwardgalleryusersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						feedforwardgalleryusersModelImpl.getOriginalUser_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID,
					args);

				args = new Object[] {
						feedforwardgalleryusersModelImpl.getUser_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID,
					args);
			}
		}

		entityCache.putResult(feedforwardgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
			feedforwardgalleryusersImpl.class,
			feedforwardgalleryusers.getPrimaryKey(), feedforwardgalleryusers,
			false);

		feedforwardgalleryusers.resetOriginalValues();

		return feedforwardgalleryusers;
	}

	protected feedforwardgalleryusers toUnwrappedModel(
		feedforwardgalleryusers feedforwardgalleryusers) {
		if (feedforwardgalleryusers instanceof feedforwardgalleryusersImpl) {
			return feedforwardgalleryusers;
		}

		feedforwardgalleryusersImpl feedforwardgalleryusersImpl = new feedforwardgalleryusersImpl();

		feedforwardgalleryusersImpl.setNew(feedforwardgalleryusers.isNew());
		feedforwardgalleryusersImpl.setPrimaryKey(feedforwardgalleryusers.getPrimaryKey());

		feedforwardgalleryusersImpl.setId(feedforwardgalleryusers.getId());
		feedforwardgalleryusersImpl.setUser_id(feedforwardgalleryusers.getUser_id());
		feedforwardgalleryusersImpl.setAlbum_id(feedforwardgalleryusers.getAlbum_id());

		return feedforwardgalleryusersImpl;
	}

	/**
	 * Returns the feedforwardgalleryusers with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the feedforwardgalleryusers
	 * @return the feedforwardgalleryusers
	 * @throws NoSuchfeedforwardgalleryusersException if a feedforwardgalleryusers with the primary key could not be found
	 */
	@Override
	public feedforwardgalleryusers findByPrimaryKey(Serializable primaryKey)
		throws NoSuchfeedforwardgalleryusersException {
		feedforwardgalleryusers feedforwardgalleryusers = fetchByPrimaryKey(primaryKey);

		if (feedforwardgalleryusers == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchfeedforwardgalleryusersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return feedforwardgalleryusers;
	}

	/**
	 * Returns the feedforwardgalleryusers with the primary key or throws a {@link NoSuchfeedforwardgalleryusersException} if it could not be found.
	 *
	 * @param id the primary key of the feedforwardgalleryusers
	 * @return the feedforwardgalleryusers
	 * @throws NoSuchfeedforwardgalleryusersException if a feedforwardgalleryusers with the primary key could not be found
	 */
	@Override
	public feedforwardgalleryusers findByPrimaryKey(long id)
		throws NoSuchfeedforwardgalleryusersException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the feedforwardgalleryusers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the feedforwardgalleryusers
	 * @return the feedforwardgalleryusers, or <code>null</code> if a feedforwardgalleryusers with the primary key could not be found
	 */
	@Override
	public feedforwardgalleryusers fetchByPrimaryKey(Serializable primaryKey) {
		feedforwardgalleryusers feedforwardgalleryusers = (feedforwardgalleryusers)entityCache.getResult(feedforwardgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
				feedforwardgalleryusersImpl.class, primaryKey);

		if (feedforwardgalleryusers == _nullfeedforwardgalleryusers) {
			return null;
		}

		if (feedforwardgalleryusers == null) {
			Session session = null;

			try {
				session = openSession();

				feedforwardgalleryusers = (feedforwardgalleryusers)session.get(feedforwardgalleryusersImpl.class,
						primaryKey);

				if (feedforwardgalleryusers != null) {
					cacheResult(feedforwardgalleryusers);
				}
				else {
					entityCache.putResult(feedforwardgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
						feedforwardgalleryusersImpl.class, primaryKey,
						_nullfeedforwardgalleryusers);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(feedforwardgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
					feedforwardgalleryusersImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return feedforwardgalleryusers;
	}

	/**
	 * Returns the feedforwardgalleryusers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the feedforwardgalleryusers
	 * @return the feedforwardgalleryusers, or <code>null</code> if a feedforwardgalleryusers with the primary key could not be found
	 */
	@Override
	public feedforwardgalleryusers fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, feedforwardgalleryusers> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, feedforwardgalleryusers> map = new HashMap<Serializable, feedforwardgalleryusers>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			feedforwardgalleryusers feedforwardgalleryusers = fetchByPrimaryKey(primaryKey);

			if (feedforwardgalleryusers != null) {
				map.put(primaryKey, feedforwardgalleryusers);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			feedforwardgalleryusers feedforwardgalleryusers = (feedforwardgalleryusers)entityCache.getResult(feedforwardgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
					feedforwardgalleryusersImpl.class, primaryKey);

			if (feedforwardgalleryusers == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, feedforwardgalleryusers);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_FEEDFORWARDGALLERYUSERS_WHERE_PKS_IN);

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

			for (feedforwardgalleryusers feedforwardgalleryusers : (List<feedforwardgalleryusers>)q.list()) {
				map.put(feedforwardgalleryusers.getPrimaryKeyObj(),
					feedforwardgalleryusers);

				cacheResult(feedforwardgalleryusers);

				uncachedPrimaryKeys.remove(feedforwardgalleryusers.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(feedforwardgalleryusersModelImpl.ENTITY_CACHE_ENABLED,
					feedforwardgalleryusersImpl.class, primaryKey,
					_nullfeedforwardgalleryusers);
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
	 * Returns all the feedforwardgalleryuserses.
	 *
	 * @return the feedforwardgalleryuserses
	 */
	@Override
	public List<feedforwardgalleryusers> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the feedforwardgalleryuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of feedforwardgalleryuserses
	 * @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	 * @return the range of feedforwardgalleryuserses
	 */
	@Override
	public List<feedforwardgalleryusers> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the feedforwardgalleryuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of feedforwardgalleryuserses
	 * @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of feedforwardgalleryuserses
	 */
	@Override
	public List<feedforwardgalleryusers> findAll(int start, int end,
		OrderByComparator<feedforwardgalleryusers> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the feedforwardgalleryuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of feedforwardgalleryuserses
	 * @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of feedforwardgalleryuserses
	 */
	@Override
	public List<feedforwardgalleryusers> findAll(int start, int end,
		OrderByComparator<feedforwardgalleryusers> orderByComparator,
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

		List<feedforwardgalleryusers> list = null;

		if (retrieveFromCache) {
			list = (List<feedforwardgalleryusers>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_FEEDFORWARDGALLERYUSERS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FEEDFORWARDGALLERYUSERS;

				if (pagination) {
					sql = sql.concat(feedforwardgalleryusersModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<feedforwardgalleryusers>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<feedforwardgalleryusers>)QueryUtil.list(q,
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
	 * Removes all the feedforwardgalleryuserses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (feedforwardgalleryusers feedforwardgalleryusers : findAll()) {
			remove(feedforwardgalleryusers);
		}
	}

	/**
	 * Returns the number of feedforwardgalleryuserses.
	 *
	 * @return the number of feedforwardgalleryuserses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FEEDFORWARDGALLERYUSERS);

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
		return feedforwardgalleryusersModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the feedforwardgalleryusers persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(feedforwardgalleryusersImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_FEEDFORWARDGALLERYUSERS = "SELECT feedforwardgalleryusers FROM feedforwardgalleryusers feedforwardgalleryusers";
	private static final String _SQL_SELECT_FEEDFORWARDGALLERYUSERS_WHERE_PKS_IN =
		"SELECT feedforwardgalleryusers FROM feedforwardgalleryusers feedforwardgalleryusers WHERE id_ IN (";
	private static final String _SQL_SELECT_FEEDFORWARDGALLERYUSERS_WHERE = "SELECT feedforwardgalleryusers FROM feedforwardgalleryusers feedforwardgalleryusers WHERE ";
	private static final String _SQL_COUNT_FEEDFORWARDGALLERYUSERS = "SELECT COUNT(feedforwardgalleryusers) FROM feedforwardgalleryusers feedforwardgalleryusers";
	private static final String _SQL_COUNT_FEEDFORWARDGALLERYUSERS_WHERE = "SELECT COUNT(feedforwardgalleryusers) FROM feedforwardgalleryusers feedforwardgalleryusers WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "feedforwardgalleryusers.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No feedforwardgalleryusers exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No feedforwardgalleryusers exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(feedforwardgalleryusersPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final feedforwardgalleryusers _nullfeedforwardgalleryusers = new feedforwardgalleryusersImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<feedforwardgalleryusers> toCacheModel() {
				return _nullfeedforwardgalleryusersCacheModel;
			}
		};

	private static final CacheModel<feedforwardgalleryusers> _nullfeedforwardgalleryusersCacheModel =
		new CacheModel<feedforwardgalleryusers>() {
			@Override
			public feedforwardgalleryusers toEntityModel() {
				return _nullfeedforwardgalleryusers;
			}
		};
}