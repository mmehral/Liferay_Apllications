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

package com.chola.milestone.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.milestone.exception.NoSuchmilestoneException;
import com.chola.milestone.model.impl.milestoneImpl;
import com.chola.milestone.model.impl.milestoneModelImpl;
import com.chola.milestone.model.milestone;
import com.chola.milestone.service.persistence.milestonePersistence;

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
 * The persistence implementation for the milestone service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see milestonePersistence
 * @see com.chola.milestone.service.persistence.milestoneUtil
 * @generated
 */
@ProviderType
public class milestonePersistenceImpl extends BasePersistenceImpl<milestone>
	implements milestonePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link milestoneUtil} to access the milestone persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = milestoneImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(milestoneModelImpl.ENTITY_CACHE_ENABLED,
			milestoneModelImpl.FINDER_CACHE_ENABLED, milestoneImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(milestoneModelImpl.ENTITY_CACHE_ENABLED,
			milestoneModelImpl.FINDER_CACHE_ENABLED, milestoneImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(milestoneModelImpl.ENTITY_CACHE_ENABLED,
			milestoneModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERIDS = new FinderPath(milestoneModelImpl.ENTITY_CACHE_ENABLED,
			milestoneModelImpl.FINDER_CACHE_ENABLED, milestoneImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByuserIds",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDS =
		new FinderPath(milestoneModelImpl.ENTITY_CACHE_ENABLED,
			milestoneModelImpl.FINDER_CACHE_ENABLED, milestoneImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByuserIds",
			new String[] { String.class.getName() },
			milestoneModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERIDS = new FinderPath(milestoneModelImpl.ENTITY_CACHE_ENABLED,
			milestoneModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByuserIds",
			new String[] { String.class.getName() });

	/**
	 * Returns all the milestones where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching milestones
	 */
	@Override
	public List<milestone> findByuserIds(String userId) {
		return findByuserIds(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the milestones where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of milestones
	 * @param end the upper bound of the range of milestones (not inclusive)
	 * @return the range of matching milestones
	 */
	@Override
	public List<milestone> findByuserIds(String userId, int start, int end) {
		return findByuserIds(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the milestones where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of milestones
	 * @param end the upper bound of the range of milestones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching milestones
	 */
	@Override
	public List<milestone> findByuserIds(String userId, int start, int end,
		OrderByComparator<milestone> orderByComparator) {
		return findByuserIds(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the milestones where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of milestones
	 * @param end the upper bound of the range of milestones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching milestones
	 */
	@Override
	public List<milestone> findByuserIds(String userId, int start, int end,
		OrderByComparator<milestone> orderByComparator,
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

		List<milestone> list = null;

		if (retrieveFromCache) {
			list = (List<milestone>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (milestone milestone : list) {
					if (!Objects.equals(userId, milestone.getUserId())) {
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

			query.append(_SQL_SELECT_MILESTONE_WHERE);

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
				query.append(milestoneModelImpl.ORDER_BY_JPQL);
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
					list = (List<milestone>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<milestone>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first milestone in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching milestone
	 * @throws NoSuchmilestoneException if a matching milestone could not be found
	 */
	@Override
	public milestone findByuserIds_First(String userId,
		OrderByComparator<milestone> orderByComparator)
		throws NoSuchmilestoneException {
		milestone milestone = fetchByuserIds_First(userId, orderByComparator);

		if (milestone != null) {
			return milestone;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchmilestoneException(msg.toString());
	}

	/**
	 * Returns the first milestone in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching milestone, or <code>null</code> if a matching milestone could not be found
	 */
	@Override
	public milestone fetchByuserIds_First(String userId,
		OrderByComparator<milestone> orderByComparator) {
		List<milestone> list = findByuserIds(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last milestone in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching milestone
	 * @throws NoSuchmilestoneException if a matching milestone could not be found
	 */
	@Override
	public milestone findByuserIds_Last(String userId,
		OrderByComparator<milestone> orderByComparator)
		throws NoSuchmilestoneException {
		milestone milestone = fetchByuserIds_Last(userId, orderByComparator);

		if (milestone != null) {
			return milestone;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchmilestoneException(msg.toString());
	}

	/**
	 * Returns the last milestone in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching milestone, or <code>null</code> if a matching milestone could not be found
	 */
	@Override
	public milestone fetchByuserIds_Last(String userId,
		OrderByComparator<milestone> orderByComparator) {
		int count = countByuserIds(userId);

		if (count == 0) {
			return null;
		}

		List<milestone> list = findByuserIds(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the milestones before and after the current milestone in the ordered set where userId = &#63;.
	 *
	 * @param id the primary key of the current milestone
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next milestone
	 * @throws NoSuchmilestoneException if a milestone with the primary key could not be found
	 */
	@Override
	public milestone[] findByuserIds_PrevAndNext(long id, String userId,
		OrderByComparator<milestone> orderByComparator)
		throws NoSuchmilestoneException {
		milestone milestone = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			milestone[] array = new milestoneImpl[3];

			array[0] = getByuserIds_PrevAndNext(session, milestone, userId,
					orderByComparator, true);

			array[1] = milestone;

			array[2] = getByuserIds_PrevAndNext(session, milestone, userId,
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

	protected milestone getByuserIds_PrevAndNext(Session session,
		milestone milestone, String userId,
		OrderByComparator<milestone> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MILESTONE_WHERE);

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
			query.append(milestoneModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(milestone);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<milestone> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the milestones where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByuserIds(String userId) {
		for (milestone milestone : findByuserIds(userId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(milestone);
		}
	}

	/**
	 * Returns the number of milestones where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching milestones
	 */
	@Override
	public int countByuserIds(String userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERIDS;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MILESTONE_WHERE);

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

	private static final String _FINDER_COLUMN_USERIDS_USERID_1 = "milestone.userId IS NULL";
	private static final String _FINDER_COLUMN_USERIDS_USERID_2 = "milestone.userId = ?";
	private static final String _FINDER_COLUMN_USERIDS_USERID_3 = "(milestone.userId IS NULL OR milestone.userId = '')";

	public milestonePersistenceImpl() {
		setModelClass(milestone.class);
	}

	/**
	 * Caches the milestone in the entity cache if it is enabled.
	 *
	 * @param milestone the milestone
	 */
	@Override
	public void cacheResult(milestone milestone) {
		entityCache.putResult(milestoneModelImpl.ENTITY_CACHE_ENABLED,
			milestoneImpl.class, milestone.getPrimaryKey(), milestone);

		milestone.resetOriginalValues();
	}

	/**
	 * Caches the milestones in the entity cache if it is enabled.
	 *
	 * @param milestones the milestones
	 */
	@Override
	public void cacheResult(List<milestone> milestones) {
		for (milestone milestone : milestones) {
			if (entityCache.getResult(milestoneModelImpl.ENTITY_CACHE_ENABLED,
						milestoneImpl.class, milestone.getPrimaryKey()) == null) {
				cacheResult(milestone);
			}
			else {
				milestone.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all milestones.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(milestoneImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the milestone.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(milestone milestone) {
		entityCache.removeResult(milestoneModelImpl.ENTITY_CACHE_ENABLED,
			milestoneImpl.class, milestone.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<milestone> milestones) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (milestone milestone : milestones) {
			entityCache.removeResult(milestoneModelImpl.ENTITY_CACHE_ENABLED,
				milestoneImpl.class, milestone.getPrimaryKey());
		}
	}

	/**
	 * Creates a new milestone with the primary key. Does not add the milestone to the database.
	 *
	 * @param id the primary key for the new milestone
	 * @return the new milestone
	 */
	@Override
	public milestone create(long id) {
		milestone milestone = new milestoneImpl();

		milestone.setNew(true);
		milestone.setPrimaryKey(id);

		return milestone;
	}

	/**
	 * Removes the milestone with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the milestone
	 * @return the milestone that was removed
	 * @throws NoSuchmilestoneException if a milestone with the primary key could not be found
	 */
	@Override
	public milestone remove(long id) throws NoSuchmilestoneException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the milestone with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the milestone
	 * @return the milestone that was removed
	 * @throws NoSuchmilestoneException if a milestone with the primary key could not be found
	 */
	@Override
	public milestone remove(Serializable primaryKey)
		throws NoSuchmilestoneException {
		Session session = null;

		try {
			session = openSession();

			milestone milestone = (milestone)session.get(milestoneImpl.class,
					primaryKey);

			if (milestone == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchmilestoneException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(milestone);
		}
		catch (NoSuchmilestoneException nsee) {
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
	protected milestone removeImpl(milestone milestone) {
		milestone = toUnwrappedModel(milestone);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(milestone)) {
				milestone = (milestone)session.get(milestoneImpl.class,
						milestone.getPrimaryKeyObj());
			}

			if (milestone != null) {
				session.delete(milestone);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (milestone != null) {
			clearCache(milestone);
		}

		return milestone;
	}

	@Override
	public milestone updateImpl(milestone milestone) {
		milestone = toUnwrappedModel(milestone);

		boolean isNew = milestone.isNew();

		milestoneModelImpl milestoneModelImpl = (milestoneModelImpl)milestone;

		Session session = null;

		try {
			session = openSession();

			if (milestone.isNew()) {
				session.save(milestone);

				milestone.setNew(false);
			}
			else {
				milestone = (milestone)session.merge(milestone);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !milestoneModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((milestoneModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						milestoneModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERIDS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDS,
					args);

				args = new Object[] { milestoneModelImpl.getUserId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERIDS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERIDS,
					args);
			}
		}

		entityCache.putResult(milestoneModelImpl.ENTITY_CACHE_ENABLED,
			milestoneImpl.class, milestone.getPrimaryKey(), milestone, false);

		milestone.resetOriginalValues();

		return milestone;
	}

	protected milestone toUnwrappedModel(milestone milestone) {
		if (milestone instanceof milestoneImpl) {
			return milestone;
		}

		milestoneImpl milestoneImpl = new milestoneImpl();

		milestoneImpl.setNew(milestone.isNew());
		milestoneImpl.setPrimaryKey(milestone.getPrimaryKey());

		milestoneImpl.setId(milestone.getId());
		milestoneImpl.setUserId(milestone.getUserId());
		milestoneImpl.setWishedBy(milestone.getWishedBy());
		milestoneImpl.setMessage(milestone.getMessage());
		milestoneImpl.setCreatedDate(milestone.getCreatedDate());

		return milestoneImpl;
	}

	/**
	 * Returns the milestone with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the milestone
	 * @return the milestone
	 * @throws NoSuchmilestoneException if a milestone with the primary key could not be found
	 */
	@Override
	public milestone findByPrimaryKey(Serializable primaryKey)
		throws NoSuchmilestoneException {
		milestone milestone = fetchByPrimaryKey(primaryKey);

		if (milestone == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchmilestoneException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return milestone;
	}

	/**
	 * Returns the milestone with the primary key or throws a {@link NoSuchmilestoneException} if it could not be found.
	 *
	 * @param id the primary key of the milestone
	 * @return the milestone
	 * @throws NoSuchmilestoneException if a milestone with the primary key could not be found
	 */
	@Override
	public milestone findByPrimaryKey(long id) throws NoSuchmilestoneException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the milestone with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the milestone
	 * @return the milestone, or <code>null</code> if a milestone with the primary key could not be found
	 */
	@Override
	public milestone fetchByPrimaryKey(Serializable primaryKey) {
		milestone milestone = (milestone)entityCache.getResult(milestoneModelImpl.ENTITY_CACHE_ENABLED,
				milestoneImpl.class, primaryKey);

		if (milestone == _nullmilestone) {
			return null;
		}

		if (milestone == null) {
			Session session = null;

			try {
				session = openSession();

				milestone = (milestone)session.get(milestoneImpl.class,
						primaryKey);

				if (milestone != null) {
					cacheResult(milestone);
				}
				else {
					entityCache.putResult(milestoneModelImpl.ENTITY_CACHE_ENABLED,
						milestoneImpl.class, primaryKey, _nullmilestone);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(milestoneModelImpl.ENTITY_CACHE_ENABLED,
					milestoneImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return milestone;
	}

	/**
	 * Returns the milestone with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the milestone
	 * @return the milestone, or <code>null</code> if a milestone with the primary key could not be found
	 */
	@Override
	public milestone fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, milestone> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, milestone> map = new HashMap<Serializable, milestone>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			milestone milestone = fetchByPrimaryKey(primaryKey);

			if (milestone != null) {
				map.put(primaryKey, milestone);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			milestone milestone = (milestone)entityCache.getResult(milestoneModelImpl.ENTITY_CACHE_ENABLED,
					milestoneImpl.class, primaryKey);

			if (milestone == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, milestone);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_MILESTONE_WHERE_PKS_IN);

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

			for (milestone milestone : (List<milestone>)q.list()) {
				map.put(milestone.getPrimaryKeyObj(), milestone);

				cacheResult(milestone);

				uncachedPrimaryKeys.remove(milestone.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(milestoneModelImpl.ENTITY_CACHE_ENABLED,
					milestoneImpl.class, primaryKey, _nullmilestone);
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
	 * Returns all the milestones.
	 *
	 * @return the milestones
	 */
	@Override
	public List<milestone> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the milestones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of milestones
	 * @param end the upper bound of the range of milestones (not inclusive)
	 * @return the range of milestones
	 */
	@Override
	public List<milestone> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the milestones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of milestones
	 * @param end the upper bound of the range of milestones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of milestones
	 */
	@Override
	public List<milestone> findAll(int start, int end,
		OrderByComparator<milestone> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the milestones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of milestones
	 * @param end the upper bound of the range of milestones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of milestones
	 */
	@Override
	public List<milestone> findAll(int start, int end,
		OrderByComparator<milestone> orderByComparator,
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

		List<milestone> list = null;

		if (retrieveFromCache) {
			list = (List<milestone>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_MILESTONE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MILESTONE;

				if (pagination) {
					sql = sql.concat(milestoneModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<milestone>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<milestone>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the milestones from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (milestone milestone : findAll()) {
			remove(milestone);
		}
	}

	/**
	 * Returns the number of milestones.
	 *
	 * @return the number of milestones
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MILESTONE);

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
		return milestoneModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the milestone persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(milestoneImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_MILESTONE = "SELECT milestone FROM milestone milestone";
	private static final String _SQL_SELECT_MILESTONE_WHERE_PKS_IN = "SELECT milestone FROM milestone milestone WHERE id_ IN (";
	private static final String _SQL_SELECT_MILESTONE_WHERE = "SELECT milestone FROM milestone milestone WHERE ";
	private static final String _SQL_COUNT_MILESTONE = "SELECT COUNT(milestone) FROM milestone milestone";
	private static final String _SQL_COUNT_MILESTONE_WHERE = "SELECT COUNT(milestone) FROM milestone milestone WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "milestone.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No milestone exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No milestone exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(milestonePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final milestone _nullmilestone = new milestoneImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<milestone> toCacheModel() {
				return _nullmilestoneCacheModel;
			}
		};

	private static final CacheModel<milestone> _nullmilestoneCacheModel = new CacheModel<milestone>() {
			@Override
			public milestone toEntityModel() {
				return _nullmilestone;
			}
		};
}