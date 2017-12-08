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

import com.chola.conferenceroombooking.exception.NoSuchfloorwingException;
import com.chola.conferenceroombooking.model.floorwing;
import com.chola.conferenceroombooking.model.impl.floorwingImpl;
import com.chola.conferenceroombooking.model.impl.floorwingModelImpl;
import com.chola.conferenceroombooking.service.persistence.floorwingPersistence;

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
 * The persistence implementation for the floorwing service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see floorwingPersistence
 * @see com.chola.conferenceroombooking.service.persistence.floorwingUtil
 * @generated
 */
@ProviderType
public class floorwingPersistenceImpl extends BasePersistenceImpl<floorwing>
	implements floorwingPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link floorwingUtil} to access the floorwing persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = floorwingImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(floorwingModelImpl.ENTITY_CACHE_ENABLED,
			floorwingModelImpl.FINDER_CACHE_ENABLED, floorwingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(floorwingModelImpl.ENTITY_CACHE_ENABLED,
			floorwingModelImpl.FINDER_CACHE_ENABLED, floorwingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(floorwingModelImpl.ENTITY_CACHE_ENABLED,
			floorwingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public floorwingPersistenceImpl() {
		setModelClass(floorwing.class);
	}

	/**
	 * Caches the floorwing in the entity cache if it is enabled.
	 *
	 * @param floorwing the floorwing
	 */
	@Override
	public void cacheResult(floorwing floorwing) {
		entityCache.putResult(floorwingModelImpl.ENTITY_CACHE_ENABLED,
			floorwingImpl.class, floorwing.getPrimaryKey(), floorwing);

		floorwing.resetOriginalValues();
	}

	/**
	 * Caches the floorwings in the entity cache if it is enabled.
	 *
	 * @param floorwings the floorwings
	 */
	@Override
	public void cacheResult(List<floorwing> floorwings) {
		for (floorwing floorwing : floorwings) {
			if (entityCache.getResult(floorwingModelImpl.ENTITY_CACHE_ENABLED,
						floorwingImpl.class, floorwing.getPrimaryKey()) == null) {
				cacheResult(floorwing);
			}
			else {
				floorwing.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all floorwings.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(floorwingImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the floorwing.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(floorwing floorwing) {
		entityCache.removeResult(floorwingModelImpl.ENTITY_CACHE_ENABLED,
			floorwingImpl.class, floorwing.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<floorwing> floorwings) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (floorwing floorwing : floorwings) {
			entityCache.removeResult(floorwingModelImpl.ENTITY_CACHE_ENABLED,
				floorwingImpl.class, floorwing.getPrimaryKey());
		}
	}

	/**
	 * Creates a new floorwing with the primary key. Does not add the floorwing to the database.
	 *
	 * @param floorwing_id the primary key for the new floorwing
	 * @return the new floorwing
	 */
	@Override
	public floorwing create(long floorwing_id) {
		floorwing floorwing = new floorwingImpl();

		floorwing.setNew(true);
		floorwing.setPrimaryKey(floorwing_id);

		return floorwing;
	}

	/**
	 * Removes the floorwing with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param floorwing_id the primary key of the floorwing
	 * @return the floorwing that was removed
	 * @throws NoSuchfloorwingException if a floorwing with the primary key could not be found
	 */
	@Override
	public floorwing remove(long floorwing_id) throws NoSuchfloorwingException {
		return remove((Serializable)floorwing_id);
	}

	/**
	 * Removes the floorwing with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the floorwing
	 * @return the floorwing that was removed
	 * @throws NoSuchfloorwingException if a floorwing with the primary key could not be found
	 */
	@Override
	public floorwing remove(Serializable primaryKey)
		throws NoSuchfloorwingException {
		Session session = null;

		try {
			session = openSession();

			floorwing floorwing = (floorwing)session.get(floorwingImpl.class,
					primaryKey);

			if (floorwing == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchfloorwingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(floorwing);
		}
		catch (NoSuchfloorwingException nsee) {
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
	protected floorwing removeImpl(floorwing floorwing) {
		floorwing = toUnwrappedModel(floorwing);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(floorwing)) {
				floorwing = (floorwing)session.get(floorwingImpl.class,
						floorwing.getPrimaryKeyObj());
			}

			if (floorwing != null) {
				session.delete(floorwing);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (floorwing != null) {
			clearCache(floorwing);
		}

		return floorwing;
	}

	@Override
	public floorwing updateImpl(floorwing floorwing) {
		floorwing = toUnwrappedModel(floorwing);

		boolean isNew = floorwing.isNew();

		Session session = null;

		try {
			session = openSession();

			if (floorwing.isNew()) {
				session.save(floorwing);

				floorwing.setNew(false);
			}
			else {
				floorwing = (floorwing)session.merge(floorwing);
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

		entityCache.putResult(floorwingModelImpl.ENTITY_CACHE_ENABLED,
			floorwingImpl.class, floorwing.getPrimaryKey(), floorwing, false);

		floorwing.resetOriginalValues();

		return floorwing;
	}

	protected floorwing toUnwrappedModel(floorwing floorwing) {
		if (floorwing instanceof floorwingImpl) {
			return floorwing;
		}

		floorwingImpl floorwingImpl = new floorwingImpl();

		floorwingImpl.setNew(floorwing.isNew());
		floorwingImpl.setPrimaryKey(floorwing.getPrimaryKey());

		floorwingImpl.setFloorwing_id(floorwing.getFloorwing_id());
		floorwingImpl.setState_id(floorwing.getState_id());
		floorwingImpl.setLocation_id(floorwing.getLocation_id());
		floorwingImpl.setFloor_name(floorwing.getFloor_name());

		return floorwingImpl;
	}

	/**
	 * Returns the floorwing with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the floorwing
	 * @return the floorwing
	 * @throws NoSuchfloorwingException if a floorwing with the primary key could not be found
	 */
	@Override
	public floorwing findByPrimaryKey(Serializable primaryKey)
		throws NoSuchfloorwingException {
		floorwing floorwing = fetchByPrimaryKey(primaryKey);

		if (floorwing == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchfloorwingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return floorwing;
	}

	/**
	 * Returns the floorwing with the primary key or throws a {@link NoSuchfloorwingException} if it could not be found.
	 *
	 * @param floorwing_id the primary key of the floorwing
	 * @return the floorwing
	 * @throws NoSuchfloorwingException if a floorwing with the primary key could not be found
	 */
	@Override
	public floorwing findByPrimaryKey(long floorwing_id)
		throws NoSuchfloorwingException {
		return findByPrimaryKey((Serializable)floorwing_id);
	}

	/**
	 * Returns the floorwing with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the floorwing
	 * @return the floorwing, or <code>null</code> if a floorwing with the primary key could not be found
	 */
	@Override
	public floorwing fetchByPrimaryKey(Serializable primaryKey) {
		floorwing floorwing = (floorwing)entityCache.getResult(floorwingModelImpl.ENTITY_CACHE_ENABLED,
				floorwingImpl.class, primaryKey);

		if (floorwing == _nullfloorwing) {
			return null;
		}

		if (floorwing == null) {
			Session session = null;

			try {
				session = openSession();

				floorwing = (floorwing)session.get(floorwingImpl.class,
						primaryKey);

				if (floorwing != null) {
					cacheResult(floorwing);
				}
				else {
					entityCache.putResult(floorwingModelImpl.ENTITY_CACHE_ENABLED,
						floorwingImpl.class, primaryKey, _nullfloorwing);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(floorwingModelImpl.ENTITY_CACHE_ENABLED,
					floorwingImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return floorwing;
	}

	/**
	 * Returns the floorwing with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param floorwing_id the primary key of the floorwing
	 * @return the floorwing, or <code>null</code> if a floorwing with the primary key could not be found
	 */
	@Override
	public floorwing fetchByPrimaryKey(long floorwing_id) {
		return fetchByPrimaryKey((Serializable)floorwing_id);
	}

	@Override
	public Map<Serializable, floorwing> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, floorwing> map = new HashMap<Serializable, floorwing>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			floorwing floorwing = fetchByPrimaryKey(primaryKey);

			if (floorwing != null) {
				map.put(primaryKey, floorwing);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			floorwing floorwing = (floorwing)entityCache.getResult(floorwingModelImpl.ENTITY_CACHE_ENABLED,
					floorwingImpl.class, primaryKey);

			if (floorwing == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, floorwing);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_FLOORWING_WHERE_PKS_IN);

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

			for (floorwing floorwing : (List<floorwing>)q.list()) {
				map.put(floorwing.getPrimaryKeyObj(), floorwing);

				cacheResult(floorwing);

				uncachedPrimaryKeys.remove(floorwing.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(floorwingModelImpl.ENTITY_CACHE_ENABLED,
					floorwingImpl.class, primaryKey, _nullfloorwing);
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
	 * Returns all the floorwings.
	 *
	 * @return the floorwings
	 */
	@Override
	public List<floorwing> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the floorwings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link floorwingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of floorwings
	 * @param end the upper bound of the range of floorwings (not inclusive)
	 * @return the range of floorwings
	 */
	@Override
	public List<floorwing> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the floorwings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link floorwingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of floorwings
	 * @param end the upper bound of the range of floorwings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of floorwings
	 */
	@Override
	public List<floorwing> findAll(int start, int end,
		OrderByComparator<floorwing> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the floorwings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link floorwingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of floorwings
	 * @param end the upper bound of the range of floorwings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of floorwings
	 */
	@Override
	public List<floorwing> findAll(int start, int end,
		OrderByComparator<floorwing> orderByComparator,
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

		List<floorwing> list = null;

		if (retrieveFromCache) {
			list = (List<floorwing>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_FLOORWING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FLOORWING;

				if (pagination) {
					sql = sql.concat(floorwingModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<floorwing>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<floorwing>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the floorwings from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (floorwing floorwing : findAll()) {
			remove(floorwing);
		}
	}

	/**
	 * Returns the number of floorwings.
	 *
	 * @return the number of floorwings
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FLOORWING);

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
		return floorwingModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the floorwing persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(floorwingImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_FLOORWING = "SELECT floorwing FROM floorwing floorwing";
	private static final String _SQL_SELECT_FLOORWING_WHERE_PKS_IN = "SELECT floorwing FROM floorwing floorwing WHERE floorwing_id IN (";
	private static final String _SQL_COUNT_FLOORWING = "SELECT COUNT(floorwing) FROM floorwing floorwing";
	private static final String _ORDER_BY_ENTITY_ALIAS = "floorwing.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No floorwing exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(floorwingPersistenceImpl.class);
	private static final floorwing _nullfloorwing = new floorwingImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<floorwing> toCacheModel() {
				return _nullfloorwingCacheModel;
			}
		};

	private static final CacheModel<floorwing> _nullfloorwingCacheModel = new CacheModel<floorwing>() {
			@Override
			public floorwing toEntityModel() {
				return _nullfloorwing;
			}
		};
}