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

package com.chola.quarterly.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.quarterly.exception.NoSuchpressreleaseException;
import com.chola.quarterly.model.impl.pressreleaseImpl;
import com.chola.quarterly.model.impl.pressreleaseModelImpl;
import com.chola.quarterly.model.pressrelease;
import com.chola.quarterly.service.persistence.pressreleasePersistence;

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
 * The persistence implementation for the pressrelease service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see pressreleasePersistence
 * @see com.chola.quarterly.service.persistence.pressreleaseUtil
 * @generated
 */
@ProviderType
public class pressreleasePersistenceImpl extends BasePersistenceImpl<pressrelease>
	implements pressreleasePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link pressreleaseUtil} to access the pressrelease persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = pressreleaseImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(pressreleaseModelImpl.ENTITY_CACHE_ENABLED,
			pressreleaseModelImpl.FINDER_CACHE_ENABLED, pressreleaseImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(pressreleaseModelImpl.ENTITY_CACHE_ENABLED,
			pressreleaseModelImpl.FINDER_CACHE_ENABLED, pressreleaseImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(pressreleaseModelImpl.ENTITY_CACHE_ENABLED,
			pressreleaseModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public pressreleasePersistenceImpl() {
		setModelClass(pressrelease.class);
	}

	/**
	 * Caches the pressrelease in the entity cache if it is enabled.
	 *
	 * @param pressrelease the pressrelease
	 */
	@Override
	public void cacheResult(pressrelease pressrelease) {
		entityCache.putResult(pressreleaseModelImpl.ENTITY_CACHE_ENABLED,
			pressreleaseImpl.class, pressrelease.getPrimaryKey(), pressrelease);

		pressrelease.resetOriginalValues();
	}

	/**
	 * Caches the pressreleases in the entity cache if it is enabled.
	 *
	 * @param pressreleases the pressreleases
	 */
	@Override
	public void cacheResult(List<pressrelease> pressreleases) {
		for (pressrelease pressrelease : pressreleases) {
			if (entityCache.getResult(
						pressreleaseModelImpl.ENTITY_CACHE_ENABLED,
						pressreleaseImpl.class, pressrelease.getPrimaryKey()) == null) {
				cacheResult(pressrelease);
			}
			else {
				pressrelease.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all pressreleases.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(pressreleaseImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the pressrelease.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(pressrelease pressrelease) {
		entityCache.removeResult(pressreleaseModelImpl.ENTITY_CACHE_ENABLED,
			pressreleaseImpl.class, pressrelease.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<pressrelease> pressreleases) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (pressrelease pressrelease : pressreleases) {
			entityCache.removeResult(pressreleaseModelImpl.ENTITY_CACHE_ENABLED,
				pressreleaseImpl.class, pressrelease.getPrimaryKey());
		}
	}

	/**
	 * Creates a new pressrelease with the primary key. Does not add the pressrelease to the database.
	 *
	 * @param id the primary key for the new pressrelease
	 * @return the new pressrelease
	 */
	@Override
	public pressrelease create(long id) {
		pressrelease pressrelease = new pressreleaseImpl();

		pressrelease.setNew(true);
		pressrelease.setPrimaryKey(id);

		return pressrelease;
	}

	/**
	 * Removes the pressrelease with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the pressrelease
	 * @return the pressrelease that was removed
	 * @throws NoSuchpressreleaseException if a pressrelease with the primary key could not be found
	 */
	@Override
	public pressrelease remove(long id) throws NoSuchpressreleaseException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the pressrelease with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pressrelease
	 * @return the pressrelease that was removed
	 * @throws NoSuchpressreleaseException if a pressrelease with the primary key could not be found
	 */
	@Override
	public pressrelease remove(Serializable primaryKey)
		throws NoSuchpressreleaseException {
		Session session = null;

		try {
			session = openSession();

			pressrelease pressrelease = (pressrelease)session.get(pressreleaseImpl.class,
					primaryKey);

			if (pressrelease == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchpressreleaseException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(pressrelease);
		}
		catch (NoSuchpressreleaseException nsee) {
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
	protected pressrelease removeImpl(pressrelease pressrelease) {
		pressrelease = toUnwrappedModel(pressrelease);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pressrelease)) {
				pressrelease = (pressrelease)session.get(pressreleaseImpl.class,
						pressrelease.getPrimaryKeyObj());
			}

			if (pressrelease != null) {
				session.delete(pressrelease);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (pressrelease != null) {
			clearCache(pressrelease);
		}

		return pressrelease;
	}

	@Override
	public pressrelease updateImpl(pressrelease pressrelease) {
		pressrelease = toUnwrappedModel(pressrelease);

		boolean isNew = pressrelease.isNew();

		Session session = null;

		try {
			session = openSession();

			if (pressrelease.isNew()) {
				session.save(pressrelease);

				pressrelease.setNew(false);
			}
			else {
				pressrelease = (pressrelease)session.merge(pressrelease);
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

		entityCache.putResult(pressreleaseModelImpl.ENTITY_CACHE_ENABLED,
			pressreleaseImpl.class, pressrelease.getPrimaryKey(), pressrelease,
			false);

		pressrelease.resetOriginalValues();

		return pressrelease;
	}

	protected pressrelease toUnwrappedModel(pressrelease pressrelease) {
		if (pressrelease instanceof pressreleaseImpl) {
			return pressrelease;
		}

		pressreleaseImpl pressreleaseImpl = new pressreleaseImpl();

		pressreleaseImpl.setNew(pressrelease.isNew());
		pressreleaseImpl.setPrimaryKey(pressrelease.getPrimaryKey());

		pressreleaseImpl.setId(pressrelease.getId());
		pressreleaseImpl.setDetails(pressrelease.getDetails());
		pressreleaseImpl.setUpdatedon(pressrelease.getUpdatedon());
		pressreleaseImpl.setUpdatedby(pressrelease.getUpdatedby());

		return pressreleaseImpl;
	}

	/**
	 * Returns the pressrelease with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the pressrelease
	 * @return the pressrelease
	 * @throws NoSuchpressreleaseException if a pressrelease with the primary key could not be found
	 */
	@Override
	public pressrelease findByPrimaryKey(Serializable primaryKey)
		throws NoSuchpressreleaseException {
		pressrelease pressrelease = fetchByPrimaryKey(primaryKey);

		if (pressrelease == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchpressreleaseException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return pressrelease;
	}

	/**
	 * Returns the pressrelease with the primary key or throws a {@link NoSuchpressreleaseException} if it could not be found.
	 *
	 * @param id the primary key of the pressrelease
	 * @return the pressrelease
	 * @throws NoSuchpressreleaseException if a pressrelease with the primary key could not be found
	 */
	@Override
	public pressrelease findByPrimaryKey(long id)
		throws NoSuchpressreleaseException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the pressrelease with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pressrelease
	 * @return the pressrelease, or <code>null</code> if a pressrelease with the primary key could not be found
	 */
	@Override
	public pressrelease fetchByPrimaryKey(Serializable primaryKey) {
		pressrelease pressrelease = (pressrelease)entityCache.getResult(pressreleaseModelImpl.ENTITY_CACHE_ENABLED,
				pressreleaseImpl.class, primaryKey);

		if (pressrelease == _nullpressrelease) {
			return null;
		}

		if (pressrelease == null) {
			Session session = null;

			try {
				session = openSession();

				pressrelease = (pressrelease)session.get(pressreleaseImpl.class,
						primaryKey);

				if (pressrelease != null) {
					cacheResult(pressrelease);
				}
				else {
					entityCache.putResult(pressreleaseModelImpl.ENTITY_CACHE_ENABLED,
						pressreleaseImpl.class, primaryKey, _nullpressrelease);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(pressreleaseModelImpl.ENTITY_CACHE_ENABLED,
					pressreleaseImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return pressrelease;
	}

	/**
	 * Returns the pressrelease with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the pressrelease
	 * @return the pressrelease, or <code>null</code> if a pressrelease with the primary key could not be found
	 */
	@Override
	public pressrelease fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, pressrelease> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, pressrelease> map = new HashMap<Serializable, pressrelease>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			pressrelease pressrelease = fetchByPrimaryKey(primaryKey);

			if (pressrelease != null) {
				map.put(primaryKey, pressrelease);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			pressrelease pressrelease = (pressrelease)entityCache.getResult(pressreleaseModelImpl.ENTITY_CACHE_ENABLED,
					pressreleaseImpl.class, primaryKey);

			if (pressrelease == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, pressrelease);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PRESSRELEASE_WHERE_PKS_IN);

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

			for (pressrelease pressrelease : (List<pressrelease>)q.list()) {
				map.put(pressrelease.getPrimaryKeyObj(), pressrelease);

				cacheResult(pressrelease);

				uncachedPrimaryKeys.remove(pressrelease.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(pressreleaseModelImpl.ENTITY_CACHE_ENABLED,
					pressreleaseImpl.class, primaryKey, _nullpressrelease);
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
	 * Returns all the pressreleases.
	 *
	 * @return the pressreleases
	 */
	@Override
	public List<pressrelease> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pressreleases.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pressreleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pressreleases
	 * @param end the upper bound of the range of pressreleases (not inclusive)
	 * @return the range of pressreleases
	 */
	@Override
	public List<pressrelease> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pressreleases.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pressreleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pressreleases
	 * @param end the upper bound of the range of pressreleases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pressreleases
	 */
	@Override
	public List<pressrelease> findAll(int start, int end,
		OrderByComparator<pressrelease> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pressreleases.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link pressreleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of pressreleases
	 * @param end the upper bound of the range of pressreleases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of pressreleases
	 */
	@Override
	public List<pressrelease> findAll(int start, int end,
		OrderByComparator<pressrelease> orderByComparator,
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

		List<pressrelease> list = null;

		if (retrieveFromCache) {
			list = (List<pressrelease>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PRESSRELEASE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PRESSRELEASE;

				if (pagination) {
					sql = sql.concat(pressreleaseModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<pressrelease>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<pressrelease>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the pressreleases from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (pressrelease pressrelease : findAll()) {
			remove(pressrelease);
		}
	}

	/**
	 * Returns the number of pressreleases.
	 *
	 * @return the number of pressreleases
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PRESSRELEASE);

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
		return pressreleaseModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pressrelease persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(pressreleaseImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_PRESSRELEASE = "SELECT pressrelease FROM pressrelease pressrelease";
	private static final String _SQL_SELECT_PRESSRELEASE_WHERE_PKS_IN = "SELECT pressrelease FROM pressrelease pressrelease WHERE id_ IN (";
	private static final String _SQL_COUNT_PRESSRELEASE = "SELECT COUNT(pressrelease) FROM pressrelease pressrelease";
	private static final String _ORDER_BY_ENTITY_ALIAS = "pressrelease.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No pressrelease exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(pressreleasePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final pressrelease _nullpressrelease = new pressreleaseImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<pressrelease> toCacheModel() {
				return _nullpressreleaseCacheModel;
			}
		};

	private static final CacheModel<pressrelease> _nullpressreleaseCacheModel = new CacheModel<pressrelease>() {
			@Override
			public pressrelease toEntityModel() {
				return _nullpressrelease;
			}
		};
}