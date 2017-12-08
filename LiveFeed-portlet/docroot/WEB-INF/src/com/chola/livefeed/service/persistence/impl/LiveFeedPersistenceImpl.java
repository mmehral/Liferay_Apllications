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

package com.chola.livefeed.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.livefeed.exception.NoSuchLiveFeedException;
import com.chola.livefeed.model.LiveFeed;
import com.chola.livefeed.model.impl.LiveFeedImpl;
import com.chola.livefeed.model.impl.LiveFeedModelImpl;
import com.chola.livefeed.service.persistence.LiveFeedPersistence;

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
 * The persistence implementation for the live feed service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see LiveFeedPersistence
 * @see com.chola.livefeed.service.persistence.LiveFeedUtil
 * @generated
 */
@ProviderType
public class LiveFeedPersistenceImpl extends BasePersistenceImpl<LiveFeed>
	implements LiveFeedPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LiveFeedUtil} to access the live feed persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LiveFeedImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LiveFeedModelImpl.ENTITY_CACHE_ENABLED,
			LiveFeedModelImpl.FINDER_CACHE_ENABLED, LiveFeedImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LiveFeedModelImpl.ENTITY_CACHE_ENABLED,
			LiveFeedModelImpl.FINDER_CACHE_ENABLED, LiveFeedImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LiveFeedModelImpl.ENTITY_CACHE_ENABLED,
			LiveFeedModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public LiveFeedPersistenceImpl() {
		setModelClass(LiveFeed.class);
	}

	/**
	 * Caches the live feed in the entity cache if it is enabled.
	 *
	 * @param liveFeed the live feed
	 */
	@Override
	public void cacheResult(LiveFeed liveFeed) {
		entityCache.putResult(LiveFeedModelImpl.ENTITY_CACHE_ENABLED,
			LiveFeedImpl.class, liveFeed.getPrimaryKey(), liveFeed);

		liveFeed.resetOriginalValues();
	}

	/**
	 * Caches the live feeds in the entity cache if it is enabled.
	 *
	 * @param liveFeeds the live feeds
	 */
	@Override
	public void cacheResult(List<LiveFeed> liveFeeds) {
		for (LiveFeed liveFeed : liveFeeds) {
			if (entityCache.getResult(LiveFeedModelImpl.ENTITY_CACHE_ENABLED,
						LiveFeedImpl.class, liveFeed.getPrimaryKey()) == null) {
				cacheResult(liveFeed);
			}
			else {
				liveFeed.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all live feeds.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LiveFeedImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the live feed.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LiveFeed liveFeed) {
		entityCache.removeResult(LiveFeedModelImpl.ENTITY_CACHE_ENABLED,
			LiveFeedImpl.class, liveFeed.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LiveFeed> liveFeeds) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LiveFeed liveFeed : liveFeeds) {
			entityCache.removeResult(LiveFeedModelImpl.ENTITY_CACHE_ENABLED,
				LiveFeedImpl.class, liveFeed.getPrimaryKey());
		}
	}

	/**
	 * Creates a new live feed with the primary key. Does not add the live feed to the database.
	 *
	 * @param id the primary key for the new live feed
	 * @return the new live feed
	 */
	@Override
	public LiveFeed create(long id) {
		LiveFeed liveFeed = new LiveFeedImpl();

		liveFeed.setNew(true);
		liveFeed.setPrimaryKey(id);

		return liveFeed;
	}

	/**
	 * Removes the live feed with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the live feed
	 * @return the live feed that was removed
	 * @throws NoSuchLiveFeedException if a live feed with the primary key could not be found
	 */
	@Override
	public LiveFeed remove(long id) throws NoSuchLiveFeedException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the live feed with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the live feed
	 * @return the live feed that was removed
	 * @throws NoSuchLiveFeedException if a live feed with the primary key could not be found
	 */
	@Override
	public LiveFeed remove(Serializable primaryKey)
		throws NoSuchLiveFeedException {
		Session session = null;

		try {
			session = openSession();

			LiveFeed liveFeed = (LiveFeed)session.get(LiveFeedImpl.class,
					primaryKey);

			if (liveFeed == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLiveFeedException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(liveFeed);
		}
		catch (NoSuchLiveFeedException nsee) {
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
	protected LiveFeed removeImpl(LiveFeed liveFeed) {
		liveFeed = toUnwrappedModel(liveFeed);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(liveFeed)) {
				liveFeed = (LiveFeed)session.get(LiveFeedImpl.class,
						liveFeed.getPrimaryKeyObj());
			}

			if (liveFeed != null) {
				session.delete(liveFeed);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (liveFeed != null) {
			clearCache(liveFeed);
		}

		return liveFeed;
	}

	@Override
	public LiveFeed updateImpl(LiveFeed liveFeed) {
		liveFeed = toUnwrappedModel(liveFeed);

		boolean isNew = liveFeed.isNew();

		Session session = null;

		try {
			session = openSession();

			if (liveFeed.isNew()) {
				session.save(liveFeed);

				liveFeed.setNew(false);
			}
			else {
				liveFeed = (LiveFeed)session.merge(liveFeed);
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

		entityCache.putResult(LiveFeedModelImpl.ENTITY_CACHE_ENABLED,
			LiveFeedImpl.class, liveFeed.getPrimaryKey(), liveFeed, false);

		liveFeed.resetOriginalValues();

		return liveFeed;
	}

	protected LiveFeed toUnwrappedModel(LiveFeed liveFeed) {
		if (liveFeed instanceof LiveFeedImpl) {
			return liveFeed;
		}

		LiveFeedImpl liveFeedImpl = new LiveFeedImpl();

		liveFeedImpl.setNew(liveFeed.isNew());
		liveFeedImpl.setPrimaryKey(liveFeed.getPrimaryKey());

		liveFeedImpl.setId(liveFeed.getId());
		liveFeedImpl.setTitle(liveFeed.getTitle());
		liveFeedImpl.setContent(liveFeed.getContent());
		liveFeedImpl.setCreatedate(liveFeed.getCreatedate());

		return liveFeedImpl;
	}

	/**
	 * Returns the live feed with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the live feed
	 * @return the live feed
	 * @throws NoSuchLiveFeedException if a live feed with the primary key could not be found
	 */
	@Override
	public LiveFeed findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLiveFeedException {
		LiveFeed liveFeed = fetchByPrimaryKey(primaryKey);

		if (liveFeed == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLiveFeedException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return liveFeed;
	}

	/**
	 * Returns the live feed with the primary key or throws a {@link NoSuchLiveFeedException} if it could not be found.
	 *
	 * @param id the primary key of the live feed
	 * @return the live feed
	 * @throws NoSuchLiveFeedException if a live feed with the primary key could not be found
	 */
	@Override
	public LiveFeed findByPrimaryKey(long id) throws NoSuchLiveFeedException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the live feed with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the live feed
	 * @return the live feed, or <code>null</code> if a live feed with the primary key could not be found
	 */
	@Override
	public LiveFeed fetchByPrimaryKey(Serializable primaryKey) {
		LiveFeed liveFeed = (LiveFeed)entityCache.getResult(LiveFeedModelImpl.ENTITY_CACHE_ENABLED,
				LiveFeedImpl.class, primaryKey);

		if (liveFeed == _nullLiveFeed) {
			return null;
		}

		if (liveFeed == null) {
			Session session = null;

			try {
				session = openSession();

				liveFeed = (LiveFeed)session.get(LiveFeedImpl.class, primaryKey);

				if (liveFeed != null) {
					cacheResult(liveFeed);
				}
				else {
					entityCache.putResult(LiveFeedModelImpl.ENTITY_CACHE_ENABLED,
						LiveFeedImpl.class, primaryKey, _nullLiveFeed);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(LiveFeedModelImpl.ENTITY_CACHE_ENABLED,
					LiveFeedImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return liveFeed;
	}

	/**
	 * Returns the live feed with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the live feed
	 * @return the live feed, or <code>null</code> if a live feed with the primary key could not be found
	 */
	@Override
	public LiveFeed fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, LiveFeed> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, LiveFeed> map = new HashMap<Serializable, LiveFeed>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			LiveFeed liveFeed = fetchByPrimaryKey(primaryKey);

			if (liveFeed != null) {
				map.put(primaryKey, liveFeed);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			LiveFeed liveFeed = (LiveFeed)entityCache.getResult(LiveFeedModelImpl.ENTITY_CACHE_ENABLED,
					LiveFeedImpl.class, primaryKey);

			if (liveFeed == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, liveFeed);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_LIVEFEED_WHERE_PKS_IN);

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

			for (LiveFeed liveFeed : (List<LiveFeed>)q.list()) {
				map.put(liveFeed.getPrimaryKeyObj(), liveFeed);

				cacheResult(liveFeed);

				uncachedPrimaryKeys.remove(liveFeed.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(LiveFeedModelImpl.ENTITY_CACHE_ENABLED,
					LiveFeedImpl.class, primaryKey, _nullLiveFeed);
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
	 * Returns all the live feeds.
	 *
	 * @return the live feeds
	 */
	@Override
	public List<LiveFeed> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the live feeds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LiveFeedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of live feeds
	 * @param end the upper bound of the range of live feeds (not inclusive)
	 * @return the range of live feeds
	 */
	@Override
	public List<LiveFeed> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the live feeds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LiveFeedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of live feeds
	 * @param end the upper bound of the range of live feeds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of live feeds
	 */
	@Override
	public List<LiveFeed> findAll(int start, int end,
		OrderByComparator<LiveFeed> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the live feeds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LiveFeedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of live feeds
	 * @param end the upper bound of the range of live feeds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of live feeds
	 */
	@Override
	public List<LiveFeed> findAll(int start, int end,
		OrderByComparator<LiveFeed> orderByComparator, boolean retrieveFromCache) {
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

		List<LiveFeed> list = null;

		if (retrieveFromCache) {
			list = (List<LiveFeed>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_LIVEFEED);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LIVEFEED;

				if (pagination) {
					sql = sql.concat(LiveFeedModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LiveFeed>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LiveFeed>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the live feeds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (LiveFeed liveFeed : findAll()) {
			remove(liveFeed);
		}
	}

	/**
	 * Returns the number of live feeds.
	 *
	 * @return the number of live feeds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LIVEFEED);

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
		return LiveFeedModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the live feed persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(LiveFeedImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_LIVEFEED = "SELECT liveFeed FROM LiveFeed liveFeed";
	private static final String _SQL_SELECT_LIVEFEED_WHERE_PKS_IN = "SELECT liveFeed FROM LiveFeed liveFeed WHERE id_ IN (";
	private static final String _SQL_COUNT_LIVEFEED = "SELECT COUNT(liveFeed) FROM LiveFeed liveFeed";
	private static final String _ORDER_BY_ENTITY_ALIAS = "liveFeed.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LiveFeed exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(LiveFeedPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final LiveFeed _nullLiveFeed = new LiveFeedImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LiveFeed> toCacheModel() {
				return _nullLiveFeedCacheModel;
			}
		};

	private static final CacheModel<LiveFeed> _nullLiveFeedCacheModel = new CacheModel<LiveFeed>() {
			@Override
			public LiveFeed toEntityModel() {
				return _nullLiveFeed;
			}
		};
}