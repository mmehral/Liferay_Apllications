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

package com.chola.calendar.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.calendar.exception.NoSuchcorporateeventsdataException;
import com.chola.calendar.model.corporateeventsdata;
import com.chola.calendar.model.impl.corporateeventsdataImpl;
import com.chola.calendar.model.impl.corporateeventsdataModelImpl;
import com.chola.calendar.service.persistence.corporateeventsdataPersistence;

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
 * The persistence implementation for the corporateeventsdata service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see corporateeventsdataPersistence
 * @see com.chola.calendar.service.persistence.corporateeventsdataUtil
 * @generated
 */
@ProviderType
public class corporateeventsdataPersistenceImpl extends BasePersistenceImpl<corporateeventsdata>
	implements corporateeventsdataPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link corporateeventsdataUtil} to access the corporateeventsdata persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = corporateeventsdataImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(corporateeventsdataModelImpl.ENTITY_CACHE_ENABLED,
			corporateeventsdataModelImpl.FINDER_CACHE_ENABLED,
			corporateeventsdataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(corporateeventsdataModelImpl.ENTITY_CACHE_ENABLED,
			corporateeventsdataModelImpl.FINDER_CACHE_ENABLED,
			corporateeventsdataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(corporateeventsdataModelImpl.ENTITY_CACHE_ENABLED,
			corporateeventsdataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public corporateeventsdataPersistenceImpl() {
		setModelClass(corporateeventsdata.class);
	}

	/**
	 * Caches the corporateeventsdata in the entity cache if it is enabled.
	 *
	 * @param corporateeventsdata the corporateeventsdata
	 */
	@Override
	public void cacheResult(corporateeventsdata corporateeventsdata) {
		entityCache.putResult(corporateeventsdataModelImpl.ENTITY_CACHE_ENABLED,
			corporateeventsdataImpl.class, corporateeventsdata.getPrimaryKey(),
			corporateeventsdata);

		corporateeventsdata.resetOriginalValues();
	}

	/**
	 * Caches the corporateeventsdatas in the entity cache if it is enabled.
	 *
	 * @param corporateeventsdatas the corporateeventsdatas
	 */
	@Override
	public void cacheResult(List<corporateeventsdata> corporateeventsdatas) {
		for (corporateeventsdata corporateeventsdata : corporateeventsdatas) {
			if (entityCache.getResult(
						corporateeventsdataModelImpl.ENTITY_CACHE_ENABLED,
						corporateeventsdataImpl.class,
						corporateeventsdata.getPrimaryKey()) == null) {
				cacheResult(corporateeventsdata);
			}
			else {
				corporateeventsdata.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all corporateeventsdatas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(corporateeventsdataImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the corporateeventsdata.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(corporateeventsdata corporateeventsdata) {
		entityCache.removeResult(corporateeventsdataModelImpl.ENTITY_CACHE_ENABLED,
			corporateeventsdataImpl.class, corporateeventsdata.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<corporateeventsdata> corporateeventsdatas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (corporateeventsdata corporateeventsdata : corporateeventsdatas) {
			entityCache.removeResult(corporateeventsdataModelImpl.ENTITY_CACHE_ENABLED,
				corporateeventsdataImpl.class,
				corporateeventsdata.getPrimaryKey());
		}
	}

	/**
	 * Creates a new corporateeventsdata with the primary key. Does not add the corporateeventsdata to the database.
	 *
	 * @param id the primary key for the new corporateeventsdata
	 * @return the new corporateeventsdata
	 */
	@Override
	public corporateeventsdata create(long id) {
		corporateeventsdata corporateeventsdata = new corporateeventsdataImpl();

		corporateeventsdata.setNew(true);
		corporateeventsdata.setPrimaryKey(id);

		return corporateeventsdata;
	}

	/**
	 * Removes the corporateeventsdata with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the corporateeventsdata
	 * @return the corporateeventsdata that was removed
	 * @throws NoSuchcorporateeventsdataException if a corporateeventsdata with the primary key could not be found
	 */
	@Override
	public corporateeventsdata remove(long id)
		throws NoSuchcorporateeventsdataException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the corporateeventsdata with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the corporateeventsdata
	 * @return the corporateeventsdata that was removed
	 * @throws NoSuchcorporateeventsdataException if a corporateeventsdata with the primary key could not be found
	 */
	@Override
	public corporateeventsdata remove(Serializable primaryKey)
		throws NoSuchcorporateeventsdataException {
		Session session = null;

		try {
			session = openSession();

			corporateeventsdata corporateeventsdata = (corporateeventsdata)session.get(corporateeventsdataImpl.class,
					primaryKey);

			if (corporateeventsdata == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcorporateeventsdataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(corporateeventsdata);
		}
		catch (NoSuchcorporateeventsdataException nsee) {
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
	protected corporateeventsdata removeImpl(
		corporateeventsdata corporateeventsdata) {
		corporateeventsdata = toUnwrappedModel(corporateeventsdata);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(corporateeventsdata)) {
				corporateeventsdata = (corporateeventsdata)session.get(corporateeventsdataImpl.class,
						corporateeventsdata.getPrimaryKeyObj());
			}

			if (corporateeventsdata != null) {
				session.delete(corporateeventsdata);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (corporateeventsdata != null) {
			clearCache(corporateeventsdata);
		}

		return corporateeventsdata;
	}

	@Override
	public corporateeventsdata updateImpl(
		corporateeventsdata corporateeventsdata) {
		corporateeventsdata = toUnwrappedModel(corporateeventsdata);

		boolean isNew = corporateeventsdata.isNew();

		Session session = null;

		try {
			session = openSession();

			if (corporateeventsdata.isNew()) {
				session.save(corporateeventsdata);

				corporateeventsdata.setNew(false);
			}
			else {
				corporateeventsdata = (corporateeventsdata)session.merge(corporateeventsdata);
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

		entityCache.putResult(corporateeventsdataModelImpl.ENTITY_CACHE_ENABLED,
			corporateeventsdataImpl.class, corporateeventsdata.getPrimaryKey(),
			corporateeventsdata, false);

		corporateeventsdata.resetOriginalValues();

		return corporateeventsdata;
	}

	protected corporateeventsdata toUnwrappedModel(
		corporateeventsdata corporateeventsdata) {
		if (corporateeventsdata instanceof corporateeventsdataImpl) {
			return corporateeventsdata;
		}

		corporateeventsdataImpl corporateeventsdataImpl = new corporateeventsdataImpl();

		corporateeventsdataImpl.setNew(corporateeventsdata.isNew());
		corporateeventsdataImpl.setPrimaryKey(corporateeventsdata.getPrimaryKey());

		corporateeventsdataImpl.setId(corporateeventsdata.getId());
		corporateeventsdataImpl.setTitle(corporateeventsdata.getTitle());
		corporateeventsdataImpl.setDescription(corporateeventsdata.getDescription());
		corporateeventsdataImpl.setZone(corporateeventsdata.getZone());
		corporateeventsdataImpl.setRegion(corporateeventsdata.getRegion());
		corporateeventsdataImpl.setLocation(corporateeventsdata.getLocation());
		corporateeventsdataImpl.setPersonincharge(corporateeventsdata.getPersonincharge());
		corporateeventsdataImpl.setSchedulestartdate(corporateeventsdata.getSchedulestartdate());
		corporateeventsdataImpl.setScheduleenddate(corporateeventsdata.getScheduleenddate());

		return corporateeventsdataImpl;
	}

	/**
	 * Returns the corporateeventsdata with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the corporateeventsdata
	 * @return the corporateeventsdata
	 * @throws NoSuchcorporateeventsdataException if a corporateeventsdata with the primary key could not be found
	 */
	@Override
	public corporateeventsdata findByPrimaryKey(Serializable primaryKey)
		throws NoSuchcorporateeventsdataException {
		corporateeventsdata corporateeventsdata = fetchByPrimaryKey(primaryKey);

		if (corporateeventsdata == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcorporateeventsdataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return corporateeventsdata;
	}

	/**
	 * Returns the corporateeventsdata with the primary key or throws a {@link NoSuchcorporateeventsdataException} if it could not be found.
	 *
	 * @param id the primary key of the corporateeventsdata
	 * @return the corporateeventsdata
	 * @throws NoSuchcorporateeventsdataException if a corporateeventsdata with the primary key could not be found
	 */
	@Override
	public corporateeventsdata findByPrimaryKey(long id)
		throws NoSuchcorporateeventsdataException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the corporateeventsdata with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the corporateeventsdata
	 * @return the corporateeventsdata, or <code>null</code> if a corporateeventsdata with the primary key could not be found
	 */
	@Override
	public corporateeventsdata fetchByPrimaryKey(Serializable primaryKey) {
		corporateeventsdata corporateeventsdata = (corporateeventsdata)entityCache.getResult(corporateeventsdataModelImpl.ENTITY_CACHE_ENABLED,
				corporateeventsdataImpl.class, primaryKey);

		if (corporateeventsdata == _nullcorporateeventsdata) {
			return null;
		}

		if (corporateeventsdata == null) {
			Session session = null;

			try {
				session = openSession();

				corporateeventsdata = (corporateeventsdata)session.get(corporateeventsdataImpl.class,
						primaryKey);

				if (corporateeventsdata != null) {
					cacheResult(corporateeventsdata);
				}
				else {
					entityCache.putResult(corporateeventsdataModelImpl.ENTITY_CACHE_ENABLED,
						corporateeventsdataImpl.class, primaryKey,
						_nullcorporateeventsdata);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(corporateeventsdataModelImpl.ENTITY_CACHE_ENABLED,
					corporateeventsdataImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return corporateeventsdata;
	}

	/**
	 * Returns the corporateeventsdata with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the corporateeventsdata
	 * @return the corporateeventsdata, or <code>null</code> if a corporateeventsdata with the primary key could not be found
	 */
	@Override
	public corporateeventsdata fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, corporateeventsdata> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, corporateeventsdata> map = new HashMap<Serializable, corporateeventsdata>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			corporateeventsdata corporateeventsdata = fetchByPrimaryKey(primaryKey);

			if (corporateeventsdata != null) {
				map.put(primaryKey, corporateeventsdata);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			corporateeventsdata corporateeventsdata = (corporateeventsdata)entityCache.getResult(corporateeventsdataModelImpl.ENTITY_CACHE_ENABLED,
					corporateeventsdataImpl.class, primaryKey);

			if (corporateeventsdata == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, corporateeventsdata);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CORPORATEEVENTSDATA_WHERE_PKS_IN);

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

			for (corporateeventsdata corporateeventsdata : (List<corporateeventsdata>)q.list()) {
				map.put(corporateeventsdata.getPrimaryKeyObj(),
					corporateeventsdata);

				cacheResult(corporateeventsdata);

				uncachedPrimaryKeys.remove(corporateeventsdata.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(corporateeventsdataModelImpl.ENTITY_CACHE_ENABLED,
					corporateeventsdataImpl.class, primaryKey,
					_nullcorporateeventsdata);
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
	 * Returns all the corporateeventsdatas.
	 *
	 * @return the corporateeventsdatas
	 */
	@Override
	public List<corporateeventsdata> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the corporateeventsdatas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporateeventsdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of corporateeventsdatas
	 * @param end the upper bound of the range of corporateeventsdatas (not inclusive)
	 * @return the range of corporateeventsdatas
	 */
	@Override
	public List<corporateeventsdata> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the corporateeventsdatas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporateeventsdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of corporateeventsdatas
	 * @param end the upper bound of the range of corporateeventsdatas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of corporateeventsdatas
	 */
	@Override
	public List<corporateeventsdata> findAll(int start, int end,
		OrderByComparator<corporateeventsdata> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the corporateeventsdatas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporateeventsdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of corporateeventsdatas
	 * @param end the upper bound of the range of corporateeventsdatas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of corporateeventsdatas
	 */
	@Override
	public List<corporateeventsdata> findAll(int start, int end,
		OrderByComparator<corporateeventsdata> orderByComparator,
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

		List<corporateeventsdata> list = null;

		if (retrieveFromCache) {
			list = (List<corporateeventsdata>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CORPORATEEVENTSDATA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CORPORATEEVENTSDATA;

				if (pagination) {
					sql = sql.concat(corporateeventsdataModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<corporateeventsdata>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<corporateeventsdata>)QueryUtil.list(q,
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
	 * Removes all the corporateeventsdatas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (corporateeventsdata corporateeventsdata : findAll()) {
			remove(corporateeventsdata);
		}
	}

	/**
	 * Returns the number of corporateeventsdatas.
	 *
	 * @return the number of corporateeventsdatas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CORPORATEEVENTSDATA);

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
		return corporateeventsdataModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the corporateeventsdata persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(corporateeventsdataImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_CORPORATEEVENTSDATA = "SELECT corporateeventsdata FROM corporateeventsdata corporateeventsdata";
	private static final String _SQL_SELECT_CORPORATEEVENTSDATA_WHERE_PKS_IN = "SELECT corporateeventsdata FROM corporateeventsdata corporateeventsdata WHERE id_ IN (";
	private static final String _SQL_COUNT_CORPORATEEVENTSDATA = "SELECT COUNT(corporateeventsdata) FROM corporateeventsdata corporateeventsdata";
	private static final String _ORDER_BY_ENTITY_ALIAS = "corporateeventsdata.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No corporateeventsdata exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(corporateeventsdataPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final corporateeventsdata _nullcorporateeventsdata = new corporateeventsdataImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<corporateeventsdata> toCacheModel() {
				return _nullcorporateeventsdataCacheModel;
			}
		};

	private static final CacheModel<corporateeventsdata> _nullcorporateeventsdataCacheModel =
		new CacheModel<corporateeventsdata>() {
			@Override
			public corporateeventsdata toEntityModel() {
				return _nullcorporateeventsdata;
			}
		};
}