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

package com.chola.personalisedparameters.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.personalisedparameters.exception.NoSuchbsopdetailsException;
import com.chola.personalisedparameters.model.bsopdetails;
import com.chola.personalisedparameters.model.impl.bsopdetailsImpl;
import com.chola.personalisedparameters.model.impl.bsopdetailsModelImpl;
import com.chola.personalisedparameters.service.persistence.bsopdetailsPersistence;

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
 * The persistence implementation for the bsopdetails service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see bsopdetailsPersistence
 * @see com.chola.personalisedparameters.service.persistence.bsopdetailsUtil
 * @generated
 */
@ProviderType
public class bsopdetailsPersistenceImpl extends BasePersistenceImpl<bsopdetails>
	implements bsopdetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link bsopdetailsUtil} to access the bsopdetails persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = bsopdetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(bsopdetailsModelImpl.ENTITY_CACHE_ENABLED,
			bsopdetailsModelImpl.FINDER_CACHE_ENABLED, bsopdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(bsopdetailsModelImpl.ENTITY_CACHE_ENABLED,
			bsopdetailsModelImpl.FINDER_CACHE_ENABLED, bsopdetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(bsopdetailsModelImpl.ENTITY_CACHE_ENABLED,
			bsopdetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public bsopdetailsPersistenceImpl() {
		setModelClass(bsopdetails.class);
	}

	/**
	 * Caches the bsopdetails in the entity cache if it is enabled.
	 *
	 * @param bsopdetails the bsopdetails
	 */
	@Override
	public void cacheResult(bsopdetails bsopdetails) {
		entityCache.putResult(bsopdetailsModelImpl.ENTITY_CACHE_ENABLED,
			bsopdetailsImpl.class, bsopdetails.getPrimaryKey(), bsopdetails);

		bsopdetails.resetOriginalValues();
	}

	/**
	 * Caches the bsopdetailses in the entity cache if it is enabled.
	 *
	 * @param bsopdetailses the bsopdetailses
	 */
	@Override
	public void cacheResult(List<bsopdetails> bsopdetailses) {
		for (bsopdetails bsopdetails : bsopdetailses) {
			if (entityCache.getResult(
						bsopdetailsModelImpl.ENTITY_CACHE_ENABLED,
						bsopdetailsImpl.class, bsopdetails.getPrimaryKey()) == null) {
				cacheResult(bsopdetails);
			}
			else {
				bsopdetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all bsopdetailses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(bsopdetailsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the bsopdetails.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(bsopdetails bsopdetails) {
		entityCache.removeResult(bsopdetailsModelImpl.ENTITY_CACHE_ENABLED,
			bsopdetailsImpl.class, bsopdetails.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<bsopdetails> bsopdetailses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (bsopdetails bsopdetails : bsopdetailses) {
			entityCache.removeResult(bsopdetailsModelImpl.ENTITY_CACHE_ENABLED,
				bsopdetailsImpl.class, bsopdetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new bsopdetails with the primary key. Does not add the bsopdetails to the database.
	 *
	 * @param id the primary key for the new bsopdetails
	 * @return the new bsopdetails
	 */
	@Override
	public bsopdetails create(long id) {
		bsopdetails bsopdetails = new bsopdetailsImpl();

		bsopdetails.setNew(true);
		bsopdetails.setPrimaryKey(id);

		return bsopdetails;
	}

	/**
	 * Removes the bsopdetails with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the bsopdetails
	 * @return the bsopdetails that was removed
	 * @throws NoSuchbsopdetailsException if a bsopdetails with the primary key could not be found
	 */
	@Override
	public bsopdetails remove(long id) throws NoSuchbsopdetailsException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the bsopdetails with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bsopdetails
	 * @return the bsopdetails that was removed
	 * @throws NoSuchbsopdetailsException if a bsopdetails with the primary key could not be found
	 */
	@Override
	public bsopdetails remove(Serializable primaryKey)
		throws NoSuchbsopdetailsException {
		Session session = null;

		try {
			session = openSession();

			bsopdetails bsopdetails = (bsopdetails)session.get(bsopdetailsImpl.class,
					primaryKey);

			if (bsopdetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbsopdetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(bsopdetails);
		}
		catch (NoSuchbsopdetailsException nsee) {
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
	protected bsopdetails removeImpl(bsopdetails bsopdetails) {
		bsopdetails = toUnwrappedModel(bsopdetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bsopdetails)) {
				bsopdetails = (bsopdetails)session.get(bsopdetailsImpl.class,
						bsopdetails.getPrimaryKeyObj());
			}

			if (bsopdetails != null) {
				session.delete(bsopdetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (bsopdetails != null) {
			clearCache(bsopdetails);
		}

		return bsopdetails;
	}

	@Override
	public bsopdetails updateImpl(bsopdetails bsopdetails) {
		bsopdetails = toUnwrappedModel(bsopdetails);

		boolean isNew = bsopdetails.isNew();

		Session session = null;

		try {
			session = openSession();

			if (bsopdetails.isNew()) {
				session.save(bsopdetails);

				bsopdetails.setNew(false);
			}
			else {
				bsopdetails = (bsopdetails)session.merge(bsopdetails);
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

		entityCache.putResult(bsopdetailsModelImpl.ENTITY_CACHE_ENABLED,
			bsopdetailsImpl.class, bsopdetails.getPrimaryKey(), bsopdetails,
			false);

		bsopdetails.resetOriginalValues();

		return bsopdetails;
	}

	protected bsopdetails toUnwrappedModel(bsopdetails bsopdetails) {
		if (bsopdetails instanceof bsopdetailsImpl) {
			return bsopdetails;
		}

		bsopdetailsImpl bsopdetailsImpl = new bsopdetailsImpl();

		bsopdetailsImpl.setNew(bsopdetails.isNew());
		bsopdetailsImpl.setPrimaryKey(bsopdetails.getPrimaryKey());

		bsopdetailsImpl.setId(bsopdetails.getId());
		bsopdetailsImpl.setContent_id(bsopdetails.getContent_id());
		bsopdetailsImpl.setBtitle(bsopdetails.getBtitle());
		bsopdetailsImpl.setBdesc(bsopdetails.getBdesc());
		bsopdetailsImpl.setCreateddate(bsopdetails.getCreateddate());
		bsopdetailsImpl.setCreatedby(bsopdetails.getCreatedby());
		bsopdetailsImpl.setModifieddate(bsopdetails.getModifieddate());
		bsopdetailsImpl.setModifiedby(bsopdetails.getModifiedby());
		bsopdetailsImpl.setFlag(bsopdetails.getFlag());

		return bsopdetailsImpl;
	}

	/**
	 * Returns the bsopdetails with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the bsopdetails
	 * @return the bsopdetails
	 * @throws NoSuchbsopdetailsException if a bsopdetails with the primary key could not be found
	 */
	@Override
	public bsopdetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbsopdetailsException {
		bsopdetails bsopdetails = fetchByPrimaryKey(primaryKey);

		if (bsopdetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbsopdetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return bsopdetails;
	}

	/**
	 * Returns the bsopdetails with the primary key or throws a {@link NoSuchbsopdetailsException} if it could not be found.
	 *
	 * @param id the primary key of the bsopdetails
	 * @return the bsopdetails
	 * @throws NoSuchbsopdetailsException if a bsopdetails with the primary key could not be found
	 */
	@Override
	public bsopdetails findByPrimaryKey(long id)
		throws NoSuchbsopdetailsException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the bsopdetails with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bsopdetails
	 * @return the bsopdetails, or <code>null</code> if a bsopdetails with the primary key could not be found
	 */
	@Override
	public bsopdetails fetchByPrimaryKey(Serializable primaryKey) {
		bsopdetails bsopdetails = (bsopdetails)entityCache.getResult(bsopdetailsModelImpl.ENTITY_CACHE_ENABLED,
				bsopdetailsImpl.class, primaryKey);

		if (bsopdetails == _nullbsopdetails) {
			return null;
		}

		if (bsopdetails == null) {
			Session session = null;

			try {
				session = openSession();

				bsopdetails = (bsopdetails)session.get(bsopdetailsImpl.class,
						primaryKey);

				if (bsopdetails != null) {
					cacheResult(bsopdetails);
				}
				else {
					entityCache.putResult(bsopdetailsModelImpl.ENTITY_CACHE_ENABLED,
						bsopdetailsImpl.class, primaryKey, _nullbsopdetails);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(bsopdetailsModelImpl.ENTITY_CACHE_ENABLED,
					bsopdetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return bsopdetails;
	}

	/**
	 * Returns the bsopdetails with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the bsopdetails
	 * @return the bsopdetails, or <code>null</code> if a bsopdetails with the primary key could not be found
	 */
	@Override
	public bsopdetails fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, bsopdetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, bsopdetails> map = new HashMap<Serializable, bsopdetails>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			bsopdetails bsopdetails = fetchByPrimaryKey(primaryKey);

			if (bsopdetails != null) {
				map.put(primaryKey, bsopdetails);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			bsopdetails bsopdetails = (bsopdetails)entityCache.getResult(bsopdetailsModelImpl.ENTITY_CACHE_ENABLED,
					bsopdetailsImpl.class, primaryKey);

			if (bsopdetails == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, bsopdetails);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BSOPDETAILS_WHERE_PKS_IN);

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

			for (bsopdetails bsopdetails : (List<bsopdetails>)q.list()) {
				map.put(bsopdetails.getPrimaryKeyObj(), bsopdetails);

				cacheResult(bsopdetails);

				uncachedPrimaryKeys.remove(bsopdetails.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(bsopdetailsModelImpl.ENTITY_CACHE_ENABLED,
					bsopdetailsImpl.class, primaryKey, _nullbsopdetails);
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
	 * Returns all the bsopdetailses.
	 *
	 * @return the bsopdetailses
	 */
	@Override
	public List<bsopdetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bsopdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsopdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bsopdetailses
	 * @param end the upper bound of the range of bsopdetailses (not inclusive)
	 * @return the range of bsopdetailses
	 */
	@Override
	public List<bsopdetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bsopdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsopdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bsopdetailses
	 * @param end the upper bound of the range of bsopdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bsopdetailses
	 */
	@Override
	public List<bsopdetails> findAll(int start, int end,
		OrderByComparator<bsopdetails> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the bsopdetailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsopdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bsopdetailses
	 * @param end the upper bound of the range of bsopdetailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of bsopdetailses
	 */
	@Override
	public List<bsopdetails> findAll(int start, int end,
		OrderByComparator<bsopdetails> orderByComparator,
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

		List<bsopdetails> list = null;

		if (retrieveFromCache) {
			list = (List<bsopdetails>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BSOPDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BSOPDETAILS;

				if (pagination) {
					sql = sql.concat(bsopdetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<bsopdetails>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<bsopdetails>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the bsopdetailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (bsopdetails bsopdetails : findAll()) {
			remove(bsopdetails);
		}
	}

	/**
	 * Returns the number of bsopdetailses.
	 *
	 * @return the number of bsopdetailses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BSOPDETAILS);

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
		return bsopdetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the bsopdetails persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(bsopdetailsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_BSOPDETAILS = "SELECT bsopdetails FROM bsopdetails bsopdetails";
	private static final String _SQL_SELECT_BSOPDETAILS_WHERE_PKS_IN = "SELECT bsopdetails FROM bsopdetails bsopdetails WHERE id_ IN (";
	private static final String _SQL_COUNT_BSOPDETAILS = "SELECT COUNT(bsopdetails) FROM bsopdetails bsopdetails";
	private static final String _ORDER_BY_ENTITY_ALIAS = "bsopdetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No bsopdetails exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(bsopdetailsPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final bsopdetails _nullbsopdetails = new bsopdetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<bsopdetails> toCacheModel() {
				return _nullbsopdetailsCacheModel;
			}
		};

	private static final CacheModel<bsopdetails> _nullbsopdetailsCacheModel = new CacheModel<bsopdetails>() {
			@Override
			public bsopdetails toEntityModel() {
				return _nullbsopdetails;
			}
		};
}