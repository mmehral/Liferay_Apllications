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

package com.chola.service.conference.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.service.conference.exception.NoSuchlocationException;
import com.chola.service.conference.model.impl.locationImpl;
import com.chola.service.conference.model.impl.locationModelImpl;
import com.chola.service.conference.model.location;
import com.chola.service.conference.service.persistence.locationPersistence;

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
 * The persistence implementation for the location service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see locationPersistence
 * @see com.chola.service.conference.service.persistence.locationUtil
 * @generated
 */
@ProviderType
public class locationPersistenceImpl extends BasePersistenceImpl<location>
	implements locationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link locationUtil} to access the location persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = locationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(locationModelImpl.ENTITY_CACHE_ENABLED,
			locationModelImpl.FINDER_CACHE_ENABLED, locationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(locationModelImpl.ENTITY_CACHE_ENABLED,
			locationModelImpl.FINDER_CACHE_ENABLED, locationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(locationModelImpl.ENTITY_CACHE_ENABLED,
			locationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public locationPersistenceImpl() {
		setModelClass(location.class);
	}

	/**
	 * Caches the location in the entity cache if it is enabled.
	 *
	 * @param location the location
	 */
	@Override
	public void cacheResult(location location) {
		entityCache.putResult(locationModelImpl.ENTITY_CACHE_ENABLED,
			locationImpl.class, location.getPrimaryKey(), location);

		location.resetOriginalValues();
	}

	/**
	 * Caches the locations in the entity cache if it is enabled.
	 *
	 * @param locations the locations
	 */
	@Override
	public void cacheResult(List<location> locations) {
		for (location location : locations) {
			if (entityCache.getResult(locationModelImpl.ENTITY_CACHE_ENABLED,
						locationImpl.class, location.getPrimaryKey()) == null) {
				cacheResult(location);
			}
			else {
				location.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all locations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(locationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the location.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(location location) {
		entityCache.removeResult(locationModelImpl.ENTITY_CACHE_ENABLED,
			locationImpl.class, location.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<location> locations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (location location : locations) {
			entityCache.removeResult(locationModelImpl.ENTITY_CACHE_ENABLED,
				locationImpl.class, location.getPrimaryKey());
		}
	}

	/**
	 * Creates a new location with the primary key. Does not add the location to the database.
	 *
	 * @param location_id the primary key for the new location
	 * @return the new location
	 */
	@Override
	public location create(long location_id) {
		location location = new locationImpl();

		location.setNew(true);
		location.setPrimaryKey(location_id);

		return location;
	}

	/**
	 * Removes the location with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param location_id the primary key of the location
	 * @return the location that was removed
	 * @throws NoSuchlocationException if a location with the primary key could not be found
	 */
	@Override
	public location remove(long location_id) throws NoSuchlocationException {
		return remove((Serializable)location_id);
	}

	/**
	 * Removes the location with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the location
	 * @return the location that was removed
	 * @throws NoSuchlocationException if a location with the primary key could not be found
	 */
	@Override
	public location remove(Serializable primaryKey)
		throws NoSuchlocationException {
		Session session = null;

		try {
			session = openSession();

			location location = (location)session.get(locationImpl.class,
					primaryKey);

			if (location == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchlocationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(location);
		}
		catch (NoSuchlocationException nsee) {
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
	protected location removeImpl(location location) {
		location = toUnwrappedModel(location);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(location)) {
				location = (location)session.get(locationImpl.class,
						location.getPrimaryKeyObj());
			}

			if (location != null) {
				session.delete(location);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (location != null) {
			clearCache(location);
		}

		return location;
	}

	@Override
	public location updateImpl(location location) {
		location = toUnwrappedModel(location);

		boolean isNew = location.isNew();

		Session session = null;

		try {
			session = openSession();

			if (location.isNew()) {
				session.save(location);

				location.setNew(false);
			}
			else {
				location = (location)session.merge(location);
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

		entityCache.putResult(locationModelImpl.ENTITY_CACHE_ENABLED,
			locationImpl.class, location.getPrimaryKey(), location, false);

		location.resetOriginalValues();

		return location;
	}

	protected location toUnwrappedModel(location location) {
		if (location instanceof locationImpl) {
			return location;
		}

		locationImpl locationImpl = new locationImpl();

		locationImpl.setNew(location.isNew());
		locationImpl.setPrimaryKey(location.getPrimaryKey());

		locationImpl.setLocation_id(location.getLocation_id());
		locationImpl.setLocation_name(location.getLocation_name());
		locationImpl.setState_id(location.getState_id());

		return locationImpl;
	}

	/**
	 * Returns the location with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the location
	 * @return the location
	 * @throws NoSuchlocationException if a location with the primary key could not be found
	 */
	@Override
	public location findByPrimaryKey(Serializable primaryKey)
		throws NoSuchlocationException {
		location location = fetchByPrimaryKey(primaryKey);

		if (location == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchlocationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return location;
	}

	/**
	 * Returns the location with the primary key or throws a {@link NoSuchlocationException} if it could not be found.
	 *
	 * @param location_id the primary key of the location
	 * @return the location
	 * @throws NoSuchlocationException if a location with the primary key could not be found
	 */
	@Override
	public location findByPrimaryKey(long location_id)
		throws NoSuchlocationException {
		return findByPrimaryKey((Serializable)location_id);
	}

	/**
	 * Returns the location with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the location
	 * @return the location, or <code>null</code> if a location with the primary key could not be found
	 */
	@Override
	public location fetchByPrimaryKey(Serializable primaryKey) {
		location location = (location)entityCache.getResult(locationModelImpl.ENTITY_CACHE_ENABLED,
				locationImpl.class, primaryKey);

		if (location == _nulllocation) {
			return null;
		}

		if (location == null) {
			Session session = null;

			try {
				session = openSession();

				location = (location)session.get(locationImpl.class, primaryKey);

				if (location != null) {
					cacheResult(location);
				}
				else {
					entityCache.putResult(locationModelImpl.ENTITY_CACHE_ENABLED,
						locationImpl.class, primaryKey, _nulllocation);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(locationModelImpl.ENTITY_CACHE_ENABLED,
					locationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return location;
	}

	/**
	 * Returns the location with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param location_id the primary key of the location
	 * @return the location, or <code>null</code> if a location with the primary key could not be found
	 */
	@Override
	public location fetchByPrimaryKey(long location_id) {
		return fetchByPrimaryKey((Serializable)location_id);
	}

	@Override
	public Map<Serializable, location> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, location> map = new HashMap<Serializable, location>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			location location = fetchByPrimaryKey(primaryKey);

			if (location != null) {
				map.put(primaryKey, location);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			location location = (location)entityCache.getResult(locationModelImpl.ENTITY_CACHE_ENABLED,
					locationImpl.class, primaryKey);

			if (location == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, location);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_LOCATION_WHERE_PKS_IN);

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

			for (location location : (List<location>)q.list()) {
				map.put(location.getPrimaryKeyObj(), location);

				cacheResult(location);

				uncachedPrimaryKeys.remove(location.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(locationModelImpl.ENTITY_CACHE_ENABLED,
					locationImpl.class, primaryKey, _nulllocation);
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
	 * Returns all the locations.
	 *
	 * @return the locations
	 */
	@Override
	public List<location> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the locations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link locationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of locations
	 * @param end the upper bound of the range of locations (not inclusive)
	 * @return the range of locations
	 */
	@Override
	public List<location> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the locations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link locationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of locations
	 * @param end the upper bound of the range of locations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of locations
	 */
	@Override
	public List<location> findAll(int start, int end,
		OrderByComparator<location> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the locations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link locationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of locations
	 * @param end the upper bound of the range of locations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of locations
	 */
	@Override
	public List<location> findAll(int start, int end,
		OrderByComparator<location> orderByComparator, boolean retrieveFromCache) {
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

		List<location> list = null;

		if (retrieveFromCache) {
			list = (List<location>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_LOCATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LOCATION;

				if (pagination) {
					sql = sql.concat(locationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<location>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<location>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the locations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (location location : findAll()) {
			remove(location);
		}
	}

	/**
	 * Returns the number of locations.
	 *
	 * @return the number of locations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LOCATION);

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
		return locationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the location persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(locationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_LOCATION = "SELECT location FROM location location";
	private static final String _SQL_SELECT_LOCATION_WHERE_PKS_IN = "SELECT location FROM location location WHERE location_id IN (";
	private static final String _SQL_COUNT_LOCATION = "SELECT COUNT(location) FROM location location";
	private static final String _ORDER_BY_ENTITY_ALIAS = "location.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No location exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(locationPersistenceImpl.class);
	private static final location _nulllocation = new locationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<location> toCacheModel() {
				return _nulllocationCacheModel;
			}
		};

	private static final CacheModel<location> _nulllocationCacheModel = new CacheModel<location>() {
			@Override
			public location toEntityModel() {
				return _nulllocation;
			}
		};
}