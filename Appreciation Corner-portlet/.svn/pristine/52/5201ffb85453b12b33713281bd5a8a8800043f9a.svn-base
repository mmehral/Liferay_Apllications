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

package com.chola.app.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.app.exception.NoSuchrepliedException;
import com.chola.app.model.impl.repliedImpl;
import com.chola.app.model.impl.repliedModelImpl;
import com.chola.app.model.replied;
import com.chola.app.service.persistence.repliedPersistence;

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
 * The persistence implementation for the replied service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see repliedPersistence
 * @see com.chola.app.service.persistence.repliedUtil
 * @generated
 */
@ProviderType
public class repliedPersistenceImpl extends BasePersistenceImpl<replied>
	implements repliedPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link repliedUtil} to access the replied persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = repliedImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(repliedModelImpl.ENTITY_CACHE_ENABLED,
			repliedModelImpl.FINDER_CACHE_ENABLED, repliedImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(repliedModelImpl.ENTITY_CACHE_ENABLED,
			repliedModelImpl.FINDER_CACHE_ENABLED, repliedImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(repliedModelImpl.ENTITY_CACHE_ENABLED,
			repliedModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public repliedPersistenceImpl() {
		setModelClass(replied.class);
	}

	/**
	 * Caches the replied in the entity cache if it is enabled.
	 *
	 * @param replied the replied
	 */
	@Override
	public void cacheResult(replied replied) {
		entityCache.putResult(repliedModelImpl.ENTITY_CACHE_ENABLED,
			repliedImpl.class, replied.getPrimaryKey(), replied);

		replied.resetOriginalValues();
	}

	/**
	 * Caches the replieds in the entity cache if it is enabled.
	 *
	 * @param replieds the replieds
	 */
	@Override
	public void cacheResult(List<replied> replieds) {
		for (replied replied : replieds) {
			if (entityCache.getResult(repliedModelImpl.ENTITY_CACHE_ENABLED,
						repliedImpl.class, replied.getPrimaryKey()) == null) {
				cacheResult(replied);
			}
			else {
				replied.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all replieds.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(repliedImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the replied.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(replied replied) {
		entityCache.removeResult(repliedModelImpl.ENTITY_CACHE_ENABLED,
			repliedImpl.class, replied.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<replied> replieds) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (replied replied : replieds) {
			entityCache.removeResult(repliedModelImpl.ENTITY_CACHE_ENABLED,
				repliedImpl.class, replied.getPrimaryKey());
		}
	}

	/**
	 * Creates a new replied with the primary key. Does not add the replied to the database.
	 *
	 * @param id the primary key for the new replied
	 * @return the new replied
	 */
	@Override
	public replied create(long id) {
		replied replied = new repliedImpl();

		replied.setNew(true);
		replied.setPrimaryKey(id);

		return replied;
	}

	/**
	 * Removes the replied with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the replied
	 * @return the replied that was removed
	 * @throws NoSuchrepliedException if a replied with the primary key could not be found
	 */
	@Override
	public replied remove(long id) throws NoSuchrepliedException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the replied with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the replied
	 * @return the replied that was removed
	 * @throws NoSuchrepliedException if a replied with the primary key could not be found
	 */
	@Override
	public replied remove(Serializable primaryKey)
		throws NoSuchrepliedException {
		Session session = null;

		try {
			session = openSession();

			replied replied = (replied)session.get(repliedImpl.class, primaryKey);

			if (replied == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchrepliedException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(replied);
		}
		catch (NoSuchrepliedException nsee) {
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
	protected replied removeImpl(replied replied) {
		replied = toUnwrappedModel(replied);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(replied)) {
				replied = (replied)session.get(repliedImpl.class,
						replied.getPrimaryKeyObj());
			}

			if (replied != null) {
				session.delete(replied);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (replied != null) {
			clearCache(replied);
		}

		return replied;
	}

	@Override
	public replied updateImpl(replied replied) {
		replied = toUnwrappedModel(replied);

		boolean isNew = replied.isNew();

		Session session = null;

		try {
			session = openSession();

			if (replied.isNew()) {
				session.save(replied);

				replied.setNew(false);
			}
			else {
				replied = (replied)session.merge(replied);
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

		entityCache.putResult(repliedModelImpl.ENTITY_CACHE_ENABLED,
			repliedImpl.class, replied.getPrimaryKey(), replied, false);

		replied.resetOriginalValues();

		return replied;
	}

	protected replied toUnwrappedModel(replied replied) {
		if (replied instanceof repliedImpl) {
			return replied;
		}

		repliedImpl repliedImpl = new repliedImpl();

		repliedImpl.setNew(replied.isNew());
		repliedImpl.setPrimaryKey(replied.getPrimaryKey());

		repliedImpl.setId(replied.getId());
		repliedImpl.setRepliedOnPost(replied.getRepliedOnPost());
		repliedImpl.setRepliedTo(replied.getRepliedTo());
		repliedImpl.setRepliedBy(replied.getRepliedBy());
		repliedImpl.setRepliedMessage(replied.getRepliedMessage());
		repliedImpl.setRepliedDate(replied.getRepliedDate());

		return repliedImpl;
	}

	/**
	 * Returns the replied with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the replied
	 * @return the replied
	 * @throws NoSuchrepliedException if a replied with the primary key could not be found
	 */
	@Override
	public replied findByPrimaryKey(Serializable primaryKey)
		throws NoSuchrepliedException {
		replied replied = fetchByPrimaryKey(primaryKey);

		if (replied == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchrepliedException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return replied;
	}

	/**
	 * Returns the replied with the primary key or throws a {@link NoSuchrepliedException} if it could not be found.
	 *
	 * @param id the primary key of the replied
	 * @return the replied
	 * @throws NoSuchrepliedException if a replied with the primary key could not be found
	 */
	@Override
	public replied findByPrimaryKey(long id) throws NoSuchrepliedException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the replied with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the replied
	 * @return the replied, or <code>null</code> if a replied with the primary key could not be found
	 */
	@Override
	public replied fetchByPrimaryKey(Serializable primaryKey) {
		replied replied = (replied)entityCache.getResult(repliedModelImpl.ENTITY_CACHE_ENABLED,
				repliedImpl.class, primaryKey);

		if (replied == _nullreplied) {
			return null;
		}

		if (replied == null) {
			Session session = null;

			try {
				session = openSession();

				replied = (replied)session.get(repliedImpl.class, primaryKey);

				if (replied != null) {
					cacheResult(replied);
				}
				else {
					entityCache.putResult(repliedModelImpl.ENTITY_CACHE_ENABLED,
						repliedImpl.class, primaryKey, _nullreplied);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(repliedModelImpl.ENTITY_CACHE_ENABLED,
					repliedImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return replied;
	}

	/**
	 * Returns the replied with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the replied
	 * @return the replied, or <code>null</code> if a replied with the primary key could not be found
	 */
	@Override
	public replied fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, replied> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, replied> map = new HashMap<Serializable, replied>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			replied replied = fetchByPrimaryKey(primaryKey);

			if (replied != null) {
				map.put(primaryKey, replied);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			replied replied = (replied)entityCache.getResult(repliedModelImpl.ENTITY_CACHE_ENABLED,
					repliedImpl.class, primaryKey);

			if (replied == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, replied);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_REPLIED_WHERE_PKS_IN);

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

			for (replied replied : (List<replied>)q.list()) {
				map.put(replied.getPrimaryKeyObj(), replied);

				cacheResult(replied);

				uncachedPrimaryKeys.remove(replied.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(repliedModelImpl.ENTITY_CACHE_ENABLED,
					repliedImpl.class, primaryKey, _nullreplied);
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
	 * Returns all the replieds.
	 *
	 * @return the replieds
	 */
	@Override
	public List<replied> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the replieds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of replieds
	 * @param end the upper bound of the range of replieds (not inclusive)
	 * @return the range of replieds
	 */
	@Override
	public List<replied> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the replieds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of replieds
	 * @param end the upper bound of the range of replieds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of replieds
	 */
	@Override
	public List<replied> findAll(int start, int end,
		OrderByComparator<replied> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the replieds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of replieds
	 * @param end the upper bound of the range of replieds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of replieds
	 */
	@Override
	public List<replied> findAll(int start, int end,
		OrderByComparator<replied> orderByComparator, boolean retrieveFromCache) {
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

		List<replied> list = null;

		if (retrieveFromCache) {
			list = (List<replied>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_REPLIED);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REPLIED;

				if (pagination) {
					sql = sql.concat(repliedModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<replied>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<replied>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the replieds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (replied replied : findAll()) {
			remove(replied);
		}
	}

	/**
	 * Returns the number of replieds.
	 *
	 * @return the number of replieds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_REPLIED);

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
		return repliedModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the replied persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(repliedImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_REPLIED = "SELECT replied FROM replied replied";
	private static final String _SQL_SELECT_REPLIED_WHERE_PKS_IN = "SELECT replied FROM replied replied WHERE id_ IN (";
	private static final String _SQL_COUNT_REPLIED = "SELECT COUNT(replied) FROM replied replied";
	private static final String _ORDER_BY_ENTITY_ALIAS = "replied.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No replied exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(repliedPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final replied _nullreplied = new repliedImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<replied> toCacheModel() {
				return _nullrepliedCacheModel;
			}
		};

	private static final CacheModel<replied> _nullrepliedCacheModel = new CacheModel<replied>() {
			@Override
			public replied toEntityModel() {
				return _nullreplied;
			}
		};
}