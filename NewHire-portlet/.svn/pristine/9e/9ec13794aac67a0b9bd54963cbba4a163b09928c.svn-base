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

package com.service.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

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

import com.service.exception.NoSuchnewhireException;

import com.service.model.impl.newhireImpl;
import com.service.model.impl.newhireModelImpl;
import com.service.model.newhire;

import com.service.service.persistence.newhirePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the newhire service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see newhirePersistence
 * @see com.service.service.persistence.newhireUtil
 * @generated
 */
@ProviderType
public class newhirePersistenceImpl extends BasePersistenceImpl<newhire>
	implements newhirePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link newhireUtil} to access the newhire persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = newhireImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(newhireModelImpl.ENTITY_CACHE_ENABLED,
			newhireModelImpl.FINDER_CACHE_ENABLED, newhireImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(newhireModelImpl.ENTITY_CACHE_ENABLED,
			newhireModelImpl.FINDER_CACHE_ENABLED, newhireImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(newhireModelImpl.ENTITY_CACHE_ENABLED,
			newhireModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public newhirePersistenceImpl() {
		setModelClass(newhire.class);
	}

	/**
	 * Caches the newhire in the entity cache if it is enabled.
	 *
	 * @param newhire the newhire
	 */
	@Override
	public void cacheResult(newhire newhire) {
		entityCache.putResult(newhireModelImpl.ENTITY_CACHE_ENABLED,
			newhireImpl.class, newhire.getPrimaryKey(), newhire);

		newhire.resetOriginalValues();
	}

	/**
	 * Caches the newhires in the entity cache if it is enabled.
	 *
	 * @param newhires the newhires
	 */
	@Override
	public void cacheResult(List<newhire> newhires) {
		for (newhire newhire : newhires) {
			if (entityCache.getResult(newhireModelImpl.ENTITY_CACHE_ENABLED,
						newhireImpl.class, newhire.getPrimaryKey()) == null) {
				cacheResult(newhire);
			}
			else {
				newhire.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all newhires.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(newhireImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the newhire.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(newhire newhire) {
		entityCache.removeResult(newhireModelImpl.ENTITY_CACHE_ENABLED,
			newhireImpl.class, newhire.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<newhire> newhires) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (newhire newhire : newhires) {
			entityCache.removeResult(newhireModelImpl.ENTITY_CACHE_ENABLED,
				newhireImpl.class, newhire.getPrimaryKey());
		}
	}

	/**
	 * Creates a new newhire with the primary key. Does not add the newhire to the database.
	 *
	 * @param newhire_id the primary key for the new newhire
	 * @return the new newhire
	 */
	@Override
	public newhire create(long newhire_id) {
		newhire newhire = new newhireImpl();

		newhire.setNew(true);
		newhire.setPrimaryKey(newhire_id);

		return newhire;
	}

	/**
	 * Removes the newhire with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newhire_id the primary key of the newhire
	 * @return the newhire that was removed
	 * @throws NoSuchnewhireException if a newhire with the primary key could not be found
	 */
	@Override
	public newhire remove(long newhire_id) throws NoSuchnewhireException {
		return remove((Serializable)newhire_id);
	}

	/**
	 * Removes the newhire with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the newhire
	 * @return the newhire that was removed
	 * @throws NoSuchnewhireException if a newhire with the primary key could not be found
	 */
	@Override
	public newhire remove(Serializable primaryKey)
		throws NoSuchnewhireException {
		Session session = null;

		try {
			session = openSession();

			newhire newhire = (newhire)session.get(newhireImpl.class, primaryKey);

			if (newhire == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchnewhireException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(newhire);
		}
		catch (NoSuchnewhireException nsee) {
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
	protected newhire removeImpl(newhire newhire) {
		newhire = toUnwrappedModel(newhire);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(newhire)) {
				newhire = (newhire)session.get(newhireImpl.class,
						newhire.getPrimaryKeyObj());
			}

			if (newhire != null) {
				session.delete(newhire);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (newhire != null) {
			clearCache(newhire);
		}

		return newhire;
	}

	@Override
	public newhire updateImpl(newhire newhire) {
		newhire = toUnwrappedModel(newhire);

		boolean isNew = newhire.isNew();

		Session session = null;

		try {
			session = openSession();

			if (newhire.isNew()) {
				session.save(newhire);

				newhire.setNew(false);
			}
			else {
				newhire = (newhire)session.merge(newhire);
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

		entityCache.putResult(newhireModelImpl.ENTITY_CACHE_ENABLED,
			newhireImpl.class, newhire.getPrimaryKey(), newhire, false);

		newhire.resetOriginalValues();

		return newhire;
	}

	protected newhire toUnwrappedModel(newhire newhire) {
		if (newhire instanceof newhireImpl) {
			return newhire;
		}

		newhireImpl newhireImpl = new newhireImpl();

		newhireImpl.setNew(newhire.isNew());
		newhireImpl.setPrimaryKey(newhire.getPrimaryKey());

		newhireImpl.setNewhire_id(newhire.getNewhire_id());
		newhireImpl.setNewhire_name(newhire.getNewhire_name());
		newhireImpl.setNewhire_designation(newhire.getNewhire_designation());
		newhireImpl.setNewhire_profileimage(newhire.getNewhire_profileimage());
		newhireImpl.setNewhire_profileimage_path(newhire.getNewhire_profileimage_path());
		newhireImpl.setNewhire_detailedimage(newhire.getNewhire_detailedimage());
		newhireImpl.setNewhire_detailedimage_path(newhire.getNewhire_detailedimage_path());
		newhireImpl.setNewhire_createdate(newhire.getNewhire_createdate());
		newhireImpl.setNewhire_modifieddate(newhire.getNewhire_modifieddate());

		return newhireImpl;
	}

	/**
	 * Returns the newhire with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the newhire
	 * @return the newhire
	 * @throws NoSuchnewhireException if a newhire with the primary key could not be found
	 */
	@Override
	public newhire findByPrimaryKey(Serializable primaryKey)
		throws NoSuchnewhireException {
		newhire newhire = fetchByPrimaryKey(primaryKey);

		if (newhire == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchnewhireException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return newhire;
	}

	/**
	 * Returns the newhire with the primary key or throws a {@link NoSuchnewhireException} if it could not be found.
	 *
	 * @param newhire_id the primary key of the newhire
	 * @return the newhire
	 * @throws NoSuchnewhireException if a newhire with the primary key could not be found
	 */
	@Override
	public newhire findByPrimaryKey(long newhire_id)
		throws NoSuchnewhireException {
		return findByPrimaryKey((Serializable)newhire_id);
	}

	/**
	 * Returns the newhire with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the newhire
	 * @return the newhire, or <code>null</code> if a newhire with the primary key could not be found
	 */
	@Override
	public newhire fetchByPrimaryKey(Serializable primaryKey) {
		newhire newhire = (newhire)entityCache.getResult(newhireModelImpl.ENTITY_CACHE_ENABLED,
				newhireImpl.class, primaryKey);

		if (newhire == _nullnewhire) {
			return null;
		}

		if (newhire == null) {
			Session session = null;

			try {
				session = openSession();

				newhire = (newhire)session.get(newhireImpl.class, primaryKey);

				if (newhire != null) {
					cacheResult(newhire);
				}
				else {
					entityCache.putResult(newhireModelImpl.ENTITY_CACHE_ENABLED,
						newhireImpl.class, primaryKey, _nullnewhire);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(newhireModelImpl.ENTITY_CACHE_ENABLED,
					newhireImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return newhire;
	}

	/**
	 * Returns the newhire with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param newhire_id the primary key of the newhire
	 * @return the newhire, or <code>null</code> if a newhire with the primary key could not be found
	 */
	@Override
	public newhire fetchByPrimaryKey(long newhire_id) {
		return fetchByPrimaryKey((Serializable)newhire_id);
	}

	@Override
	public Map<Serializable, newhire> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, newhire> map = new HashMap<Serializable, newhire>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			newhire newhire = fetchByPrimaryKey(primaryKey);

			if (newhire != null) {
				map.put(primaryKey, newhire);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			newhire newhire = (newhire)entityCache.getResult(newhireModelImpl.ENTITY_CACHE_ENABLED,
					newhireImpl.class, primaryKey);

			if (newhire == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, newhire);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_NEWHIRE_WHERE_PKS_IN);

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

			for (newhire newhire : (List<newhire>)q.list()) {
				map.put(newhire.getPrimaryKeyObj(), newhire);

				cacheResult(newhire);

				uncachedPrimaryKeys.remove(newhire.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(newhireModelImpl.ENTITY_CACHE_ENABLED,
					newhireImpl.class, primaryKey, _nullnewhire);
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
	 * Returns all the newhires.
	 *
	 * @return the newhires
	 */
	@Override
	public List<newhire> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the newhires.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link newhireModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of newhires
	 * @param end the upper bound of the range of newhires (not inclusive)
	 * @return the range of newhires
	 */
	@Override
	public List<newhire> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the newhires.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link newhireModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of newhires
	 * @param end the upper bound of the range of newhires (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of newhires
	 */
	@Override
	public List<newhire> findAll(int start, int end,
		OrderByComparator<newhire> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the newhires.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link newhireModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of newhires
	 * @param end the upper bound of the range of newhires (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of newhires
	 */
	@Override
	public List<newhire> findAll(int start, int end,
		OrderByComparator<newhire> orderByComparator, boolean retrieveFromCache) {
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

		List<newhire> list = null;

		if (retrieveFromCache) {
			list = (List<newhire>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_NEWHIRE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NEWHIRE;

				if (pagination) {
					sql = sql.concat(newhireModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<newhire>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<newhire>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the newhires from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (newhire newhire : findAll()) {
			remove(newhire);
		}
	}

	/**
	 * Returns the number of newhires.
	 *
	 * @return the number of newhires
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_NEWHIRE);

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
		return newhireModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the newhire persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(newhireImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_NEWHIRE = "SELECT newhire FROM newhire newhire";
	private static final String _SQL_SELECT_NEWHIRE_WHERE_PKS_IN = "SELECT newhire FROM newhire newhire WHERE newhire_id IN (";
	private static final String _SQL_COUNT_NEWHIRE = "SELECT COUNT(newhire) FROM newhire newhire";
	private static final String _ORDER_BY_ENTITY_ALIAS = "newhire.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No newhire exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(newhirePersistenceImpl.class);
	private static final newhire _nullnewhire = new newhireImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<newhire> toCacheModel() {
				return _nullnewhireCacheModel;
			}
		};

	private static final CacheModel<newhire> _nullnewhireCacheModel = new CacheModel<newhire>() {
			@Override
			public newhire toEntityModel() {
				return _nullnewhire;
			}
		};
}