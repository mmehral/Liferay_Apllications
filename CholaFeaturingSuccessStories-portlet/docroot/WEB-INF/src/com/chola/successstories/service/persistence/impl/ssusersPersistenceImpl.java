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

package com.chola.successstories.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.successstories.exception.NoSuchssusersException;
import com.chola.successstories.model.impl.ssusersImpl;
import com.chola.successstories.model.impl.ssusersModelImpl;
import com.chola.successstories.model.ssusers;
import com.chola.successstories.service.persistence.ssusersPersistence;

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
 * The persistence implementation for the ssusers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see ssusersPersistence
 * @see com.chola.successstories.service.persistence.ssusersUtil
 * @generated
 */
@ProviderType
public class ssusersPersistenceImpl extends BasePersistenceImpl<ssusers>
	implements ssusersPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ssusersUtil} to access the ssusers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ssusersImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ssusersModelImpl.ENTITY_CACHE_ENABLED,
			ssusersModelImpl.FINDER_CACHE_ENABLED, ssusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ssusersModelImpl.ENTITY_CACHE_ENABLED,
			ssusersModelImpl.FINDER_CACHE_ENABLED, ssusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ssusersModelImpl.ENTITY_CACHE_ENABLED,
			ssusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SS_ID = new FinderPath(ssusersModelImpl.ENTITY_CACHE_ENABLED,
			ssusersModelImpl.FINDER_CACHE_ENABLED, ssusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySS_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SS_ID = new FinderPath(ssusersModelImpl.ENTITY_CACHE_ENABLED,
			ssusersModelImpl.FINDER_CACHE_ENABLED, ssusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySS_ID",
			new String[] { Long.class.getName() },
			ssusersModelImpl.SSDETAILS_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SS_ID = new FinderPath(ssusersModelImpl.ENTITY_CACHE_ENABLED,
			ssusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySS_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the ssuserses where ssdetails_id = &#63;.
	 *
	 * @param ssdetails_id the ssdetails_id
	 * @return the matching ssuserses
	 */
	@Override
	public List<ssusers> findBySS_ID(long ssdetails_id) {
		return findBySS_ID(ssdetails_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the ssuserses where ssdetails_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ssdetails_id the ssdetails_id
	 * @param start the lower bound of the range of ssuserses
	 * @param end the upper bound of the range of ssuserses (not inclusive)
	 * @return the range of matching ssuserses
	 */
	@Override
	public List<ssusers> findBySS_ID(long ssdetails_id, int start, int end) {
		return findBySS_ID(ssdetails_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ssuserses where ssdetails_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ssdetails_id the ssdetails_id
	 * @param start the lower bound of the range of ssuserses
	 * @param end the upper bound of the range of ssuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ssuserses
	 */
	@Override
	public List<ssusers> findBySS_ID(long ssdetails_id, int start, int end,
		OrderByComparator<ssusers> orderByComparator) {
		return findBySS_ID(ssdetails_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ssuserses where ssdetails_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ssdetails_id the ssdetails_id
	 * @param start the lower bound of the range of ssuserses
	 * @param end the upper bound of the range of ssuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ssuserses
	 */
	@Override
	public List<ssusers> findBySS_ID(long ssdetails_id, int start, int end,
		OrderByComparator<ssusers> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SS_ID;
			finderArgs = new Object[] { ssdetails_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SS_ID;
			finderArgs = new Object[] {
					ssdetails_id,
					
					start, end, orderByComparator
				};
		}

		List<ssusers> list = null;

		if (retrieveFromCache) {
			list = (List<ssusers>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (ssusers ssusers : list) {
					if ((ssdetails_id != ssusers.getSsdetails_id())) {
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

			query.append(_SQL_SELECT_SSUSERS_WHERE);

			query.append(_FINDER_COLUMN_SS_ID_SSDETAILS_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ssusersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(ssdetails_id);

				if (!pagination) {
					list = (List<ssusers>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ssusers>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ssusers in the ordered set where ssdetails_id = &#63;.
	 *
	 * @param ssdetails_id the ssdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ssusers
	 * @throws NoSuchssusersException if a matching ssusers could not be found
	 */
	@Override
	public ssusers findBySS_ID_First(long ssdetails_id,
		OrderByComparator<ssusers> orderByComparator)
		throws NoSuchssusersException {
		ssusers ssusers = fetchBySS_ID_First(ssdetails_id, orderByComparator);

		if (ssusers != null) {
			return ssusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ssdetails_id=");
		msg.append(ssdetails_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchssusersException(msg.toString());
	}

	/**
	 * Returns the first ssusers in the ordered set where ssdetails_id = &#63;.
	 *
	 * @param ssdetails_id the ssdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ssusers, or <code>null</code> if a matching ssusers could not be found
	 */
	@Override
	public ssusers fetchBySS_ID_First(long ssdetails_id,
		OrderByComparator<ssusers> orderByComparator) {
		List<ssusers> list = findBySS_ID(ssdetails_id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ssusers in the ordered set where ssdetails_id = &#63;.
	 *
	 * @param ssdetails_id the ssdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ssusers
	 * @throws NoSuchssusersException if a matching ssusers could not be found
	 */
	@Override
	public ssusers findBySS_ID_Last(long ssdetails_id,
		OrderByComparator<ssusers> orderByComparator)
		throws NoSuchssusersException {
		ssusers ssusers = fetchBySS_ID_Last(ssdetails_id, orderByComparator);

		if (ssusers != null) {
			return ssusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ssdetails_id=");
		msg.append(ssdetails_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchssusersException(msg.toString());
	}

	/**
	 * Returns the last ssusers in the ordered set where ssdetails_id = &#63;.
	 *
	 * @param ssdetails_id the ssdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ssusers, or <code>null</code> if a matching ssusers could not be found
	 */
	@Override
	public ssusers fetchBySS_ID_Last(long ssdetails_id,
		OrderByComparator<ssusers> orderByComparator) {
		int count = countBySS_ID(ssdetails_id);

		if (count == 0) {
			return null;
		}

		List<ssusers> list = findBySS_ID(ssdetails_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ssuserses before and after the current ssusers in the ordered set where ssdetails_id = &#63;.
	 *
	 * @param id the primary key of the current ssusers
	 * @param ssdetails_id the ssdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ssusers
	 * @throws NoSuchssusersException if a ssusers with the primary key could not be found
	 */
	@Override
	public ssusers[] findBySS_ID_PrevAndNext(long id, long ssdetails_id,
		OrderByComparator<ssusers> orderByComparator)
		throws NoSuchssusersException {
		ssusers ssusers = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ssusers[] array = new ssusersImpl[3];

			array[0] = getBySS_ID_PrevAndNext(session, ssusers, ssdetails_id,
					orderByComparator, true);

			array[1] = ssusers;

			array[2] = getBySS_ID_PrevAndNext(session, ssusers, ssdetails_id,
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

	protected ssusers getBySS_ID_PrevAndNext(Session session, ssusers ssusers,
		long ssdetails_id, OrderByComparator<ssusers> orderByComparator,
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

		query.append(_SQL_SELECT_SSUSERS_WHERE);

		query.append(_FINDER_COLUMN_SS_ID_SSDETAILS_ID_2);

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
			query.append(ssusersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(ssdetails_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(ssusers);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ssusers> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ssuserses where ssdetails_id = &#63; from the database.
	 *
	 * @param ssdetails_id the ssdetails_id
	 */
	@Override
	public void removeBySS_ID(long ssdetails_id) {
		for (ssusers ssusers : findBySS_ID(ssdetails_id, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(ssusers);
		}
	}

	/**
	 * Returns the number of ssuserses where ssdetails_id = &#63;.
	 *
	 * @param ssdetails_id the ssdetails_id
	 * @return the number of matching ssuserses
	 */
	@Override
	public int countBySS_ID(long ssdetails_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SS_ID;

		Object[] finderArgs = new Object[] { ssdetails_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SSUSERS_WHERE);

			query.append(_FINDER_COLUMN_SS_ID_SSDETAILS_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(ssdetails_id);

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

	private static final String _FINDER_COLUMN_SS_ID_SSDETAILS_ID_2 = "ssusers.ssdetails_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USER_ID = new FinderPath(ssusersModelImpl.ENTITY_CACHE_ENABLED,
			ssusersModelImpl.FINDER_CACHE_ENABLED, ssusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUSER_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID =
		new FinderPath(ssusersModelImpl.ENTITY_CACHE_ENABLED,
			ssusersModelImpl.FINDER_CACHE_ENABLED, ssusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUSER_ID",
			new String[] { Long.class.getName() },
			ssusersModelImpl.USER_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USER_ID = new FinderPath(ssusersModelImpl.ENTITY_CACHE_ENABLED,
			ssusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUSER_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the ssuserses where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @return the matching ssuserses
	 */
	@Override
	public List<ssusers> findByUSER_ID(long user_id) {
		return findByUSER_ID(user_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ssuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of ssuserses
	 * @param end the upper bound of the range of ssuserses (not inclusive)
	 * @return the range of matching ssuserses
	 */
	@Override
	public List<ssusers> findByUSER_ID(long user_id, int start, int end) {
		return findByUSER_ID(user_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ssuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of ssuserses
	 * @param end the upper bound of the range of ssuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ssuserses
	 */
	@Override
	public List<ssusers> findByUSER_ID(long user_id, int start, int end,
		OrderByComparator<ssusers> orderByComparator) {
		return findByUSER_ID(user_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ssuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of ssuserses
	 * @param end the upper bound of the range of ssuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching ssuserses
	 */
	@Override
	public List<ssusers> findByUSER_ID(long user_id, int start, int end,
		OrderByComparator<ssusers> orderByComparator, boolean retrieveFromCache) {
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

		List<ssusers> list = null;

		if (retrieveFromCache) {
			list = (List<ssusers>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (ssusers ssusers : list) {
					if ((user_id != ssusers.getUser_id())) {
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

			query.append(_SQL_SELECT_SSUSERS_WHERE);

			query.append(_FINDER_COLUMN_USER_ID_USER_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ssusersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(user_id);

				if (!pagination) {
					list = (List<ssusers>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ssusers>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first ssusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ssusers
	 * @throws NoSuchssusersException if a matching ssusers could not be found
	 */
	@Override
	public ssusers findByUSER_ID_First(long user_id,
		OrderByComparator<ssusers> orderByComparator)
		throws NoSuchssusersException {
		ssusers ssusers = fetchByUSER_ID_First(user_id, orderByComparator);

		if (ssusers != null) {
			return ssusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("user_id=");
		msg.append(user_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchssusersException(msg.toString());
	}

	/**
	 * Returns the first ssusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ssusers, or <code>null</code> if a matching ssusers could not be found
	 */
	@Override
	public ssusers fetchByUSER_ID_First(long user_id,
		OrderByComparator<ssusers> orderByComparator) {
		List<ssusers> list = findByUSER_ID(user_id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ssusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ssusers
	 * @throws NoSuchssusersException if a matching ssusers could not be found
	 */
	@Override
	public ssusers findByUSER_ID_Last(long user_id,
		OrderByComparator<ssusers> orderByComparator)
		throws NoSuchssusersException {
		ssusers ssusers = fetchByUSER_ID_Last(user_id, orderByComparator);

		if (ssusers != null) {
			return ssusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("user_id=");
		msg.append(user_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchssusersException(msg.toString());
	}

	/**
	 * Returns the last ssusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ssusers, or <code>null</code> if a matching ssusers could not be found
	 */
	@Override
	public ssusers fetchByUSER_ID_Last(long user_id,
		OrderByComparator<ssusers> orderByComparator) {
		int count = countByUSER_ID(user_id);

		if (count == 0) {
			return null;
		}

		List<ssusers> list = findByUSER_ID(user_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ssuserses before and after the current ssusers in the ordered set where user_id = &#63;.
	 *
	 * @param id the primary key of the current ssusers
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ssusers
	 * @throws NoSuchssusersException if a ssusers with the primary key could not be found
	 */
	@Override
	public ssusers[] findByUSER_ID_PrevAndNext(long id, long user_id,
		OrderByComparator<ssusers> orderByComparator)
		throws NoSuchssusersException {
		ssusers ssusers = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ssusers[] array = new ssusersImpl[3];

			array[0] = getByUSER_ID_PrevAndNext(session, ssusers, user_id,
					orderByComparator, true);

			array[1] = ssusers;

			array[2] = getByUSER_ID_PrevAndNext(session, ssusers, user_id,
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

	protected ssusers getByUSER_ID_PrevAndNext(Session session,
		ssusers ssusers, long user_id,
		OrderByComparator<ssusers> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SSUSERS_WHERE);

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
			query.append(ssusersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(user_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(ssusers);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ssusers> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ssuserses where user_id = &#63; from the database.
	 *
	 * @param user_id the user_id
	 */
	@Override
	public void removeByUSER_ID(long user_id) {
		for (ssusers ssusers : findByUSER_ID(user_id, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(ssusers);
		}
	}

	/**
	 * Returns the number of ssuserses where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @return the number of matching ssuserses
	 */
	@Override
	public int countByUSER_ID(long user_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USER_ID;

		Object[] finderArgs = new Object[] { user_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SSUSERS_WHERE);

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

	private static final String _FINDER_COLUMN_USER_ID_USER_ID_2 = "ssusers.user_id = ?";

	public ssusersPersistenceImpl() {
		setModelClass(ssusers.class);
	}

	/**
	 * Caches the ssusers in the entity cache if it is enabled.
	 *
	 * @param ssusers the ssusers
	 */
	@Override
	public void cacheResult(ssusers ssusers) {
		entityCache.putResult(ssusersModelImpl.ENTITY_CACHE_ENABLED,
			ssusersImpl.class, ssusers.getPrimaryKey(), ssusers);

		ssusers.resetOriginalValues();
	}

	/**
	 * Caches the ssuserses in the entity cache if it is enabled.
	 *
	 * @param ssuserses the ssuserses
	 */
	@Override
	public void cacheResult(List<ssusers> ssuserses) {
		for (ssusers ssusers : ssuserses) {
			if (entityCache.getResult(ssusersModelImpl.ENTITY_CACHE_ENABLED,
						ssusersImpl.class, ssusers.getPrimaryKey()) == null) {
				cacheResult(ssusers);
			}
			else {
				ssusers.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ssuserses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ssusersImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ssusers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ssusers ssusers) {
		entityCache.removeResult(ssusersModelImpl.ENTITY_CACHE_ENABLED,
			ssusersImpl.class, ssusers.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ssusers> ssuserses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ssusers ssusers : ssuserses) {
			entityCache.removeResult(ssusersModelImpl.ENTITY_CACHE_ENABLED,
				ssusersImpl.class, ssusers.getPrimaryKey());
		}
	}

	/**
	 * Creates a new ssusers with the primary key. Does not add the ssusers to the database.
	 *
	 * @param id the primary key for the new ssusers
	 * @return the new ssusers
	 */
	@Override
	public ssusers create(long id) {
		ssusers ssusers = new ssusersImpl();

		ssusers.setNew(true);
		ssusers.setPrimaryKey(id);

		return ssusers;
	}

	/**
	 * Removes the ssusers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the ssusers
	 * @return the ssusers that was removed
	 * @throws NoSuchssusersException if a ssusers with the primary key could not be found
	 */
	@Override
	public ssusers remove(long id) throws NoSuchssusersException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the ssusers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ssusers
	 * @return the ssusers that was removed
	 * @throws NoSuchssusersException if a ssusers with the primary key could not be found
	 */
	@Override
	public ssusers remove(Serializable primaryKey)
		throws NoSuchssusersException {
		Session session = null;

		try {
			session = openSession();

			ssusers ssusers = (ssusers)session.get(ssusersImpl.class, primaryKey);

			if (ssusers == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchssusersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(ssusers);
		}
		catch (NoSuchssusersException nsee) {
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
	protected ssusers removeImpl(ssusers ssusers) {
		ssusers = toUnwrappedModel(ssusers);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ssusers)) {
				ssusers = (ssusers)session.get(ssusersImpl.class,
						ssusers.getPrimaryKeyObj());
			}

			if (ssusers != null) {
				session.delete(ssusers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (ssusers != null) {
			clearCache(ssusers);
		}

		return ssusers;
	}

	@Override
	public ssusers updateImpl(ssusers ssusers) {
		ssusers = toUnwrappedModel(ssusers);

		boolean isNew = ssusers.isNew();

		ssusersModelImpl ssusersModelImpl = (ssusersModelImpl)ssusers;

		Session session = null;

		try {
			session = openSession();

			if (ssusers.isNew()) {
				session.save(ssusers);

				ssusers.setNew(false);
			}
			else {
				ssusers = (ssusers)session.merge(ssusers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ssusersModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((ssusersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SS_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						ssusersModelImpl.getOriginalSsdetails_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SS_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SS_ID,
					args);

				args = new Object[] { ssusersModelImpl.getSsdetails_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SS_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SS_ID,
					args);
			}

			if ((ssusersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						ssusersModelImpl.getOriginalUser_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID,
					args);

				args = new Object[] { ssusersModelImpl.getUser_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID,
					args);
			}
		}

		entityCache.putResult(ssusersModelImpl.ENTITY_CACHE_ENABLED,
			ssusersImpl.class, ssusers.getPrimaryKey(), ssusers, false);

		ssusers.resetOriginalValues();

		return ssusers;
	}

	protected ssusers toUnwrappedModel(ssusers ssusers) {
		if (ssusers instanceof ssusersImpl) {
			return ssusers;
		}

		ssusersImpl ssusersImpl = new ssusersImpl();

		ssusersImpl.setNew(ssusers.isNew());
		ssusersImpl.setPrimaryKey(ssusers.getPrimaryKey());

		ssusersImpl.setId(ssusers.getId());
		ssusersImpl.setUser_id(ssusers.getUser_id());
		ssusersImpl.setSsdetails_id(ssusers.getSsdetails_id());

		return ssusersImpl;
	}

	/**
	 * Returns the ssusers with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the ssusers
	 * @return the ssusers
	 * @throws NoSuchssusersException if a ssusers with the primary key could not be found
	 */
	@Override
	public ssusers findByPrimaryKey(Serializable primaryKey)
		throws NoSuchssusersException {
		ssusers ssusers = fetchByPrimaryKey(primaryKey);

		if (ssusers == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchssusersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return ssusers;
	}

	/**
	 * Returns the ssusers with the primary key or throws a {@link NoSuchssusersException} if it could not be found.
	 *
	 * @param id the primary key of the ssusers
	 * @return the ssusers
	 * @throws NoSuchssusersException if a ssusers with the primary key could not be found
	 */
	@Override
	public ssusers findByPrimaryKey(long id) throws NoSuchssusersException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the ssusers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ssusers
	 * @return the ssusers, or <code>null</code> if a ssusers with the primary key could not be found
	 */
	@Override
	public ssusers fetchByPrimaryKey(Serializable primaryKey) {
		ssusers ssusers = (ssusers)entityCache.getResult(ssusersModelImpl.ENTITY_CACHE_ENABLED,
				ssusersImpl.class, primaryKey);

		if (ssusers == _nullssusers) {
			return null;
		}

		if (ssusers == null) {
			Session session = null;

			try {
				session = openSession();

				ssusers = (ssusers)session.get(ssusersImpl.class, primaryKey);

				if (ssusers != null) {
					cacheResult(ssusers);
				}
				else {
					entityCache.putResult(ssusersModelImpl.ENTITY_CACHE_ENABLED,
						ssusersImpl.class, primaryKey, _nullssusers);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ssusersModelImpl.ENTITY_CACHE_ENABLED,
					ssusersImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return ssusers;
	}

	/**
	 * Returns the ssusers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the ssusers
	 * @return the ssusers, or <code>null</code> if a ssusers with the primary key could not be found
	 */
	@Override
	public ssusers fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, ssusers> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ssusers> map = new HashMap<Serializable, ssusers>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ssusers ssusers = fetchByPrimaryKey(primaryKey);

			if (ssusers != null) {
				map.put(primaryKey, ssusers);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			ssusers ssusers = (ssusers)entityCache.getResult(ssusersModelImpl.ENTITY_CACHE_ENABLED,
					ssusersImpl.class, primaryKey);

			if (ssusers == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, ssusers);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SSUSERS_WHERE_PKS_IN);

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

			for (ssusers ssusers : (List<ssusers>)q.list()) {
				map.put(ssusers.getPrimaryKeyObj(), ssusers);

				cacheResult(ssusers);

				uncachedPrimaryKeys.remove(ssusers.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ssusersModelImpl.ENTITY_CACHE_ENABLED,
					ssusersImpl.class, primaryKey, _nullssusers);
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
	 * Returns all the ssuserses.
	 *
	 * @return the ssuserses
	 */
	@Override
	public List<ssusers> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ssuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ssuserses
	 * @param end the upper bound of the range of ssuserses (not inclusive)
	 * @return the range of ssuserses
	 */
	@Override
	public List<ssusers> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ssuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ssuserses
	 * @param end the upper bound of the range of ssuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ssuserses
	 */
	@Override
	public List<ssusers> findAll(int start, int end,
		OrderByComparator<ssusers> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ssuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ssuserses
	 * @param end the upper bound of the range of ssuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ssuserses
	 */
	@Override
	public List<ssusers> findAll(int start, int end,
		OrderByComparator<ssusers> orderByComparator, boolean retrieveFromCache) {
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

		List<ssusers> list = null;

		if (retrieveFromCache) {
			list = (List<ssusers>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SSUSERS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SSUSERS;

				if (pagination) {
					sql = sql.concat(ssusersModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ssusers>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ssusers>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the ssuserses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ssusers ssusers : findAll()) {
			remove(ssusers);
		}
	}

	/**
	 * Returns the number of ssuserses.
	 *
	 * @return the number of ssuserses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SSUSERS);

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
		return ssusersModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ssusers persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ssusersImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_SSUSERS = "SELECT ssusers FROM ssusers ssusers";
	private static final String _SQL_SELECT_SSUSERS_WHERE_PKS_IN = "SELECT ssusers FROM ssusers ssusers WHERE id_ IN (";
	private static final String _SQL_SELECT_SSUSERS_WHERE = "SELECT ssusers FROM ssusers ssusers WHERE ";
	private static final String _SQL_COUNT_SSUSERS = "SELECT COUNT(ssusers) FROM ssusers ssusers";
	private static final String _SQL_COUNT_SSUSERS_WHERE = "SELECT COUNT(ssusers) FROM ssusers ssusers WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "ssusers.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ssusers exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ssusers exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ssusersPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final ssusers _nullssusers = new ssusersImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ssusers> toCacheModel() {
				return _nullssusersCacheModel;
			}
		};

	private static final CacheModel<ssusers> _nullssusersCacheModel = new CacheModel<ssusers>() {
			@Override
			public ssusers toEntityModel() {
				return _nullssusers;
			}
		};
}