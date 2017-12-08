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

package com.branchdetails.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.branchdetails.exception.NoSuchcityException;

import com.branchdetails.model.city;
import com.branchdetails.model.impl.cityImpl;
import com.branchdetails.model.impl.cityModelImpl;

import com.branchdetails.service.persistence.cityPersistence;

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
 * The persistence implementation for the city service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see cityPersistence
 * @see com.branchdetails.service.persistence.cityUtil
 * @generated
 */
@ProviderType
public class cityPersistenceImpl extends BasePersistenceImpl<city>
	implements cityPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link cityUtil} to access the city persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = cityImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(cityModelImpl.ENTITY_CACHE_ENABLED,
			cityModelImpl.FINDER_CACHE_ENABLED, cityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(cityModelImpl.ENTITY_CACHE_ENABLED,
			cityModelImpl.FINDER_CACHE_ENABLED, cityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(cityModelImpl.ENTITY_CACHE_ENABLED,
			cityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public cityPersistenceImpl() {
		setModelClass(city.class);
	}

	/**
	 * Caches the city in the entity cache if it is enabled.
	 *
	 * @param city the city
	 */
	@Override
	public void cacheResult(city city) {
		entityCache.putResult(cityModelImpl.ENTITY_CACHE_ENABLED,
			cityImpl.class, city.getPrimaryKey(), city);

		city.resetOriginalValues();
	}

	/**
	 * Caches the cities in the entity cache if it is enabled.
	 *
	 * @param cities the cities
	 */
	@Override
	public void cacheResult(List<city> cities) {
		for (city city : cities) {
			if (entityCache.getResult(cityModelImpl.ENTITY_CACHE_ENABLED,
						cityImpl.class, city.getPrimaryKey()) == null) {
				cacheResult(city);
			}
			else {
				city.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cities.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(cityImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the city.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(city city) {
		entityCache.removeResult(cityModelImpl.ENTITY_CACHE_ENABLED,
			cityImpl.class, city.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<city> cities) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (city city : cities) {
			entityCache.removeResult(cityModelImpl.ENTITY_CACHE_ENABLED,
				cityImpl.class, city.getPrimaryKey());
		}
	}

	/**
	 * Creates a new city with the primary key. Does not add the city to the database.
	 *
	 * @param city_id the primary key for the new city
	 * @return the new city
	 */
	@Override
	public city create(long city_id) {
		city city = new cityImpl();

		city.setNew(true);
		city.setPrimaryKey(city_id);

		return city;
	}

	/**
	 * Removes the city with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param city_id the primary key of the city
	 * @return the city that was removed
	 * @throws NoSuchcityException if a city with the primary key could not be found
	 */
	@Override
	public city remove(long city_id) throws NoSuchcityException {
		return remove((Serializable)city_id);
	}

	/**
	 * Removes the city with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the city
	 * @return the city that was removed
	 * @throws NoSuchcityException if a city with the primary key could not be found
	 */
	@Override
	public city remove(Serializable primaryKey) throws NoSuchcityException {
		Session session = null;

		try {
			session = openSession();

			city city = (city)session.get(cityImpl.class, primaryKey);

			if (city == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(city);
		}
		catch (NoSuchcityException nsee) {
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
	protected city removeImpl(city city) {
		city = toUnwrappedModel(city);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(city)) {
				city = (city)session.get(cityImpl.class, city.getPrimaryKeyObj());
			}

			if (city != null) {
				session.delete(city);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (city != null) {
			clearCache(city);
		}

		return city;
	}

	@Override
	public city updateImpl(city city) {
		city = toUnwrappedModel(city);

		boolean isNew = city.isNew();

		Session session = null;

		try {
			session = openSession();

			if (city.isNew()) {
				session.save(city);

				city.setNew(false);
			}
			else {
				city = (city)session.merge(city);
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

		entityCache.putResult(cityModelImpl.ENTITY_CACHE_ENABLED,
			cityImpl.class, city.getPrimaryKey(), city, false);

		city.resetOriginalValues();

		return city;
	}

	protected city toUnwrappedModel(city city) {
		if (city instanceof cityImpl) {
			return city;
		}

		cityImpl cityImpl = new cityImpl();

		cityImpl.setNew(city.isNew());
		cityImpl.setPrimaryKey(city.getPrimaryKey());

		cityImpl.setCity_id(city.getCity_id());
		cityImpl.setCity_name(city.getCity_name());
		cityImpl.setState_id(city.getState_id());

		return cityImpl;
	}

	/**
	 * Returns the city with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the city
	 * @return the city
	 * @throws NoSuchcityException if a city with the primary key could not be found
	 */
	@Override
	public city findByPrimaryKey(Serializable primaryKey)
		throws NoSuchcityException {
		city city = fetchByPrimaryKey(primaryKey);

		if (city == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return city;
	}

	/**
	 * Returns the city with the primary key or throws a {@link NoSuchcityException} if it could not be found.
	 *
	 * @param city_id the primary key of the city
	 * @return the city
	 * @throws NoSuchcityException if a city with the primary key could not be found
	 */
	@Override
	public city findByPrimaryKey(long city_id) throws NoSuchcityException {
		return findByPrimaryKey((Serializable)city_id);
	}

	/**
	 * Returns the city with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the city
	 * @return the city, or <code>null</code> if a city with the primary key could not be found
	 */
	@Override
	public city fetchByPrimaryKey(Serializable primaryKey) {
		city city = (city)entityCache.getResult(cityModelImpl.ENTITY_CACHE_ENABLED,
				cityImpl.class, primaryKey);

		if (city == _nullcity) {
			return null;
		}

		if (city == null) {
			Session session = null;

			try {
				session = openSession();

				city = (city)session.get(cityImpl.class, primaryKey);

				if (city != null) {
					cacheResult(city);
				}
				else {
					entityCache.putResult(cityModelImpl.ENTITY_CACHE_ENABLED,
						cityImpl.class, primaryKey, _nullcity);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(cityModelImpl.ENTITY_CACHE_ENABLED,
					cityImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return city;
	}

	/**
	 * Returns the city with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param city_id the primary key of the city
	 * @return the city, or <code>null</code> if a city with the primary key could not be found
	 */
	@Override
	public city fetchByPrimaryKey(long city_id) {
		return fetchByPrimaryKey((Serializable)city_id);
	}

	@Override
	public Map<Serializable, city> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, city> map = new HashMap<Serializable, city>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			city city = fetchByPrimaryKey(primaryKey);

			if (city != null) {
				map.put(primaryKey, city);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			city city = (city)entityCache.getResult(cityModelImpl.ENTITY_CACHE_ENABLED,
					cityImpl.class, primaryKey);

			if (city == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, city);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CITY_WHERE_PKS_IN);

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

			for (city city : (List<city>)q.list()) {
				map.put(city.getPrimaryKeyObj(), city);

				cacheResult(city);

				uncachedPrimaryKeys.remove(city.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(cityModelImpl.ENTITY_CACHE_ENABLED,
					cityImpl.class, primaryKey, _nullcity);
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
	 * Returns all the cities.
	 *
	 * @return the cities
	 */
	@Override
	public List<city> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cities
	 * @param end the upper bound of the range of cities (not inclusive)
	 * @return the range of cities
	 */
	@Override
	public List<city> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cities
	 * @param end the upper bound of the range of cities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cities
	 */
	@Override
	public List<city> findAll(int start, int end,
		OrderByComparator<city> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cities
	 * @param end the upper bound of the range of cities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of cities
	 */
	@Override
	public List<city> findAll(int start, int end,
		OrderByComparator<city> orderByComparator, boolean retrieveFromCache) {
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

		List<city> list = null;

		if (retrieveFromCache) {
			list = (List<city>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CITY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CITY;

				if (pagination) {
					sql = sql.concat(cityModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<city>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<city>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the cities from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (city city : findAll()) {
			remove(city);
		}
	}

	/**
	 * Returns the number of cities.
	 *
	 * @return the number of cities
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CITY);

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
		return cityModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the city persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(cityImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_CITY = "SELECT city FROM city city";
	private static final String _SQL_SELECT_CITY_WHERE_PKS_IN = "SELECT city FROM city city WHERE city_id IN (";
	private static final String _SQL_COUNT_CITY = "SELECT COUNT(city) FROM city city";
	private static final String _ORDER_BY_ENTITY_ALIAS = "city.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No city exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(cityPersistenceImpl.class);
	private static final city _nullcity = new cityImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<city> toCacheModel() {
				return _nullcityCacheModel;
			}
		};

	private static final CacheModel<city> _nullcityCacheModel = new CacheModel<city>() {
			@Override
			public city toEntityModel() {
				return _nullcity;
			}
		};
}