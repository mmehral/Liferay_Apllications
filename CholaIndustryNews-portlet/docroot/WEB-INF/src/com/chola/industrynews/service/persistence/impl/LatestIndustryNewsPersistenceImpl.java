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

package com.chola.industrynews.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.industrynews.exception.NoSuchLatestIndustryNewsException;
import com.chola.industrynews.model.LatestIndustryNews;
import com.chola.industrynews.model.impl.LatestIndustryNewsImpl;
import com.chola.industrynews.model.impl.LatestIndustryNewsModelImpl;
import com.chola.industrynews.service.persistence.LatestIndustryNewsPersistence;

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
 * The persistence implementation for the latest industry news service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see LatestIndustryNewsPersistence
 * @see com.chola.industrynews.service.persistence.LatestIndustryNewsUtil
 * @generated
 */
@ProviderType
public class LatestIndustryNewsPersistenceImpl extends BasePersistenceImpl<LatestIndustryNews>
	implements LatestIndustryNewsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link LatestIndustryNewsUtil} to access the latest industry news persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = LatestIndustryNewsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LatestIndustryNewsModelImpl.ENTITY_CACHE_ENABLED,
			LatestIndustryNewsModelImpl.FINDER_CACHE_ENABLED,
			LatestIndustryNewsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LatestIndustryNewsModelImpl.ENTITY_CACHE_ENABLED,
			LatestIndustryNewsModelImpl.FINDER_CACHE_ENABLED,
			LatestIndustryNewsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LatestIndustryNewsModelImpl.ENTITY_CACHE_ENABLED,
			LatestIndustryNewsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public LatestIndustryNewsPersistenceImpl() {
		setModelClass(LatestIndustryNews.class);
	}

	/**
	 * Caches the latest industry news in the entity cache if it is enabled.
	 *
	 * @param latestIndustryNews the latest industry news
	 */
	@Override
	public void cacheResult(LatestIndustryNews latestIndustryNews) {
		entityCache.putResult(LatestIndustryNewsModelImpl.ENTITY_CACHE_ENABLED,
			LatestIndustryNewsImpl.class, latestIndustryNews.getPrimaryKey(),
			latestIndustryNews);

		latestIndustryNews.resetOriginalValues();
	}

	/**
	 * Caches the latest industry newses in the entity cache if it is enabled.
	 *
	 * @param latestIndustryNewses the latest industry newses
	 */
	@Override
	public void cacheResult(List<LatestIndustryNews> latestIndustryNewses) {
		for (LatestIndustryNews latestIndustryNews : latestIndustryNewses) {
			if (entityCache.getResult(
						LatestIndustryNewsModelImpl.ENTITY_CACHE_ENABLED,
						LatestIndustryNewsImpl.class,
						latestIndustryNews.getPrimaryKey()) == null) {
				cacheResult(latestIndustryNews);
			}
			else {
				latestIndustryNews.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all latest industry newses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LatestIndustryNewsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the latest industry news.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LatestIndustryNews latestIndustryNews) {
		entityCache.removeResult(LatestIndustryNewsModelImpl.ENTITY_CACHE_ENABLED,
			LatestIndustryNewsImpl.class, latestIndustryNews.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<LatestIndustryNews> latestIndustryNewses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LatestIndustryNews latestIndustryNews : latestIndustryNewses) {
			entityCache.removeResult(LatestIndustryNewsModelImpl.ENTITY_CACHE_ENABLED,
				LatestIndustryNewsImpl.class, latestIndustryNews.getPrimaryKey());
		}
	}

	/**
	 * Creates a new latest industry news with the primary key. Does not add the latest industry news to the database.
	 *
	 * @param id the primary key for the new latest industry news
	 * @return the new latest industry news
	 */
	@Override
	public LatestIndustryNews create(long id) {
		LatestIndustryNews latestIndustryNews = new LatestIndustryNewsImpl();

		latestIndustryNews.setNew(true);
		latestIndustryNews.setPrimaryKey(id);

		return latestIndustryNews;
	}

	/**
	 * Removes the latest industry news with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the latest industry news
	 * @return the latest industry news that was removed
	 * @throws NoSuchLatestIndustryNewsException if a latest industry news with the primary key could not be found
	 */
	@Override
	public LatestIndustryNews remove(long id)
		throws NoSuchLatestIndustryNewsException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the latest industry news with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the latest industry news
	 * @return the latest industry news that was removed
	 * @throws NoSuchLatestIndustryNewsException if a latest industry news with the primary key could not be found
	 */
	@Override
	public LatestIndustryNews remove(Serializable primaryKey)
		throws NoSuchLatestIndustryNewsException {
		Session session = null;

		try {
			session = openSession();

			LatestIndustryNews latestIndustryNews = (LatestIndustryNews)session.get(LatestIndustryNewsImpl.class,
					primaryKey);

			if (latestIndustryNews == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLatestIndustryNewsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(latestIndustryNews);
		}
		catch (NoSuchLatestIndustryNewsException nsee) {
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
	protected LatestIndustryNews removeImpl(
		LatestIndustryNews latestIndustryNews) {
		latestIndustryNews = toUnwrappedModel(latestIndustryNews);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(latestIndustryNews)) {
				latestIndustryNews = (LatestIndustryNews)session.get(LatestIndustryNewsImpl.class,
						latestIndustryNews.getPrimaryKeyObj());
			}

			if (latestIndustryNews != null) {
				session.delete(latestIndustryNews);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (latestIndustryNews != null) {
			clearCache(latestIndustryNews);
		}

		return latestIndustryNews;
	}

	@Override
	public LatestIndustryNews updateImpl(LatestIndustryNews latestIndustryNews) {
		latestIndustryNews = toUnwrappedModel(latestIndustryNews);

		boolean isNew = latestIndustryNews.isNew();

		Session session = null;

		try {
			session = openSession();

			if (latestIndustryNews.isNew()) {
				session.save(latestIndustryNews);

				latestIndustryNews.setNew(false);
			}
			else {
				latestIndustryNews = (LatestIndustryNews)session.merge(latestIndustryNews);
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

		entityCache.putResult(LatestIndustryNewsModelImpl.ENTITY_CACHE_ENABLED,
			LatestIndustryNewsImpl.class, latestIndustryNews.getPrimaryKey(),
			latestIndustryNews, false);

		latestIndustryNews.resetOriginalValues();

		return latestIndustryNews;
	}

	protected LatestIndustryNews toUnwrappedModel(
		LatestIndustryNews latestIndustryNews) {
		if (latestIndustryNews instanceof LatestIndustryNewsImpl) {
			return latestIndustryNews;
		}

		LatestIndustryNewsImpl latestIndustryNewsImpl = new LatestIndustryNewsImpl();

		latestIndustryNewsImpl.setNew(latestIndustryNews.isNew());
		latestIndustryNewsImpl.setPrimaryKey(latestIndustryNews.getPrimaryKey());

		latestIndustryNewsImpl.setId(latestIndustryNews.getId());
		latestIndustryNewsImpl.setTitle(latestIndustryNews.getTitle());
		latestIndustryNewsImpl.setContent(latestIndustryNews.getContent());
		latestIndustryNewsImpl.setCreatedate(latestIndustryNews.getCreatedate());

		return latestIndustryNewsImpl;
	}

	/**
	 * Returns the latest industry news with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the latest industry news
	 * @return the latest industry news
	 * @throws NoSuchLatestIndustryNewsException if a latest industry news with the primary key could not be found
	 */
	@Override
	public LatestIndustryNews findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLatestIndustryNewsException {
		LatestIndustryNews latestIndustryNews = fetchByPrimaryKey(primaryKey);

		if (latestIndustryNews == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLatestIndustryNewsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return latestIndustryNews;
	}

	/**
	 * Returns the latest industry news with the primary key or throws a {@link NoSuchLatestIndustryNewsException} if it could not be found.
	 *
	 * @param id the primary key of the latest industry news
	 * @return the latest industry news
	 * @throws NoSuchLatestIndustryNewsException if a latest industry news with the primary key could not be found
	 */
	@Override
	public LatestIndustryNews findByPrimaryKey(long id)
		throws NoSuchLatestIndustryNewsException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the latest industry news with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the latest industry news
	 * @return the latest industry news, or <code>null</code> if a latest industry news with the primary key could not be found
	 */
	@Override
	public LatestIndustryNews fetchByPrimaryKey(Serializable primaryKey) {
		LatestIndustryNews latestIndustryNews = (LatestIndustryNews)entityCache.getResult(LatestIndustryNewsModelImpl.ENTITY_CACHE_ENABLED,
				LatestIndustryNewsImpl.class, primaryKey);

		if (latestIndustryNews == _nullLatestIndustryNews) {
			return null;
		}

		if (latestIndustryNews == null) {
			Session session = null;

			try {
				session = openSession();

				latestIndustryNews = (LatestIndustryNews)session.get(LatestIndustryNewsImpl.class,
						primaryKey);

				if (latestIndustryNews != null) {
					cacheResult(latestIndustryNews);
				}
				else {
					entityCache.putResult(LatestIndustryNewsModelImpl.ENTITY_CACHE_ENABLED,
						LatestIndustryNewsImpl.class, primaryKey,
						_nullLatestIndustryNews);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(LatestIndustryNewsModelImpl.ENTITY_CACHE_ENABLED,
					LatestIndustryNewsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return latestIndustryNews;
	}

	/**
	 * Returns the latest industry news with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the latest industry news
	 * @return the latest industry news, or <code>null</code> if a latest industry news with the primary key could not be found
	 */
	@Override
	public LatestIndustryNews fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, LatestIndustryNews> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, LatestIndustryNews> map = new HashMap<Serializable, LatestIndustryNews>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			LatestIndustryNews latestIndustryNews = fetchByPrimaryKey(primaryKey);

			if (latestIndustryNews != null) {
				map.put(primaryKey, latestIndustryNews);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			LatestIndustryNews latestIndustryNews = (LatestIndustryNews)entityCache.getResult(LatestIndustryNewsModelImpl.ENTITY_CACHE_ENABLED,
					LatestIndustryNewsImpl.class, primaryKey);

			if (latestIndustryNews == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, latestIndustryNews);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_LATESTINDUSTRYNEWS_WHERE_PKS_IN);

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

			for (LatestIndustryNews latestIndustryNews : (List<LatestIndustryNews>)q.list()) {
				map.put(latestIndustryNews.getPrimaryKeyObj(),
					latestIndustryNews);

				cacheResult(latestIndustryNews);

				uncachedPrimaryKeys.remove(latestIndustryNews.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(LatestIndustryNewsModelImpl.ENTITY_CACHE_ENABLED,
					LatestIndustryNewsImpl.class, primaryKey,
					_nullLatestIndustryNews);
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
	 * Returns all the latest industry newses.
	 *
	 * @return the latest industry newses
	 */
	@Override
	public List<LatestIndustryNews> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the latest industry newses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LatestIndustryNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of latest industry newses
	 * @param end the upper bound of the range of latest industry newses (not inclusive)
	 * @return the range of latest industry newses
	 */
	@Override
	public List<LatestIndustryNews> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the latest industry newses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LatestIndustryNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of latest industry newses
	 * @param end the upper bound of the range of latest industry newses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of latest industry newses
	 */
	@Override
	public List<LatestIndustryNews> findAll(int start, int end,
		OrderByComparator<LatestIndustryNews> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the latest industry newses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LatestIndustryNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of latest industry newses
	 * @param end the upper bound of the range of latest industry newses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of latest industry newses
	 */
	@Override
	public List<LatestIndustryNews> findAll(int start, int end,
		OrderByComparator<LatestIndustryNews> orderByComparator,
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

		List<LatestIndustryNews> list = null;

		if (retrieveFromCache) {
			list = (List<LatestIndustryNews>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_LATESTINDUSTRYNEWS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_LATESTINDUSTRYNEWS;

				if (pagination) {
					sql = sql.concat(LatestIndustryNewsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<LatestIndustryNews>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<LatestIndustryNews>)QueryUtil.list(q,
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
	 * Removes all the latest industry newses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (LatestIndustryNews latestIndustryNews : findAll()) {
			remove(latestIndustryNews);
		}
	}

	/**
	 * Returns the number of latest industry newses.
	 *
	 * @return the number of latest industry newses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_LATESTINDUSTRYNEWS);

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
		return LatestIndustryNewsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the latest industry news persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(LatestIndustryNewsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_LATESTINDUSTRYNEWS = "SELECT latestIndustryNews FROM LatestIndustryNews latestIndustryNews";
	private static final String _SQL_SELECT_LATESTINDUSTRYNEWS_WHERE_PKS_IN = "SELECT latestIndustryNews FROM LatestIndustryNews latestIndustryNews WHERE id_ IN (";
	private static final String _SQL_COUNT_LATESTINDUSTRYNEWS = "SELECT COUNT(latestIndustryNews) FROM LatestIndustryNews latestIndustryNews";
	private static final String _ORDER_BY_ENTITY_ALIAS = "latestIndustryNews.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No LatestIndustryNews exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(LatestIndustryNewsPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final LatestIndustryNews _nullLatestIndustryNews = new LatestIndustryNewsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<LatestIndustryNews> toCacheModel() {
				return _nullLatestIndustryNewsCacheModel;
			}
		};

	private static final CacheModel<LatestIndustryNews> _nullLatestIndustryNewsCacheModel =
		new CacheModel<LatestIndustryNews>() {
			@Override
			public LatestIndustryNews toEntityModel() {
				return _nullLatestIndustryNews;
			}
		};
}