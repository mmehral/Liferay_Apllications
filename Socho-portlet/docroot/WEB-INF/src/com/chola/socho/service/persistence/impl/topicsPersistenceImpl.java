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

import com.chola.socho.exception.NoSuchtopicsException;
import com.chola.socho.model.impl.topicsImpl;
import com.chola.socho.model.impl.topicsModelImpl;
import com.chola.socho.model.topics;
import com.chola.socho.service.persistence.topicsPersistence;

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
 * The persistence implementation for the topics service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see topicsPersistence
 * @see com.chola.socho.service.persistence.topicsUtil
 * @generated
 */
@ProviderType
public class topicsPersistenceImpl extends BasePersistenceImpl<topics>
	implements topicsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link topicsUtil} to access the topics persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = topicsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(topicsModelImpl.ENTITY_CACHE_ENABLED,
			topicsModelImpl.FINDER_CACHE_ENABLED, topicsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(topicsModelImpl.ENTITY_CACHE_ENABLED,
			topicsModelImpl.FINDER_CACHE_ENABLED, topicsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(topicsModelImpl.ENTITY_CACHE_ENABLED,
			topicsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TOPICS_DATA =
		new FinderPath(topicsModelImpl.ENTITY_CACHE_ENABLED,
			topicsModelImpl.FINDER_CACHE_ENABLED, topicsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTOPICS_DATA",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOPICS_DATA =
		new FinderPath(topicsModelImpl.ENTITY_CACHE_ENABLED,
			topicsModelImpl.FINDER_CACHE_ENABLED, topicsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTOPICS_DATA",
			new String[] { String.class.getName() },
			topicsModelImpl.TOPICNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TOPICS_DATA = new FinderPath(topicsModelImpl.ENTITY_CACHE_ENABLED,
			topicsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTOPICS_DATA",
			new String[] { String.class.getName() });

	/**
	 * Returns all the topicses where topicName = &#63;.
	 *
	 * @param topicName the topic name
	 * @return the matching topicses
	 */
	@Override
	public List<topics> findByTOPICS_DATA(String topicName) {
		return findByTOPICS_DATA(topicName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the topicses where topicName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param topicName the topic name
	 * @param start the lower bound of the range of topicses
	 * @param end the upper bound of the range of topicses (not inclusive)
	 * @return the range of matching topicses
	 */
	@Override
	public List<topics> findByTOPICS_DATA(String topicName, int start, int end) {
		return findByTOPICS_DATA(topicName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the topicses where topicName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param topicName the topic name
	 * @param start the lower bound of the range of topicses
	 * @param end the upper bound of the range of topicses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching topicses
	 */
	@Override
	public List<topics> findByTOPICS_DATA(String topicName, int start, int end,
		OrderByComparator<topics> orderByComparator) {
		return findByTOPICS_DATA(topicName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the topicses where topicName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param topicName the topic name
	 * @param start the lower bound of the range of topicses
	 * @param end the upper bound of the range of topicses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching topicses
	 */
	@Override
	public List<topics> findByTOPICS_DATA(String topicName, int start, int end,
		OrderByComparator<topics> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOPICS_DATA;
			finderArgs = new Object[] { topicName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TOPICS_DATA;
			finderArgs = new Object[] { topicName, start, end, orderByComparator };
		}

		List<topics> list = null;

		if (retrieveFromCache) {
			list = (List<topics>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (topics topics : list) {
					if (!Objects.equals(topicName, topics.getTopicName())) {
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

			query.append(_SQL_SELECT_TOPICS_WHERE);

			boolean bindTopicName = false;

			if (topicName == null) {
				query.append(_FINDER_COLUMN_TOPICS_DATA_TOPICNAME_1);
			}
			else if (topicName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TOPICS_DATA_TOPICNAME_3);
			}
			else {
				bindTopicName = true;

				query.append(_FINDER_COLUMN_TOPICS_DATA_TOPICNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(topicsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTopicName) {
					qPos.add(topicName);
				}

				if (!pagination) {
					list = (List<topics>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<topics>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first topics in the ordered set where topicName = &#63;.
	 *
	 * @param topicName the topic name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching topics
	 * @throws NoSuchtopicsException if a matching topics could not be found
	 */
	@Override
	public topics findByTOPICS_DATA_First(String topicName,
		OrderByComparator<topics> orderByComparator)
		throws NoSuchtopicsException {
		topics topics = fetchByTOPICS_DATA_First(topicName, orderByComparator);

		if (topics != null) {
			return topics;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("topicName=");
		msg.append(topicName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchtopicsException(msg.toString());
	}

	/**
	 * Returns the first topics in the ordered set where topicName = &#63;.
	 *
	 * @param topicName the topic name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching topics, or <code>null</code> if a matching topics could not be found
	 */
	@Override
	public topics fetchByTOPICS_DATA_First(String topicName,
		OrderByComparator<topics> orderByComparator) {
		List<topics> list = findByTOPICS_DATA(topicName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last topics in the ordered set where topicName = &#63;.
	 *
	 * @param topicName the topic name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching topics
	 * @throws NoSuchtopicsException if a matching topics could not be found
	 */
	@Override
	public topics findByTOPICS_DATA_Last(String topicName,
		OrderByComparator<topics> orderByComparator)
		throws NoSuchtopicsException {
		topics topics = fetchByTOPICS_DATA_Last(topicName, orderByComparator);

		if (topics != null) {
			return topics;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("topicName=");
		msg.append(topicName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchtopicsException(msg.toString());
	}

	/**
	 * Returns the last topics in the ordered set where topicName = &#63;.
	 *
	 * @param topicName the topic name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching topics, or <code>null</code> if a matching topics could not be found
	 */
	@Override
	public topics fetchByTOPICS_DATA_Last(String topicName,
		OrderByComparator<topics> orderByComparator) {
		int count = countByTOPICS_DATA(topicName);

		if (count == 0) {
			return null;
		}

		List<topics> list = findByTOPICS_DATA(topicName, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the topicses before and after the current topics in the ordered set where topicName = &#63;.
	 *
	 * @param id the primary key of the current topics
	 * @param topicName the topic name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next topics
	 * @throws NoSuchtopicsException if a topics with the primary key could not be found
	 */
	@Override
	public topics[] findByTOPICS_DATA_PrevAndNext(long id, String topicName,
		OrderByComparator<topics> orderByComparator)
		throws NoSuchtopicsException {
		topics topics = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			topics[] array = new topicsImpl[3];

			array[0] = getByTOPICS_DATA_PrevAndNext(session, topics, topicName,
					orderByComparator, true);

			array[1] = topics;

			array[2] = getByTOPICS_DATA_PrevAndNext(session, topics, topicName,
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

	protected topics getByTOPICS_DATA_PrevAndNext(Session session,
		topics topics, String topicName,
		OrderByComparator<topics> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TOPICS_WHERE);

		boolean bindTopicName = false;

		if (topicName == null) {
			query.append(_FINDER_COLUMN_TOPICS_DATA_TOPICNAME_1);
		}
		else if (topicName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TOPICS_DATA_TOPICNAME_3);
		}
		else {
			bindTopicName = true;

			query.append(_FINDER_COLUMN_TOPICS_DATA_TOPICNAME_2);
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
			query.append(topicsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTopicName) {
			qPos.add(topicName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(topics);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<topics> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the topicses where topicName = &#63; from the database.
	 *
	 * @param topicName the topic name
	 */
	@Override
	public void removeByTOPICS_DATA(String topicName) {
		for (topics topics : findByTOPICS_DATA(topicName, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(topics);
		}
	}

	/**
	 * Returns the number of topicses where topicName = &#63;.
	 *
	 * @param topicName the topic name
	 * @return the number of matching topicses
	 */
	@Override
	public int countByTOPICS_DATA(String topicName) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TOPICS_DATA;

		Object[] finderArgs = new Object[] { topicName };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TOPICS_WHERE);

			boolean bindTopicName = false;

			if (topicName == null) {
				query.append(_FINDER_COLUMN_TOPICS_DATA_TOPICNAME_1);
			}
			else if (topicName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TOPICS_DATA_TOPICNAME_3);
			}
			else {
				bindTopicName = true;

				query.append(_FINDER_COLUMN_TOPICS_DATA_TOPICNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTopicName) {
					qPos.add(topicName);
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

	private static final String _FINDER_COLUMN_TOPICS_DATA_TOPICNAME_1 = "topics.topicName IS NULL";
	private static final String _FINDER_COLUMN_TOPICS_DATA_TOPICNAME_2 = "topics.topicName = ?";
	private static final String _FINDER_COLUMN_TOPICS_DATA_TOPICNAME_3 = "(topics.topicName IS NULL OR topics.topicName = '')";

	public topicsPersistenceImpl() {
		setModelClass(topics.class);
	}

	/**
	 * Caches the topics in the entity cache if it is enabled.
	 *
	 * @param topics the topics
	 */
	@Override
	public void cacheResult(topics topics) {
		entityCache.putResult(topicsModelImpl.ENTITY_CACHE_ENABLED,
			topicsImpl.class, topics.getPrimaryKey(), topics);

		topics.resetOriginalValues();
	}

	/**
	 * Caches the topicses in the entity cache if it is enabled.
	 *
	 * @param topicses the topicses
	 */
	@Override
	public void cacheResult(List<topics> topicses) {
		for (topics topics : topicses) {
			if (entityCache.getResult(topicsModelImpl.ENTITY_CACHE_ENABLED,
						topicsImpl.class, topics.getPrimaryKey()) == null) {
				cacheResult(topics);
			}
			else {
				topics.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all topicses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(topicsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the topics.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(topics topics) {
		entityCache.removeResult(topicsModelImpl.ENTITY_CACHE_ENABLED,
			topicsImpl.class, topics.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<topics> topicses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (topics topics : topicses) {
			entityCache.removeResult(topicsModelImpl.ENTITY_CACHE_ENABLED,
				topicsImpl.class, topics.getPrimaryKey());
		}
	}

	/**
	 * Creates a new topics with the primary key. Does not add the topics to the database.
	 *
	 * @param id the primary key for the new topics
	 * @return the new topics
	 */
	@Override
	public topics create(long id) {
		topics topics = new topicsImpl();

		topics.setNew(true);
		topics.setPrimaryKey(id);

		return topics;
	}

	/**
	 * Removes the topics with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the topics
	 * @return the topics that was removed
	 * @throws NoSuchtopicsException if a topics with the primary key could not be found
	 */
	@Override
	public topics remove(long id) throws NoSuchtopicsException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the topics with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the topics
	 * @return the topics that was removed
	 * @throws NoSuchtopicsException if a topics with the primary key could not be found
	 */
	@Override
	public topics remove(Serializable primaryKey) throws NoSuchtopicsException {
		Session session = null;

		try {
			session = openSession();

			topics topics = (topics)session.get(topicsImpl.class, primaryKey);

			if (topics == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchtopicsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(topics);
		}
		catch (NoSuchtopicsException nsee) {
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
	protected topics removeImpl(topics topics) {
		topics = toUnwrappedModel(topics);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(topics)) {
				topics = (topics)session.get(topicsImpl.class,
						topics.getPrimaryKeyObj());
			}

			if (topics != null) {
				session.delete(topics);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (topics != null) {
			clearCache(topics);
		}

		return topics;
	}

	@Override
	public topics updateImpl(topics topics) {
		topics = toUnwrappedModel(topics);

		boolean isNew = topics.isNew();

		topicsModelImpl topicsModelImpl = (topicsModelImpl)topics;

		Session session = null;

		try {
			session = openSession();

			if (topics.isNew()) {
				session.save(topics);

				topics.setNew(false);
			}
			else {
				topics = (topics)session.merge(topics);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !topicsModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((topicsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOPICS_DATA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						topicsModelImpl.getOriginalTopicName()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TOPICS_DATA, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOPICS_DATA,
					args);

				args = new Object[] { topicsModelImpl.getTopicName() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TOPICS_DATA, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TOPICS_DATA,
					args);
			}
		}

		entityCache.putResult(topicsModelImpl.ENTITY_CACHE_ENABLED,
			topicsImpl.class, topics.getPrimaryKey(), topics, false);

		topics.resetOriginalValues();

		return topics;
	}

	protected topics toUnwrappedModel(topics topics) {
		if (topics instanceof topicsImpl) {
			return topics;
		}

		topicsImpl topicsImpl = new topicsImpl();

		topicsImpl.setNew(topics.isNew());
		topicsImpl.setPrimaryKey(topics.getPrimaryKey());

		topicsImpl.setId(topics.getId());
		topicsImpl.setTopicName(topics.getTopicName());
		topicsImpl.setFlag(topics.getFlag());
		topicsImpl.setCreatedBy(topics.getCreatedBy());
		topicsImpl.setCreatedOn(topics.getCreatedOn());
		topicsImpl.setModifiedBy(topics.getModifiedBy());
		topicsImpl.setModifiedOn(topics.getModifiedOn());

		return topicsImpl;
	}

	/**
	 * Returns the topics with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the topics
	 * @return the topics
	 * @throws NoSuchtopicsException if a topics with the primary key could not be found
	 */
	@Override
	public topics findByPrimaryKey(Serializable primaryKey)
		throws NoSuchtopicsException {
		topics topics = fetchByPrimaryKey(primaryKey);

		if (topics == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchtopicsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return topics;
	}

	/**
	 * Returns the topics with the primary key or throws a {@link NoSuchtopicsException} if it could not be found.
	 *
	 * @param id the primary key of the topics
	 * @return the topics
	 * @throws NoSuchtopicsException if a topics with the primary key could not be found
	 */
	@Override
	public topics findByPrimaryKey(long id) throws NoSuchtopicsException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the topics with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the topics
	 * @return the topics, or <code>null</code> if a topics with the primary key could not be found
	 */
	@Override
	public topics fetchByPrimaryKey(Serializable primaryKey) {
		topics topics = (topics)entityCache.getResult(topicsModelImpl.ENTITY_CACHE_ENABLED,
				topicsImpl.class, primaryKey);

		if (topics == _nulltopics) {
			return null;
		}

		if (topics == null) {
			Session session = null;

			try {
				session = openSession();

				topics = (topics)session.get(topicsImpl.class, primaryKey);

				if (topics != null) {
					cacheResult(topics);
				}
				else {
					entityCache.putResult(topicsModelImpl.ENTITY_CACHE_ENABLED,
						topicsImpl.class, primaryKey, _nulltopics);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(topicsModelImpl.ENTITY_CACHE_ENABLED,
					topicsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return topics;
	}

	/**
	 * Returns the topics with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the topics
	 * @return the topics, or <code>null</code> if a topics with the primary key could not be found
	 */
	@Override
	public topics fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, topics> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, topics> map = new HashMap<Serializable, topics>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			topics topics = fetchByPrimaryKey(primaryKey);

			if (topics != null) {
				map.put(primaryKey, topics);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			topics topics = (topics)entityCache.getResult(topicsModelImpl.ENTITY_CACHE_ENABLED,
					topicsImpl.class, primaryKey);

			if (topics == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, topics);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TOPICS_WHERE_PKS_IN);

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

			for (topics topics : (List<topics>)q.list()) {
				map.put(topics.getPrimaryKeyObj(), topics);

				cacheResult(topics);

				uncachedPrimaryKeys.remove(topics.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(topicsModelImpl.ENTITY_CACHE_ENABLED,
					topicsImpl.class, primaryKey, _nulltopics);
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
	 * Returns all the topicses.
	 *
	 * @return the topicses
	 */
	@Override
	public List<topics> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the topicses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of topicses
	 * @param end the upper bound of the range of topicses (not inclusive)
	 * @return the range of topicses
	 */
	@Override
	public List<topics> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the topicses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of topicses
	 * @param end the upper bound of the range of topicses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of topicses
	 */
	@Override
	public List<topics> findAll(int start, int end,
		OrderByComparator<topics> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the topicses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of topicses
	 * @param end the upper bound of the range of topicses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of topicses
	 */
	@Override
	public List<topics> findAll(int start, int end,
		OrderByComparator<topics> orderByComparator, boolean retrieveFromCache) {
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

		List<topics> list = null;

		if (retrieveFromCache) {
			list = (List<topics>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TOPICS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TOPICS;

				if (pagination) {
					sql = sql.concat(topicsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<topics>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<topics>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the topicses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (topics topics : findAll()) {
			remove(topics);
		}
	}

	/**
	 * Returns the number of topicses.
	 *
	 * @return the number of topicses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TOPICS);

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
		return topicsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the topics persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(topicsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_TOPICS = "SELECT topics FROM topics topics";
	private static final String _SQL_SELECT_TOPICS_WHERE_PKS_IN = "SELECT topics FROM topics topics WHERE id_ IN (";
	private static final String _SQL_SELECT_TOPICS_WHERE = "SELECT topics FROM topics topics WHERE ";
	private static final String _SQL_COUNT_TOPICS = "SELECT COUNT(topics) FROM topics topics";
	private static final String _SQL_COUNT_TOPICS_WHERE = "SELECT COUNT(topics) FROM topics topics WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "topics.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No topics exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No topics exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(topicsPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final topics _nulltopics = new topicsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<topics> toCacheModel() {
				return _nulltopicsCacheModel;
			}
		};

	private static final CacheModel<topics> _nulltopicsCacheModel = new CacheModel<topics>() {
			@Override
			public topics toEntityModel() {
				return _nulltopics;
			}
		};
}