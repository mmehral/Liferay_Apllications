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

package com.chola.news.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.news.exception.NoSuchAround_WorldException;
import com.chola.news.model.Around_World;
import com.chola.news.model.impl.Around_WorldImpl;
import com.chola.news.model.impl.Around_WorldModelImpl;
import com.chola.news.service.persistence.Around_WorldPersistence;

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
 * The persistence implementation for the around_ world service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see Around_WorldPersistence
 * @see com.chola.news.service.persistence.Around_WorldUtil
 * @generated
 */
@ProviderType
public class Around_WorldPersistenceImpl extends BasePersistenceImpl<Around_World>
	implements Around_WorldPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link Around_WorldUtil} to access the around_ world persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = Around_WorldImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Around_WorldModelImpl.ENTITY_CACHE_ENABLED,
			Around_WorldModelImpl.FINDER_CACHE_ENABLED, Around_WorldImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Around_WorldModelImpl.ENTITY_CACHE_ENABLED,
			Around_WorldModelImpl.FINDER_CACHE_ENABLED, Around_WorldImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Around_WorldModelImpl.ENTITY_CACHE_ENABLED,
			Around_WorldModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public Around_WorldPersistenceImpl() {
		setModelClass(Around_World.class);
	}

	/**
	 * Caches the around_ world in the entity cache if it is enabled.
	 *
	 * @param around_World the around_ world
	 */
	@Override
	public void cacheResult(Around_World around_World) {
		entityCache.putResult(Around_WorldModelImpl.ENTITY_CACHE_ENABLED,
			Around_WorldImpl.class, around_World.getPrimaryKey(), around_World);

		around_World.resetOriginalValues();
	}

	/**
	 * Caches the around_ worlds in the entity cache if it is enabled.
	 *
	 * @param around_Worlds the around_ worlds
	 */
	@Override
	public void cacheResult(List<Around_World> around_Worlds) {
		for (Around_World around_World : around_Worlds) {
			if (entityCache.getResult(
						Around_WorldModelImpl.ENTITY_CACHE_ENABLED,
						Around_WorldImpl.class, around_World.getPrimaryKey()) == null) {
				cacheResult(around_World);
			}
			else {
				around_World.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all around_ worlds.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(Around_WorldImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the around_ world.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Around_World around_World) {
		entityCache.removeResult(Around_WorldModelImpl.ENTITY_CACHE_ENABLED,
			Around_WorldImpl.class, around_World.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Around_World> around_Worlds) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Around_World around_World : around_Worlds) {
			entityCache.removeResult(Around_WorldModelImpl.ENTITY_CACHE_ENABLED,
				Around_WorldImpl.class, around_World.getPrimaryKey());
		}
	}

	/**
	 * Creates a new around_ world with the primary key. Does not add the around_ world to the database.
	 *
	 * @param id the primary key for the new around_ world
	 * @return the new around_ world
	 */
	@Override
	public Around_World create(long id) {
		Around_World around_World = new Around_WorldImpl();

		around_World.setNew(true);
		around_World.setPrimaryKey(id);

		return around_World;
	}

	/**
	 * Removes the around_ world with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the around_ world
	 * @return the around_ world that was removed
	 * @throws NoSuchAround_WorldException if a around_ world with the primary key could not be found
	 */
	@Override
	public Around_World remove(long id) throws NoSuchAround_WorldException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the around_ world with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the around_ world
	 * @return the around_ world that was removed
	 * @throws NoSuchAround_WorldException if a around_ world with the primary key could not be found
	 */
	@Override
	public Around_World remove(Serializable primaryKey)
		throws NoSuchAround_WorldException {
		Session session = null;

		try {
			session = openSession();

			Around_World around_World = (Around_World)session.get(Around_WorldImpl.class,
					primaryKey);

			if (around_World == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAround_WorldException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(around_World);
		}
		catch (NoSuchAround_WorldException nsee) {
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
	protected Around_World removeImpl(Around_World around_World) {
		around_World = toUnwrappedModel(around_World);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(around_World)) {
				around_World = (Around_World)session.get(Around_WorldImpl.class,
						around_World.getPrimaryKeyObj());
			}

			if (around_World != null) {
				session.delete(around_World);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (around_World != null) {
			clearCache(around_World);
		}

		return around_World;
	}

	@Override
	public Around_World updateImpl(Around_World around_World) {
		around_World = toUnwrappedModel(around_World);

		boolean isNew = around_World.isNew();

		Session session = null;

		try {
			session = openSession();

			if (around_World.isNew()) {
				session.save(around_World);

				around_World.setNew(false);
			}
			else {
				around_World = (Around_World)session.merge(around_World);
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

		entityCache.putResult(Around_WorldModelImpl.ENTITY_CACHE_ENABLED,
			Around_WorldImpl.class, around_World.getPrimaryKey(), around_World,
			false);

		around_World.resetOriginalValues();

		return around_World;
	}

	protected Around_World toUnwrappedModel(Around_World around_World) {
		if (around_World instanceof Around_WorldImpl) {
			return around_World;
		}

		Around_WorldImpl around_WorldImpl = new Around_WorldImpl();

		around_WorldImpl.setNew(around_World.isNew());
		around_WorldImpl.setPrimaryKey(around_World.getPrimaryKey());

		around_WorldImpl.setId(around_World.getId());
		around_WorldImpl.setNews(around_World.getNews());

		return around_WorldImpl;
	}

	/**
	 * Returns the around_ world with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the around_ world
	 * @return the around_ world
	 * @throws NoSuchAround_WorldException if a around_ world with the primary key could not be found
	 */
	@Override
	public Around_World findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAround_WorldException {
		Around_World around_World = fetchByPrimaryKey(primaryKey);

		if (around_World == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAround_WorldException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return around_World;
	}

	/**
	 * Returns the around_ world with the primary key or throws a {@link NoSuchAround_WorldException} if it could not be found.
	 *
	 * @param id the primary key of the around_ world
	 * @return the around_ world
	 * @throws NoSuchAround_WorldException if a around_ world with the primary key could not be found
	 */
	@Override
	public Around_World findByPrimaryKey(long id)
		throws NoSuchAround_WorldException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the around_ world with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the around_ world
	 * @return the around_ world, or <code>null</code> if a around_ world with the primary key could not be found
	 */
	@Override
	public Around_World fetchByPrimaryKey(Serializable primaryKey) {
		Around_World around_World = (Around_World)entityCache.getResult(Around_WorldModelImpl.ENTITY_CACHE_ENABLED,
				Around_WorldImpl.class, primaryKey);

		if (around_World == _nullAround_World) {
			return null;
		}

		if (around_World == null) {
			Session session = null;

			try {
				session = openSession();

				around_World = (Around_World)session.get(Around_WorldImpl.class,
						primaryKey);

				if (around_World != null) {
					cacheResult(around_World);
				}
				else {
					entityCache.putResult(Around_WorldModelImpl.ENTITY_CACHE_ENABLED,
						Around_WorldImpl.class, primaryKey, _nullAround_World);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(Around_WorldModelImpl.ENTITY_CACHE_ENABLED,
					Around_WorldImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return around_World;
	}

	/**
	 * Returns the around_ world with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the around_ world
	 * @return the around_ world, or <code>null</code> if a around_ world with the primary key could not be found
	 */
	@Override
	public Around_World fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, Around_World> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Around_World> map = new HashMap<Serializable, Around_World>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Around_World around_World = fetchByPrimaryKey(primaryKey);

			if (around_World != null) {
				map.put(primaryKey, around_World);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Around_World around_World = (Around_World)entityCache.getResult(Around_WorldModelImpl.ENTITY_CACHE_ENABLED,
					Around_WorldImpl.class, primaryKey);

			if (around_World == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, around_World);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_AROUND_WORLD_WHERE_PKS_IN);

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

			for (Around_World around_World : (List<Around_World>)q.list()) {
				map.put(around_World.getPrimaryKeyObj(), around_World);

				cacheResult(around_World);

				uncachedPrimaryKeys.remove(around_World.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(Around_WorldModelImpl.ENTITY_CACHE_ENABLED,
					Around_WorldImpl.class, primaryKey, _nullAround_World);
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
	 * Returns all the around_ worlds.
	 *
	 * @return the around_ worlds
	 */
	@Override
	public List<Around_World> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the around_ worlds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Around_WorldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of around_ worlds
	 * @param end the upper bound of the range of around_ worlds (not inclusive)
	 * @return the range of around_ worlds
	 */
	@Override
	public List<Around_World> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the around_ worlds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Around_WorldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of around_ worlds
	 * @param end the upper bound of the range of around_ worlds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of around_ worlds
	 */
	@Override
	public List<Around_World> findAll(int start, int end,
		OrderByComparator<Around_World> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the around_ worlds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Around_WorldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of around_ worlds
	 * @param end the upper bound of the range of around_ worlds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of around_ worlds
	 */
	@Override
	public List<Around_World> findAll(int start, int end,
		OrderByComparator<Around_World> orderByComparator,
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

		List<Around_World> list = null;

		if (retrieveFromCache) {
			list = (List<Around_World>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_AROUND_WORLD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_AROUND_WORLD;

				if (pagination) {
					sql = sql.concat(Around_WorldModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Around_World>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Around_World>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the around_ worlds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Around_World around_World : findAll()) {
			remove(around_World);
		}
	}

	/**
	 * Returns the number of around_ worlds.
	 *
	 * @return the number of around_ worlds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_AROUND_WORLD);

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
		return Around_WorldModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the around_ world persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(Around_WorldImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_AROUND_WORLD = "SELECT around_World FROM Around_World around_World";
	private static final String _SQL_SELECT_AROUND_WORLD_WHERE_PKS_IN = "SELECT around_World FROM Around_World around_World WHERE id_ IN (";
	private static final String _SQL_COUNT_AROUND_WORLD = "SELECT COUNT(around_World) FROM Around_World around_World";
	private static final String _ORDER_BY_ENTITY_ALIAS = "around_World.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Around_World exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(Around_WorldPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final Around_World _nullAround_World = new Around_WorldImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Around_World> toCacheModel() {
				return _nullAround_WorldCacheModel;
			}
		};

	private static final CacheModel<Around_World> _nullAround_WorldCacheModel = new CacheModel<Around_World>() {
			@Override
			public Around_World toEntityModel() {
				return _nullAround_World;
			}
		};
}