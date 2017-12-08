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

package com.chola.socho.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.socho.exception.NoSuchideaException;
import com.chola.socho.model.idea;
import com.chola.socho.model.impl.ideaImpl;
import com.chola.socho.model.impl.ideaModelImpl;
import com.chola.socho.service.persistence.ideaPersistence;

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
 * The persistence implementation for the idea service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see ideaPersistence
 * @see com.chola.socho.service.persistence.ideaUtil
 * @generated
 */
@ProviderType
public class ideaPersistenceImpl extends BasePersistenceImpl<idea>
	implements ideaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ideaUtil} to access the idea persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ideaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ideaModelImpl.ENTITY_CACHE_ENABLED,
			ideaModelImpl.FINDER_CACHE_ENABLED, ideaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ideaModelImpl.ENTITY_CACHE_ENABLED,
			ideaModelImpl.FINDER_CACHE_ENABLED, ideaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ideaModelImpl.ENTITY_CACHE_ENABLED,
			ideaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TOPICS_ID =
		new FinderPath(ideaModelImpl.ENTITY_CACHE_ENABLED,
			ideaModelImpl.FINDER_CACHE_ENABLED, ideaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTOPICS_ID",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOPICS_ID =
		new FinderPath(ideaModelImpl.ENTITY_CACHE_ENABLED,
			ideaModelImpl.FINDER_CACHE_ENABLED, ideaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTOPICS_ID",
			new String[] { String.class.getName() },
			ideaModelImpl.TOPIC_COLUMN_BITMASK |
			ideaModelImpl.SHAREDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TOPICS_ID = new FinderPath(ideaModelImpl.ENTITY_CACHE_ENABLED,
			ideaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTOPICS_ID",
			new String[] { String.class.getName() });

	/**
	 * Returns all the ideas where topic = &#63;.
	 *
	 * @param topic the topic
	 * @return the matching ideas
	 */
	@Override
	public List<idea> findByTOPICS_ID(String topic) {
		return findByTOPICS_ID(topic, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ideas where topic = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param topic the topic
	 * @param start the lower bound of the range of ideas
	 * @param end the upper bound of the range of ideas (not inclusive)
	 * @return the range of matching ideas
	 */
	@Override
	public List<idea> findByTOPICS_ID(String topic, int start, int end) {
		return findByTOPICS_ID(topic, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ideas where topic = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param topic the topic
	 * @param start the lower bound of the range of ideas
	 * @param end the upper bound of the range of ideas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ideas
	 */
	@Override
	public List<idea> findByTOPICS_ID(String topic, int start, int end,
		OrderByComparator<idea> orderByComparator) {
		return findByTOPICS_ID(topic, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ideas where topic = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param topic the topic
	 * @param start the lower bound of the range of ideas
	 * @param end the upper bound of the range of ideas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ideas
	 */
	@Override
	public List<idea> findByTOPICS_ID(String topic, int start, int end,
		OrderByComparator<idea> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOPICS_ID;
			finderArgs = new Object[] { topic };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TOPICS_ID;
			finderArgs = new Object[] { topic, start, end, orderByComparator };
		}

		List<idea> list = null;

		if (retrieveFromCache) {
			list = (List<idea>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (idea idea : list) {
					if (!Objects.equals(topic, idea.getTopic())) {
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

			query.append(_SQL_SELECT_IDEA_WHERE);

			boolean bindTopic = false;

			if (topic == null) {
				query.append(_FINDER_COLUMN_TOPICS_ID_TOPIC_1);
			}
			else if (topic.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TOPICS_ID_TOPIC_3);
			}
			else {
				bindTopic = true;

				query.append(_FINDER_COLUMN_TOPICS_ID_TOPIC_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ideaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTopic) {
					qPos.add(topic);
				}

				if (!pagination) {
					list = (List<idea>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<idea>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first idea in the ordered set where topic = &#63;.
	 *
	 * @param topic the topic
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching idea
	 * @throws NoSuchideaException if a matching idea could not be found
	 */
	@Override
	public idea findByTOPICS_ID_First(String topic,
		OrderByComparator<idea> orderByComparator) throws NoSuchideaException {
		idea idea = fetchByTOPICS_ID_First(topic, orderByComparator);

		if (idea != null) {
			return idea;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("topic=");
		msg.append(topic);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchideaException(msg.toString());
	}

	/**
	 * Returns the first idea in the ordered set where topic = &#63;.
	 *
	 * @param topic the topic
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching idea, or <code>null</code> if a matching idea could not be found
	 */
	@Override
	public idea fetchByTOPICS_ID_First(String topic,
		OrderByComparator<idea> orderByComparator) {
		List<idea> list = findByTOPICS_ID(topic, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last idea in the ordered set where topic = &#63;.
	 *
	 * @param topic the topic
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching idea
	 * @throws NoSuchideaException if a matching idea could not be found
	 */
	@Override
	public idea findByTOPICS_ID_Last(String topic,
		OrderByComparator<idea> orderByComparator) throws NoSuchideaException {
		idea idea = fetchByTOPICS_ID_Last(topic, orderByComparator);

		if (idea != null) {
			return idea;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("topic=");
		msg.append(topic);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchideaException(msg.toString());
	}

	/**
	 * Returns the last idea in the ordered set where topic = &#63;.
	 *
	 * @param topic the topic
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching idea, or <code>null</code> if a matching idea could not be found
	 */
	@Override
	public idea fetchByTOPICS_ID_Last(String topic,
		OrderByComparator<idea> orderByComparator) {
		int count = countByTOPICS_ID(topic);

		if (count == 0) {
			return null;
		}

		List<idea> list = findByTOPICS_ID(topic, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ideas before and after the current idea in the ordered set where topic = &#63;.
	 *
	 * @param id the primary key of the current idea
	 * @param topic the topic
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next idea
	 * @throws NoSuchideaException if a idea with the primary key could not be found
	 */
	@Override
	public idea[] findByTOPICS_ID_PrevAndNext(long id, String topic,
		OrderByComparator<idea> orderByComparator) throws NoSuchideaException {
		idea idea = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			idea[] array = new ideaImpl[3];

			array[0] = getByTOPICS_ID_PrevAndNext(session, idea, topic,
					orderByComparator, true);

			array[1] = idea;

			array[2] = getByTOPICS_ID_PrevAndNext(session, idea, topic,
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

	protected idea getByTOPICS_ID_PrevAndNext(Session session, idea idea,
		String topic, OrderByComparator<idea> orderByComparator,
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

		query.append(_SQL_SELECT_IDEA_WHERE);

		boolean bindTopic = false;

		if (topic == null) {
			query.append(_FINDER_COLUMN_TOPICS_ID_TOPIC_1);
		}
		else if (topic.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TOPICS_ID_TOPIC_3);
		}
		else {
			bindTopic = true;

			query.append(_FINDER_COLUMN_TOPICS_ID_TOPIC_2);
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
			query.append(ideaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTopic) {
			qPos.add(topic);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(idea);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<idea> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ideas where topic = &#63; from the database.
	 *
	 * @param topic the topic
	 */
	@Override
	public void removeByTOPICS_ID(String topic) {
		for (idea idea : findByTOPICS_ID(topic, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(idea);
		}
	}

	/**
	 * Returns the number of ideas where topic = &#63;.
	 *
	 * @param topic the topic
	 * @return the number of matching ideas
	 */
	@Override
	public int countByTOPICS_ID(String topic) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TOPICS_ID;

		Object[] finderArgs = new Object[] { topic };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_IDEA_WHERE);

			boolean bindTopic = false;

			if (topic == null) {
				query.append(_FINDER_COLUMN_TOPICS_ID_TOPIC_1);
			}
			else if (topic.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TOPICS_ID_TOPIC_3);
			}
			else {
				bindTopic = true;

				query.append(_FINDER_COLUMN_TOPICS_ID_TOPIC_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTopic) {
					qPos.add(topic);
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

	private static final String _FINDER_COLUMN_TOPICS_ID_TOPIC_1 = "idea.topic IS NULL";
	private static final String _FINDER_COLUMN_TOPICS_ID_TOPIC_2 = "idea.topic = ?";
	private static final String _FINDER_COLUMN_TOPICS_ID_TOPIC_3 = "(idea.topic IS NULL OR idea.topic = '')";

	public ideaPersistenceImpl() {
		setModelClass(idea.class);
	}

	/**
	 * Caches the idea in the entity cache if it is enabled.
	 *
	 * @param idea the idea
	 */
	@Override
	public void cacheResult(idea idea) {
		entityCache.putResult(ideaModelImpl.ENTITY_CACHE_ENABLED,
			ideaImpl.class, idea.getPrimaryKey(), idea);

		idea.resetOriginalValues();
	}

	/**
	 * Caches the ideas in the entity cache if it is enabled.
	 *
	 * @param ideas the ideas
	 */
	@Override
	public void cacheResult(List<idea> ideas) {
		for (idea idea : ideas) {
			if (entityCache.getResult(ideaModelImpl.ENTITY_CACHE_ENABLED,
						ideaImpl.class, idea.getPrimaryKey()) == null) {
				cacheResult(idea);
			}
			else {
				idea.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ideas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ideaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the idea.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(idea idea) {
		entityCache.removeResult(ideaModelImpl.ENTITY_CACHE_ENABLED,
			ideaImpl.class, idea.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<idea> ideas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (idea idea : ideas) {
			entityCache.removeResult(ideaModelImpl.ENTITY_CACHE_ENABLED,
				ideaImpl.class, idea.getPrimaryKey());
		}
	}

	/**
	 * Creates a new idea with the primary key. Does not add the idea to the database.
	 *
	 * @param id the primary key for the new idea
	 * @return the new idea
	 */
	@Override
	public idea create(long id) {
		idea idea = new ideaImpl();

		idea.setNew(true);
		idea.setPrimaryKey(id);

		return idea;
	}

	/**
	 * Removes the idea with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the idea
	 * @return the idea that was removed
	 * @throws NoSuchideaException if a idea with the primary key could not be found
	 */
	@Override
	public idea remove(long id) throws NoSuchideaException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the idea with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the idea
	 * @return the idea that was removed
	 * @throws NoSuchideaException if a idea with the primary key could not be found
	 */
	@Override
	public idea remove(Serializable primaryKey) throws NoSuchideaException {
		Session session = null;

		try {
			session = openSession();

			idea idea = (idea)session.get(ideaImpl.class, primaryKey);

			if (idea == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchideaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(idea);
		}
		catch (NoSuchideaException nsee) {
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
	protected idea removeImpl(idea idea) {
		idea = toUnwrappedModel(idea);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(idea)) {
				idea = (idea)session.get(ideaImpl.class, idea.getPrimaryKeyObj());
			}

			if (idea != null) {
				session.delete(idea);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (idea != null) {
			clearCache(idea);
		}

		return idea;
	}

	@Override
	public idea updateImpl(idea idea) {
		idea = toUnwrappedModel(idea);

		boolean isNew = idea.isNew();

		ideaModelImpl ideaModelImpl = (ideaModelImpl)idea;

		Session session = null;

		try {
			session = openSession();

			if (idea.isNew()) {
				session.save(idea);

				idea.setNew(false);
			}
			else {
				idea = (idea)session.merge(idea);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ideaModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((ideaModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOPICS_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { ideaModelImpl.getOriginalTopic() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TOPICS_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOPICS_ID,
					args);

				args = new Object[] { ideaModelImpl.getTopic() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TOPICS_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOPICS_ID,
					args);
			}
		}

		entityCache.putResult(ideaModelImpl.ENTITY_CACHE_ENABLED,
			ideaImpl.class, idea.getPrimaryKey(), idea, false);

		idea.resetOriginalValues();

		return idea;
	}

	protected idea toUnwrappedModel(idea idea) {
		if (idea instanceof ideaImpl) {
			return idea;
		}

		ideaImpl ideaImpl = new ideaImpl();

		ideaImpl.setNew(idea.isNew());
		ideaImpl.setPrimaryKey(idea.getPrimaryKey());

		ideaImpl.setId(idea.getId());
		ideaImpl.setUserId(idea.getUserId());
		ideaImpl.setTopic(idea.getTopic());
		ideaImpl.setSharedIdea(idea.getSharedIdea());
		ideaImpl.setSharedFile(idea.getSharedFile());
		ideaImpl.setSharedDate(idea.getSharedDate());

		return ideaImpl;
	}

	/**
	 * Returns the idea with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the idea
	 * @return the idea
	 * @throws NoSuchideaException if a idea with the primary key could not be found
	 */
	@Override
	public idea findByPrimaryKey(Serializable primaryKey)
		throws NoSuchideaException {
		idea idea = fetchByPrimaryKey(primaryKey);

		if (idea == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchideaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return idea;
	}

	/**
	 * Returns the idea with the primary key or throws a {@link NoSuchideaException} if it could not be found.
	 *
	 * @param id the primary key of the idea
	 * @return the idea
	 * @throws NoSuchideaException if a idea with the primary key could not be found
	 */
	@Override
	public idea findByPrimaryKey(long id) throws NoSuchideaException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the idea with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the idea
	 * @return the idea, or <code>null</code> if a idea with the primary key could not be found
	 */
	@Override
	public idea fetchByPrimaryKey(Serializable primaryKey) {
		idea idea = (idea)entityCache.getResult(ideaModelImpl.ENTITY_CACHE_ENABLED,
				ideaImpl.class, primaryKey);

		if (idea == _nullidea) {
			return null;
		}

		if (idea == null) {
			Session session = null;

			try {
				session = openSession();

				idea = (idea)session.get(ideaImpl.class, primaryKey);

				if (idea != null) {
					cacheResult(idea);
				}
				else {
					entityCache.putResult(ideaModelImpl.ENTITY_CACHE_ENABLED,
						ideaImpl.class, primaryKey, _nullidea);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ideaModelImpl.ENTITY_CACHE_ENABLED,
					ideaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return idea;
	}

	/**
	 * Returns the idea with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the idea
	 * @return the idea, or <code>null</code> if a idea with the primary key could not be found
	 */
	@Override
	public idea fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, idea> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, idea> map = new HashMap<Serializable, idea>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			idea idea = fetchByPrimaryKey(primaryKey);

			if (idea != null) {
				map.put(primaryKey, idea);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			idea idea = (idea)entityCache.getResult(ideaModelImpl.ENTITY_CACHE_ENABLED,
					ideaImpl.class, primaryKey);

			if (idea == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, idea);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_IDEA_WHERE_PKS_IN);

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

			for (idea idea : (List<idea>)q.list()) {
				map.put(idea.getPrimaryKeyObj(), idea);

				cacheResult(idea);

				uncachedPrimaryKeys.remove(idea.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ideaModelImpl.ENTITY_CACHE_ENABLED,
					ideaImpl.class, primaryKey, _nullidea);
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
	 * Returns all the ideas.
	 *
	 * @return the ideas
	 */
	@Override
	public List<idea> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ideas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ideas
	 * @param end the upper bound of the range of ideas (not inclusive)
	 * @return the range of ideas
	 */
	@Override
	public List<idea> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ideas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ideas
	 * @param end the upper bound of the range of ideas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ideas
	 */
	@Override
	public List<idea> findAll(int start, int end,
		OrderByComparator<idea> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ideas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ideas
	 * @param end the upper bound of the range of ideas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ideas
	 */
	@Override
	public List<idea> findAll(int start, int end,
		OrderByComparator<idea> orderByComparator, boolean retrieveFromCache) {
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

		List<idea> list = null;

		if (retrieveFromCache) {
			list = (List<idea>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_IDEA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_IDEA;

				if (pagination) {
					sql = sql.concat(ideaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<idea>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<idea>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the ideas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (idea idea : findAll()) {
			remove(idea);
		}
	}

	/**
	 * Returns the number of ideas.
	 *
	 * @return the number of ideas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_IDEA);

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
		return ideaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the idea persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ideaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_IDEA = "SELECT idea FROM idea idea";
	private static final String _SQL_SELECT_IDEA_WHERE_PKS_IN = "SELECT idea FROM idea idea WHERE id_ IN (";
	private static final String _SQL_SELECT_IDEA_WHERE = "SELECT idea FROM idea idea WHERE ";
	private static final String _SQL_COUNT_IDEA = "SELECT COUNT(idea) FROM idea idea";
	private static final String _SQL_COUNT_IDEA_WHERE = "SELECT COUNT(idea) FROM idea idea WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "idea.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No idea exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No idea exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ideaPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final idea _nullidea = new ideaImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<idea> toCacheModel() {
				return _nullideaCacheModel;
			}
		};

	private static final CacheModel<idea> _nullideaCacheModel = new CacheModel<idea>() {
			@Override
			public idea toEntityModel() {
				return _nullidea;
			}
		};
}