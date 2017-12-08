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

package com.chola.TodaycholaNews.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.TodaycholaNews.exception.NoSuchTodayCholaNewsException;
import com.chola.TodaycholaNews.model.TodayCholaNews;
import com.chola.TodaycholaNews.model.impl.TodayCholaNewsImpl;
import com.chola.TodaycholaNews.model.impl.TodayCholaNewsModelImpl;
import com.chola.TodaycholaNews.service.persistence.TodayCholaNewsPersistence;

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
 * The persistence implementation for the today chola news service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see TodayCholaNewsPersistence
 * @see com.chola.TodaycholaNews.service.persistence.TodayCholaNewsUtil
 * @generated
 */
@ProviderType
public class TodayCholaNewsPersistenceImpl extends BasePersistenceImpl<TodayCholaNews>
	implements TodayCholaNewsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TodayCholaNewsUtil} to access the today chola news persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TodayCholaNewsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TodayCholaNewsModelImpl.ENTITY_CACHE_ENABLED,
			TodayCholaNewsModelImpl.FINDER_CACHE_ENABLED,
			TodayCholaNewsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TodayCholaNewsModelImpl.ENTITY_CACHE_ENABLED,
			TodayCholaNewsModelImpl.FINDER_CACHE_ENABLED,
			TodayCholaNewsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TodayCholaNewsModelImpl.ENTITY_CACHE_ENABLED,
			TodayCholaNewsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public TodayCholaNewsPersistenceImpl() {
		setModelClass(TodayCholaNews.class);
	}

	/**
	 * Caches the today chola news in the entity cache if it is enabled.
	 *
	 * @param todayCholaNews the today chola news
	 */
	@Override
	public void cacheResult(TodayCholaNews todayCholaNews) {
		entityCache.putResult(TodayCholaNewsModelImpl.ENTITY_CACHE_ENABLED,
			TodayCholaNewsImpl.class, todayCholaNews.getPrimaryKey(),
			todayCholaNews);

		todayCholaNews.resetOriginalValues();
	}

	/**
	 * Caches the today chola newses in the entity cache if it is enabled.
	 *
	 * @param todayCholaNewses the today chola newses
	 */
	@Override
	public void cacheResult(List<TodayCholaNews> todayCholaNewses) {
		for (TodayCholaNews todayCholaNews : todayCholaNewses) {
			if (entityCache.getResult(
						TodayCholaNewsModelImpl.ENTITY_CACHE_ENABLED,
						TodayCholaNewsImpl.class, todayCholaNews.getPrimaryKey()) == null) {
				cacheResult(todayCholaNews);
			}
			else {
				todayCholaNews.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all today chola newses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TodayCholaNewsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the today chola news.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TodayCholaNews todayCholaNews) {
		entityCache.removeResult(TodayCholaNewsModelImpl.ENTITY_CACHE_ENABLED,
			TodayCholaNewsImpl.class, todayCholaNews.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TodayCholaNews> todayCholaNewses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TodayCholaNews todayCholaNews : todayCholaNewses) {
			entityCache.removeResult(TodayCholaNewsModelImpl.ENTITY_CACHE_ENABLED,
				TodayCholaNewsImpl.class, todayCholaNews.getPrimaryKey());
		}
	}

	/**
	 * Creates a new today chola news with the primary key. Does not add the today chola news to the database.
	 *
	 * @param id the primary key for the new today chola news
	 * @return the new today chola news
	 */
	@Override
	public TodayCholaNews create(long id) {
		TodayCholaNews todayCholaNews = new TodayCholaNewsImpl();

		todayCholaNews.setNew(true);
		todayCholaNews.setPrimaryKey(id);

		return todayCholaNews;
	}

	/**
	 * Removes the today chola news with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the today chola news
	 * @return the today chola news that was removed
	 * @throws NoSuchTodayCholaNewsException if a today chola news with the primary key could not be found
	 */
	@Override
	public TodayCholaNews remove(long id) throws NoSuchTodayCholaNewsException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the today chola news with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the today chola news
	 * @return the today chola news that was removed
	 * @throws NoSuchTodayCholaNewsException if a today chola news with the primary key could not be found
	 */
	@Override
	public TodayCholaNews remove(Serializable primaryKey)
		throws NoSuchTodayCholaNewsException {
		Session session = null;

		try {
			session = openSession();

			TodayCholaNews todayCholaNews = (TodayCholaNews)session.get(TodayCholaNewsImpl.class,
					primaryKey);

			if (todayCholaNews == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTodayCholaNewsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(todayCholaNews);
		}
		catch (NoSuchTodayCholaNewsException nsee) {
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
	protected TodayCholaNews removeImpl(TodayCholaNews todayCholaNews) {
		todayCholaNews = toUnwrappedModel(todayCholaNews);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(todayCholaNews)) {
				todayCholaNews = (TodayCholaNews)session.get(TodayCholaNewsImpl.class,
						todayCholaNews.getPrimaryKeyObj());
			}

			if (todayCholaNews != null) {
				session.delete(todayCholaNews);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (todayCholaNews != null) {
			clearCache(todayCholaNews);
		}

		return todayCholaNews;
	}

	@Override
	public TodayCholaNews updateImpl(TodayCholaNews todayCholaNews) {
		todayCholaNews = toUnwrappedModel(todayCholaNews);

		boolean isNew = todayCholaNews.isNew();

		Session session = null;

		try {
			session = openSession();

			if (todayCholaNews.isNew()) {
				session.save(todayCholaNews);

				todayCholaNews.setNew(false);
			}
			else {
				todayCholaNews = (TodayCholaNews)session.merge(todayCholaNews);
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

		entityCache.putResult(TodayCholaNewsModelImpl.ENTITY_CACHE_ENABLED,
			TodayCholaNewsImpl.class, todayCholaNews.getPrimaryKey(),
			todayCholaNews, false);

		todayCholaNews.resetOriginalValues();

		return todayCholaNews;
	}

	protected TodayCholaNews toUnwrappedModel(TodayCholaNews todayCholaNews) {
		if (todayCholaNews instanceof TodayCholaNewsImpl) {
			return todayCholaNews;
		}

		TodayCholaNewsImpl todayCholaNewsImpl = new TodayCholaNewsImpl();

		todayCholaNewsImpl.setNew(todayCholaNews.isNew());
		todayCholaNewsImpl.setPrimaryKey(todayCholaNews.getPrimaryKey());

		todayCholaNewsImpl.setId(todayCholaNews.getId());
		todayCholaNewsImpl.setTitle(todayCholaNews.getTitle());
		todayCholaNewsImpl.setContent(todayCholaNews.getContent());
		todayCholaNewsImpl.setCreatedate(todayCholaNews.getCreatedate());

		return todayCholaNewsImpl;
	}

	/**
	 * Returns the today chola news with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the today chola news
	 * @return the today chola news
	 * @throws NoSuchTodayCholaNewsException if a today chola news with the primary key could not be found
	 */
	@Override
	public TodayCholaNews findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTodayCholaNewsException {
		TodayCholaNews todayCholaNews = fetchByPrimaryKey(primaryKey);

		if (todayCholaNews == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTodayCholaNewsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return todayCholaNews;
	}

	/**
	 * Returns the today chola news with the primary key or throws a {@link NoSuchTodayCholaNewsException} if it could not be found.
	 *
	 * @param id the primary key of the today chola news
	 * @return the today chola news
	 * @throws NoSuchTodayCholaNewsException if a today chola news with the primary key could not be found
	 */
	@Override
	public TodayCholaNews findByPrimaryKey(long id)
		throws NoSuchTodayCholaNewsException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the today chola news with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the today chola news
	 * @return the today chola news, or <code>null</code> if a today chola news with the primary key could not be found
	 */
	@Override
	public TodayCholaNews fetchByPrimaryKey(Serializable primaryKey) {
		TodayCholaNews todayCholaNews = (TodayCholaNews)entityCache.getResult(TodayCholaNewsModelImpl.ENTITY_CACHE_ENABLED,
				TodayCholaNewsImpl.class, primaryKey);

		if (todayCholaNews == _nullTodayCholaNews) {
			return null;
		}

		if (todayCholaNews == null) {
			Session session = null;

			try {
				session = openSession();

				todayCholaNews = (TodayCholaNews)session.get(TodayCholaNewsImpl.class,
						primaryKey);

				if (todayCholaNews != null) {
					cacheResult(todayCholaNews);
				}
				else {
					entityCache.putResult(TodayCholaNewsModelImpl.ENTITY_CACHE_ENABLED,
						TodayCholaNewsImpl.class, primaryKey,
						_nullTodayCholaNews);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TodayCholaNewsModelImpl.ENTITY_CACHE_ENABLED,
					TodayCholaNewsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return todayCholaNews;
	}

	/**
	 * Returns the today chola news with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the today chola news
	 * @return the today chola news, or <code>null</code> if a today chola news with the primary key could not be found
	 */
	@Override
	public TodayCholaNews fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, TodayCholaNews> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, TodayCholaNews> map = new HashMap<Serializable, TodayCholaNews>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			TodayCholaNews todayCholaNews = fetchByPrimaryKey(primaryKey);

			if (todayCholaNews != null) {
				map.put(primaryKey, todayCholaNews);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			TodayCholaNews todayCholaNews = (TodayCholaNews)entityCache.getResult(TodayCholaNewsModelImpl.ENTITY_CACHE_ENABLED,
					TodayCholaNewsImpl.class, primaryKey);

			if (todayCholaNews == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, todayCholaNews);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TODAYCHOLANEWS_WHERE_PKS_IN);

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

			for (TodayCholaNews todayCholaNews : (List<TodayCholaNews>)q.list()) {
				map.put(todayCholaNews.getPrimaryKeyObj(), todayCholaNews);

				cacheResult(todayCholaNews);

				uncachedPrimaryKeys.remove(todayCholaNews.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TodayCholaNewsModelImpl.ENTITY_CACHE_ENABLED,
					TodayCholaNewsImpl.class, primaryKey, _nullTodayCholaNews);
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
	 * Returns all the today chola newses.
	 *
	 * @return the today chola newses
	 */
	@Override
	public List<TodayCholaNews> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the today chola newses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TodayCholaNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of today chola newses
	 * @param end the upper bound of the range of today chola newses (not inclusive)
	 * @return the range of today chola newses
	 */
	@Override
	public List<TodayCholaNews> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the today chola newses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TodayCholaNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of today chola newses
	 * @param end the upper bound of the range of today chola newses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of today chola newses
	 */
	@Override
	public List<TodayCholaNews> findAll(int start, int end,
		OrderByComparator<TodayCholaNews> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the today chola newses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TodayCholaNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of today chola newses
	 * @param end the upper bound of the range of today chola newses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of today chola newses
	 */
	@Override
	public List<TodayCholaNews> findAll(int start, int end,
		OrderByComparator<TodayCholaNews> orderByComparator,
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

		List<TodayCholaNews> list = null;

		if (retrieveFromCache) {
			list = (List<TodayCholaNews>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TODAYCHOLANEWS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TODAYCHOLANEWS;

				if (pagination) {
					sql = sql.concat(TodayCholaNewsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TodayCholaNews>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TodayCholaNews>)QueryUtil.list(q,
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
	 * Removes all the today chola newses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TodayCholaNews todayCholaNews : findAll()) {
			remove(todayCholaNews);
		}
	}

	/**
	 * Returns the number of today chola newses.
	 *
	 * @return the number of today chola newses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TODAYCHOLANEWS);

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
		return TodayCholaNewsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the today chola news persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TodayCholaNewsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_TODAYCHOLANEWS = "SELECT todayCholaNews FROM TodayCholaNews todayCholaNews";
	private static final String _SQL_SELECT_TODAYCHOLANEWS_WHERE_PKS_IN = "SELECT todayCholaNews FROM TodayCholaNews todayCholaNews WHERE id_ IN (";
	private static final String _SQL_COUNT_TODAYCHOLANEWS = "SELECT COUNT(todayCholaNews) FROM TodayCholaNews todayCholaNews";
	private static final String _ORDER_BY_ENTITY_ALIAS = "todayCholaNews.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TodayCholaNews exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(TodayCholaNewsPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final TodayCholaNews _nullTodayCholaNews = new TodayCholaNewsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TodayCholaNews> toCacheModel() {
				return _nullTodayCholaNewsCacheModel;
			}
		};

	private static final CacheModel<TodayCholaNews> _nullTodayCholaNewsCacheModel =
		new CacheModel<TodayCholaNews>() {
			@Override
			public TodayCholaNews toEntityModel() {
				return _nullTodayCholaNews;
			}
		};
}