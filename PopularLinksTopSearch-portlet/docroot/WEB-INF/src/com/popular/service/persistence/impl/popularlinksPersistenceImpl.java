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

package com.popular.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

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

import com.popular.exception.NoSuchpopularlinksException;

import com.popular.model.impl.popularlinksImpl;
import com.popular.model.impl.popularlinksModelImpl;
import com.popular.model.popularlinks;

import com.popular.service.persistence.popularlinksPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the popularlinks service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see popularlinksPersistence
 * @see com.popular.service.persistence.popularlinksUtil
 * @generated
 */
@ProviderType
public class popularlinksPersistenceImpl extends BasePersistenceImpl<popularlinks>
	implements popularlinksPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link popularlinksUtil} to access the popularlinks persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = popularlinksImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(popularlinksModelImpl.ENTITY_CACHE_ENABLED,
			popularlinksModelImpl.FINDER_CACHE_ENABLED, popularlinksImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(popularlinksModelImpl.ENTITY_CACHE_ENABLED,
			popularlinksModelImpl.FINDER_CACHE_ENABLED, popularlinksImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(popularlinksModelImpl.ENTITY_CACHE_ENABLED,
			popularlinksModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public popularlinksPersistenceImpl() {
		setModelClass(popularlinks.class);
	}

	/**
	 * Caches the popularlinks in the entity cache if it is enabled.
	 *
	 * @param popularlinks the popularlinks
	 */
	@Override
	public void cacheResult(popularlinks popularlinks) {
		entityCache.putResult(popularlinksModelImpl.ENTITY_CACHE_ENABLED,
			popularlinksImpl.class, popularlinks.getPrimaryKey(), popularlinks);

		popularlinks.resetOriginalValues();
	}

	/**
	 * Caches the popularlinkses in the entity cache if it is enabled.
	 *
	 * @param popularlinkses the popularlinkses
	 */
	@Override
	public void cacheResult(List<popularlinks> popularlinkses) {
		for (popularlinks popularlinks : popularlinkses) {
			if (entityCache.getResult(
						popularlinksModelImpl.ENTITY_CACHE_ENABLED,
						popularlinksImpl.class, popularlinks.getPrimaryKey()) == null) {
				cacheResult(popularlinks);
			}
			else {
				popularlinks.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all popularlinkses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(popularlinksImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the popularlinks.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(popularlinks popularlinks) {
		entityCache.removeResult(popularlinksModelImpl.ENTITY_CACHE_ENABLED,
			popularlinksImpl.class, popularlinks.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<popularlinks> popularlinkses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (popularlinks popularlinks : popularlinkses) {
			entityCache.removeResult(popularlinksModelImpl.ENTITY_CACHE_ENABLED,
				popularlinksImpl.class, popularlinks.getPrimaryKey());
		}
	}

	/**
	 * Creates a new popularlinks with the primary key. Does not add the popularlinks to the database.
	 *
	 * @param id the primary key for the new popularlinks
	 * @return the new popularlinks
	 */
	@Override
	public popularlinks create(long id) {
		popularlinks popularlinks = new popularlinksImpl();

		popularlinks.setNew(true);
		popularlinks.setPrimaryKey(id);

		return popularlinks;
	}

	/**
	 * Removes the popularlinks with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the popularlinks
	 * @return the popularlinks that was removed
	 * @throws NoSuchpopularlinksException if a popularlinks with the primary key could not be found
	 */
	@Override
	public popularlinks remove(long id) throws NoSuchpopularlinksException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the popularlinks with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the popularlinks
	 * @return the popularlinks that was removed
	 * @throws NoSuchpopularlinksException if a popularlinks with the primary key could not be found
	 */
	@Override
	public popularlinks remove(Serializable primaryKey)
		throws NoSuchpopularlinksException {
		Session session = null;

		try {
			session = openSession();

			popularlinks popularlinks = (popularlinks)session.get(popularlinksImpl.class,
					primaryKey);

			if (popularlinks == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchpopularlinksException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(popularlinks);
		}
		catch (NoSuchpopularlinksException nsee) {
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
	protected popularlinks removeImpl(popularlinks popularlinks) {
		popularlinks = toUnwrappedModel(popularlinks);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(popularlinks)) {
				popularlinks = (popularlinks)session.get(popularlinksImpl.class,
						popularlinks.getPrimaryKeyObj());
			}

			if (popularlinks != null) {
				session.delete(popularlinks);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (popularlinks != null) {
			clearCache(popularlinks);
		}

		return popularlinks;
	}

	@Override
	public popularlinks updateImpl(popularlinks popularlinks) {
		popularlinks = toUnwrappedModel(popularlinks);

		boolean isNew = popularlinks.isNew();

		Session session = null;

		try {
			session = openSession();

			if (popularlinks.isNew()) {
				session.save(popularlinks);

				popularlinks.setNew(false);
			}
			else {
				popularlinks = (popularlinks)session.merge(popularlinks);
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

		entityCache.putResult(popularlinksModelImpl.ENTITY_CACHE_ENABLED,
			popularlinksImpl.class, popularlinks.getPrimaryKey(), popularlinks,
			false);

		popularlinks.resetOriginalValues();

		return popularlinks;
	}

	protected popularlinks toUnwrappedModel(popularlinks popularlinks) {
		if (popularlinks instanceof popularlinksImpl) {
			return popularlinks;
		}

		popularlinksImpl popularlinksImpl = new popularlinksImpl();

		popularlinksImpl.setNew(popularlinks.isNew());
		popularlinksImpl.setPrimaryKey(popularlinks.getPrimaryKey());

		popularlinksImpl.setId(popularlinks.getId());
		popularlinksImpl.setUserid(popularlinks.getUserid());
		popularlinksImpl.setUrl(popularlinks.getUrl());
		popularlinksImpl.setTag(popularlinks.getTag());
		popularlinksImpl.setCount(popularlinks.getCount());
		popularlinksImpl.setFlag(popularlinks.getFlag());
		popularlinksImpl.setCreateDate(popularlinks.getCreateDate());

		return popularlinksImpl;
	}

	/**
	 * Returns the popularlinks with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the popularlinks
	 * @return the popularlinks
	 * @throws NoSuchpopularlinksException if a popularlinks with the primary key could not be found
	 */
	@Override
	public popularlinks findByPrimaryKey(Serializable primaryKey)
		throws NoSuchpopularlinksException {
		popularlinks popularlinks = fetchByPrimaryKey(primaryKey);

		if (popularlinks == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchpopularlinksException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return popularlinks;
	}

	/**
	 * Returns the popularlinks with the primary key or throws a {@link NoSuchpopularlinksException} if it could not be found.
	 *
	 * @param id the primary key of the popularlinks
	 * @return the popularlinks
	 * @throws NoSuchpopularlinksException if a popularlinks with the primary key could not be found
	 */
	@Override
	public popularlinks findByPrimaryKey(long id)
		throws NoSuchpopularlinksException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the popularlinks with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the popularlinks
	 * @return the popularlinks, or <code>null</code> if a popularlinks with the primary key could not be found
	 */
	@Override
	public popularlinks fetchByPrimaryKey(Serializable primaryKey) {
		popularlinks popularlinks = (popularlinks)entityCache.getResult(popularlinksModelImpl.ENTITY_CACHE_ENABLED,
				popularlinksImpl.class, primaryKey);

		if (popularlinks == _nullpopularlinks) {
			return null;
		}

		if (popularlinks == null) {
			Session session = null;

			try {
				session = openSession();

				popularlinks = (popularlinks)session.get(popularlinksImpl.class,
						primaryKey);

				if (popularlinks != null) {
					cacheResult(popularlinks);
				}
				else {
					entityCache.putResult(popularlinksModelImpl.ENTITY_CACHE_ENABLED,
						popularlinksImpl.class, primaryKey, _nullpopularlinks);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(popularlinksModelImpl.ENTITY_CACHE_ENABLED,
					popularlinksImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return popularlinks;
	}

	/**
	 * Returns the popularlinks with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the popularlinks
	 * @return the popularlinks, or <code>null</code> if a popularlinks with the primary key could not be found
	 */
	@Override
	public popularlinks fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, popularlinks> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, popularlinks> map = new HashMap<Serializable, popularlinks>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			popularlinks popularlinks = fetchByPrimaryKey(primaryKey);

			if (popularlinks != null) {
				map.put(primaryKey, popularlinks);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			popularlinks popularlinks = (popularlinks)entityCache.getResult(popularlinksModelImpl.ENTITY_CACHE_ENABLED,
					popularlinksImpl.class, primaryKey);

			if (popularlinks == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, popularlinks);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_POPULARLINKS_WHERE_PKS_IN);

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

			for (popularlinks popularlinks : (List<popularlinks>)q.list()) {
				map.put(popularlinks.getPrimaryKeyObj(), popularlinks);

				cacheResult(popularlinks);

				uncachedPrimaryKeys.remove(popularlinks.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(popularlinksModelImpl.ENTITY_CACHE_ENABLED,
					popularlinksImpl.class, primaryKey, _nullpopularlinks);
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
	 * Returns all the popularlinkses.
	 *
	 * @return the popularlinkses
	 */
	@Override
	public List<popularlinks> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the popularlinkses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link popularlinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of popularlinkses
	 * @param end the upper bound of the range of popularlinkses (not inclusive)
	 * @return the range of popularlinkses
	 */
	@Override
	public List<popularlinks> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the popularlinkses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link popularlinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of popularlinkses
	 * @param end the upper bound of the range of popularlinkses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of popularlinkses
	 */
	@Override
	public List<popularlinks> findAll(int start, int end,
		OrderByComparator<popularlinks> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the popularlinkses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link popularlinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of popularlinkses
	 * @param end the upper bound of the range of popularlinkses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of popularlinkses
	 */
	@Override
	public List<popularlinks> findAll(int start, int end,
		OrderByComparator<popularlinks> orderByComparator,
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

		List<popularlinks> list = null;

		if (retrieveFromCache) {
			list = (List<popularlinks>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_POPULARLINKS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_POPULARLINKS;

				if (pagination) {
					sql = sql.concat(popularlinksModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<popularlinks>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<popularlinks>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the popularlinkses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (popularlinks popularlinks : findAll()) {
			remove(popularlinks);
		}
	}

	/**
	 * Returns the number of popularlinkses.
	 *
	 * @return the number of popularlinkses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_POPULARLINKS);

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
		return popularlinksModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the popularlinks persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(popularlinksImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_POPULARLINKS = "SELECT popularlinks FROM popularlinks popularlinks";
	private static final String _SQL_SELECT_POPULARLINKS_WHERE_PKS_IN = "SELECT popularlinks FROM popularlinks popularlinks WHERE id_ IN (";
	private static final String _SQL_COUNT_POPULARLINKS = "SELECT COUNT(popularlinks) FROM popularlinks popularlinks";
	private static final String _ORDER_BY_ENTITY_ALIAS = "popularlinks.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No popularlinks exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(popularlinksPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final popularlinks _nullpopularlinks = new popularlinksImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<popularlinks> toCacheModel() {
				return _nullpopularlinksCacheModel;
			}
		};

	private static final CacheModel<popularlinks> _nullpopularlinksCacheModel = new CacheModel<popularlinks>() {
			@Override
			public popularlinks toEntityModel() {
				return _nullpopularlinks;
			}
		};
}