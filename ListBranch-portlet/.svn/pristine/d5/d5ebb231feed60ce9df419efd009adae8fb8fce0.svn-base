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

import com.chola.listbranch.exception.NoSuchstateException;
import com.chola.listbranch.model.impl.stateImpl;
import com.chola.listbranch.model.impl.stateModelImpl;
import com.chola.listbranch.model.state;
import com.chola.listbranch.service.persistence.statePersistence;

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
 * The persistence implementation for the state service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see statePersistence
 * @see com.chola.listbranch.service.persistence.stateUtil
 * @generated
 */
@ProviderType
public class statePersistenceImpl extends BasePersistenceImpl<state>
	implements statePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link stateUtil} to access the state persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = stateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(stateModelImpl.ENTITY_CACHE_ENABLED,
			stateModelImpl.FINDER_CACHE_ENABLED, stateImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(stateModelImpl.ENTITY_CACHE_ENABLED,
			stateModelImpl.FINDER_CACHE_ENABLED, stateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(stateModelImpl.ENTITY_CACHE_ENABLED,
			stateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public statePersistenceImpl() {
		setModelClass(state.class);
	}

	/**
	 * Caches the state in the entity cache if it is enabled.
	 *
	 * @param state the state
	 */
	@Override
	public void cacheResult(state state) {
		entityCache.putResult(stateModelImpl.ENTITY_CACHE_ENABLED,
			stateImpl.class, state.getPrimaryKey(), state);

		state.resetOriginalValues();
	}

	/**
	 * Caches the states in the entity cache if it is enabled.
	 *
	 * @param states the states
	 */
	@Override
	public void cacheResult(List<state> states) {
		for (state state : states) {
			if (entityCache.getResult(stateModelImpl.ENTITY_CACHE_ENABLED,
						stateImpl.class, state.getPrimaryKey()) == null) {
				cacheResult(state);
			}
			else {
				state.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all states.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(stateImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the state.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(state state) {
		entityCache.removeResult(stateModelImpl.ENTITY_CACHE_ENABLED,
			stateImpl.class, state.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<state> states) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (state state : states) {
			entityCache.removeResult(stateModelImpl.ENTITY_CACHE_ENABLED,
				stateImpl.class, state.getPrimaryKey());
		}
	}

	/**
	 * Creates a new state with the primary key. Does not add the state to the database.
	 *
	 * @param state_id the primary key for the new state
	 * @return the new state
	 */
	@Override
	public state create(long state_id) {
		state state = new stateImpl();

		state.setNew(true);
		state.setPrimaryKey(state_id);

		return state;
	}

	/**
	 * Removes the state with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param state_id the primary key of the state
	 * @return the state that was removed
	 * @throws NoSuchstateException if a state with the primary key could not be found
	 */
	@Override
	public state remove(long state_id) throws NoSuchstateException {
		return remove((Serializable)state_id);
	}

	/**
	 * Removes the state with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the state
	 * @return the state that was removed
	 * @throws NoSuchstateException if a state with the primary key could not be found
	 */
	@Override
	public state remove(Serializable primaryKey) throws NoSuchstateException {
		Session session = null;

		try {
			session = openSession();

			state state = (state)session.get(stateImpl.class, primaryKey);

			if (state == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchstateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(state);
		}
		catch (NoSuchstateException nsee) {
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
	protected state removeImpl(state state) {
		state = toUnwrappedModel(state);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(state)) {
				state = (state)session.get(stateImpl.class,
						state.getPrimaryKeyObj());
			}

			if (state != null) {
				session.delete(state);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (state != null) {
			clearCache(state);
		}

		return state;
	}

	@Override
	public state updateImpl(state state) {
		state = toUnwrappedModel(state);

		boolean isNew = state.isNew();

		Session session = null;

		try {
			session = openSession();

			if (state.isNew()) {
				session.save(state);

				state.setNew(false);
			}
			else {
				state = (state)session.merge(state);
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

		entityCache.putResult(stateModelImpl.ENTITY_CACHE_ENABLED,
			stateImpl.class, state.getPrimaryKey(), state, false);

		state.resetOriginalValues();

		return state;
	}

	protected state toUnwrappedModel(state state) {
		if (state instanceof stateImpl) {
			return state;
		}

		stateImpl stateImpl = new stateImpl();

		stateImpl.setNew(state.isNew());
		stateImpl.setPrimaryKey(state.getPrimaryKey());

		stateImpl.setState_id(state.getState_id());
		stateImpl.setState_name(state.getState_name());

		return stateImpl;
	}

	/**
	 * Returns the state with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the state
	 * @return the state
	 * @throws NoSuchstateException if a state with the primary key could not be found
	 */
	@Override
	public state findByPrimaryKey(Serializable primaryKey)
		throws NoSuchstateException {
		state state = fetchByPrimaryKey(primaryKey);

		if (state == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchstateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return state;
	}

	/**
	 * Returns the state with the primary key or throws a {@link NoSuchstateException} if it could not be found.
	 *
	 * @param state_id the primary key of the state
	 * @return the state
	 * @throws NoSuchstateException if a state with the primary key could not be found
	 */
	@Override
	public state findByPrimaryKey(long state_id) throws NoSuchstateException {
		return findByPrimaryKey((Serializable)state_id);
	}

	/**
	 * Returns the state with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the state
	 * @return the state, or <code>null</code> if a state with the primary key could not be found
	 */
	@Override
	public state fetchByPrimaryKey(Serializable primaryKey) {
		state state = (state)entityCache.getResult(stateModelImpl.ENTITY_CACHE_ENABLED,
				stateImpl.class, primaryKey);

		if (state == _nullstate) {
			return null;
		}

		if (state == null) {
			Session session = null;

			try {
				session = openSession();

				state = (state)session.get(stateImpl.class, primaryKey);

				if (state != null) {
					cacheResult(state);
				}
				else {
					entityCache.putResult(stateModelImpl.ENTITY_CACHE_ENABLED,
						stateImpl.class, primaryKey, _nullstate);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(stateModelImpl.ENTITY_CACHE_ENABLED,
					stateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return state;
	}

	/**
	 * Returns the state with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param state_id the primary key of the state
	 * @return the state, or <code>null</code> if a state with the primary key could not be found
	 */
	@Override
	public state fetchByPrimaryKey(long state_id) {
		return fetchByPrimaryKey((Serializable)state_id);
	}

	@Override
	public Map<Serializable, state> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, state> map = new HashMap<Serializable, state>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			state state = fetchByPrimaryKey(primaryKey);

			if (state != null) {
				map.put(primaryKey, state);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			state state = (state)entityCache.getResult(stateModelImpl.ENTITY_CACHE_ENABLED,
					stateImpl.class, primaryKey);

			if (state == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, state);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_STATE_WHERE_PKS_IN);

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

			for (state state : (List<state>)q.list()) {
				map.put(state.getPrimaryKeyObj(), state);

				cacheResult(state);

				uncachedPrimaryKeys.remove(state.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(stateModelImpl.ENTITY_CACHE_ENABLED,
					stateImpl.class, primaryKey, _nullstate);
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
	 * Returns all the states.
	 *
	 * @return the states
	 */
	@Override
	public List<state> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the states.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link stateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of states
	 * @param end the upper bound of the range of states (not inclusive)
	 * @return the range of states
	 */
	@Override
	public List<state> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the states.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link stateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of states
	 * @param end the upper bound of the range of states (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of states
	 */
	@Override
	public List<state> findAll(int start, int end,
		OrderByComparator<state> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the states.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link stateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of states
	 * @param end the upper bound of the range of states (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of states
	 */
	@Override
	public List<state> findAll(int start, int end,
		OrderByComparator<state> orderByComparator, boolean retrieveFromCache) {
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

		List<state> list = null;

		if (retrieveFromCache) {
			list = (List<state>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_STATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STATE;

				if (pagination) {
					sql = sql.concat(stateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<state>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<state>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the states from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (state state : findAll()) {
			remove(state);
		}
	}

	/**
	 * Returns the number of states.
	 *
	 * @return the number of states
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_STATE);

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
		return stateModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the state persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(stateImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_STATE = "SELECT state FROM state state";
	private static final String _SQL_SELECT_STATE_WHERE_PKS_IN = "SELECT state FROM state state WHERE state_id IN (";
	private static final String _SQL_COUNT_STATE = "SELECT COUNT(state) FROM state state";
	private static final String _ORDER_BY_ENTITY_ALIAS = "state.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No state exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(statePersistenceImpl.class);
	private static final state _nullstate = new stateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<state> toCacheModel() {
				return _nullstateCacheModel;
			}
		};

	private static final CacheModel<state> _nullstateCacheModel = new CacheModel<state>() {
			@Override
			public state toEntityModel() {
				return _nullstate;
			}
		};
}