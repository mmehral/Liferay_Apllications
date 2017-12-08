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

package com.meera.workflow.db.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.BeanReference;
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
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.meera.workflow.db.exception.NoSuchFeedbackException;
import com.meera.workflow.db.model.Feedback;
import com.meera.workflow.db.model.impl.FeedbackImpl;
import com.meera.workflow.db.model.impl.FeedbackModelImpl;
import com.meera.workflow.db.service.persistence.FeedbackPersistence;

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
 * The persistence implementation for the feedback service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see FeedbackPersistence
 * @see com.meera.workflow.db.service.persistence.FeedbackUtil
 * @generated
 */
@ProviderType
public class FeedbackPersistenceImpl extends BasePersistenceImpl<Feedback>
	implements FeedbackPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FeedbackUtil} to access the feedback persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FeedbackImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, FeedbackImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, FeedbackImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, FeedbackImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, FeedbackImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			FeedbackModelImpl.UUID_COLUMN_BITMASK |
			FeedbackModelImpl.FEEDBACKDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the feedbacks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching feedbacks
	 */
	@Override
	public List<Feedback> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the feedbacks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @return the range of matching feedbacks
	 */
	@Override
	public List<Feedback> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the feedbacks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching feedbacks
	 */
	@Override
	public List<Feedback> findByUuid(String uuid, int start, int end,
		OrderByComparator<Feedback> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the feedbacks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching feedbacks
	 */
	@Override
	public List<Feedback> findByUuid(String uuid, int start, int end,
		OrderByComparator<Feedback> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<Feedback> list = null;

		if (retrieveFromCache) {
			list = (List<Feedback>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Feedback feedback : list) {
					if (!Objects.equals(uuid, feedback.getUuid())) {
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

			query.append(_SQL_SELECT_FEEDBACK_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FeedbackModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<Feedback>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Feedback>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first feedback in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedback
	 * @throws NoSuchFeedbackException if a matching feedback could not be found
	 */
	@Override
	public Feedback findByUuid_First(String uuid,
		OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException {
		Feedback feedback = fetchByUuid_First(uuid, orderByComparator);

		if (feedback != null) {
			return feedback;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFeedbackException(msg.toString());
	}

	/**
	 * Returns the first feedback in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	 */
	@Override
	public Feedback fetchByUuid_First(String uuid,
		OrderByComparator<Feedback> orderByComparator) {
		List<Feedback> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last feedback in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedback
	 * @throws NoSuchFeedbackException if a matching feedback could not be found
	 */
	@Override
	public Feedback findByUuid_Last(String uuid,
		OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException {
		Feedback feedback = fetchByUuid_Last(uuid, orderByComparator);

		if (feedback != null) {
			return feedback;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFeedbackException(msg.toString());
	}

	/**
	 * Returns the last feedback in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	 */
	@Override
	public Feedback fetchByUuid_Last(String uuid,
		OrderByComparator<Feedback> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Feedback> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the feedbacks before and after the current feedback in the ordered set where uuid = &#63;.
	 *
	 * @param feedbackId the primary key of the current feedback
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next feedback
	 * @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	 */
	@Override
	public Feedback[] findByUuid_PrevAndNext(long feedbackId, String uuid,
		OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException {
		Feedback feedback = findByPrimaryKey(feedbackId);

		Session session = null;

		try {
			session = openSession();

			Feedback[] array = new FeedbackImpl[3];

			array[0] = getByUuid_PrevAndNext(session, feedback, uuid,
					orderByComparator, true);

			array[1] = feedback;

			array[2] = getByUuid_PrevAndNext(session, feedback, uuid,
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

	protected Feedback getByUuid_PrevAndNext(Session session,
		Feedback feedback, String uuid,
		OrderByComparator<Feedback> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FEEDBACK_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
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
			query.append(FeedbackModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(feedback);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Feedback> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the feedbacks where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Feedback feedback : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(feedback);
		}
	}

	/**
	 * Returns the number of feedbacks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching feedbacks
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FEEDBACK_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "feedback.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "feedback.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(feedback.uuid IS NULL OR feedback.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, FeedbackImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			FeedbackModelImpl.UUID_COLUMN_BITMASK |
			FeedbackModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the feedback where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchFeedbackException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching feedback
	 * @throws NoSuchFeedbackException if a matching feedback could not be found
	 */
	@Override
	public Feedback findByUUID_G(String uuid, long groupId)
		throws NoSuchFeedbackException {
		Feedback feedback = fetchByUUID_G(uuid, groupId);

		if (feedback == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchFeedbackException(msg.toString());
		}

		return feedback;
	}

	/**
	 * Returns the feedback where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching feedback, or <code>null</code> if a matching feedback could not be found
	 */
	@Override
	public Feedback fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the feedback where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching feedback, or <code>null</code> if a matching feedback could not be found
	 */
	@Override
	public Feedback fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof Feedback) {
			Feedback feedback = (Feedback)result;

			if (!Objects.equals(uuid, feedback.getUuid()) ||
					(groupId != feedback.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_FEEDBACK_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<Feedback> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					Feedback feedback = list.get(0);

					result = feedback;

					cacheResult(feedback);

					if ((feedback.getUuid() == null) ||
							!feedback.getUuid().equals(uuid) ||
							(feedback.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, feedback);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Feedback)result;
		}
	}

	/**
	 * Removes the feedback where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the feedback that was removed
	 */
	@Override
	public Feedback removeByUUID_G(String uuid, long groupId)
		throws NoSuchFeedbackException {
		Feedback feedback = findByUUID_G(uuid, groupId);

		return remove(feedback);
	}

	/**
	 * Returns the number of feedbacks where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching feedbacks
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FEEDBACK_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "feedback.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "feedback.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(feedback.uuid IS NULL OR feedback.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "feedback.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, FeedbackImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, FeedbackImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			FeedbackModelImpl.UUID_COLUMN_BITMASK |
			FeedbackModelImpl.COMPANYID_COLUMN_BITMASK |
			FeedbackModelImpl.FEEDBACKDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the feedbacks where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching feedbacks
	 */
	@Override
	public List<Feedback> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the feedbacks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @return the range of matching feedbacks
	 */
	@Override
	public List<Feedback> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the feedbacks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching feedbacks
	 */
	@Override
	public List<Feedback> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<Feedback> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the feedbacks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching feedbacks
	 */
	@Override
	public List<Feedback> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<Feedback> list = null;

		if (retrieveFromCache) {
			list = (List<Feedback>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Feedback feedback : list) {
					if (!Objects.equals(uuid, feedback.getUuid()) ||
							(companyId != feedback.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_FEEDBACK_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FeedbackModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Feedback>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Feedback>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedback
	 * @throws NoSuchFeedbackException if a matching feedback could not be found
	 */
	@Override
	public Feedback findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException {
		Feedback feedback = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (feedback != null) {
			return feedback;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFeedbackException(msg.toString());
	}

	/**
	 * Returns the first feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	 */
	@Override
	public Feedback fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Feedback> orderByComparator) {
		List<Feedback> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedback
	 * @throws NoSuchFeedbackException if a matching feedback could not be found
	 */
	@Override
	public Feedback findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException {
		Feedback feedback = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (feedback != null) {
			return feedback;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFeedbackException(msg.toString());
	}

	/**
	 * Returns the last feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	 */
	@Override
	public Feedback fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Feedback> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Feedback> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the feedbacks before and after the current feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param feedbackId the primary key of the current feedback
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next feedback
	 * @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	 */
	@Override
	public Feedback[] findByUuid_C_PrevAndNext(long feedbackId, String uuid,
		long companyId, OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException {
		Feedback feedback = findByPrimaryKey(feedbackId);

		Session session = null;

		try {
			session = openSession();

			Feedback[] array = new FeedbackImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, feedback, uuid,
					companyId, orderByComparator, true);

			array[1] = feedback;

			array[2] = getByUuid_C_PrevAndNext(session, feedback, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Feedback getByUuid_C_PrevAndNext(Session session,
		Feedback feedback, String uuid, long companyId,
		OrderByComparator<Feedback> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_FEEDBACK_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

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
			query.append(FeedbackModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(feedback);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Feedback> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the feedbacks where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Feedback feedback : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(feedback);
		}
	}

	/**
	 * Returns the number of feedbacks where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching feedbacks
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FEEDBACK_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "feedback.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "feedback.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(feedback.uuid IS NULL OR feedback.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "feedback.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, FeedbackImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, FeedbackImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			FeedbackModelImpl.GROUPID_COLUMN_BITMASK |
			FeedbackModelImpl.FEEDBACKDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the feedbacks where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching feedbacks
	 */
	@Override
	public List<Feedback> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the feedbacks where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @return the range of matching feedbacks
	 */
	@Override
	public List<Feedback> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the feedbacks where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching feedbacks
	 */
	@Override
	public List<Feedback> findByGroupId(long groupId, int start, int end,
		OrderByComparator<Feedback> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the feedbacks where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching feedbacks
	 */
	@Override
	public List<Feedback> findByGroupId(long groupId, int start, int end,
		OrderByComparator<Feedback> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<Feedback> list = null;

		if (retrieveFromCache) {
			list = (List<Feedback>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Feedback feedback : list) {
					if ((groupId != feedback.getGroupId())) {
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

			query.append(_SQL_SELECT_FEEDBACK_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FeedbackModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<Feedback>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Feedback>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first feedback in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedback
	 * @throws NoSuchFeedbackException if a matching feedback could not be found
	 */
	@Override
	public Feedback findByGroupId_First(long groupId,
		OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException {
		Feedback feedback = fetchByGroupId_First(groupId, orderByComparator);

		if (feedback != null) {
			return feedback;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFeedbackException(msg.toString());
	}

	/**
	 * Returns the first feedback in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	 */
	@Override
	public Feedback fetchByGroupId_First(long groupId,
		OrderByComparator<Feedback> orderByComparator) {
		List<Feedback> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last feedback in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedback
	 * @throws NoSuchFeedbackException if a matching feedback could not be found
	 */
	@Override
	public Feedback findByGroupId_Last(long groupId,
		OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException {
		Feedback feedback = fetchByGroupId_Last(groupId, orderByComparator);

		if (feedback != null) {
			return feedback;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFeedbackException(msg.toString());
	}

	/**
	 * Returns the last feedback in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	 */
	@Override
	public Feedback fetchByGroupId_Last(long groupId,
		OrderByComparator<Feedback> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<Feedback> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the feedbacks before and after the current feedback in the ordered set where groupId = &#63;.
	 *
	 * @param feedbackId the primary key of the current feedback
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next feedback
	 * @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	 */
	@Override
	public Feedback[] findByGroupId_PrevAndNext(long feedbackId, long groupId,
		OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException {
		Feedback feedback = findByPrimaryKey(feedbackId);

		Session session = null;

		try {
			session = openSession();

			Feedback[] array = new FeedbackImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, feedback, groupId,
					orderByComparator, true);

			array[1] = feedback;

			array[2] = getByGroupId_PrevAndNext(session, feedback, groupId,
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

	protected Feedback getByGroupId_PrevAndNext(Session session,
		Feedback feedback, long groupId,
		OrderByComparator<Feedback> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FEEDBACK_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

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
			query.append(FeedbackModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(feedback);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Feedback> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the feedbacks where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (Feedback feedback : findByGroupId(groupId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(feedback);
		}
	}

	/**
	 * Returns the number of feedbacks where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching feedbacks
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FEEDBACK_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "feedback.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, FeedbackImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
		new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, FeedbackImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
			new String[] { Long.class.getName() },
			FeedbackModelImpl.COMPANYID_COLUMN_BITMASK |
			FeedbackModelImpl.FEEDBACKDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the feedbacks where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching feedbacks
	 */
	@Override
	public List<Feedback> findByCompanyId(long companyId) {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the feedbacks where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @return the range of matching feedbacks
	 */
	@Override
	public List<Feedback> findByCompanyId(long companyId, int start, int end) {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the feedbacks where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching feedbacks
	 */
	@Override
	public List<Feedback> findByCompanyId(long companyId, int start, int end,
		OrderByComparator<Feedback> orderByComparator) {
		return findByCompanyId(companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the feedbacks where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching feedbacks
	 */
	@Override
	public List<Feedback> findByCompanyId(long companyId, int start, int end,
		OrderByComparator<Feedback> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID;
			finderArgs = new Object[] { companyId, start, end, orderByComparator };
		}

		List<Feedback> list = null;

		if (retrieveFromCache) {
			list = (List<Feedback>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Feedback feedback : list) {
					if ((companyId != feedback.getCompanyId())) {
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

			query.append(_SQL_SELECT_FEEDBACK_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FeedbackModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Feedback>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Feedback>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first feedback in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedback
	 * @throws NoSuchFeedbackException if a matching feedback could not be found
	 */
	@Override
	public Feedback findByCompanyId_First(long companyId,
		OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException {
		Feedback feedback = fetchByCompanyId_First(companyId, orderByComparator);

		if (feedback != null) {
			return feedback;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFeedbackException(msg.toString());
	}

	/**
	 * Returns the first feedback in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	 */
	@Override
	public Feedback fetchByCompanyId_First(long companyId,
		OrderByComparator<Feedback> orderByComparator) {
		List<Feedback> list = findByCompanyId(companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last feedback in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedback
	 * @throws NoSuchFeedbackException if a matching feedback could not be found
	 */
	@Override
	public Feedback findByCompanyId_Last(long companyId,
		OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException {
		Feedback feedback = fetchByCompanyId_Last(companyId, orderByComparator);

		if (feedback != null) {
			return feedback;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFeedbackException(msg.toString());
	}

	/**
	 * Returns the last feedback in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	 */
	@Override
	public Feedback fetchByCompanyId_Last(long companyId,
		OrderByComparator<Feedback> orderByComparator) {
		int count = countByCompanyId(companyId);

		if (count == 0) {
			return null;
		}

		List<Feedback> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the feedbacks before and after the current feedback in the ordered set where companyId = &#63;.
	 *
	 * @param feedbackId the primary key of the current feedback
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next feedback
	 * @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	 */
	@Override
	public Feedback[] findByCompanyId_PrevAndNext(long feedbackId,
		long companyId, OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException {
		Feedback feedback = findByPrimaryKey(feedbackId);

		Session session = null;

		try {
			session = openSession();

			Feedback[] array = new FeedbackImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, feedback, companyId,
					orderByComparator, true);

			array[1] = feedback;

			array[2] = getByCompanyId_PrevAndNext(session, feedback, companyId,
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

	protected Feedback getByCompanyId_PrevAndNext(Session session,
		Feedback feedback, long companyId,
		OrderByComparator<Feedback> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FEEDBACK_WHERE);

		query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

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
			query.append(FeedbackModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(feedback);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Feedback> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the feedbacks where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	@Override
	public void removeByCompanyId(long companyId) {
		for (Feedback feedback : findByCompanyId(companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(feedback);
		}
	}

	/**
	 * Returns the number of feedbacks where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching feedbacks
	 */
	@Override
	public int countByCompanyId(long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPANYID;

		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FEEDBACK_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

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

	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "feedback.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FEEDBACKTEXT =
		new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, FeedbackImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByfeedbackText",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FEEDBACKTEXT =
		new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, FeedbackImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByfeedbackText",
			new String[] { String.class.getName() },
			FeedbackModelImpl.FEEDBACKTEXT_COLUMN_BITMASK |
			FeedbackModelImpl.FEEDBACKDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FEEDBACKTEXT = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfeedbackText",
			new String[] { String.class.getName() });

	/**
	 * Returns all the feedbacks where feedbackText = &#63;.
	 *
	 * @param feedbackText the feedback text
	 * @return the matching feedbacks
	 */
	@Override
	public List<Feedback> findByfeedbackText(String feedbackText) {
		return findByfeedbackText(feedbackText, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the feedbacks where feedbackText = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param feedbackText the feedback text
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @return the range of matching feedbacks
	 */
	@Override
	public List<Feedback> findByfeedbackText(String feedbackText, int start,
		int end) {
		return findByfeedbackText(feedbackText, start, end, null);
	}

	/**
	 * Returns an ordered range of all the feedbacks where feedbackText = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param feedbackText the feedback text
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching feedbacks
	 */
	@Override
	public List<Feedback> findByfeedbackText(String feedbackText, int start,
		int end, OrderByComparator<Feedback> orderByComparator) {
		return findByfeedbackText(feedbackText, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the feedbacks where feedbackText = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param feedbackText the feedback text
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching feedbacks
	 */
	@Override
	public List<Feedback> findByfeedbackText(String feedbackText, int start,
		int end, OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FEEDBACKTEXT;
			finderArgs = new Object[] { feedbackText };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FEEDBACKTEXT;
			finderArgs = new Object[] {
					feedbackText,
					
					start, end, orderByComparator
				};
		}

		List<Feedback> list = null;

		if (retrieveFromCache) {
			list = (List<Feedback>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Feedback feedback : list) {
					if (!Objects.equals(feedbackText, feedback.getFeedbackText())) {
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

			query.append(_SQL_SELECT_FEEDBACK_WHERE);

			boolean bindFeedbackText = false;

			if (feedbackText == null) {
				query.append(_FINDER_COLUMN_FEEDBACKTEXT_FEEDBACKTEXT_1);
			}
			else if (feedbackText.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FEEDBACKTEXT_FEEDBACKTEXT_3);
			}
			else {
				bindFeedbackText = true;

				query.append(_FINDER_COLUMN_FEEDBACKTEXT_FEEDBACKTEXT_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FeedbackModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFeedbackText) {
					qPos.add(feedbackText);
				}

				if (!pagination) {
					list = (List<Feedback>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Feedback>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first feedback in the ordered set where feedbackText = &#63;.
	 *
	 * @param feedbackText the feedback text
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedback
	 * @throws NoSuchFeedbackException if a matching feedback could not be found
	 */
	@Override
	public Feedback findByfeedbackText_First(String feedbackText,
		OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException {
		Feedback feedback = fetchByfeedbackText_First(feedbackText,
				orderByComparator);

		if (feedback != null) {
			return feedback;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("feedbackText=");
		msg.append(feedbackText);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFeedbackException(msg.toString());
	}

	/**
	 * Returns the first feedback in the ordered set where feedbackText = &#63;.
	 *
	 * @param feedbackText the feedback text
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	 */
	@Override
	public Feedback fetchByfeedbackText_First(String feedbackText,
		OrderByComparator<Feedback> orderByComparator) {
		List<Feedback> list = findByfeedbackText(feedbackText, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last feedback in the ordered set where feedbackText = &#63;.
	 *
	 * @param feedbackText the feedback text
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedback
	 * @throws NoSuchFeedbackException if a matching feedback could not be found
	 */
	@Override
	public Feedback findByfeedbackText_Last(String feedbackText,
		OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException {
		Feedback feedback = fetchByfeedbackText_Last(feedbackText,
				orderByComparator);

		if (feedback != null) {
			return feedback;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("feedbackText=");
		msg.append(feedbackText);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFeedbackException(msg.toString());
	}

	/**
	 * Returns the last feedback in the ordered set where feedbackText = &#63;.
	 *
	 * @param feedbackText the feedback text
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	 */
	@Override
	public Feedback fetchByfeedbackText_Last(String feedbackText,
		OrderByComparator<Feedback> orderByComparator) {
		int count = countByfeedbackText(feedbackText);

		if (count == 0) {
			return null;
		}

		List<Feedback> list = findByfeedbackText(feedbackText, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the feedbacks before and after the current feedback in the ordered set where feedbackText = &#63;.
	 *
	 * @param feedbackId the primary key of the current feedback
	 * @param feedbackText the feedback text
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next feedback
	 * @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	 */
	@Override
	public Feedback[] findByfeedbackText_PrevAndNext(long feedbackId,
		String feedbackText, OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException {
		Feedback feedback = findByPrimaryKey(feedbackId);

		Session session = null;

		try {
			session = openSession();

			Feedback[] array = new FeedbackImpl[3];

			array[0] = getByfeedbackText_PrevAndNext(session, feedback,
					feedbackText, orderByComparator, true);

			array[1] = feedback;

			array[2] = getByfeedbackText_PrevAndNext(session, feedback,
					feedbackText, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Feedback getByfeedbackText_PrevAndNext(Session session,
		Feedback feedback, String feedbackText,
		OrderByComparator<Feedback> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FEEDBACK_WHERE);

		boolean bindFeedbackText = false;

		if (feedbackText == null) {
			query.append(_FINDER_COLUMN_FEEDBACKTEXT_FEEDBACKTEXT_1);
		}
		else if (feedbackText.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FEEDBACKTEXT_FEEDBACKTEXT_3);
		}
		else {
			bindFeedbackText = true;

			query.append(_FINDER_COLUMN_FEEDBACKTEXT_FEEDBACKTEXT_2);
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
			query.append(FeedbackModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindFeedbackText) {
			qPos.add(feedbackText);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(feedback);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Feedback> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the feedbacks where feedbackText = &#63; from the database.
	 *
	 * @param feedbackText the feedback text
	 */
	@Override
	public void removeByfeedbackText(String feedbackText) {
		for (Feedback feedback : findByfeedbackText(feedbackText,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(feedback);
		}
	}

	/**
	 * Returns the number of feedbacks where feedbackText = &#63;.
	 *
	 * @param feedbackText the feedback text
	 * @return the number of matching feedbacks
	 */
	@Override
	public int countByfeedbackText(String feedbackText) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FEEDBACKTEXT;

		Object[] finderArgs = new Object[] { feedbackText };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FEEDBACK_WHERE);

			boolean bindFeedbackText = false;

			if (feedbackText == null) {
				query.append(_FINDER_COLUMN_FEEDBACKTEXT_FEEDBACKTEXT_1);
			}
			else if (feedbackText.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FEEDBACKTEXT_FEEDBACKTEXT_3);
			}
			else {
				bindFeedbackText = true;

				query.append(_FINDER_COLUMN_FEEDBACKTEXT_FEEDBACKTEXT_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFeedbackText) {
					qPos.add(feedbackText);
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

	private static final String _FINDER_COLUMN_FEEDBACKTEXT_FEEDBACKTEXT_1 = "feedback.feedbackText IS NULL";
	private static final String _FINDER_COLUMN_FEEDBACKTEXT_FEEDBACKTEXT_2 = "feedback.feedbackText = ?";
	private static final String _FINDER_COLUMN_FEEDBACKTEXT_FEEDBACKTEXT_3 = "(feedback.feedbackText IS NULL OR feedback.feedbackText = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_S = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, FeedbackImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_S",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, FeedbackImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_S",
			new String[] { Long.class.getName(), Integer.class.getName() },
			FeedbackModelImpl.GROUPID_COLUMN_BITMASK |
			FeedbackModelImpl.FEEDBACKSTATUS_COLUMN_BITMASK |
			FeedbackModelImpl.FEEDBACKDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_G_S = new FinderPath(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_S",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the feedbacks where groupId = &#63; and feedBackStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param feedBackStatus the feed back status
	 * @return the matching feedbacks
	 */
	@Override
	public List<Feedback> findByG_S(long groupId, int feedBackStatus) {
		return findByG_S(groupId, feedBackStatus, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the feedbacks where groupId = &#63; and feedBackStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param feedBackStatus the feed back status
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @return the range of matching feedbacks
	 */
	@Override
	public List<Feedback> findByG_S(long groupId, int feedBackStatus,
		int start, int end) {
		return findByG_S(groupId, feedBackStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the feedbacks where groupId = &#63; and feedBackStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param feedBackStatus the feed back status
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching feedbacks
	 */
	@Override
	public List<Feedback> findByG_S(long groupId, int feedBackStatus,
		int start, int end, OrderByComparator<Feedback> orderByComparator) {
		return findByG_S(groupId, feedBackStatus, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the feedbacks where groupId = &#63; and feedBackStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param feedBackStatus the feed back status
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching feedbacks
	 */
	@Override
	public List<Feedback> findByG_S(long groupId, int feedBackStatus,
		int start, int end, OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S;
			finderArgs = new Object[] { groupId, feedBackStatus };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_S;
			finderArgs = new Object[] {
					groupId, feedBackStatus,
					
					start, end, orderByComparator
				};
		}

		List<Feedback> list = null;

		if (retrieveFromCache) {
			list = (List<Feedback>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Feedback feedback : list) {
					if ((groupId != feedback.getGroupId()) ||
							(feedBackStatus != feedback.getFeedBackStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_FEEDBACK_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			query.append(_FINDER_COLUMN_G_S_FEEDBACKSTATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FeedbackModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(feedBackStatus);

				if (!pagination) {
					list = (List<Feedback>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Feedback>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first feedback in the ordered set where groupId = &#63; and feedBackStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param feedBackStatus the feed back status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedback
	 * @throws NoSuchFeedbackException if a matching feedback could not be found
	 */
	@Override
	public Feedback findByG_S_First(long groupId, int feedBackStatus,
		OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException {
		Feedback feedback = fetchByG_S_First(groupId, feedBackStatus,
				orderByComparator);

		if (feedback != null) {
			return feedback;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", feedBackStatus=");
		msg.append(feedBackStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFeedbackException(msg.toString());
	}

	/**
	 * Returns the first feedback in the ordered set where groupId = &#63; and feedBackStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param feedBackStatus the feed back status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	 */
	@Override
	public Feedback fetchByG_S_First(long groupId, int feedBackStatus,
		OrderByComparator<Feedback> orderByComparator) {
		List<Feedback> list = findByG_S(groupId, feedBackStatus, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last feedback in the ordered set where groupId = &#63; and feedBackStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param feedBackStatus the feed back status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedback
	 * @throws NoSuchFeedbackException if a matching feedback could not be found
	 */
	@Override
	public Feedback findByG_S_Last(long groupId, int feedBackStatus,
		OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException {
		Feedback feedback = fetchByG_S_Last(groupId, feedBackStatus,
				orderByComparator);

		if (feedback != null) {
			return feedback;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(", feedBackStatus=");
		msg.append(feedBackStatus);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFeedbackException(msg.toString());
	}

	/**
	 * Returns the last feedback in the ordered set where groupId = &#63; and feedBackStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param feedBackStatus the feed back status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	 */
	@Override
	public Feedback fetchByG_S_Last(long groupId, int feedBackStatus,
		OrderByComparator<Feedback> orderByComparator) {
		int count = countByG_S(groupId, feedBackStatus);

		if (count == 0) {
			return null;
		}

		List<Feedback> list = findByG_S(groupId, feedBackStatus, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the feedbacks before and after the current feedback in the ordered set where groupId = &#63; and feedBackStatus = &#63;.
	 *
	 * @param feedbackId the primary key of the current feedback
	 * @param groupId the group ID
	 * @param feedBackStatus the feed back status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next feedback
	 * @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	 */
	@Override
	public Feedback[] findByG_S_PrevAndNext(long feedbackId, long groupId,
		int feedBackStatus, OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException {
		Feedback feedback = findByPrimaryKey(feedbackId);

		Session session = null;

		try {
			session = openSession();

			Feedback[] array = new FeedbackImpl[3];

			array[0] = getByG_S_PrevAndNext(session, feedback, groupId,
					feedBackStatus, orderByComparator, true);

			array[1] = feedback;

			array[2] = getByG_S_PrevAndNext(session, feedback, groupId,
					feedBackStatus, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Feedback getByG_S_PrevAndNext(Session session, Feedback feedback,
		long groupId, int feedBackStatus,
		OrderByComparator<Feedback> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_FEEDBACK_WHERE);

		query.append(_FINDER_COLUMN_G_S_GROUPID_2);

		query.append(_FINDER_COLUMN_G_S_FEEDBACKSTATUS_2);

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
			query.append(FeedbackModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		qPos.add(feedBackStatus);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(feedback);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Feedback> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the feedbacks where groupId = &#63; and feedBackStatus = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param feedBackStatus the feed back status
	 */
	@Override
	public void removeByG_S(long groupId, int feedBackStatus) {
		for (Feedback feedback : findByG_S(groupId, feedBackStatus,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(feedback);
		}
	}

	/**
	 * Returns the number of feedbacks where groupId = &#63; and feedBackStatus = &#63;.
	 *
	 * @param groupId the group ID
	 * @param feedBackStatus the feed back status
	 * @return the number of matching feedbacks
	 */
	@Override
	public int countByG_S(long groupId, int feedBackStatus) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_G_S;

		Object[] finderArgs = new Object[] { groupId, feedBackStatus };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FEEDBACK_WHERE);

			query.append(_FINDER_COLUMN_G_S_GROUPID_2);

			query.append(_FINDER_COLUMN_G_S_FEEDBACKSTATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				qPos.add(feedBackStatus);

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

	private static final String _FINDER_COLUMN_G_S_GROUPID_2 = "feedback.groupId = ? AND ";
	private static final String _FINDER_COLUMN_G_S_FEEDBACKSTATUS_2 = "feedback.feedBackStatus = ?";

	public FeedbackPersistenceImpl() {
		setModelClass(Feedback.class);
	}

	/**
	 * Caches the feedback in the entity cache if it is enabled.
	 *
	 * @param feedback the feedback
	 */
	@Override
	public void cacheResult(Feedback feedback) {
		entityCache.putResult(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackImpl.class, feedback.getPrimaryKey(), feedback);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { feedback.getUuid(), feedback.getGroupId() }, feedback);

		feedback.resetOriginalValues();
	}

	/**
	 * Caches the feedbacks in the entity cache if it is enabled.
	 *
	 * @param feedbacks the feedbacks
	 */
	@Override
	public void cacheResult(List<Feedback> feedbacks) {
		for (Feedback feedback : feedbacks) {
			if (entityCache.getResult(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
						FeedbackImpl.class, feedback.getPrimaryKey()) == null) {
				cacheResult(feedback);
			}
			else {
				feedback.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all feedbacks.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FeedbackImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the feedback.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Feedback feedback) {
		entityCache.removeResult(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackImpl.class, feedback.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((FeedbackModelImpl)feedback);
	}

	@Override
	public void clearCache(List<Feedback> feedbacks) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Feedback feedback : feedbacks) {
			entityCache.removeResult(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
				FeedbackImpl.class, feedback.getPrimaryKey());

			clearUniqueFindersCache((FeedbackModelImpl)feedback);
		}
	}

	protected void cacheUniqueFindersCache(
		FeedbackModelImpl feedbackModelImpl, boolean isNew) {
		if (isNew) {
			Object[] args = new Object[] {
					feedbackModelImpl.getUuid(), feedbackModelImpl.getGroupId()
				};

			finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				feedbackModelImpl);
		}
		else {
			if ((feedbackModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						feedbackModelImpl.getUuid(),
						feedbackModelImpl.getGroupId()
					};

				finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					feedbackModelImpl);
			}
		}
	}

	protected void clearUniqueFindersCache(FeedbackModelImpl feedbackModelImpl) {
		Object[] args = new Object[] {
				feedbackModelImpl.getUuid(), feedbackModelImpl.getGroupId()
			};

		finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((feedbackModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					feedbackModelImpl.getOriginalUuid(),
					feedbackModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new feedback with the primary key. Does not add the feedback to the database.
	 *
	 * @param feedbackId the primary key for the new feedback
	 * @return the new feedback
	 */
	@Override
	public Feedback create(long feedbackId) {
		Feedback feedback = new FeedbackImpl();

		feedback.setNew(true);
		feedback.setPrimaryKey(feedbackId);

		String uuid = PortalUUIDUtil.generate();

		feedback.setUuid(uuid);

		feedback.setCompanyId(companyProvider.getCompanyId());

		return feedback;
	}

	/**
	 * Removes the feedback with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param feedbackId the primary key of the feedback
	 * @return the feedback that was removed
	 * @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	 */
	@Override
	public Feedback remove(long feedbackId) throws NoSuchFeedbackException {
		return remove((Serializable)feedbackId);
	}

	/**
	 * Removes the feedback with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the feedback
	 * @return the feedback that was removed
	 * @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	 */
	@Override
	public Feedback remove(Serializable primaryKey)
		throws NoSuchFeedbackException {
		Session session = null;

		try {
			session = openSession();

			Feedback feedback = (Feedback)session.get(FeedbackImpl.class,
					primaryKey);

			if (feedback == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFeedbackException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(feedback);
		}
		catch (NoSuchFeedbackException nsee) {
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
	protected Feedback removeImpl(Feedback feedback) {
		feedback = toUnwrappedModel(feedback);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(feedback)) {
				feedback = (Feedback)session.get(FeedbackImpl.class,
						feedback.getPrimaryKeyObj());
			}

			if (feedback != null) {
				session.delete(feedback);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (feedback != null) {
			clearCache(feedback);
		}

		return feedback;
	}

	@Override
	public Feedback updateImpl(Feedback feedback) {
		feedback = toUnwrappedModel(feedback);

		boolean isNew = feedback.isNew();

		FeedbackModelImpl feedbackModelImpl = (FeedbackModelImpl)feedback;

		if (Validator.isNull(feedback.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			feedback.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (feedback.isNew()) {
				session.save(feedback);

				feedback.setNew(false);
			}
			else {
				feedback = (Feedback)session.merge(feedback);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FeedbackModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((feedbackModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { feedbackModelImpl.getOriginalUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { feedbackModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((feedbackModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						feedbackModelImpl.getOriginalUuid(),
						feedbackModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						feedbackModelImpl.getUuid(),
						feedbackModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((feedbackModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						feedbackModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { feedbackModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((feedbackModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						feedbackModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPANYID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);

				args = new Object[] { feedbackModelImpl.getCompanyId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_COMPANYID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
					args);
			}

			if ((feedbackModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FEEDBACKTEXT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						feedbackModelImpl.getOriginalFeedbackText()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FEEDBACKTEXT, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FEEDBACKTEXT,
					args);

				args = new Object[] { feedbackModelImpl.getFeedbackText() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FEEDBACKTEXT, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FEEDBACKTEXT,
					args);
			}

			if ((feedbackModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						feedbackModelImpl.getOriginalGroupId(),
						feedbackModelImpl.getOriginalFeedBackStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S,
					args);

				args = new Object[] {
						feedbackModelImpl.getGroupId(),
						feedbackModelImpl.getFeedBackStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_G_S, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S,
					args);
			}
		}

		entityCache.putResult(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
			FeedbackImpl.class, feedback.getPrimaryKey(), feedback, false);

		clearUniqueFindersCache(feedbackModelImpl);
		cacheUniqueFindersCache(feedbackModelImpl, isNew);

		feedback.resetOriginalValues();

		return feedback;
	}

	protected Feedback toUnwrappedModel(Feedback feedback) {
		if (feedback instanceof FeedbackImpl) {
			return feedback;
		}

		FeedbackImpl feedbackImpl = new FeedbackImpl();

		feedbackImpl.setNew(feedback.isNew());
		feedbackImpl.setPrimaryKey(feedback.getPrimaryKey());

		feedbackImpl.setUuid(feedback.getUuid());
		feedbackImpl.setFeedbackId(feedback.getFeedbackId());
		feedbackImpl.setFeedbackDate(feedback.getFeedbackDate());
		feedbackImpl.setFeedbackText(feedback.getFeedbackText());
		feedbackImpl.setFeedbackSubject(feedback.getFeedbackSubject());
		feedbackImpl.setFeedBackStatus(feedback.getFeedBackStatus());
		feedbackImpl.setStatusByUserId(feedback.getStatusByUserId());
		feedbackImpl.setStatusDate(feedback.getStatusDate());
		feedbackImpl.setCompanyId(feedback.getCompanyId());
		feedbackImpl.setGroupId(feedback.getGroupId());
		feedbackImpl.setUserId(feedback.getUserId());

		return feedbackImpl;
	}

	/**
	 * Returns the feedback with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the feedback
	 * @return the feedback
	 * @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	 */
	@Override
	public Feedback findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFeedbackException {
		Feedback feedback = fetchByPrimaryKey(primaryKey);

		if (feedback == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFeedbackException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return feedback;
	}

	/**
	 * Returns the feedback with the primary key or throws a {@link NoSuchFeedbackException} if it could not be found.
	 *
	 * @param feedbackId the primary key of the feedback
	 * @return the feedback
	 * @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	 */
	@Override
	public Feedback findByPrimaryKey(long feedbackId)
		throws NoSuchFeedbackException {
		return findByPrimaryKey((Serializable)feedbackId);
	}

	/**
	 * Returns the feedback with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the feedback
	 * @return the feedback, or <code>null</code> if a feedback with the primary key could not be found
	 */
	@Override
	public Feedback fetchByPrimaryKey(Serializable primaryKey) {
		Feedback feedback = (Feedback)entityCache.getResult(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
				FeedbackImpl.class, primaryKey);

		if (feedback == _nullFeedback) {
			return null;
		}

		if (feedback == null) {
			Session session = null;

			try {
				session = openSession();

				feedback = (Feedback)session.get(FeedbackImpl.class, primaryKey);

				if (feedback != null) {
					cacheResult(feedback);
				}
				else {
					entityCache.putResult(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
						FeedbackImpl.class, primaryKey, _nullFeedback);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
					FeedbackImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return feedback;
	}

	/**
	 * Returns the feedback with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param feedbackId the primary key of the feedback
	 * @return the feedback, or <code>null</code> if a feedback with the primary key could not be found
	 */
	@Override
	public Feedback fetchByPrimaryKey(long feedbackId) {
		return fetchByPrimaryKey((Serializable)feedbackId);
	}

	@Override
	public Map<Serializable, Feedback> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Feedback> map = new HashMap<Serializable, Feedback>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Feedback feedback = fetchByPrimaryKey(primaryKey);

			if (feedback != null) {
				map.put(primaryKey, feedback);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Feedback feedback = (Feedback)entityCache.getResult(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
					FeedbackImpl.class, primaryKey);

			if (feedback == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, feedback);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_FEEDBACK_WHERE_PKS_IN);

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

			for (Feedback feedback : (List<Feedback>)q.list()) {
				map.put(feedback.getPrimaryKeyObj(), feedback);

				cacheResult(feedback);

				uncachedPrimaryKeys.remove(feedback.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(FeedbackModelImpl.ENTITY_CACHE_ENABLED,
					FeedbackImpl.class, primaryKey, _nullFeedback);
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
	 * Returns all the feedbacks.
	 *
	 * @return the feedbacks
	 */
	@Override
	public List<Feedback> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the feedbacks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @return the range of feedbacks
	 */
	@Override
	public List<Feedback> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the feedbacks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of feedbacks
	 */
	@Override
	public List<Feedback> findAll(int start, int end,
		OrderByComparator<Feedback> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the feedbacks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of feedbacks
	 */
	@Override
	public List<Feedback> findAll(int start, int end,
		OrderByComparator<Feedback> orderByComparator, boolean retrieveFromCache) {
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

		List<Feedback> list = null;

		if (retrieveFromCache) {
			list = (List<Feedback>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_FEEDBACK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FEEDBACK;

				if (pagination) {
					sql = sql.concat(FeedbackModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Feedback>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Feedback>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the feedbacks from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Feedback feedback : findAll()) {
			remove(feedback);
		}
	}

	/**
	 * Returns the number of feedbacks.
	 *
	 * @return the number of feedbacks
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FEEDBACK);

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
		return FeedbackModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the feedback persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(FeedbackImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_FEEDBACK = "SELECT feedback FROM Feedback feedback";
	private static final String _SQL_SELECT_FEEDBACK_WHERE_PKS_IN = "SELECT feedback FROM Feedback feedback WHERE feedbackId IN (";
	private static final String _SQL_SELECT_FEEDBACK_WHERE = "SELECT feedback FROM Feedback feedback WHERE ";
	private static final String _SQL_COUNT_FEEDBACK = "SELECT COUNT(feedback) FROM Feedback feedback";
	private static final String _SQL_COUNT_FEEDBACK_WHERE = "SELECT COUNT(feedback) FROM Feedback feedback WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "feedback.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Feedback exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Feedback exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(FeedbackPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static final Feedback _nullFeedback = new FeedbackImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Feedback> toCacheModel() {
				return _nullFeedbackCacheModel;
			}
		};

	private static final CacheModel<Feedback> _nullFeedbackCacheModel = new CacheModel<Feedback>() {
			@Override
			public Feedback toEntityModel() {
				return _nullFeedback;
			}
		};
}