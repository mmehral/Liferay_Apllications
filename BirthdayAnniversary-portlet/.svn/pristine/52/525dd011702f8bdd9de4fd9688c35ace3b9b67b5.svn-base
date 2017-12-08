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

package com.chola.birthday.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.birthday.exception.NoSuchbirthdaywishException;
import com.chola.birthday.model.birthdaywish;
import com.chola.birthday.model.impl.birthdaywishImpl;
import com.chola.birthday.model.impl.birthdaywishModelImpl;
import com.chola.birthday.service.persistence.birthdaywishPersistence;

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
 * The persistence implementation for the birthdaywish service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see birthdaywishPersistence
 * @see com.chola.birthday.service.persistence.birthdaywishUtil
 * @generated
 */
@ProviderType
public class birthdaywishPersistenceImpl extends BasePersistenceImpl<birthdaywish>
	implements birthdaywishPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link birthdaywishUtil} to access the birthdaywish persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = birthdaywishImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(birthdaywishModelImpl.ENTITY_CACHE_ENABLED,
			birthdaywishModelImpl.FINDER_CACHE_ENABLED, birthdaywishImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(birthdaywishModelImpl.ENTITY_CACHE_ENABLED,
			birthdaywishModelImpl.FINDER_CACHE_ENABLED, birthdaywishImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(birthdaywishModelImpl.ENTITY_CACHE_ENABLED,
			birthdaywishModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERIDS = new FinderPath(birthdaywishModelImpl.ENTITY_CACHE_ENABLED,
			birthdaywishModelImpl.FINDER_CACHE_ENABLED, birthdaywishImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByuserIds",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDS =
		new FinderPath(birthdaywishModelImpl.ENTITY_CACHE_ENABLED,
			birthdaywishModelImpl.FINDER_CACHE_ENABLED, birthdaywishImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByuserIds",
			new String[] { String.class.getName() },
			birthdaywishModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERIDS = new FinderPath(birthdaywishModelImpl.ENTITY_CACHE_ENABLED,
			birthdaywishModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByuserIds",
			new String[] { String.class.getName() });

	/**
	 * Returns all the birthdaywishs where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching birthdaywishs
	 */
	@Override
	public List<birthdaywish> findByuserIds(String userId) {
		return findByuserIds(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the birthdaywishs where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of birthdaywishs
	 * @param end the upper bound of the range of birthdaywishs (not inclusive)
	 * @return the range of matching birthdaywishs
	 */
	@Override
	public List<birthdaywish> findByuserIds(String userId, int start, int end) {
		return findByuserIds(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the birthdaywishs where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of birthdaywishs
	 * @param end the upper bound of the range of birthdaywishs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching birthdaywishs
	 */
	@Override
	public List<birthdaywish> findByuserIds(String userId, int start, int end,
		OrderByComparator<birthdaywish> orderByComparator) {
		return findByuserIds(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the birthdaywishs where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of birthdaywishs
	 * @param end the upper bound of the range of birthdaywishs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching birthdaywishs
	 */
	@Override
	public List<birthdaywish> findByuserIds(String userId, int start, int end,
		OrderByComparator<birthdaywish> orderByComparator,
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

		List<birthdaywish> list = null;

		if (retrieveFromCache) {
			list = (List<birthdaywish>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (birthdaywish birthdaywish : list) {
					if (!Objects.equals(userId, birthdaywish.getUserId())) {
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

			query.append(_SQL_SELECT_BIRTHDAYWISH_WHERE);

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
				query.append(birthdaywishModelImpl.ORDER_BY_JPQL);
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
					list = (List<birthdaywish>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<birthdaywish>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first birthdaywish in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching birthdaywish
	 * @throws NoSuchbirthdaywishException if a matching birthdaywish could not be found
	 */
	@Override
	public birthdaywish findByuserIds_First(String userId,
		OrderByComparator<birthdaywish> orderByComparator)
		throws NoSuchbirthdaywishException {
		birthdaywish birthdaywish = fetchByuserIds_First(userId,
				orderByComparator);

		if (birthdaywish != null) {
			return birthdaywish;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbirthdaywishException(msg.toString());
	}

	/**
	 * Returns the first birthdaywish in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching birthdaywish, or <code>null</code> if a matching birthdaywish could not be found
	 */
	@Override
	public birthdaywish fetchByuserIds_First(String userId,
		OrderByComparator<birthdaywish> orderByComparator) {
		List<birthdaywish> list = findByuserIds(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last birthdaywish in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching birthdaywish
	 * @throws NoSuchbirthdaywishException if a matching birthdaywish could not be found
	 */
	@Override
	public birthdaywish findByuserIds_Last(String userId,
		OrderByComparator<birthdaywish> orderByComparator)
		throws NoSuchbirthdaywishException {
		birthdaywish birthdaywish = fetchByuserIds_Last(userId,
				orderByComparator);

		if (birthdaywish != null) {
			return birthdaywish;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbirthdaywishException(msg.toString());
	}

	/**
	 * Returns the last birthdaywish in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching birthdaywish, or <code>null</code> if a matching birthdaywish could not be found
	 */
	@Override
	public birthdaywish fetchByuserIds_Last(String userId,
		OrderByComparator<birthdaywish> orderByComparator) {
		int count = countByuserIds(userId);

		if (count == 0) {
			return null;
		}

		List<birthdaywish> list = findByuserIds(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the birthdaywishs before and after the current birthdaywish in the ordered set where userId = &#63;.
	 *
	 * @param id the primary key of the current birthdaywish
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next birthdaywish
	 * @throws NoSuchbirthdaywishException if a birthdaywish with the primary key could not be found
	 */
	@Override
	public birthdaywish[] findByuserIds_PrevAndNext(long id, String userId,
		OrderByComparator<birthdaywish> orderByComparator)
		throws NoSuchbirthdaywishException {
		birthdaywish birthdaywish = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			birthdaywish[] array = new birthdaywishImpl[3];

			array[0] = getByuserIds_PrevAndNext(session, birthdaywish, userId,
					orderByComparator, true);

			array[1] = birthdaywish;

			array[2] = getByuserIds_PrevAndNext(session, birthdaywish, userId,
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

	protected birthdaywish getByuserIds_PrevAndNext(Session session,
		birthdaywish birthdaywish, String userId,
		OrderByComparator<birthdaywish> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BIRTHDAYWISH_WHERE);

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
			query.append(birthdaywishModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(birthdaywish);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<birthdaywish> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the birthdaywishs where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByuserIds(String userId) {
		for (birthdaywish birthdaywish : findByuserIds(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(birthdaywish);
		}
	}

	/**
	 * Returns the number of birthdaywishs where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching birthdaywishs
	 */
	@Override
	public int countByuserIds(String userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERIDS;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BIRTHDAYWISH_WHERE);

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

	private static final String _FINDER_COLUMN_USERIDS_USERID_1 = "birthdaywish.userId IS NULL";
	private static final String _FINDER_COLUMN_USERIDS_USERID_2 = "birthdaywish.userId = ?";
	private static final String _FINDER_COLUMN_USERIDS_USERID_3 = "(birthdaywish.userId IS NULL OR birthdaywish.userId = '')";

	public birthdaywishPersistenceImpl() {
		setModelClass(birthdaywish.class);
	}

	/**
	 * Caches the birthdaywish in the entity cache if it is enabled.
	 *
	 * @param birthdaywish the birthdaywish
	 */
	@Override
	public void cacheResult(birthdaywish birthdaywish) {
		entityCache.putResult(birthdaywishModelImpl.ENTITY_CACHE_ENABLED,
			birthdaywishImpl.class, birthdaywish.getPrimaryKey(), birthdaywish);

		birthdaywish.resetOriginalValues();
	}

	/**
	 * Caches the birthdaywishs in the entity cache if it is enabled.
	 *
	 * @param birthdaywishs the birthdaywishs
	 */
	@Override
	public void cacheResult(List<birthdaywish> birthdaywishs) {
		for (birthdaywish birthdaywish : birthdaywishs) {
			if (entityCache.getResult(
						birthdaywishModelImpl.ENTITY_CACHE_ENABLED,
						birthdaywishImpl.class, birthdaywish.getPrimaryKey()) == null) {
				cacheResult(birthdaywish);
			}
			else {
				birthdaywish.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all birthdaywishs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(birthdaywishImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the birthdaywish.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(birthdaywish birthdaywish) {
		entityCache.removeResult(birthdaywishModelImpl.ENTITY_CACHE_ENABLED,
			birthdaywishImpl.class, birthdaywish.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<birthdaywish> birthdaywishs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (birthdaywish birthdaywish : birthdaywishs) {
			entityCache.removeResult(birthdaywishModelImpl.ENTITY_CACHE_ENABLED,
				birthdaywishImpl.class, birthdaywish.getPrimaryKey());
		}
	}

	/**
	 * Creates a new birthdaywish with the primary key. Does not add the birthdaywish to the database.
	 *
	 * @param id the primary key for the new birthdaywish
	 * @return the new birthdaywish
	 */
	@Override
	public birthdaywish create(long id) {
		birthdaywish birthdaywish = new birthdaywishImpl();

		birthdaywish.setNew(true);
		birthdaywish.setPrimaryKey(id);

		return birthdaywish;
	}

	/**
	 * Removes the birthdaywish with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the birthdaywish
	 * @return the birthdaywish that was removed
	 * @throws NoSuchbirthdaywishException if a birthdaywish with the primary key could not be found
	 */
	@Override
	public birthdaywish remove(long id) throws NoSuchbirthdaywishException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the birthdaywish with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the birthdaywish
	 * @return the birthdaywish that was removed
	 * @throws NoSuchbirthdaywishException if a birthdaywish with the primary key could not be found
	 */
	@Override
	public birthdaywish remove(Serializable primaryKey)
		throws NoSuchbirthdaywishException {
		Session session = null;

		try {
			session = openSession();

			birthdaywish birthdaywish = (birthdaywish)session.get(birthdaywishImpl.class,
					primaryKey);

			if (birthdaywish == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbirthdaywishException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(birthdaywish);
		}
		catch (NoSuchbirthdaywishException nsee) {
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
	protected birthdaywish removeImpl(birthdaywish birthdaywish) {
		birthdaywish = toUnwrappedModel(birthdaywish);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(birthdaywish)) {
				birthdaywish = (birthdaywish)session.get(birthdaywishImpl.class,
						birthdaywish.getPrimaryKeyObj());
			}

			if (birthdaywish != null) {
				session.delete(birthdaywish);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (birthdaywish != null) {
			clearCache(birthdaywish);
		}

		return birthdaywish;
	}

	@Override
	public birthdaywish updateImpl(birthdaywish birthdaywish) {
		birthdaywish = toUnwrappedModel(birthdaywish);

		boolean isNew = birthdaywish.isNew();

		birthdaywishModelImpl birthdaywishModelImpl = (birthdaywishModelImpl)birthdaywish;

		Session session = null;

		try {
			session = openSession();

			if (birthdaywish.isNew()) {
				session.save(birthdaywish);

				birthdaywish.setNew(false);
			}
			else {
				birthdaywish = (birthdaywish)session.merge(birthdaywish);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !birthdaywishModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((birthdaywishModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						birthdaywishModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERIDS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDS,
					args);

				args = new Object[] { birthdaywishModelImpl.getUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERIDS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDS,
					args);
			}
		}

		entityCache.putResult(birthdaywishModelImpl.ENTITY_CACHE_ENABLED,
			birthdaywishImpl.class, birthdaywish.getPrimaryKey(), birthdaywish,
			false);

		birthdaywish.resetOriginalValues();

		return birthdaywish;
	}

	protected birthdaywish toUnwrappedModel(birthdaywish birthdaywish) {
		if (birthdaywish instanceof birthdaywishImpl) {
			return birthdaywish;
		}

		birthdaywishImpl birthdaywishImpl = new birthdaywishImpl();

		birthdaywishImpl.setNew(birthdaywish.isNew());
		birthdaywishImpl.setPrimaryKey(birthdaywish.getPrimaryKey());

		birthdaywishImpl.setId(birthdaywish.getId());
		birthdaywishImpl.setUserId(birthdaywish.getUserId());
		birthdaywishImpl.setWishedBy(birthdaywish.getWishedBy());
		birthdaywishImpl.setMessage(birthdaywish.getMessage());
		birthdaywishImpl.setCreatedDate(birthdaywish.getCreatedDate());

		return birthdaywishImpl;
	}

	/**
	 * Returns the birthdaywish with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the birthdaywish
	 * @return the birthdaywish
	 * @throws NoSuchbirthdaywishException if a birthdaywish with the primary key could not be found
	 */
	@Override
	public birthdaywish findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbirthdaywishException {
		birthdaywish birthdaywish = fetchByPrimaryKey(primaryKey);

		if (birthdaywish == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbirthdaywishException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return birthdaywish;
	}

	/**
	 * Returns the birthdaywish with the primary key or throws a {@link NoSuchbirthdaywishException} if it could not be found.
	 *
	 * @param id the primary key of the birthdaywish
	 * @return the birthdaywish
	 * @throws NoSuchbirthdaywishException if a birthdaywish with the primary key could not be found
	 */
	@Override
	public birthdaywish findByPrimaryKey(long id)
		throws NoSuchbirthdaywishException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the birthdaywish with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the birthdaywish
	 * @return the birthdaywish, or <code>null</code> if a birthdaywish with the primary key could not be found
	 */
	@Override
	public birthdaywish fetchByPrimaryKey(Serializable primaryKey) {
		birthdaywish birthdaywish = (birthdaywish)entityCache.getResult(birthdaywishModelImpl.ENTITY_CACHE_ENABLED,
				birthdaywishImpl.class, primaryKey);

		if (birthdaywish == _nullbirthdaywish) {
			return null;
		}

		if (birthdaywish == null) {
			Session session = null;

			try {
				session = openSession();

				birthdaywish = (birthdaywish)session.get(birthdaywishImpl.class,
						primaryKey);

				if (birthdaywish != null) {
					cacheResult(birthdaywish);
				}
				else {
					entityCache.putResult(birthdaywishModelImpl.ENTITY_CACHE_ENABLED,
						birthdaywishImpl.class, primaryKey, _nullbirthdaywish);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(birthdaywishModelImpl.ENTITY_CACHE_ENABLED,
					birthdaywishImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return birthdaywish;
	}

	/**
	 * Returns the birthdaywish with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the birthdaywish
	 * @return the birthdaywish, or <code>null</code> if a birthdaywish with the primary key could not be found
	 */
	@Override
	public birthdaywish fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, birthdaywish> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, birthdaywish> map = new HashMap<Serializable, birthdaywish>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			birthdaywish birthdaywish = fetchByPrimaryKey(primaryKey);

			if (birthdaywish != null) {
				map.put(primaryKey, birthdaywish);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			birthdaywish birthdaywish = (birthdaywish)entityCache.getResult(birthdaywishModelImpl.ENTITY_CACHE_ENABLED,
					birthdaywishImpl.class, primaryKey);

			if (birthdaywish == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, birthdaywish);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BIRTHDAYWISH_WHERE_PKS_IN);

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

			for (birthdaywish birthdaywish : (List<birthdaywish>)q.list()) {
				map.put(birthdaywish.getPrimaryKeyObj(), birthdaywish);

				cacheResult(birthdaywish);

				uncachedPrimaryKeys.remove(birthdaywish.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(birthdaywishModelImpl.ENTITY_CACHE_ENABLED,
					birthdaywishImpl.class, primaryKey, _nullbirthdaywish);
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
	 * Returns all the birthdaywishs.
	 *
	 * @return the birthdaywishs
	 */
	@Override
	public List<birthdaywish> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the birthdaywishs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of birthdaywishs
	 * @param end the upper bound of the range of birthdaywishs (not inclusive)
	 * @return the range of birthdaywishs
	 */
	@Override
	public List<birthdaywish> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the birthdaywishs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of birthdaywishs
	 * @param end the upper bound of the range of birthdaywishs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of birthdaywishs
	 */
	@Override
	public List<birthdaywish> findAll(int start, int end,
		OrderByComparator<birthdaywish> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the birthdaywishs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of birthdaywishs
	 * @param end the upper bound of the range of birthdaywishs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of birthdaywishs
	 */
	@Override
	public List<birthdaywish> findAll(int start, int end,
		OrderByComparator<birthdaywish> orderByComparator,
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

		List<birthdaywish> list = null;

		if (retrieveFromCache) {
			list = (List<birthdaywish>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BIRTHDAYWISH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BIRTHDAYWISH;

				if (pagination) {
					sql = sql.concat(birthdaywishModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<birthdaywish>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<birthdaywish>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the birthdaywishs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (birthdaywish birthdaywish : findAll()) {
			remove(birthdaywish);
		}
	}

	/**
	 * Returns the number of birthdaywishs.
	 *
	 * @return the number of birthdaywishs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BIRTHDAYWISH);

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
		return birthdaywishModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the birthdaywish persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(birthdaywishImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_BIRTHDAYWISH = "SELECT birthdaywish FROM birthdaywish birthdaywish";
	private static final String _SQL_SELECT_BIRTHDAYWISH_WHERE_PKS_IN = "SELECT birthdaywish FROM birthdaywish birthdaywish WHERE id_ IN (";
	private static final String _SQL_SELECT_BIRTHDAYWISH_WHERE = "SELECT birthdaywish FROM birthdaywish birthdaywish WHERE ";
	private static final String _SQL_COUNT_BIRTHDAYWISH = "SELECT COUNT(birthdaywish) FROM birthdaywish birthdaywish";
	private static final String _SQL_COUNT_BIRTHDAYWISH_WHERE = "SELECT COUNT(birthdaywish) FROM birthdaywish birthdaywish WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "birthdaywish.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No birthdaywish exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No birthdaywish exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(birthdaywishPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final birthdaywish _nullbirthdaywish = new birthdaywishImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<birthdaywish> toCacheModel() {
				return _nullbirthdaywishCacheModel;
			}
		};

	private static final CacheModel<birthdaywish> _nullbirthdaywishCacheModel = new CacheModel<birthdaywish>() {
			@Override
			public birthdaywish toEntityModel() {
				return _nullbirthdaywish;
			}
		};
}