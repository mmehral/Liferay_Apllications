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

package com.chola.businessmis.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.businessmis.exception.NoSuchbusinessmisusersException;
import com.chola.businessmis.model.businessmisusers;
import com.chola.businessmis.model.impl.businessmisusersImpl;
import com.chola.businessmis.model.impl.businessmisusersModelImpl;
import com.chola.businessmis.service.persistence.businessmisusersPersistence;

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
 * The persistence implementation for the businessmisusers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see businessmisusersPersistence
 * @see com.chola.businessmis.service.persistence.businessmisusersUtil
 * @generated
 */
@ProviderType
public class businessmisusersPersistenceImpl extends BasePersistenceImpl<businessmisusers>
	implements businessmisusersPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link businessmisusersUtil} to access the businessmisusers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = businessmisusersImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(businessmisusersModelImpl.ENTITY_CACHE_ENABLED,
			businessmisusersModelImpl.FINDER_CACHE_ENABLED,
			businessmisusersImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(businessmisusersModelImpl.ENTITY_CACHE_ENABLED,
			businessmisusersModelImpl.FINDER_CACHE_ENABLED,
			businessmisusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(businessmisusersModelImpl.ENTITY_CACHE_ENABLED,
			businessmisusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BUSINESS_ID =
		new FinderPath(businessmisusersModelImpl.ENTITY_CACHE_ENABLED,
			businessmisusersModelImpl.FINDER_CACHE_ENABLED,
			businessmisusersImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByBUSINESS_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BUSINESS_ID =
		new FinderPath(businessmisusersModelImpl.ENTITY_CACHE_ENABLED,
			businessmisusersModelImpl.FINDER_CACHE_ENABLED,
			businessmisusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByBUSINESS_ID",
			new String[] { Long.class.getName() },
			businessmisusersModelImpl.BUSINESSDETAILS_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BUSINESS_ID = new FinderPath(businessmisusersModelImpl.ENTITY_CACHE_ENABLED,
			businessmisusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByBUSINESS_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the businessmisuserses where businessdetails_id = &#63;.
	 *
	 * @param businessdetails_id the businessdetails_id
	 * @return the matching businessmisuserses
	 */
	@Override
	public List<businessmisusers> findByBUSINESS_ID(long businessdetails_id) {
		return findByBUSINESS_ID(businessdetails_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the businessmisuserses where businessdetails_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param businessdetails_id the businessdetails_id
	 * @param start the lower bound of the range of businessmisuserses
	 * @param end the upper bound of the range of businessmisuserses (not inclusive)
	 * @return the range of matching businessmisuserses
	 */
	@Override
	public List<businessmisusers> findByBUSINESS_ID(long businessdetails_id,
		int start, int end) {
		return findByBUSINESS_ID(businessdetails_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the businessmisuserses where businessdetails_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param businessdetails_id the businessdetails_id
	 * @param start the lower bound of the range of businessmisuserses
	 * @param end the upper bound of the range of businessmisuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching businessmisuserses
	 */
	@Override
	public List<businessmisusers> findByBUSINESS_ID(long businessdetails_id,
		int start, int end,
		OrderByComparator<businessmisusers> orderByComparator) {
		return findByBUSINESS_ID(businessdetails_id, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the businessmisuserses where businessdetails_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param businessdetails_id the businessdetails_id
	 * @param start the lower bound of the range of businessmisuserses
	 * @param end the upper bound of the range of businessmisuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching businessmisuserses
	 */
	@Override
	public List<businessmisusers> findByBUSINESS_ID(long businessdetails_id,
		int start, int end,
		OrderByComparator<businessmisusers> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BUSINESS_ID;
			finderArgs = new Object[] { businessdetails_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BUSINESS_ID;
			finderArgs = new Object[] {
					businessdetails_id,
					
					start, end, orderByComparator
				};
		}

		List<businessmisusers> list = null;

		if (retrieveFromCache) {
			list = (List<businessmisusers>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (businessmisusers businessmisusers : list) {
					if ((businessdetails_id != businessmisusers.getBusinessdetails_id())) {
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

			query.append(_SQL_SELECT_BUSINESSMISUSERS_WHERE);

			query.append(_FINDER_COLUMN_BUSINESS_ID_BUSINESSDETAILS_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(businessmisusersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(businessdetails_id);

				if (!pagination) {
					list = (List<businessmisusers>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<businessmisusers>)QueryUtil.list(q,
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
	 * Returns the first businessmisusers in the ordered set where businessdetails_id = &#63;.
	 *
	 * @param businessdetails_id the businessdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching businessmisusers
	 * @throws NoSuchbusinessmisusersException if a matching businessmisusers could not be found
	 */
	@Override
	public businessmisusers findByBUSINESS_ID_First(long businessdetails_id,
		OrderByComparator<businessmisusers> orderByComparator)
		throws NoSuchbusinessmisusersException {
		businessmisusers businessmisusers = fetchByBUSINESS_ID_First(businessdetails_id,
				orderByComparator);

		if (businessmisusers != null) {
			return businessmisusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("businessdetails_id=");
		msg.append(businessdetails_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbusinessmisusersException(msg.toString());
	}

	/**
	 * Returns the first businessmisusers in the ordered set where businessdetails_id = &#63;.
	 *
	 * @param businessdetails_id the businessdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching businessmisusers, or <code>null</code> if a matching businessmisusers could not be found
	 */
	@Override
	public businessmisusers fetchByBUSINESS_ID_First(long businessdetails_id,
		OrderByComparator<businessmisusers> orderByComparator) {
		List<businessmisusers> list = findByBUSINESS_ID(businessdetails_id, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last businessmisusers in the ordered set where businessdetails_id = &#63;.
	 *
	 * @param businessdetails_id the businessdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching businessmisusers
	 * @throws NoSuchbusinessmisusersException if a matching businessmisusers could not be found
	 */
	@Override
	public businessmisusers findByBUSINESS_ID_Last(long businessdetails_id,
		OrderByComparator<businessmisusers> orderByComparator)
		throws NoSuchbusinessmisusersException {
		businessmisusers businessmisusers = fetchByBUSINESS_ID_Last(businessdetails_id,
				orderByComparator);

		if (businessmisusers != null) {
			return businessmisusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("businessdetails_id=");
		msg.append(businessdetails_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbusinessmisusersException(msg.toString());
	}

	/**
	 * Returns the last businessmisusers in the ordered set where businessdetails_id = &#63;.
	 *
	 * @param businessdetails_id the businessdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching businessmisusers, or <code>null</code> if a matching businessmisusers could not be found
	 */
	@Override
	public businessmisusers fetchByBUSINESS_ID_Last(long businessdetails_id,
		OrderByComparator<businessmisusers> orderByComparator) {
		int count = countByBUSINESS_ID(businessdetails_id);

		if (count == 0) {
			return null;
		}

		List<businessmisusers> list = findByBUSINESS_ID(businessdetails_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the businessmisuserses before and after the current businessmisusers in the ordered set where businessdetails_id = &#63;.
	 *
	 * @param id the primary key of the current businessmisusers
	 * @param businessdetails_id the businessdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next businessmisusers
	 * @throws NoSuchbusinessmisusersException if a businessmisusers with the primary key could not be found
	 */
	@Override
	public businessmisusers[] findByBUSINESS_ID_PrevAndNext(long id,
		long businessdetails_id,
		OrderByComparator<businessmisusers> orderByComparator)
		throws NoSuchbusinessmisusersException {
		businessmisusers businessmisusers = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			businessmisusers[] array = new businessmisusersImpl[3];

			array[0] = getByBUSINESS_ID_PrevAndNext(session, businessmisusers,
					businessdetails_id, orderByComparator, true);

			array[1] = businessmisusers;

			array[2] = getByBUSINESS_ID_PrevAndNext(session, businessmisusers,
					businessdetails_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected businessmisusers getByBUSINESS_ID_PrevAndNext(Session session,
		businessmisusers businessmisusers, long businessdetails_id,
		OrderByComparator<businessmisusers> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BUSINESSMISUSERS_WHERE);

		query.append(_FINDER_COLUMN_BUSINESS_ID_BUSINESSDETAILS_ID_2);

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
			query.append(businessmisusersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(businessdetails_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(businessmisusers);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<businessmisusers> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the businessmisuserses where businessdetails_id = &#63; from the database.
	 *
	 * @param businessdetails_id the businessdetails_id
	 */
	@Override
	public void removeByBUSINESS_ID(long businessdetails_id) {
		for (businessmisusers businessmisusers : findByBUSINESS_ID(
				businessdetails_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(businessmisusers);
		}
	}

	/**
	 * Returns the number of businessmisuserses where businessdetails_id = &#63;.
	 *
	 * @param businessdetails_id the businessdetails_id
	 * @return the number of matching businessmisuserses
	 */
	@Override
	public int countByBUSINESS_ID(long businessdetails_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BUSINESS_ID;

		Object[] finderArgs = new Object[] { businessdetails_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BUSINESSMISUSERS_WHERE);

			query.append(_FINDER_COLUMN_BUSINESS_ID_BUSINESSDETAILS_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(businessdetails_id);

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

	private static final String _FINDER_COLUMN_BUSINESS_ID_BUSINESSDETAILS_ID_2 = "businessmisusers.businessdetails_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USER_ID = new FinderPath(businessmisusersModelImpl.ENTITY_CACHE_ENABLED,
			businessmisusersModelImpl.FINDER_CACHE_ENABLED,
			businessmisusersImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUSER_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID =
		new FinderPath(businessmisusersModelImpl.ENTITY_CACHE_ENABLED,
			businessmisusersModelImpl.FINDER_CACHE_ENABLED,
			businessmisusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUSER_ID",
			new String[] { Long.class.getName() },
			businessmisusersModelImpl.USER_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USER_ID = new FinderPath(businessmisusersModelImpl.ENTITY_CACHE_ENABLED,
			businessmisusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUSER_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the businessmisuserses where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @return the matching businessmisuserses
	 */
	@Override
	public List<businessmisusers> findByUSER_ID(long user_id) {
		return findByUSER_ID(user_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the businessmisuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of businessmisuserses
	 * @param end the upper bound of the range of businessmisuserses (not inclusive)
	 * @return the range of matching businessmisuserses
	 */
	@Override
	public List<businessmisusers> findByUSER_ID(long user_id, int start, int end) {
		return findByUSER_ID(user_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the businessmisuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of businessmisuserses
	 * @param end the upper bound of the range of businessmisuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching businessmisuserses
	 */
	@Override
	public List<businessmisusers> findByUSER_ID(long user_id, int start,
		int end, OrderByComparator<businessmisusers> orderByComparator) {
		return findByUSER_ID(user_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the businessmisuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of businessmisuserses
	 * @param end the upper bound of the range of businessmisuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching businessmisuserses
	 */
	@Override
	public List<businessmisusers> findByUSER_ID(long user_id, int start,
		int end, OrderByComparator<businessmisusers> orderByComparator,
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

		List<businessmisusers> list = null;

		if (retrieveFromCache) {
			list = (List<businessmisusers>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (businessmisusers businessmisusers : list) {
					if ((user_id != businessmisusers.getUser_id())) {
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

			query.append(_SQL_SELECT_BUSINESSMISUSERS_WHERE);

			query.append(_FINDER_COLUMN_USER_ID_USER_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(businessmisusersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(user_id);

				if (!pagination) {
					list = (List<businessmisusers>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<businessmisusers>)QueryUtil.list(q,
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
	 * Returns the first businessmisusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching businessmisusers
	 * @throws NoSuchbusinessmisusersException if a matching businessmisusers could not be found
	 */
	@Override
	public businessmisusers findByUSER_ID_First(long user_id,
		OrderByComparator<businessmisusers> orderByComparator)
		throws NoSuchbusinessmisusersException {
		businessmisusers businessmisusers = fetchByUSER_ID_First(user_id,
				orderByComparator);

		if (businessmisusers != null) {
			return businessmisusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("user_id=");
		msg.append(user_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbusinessmisusersException(msg.toString());
	}

	/**
	 * Returns the first businessmisusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching businessmisusers, or <code>null</code> if a matching businessmisusers could not be found
	 */
	@Override
	public businessmisusers fetchByUSER_ID_First(long user_id,
		OrderByComparator<businessmisusers> orderByComparator) {
		List<businessmisusers> list = findByUSER_ID(user_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last businessmisusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching businessmisusers
	 * @throws NoSuchbusinessmisusersException if a matching businessmisusers could not be found
	 */
	@Override
	public businessmisusers findByUSER_ID_Last(long user_id,
		OrderByComparator<businessmisusers> orderByComparator)
		throws NoSuchbusinessmisusersException {
		businessmisusers businessmisusers = fetchByUSER_ID_Last(user_id,
				orderByComparator);

		if (businessmisusers != null) {
			return businessmisusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("user_id=");
		msg.append(user_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchbusinessmisusersException(msg.toString());
	}

	/**
	 * Returns the last businessmisusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching businessmisusers, or <code>null</code> if a matching businessmisusers could not be found
	 */
	@Override
	public businessmisusers fetchByUSER_ID_Last(long user_id,
		OrderByComparator<businessmisusers> orderByComparator) {
		int count = countByUSER_ID(user_id);

		if (count == 0) {
			return null;
		}

		List<businessmisusers> list = findByUSER_ID(user_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the businessmisuserses before and after the current businessmisusers in the ordered set where user_id = &#63;.
	 *
	 * @param id the primary key of the current businessmisusers
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next businessmisusers
	 * @throws NoSuchbusinessmisusersException if a businessmisusers with the primary key could not be found
	 */
	@Override
	public businessmisusers[] findByUSER_ID_PrevAndNext(long id, long user_id,
		OrderByComparator<businessmisusers> orderByComparator)
		throws NoSuchbusinessmisusersException {
		businessmisusers businessmisusers = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			businessmisusers[] array = new businessmisusersImpl[3];

			array[0] = getByUSER_ID_PrevAndNext(session, businessmisusers,
					user_id, orderByComparator, true);

			array[1] = businessmisusers;

			array[2] = getByUSER_ID_PrevAndNext(session, businessmisusers,
					user_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected businessmisusers getByUSER_ID_PrevAndNext(Session session,
		businessmisusers businessmisusers, long user_id,
		OrderByComparator<businessmisusers> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BUSINESSMISUSERS_WHERE);

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
			query.append(businessmisusersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(user_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(businessmisusers);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<businessmisusers> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the businessmisuserses where user_id = &#63; from the database.
	 *
	 * @param user_id the user_id
	 */
	@Override
	public void removeByUSER_ID(long user_id) {
		for (businessmisusers businessmisusers : findByUSER_ID(user_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(businessmisusers);
		}
	}

	/**
	 * Returns the number of businessmisuserses where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @return the number of matching businessmisuserses
	 */
	@Override
	public int countByUSER_ID(long user_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USER_ID;

		Object[] finderArgs = new Object[] { user_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BUSINESSMISUSERS_WHERE);

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

	private static final String _FINDER_COLUMN_USER_ID_USER_ID_2 = "businessmisusers.user_id = ?";

	public businessmisusersPersistenceImpl() {
		setModelClass(businessmisusers.class);
	}

	/**
	 * Caches the businessmisusers in the entity cache if it is enabled.
	 *
	 * @param businessmisusers the businessmisusers
	 */
	@Override
	public void cacheResult(businessmisusers businessmisusers) {
		entityCache.putResult(businessmisusersModelImpl.ENTITY_CACHE_ENABLED,
			businessmisusersImpl.class, businessmisusers.getPrimaryKey(),
			businessmisusers);

		businessmisusers.resetOriginalValues();
	}

	/**
	 * Caches the businessmisuserses in the entity cache if it is enabled.
	 *
	 * @param businessmisuserses the businessmisuserses
	 */
	@Override
	public void cacheResult(List<businessmisusers> businessmisuserses) {
		for (businessmisusers businessmisusers : businessmisuserses) {
			if (entityCache.getResult(
						businessmisusersModelImpl.ENTITY_CACHE_ENABLED,
						businessmisusersImpl.class,
						businessmisusers.getPrimaryKey()) == null) {
				cacheResult(businessmisusers);
			}
			else {
				businessmisusers.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all businessmisuserses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(businessmisusersImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the businessmisusers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(businessmisusers businessmisusers) {
		entityCache.removeResult(businessmisusersModelImpl.ENTITY_CACHE_ENABLED,
			businessmisusersImpl.class, businessmisusers.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<businessmisusers> businessmisuserses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (businessmisusers businessmisusers : businessmisuserses) {
			entityCache.removeResult(businessmisusersModelImpl.ENTITY_CACHE_ENABLED,
				businessmisusersImpl.class, businessmisusers.getPrimaryKey());
		}
	}

	/**
	 * Creates a new businessmisusers with the primary key. Does not add the businessmisusers to the database.
	 *
	 * @param id the primary key for the new businessmisusers
	 * @return the new businessmisusers
	 */
	@Override
	public businessmisusers create(long id) {
		businessmisusers businessmisusers = new businessmisusersImpl();

		businessmisusers.setNew(true);
		businessmisusers.setPrimaryKey(id);

		return businessmisusers;
	}

	/**
	 * Removes the businessmisusers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the businessmisusers
	 * @return the businessmisusers that was removed
	 * @throws NoSuchbusinessmisusersException if a businessmisusers with the primary key could not be found
	 */
	@Override
	public businessmisusers remove(long id)
		throws NoSuchbusinessmisusersException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the businessmisusers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the businessmisusers
	 * @return the businessmisusers that was removed
	 * @throws NoSuchbusinessmisusersException if a businessmisusers with the primary key could not be found
	 */
	@Override
	public businessmisusers remove(Serializable primaryKey)
		throws NoSuchbusinessmisusersException {
		Session session = null;

		try {
			session = openSession();

			businessmisusers businessmisusers = (businessmisusers)session.get(businessmisusersImpl.class,
					primaryKey);

			if (businessmisusers == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbusinessmisusersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(businessmisusers);
		}
		catch (NoSuchbusinessmisusersException nsee) {
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
	protected businessmisusers removeImpl(businessmisusers businessmisusers) {
		businessmisusers = toUnwrappedModel(businessmisusers);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(businessmisusers)) {
				businessmisusers = (businessmisusers)session.get(businessmisusersImpl.class,
						businessmisusers.getPrimaryKeyObj());
			}

			if (businessmisusers != null) {
				session.delete(businessmisusers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (businessmisusers != null) {
			clearCache(businessmisusers);
		}

		return businessmisusers;
	}

	@Override
	public businessmisusers updateImpl(businessmisusers businessmisusers) {
		businessmisusers = toUnwrappedModel(businessmisusers);

		boolean isNew = businessmisusers.isNew();

		businessmisusersModelImpl businessmisusersModelImpl = (businessmisusersModelImpl)businessmisusers;

		Session session = null;

		try {
			session = openSession();

			if (businessmisusers.isNew()) {
				session.save(businessmisusers);

				businessmisusers.setNew(false);
			}
			else {
				businessmisusers = (businessmisusers)session.merge(businessmisusers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !businessmisusersModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((businessmisusersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BUSINESS_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						businessmisusersModelImpl.getOriginalBusinessdetails_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BUSINESS_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BUSINESS_ID,
					args);

				args = new Object[] {
						businessmisusersModelImpl.getBusinessdetails_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_BUSINESS_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BUSINESS_ID,
					args);
			}

			if ((businessmisusersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						businessmisusersModelImpl.getOriginalUser_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID,
					args);

				args = new Object[] { businessmisusersModelImpl.getUser_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID,
					args);
			}
		}

		entityCache.putResult(businessmisusersModelImpl.ENTITY_CACHE_ENABLED,
			businessmisusersImpl.class, businessmisusers.getPrimaryKey(),
			businessmisusers, false);

		businessmisusers.resetOriginalValues();

		return businessmisusers;
	}

	protected businessmisusers toUnwrappedModel(
		businessmisusers businessmisusers) {
		if (businessmisusers instanceof businessmisusersImpl) {
			return businessmisusers;
		}

		businessmisusersImpl businessmisusersImpl = new businessmisusersImpl();

		businessmisusersImpl.setNew(businessmisusers.isNew());
		businessmisusersImpl.setPrimaryKey(businessmisusers.getPrimaryKey());

		businessmisusersImpl.setId(businessmisusers.getId());
		businessmisusersImpl.setUser_id(businessmisusers.getUser_id());
		businessmisusersImpl.setBusinessdetails_id(businessmisusers.getBusinessdetails_id());

		return businessmisusersImpl;
	}

	/**
	 * Returns the businessmisusers with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the businessmisusers
	 * @return the businessmisusers
	 * @throws NoSuchbusinessmisusersException if a businessmisusers with the primary key could not be found
	 */
	@Override
	public businessmisusers findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbusinessmisusersException {
		businessmisusers businessmisusers = fetchByPrimaryKey(primaryKey);

		if (businessmisusers == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbusinessmisusersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return businessmisusers;
	}

	/**
	 * Returns the businessmisusers with the primary key or throws a {@link NoSuchbusinessmisusersException} if it could not be found.
	 *
	 * @param id the primary key of the businessmisusers
	 * @return the businessmisusers
	 * @throws NoSuchbusinessmisusersException if a businessmisusers with the primary key could not be found
	 */
	@Override
	public businessmisusers findByPrimaryKey(long id)
		throws NoSuchbusinessmisusersException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the businessmisusers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the businessmisusers
	 * @return the businessmisusers, or <code>null</code> if a businessmisusers with the primary key could not be found
	 */
	@Override
	public businessmisusers fetchByPrimaryKey(Serializable primaryKey) {
		businessmisusers businessmisusers = (businessmisusers)entityCache.getResult(businessmisusersModelImpl.ENTITY_CACHE_ENABLED,
				businessmisusersImpl.class, primaryKey);

		if (businessmisusers == _nullbusinessmisusers) {
			return null;
		}

		if (businessmisusers == null) {
			Session session = null;

			try {
				session = openSession();

				businessmisusers = (businessmisusers)session.get(businessmisusersImpl.class,
						primaryKey);

				if (businessmisusers != null) {
					cacheResult(businessmisusers);
				}
				else {
					entityCache.putResult(businessmisusersModelImpl.ENTITY_CACHE_ENABLED,
						businessmisusersImpl.class, primaryKey,
						_nullbusinessmisusers);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(businessmisusersModelImpl.ENTITY_CACHE_ENABLED,
					businessmisusersImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return businessmisusers;
	}

	/**
	 * Returns the businessmisusers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the businessmisusers
	 * @return the businessmisusers, or <code>null</code> if a businessmisusers with the primary key could not be found
	 */
	@Override
	public businessmisusers fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, businessmisusers> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, businessmisusers> map = new HashMap<Serializable, businessmisusers>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			businessmisusers businessmisusers = fetchByPrimaryKey(primaryKey);

			if (businessmisusers != null) {
				map.put(primaryKey, businessmisusers);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			businessmisusers businessmisusers = (businessmisusers)entityCache.getResult(businessmisusersModelImpl.ENTITY_CACHE_ENABLED,
					businessmisusersImpl.class, primaryKey);

			if (businessmisusers == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, businessmisusers);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BUSINESSMISUSERS_WHERE_PKS_IN);

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

			for (businessmisusers businessmisusers : (List<businessmisusers>)q.list()) {
				map.put(businessmisusers.getPrimaryKeyObj(), businessmisusers);

				cacheResult(businessmisusers);

				uncachedPrimaryKeys.remove(businessmisusers.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(businessmisusersModelImpl.ENTITY_CACHE_ENABLED,
					businessmisusersImpl.class, primaryKey,
					_nullbusinessmisusers);
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
	 * Returns all the businessmisuserses.
	 *
	 * @return the businessmisuserses
	 */
	@Override
	public List<businessmisusers> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the businessmisuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of businessmisuserses
	 * @param end the upper bound of the range of businessmisuserses (not inclusive)
	 * @return the range of businessmisuserses
	 */
	@Override
	public List<businessmisusers> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the businessmisuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of businessmisuserses
	 * @param end the upper bound of the range of businessmisuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of businessmisuserses
	 */
	@Override
	public List<businessmisusers> findAll(int start, int end,
		OrderByComparator<businessmisusers> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the businessmisuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of businessmisuserses
	 * @param end the upper bound of the range of businessmisuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of businessmisuserses
	 */
	@Override
	public List<businessmisusers> findAll(int start, int end,
		OrderByComparator<businessmisusers> orderByComparator,
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

		List<businessmisusers> list = null;

		if (retrieveFromCache) {
			list = (List<businessmisusers>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BUSINESSMISUSERS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BUSINESSMISUSERS;

				if (pagination) {
					sql = sql.concat(businessmisusersModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<businessmisusers>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<businessmisusers>)QueryUtil.list(q,
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
	 * Removes all the businessmisuserses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (businessmisusers businessmisusers : findAll()) {
			remove(businessmisusers);
		}
	}

	/**
	 * Returns the number of businessmisuserses.
	 *
	 * @return the number of businessmisuserses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BUSINESSMISUSERS);

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
		return businessmisusersModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the businessmisusers persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(businessmisusersImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_BUSINESSMISUSERS = "SELECT businessmisusers FROM businessmisusers businessmisusers";
	private static final String _SQL_SELECT_BUSINESSMISUSERS_WHERE_PKS_IN = "SELECT businessmisusers FROM businessmisusers businessmisusers WHERE id_ IN (";
	private static final String _SQL_SELECT_BUSINESSMISUSERS_WHERE = "SELECT businessmisusers FROM businessmisusers businessmisusers WHERE ";
	private static final String _SQL_COUNT_BUSINESSMISUSERS = "SELECT COUNT(businessmisusers) FROM businessmisusers businessmisusers";
	private static final String _SQL_COUNT_BUSINESSMISUSERS_WHERE = "SELECT COUNT(businessmisusers) FROM businessmisusers businessmisusers WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "businessmisusers.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No businessmisusers exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No businessmisusers exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(businessmisusersPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final businessmisusers _nullbusinessmisusers = new businessmisusersImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<businessmisusers> toCacheModel() {
				return _nullbusinessmisusersCacheModel;
			}
		};

	private static final CacheModel<businessmisusers> _nullbusinessmisusersCacheModel =
		new CacheModel<businessmisusers>() {
			@Override
			public businessmisusers toEntityModel() {
				return _nullbusinessmisusers;
			}
		};
}