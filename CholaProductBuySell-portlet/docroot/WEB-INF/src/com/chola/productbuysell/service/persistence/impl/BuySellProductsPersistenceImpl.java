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

package com.chola.productbuysell.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.productbuysell.exception.NoSuchBuySellProductsException;
import com.chola.productbuysell.model.BuySellProducts;
import com.chola.productbuysell.model.impl.BuySellProductsImpl;
import com.chola.productbuysell.model.impl.BuySellProductsModelImpl;
import com.chola.productbuysell.service.persistence.BuySellProductsPersistence;

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
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the buy sell products service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay03
 * @see BuySellProductsPersistence
 * @see com.chola.productbuysell.service.persistence.BuySellProductsUtil
 * @generated
 */
@ProviderType
public class BuySellProductsPersistenceImpl extends BasePersistenceImpl<BuySellProducts>
	implements BuySellProductsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BuySellProductsUtil} to access the buy sell products persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BuySellProductsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsModelImpl.FINDER_CACHE_ENABLED,
			BuySellProductsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsModelImpl.FINDER_CACHE_ENABLED,
			BuySellProductsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CATEGORY = new FinderPath(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsModelImpl.FINDER_CACHE_ENABLED,
			BuySellProductsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCATEGORY",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORY =
		new FinderPath(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsModelImpl.FINDER_CACHE_ENABLED,
			BuySellProductsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCATEGORY",
			new String[] { Long.class.getName() },
			BuySellProductsModelImpl.CATEGORY_ID_COLUMN_BITMASK |
			BuySellProductsModelImpl.CREATED_DATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CATEGORY = new FinderPath(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCATEGORY",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the buy sell productses where category_id = &#63;.
	 *
	 * @param category_id the category_id
	 * @return the matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findByCATEGORY(long category_id) {
		return findByCATEGORY(category_id, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the buy sell productses where category_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param category_id the category_id
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @return the range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findByCATEGORY(long category_id, int start,
		int end) {
		return findByCATEGORY(category_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the buy sell productses where category_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param category_id the category_id
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findByCATEGORY(long category_id, int start,
		int end, OrderByComparator<BuySellProducts> orderByComparator) {
		return findByCATEGORY(category_id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the buy sell productses where category_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param category_id the category_id
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findByCATEGORY(long category_id, int start,
		int end, OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORY;
			finderArgs = new Object[] { category_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CATEGORY;
			finderArgs = new Object[] { category_id, start, end, orderByComparator };
		}

		List<BuySellProducts> list = null;

		if (retrieveFromCache) {
			list = (List<BuySellProducts>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (BuySellProducts buySellProducts : list) {
					if ((category_id != buySellProducts.getCategory_id())) {
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

			query.append(_SQL_SELECT_BUYSELLPRODUCTS_WHERE);

			query.append(_FINDER_COLUMN_CATEGORY_CATEGORY_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BuySellProductsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(category_id);

				if (!pagination) {
					list = (List<BuySellProducts>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<BuySellProducts>)QueryUtil.list(q,
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
	 * Returns the first buy sell products in the ordered set where category_id = &#63;.
	 *
	 * @param category_id the category_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching buy sell products
	 * @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts findByCATEGORY_First(long category_id,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = fetchByCATEGORY_First(category_id,
				orderByComparator);

		if (buySellProducts != null) {
			return buySellProducts;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("category_id=");
		msg.append(category_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBuySellProductsException(msg.toString());
	}

	/**
	 * Returns the first buy sell products in the ordered set where category_id = &#63;.
	 *
	 * @param category_id the category_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts fetchByCATEGORY_First(long category_id,
		OrderByComparator<BuySellProducts> orderByComparator) {
		List<BuySellProducts> list = findByCATEGORY(category_id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last buy sell products in the ordered set where category_id = &#63;.
	 *
	 * @param category_id the category_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching buy sell products
	 * @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts findByCATEGORY_Last(long category_id,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = fetchByCATEGORY_Last(category_id,
				orderByComparator);

		if (buySellProducts != null) {
			return buySellProducts;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("category_id=");
		msg.append(category_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBuySellProductsException(msg.toString());
	}

	/**
	 * Returns the last buy sell products in the ordered set where category_id = &#63;.
	 *
	 * @param category_id the category_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts fetchByCATEGORY_Last(long category_id,
		OrderByComparator<BuySellProducts> orderByComparator) {
		int count = countByCATEGORY(category_id);

		if (count == 0) {
			return null;
		}

		List<BuySellProducts> list = findByCATEGORY(category_id, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the buy sell productses before and after the current buy sell products in the ordered set where category_id = &#63;.
	 *
	 * @param id the primary key of the current buy sell products
	 * @param category_id the category_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next buy sell products
	 * @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	 */
	@Override
	public BuySellProducts[] findByCATEGORY_PrevAndNext(long id,
		long category_id, OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			BuySellProducts[] array = new BuySellProductsImpl[3];

			array[0] = getByCATEGORY_PrevAndNext(session, buySellProducts,
					category_id, orderByComparator, true);

			array[1] = buySellProducts;

			array[2] = getByCATEGORY_PrevAndNext(session, buySellProducts,
					category_id, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected BuySellProducts getByCATEGORY_PrevAndNext(Session session,
		BuySellProducts buySellProducts, long category_id,
		OrderByComparator<BuySellProducts> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BUYSELLPRODUCTS_WHERE);

		query.append(_FINDER_COLUMN_CATEGORY_CATEGORY_ID_2);

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
			query.append(BuySellProductsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(category_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(buySellProducts);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BuySellProducts> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the buy sell productses where category_id = &#63; from the database.
	 *
	 * @param category_id the category_id
	 */
	@Override
	public void removeByCATEGORY(long category_id) {
		for (BuySellProducts buySellProducts : findByCATEGORY(category_id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(buySellProducts);
		}
	}

	/**
	 * Returns the number of buy sell productses where category_id = &#63;.
	 *
	 * @param category_id the category_id
	 * @return the number of matching buy sell productses
	 */
	@Override
	public int countByCATEGORY(long category_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CATEGORY;

		Object[] finderArgs = new Object[] { category_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BUYSELLPRODUCTS_WHERE);

			query.append(_FINDER_COLUMN_CATEGORY_CATEGORY_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(category_id);

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

	private static final String _FINDER_COLUMN_CATEGORY_CATEGORY_ID_2 = "buySellProducts.category_id = ? AND buySellProducts.status!=2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCATION = new FinderPath(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsModelImpl.FINDER_CACHE_ENABLED,
			BuySellProductsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByLOCATION",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATION =
		new FinderPath(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsModelImpl.FINDER_CACHE_ENABLED,
			BuySellProductsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLOCATION",
			new String[] { Long.class.getName() },
			BuySellProductsModelImpl.LOCATION_COLUMN_BITMASK |
			BuySellProductsModelImpl.CREATED_DATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_LOCATION = new FinderPath(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLOCATION",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the buy sell productses where location = &#63;.
	 *
	 * @param location the location
	 * @return the matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findByLOCATION(long location) {
		return findByLOCATION(location, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the buy sell productses where location = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param location the location
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @return the range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findByLOCATION(long location, int start,
		int end) {
		return findByLOCATION(location, start, end, null);
	}

	/**
	 * Returns an ordered range of all the buy sell productses where location = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param location the location
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findByLOCATION(long location, int start,
		int end, OrderByComparator<BuySellProducts> orderByComparator) {
		return findByLOCATION(location, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the buy sell productses where location = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param location the location
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findByLOCATION(long location, int start,
		int end, OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATION;
			finderArgs = new Object[] { location };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCATION;
			finderArgs = new Object[] { location, start, end, orderByComparator };
		}

		List<BuySellProducts> list = null;

		if (retrieveFromCache) {
			list = (List<BuySellProducts>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (BuySellProducts buySellProducts : list) {
					if ((location != buySellProducts.getLocation())) {
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

			query.append(_SQL_SELECT_BUYSELLPRODUCTS_WHERE);

			query.append(_FINDER_COLUMN_LOCATION_LOCATION_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BuySellProductsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(location);

				if (!pagination) {
					list = (List<BuySellProducts>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<BuySellProducts>)QueryUtil.list(q,
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
	 * Returns the first buy sell products in the ordered set where location = &#63;.
	 *
	 * @param location the location
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching buy sell products
	 * @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts findByLOCATION_First(long location,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = fetchByLOCATION_First(location,
				orderByComparator);

		if (buySellProducts != null) {
			return buySellProducts;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("location=");
		msg.append(location);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBuySellProductsException(msg.toString());
	}

	/**
	 * Returns the first buy sell products in the ordered set where location = &#63;.
	 *
	 * @param location the location
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts fetchByLOCATION_First(long location,
		OrderByComparator<BuySellProducts> orderByComparator) {
		List<BuySellProducts> list = findByLOCATION(location, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last buy sell products in the ordered set where location = &#63;.
	 *
	 * @param location the location
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching buy sell products
	 * @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts findByLOCATION_Last(long location,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = fetchByLOCATION_Last(location,
				orderByComparator);

		if (buySellProducts != null) {
			return buySellProducts;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("location=");
		msg.append(location);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBuySellProductsException(msg.toString());
	}

	/**
	 * Returns the last buy sell products in the ordered set where location = &#63;.
	 *
	 * @param location the location
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts fetchByLOCATION_Last(long location,
		OrderByComparator<BuySellProducts> orderByComparator) {
		int count = countByLOCATION(location);

		if (count == 0) {
			return null;
		}

		List<BuySellProducts> list = findByLOCATION(location, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the buy sell productses before and after the current buy sell products in the ordered set where location = &#63;.
	 *
	 * @param id the primary key of the current buy sell products
	 * @param location the location
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next buy sell products
	 * @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	 */
	@Override
	public BuySellProducts[] findByLOCATION_PrevAndNext(long id, long location,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			BuySellProducts[] array = new BuySellProductsImpl[3];

			array[0] = getByLOCATION_PrevAndNext(session, buySellProducts,
					location, orderByComparator, true);

			array[1] = buySellProducts;

			array[2] = getByLOCATION_PrevAndNext(session, buySellProducts,
					location, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected BuySellProducts getByLOCATION_PrevAndNext(Session session,
		BuySellProducts buySellProducts, long location,
		OrderByComparator<BuySellProducts> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BUYSELLPRODUCTS_WHERE);

		query.append(_FINDER_COLUMN_LOCATION_LOCATION_2);

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
			query.append(BuySellProductsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(location);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(buySellProducts);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BuySellProducts> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the buy sell productses where location = &#63; from the database.
	 *
	 * @param location the location
	 */
	@Override
	public void removeByLOCATION(long location) {
		for (BuySellProducts buySellProducts : findByLOCATION(location,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(buySellProducts);
		}
	}

	/**
	 * Returns the number of buy sell productses where location = &#63;.
	 *
	 * @param location the location
	 * @return the number of matching buy sell productses
	 */
	@Override
	public int countByLOCATION(long location) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_LOCATION;

		Object[] finderArgs = new Object[] { location };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BUYSELLPRODUCTS_WHERE);

			query.append(_FINDER_COLUMN_LOCATION_LOCATION_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(location);

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

	private static final String _FINDER_COLUMN_LOCATION_LOCATION_2 = "buySellProducts.location = ? AND buySellProducts.status!=2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CATEGORYANDLOCATION =
		new FinderPath(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsModelImpl.FINDER_CACHE_ENABLED,
			BuySellProductsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCATEGORYANDLOCATION",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORYANDLOCATION =
		new FinderPath(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsModelImpl.FINDER_CACHE_ENABLED,
			BuySellProductsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCATEGORYANDLOCATION",
			new String[] { Long.class.getName(), Long.class.getName() },
			BuySellProductsModelImpl.LOCATION_COLUMN_BITMASK |
			BuySellProductsModelImpl.CATEGORY_ID_COLUMN_BITMASK |
			BuySellProductsModelImpl.CREATED_DATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CATEGORYANDLOCATION = new FinderPath(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCATEGORYANDLOCATION",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the buy sell productses where location = &#63; and category_id = &#63;.
	 *
	 * @param location the location
	 * @param category_id the category_id
	 * @return the matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findByCATEGORYANDLOCATION(long location,
		long category_id) {
		return findByCATEGORYANDLOCATION(location, category_id,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the buy sell productses where location = &#63; and category_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param location the location
	 * @param category_id the category_id
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @return the range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findByCATEGORYANDLOCATION(long location,
		long category_id, int start, int end) {
		return findByCATEGORYANDLOCATION(location, category_id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the buy sell productses where location = &#63; and category_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param location the location
	 * @param category_id the category_id
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findByCATEGORYANDLOCATION(long location,
		long category_id, int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return findByCATEGORYANDLOCATION(location, category_id, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the buy sell productses where location = &#63; and category_id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param location the location
	 * @param category_id the category_id
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findByCATEGORYANDLOCATION(long location,
		long category_id, int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORYANDLOCATION;
			finderArgs = new Object[] { location, category_id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CATEGORYANDLOCATION;
			finderArgs = new Object[] {
					location, category_id,
					
					start, end, orderByComparator
				};
		}

		List<BuySellProducts> list = null;

		if (retrieveFromCache) {
			list = (List<BuySellProducts>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (BuySellProducts buySellProducts : list) {
					if ((location != buySellProducts.getLocation()) ||
							(category_id != buySellProducts.getCategory_id())) {
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

			query.append(_SQL_SELECT_BUYSELLPRODUCTS_WHERE);

			query.append(_FINDER_COLUMN_CATEGORYANDLOCATION_LOCATION_2);

			query.append(_FINDER_COLUMN_CATEGORYANDLOCATION_CATEGORY_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BuySellProductsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(location);

				qPos.add(category_id);

				if (!pagination) {
					list = (List<BuySellProducts>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<BuySellProducts>)QueryUtil.list(q,
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
	 * Returns the first buy sell products in the ordered set where location = &#63; and category_id = &#63;.
	 *
	 * @param location the location
	 * @param category_id the category_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching buy sell products
	 * @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts findByCATEGORYANDLOCATION_First(long location,
		long category_id, OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = fetchByCATEGORYANDLOCATION_First(location,
				category_id, orderByComparator);

		if (buySellProducts != null) {
			return buySellProducts;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("location=");
		msg.append(location);

		msg.append(", category_id=");
		msg.append(category_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBuySellProductsException(msg.toString());
	}

	/**
	 * Returns the first buy sell products in the ordered set where location = &#63; and category_id = &#63;.
	 *
	 * @param location the location
	 * @param category_id the category_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts fetchByCATEGORYANDLOCATION_First(long location,
		long category_id, OrderByComparator<BuySellProducts> orderByComparator) {
		List<BuySellProducts> list = findByCATEGORYANDLOCATION(location,
				category_id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last buy sell products in the ordered set where location = &#63; and category_id = &#63;.
	 *
	 * @param location the location
	 * @param category_id the category_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching buy sell products
	 * @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts findByCATEGORYANDLOCATION_Last(long location,
		long category_id, OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = fetchByCATEGORYANDLOCATION_Last(location,
				category_id, orderByComparator);

		if (buySellProducts != null) {
			return buySellProducts;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("location=");
		msg.append(location);

		msg.append(", category_id=");
		msg.append(category_id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBuySellProductsException(msg.toString());
	}

	/**
	 * Returns the last buy sell products in the ordered set where location = &#63; and category_id = &#63;.
	 *
	 * @param location the location
	 * @param category_id the category_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts fetchByCATEGORYANDLOCATION_Last(long location,
		long category_id, OrderByComparator<BuySellProducts> orderByComparator) {
		int count = countByCATEGORYANDLOCATION(location, category_id);

		if (count == 0) {
			return null;
		}

		List<BuySellProducts> list = findByCATEGORYANDLOCATION(location,
				category_id, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the buy sell productses before and after the current buy sell products in the ordered set where location = &#63; and category_id = &#63;.
	 *
	 * @param id the primary key of the current buy sell products
	 * @param location the location
	 * @param category_id the category_id
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next buy sell products
	 * @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	 */
	@Override
	public BuySellProducts[] findByCATEGORYANDLOCATION_PrevAndNext(long id,
		long location, long category_id,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			BuySellProducts[] array = new BuySellProductsImpl[3];

			array[0] = getByCATEGORYANDLOCATION_PrevAndNext(session,
					buySellProducts, location, category_id, orderByComparator,
					true);

			array[1] = buySellProducts;

			array[2] = getByCATEGORYANDLOCATION_PrevAndNext(session,
					buySellProducts, location, category_id, orderByComparator,
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

	protected BuySellProducts getByCATEGORYANDLOCATION_PrevAndNext(
		Session session, BuySellProducts buySellProducts, long location,
		long category_id, OrderByComparator<BuySellProducts> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_BUYSELLPRODUCTS_WHERE);

		query.append(_FINDER_COLUMN_CATEGORYANDLOCATION_LOCATION_2);

		query.append(_FINDER_COLUMN_CATEGORYANDLOCATION_CATEGORY_ID_2);

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
			query.append(BuySellProductsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(location);

		qPos.add(category_id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(buySellProducts);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BuySellProducts> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the buy sell productses where location = &#63; and category_id = &#63; from the database.
	 *
	 * @param location the location
	 * @param category_id the category_id
	 */
	@Override
	public void removeByCATEGORYANDLOCATION(long location, long category_id) {
		for (BuySellProducts buySellProducts : findByCATEGORYANDLOCATION(
				location, category_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(buySellProducts);
		}
	}

	/**
	 * Returns the number of buy sell productses where location = &#63; and category_id = &#63;.
	 *
	 * @param location the location
	 * @param category_id the category_id
	 * @return the number of matching buy sell productses
	 */
	@Override
	public int countByCATEGORYANDLOCATION(long location, long category_id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CATEGORYANDLOCATION;

		Object[] finderArgs = new Object[] { location, category_id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_BUYSELLPRODUCTS_WHERE);

			query.append(_FINDER_COLUMN_CATEGORYANDLOCATION_LOCATION_2);

			query.append(_FINDER_COLUMN_CATEGORYANDLOCATION_CATEGORY_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(location);

				qPos.add(category_id);

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

	private static final String _FINDER_COLUMN_CATEGORYANDLOCATION_LOCATION_2 = "buySellProducts.location = ? AND ";
	private static final String _FINDER_COLUMN_CATEGORYANDLOCATION_CATEGORY_ID_2 =
		"buySellProducts.category_id = ? AND buySellProducts.status!=2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TITLEBASEDSEARCH =
		new FinderPath(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsModelImpl.FINDER_CACHE_ENABLED,
			BuySellProductsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByTITLEBASEDSEARCH",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_TITLEBASEDSEARCH =
		new FinderPath(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByTITLEBASEDSEARCH",
			new String[] { String.class.getName() });

	/**
	 * Returns all the buy sell productses where title LIKE &#63;.
	 *
	 * @param title the title
	 * @return the matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findByTITLEBASEDSEARCH(String title) {
		return findByTITLEBASEDSEARCH(title, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the buy sell productses where title LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param title the title
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @return the range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findByTITLEBASEDSEARCH(String title,
		int start, int end) {
		return findByTITLEBASEDSEARCH(title, start, end, null);
	}

	/**
	 * Returns an ordered range of all the buy sell productses where title LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param title the title
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findByTITLEBASEDSEARCH(String title,
		int start, int end, OrderByComparator<BuySellProducts> orderByComparator) {
		return findByTITLEBASEDSEARCH(title, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the buy sell productses where title LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param title the title
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findByTITLEBASEDSEARCH(String title,
		int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TITLEBASEDSEARCH;
		finderArgs = new Object[] { title, start, end, orderByComparator };

		List<BuySellProducts> list = null;

		if (retrieveFromCache) {
			list = (List<BuySellProducts>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (BuySellProducts buySellProducts : list) {
					if (!StringUtil.wildcardMatches(
								buySellProducts.getTitle(), title,
								CharPool.UNDERLINE, CharPool.PERCENT,
								CharPool.BACK_SLASH, true)) {
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

			query.append(_SQL_SELECT_BUYSELLPRODUCTS_WHERE);

			boolean bindTitle = false;

			if (title == null) {
				query.append(_FINDER_COLUMN_TITLEBASEDSEARCH_TITLE_1);
			}
			else if (title.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TITLEBASEDSEARCH_TITLE_3);
			}
			else {
				bindTitle = true;

				query.append(_FINDER_COLUMN_TITLEBASEDSEARCH_TITLE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BuySellProductsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTitle) {
					qPos.add(title);
				}

				if (!pagination) {
					list = (List<BuySellProducts>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<BuySellProducts>)QueryUtil.list(q,
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
	 * Returns the first buy sell products in the ordered set where title LIKE &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching buy sell products
	 * @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts findByTITLEBASEDSEARCH_First(String title,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = fetchByTITLEBASEDSEARCH_First(title,
				orderByComparator);

		if (buySellProducts != null) {
			return buySellProducts;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("title=");
		msg.append(title);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBuySellProductsException(msg.toString());
	}

	/**
	 * Returns the first buy sell products in the ordered set where title LIKE &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts fetchByTITLEBASEDSEARCH_First(String title,
		OrderByComparator<BuySellProducts> orderByComparator) {
		List<BuySellProducts> list = findByTITLEBASEDSEARCH(title, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last buy sell products in the ordered set where title LIKE &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching buy sell products
	 * @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts findByTITLEBASEDSEARCH_Last(String title,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = fetchByTITLEBASEDSEARCH_Last(title,
				orderByComparator);

		if (buySellProducts != null) {
			return buySellProducts;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("title=");
		msg.append(title);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBuySellProductsException(msg.toString());
	}

	/**
	 * Returns the last buy sell products in the ordered set where title LIKE &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts fetchByTITLEBASEDSEARCH_Last(String title,
		OrderByComparator<BuySellProducts> orderByComparator) {
		int count = countByTITLEBASEDSEARCH(title);

		if (count == 0) {
			return null;
		}

		List<BuySellProducts> list = findByTITLEBASEDSEARCH(title, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the buy sell productses before and after the current buy sell products in the ordered set where title LIKE &#63;.
	 *
	 * @param id the primary key of the current buy sell products
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next buy sell products
	 * @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	 */
	@Override
	public BuySellProducts[] findByTITLEBASEDSEARCH_PrevAndNext(long id,
		String title, OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			BuySellProducts[] array = new BuySellProductsImpl[3];

			array[0] = getByTITLEBASEDSEARCH_PrevAndNext(session,
					buySellProducts, title, orderByComparator, true);

			array[1] = buySellProducts;

			array[2] = getByTITLEBASEDSEARCH_PrevAndNext(session,
					buySellProducts, title, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected BuySellProducts getByTITLEBASEDSEARCH_PrevAndNext(
		Session session, BuySellProducts buySellProducts, String title,
		OrderByComparator<BuySellProducts> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BUYSELLPRODUCTS_WHERE);

		boolean bindTitle = false;

		if (title == null) {
			query.append(_FINDER_COLUMN_TITLEBASEDSEARCH_TITLE_1);
		}
		else if (title.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TITLEBASEDSEARCH_TITLE_3);
		}
		else {
			bindTitle = true;

			query.append(_FINDER_COLUMN_TITLEBASEDSEARCH_TITLE_2);
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
			query.append(BuySellProductsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTitle) {
			qPos.add(title);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(buySellProducts);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BuySellProducts> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the buy sell productses where title LIKE &#63; from the database.
	 *
	 * @param title the title
	 */
	@Override
	public void removeByTITLEBASEDSEARCH(String title) {
		for (BuySellProducts buySellProducts : findByTITLEBASEDSEARCH(title,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(buySellProducts);
		}
	}

	/**
	 * Returns the number of buy sell productses where title LIKE &#63;.
	 *
	 * @param title the title
	 * @return the number of matching buy sell productses
	 */
	@Override
	public int countByTITLEBASEDSEARCH(String title) {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_TITLEBASEDSEARCH;

		Object[] finderArgs = new Object[] { title };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BUYSELLPRODUCTS_WHERE);

			boolean bindTitle = false;

			if (title == null) {
				query.append(_FINDER_COLUMN_TITLEBASEDSEARCH_TITLE_1);
			}
			else if (title.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TITLEBASEDSEARCH_TITLE_3);
			}
			else {
				bindTitle = true;

				query.append(_FINDER_COLUMN_TITLEBASEDSEARCH_TITLE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTitle) {
					qPos.add(title);
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

	private static final String _FINDER_COLUMN_TITLEBASEDSEARCH_TITLE_1 = "buySellProducts.title IS NULL AND buySellProducts.status!=2";
	private static final String _FINDER_COLUMN_TITLEBASEDSEARCH_TITLE_2 = "buySellProducts.title LIKE ? AND buySellProducts.status!=2";
	private static final String _FINDER_COLUMN_TITLEBASEDSEARCH_TITLE_3 = "(buySellProducts.title IS NULL OR buySellProducts.title LIKE '') AND buySellProducts.status!=2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CATEGORYANDSEARCH =
		new FinderPath(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsModelImpl.FINDER_CACHE_ENABLED,
			BuySellProductsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBycategoryAndSearch",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_CATEGORYANDSEARCH =
		new FinderPath(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countBycategoryAndSearch",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the buy sell productses where category_id = &#63; and title LIKE &#63;.
	 *
	 * @param category_id the category_id
	 * @param title the title
	 * @return the matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findBycategoryAndSearch(long category_id,
		String title) {
		return findBycategoryAndSearch(category_id, title, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the buy sell productses where category_id = &#63; and title LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param category_id the category_id
	 * @param title the title
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @return the range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findBycategoryAndSearch(long category_id,
		String title, int start, int end) {
		return findBycategoryAndSearch(category_id, title, start, end, null);
	}

	/**
	 * Returns an ordered range of all the buy sell productses where category_id = &#63; and title LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param category_id the category_id
	 * @param title the title
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findBycategoryAndSearch(long category_id,
		String title, int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return findBycategoryAndSearch(category_id, title, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the buy sell productses where category_id = &#63; and title LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param category_id the category_id
	 * @param title the title
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findBycategoryAndSearch(long category_id,
		String title, int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CATEGORYANDSEARCH;
		finderArgs = new Object[] {
				category_id, title,
				
				start, end, orderByComparator
			};

		List<BuySellProducts> list = null;

		if (retrieveFromCache) {
			list = (List<BuySellProducts>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (BuySellProducts buySellProducts : list) {
					if ((category_id != buySellProducts.getCategory_id()) ||
							!StringUtil.wildcardMatches(
								buySellProducts.getTitle(), title,
								CharPool.UNDERLINE, CharPool.PERCENT,
								CharPool.BACK_SLASH, true)) {
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

			query.append(_SQL_SELECT_BUYSELLPRODUCTS_WHERE);

			query.append(_FINDER_COLUMN_CATEGORYANDSEARCH_CATEGORY_ID_2);

			boolean bindTitle = false;

			if (title == null) {
				query.append(_FINDER_COLUMN_CATEGORYANDSEARCH_TITLE_1);
			}
			else if (title.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CATEGORYANDSEARCH_TITLE_3);
			}
			else {
				bindTitle = true;

				query.append(_FINDER_COLUMN_CATEGORYANDSEARCH_TITLE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BuySellProductsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(category_id);

				if (bindTitle) {
					qPos.add(title);
				}

				if (!pagination) {
					list = (List<BuySellProducts>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<BuySellProducts>)QueryUtil.list(q,
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
	 * Returns the first buy sell products in the ordered set where category_id = &#63; and title LIKE &#63;.
	 *
	 * @param category_id the category_id
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching buy sell products
	 * @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts findBycategoryAndSearch_First(long category_id,
		String title, OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = fetchBycategoryAndSearch_First(category_id,
				title, orderByComparator);

		if (buySellProducts != null) {
			return buySellProducts;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("category_id=");
		msg.append(category_id);

		msg.append(", title=");
		msg.append(title);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBuySellProductsException(msg.toString());
	}

	/**
	 * Returns the first buy sell products in the ordered set where category_id = &#63; and title LIKE &#63;.
	 *
	 * @param category_id the category_id
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts fetchBycategoryAndSearch_First(long category_id,
		String title, OrderByComparator<BuySellProducts> orderByComparator) {
		List<BuySellProducts> list = findBycategoryAndSearch(category_id,
				title, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last buy sell products in the ordered set where category_id = &#63; and title LIKE &#63;.
	 *
	 * @param category_id the category_id
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching buy sell products
	 * @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts findBycategoryAndSearch_Last(long category_id,
		String title, OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = fetchBycategoryAndSearch_Last(category_id,
				title, orderByComparator);

		if (buySellProducts != null) {
			return buySellProducts;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("category_id=");
		msg.append(category_id);

		msg.append(", title=");
		msg.append(title);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBuySellProductsException(msg.toString());
	}

	/**
	 * Returns the last buy sell products in the ordered set where category_id = &#63; and title LIKE &#63;.
	 *
	 * @param category_id the category_id
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts fetchBycategoryAndSearch_Last(long category_id,
		String title, OrderByComparator<BuySellProducts> orderByComparator) {
		int count = countBycategoryAndSearch(category_id, title);

		if (count == 0) {
			return null;
		}

		List<BuySellProducts> list = findBycategoryAndSearch(category_id,
				title, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the buy sell productses before and after the current buy sell products in the ordered set where category_id = &#63; and title LIKE &#63;.
	 *
	 * @param id the primary key of the current buy sell products
	 * @param category_id the category_id
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next buy sell products
	 * @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	 */
	@Override
	public BuySellProducts[] findBycategoryAndSearch_PrevAndNext(long id,
		long category_id, String title,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			BuySellProducts[] array = new BuySellProductsImpl[3];

			array[0] = getBycategoryAndSearch_PrevAndNext(session,
					buySellProducts, category_id, title, orderByComparator, true);

			array[1] = buySellProducts;

			array[2] = getBycategoryAndSearch_PrevAndNext(session,
					buySellProducts, category_id, title, orderByComparator,
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

	protected BuySellProducts getBycategoryAndSearch_PrevAndNext(
		Session session, BuySellProducts buySellProducts, long category_id,
		String title, OrderByComparator<BuySellProducts> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_BUYSELLPRODUCTS_WHERE);

		query.append(_FINDER_COLUMN_CATEGORYANDSEARCH_CATEGORY_ID_2);

		boolean bindTitle = false;

		if (title == null) {
			query.append(_FINDER_COLUMN_CATEGORYANDSEARCH_TITLE_1);
		}
		else if (title.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CATEGORYANDSEARCH_TITLE_3);
		}
		else {
			bindTitle = true;

			query.append(_FINDER_COLUMN_CATEGORYANDSEARCH_TITLE_2);
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
			query.append(BuySellProductsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(category_id);

		if (bindTitle) {
			qPos.add(title);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(buySellProducts);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BuySellProducts> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the buy sell productses where category_id = &#63; and title LIKE &#63; from the database.
	 *
	 * @param category_id the category_id
	 * @param title the title
	 */
	@Override
	public void removeBycategoryAndSearch(long category_id, String title) {
		for (BuySellProducts buySellProducts : findBycategoryAndSearch(
				category_id, title, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(buySellProducts);
		}
	}

	/**
	 * Returns the number of buy sell productses where category_id = &#63; and title LIKE &#63;.
	 *
	 * @param category_id the category_id
	 * @param title the title
	 * @return the number of matching buy sell productses
	 */
	@Override
	public int countBycategoryAndSearch(long category_id, String title) {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_CATEGORYANDSEARCH;

		Object[] finderArgs = new Object[] { category_id, title };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_BUYSELLPRODUCTS_WHERE);

			query.append(_FINDER_COLUMN_CATEGORYANDSEARCH_CATEGORY_ID_2);

			boolean bindTitle = false;

			if (title == null) {
				query.append(_FINDER_COLUMN_CATEGORYANDSEARCH_TITLE_1);
			}
			else if (title.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CATEGORYANDSEARCH_TITLE_3);
			}
			else {
				bindTitle = true;

				query.append(_FINDER_COLUMN_CATEGORYANDSEARCH_TITLE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(category_id);

				if (bindTitle) {
					qPos.add(title);
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

	private static final String _FINDER_COLUMN_CATEGORYANDSEARCH_CATEGORY_ID_2 = "buySellProducts.category_id = ? AND ";
	private static final String _FINDER_COLUMN_CATEGORYANDSEARCH_TITLE_1 = "buySellProducts.title IS NULL AND buySellProducts.status!=2";
	private static final String _FINDER_COLUMN_CATEGORYANDSEARCH_TITLE_2 = "buySellProducts.title LIKE ? AND buySellProducts.status!=2";
	private static final String _FINDER_COLUMN_CATEGORYANDSEARCH_TITLE_3 = "(buySellProducts.title IS NULL OR buySellProducts.title LIKE '') AND buySellProducts.status!=2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCATIONANDSEARCH =
		new FinderPath(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsModelImpl.FINDER_CACHE_ENABLED,
			BuySellProductsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBylocationAndSearch",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_LOCATIONANDSEARCH =
		new FinderPath(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countBylocationAndSearch",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the buy sell productses where location = &#63; and title LIKE &#63;.
	 *
	 * @param location the location
	 * @param title the title
	 * @return the matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findBylocationAndSearch(long location,
		String title) {
		return findBylocationAndSearch(location, title, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the buy sell productses where location = &#63; and title LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param location the location
	 * @param title the title
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @return the range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findBylocationAndSearch(long location,
		String title, int start, int end) {
		return findBylocationAndSearch(location, title, start, end, null);
	}

	/**
	 * Returns an ordered range of all the buy sell productses where location = &#63; and title LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param location the location
	 * @param title the title
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findBylocationAndSearch(long location,
		String title, int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return findBylocationAndSearch(location, title, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the buy sell productses where location = &#63; and title LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param location the location
	 * @param title the title
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findBylocationAndSearch(long location,
		String title, int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_LOCATIONANDSEARCH;
		finderArgs = new Object[] { location, title, start, end, orderByComparator };

		List<BuySellProducts> list = null;

		if (retrieveFromCache) {
			list = (List<BuySellProducts>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (BuySellProducts buySellProducts : list) {
					if ((location != buySellProducts.getLocation()) ||
							!StringUtil.wildcardMatches(
								buySellProducts.getTitle(), title,
								CharPool.UNDERLINE, CharPool.PERCENT,
								CharPool.BACK_SLASH, true)) {
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

			query.append(_SQL_SELECT_BUYSELLPRODUCTS_WHERE);

			query.append(_FINDER_COLUMN_LOCATIONANDSEARCH_LOCATION_2);

			boolean bindTitle = false;

			if (title == null) {
				query.append(_FINDER_COLUMN_LOCATIONANDSEARCH_TITLE_1);
			}
			else if (title.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOCATIONANDSEARCH_TITLE_3);
			}
			else {
				bindTitle = true;

				query.append(_FINDER_COLUMN_LOCATIONANDSEARCH_TITLE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BuySellProductsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(location);

				if (bindTitle) {
					qPos.add(title);
				}

				if (!pagination) {
					list = (List<BuySellProducts>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<BuySellProducts>)QueryUtil.list(q,
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
	 * Returns the first buy sell products in the ordered set where location = &#63; and title LIKE &#63;.
	 *
	 * @param location the location
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching buy sell products
	 * @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts findBylocationAndSearch_First(long location,
		String title, OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = fetchBylocationAndSearch_First(location,
				title, orderByComparator);

		if (buySellProducts != null) {
			return buySellProducts;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("location=");
		msg.append(location);

		msg.append(", title=");
		msg.append(title);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBuySellProductsException(msg.toString());
	}

	/**
	 * Returns the first buy sell products in the ordered set where location = &#63; and title LIKE &#63;.
	 *
	 * @param location the location
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts fetchBylocationAndSearch_First(long location,
		String title, OrderByComparator<BuySellProducts> orderByComparator) {
		List<BuySellProducts> list = findBylocationAndSearch(location, title,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last buy sell products in the ordered set where location = &#63; and title LIKE &#63;.
	 *
	 * @param location the location
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching buy sell products
	 * @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts findBylocationAndSearch_Last(long location,
		String title, OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = fetchBylocationAndSearch_Last(location,
				title, orderByComparator);

		if (buySellProducts != null) {
			return buySellProducts;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("location=");
		msg.append(location);

		msg.append(", title=");
		msg.append(title);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBuySellProductsException(msg.toString());
	}

	/**
	 * Returns the last buy sell products in the ordered set where location = &#63; and title LIKE &#63;.
	 *
	 * @param location the location
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts fetchBylocationAndSearch_Last(long location,
		String title, OrderByComparator<BuySellProducts> orderByComparator) {
		int count = countBylocationAndSearch(location, title);

		if (count == 0) {
			return null;
		}

		List<BuySellProducts> list = findBylocationAndSearch(location, title,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the buy sell productses before and after the current buy sell products in the ordered set where location = &#63; and title LIKE &#63;.
	 *
	 * @param id the primary key of the current buy sell products
	 * @param location the location
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next buy sell products
	 * @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	 */
	@Override
	public BuySellProducts[] findBylocationAndSearch_PrevAndNext(long id,
		long location, String title,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			BuySellProducts[] array = new BuySellProductsImpl[3];

			array[0] = getBylocationAndSearch_PrevAndNext(session,
					buySellProducts, location, title, orderByComparator, true);

			array[1] = buySellProducts;

			array[2] = getBylocationAndSearch_PrevAndNext(session,
					buySellProducts, location, title, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected BuySellProducts getBylocationAndSearch_PrevAndNext(
		Session session, BuySellProducts buySellProducts, long location,
		String title, OrderByComparator<BuySellProducts> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_BUYSELLPRODUCTS_WHERE);

		query.append(_FINDER_COLUMN_LOCATIONANDSEARCH_LOCATION_2);

		boolean bindTitle = false;

		if (title == null) {
			query.append(_FINDER_COLUMN_LOCATIONANDSEARCH_TITLE_1);
		}
		else if (title.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_LOCATIONANDSEARCH_TITLE_3);
		}
		else {
			bindTitle = true;

			query.append(_FINDER_COLUMN_LOCATIONANDSEARCH_TITLE_2);
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
			query.append(BuySellProductsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(location);

		if (bindTitle) {
			qPos.add(title);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(buySellProducts);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BuySellProducts> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the buy sell productses where location = &#63; and title LIKE &#63; from the database.
	 *
	 * @param location the location
	 * @param title the title
	 */
	@Override
	public void removeBylocationAndSearch(long location, String title) {
		for (BuySellProducts buySellProducts : findBylocationAndSearch(
				location, title, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(buySellProducts);
		}
	}

	/**
	 * Returns the number of buy sell productses where location = &#63; and title LIKE &#63;.
	 *
	 * @param location the location
	 * @param title the title
	 * @return the number of matching buy sell productses
	 */
	@Override
	public int countBylocationAndSearch(long location, String title) {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_LOCATIONANDSEARCH;

		Object[] finderArgs = new Object[] { location, title };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_BUYSELLPRODUCTS_WHERE);

			query.append(_FINDER_COLUMN_LOCATIONANDSEARCH_LOCATION_2);

			boolean bindTitle = false;

			if (title == null) {
				query.append(_FINDER_COLUMN_LOCATIONANDSEARCH_TITLE_1);
			}
			else if (title.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_LOCATIONANDSEARCH_TITLE_3);
			}
			else {
				bindTitle = true;

				query.append(_FINDER_COLUMN_LOCATIONANDSEARCH_TITLE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(location);

				if (bindTitle) {
					qPos.add(title);
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

	private static final String _FINDER_COLUMN_LOCATIONANDSEARCH_LOCATION_2 = "buySellProducts.location = ? AND ";
	private static final String _FINDER_COLUMN_LOCATIONANDSEARCH_TITLE_1 = "buySellProducts.title IS NULL AND buySellProducts.status!=2";
	private static final String _FINDER_COLUMN_LOCATIONANDSEARCH_TITLE_2 = "buySellProducts.title LIKE ? AND buySellProducts.status!=2";
	private static final String _FINDER_COLUMN_LOCATIONANDSEARCH_TITLE_3 = "(buySellProducts.title IS NULL OR buySellProducts.title LIKE '') AND buySellProducts.status!=2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CATEGORYLOCATIONANDSEARCH =
		new FinderPath(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsModelImpl.FINDER_CACHE_ENABLED,
			BuySellProductsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBycategoryLocationAndSearch",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_CATEGORYLOCATIONANDSEARCH =
		new FinderPath(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"countBycategoryLocationAndSearch",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the buy sell productses where category_id = &#63; and location = &#63; and title LIKE &#63;.
	 *
	 * @param category_id the category_id
	 * @param location the location
	 * @param title the title
	 * @return the matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findBycategoryLocationAndSearch(
		long category_id, long location, String title) {
		return findBycategoryLocationAndSearch(category_id, location, title,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the buy sell productses where category_id = &#63; and location = &#63; and title LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param category_id the category_id
	 * @param location the location
	 * @param title the title
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @return the range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findBycategoryLocationAndSearch(
		long category_id, long location, String title, int start, int end) {
		return findBycategoryLocationAndSearch(category_id, location, title,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the buy sell productses where category_id = &#63; and location = &#63; and title LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param category_id the category_id
	 * @param location the location
	 * @param title the title
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findBycategoryLocationAndSearch(
		long category_id, long location, String title, int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return findBycategoryLocationAndSearch(category_id, location, title,
			start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the buy sell productses where category_id = &#63; and location = &#63; and title LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param category_id the category_id
	 * @param location the location
	 * @param title the title
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching buy sell productses
	 */
	@Override
	public List<BuySellProducts> findBycategoryLocationAndSearch(
		long category_id, long location, String title, int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CATEGORYLOCATIONANDSEARCH;
		finderArgs = new Object[] {
				category_id, location, title,
				
				start, end, orderByComparator
			};

		List<BuySellProducts> list = null;

		if (retrieveFromCache) {
			list = (List<BuySellProducts>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (BuySellProducts buySellProducts : list) {
					if ((category_id != buySellProducts.getCategory_id()) ||
							(location != buySellProducts.getLocation()) ||
							!StringUtil.wildcardMatches(
								buySellProducts.getTitle(), title,
								CharPool.UNDERLINE, CharPool.PERCENT,
								CharPool.BACK_SLASH, true)) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_BUYSELLPRODUCTS_WHERE);

			query.append(_FINDER_COLUMN_CATEGORYLOCATIONANDSEARCH_CATEGORY_ID_2);

			query.append(_FINDER_COLUMN_CATEGORYLOCATIONANDSEARCH_LOCATION_2);

			boolean bindTitle = false;

			if (title == null) {
				query.append(_FINDER_COLUMN_CATEGORYLOCATIONANDSEARCH_TITLE_1);
			}
			else if (title.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CATEGORYLOCATIONANDSEARCH_TITLE_3);
			}
			else {
				bindTitle = true;

				query.append(_FINDER_COLUMN_CATEGORYLOCATIONANDSEARCH_TITLE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BuySellProductsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(category_id);

				qPos.add(location);

				if (bindTitle) {
					qPos.add(title);
				}

				if (!pagination) {
					list = (List<BuySellProducts>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<BuySellProducts>)QueryUtil.list(q,
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
	 * Returns the first buy sell products in the ordered set where category_id = &#63; and location = &#63; and title LIKE &#63;.
	 *
	 * @param category_id the category_id
	 * @param location the location
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching buy sell products
	 * @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts findBycategoryLocationAndSearch_First(
		long category_id, long location, String title,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = fetchBycategoryLocationAndSearch_First(category_id,
				location, title, orderByComparator);

		if (buySellProducts != null) {
			return buySellProducts;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("category_id=");
		msg.append(category_id);

		msg.append(", location=");
		msg.append(location);

		msg.append(", title=");
		msg.append(title);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBuySellProductsException(msg.toString());
	}

	/**
	 * Returns the first buy sell products in the ordered set where category_id = &#63; and location = &#63; and title LIKE &#63;.
	 *
	 * @param category_id the category_id
	 * @param location the location
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts fetchBycategoryLocationAndSearch_First(
		long category_id, long location, String title,
		OrderByComparator<BuySellProducts> orderByComparator) {
		List<BuySellProducts> list = findBycategoryLocationAndSearch(category_id,
				location, title, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last buy sell products in the ordered set where category_id = &#63; and location = &#63; and title LIKE &#63;.
	 *
	 * @param category_id the category_id
	 * @param location the location
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching buy sell products
	 * @throws NoSuchBuySellProductsException if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts findBycategoryLocationAndSearch_Last(
		long category_id, long location, String title,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = fetchBycategoryLocationAndSearch_Last(category_id,
				location, title, orderByComparator);

		if (buySellProducts != null) {
			return buySellProducts;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("category_id=");
		msg.append(category_id);

		msg.append(", location=");
		msg.append(location);

		msg.append(", title=");
		msg.append(title);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBuySellProductsException(msg.toString());
	}

	/**
	 * Returns the last buy sell products in the ordered set where category_id = &#63; and location = &#63; and title LIKE &#63;.
	 *
	 * @param category_id the category_id
	 * @param location the location
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching buy sell products, or <code>null</code> if a matching buy sell products could not be found
	 */
	@Override
	public BuySellProducts fetchBycategoryLocationAndSearch_Last(
		long category_id, long location, String title,
		OrderByComparator<BuySellProducts> orderByComparator) {
		int count = countBycategoryLocationAndSearch(category_id, location,
				title);

		if (count == 0) {
			return null;
		}

		List<BuySellProducts> list = findBycategoryLocationAndSearch(category_id,
				location, title, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the buy sell productses before and after the current buy sell products in the ordered set where category_id = &#63; and location = &#63; and title LIKE &#63;.
	 *
	 * @param id the primary key of the current buy sell products
	 * @param category_id the category_id
	 * @param location the location
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next buy sell products
	 * @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	 */
	@Override
	public BuySellProducts[] findBycategoryLocationAndSearch_PrevAndNext(
		long id, long category_id, long location, String title,
		OrderByComparator<BuySellProducts> orderByComparator)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			BuySellProducts[] array = new BuySellProductsImpl[3];

			array[0] = getBycategoryLocationAndSearch_PrevAndNext(session,
					buySellProducts, category_id, location, title,
					orderByComparator, true);

			array[1] = buySellProducts;

			array[2] = getBycategoryLocationAndSearch_PrevAndNext(session,
					buySellProducts, category_id, location, title,
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

	protected BuySellProducts getBycategoryLocationAndSearch_PrevAndNext(
		Session session, BuySellProducts buySellProducts, long category_id,
		long location, String title,
		OrderByComparator<BuySellProducts> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_BUYSELLPRODUCTS_WHERE);

		query.append(_FINDER_COLUMN_CATEGORYLOCATIONANDSEARCH_CATEGORY_ID_2);

		query.append(_FINDER_COLUMN_CATEGORYLOCATIONANDSEARCH_LOCATION_2);

		boolean bindTitle = false;

		if (title == null) {
			query.append(_FINDER_COLUMN_CATEGORYLOCATIONANDSEARCH_TITLE_1);
		}
		else if (title.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CATEGORYLOCATIONANDSEARCH_TITLE_3);
		}
		else {
			bindTitle = true;

			query.append(_FINDER_COLUMN_CATEGORYLOCATIONANDSEARCH_TITLE_2);
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
			query.append(BuySellProductsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(category_id);

		qPos.add(location);

		if (bindTitle) {
			qPos.add(title);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(buySellProducts);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BuySellProducts> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the buy sell productses where category_id = &#63; and location = &#63; and title LIKE &#63; from the database.
	 *
	 * @param category_id the category_id
	 * @param location the location
	 * @param title the title
	 */
	@Override
	public void removeBycategoryLocationAndSearch(long category_id,
		long location, String title) {
		for (BuySellProducts buySellProducts : findBycategoryLocationAndSearch(
				category_id, location, title, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(buySellProducts);
		}
	}

	/**
	 * Returns the number of buy sell productses where category_id = &#63; and location = &#63; and title LIKE &#63;.
	 *
	 * @param category_id the category_id
	 * @param location the location
	 * @param title the title
	 * @return the number of matching buy sell productses
	 */
	@Override
	public int countBycategoryLocationAndSearch(long category_id,
		long location, String title) {
		FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_CATEGORYLOCATIONANDSEARCH;

		Object[] finderArgs = new Object[] { category_id, location, title };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_BUYSELLPRODUCTS_WHERE);

			query.append(_FINDER_COLUMN_CATEGORYLOCATIONANDSEARCH_CATEGORY_ID_2);

			query.append(_FINDER_COLUMN_CATEGORYLOCATIONANDSEARCH_LOCATION_2);

			boolean bindTitle = false;

			if (title == null) {
				query.append(_FINDER_COLUMN_CATEGORYLOCATIONANDSEARCH_TITLE_1);
			}
			else if (title.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CATEGORYLOCATIONANDSEARCH_TITLE_3);
			}
			else {
				bindTitle = true;

				query.append(_FINDER_COLUMN_CATEGORYLOCATIONANDSEARCH_TITLE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(category_id);

				qPos.add(location);

				if (bindTitle) {
					qPos.add(title);
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

	private static final String _FINDER_COLUMN_CATEGORYLOCATIONANDSEARCH_CATEGORY_ID_2 =
		"buySellProducts.category_id = ? AND ";
	private static final String _FINDER_COLUMN_CATEGORYLOCATIONANDSEARCH_LOCATION_2 =
		"buySellProducts.location = ? AND ";
	private static final String _FINDER_COLUMN_CATEGORYLOCATIONANDSEARCH_TITLE_1 =
		"buySellProducts.title IS NULL AND buySellProducts.status!=2";
	private static final String _FINDER_COLUMN_CATEGORYLOCATIONANDSEARCH_TITLE_2 =
		"buySellProducts.title LIKE ? AND buySellProducts.status!=2";
	private static final String _FINDER_COLUMN_CATEGORYLOCATIONANDSEARCH_TITLE_3 =
		"(buySellProducts.title IS NULL OR buySellProducts.title LIKE '') AND buySellProducts.status!=2";

	public BuySellProductsPersistenceImpl() {
		setModelClass(BuySellProducts.class);
	}

	/**
	 * Caches the buy sell products in the entity cache if it is enabled.
	 *
	 * @param buySellProducts the buy sell products
	 */
	@Override
	public void cacheResult(BuySellProducts buySellProducts) {
		entityCache.putResult(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsImpl.class, buySellProducts.getPrimaryKey(),
			buySellProducts);

		buySellProducts.resetOriginalValues();
	}

	/**
	 * Caches the buy sell productses in the entity cache if it is enabled.
	 *
	 * @param buySellProductses the buy sell productses
	 */
	@Override
	public void cacheResult(List<BuySellProducts> buySellProductses) {
		for (BuySellProducts buySellProducts : buySellProductses) {
			if (entityCache.getResult(
						BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
						BuySellProductsImpl.class,
						buySellProducts.getPrimaryKey()) == null) {
				cacheResult(buySellProducts);
			}
			else {
				buySellProducts.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all buy sell productses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(BuySellProductsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the buy sell products.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BuySellProducts buySellProducts) {
		entityCache.removeResult(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsImpl.class, buySellProducts.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<BuySellProducts> buySellProductses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BuySellProducts buySellProducts : buySellProductses) {
			entityCache.removeResult(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
				BuySellProductsImpl.class, buySellProducts.getPrimaryKey());
		}
	}

	/**
	 * Creates a new buy sell products with the primary key. Does not add the buy sell products to the database.
	 *
	 * @param id the primary key for the new buy sell products
	 * @return the new buy sell products
	 */
	@Override
	public BuySellProducts create(long id) {
		BuySellProducts buySellProducts = new BuySellProductsImpl();

		buySellProducts.setNew(true);
		buySellProducts.setPrimaryKey(id);

		return buySellProducts;
	}

	/**
	 * Removes the buy sell products with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the buy sell products
	 * @return the buy sell products that was removed
	 * @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	 */
	@Override
	public BuySellProducts remove(long id)
		throws NoSuchBuySellProductsException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the buy sell products with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the buy sell products
	 * @return the buy sell products that was removed
	 * @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	 */
	@Override
	public BuySellProducts remove(Serializable primaryKey)
		throws NoSuchBuySellProductsException {
		Session session = null;

		try {
			session = openSession();

			BuySellProducts buySellProducts = (BuySellProducts)session.get(BuySellProductsImpl.class,
					primaryKey);

			if (buySellProducts == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBuySellProductsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(buySellProducts);
		}
		catch (NoSuchBuySellProductsException nsee) {
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
	protected BuySellProducts removeImpl(BuySellProducts buySellProducts) {
		buySellProducts = toUnwrappedModel(buySellProducts);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(buySellProducts)) {
				buySellProducts = (BuySellProducts)session.get(BuySellProductsImpl.class,
						buySellProducts.getPrimaryKeyObj());
			}

			if (buySellProducts != null) {
				session.delete(buySellProducts);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (buySellProducts != null) {
			clearCache(buySellProducts);
		}

		return buySellProducts;
	}

	@Override
	public BuySellProducts updateImpl(BuySellProducts buySellProducts) {
		buySellProducts = toUnwrappedModel(buySellProducts);

		boolean isNew = buySellProducts.isNew();

		BuySellProductsModelImpl buySellProductsModelImpl = (BuySellProductsModelImpl)buySellProducts;

		Session session = null;

		try {
			session = openSession();

			if (buySellProducts.isNew()) {
				session.save(buySellProducts);

				buySellProducts.setNew(false);
			}
			else {
				buySellProducts = (BuySellProducts)session.merge(buySellProducts);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !BuySellProductsModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((buySellProductsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						buySellProductsModelImpl.getOriginalCategory_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CATEGORY, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORY,
					args);

				args = new Object[] { buySellProductsModelImpl.getCategory_id() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CATEGORY, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORY,
					args);
			}

			if ((buySellProductsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						buySellProductsModelImpl.getOriginalLocation()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOCATION, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATION,
					args);

				args = new Object[] { buySellProductsModelImpl.getLocation() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_LOCATION, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_LOCATION,
					args);
			}

			if ((buySellProductsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORYANDLOCATION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						buySellProductsModelImpl.getOriginalLocation(),
						buySellProductsModelImpl.getOriginalCategory_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CATEGORYANDLOCATION,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORYANDLOCATION,
					args);

				args = new Object[] {
						buySellProductsModelImpl.getLocation(),
						buySellProductsModelImpl.getCategory_id()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CATEGORYANDLOCATION,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORYANDLOCATION,
					args);
			}
		}

		entityCache.putResult(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
			BuySellProductsImpl.class, buySellProducts.getPrimaryKey(),
			buySellProducts, false);

		buySellProducts.resetOriginalValues();

		return buySellProducts;
	}

	protected BuySellProducts toUnwrappedModel(BuySellProducts buySellProducts) {
		if (buySellProducts instanceof BuySellProductsImpl) {
			return buySellProducts;
		}

		BuySellProductsImpl buySellProductsImpl = new BuySellProductsImpl();

		buySellProductsImpl.setNew(buySellProducts.isNew());
		buySellProductsImpl.setPrimaryKey(buySellProducts.getPrimaryKey());

		buySellProductsImpl.setId(buySellProducts.getId());
		buySellProductsImpl.setSellerName(buySellProducts.getSellerName());
		buySellProductsImpl.setContactNumber(buySellProducts.getContactNumber());
		buySellProductsImpl.setContent_id(buySellProducts.getContent_id());
		buySellProductsImpl.setCategory_id(buySellProducts.getCategory_id());
		buySellProductsImpl.setTitle(buySellProducts.getTitle());
		buySellProductsImpl.setDescription(buySellProducts.getDescription());
		buySellProductsImpl.setAskingPrice(buySellProducts.getAskingPrice());
		buySellProductsImpl.setUserScreenName(buySellProducts.getUserScreenName());
		buySellProductsImpl.setLocation(buySellProducts.getLocation());
		buySellProductsImpl.setStatus(buySellProducts.getStatus());
		buySellProductsImpl.setApprovedstatus(buySellProducts.getApprovedstatus());
		buySellProductsImpl.setCreated_date(buySellProducts.getCreated_date());

		return buySellProductsImpl;
	}

	/**
	 * Returns the buy sell products with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the buy sell products
	 * @return the buy sell products
	 * @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	 */
	@Override
	public BuySellProducts findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBuySellProductsException {
		BuySellProducts buySellProducts = fetchByPrimaryKey(primaryKey);

		if (buySellProducts == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBuySellProductsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return buySellProducts;
	}

	/**
	 * Returns the buy sell products with the primary key or throws a {@link NoSuchBuySellProductsException} if it could not be found.
	 *
	 * @param id the primary key of the buy sell products
	 * @return the buy sell products
	 * @throws NoSuchBuySellProductsException if a buy sell products with the primary key could not be found
	 */
	@Override
	public BuySellProducts findByPrimaryKey(long id)
		throws NoSuchBuySellProductsException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the buy sell products with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the buy sell products
	 * @return the buy sell products, or <code>null</code> if a buy sell products with the primary key could not be found
	 */
	@Override
	public BuySellProducts fetchByPrimaryKey(Serializable primaryKey) {
		BuySellProducts buySellProducts = (BuySellProducts)entityCache.getResult(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
				BuySellProductsImpl.class, primaryKey);

		if (buySellProducts == _nullBuySellProducts) {
			return null;
		}

		if (buySellProducts == null) {
			Session session = null;

			try {
				session = openSession();

				buySellProducts = (BuySellProducts)session.get(BuySellProductsImpl.class,
						primaryKey);

				if (buySellProducts != null) {
					cacheResult(buySellProducts);
				}
				else {
					entityCache.putResult(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
						BuySellProductsImpl.class, primaryKey,
						_nullBuySellProducts);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
					BuySellProductsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return buySellProducts;
	}

	/**
	 * Returns the buy sell products with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the buy sell products
	 * @return the buy sell products, or <code>null</code> if a buy sell products with the primary key could not be found
	 */
	@Override
	public BuySellProducts fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, BuySellProducts> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, BuySellProducts> map = new HashMap<Serializable, BuySellProducts>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			BuySellProducts buySellProducts = fetchByPrimaryKey(primaryKey);

			if (buySellProducts != null) {
				map.put(primaryKey, buySellProducts);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			BuySellProducts buySellProducts = (BuySellProducts)entityCache.getResult(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
					BuySellProductsImpl.class, primaryKey);

			if (buySellProducts == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, buySellProducts);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BUYSELLPRODUCTS_WHERE_PKS_IN);

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

			for (BuySellProducts buySellProducts : (List<BuySellProducts>)q.list()) {
				map.put(buySellProducts.getPrimaryKeyObj(), buySellProducts);

				cacheResult(buySellProducts);

				uncachedPrimaryKeys.remove(buySellProducts.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(BuySellProductsModelImpl.ENTITY_CACHE_ENABLED,
					BuySellProductsImpl.class, primaryKey, _nullBuySellProducts);
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
	 * Returns all the buy sell productses.
	 *
	 * @return the buy sell productses
	 */
	@Override
	public List<BuySellProducts> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the buy sell productses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @return the range of buy sell productses
	 */
	@Override
	public List<BuySellProducts> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the buy sell productses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of buy sell productses
	 */
	@Override
	public List<BuySellProducts> findAll(int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the buy sell productses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellProductsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of buy sell productses
	 * @param end the upper bound of the range of buy sell productses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of buy sell productses
	 */
	@Override
	public List<BuySellProducts> findAll(int start, int end,
		OrderByComparator<BuySellProducts> orderByComparator,
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

		List<BuySellProducts> list = null;

		if (retrieveFromCache) {
			list = (List<BuySellProducts>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BUYSELLPRODUCTS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BUYSELLPRODUCTS;

				if (pagination) {
					sql = sql.concat(BuySellProductsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<BuySellProducts>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<BuySellProducts>)QueryUtil.list(q,
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
	 * Removes all the buy sell productses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (BuySellProducts buySellProducts : findAll()) {
			remove(buySellProducts);
		}
	}

	/**
	 * Returns the number of buy sell productses.
	 *
	 * @return the number of buy sell productses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BUYSELLPRODUCTS);

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
		return BuySellProductsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the buy sell products persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(BuySellProductsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_BUYSELLPRODUCTS = "SELECT buySellProducts FROM BuySellProducts buySellProducts";
	private static final String _SQL_SELECT_BUYSELLPRODUCTS_WHERE_PKS_IN = "SELECT buySellProducts FROM BuySellProducts buySellProducts WHERE id_ IN (";
	private static final String _SQL_SELECT_BUYSELLPRODUCTS_WHERE = "SELECT buySellProducts FROM BuySellProducts buySellProducts WHERE ";
	private static final String _SQL_COUNT_BUYSELLPRODUCTS = "SELECT COUNT(buySellProducts) FROM BuySellProducts buySellProducts";
	private static final String _SQL_COUNT_BUYSELLPRODUCTS_WHERE = "SELECT COUNT(buySellProducts) FROM BuySellProducts buySellProducts WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "buySellProducts.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BuySellProducts exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No BuySellProducts exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(BuySellProductsPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final BuySellProducts _nullBuySellProducts = new BuySellProductsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<BuySellProducts> toCacheModel() {
				return _nullBuySellProductsCacheModel;
			}
		};

	private static final CacheModel<BuySellProducts> _nullBuySellProductsCacheModel =
		new CacheModel<BuySellProducts>() {
			@Override
			public BuySellProducts toEntityModel() {
				return _nullBuySellProducts;
			}
		};
}