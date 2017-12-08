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

package com.chola.listbranch.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.listbranch.exception.NoSuchdetailsException;
import com.chola.listbranch.model.branchdetails;
import com.chola.listbranch.model.impl.branchdetailsImpl;
import com.chola.listbranch.model.impl.branchdetailsModelImpl;
import com.chola.listbranch.service.persistence.branchdetailsPersistence;

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
 * The persistence implementation for the branchdetails service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see branchdetailsPersistence
 * @see com.chola.listbranch.service.persistence.branchdetailsUtil
 * @generated
 */
@ProviderType
public class branchdetailsPersistenceImpl extends BasePersistenceImpl<branchdetails>
	implements branchdetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link branchdetailsUtil} to access the branchdetails persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = branchdetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(branchdetailsModelImpl.ENTITY_CACHE_ENABLED,
			branchdetailsModelImpl.FINDER_CACHE_ENABLED,
			branchdetailsImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(branchdetailsModelImpl.ENTITY_CACHE_ENABLED,
			branchdetailsModelImpl.FINDER_CACHE_ENABLED,
			branchdetailsImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(branchdetailsModelImpl.ENTITY_CACHE_ENABLED,
			branchdetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public branchdetailsPersistenceImpl() {
		setModelClass(branchdetails.class);
	}

	/**
	 * Caches the branchdetails in the entity cache if it is enabled.
	 *
	 * @param branchdetails the branchdetails
	 */
	@Override
	public void cacheResult(branchdetails branchdetails) {
		entityCache.putResult(branchdetailsModelImpl.ENTITY_CACHE_ENABLED,
			branchdetailsImpl.class, branchdetails.getPrimaryKey(),
			branchdetails);

		branchdetails.resetOriginalValues();
	}

	/**
	 * Caches the branchdetailses in the entity cache if it is enabled.
	 *
	 * @param branchdetailses the branchdetailses
	 */
	@Override
	public void cacheResult(List<branchdetails> branchdetailses) {
		for (branchdetails branchdetails : branchdetailses) {
			if (entityCache.getResult(
						branchdetailsModelImpl.ENTITY_CACHE_ENABLED,
						branchdetailsImpl.class, branchdetails.getPrimaryKey()) == null) {
				cacheResult(branchdetails);
			}
			else {
				branchdetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all branchdetailses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(branchdetailsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the branchdetails.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(branchdetails branchdetails) {
		entityCache.removeResult(branchdetailsModelImpl.ENTITY_CACHE_ENABLED,
			branchdetailsImpl.class, branchdetails.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<branchdetails> branchdetailses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (branchdetails branchdetails : branchdetailses) {
			entityCache.removeResult(branchdetailsModelImpl.ENTITY_CACHE_ENABLED,
				branchdetailsImpl.class, branchdetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new branchdetails with the primary key. Does not add the branchdetails to the database.
	 *
	 * @param branch_id the primary key for the new branchdetails
	 * @return the new branchdetails
	 */
	@Override
	public branchdetails create(long branch_id) {
		branchdetails branchdetails = new branchdetailsImpl();

		branchdetails.setNew(true);
		branchdetails.setPrimaryKey(branch_id);

		return branchdetails;
	}

	/**
	 * Removes the branchdetails with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param branch_id the primary key of the branchdetails
	 * @return the branchdetails that was removed
	 * @throws NoSuchdetailsException if a branchdetails with the primary key could not be found
	 */
	@Override
	public branchdetails remove(long branch_id) throws NoSuchdetailsException {
		return remove((Serializable)branch_id);
	}

	/**
	 * Removes the branchdetails with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the branchdetails
	 * @return the branchdetails that was removed
	 * @throws NoSuchdetailsException if a branchdetails with the primary key could not be found
	 */
	@Override
	public branchdetails remove(Serializable primaryKey)
		throws NoSuchdetailsException {
		Session session = null;

		try {
			session = openSession();

			branchdetails branchdetails = (branchdetails)session.get(branchdetailsImpl.class,
					primaryKey);

			if (branchdetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchdetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(branchdetails);
		}
		catch (NoSuchdetailsException nsee) {
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
	protected branchdetails removeImpl(branchdetails branchdetails) {
		branchdetails = toUnwrappedModel(branchdetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(branchdetails)) {
				branchdetails = (branchdetails)session.get(branchdetailsImpl.class,
						branchdetails.getPrimaryKeyObj());
			}

			if (branchdetails != null) {
				session.delete(branchdetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (branchdetails != null) {
			clearCache(branchdetails);
		}

		return branchdetails;
	}

	@Override
	public branchdetails updateImpl(branchdetails branchdetails) {
		branchdetails = toUnwrappedModel(branchdetails);

		boolean isNew = branchdetails.isNew();

		Session session = null;

		try {
			session = openSession();

			if (branchdetails.isNew()) {
				session.save(branchdetails);

				branchdetails.setNew(false);
			}
			else {
				branchdetails = (branchdetails)session.merge(branchdetails);
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

		entityCache.putResult(branchdetailsModelImpl.ENTITY_CACHE_ENABLED,
			branchdetailsImpl.class, branchdetails.getPrimaryKey(),
			branchdetails, false);

		branchdetails.resetOriginalValues();

		return branchdetails;
	}

	protected branchdetails toUnwrappedModel(branchdetails branchdetails) {
		if (branchdetails instanceof branchdetailsImpl) {
			return branchdetails;
		}

		branchdetailsImpl branchdetailsImpl = new branchdetailsImpl();

		branchdetailsImpl.setNew(branchdetails.isNew());
		branchdetailsImpl.setPrimaryKey(branchdetails.getPrimaryKey());

		branchdetailsImpl.setBranch_id(branchdetails.getBranch_id());
		branchdetailsImpl.setBranch_code(branchdetails.getBranch_code());
		branchdetailsImpl.setBranch_address(branchdetails.getBranch_address());
		branchdetailsImpl.setCity_id(branchdetails.getCity_id());

		return branchdetailsImpl;
	}

	/**
	 * Returns the branchdetails with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the branchdetails
	 * @return the branchdetails
	 * @throws NoSuchdetailsException if a branchdetails with the primary key could not be found
	 */
	@Override
	public branchdetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchdetailsException {
		branchdetails branchdetails = fetchByPrimaryKey(primaryKey);

		if (branchdetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchdetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return branchdetails;
	}

	/**
	 * Returns the branchdetails with the primary key or throws a {@link NoSuchdetailsException} if it could not be found.
	 *
	 * @param branch_id the primary key of the branchdetails
	 * @return the branchdetails
	 * @throws NoSuchdetailsException if a branchdetails with the primary key could not be found
	 */
	@Override
	public branchdetails findByPrimaryKey(long branch_id)
		throws NoSuchdetailsException {
		return findByPrimaryKey((Serializable)branch_id);
	}

	/**
	 * Returns the branchdetails with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the branchdetails
	 * @return the branchdetails, or <code>null</code> if a branchdetails with the primary key could not be found
	 */
	@Override
	public branchdetails fetchByPrimaryKey(Serializable primaryKey) {
		branchdetails branchdetails = (branchdetails)entityCache.getResult(branchdetailsModelImpl.ENTITY_CACHE_ENABLED,
				branchdetailsImpl.class, primaryKey);

		if (branchdetails == _nullbranchdetails) {
			return null;
		}

		if (branchdetails == null) {
			Session session = null;

			try {
				session = openSession();

				branchdetails = (branchdetails)session.get(branchdetailsImpl.class,
						primaryKey);

				if (branchdetails != null) {
					cacheResult(branchdetails);
				}
				else {
					entityCache.putResult(branchdetailsModelImpl.ENTITY_CACHE_ENABLED,
						branchdetailsImpl.class, primaryKey, _nullbranchdetails);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(branchdetailsModelImpl.ENTITY_CACHE_ENABLED,
					branchdetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return branchdetails;
	}

	/**
	 * Returns the branchdetails with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param branch_id the primary key of the branchdetails
	 * @return the branchdetails, or <code>null</code> if a branchdetails with the primary key could not be found
	 */
	@Override
	public branchdetails fetchByPrimaryKey(long branch_id) {
		return fetchByPrimaryKey((Serializable)branch_id);
	}

	@Override
	public Map<Serializable, branchdetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, branchdetails> map = new HashMap<Serializable, branchdetails>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			branchdetails branchdetails = fetchByPrimaryKey(primaryKey);

			if (branchdetails != null) {
				map.put(primaryKey, branchdetails);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			branchdetails branchdetails = (branchdetails)entityCache.getResult(branchdetailsModelImpl.ENTITY_CACHE_ENABLED,
					branchdetailsImpl.class, primaryKey);

			if (branchdetails == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, branchdetails);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BRANCHDETAILS_WHERE_PKS_IN);

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

			for (branchdetails branchdetails : (List<branchdetails>)q.list()) {
				map.put(branchdetails.getPrimaryKeyObj(), branchdetails);

				cacheResult(branchdetails);

				uncachedPrimaryKeys.remove(branchdetails.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(branchdetailsModelImpl.ENTITY_CACHE_ENABLED,
					branchdetailsImpl.class, primaryKey, _nullbranchdetails);
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
	 * Returns all the branchdetailses.
	 *
	 * @return the branchdetailses
	 */
	@Override
	public List<branchdetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the branchdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link branchdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of branchdetailses
	 * @param end the upper bound of the range of branchdetailses (not inclusive)
	 * @return the range of branchdetailses
	 */
	@Override
	public List<branchdetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the branchdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link branchdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of branchdetailses
	 * @param end the upper bound of the range of branchdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of branchdetailses
	 */
	@Override
	public List<branchdetails> findAll(int start, int end,
		OrderByComparator<branchdetails> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the branchdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link branchdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of branchdetailses
	 * @param end the upper bound of the range of branchdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of branchdetailses
	 */
	@Override
	public List<branchdetails> findAll(int start, int end,
		OrderByComparator<branchdetails> orderByComparator,
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

		List<branchdetails> list = null;

		if (retrieveFromCache) {
			list = (List<branchdetails>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BRANCHDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BRANCHDETAILS;

				if (pagination) {
					sql = sql.concat(branchdetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<branchdetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<branchdetails>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the branchdetailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (branchdetails branchdetails : findAll()) {
			remove(branchdetails);
		}
	}

	/**
	 * Returns the number of branchdetailses.
	 *
	 * @return the number of branchdetailses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BRANCHDETAILS);

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
		return branchdetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the branchdetails persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(branchdetailsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_BRANCHDETAILS = "SELECT branchdetails FROM branchdetails branchdetails";
	private static final String _SQL_SELECT_BRANCHDETAILS_WHERE_PKS_IN = "SELECT branchdetails FROM branchdetails branchdetails WHERE branch_id IN (";
	private static final String _SQL_COUNT_BRANCHDETAILS = "SELECT COUNT(branchdetails) FROM branchdetails branchdetails";
	private static final String _ORDER_BY_ENTITY_ALIAS = "branchdetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No branchdetails exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(branchdetailsPersistenceImpl.class);
	private static final branchdetails _nullbranchdetails = new branchdetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<branchdetails> toCacheModel() {
				return _nullbranchdetailsCacheModel;
			}
		};

	private static final CacheModel<branchdetails> _nullbranchdetailsCacheModel = new CacheModel<branchdetails>() {
			@Override
			public branchdetails toEntityModel() {
				return _nullbranchdetails;
			}
		};
}