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

package com.contest.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.contest.exception.NoSuchContestUserDetailsException;

import com.contest.model.ContestUserDetails;
import com.contest.model.impl.ContestUserDetailsImpl;
import com.contest.model.impl.ContestUserDetailsModelImpl;

import com.contest.service.persistence.ContestUserDetailsPersistence;

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
 * The persistence implementation for the contest user details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see ContestUserDetailsPersistence
 * @see com.contest.service.persistence.ContestUserDetailsUtil
 * @generated
 */
@ProviderType
public class ContestUserDetailsPersistenceImpl extends BasePersistenceImpl<ContestUserDetails>
	implements ContestUserDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ContestUserDetailsUtil} to access the contest user details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ContestUserDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ContestUserDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ContestUserDetailsModelImpl.FINDER_CACHE_ENABLED,
			ContestUserDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ContestUserDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ContestUserDetailsModelImpl.FINDER_CACHE_ENABLED,
			ContestUserDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ContestUserDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ContestUserDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTESTUSERREFERENCE_ID =
		new FinderPath(ContestUserDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ContestUserDetailsModelImpl.FINDER_CACHE_ENABLED,
			ContestUserDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCONTESTUSERREFERENCE_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTESTUSERREFERENCE_ID =
		new FinderPath(ContestUserDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ContestUserDetailsModelImpl.FINDER_CACHE_ENABLED,
			ContestUserDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCONTESTUSERREFERENCE_ID",
			new String[] { Long.class.getName() },
			ContestUserDetailsModelImpl.CONTESTREFERENCE_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTESTUSERREFERENCE_ID = new FinderPath(ContestUserDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ContestUserDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCONTESTUSERREFERENCE_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the contest user detailses where contestreference_id = &#63;.
	 *
	 * @param contestreference_id the contestreference_id
	 * @return the matching contest user detailses
	 */
	@Override
	public List<ContestUserDetails> findByCONTESTUSERREFERENCE_ID(
		long contestreference_id) {
		return findByCONTESTUSERREFERENCE_ID(contestreference_id,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the contest user detailses where contestreference_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param contestreference_id the contestreference_id
	 * @param start the lower bound of the range of contest user detailses
	 * @param end the upper bound of the range of contest user detailses (not inclusive)
	 * @return the range of matching contest user detailses
	 */
	@Override
	public List<ContestUserDetails> findByCONTESTUSERREFERENCE_ID(
		long contestreference_id, int start, int end) {
		return findByCONTESTUSERREFERENCE_ID(contestreference_id, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the contest user detailses where contestreference_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param contestreference_id the contestreference_id
	 * @param start the lower bound of the range of contest user detailses
	 * @param end the upper bound of the range of contest user detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contest user detailses
	 */
	@Override
	public List<ContestUserDetails> findByCONTESTUSERREFERENCE_ID(
		long contestreference_id, int start, int end,
		OrderByComparator<ContestUserDetails> orderByComparator) {
		return findByCONTESTUSERREFERENCE_ID(contestreference_id, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the contest user detailses where contestreference_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param contestreference_id the contestreference_id
	 * @param start the lower bound of the range of contest user detailses
	 * @param end the upper bound of the range of contest user detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching contest user detailses
	 */
	@Override
	public List<ContestUserDetails> findByCONTESTUSERREFERENCE_ID(
		long contestreference_id, int start, int end,
		OrderByComparator<ContestUserDetails> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTESTUSERREFERENCE_ID;
			finderArgs = new Object[] { contestreference_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTESTUSERREFERENCE_ID;
			finderArgs = new Object[] {
					contestreference_id,
					
					start, end, orderByComparator
				};
		}

		List<ContestUserDetails> list = null;

		if (retrieveFromCache) {
			list = (List<ContestUserDetails>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ContestUserDetails contestUserDetails : list) {
					if ((contestreference_id != contestUserDetails.getContestreference_id())) {
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

			query.append(_SQL_SELECT_CONTESTUSERDETAILS_WHERE);

			query.append(_FINDER_COLUMN_CONTESTUSERREFERENCE_ID_CONTESTREFERENCE_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ContestUserDetailsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(contestreference_id);

				if (!pagination) {
					list = (List<ContestUserDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ContestUserDetails>)QueryUtil.list(q,
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
	 * Returns the first contest user details in the ordered set where contestreference_id = &#63;.
	 *
	 * @param contestreference_id the contestreference_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contest user details
	 * @throws NoSuchContestUserDetailsException if a matching contest user details could not be found
	 */
	@Override
	public ContestUserDetails findByCONTESTUSERREFERENCE_ID_First(
		long contestreference_id,
		OrderByComparator<ContestUserDetails> orderByComparator)
		throws NoSuchContestUserDetailsException {
		ContestUserDetails contestUserDetails = fetchByCONTESTUSERREFERENCE_ID_First(contestreference_id,
				orderByComparator);

		if (contestUserDetails != null) {
			return contestUserDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("contestreference_id=");
		msg.append(contestreference_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchContestUserDetailsException(msg.toString());
	}

	/**
	 * Returns the first contest user details in the ordered set where contestreference_id = &#63;.
	 *
	 * @param contestreference_id the contestreference_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contest user details, or <code>null</code> if a matching contest user details could not be found
	 */
	@Override
	public ContestUserDetails fetchByCONTESTUSERREFERENCE_ID_First(
		long contestreference_id,
		OrderByComparator<ContestUserDetails> orderByComparator) {
		List<ContestUserDetails> list = findByCONTESTUSERREFERENCE_ID(contestreference_id,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last contest user details in the ordered set where contestreference_id = &#63;.
	 *
	 * @param contestreference_id the contestreference_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contest user details
	 * @throws NoSuchContestUserDetailsException if a matching contest user details could not be found
	 */
	@Override
	public ContestUserDetails findByCONTESTUSERREFERENCE_ID_Last(
		long contestreference_id,
		OrderByComparator<ContestUserDetails> orderByComparator)
		throws NoSuchContestUserDetailsException {
		ContestUserDetails contestUserDetails = fetchByCONTESTUSERREFERENCE_ID_Last(contestreference_id,
				orderByComparator);

		if (contestUserDetails != null) {
			return contestUserDetails;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("contestreference_id=");
		msg.append(contestreference_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchContestUserDetailsException(msg.toString());
	}

	/**
	 * Returns the last contest user details in the ordered set where contestreference_id = &#63;.
	 *
	 * @param contestreference_id the contestreference_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contest user details, or <code>null</code> if a matching contest user details could not be found
	 */
	@Override
	public ContestUserDetails fetchByCONTESTUSERREFERENCE_ID_Last(
		long contestreference_id,
		OrderByComparator<ContestUserDetails> orderByComparator) {
		int count = countByCONTESTUSERREFERENCE_ID(contestreference_id);

		if (count == 0) {
			return null;
		}

		List<ContestUserDetails> list = findByCONTESTUSERREFERENCE_ID(contestreference_id,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the contest user detailses before and after the current contest user details in the ordered set where contestreference_id = &#63;.
	 *
	 * @param id the primary key of the current contest user details
	 * @param contestreference_id the contestreference_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contest user details
	 * @throws NoSuchContestUserDetailsException if a contest user details with the primary key could not be found
	 */
	@Override
	public ContestUserDetails[] findByCONTESTUSERREFERENCE_ID_PrevAndNext(
		long id, long contestreference_id,
		OrderByComparator<ContestUserDetails> orderByComparator)
		throws NoSuchContestUserDetailsException {
		ContestUserDetails contestUserDetails = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ContestUserDetails[] array = new ContestUserDetailsImpl[3];

			array[0] = getByCONTESTUSERREFERENCE_ID_PrevAndNext(session,
					contestUserDetails, contestreference_id, orderByComparator,
					true);

			array[1] = contestUserDetails;

			array[2] = getByCONTESTUSERREFERENCE_ID_PrevAndNext(session,
					contestUserDetails, contestreference_id, orderByComparator,
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

	protected ContestUserDetails getByCONTESTUSERREFERENCE_ID_PrevAndNext(
		Session session, ContestUserDetails contestUserDetails,
		long contestreference_id,
		OrderByComparator<ContestUserDetails> orderByComparator,
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

		query.append(_SQL_SELECT_CONTESTUSERDETAILS_WHERE);

		query.append(_FINDER_COLUMN_CONTESTUSERREFERENCE_ID_CONTESTREFERENCE_ID_2);

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
			query.append(ContestUserDetailsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(contestreference_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(contestUserDetails);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ContestUserDetails> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the contest user detailses where contestreference_id = &#63; from the database.
	 *
	 * @param contestreference_id the contestreference_id
	 */
	@Override
	public void removeByCONTESTUSERREFERENCE_ID(long contestreference_id) {
		for (ContestUserDetails contestUserDetails : findByCONTESTUSERREFERENCE_ID(
				contestreference_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(contestUserDetails);
		}
	}

	/**
	 * Returns the number of contest user detailses where contestreference_id = &#63;.
	 *
	 * @param contestreference_id the contestreference_id
	 * @return the number of matching contest user detailses
	 */
	@Override
	public int countByCONTESTUSERREFERENCE_ID(long contestreference_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTESTUSERREFERENCE_ID;

		Object[] finderArgs = new Object[] { contestreference_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONTESTUSERDETAILS_WHERE);

			query.append(_FINDER_COLUMN_CONTESTUSERREFERENCE_ID_CONTESTREFERENCE_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(contestreference_id);

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

	private static final String _FINDER_COLUMN_CONTESTUSERREFERENCE_ID_CONTESTREFERENCE_ID_2 =
		"contestUserDetails.contestreference_id = ?";

	public ContestUserDetailsPersistenceImpl() {
		setModelClass(ContestUserDetails.class);
	}

	/**
	 * Caches the contest user details in the entity cache if it is enabled.
	 *
	 * @param contestUserDetails the contest user details
	 */
	@Override
	public void cacheResult(ContestUserDetails contestUserDetails) {
		entityCache.putResult(ContestUserDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ContestUserDetailsImpl.class, contestUserDetails.getPrimaryKey(),
			contestUserDetails);

		contestUserDetails.resetOriginalValues();
	}

	/**
	 * Caches the contest user detailses in the entity cache if it is enabled.
	 *
	 * @param contestUserDetailses the contest user detailses
	 */
	@Override
	public void cacheResult(List<ContestUserDetails> contestUserDetailses) {
		for (ContestUserDetails contestUserDetails : contestUserDetailses) {
			if (entityCache.getResult(
						ContestUserDetailsModelImpl.ENTITY_CACHE_ENABLED,
						ContestUserDetailsImpl.class,
						contestUserDetails.getPrimaryKey()) == null) {
				cacheResult(contestUserDetails);
			}
			else {
				contestUserDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all contest user detailses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ContestUserDetailsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the contest user details.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ContestUserDetails contestUserDetails) {
		entityCache.removeResult(ContestUserDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ContestUserDetailsImpl.class, contestUserDetails.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ContestUserDetails> contestUserDetailses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ContestUserDetails contestUserDetails : contestUserDetailses) {
			entityCache.removeResult(ContestUserDetailsModelImpl.ENTITY_CACHE_ENABLED,
				ContestUserDetailsImpl.class, contestUserDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new contest user details with the primary key. Does not add the contest user details to the database.
	 *
	 * @param id the primary key for the new contest user details
	 * @return the new contest user details
	 */
	@Override
	public ContestUserDetails create(long id) {
		ContestUserDetails contestUserDetails = new ContestUserDetailsImpl();

		contestUserDetails.setNew(true);
		contestUserDetails.setPrimaryKey(id);

		return contestUserDetails;
	}

	/**
	 * Removes the contest user details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the contest user details
	 * @return the contest user details that was removed
	 * @throws NoSuchContestUserDetailsException if a contest user details with the primary key could not be found
	 */
	@Override
	public ContestUserDetails remove(long id)
		throws NoSuchContestUserDetailsException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the contest user details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the contest user details
	 * @return the contest user details that was removed
	 * @throws NoSuchContestUserDetailsException if a contest user details with the primary key could not be found
	 */
	@Override
	public ContestUserDetails remove(Serializable primaryKey)
		throws NoSuchContestUserDetailsException {
		Session session = null;

		try {
			session = openSession();

			ContestUserDetails contestUserDetails = (ContestUserDetails)session.get(ContestUserDetailsImpl.class,
					primaryKey);

			if (contestUserDetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchContestUserDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(contestUserDetails);
		}
		catch (NoSuchContestUserDetailsException nsee) {
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
	protected ContestUserDetails removeImpl(
		ContestUserDetails contestUserDetails) {
		contestUserDetails = toUnwrappedModel(contestUserDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(contestUserDetails)) {
				contestUserDetails = (ContestUserDetails)session.get(ContestUserDetailsImpl.class,
						contestUserDetails.getPrimaryKeyObj());
			}

			if (contestUserDetails != null) {
				session.delete(contestUserDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (contestUserDetails != null) {
			clearCache(contestUserDetails);
		}

		return contestUserDetails;
	}

	@Override
	public ContestUserDetails updateImpl(ContestUserDetails contestUserDetails) {
		contestUserDetails = toUnwrappedModel(contestUserDetails);

		boolean isNew = contestUserDetails.isNew();

		ContestUserDetailsModelImpl contestUserDetailsModelImpl = (ContestUserDetailsModelImpl)contestUserDetails;

		Session session = null;

		try {
			session = openSession();

			if (contestUserDetails.isNew()) {
				session.save(contestUserDetails);

				contestUserDetails.setNew(false);
			}
			else {
				contestUserDetails = (ContestUserDetails)session.merge(contestUserDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ContestUserDetailsModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((contestUserDetailsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTESTUSERREFERENCE_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						contestUserDetailsModelImpl.getOriginalContestreference_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTESTUSERREFERENCE_ID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTESTUSERREFERENCE_ID,
					args);

				args = new Object[] {
						contestUserDetailsModelImpl.getContestreference_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CONTESTUSERREFERENCE_ID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTESTUSERREFERENCE_ID,
					args);
			}
		}

		entityCache.putResult(ContestUserDetailsModelImpl.ENTITY_CACHE_ENABLED,
			ContestUserDetailsImpl.class, contestUserDetails.getPrimaryKey(),
			contestUserDetails, false);

		contestUserDetails.resetOriginalValues();

		return contestUserDetails;
	}

	protected ContestUserDetails toUnwrappedModel(
		ContestUserDetails contestUserDetails) {
		if (contestUserDetails instanceof ContestUserDetailsImpl) {
			return contestUserDetails;
		}

		ContestUserDetailsImpl contestUserDetailsImpl = new ContestUserDetailsImpl();

		contestUserDetailsImpl.setNew(contestUserDetails.isNew());
		contestUserDetailsImpl.setPrimaryKey(contestUserDetails.getPrimaryKey());

		contestUserDetailsImpl.setId(contestUserDetails.getId());
		contestUserDetailsImpl.setUser_id(contestUserDetails.getUser_id());
		contestUserDetailsImpl.setContestreference_id(contestUserDetails.getContestreference_id());

		return contestUserDetailsImpl;
	}

	/**
	 * Returns the contest user details with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the contest user details
	 * @return the contest user details
	 * @throws NoSuchContestUserDetailsException if a contest user details with the primary key could not be found
	 */
	@Override
	public ContestUserDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchContestUserDetailsException {
		ContestUserDetails contestUserDetails = fetchByPrimaryKey(primaryKey);

		if (contestUserDetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchContestUserDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return contestUserDetails;
	}

	/**
	 * Returns the contest user details with the primary key or throws a {@link NoSuchContestUserDetailsException} if it could not be found.
	 *
	 * @param id the primary key of the contest user details
	 * @return the contest user details
	 * @throws NoSuchContestUserDetailsException if a contest user details with the primary key could not be found
	 */
	@Override
	public ContestUserDetails findByPrimaryKey(long id)
		throws NoSuchContestUserDetailsException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the contest user details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the contest user details
	 * @return the contest user details, or <code>null</code> if a contest user details with the primary key could not be found
	 */
	@Override
	public ContestUserDetails fetchByPrimaryKey(Serializable primaryKey) {
		ContestUserDetails contestUserDetails = (ContestUserDetails)entityCache.getResult(ContestUserDetailsModelImpl.ENTITY_CACHE_ENABLED,
				ContestUserDetailsImpl.class, primaryKey);

		if (contestUserDetails == _nullContestUserDetails) {
			return null;
		}

		if (contestUserDetails == null) {
			Session session = null;

			try {
				session = openSession();

				contestUserDetails = (ContestUserDetails)session.get(ContestUserDetailsImpl.class,
						primaryKey);

				if (contestUserDetails != null) {
					cacheResult(contestUserDetails);
				}
				else {
					entityCache.putResult(ContestUserDetailsModelImpl.ENTITY_CACHE_ENABLED,
						ContestUserDetailsImpl.class, primaryKey,
						_nullContestUserDetails);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ContestUserDetailsModelImpl.ENTITY_CACHE_ENABLED,
					ContestUserDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return contestUserDetails;
	}

	/**
	 * Returns the contest user details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the contest user details
	 * @return the contest user details, or <code>null</code> if a contest user details with the primary key could not be found
	 */
	@Override
	public ContestUserDetails fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, ContestUserDetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ContestUserDetails> map = new HashMap<Serializable, ContestUserDetails>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ContestUserDetails contestUserDetails = fetchByPrimaryKey(primaryKey);

			if (contestUserDetails != null) {
				map.put(primaryKey, contestUserDetails);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			ContestUserDetails contestUserDetails = (ContestUserDetails)entityCache.getResult(ContestUserDetailsModelImpl.ENTITY_CACHE_ENABLED,
					ContestUserDetailsImpl.class, primaryKey);

			if (contestUserDetails == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, contestUserDetails);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CONTESTUSERDETAILS_WHERE_PKS_IN);

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

			for (ContestUserDetails contestUserDetails : (List<ContestUserDetails>)q.list()) {
				map.put(contestUserDetails.getPrimaryKeyObj(),
					contestUserDetails);

				cacheResult(contestUserDetails);

				uncachedPrimaryKeys.remove(contestUserDetails.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ContestUserDetailsModelImpl.ENTITY_CACHE_ENABLED,
					ContestUserDetailsImpl.class, primaryKey,
					_nullContestUserDetails);
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
	 * Returns all the contest user detailses.
	 *
	 * @return the contest user detailses
	 */
	@Override
	public List<ContestUserDetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the contest user detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contest user detailses
	 * @param end the upper bound of the range of contest user detailses (not inclusive)
	 * @return the range of contest user detailses
	 */
	@Override
	public List<ContestUserDetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the contest user detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contest user detailses
	 * @param end the upper bound of the range of contest user detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of contest user detailses
	 */
	@Override
	public List<ContestUserDetails> findAll(int start, int end,
		OrderByComparator<ContestUserDetails> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the contest user detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contest user detailses
	 * @param end the upper bound of the range of contest user detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of contest user detailses
	 */
	@Override
	public List<ContestUserDetails> findAll(int start, int end,
		OrderByComparator<ContestUserDetails> orderByComparator,
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

		List<ContestUserDetails> list = null;

		if (retrieveFromCache) {
			list = (List<ContestUserDetails>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CONTESTUSERDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONTESTUSERDETAILS;

				if (pagination) {
					sql = sql.concat(ContestUserDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ContestUserDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ContestUserDetails>)QueryUtil.list(q,
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
	 * Removes all the contest user detailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ContestUserDetails contestUserDetails : findAll()) {
			remove(contestUserDetails);
		}
	}

	/**
	 * Returns the number of contest user detailses.
	 *
	 * @return the number of contest user detailses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CONTESTUSERDETAILS);

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
		return ContestUserDetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the contest user details persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ContestUserDetailsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_CONTESTUSERDETAILS = "SELECT contestUserDetails FROM ContestUserDetails contestUserDetails";
	private static final String _SQL_SELECT_CONTESTUSERDETAILS_WHERE_PKS_IN = "SELECT contestUserDetails FROM ContestUserDetails contestUserDetails WHERE id_ IN (";
	private static final String _SQL_SELECT_CONTESTUSERDETAILS_WHERE = "SELECT contestUserDetails FROM ContestUserDetails contestUserDetails WHERE ";
	private static final String _SQL_COUNT_CONTESTUSERDETAILS = "SELECT COUNT(contestUserDetails) FROM ContestUserDetails contestUserDetails";
	private static final String _SQL_COUNT_CONTESTUSERDETAILS_WHERE = "SELECT COUNT(contestUserDetails) FROM ContestUserDetails contestUserDetails WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "contestUserDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ContestUserDetails exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ContestUserDetails exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ContestUserDetailsPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final ContestUserDetails _nullContestUserDetails = new ContestUserDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ContestUserDetails> toCacheModel() {
				return _nullContestUserDetailsCacheModel;
			}
		};

	private static final CacheModel<ContestUserDetails> _nullContestUserDetailsCacheModel =
		new CacheModel<ContestUserDetails>() {
			@Override
			public ContestUserDetails toEntityModel() {
				return _nullContestUserDetails;
			}
		};
}