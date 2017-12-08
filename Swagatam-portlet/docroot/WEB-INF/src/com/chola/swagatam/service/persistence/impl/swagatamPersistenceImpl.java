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

package com.chola.swagatam.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.swagatam.exception.NoSuchswagatamException;
import com.chola.swagatam.model.impl.swagatamImpl;
import com.chola.swagatam.model.impl.swagatamModelImpl;
import com.chola.swagatam.model.swagatam;
import com.chola.swagatam.service.persistence.swagatamPersistence;

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
 * The persistence implementation for the swagatam service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see swagatamPersistence
 * @see com.chola.swagatam.service.persistence.swagatamUtil
 * @generated
 */
@ProviderType
public class swagatamPersistenceImpl extends BasePersistenceImpl<swagatam>
	implements swagatamPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link swagatamUtil} to access the swagatam persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = swagatamImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(swagatamModelImpl.ENTITY_CACHE_ENABLED,
			swagatamModelImpl.FINDER_CACHE_ENABLED, swagatamImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(swagatamModelImpl.ENTITY_CACHE_ENABLED,
			swagatamModelImpl.FINDER_CACHE_ENABLED, swagatamImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(swagatamModelImpl.ENTITY_CACHE_ENABLED,
			swagatamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public swagatamPersistenceImpl() {
		setModelClass(swagatam.class);
	}

	/**
	 * Caches the swagatam in the entity cache if it is enabled.
	 *
	 * @param swagatam the swagatam
	 */
	@Override
	public void cacheResult(swagatam swagatam) {
		entityCache.putResult(swagatamModelImpl.ENTITY_CACHE_ENABLED,
			swagatamImpl.class, swagatam.getPrimaryKey(), swagatam);

		swagatam.resetOriginalValues();
	}

	/**
	 * Caches the swagatams in the entity cache if it is enabled.
	 *
	 * @param swagatams the swagatams
	 */
	@Override
	public void cacheResult(List<swagatam> swagatams) {
		for (swagatam swagatam : swagatams) {
			if (entityCache.getResult(swagatamModelImpl.ENTITY_CACHE_ENABLED,
						swagatamImpl.class, swagatam.getPrimaryKey()) == null) {
				cacheResult(swagatam);
			}
			else {
				swagatam.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all swagatams.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(swagatamImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the swagatam.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(swagatam swagatam) {
		entityCache.removeResult(swagatamModelImpl.ENTITY_CACHE_ENABLED,
			swagatamImpl.class, swagatam.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<swagatam> swagatams) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (swagatam swagatam : swagatams) {
			entityCache.removeResult(swagatamModelImpl.ENTITY_CACHE_ENABLED,
				swagatamImpl.class, swagatam.getPrimaryKey());
		}
	}

	/**
	 * Creates a new swagatam with the primary key. Does not add the swagatam to the database.
	 *
	 * @param id the primary key for the new swagatam
	 * @return the new swagatam
	 */
	@Override
	public swagatam create(long id) {
		swagatam swagatam = new swagatamImpl();

		swagatam.setNew(true);
		swagatam.setPrimaryKey(id);

		return swagatam;
	}

	/**
	 * Removes the swagatam with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the swagatam
	 * @return the swagatam that was removed
	 * @throws NoSuchswagatamException if a swagatam with the primary key could not be found
	 */
	@Override
	public swagatam remove(long id) throws NoSuchswagatamException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the swagatam with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the swagatam
	 * @return the swagatam that was removed
	 * @throws NoSuchswagatamException if a swagatam with the primary key could not be found
	 */
	@Override
	public swagatam remove(Serializable primaryKey)
		throws NoSuchswagatamException {
		Session session = null;

		try {
			session = openSession();

			swagatam swagatam = (swagatam)session.get(swagatamImpl.class,
					primaryKey);

			if (swagatam == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchswagatamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(swagatam);
		}
		catch (NoSuchswagatamException nsee) {
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
	protected swagatam removeImpl(swagatam swagatam) {
		swagatam = toUnwrappedModel(swagatam);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(swagatam)) {
				swagatam = (swagatam)session.get(swagatamImpl.class,
						swagatam.getPrimaryKeyObj());
			}

			if (swagatam != null) {
				session.delete(swagatam);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (swagatam != null) {
			clearCache(swagatam);
		}

		return swagatam;
	}

	@Override
	public swagatam updateImpl(swagatam swagatam) {
		swagatam = toUnwrappedModel(swagatam);

		boolean isNew = swagatam.isNew();

		Session session = null;

		try {
			session = openSession();

			if (swagatam.isNew()) {
				session.save(swagatam);

				swagatam.setNew(false);
			}
			else {
				swagatam = (swagatam)session.merge(swagatam);
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

		entityCache.putResult(swagatamModelImpl.ENTITY_CACHE_ENABLED,
			swagatamImpl.class, swagatam.getPrimaryKey(), swagatam, false);

		swagatam.resetOriginalValues();

		return swagatam;
	}

	protected swagatam toUnwrappedModel(swagatam swagatam) {
		if (swagatam instanceof swagatamImpl) {
			return swagatam;
		}

		swagatamImpl swagatamImpl = new swagatamImpl();

		swagatamImpl.setNew(swagatam.isNew());
		swagatamImpl.setPrimaryKey(swagatam.getPrimaryKey());

		swagatamImpl.setId(swagatam.getId());
		swagatamImpl.setInductionid(swagatam.getInductionid());
		swagatamImpl.setTitle(swagatam.getTitle());
		swagatamImpl.setDesc(swagatam.getDesc());
		swagatamImpl.setCreatedDate(swagatam.getCreatedDate());
		swagatamImpl.setCreatedBy(swagatam.getCreatedBy());
		swagatamImpl.setFlag(swagatam.getFlag());

		return swagatamImpl;
	}

	/**
	 * Returns the swagatam with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the swagatam
	 * @return the swagatam
	 * @throws NoSuchswagatamException if a swagatam with the primary key could not be found
	 */
	@Override
	public swagatam findByPrimaryKey(Serializable primaryKey)
		throws NoSuchswagatamException {
		swagatam swagatam = fetchByPrimaryKey(primaryKey);

		if (swagatam == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchswagatamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return swagatam;
	}

	/**
	 * Returns the swagatam with the primary key or throws a {@link NoSuchswagatamException} if it could not be found.
	 *
	 * @param id the primary key of the swagatam
	 * @return the swagatam
	 * @throws NoSuchswagatamException if a swagatam with the primary key could not be found
	 */
	@Override
	public swagatam findByPrimaryKey(long id) throws NoSuchswagatamException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the swagatam with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the swagatam
	 * @return the swagatam, or <code>null</code> if a swagatam with the primary key could not be found
	 */
	@Override
	public swagatam fetchByPrimaryKey(Serializable primaryKey) {
		swagatam swagatam = (swagatam)entityCache.getResult(swagatamModelImpl.ENTITY_CACHE_ENABLED,
				swagatamImpl.class, primaryKey);

		if (swagatam == _nullswagatam) {
			return null;
		}

		if (swagatam == null) {
			Session session = null;

			try {
				session = openSession();

				swagatam = (swagatam)session.get(swagatamImpl.class, primaryKey);

				if (swagatam != null) {
					cacheResult(swagatam);
				}
				else {
					entityCache.putResult(swagatamModelImpl.ENTITY_CACHE_ENABLED,
						swagatamImpl.class, primaryKey, _nullswagatam);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(swagatamModelImpl.ENTITY_CACHE_ENABLED,
					swagatamImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return swagatam;
	}

	/**
	 * Returns the swagatam with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the swagatam
	 * @return the swagatam, or <code>null</code> if a swagatam with the primary key could not be found
	 */
	@Override
	public swagatam fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, swagatam> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, swagatam> map = new HashMap<Serializable, swagatam>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			swagatam swagatam = fetchByPrimaryKey(primaryKey);

			if (swagatam != null) {
				map.put(primaryKey, swagatam);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			swagatam swagatam = (swagatam)entityCache.getResult(swagatamModelImpl.ENTITY_CACHE_ENABLED,
					swagatamImpl.class, primaryKey);

			if (swagatam == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, swagatam);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SWAGATAM_WHERE_PKS_IN);

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

			for (swagatam swagatam : (List<swagatam>)q.list()) {
				map.put(swagatam.getPrimaryKeyObj(), swagatam);

				cacheResult(swagatam);

				uncachedPrimaryKeys.remove(swagatam.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(swagatamModelImpl.ENTITY_CACHE_ENABLED,
					swagatamImpl.class, primaryKey, _nullswagatam);
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
	 * Returns all the swagatams.
	 *
	 * @return the swagatams
	 */
	@Override
	public List<swagatam> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the swagatams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of swagatams
	 * @param end the upper bound of the range of swagatams (not inclusive)
	 * @return the range of swagatams
	 */
	@Override
	public List<swagatam> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the swagatams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of swagatams
	 * @param end the upper bound of the range of swagatams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of swagatams
	 */
	@Override
	public List<swagatam> findAll(int start, int end,
		OrderByComparator<swagatam> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the swagatams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of swagatams
	 * @param end the upper bound of the range of swagatams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of swagatams
	 */
	@Override
	public List<swagatam> findAll(int start, int end,
		OrderByComparator<swagatam> orderByComparator, boolean retrieveFromCache) {
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

		List<swagatam> list = null;

		if (retrieveFromCache) {
			list = (List<swagatam>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SWAGATAM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SWAGATAM;

				if (pagination) {
					sql = sql.concat(swagatamModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<swagatam>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<swagatam>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the swagatams from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (swagatam swagatam : findAll()) {
			remove(swagatam);
		}
	}

	/**
	 * Returns the number of swagatams.
	 *
	 * @return the number of swagatams
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SWAGATAM);

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
		return swagatamModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the swagatam persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(swagatamImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_SWAGATAM = "SELECT swagatam FROM swagatam swagatam";
	private static final String _SQL_SELECT_SWAGATAM_WHERE_PKS_IN = "SELECT swagatam FROM swagatam swagatam WHERE id_ IN (";
	private static final String _SQL_COUNT_SWAGATAM = "SELECT COUNT(swagatam) FROM swagatam swagatam";
	private static final String _ORDER_BY_ENTITY_ALIAS = "swagatam.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No swagatam exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(swagatamPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "desc"
			});
	private static final swagatam _nullswagatam = new swagatamImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<swagatam> toCacheModel() {
				return _nullswagatamCacheModel;
			}
		};

	private static final CacheModel<swagatam> _nullswagatamCacheModel = new CacheModel<swagatam>() {
			@Override
			public swagatam toEntityModel() {
				return _nullswagatam;
			}
		};
}