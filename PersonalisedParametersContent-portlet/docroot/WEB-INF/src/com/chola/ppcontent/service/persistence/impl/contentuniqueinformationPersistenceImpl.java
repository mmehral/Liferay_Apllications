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

package com.chola.ppcontent.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.ppcontent.exception.NoSuchcontentuniqueinformationException;
import com.chola.ppcontent.model.contentuniqueinformation;
import com.chola.ppcontent.model.impl.contentuniqueinformationImpl;
import com.chola.ppcontent.model.impl.contentuniqueinformationModelImpl;
import com.chola.ppcontent.service.persistence.contentuniqueinformationPersistence;

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
 * The persistence implementation for the contentuniqueinformation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see contentuniqueinformationPersistence
 * @see com.chola.ppcontent.service.persistence.contentuniqueinformationUtil
 * @generated
 */
@ProviderType
public class contentuniqueinformationPersistenceImpl extends BasePersistenceImpl<contentuniqueinformation>
	implements contentuniqueinformationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link contentuniqueinformationUtil} to access the contentuniqueinformation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = contentuniqueinformationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(contentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			contentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			contentuniqueinformationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(contentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			contentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			contentuniqueinformationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(contentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			contentuniqueinformationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENTID =
		new FinderPath(contentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			contentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			contentuniqueinformationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCONTENTID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID =
		new FinderPath(contentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			contentuniqueinformationModelImpl.FINDER_CACHE_ENABLED,
			contentuniqueinformationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCONTENTID",
			new String[] { Long.class.getName() },
			contentuniqueinformationModelImpl.CONTENT_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTENTID = new FinderPath(contentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			contentuniqueinformationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCONTENTID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the contentuniqueinformations where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the matching contentuniqueinformations
	 */
	@Override
	public List<contentuniqueinformation> findByCONTENTID(long content_id) {
		return findByCONTENTID(content_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the contentuniqueinformations where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of contentuniqueinformations
	 * @param end the upper bound of the range of contentuniqueinformations (not inclusive)
	 * @return the range of matching contentuniqueinformations
	 */
	@Override
	public List<contentuniqueinformation> findByCONTENTID(long content_id,
		int start, int end) {
		return findByCONTENTID(content_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the contentuniqueinformations where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of contentuniqueinformations
	 * @param end the upper bound of the range of contentuniqueinformations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contentuniqueinformations
	 */
	@Override
	public List<contentuniqueinformation> findByCONTENTID(long content_id,
		int start, int end,
		OrderByComparator<contentuniqueinformation> orderByComparator) {
		return findByCONTENTID(content_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the contentuniqueinformations where content_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param content_id the content_id
	 * @param start the lower bound of the range of contentuniqueinformations
	 * @param end the upper bound of the range of contentuniqueinformations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching contentuniqueinformations
	 */
	@Override
	public List<contentuniqueinformation> findByCONTENTID(long content_id,
		int start, int end,
		OrderByComparator<contentuniqueinformation> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID;
			finderArgs = new Object[] { content_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTENTID;
			finderArgs = new Object[] { content_id, start, end, orderByComparator };
		}

		List<contentuniqueinformation> list = null;

		if (retrieveFromCache) {
			list = (List<contentuniqueinformation>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (contentuniqueinformation contentuniqueinformation : list) {
					if ((content_id != contentuniqueinformation.getContent_id())) {
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

			query.append(_SQL_SELECT_CONTENTUNIQUEINFORMATION_WHERE);

			query.append(_FINDER_COLUMN_CONTENTID_CONTENT_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(contentuniqueinformationModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(content_id);

				if (!pagination) {
					list = (List<contentuniqueinformation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<contentuniqueinformation>)QueryUtil.list(q,
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
	 * Returns the first contentuniqueinformation in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contentuniqueinformation
	 * @throws NoSuchcontentuniqueinformationException if a matching contentuniqueinformation could not be found
	 */
	@Override
	public contentuniqueinformation findByCONTENTID_First(long content_id,
		OrderByComparator<contentuniqueinformation> orderByComparator)
		throws NoSuchcontentuniqueinformationException {
		contentuniqueinformation contentuniqueinformation = fetchByCONTENTID_First(content_id,
				orderByComparator);

		if (contentuniqueinformation != null) {
			return contentuniqueinformation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcontentuniqueinformationException(msg.toString());
	}

	/**
	 * Returns the first contentuniqueinformation in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contentuniqueinformation, or <code>null</code> if a matching contentuniqueinformation could not be found
	 */
	@Override
	public contentuniqueinformation fetchByCONTENTID_First(long content_id,
		OrderByComparator<contentuniqueinformation> orderByComparator) {
		List<contentuniqueinformation> list = findByCONTENTID(content_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last contentuniqueinformation in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contentuniqueinformation
	 * @throws NoSuchcontentuniqueinformationException if a matching contentuniqueinformation could not be found
	 */
	@Override
	public contentuniqueinformation findByCONTENTID_Last(long content_id,
		OrderByComparator<contentuniqueinformation> orderByComparator)
		throws NoSuchcontentuniqueinformationException {
		contentuniqueinformation contentuniqueinformation = fetchByCONTENTID_Last(content_id,
				orderByComparator);

		if (contentuniqueinformation != null) {
			return contentuniqueinformation;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("content_id=");
		msg.append(content_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcontentuniqueinformationException(msg.toString());
	}

	/**
	 * Returns the last contentuniqueinformation in the ordered set where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contentuniqueinformation, or <code>null</code> if a matching contentuniqueinformation could not be found
	 */
	@Override
	public contentuniqueinformation fetchByCONTENTID_Last(long content_id,
		OrderByComparator<contentuniqueinformation> orderByComparator) {
		int count = countByCONTENTID(content_id);

		if (count == 0) {
			return null;
		}

		List<contentuniqueinformation> list = findByCONTENTID(content_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the contentuniqueinformations before and after the current contentuniqueinformation in the ordered set where content_id = &#63;.
	 *
	 * @param id the primary key of the current contentuniqueinformation
	 * @param content_id the content_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contentuniqueinformation
	 * @throws NoSuchcontentuniqueinformationException if a contentuniqueinformation with the primary key could not be found
	 */
	@Override
	public contentuniqueinformation[] findByCONTENTID_PrevAndNext(long id,
		long content_id,
		OrderByComparator<contentuniqueinformation> orderByComparator)
		throws NoSuchcontentuniqueinformationException {
		contentuniqueinformation contentuniqueinformation = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			contentuniqueinformation[] array = new contentuniqueinformationImpl[3];

			array[0] = getByCONTENTID_PrevAndNext(session,
					contentuniqueinformation, content_id, orderByComparator,
					true);

			array[1] = contentuniqueinformation;

			array[2] = getByCONTENTID_PrevAndNext(session,
					contentuniqueinformation, content_id, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected contentuniqueinformation getByCONTENTID_PrevAndNext(
		Session session, contentuniqueinformation contentuniqueinformation,
		long content_id,
		OrderByComparator<contentuniqueinformation> orderByComparator,
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

		query.append(_SQL_SELECT_CONTENTUNIQUEINFORMATION_WHERE);

		query.append(_FINDER_COLUMN_CONTENTID_CONTENT_ID_2);

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
			query.append(contentuniqueinformationModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(content_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(contentuniqueinformation);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<contentuniqueinformation> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the contentuniqueinformations where content_id = &#63; from the database.
	 *
	 * @param content_id the content_id
	 */
	@Override
	public void removeByCONTENTID(long content_id) {
		for (contentuniqueinformation contentuniqueinformation : findByCONTENTID(
				content_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(contentuniqueinformation);
		}
	}

	/**
	 * Returns the number of contentuniqueinformations where content_id = &#63;.
	 *
	 * @param content_id the content_id
	 * @return the number of matching contentuniqueinformations
	 */
	@Override
	public int countByCONTENTID(long content_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTENTID;

		Object[] finderArgs = new Object[] { content_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONTENTUNIQUEINFORMATION_WHERE);

			query.append(_FINDER_COLUMN_CONTENTID_CONTENT_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(content_id);

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

	private static final String _FINDER_COLUMN_CONTENTID_CONTENT_ID_2 = "contentuniqueinformation.content_id = ?";

	public contentuniqueinformationPersistenceImpl() {
		setModelClass(contentuniqueinformation.class);
	}

	/**
	 * Caches the contentuniqueinformation in the entity cache if it is enabled.
	 *
	 * @param contentuniqueinformation the contentuniqueinformation
	 */
	@Override
	public void cacheResult(contentuniqueinformation contentuniqueinformation) {
		entityCache.putResult(contentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			contentuniqueinformationImpl.class,
			contentuniqueinformation.getPrimaryKey(), contentuniqueinformation);

		contentuniqueinformation.resetOriginalValues();
	}

	/**
	 * Caches the contentuniqueinformations in the entity cache if it is enabled.
	 *
	 * @param contentuniqueinformations the contentuniqueinformations
	 */
	@Override
	public void cacheResult(
		List<contentuniqueinformation> contentuniqueinformations) {
		for (contentuniqueinformation contentuniqueinformation : contentuniqueinformations) {
			if (entityCache.getResult(
						contentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
						contentuniqueinformationImpl.class,
						contentuniqueinformation.getPrimaryKey()) == null) {
				cacheResult(contentuniqueinformation);
			}
			else {
				contentuniqueinformation.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all contentuniqueinformations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(contentuniqueinformationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the contentuniqueinformation.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(contentuniqueinformation contentuniqueinformation) {
		entityCache.removeResult(contentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			contentuniqueinformationImpl.class,
			contentuniqueinformation.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<contentuniqueinformation> contentuniqueinformations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (contentuniqueinformation contentuniqueinformation : contentuniqueinformations) {
			entityCache.removeResult(contentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
				contentuniqueinformationImpl.class,
				contentuniqueinformation.getPrimaryKey());
		}
	}

	/**
	 * Creates a new contentuniqueinformation with the primary key. Does not add the contentuniqueinformation to the database.
	 *
	 * @param id the primary key for the new contentuniqueinformation
	 * @return the new contentuniqueinformation
	 */
	@Override
	public contentuniqueinformation create(long id) {
		contentuniqueinformation contentuniqueinformation = new contentuniqueinformationImpl();

		contentuniqueinformation.setNew(true);
		contentuniqueinformation.setPrimaryKey(id);

		return contentuniqueinformation;
	}

	/**
	 * Removes the contentuniqueinformation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the contentuniqueinformation
	 * @return the contentuniqueinformation that was removed
	 * @throws NoSuchcontentuniqueinformationException if a contentuniqueinformation with the primary key could not be found
	 */
	@Override
	public contentuniqueinformation remove(long id)
		throws NoSuchcontentuniqueinformationException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the contentuniqueinformation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the contentuniqueinformation
	 * @return the contentuniqueinformation that was removed
	 * @throws NoSuchcontentuniqueinformationException if a contentuniqueinformation with the primary key could not be found
	 */
	@Override
	public contentuniqueinformation remove(Serializable primaryKey)
		throws NoSuchcontentuniqueinformationException {
		Session session = null;

		try {
			session = openSession();

			contentuniqueinformation contentuniqueinformation = (contentuniqueinformation)session.get(contentuniqueinformationImpl.class,
					primaryKey);

			if (contentuniqueinformation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcontentuniqueinformationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(contentuniqueinformation);
		}
		catch (NoSuchcontentuniqueinformationException nsee) {
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
	protected contentuniqueinformation removeImpl(
		contentuniqueinformation contentuniqueinformation) {
		contentuniqueinformation = toUnwrappedModel(contentuniqueinformation);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(contentuniqueinformation)) {
				contentuniqueinformation = (contentuniqueinformation)session.get(contentuniqueinformationImpl.class,
						contentuniqueinformation.getPrimaryKeyObj());
			}

			if (contentuniqueinformation != null) {
				session.delete(contentuniqueinformation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (contentuniqueinformation != null) {
			clearCache(contentuniqueinformation);
		}

		return contentuniqueinformation;
	}

	@Override
	public contentuniqueinformation updateImpl(
		contentuniqueinformation contentuniqueinformation) {
		contentuniqueinformation = toUnwrappedModel(contentuniqueinformation);

		boolean isNew = contentuniqueinformation.isNew();

		contentuniqueinformationModelImpl contentuniqueinformationModelImpl = (contentuniqueinformationModelImpl)contentuniqueinformation;

		Session session = null;

		try {
			session = openSession();

			if (contentuniqueinformation.isNew()) {
				session.save(contentuniqueinformation);

				contentuniqueinformation.setNew(false);
			}
			else {
				contentuniqueinformation = (contentuniqueinformation)session.merge(contentuniqueinformation);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !contentuniqueinformationModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((contentuniqueinformationModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						contentuniqueinformationModelImpl.getOriginalContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID,
					args);

				args = new Object[] {
						contentuniqueinformationModelImpl.getContent_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTENTID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTENTID,
					args);
			}
		}

		entityCache.putResult(contentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
			contentuniqueinformationImpl.class,
			contentuniqueinformation.getPrimaryKey(), contentuniqueinformation,
			false);

		contentuniqueinformation.resetOriginalValues();

		return contentuniqueinformation;
	}

	protected contentuniqueinformation toUnwrappedModel(
		contentuniqueinformation contentuniqueinformation) {
		if (contentuniqueinformation instanceof contentuniqueinformationImpl) {
			return contentuniqueinformation;
		}

		contentuniqueinformationImpl contentuniqueinformationImpl = new contentuniqueinformationImpl();

		contentuniqueinformationImpl.setNew(contentuniqueinformation.isNew());
		contentuniqueinformationImpl.setPrimaryKey(contentuniqueinformation.getPrimaryKey());

		contentuniqueinformationImpl.setId(contentuniqueinformation.getId());
		contentuniqueinformationImpl.setContent_id(contentuniqueinformation.getContent_id());
		contentuniqueinformationImpl.setStatus(contentuniqueinformation.getStatus());
		contentuniqueinformationImpl.setUdflag(contentuniqueinformation.getUdflag());
		contentuniqueinformationImpl.setContent_type(contentuniqueinformation.getContent_type());
		contentuniqueinformationImpl.setNotification_text(contentuniqueinformation.getNotification_text());
		contentuniqueinformationImpl.setPageurl(contentuniqueinformation.getPageurl());

		return contentuniqueinformationImpl;
	}

	/**
	 * Returns the contentuniqueinformation with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the contentuniqueinformation
	 * @return the contentuniqueinformation
	 * @throws NoSuchcontentuniqueinformationException if a contentuniqueinformation with the primary key could not be found
	 */
	@Override
	public contentuniqueinformation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchcontentuniqueinformationException {
		contentuniqueinformation contentuniqueinformation = fetchByPrimaryKey(primaryKey);

		if (contentuniqueinformation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcontentuniqueinformationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return contentuniqueinformation;
	}

	/**
	 * Returns the contentuniqueinformation with the primary key or throws a {@link NoSuchcontentuniqueinformationException} if it could not be found.
	 *
	 * @param id the primary key of the contentuniqueinformation
	 * @return the contentuniqueinformation
	 * @throws NoSuchcontentuniqueinformationException if a contentuniqueinformation with the primary key could not be found
	 */
	@Override
	public contentuniqueinformation findByPrimaryKey(long id)
		throws NoSuchcontentuniqueinformationException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the contentuniqueinformation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the contentuniqueinformation
	 * @return the contentuniqueinformation, or <code>null</code> if a contentuniqueinformation with the primary key could not be found
	 */
	@Override
	public contentuniqueinformation fetchByPrimaryKey(Serializable primaryKey) {
		contentuniqueinformation contentuniqueinformation = (contentuniqueinformation)entityCache.getResult(contentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
				contentuniqueinformationImpl.class, primaryKey);

		if (contentuniqueinformation == _nullcontentuniqueinformation) {
			return null;
		}

		if (contentuniqueinformation == null) {
			Session session = null;

			try {
				session = openSession();

				contentuniqueinformation = (contentuniqueinformation)session.get(contentuniqueinformationImpl.class,
						primaryKey);

				if (contentuniqueinformation != null) {
					cacheResult(contentuniqueinformation);
				}
				else {
					entityCache.putResult(contentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
						contentuniqueinformationImpl.class, primaryKey,
						_nullcontentuniqueinformation);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(contentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
					contentuniqueinformationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return contentuniqueinformation;
	}

	/**
	 * Returns the contentuniqueinformation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the contentuniqueinformation
	 * @return the contentuniqueinformation, or <code>null</code> if a contentuniqueinformation with the primary key could not be found
	 */
	@Override
	public contentuniqueinformation fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, contentuniqueinformation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, contentuniqueinformation> map = new HashMap<Serializable, contentuniqueinformation>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			contentuniqueinformation contentuniqueinformation = fetchByPrimaryKey(primaryKey);

			if (contentuniqueinformation != null) {
				map.put(primaryKey, contentuniqueinformation);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			contentuniqueinformation contentuniqueinformation = (contentuniqueinformation)entityCache.getResult(contentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
					contentuniqueinformationImpl.class, primaryKey);

			if (contentuniqueinformation == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, contentuniqueinformation);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CONTENTUNIQUEINFORMATION_WHERE_PKS_IN);

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

			for (contentuniqueinformation contentuniqueinformation : (List<contentuniqueinformation>)q.list()) {
				map.put(contentuniqueinformation.getPrimaryKeyObj(),
					contentuniqueinformation);

				cacheResult(contentuniqueinformation);

				uncachedPrimaryKeys.remove(contentuniqueinformation.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(contentuniqueinformationModelImpl.ENTITY_CACHE_ENABLED,
					contentuniqueinformationImpl.class, primaryKey,
					_nullcontentuniqueinformation);
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
	 * Returns all the contentuniqueinformations.
	 *
	 * @return the contentuniqueinformations
	 */
	@Override
	public List<contentuniqueinformation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the contentuniqueinformations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contentuniqueinformations
	 * @param end the upper bound of the range of contentuniqueinformations (not inclusive)
	 * @return the range of contentuniqueinformations
	 */
	@Override
	public List<contentuniqueinformation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the contentuniqueinformations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contentuniqueinformations
	 * @param end the upper bound of the range of contentuniqueinformations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of contentuniqueinformations
	 */
	@Override
	public List<contentuniqueinformation> findAll(int start, int end,
		OrderByComparator<contentuniqueinformation> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the contentuniqueinformations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contentuniqueinformations
	 * @param end the upper bound of the range of contentuniqueinformations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of contentuniqueinformations
	 */
	@Override
	public List<contentuniqueinformation> findAll(int start, int end,
		OrderByComparator<contentuniqueinformation> orderByComparator,
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

		List<contentuniqueinformation> list = null;

		if (retrieveFromCache) {
			list = (List<contentuniqueinformation>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CONTENTUNIQUEINFORMATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONTENTUNIQUEINFORMATION;

				if (pagination) {
					sql = sql.concat(contentuniqueinformationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<contentuniqueinformation>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<contentuniqueinformation>)QueryUtil.list(q,
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
	 * Removes all the contentuniqueinformations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (contentuniqueinformation contentuniqueinformation : findAll()) {
			remove(contentuniqueinformation);
		}
	}

	/**
	 * Returns the number of contentuniqueinformations.
	 *
	 * @return the number of contentuniqueinformations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CONTENTUNIQUEINFORMATION);

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
		return contentuniqueinformationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the contentuniqueinformation persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(contentuniqueinformationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_CONTENTUNIQUEINFORMATION = "SELECT contentuniqueinformation FROM contentuniqueinformation contentuniqueinformation";
	private static final String _SQL_SELECT_CONTENTUNIQUEINFORMATION_WHERE_PKS_IN =
		"SELECT contentuniqueinformation FROM contentuniqueinformation contentuniqueinformation WHERE id_ IN (";
	private static final String _SQL_SELECT_CONTENTUNIQUEINFORMATION_WHERE = "SELECT contentuniqueinformation FROM contentuniqueinformation contentuniqueinformation WHERE ";
	private static final String _SQL_COUNT_CONTENTUNIQUEINFORMATION = "SELECT COUNT(contentuniqueinformation) FROM contentuniqueinformation contentuniqueinformation";
	private static final String _SQL_COUNT_CONTENTUNIQUEINFORMATION_WHERE = "SELECT COUNT(contentuniqueinformation) FROM contentuniqueinformation contentuniqueinformation WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "contentuniqueinformation.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No contentuniqueinformation exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No contentuniqueinformation exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(contentuniqueinformationPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final contentuniqueinformation _nullcontentuniqueinformation = new contentuniqueinformationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<contentuniqueinformation> toCacheModel() {
				return _nullcontentuniqueinformationCacheModel;
			}
		};

	private static final CacheModel<contentuniqueinformation> _nullcontentuniqueinformationCacheModel =
		new CacheModel<contentuniqueinformation>() {
			@Override
			public contentuniqueinformation toEntityModel() {
				return _nullcontentuniqueinformation;
			}
		};
}