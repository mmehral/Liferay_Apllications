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

import com.chola.trainingcalendar.exception.NoSuchtrainingcalendarException;
import com.chola.trainingcalendar.model.impl.trainingcalendarImpl;
import com.chola.trainingcalendar.model.impl.trainingcalendarModelImpl;
import com.chola.trainingcalendar.model.trainingcalendar;
import com.chola.trainingcalendar.service.persistence.trainingcalendarPersistence;

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
 * The persistence implementation for the trainingcalendar service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see trainingcalendarPersistence
 * @see com.chola.trainingcalendar.service.persistence.trainingcalendarUtil
 * @generated
 */
@ProviderType
public class trainingcalendarPersistenceImpl extends BasePersistenceImpl<trainingcalendar>
	implements trainingcalendarPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link trainingcalendarUtil} to access the trainingcalendar persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = trainingcalendarImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(trainingcalendarModelImpl.ENTITY_CACHE_ENABLED,
			trainingcalendarModelImpl.FINDER_CACHE_ENABLED,
			trainingcalendarImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(trainingcalendarModelImpl.ENTITY_CACHE_ENABLED,
			trainingcalendarModelImpl.FINDER_CACHE_ENABLED,
			trainingcalendarImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(trainingcalendarModelImpl.ENTITY_CACHE_ENABLED,
			trainingcalendarModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public trainingcalendarPersistenceImpl() {
		setModelClass(trainingcalendar.class);
	}

	/**
	 * Caches the trainingcalendar in the entity cache if it is enabled.
	 *
	 * @param trainingcalendar the trainingcalendar
	 */
	@Override
	public void cacheResult(trainingcalendar trainingcalendar) {
		entityCache.putResult(trainingcalendarModelImpl.ENTITY_CACHE_ENABLED,
			trainingcalendarImpl.class, trainingcalendar.getPrimaryKey(),
			trainingcalendar);

		trainingcalendar.resetOriginalValues();
	}

	/**
	 * Caches the trainingcalendars in the entity cache if it is enabled.
	 *
	 * @param trainingcalendars the trainingcalendars
	 */
	@Override
	public void cacheResult(List<trainingcalendar> trainingcalendars) {
		for (trainingcalendar trainingcalendar : trainingcalendars) {
			if (entityCache.getResult(
						trainingcalendarModelImpl.ENTITY_CACHE_ENABLED,
						trainingcalendarImpl.class,
						trainingcalendar.getPrimaryKey()) == null) {
				cacheResult(trainingcalendar);
			}
			else {
				trainingcalendar.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all trainingcalendars.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(trainingcalendarImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the trainingcalendar.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(trainingcalendar trainingcalendar) {
		entityCache.removeResult(trainingcalendarModelImpl.ENTITY_CACHE_ENABLED,
			trainingcalendarImpl.class, trainingcalendar.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<trainingcalendar> trainingcalendars) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (trainingcalendar trainingcalendar : trainingcalendars) {
			entityCache.removeResult(trainingcalendarModelImpl.ENTITY_CACHE_ENABLED,
				trainingcalendarImpl.class, trainingcalendar.getPrimaryKey());
		}
	}

	/**
	 * Creates a new trainingcalendar with the primary key. Does not add the trainingcalendar to the database.
	 *
	 * @param trainingid the primary key for the new trainingcalendar
	 * @return the new trainingcalendar
	 */
	@Override
	public trainingcalendar create(long trainingid) {
		trainingcalendar trainingcalendar = new trainingcalendarImpl();

		trainingcalendar.setNew(true);
		trainingcalendar.setPrimaryKey(trainingid);

		return trainingcalendar;
	}

	/**
	 * Removes the trainingcalendar with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param trainingid the primary key of the trainingcalendar
	 * @return the trainingcalendar that was removed
	 * @throws NoSuchtrainingcalendarException if a trainingcalendar with the primary key could not be found
	 */
	@Override
	public trainingcalendar remove(long trainingid)
		throws NoSuchtrainingcalendarException {
		return remove((Serializable)trainingid);
	}

	/**
	 * Removes the trainingcalendar with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the trainingcalendar
	 * @return the trainingcalendar that was removed
	 * @throws NoSuchtrainingcalendarException if a trainingcalendar with the primary key could not be found
	 */
	@Override
	public trainingcalendar remove(Serializable primaryKey)
		throws NoSuchtrainingcalendarException {
		Session session = null;

		try {
			session = openSession();

			trainingcalendar trainingcalendar = (trainingcalendar)session.get(trainingcalendarImpl.class,
					primaryKey);

			if (trainingcalendar == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchtrainingcalendarException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(trainingcalendar);
		}
		catch (NoSuchtrainingcalendarException nsee) {
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
	protected trainingcalendar removeImpl(trainingcalendar trainingcalendar) {
		trainingcalendar = toUnwrappedModel(trainingcalendar);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(trainingcalendar)) {
				trainingcalendar = (trainingcalendar)session.get(trainingcalendarImpl.class,
						trainingcalendar.getPrimaryKeyObj());
			}

			if (trainingcalendar != null) {
				session.delete(trainingcalendar);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (trainingcalendar != null) {
			clearCache(trainingcalendar);
		}

		return trainingcalendar;
	}

	@Override
	public trainingcalendar updateImpl(trainingcalendar trainingcalendar) {
		trainingcalendar = toUnwrappedModel(trainingcalendar);

		boolean isNew = trainingcalendar.isNew();

		Session session = null;

		try {
			session = openSession();

			if (trainingcalendar.isNew()) {
				session.save(trainingcalendar);

				trainingcalendar.setNew(false);
			}
			else {
				trainingcalendar = (trainingcalendar)session.merge(trainingcalendar);
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

		entityCache.putResult(trainingcalendarModelImpl.ENTITY_CACHE_ENABLED,
			trainingcalendarImpl.class, trainingcalendar.getPrimaryKey(),
			trainingcalendar, false);

		trainingcalendar.resetOriginalValues();

		return trainingcalendar;
	}

	protected trainingcalendar toUnwrappedModel(
		trainingcalendar trainingcalendar) {
		if (trainingcalendar instanceof trainingcalendarImpl) {
			return trainingcalendar;
		}

		trainingcalendarImpl trainingcalendarImpl = new trainingcalendarImpl();

		trainingcalendarImpl.setNew(trainingcalendar.isNew());
		trainingcalendarImpl.setPrimaryKey(trainingcalendar.getPrimaryKey());

		trainingcalendarImpl.setTrainingid(trainingcalendar.getTrainingid());
		trainingcalendarImpl.setName(trainingcalendar.getName());

		return trainingcalendarImpl;
	}

	/**
	 * Returns the trainingcalendar with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the trainingcalendar
	 * @return the trainingcalendar
	 * @throws NoSuchtrainingcalendarException if a trainingcalendar with the primary key could not be found
	 */
	@Override
	public trainingcalendar findByPrimaryKey(Serializable primaryKey)
		throws NoSuchtrainingcalendarException {
		trainingcalendar trainingcalendar = fetchByPrimaryKey(primaryKey);

		if (trainingcalendar == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchtrainingcalendarException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return trainingcalendar;
	}

	/**
	 * Returns the trainingcalendar with the primary key or throws a {@link NoSuchtrainingcalendarException} if it could not be found.
	 *
	 * @param trainingid the primary key of the trainingcalendar
	 * @return the trainingcalendar
	 * @throws NoSuchtrainingcalendarException if a trainingcalendar with the primary key could not be found
	 */
	@Override
	public trainingcalendar findByPrimaryKey(long trainingid)
		throws NoSuchtrainingcalendarException {
		return findByPrimaryKey((Serializable)trainingid);
	}

	/**
	 * Returns the trainingcalendar with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the trainingcalendar
	 * @return the trainingcalendar, or <code>null</code> if a trainingcalendar with the primary key could not be found
	 */
	@Override
	public trainingcalendar fetchByPrimaryKey(Serializable primaryKey) {
		trainingcalendar trainingcalendar = (trainingcalendar)entityCache.getResult(trainingcalendarModelImpl.ENTITY_CACHE_ENABLED,
				trainingcalendarImpl.class, primaryKey);

		if (trainingcalendar == _nulltrainingcalendar) {
			return null;
		}

		if (trainingcalendar == null) {
			Session session = null;

			try {
				session = openSession();

				trainingcalendar = (trainingcalendar)session.get(trainingcalendarImpl.class,
						primaryKey);

				if (trainingcalendar != null) {
					cacheResult(trainingcalendar);
				}
				else {
					entityCache.putResult(trainingcalendarModelImpl.ENTITY_CACHE_ENABLED,
						trainingcalendarImpl.class, primaryKey,
						_nulltrainingcalendar);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(trainingcalendarModelImpl.ENTITY_CACHE_ENABLED,
					trainingcalendarImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return trainingcalendar;
	}

	/**
	 * Returns the trainingcalendar with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param trainingid the primary key of the trainingcalendar
	 * @return the trainingcalendar, or <code>null</code> if a trainingcalendar with the primary key could not be found
	 */
	@Override
	public trainingcalendar fetchByPrimaryKey(long trainingid) {
		return fetchByPrimaryKey((Serializable)trainingid);
	}

	@Override
	public Map<Serializable, trainingcalendar> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, trainingcalendar> map = new HashMap<Serializable, trainingcalendar>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			trainingcalendar trainingcalendar = fetchByPrimaryKey(primaryKey);

			if (trainingcalendar != null) {
				map.put(primaryKey, trainingcalendar);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			trainingcalendar trainingcalendar = (trainingcalendar)entityCache.getResult(trainingcalendarModelImpl.ENTITY_CACHE_ENABLED,
					trainingcalendarImpl.class, primaryKey);

			if (trainingcalendar == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, trainingcalendar);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TRAININGCALENDAR_WHERE_PKS_IN);

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

			for (trainingcalendar trainingcalendar : (List<trainingcalendar>)q.list()) {
				map.put(trainingcalendar.getPrimaryKeyObj(), trainingcalendar);

				cacheResult(trainingcalendar);

				uncachedPrimaryKeys.remove(trainingcalendar.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(trainingcalendarModelImpl.ENTITY_CACHE_ENABLED,
					trainingcalendarImpl.class, primaryKey,
					_nulltrainingcalendar);
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
	 * Returns all the trainingcalendars.
	 *
	 * @return the trainingcalendars
	 */
	@Override
	public List<trainingcalendar> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the trainingcalendars.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of trainingcalendars
	 * @param end the upper bound of the range of trainingcalendars (not inclusive)
	 * @return the range of trainingcalendars
	 */
	@Override
	public List<trainingcalendar> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the trainingcalendars.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of trainingcalendars
	 * @param end the upper bound of the range of trainingcalendars (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of trainingcalendars
	 */
	@Override
	public List<trainingcalendar> findAll(int start, int end,
		OrderByComparator<trainingcalendar> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the trainingcalendars.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcalendarModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of trainingcalendars
	 * @param end the upper bound of the range of trainingcalendars (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of trainingcalendars
	 */
	@Override
	public List<trainingcalendar> findAll(int start, int end,
		OrderByComparator<trainingcalendar> orderByComparator,
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

		List<trainingcalendar> list = null;

		if (retrieveFromCache) {
			list = (List<trainingcalendar>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TRAININGCALENDAR);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TRAININGCALENDAR;

				if (pagination) {
					sql = sql.concat(trainingcalendarModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<trainingcalendar>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<trainingcalendar>)QueryUtil.list(q,
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
	 * Removes all the trainingcalendars from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (trainingcalendar trainingcalendar : findAll()) {
			remove(trainingcalendar);
		}
	}

	/**
	 * Returns the number of trainingcalendars.
	 *
	 * @return the number of trainingcalendars
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TRAININGCALENDAR);

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
		return trainingcalendarModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the trainingcalendar persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(trainingcalendarImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_TRAININGCALENDAR = "SELECT trainingcalendar FROM trainingcalendar trainingcalendar";
	private static final String _SQL_SELECT_TRAININGCALENDAR_WHERE_PKS_IN = "SELECT trainingcalendar FROM trainingcalendar trainingcalendar WHERE trainingid IN (";
	private static final String _SQL_COUNT_TRAININGCALENDAR = "SELECT COUNT(trainingcalendar) FROM trainingcalendar trainingcalendar";
	private static final String _ORDER_BY_ENTITY_ALIAS = "trainingcalendar.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No trainingcalendar exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(trainingcalendarPersistenceImpl.class);
	private static final trainingcalendar _nulltrainingcalendar = new trainingcalendarImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<trainingcalendar> toCacheModel() {
				return _nulltrainingcalendarCacheModel;
			}
		};

	private static final CacheModel<trainingcalendar> _nulltrainingcalendarCacheModel =
		new CacheModel<trainingcalendar>() {
			@Override
			public trainingcalendar toEntityModel() {
				return _nulltrainingcalendar;
			}
		};
}