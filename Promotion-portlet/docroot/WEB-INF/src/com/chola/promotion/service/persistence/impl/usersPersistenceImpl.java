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

package com.chola.promotion.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.promotion.exception.NoSuchusersException;
import com.chola.promotion.model.impl.usersImpl;
import com.chola.promotion.model.impl.usersModelImpl;
import com.chola.promotion.model.users;
import com.chola.promotion.service.persistence.usersPersistence;

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
 * The persistence implementation for the users service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see usersPersistence
 * @see com.chola.promotion.service.persistence.usersUtil
 * @generated
 */
@ProviderType
public class usersPersistenceImpl extends BasePersistenceImpl<users>
	implements usersPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link usersUtil} to access the users persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = usersImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(usersModelImpl.ENTITY_CACHE_ENABLED,
			usersModelImpl.FINDER_CACHE_ENABLED, usersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(usersModelImpl.ENTITY_CACHE_ENABLED,
			usersModelImpl.FINDER_CACHE_ENABLED, usersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(usersModelImpl.ENTITY_CACHE_ENABLED,
			usersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public usersPersistenceImpl() {
		setModelClass(users.class);
	}

	/**
	 * Caches the users in the entity cache if it is enabled.
	 *
	 * @param users the users
	 */
	@Override
	public void cacheResult(users users) {
		entityCache.putResult(usersModelImpl.ENTITY_CACHE_ENABLED,
			usersImpl.class, users.getPrimaryKey(), users);

		users.resetOriginalValues();
	}

	/**
	 * Caches the userses in the entity cache if it is enabled.
	 *
	 * @param userses the userses
	 */
	@Override
	public void cacheResult(List<users> userses) {
		for (users users : userses) {
			if (entityCache.getResult(usersModelImpl.ENTITY_CACHE_ENABLED,
						usersImpl.class, users.getPrimaryKey()) == null) {
				cacheResult(users);
			}
			else {
				users.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all userses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(usersImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the users.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(users users) {
		entityCache.removeResult(usersModelImpl.ENTITY_CACHE_ENABLED,
			usersImpl.class, users.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<users> userses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (users users : userses) {
			entityCache.removeResult(usersModelImpl.ENTITY_CACHE_ENABLED,
				usersImpl.class, users.getPrimaryKey());
		}
	}

	/**
	 * Creates a new users with the primary key. Does not add the users to the database.
	 *
	 * @param Id the primary key for the new users
	 * @return the new users
	 */
	@Override
	public users create(long Id) {
		users users = new usersImpl();

		users.setNew(true);
		users.setPrimaryKey(Id);

		return users;
	}

	/**
	 * Removes the users with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the users
	 * @return the users that was removed
	 * @throws NoSuchusersException if a users with the primary key could not be found
	 */
	@Override
	public users remove(long Id) throws NoSuchusersException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the users with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the users
	 * @return the users that was removed
	 * @throws NoSuchusersException if a users with the primary key could not be found
	 */
	@Override
	public users remove(Serializable primaryKey) throws NoSuchusersException {
		Session session = null;

		try {
			session = openSession();

			users users = (users)session.get(usersImpl.class, primaryKey);

			if (users == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchusersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(users);
		}
		catch (NoSuchusersException nsee) {
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
	protected users removeImpl(users users) {
		users = toUnwrappedModel(users);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(users)) {
				users = (users)session.get(usersImpl.class,
						users.getPrimaryKeyObj());
			}

			if (users != null) {
				session.delete(users);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (users != null) {
			clearCache(users);
		}

		return users;
	}

	@Override
	public users updateImpl(users users) {
		users = toUnwrappedModel(users);

		boolean isNew = users.isNew();

		Session session = null;

		try {
			session = openSession();

			if (users.isNew()) {
				session.save(users);

				users.setNew(false);
			}
			else {
				users = (users)session.merge(users);
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

		entityCache.putResult(usersModelImpl.ENTITY_CACHE_ENABLED,
			usersImpl.class, users.getPrimaryKey(), users, false);

		users.resetOriginalValues();

		return users;
	}

	protected users toUnwrappedModel(users users) {
		if (users instanceof usersImpl) {
			return users;
		}

		usersImpl usersImpl = new usersImpl();

		usersImpl.setNew(users.isNew());
		usersImpl.setPrimaryKey(users.getPrimaryKey());

		usersImpl.setId(users.getId());
		usersImpl.setEmpId(users.getEmpId());
		usersImpl.setEmpName(users.getEmpName());
		usersImpl.setEmpImagePath(users.getEmpImagePath());
		usersImpl.setWriteUp(users.getWriteUp());
		usersImpl.setAwardedDate(users.getAwardedDate());

		return usersImpl;
	}

	/**
	 * Returns the users with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the users
	 * @return the users
	 * @throws NoSuchusersException if a users with the primary key could not be found
	 */
	@Override
	public users findByPrimaryKey(Serializable primaryKey)
		throws NoSuchusersException {
		users users = fetchByPrimaryKey(primaryKey);

		if (users == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchusersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return users;
	}

	/**
	 * Returns the users with the primary key or throws a {@link NoSuchusersException} if it could not be found.
	 *
	 * @param Id the primary key of the users
	 * @return the users
	 * @throws NoSuchusersException if a users with the primary key could not be found
	 */
	@Override
	public users findByPrimaryKey(long Id) throws NoSuchusersException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the users with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the users
	 * @return the users, or <code>null</code> if a users with the primary key could not be found
	 */
	@Override
	public users fetchByPrimaryKey(Serializable primaryKey) {
		users users = (users)entityCache.getResult(usersModelImpl.ENTITY_CACHE_ENABLED,
				usersImpl.class, primaryKey);

		if (users == _nullusers) {
			return null;
		}

		if (users == null) {
			Session session = null;

			try {
				session = openSession();

				users = (users)session.get(usersImpl.class, primaryKey);

				if (users != null) {
					cacheResult(users);
				}
				else {
					entityCache.putResult(usersModelImpl.ENTITY_CACHE_ENABLED,
						usersImpl.class, primaryKey, _nullusers);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(usersModelImpl.ENTITY_CACHE_ENABLED,
					usersImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return users;
	}

	/**
	 * Returns the users with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the users
	 * @return the users, or <code>null</code> if a users with the primary key could not be found
	 */
	@Override
	public users fetchByPrimaryKey(long Id) {
		return fetchByPrimaryKey((Serializable)Id);
	}

	@Override
	public Map<Serializable, users> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, users> map = new HashMap<Serializable, users>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			users users = fetchByPrimaryKey(primaryKey);

			if (users != null) {
				map.put(primaryKey, users);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			users users = (users)entityCache.getResult(usersModelImpl.ENTITY_CACHE_ENABLED,
					usersImpl.class, primaryKey);

			if (users == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, users);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_USERS_WHERE_PKS_IN);

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

			for (users users : (List<users>)q.list()) {
				map.put(users.getPrimaryKeyObj(), users);

				cacheResult(users);

				uncachedPrimaryKeys.remove(users.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(usersModelImpl.ENTITY_CACHE_ENABLED,
					usersImpl.class, primaryKey, _nullusers);
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
	 * Returns all the userses.
	 *
	 * @return the userses
	 */
	@Override
	public List<users> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the userses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link usersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of userses
	 * @param end the upper bound of the range of userses (not inclusive)
	 * @return the range of userses
	 */
	@Override
	public List<users> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the userses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link usersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of userses
	 * @param end the upper bound of the range of userses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of userses
	 */
	@Override
	public List<users> findAll(int start, int end,
		OrderByComparator<users> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the userses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link usersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of userses
	 * @param end the upper bound of the range of userses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of userses
	 */
	@Override
	public List<users> findAll(int start, int end,
		OrderByComparator<users> orderByComparator, boolean retrieveFromCache) {
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

		List<users> list = null;

		if (retrieveFromCache) {
			list = (List<users>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_USERS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERS;

				if (pagination) {
					sql = sql.concat(usersModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<users>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<users>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the userses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (users users : findAll()) {
			remove(users);
		}
	}

	/**
	 * Returns the number of userses.
	 *
	 * @return the number of userses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_USERS);

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
		return usersModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the users persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(usersImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_USERS = "SELECT users FROM users users";
	private static final String _SQL_SELECT_USERS_WHERE_PKS_IN = "SELECT users FROM users users WHERE Id IN (";
	private static final String _SQL_COUNT_USERS = "SELECT COUNT(users) FROM users users";
	private static final String _ORDER_BY_ENTITY_ALIAS = "users.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No users exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(usersPersistenceImpl.class);
	private static final users _nullusers = new usersImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<users> toCacheModel() {
				return _nullusersCacheModel;
			}
		};

	private static final CacheModel<users> _nullusersCacheModel = new CacheModel<users>() {
			@Override
			public users toEntityModel() {
				return _nullusers;
			}
		};
}