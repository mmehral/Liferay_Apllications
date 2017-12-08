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

package com.chola.notificationchannel.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.notificationchannel.exception.NoSuchNoticationCategoryCountException;
import com.chola.notificationchannel.model.NoticationCategoryCount;
import com.chola.notificationchannel.model.impl.NoticationCategoryCountImpl;
import com.chola.notificationchannel.model.impl.NoticationCategoryCountModelImpl;
import com.chola.notificationchannel.service.persistence.NoticationCategoryCountPersistence;

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
 * The persistence implementation for the notication category count service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see NoticationCategoryCountPersistence
 * @see com.chola.notificationchannel.service.persistence.NoticationCategoryCountUtil
 * @generated
 */
@ProviderType
public class NoticationCategoryCountPersistenceImpl extends BasePersistenceImpl<NoticationCategoryCount>
	implements NoticationCategoryCountPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link NoticationCategoryCountUtil} to access the notication category count persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = NoticationCategoryCountImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NoticationCategoryCountModelImpl.ENTITY_CACHE_ENABLED,
			NoticationCategoryCountModelImpl.FINDER_CACHE_ENABLED,
			NoticationCategoryCountImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NoticationCategoryCountModelImpl.ENTITY_CACHE_ENABLED,
			NoticationCategoryCountModelImpl.FINDER_CACHE_ENABLED,
			NoticationCategoryCountImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NoticationCategoryCountModelImpl.ENTITY_CACHE_ENABLED,
			NoticationCategoryCountModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public NoticationCategoryCountPersistenceImpl() {
		setModelClass(NoticationCategoryCount.class);
	}

	/**
	 * Caches the notication category count in the entity cache if it is enabled.
	 *
	 * @param noticationCategoryCount the notication category count
	 */
	@Override
	public void cacheResult(NoticationCategoryCount noticationCategoryCount) {
		entityCache.putResult(NoticationCategoryCountModelImpl.ENTITY_CACHE_ENABLED,
			NoticationCategoryCountImpl.class,
			noticationCategoryCount.getPrimaryKey(), noticationCategoryCount);

		noticationCategoryCount.resetOriginalValues();
	}

	/**
	 * Caches the notication category counts in the entity cache if it is enabled.
	 *
	 * @param noticationCategoryCounts the notication category counts
	 */
	@Override
	public void cacheResult(
		List<NoticationCategoryCount> noticationCategoryCounts) {
		for (NoticationCategoryCount noticationCategoryCount : noticationCategoryCounts) {
			if (entityCache.getResult(
						NoticationCategoryCountModelImpl.ENTITY_CACHE_ENABLED,
						NoticationCategoryCountImpl.class,
						noticationCategoryCount.getPrimaryKey()) == null) {
				cacheResult(noticationCategoryCount);
			}
			else {
				noticationCategoryCount.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all notication category counts.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NoticationCategoryCountImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the notication category count.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NoticationCategoryCount noticationCategoryCount) {
		entityCache.removeResult(NoticationCategoryCountModelImpl.ENTITY_CACHE_ENABLED,
			NoticationCategoryCountImpl.class,
			noticationCategoryCount.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<NoticationCategoryCount> noticationCategoryCounts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (NoticationCategoryCount noticationCategoryCount : noticationCategoryCounts) {
			entityCache.removeResult(NoticationCategoryCountModelImpl.ENTITY_CACHE_ENABLED,
				NoticationCategoryCountImpl.class,
				noticationCategoryCount.getPrimaryKey());
		}
	}

	/**
	 * Creates a new notication category count with the primary key. Does not add the notication category count to the database.
	 *
	 * @param eventId the primary key for the new notication category count
	 * @return the new notication category count
	 */
	@Override
	public NoticationCategoryCount create(long eventId) {
		NoticationCategoryCount noticationCategoryCount = new NoticationCategoryCountImpl();

		noticationCategoryCount.setNew(true);
		noticationCategoryCount.setPrimaryKey(eventId);

		return noticationCategoryCount;
	}

	/**
	 * Removes the notication category count with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param eventId the primary key of the notication category count
	 * @return the notication category count that was removed
	 * @throws NoSuchNoticationCategoryCountException if a notication category count with the primary key could not be found
	 */
	@Override
	public NoticationCategoryCount remove(long eventId)
		throws NoSuchNoticationCategoryCountException {
		return remove((Serializable)eventId);
	}

	/**
	 * Removes the notication category count with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the notication category count
	 * @return the notication category count that was removed
	 * @throws NoSuchNoticationCategoryCountException if a notication category count with the primary key could not be found
	 */
	@Override
	public NoticationCategoryCount remove(Serializable primaryKey)
		throws NoSuchNoticationCategoryCountException {
		Session session = null;

		try {
			session = openSession();

			NoticationCategoryCount noticationCategoryCount = (NoticationCategoryCount)session.get(NoticationCategoryCountImpl.class,
					primaryKey);

			if (noticationCategoryCount == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNoticationCategoryCountException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(noticationCategoryCount);
		}
		catch (NoSuchNoticationCategoryCountException nsee) {
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
	protected NoticationCategoryCount removeImpl(
		NoticationCategoryCount noticationCategoryCount) {
		noticationCategoryCount = toUnwrappedModel(noticationCategoryCount);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(noticationCategoryCount)) {
				noticationCategoryCount = (NoticationCategoryCount)session.get(NoticationCategoryCountImpl.class,
						noticationCategoryCount.getPrimaryKeyObj());
			}

			if (noticationCategoryCount != null) {
				session.delete(noticationCategoryCount);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (noticationCategoryCount != null) {
			clearCache(noticationCategoryCount);
		}

		return noticationCategoryCount;
	}

	@Override
	public NoticationCategoryCount updateImpl(
		NoticationCategoryCount noticationCategoryCount) {
		noticationCategoryCount = toUnwrappedModel(noticationCategoryCount);

		boolean isNew = noticationCategoryCount.isNew();

		Session session = null;

		try {
			session = openSession();

			if (noticationCategoryCount.isNew()) {
				session.save(noticationCategoryCount);

				noticationCategoryCount.setNew(false);
			}
			else {
				noticationCategoryCount = (NoticationCategoryCount)session.merge(noticationCategoryCount);
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

		entityCache.putResult(NoticationCategoryCountModelImpl.ENTITY_CACHE_ENABLED,
			NoticationCategoryCountImpl.class,
			noticationCategoryCount.getPrimaryKey(), noticationCategoryCount,
			false);

		noticationCategoryCount.resetOriginalValues();

		return noticationCategoryCount;
	}

	protected NoticationCategoryCount toUnwrappedModel(
		NoticationCategoryCount noticationCategoryCount) {
		if (noticationCategoryCount instanceof NoticationCategoryCountImpl) {
			return noticationCategoryCount;
		}

		NoticationCategoryCountImpl noticationCategoryCountImpl = new NoticationCategoryCountImpl();

		noticationCategoryCountImpl.setNew(noticationCategoryCount.isNew());
		noticationCategoryCountImpl.setPrimaryKey(noticationCategoryCount.getPrimaryKey());

		noticationCategoryCountImpl.setEventId(noticationCategoryCount.getEventId());
		noticationCategoryCountImpl.setUsername(noticationCategoryCount.getUsername());

		return noticationCategoryCountImpl;
	}

	/**
	 * Returns the notication category count with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the notication category count
	 * @return the notication category count
	 * @throws NoSuchNoticationCategoryCountException if a notication category count with the primary key could not be found
	 */
	@Override
	public NoticationCategoryCount findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNoticationCategoryCountException {
		NoticationCategoryCount noticationCategoryCount = fetchByPrimaryKey(primaryKey);

		if (noticationCategoryCount == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNoticationCategoryCountException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return noticationCategoryCount;
	}

	/**
	 * Returns the notication category count with the primary key or throws a {@link NoSuchNoticationCategoryCountException} if it could not be found.
	 *
	 * @param eventId the primary key of the notication category count
	 * @return the notication category count
	 * @throws NoSuchNoticationCategoryCountException if a notication category count with the primary key could not be found
	 */
	@Override
	public NoticationCategoryCount findByPrimaryKey(long eventId)
		throws NoSuchNoticationCategoryCountException {
		return findByPrimaryKey((Serializable)eventId);
	}

	/**
	 * Returns the notication category count with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the notication category count
	 * @return the notication category count, or <code>null</code> if a notication category count with the primary key could not be found
	 */
	@Override
	public NoticationCategoryCount fetchByPrimaryKey(Serializable primaryKey) {
		NoticationCategoryCount noticationCategoryCount = (NoticationCategoryCount)entityCache.getResult(NoticationCategoryCountModelImpl.ENTITY_CACHE_ENABLED,
				NoticationCategoryCountImpl.class, primaryKey);

		if (noticationCategoryCount == _nullNoticationCategoryCount) {
			return null;
		}

		if (noticationCategoryCount == null) {
			Session session = null;

			try {
				session = openSession();

				noticationCategoryCount = (NoticationCategoryCount)session.get(NoticationCategoryCountImpl.class,
						primaryKey);

				if (noticationCategoryCount != null) {
					cacheResult(noticationCategoryCount);
				}
				else {
					entityCache.putResult(NoticationCategoryCountModelImpl.ENTITY_CACHE_ENABLED,
						NoticationCategoryCountImpl.class, primaryKey,
						_nullNoticationCategoryCount);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(NoticationCategoryCountModelImpl.ENTITY_CACHE_ENABLED,
					NoticationCategoryCountImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return noticationCategoryCount;
	}

	/**
	 * Returns the notication category count with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param eventId the primary key of the notication category count
	 * @return the notication category count, or <code>null</code> if a notication category count with the primary key could not be found
	 */
	@Override
	public NoticationCategoryCount fetchByPrimaryKey(long eventId) {
		return fetchByPrimaryKey((Serializable)eventId);
	}

	@Override
	public Map<Serializable, NoticationCategoryCount> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, NoticationCategoryCount> map = new HashMap<Serializable, NoticationCategoryCount>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			NoticationCategoryCount noticationCategoryCount = fetchByPrimaryKey(primaryKey);

			if (noticationCategoryCount != null) {
				map.put(primaryKey, noticationCategoryCount);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			NoticationCategoryCount noticationCategoryCount = (NoticationCategoryCount)entityCache.getResult(NoticationCategoryCountModelImpl.ENTITY_CACHE_ENABLED,
					NoticationCategoryCountImpl.class, primaryKey);

			if (noticationCategoryCount == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, noticationCategoryCount);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_NOTICATIONCATEGORYCOUNT_WHERE_PKS_IN);

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

			for (NoticationCategoryCount noticationCategoryCount : (List<NoticationCategoryCount>)q.list()) {
				map.put(noticationCategoryCount.getPrimaryKeyObj(),
					noticationCategoryCount);

				cacheResult(noticationCategoryCount);

				uncachedPrimaryKeys.remove(noticationCategoryCount.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(NoticationCategoryCountModelImpl.ENTITY_CACHE_ENABLED,
					NoticationCategoryCountImpl.class, primaryKey,
					_nullNoticationCategoryCount);
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
	 * Returns all the notication category counts.
	 *
	 * @return the notication category counts
	 */
	@Override
	public List<NoticationCategoryCount> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the notication category counts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoticationCategoryCountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of notication category counts
	 * @param end the upper bound of the range of notication category counts (not inclusive)
	 * @return the range of notication category counts
	 */
	@Override
	public List<NoticationCategoryCount> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the notication category counts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoticationCategoryCountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of notication category counts
	 * @param end the upper bound of the range of notication category counts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of notication category counts
	 */
	@Override
	public List<NoticationCategoryCount> findAll(int start, int end,
		OrderByComparator<NoticationCategoryCount> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the notication category counts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoticationCategoryCountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of notication category counts
	 * @param end the upper bound of the range of notication category counts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of notication category counts
	 */
	@Override
	public List<NoticationCategoryCount> findAll(int start, int end,
		OrderByComparator<NoticationCategoryCount> orderByComparator,
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

		List<NoticationCategoryCount> list = null;

		if (retrieveFromCache) {
			list = (List<NoticationCategoryCount>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_NOTICATIONCATEGORYCOUNT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NOTICATIONCATEGORYCOUNT;

				if (pagination) {
					sql = sql.concat(NoticationCategoryCountModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<NoticationCategoryCount>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<NoticationCategoryCount>)QueryUtil.list(q,
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
	 * Removes all the notication category counts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NoticationCategoryCount noticationCategoryCount : findAll()) {
			remove(noticationCategoryCount);
		}
	}

	/**
	 * Returns the number of notication category counts.
	 *
	 * @return the number of notication category counts
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_NOTICATIONCATEGORYCOUNT);

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
		return NoticationCategoryCountModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the notication category count persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(NoticationCategoryCountImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_NOTICATIONCATEGORYCOUNT = "SELECT noticationCategoryCount FROM NoticationCategoryCount noticationCategoryCount";
	private static final String _SQL_SELECT_NOTICATIONCATEGORYCOUNT_WHERE_PKS_IN =
		"SELECT noticationCategoryCount FROM NoticationCategoryCount noticationCategoryCount WHERE eventId IN (";
	private static final String _SQL_COUNT_NOTICATIONCATEGORYCOUNT = "SELECT COUNT(noticationCategoryCount) FROM NoticationCategoryCount noticationCategoryCount";
	private static final String _ORDER_BY_ENTITY_ALIAS = "noticationCategoryCount.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NoticationCategoryCount exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(NoticationCategoryCountPersistenceImpl.class);
	private static final NoticationCategoryCount _nullNoticationCategoryCount = new NoticationCategoryCountImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<NoticationCategoryCount> toCacheModel() {
				return _nullNoticationCategoryCountCacheModel;
			}
		};

	private static final CacheModel<NoticationCategoryCount> _nullNoticationCategoryCountCacheModel =
		new CacheModel<NoticationCategoryCount>() {
			@Override
			public NoticationCategoryCount toEntityModel() {
				return _nullNoticationCategoryCount;
			}
		};
}