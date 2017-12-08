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

package com.chola.conferenceroombooking.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.conferenceroombooking.exception.NoSuchfacilitymasterException;
import com.chola.conferenceroombooking.model.facilitymaster;
import com.chola.conferenceroombooking.model.impl.facilitymasterImpl;
import com.chola.conferenceroombooking.model.impl.facilitymasterModelImpl;
import com.chola.conferenceroombooking.service.persistence.facilitymasterPersistence;

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
 * The persistence implementation for the facilitymaster service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see facilitymasterPersistence
 * @see com.chola.conferenceroombooking.service.persistence.facilitymasterUtil
 * @generated
 */
@ProviderType
public class facilitymasterPersistenceImpl extends BasePersistenceImpl<facilitymaster>
	implements facilitymasterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link facilitymasterUtil} to access the facilitymaster persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = facilitymasterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(facilitymasterModelImpl.ENTITY_CACHE_ENABLED,
			facilitymasterModelImpl.FINDER_CACHE_ENABLED,
			facilitymasterImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(facilitymasterModelImpl.ENTITY_CACHE_ENABLED,
			facilitymasterModelImpl.FINDER_CACHE_ENABLED,
			facilitymasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(facilitymasterModelImpl.ENTITY_CACHE_ENABLED,
			facilitymasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public facilitymasterPersistenceImpl() {
		setModelClass(facilitymaster.class);
	}

	/**
	 * Caches the facilitymaster in the entity cache if it is enabled.
	 *
	 * @param facilitymaster the facilitymaster
	 */
	@Override
	public void cacheResult(facilitymaster facilitymaster) {
		entityCache.putResult(facilitymasterModelImpl.ENTITY_CACHE_ENABLED,
			facilitymasterImpl.class, facilitymaster.getPrimaryKey(),
			facilitymaster);

		facilitymaster.resetOriginalValues();
	}

	/**
	 * Caches the facilitymasters in the entity cache if it is enabled.
	 *
	 * @param facilitymasters the facilitymasters
	 */
	@Override
	public void cacheResult(List<facilitymaster> facilitymasters) {
		for (facilitymaster facilitymaster : facilitymasters) {
			if (entityCache.getResult(
						facilitymasterModelImpl.ENTITY_CACHE_ENABLED,
						facilitymasterImpl.class, facilitymaster.getPrimaryKey()) == null) {
				cacheResult(facilitymaster);
			}
			else {
				facilitymaster.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all facilitymasters.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(facilitymasterImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the facilitymaster.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(facilitymaster facilitymaster) {
		entityCache.removeResult(facilitymasterModelImpl.ENTITY_CACHE_ENABLED,
			facilitymasterImpl.class, facilitymaster.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<facilitymaster> facilitymasters) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (facilitymaster facilitymaster : facilitymasters) {
			entityCache.removeResult(facilitymasterModelImpl.ENTITY_CACHE_ENABLED,
				facilitymasterImpl.class, facilitymaster.getPrimaryKey());
		}
	}

	/**
	 * Creates a new facilitymaster with the primary key. Does not add the facilitymaster to the database.
	 *
	 * @param facility_id the primary key for the new facilitymaster
	 * @return the new facilitymaster
	 */
	@Override
	public facilitymaster create(long facility_id) {
		facilitymaster facilitymaster = new facilitymasterImpl();

		facilitymaster.setNew(true);
		facilitymaster.setPrimaryKey(facility_id);

		return facilitymaster;
	}

	/**
	 * Removes the facilitymaster with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param facility_id the primary key of the facilitymaster
	 * @return the facilitymaster that was removed
	 * @throws NoSuchfacilitymasterException if a facilitymaster with the primary key could not be found
	 */
	@Override
	public facilitymaster remove(long facility_id)
		throws NoSuchfacilitymasterException {
		return remove((Serializable)facility_id);
	}

	/**
	 * Removes the facilitymaster with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the facilitymaster
	 * @return the facilitymaster that was removed
	 * @throws NoSuchfacilitymasterException if a facilitymaster with the primary key could not be found
	 */
	@Override
	public facilitymaster remove(Serializable primaryKey)
		throws NoSuchfacilitymasterException {
		Session session = null;

		try {
			session = openSession();

			facilitymaster facilitymaster = (facilitymaster)session.get(facilitymasterImpl.class,
					primaryKey);

			if (facilitymaster == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchfacilitymasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(facilitymaster);
		}
		catch (NoSuchfacilitymasterException nsee) {
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
	protected facilitymaster removeImpl(facilitymaster facilitymaster) {
		facilitymaster = toUnwrappedModel(facilitymaster);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(facilitymaster)) {
				facilitymaster = (facilitymaster)session.get(facilitymasterImpl.class,
						facilitymaster.getPrimaryKeyObj());
			}

			if (facilitymaster != null) {
				session.delete(facilitymaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (facilitymaster != null) {
			clearCache(facilitymaster);
		}

		return facilitymaster;
	}

	@Override
	public facilitymaster updateImpl(facilitymaster facilitymaster) {
		facilitymaster = toUnwrappedModel(facilitymaster);

		boolean isNew = facilitymaster.isNew();

		Session session = null;

		try {
			session = openSession();

			if (facilitymaster.isNew()) {
				session.save(facilitymaster);

				facilitymaster.setNew(false);
			}
			else {
				facilitymaster = (facilitymaster)session.merge(facilitymaster);
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

		entityCache.putResult(facilitymasterModelImpl.ENTITY_CACHE_ENABLED,
			facilitymasterImpl.class, facilitymaster.getPrimaryKey(),
			facilitymaster, false);

		facilitymaster.resetOriginalValues();

		return facilitymaster;
	}

	protected facilitymaster toUnwrappedModel(facilitymaster facilitymaster) {
		if (facilitymaster instanceof facilitymasterImpl) {
			return facilitymaster;
		}

		facilitymasterImpl facilitymasterImpl = new facilitymasterImpl();

		facilitymasterImpl.setNew(facilitymaster.isNew());
		facilitymasterImpl.setPrimaryKey(facilitymaster.getPrimaryKey());

		facilitymasterImpl.setFacility_id(facilitymaster.getFacility_id());
		facilitymasterImpl.setFacility_name(facilitymaster.getFacility_name());
		facilitymasterImpl.setFacility_description(facilitymaster.getFacility_description());

		return facilitymasterImpl;
	}

	/**
	 * Returns the facilitymaster with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the facilitymaster
	 * @return the facilitymaster
	 * @throws NoSuchfacilitymasterException if a facilitymaster with the primary key could not be found
	 */
	@Override
	public facilitymaster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchfacilitymasterException {
		facilitymaster facilitymaster = fetchByPrimaryKey(primaryKey);

		if (facilitymaster == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchfacilitymasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return facilitymaster;
	}

	/**
	 * Returns the facilitymaster with the primary key or throws a {@link NoSuchfacilitymasterException} if it could not be found.
	 *
	 * @param facility_id the primary key of the facilitymaster
	 * @return the facilitymaster
	 * @throws NoSuchfacilitymasterException if a facilitymaster with the primary key could not be found
	 */
	@Override
	public facilitymaster findByPrimaryKey(long facility_id)
		throws NoSuchfacilitymasterException {
		return findByPrimaryKey((Serializable)facility_id);
	}

	/**
	 * Returns the facilitymaster with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the facilitymaster
	 * @return the facilitymaster, or <code>null</code> if a facilitymaster with the primary key could not be found
	 */
	@Override
	public facilitymaster fetchByPrimaryKey(Serializable primaryKey) {
		facilitymaster facilitymaster = (facilitymaster)entityCache.getResult(facilitymasterModelImpl.ENTITY_CACHE_ENABLED,
				facilitymasterImpl.class, primaryKey);

		if (facilitymaster == _nullfacilitymaster) {
			return null;
		}

		if (facilitymaster == null) {
			Session session = null;

			try {
				session = openSession();

				facilitymaster = (facilitymaster)session.get(facilitymasterImpl.class,
						primaryKey);

				if (facilitymaster != null) {
					cacheResult(facilitymaster);
				}
				else {
					entityCache.putResult(facilitymasterModelImpl.ENTITY_CACHE_ENABLED,
						facilitymasterImpl.class, primaryKey,
						_nullfacilitymaster);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(facilitymasterModelImpl.ENTITY_CACHE_ENABLED,
					facilitymasterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return facilitymaster;
	}

	/**
	 * Returns the facilitymaster with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param facility_id the primary key of the facilitymaster
	 * @return the facilitymaster, or <code>null</code> if a facilitymaster with the primary key could not be found
	 */
	@Override
	public facilitymaster fetchByPrimaryKey(long facility_id) {
		return fetchByPrimaryKey((Serializable)facility_id);
	}

	@Override
	public Map<Serializable, facilitymaster> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, facilitymaster> map = new HashMap<Serializable, facilitymaster>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			facilitymaster facilitymaster = fetchByPrimaryKey(primaryKey);

			if (facilitymaster != null) {
				map.put(primaryKey, facilitymaster);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			facilitymaster facilitymaster = (facilitymaster)entityCache.getResult(facilitymasterModelImpl.ENTITY_CACHE_ENABLED,
					facilitymasterImpl.class, primaryKey);

			if (facilitymaster == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, facilitymaster);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_FACILITYMASTER_WHERE_PKS_IN);

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

			for (facilitymaster facilitymaster : (List<facilitymaster>)q.list()) {
				map.put(facilitymaster.getPrimaryKeyObj(), facilitymaster);

				cacheResult(facilitymaster);

				uncachedPrimaryKeys.remove(facilitymaster.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(facilitymasterModelImpl.ENTITY_CACHE_ENABLED,
					facilitymasterImpl.class, primaryKey, _nullfacilitymaster);
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
	 * Returns all the facilitymasters.
	 *
	 * @return the facilitymasters
	 */
	@Override
	public List<facilitymaster> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the facilitymasters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link facilitymasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of facilitymasters
	 * @param end the upper bound of the range of facilitymasters (not inclusive)
	 * @return the range of facilitymasters
	 */
	@Override
	public List<facilitymaster> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the facilitymasters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link facilitymasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of facilitymasters
	 * @param end the upper bound of the range of facilitymasters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of facilitymasters
	 */
	@Override
	public List<facilitymaster> findAll(int start, int end,
		OrderByComparator<facilitymaster> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the facilitymasters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link facilitymasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of facilitymasters
	 * @param end the upper bound of the range of facilitymasters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of facilitymasters
	 */
	@Override
	public List<facilitymaster> findAll(int start, int end,
		OrderByComparator<facilitymaster> orderByComparator,
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

		List<facilitymaster> list = null;

		if (retrieveFromCache) {
			list = (List<facilitymaster>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_FACILITYMASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FACILITYMASTER;

				if (pagination) {
					sql = sql.concat(facilitymasterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<facilitymaster>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<facilitymaster>)QueryUtil.list(q,
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
	 * Removes all the facilitymasters from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (facilitymaster facilitymaster : findAll()) {
			remove(facilitymaster);
		}
	}

	/**
	 * Returns the number of facilitymasters.
	 *
	 * @return the number of facilitymasters
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FACILITYMASTER);

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
		return facilitymasterModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the facilitymaster persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(facilitymasterImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_FACILITYMASTER = "SELECT facilitymaster FROM facilitymaster facilitymaster";
	private static final String _SQL_SELECT_FACILITYMASTER_WHERE_PKS_IN = "SELECT facilitymaster FROM facilitymaster facilitymaster WHERE facility_id IN (";
	private static final String _SQL_COUNT_FACILITYMASTER = "SELECT COUNT(facilitymaster) FROM facilitymaster facilitymaster";
	private static final String _ORDER_BY_ENTITY_ALIAS = "facilitymaster.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No facilitymaster exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(facilitymasterPersistenceImpl.class);
	private static final facilitymaster _nullfacilitymaster = new facilitymasterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<facilitymaster> toCacheModel() {
				return _nullfacilitymasterCacheModel;
			}
		};

	private static final CacheModel<facilitymaster> _nullfacilitymasterCacheModel =
		new CacheModel<facilitymaster>() {
			@Override
			public facilitymaster toEntityModel() {
				return _nullfacilitymaster;
			}
		};
}