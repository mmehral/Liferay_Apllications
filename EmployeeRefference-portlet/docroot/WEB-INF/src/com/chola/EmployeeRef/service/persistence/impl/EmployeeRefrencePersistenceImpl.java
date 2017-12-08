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

package com.chola.EmployeeRef.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.EmployeeRef.exception.NoSuchEmployeeRefrenceException;
import com.chola.EmployeeRef.model.EmployeeRefrence;
import com.chola.EmployeeRef.model.impl.EmployeeRefrenceImpl;
import com.chola.EmployeeRef.model.impl.EmployeeRefrenceModelImpl;
import com.chola.EmployeeRef.service.persistence.EmployeeRefrencePersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the employee refrence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay03
 * @see EmployeeRefrencePersistence
 * @see com.chola.EmployeeRef.service.persistence.EmployeeRefrenceUtil
 * @generated
 */
@ProviderType
public class EmployeeRefrencePersistenceImpl extends BasePersistenceImpl<EmployeeRefrence>
	implements EmployeeRefrencePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployeeRefrenceUtil} to access the employee refrence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployeeRefrenceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeRefrenceModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeRefrenceModelImpl.FINDER_CACHE_ENABLED,
			EmployeeRefrenceImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeRefrenceModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeRefrenceModelImpl.FINDER_CACHE_ENABLED,
			EmployeeRefrenceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeRefrenceModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeRefrenceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EmployeeRefrencePersistenceImpl() {
		setModelClass(EmployeeRefrence.class);
	}

	/**
	 * Caches the employee refrence in the entity cache if it is enabled.
	 *
	 * @param employeeRefrence the employee refrence
	 */
	@Override
	public void cacheResult(EmployeeRefrence employeeRefrence) {
		entityCache.putResult(EmployeeRefrenceModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeRefrenceImpl.class, employeeRefrence.getPrimaryKey(),
			employeeRefrence);

		employeeRefrence.resetOriginalValues();
	}

	/**
	 * Caches the employee refrences in the entity cache if it is enabled.
	 *
	 * @param employeeRefrences the employee refrences
	 */
	@Override
	public void cacheResult(List<EmployeeRefrence> employeeRefrences) {
		for (EmployeeRefrence employeeRefrence : employeeRefrences) {
			if (entityCache.getResult(
						EmployeeRefrenceModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeRefrenceImpl.class,
						employeeRefrence.getPrimaryKey()) == null) {
				cacheResult(employeeRefrence);
			}
			else {
				employeeRefrence.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employee refrences.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EmployeeRefrenceImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employee refrence.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmployeeRefrence employeeRefrence) {
		entityCache.removeResult(EmployeeRefrenceModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeRefrenceImpl.class, employeeRefrence.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EmployeeRefrence> employeeRefrences) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmployeeRefrence employeeRefrence : employeeRefrences) {
			entityCache.removeResult(EmployeeRefrenceModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeRefrenceImpl.class, employeeRefrence.getPrimaryKey());
		}
	}

	/**
	 * Creates a new employee refrence with the primary key. Does not add the employee refrence to the database.
	 *
	 * @param refId the primary key for the new employee refrence
	 * @return the new employee refrence
	 */
	@Override
	public EmployeeRefrence create(long refId) {
		EmployeeRefrence employeeRefrence = new EmployeeRefrenceImpl();

		employeeRefrence.setNew(true);
		employeeRefrence.setPrimaryKey(refId);

		return employeeRefrence;
	}

	/**
	 * Removes the employee refrence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param refId the primary key of the employee refrence
	 * @return the employee refrence that was removed
	 * @throws NoSuchEmployeeRefrenceException if a employee refrence with the primary key could not be found
	 */
	@Override
	public EmployeeRefrence remove(long refId)
		throws NoSuchEmployeeRefrenceException {
		return remove((Serializable)refId);
	}

	/**
	 * Removes the employee refrence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employee refrence
	 * @return the employee refrence that was removed
	 * @throws NoSuchEmployeeRefrenceException if a employee refrence with the primary key could not be found
	 */
	@Override
	public EmployeeRefrence remove(Serializable primaryKey)
		throws NoSuchEmployeeRefrenceException {
		Session session = null;

		try {
			session = openSession();

			EmployeeRefrence employeeRefrence = (EmployeeRefrence)session.get(EmployeeRefrenceImpl.class,
					primaryKey);

			if (employeeRefrence == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployeeRefrenceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employeeRefrence);
		}
		catch (NoSuchEmployeeRefrenceException nsee) {
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
	protected EmployeeRefrence removeImpl(EmployeeRefrence employeeRefrence) {
		employeeRefrence = toUnwrappedModel(employeeRefrence);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(employeeRefrence)) {
				employeeRefrence = (EmployeeRefrence)session.get(EmployeeRefrenceImpl.class,
						employeeRefrence.getPrimaryKeyObj());
			}

			if (employeeRefrence != null) {
				session.delete(employeeRefrence);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (employeeRefrence != null) {
			clearCache(employeeRefrence);
		}

		return employeeRefrence;
	}

	@Override
	public EmployeeRefrence updateImpl(EmployeeRefrence employeeRefrence) {
		employeeRefrence = toUnwrappedModel(employeeRefrence);

		boolean isNew = employeeRefrence.isNew();

		EmployeeRefrenceModelImpl employeeRefrenceModelImpl = (EmployeeRefrenceModelImpl)employeeRefrence;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (employeeRefrence.getCreateDate() == null)) {
			if (serviceContext == null) {
				employeeRefrence.setCreateDate(now);
			}
			else {
				employeeRefrence.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!employeeRefrenceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				employeeRefrence.setModifiedDate(now);
			}
			else {
				employeeRefrence.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (employeeRefrence.isNew()) {
				session.save(employeeRefrence);

				employeeRefrence.setNew(false);
			}
			else {
				employeeRefrence = (EmployeeRefrence)session.merge(employeeRefrence);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(EmployeeRefrenceModelImpl.ENTITY_CACHE_ENABLED,
			EmployeeRefrenceImpl.class, employeeRefrence.getPrimaryKey(),
			employeeRefrence, false);

		employeeRefrence.resetOriginalValues();

		return employeeRefrence;
	}

	protected EmployeeRefrence toUnwrappedModel(
		EmployeeRefrence employeeRefrence) {
		if (employeeRefrence instanceof EmployeeRefrenceImpl) {
			return employeeRefrence;
		}

		EmployeeRefrenceImpl employeeRefrenceImpl = new EmployeeRefrenceImpl();

		employeeRefrenceImpl.setNew(employeeRefrence.isNew());
		employeeRefrenceImpl.setPrimaryKey(employeeRefrence.getPrimaryKey());

		employeeRefrenceImpl.setRefId(employeeRefrence.getRefId());
		employeeRefrenceImpl.setTitle(employeeRefrence.getTitle());
		employeeRefrenceImpl.setFrom(employeeRefrence.getFrom());
		employeeRefrenceImpl.setTo(employeeRefrence.getTo());
		employeeRefrenceImpl.setBody(employeeRefrence.getBody());
		employeeRefrenceImpl.setFlag(employeeRefrence.getFlag());
		employeeRefrenceImpl.setCreateDate(employeeRefrence.getCreateDate());
		employeeRefrenceImpl.setModifiedDate(employeeRefrence.getModifiedDate());

		return employeeRefrenceImpl;
	}

	/**
	 * Returns the employee refrence with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee refrence
	 * @return the employee refrence
	 * @throws NoSuchEmployeeRefrenceException if a employee refrence with the primary key could not be found
	 */
	@Override
	public EmployeeRefrence findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmployeeRefrenceException {
		EmployeeRefrence employeeRefrence = fetchByPrimaryKey(primaryKey);

		if (employeeRefrence == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmployeeRefrenceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return employeeRefrence;
	}

	/**
	 * Returns the employee refrence with the primary key or throws a {@link NoSuchEmployeeRefrenceException} if it could not be found.
	 *
	 * @param refId the primary key of the employee refrence
	 * @return the employee refrence
	 * @throws NoSuchEmployeeRefrenceException if a employee refrence with the primary key could not be found
	 */
	@Override
	public EmployeeRefrence findByPrimaryKey(long refId)
		throws NoSuchEmployeeRefrenceException {
		return findByPrimaryKey((Serializable)refId);
	}

	/**
	 * Returns the employee refrence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employee refrence
	 * @return the employee refrence, or <code>null</code> if a employee refrence with the primary key could not be found
	 */
	@Override
	public EmployeeRefrence fetchByPrimaryKey(Serializable primaryKey) {
		EmployeeRefrence employeeRefrence = (EmployeeRefrence)entityCache.getResult(EmployeeRefrenceModelImpl.ENTITY_CACHE_ENABLED,
				EmployeeRefrenceImpl.class, primaryKey);

		if (employeeRefrence == _nullEmployeeRefrence) {
			return null;
		}

		if (employeeRefrence == null) {
			Session session = null;

			try {
				session = openSession();

				employeeRefrence = (EmployeeRefrence)session.get(EmployeeRefrenceImpl.class,
						primaryKey);

				if (employeeRefrence != null) {
					cacheResult(employeeRefrence);
				}
				else {
					entityCache.putResult(EmployeeRefrenceModelImpl.ENTITY_CACHE_ENABLED,
						EmployeeRefrenceImpl.class, primaryKey,
						_nullEmployeeRefrence);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(EmployeeRefrenceModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeRefrenceImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return employeeRefrence;
	}

	/**
	 * Returns the employee refrence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param refId the primary key of the employee refrence
	 * @return the employee refrence, or <code>null</code> if a employee refrence with the primary key could not be found
	 */
	@Override
	public EmployeeRefrence fetchByPrimaryKey(long refId) {
		return fetchByPrimaryKey((Serializable)refId);
	}

	@Override
	public Map<Serializable, EmployeeRefrence> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, EmployeeRefrence> map = new HashMap<Serializable, EmployeeRefrence>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			EmployeeRefrence employeeRefrence = fetchByPrimaryKey(primaryKey);

			if (employeeRefrence != null) {
				map.put(primaryKey, employeeRefrence);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			EmployeeRefrence employeeRefrence = (EmployeeRefrence)entityCache.getResult(EmployeeRefrenceModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeRefrenceImpl.class, primaryKey);

			if (employeeRefrence == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, employeeRefrence);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_EMPLOYEEREFRENCE_WHERE_PKS_IN);

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

			for (EmployeeRefrence employeeRefrence : (List<EmployeeRefrence>)q.list()) {
				map.put(employeeRefrence.getPrimaryKeyObj(), employeeRefrence);

				cacheResult(employeeRefrence);

				uncachedPrimaryKeys.remove(employeeRefrence.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(EmployeeRefrenceModelImpl.ENTITY_CACHE_ENABLED,
					EmployeeRefrenceImpl.class, primaryKey,
					_nullEmployeeRefrence);
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
	 * Returns all the employee refrences.
	 *
	 * @return the employee refrences
	 */
	@Override
	public List<EmployeeRefrence> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employee refrences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmployeeRefrenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee refrences
	 * @param end the upper bound of the range of employee refrences (not inclusive)
	 * @return the range of employee refrences
	 */
	@Override
	public List<EmployeeRefrence> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employee refrences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmployeeRefrenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee refrences
	 * @param end the upper bound of the range of employee refrences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employee refrences
	 */
	@Override
	public List<EmployeeRefrence> findAll(int start, int end,
		OrderByComparator<EmployeeRefrence> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the employee refrences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmployeeRefrenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of employee refrences
	 * @param end the upper bound of the range of employee refrences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of employee refrences
	 */
	@Override
	public List<EmployeeRefrence> findAll(int start, int end,
		OrderByComparator<EmployeeRefrence> orderByComparator,
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

		List<EmployeeRefrence> list = null;

		if (retrieveFromCache) {
			list = (List<EmployeeRefrence>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_EMPLOYEEREFRENCE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYEEREFRENCE;

				if (pagination) {
					sql = sql.concat(EmployeeRefrenceModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmployeeRefrence>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<EmployeeRefrence>)QueryUtil.list(q,
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
	 * Removes all the employee refrences from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (EmployeeRefrence employeeRefrence : findAll()) {
			remove(employeeRefrence);
		}
	}

	/**
	 * Returns the number of employee refrences.
	 *
	 * @return the number of employee refrences
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EMPLOYEEREFRENCE);

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
		return EmployeeRefrenceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the employee refrence persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(EmployeeRefrenceImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_EMPLOYEEREFRENCE = "SELECT employeeRefrence FROM EmployeeRefrence employeeRefrence";
	private static final String _SQL_SELECT_EMPLOYEEREFRENCE_WHERE_PKS_IN = "SELECT employeeRefrence FROM EmployeeRefrence employeeRefrence WHERE refId IN (";
	private static final String _SQL_COUNT_EMPLOYEEREFRENCE = "SELECT COUNT(employeeRefrence) FROM EmployeeRefrence employeeRefrence";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employeeRefrence.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmployeeRefrence exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(EmployeeRefrencePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"from", "to"
			});
	private static final EmployeeRefrence _nullEmployeeRefrence = new EmployeeRefrenceImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmployeeRefrence> toCacheModel() {
				return _nullEmployeeRefrenceCacheModel;
			}
		};

	private static final CacheModel<EmployeeRefrence> _nullEmployeeRefrenceCacheModel =
		new CacheModel<EmployeeRefrence>() {
			@Override
			public EmployeeRefrence toEntityModel() {
				return _nullEmployeeRefrence;
			}
		};
}