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

package com.chola.trainingcalendar.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.trainingcalendar.exception.NoSuchtrainingintendedtableException;
import com.chola.trainingcalendar.model.impl.trainingintendedtableImpl;
import com.chola.trainingcalendar.model.impl.trainingintendedtableModelImpl;
import com.chola.trainingcalendar.model.trainingintendedtable;
import com.chola.trainingcalendar.service.persistence.trainingintendedtablePersistence;

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
 * The persistence implementation for the trainingintendedtable service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see trainingintendedtablePersistence
 * @see com.chola.trainingcalendar.service.persistence.trainingintendedtableUtil
 * @generated
 */
@ProviderType
public class trainingintendedtablePersistenceImpl extends BasePersistenceImpl<trainingintendedtable>
	implements trainingintendedtablePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link trainingintendedtableUtil} to access the trainingintendedtable persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = trainingintendedtableImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(trainingintendedtableModelImpl.ENTITY_CACHE_ENABLED,
			trainingintendedtableModelImpl.FINDER_CACHE_ENABLED,
			trainingintendedtableImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(trainingintendedtableModelImpl.ENTITY_CACHE_ENABLED,
			trainingintendedtableModelImpl.FINDER_CACHE_ENABLED,
			trainingintendedtableImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(trainingintendedtableModelImpl.ENTITY_CACHE_ENABLED,
			trainingintendedtableModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public trainingintendedtablePersistenceImpl() {
		setModelClass(trainingintendedtable.class);
	}

	/**
	 * Caches the trainingintendedtable in the entity cache if it is enabled.
	 *
	 * @param trainingintendedtable the trainingintendedtable
	 */
	@Override
	public void cacheResult(trainingintendedtable trainingintendedtable) {
		entityCache.putResult(trainingintendedtableModelImpl.ENTITY_CACHE_ENABLED,
			trainingintendedtableImpl.class,
			trainingintendedtable.getPrimaryKey(), trainingintendedtable);

		trainingintendedtable.resetOriginalValues();
	}

	/**
	 * Caches the trainingintendedtables in the entity cache if it is enabled.
	 *
	 * @param trainingintendedtables the trainingintendedtables
	 */
	@Override
	public void cacheResult(List<trainingintendedtable> trainingintendedtables) {
		for (trainingintendedtable trainingintendedtable : trainingintendedtables) {
			if (entityCache.getResult(
						trainingintendedtableModelImpl.ENTITY_CACHE_ENABLED,
						trainingintendedtableImpl.class,
						trainingintendedtable.getPrimaryKey()) == null) {
				cacheResult(trainingintendedtable);
			}
			else {
				trainingintendedtable.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all trainingintendedtables.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(trainingintendedtableImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the trainingintendedtable.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(trainingintendedtable trainingintendedtable) {
		entityCache.removeResult(trainingintendedtableModelImpl.ENTITY_CACHE_ENABLED,
			trainingintendedtableImpl.class,
			trainingintendedtable.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<trainingintendedtable> trainingintendedtables) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (trainingintendedtable trainingintendedtable : trainingintendedtables) {
			entityCache.removeResult(trainingintendedtableModelImpl.ENTITY_CACHE_ENABLED,
				trainingintendedtableImpl.class,
				trainingintendedtable.getPrimaryKey());
		}
	}

	/**
	 * Creates a new trainingintendedtable with the primary key. Does not add the trainingintendedtable to the database.
	 *
	 * @param id the primary key for the new trainingintendedtable
	 * @return the new trainingintendedtable
	 */
	@Override
	public trainingintendedtable create(long id) {
		trainingintendedtable trainingintendedtable = new trainingintendedtableImpl();

		trainingintendedtable.setNew(true);
		trainingintendedtable.setPrimaryKey(id);

		return trainingintendedtable;
	}

	/**
	 * Removes the trainingintendedtable with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the trainingintendedtable
	 * @return the trainingintendedtable that was removed
	 * @throws NoSuchtrainingintendedtableException if a trainingintendedtable with the primary key could not be found
	 */
	@Override
	public trainingintendedtable remove(long id)
		throws NoSuchtrainingintendedtableException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the trainingintendedtable with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the trainingintendedtable
	 * @return the trainingintendedtable that was removed
	 * @throws NoSuchtrainingintendedtableException if a trainingintendedtable with the primary key could not be found
	 */
	@Override
	public trainingintendedtable remove(Serializable primaryKey)
		throws NoSuchtrainingintendedtableException {
		Session session = null;

		try {
			session = openSession();

			trainingintendedtable trainingintendedtable = (trainingintendedtable)session.get(trainingintendedtableImpl.class,
					primaryKey);

			if (trainingintendedtable == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchtrainingintendedtableException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(trainingintendedtable);
		}
		catch (NoSuchtrainingintendedtableException nsee) {
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
	protected trainingintendedtable removeImpl(
		trainingintendedtable trainingintendedtable) {
		trainingintendedtable = toUnwrappedModel(trainingintendedtable);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(trainingintendedtable)) {
				trainingintendedtable = (trainingintendedtable)session.get(trainingintendedtableImpl.class,
						trainingintendedtable.getPrimaryKeyObj());
			}

			if (trainingintendedtable != null) {
				session.delete(trainingintendedtable);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (trainingintendedtable != null) {
			clearCache(trainingintendedtable);
		}

		return trainingintendedtable;
	}

	@Override
	public trainingintendedtable updateImpl(
		trainingintendedtable trainingintendedtable) {
		trainingintendedtable = toUnwrappedModel(trainingintendedtable);

		boolean isNew = trainingintendedtable.isNew();

		Session session = null;

		try {
			session = openSession();

			if (trainingintendedtable.isNew()) {
				session.save(trainingintendedtable);

				trainingintendedtable.setNew(false);
			}
			else {
				trainingintendedtable = (trainingintendedtable)session.merge(trainingintendedtable);
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

		entityCache.putResult(trainingintendedtableModelImpl.ENTITY_CACHE_ENABLED,
			trainingintendedtableImpl.class,
			trainingintendedtable.getPrimaryKey(), trainingintendedtable, false);

		trainingintendedtable.resetOriginalValues();

		return trainingintendedtable;
	}

	protected trainingintendedtable toUnwrappedModel(
		trainingintendedtable trainingintendedtable) {
		if (trainingintendedtable instanceof trainingintendedtableImpl) {
			return trainingintendedtable;
		}

		trainingintendedtableImpl trainingintendedtableImpl = new trainingintendedtableImpl();

		trainingintendedtableImpl.setNew(trainingintendedtable.isNew());
		trainingintendedtableImpl.setPrimaryKey(trainingintendedtable.getPrimaryKey());

		trainingintendedtableImpl.setId(trainingintendedtable.getId());
		trainingintendedtableImpl.setTrainingid(trainingintendedtable.getTrainingid());
		trainingintendedtableImpl.setUserid(trainingintendedtable.getUserid());
		trainingintendedtableImpl.setScreenname(trainingintendedtable.getScreenname());
		trainingintendedtableImpl.setCreateddate(trainingintendedtable.getCreateddate());
		trainingintendedtableImpl.setFlag(trainingintendedtable.getFlag());

		return trainingintendedtableImpl;
	}

	/**
	 * Returns the trainingintendedtable with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the trainingintendedtable
	 * @return the trainingintendedtable
	 * @throws NoSuchtrainingintendedtableException if a trainingintendedtable with the primary key could not be found
	 */
	@Override
	public trainingintendedtable findByPrimaryKey(Serializable primaryKey)
		throws NoSuchtrainingintendedtableException {
		trainingintendedtable trainingintendedtable = fetchByPrimaryKey(primaryKey);

		if (trainingintendedtable == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchtrainingintendedtableException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return trainingintendedtable;
	}

	/**
	 * Returns the trainingintendedtable with the primary key or throws a {@link NoSuchtrainingintendedtableException} if it could not be found.
	 *
	 * @param id the primary key of the trainingintendedtable
	 * @return the trainingintendedtable
	 * @throws NoSuchtrainingintendedtableException if a trainingintendedtable with the primary key could not be found
	 */
	@Override
	public trainingintendedtable findByPrimaryKey(long id)
		throws NoSuchtrainingintendedtableException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the trainingintendedtable with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the trainingintendedtable
	 * @return the trainingintendedtable, or <code>null</code> if a trainingintendedtable with the primary key could not be found
	 */
	@Override
	public trainingintendedtable fetchByPrimaryKey(Serializable primaryKey) {
		trainingintendedtable trainingintendedtable = (trainingintendedtable)entityCache.getResult(trainingintendedtableModelImpl.ENTITY_CACHE_ENABLED,
				trainingintendedtableImpl.class, primaryKey);

		if (trainingintendedtable == _nulltrainingintendedtable) {
			return null;
		}

		if (trainingintendedtable == null) {
			Session session = null;

			try {
				session = openSession();

				trainingintendedtable = (trainingintendedtable)session.get(trainingintendedtableImpl.class,
						primaryKey);

				if (trainingintendedtable != null) {
					cacheResult(trainingintendedtable);
				}
				else {
					entityCache.putResult(trainingintendedtableModelImpl.ENTITY_CACHE_ENABLED,
						trainingintendedtableImpl.class, primaryKey,
						_nulltrainingintendedtable);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(trainingintendedtableModelImpl.ENTITY_CACHE_ENABLED,
					trainingintendedtableImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return trainingintendedtable;
	}

	/**
	 * Returns the trainingintendedtable with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the trainingintendedtable
	 * @return the trainingintendedtable, or <code>null</code> if a trainingintendedtable with the primary key could not be found
	 */
	@Override
	public trainingintendedtable fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, trainingintendedtable> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, trainingintendedtable> map = new HashMap<Serializable, trainingintendedtable>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			trainingintendedtable trainingintendedtable = fetchByPrimaryKey(primaryKey);

			if (trainingintendedtable != null) {
				map.put(primaryKey, trainingintendedtable);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			trainingintendedtable trainingintendedtable = (trainingintendedtable)entityCache.getResult(trainingintendedtableModelImpl.ENTITY_CACHE_ENABLED,
					trainingintendedtableImpl.class, primaryKey);

			if (trainingintendedtable == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, trainingintendedtable);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TRAININGINTENDEDTABLE_WHERE_PKS_IN);

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

			for (trainingintendedtable trainingintendedtable : (List<trainingintendedtable>)q.list()) {
				map.put(trainingintendedtable.getPrimaryKeyObj(),
					trainingintendedtable);

				cacheResult(trainingintendedtable);

				uncachedPrimaryKeys.remove(trainingintendedtable.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(trainingintendedtableModelImpl.ENTITY_CACHE_ENABLED,
					trainingintendedtableImpl.class, primaryKey,
					_nulltrainingintendedtable);
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
	 * Returns all the trainingintendedtables.
	 *
	 * @return the trainingintendedtables
	 */
	@Override
	public List<trainingintendedtable> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the trainingintendedtables.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingintendedtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of trainingintendedtables
	 * @param end the upper bound of the range of trainingintendedtables (not inclusive)
	 * @return the range of trainingintendedtables
	 */
	@Override
	public List<trainingintendedtable> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the trainingintendedtables.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingintendedtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of trainingintendedtables
	 * @param end the upper bound of the range of trainingintendedtables (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of trainingintendedtables
	 */
	@Override
	public List<trainingintendedtable> findAll(int start, int end,
		OrderByComparator<trainingintendedtable> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the trainingintendedtables.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingintendedtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of trainingintendedtables
	 * @param end the upper bound of the range of trainingintendedtables (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of trainingintendedtables
	 */
	@Override
	public List<trainingintendedtable> findAll(int start, int end,
		OrderByComparator<trainingintendedtable> orderByComparator,
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

		List<trainingintendedtable> list = null;

		if (retrieveFromCache) {
			list = (List<trainingintendedtable>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TRAININGINTENDEDTABLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TRAININGINTENDEDTABLE;

				if (pagination) {
					sql = sql.concat(trainingintendedtableModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<trainingintendedtable>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<trainingintendedtable>)QueryUtil.list(q,
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
	 * Removes all the trainingintendedtables from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (trainingintendedtable trainingintendedtable : findAll()) {
			remove(trainingintendedtable);
		}
	}

	/**
	 * Returns the number of trainingintendedtables.
	 *
	 * @return the number of trainingintendedtables
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TRAININGINTENDEDTABLE);

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
		return trainingintendedtableModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the trainingintendedtable persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(trainingintendedtableImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_TRAININGINTENDEDTABLE = "SELECT trainingintendedtable FROM trainingintendedtable trainingintendedtable";
	private static final String _SQL_SELECT_TRAININGINTENDEDTABLE_WHERE_PKS_IN = "SELECT trainingintendedtable FROM trainingintendedtable trainingintendedtable WHERE id_ IN (";
	private static final String _SQL_COUNT_TRAININGINTENDEDTABLE = "SELECT COUNT(trainingintendedtable) FROM trainingintendedtable trainingintendedtable";
	private static final String _ORDER_BY_ENTITY_ALIAS = "trainingintendedtable.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No trainingintendedtable exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(trainingintendedtablePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final trainingintendedtable _nulltrainingintendedtable = new trainingintendedtableImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<trainingintendedtable> toCacheModel() {
				return _nulltrainingintendedtableCacheModel;
			}
		};

	private static final CacheModel<trainingintendedtable> _nulltrainingintendedtableCacheModel =
		new CacheModel<trainingintendedtable>() {
			@Override
			public trainingintendedtable toEntityModel() {
				return _nulltrainingintendedtable;
			}
		};
}