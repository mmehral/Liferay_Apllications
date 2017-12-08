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

package com.pratice.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.pratice.exception.NoSuchempException;

import com.pratice.model.emp;
import com.pratice.model.impl.empImpl;
import com.pratice.model.impl.empModelImpl;

import com.pratice.service.persistence.empPersistence;

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
 * The persistence implementation for the emp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see empPersistence
 * @see com.pratice.service.persistence.empUtil
 * @generated
 */
@ProviderType
public class empPersistenceImpl extends BasePersistenceImpl<emp>
	implements empPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link empUtil} to access the emp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = empImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(empModelImpl.ENTITY_CACHE_ENABLED,
			empModelImpl.FINDER_CACHE_ENABLED, empImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(empModelImpl.ENTITY_CACHE_ENABLED,
			empModelImpl.FINDER_CACHE_ENABLED, empImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(empModelImpl.ENTITY_CACHE_ENABLED,
			empModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPNAME = new FinderPath(empModelImpl.ENTITY_CACHE_ENABLED,
			empModelImpl.FINDER_CACHE_ENABLED, empImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEmpName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPNAME =
		new FinderPath(empModelImpl.ENTITY_CACHE_ENABLED,
			empModelImpl.FINDER_CACHE_ENABLED, empImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEmpName",
			new String[] { String.class.getName() },
			empModelImpl.EMPNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EMPNAME = new FinderPath(empModelImpl.ENTITY_CACHE_ENABLED,
			empModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEmpName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the emps where empName = &#63;.
	 *
	 * @param empName the emp name
	 * @return the matching emps
	 */
	@Override
	public List<emp> findByEmpName(String empName) {
		return findByEmpName(empName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the emps where empName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link empModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param empName the emp name
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @return the range of matching emps
	 */
	@Override
	public List<emp> findByEmpName(String empName, int start, int end) {
		return findByEmpName(empName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the emps where empName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link empModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param empName the emp name
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching emps
	 */
	@Override
	public List<emp> findByEmpName(String empName, int start, int end,
		OrderByComparator<emp> orderByComparator) {
		return findByEmpName(empName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the emps where empName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link empModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param empName the emp name
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching emps
	 */
	@Override
	public List<emp> findByEmpName(String empName, int start, int end,
		OrderByComparator<emp> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPNAME;
			finderArgs = new Object[] { empName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPNAME;
			finderArgs = new Object[] { empName, start, end, orderByComparator };
		}

		List<emp> list = null;

		if (retrieveFromCache) {
			list = (List<emp>)finderCache.getResult(finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (emp emp : list) {
					if (!Objects.equals(empName, emp.getEmpName())) {
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

			query.append(_SQL_SELECT_EMP_WHERE);

			boolean bindEmpName = false;

			if (empName == null) {
				query.append(_FINDER_COLUMN_EMPNAME_EMPNAME_1);
			}
			else if (empName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMPNAME_EMPNAME_3);
			}
			else {
				bindEmpName = true;

				query.append(_FINDER_COLUMN_EMPNAME_EMPNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(empModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEmpName) {
					qPos.add(empName);
				}

				if (!pagination) {
					list = (List<emp>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<emp>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first emp in the ordered set where empName = &#63;.
	 *
	 * @param empName the emp name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching emp
	 * @throws NoSuchempException if a matching emp could not be found
	 */
	@Override
	public emp findByEmpName_First(String empName,
		OrderByComparator<emp> orderByComparator) throws NoSuchempException {
		emp emp = fetchByEmpName_First(empName, orderByComparator);

		if (emp != null) {
			return emp;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("empName=");
		msg.append(empName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchempException(msg.toString());
	}

	/**
	 * Returns the first emp in the ordered set where empName = &#63;.
	 *
	 * @param empName the emp name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching emp, or <code>null</code> if a matching emp could not be found
	 */
	@Override
	public emp fetchByEmpName_First(String empName,
		OrderByComparator<emp> orderByComparator) {
		List<emp> list = findByEmpName(empName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last emp in the ordered set where empName = &#63;.
	 *
	 * @param empName the emp name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching emp
	 * @throws NoSuchempException if a matching emp could not be found
	 */
	@Override
	public emp findByEmpName_Last(String empName,
		OrderByComparator<emp> orderByComparator) throws NoSuchempException {
		emp emp = fetchByEmpName_Last(empName, orderByComparator);

		if (emp != null) {
			return emp;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("empName=");
		msg.append(empName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchempException(msg.toString());
	}

	/**
	 * Returns the last emp in the ordered set where empName = &#63;.
	 *
	 * @param empName the emp name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching emp, or <code>null</code> if a matching emp could not be found
	 */
	@Override
	public emp fetchByEmpName_Last(String empName,
		OrderByComparator<emp> orderByComparator) {
		int count = countByEmpName(empName);

		if (count == 0) {
			return null;
		}

		List<emp> list = findByEmpName(empName, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the emps before and after the current emp in the ordered set where empName = &#63;.
	 *
	 * @param empId the primary key of the current emp
	 * @param empName the emp name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next emp
	 * @throws NoSuchempException if a emp with the primary key could not be found
	 */
	@Override
	public emp[] findByEmpName_PrevAndNext(long empId, String empName,
		OrderByComparator<emp> orderByComparator) throws NoSuchempException {
		emp emp = findByPrimaryKey(empId);

		Session session = null;

		try {
			session = openSession();

			emp[] array = new empImpl[3];

			array[0] = getByEmpName_PrevAndNext(session, emp, empName,
					orderByComparator, true);

			array[1] = emp;

			array[2] = getByEmpName_PrevAndNext(session, emp, empName,
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

	protected emp getByEmpName_PrevAndNext(Session session, emp emp,
		String empName, OrderByComparator<emp> orderByComparator,
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

		query.append(_SQL_SELECT_EMP_WHERE);

		boolean bindEmpName = false;

		if (empName == null) {
			query.append(_FINDER_COLUMN_EMPNAME_EMPNAME_1);
		}
		else if (empName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_EMPNAME_EMPNAME_3);
		}
		else {
			bindEmpName = true;

			query.append(_FINDER_COLUMN_EMPNAME_EMPNAME_2);
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
			query.append(empModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindEmpName) {
			qPos.add(empName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(emp);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<emp> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the emps where empName = &#63; from the database.
	 *
	 * @param empName the emp name
	 */
	@Override
	public void removeByEmpName(String empName) {
		for (emp emp : findByEmpName(empName, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(emp);
		}
	}

	/**
	 * Returns the number of emps where empName = &#63;.
	 *
	 * @param empName the emp name
	 * @return the number of matching emps
	 */
	@Override
	public int countByEmpName(String empName) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EMPNAME;

		Object[] finderArgs = new Object[] { empName };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EMP_WHERE);

			boolean bindEmpName = false;

			if (empName == null) {
				query.append(_FINDER_COLUMN_EMPNAME_EMPNAME_1);
			}
			else if (empName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMPNAME_EMPNAME_3);
			}
			else {
				bindEmpName = true;

				query.append(_FINDER_COLUMN_EMPNAME_EMPNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEmpName) {
					qPos.add(empName);
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

	private static final String _FINDER_COLUMN_EMPNAME_EMPNAME_1 = "emp.empName IS NULL";
	private static final String _FINDER_COLUMN_EMPNAME_EMPNAME_2 = "emp.empName = ?";
	private static final String _FINDER_COLUMN_EMPNAME_EMPNAME_3 = "(emp.empName IS NULL OR emp.empName = '')";

	public empPersistenceImpl() {
		setModelClass(emp.class);
	}

	/**
	 * Caches the emp in the entity cache if it is enabled.
	 *
	 * @param emp the emp
	 */
	@Override
	public void cacheResult(emp emp) {
		entityCache.putResult(empModelImpl.ENTITY_CACHE_ENABLED, empImpl.class,
			emp.getPrimaryKey(), emp);

		emp.resetOriginalValues();
	}

	/**
	 * Caches the emps in the entity cache if it is enabled.
	 *
	 * @param emps the emps
	 */
	@Override
	public void cacheResult(List<emp> emps) {
		for (emp emp : emps) {
			if (entityCache.getResult(empModelImpl.ENTITY_CACHE_ENABLED,
						empImpl.class, emp.getPrimaryKey()) == null) {
				cacheResult(emp);
			}
			else {
				emp.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all emps.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(empImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the emp.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(emp emp) {
		entityCache.removeResult(empModelImpl.ENTITY_CACHE_ENABLED,
			empImpl.class, emp.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<emp> emps) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (emp emp : emps) {
			entityCache.removeResult(empModelImpl.ENTITY_CACHE_ENABLED,
				empImpl.class, emp.getPrimaryKey());
		}
	}

	/**
	 * Creates a new emp with the primary key. Does not add the emp to the database.
	 *
	 * @param empId the primary key for the new emp
	 * @return the new emp
	 */
	@Override
	public emp create(long empId) {
		emp emp = new empImpl();

		emp.setNew(true);
		emp.setPrimaryKey(empId);

		return emp;
	}

	/**
	 * Removes the emp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param empId the primary key of the emp
	 * @return the emp that was removed
	 * @throws NoSuchempException if a emp with the primary key could not be found
	 */
	@Override
	public emp remove(long empId) throws NoSuchempException {
		return remove((Serializable)empId);
	}

	/**
	 * Removes the emp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the emp
	 * @return the emp that was removed
	 * @throws NoSuchempException if a emp with the primary key could not be found
	 */
	@Override
	public emp remove(Serializable primaryKey) throws NoSuchempException {
		Session session = null;

		try {
			session = openSession();

			emp emp = (emp)session.get(empImpl.class, primaryKey);

			if (emp == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchempException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(emp);
		}
		catch (NoSuchempException nsee) {
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
	protected emp removeImpl(emp emp) {
		emp = toUnwrappedModel(emp);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(emp)) {
				emp = (emp)session.get(empImpl.class, emp.getPrimaryKeyObj());
			}

			if (emp != null) {
				session.delete(emp);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (emp != null) {
			clearCache(emp);
		}

		return emp;
	}

	@Override
	public emp updateImpl(emp emp) {
		emp = toUnwrappedModel(emp);

		boolean isNew = emp.isNew();

		empModelImpl empModelImpl = (empModelImpl)emp;

		Session session = null;

		try {
			session = openSession();

			if (emp.isNew()) {
				session.save(emp);

				emp.setNew(false);
			}
			else {
				emp = (emp)session.merge(emp);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !empModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((empModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { empModelImpl.getOriginalEmpName() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EMPNAME, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPNAME,
					args);

				args = new Object[] { empModelImpl.getEmpName() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EMPNAME, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPNAME,
					args);
			}
		}

		entityCache.putResult(empModelImpl.ENTITY_CACHE_ENABLED, empImpl.class,
			emp.getPrimaryKey(), emp, false);

		emp.resetOriginalValues();

		return emp;
	}

	protected emp toUnwrappedModel(emp emp) {
		if (emp instanceof empImpl) {
			return emp;
		}

		empImpl empImpl = new empImpl();

		empImpl.setNew(emp.isNew());
		empImpl.setPrimaryKey(emp.getPrimaryKey());

		empImpl.setEmpId(emp.getEmpId());
		empImpl.setEmpName(emp.getEmpName());
		empImpl.setDept(emp.getDept());
		empImpl.setSalary(emp.getSalary());

		return empImpl;
	}

	/**
	 * Returns the emp with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the emp
	 * @return the emp
	 * @throws NoSuchempException if a emp with the primary key could not be found
	 */
	@Override
	public emp findByPrimaryKey(Serializable primaryKey)
		throws NoSuchempException {
		emp emp = fetchByPrimaryKey(primaryKey);

		if (emp == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchempException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return emp;
	}

	/**
	 * Returns the emp with the primary key or throws a {@link NoSuchempException} if it could not be found.
	 *
	 * @param empId the primary key of the emp
	 * @return the emp
	 * @throws NoSuchempException if a emp with the primary key could not be found
	 */
	@Override
	public emp findByPrimaryKey(long empId) throws NoSuchempException {
		return findByPrimaryKey((Serializable)empId);
	}

	/**
	 * Returns the emp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the emp
	 * @return the emp, or <code>null</code> if a emp with the primary key could not be found
	 */
	@Override
	public emp fetchByPrimaryKey(Serializable primaryKey) {
		emp emp = (emp)entityCache.getResult(empModelImpl.ENTITY_CACHE_ENABLED,
				empImpl.class, primaryKey);

		if (emp == _nullemp) {
			return null;
		}

		if (emp == null) {
			Session session = null;

			try {
				session = openSession();

				emp = (emp)session.get(empImpl.class, primaryKey);

				if (emp != null) {
					cacheResult(emp);
				}
				else {
					entityCache.putResult(empModelImpl.ENTITY_CACHE_ENABLED,
						empImpl.class, primaryKey, _nullemp);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(empModelImpl.ENTITY_CACHE_ENABLED,
					empImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return emp;
	}

	/**
	 * Returns the emp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param empId the primary key of the emp
	 * @return the emp, or <code>null</code> if a emp with the primary key could not be found
	 */
	@Override
	public emp fetchByPrimaryKey(long empId) {
		return fetchByPrimaryKey((Serializable)empId);
	}

	@Override
	public Map<Serializable, emp> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, emp> map = new HashMap<Serializable, emp>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			emp emp = fetchByPrimaryKey(primaryKey);

			if (emp != null) {
				map.put(primaryKey, emp);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			emp emp = (emp)entityCache.getResult(empModelImpl.ENTITY_CACHE_ENABLED,
					empImpl.class, primaryKey);

			if (emp == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, emp);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_EMP_WHERE_PKS_IN);

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

			for (emp emp : (List<emp>)q.list()) {
				map.put(emp.getPrimaryKeyObj(), emp);

				cacheResult(emp);

				uncachedPrimaryKeys.remove(emp.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(empModelImpl.ENTITY_CACHE_ENABLED,
					empImpl.class, primaryKey, _nullemp);
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
	 * Returns all the emps.
	 *
	 * @return the emps
	 */
	@Override
	public List<emp> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the emps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link empModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @return the range of emps
	 */
	@Override
	public List<emp> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the emps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link empModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of emps
	 */
	@Override
	public List<emp> findAll(int start, int end,
		OrderByComparator<emp> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the emps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link empModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of emps
	 */
	@Override
	public List<emp> findAll(int start, int end,
		OrderByComparator<emp> orderByComparator, boolean retrieveFromCache) {
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

		List<emp> list = null;

		if (retrieveFromCache) {
			list = (List<emp>)finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_EMP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMP;

				if (pagination) {
					sql = sql.concat(empModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<emp>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<emp>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Removes all the emps from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (emp emp : findAll()) {
			remove(emp);
		}
	}

	/**
	 * Returns the number of emps.
	 *
	 * @return the number of emps
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EMP);

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
	protected Map<String, Integer> getTableColumnsMap() {
		return empModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the emp persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(empImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_EMP = "SELECT emp FROM emp emp";
	private static final String _SQL_SELECT_EMP_WHERE_PKS_IN = "SELECT emp FROM emp emp WHERE empId IN (";
	private static final String _SQL_SELECT_EMP_WHERE = "SELECT emp FROM emp emp WHERE ";
	private static final String _SQL_COUNT_EMP = "SELECT COUNT(emp) FROM emp emp";
	private static final String _SQL_COUNT_EMP_WHERE = "SELECT COUNT(emp) FROM emp emp WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "emp.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No emp exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No emp exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(empPersistenceImpl.class);
	private static final emp _nullemp = new empImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<emp> toCacheModel() {
				return _nullempCacheModel;
			}
		};

	private static final CacheModel<emp> _nullempCacheModel = new CacheModel<emp>() {
			@Override
			public emp toEntityModel() {
				return _nullemp;
			}
		};
}