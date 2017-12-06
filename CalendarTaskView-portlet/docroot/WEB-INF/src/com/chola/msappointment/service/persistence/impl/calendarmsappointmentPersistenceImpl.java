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

package com.chola.msappointment.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.msappointment.exception.NoSuchcalendarmsappointmentException;
import com.chola.msappointment.model.calendarmsappointment;
import com.chola.msappointment.model.impl.calendarmsappointmentImpl;
import com.chola.msappointment.model.impl.calendarmsappointmentModelImpl;
import com.chola.msappointment.service.persistence.calendarmsappointmentPersistence;

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
 * The persistence implementation for the calendarmsappointment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see calendarmsappointmentPersistence
 * @see com.chola.msappointment.service.persistence.calendarmsappointmentUtil
 * @generated
 */
@ProviderType
public class calendarmsappointmentPersistenceImpl extends BasePersistenceImpl<calendarmsappointment>
	implements calendarmsappointmentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link calendarmsappointmentUtil} to access the calendarmsappointment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = calendarmsappointmentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(calendarmsappointmentModelImpl.ENTITY_CACHE_ENABLED,
			calendarmsappointmentModelImpl.FINDER_CACHE_ENABLED,
			calendarmsappointmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(calendarmsappointmentModelImpl.ENTITY_CACHE_ENABLED,
			calendarmsappointmentModelImpl.FINDER_CACHE_ENABLED,
			calendarmsappointmentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(calendarmsappointmentModelImpl.ENTITY_CACHE_ENABLED,
			calendarmsappointmentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public calendarmsappointmentPersistenceImpl() {
		setModelClass(calendarmsappointment.class);
	}

	/**
	 * Caches the calendarmsappointment in the entity cache if it is enabled.
	 *
	 * @param calendarmsappointment the calendarmsappointment
	 */
	@Override
	public void cacheResult(calendarmsappointment calendarmsappointment) {
		entityCache.putResult(calendarmsappointmentModelImpl.ENTITY_CACHE_ENABLED,
			calendarmsappointmentImpl.class,
			calendarmsappointment.getPrimaryKey(), calendarmsappointment);

		calendarmsappointment.resetOriginalValues();
	}

	/**
	 * Caches the calendarmsappointments in the entity cache if it is enabled.
	 *
	 * @param calendarmsappointments the calendarmsappointments
	 */
	@Override
	public void cacheResult(List<calendarmsappointment> calendarmsappointments) {
		for (calendarmsappointment calendarmsappointment : calendarmsappointments) {
			if (entityCache.getResult(
						calendarmsappointmentModelImpl.ENTITY_CACHE_ENABLED,
						calendarmsappointmentImpl.class,
						calendarmsappointment.getPrimaryKey()) == null) {
				cacheResult(calendarmsappointment);
			}
			else {
				calendarmsappointment.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all calendarmsappointments.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(calendarmsappointmentImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the calendarmsappointment.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(calendarmsappointment calendarmsappointment) {
		entityCache.removeResult(calendarmsappointmentModelImpl.ENTITY_CACHE_ENABLED,
			calendarmsappointmentImpl.class,
			calendarmsappointment.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<calendarmsappointment> calendarmsappointments) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (calendarmsappointment calendarmsappointment : calendarmsappointments) {
			entityCache.removeResult(calendarmsappointmentModelImpl.ENTITY_CACHE_ENABLED,
				calendarmsappointmentImpl.class,
				calendarmsappointment.getPrimaryKey());
		}
	}

	/**
	 * Creates a new calendarmsappointment with the primary key. Does not add the calendarmsappointment to the database.
	 *
	 * @param id the primary key for the new calendarmsappointment
	 * @return the new calendarmsappointment
	 */
	@Override
	public calendarmsappointment create(long id) {
		calendarmsappointment calendarmsappointment = new calendarmsappointmentImpl();

		calendarmsappointment.setNew(true);
		calendarmsappointment.setPrimaryKey(id);

		return calendarmsappointment;
	}

	/**
	 * Removes the calendarmsappointment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the calendarmsappointment
	 * @return the calendarmsappointment that was removed
	 * @throws NoSuchcalendarmsappointmentException if a calendarmsappointment with the primary key could not be found
	 */
	@Override
	public calendarmsappointment remove(long id)
		throws NoSuchcalendarmsappointmentException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the calendarmsappointment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the calendarmsappointment
	 * @return the calendarmsappointment that was removed
	 * @throws NoSuchcalendarmsappointmentException if a calendarmsappointment with the primary key could not be found
	 */
	@Override
	public calendarmsappointment remove(Serializable primaryKey)
		throws NoSuchcalendarmsappointmentException {
		Session session = null;

		try {
			session = openSession();

			calendarmsappointment calendarmsappointment = (calendarmsappointment)session.get(calendarmsappointmentImpl.class,
					primaryKey);

			if (calendarmsappointment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcalendarmsappointmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(calendarmsappointment);
		}
		catch (NoSuchcalendarmsappointmentException nsee) {
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
	protected calendarmsappointment removeImpl(
		calendarmsappointment calendarmsappointment) {
		calendarmsappointment = toUnwrappedModel(calendarmsappointment);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(calendarmsappointment)) {
				calendarmsappointment = (calendarmsappointment)session.get(calendarmsappointmentImpl.class,
						calendarmsappointment.getPrimaryKeyObj());
			}

			if (calendarmsappointment != null) {
				session.delete(calendarmsappointment);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (calendarmsappointment != null) {
			clearCache(calendarmsappointment);
		}

		return calendarmsappointment;
	}

	@Override
	public calendarmsappointment updateImpl(
		calendarmsappointment calendarmsappointment) {
		calendarmsappointment = toUnwrappedModel(calendarmsappointment);

		boolean isNew = calendarmsappointment.isNew();

		Session session = null;

		try {
			session = openSession();

			if (calendarmsappointment.isNew()) {
				session.save(calendarmsappointment);

				calendarmsappointment.setNew(false);
			}
			else {
				calendarmsappointment = (calendarmsappointment)session.merge(calendarmsappointment);
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

		entityCache.putResult(calendarmsappointmentModelImpl.ENTITY_CACHE_ENABLED,
			calendarmsappointmentImpl.class,
			calendarmsappointment.getPrimaryKey(), calendarmsappointment, false);

		calendarmsappointment.resetOriginalValues();

		return calendarmsappointment;
	}

	protected calendarmsappointment toUnwrappedModel(
		calendarmsappointment calendarmsappointment) {
		if (calendarmsappointment instanceof calendarmsappointmentImpl) {
			return calendarmsappointment;
		}

		calendarmsappointmentImpl calendarmsappointmentImpl = new calendarmsappointmentImpl();

		calendarmsappointmentImpl.setNew(calendarmsappointment.isNew());
		calendarmsappointmentImpl.setPrimaryKey(calendarmsappointment.getPrimaryKey());

		calendarmsappointmentImpl.setId(calendarmsappointment.getId());

		return calendarmsappointmentImpl;
	}

	/**
	 * Returns the calendarmsappointment with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the calendarmsappointment
	 * @return the calendarmsappointment
	 * @throws NoSuchcalendarmsappointmentException if a calendarmsappointment with the primary key could not be found
	 */
	@Override
	public calendarmsappointment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchcalendarmsappointmentException {
		calendarmsappointment calendarmsappointment = fetchByPrimaryKey(primaryKey);

		if (calendarmsappointment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcalendarmsappointmentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return calendarmsappointment;
	}

	/**
	 * Returns the calendarmsappointment with the primary key or throws a {@link NoSuchcalendarmsappointmentException} if it could not be found.
	 *
	 * @param id the primary key of the calendarmsappointment
	 * @return the calendarmsappointment
	 * @throws NoSuchcalendarmsappointmentException if a calendarmsappointment with the primary key could not be found
	 */
	@Override
	public calendarmsappointment findByPrimaryKey(long id)
		throws NoSuchcalendarmsappointmentException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the calendarmsappointment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the calendarmsappointment
	 * @return the calendarmsappointment, or <code>null</code> if a calendarmsappointment with the primary key could not be found
	 */
	@Override
	public calendarmsappointment fetchByPrimaryKey(Serializable primaryKey) {
		calendarmsappointment calendarmsappointment = (calendarmsappointment)entityCache.getResult(calendarmsappointmentModelImpl.ENTITY_CACHE_ENABLED,
				calendarmsappointmentImpl.class, primaryKey);

		if (calendarmsappointment == _nullcalendarmsappointment) {
			return null;
		}

		if (calendarmsappointment == null) {
			Session session = null;

			try {
				session = openSession();

				calendarmsappointment = (calendarmsappointment)session.get(calendarmsappointmentImpl.class,
						primaryKey);

				if (calendarmsappointment != null) {
					cacheResult(calendarmsappointment);
				}
				else {
					entityCache.putResult(calendarmsappointmentModelImpl.ENTITY_CACHE_ENABLED,
						calendarmsappointmentImpl.class, primaryKey,
						_nullcalendarmsappointment);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(calendarmsappointmentModelImpl.ENTITY_CACHE_ENABLED,
					calendarmsappointmentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return calendarmsappointment;
	}

	/**
	 * Returns the calendarmsappointment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the calendarmsappointment
	 * @return the calendarmsappointment, or <code>null</code> if a calendarmsappointment with the primary key could not be found
	 */
	@Override
	public calendarmsappointment fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, calendarmsappointment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, calendarmsappointment> map = new HashMap<Serializable, calendarmsappointment>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			calendarmsappointment calendarmsappointment = fetchByPrimaryKey(primaryKey);

			if (calendarmsappointment != null) {
				map.put(primaryKey, calendarmsappointment);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			calendarmsappointment calendarmsappointment = (calendarmsappointment)entityCache.getResult(calendarmsappointmentModelImpl.ENTITY_CACHE_ENABLED,
					calendarmsappointmentImpl.class, primaryKey);

			if (calendarmsappointment == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, calendarmsappointment);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CALENDARMSAPPOINTMENT_WHERE_PKS_IN);

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

			for (calendarmsappointment calendarmsappointment : (List<calendarmsappointment>)q.list()) {
				map.put(calendarmsappointment.getPrimaryKeyObj(),
					calendarmsappointment);

				cacheResult(calendarmsappointment);

				uncachedPrimaryKeys.remove(calendarmsappointment.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(calendarmsappointmentModelImpl.ENTITY_CACHE_ENABLED,
					calendarmsappointmentImpl.class, primaryKey,
					_nullcalendarmsappointment);
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
	 * Returns all the calendarmsappointments.
	 *
	 * @return the calendarmsappointments
	 */
	@Override
	public List<calendarmsappointment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the calendarmsappointments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link calendarmsappointmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of calendarmsappointments
	 * @param end the upper bound of the range of calendarmsappointments (not inclusive)
	 * @return the range of calendarmsappointments
	 */
	@Override
	public List<calendarmsappointment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the calendarmsappointments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link calendarmsappointmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of calendarmsappointments
	 * @param end the upper bound of the range of calendarmsappointments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of calendarmsappointments
	 */
	@Override
	public List<calendarmsappointment> findAll(int start, int end,
		OrderByComparator<calendarmsappointment> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the calendarmsappointments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link calendarmsappointmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of calendarmsappointments
	 * @param end the upper bound of the range of calendarmsappointments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of calendarmsappointments
	 */
	@Override
	public List<calendarmsappointment> findAll(int start, int end,
		OrderByComparator<calendarmsappointment> orderByComparator,
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

		List<calendarmsappointment> list = null;

		if (retrieveFromCache) {
			list = (List<calendarmsappointment>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CALENDARMSAPPOINTMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CALENDARMSAPPOINTMENT;

				if (pagination) {
					sql = sql.concat(calendarmsappointmentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<calendarmsappointment>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<calendarmsappointment>)QueryUtil.list(q,
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
	 * Removes all the calendarmsappointments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (calendarmsappointment calendarmsappointment : findAll()) {
			remove(calendarmsappointment);
		}
	}

	/**
	 * Returns the number of calendarmsappointments.
	 *
	 * @return the number of calendarmsappointments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CALENDARMSAPPOINTMENT);

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
		return calendarmsappointmentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the calendarmsappointment persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(calendarmsappointmentImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_CALENDARMSAPPOINTMENT = "SELECT calendarmsappointment FROM calendarmsappointment calendarmsappointment";
	private static final String _SQL_SELECT_CALENDARMSAPPOINTMENT_WHERE_PKS_IN = "SELECT calendarmsappointment FROM calendarmsappointment calendarmsappointment WHERE id_ IN (";
	private static final String _SQL_COUNT_CALENDARMSAPPOINTMENT = "SELECT COUNT(calendarmsappointment) FROM calendarmsappointment calendarmsappointment";
	private static final String _ORDER_BY_ENTITY_ALIAS = "calendarmsappointment.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No calendarmsappointment exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(calendarmsappointmentPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final calendarmsappointment _nullcalendarmsappointment = new calendarmsappointmentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<calendarmsappointment> toCacheModel() {
				return _nullcalendarmsappointmentCacheModel;
			}
		};

	private static final CacheModel<calendarmsappointment> _nullcalendarmsappointmentCacheModel =
		new CacheModel<calendarmsappointment>() {
			@Override
			public calendarmsappointment toEntityModel() {
				return _nullcalendarmsappointment;
			}
		};
}