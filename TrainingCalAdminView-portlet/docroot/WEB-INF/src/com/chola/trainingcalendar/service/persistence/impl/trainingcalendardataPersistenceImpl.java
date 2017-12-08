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

package com.chola.trainingcalendar.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.trainingcalendar.exception.NoSuchtrainingcalendardataException;
import com.chola.trainingcalendar.model.impl.trainingcalendardataImpl;
import com.chola.trainingcalendar.model.impl.trainingcalendardataModelImpl;
import com.chola.trainingcalendar.model.trainingcalendardata;
import com.chola.trainingcalendar.service.persistence.trainingcalendardataPersistence;

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
 * The persistence implementation for the trainingcalendardata service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see trainingcalendardataPersistence
 * @see com.chola.trainingcalendar.service.persistence.trainingcalendardataUtil
 * @generated
 */
@ProviderType
public class trainingcalendardataPersistenceImpl extends BasePersistenceImpl<trainingcalendardata>
	implements trainingcalendardataPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link trainingcalendardataUtil} to access the trainingcalendardata persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = trainingcalendardataImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(trainingcalendardataModelImpl.ENTITY_CACHE_ENABLED,
			trainingcalendardataModelImpl.FINDER_CACHE_ENABLED,
			trainingcalendardataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(trainingcalendardataModelImpl.ENTITY_CACHE_ENABLED,
			trainingcalendardataModelImpl.FINDER_CACHE_ENABLED,
			trainingcalendardataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(trainingcalendardataModelImpl.ENTITY_CACHE_ENABLED,
			trainingcalendardataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public trainingcalendardataPersistenceImpl() {
		setModelClass(trainingcalendardata.class);
	}

	/**
	 * Caches the trainingcalendardata in the entity cache if it is enabled.
	 *
	 * @param trainingcalendardata the trainingcalendardata
	 */
	@Override
	public void cacheResult(trainingcalendardata trainingcalendardata) {
		entityCache.putResult(trainingcalendardataModelImpl.ENTITY_CACHE_ENABLED,
			trainingcalendardataImpl.class,
			trainingcalendardata.getPrimaryKey(), trainingcalendardata);

		trainingcalendardata.resetOriginalValues();
	}

	/**
	 * Caches the trainingcalendardatas in the entity cache if it is enabled.
	 *
	 * @param trainingcalendardatas the trainingcalendardatas
	 */
	@Override
	public void cacheResult(List<trainingcalendardata> trainingcalendardatas) {
		for (trainingcalendardata trainingcalendardata : trainingcalendardatas) {
			if (entityCache.getResult(
						trainingcalendardataModelImpl.ENTITY_CACHE_ENABLED,
						trainingcalendardataImpl.class,
						trainingcalendardata.getPrimaryKey()) == null) {
				cacheResult(trainingcalendardata);
			}
			else {
				trainingcalendardata.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all trainingcalendardatas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(trainingcalendardataImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the trainingcalendardata.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(trainingcalendardata trainingcalendardata) {
		entityCache.removeResult(trainingcalendardataModelImpl.ENTITY_CACHE_ENABLED,
			trainingcalendardataImpl.class, trainingcalendardata.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<trainingcalendardata> trainingcalendardatas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (trainingcalendardata trainingcalendardata : trainingcalendardatas) {
			entityCache.removeResult(trainingcalendardataModelImpl.ENTITY_CACHE_ENABLED,
				trainingcalendardataImpl.class,
				trainingcalendardata.getPrimaryKey());
		}
	}

	/**
	 * Creates a new trainingcalendardata with the primary key. Does not add the trainingcalendardata to the database.
	 *
	 * @param id the primary key for the new trainingcalendardata
	 * @return the new trainingcalendardata
	 */
	@Override
	public trainingcalendardata create(long id) {
		trainingcalendardata trainingcalendardata = new trainingcalendardataImpl();

		trainingcalendardata.setNew(true);
		trainingcalendardata.setPrimaryKey(id);

		return trainingcalendardata;
	}

	/**
	 * Removes the trainingcalendardata with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the trainingcalendardata
	 * @return the trainingcalendardata that was removed
	 * @throws NoSuchtrainingcalendardataException if a trainingcalendardata with the primary key could not be found
	 */
	@Override
	public trainingcalendardata remove(long id)
		throws NoSuchtrainingcalendardataException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the trainingcalendardata with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the trainingcalendardata
	 * @return the trainingcalendardata that was removed
	 * @throws NoSuchtrainingcalendardataException if a trainingcalendardata with the primary key could not be found
	 */
	@Override
	public trainingcalendardata remove(Serializable primaryKey)
		throws NoSuchtrainingcalendardataException {
		Session session = null;

		try {
			session = openSession();

			trainingcalendardata trainingcalendardata = (trainingcalendardata)session.get(trainingcalendardataImpl.class,
					primaryKey);

			if (trainingcalendardata == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchtrainingcalendardataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(trainingcalendardata);
		}
		catch (NoSuchtrainingcalendardataException nsee) {
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
	protected trainingcalendardata removeImpl(
		trainingcalendardata trainingcalendardata) {
		trainingcalendardata = toUnwrappedModel(trainingcalendardata);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(trainingcalendardata)) {
				trainingcalendardata = (trainingcalendardata)session.get(trainingcalendardataImpl.class,
						trainingcalendardata.getPrimaryKeyObj());
			}

			if (trainingcalendardata != null) {
				session.delete(trainingcalendardata);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (trainingcalendardata != null) {
			clearCache(trainingcalendardata);
		}

		return trainingcalendardata;
	}

	@Override
	public trainingcalendardata updateImpl(
		trainingcalendardata trainingcalendardata) {
		trainingcalendardata = toUnwrappedModel(trainingcalendardata);

		boolean isNew = trainingcalendardata.isNew();

		Session session = null;

		try {
			session = openSession();

			if (trainingcalendardata.isNew()) {
				session.save(trainingcalendardata);

				trainingcalendardata.setNew(false);
			}
			else {
				trainingcalendardata = (trainingcalendardata)session.merge(trainingcalendardata);
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

		entityCache.putResult(trainingcalendardataModelImpl.ENTITY_CACHE_ENABLED,
			trainingcalendardataImpl.class,
			trainingcalendardata.getPrimaryKey(), trainingcalendardata, false);

		trainingcalendardata.resetOriginalValues();

		return trainingcalendardata;
	}

	protected trainingcalendardata toUnwrappedModel(
		trainingcalendardata trainingcalendardata) {
		if (trainingcalendardata instanceof trainingcalendardataImpl) {
			return trainingcalendardata;
		}

		trainingcalendardataImpl trainingcalendardataImpl = new trainingcalendardataImpl();

		trainingcalendardataImpl.setNew(trainingcalendardata.isNew());
		trainingcalendardataImpl.setPrimaryKey(trainingcalendardata.getPrimaryKey());

		trainingcalendardataImpl.setId(trainingcalendardata.getId());
		trainingcalendardataImpl.setTitle(trainingcalendardata.getTitle());
		trainingcalendardataImpl.setDescription(trainingcalendardata.getDescription());
		trainingcalendardataImpl.setSchedulestartdate(trainingcalendardata.getSchedulestartdate());
		trainingcalendardataImpl.setScheduleenddate(trainingcalendardata.getScheduleenddate());
		trainingcalendardataImpl.setLocation(trainingcalendardata.getLocation());

		return trainingcalendardataImpl;
	}

	/**
	 * Returns the trainingcalendardata with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the trainingcalendardata
	 * @return the trainingcalendardata
	 * @throws NoSuchtrainingcalendardataException if a trainingcalendardata with the primary key could not be found
	 */
	@Override
	public trainingcalendardata findByPrimaryKey(Serializable primaryKey)
		throws NoSuchtrainingcalendardataException {
		trainingcalendardata trainingcalendardata = fetchByPrimaryKey(primaryKey);

		if (trainingcalendardata == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchtrainingcalendardataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return trainingcalendardata;
	}

	/**
	 * Returns the trainingcalendardata with the primary key or throws a {@link NoSuchtrainingcalendardataException} if it could not be found.
	 *
	 * @param id the primary key of the trainingcalendardata
	 * @return the trainingcalendardata
	 * @throws NoSuchtrainingcalendardataException if a trainingcalendardata with the primary key could not be found
	 */
	@Override
	public trainingcalendardata findByPrimaryKey(long id)
		throws NoSuchtrainingcalendardataException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the trainingcalendardata with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the trainingcalendardata
	 * @return the trainingcalendardata, or <code>null</code> if a trainingcalendardata with the primary key could not be found
	 */
	@Override
	public trainingcalendardata fetchByPrimaryKey(Serializable primaryKey) {
		trainingcalendardata trainingcalendardata = (trainingcalendardata)entityCache.getResult(trainingcalendardataModelImpl.ENTITY_CACHE_ENABLED,
				trainingcalendardataImpl.class, primaryKey);

		if (trainingcalendardata == _nulltrainingcalendardata) {
			return null;
		}

		if (trainingcalendardata == null) {
			Session session = null;

			try {
				session = openSession();

				trainingcalendardata = (trainingcalendardata)session.get(trainingcalendardataImpl.class,
						primaryKey);

				if (trainingcalendardata != null) {
					cacheResult(trainingcalendardata);
				}
				else {
					entityCache.putResult(trainingcalendardataModelImpl.ENTITY_CACHE_ENABLED,
						trainingcalendardataImpl.class, primaryKey,
						_nulltrainingcalendardata);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(trainingcalendardataModelImpl.ENTITY_CACHE_ENABLED,
					trainingcalendardataImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return trainingcalendardata;
	}

	/**
	 * Returns the trainingcalendardata with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the trainingcalendardata
	 * @return the trainingcalendardata, or <code>null</code> if a trainingcalendardata with the primary key could not be found
	 */
	@Override
	public trainingcalendardata fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, trainingcalendardata> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, trainingcalendardata> map = new HashMap<Serializable, trainingcalendardata>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			trainingcalendardata trainingcalendardata = fetchByPrimaryKey(primaryKey);

			if (trainingcalendardata != null) {
				map.put(primaryKey, trainingcalendardata);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			trainingcalendardata trainingcalendardata = (trainingcalendardata)entityCache.getResult(trainingcalendardataModelImpl.ENTITY_CACHE_ENABLED,
					trainingcalendardataImpl.class, primaryKey);

			if (trainingcalendardata == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, trainingcalendardata);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TRAININGCALENDARDATA_WHERE_PKS_IN);

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

			for (trainingcalendardata trainingcalendardata : (List<trainingcalendardata>)q.list()) {
				map.put(trainingcalendardata.getPrimaryKeyObj(),
					trainingcalendardata);

				cacheResult(trainingcalendardata);

				uncachedPrimaryKeys.remove(trainingcalendardata.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(trainingcalendardataModelImpl.ENTITY_CACHE_ENABLED,
					trainingcalendardataImpl.class, primaryKey,
					_nulltrainingcalendardata);
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
	 * Returns all the trainingcalendardatas.
	 *
	 * @return the trainingcalendardatas
	 */
	@Override
	public List<trainingcalendardata> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the trainingcalendardatas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcalendardataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of trainingcalendardatas
	 * @param end the upper bound of the range of trainingcalendardatas (not inclusive)
	 * @return the range of trainingcalendardatas
	 */
	@Override
	public List<trainingcalendardata> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the trainingcalendardatas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcalendardataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of trainingcalendardatas
	 * @param end the upper bound of the range of trainingcalendardatas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of trainingcalendardatas
	 */
	@Override
	public List<trainingcalendardata> findAll(int start, int end,
		OrderByComparator<trainingcalendardata> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the trainingcalendardatas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcalendardataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of trainingcalendardatas
	 * @param end the upper bound of the range of trainingcalendardatas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of trainingcalendardatas
	 */
	@Override
	public List<trainingcalendardata> findAll(int start, int end,
		OrderByComparator<trainingcalendardata> orderByComparator,
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

		List<trainingcalendardata> list = null;

		if (retrieveFromCache) {
			list = (List<trainingcalendardata>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TRAININGCALENDARDATA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TRAININGCALENDARDATA;

				if (pagination) {
					sql = sql.concat(trainingcalendardataModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<trainingcalendardata>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<trainingcalendardata>)QueryUtil.list(q,
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
	 * Removes all the trainingcalendardatas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (trainingcalendardata trainingcalendardata : findAll()) {
			remove(trainingcalendardata);
		}
	}

	/**
	 * Returns the number of trainingcalendardatas.
	 *
	 * @return the number of trainingcalendardatas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TRAININGCALENDARDATA);

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
		return trainingcalendardataModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the trainingcalendardata persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(trainingcalendardataImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_TRAININGCALENDARDATA = "SELECT trainingcalendardata FROM trainingcalendardata trainingcalendardata";
	private static final String _SQL_SELECT_TRAININGCALENDARDATA_WHERE_PKS_IN = "SELECT trainingcalendardata FROM trainingcalendardata trainingcalendardata WHERE id_ IN (";
	private static final String _SQL_COUNT_TRAININGCALENDARDATA = "SELECT COUNT(trainingcalendardata) FROM trainingcalendardata trainingcalendardata";
	private static final String _ORDER_BY_ENTITY_ALIAS = "trainingcalendardata.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No trainingcalendardata exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(trainingcalendardataPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final trainingcalendardata _nulltrainingcalendardata = new trainingcalendardataImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<trainingcalendardata> toCacheModel() {
				return _nulltrainingcalendardataCacheModel;
			}
		};

	private static final CacheModel<trainingcalendardata> _nulltrainingcalendardataCacheModel =
		new CacheModel<trainingcalendardata>() {
			@Override
			public trainingcalendardata toEntityModel() {
				return _nulltrainingcalendardata;
			}
		};
}