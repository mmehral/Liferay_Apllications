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

package com.chola.anniversary.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.anniversary.exception.NoSuchanniversarywishException;
import com.chola.anniversary.model.anniversarywish;
import com.chola.anniversary.model.impl.anniversarywishImpl;
import com.chola.anniversary.model.impl.anniversarywishModelImpl;
import com.chola.anniversary.service.persistence.anniversarywishPersistence;

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
 * The persistence implementation for the anniversarywish service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see anniversarywishPersistence
 * @see com.chola.anniversary.service.persistence.anniversarywishUtil
 * @generated
 */
@ProviderType
public class anniversarywishPersistenceImpl extends BasePersistenceImpl<anniversarywish>
	implements anniversarywishPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link anniversarywishUtil} to access the anniversarywish persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = anniversarywishImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(anniversarywishModelImpl.ENTITY_CACHE_ENABLED,
			anniversarywishModelImpl.FINDER_CACHE_ENABLED,
			anniversarywishImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(anniversarywishModelImpl.ENTITY_CACHE_ENABLED,
			anniversarywishModelImpl.FINDER_CACHE_ENABLED,
			anniversarywishImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(anniversarywishModelImpl.ENTITY_CACHE_ENABLED,
			anniversarywishModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERIDS = new FinderPath(anniversarywishModelImpl.ENTITY_CACHE_ENABLED,
			anniversarywishModelImpl.FINDER_CACHE_ENABLED,
			anniversarywishImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByuserIds",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDS =
		new FinderPath(anniversarywishModelImpl.ENTITY_CACHE_ENABLED,
			anniversarywishModelImpl.FINDER_CACHE_ENABLED,
			anniversarywishImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByuserIds",
			new String[] { String.class.getName() },
			anniversarywishModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERIDS = new FinderPath(anniversarywishModelImpl.ENTITY_CACHE_ENABLED,
			anniversarywishModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByuserIds",
			new String[] { String.class.getName() });

	/**
	 * Returns all the anniversarywishs where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching anniversarywishs
	 */
	@Override
	public List<anniversarywish> findByuserIds(String userId) {
		return findByuserIds(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the anniversarywishs where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link anniversarywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of anniversarywishs
	 * @param end the upper bound of the range of anniversarywishs (not inclusive)
	 * @return the range of matching anniversarywishs
	 */
	@Override
	public List<anniversarywish> findByuserIds(String userId, int start, int end) {
		return findByuserIds(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the anniversarywishs where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link anniversarywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of anniversarywishs
	 * @param end the upper bound of the range of anniversarywishs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching anniversarywishs
	 */
	@Override
	public List<anniversarywish> findByuserIds(String userId, int start,
		int end, OrderByComparator<anniversarywish> orderByComparator) {
		return findByuserIds(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the anniversarywishs where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link anniversarywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of anniversarywishs
	 * @param end the upper bound of the range of anniversarywishs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching anniversarywishs
	 */
	@Override
	public List<anniversarywish> findByuserIds(String userId, int start,
		int end, OrderByComparator<anniversarywish> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDS;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERIDS;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<anniversarywish> list = null;

		if (retrieveFromCache) {
			list = (List<anniversarywish>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (anniversarywish anniversarywish : list) {
					if (!Objects.equals(userId, anniversarywish.getUserId())) {
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

			query.append(_SQL_SELECT_ANNIVERSARYWISH_WHERE);

			boolean bindUserId = false;

			if (userId == null) {
				query.append(_FINDER_COLUMN_USERIDS_USERID_1);
			}
			else if (userId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_USERIDS_USERID_3);
			}
			else {
				bindUserId = true;

				query.append(_FINDER_COLUMN_USERIDS_USERID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(anniversarywishModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUserId) {
					qPos.add(userId);
				}

				if (!pagination) {
					list = (List<anniversarywish>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<anniversarywish>)QueryUtil.list(q,
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
	 * Returns the first anniversarywish in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching anniversarywish
	 * @throws NoSuchanniversarywishException if a matching anniversarywish could not be found
	 */
	@Override
	public anniversarywish findByuserIds_First(String userId,
		OrderByComparator<anniversarywish> orderByComparator)
		throws NoSuchanniversarywishException {
		anniversarywish anniversarywish = fetchByuserIds_First(userId,
				orderByComparator);

		if (anniversarywish != null) {
			return anniversarywish;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchanniversarywishException(msg.toString());
	}

	/**
	 * Returns the first anniversarywish in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching anniversarywish, or <code>null</code> if a matching anniversarywish could not be found
	 */
	@Override
	public anniversarywish fetchByuserIds_First(String userId,
		OrderByComparator<anniversarywish> orderByComparator) {
		List<anniversarywish> list = findByuserIds(userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last anniversarywish in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching anniversarywish
	 * @throws NoSuchanniversarywishException if a matching anniversarywish could not be found
	 */
	@Override
	public anniversarywish findByuserIds_Last(String userId,
		OrderByComparator<anniversarywish> orderByComparator)
		throws NoSuchanniversarywishException {
		anniversarywish anniversarywish = fetchByuserIds_Last(userId,
				orderByComparator);

		if (anniversarywish != null) {
			return anniversarywish;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchanniversarywishException(msg.toString());
	}

	/**
	 * Returns the last anniversarywish in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching anniversarywish, or <code>null</code> if a matching anniversarywish could not be found
	 */
	@Override
	public anniversarywish fetchByuserIds_Last(String userId,
		OrderByComparator<anniversarywish> orderByComparator) {
		int count = countByuserIds(userId);

		if (count == 0) {
			return null;
		}

		List<anniversarywish> list = findByuserIds(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the anniversarywishs before and after the current anniversarywish in the ordered set where userId = &#63;.
	 *
	 * @param id the primary key of the current anniversarywish
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next anniversarywish
	 * @throws NoSuchanniversarywishException if a anniversarywish with the primary key could not be found
	 */
	@Override
	public anniversarywish[] findByuserIds_PrevAndNext(long id, String userId,
		OrderByComparator<anniversarywish> orderByComparator)
		throws NoSuchanniversarywishException {
		anniversarywish anniversarywish = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			anniversarywish[] array = new anniversarywishImpl[3];

			array[0] = getByuserIds_PrevAndNext(session, anniversarywish,
					userId, orderByComparator, true);

			array[1] = anniversarywish;

			array[2] = getByuserIds_PrevAndNext(session, anniversarywish,
					userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected anniversarywish getByuserIds_PrevAndNext(Session session,
		anniversarywish anniversarywish, String userId,
		OrderByComparator<anniversarywish> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ANNIVERSARYWISH_WHERE);

		boolean bindUserId = false;

		if (userId == null) {
			query.append(_FINDER_COLUMN_USERIDS_USERID_1);
		}
		else if (userId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_USERIDS_USERID_3);
		}
		else {
			bindUserId = true;

			query.append(_FINDER_COLUMN_USERIDS_USERID_2);
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
			query.append(anniversarywishModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUserId) {
			qPos.add(userId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(anniversarywish);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<anniversarywish> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the anniversarywishs where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByuserIds(String userId) {
		for (anniversarywish anniversarywish : findByuserIds(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(anniversarywish);
		}
	}

	/**
	 * Returns the number of anniversarywishs where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching anniversarywishs
	 */
	@Override
	public int countByuserIds(String userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERIDS;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ANNIVERSARYWISH_WHERE);

			boolean bindUserId = false;

			if (userId == null) {
				query.append(_FINDER_COLUMN_USERIDS_USERID_1);
			}
			else if (userId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_USERIDS_USERID_3);
			}
			else {
				bindUserId = true;

				query.append(_FINDER_COLUMN_USERIDS_USERID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUserId) {
					qPos.add(userId);
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

	private static final String _FINDER_COLUMN_USERIDS_USERID_1 = "anniversarywish.userId IS NULL";
	private static final String _FINDER_COLUMN_USERIDS_USERID_2 = "anniversarywish.userId = ?";
	private static final String _FINDER_COLUMN_USERIDS_USERID_3 = "(anniversarywish.userId IS NULL OR anniversarywish.userId = '')";

	public anniversarywishPersistenceImpl() {
		setModelClass(anniversarywish.class);
	}

	/**
	 * Caches the anniversarywish in the entity cache if it is enabled.
	 *
	 * @param anniversarywish the anniversarywish
	 */
	@Override
	public void cacheResult(anniversarywish anniversarywish) {
		entityCache.putResult(anniversarywishModelImpl.ENTITY_CACHE_ENABLED,
			anniversarywishImpl.class, anniversarywish.getPrimaryKey(),
			anniversarywish);

		anniversarywish.resetOriginalValues();
	}

	/**
	 * Caches the anniversarywishs in the entity cache if it is enabled.
	 *
	 * @param anniversarywishs the anniversarywishs
	 */
	@Override
	public void cacheResult(List<anniversarywish> anniversarywishs) {
		for (anniversarywish anniversarywish : anniversarywishs) {
			if (entityCache.getResult(
						anniversarywishModelImpl.ENTITY_CACHE_ENABLED,
						anniversarywishImpl.class,
						anniversarywish.getPrimaryKey()) == null) {
				cacheResult(anniversarywish);
			}
			else {
				anniversarywish.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all anniversarywishs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(anniversarywishImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the anniversarywish.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(anniversarywish anniversarywish) {
		entityCache.removeResult(anniversarywishModelImpl.ENTITY_CACHE_ENABLED,
			anniversarywishImpl.class, anniversarywish.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<anniversarywish> anniversarywishs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (anniversarywish anniversarywish : anniversarywishs) {
			entityCache.removeResult(anniversarywishModelImpl.ENTITY_CACHE_ENABLED,
				anniversarywishImpl.class, anniversarywish.getPrimaryKey());
		}
	}

	/**
	 * Creates a new anniversarywish with the primary key. Does not add the anniversarywish to the database.
	 *
	 * @param id the primary key for the new anniversarywish
	 * @return the new anniversarywish
	 */
	@Override
	public anniversarywish create(long id) {
		anniversarywish anniversarywish = new anniversarywishImpl();

		anniversarywish.setNew(true);
		anniversarywish.setPrimaryKey(id);

		return anniversarywish;
	}

	/**
	 * Removes the anniversarywish with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the anniversarywish
	 * @return the anniversarywish that was removed
	 * @throws NoSuchanniversarywishException if a anniversarywish with the primary key could not be found
	 */
	@Override
	public anniversarywish remove(long id)
		throws NoSuchanniversarywishException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the anniversarywish with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the anniversarywish
	 * @return the anniversarywish that was removed
	 * @throws NoSuchanniversarywishException if a anniversarywish with the primary key could not be found
	 */
	@Override
	public anniversarywish remove(Serializable primaryKey)
		throws NoSuchanniversarywishException {
		Session session = null;

		try {
			session = openSession();

			anniversarywish anniversarywish = (anniversarywish)session.get(anniversarywishImpl.class,
					primaryKey);

			if (anniversarywish == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchanniversarywishException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(anniversarywish);
		}
		catch (NoSuchanniversarywishException nsee) {
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
	protected anniversarywish removeImpl(anniversarywish anniversarywish) {
		anniversarywish = toUnwrappedModel(anniversarywish);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(anniversarywish)) {
				anniversarywish = (anniversarywish)session.get(anniversarywishImpl.class,
						anniversarywish.getPrimaryKeyObj());
			}

			if (anniversarywish != null) {
				session.delete(anniversarywish);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (anniversarywish != null) {
			clearCache(anniversarywish);
		}

		return anniversarywish;
	}

	@Override
	public anniversarywish updateImpl(anniversarywish anniversarywish) {
		anniversarywish = toUnwrappedModel(anniversarywish);

		boolean isNew = anniversarywish.isNew();

		anniversarywishModelImpl anniversarywishModelImpl = (anniversarywishModelImpl)anniversarywish;

		Session session = null;

		try {
			session = openSession();

			if (anniversarywish.isNew()) {
				session.save(anniversarywish);

				anniversarywish.setNew(false);
			}
			else {
				anniversarywish = (anniversarywish)session.merge(anniversarywish);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !anniversarywishModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((anniversarywishModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						anniversarywishModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERIDS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDS,
					args);

				args = new Object[] { anniversarywishModelImpl.getUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERIDS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDS,
					args);
			}
		}

		entityCache.putResult(anniversarywishModelImpl.ENTITY_CACHE_ENABLED,
			anniversarywishImpl.class, anniversarywish.getPrimaryKey(),
			anniversarywish, false);

		anniversarywish.resetOriginalValues();

		return anniversarywish;
	}

	protected anniversarywish toUnwrappedModel(anniversarywish anniversarywish) {
		if (anniversarywish instanceof anniversarywishImpl) {
			return anniversarywish;
		}

		anniversarywishImpl anniversarywishImpl = new anniversarywishImpl();

		anniversarywishImpl.setNew(anniversarywish.isNew());
		anniversarywishImpl.setPrimaryKey(anniversarywish.getPrimaryKey());

		anniversarywishImpl.setId(anniversarywish.getId());
		anniversarywishImpl.setUserId(anniversarywish.getUserId());
		anniversarywishImpl.setWishedBy(anniversarywish.getWishedBy());
		anniversarywishImpl.setMessage(anniversarywish.getMessage());
		anniversarywishImpl.setCreatedDate(anniversarywish.getCreatedDate());

		return anniversarywishImpl;
	}

	/**
	 * Returns the anniversarywish with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the anniversarywish
	 * @return the anniversarywish
	 * @throws NoSuchanniversarywishException if a anniversarywish with the primary key could not be found
	 */
	@Override
	public anniversarywish findByPrimaryKey(Serializable primaryKey)
		throws NoSuchanniversarywishException {
		anniversarywish anniversarywish = fetchByPrimaryKey(primaryKey);

		if (anniversarywish == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchanniversarywishException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return anniversarywish;
	}

	/**
	 * Returns the anniversarywish with the primary key or throws a {@link NoSuchanniversarywishException} if it could not be found.
	 *
	 * @param id the primary key of the anniversarywish
	 * @return the anniversarywish
	 * @throws NoSuchanniversarywishException if a anniversarywish with the primary key could not be found
	 */
	@Override
	public anniversarywish findByPrimaryKey(long id)
		throws NoSuchanniversarywishException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the anniversarywish with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the anniversarywish
	 * @return the anniversarywish, or <code>null</code> if a anniversarywish with the primary key could not be found
	 */
	@Override
	public anniversarywish fetchByPrimaryKey(Serializable primaryKey) {
		anniversarywish anniversarywish = (anniversarywish)entityCache.getResult(anniversarywishModelImpl.ENTITY_CACHE_ENABLED,
				anniversarywishImpl.class, primaryKey);

		if (anniversarywish == _nullanniversarywish) {
			return null;
		}

		if (anniversarywish == null) {
			Session session = null;

			try {
				session = openSession();

				anniversarywish = (anniversarywish)session.get(anniversarywishImpl.class,
						primaryKey);

				if (anniversarywish != null) {
					cacheResult(anniversarywish);
				}
				else {
					entityCache.putResult(anniversarywishModelImpl.ENTITY_CACHE_ENABLED,
						anniversarywishImpl.class, primaryKey,
						_nullanniversarywish);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(anniversarywishModelImpl.ENTITY_CACHE_ENABLED,
					anniversarywishImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return anniversarywish;
	}

	/**
	 * Returns the anniversarywish with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the anniversarywish
	 * @return the anniversarywish, or <code>null</code> if a anniversarywish with the primary key could not be found
	 */
	@Override
	public anniversarywish fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, anniversarywish> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, anniversarywish> map = new HashMap<Serializable, anniversarywish>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			anniversarywish anniversarywish = fetchByPrimaryKey(primaryKey);

			if (anniversarywish != null) {
				map.put(primaryKey, anniversarywish);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			anniversarywish anniversarywish = (anniversarywish)entityCache.getResult(anniversarywishModelImpl.ENTITY_CACHE_ENABLED,
					anniversarywishImpl.class, primaryKey);

			if (anniversarywish == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, anniversarywish);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ANNIVERSARYWISH_WHERE_PKS_IN);

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

			for (anniversarywish anniversarywish : (List<anniversarywish>)q.list()) {
				map.put(anniversarywish.getPrimaryKeyObj(), anniversarywish);

				cacheResult(anniversarywish);

				uncachedPrimaryKeys.remove(anniversarywish.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(anniversarywishModelImpl.ENTITY_CACHE_ENABLED,
					anniversarywishImpl.class, primaryKey, _nullanniversarywish);
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
	 * Returns all the anniversarywishs.
	 *
	 * @return the anniversarywishs
	 */
	@Override
	public List<anniversarywish> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the anniversarywishs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link anniversarywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of anniversarywishs
	 * @param end the upper bound of the range of anniversarywishs (not inclusive)
	 * @return the range of anniversarywishs
	 */
	@Override
	public List<anniversarywish> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the anniversarywishs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link anniversarywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of anniversarywishs
	 * @param end the upper bound of the range of anniversarywishs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of anniversarywishs
	 */
	@Override
	public List<anniversarywish> findAll(int start, int end,
		OrderByComparator<anniversarywish> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the anniversarywishs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link anniversarywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of anniversarywishs
	 * @param end the upper bound of the range of anniversarywishs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of anniversarywishs
	 */
	@Override
	public List<anniversarywish> findAll(int start, int end,
		OrderByComparator<anniversarywish> orderByComparator,
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

		List<anniversarywish> list = null;

		if (retrieveFromCache) {
			list = (List<anniversarywish>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANNIVERSARYWISH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANNIVERSARYWISH;

				if (pagination) {
					sql = sql.concat(anniversarywishModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<anniversarywish>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<anniversarywish>)QueryUtil.list(q,
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
	 * Removes all the anniversarywishs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (anniversarywish anniversarywish : findAll()) {
			remove(anniversarywish);
		}
	}

	/**
	 * Returns the number of anniversarywishs.
	 *
	 * @return the number of anniversarywishs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANNIVERSARYWISH);

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
		return anniversarywishModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the anniversarywish persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(anniversarywishImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_ANNIVERSARYWISH = "SELECT anniversarywish FROM anniversarywish anniversarywish";
	private static final String _SQL_SELECT_ANNIVERSARYWISH_WHERE_PKS_IN = "SELECT anniversarywish FROM anniversarywish anniversarywish WHERE id_ IN (";
	private static final String _SQL_SELECT_ANNIVERSARYWISH_WHERE = "SELECT anniversarywish FROM anniversarywish anniversarywish WHERE ";
	private static final String _SQL_COUNT_ANNIVERSARYWISH = "SELECT COUNT(anniversarywish) FROM anniversarywish anniversarywish";
	private static final String _SQL_COUNT_ANNIVERSARYWISH_WHERE = "SELECT COUNT(anniversarywish) FROM anniversarywish anniversarywish WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "anniversarywish.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No anniversarywish exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No anniversarywish exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(anniversarywishPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final anniversarywish _nullanniversarywish = new anniversarywishImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<anniversarywish> toCacheModel() {
				return _nullanniversarywishCacheModel;
			}
		};

	private static final CacheModel<anniversarywish> _nullanniversarywishCacheModel =
		new CacheModel<anniversarywish>() {
			@Override
			public anniversarywish toEntityModel() {
				return _nullanniversarywish;
			}
		};
}