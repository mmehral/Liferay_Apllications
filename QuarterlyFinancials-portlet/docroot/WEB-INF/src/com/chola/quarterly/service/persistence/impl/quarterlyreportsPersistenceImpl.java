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

package com.chola.quarterly.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.quarterly.exception.NoSuchquarterlyreportsException;
import com.chola.quarterly.model.impl.quarterlyreportsImpl;
import com.chola.quarterly.model.impl.quarterlyreportsModelImpl;
import com.chola.quarterly.model.quarterlyreports;
import com.chola.quarterly.service.persistence.quarterlyreportsPersistence;

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
 * The persistence implementation for the quarterlyreports service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see quarterlyreportsPersistence
 * @see com.chola.quarterly.service.persistence.quarterlyreportsUtil
 * @generated
 */
@ProviderType
public class quarterlyreportsPersistenceImpl extends BasePersistenceImpl<quarterlyreports>
	implements quarterlyreportsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link quarterlyreportsUtil} to access the quarterlyreports persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = quarterlyreportsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(quarterlyreportsModelImpl.ENTITY_CACHE_ENABLED,
			quarterlyreportsModelImpl.FINDER_CACHE_ENABLED,
			quarterlyreportsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(quarterlyreportsModelImpl.ENTITY_CACHE_ENABLED,
			quarterlyreportsModelImpl.FINDER_CACHE_ENABLED,
			quarterlyreportsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(quarterlyreportsModelImpl.ENTITY_CACHE_ENABLED,
			quarterlyreportsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public quarterlyreportsPersistenceImpl() {
		setModelClass(quarterlyreports.class);
	}

	/**
	 * Caches the quarterlyreports in the entity cache if it is enabled.
	 *
	 * @param quarterlyreports the quarterlyreports
	 */
	@Override
	public void cacheResult(quarterlyreports quarterlyreports) {
		entityCache.putResult(quarterlyreportsModelImpl.ENTITY_CACHE_ENABLED,
			quarterlyreportsImpl.class, quarterlyreports.getPrimaryKey(),
			quarterlyreports);

		quarterlyreports.resetOriginalValues();
	}

	/**
	 * Caches the quarterlyreportses in the entity cache if it is enabled.
	 *
	 * @param quarterlyreportses the quarterlyreportses
	 */
	@Override
	public void cacheResult(List<quarterlyreports> quarterlyreportses) {
		for (quarterlyreports quarterlyreports : quarterlyreportses) {
			if (entityCache.getResult(
						quarterlyreportsModelImpl.ENTITY_CACHE_ENABLED,
						quarterlyreportsImpl.class,
						quarterlyreports.getPrimaryKey()) == null) {
				cacheResult(quarterlyreports);
			}
			else {
				quarterlyreports.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all quarterlyreportses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(quarterlyreportsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the quarterlyreports.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(quarterlyreports quarterlyreports) {
		entityCache.removeResult(quarterlyreportsModelImpl.ENTITY_CACHE_ENABLED,
			quarterlyreportsImpl.class, quarterlyreports.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<quarterlyreports> quarterlyreportses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (quarterlyreports quarterlyreports : quarterlyreportses) {
			entityCache.removeResult(quarterlyreportsModelImpl.ENTITY_CACHE_ENABLED,
				quarterlyreportsImpl.class, quarterlyreports.getPrimaryKey());
		}
	}

	/**
	 * Creates a new quarterlyreports with the primary key. Does not add the quarterlyreports to the database.
	 *
	 * @param id the primary key for the new quarterlyreports
	 * @return the new quarterlyreports
	 */
	@Override
	public quarterlyreports create(long id) {
		quarterlyreports quarterlyreports = new quarterlyreportsImpl();

		quarterlyreports.setNew(true);
		quarterlyreports.setPrimaryKey(id);

		return quarterlyreports;
	}

	/**
	 * Removes the quarterlyreports with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the quarterlyreports
	 * @return the quarterlyreports that was removed
	 * @throws NoSuchquarterlyreportsException if a quarterlyreports with the primary key could not be found
	 */
	@Override
	public quarterlyreports remove(long id)
		throws NoSuchquarterlyreportsException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the quarterlyreports with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the quarterlyreports
	 * @return the quarterlyreports that was removed
	 * @throws NoSuchquarterlyreportsException if a quarterlyreports with the primary key could not be found
	 */
	@Override
	public quarterlyreports remove(Serializable primaryKey)
		throws NoSuchquarterlyreportsException {
		Session session = null;

		try {
			session = openSession();

			quarterlyreports quarterlyreports = (quarterlyreports)session.get(quarterlyreportsImpl.class,
					primaryKey);

			if (quarterlyreports == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchquarterlyreportsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(quarterlyreports);
		}
		catch (NoSuchquarterlyreportsException nsee) {
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
	protected quarterlyreports removeImpl(quarterlyreports quarterlyreports) {
		quarterlyreports = toUnwrappedModel(quarterlyreports);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(quarterlyreports)) {
				quarterlyreports = (quarterlyreports)session.get(quarterlyreportsImpl.class,
						quarterlyreports.getPrimaryKeyObj());
			}

			if (quarterlyreports != null) {
				session.delete(quarterlyreports);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (quarterlyreports != null) {
			clearCache(quarterlyreports);
		}

		return quarterlyreports;
	}

	@Override
	public quarterlyreports updateImpl(quarterlyreports quarterlyreports) {
		quarterlyreports = toUnwrappedModel(quarterlyreports);

		boolean isNew = quarterlyreports.isNew();

		Session session = null;

		try {
			session = openSession();

			if (quarterlyreports.isNew()) {
				session.save(quarterlyreports);

				quarterlyreports.setNew(false);
			}
			else {
				quarterlyreports = (quarterlyreports)session.merge(quarterlyreports);
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

		entityCache.putResult(quarterlyreportsModelImpl.ENTITY_CACHE_ENABLED,
			quarterlyreportsImpl.class, quarterlyreports.getPrimaryKey(),
			quarterlyreports, false);

		quarterlyreports.resetOriginalValues();

		return quarterlyreports;
	}

	protected quarterlyreports toUnwrappedModel(
		quarterlyreports quarterlyreports) {
		if (quarterlyreports instanceof quarterlyreportsImpl) {
			return quarterlyreports;
		}

		quarterlyreportsImpl quarterlyreportsImpl = new quarterlyreportsImpl();

		quarterlyreportsImpl.setNew(quarterlyreports.isNew());
		quarterlyreportsImpl.setPrimaryKey(quarterlyreports.getPrimaryKey());

		quarterlyreportsImpl.setId(quarterlyreports.getId());
		quarterlyreportsImpl.setDetails(quarterlyreports.getDetails());
		quarterlyreportsImpl.setUpdatedon(quarterlyreports.getUpdatedon());
		quarterlyreportsImpl.setUpdatedby(quarterlyreports.getUpdatedby());
		quarterlyreportsImpl.setUniquecontentid(quarterlyreports.getUniquecontentid());

		return quarterlyreportsImpl;
	}

	/**
	 * Returns the quarterlyreports with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the quarterlyreports
	 * @return the quarterlyreports
	 * @throws NoSuchquarterlyreportsException if a quarterlyreports with the primary key could not be found
	 */
	@Override
	public quarterlyreports findByPrimaryKey(Serializable primaryKey)
		throws NoSuchquarterlyreportsException {
		quarterlyreports quarterlyreports = fetchByPrimaryKey(primaryKey);

		if (quarterlyreports == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchquarterlyreportsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return quarterlyreports;
	}

	/**
	 * Returns the quarterlyreports with the primary key or throws a {@link NoSuchquarterlyreportsException} if it could not be found.
	 *
	 * @param id the primary key of the quarterlyreports
	 * @return the quarterlyreports
	 * @throws NoSuchquarterlyreportsException if a quarterlyreports with the primary key could not be found
	 */
	@Override
	public quarterlyreports findByPrimaryKey(long id)
		throws NoSuchquarterlyreportsException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the quarterlyreports with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the quarterlyreports
	 * @return the quarterlyreports, or <code>null</code> if a quarterlyreports with the primary key could not be found
	 */
	@Override
	public quarterlyreports fetchByPrimaryKey(Serializable primaryKey) {
		quarterlyreports quarterlyreports = (quarterlyreports)entityCache.getResult(quarterlyreportsModelImpl.ENTITY_CACHE_ENABLED,
				quarterlyreportsImpl.class, primaryKey);

		if (quarterlyreports == _nullquarterlyreports) {
			return null;
		}

		if (quarterlyreports == null) {
			Session session = null;

			try {
				session = openSession();

				quarterlyreports = (quarterlyreports)session.get(quarterlyreportsImpl.class,
						primaryKey);

				if (quarterlyreports != null) {
					cacheResult(quarterlyreports);
				}
				else {
					entityCache.putResult(quarterlyreportsModelImpl.ENTITY_CACHE_ENABLED,
						quarterlyreportsImpl.class, primaryKey,
						_nullquarterlyreports);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(quarterlyreportsModelImpl.ENTITY_CACHE_ENABLED,
					quarterlyreportsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return quarterlyreports;
	}

	/**
	 * Returns the quarterlyreports with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the quarterlyreports
	 * @return the quarterlyreports, or <code>null</code> if a quarterlyreports with the primary key could not be found
	 */
	@Override
	public quarterlyreports fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, quarterlyreports> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, quarterlyreports> map = new HashMap<Serializable, quarterlyreports>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			quarterlyreports quarterlyreports = fetchByPrimaryKey(primaryKey);

			if (quarterlyreports != null) {
				map.put(primaryKey, quarterlyreports);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			quarterlyreports quarterlyreports = (quarterlyreports)entityCache.getResult(quarterlyreportsModelImpl.ENTITY_CACHE_ENABLED,
					quarterlyreportsImpl.class, primaryKey);

			if (quarterlyreports == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, quarterlyreports);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_QUARTERLYREPORTS_WHERE_PKS_IN);

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

			for (quarterlyreports quarterlyreports : (List<quarterlyreports>)q.list()) {
				map.put(quarterlyreports.getPrimaryKeyObj(), quarterlyreports);

				cacheResult(quarterlyreports);

				uncachedPrimaryKeys.remove(quarterlyreports.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(quarterlyreportsModelImpl.ENTITY_CACHE_ENABLED,
					quarterlyreportsImpl.class, primaryKey,
					_nullquarterlyreports);
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
	 * Returns all the quarterlyreportses.
	 *
	 * @return the quarterlyreportses
	 */
	@Override
	public List<quarterlyreports> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarterlyreportses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link quarterlyreportsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarterlyreportses
	 * @param end the upper bound of the range of quarterlyreportses (not inclusive)
	 * @return the range of quarterlyreportses
	 */
	@Override
	public List<quarterlyreports> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarterlyreportses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link quarterlyreportsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarterlyreportses
	 * @param end the upper bound of the range of quarterlyreportses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarterlyreportses
	 */
	@Override
	public List<quarterlyreports> findAll(int start, int end,
		OrderByComparator<quarterlyreports> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarterlyreportses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link quarterlyreportsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarterlyreportses
	 * @param end the upper bound of the range of quarterlyreportses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of quarterlyreportses
	 */
	@Override
	public List<quarterlyreports> findAll(int start, int end,
		OrderByComparator<quarterlyreports> orderByComparator,
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

		List<quarterlyreports> list = null;

		if (retrieveFromCache) {
			list = (List<quarterlyreports>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_QUARTERLYREPORTS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_QUARTERLYREPORTS;

				if (pagination) {
					sql = sql.concat(quarterlyreportsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<quarterlyreports>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<quarterlyreports>)QueryUtil.list(q,
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
	 * Removes all the quarterlyreportses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (quarterlyreports quarterlyreports : findAll()) {
			remove(quarterlyreports);
		}
	}

	/**
	 * Returns the number of quarterlyreportses.
	 *
	 * @return the number of quarterlyreportses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_QUARTERLYREPORTS);

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
		return quarterlyreportsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the quarterlyreports persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(quarterlyreportsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_QUARTERLYREPORTS = "SELECT quarterlyreports FROM quarterlyreports quarterlyreports";
	private static final String _SQL_SELECT_QUARTERLYREPORTS_WHERE_PKS_IN = "SELECT quarterlyreports FROM quarterlyreports quarterlyreports WHERE id_ IN (";
	private static final String _SQL_COUNT_QUARTERLYREPORTS = "SELECT COUNT(quarterlyreports) FROM quarterlyreports quarterlyreports";
	private static final String _ORDER_BY_ENTITY_ALIAS = "quarterlyreports.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No quarterlyreports exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(quarterlyreportsPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final quarterlyreports _nullquarterlyreports = new quarterlyreportsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<quarterlyreports> toCacheModel() {
				return _nullquarterlyreportsCacheModel;
			}
		};

	private static final CacheModel<quarterlyreports> _nullquarterlyreportsCacheModel =
		new CacheModel<quarterlyreports>() {
			@Override
			public quarterlyreports toEntityModel() {
				return _nullquarterlyreports;
			}
		};
}