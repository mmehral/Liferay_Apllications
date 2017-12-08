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

package com.chola.birthday.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.birthday.exception.NoSuchpredefinedmessagesException;
import com.chola.birthday.model.impl.predefinedmessagesImpl;
import com.chola.birthday.model.impl.predefinedmessagesModelImpl;
import com.chola.birthday.model.predefinedmessages;
import com.chola.birthday.service.persistence.predefinedmessagesPersistence;

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
 * The persistence implementation for the predefinedmessages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see predefinedmessagesPersistence
 * @see com.chola.birthday.service.persistence.predefinedmessagesUtil
 * @generated
 */
@ProviderType
public class predefinedmessagesPersistenceImpl extends BasePersistenceImpl<predefinedmessages>
	implements predefinedmessagesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link predefinedmessagesUtil} to access the predefinedmessages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = predefinedmessagesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(predefinedmessagesModelImpl.ENTITY_CACHE_ENABLED,
			predefinedmessagesModelImpl.FINDER_CACHE_ENABLED,
			predefinedmessagesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(predefinedmessagesModelImpl.ENTITY_CACHE_ENABLED,
			predefinedmessagesModelImpl.FINDER_CACHE_ENABLED,
			predefinedmessagesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(predefinedmessagesModelImpl.ENTITY_CACHE_ENABLED,
			predefinedmessagesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public predefinedmessagesPersistenceImpl() {
		setModelClass(predefinedmessages.class);
	}

	/**
	 * Caches the predefinedmessages in the entity cache if it is enabled.
	 *
	 * @param predefinedmessages the predefinedmessages
	 */
	@Override
	public void cacheResult(predefinedmessages predefinedmessages) {
		entityCache.putResult(predefinedmessagesModelImpl.ENTITY_CACHE_ENABLED,
			predefinedmessagesImpl.class, predefinedmessages.getPrimaryKey(),
			predefinedmessages);

		predefinedmessages.resetOriginalValues();
	}

	/**
	 * Caches the predefinedmessageses in the entity cache if it is enabled.
	 *
	 * @param predefinedmessageses the predefinedmessageses
	 */
	@Override
	public void cacheResult(List<predefinedmessages> predefinedmessageses) {
		for (predefinedmessages predefinedmessages : predefinedmessageses) {
			if (entityCache.getResult(
						predefinedmessagesModelImpl.ENTITY_CACHE_ENABLED,
						predefinedmessagesImpl.class,
						predefinedmessages.getPrimaryKey()) == null) {
				cacheResult(predefinedmessages);
			}
			else {
				predefinedmessages.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all predefinedmessageses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(predefinedmessagesImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the predefinedmessages.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(predefinedmessages predefinedmessages) {
		entityCache.removeResult(predefinedmessagesModelImpl.ENTITY_CACHE_ENABLED,
			predefinedmessagesImpl.class, predefinedmessages.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<predefinedmessages> predefinedmessageses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (predefinedmessages predefinedmessages : predefinedmessageses) {
			entityCache.removeResult(predefinedmessagesModelImpl.ENTITY_CACHE_ENABLED,
				predefinedmessagesImpl.class, predefinedmessages.getPrimaryKey());
		}
	}

	/**
	 * Creates a new predefinedmessages with the primary key. Does not add the predefinedmessages to the database.
	 *
	 * @param id the primary key for the new predefinedmessages
	 * @return the new predefinedmessages
	 */
	@Override
	public predefinedmessages create(long id) {
		predefinedmessages predefinedmessages = new predefinedmessagesImpl();

		predefinedmessages.setNew(true);
		predefinedmessages.setPrimaryKey(id);

		return predefinedmessages;
	}

	/**
	 * Removes the predefinedmessages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the predefinedmessages
	 * @return the predefinedmessages that was removed
	 * @throws NoSuchpredefinedmessagesException if a predefinedmessages with the primary key could not be found
	 */
	@Override
	public predefinedmessages remove(long id)
		throws NoSuchpredefinedmessagesException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the predefinedmessages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the predefinedmessages
	 * @return the predefinedmessages that was removed
	 * @throws NoSuchpredefinedmessagesException if a predefinedmessages with the primary key could not be found
	 */
	@Override
	public predefinedmessages remove(Serializable primaryKey)
		throws NoSuchpredefinedmessagesException {
		Session session = null;

		try {
			session = openSession();

			predefinedmessages predefinedmessages = (predefinedmessages)session.get(predefinedmessagesImpl.class,
					primaryKey);

			if (predefinedmessages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchpredefinedmessagesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(predefinedmessages);
		}
		catch (NoSuchpredefinedmessagesException nsee) {
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
	protected predefinedmessages removeImpl(
		predefinedmessages predefinedmessages) {
		predefinedmessages = toUnwrappedModel(predefinedmessages);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(predefinedmessages)) {
				predefinedmessages = (predefinedmessages)session.get(predefinedmessagesImpl.class,
						predefinedmessages.getPrimaryKeyObj());
			}

			if (predefinedmessages != null) {
				session.delete(predefinedmessages);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (predefinedmessages != null) {
			clearCache(predefinedmessages);
		}

		return predefinedmessages;
	}

	@Override
	public predefinedmessages updateImpl(predefinedmessages predefinedmessages) {
		predefinedmessages = toUnwrappedModel(predefinedmessages);

		boolean isNew = predefinedmessages.isNew();

		Session session = null;

		try {
			session = openSession();

			if (predefinedmessages.isNew()) {
				session.save(predefinedmessages);

				predefinedmessages.setNew(false);
			}
			else {
				predefinedmessages = (predefinedmessages)session.merge(predefinedmessages);
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

		entityCache.putResult(predefinedmessagesModelImpl.ENTITY_CACHE_ENABLED,
			predefinedmessagesImpl.class, predefinedmessages.getPrimaryKey(),
			predefinedmessages, false);

		predefinedmessages.resetOriginalValues();

		return predefinedmessages;
	}

	protected predefinedmessages toUnwrappedModel(
		predefinedmessages predefinedmessages) {
		if (predefinedmessages instanceof predefinedmessagesImpl) {
			return predefinedmessages;
		}

		predefinedmessagesImpl predefinedmessagesImpl = new predefinedmessagesImpl();

		predefinedmessagesImpl.setNew(predefinedmessages.isNew());
		predefinedmessagesImpl.setPrimaryKey(predefinedmessages.getPrimaryKey());

		predefinedmessagesImpl.setId(predefinedmessages.getId());
		predefinedmessagesImpl.setMessage(predefinedmessages.getMessage());

		return predefinedmessagesImpl;
	}

	/**
	 * Returns the predefinedmessages with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the predefinedmessages
	 * @return the predefinedmessages
	 * @throws NoSuchpredefinedmessagesException if a predefinedmessages with the primary key could not be found
	 */
	@Override
	public predefinedmessages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchpredefinedmessagesException {
		predefinedmessages predefinedmessages = fetchByPrimaryKey(primaryKey);

		if (predefinedmessages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchpredefinedmessagesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return predefinedmessages;
	}

	/**
	 * Returns the predefinedmessages with the primary key or throws a {@link NoSuchpredefinedmessagesException} if it could not be found.
	 *
	 * @param id the primary key of the predefinedmessages
	 * @return the predefinedmessages
	 * @throws NoSuchpredefinedmessagesException if a predefinedmessages with the primary key could not be found
	 */
	@Override
	public predefinedmessages findByPrimaryKey(long id)
		throws NoSuchpredefinedmessagesException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the predefinedmessages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the predefinedmessages
	 * @return the predefinedmessages, or <code>null</code> if a predefinedmessages with the primary key could not be found
	 */
	@Override
	public predefinedmessages fetchByPrimaryKey(Serializable primaryKey) {
		predefinedmessages predefinedmessages = (predefinedmessages)entityCache.getResult(predefinedmessagesModelImpl.ENTITY_CACHE_ENABLED,
				predefinedmessagesImpl.class, primaryKey);

		if (predefinedmessages == _nullpredefinedmessages) {
			return null;
		}

		if (predefinedmessages == null) {
			Session session = null;

			try {
				session = openSession();

				predefinedmessages = (predefinedmessages)session.get(predefinedmessagesImpl.class,
						primaryKey);

				if (predefinedmessages != null) {
					cacheResult(predefinedmessages);
				}
				else {
					entityCache.putResult(predefinedmessagesModelImpl.ENTITY_CACHE_ENABLED,
						predefinedmessagesImpl.class, primaryKey,
						_nullpredefinedmessages);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(predefinedmessagesModelImpl.ENTITY_CACHE_ENABLED,
					predefinedmessagesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return predefinedmessages;
	}

	/**
	 * Returns the predefinedmessages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the predefinedmessages
	 * @return the predefinedmessages, or <code>null</code> if a predefinedmessages with the primary key could not be found
	 */
	@Override
	public predefinedmessages fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, predefinedmessages> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, predefinedmessages> map = new HashMap<Serializable, predefinedmessages>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			predefinedmessages predefinedmessages = fetchByPrimaryKey(primaryKey);

			if (predefinedmessages != null) {
				map.put(primaryKey, predefinedmessages);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			predefinedmessages predefinedmessages = (predefinedmessages)entityCache.getResult(predefinedmessagesModelImpl.ENTITY_CACHE_ENABLED,
					predefinedmessagesImpl.class, primaryKey);

			if (predefinedmessages == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, predefinedmessages);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PREDEFINEDMESSAGES_WHERE_PKS_IN);

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

			for (predefinedmessages predefinedmessages : (List<predefinedmessages>)q.list()) {
				map.put(predefinedmessages.getPrimaryKeyObj(),
					predefinedmessages);

				cacheResult(predefinedmessages);

				uncachedPrimaryKeys.remove(predefinedmessages.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(predefinedmessagesModelImpl.ENTITY_CACHE_ENABLED,
					predefinedmessagesImpl.class, primaryKey,
					_nullpredefinedmessages);
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
	 * Returns all the predefinedmessageses.
	 *
	 * @return the predefinedmessageses
	 */
	@Override
	public List<predefinedmessages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the predefinedmessageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link predefinedmessagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of predefinedmessageses
	 * @param end the upper bound of the range of predefinedmessageses (not inclusive)
	 * @return the range of predefinedmessageses
	 */
	@Override
	public List<predefinedmessages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the predefinedmessageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link predefinedmessagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of predefinedmessageses
	 * @param end the upper bound of the range of predefinedmessageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of predefinedmessageses
	 */
	@Override
	public List<predefinedmessages> findAll(int start, int end,
		OrderByComparator<predefinedmessages> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the predefinedmessageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link predefinedmessagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of predefinedmessageses
	 * @param end the upper bound of the range of predefinedmessageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of predefinedmessageses
	 */
	@Override
	public List<predefinedmessages> findAll(int start, int end,
		OrderByComparator<predefinedmessages> orderByComparator,
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

		List<predefinedmessages> list = null;

		if (retrieveFromCache) {
			list = (List<predefinedmessages>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PREDEFINEDMESSAGES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PREDEFINEDMESSAGES;

				if (pagination) {
					sql = sql.concat(predefinedmessagesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<predefinedmessages>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<predefinedmessages>)QueryUtil.list(q,
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
	 * Removes all the predefinedmessageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (predefinedmessages predefinedmessages : findAll()) {
			remove(predefinedmessages);
		}
	}

	/**
	 * Returns the number of predefinedmessageses.
	 *
	 * @return the number of predefinedmessageses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PREDEFINEDMESSAGES);

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
		return predefinedmessagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the predefinedmessages persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(predefinedmessagesImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_PREDEFINEDMESSAGES = "SELECT predefinedmessages FROM predefinedmessages predefinedmessages";
	private static final String _SQL_SELECT_PREDEFINEDMESSAGES_WHERE_PKS_IN = "SELECT predefinedmessages FROM predefinedmessages predefinedmessages WHERE id_ IN (";
	private static final String _SQL_COUNT_PREDEFINEDMESSAGES = "SELECT COUNT(predefinedmessages) FROM predefinedmessages predefinedmessages";
	private static final String _ORDER_BY_ENTITY_ALIAS = "predefinedmessages.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No predefinedmessages exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(predefinedmessagesPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final predefinedmessages _nullpredefinedmessages = new predefinedmessagesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<predefinedmessages> toCacheModel() {
				return _nullpredefinedmessagesCacheModel;
			}
		};

	private static final CacheModel<predefinedmessages> _nullpredefinedmessagesCacheModel =
		new CacheModel<predefinedmessages>() {
			@Override
			public predefinedmessages toEntityModel() {
				return _nullpredefinedmessages;
			}
		};
}