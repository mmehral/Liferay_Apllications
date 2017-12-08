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

package com.chola.swagatam.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.swagatam.exception.NoSuchswagatamdataException;
import com.chola.swagatam.model.impl.swagatamdataImpl;
import com.chola.swagatam.model.impl.swagatamdataModelImpl;
import com.chola.swagatam.model.swagatamdata;
import com.chola.swagatam.service.persistence.swagatamdataPersistence;

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
 * The persistence implementation for the swagatamdata service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see swagatamdataPersistence
 * @see com.chola.swagatam.service.persistence.swagatamdataUtil
 * @generated
 */
@ProviderType
public class swagatamdataPersistenceImpl extends BasePersistenceImpl<swagatamdata>
	implements swagatamdataPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link swagatamdataUtil} to access the swagatamdata persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = swagatamdataImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(swagatamdataModelImpl.ENTITY_CACHE_ENABLED,
			swagatamdataModelImpl.FINDER_CACHE_ENABLED, swagatamdataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(swagatamdataModelImpl.ENTITY_CACHE_ENABLED,
			swagatamdataModelImpl.FINDER_CACHE_ENABLED, swagatamdataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(swagatamdataModelImpl.ENTITY_CACHE_ENABLED,
			swagatamdataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public swagatamdataPersistenceImpl() {
		setModelClass(swagatamdata.class);
	}

	/**
	 * Caches the swagatamdata in the entity cache if it is enabled.
	 *
	 * @param swagatamdata the swagatamdata
	 */
	@Override
	public void cacheResult(swagatamdata swagatamdata) {
		entityCache.putResult(swagatamdataModelImpl.ENTITY_CACHE_ENABLED,
			swagatamdataImpl.class, swagatamdata.getPrimaryKey(), swagatamdata);

		swagatamdata.resetOriginalValues();
	}

	/**
	 * Caches the swagatamdatas in the entity cache if it is enabled.
	 *
	 * @param swagatamdatas the swagatamdatas
	 */
	@Override
	public void cacheResult(List<swagatamdata> swagatamdatas) {
		for (swagatamdata swagatamdata : swagatamdatas) {
			if (entityCache.getResult(
						swagatamdataModelImpl.ENTITY_CACHE_ENABLED,
						swagatamdataImpl.class, swagatamdata.getPrimaryKey()) == null) {
				cacheResult(swagatamdata);
			}
			else {
				swagatamdata.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all swagatamdatas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(swagatamdataImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the swagatamdata.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(swagatamdata swagatamdata) {
		entityCache.removeResult(swagatamdataModelImpl.ENTITY_CACHE_ENABLED,
			swagatamdataImpl.class, swagatamdata.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<swagatamdata> swagatamdatas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (swagatamdata swagatamdata : swagatamdatas) {
			entityCache.removeResult(swagatamdataModelImpl.ENTITY_CACHE_ENABLED,
				swagatamdataImpl.class, swagatamdata.getPrimaryKey());
		}
	}

	/**
	 * Creates a new swagatamdata with the primary key. Does not add the swagatamdata to the database.
	 *
	 * @param id the primary key for the new swagatamdata
	 * @return the new swagatamdata
	 */
	@Override
	public swagatamdata create(long id) {
		swagatamdata swagatamdata = new swagatamdataImpl();

		swagatamdata.setNew(true);
		swagatamdata.setPrimaryKey(id);

		return swagatamdata;
	}

	/**
	 * Removes the swagatamdata with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the swagatamdata
	 * @return the swagatamdata that was removed
	 * @throws NoSuchswagatamdataException if a swagatamdata with the primary key could not be found
	 */
	@Override
	public swagatamdata remove(long id) throws NoSuchswagatamdataException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the swagatamdata with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the swagatamdata
	 * @return the swagatamdata that was removed
	 * @throws NoSuchswagatamdataException if a swagatamdata with the primary key could not be found
	 */
	@Override
	public swagatamdata remove(Serializable primaryKey)
		throws NoSuchswagatamdataException {
		Session session = null;

		try {
			session = openSession();

			swagatamdata swagatamdata = (swagatamdata)session.get(swagatamdataImpl.class,
					primaryKey);

			if (swagatamdata == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchswagatamdataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(swagatamdata);
		}
		catch (NoSuchswagatamdataException nsee) {
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
	protected swagatamdata removeImpl(swagatamdata swagatamdata) {
		swagatamdata = toUnwrappedModel(swagatamdata);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(swagatamdata)) {
				swagatamdata = (swagatamdata)session.get(swagatamdataImpl.class,
						swagatamdata.getPrimaryKeyObj());
			}

			if (swagatamdata != null) {
				session.delete(swagatamdata);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (swagatamdata != null) {
			clearCache(swagatamdata);
		}

		return swagatamdata;
	}

	@Override
	public swagatamdata updateImpl(swagatamdata swagatamdata) {
		swagatamdata = toUnwrappedModel(swagatamdata);

		boolean isNew = swagatamdata.isNew();

		Session session = null;

		try {
			session = openSession();

			if (swagatamdata.isNew()) {
				session.save(swagatamdata);

				swagatamdata.setNew(false);
			}
			else {
				swagatamdata = (swagatamdata)session.merge(swagatamdata);
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

		entityCache.putResult(swagatamdataModelImpl.ENTITY_CACHE_ENABLED,
			swagatamdataImpl.class, swagatamdata.getPrimaryKey(), swagatamdata,
			false);

		swagatamdata.resetOriginalValues();

		return swagatamdata;
	}

	protected swagatamdata toUnwrappedModel(swagatamdata swagatamdata) {
		if (swagatamdata instanceof swagatamdataImpl) {
			return swagatamdata;
		}

		swagatamdataImpl swagatamdataImpl = new swagatamdataImpl();

		swagatamdataImpl.setNew(swagatamdata.isNew());
		swagatamdataImpl.setPrimaryKey(swagatamdata.getPrimaryKey());

		swagatamdataImpl.setId(swagatamdata.getId());
		swagatamdataImpl.setEmpId(swagatamdata.getEmpId());
		swagatamdataImpl.setWatched(swagatamdata.getWatched());
		swagatamdataImpl.setAcknowledged(swagatamdata.getAcknowledged());

		return swagatamdataImpl;
	}

	/**
	 * Returns the swagatamdata with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the swagatamdata
	 * @return the swagatamdata
	 * @throws NoSuchswagatamdataException if a swagatamdata with the primary key could not be found
	 */
	@Override
	public swagatamdata findByPrimaryKey(Serializable primaryKey)
		throws NoSuchswagatamdataException {
		swagatamdata swagatamdata = fetchByPrimaryKey(primaryKey);

		if (swagatamdata == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchswagatamdataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return swagatamdata;
	}

	/**
	 * Returns the swagatamdata with the primary key or throws a {@link NoSuchswagatamdataException} if it could not be found.
	 *
	 * @param id the primary key of the swagatamdata
	 * @return the swagatamdata
	 * @throws NoSuchswagatamdataException if a swagatamdata with the primary key could not be found
	 */
	@Override
	public swagatamdata findByPrimaryKey(long id)
		throws NoSuchswagatamdataException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the swagatamdata with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the swagatamdata
	 * @return the swagatamdata, or <code>null</code> if a swagatamdata with the primary key could not be found
	 */
	@Override
	public swagatamdata fetchByPrimaryKey(Serializable primaryKey) {
		swagatamdata swagatamdata = (swagatamdata)entityCache.getResult(swagatamdataModelImpl.ENTITY_CACHE_ENABLED,
				swagatamdataImpl.class, primaryKey);

		if (swagatamdata == _nullswagatamdata) {
			return null;
		}

		if (swagatamdata == null) {
			Session session = null;

			try {
				session = openSession();

				swagatamdata = (swagatamdata)session.get(swagatamdataImpl.class,
						primaryKey);

				if (swagatamdata != null) {
					cacheResult(swagatamdata);
				}
				else {
					entityCache.putResult(swagatamdataModelImpl.ENTITY_CACHE_ENABLED,
						swagatamdataImpl.class, primaryKey, _nullswagatamdata);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(swagatamdataModelImpl.ENTITY_CACHE_ENABLED,
					swagatamdataImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return swagatamdata;
	}

	/**
	 * Returns the swagatamdata with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the swagatamdata
	 * @return the swagatamdata, or <code>null</code> if a swagatamdata with the primary key could not be found
	 */
	@Override
	public swagatamdata fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, swagatamdata> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, swagatamdata> map = new HashMap<Serializable, swagatamdata>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			swagatamdata swagatamdata = fetchByPrimaryKey(primaryKey);

			if (swagatamdata != null) {
				map.put(primaryKey, swagatamdata);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			swagatamdata swagatamdata = (swagatamdata)entityCache.getResult(swagatamdataModelImpl.ENTITY_CACHE_ENABLED,
					swagatamdataImpl.class, primaryKey);

			if (swagatamdata == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, swagatamdata);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SWAGATAMDATA_WHERE_PKS_IN);

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

			for (swagatamdata swagatamdata : (List<swagatamdata>)q.list()) {
				map.put(swagatamdata.getPrimaryKeyObj(), swagatamdata);

				cacheResult(swagatamdata);

				uncachedPrimaryKeys.remove(swagatamdata.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(swagatamdataModelImpl.ENTITY_CACHE_ENABLED,
					swagatamdataImpl.class, primaryKey, _nullswagatamdata);
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
	 * Returns all the swagatamdatas.
	 *
	 * @return the swagatamdatas
	 */
	@Override
	public List<swagatamdata> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the swagatamdatas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatamdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of swagatamdatas
	 * @param end the upper bound of the range of swagatamdatas (not inclusive)
	 * @return the range of swagatamdatas
	 */
	@Override
	public List<swagatamdata> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the swagatamdatas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatamdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of swagatamdatas
	 * @param end the upper bound of the range of swagatamdatas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of swagatamdatas
	 */
	@Override
	public List<swagatamdata> findAll(int start, int end,
		OrderByComparator<swagatamdata> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the swagatamdatas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatamdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of swagatamdatas
	 * @param end the upper bound of the range of swagatamdatas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of swagatamdatas
	 */
	@Override
	public List<swagatamdata> findAll(int start, int end,
		OrderByComparator<swagatamdata> orderByComparator,
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

		List<swagatamdata> list = null;

		if (retrieveFromCache) {
			list = (List<swagatamdata>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SWAGATAMDATA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SWAGATAMDATA;

				if (pagination) {
					sql = sql.concat(swagatamdataModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<swagatamdata>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<swagatamdata>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the swagatamdatas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (swagatamdata swagatamdata : findAll()) {
			remove(swagatamdata);
		}
	}

	/**
	 * Returns the number of swagatamdatas.
	 *
	 * @return the number of swagatamdatas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SWAGATAMDATA);

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
		return swagatamdataModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the swagatamdata persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(swagatamdataImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_SWAGATAMDATA = "SELECT swagatamdata FROM swagatamdata swagatamdata";
	private static final String _SQL_SELECT_SWAGATAMDATA_WHERE_PKS_IN = "SELECT swagatamdata FROM swagatamdata swagatamdata WHERE id_ IN (";
	private static final String _SQL_COUNT_SWAGATAMDATA = "SELECT COUNT(swagatamdata) FROM swagatamdata swagatamdata";
	private static final String _ORDER_BY_ENTITY_ALIAS = "swagatamdata.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No swagatamdata exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(swagatamdataPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final swagatamdata _nullswagatamdata = new swagatamdataImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<swagatamdata> toCacheModel() {
				return _nullswagatamdataCacheModel;
			}
		};

	private static final CacheModel<swagatamdata> _nullswagatamdataCacheModel = new CacheModel<swagatamdata>() {
			@Override
			public swagatamdata toEntityModel() {
				return _nullswagatamdata;
			}
		};
}