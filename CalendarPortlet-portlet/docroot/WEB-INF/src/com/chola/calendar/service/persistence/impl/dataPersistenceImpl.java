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

import com.chola.calendar.exception.NoSuchdataException;
import com.chola.calendar.model.data;
import com.chola.calendar.model.impl.dataImpl;
import com.chola.calendar.model.impl.dataModelImpl;
import com.chola.calendar.service.persistence.dataPersistence;

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
 * The persistence implementation for the data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see dataPersistence
 * @see com.chola.calendar.service.persistence.dataUtil
 * @generated
 */
@ProviderType
public class dataPersistenceImpl extends BasePersistenceImpl<data>
	implements dataPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link dataUtil} to access the data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = dataImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(dataModelImpl.ENTITY_CACHE_ENABLED,
			dataModelImpl.FINDER_CACHE_ENABLED, dataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(dataModelImpl.ENTITY_CACHE_ENABLED,
			dataModelImpl.FINDER_CACHE_ENABLED, dataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(dataModelImpl.ENTITY_CACHE_ENABLED,
			dataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public dataPersistenceImpl() {
		setModelClass(data.class);
	}

	/**
	 * Caches the data in the entity cache if it is enabled.
	 *
	 * @param data the data
	 */
	@Override
	public void cacheResult(data data) {
		entityCache.putResult(dataModelImpl.ENTITY_CACHE_ENABLED,
			dataImpl.class, data.getPrimaryKey(), data);

		data.resetOriginalValues();
	}

	/**
	 * Caches the datas in the entity cache if it is enabled.
	 *
	 * @param datas the datas
	 */
	@Override
	public void cacheResult(List<data> datas) {
		for (data data : datas) {
			if (entityCache.getResult(dataModelImpl.ENTITY_CACHE_ENABLED,
						dataImpl.class, data.getPrimaryKey()) == null) {
				cacheResult(data);
			}
			else {
				data.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all datas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(dataImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the data.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(data data) {
		entityCache.removeResult(dataModelImpl.ENTITY_CACHE_ENABLED,
			dataImpl.class, data.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<data> datas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (data data : datas) {
			entityCache.removeResult(dataModelImpl.ENTITY_CACHE_ENABLED,
				dataImpl.class, data.getPrimaryKey());
		}
	}

	/**
	 * Creates a new data with the primary key. Does not add the data to the database.
	 *
	 * @param eventid the primary key for the new data
	 * @return the new data
	 */
	@Override
	public data create(long eventid) {
		data data = new dataImpl();

		data.setNew(true);
		data.setPrimaryKey(eventid);

		return data;
	}

	/**
	 * Removes the data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param eventid the primary key of the data
	 * @return the data that was removed
	 * @throws NoSuchdataException if a data with the primary key could not be found
	 */
	@Override
	public data remove(long eventid) throws NoSuchdataException {
		return remove((Serializable)eventid);
	}

	/**
	 * Removes the data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the data
	 * @return the data that was removed
	 * @throws NoSuchdataException if a data with the primary key could not be found
	 */
	@Override
	public data remove(Serializable primaryKey) throws NoSuchdataException {
		Session session = null;

		try {
			session = openSession();

			data data = (data)session.get(dataImpl.class, primaryKey);

			if (data == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchdataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(data);
		}
		catch (NoSuchdataException nsee) {
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
	protected data removeImpl(data data) {
		data = toUnwrappedModel(data);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(data)) {
				data = (data)session.get(dataImpl.class, data.getPrimaryKeyObj());
			}

			if (data != null) {
				session.delete(data);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (data != null) {
			clearCache(data);
		}

		return data;
	}

	@Override
	public data updateImpl(data data) {
		data = toUnwrappedModel(data);

		boolean isNew = data.isNew();

		Session session = null;

		try {
			session = openSession();

			if (data.isNew()) {
				session.save(data);

				data.setNew(false);
			}
			else {
				data = (data)session.merge(data);
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

		entityCache.putResult(dataModelImpl.ENTITY_CACHE_ENABLED,
			dataImpl.class, data.getPrimaryKey(), data, false);

		data.resetOriginalValues();

		return data;
	}

	protected data toUnwrappedModel(data data) {
		if (data instanceof dataImpl) {
			return data;
		}

		dataImpl dataImpl = new dataImpl();

		dataImpl.setNew(data.isNew());
		dataImpl.setPrimaryKey(data.getPrimaryKey());

		dataImpl.setEventid(data.getEventid());
		dataImpl.setEventdetails(data.getEventdetails());
		dataImpl.setEventfrom(data.getEventfrom());
		dataImpl.setEventto(data.getEventto());
		dataImpl.setLocation(data.getLocation());
		dataImpl.setDept(data.getDept());
		dataImpl.setSubdept(data.getSubdept());
		dataImpl.setGrade(data.getGrade());
		dataImpl.setAge(data.getAge());
		dataImpl.setCompanyname(data.getCompanyname());
		dataImpl.setUserid(data.getUserid());
		dataImpl.setGender(data.getGender());

		return dataImpl;
	}

	/**
	 * Returns the data with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the data
	 * @return the data
	 * @throws NoSuchdataException if a data with the primary key could not be found
	 */
	@Override
	public data findByPrimaryKey(Serializable primaryKey)
		throws NoSuchdataException {
		data data = fetchByPrimaryKey(primaryKey);

		if (data == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchdataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return data;
	}

	/**
	 * Returns the data with the primary key or throws a {@link NoSuchdataException} if it could not be found.
	 *
	 * @param eventid the primary key of the data
	 * @return the data
	 * @throws NoSuchdataException if a data with the primary key could not be found
	 */
	@Override
	public data findByPrimaryKey(long eventid) throws NoSuchdataException {
		return findByPrimaryKey((Serializable)eventid);
	}

	/**
	 * Returns the data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the data
	 * @return the data, or <code>null</code> if a data with the primary key could not be found
	 */
	@Override
	public data fetchByPrimaryKey(Serializable primaryKey) {
		data data = (data)entityCache.getResult(dataModelImpl.ENTITY_CACHE_ENABLED,
				dataImpl.class, primaryKey);

		if (data == _nulldata) {
			return null;
		}

		if (data == null) {
			Session session = null;

			try {
				session = openSession();

				data = (data)session.get(dataImpl.class, primaryKey);

				if (data != null) {
					cacheResult(data);
				}
				else {
					entityCache.putResult(dataModelImpl.ENTITY_CACHE_ENABLED,
						dataImpl.class, primaryKey, _nulldata);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(dataModelImpl.ENTITY_CACHE_ENABLED,
					dataImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return data;
	}

	/**
	 * Returns the data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param eventid the primary key of the data
	 * @return the data, or <code>null</code> if a data with the primary key could not be found
	 */
	@Override
	public data fetchByPrimaryKey(long eventid) {
		return fetchByPrimaryKey((Serializable)eventid);
	}

	@Override
	public Map<Serializable, data> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, data> map = new HashMap<Serializable, data>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			data data = fetchByPrimaryKey(primaryKey);

			if (data != null) {
				map.put(primaryKey, data);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			data data = (data)entityCache.getResult(dataModelImpl.ENTITY_CACHE_ENABLED,
					dataImpl.class, primaryKey);

			if (data == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, data);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_DATA_WHERE_PKS_IN);

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

			for (data data : (List<data>)q.list()) {
				map.put(data.getPrimaryKeyObj(), data);

				cacheResult(data);

				uncachedPrimaryKeys.remove(data.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(dataModelImpl.ENTITY_CACHE_ENABLED,
					dataImpl.class, primaryKey, _nulldata);
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
	 * Returns all the datas.
	 *
	 * @return the datas
	 */
	@Override
	public List<data> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link dataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of datas
	 * @param end the upper bound of the range of datas (not inclusive)
	 * @return the range of datas
	 */
	@Override
	public List<data> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link dataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of datas
	 * @param end the upper bound of the range of datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of datas
	 */
	@Override
	public List<data> findAll(int start, int end,
		OrderByComparator<data> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link dataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of datas
	 * @param end the upper bound of the range of datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of datas
	 */
	@Override
	public List<data> findAll(int start, int end,
		OrderByComparator<data> orderByComparator, boolean retrieveFromCache) {
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

		List<data> list = null;

		if (retrieveFromCache) {
			list = (List<data>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_DATA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DATA;

				if (pagination) {
					sql = sql.concat(dataModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<data>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<data>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the datas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (data data : findAll()) {
			remove(data);
		}
	}

	/**
	 * Returns the number of datas.
	 *
	 * @return the number of datas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DATA);

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
		return dataModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the data persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(dataImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_DATA = "SELECT data FROM data data";
	private static final String _SQL_SELECT_DATA_WHERE_PKS_IN = "SELECT data FROM data data WHERE eventid IN (";
	private static final String _SQL_COUNT_DATA = "SELECT COUNT(data) FROM data data";
	private static final String _ORDER_BY_ENTITY_ALIAS = "data.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No data exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(dataPersistenceImpl.class);
	private static final data _nulldata = new dataImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<data> toCacheModel() {
				return _nulldataCacheModel;
			}
		};

	private static final CacheModel<data> _nulldataCacheModel = new CacheModel<data>() {
			@Override
			public data toEntityModel() {
				return _nulldata;
			}
		};
}