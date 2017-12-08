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

package com.chola.topsearch.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.topsearch.exception.NoSuchTopSearchException;
import com.chola.topsearch.model.TopSearch;
import com.chola.topsearch.model.impl.TopSearchImpl;
import com.chola.topsearch.model.impl.TopSearchModelImpl;
import com.chola.topsearch.service.persistence.TopSearchPersistence;

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
 * The persistence implementation for the top search service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see TopSearchPersistence
 * @see com.chola.topsearch.service.persistence.TopSearchUtil
 * @generated
 */
@ProviderType
public class TopSearchPersistenceImpl extends BasePersistenceImpl<TopSearch>
	implements TopSearchPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TopSearchUtil} to access the top search persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TopSearchImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TopSearchModelImpl.ENTITY_CACHE_ENABLED,
			TopSearchModelImpl.FINDER_CACHE_ENABLED, TopSearchImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TopSearchModelImpl.ENTITY_CACHE_ENABLED,
			TopSearchModelImpl.FINDER_CACHE_ENABLED, TopSearchImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TopSearchModelImpl.ENTITY_CACHE_ENABLED,
			TopSearchModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TopSearchPersistenceImpl() {
		setModelClass(TopSearch.class);
	}

	/**
	 * Caches the top search in the entity cache if it is enabled.
	 *
	 * @param topSearch the top search
	 */
	@Override
	public void cacheResult(TopSearch topSearch) {
		entityCache.putResult(TopSearchModelImpl.ENTITY_CACHE_ENABLED,
			TopSearchImpl.class, topSearch.getPrimaryKey(), topSearch);

		topSearch.resetOriginalValues();
	}

	/**
	 * Caches the top searchs in the entity cache if it is enabled.
	 *
	 * @param topSearchs the top searchs
	 */
	@Override
	public void cacheResult(List<TopSearch> topSearchs) {
		for (TopSearch topSearch : topSearchs) {
			if (entityCache.getResult(TopSearchModelImpl.ENTITY_CACHE_ENABLED,
						TopSearchImpl.class, topSearch.getPrimaryKey()) == null) {
				cacheResult(topSearch);
			}
			else {
				topSearch.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all top searchs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TopSearchImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the top search.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TopSearch topSearch) {
		entityCache.removeResult(TopSearchModelImpl.ENTITY_CACHE_ENABLED,
			TopSearchImpl.class, topSearch.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TopSearch> topSearchs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TopSearch topSearch : topSearchs) {
			entityCache.removeResult(TopSearchModelImpl.ENTITY_CACHE_ENABLED,
				TopSearchImpl.class, topSearch.getPrimaryKey());
		}
	}

	/**
	 * Creates a new top search with the primary key. Does not add the top search to the database.
	 *
	 * @param srchId the primary key for the new top search
	 * @return the new top search
	 */
	@Override
	public TopSearch create(long srchId) {
		TopSearch topSearch = new TopSearchImpl();

		topSearch.setNew(true);
		topSearch.setPrimaryKey(srchId);

		return topSearch;
	}

	/**
	 * Removes the top search with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param srchId the primary key of the top search
	 * @return the top search that was removed
	 * @throws NoSuchTopSearchException if a top search with the primary key could not be found
	 */
	@Override
	public TopSearch remove(long srchId) throws NoSuchTopSearchException {
		return remove((Serializable)srchId);
	}

	/**
	 * Removes the top search with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the top search
	 * @return the top search that was removed
	 * @throws NoSuchTopSearchException if a top search with the primary key could not be found
	 */
	@Override
	public TopSearch remove(Serializable primaryKey)
		throws NoSuchTopSearchException {
		Session session = null;

		try {
			session = openSession();

			TopSearch topSearch = (TopSearch)session.get(TopSearchImpl.class,
					primaryKey);

			if (topSearch == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTopSearchException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(topSearch);
		}
		catch (NoSuchTopSearchException nsee) {
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
	protected TopSearch removeImpl(TopSearch topSearch) {
		topSearch = toUnwrappedModel(topSearch);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(topSearch)) {
				topSearch = (TopSearch)session.get(TopSearchImpl.class,
						topSearch.getPrimaryKeyObj());
			}

			if (topSearch != null) {
				session.delete(topSearch);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (topSearch != null) {
			clearCache(topSearch);
		}

		return topSearch;
	}

	@Override
	public TopSearch updateImpl(TopSearch topSearch) {
		topSearch = toUnwrappedModel(topSearch);

		boolean isNew = topSearch.isNew();

		TopSearchModelImpl topSearchModelImpl = (TopSearchModelImpl)topSearch;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (topSearch.getCreateDate() == null)) {
			if (serviceContext == null) {
				topSearch.setCreateDate(now);
			}
			else {
				topSearch.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!topSearchModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				topSearch.setModifiedDate(now);
			}
			else {
				topSearch.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (topSearch.isNew()) {
				session.save(topSearch);

				topSearch.setNew(false);
			}
			else {
				topSearch = (TopSearch)session.merge(topSearch);
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

		entityCache.putResult(TopSearchModelImpl.ENTITY_CACHE_ENABLED,
			TopSearchImpl.class, topSearch.getPrimaryKey(), topSearch, false);

		topSearch.resetOriginalValues();

		return topSearch;
	}

	protected TopSearch toUnwrappedModel(TopSearch topSearch) {
		if (topSearch instanceof TopSearchImpl) {
			return topSearch;
		}

		TopSearchImpl topSearchImpl = new TopSearchImpl();

		topSearchImpl.setNew(topSearch.isNew());
		topSearchImpl.setPrimaryKey(topSearch.getPrimaryKey());

		topSearchImpl.setSrchId(topSearch.getSrchId());
		topSearchImpl.setName(topSearch.getName());
		topSearchImpl.setCreateDate(topSearch.getCreateDate());
		topSearchImpl.setModifiedDate(topSearch.getModifiedDate());

		return topSearchImpl;
	}

	/**
	 * Returns the top search with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the top search
	 * @return the top search
	 * @throws NoSuchTopSearchException if a top search with the primary key could not be found
	 */
	@Override
	public TopSearch findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTopSearchException {
		TopSearch topSearch = fetchByPrimaryKey(primaryKey);

		if (topSearch == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTopSearchException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return topSearch;
	}

	/**
	 * Returns the top search with the primary key or throws a {@link NoSuchTopSearchException} if it could not be found.
	 *
	 * @param srchId the primary key of the top search
	 * @return the top search
	 * @throws NoSuchTopSearchException if a top search with the primary key could not be found
	 */
	@Override
	public TopSearch findByPrimaryKey(long srchId)
		throws NoSuchTopSearchException {
		return findByPrimaryKey((Serializable)srchId);
	}

	/**
	 * Returns the top search with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the top search
	 * @return the top search, or <code>null</code> if a top search with the primary key could not be found
	 */
	@Override
	public TopSearch fetchByPrimaryKey(Serializable primaryKey) {
		TopSearch topSearch = (TopSearch)entityCache.getResult(TopSearchModelImpl.ENTITY_CACHE_ENABLED,
				TopSearchImpl.class, primaryKey);

		if (topSearch == _nullTopSearch) {
			return null;
		}

		if (topSearch == null) {
			Session session = null;

			try {
				session = openSession();

				topSearch = (TopSearch)session.get(TopSearchImpl.class,
						primaryKey);

				if (topSearch != null) {
					cacheResult(topSearch);
				}
				else {
					entityCache.putResult(TopSearchModelImpl.ENTITY_CACHE_ENABLED,
						TopSearchImpl.class, primaryKey, _nullTopSearch);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TopSearchModelImpl.ENTITY_CACHE_ENABLED,
					TopSearchImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return topSearch;
	}

	/**
	 * Returns the top search with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param srchId the primary key of the top search
	 * @return the top search, or <code>null</code> if a top search with the primary key could not be found
	 */
	@Override
	public TopSearch fetchByPrimaryKey(long srchId) {
		return fetchByPrimaryKey((Serializable)srchId);
	}

	@Override
	public Map<Serializable, TopSearch> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, TopSearch> map = new HashMap<Serializable, TopSearch>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			TopSearch topSearch = fetchByPrimaryKey(primaryKey);

			if (topSearch != null) {
				map.put(primaryKey, topSearch);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			TopSearch topSearch = (TopSearch)entityCache.getResult(TopSearchModelImpl.ENTITY_CACHE_ENABLED,
					TopSearchImpl.class, primaryKey);

			if (topSearch == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, topSearch);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TOPSEARCH_WHERE_PKS_IN);

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

			for (TopSearch topSearch : (List<TopSearch>)q.list()) {
				map.put(topSearch.getPrimaryKeyObj(), topSearch);

				cacheResult(topSearch);

				uncachedPrimaryKeys.remove(topSearch.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TopSearchModelImpl.ENTITY_CACHE_ENABLED,
					TopSearchImpl.class, primaryKey, _nullTopSearch);
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
	 * Returns all the top searchs.
	 *
	 * @return the top searchs
	 */
	@Override
	public List<TopSearch> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the top searchs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TopSearchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of top searchs
	 * @param end the upper bound of the range of top searchs (not inclusive)
	 * @return the range of top searchs
	 */
	@Override
	public List<TopSearch> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the top searchs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TopSearchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of top searchs
	 * @param end the upper bound of the range of top searchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of top searchs
	 */
	@Override
	public List<TopSearch> findAll(int start, int end,
		OrderByComparator<TopSearch> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the top searchs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TopSearchModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of top searchs
	 * @param end the upper bound of the range of top searchs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of top searchs
	 */
	@Override
	public List<TopSearch> findAll(int start, int end,
		OrderByComparator<TopSearch> orderByComparator,
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

		List<TopSearch> list = null;

		if (retrieveFromCache) {
			list = (List<TopSearch>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TOPSEARCH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TOPSEARCH;

				if (pagination) {
					sql = sql.concat(TopSearchModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TopSearch>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TopSearch>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the top searchs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TopSearch topSearch : findAll()) {
			remove(topSearch);
		}
	}

	/**
	 * Returns the number of top searchs.
	 *
	 * @return the number of top searchs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TOPSEARCH);

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
		return TopSearchModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the top search persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TopSearchImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_TOPSEARCH = "SELECT topSearch FROM TopSearch topSearch";
	private static final String _SQL_SELECT_TOPSEARCH_WHERE_PKS_IN = "SELECT topSearch FROM TopSearch topSearch WHERE srchId IN (";
	private static final String _SQL_COUNT_TOPSEARCH = "SELECT COUNT(topSearch) FROM TopSearch topSearch";
	private static final String _ORDER_BY_ENTITY_ALIAS = "topSearch.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TopSearch exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(TopSearchPersistenceImpl.class);
	private static final TopSearch _nullTopSearch = new TopSearchImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TopSearch> toCacheModel() {
				return _nullTopSearchCacheModel;
			}
		};

	private static final CacheModel<TopSearch> _nullTopSearchCacheModel = new CacheModel<TopSearch>() {
			@Override
			public TopSearch toEntityModel() {
				return _nullTopSearch;
			}
		};
}