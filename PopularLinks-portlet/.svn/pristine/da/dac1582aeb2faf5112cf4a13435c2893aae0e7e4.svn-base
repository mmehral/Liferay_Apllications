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

package com.chola.popularlinks.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.popularlinks.exception.NoSuchexternallinksException;
import com.chola.popularlinks.model.externallinks;
import com.chola.popularlinks.model.impl.externallinksImpl;
import com.chola.popularlinks.model.impl.externallinksModelImpl;
import com.chola.popularlinks.service.persistence.externallinksPersistence;

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
 * The persistence implementation for the externallinks service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see externallinksPersistence
 * @see com.chola.popularlinks.service.persistence.externallinksUtil
 * @generated
 */
@ProviderType
public class externallinksPersistenceImpl extends BasePersistenceImpl<externallinks>
	implements externallinksPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link externallinksUtil} to access the externallinks persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = externallinksImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(externallinksModelImpl.ENTITY_CACHE_ENABLED,
			externallinksModelImpl.FINDER_CACHE_ENABLED,
			externallinksImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(externallinksModelImpl.ENTITY_CACHE_ENABLED,
			externallinksModelImpl.FINDER_CACHE_ENABLED,
			externallinksImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(externallinksModelImpl.ENTITY_CACHE_ENABLED,
			externallinksModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public externallinksPersistenceImpl() {
		setModelClass(externallinks.class);
	}

	/**
	 * Caches the externallinks in the entity cache if it is enabled.
	 *
	 * @param externallinks the externallinks
	 */
	@Override
	public void cacheResult(externallinks externallinks) {
		entityCache.putResult(externallinksModelImpl.ENTITY_CACHE_ENABLED,
			externallinksImpl.class, externallinks.getPrimaryKey(),
			externallinks);

		externallinks.resetOriginalValues();
	}

	/**
	 * Caches the externallinkses in the entity cache if it is enabled.
	 *
	 * @param externallinkses the externallinkses
	 */
	@Override
	public void cacheResult(List<externallinks> externallinkses) {
		for (externallinks externallinks : externallinkses) {
			if (entityCache.getResult(
						externallinksModelImpl.ENTITY_CACHE_ENABLED,
						externallinksImpl.class, externallinks.getPrimaryKey()) == null) {
				cacheResult(externallinks);
			}
			else {
				externallinks.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all externallinkses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(externallinksImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the externallinks.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(externallinks externallinks) {
		entityCache.removeResult(externallinksModelImpl.ENTITY_CACHE_ENABLED,
			externallinksImpl.class, externallinks.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<externallinks> externallinkses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (externallinks externallinks : externallinkses) {
			entityCache.removeResult(externallinksModelImpl.ENTITY_CACHE_ENABLED,
				externallinksImpl.class, externallinks.getPrimaryKey());
		}
	}

	/**
	 * Creates a new externallinks with the primary key. Does not add the externallinks to the database.
	 *
	 * @param id the primary key for the new externallinks
	 * @return the new externallinks
	 */
	@Override
	public externallinks create(long id) {
		externallinks externallinks = new externallinksImpl();

		externallinks.setNew(true);
		externallinks.setPrimaryKey(id);

		return externallinks;
	}

	/**
	 * Removes the externallinks with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the externallinks
	 * @return the externallinks that was removed
	 * @throws NoSuchexternallinksException if a externallinks with the primary key could not be found
	 */
	@Override
	public externallinks remove(long id) throws NoSuchexternallinksException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the externallinks with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the externallinks
	 * @return the externallinks that was removed
	 * @throws NoSuchexternallinksException if a externallinks with the primary key could not be found
	 */
	@Override
	public externallinks remove(Serializable primaryKey)
		throws NoSuchexternallinksException {
		Session session = null;

		try {
			session = openSession();

			externallinks externallinks = (externallinks)session.get(externallinksImpl.class,
					primaryKey);

			if (externallinks == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchexternallinksException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(externallinks);
		}
		catch (NoSuchexternallinksException nsee) {
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
	protected externallinks removeImpl(externallinks externallinks) {
		externallinks = toUnwrappedModel(externallinks);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(externallinks)) {
				externallinks = (externallinks)session.get(externallinksImpl.class,
						externallinks.getPrimaryKeyObj());
			}

			if (externallinks != null) {
				session.delete(externallinks);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (externallinks != null) {
			clearCache(externallinks);
		}

		return externallinks;
	}

	@Override
	public externallinks updateImpl(externallinks externallinks) {
		externallinks = toUnwrappedModel(externallinks);

		boolean isNew = externallinks.isNew();

		Session session = null;

		try {
			session = openSession();

			if (externallinks.isNew()) {
				session.save(externallinks);

				externallinks.setNew(false);
			}
			else {
				externallinks = (externallinks)session.merge(externallinks);
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

		entityCache.putResult(externallinksModelImpl.ENTITY_CACHE_ENABLED,
			externallinksImpl.class, externallinks.getPrimaryKey(),
			externallinks, false);

		externallinks.resetOriginalValues();

		return externallinks;
	}

	protected externallinks toUnwrappedModel(externallinks externallinks) {
		if (externallinks instanceof externallinksImpl) {
			return externallinks;
		}

		externallinksImpl externallinksImpl = new externallinksImpl();

		externallinksImpl.setNew(externallinks.isNew());
		externallinksImpl.setPrimaryKey(externallinks.getPrimaryKey());

		externallinksImpl.setId(externallinks.getId());
		externallinksImpl.setTag(externallinks.getTag());
		externallinksImpl.setUrl(externallinks.getUrl());

		return externallinksImpl;
	}

	/**
	 * Returns the externallinks with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the externallinks
	 * @return the externallinks
	 * @throws NoSuchexternallinksException if a externallinks with the primary key could not be found
	 */
	@Override
	public externallinks findByPrimaryKey(Serializable primaryKey)
		throws NoSuchexternallinksException {
		externallinks externallinks = fetchByPrimaryKey(primaryKey);

		if (externallinks == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchexternallinksException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return externallinks;
	}

	/**
	 * Returns the externallinks with the primary key or throws a {@link NoSuchexternallinksException} if it could not be found.
	 *
	 * @param id the primary key of the externallinks
	 * @return the externallinks
	 * @throws NoSuchexternallinksException if a externallinks with the primary key could not be found
	 */
	@Override
	public externallinks findByPrimaryKey(long id)
		throws NoSuchexternallinksException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the externallinks with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the externallinks
	 * @return the externallinks, or <code>null</code> if a externallinks with the primary key could not be found
	 */
	@Override
	public externallinks fetchByPrimaryKey(Serializable primaryKey) {
		externallinks externallinks = (externallinks)entityCache.getResult(externallinksModelImpl.ENTITY_CACHE_ENABLED,
				externallinksImpl.class, primaryKey);

		if (externallinks == _nullexternallinks) {
			return null;
		}

		if (externallinks == null) {
			Session session = null;

			try {
				session = openSession();

				externallinks = (externallinks)session.get(externallinksImpl.class,
						primaryKey);

				if (externallinks != null) {
					cacheResult(externallinks);
				}
				else {
					entityCache.putResult(externallinksModelImpl.ENTITY_CACHE_ENABLED,
						externallinksImpl.class, primaryKey, _nullexternallinks);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(externallinksModelImpl.ENTITY_CACHE_ENABLED,
					externallinksImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return externallinks;
	}

	/**
	 * Returns the externallinks with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the externallinks
	 * @return the externallinks, or <code>null</code> if a externallinks with the primary key could not be found
	 */
	@Override
	public externallinks fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, externallinks> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, externallinks> map = new HashMap<Serializable, externallinks>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			externallinks externallinks = fetchByPrimaryKey(primaryKey);

			if (externallinks != null) {
				map.put(primaryKey, externallinks);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			externallinks externallinks = (externallinks)entityCache.getResult(externallinksModelImpl.ENTITY_CACHE_ENABLED,
					externallinksImpl.class, primaryKey);

			if (externallinks == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, externallinks);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_EXTERNALLINKS_WHERE_PKS_IN);

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

			for (externallinks externallinks : (List<externallinks>)q.list()) {
				map.put(externallinks.getPrimaryKeyObj(), externallinks);

				cacheResult(externallinks);

				uncachedPrimaryKeys.remove(externallinks.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(externallinksModelImpl.ENTITY_CACHE_ENABLED,
					externallinksImpl.class, primaryKey, _nullexternallinks);
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
	 * Returns all the externallinkses.
	 *
	 * @return the externallinkses
	 */
	@Override
	public List<externallinks> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the externallinkses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link externallinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of externallinkses
	 * @param end the upper bound of the range of externallinkses (not inclusive)
	 * @return the range of externallinkses
	 */
	@Override
	public List<externallinks> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the externallinkses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link externallinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of externallinkses
	 * @param end the upper bound of the range of externallinkses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of externallinkses
	 */
	@Override
	public List<externallinks> findAll(int start, int end,
		OrderByComparator<externallinks> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the externallinkses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link externallinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of externallinkses
	 * @param end the upper bound of the range of externallinkses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of externallinkses
	 */
	@Override
	public List<externallinks> findAll(int start, int end,
		OrderByComparator<externallinks> orderByComparator,
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

		List<externallinks> list = null;

		if (retrieveFromCache) {
			list = (List<externallinks>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_EXTERNALLINKS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EXTERNALLINKS;

				if (pagination) {
					sql = sql.concat(externallinksModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<externallinks>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<externallinks>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the externallinkses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (externallinks externallinks : findAll()) {
			remove(externallinks);
		}
	}

	/**
	 * Returns the number of externallinkses.
	 *
	 * @return the number of externallinkses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EXTERNALLINKS);

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
		return externallinksModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the externallinks persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(externallinksImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_EXTERNALLINKS = "SELECT externallinks FROM externallinks externallinks";
	private static final String _SQL_SELECT_EXTERNALLINKS_WHERE_PKS_IN = "SELECT externallinks FROM externallinks externallinks WHERE id_ IN (";
	private static final String _SQL_COUNT_EXTERNALLINKS = "SELECT COUNT(externallinks) FROM externallinks externallinks";
	private static final String _ORDER_BY_ENTITY_ALIAS = "externallinks.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No externallinks exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(externallinksPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final externallinks _nullexternallinks = new externallinksImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<externallinks> toCacheModel() {
				return _nullexternallinksCacheModel;
			}
		};

	private static final CacheModel<externallinks> _nullexternallinksCacheModel = new CacheModel<externallinks>() {
			@Override
			public externallinks toEntityModel() {
				return _nullexternallinks;
			}
		};
}