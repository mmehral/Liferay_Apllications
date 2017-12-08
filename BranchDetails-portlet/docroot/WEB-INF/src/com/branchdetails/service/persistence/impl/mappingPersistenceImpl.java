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

package com.branchdetails.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.branchdetails.exception.NoSuchmappingException;

import com.branchdetails.model.impl.mappingImpl;
import com.branchdetails.model.impl.mappingModelImpl;
import com.branchdetails.model.mapping;

import com.branchdetails.service.persistence.mappingPersistence;

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
 * The persistence implementation for the mapping service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see mappingPersistence
 * @see com.branchdetails.service.persistence.mappingUtil
 * @generated
 */
@ProviderType
public class mappingPersistenceImpl extends BasePersistenceImpl<mapping>
	implements mappingPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link mappingUtil} to access the mapping persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = mappingImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(mappingModelImpl.ENTITY_CACHE_ENABLED,
			mappingModelImpl.FINDER_CACHE_ENABLED, mappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(mappingModelImpl.ENTITY_CACHE_ENABLED,
			mappingModelImpl.FINDER_CACHE_ENABLED, mappingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(mappingModelImpl.ENTITY_CACHE_ENABLED,
			mappingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public mappingPersistenceImpl() {
		setModelClass(mapping.class);
	}

	/**
	 * Caches the mapping in the entity cache if it is enabled.
	 *
	 * @param mapping the mapping
	 */
	@Override
	public void cacheResult(mapping mapping) {
		entityCache.putResult(mappingModelImpl.ENTITY_CACHE_ENABLED,
			mappingImpl.class, mapping.getPrimaryKey(), mapping);

		mapping.resetOriginalValues();
	}

	/**
	 * Caches the mappings in the entity cache if it is enabled.
	 *
	 * @param mappings the mappings
	 */
	@Override
	public void cacheResult(List<mapping> mappings) {
		for (mapping mapping : mappings) {
			if (entityCache.getResult(mappingModelImpl.ENTITY_CACHE_ENABLED,
						mappingImpl.class, mapping.getPrimaryKey()) == null) {
				cacheResult(mapping);
			}
			else {
				mapping.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mappings.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(mappingImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mapping.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(mapping mapping) {
		entityCache.removeResult(mappingModelImpl.ENTITY_CACHE_ENABLED,
			mappingImpl.class, mapping.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<mapping> mappings) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (mapping mapping : mappings) {
			entityCache.removeResult(mappingModelImpl.ENTITY_CACHE_ENABLED,
				mappingImpl.class, mapping.getPrimaryKey());
		}
	}

	/**
	 * Creates a new mapping with the primary key. Does not add the mapping to the database.
	 *
	 * @param mapping_id the primary key for the new mapping
	 * @return the new mapping
	 */
	@Override
	public mapping create(long mapping_id) {
		mapping mapping = new mappingImpl();

		mapping.setNew(true);
		mapping.setPrimaryKey(mapping_id);

		return mapping;
	}

	/**
	 * Removes the mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param mapping_id the primary key of the mapping
	 * @return the mapping that was removed
	 * @throws NoSuchmappingException if a mapping with the primary key could not be found
	 */
	@Override
	public mapping remove(long mapping_id) throws NoSuchmappingException {
		return remove((Serializable)mapping_id);
	}

	/**
	 * Removes the mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mapping
	 * @return the mapping that was removed
	 * @throws NoSuchmappingException if a mapping with the primary key could not be found
	 */
	@Override
	public mapping remove(Serializable primaryKey)
		throws NoSuchmappingException {
		Session session = null;

		try {
			session = openSession();

			mapping mapping = (mapping)session.get(mappingImpl.class, primaryKey);

			if (mapping == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchmappingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(mapping);
		}
		catch (NoSuchmappingException nsee) {
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
	protected mapping removeImpl(mapping mapping) {
		mapping = toUnwrappedModel(mapping);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(mapping)) {
				mapping = (mapping)session.get(mappingImpl.class,
						mapping.getPrimaryKeyObj());
			}

			if (mapping != null) {
				session.delete(mapping);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (mapping != null) {
			clearCache(mapping);
		}

		return mapping;
	}

	@Override
	public mapping updateImpl(mapping mapping) {
		mapping = toUnwrappedModel(mapping);

		boolean isNew = mapping.isNew();

		Session session = null;

		try {
			session = openSession();

			if (mapping.isNew()) {
				session.save(mapping);

				mapping.setNew(false);
			}
			else {
				mapping = (mapping)session.merge(mapping);
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

		entityCache.putResult(mappingModelImpl.ENTITY_CACHE_ENABLED,
			mappingImpl.class, mapping.getPrimaryKey(), mapping, false);

		mapping.resetOriginalValues();

		return mapping;
	}

	protected mapping toUnwrappedModel(mapping mapping) {
		if (mapping instanceof mappingImpl) {
			return mapping;
		}

		mappingImpl mappingImpl = new mappingImpl();

		mappingImpl.setNew(mapping.isNew());
		mappingImpl.setPrimaryKey(mapping.getPrimaryKey());

		mappingImpl.setMapping_id(mapping.getMapping_id());
		mappingImpl.setProduct_id(mapping.getProduct_id());
		mappingImpl.setState_id(mapping.getState_id());
		mappingImpl.setCity_id(mapping.getCity_id());
		mappingImpl.setBranch_id(mapping.getBranch_id());

		return mappingImpl;
	}

	/**
	 * Returns the mapping with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mapping
	 * @return the mapping
	 * @throws NoSuchmappingException if a mapping with the primary key could not be found
	 */
	@Override
	public mapping findByPrimaryKey(Serializable primaryKey)
		throws NoSuchmappingException {
		mapping mapping = fetchByPrimaryKey(primaryKey);

		if (mapping == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchmappingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return mapping;
	}

	/**
	 * Returns the mapping with the primary key or throws a {@link NoSuchmappingException} if it could not be found.
	 *
	 * @param mapping_id the primary key of the mapping
	 * @return the mapping
	 * @throws NoSuchmappingException if a mapping with the primary key could not be found
	 */
	@Override
	public mapping findByPrimaryKey(long mapping_id)
		throws NoSuchmappingException {
		return findByPrimaryKey((Serializable)mapping_id);
	}

	/**
	 * Returns the mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mapping
	 * @return the mapping, or <code>null</code> if a mapping with the primary key could not be found
	 */
	@Override
	public mapping fetchByPrimaryKey(Serializable primaryKey) {
		mapping mapping = (mapping)entityCache.getResult(mappingModelImpl.ENTITY_CACHE_ENABLED,
				mappingImpl.class, primaryKey);

		if (mapping == _nullmapping) {
			return null;
		}

		if (mapping == null) {
			Session session = null;

			try {
				session = openSession();

				mapping = (mapping)session.get(mappingImpl.class, primaryKey);

				if (mapping != null) {
					cacheResult(mapping);
				}
				else {
					entityCache.putResult(mappingModelImpl.ENTITY_CACHE_ENABLED,
						mappingImpl.class, primaryKey, _nullmapping);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(mappingModelImpl.ENTITY_CACHE_ENABLED,
					mappingImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return mapping;
	}

	/**
	 * Returns the mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param mapping_id the primary key of the mapping
	 * @return the mapping, or <code>null</code> if a mapping with the primary key could not be found
	 */
	@Override
	public mapping fetchByPrimaryKey(long mapping_id) {
		return fetchByPrimaryKey((Serializable)mapping_id);
	}

	@Override
	public Map<Serializable, mapping> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, mapping> map = new HashMap<Serializable, mapping>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			mapping mapping = fetchByPrimaryKey(primaryKey);

			if (mapping != null) {
				map.put(primaryKey, mapping);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			mapping mapping = (mapping)entityCache.getResult(mappingModelImpl.ENTITY_CACHE_ENABLED,
					mappingImpl.class, primaryKey);

			if (mapping == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, mapping);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_MAPPING_WHERE_PKS_IN);

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

			for (mapping mapping : (List<mapping>)q.list()) {
				map.put(mapping.getPrimaryKeyObj(), mapping);

				cacheResult(mapping);

				uncachedPrimaryKeys.remove(mapping.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(mappingModelImpl.ENTITY_CACHE_ENABLED,
					mappingImpl.class, primaryKey, _nullmapping);
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
	 * Returns all the mappings.
	 *
	 * @return the mappings
	 */
	@Override
	public List<mapping> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mappings
	 * @param end the upper bound of the range of mappings (not inclusive)
	 * @return the range of mappings
	 */
	@Override
	public List<mapping> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mappings
	 * @param end the upper bound of the range of mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mappings
	 */
	@Override
	public List<mapping> findAll(int start, int end,
		OrderByComparator<mapping> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mappings
	 * @param end the upper bound of the range of mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of mappings
	 */
	@Override
	public List<mapping> findAll(int start, int end,
		OrderByComparator<mapping> orderByComparator, boolean retrieveFromCache) {
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

		List<mapping> list = null;

		if (retrieveFromCache) {
			list = (List<mapping>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_MAPPING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MAPPING;

				if (pagination) {
					sql = sql.concat(mappingModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<mapping>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<mapping>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the mappings from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (mapping mapping : findAll()) {
			remove(mapping);
		}
	}

	/**
	 * Returns the number of mappings.
	 *
	 * @return the number of mappings
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MAPPING);

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
		return mappingModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the mapping persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(mappingImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_MAPPING = "SELECT mapping FROM mapping mapping";
	private static final String _SQL_SELECT_MAPPING_WHERE_PKS_IN = "SELECT mapping FROM mapping mapping WHERE mapping_id IN (";
	private static final String _SQL_COUNT_MAPPING = "SELECT COUNT(mapping) FROM mapping mapping";
	private static final String _ORDER_BY_ENTITY_ALIAS = "mapping.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No mapping exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(mappingPersistenceImpl.class);
	private static final mapping _nullmapping = new mappingImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<mapping> toCacheModel() {
				return _nullmappingCacheModel;
			}
		};

	private static final CacheModel<mapping> _nullmappingCacheModel = new CacheModel<mapping>() {
			@Override
			public mapping toEntityModel() {
				return _nullmapping;
			}
		};
}