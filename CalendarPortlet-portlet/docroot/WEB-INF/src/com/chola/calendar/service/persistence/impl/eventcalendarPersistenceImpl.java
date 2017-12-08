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

package com.chola.calendar.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.calendar.exception.NoSucheventcalendarException;
import com.chola.calendar.model.eventcalendar;
import com.chola.calendar.model.impl.eventcalendarImpl;
import com.chola.calendar.model.impl.eventcalendarModelImpl;
import com.chola.calendar.service.persistence.eventcalendarPersistence;

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
 * The persistence implementation for the eventcalendar service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see eventcalendarPersistence
 * @see com.chola.calendar.service.persistence.eventcalendarUtil
 * @generated
 */
@ProviderType
public class eventcalendarPersistenceImpl extends BasePersistenceImpl<eventcalendar>
	implements eventcalendarPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link eventcalendarUtil} to access the eventcalendar persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = eventcalendarImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(eventcalendarModelImpl.ENTITY_CACHE_ENABLED,
			eventcalendarModelImpl.FINDER_CACHE_ENABLED,
			eventcalendarImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(eventcalendarModelImpl.ENTITY_CACHE_ENABLED,
			eventcalendarModelImpl.FINDER_CACHE_ENABLED,
			eventcalendarImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(eventcalendarModelImpl.ENTITY_CACHE_ENABLED,
			eventcalendarModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EVENT_NAME =
		new FinderPath(eventcalendarModelImpl.ENTITY_CACHE_ENABLED,
			eventcalendarModelImpl.FINDER_CACHE_ENABLED,
			eventcalendarImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByEVENT_NAME",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENT_NAME =
		new FinderPath(eventcalendarModelImpl.ENTITY_CACHE_ENABLED,
			eventcalendarModelImpl.FINDER_CACHE_ENABLED,
			eventcalendarImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByEVENT_NAME", new String[] { String.class.getName() },
			eventcalendarModelImpl.NAME_COLUMN_BITMASK |
			eventcalendarModelImpl.STARTDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EVENT_NAME = new FinderPath(eventcalendarModelImpl.ENTITY_CACHE_ENABLED,
			eventcalendarModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEVENT_NAME",
			new String[] { String.class.getName() });

	/**
	 * Returns all the eventcalendars where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching eventcalendars
	 */
	@Override
	public List<eventcalendar> findByEVENT_NAME(String name) {
		return findByEVENT_NAME(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the eventcalendars where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eventcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of eventcalendars
	 * @param end the upper bound of the range of eventcalendars (not inclusive)
	 * @return the range of matching eventcalendars
	 */
	@Override
	public List<eventcalendar> findByEVENT_NAME(String name, int start, int end) {
		return findByEVENT_NAME(name, start, end, null);
	}

	/**
	 * Returns an ordered range of all the eventcalendars where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eventcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of eventcalendars
	 * @param end the upper bound of the range of eventcalendars (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching eventcalendars
	 */
	@Override
	public List<eventcalendar> findByEVENT_NAME(String name, int start,
		int end, OrderByComparator<eventcalendar> orderByComparator) {
		return findByEVENT_NAME(name, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the eventcalendars where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eventcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of eventcalendars
	 * @param end the upper bound of the range of eventcalendars (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching eventcalendars
	 */
	@Override
	public List<eventcalendar> findByEVENT_NAME(String name, int start,
		int end, OrderByComparator<eventcalendar> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENT_NAME;
			finderArgs = new Object[] { name };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EVENT_NAME;
			finderArgs = new Object[] { name, start, end, orderByComparator };
		}

		List<eventcalendar> list = null;

		if (retrieveFromCache) {
			list = (List<eventcalendar>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (eventcalendar eventcalendar : list) {
					if (!Objects.equals(name, eventcalendar.getName())) {
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

			query.append(_SQL_SELECT_EVENTCALENDAR_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_EVENT_NAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EVENT_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_EVENT_NAME_NAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(eventcalendarModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
				}

				if (!pagination) {
					list = (List<eventcalendar>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<eventcalendar>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first eventcalendar in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching eventcalendar
	 * @throws NoSucheventcalendarException if a matching eventcalendar could not be found
	 */
	@Override
	public eventcalendar findByEVENT_NAME_First(String name,
		OrderByComparator<eventcalendar> orderByComparator)
		throws NoSucheventcalendarException {
		eventcalendar eventcalendar = fetchByEVENT_NAME_First(name,
				orderByComparator);

		if (eventcalendar != null) {
			return eventcalendar;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSucheventcalendarException(msg.toString());
	}

	/**
	 * Returns the first eventcalendar in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching eventcalendar, or <code>null</code> if a matching eventcalendar could not be found
	 */
	@Override
	public eventcalendar fetchByEVENT_NAME_First(String name,
		OrderByComparator<eventcalendar> orderByComparator) {
		List<eventcalendar> list = findByEVENT_NAME(name, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last eventcalendar in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching eventcalendar
	 * @throws NoSucheventcalendarException if a matching eventcalendar could not be found
	 */
	@Override
	public eventcalendar findByEVENT_NAME_Last(String name,
		OrderByComparator<eventcalendar> orderByComparator)
		throws NoSucheventcalendarException {
		eventcalendar eventcalendar = fetchByEVENT_NAME_Last(name,
				orderByComparator);

		if (eventcalendar != null) {
			return eventcalendar;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSucheventcalendarException(msg.toString());
	}

	/**
	 * Returns the last eventcalendar in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching eventcalendar, or <code>null</code> if a matching eventcalendar could not be found
	 */
	@Override
	public eventcalendar fetchByEVENT_NAME_Last(String name,
		OrderByComparator<eventcalendar> orderByComparator) {
		int count = countByEVENT_NAME(name);

		if (count == 0) {
			return null;
		}

		List<eventcalendar> list = findByEVENT_NAME(name, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the eventcalendars before and after the current eventcalendar in the ordered set where name = &#63;.
	 *
	 * @param id the primary key of the current eventcalendar
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next eventcalendar
	 * @throws NoSucheventcalendarException if a eventcalendar with the primary key could not be found
	 */
	@Override
	public eventcalendar[] findByEVENT_NAME_PrevAndNext(long id, String name,
		OrderByComparator<eventcalendar> orderByComparator)
		throws NoSucheventcalendarException {
		eventcalendar eventcalendar = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			eventcalendar[] array = new eventcalendarImpl[3];

			array[0] = getByEVENT_NAME_PrevAndNext(session, eventcalendar,
					name, orderByComparator, true);

			array[1] = eventcalendar;

			array[2] = getByEVENT_NAME_PrevAndNext(session, eventcalendar,
					name, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected eventcalendar getByEVENT_NAME_PrevAndNext(Session session,
		eventcalendar eventcalendar, String name,
		OrderByComparator<eventcalendar> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EVENTCALENDAR_WHERE);

		boolean bindName = false;

		if (name == null) {
			query.append(_FINDER_COLUMN_EVENT_NAME_NAME_1);
		}
		else if (name.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_EVENT_NAME_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_EVENT_NAME_NAME_2);
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
			query.append(eventcalendarModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindName) {
			qPos.add(name);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(eventcalendar);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<eventcalendar> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the eventcalendars where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	@Override
	public void removeByEVENT_NAME(String name) {
		for (eventcalendar eventcalendar : findByEVENT_NAME(name,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(eventcalendar);
		}
	}

	/**
	 * Returns the number of eventcalendars where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching eventcalendars
	 */
	@Override
	public int countByEVENT_NAME(String name) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EVENT_NAME;

		Object[] finderArgs = new Object[] { name };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EVENTCALENDAR_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_EVENT_NAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EVENT_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_EVENT_NAME_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
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

	private static final String _FINDER_COLUMN_EVENT_NAME_NAME_1 = "eventcalendar.name IS NULL";
	private static final String _FINDER_COLUMN_EVENT_NAME_NAME_2 = "eventcalendar.name = ?";
	private static final String _FINDER_COLUMN_EVENT_NAME_NAME_3 = "(eventcalendar.name IS NULL OR eventcalendar.name = '')";

	public eventcalendarPersistenceImpl() {
		setModelClass(eventcalendar.class);
	}

	/**
	 * Caches the eventcalendar in the entity cache if it is enabled.
	 *
	 * @param eventcalendar the eventcalendar
	 */
	@Override
	public void cacheResult(eventcalendar eventcalendar) {
		entityCache.putResult(eventcalendarModelImpl.ENTITY_CACHE_ENABLED,
			eventcalendarImpl.class, eventcalendar.getPrimaryKey(),
			eventcalendar);

		eventcalendar.resetOriginalValues();
	}

	/**
	 * Caches the eventcalendars in the entity cache if it is enabled.
	 *
	 * @param eventcalendars the eventcalendars
	 */
	@Override
	public void cacheResult(List<eventcalendar> eventcalendars) {
		for (eventcalendar eventcalendar : eventcalendars) {
			if (entityCache.getResult(
						eventcalendarModelImpl.ENTITY_CACHE_ENABLED,
						eventcalendarImpl.class, eventcalendar.getPrimaryKey()) == null) {
				cacheResult(eventcalendar);
			}
			else {
				eventcalendar.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all eventcalendars.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(eventcalendarImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the eventcalendar.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(eventcalendar eventcalendar) {
		entityCache.removeResult(eventcalendarModelImpl.ENTITY_CACHE_ENABLED,
			eventcalendarImpl.class, eventcalendar.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<eventcalendar> eventcalendars) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (eventcalendar eventcalendar : eventcalendars) {
			entityCache.removeResult(eventcalendarModelImpl.ENTITY_CACHE_ENABLED,
				eventcalendarImpl.class, eventcalendar.getPrimaryKey());
		}
	}

	/**
	 * Creates a new eventcalendar with the primary key. Does not add the eventcalendar to the database.
	 *
	 * @param id the primary key for the new eventcalendar
	 * @return the new eventcalendar
	 */
	@Override
	public eventcalendar create(long id) {
		eventcalendar eventcalendar = new eventcalendarImpl();

		eventcalendar.setNew(true);
		eventcalendar.setPrimaryKey(id);

		return eventcalendar;
	}

	/**
	 * Removes the eventcalendar with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the eventcalendar
	 * @return the eventcalendar that was removed
	 * @throws NoSucheventcalendarException if a eventcalendar with the primary key could not be found
	 */
	@Override
	public eventcalendar remove(long id) throws NoSucheventcalendarException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the eventcalendar with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the eventcalendar
	 * @return the eventcalendar that was removed
	 * @throws NoSucheventcalendarException if a eventcalendar with the primary key could not be found
	 */
	@Override
	public eventcalendar remove(Serializable primaryKey)
		throws NoSucheventcalendarException {
		Session session = null;

		try {
			session = openSession();

			eventcalendar eventcalendar = (eventcalendar)session.get(eventcalendarImpl.class,
					primaryKey);

			if (eventcalendar == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSucheventcalendarException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(eventcalendar);
		}
		catch (NoSucheventcalendarException nsee) {
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
	protected eventcalendar removeImpl(eventcalendar eventcalendar) {
		eventcalendar = toUnwrappedModel(eventcalendar);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(eventcalendar)) {
				eventcalendar = (eventcalendar)session.get(eventcalendarImpl.class,
						eventcalendar.getPrimaryKeyObj());
			}

			if (eventcalendar != null) {
				session.delete(eventcalendar);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (eventcalendar != null) {
			clearCache(eventcalendar);
		}

		return eventcalendar;
	}

	@Override
	public eventcalendar updateImpl(eventcalendar eventcalendar) {
		eventcalendar = toUnwrappedModel(eventcalendar);

		boolean isNew = eventcalendar.isNew();

		eventcalendarModelImpl eventcalendarModelImpl = (eventcalendarModelImpl)eventcalendar;

		Session session = null;

		try {
			session = openSession();

			if (eventcalendar.isNew()) {
				session.save(eventcalendar);

				eventcalendar.setNew(false);
			}
			else {
				eventcalendar = (eventcalendar)session.merge(eventcalendar);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !eventcalendarModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((eventcalendarModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENT_NAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						eventcalendarModelImpl.getOriginalName()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EVENT_NAME, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENT_NAME,
					args);

				args = new Object[] { eventcalendarModelImpl.getName() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EVENT_NAME, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EVENT_NAME,
					args);
			}
		}

		entityCache.putResult(eventcalendarModelImpl.ENTITY_CACHE_ENABLED,
			eventcalendarImpl.class, eventcalendar.getPrimaryKey(),
			eventcalendar, false);

		eventcalendar.resetOriginalValues();

		return eventcalendar;
	}

	protected eventcalendar toUnwrappedModel(eventcalendar eventcalendar) {
		if (eventcalendar instanceof eventcalendarImpl) {
			return eventcalendar;
		}

		eventcalendarImpl eventcalendarImpl = new eventcalendarImpl();

		eventcalendarImpl.setNew(eventcalendar.isNew());
		eventcalendarImpl.setPrimaryKey(eventcalendar.getPrimaryKey());

		eventcalendarImpl.setId(eventcalendar.getId());
		eventcalendarImpl.setName(eventcalendar.getName());
		eventcalendarImpl.setStartdate(eventcalendar.getStartdate());
		eventcalendarImpl.setEnddate(eventcalendar.getEnddate());
		eventcalendarImpl.setColor(eventcalendar.getColor());
		eventcalendarImpl.setUrl(eventcalendar.getUrl());
		eventcalendarImpl.setUserid(eventcalendar.getUserid());

		return eventcalendarImpl;
	}

	/**
	 * Returns the eventcalendar with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the eventcalendar
	 * @return the eventcalendar
	 * @throws NoSucheventcalendarException if a eventcalendar with the primary key could not be found
	 */
	@Override
	public eventcalendar findByPrimaryKey(Serializable primaryKey)
		throws NoSucheventcalendarException {
		eventcalendar eventcalendar = fetchByPrimaryKey(primaryKey);

		if (eventcalendar == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSucheventcalendarException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return eventcalendar;
	}

	/**
	 * Returns the eventcalendar with the primary key or throws a {@link NoSucheventcalendarException} if it could not be found.
	 *
	 * @param id the primary key of the eventcalendar
	 * @return the eventcalendar
	 * @throws NoSucheventcalendarException if a eventcalendar with the primary key could not be found
	 */
	@Override
	public eventcalendar findByPrimaryKey(long id)
		throws NoSucheventcalendarException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the eventcalendar with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the eventcalendar
	 * @return the eventcalendar, or <code>null</code> if a eventcalendar with the primary key could not be found
	 */
	@Override
	public eventcalendar fetchByPrimaryKey(Serializable primaryKey) {
		eventcalendar eventcalendar = (eventcalendar)entityCache.getResult(eventcalendarModelImpl.ENTITY_CACHE_ENABLED,
				eventcalendarImpl.class, primaryKey);

		if (eventcalendar == _nulleventcalendar) {
			return null;
		}

		if (eventcalendar == null) {
			Session session = null;

			try {
				session = openSession();

				eventcalendar = (eventcalendar)session.get(eventcalendarImpl.class,
						primaryKey);

				if (eventcalendar != null) {
					cacheResult(eventcalendar);
				}
				else {
					entityCache.putResult(eventcalendarModelImpl.ENTITY_CACHE_ENABLED,
						eventcalendarImpl.class, primaryKey, _nulleventcalendar);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(eventcalendarModelImpl.ENTITY_CACHE_ENABLED,
					eventcalendarImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return eventcalendar;
	}

	/**
	 * Returns the eventcalendar with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the eventcalendar
	 * @return the eventcalendar, or <code>null</code> if a eventcalendar with the primary key could not be found
	 */
	@Override
	public eventcalendar fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, eventcalendar> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, eventcalendar> map = new HashMap<Serializable, eventcalendar>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			eventcalendar eventcalendar = fetchByPrimaryKey(primaryKey);

			if (eventcalendar != null) {
				map.put(primaryKey, eventcalendar);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			eventcalendar eventcalendar = (eventcalendar)entityCache.getResult(eventcalendarModelImpl.ENTITY_CACHE_ENABLED,
					eventcalendarImpl.class, primaryKey);

			if (eventcalendar == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, eventcalendar);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_EVENTCALENDAR_WHERE_PKS_IN);

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

			for (eventcalendar eventcalendar : (List<eventcalendar>)q.list()) {
				map.put(eventcalendar.getPrimaryKeyObj(), eventcalendar);

				cacheResult(eventcalendar);

				uncachedPrimaryKeys.remove(eventcalendar.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(eventcalendarModelImpl.ENTITY_CACHE_ENABLED,
					eventcalendarImpl.class, primaryKey, _nulleventcalendar);
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
	 * Returns all the eventcalendars.
	 *
	 * @return the eventcalendars
	 */
	@Override
	public List<eventcalendar> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the eventcalendars.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eventcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of eventcalendars
	 * @param end the upper bound of the range of eventcalendars (not inclusive)
	 * @return the range of eventcalendars
	 */
	@Override
	public List<eventcalendar> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the eventcalendars.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eventcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of eventcalendars
	 * @param end the upper bound of the range of eventcalendars (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of eventcalendars
	 */
	@Override
	public List<eventcalendar> findAll(int start, int end,
		OrderByComparator<eventcalendar> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the eventcalendars.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eventcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of eventcalendars
	 * @param end the upper bound of the range of eventcalendars (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of eventcalendars
	 */
	@Override
	public List<eventcalendar> findAll(int start, int end,
		OrderByComparator<eventcalendar> orderByComparator,
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

		List<eventcalendar> list = null;

		if (retrieveFromCache) {
			list = (List<eventcalendar>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_EVENTCALENDAR);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EVENTCALENDAR;

				if (pagination) {
					sql = sql.concat(eventcalendarModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<eventcalendar>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<eventcalendar>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the eventcalendars from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (eventcalendar eventcalendar : findAll()) {
			remove(eventcalendar);
		}
	}

	/**
	 * Returns the number of eventcalendars.
	 *
	 * @return the number of eventcalendars
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EVENTCALENDAR);

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
		return eventcalendarModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the eventcalendar persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(eventcalendarImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_EVENTCALENDAR = "SELECT eventcalendar FROM eventcalendar eventcalendar";
	private static final String _SQL_SELECT_EVENTCALENDAR_WHERE_PKS_IN = "SELECT eventcalendar FROM eventcalendar eventcalendar WHERE id_ IN (";
	private static final String _SQL_SELECT_EVENTCALENDAR_WHERE = "SELECT eventcalendar FROM eventcalendar eventcalendar WHERE ";
	private static final String _SQL_COUNT_EVENTCALENDAR = "SELECT COUNT(eventcalendar) FROM eventcalendar eventcalendar";
	private static final String _SQL_COUNT_EVENTCALENDAR_WHERE = "SELECT COUNT(eventcalendar) FROM eventcalendar eventcalendar WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "eventcalendar.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No eventcalendar exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No eventcalendar exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(eventcalendarPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final eventcalendar _nulleventcalendar = new eventcalendarImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<eventcalendar> toCacheModel() {
				return _nulleventcalendarCacheModel;
			}
		};

	private static final CacheModel<eventcalendar> _nulleventcalendarCacheModel = new CacheModel<eventcalendar>() {
			@Override
			public eventcalendar toEntityModel() {
				return _nulleventcalendar;
			}
		};
}