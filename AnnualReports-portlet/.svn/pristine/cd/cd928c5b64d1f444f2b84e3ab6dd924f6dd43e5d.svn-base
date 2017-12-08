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

package com.chola.annual.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.annual.exception.NoSuchannualreportsException;
import com.chola.annual.model.annualreports;
import com.chola.annual.model.impl.annualreportsImpl;
import com.chola.annual.model.impl.annualreportsModelImpl;
import com.chola.annual.service.persistence.annualreportsPersistence;

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
 * The persistence implementation for the annualreports service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see annualreportsPersistence
 * @see com.chola.annual.service.persistence.annualreportsUtil
 * @generated
 */
@ProviderType
public class annualreportsPersistenceImpl extends BasePersistenceImpl<annualreports>
	implements annualreportsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link annualreportsUtil} to access the annualreports persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = annualreportsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(annualreportsModelImpl.ENTITY_CACHE_ENABLED,
			annualreportsModelImpl.FINDER_CACHE_ENABLED,
			annualreportsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(annualreportsModelImpl.ENTITY_CACHE_ENABLED,
			annualreportsModelImpl.FINDER_CACHE_ENABLED,
			annualreportsImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(annualreportsModelImpl.ENTITY_CACHE_ENABLED,
			annualreportsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public annualreportsPersistenceImpl() {
		setModelClass(annualreports.class);
	}

	/**
	 * Caches the annualreports in the entity cache if it is enabled.
	 *
	 * @param annualreports the annualreports
	 */
	@Override
	public void cacheResult(annualreports annualreports) {
		entityCache.putResult(annualreportsModelImpl.ENTITY_CACHE_ENABLED,
			annualreportsImpl.class, annualreports.getPrimaryKey(),
			annualreports);

		annualreports.resetOriginalValues();
	}

	/**
	 * Caches the annualreportses in the entity cache if it is enabled.
	 *
	 * @param annualreportses the annualreportses
	 */
	@Override
	public void cacheResult(List<annualreports> annualreportses) {
		for (annualreports annualreports : annualreportses) {
			if (entityCache.getResult(
						annualreportsModelImpl.ENTITY_CACHE_ENABLED,
						annualreportsImpl.class, annualreports.getPrimaryKey()) == null) {
				cacheResult(annualreports);
			}
			else {
				annualreports.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all annualreportses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(annualreportsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the annualreports.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(annualreports annualreports) {
		entityCache.removeResult(annualreportsModelImpl.ENTITY_CACHE_ENABLED,
			annualreportsImpl.class, annualreports.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<annualreports> annualreportses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (annualreports annualreports : annualreportses) {
			entityCache.removeResult(annualreportsModelImpl.ENTITY_CACHE_ENABLED,
				annualreportsImpl.class, annualreports.getPrimaryKey());
		}
	}

	/**
	 * Creates a new annualreports with the primary key. Does not add the annualreports to the database.
	 *
	 * @param id the primary key for the new annualreports
	 * @return the new annualreports
	 */
	@Override
	public annualreports create(long id) {
		annualreports annualreports = new annualreportsImpl();

		annualreports.setNew(true);
		annualreports.setPrimaryKey(id);

		return annualreports;
	}

	/**
	 * Removes the annualreports with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the annualreports
	 * @return the annualreports that was removed
	 * @throws NoSuchannualreportsException if a annualreports with the primary key could not be found
	 */
	@Override
	public annualreports remove(long id) throws NoSuchannualreportsException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the annualreports with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the annualreports
	 * @return the annualreports that was removed
	 * @throws NoSuchannualreportsException if a annualreports with the primary key could not be found
	 */
	@Override
	public annualreports remove(Serializable primaryKey)
		throws NoSuchannualreportsException {
		Session session = null;

		try {
			session = openSession();

			annualreports annualreports = (annualreports)session.get(annualreportsImpl.class,
					primaryKey);

			if (annualreports == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchannualreportsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(annualreports);
		}
		catch (NoSuchannualreportsException nsee) {
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
	protected annualreports removeImpl(annualreports annualreports) {
		annualreports = toUnwrappedModel(annualreports);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(annualreports)) {
				annualreports = (annualreports)session.get(annualreportsImpl.class,
						annualreports.getPrimaryKeyObj());
			}

			if (annualreports != null) {
				session.delete(annualreports);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (annualreports != null) {
			clearCache(annualreports);
		}

		return annualreports;
	}

	@Override
	public annualreports updateImpl(annualreports annualreports) {
		annualreports = toUnwrappedModel(annualreports);

		boolean isNew = annualreports.isNew();

		Session session = null;

		try {
			session = openSession();

			if (annualreports.isNew()) {
				session.save(annualreports);

				annualreports.setNew(false);
			}
			else {
				annualreports = (annualreports)session.merge(annualreports);
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

		entityCache.putResult(annualreportsModelImpl.ENTITY_CACHE_ENABLED,
			annualreportsImpl.class, annualreports.getPrimaryKey(),
			annualreports, false);

		annualreports.resetOriginalValues();

		return annualreports;
	}

	protected annualreports toUnwrappedModel(annualreports annualreports) {
		if (annualreports instanceof annualreportsImpl) {
			return annualreports;
		}

		annualreportsImpl annualreportsImpl = new annualreportsImpl();

		annualreportsImpl.setNew(annualreports.isNew());
		annualreportsImpl.setPrimaryKey(annualreports.getPrimaryKey());

		annualreportsImpl.setId(annualreports.getId());
		annualreportsImpl.setDetails(annualreports.getDetails());
		annualreportsImpl.setUpdatedon(annualreports.getUpdatedon());
		annualreportsImpl.setUpdatedby(annualreports.getUpdatedby());
		annualreportsImpl.setUniquecontentid(annualreports.getUniquecontentid());

		return annualreportsImpl;
	}

	/**
	 * Returns the annualreports with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the annualreports
	 * @return the annualreports
	 * @throws NoSuchannualreportsException if a annualreports with the primary key could not be found
	 */
	@Override
	public annualreports findByPrimaryKey(Serializable primaryKey)
		throws NoSuchannualreportsException {
		annualreports annualreports = fetchByPrimaryKey(primaryKey);

		if (annualreports == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchannualreportsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return annualreports;
	}

	/**
	 * Returns the annualreports with the primary key or throws a {@link NoSuchannualreportsException} if it could not be found.
	 *
	 * @param id the primary key of the annualreports
	 * @return the annualreports
	 * @throws NoSuchannualreportsException if a annualreports with the primary key could not be found
	 */
	@Override
	public annualreports findByPrimaryKey(long id)
		throws NoSuchannualreportsException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the annualreports with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the annualreports
	 * @return the annualreports, or <code>null</code> if a annualreports with the primary key could not be found
	 */
	@Override
	public annualreports fetchByPrimaryKey(Serializable primaryKey) {
		annualreports annualreports = (annualreports)entityCache.getResult(annualreportsModelImpl.ENTITY_CACHE_ENABLED,
				annualreportsImpl.class, primaryKey);

		if (annualreports == _nullannualreports) {
			return null;
		}

		if (annualreports == null) {
			Session session = null;

			try {
				session = openSession();

				annualreports = (annualreports)session.get(annualreportsImpl.class,
						primaryKey);

				if (annualreports != null) {
					cacheResult(annualreports);
				}
				else {
					entityCache.putResult(annualreportsModelImpl.ENTITY_CACHE_ENABLED,
						annualreportsImpl.class, primaryKey, _nullannualreports);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(annualreportsModelImpl.ENTITY_CACHE_ENABLED,
					annualreportsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return annualreports;
	}

	/**
	 * Returns the annualreports with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the annualreports
	 * @return the annualreports, or <code>null</code> if a annualreports with the primary key could not be found
	 */
	@Override
	public annualreports fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, annualreports> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, annualreports> map = new HashMap<Serializable, annualreports>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			annualreports annualreports = fetchByPrimaryKey(primaryKey);

			if (annualreports != null) {
				map.put(primaryKey, annualreports);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			annualreports annualreports = (annualreports)entityCache.getResult(annualreportsModelImpl.ENTITY_CACHE_ENABLED,
					annualreportsImpl.class, primaryKey);

			if (annualreports == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, annualreports);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ANNUALREPORTS_WHERE_PKS_IN);

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

			for (annualreports annualreports : (List<annualreports>)q.list()) {
				map.put(annualreports.getPrimaryKeyObj(), annualreports);

				cacheResult(annualreports);

				uncachedPrimaryKeys.remove(annualreports.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(annualreportsModelImpl.ENTITY_CACHE_ENABLED,
					annualreportsImpl.class, primaryKey, _nullannualreports);
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
	 * Returns all the annualreportses.
	 *
	 * @return the annualreportses
	 */
	@Override
	public List<annualreports> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the annualreportses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link annualreportsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of annualreportses
	 * @param end the upper bound of the range of annualreportses (not inclusive)
	 * @return the range of annualreportses
	 */
	@Override
	public List<annualreports> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the annualreportses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link annualreportsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of annualreportses
	 * @param end the upper bound of the range of annualreportses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of annualreportses
	 */
	@Override
	public List<annualreports> findAll(int start, int end,
		OrderByComparator<annualreports> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the annualreportses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link annualreportsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of annualreportses
	 * @param end the upper bound of the range of annualreportses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of annualreportses
	 */
	@Override
	public List<annualreports> findAll(int start, int end,
		OrderByComparator<annualreports> orderByComparator,
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

		List<annualreports> list = null;

		if (retrieveFromCache) {
			list = (List<annualreports>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANNUALREPORTS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANNUALREPORTS;

				if (pagination) {
					sql = sql.concat(annualreportsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<annualreports>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<annualreports>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the annualreportses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (annualreports annualreports : findAll()) {
			remove(annualreports);
		}
	}

	/**
	 * Returns the number of annualreportses.
	 *
	 * @return the number of annualreportses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANNUALREPORTS);

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
		return annualreportsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the annualreports persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(annualreportsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_ANNUALREPORTS = "SELECT annualreports FROM annualreports annualreports";
	private static final String _SQL_SELECT_ANNUALREPORTS_WHERE_PKS_IN = "SELECT annualreports FROM annualreports annualreports WHERE id_ IN (";
	private static final String _SQL_COUNT_ANNUALREPORTS = "SELECT COUNT(annualreports) FROM annualreports annualreports";
	private static final String _ORDER_BY_ENTITY_ALIAS = "annualreports.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No annualreports exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(annualreportsPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final annualreports _nullannualreports = new annualreportsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<annualreports> toCacheModel() {
				return _nullannualreportsCacheModel;
			}
		};

	private static final CacheModel<annualreports> _nullannualreportsCacheModel = new CacheModel<annualreports>() {
			@Override
			public annualreports toEntityModel() {
				return _nullannualreports;
			}
		};
}