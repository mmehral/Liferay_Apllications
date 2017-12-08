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

package com.chola.appcorner.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.appcorner.exception.NoSuchrepliedException;
import com.chola.appcorner.model.impl.repliedImpl;
import com.chola.appcorner.model.impl.repliedModelImpl;
import com.chola.appcorner.model.replied;
import com.chola.appcorner.service.persistence.repliedPersistence;

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
 * The persistence implementation for the replied service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see repliedPersistence
 * @see com.chola.appcorner.service.persistence.repliedUtil
 * @generated
 */
@ProviderType
public class repliedPersistenceImpl extends BasePersistenceImpl<replied>
	implements repliedPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link repliedUtil} to access the replied persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = repliedImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(repliedModelImpl.ENTITY_CACHE_ENABLED,
			repliedModelImpl.FINDER_CACHE_ENABLED, repliedImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(repliedModelImpl.ENTITY_CACHE_ENABLED,
			repliedModelImpl.FINDER_CACHE_ENABLED, repliedImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(repliedModelImpl.ENTITY_CACHE_ENABLED,
			repliedModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REPLIED_POST =
		new FinderPath(repliedModelImpl.ENTITY_CACHE_ENABLED,
			repliedModelImpl.FINDER_CACHE_ENABLED, repliedImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByREPLIED_POST",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPLIED_POST =
		new FinderPath(repliedModelImpl.ENTITY_CACHE_ENABLED,
			repliedModelImpl.FINDER_CACHE_ENABLED, repliedImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByREPLIED_POST",
			new String[] { Long.class.getName() },
			repliedModelImpl.REPLIEDONPOST_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REPLIED_POST = new FinderPath(repliedModelImpl.ENTITY_CACHE_ENABLED,
			repliedModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByREPLIED_POST",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the replieds where repliedOnPost = &#63;.
	 *
	 * @param repliedOnPost the replied on post
	 * @return the matching replieds
	 */
	@Override
	public List<replied> findByREPLIED_POST(long repliedOnPost) {
		return findByREPLIED_POST(repliedOnPost, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the replieds where repliedOnPost = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param repliedOnPost the replied on post
	 * @param start the lower bound of the range of replieds
	 * @param end the upper bound of the range of replieds (not inclusive)
	 * @return the range of matching replieds
	 */
	@Override
	public List<replied> findByREPLIED_POST(long repliedOnPost, int start,
		int end) {
		return findByREPLIED_POST(repliedOnPost, start, end, null);
	}

	/**
	 * Returns an ordered range of all the replieds where repliedOnPost = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param repliedOnPost the replied on post
	 * @param start the lower bound of the range of replieds
	 * @param end the upper bound of the range of replieds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching replieds
	 */
	@Override
	public List<replied> findByREPLIED_POST(long repliedOnPost, int start,
		int end, OrderByComparator<replied> orderByComparator) {
		return findByREPLIED_POST(repliedOnPost, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the replieds where repliedOnPost = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param repliedOnPost the replied on post
	 * @param start the lower bound of the range of replieds
	 * @param end the upper bound of the range of replieds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching replieds
	 */
	@Override
	public List<replied> findByREPLIED_POST(long repliedOnPost, int start,
		int end, OrderByComparator<replied> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPLIED_POST;
			finderArgs = new Object[] { repliedOnPost };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REPLIED_POST;
			finderArgs = new Object[] {
					repliedOnPost,
					
					start, end, orderByComparator
				};
		}

		List<replied> list = null;

		if (retrieveFromCache) {
			list = (List<replied>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (replied replied : list) {
					if ((repliedOnPost != replied.getRepliedOnPost())) {
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

			query.append(_SQL_SELECT_REPLIED_WHERE);

			query.append(_FINDER_COLUMN_REPLIED_POST_REPLIEDONPOST_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(repliedModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(repliedOnPost);

				if (!pagination) {
					list = (List<replied>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<replied>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first replied in the ordered set where repliedOnPost = &#63;.
	 *
	 * @param repliedOnPost the replied on post
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching replied
	 * @throws NoSuchrepliedException if a matching replied could not be found
	 */
	@Override
	public replied findByREPLIED_POST_First(long repliedOnPost,
		OrderByComparator<replied> orderByComparator)
		throws NoSuchrepliedException {
		replied replied = fetchByREPLIED_POST_First(repliedOnPost,
				orderByComparator);

		if (replied != null) {
			return replied;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("repliedOnPost=");
		msg.append(repliedOnPost);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchrepliedException(msg.toString());
	}

	/**
	 * Returns the first replied in the ordered set where repliedOnPost = &#63;.
	 *
	 * @param repliedOnPost the replied on post
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching replied, or <code>null</code> if a matching replied could not be found
	 */
	@Override
	public replied fetchByREPLIED_POST_First(long repliedOnPost,
		OrderByComparator<replied> orderByComparator) {
		List<replied> list = findByREPLIED_POST(repliedOnPost, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last replied in the ordered set where repliedOnPost = &#63;.
	 *
	 * @param repliedOnPost the replied on post
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching replied
	 * @throws NoSuchrepliedException if a matching replied could not be found
	 */
	@Override
	public replied findByREPLIED_POST_Last(long repliedOnPost,
		OrderByComparator<replied> orderByComparator)
		throws NoSuchrepliedException {
		replied replied = fetchByREPLIED_POST_Last(repliedOnPost,
				orderByComparator);

		if (replied != null) {
			return replied;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("repliedOnPost=");
		msg.append(repliedOnPost);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchrepliedException(msg.toString());
	}

	/**
	 * Returns the last replied in the ordered set where repliedOnPost = &#63;.
	 *
	 * @param repliedOnPost the replied on post
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching replied, or <code>null</code> if a matching replied could not be found
	 */
	@Override
	public replied fetchByREPLIED_POST_Last(long repliedOnPost,
		OrderByComparator<replied> orderByComparator) {
		int count = countByREPLIED_POST(repliedOnPost);

		if (count == 0) {
			return null;
		}

		List<replied> list = findByREPLIED_POST(repliedOnPost, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the replieds before and after the current replied in the ordered set where repliedOnPost = &#63;.
	 *
	 * @param id the primary key of the current replied
	 * @param repliedOnPost the replied on post
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next replied
	 * @throws NoSuchrepliedException if a replied with the primary key could not be found
	 */
	@Override
	public replied[] findByREPLIED_POST_PrevAndNext(long id,
		long repliedOnPost, OrderByComparator<replied> orderByComparator)
		throws NoSuchrepliedException {
		replied replied = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			replied[] array = new repliedImpl[3];

			array[0] = getByREPLIED_POST_PrevAndNext(session, replied,
					repliedOnPost, orderByComparator, true);

			array[1] = replied;

			array[2] = getByREPLIED_POST_PrevAndNext(session, replied,
					repliedOnPost, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected replied getByREPLIED_POST_PrevAndNext(Session session,
		replied replied, long repliedOnPost,
		OrderByComparator<replied> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_REPLIED_WHERE);

		query.append(_FINDER_COLUMN_REPLIED_POST_REPLIEDONPOST_2);

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
			query.append(repliedModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(repliedOnPost);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(replied);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<replied> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the replieds where repliedOnPost = &#63; from the database.
	 *
	 * @param repliedOnPost the replied on post
	 */
	@Override
	public void removeByREPLIED_POST(long repliedOnPost) {
		for (replied replied : findByREPLIED_POST(repliedOnPost,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(replied);
		}
	}

	/**
	 * Returns the number of replieds where repliedOnPost = &#63;.
	 *
	 * @param repliedOnPost the replied on post
	 * @return the number of matching replieds
	 */
	@Override
	public int countByREPLIED_POST(long repliedOnPost) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REPLIED_POST;

		Object[] finderArgs = new Object[] { repliedOnPost };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_REPLIED_WHERE);

			query.append(_FINDER_COLUMN_REPLIED_POST_REPLIEDONPOST_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(repliedOnPost);

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

	private static final String _FINDER_COLUMN_REPLIED_POST_REPLIEDONPOST_2 = "replied.repliedOnPost = ?";

	public repliedPersistenceImpl() {
		setModelClass(replied.class);
	}

	/**
	 * Caches the replied in the entity cache if it is enabled.
	 *
	 * @param replied the replied
	 */
	@Override
	public void cacheResult(replied replied) {
		entityCache.putResult(repliedModelImpl.ENTITY_CACHE_ENABLED,
			repliedImpl.class, replied.getPrimaryKey(), replied);

		replied.resetOriginalValues();
	}

	/**
	 * Caches the replieds in the entity cache if it is enabled.
	 *
	 * @param replieds the replieds
	 */
	@Override
	public void cacheResult(List<replied> replieds) {
		for (replied replied : replieds) {
			if (entityCache.getResult(repliedModelImpl.ENTITY_CACHE_ENABLED,
						repliedImpl.class, replied.getPrimaryKey()) == null) {
				cacheResult(replied);
			}
			else {
				replied.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all replieds.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(repliedImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the replied.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(replied replied) {
		entityCache.removeResult(repliedModelImpl.ENTITY_CACHE_ENABLED,
			repliedImpl.class, replied.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<replied> replieds) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (replied replied : replieds) {
			entityCache.removeResult(repliedModelImpl.ENTITY_CACHE_ENABLED,
				repliedImpl.class, replied.getPrimaryKey());
		}
	}

	/**
	 * Creates a new replied with the primary key. Does not add the replied to the database.
	 *
	 * @param id the primary key for the new replied
	 * @return the new replied
	 */
	@Override
	public replied create(long id) {
		replied replied = new repliedImpl();

		replied.setNew(true);
		replied.setPrimaryKey(id);

		return replied;
	}

	/**
	 * Removes the replied with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the replied
	 * @return the replied that was removed
	 * @throws NoSuchrepliedException if a replied with the primary key could not be found
	 */
	@Override
	public replied remove(long id) throws NoSuchrepliedException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the replied with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the replied
	 * @return the replied that was removed
	 * @throws NoSuchrepliedException if a replied with the primary key could not be found
	 */
	@Override
	public replied remove(Serializable primaryKey)
		throws NoSuchrepliedException {
		Session session = null;

		try {
			session = openSession();

			replied replied = (replied)session.get(repliedImpl.class, primaryKey);

			if (replied == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchrepliedException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(replied);
		}
		catch (NoSuchrepliedException nsee) {
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
	protected replied removeImpl(replied replied) {
		replied = toUnwrappedModel(replied);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(replied)) {
				replied = (replied)session.get(repliedImpl.class,
						replied.getPrimaryKeyObj());
			}

			if (replied != null) {
				session.delete(replied);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (replied != null) {
			clearCache(replied);
		}

		return replied;
	}

	@Override
	public replied updateImpl(replied replied) {
		replied = toUnwrappedModel(replied);

		boolean isNew = replied.isNew();

		repliedModelImpl repliedModelImpl = (repliedModelImpl)replied;

		Session session = null;

		try {
			session = openSession();

			if (replied.isNew()) {
				session.save(replied);

				replied.setNew(false);
			}
			else {
				replied = (replied)session.merge(replied);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !repliedModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((repliedModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPLIED_POST.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						repliedModelImpl.getOriginalRepliedOnPost()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REPLIED_POST, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPLIED_POST,
					args);

				args = new Object[] { repliedModelImpl.getRepliedOnPost() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REPLIED_POST, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPLIED_POST,
					args);
			}
		}

		entityCache.putResult(repliedModelImpl.ENTITY_CACHE_ENABLED,
			repliedImpl.class, replied.getPrimaryKey(), replied, false);

		replied.resetOriginalValues();

		return replied;
	}

	protected replied toUnwrappedModel(replied replied) {
		if (replied instanceof repliedImpl) {
			return replied;
		}

		repliedImpl repliedImpl = new repliedImpl();

		repliedImpl.setNew(replied.isNew());
		repliedImpl.setPrimaryKey(replied.getPrimaryKey());

		repliedImpl.setId(replied.getId());
		repliedImpl.setRepliedOnPost(replied.getRepliedOnPost());
		repliedImpl.setRepliedTo(replied.getRepliedTo());
		repliedImpl.setRepliedBy(replied.getRepliedBy());
		repliedImpl.setRepliedMessage(replied.getRepliedMessage());
		repliedImpl.setRepliedDate(replied.getRepliedDate());

		return repliedImpl;
	}

	/**
	 * Returns the replied with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the replied
	 * @return the replied
	 * @throws NoSuchrepliedException if a replied with the primary key could not be found
	 */
	@Override
	public replied findByPrimaryKey(Serializable primaryKey)
		throws NoSuchrepliedException {
		replied replied = fetchByPrimaryKey(primaryKey);

		if (replied == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchrepliedException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return replied;
	}

	/**
	 * Returns the replied with the primary key or throws a {@link NoSuchrepliedException} if it could not be found.
	 *
	 * @param id the primary key of the replied
	 * @return the replied
	 * @throws NoSuchrepliedException if a replied with the primary key could not be found
	 */
	@Override
	public replied findByPrimaryKey(long id) throws NoSuchrepliedException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the replied with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the replied
	 * @return the replied, or <code>null</code> if a replied with the primary key could not be found
	 */
	@Override
	public replied fetchByPrimaryKey(Serializable primaryKey) {
		replied replied = (replied)entityCache.getResult(repliedModelImpl.ENTITY_CACHE_ENABLED,
				repliedImpl.class, primaryKey);

		if (replied == _nullreplied) {
			return null;
		}

		if (replied == null) {
			Session session = null;

			try {
				session = openSession();

				replied = (replied)session.get(repliedImpl.class, primaryKey);

				if (replied != null) {
					cacheResult(replied);
				}
				else {
					entityCache.putResult(repliedModelImpl.ENTITY_CACHE_ENABLED,
						repliedImpl.class, primaryKey, _nullreplied);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(repliedModelImpl.ENTITY_CACHE_ENABLED,
					repliedImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return replied;
	}

	/**
	 * Returns the replied with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the replied
	 * @return the replied, or <code>null</code> if a replied with the primary key could not be found
	 */
	@Override
	public replied fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, replied> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, replied> map = new HashMap<Serializable, replied>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			replied replied = fetchByPrimaryKey(primaryKey);

			if (replied != null) {
				map.put(primaryKey, replied);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			replied replied = (replied)entityCache.getResult(repliedModelImpl.ENTITY_CACHE_ENABLED,
					repliedImpl.class, primaryKey);

			if (replied == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, replied);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_REPLIED_WHERE_PKS_IN);

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

			for (replied replied : (List<replied>)q.list()) {
				map.put(replied.getPrimaryKeyObj(), replied);

				cacheResult(replied);

				uncachedPrimaryKeys.remove(replied.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(repliedModelImpl.ENTITY_CACHE_ENABLED,
					repliedImpl.class, primaryKey, _nullreplied);
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
	 * Returns all the replieds.
	 *
	 * @return the replieds
	 */
	@Override
	public List<replied> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the replieds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of replieds
	 * @param end the upper bound of the range of replieds (not inclusive)
	 * @return the range of replieds
	 */
	@Override
	public List<replied> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the replieds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of replieds
	 * @param end the upper bound of the range of replieds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of replieds
	 */
	@Override
	public List<replied> findAll(int start, int end,
		OrderByComparator<replied> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the replieds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of replieds
	 * @param end the upper bound of the range of replieds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of replieds
	 */
	@Override
	public List<replied> findAll(int start, int end,
		OrderByComparator<replied> orderByComparator, boolean retrieveFromCache) {
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

		List<replied> list = null;

		if (retrieveFromCache) {
			list = (List<replied>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_REPLIED);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REPLIED;

				if (pagination) {
					sql = sql.concat(repliedModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<replied>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<replied>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the replieds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (replied replied : findAll()) {
			remove(replied);
		}
	}

	/**
	 * Returns the number of replieds.
	 *
	 * @return the number of replieds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_REPLIED);

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
		return repliedModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the replied persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(repliedImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_REPLIED = "SELECT replied FROM replied replied";
	private static final String _SQL_SELECT_REPLIED_WHERE_PKS_IN = "SELECT replied FROM replied replied WHERE id_ IN (";
	private static final String _SQL_SELECT_REPLIED_WHERE = "SELECT replied FROM replied replied WHERE ";
	private static final String _SQL_COUNT_REPLIED = "SELECT COUNT(replied) FROM replied replied";
	private static final String _SQL_COUNT_REPLIED_WHERE = "SELECT COUNT(replied) FROM replied replied WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "replied.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No replied exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No replied exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(repliedPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final replied _nullreplied = new repliedImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<replied> toCacheModel() {
				return _nullrepliedCacheModel;
			}
		};

	private static final CacheModel<replied> _nullrepliedCacheModel = new CacheModel<replied>() {
			@Override
			public replied toEntityModel() {
				return _nullreplied;
			}
		};
}