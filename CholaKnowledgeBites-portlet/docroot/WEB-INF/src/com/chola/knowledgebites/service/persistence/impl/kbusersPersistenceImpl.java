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

package com.chola.knowledgebites.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.knowledgebites.exception.NoSuchkbusersException;
import com.chola.knowledgebites.model.impl.kbusersImpl;
import com.chola.knowledgebites.model.impl.kbusersModelImpl;
import com.chola.knowledgebites.model.kbusers;
import com.chola.knowledgebites.service.persistence.kbusersPersistence;

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
 * The persistence implementation for the kbusers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see kbusersPersistence
 * @see com.chola.knowledgebites.service.persistence.kbusersUtil
 * @generated
 */
@ProviderType
public class kbusersPersistenceImpl extends BasePersistenceImpl<kbusers>
	implements kbusersPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link kbusersUtil} to access the kbusers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = kbusersImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(kbusersModelImpl.ENTITY_CACHE_ENABLED,
			kbusersModelImpl.FINDER_CACHE_ENABLED, kbusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(kbusersModelImpl.ENTITY_CACHE_ENABLED,
			kbusersModelImpl.FINDER_CACHE_ENABLED, kbusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(kbusersModelImpl.ENTITY_CACHE_ENABLED,
			kbusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_KB_ID = new FinderPath(kbusersModelImpl.ENTITY_CACHE_ENABLED,
			kbusersModelImpl.FINDER_CACHE_ENABLED, kbusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByKB_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KB_ID = new FinderPath(kbusersModelImpl.ENTITY_CACHE_ENABLED,
			kbusersModelImpl.FINDER_CACHE_ENABLED, kbusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByKB_ID",
			new String[] { Long.class.getName() },
			kbusersModelImpl.KBDETAILS_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_KB_ID = new FinderPath(kbusersModelImpl.ENTITY_CACHE_ENABLED,
			kbusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByKB_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the kbuserses where kbdetails_id = &#63;.
	 *
	 * @param kbdetails_id the kbdetails_id
	 * @return the matching kbuserses
	 */
	@Override
	public List<kbusers> findByKB_ID(long kbdetails_id) {
		return findByKB_ID(kbdetails_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the kbuserses where kbdetails_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param kbdetails_id the kbdetails_id
	 * @param start the lower bound of the range of kbuserses
	 * @param end the upper bound of the range of kbuserses (not inclusive)
	 * @return the range of matching kbuserses
	 */
	@Override
	public List<kbusers> findByKB_ID(long kbdetails_id, int start, int end) {
		return findByKB_ID(kbdetails_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the kbuserses where kbdetails_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param kbdetails_id the kbdetails_id
	 * @param start the lower bound of the range of kbuserses
	 * @param end the upper bound of the range of kbuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kbuserses
	 */
	@Override
	public List<kbusers> findByKB_ID(long kbdetails_id, int start, int end,
		OrderByComparator<kbusers> orderByComparator) {
		return findByKB_ID(kbdetails_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the kbuserses where kbdetails_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param kbdetails_id the kbdetails_id
	 * @param start the lower bound of the range of kbuserses
	 * @param end the upper bound of the range of kbuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching kbuserses
	 */
	@Override
	public List<kbusers> findByKB_ID(long kbdetails_id, int start, int end,
		OrderByComparator<kbusers> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KB_ID;
			finderArgs = new Object[] { kbdetails_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_KB_ID;
			finderArgs = new Object[] {
					kbdetails_id,
					
					start, end, orderByComparator
				};
		}

		List<kbusers> list = null;

		if (retrieveFromCache) {
			list = (List<kbusers>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (kbusers kbusers : list) {
					if ((kbdetails_id != kbusers.getKbdetails_id())) {
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

			query.append(_SQL_SELECT_KBUSERS_WHERE);

			query.append(_FINDER_COLUMN_KB_ID_KBDETAILS_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(kbusersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(kbdetails_id);

				if (!pagination) {
					list = (List<kbusers>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<kbusers>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first kbusers in the ordered set where kbdetails_id = &#63;.
	 *
	 * @param kbdetails_id the kbdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kbusers
	 * @throws NoSuchkbusersException if a matching kbusers could not be found
	 */
	@Override
	public kbusers findByKB_ID_First(long kbdetails_id,
		OrderByComparator<kbusers> orderByComparator)
		throws NoSuchkbusersException {
		kbusers kbusers = fetchByKB_ID_First(kbdetails_id, orderByComparator);

		if (kbusers != null) {
			return kbusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("kbdetails_id=");
		msg.append(kbdetails_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchkbusersException(msg.toString());
	}

	/**
	 * Returns the first kbusers in the ordered set where kbdetails_id = &#63;.
	 *
	 * @param kbdetails_id the kbdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kbusers, or <code>null</code> if a matching kbusers could not be found
	 */
	@Override
	public kbusers fetchByKB_ID_First(long kbdetails_id,
		OrderByComparator<kbusers> orderByComparator) {
		List<kbusers> list = findByKB_ID(kbdetails_id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last kbusers in the ordered set where kbdetails_id = &#63;.
	 *
	 * @param kbdetails_id the kbdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kbusers
	 * @throws NoSuchkbusersException if a matching kbusers could not be found
	 */
	@Override
	public kbusers findByKB_ID_Last(long kbdetails_id,
		OrderByComparator<kbusers> orderByComparator)
		throws NoSuchkbusersException {
		kbusers kbusers = fetchByKB_ID_Last(kbdetails_id, orderByComparator);

		if (kbusers != null) {
			return kbusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("kbdetails_id=");
		msg.append(kbdetails_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchkbusersException(msg.toString());
	}

	/**
	 * Returns the last kbusers in the ordered set where kbdetails_id = &#63;.
	 *
	 * @param kbdetails_id the kbdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kbusers, or <code>null</code> if a matching kbusers could not be found
	 */
	@Override
	public kbusers fetchByKB_ID_Last(long kbdetails_id,
		OrderByComparator<kbusers> orderByComparator) {
		int count = countByKB_ID(kbdetails_id);

		if (count == 0) {
			return null;
		}

		List<kbusers> list = findByKB_ID(kbdetails_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the kbuserses before and after the current kbusers in the ordered set where kbdetails_id = &#63;.
	 *
	 * @param id the primary key of the current kbusers
	 * @param kbdetails_id the kbdetails_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kbusers
	 * @throws NoSuchkbusersException if a kbusers with the primary key could not be found
	 */
	@Override
	public kbusers[] findByKB_ID_PrevAndNext(long id, long kbdetails_id,
		OrderByComparator<kbusers> orderByComparator)
		throws NoSuchkbusersException {
		kbusers kbusers = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			kbusers[] array = new kbusersImpl[3];

			array[0] = getByKB_ID_PrevAndNext(session, kbusers, kbdetails_id,
					orderByComparator, true);

			array[1] = kbusers;

			array[2] = getByKB_ID_PrevAndNext(session, kbusers, kbdetails_id,
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

	protected kbusers getByKB_ID_PrevAndNext(Session session, kbusers kbusers,
		long kbdetails_id, OrderByComparator<kbusers> orderByComparator,
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

		query.append(_SQL_SELECT_KBUSERS_WHERE);

		query.append(_FINDER_COLUMN_KB_ID_KBDETAILS_ID_2);

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
			query.append(kbusersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(kbdetails_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(kbusers);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<kbusers> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the kbuserses where kbdetails_id = &#63; from the database.
	 *
	 * @param kbdetails_id the kbdetails_id
	 */
	@Override
	public void removeByKB_ID(long kbdetails_id) {
		for (kbusers kbusers : findByKB_ID(kbdetails_id, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(kbusers);
		}
	}

	/**
	 * Returns the number of kbuserses where kbdetails_id = &#63;.
	 *
	 * @param kbdetails_id the kbdetails_id
	 * @return the number of matching kbuserses
	 */
	@Override
	public int countByKB_ID(long kbdetails_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_KB_ID;

		Object[] finderArgs = new Object[] { kbdetails_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KBUSERS_WHERE);

			query.append(_FINDER_COLUMN_KB_ID_KBDETAILS_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(kbdetails_id);

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

	private static final String _FINDER_COLUMN_KB_ID_KBDETAILS_ID_2 = "kbusers.kbdetails_id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USER_ID = new FinderPath(kbusersModelImpl.ENTITY_CACHE_ENABLED,
			kbusersModelImpl.FINDER_CACHE_ENABLED, kbusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUSER_ID",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID =
		new FinderPath(kbusersModelImpl.ENTITY_CACHE_ENABLED,
			kbusersModelImpl.FINDER_CACHE_ENABLED, kbusersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUSER_ID",
			new String[] { Long.class.getName() },
			kbusersModelImpl.USER_ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USER_ID = new FinderPath(kbusersModelImpl.ENTITY_CACHE_ENABLED,
			kbusersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUSER_ID",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the kbuserses where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @return the matching kbuserses
	 */
	@Override
	public List<kbusers> findByUSER_ID(long user_id) {
		return findByUSER_ID(user_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the kbuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of kbuserses
	 * @param end the upper bound of the range of kbuserses (not inclusive)
	 * @return the range of matching kbuserses
	 */
	@Override
	public List<kbusers> findByUSER_ID(long user_id, int start, int end) {
		return findByUSER_ID(user_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the kbuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of kbuserses
	 * @param end the upper bound of the range of kbuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kbuserses
	 */
	@Override
	public List<kbusers> findByUSER_ID(long user_id, int start, int end,
		OrderByComparator<kbusers> orderByComparator) {
		return findByUSER_ID(user_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the kbuserses where user_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param user_id the user_id
	 * @param start the lower bound of the range of kbuserses
	 * @param end the upper bound of the range of kbuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching kbuserses
	 */
	@Override
	public List<kbusers> findByUSER_ID(long user_id, int start, int end,
		OrderByComparator<kbusers> orderByComparator, boolean retrieveFromCache) {
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

		List<kbusers> list = null;

		if (retrieveFromCache) {
			list = (List<kbusers>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (kbusers kbusers : list) {
					if ((user_id != kbusers.getUser_id())) {
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

			query.append(_SQL_SELECT_KBUSERS_WHERE);

			query.append(_FINDER_COLUMN_USER_ID_USER_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(kbusersModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(user_id);

				if (!pagination) {
					list = (List<kbusers>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<kbusers>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first kbusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kbusers
	 * @throws NoSuchkbusersException if a matching kbusers could not be found
	 */
	@Override
	public kbusers findByUSER_ID_First(long user_id,
		OrderByComparator<kbusers> orderByComparator)
		throws NoSuchkbusersException {
		kbusers kbusers = fetchByUSER_ID_First(user_id, orderByComparator);

		if (kbusers != null) {
			return kbusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("user_id=");
		msg.append(user_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchkbusersException(msg.toString());
	}

	/**
	 * Returns the first kbusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kbusers, or <code>null</code> if a matching kbusers could not be found
	 */
	@Override
	public kbusers fetchByUSER_ID_First(long user_id,
		OrderByComparator<kbusers> orderByComparator) {
		List<kbusers> list = findByUSER_ID(user_id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last kbusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kbusers
	 * @throws NoSuchkbusersException if a matching kbusers could not be found
	 */
	@Override
	public kbusers findByUSER_ID_Last(long user_id,
		OrderByComparator<kbusers> orderByComparator)
		throws NoSuchkbusersException {
		kbusers kbusers = fetchByUSER_ID_Last(user_id, orderByComparator);

		if (kbusers != null) {
			return kbusers;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("user_id=");
		msg.append(user_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchkbusersException(msg.toString());
	}

	/**
	 * Returns the last kbusers in the ordered set where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kbusers, or <code>null</code> if a matching kbusers could not be found
	 */
	@Override
	public kbusers fetchByUSER_ID_Last(long user_id,
		OrderByComparator<kbusers> orderByComparator) {
		int count = countByUSER_ID(user_id);

		if (count == 0) {
			return null;
		}

		List<kbusers> list = findByUSER_ID(user_id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the kbuserses before and after the current kbusers in the ordered set where user_id = &#63;.
	 *
	 * @param id the primary key of the current kbusers
	 * @param user_id the user_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kbusers
	 * @throws NoSuchkbusersException if a kbusers with the primary key could not be found
	 */
	@Override
	public kbusers[] findByUSER_ID_PrevAndNext(long id, long user_id,
		OrderByComparator<kbusers> orderByComparator)
		throws NoSuchkbusersException {
		kbusers kbusers = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			kbusers[] array = new kbusersImpl[3];

			array[0] = getByUSER_ID_PrevAndNext(session, kbusers, user_id,
					orderByComparator, true);

			array[1] = kbusers;

			array[2] = getByUSER_ID_PrevAndNext(session, kbusers, user_id,
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

	protected kbusers getByUSER_ID_PrevAndNext(Session session,
		kbusers kbusers, long user_id,
		OrderByComparator<kbusers> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KBUSERS_WHERE);

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
			query.append(kbusersModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(user_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(kbusers);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<kbusers> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the kbuserses where user_id = &#63; from the database.
	 *
	 * @param user_id the user_id
	 */
	@Override
	public void removeByUSER_ID(long user_id) {
		for (kbusers kbusers : findByUSER_ID(user_id, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(kbusers);
		}
	}

	/**
	 * Returns the number of kbuserses where user_id = &#63;.
	 *
	 * @param user_id the user_id
	 * @return the number of matching kbuserses
	 */
	@Override
	public int countByUSER_ID(long user_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USER_ID;

		Object[] finderArgs = new Object[] { user_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KBUSERS_WHERE);

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

	private static final String _FINDER_COLUMN_USER_ID_USER_ID_2 = "kbusers.user_id = ?";

	public kbusersPersistenceImpl() {
		setModelClass(kbusers.class);
	}

	/**
	 * Caches the kbusers in the entity cache if it is enabled.
	 *
	 * @param kbusers the kbusers
	 */
	@Override
	public void cacheResult(kbusers kbusers) {
		entityCache.putResult(kbusersModelImpl.ENTITY_CACHE_ENABLED,
			kbusersImpl.class, kbusers.getPrimaryKey(), kbusers);

		kbusers.resetOriginalValues();
	}

	/**
	 * Caches the kbuserses in the entity cache if it is enabled.
	 *
	 * @param kbuserses the kbuserses
	 */
	@Override
	public void cacheResult(List<kbusers> kbuserses) {
		for (kbusers kbusers : kbuserses) {
			if (entityCache.getResult(kbusersModelImpl.ENTITY_CACHE_ENABLED,
						kbusersImpl.class, kbusers.getPrimaryKey()) == null) {
				cacheResult(kbusers);
			}
			else {
				kbusers.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all kbuserses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(kbusersImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the kbusers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(kbusers kbusers) {
		entityCache.removeResult(kbusersModelImpl.ENTITY_CACHE_ENABLED,
			kbusersImpl.class, kbusers.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<kbusers> kbuserses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (kbusers kbusers : kbuserses) {
			entityCache.removeResult(kbusersModelImpl.ENTITY_CACHE_ENABLED,
				kbusersImpl.class, kbusers.getPrimaryKey());
		}
	}

	/**
	 * Creates a new kbusers with the primary key. Does not add the kbusers to the database.
	 *
	 * @param id the primary key for the new kbusers
	 * @return the new kbusers
	 */
	@Override
	public kbusers create(long id) {
		kbusers kbusers = new kbusersImpl();

		kbusers.setNew(true);
		kbusers.setPrimaryKey(id);

		return kbusers;
	}

	/**
	 * Removes the kbusers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the kbusers
	 * @return the kbusers that was removed
	 * @throws NoSuchkbusersException if a kbusers with the primary key could not be found
	 */
	@Override
	public kbusers remove(long id) throws NoSuchkbusersException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the kbusers with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the kbusers
	 * @return the kbusers that was removed
	 * @throws NoSuchkbusersException if a kbusers with the primary key could not be found
	 */
	@Override
	public kbusers remove(Serializable primaryKey)
		throws NoSuchkbusersException {
		Session session = null;

		try {
			session = openSession();

			kbusers kbusers = (kbusers)session.get(kbusersImpl.class, primaryKey);

			if (kbusers == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchkbusersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(kbusers);
		}
		catch (NoSuchkbusersException nsee) {
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
	protected kbusers removeImpl(kbusers kbusers) {
		kbusers = toUnwrappedModel(kbusers);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(kbusers)) {
				kbusers = (kbusers)session.get(kbusersImpl.class,
						kbusers.getPrimaryKeyObj());
			}

			if (kbusers != null) {
				session.delete(kbusers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (kbusers != null) {
			clearCache(kbusers);
		}

		return kbusers;
	}

	@Override
	public kbusers updateImpl(kbusers kbusers) {
		kbusers = toUnwrappedModel(kbusers);

		boolean isNew = kbusers.isNew();

		kbusersModelImpl kbusersModelImpl = (kbusersModelImpl)kbusers;

		Session session = null;

		try {
			session = openSession();

			if (kbusers.isNew()) {
				session.save(kbusers);

				kbusers.setNew(false);
			}
			else {
				kbusers = (kbusers)session.merge(kbusers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !kbusersModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((kbusersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KB_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						kbusersModelImpl.getOriginalKbdetails_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_KB_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KB_ID,
					args);

				args = new Object[] { kbusersModelImpl.getKbdetails_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_KB_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KB_ID,
					args);
			}

			if ((kbusersModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						kbusersModelImpl.getOriginalUser_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID,
					args);

				args = new Object[] { kbusersModelImpl.getUser_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USER_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USER_ID,
					args);
			}
		}

		entityCache.putResult(kbusersModelImpl.ENTITY_CACHE_ENABLED,
			kbusersImpl.class, kbusers.getPrimaryKey(), kbusers, false);

		kbusers.resetOriginalValues();

		return kbusers;
	}

	protected kbusers toUnwrappedModel(kbusers kbusers) {
		if (kbusers instanceof kbusersImpl) {
			return kbusers;
		}

		kbusersImpl kbusersImpl = new kbusersImpl();

		kbusersImpl.setNew(kbusers.isNew());
		kbusersImpl.setPrimaryKey(kbusers.getPrimaryKey());

		kbusersImpl.setId(kbusers.getId());
		kbusersImpl.setUser_id(kbusers.getUser_id());
		kbusersImpl.setKbdetails_id(kbusers.getKbdetails_id());

		return kbusersImpl;
	}

	/**
	 * Returns the kbusers with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the kbusers
	 * @return the kbusers
	 * @throws NoSuchkbusersException if a kbusers with the primary key could not be found
	 */
	@Override
	public kbusers findByPrimaryKey(Serializable primaryKey)
		throws NoSuchkbusersException {
		kbusers kbusers = fetchByPrimaryKey(primaryKey);

		if (kbusers == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchkbusersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return kbusers;
	}

	/**
	 * Returns the kbusers with the primary key or throws a {@link NoSuchkbusersException} if it could not be found.
	 *
	 * @param id the primary key of the kbusers
	 * @return the kbusers
	 * @throws NoSuchkbusersException if a kbusers with the primary key could not be found
	 */
	@Override
	public kbusers findByPrimaryKey(long id) throws NoSuchkbusersException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the kbusers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the kbusers
	 * @return the kbusers, or <code>null</code> if a kbusers with the primary key could not be found
	 */
	@Override
	public kbusers fetchByPrimaryKey(Serializable primaryKey) {
		kbusers kbusers = (kbusers)entityCache.getResult(kbusersModelImpl.ENTITY_CACHE_ENABLED,
				kbusersImpl.class, primaryKey);

		if (kbusers == _nullkbusers) {
			return null;
		}

		if (kbusers == null) {
			Session session = null;

			try {
				session = openSession();

				kbusers = (kbusers)session.get(kbusersImpl.class, primaryKey);

				if (kbusers != null) {
					cacheResult(kbusers);
				}
				else {
					entityCache.putResult(kbusersModelImpl.ENTITY_CACHE_ENABLED,
						kbusersImpl.class, primaryKey, _nullkbusers);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(kbusersModelImpl.ENTITY_CACHE_ENABLED,
					kbusersImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return kbusers;
	}

	/**
	 * Returns the kbusers with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the kbusers
	 * @return the kbusers, or <code>null</code> if a kbusers with the primary key could not be found
	 */
	@Override
	public kbusers fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, kbusers> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, kbusers> map = new HashMap<Serializable, kbusers>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			kbusers kbusers = fetchByPrimaryKey(primaryKey);

			if (kbusers != null) {
				map.put(primaryKey, kbusers);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			kbusers kbusers = (kbusers)entityCache.getResult(kbusersModelImpl.ENTITY_CACHE_ENABLED,
					kbusersImpl.class, primaryKey);

			if (kbusers == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, kbusers);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_KBUSERS_WHERE_PKS_IN);

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

			for (kbusers kbusers : (List<kbusers>)q.list()) {
				map.put(kbusers.getPrimaryKeyObj(), kbusers);

				cacheResult(kbusers);

				uncachedPrimaryKeys.remove(kbusers.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(kbusersModelImpl.ENTITY_CACHE_ENABLED,
					kbusersImpl.class, primaryKey, _nullkbusers);
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
	 * Returns all the kbuserses.
	 *
	 * @return the kbuserses
	 */
	@Override
	public List<kbusers> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the kbuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of kbuserses
	 * @param end the upper bound of the range of kbuserses (not inclusive)
	 * @return the range of kbuserses
	 */
	@Override
	public List<kbusers> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the kbuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of kbuserses
	 * @param end the upper bound of the range of kbuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of kbuserses
	 */
	@Override
	public List<kbusers> findAll(int start, int end,
		OrderByComparator<kbusers> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the kbuserses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of kbuserses
	 * @param end the upper bound of the range of kbuserses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of kbuserses
	 */
	@Override
	public List<kbusers> findAll(int start, int end,
		OrderByComparator<kbusers> orderByComparator, boolean retrieveFromCache) {
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

		List<kbusers> list = null;

		if (retrieveFromCache) {
			list = (List<kbusers>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_KBUSERS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_KBUSERS;

				if (pagination) {
					sql = sql.concat(kbusersModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<kbusers>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<kbusers>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the kbuserses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (kbusers kbusers : findAll()) {
			remove(kbusers);
		}
	}

	/**
	 * Returns the number of kbuserses.
	 *
	 * @return the number of kbuserses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_KBUSERS);

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
		return kbusersModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the kbusers persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(kbusersImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_KBUSERS = "SELECT kbusers FROM kbusers kbusers";
	private static final String _SQL_SELECT_KBUSERS_WHERE_PKS_IN = "SELECT kbusers FROM kbusers kbusers WHERE id_ IN (";
	private static final String _SQL_SELECT_KBUSERS_WHERE = "SELECT kbusers FROM kbusers kbusers WHERE ";
	private static final String _SQL_COUNT_KBUSERS = "SELECT COUNT(kbusers) FROM kbusers kbusers";
	private static final String _SQL_COUNT_KBUSERS_WHERE = "SELECT COUNT(kbusers) FROM kbusers kbusers WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "kbusers.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No kbusers exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No kbusers exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(kbusersPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final kbusers _nullkbusers = new kbusersImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<kbusers> toCacheModel() {
				return _nullkbusersCacheModel;
			}
		};

	private static final CacheModel<kbusers> _nullkbusersCacheModel = new CacheModel<kbusers>() {
			@Override
			public kbusers toEntityModel() {
				return _nullkbusers;
			}
		};
}