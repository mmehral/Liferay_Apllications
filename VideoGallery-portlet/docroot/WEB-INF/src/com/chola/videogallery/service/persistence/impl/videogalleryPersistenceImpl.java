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

package com.chola.videogallery.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.videogallery.exception.NoSuchvideogalleryException;
import com.chola.videogallery.model.impl.videogalleryImpl;
import com.chola.videogallery.model.impl.videogalleryModelImpl;
import com.chola.videogallery.model.videogallery;
import com.chola.videogallery.service.persistence.videogalleryPersistence;

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
 * The persistence implementation for the videogallery service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see videogalleryPersistence
 * @see com.chola.videogallery.service.persistence.videogalleryUtil
 * @generated
 */
@ProviderType
public class videogalleryPersistenceImpl extends BasePersistenceImpl<videogallery>
	implements videogalleryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link videogalleryUtil} to access the videogallery persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = videogalleryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(videogalleryModelImpl.ENTITY_CACHE_ENABLED,
			videogalleryModelImpl.FINDER_CACHE_ENABLED, videogalleryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(videogalleryModelImpl.ENTITY_CACHE_ENABLED,
			videogalleryModelImpl.FINDER_CACHE_ENABLED, videogalleryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(videogalleryModelImpl.ENTITY_CACHE_ENABLED,
			videogalleryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public videogalleryPersistenceImpl() {
		setModelClass(videogallery.class);
	}

	/**
	 * Caches the videogallery in the entity cache if it is enabled.
	 *
	 * @param videogallery the videogallery
	 */
	@Override
	public void cacheResult(videogallery videogallery) {
		entityCache.putResult(videogalleryModelImpl.ENTITY_CACHE_ENABLED,
			videogalleryImpl.class, videogallery.getPrimaryKey(), videogallery);

		videogallery.resetOriginalValues();
	}

	/**
	 * Caches the videogalleries in the entity cache if it is enabled.
	 *
	 * @param videogalleries the videogalleries
	 */
	@Override
	public void cacheResult(List<videogallery> videogalleries) {
		for (videogallery videogallery : videogalleries) {
			if (entityCache.getResult(
						videogalleryModelImpl.ENTITY_CACHE_ENABLED,
						videogalleryImpl.class, videogallery.getPrimaryKey()) == null) {
				cacheResult(videogallery);
			}
			else {
				videogallery.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all videogalleries.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(videogalleryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the videogallery.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(videogallery videogallery) {
		entityCache.removeResult(videogalleryModelImpl.ENTITY_CACHE_ENABLED,
			videogalleryImpl.class, videogallery.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<videogallery> videogalleries) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (videogallery videogallery : videogalleries) {
			entityCache.removeResult(videogalleryModelImpl.ENTITY_CACHE_ENABLED,
				videogalleryImpl.class, videogallery.getPrimaryKey());
		}
	}

	/**
	 * Creates a new videogallery with the primary key. Does not add the videogallery to the database.
	 *
	 * @param id the primary key for the new videogallery
	 * @return the new videogallery
	 */
	@Override
	public videogallery create(long id) {
		videogallery videogallery = new videogalleryImpl();

		videogallery.setNew(true);
		videogallery.setPrimaryKey(id);

		return videogallery;
	}

	/**
	 * Removes the videogallery with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the videogallery
	 * @return the videogallery that was removed
	 * @throws NoSuchvideogalleryException if a videogallery with the primary key could not be found
	 */
	@Override
	public videogallery remove(long id) throws NoSuchvideogalleryException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the videogallery with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the videogallery
	 * @return the videogallery that was removed
	 * @throws NoSuchvideogalleryException if a videogallery with the primary key could not be found
	 */
	@Override
	public videogallery remove(Serializable primaryKey)
		throws NoSuchvideogalleryException {
		Session session = null;

		try {
			session = openSession();

			videogallery videogallery = (videogallery)session.get(videogalleryImpl.class,
					primaryKey);

			if (videogallery == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchvideogalleryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(videogallery);
		}
		catch (NoSuchvideogalleryException nsee) {
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
	protected videogallery removeImpl(videogallery videogallery) {
		videogallery = toUnwrappedModel(videogallery);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(videogallery)) {
				videogallery = (videogallery)session.get(videogalleryImpl.class,
						videogallery.getPrimaryKeyObj());
			}

			if (videogallery != null) {
				session.delete(videogallery);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (videogallery != null) {
			clearCache(videogallery);
		}

		return videogallery;
	}

	@Override
	public videogallery updateImpl(videogallery videogallery) {
		videogallery = toUnwrappedModel(videogallery);

		boolean isNew = videogallery.isNew();

		Session session = null;

		try {
			session = openSession();

			if (videogallery.isNew()) {
				session.save(videogallery);

				videogallery.setNew(false);
			}
			else {
				videogallery = (videogallery)session.merge(videogallery);
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

		entityCache.putResult(videogalleryModelImpl.ENTITY_CACHE_ENABLED,
			videogalleryImpl.class, videogallery.getPrimaryKey(), videogallery,
			false);

		videogallery.resetOriginalValues();

		return videogallery;
	}

	protected videogallery toUnwrappedModel(videogallery videogallery) {
		if (videogallery instanceof videogalleryImpl) {
			return videogallery;
		}

		videogalleryImpl videogalleryImpl = new videogalleryImpl();

		videogalleryImpl.setNew(videogallery.isNew());
		videogalleryImpl.setPrimaryKey(videogallery.getPrimaryKey());

		videogalleryImpl.setId(videogallery.getId());
		videogalleryImpl.setContent_id(videogallery.getContent_id());
		videogalleryImpl.setAlbumName(videogallery.getAlbumName());
		videogalleryImpl.setAlbumDesc(videogallery.getAlbumDesc());
		videogalleryImpl.setAlbumId(videogallery.getAlbumId());
		videogalleryImpl.setCreatedDate(videogallery.getCreatedDate());
		videogalleryImpl.setCreatedBy(videogallery.getCreatedBy());
		videogalleryImpl.setFlag(videogallery.getFlag());

		return videogalleryImpl;
	}

	/**
	 * Returns the videogallery with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the videogallery
	 * @return the videogallery
	 * @throws NoSuchvideogalleryException if a videogallery with the primary key could not be found
	 */
	@Override
	public videogallery findByPrimaryKey(Serializable primaryKey)
		throws NoSuchvideogalleryException {
		videogallery videogallery = fetchByPrimaryKey(primaryKey);

		if (videogallery == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchvideogalleryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return videogallery;
	}

	/**
	 * Returns the videogallery with the primary key or throws a {@link NoSuchvideogalleryException} if it could not be found.
	 *
	 * @param id the primary key of the videogallery
	 * @return the videogallery
	 * @throws NoSuchvideogalleryException if a videogallery with the primary key could not be found
	 */
	@Override
	public videogallery findByPrimaryKey(long id)
		throws NoSuchvideogalleryException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the videogallery with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the videogallery
	 * @return the videogallery, or <code>null</code> if a videogallery with the primary key could not be found
	 */
	@Override
	public videogallery fetchByPrimaryKey(Serializable primaryKey) {
		videogallery videogallery = (videogallery)entityCache.getResult(videogalleryModelImpl.ENTITY_CACHE_ENABLED,
				videogalleryImpl.class, primaryKey);

		if (videogallery == _nullvideogallery) {
			return null;
		}

		if (videogallery == null) {
			Session session = null;

			try {
				session = openSession();

				videogallery = (videogallery)session.get(videogalleryImpl.class,
						primaryKey);

				if (videogallery != null) {
					cacheResult(videogallery);
				}
				else {
					entityCache.putResult(videogalleryModelImpl.ENTITY_CACHE_ENABLED,
						videogalleryImpl.class, primaryKey, _nullvideogallery);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(videogalleryModelImpl.ENTITY_CACHE_ENABLED,
					videogalleryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return videogallery;
	}

	/**
	 * Returns the videogallery with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the videogallery
	 * @return the videogallery, or <code>null</code> if a videogallery with the primary key could not be found
	 */
	@Override
	public videogallery fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, videogallery> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, videogallery> map = new HashMap<Serializable, videogallery>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			videogallery videogallery = fetchByPrimaryKey(primaryKey);

			if (videogallery != null) {
				map.put(primaryKey, videogallery);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			videogallery videogallery = (videogallery)entityCache.getResult(videogalleryModelImpl.ENTITY_CACHE_ENABLED,
					videogalleryImpl.class, primaryKey);

			if (videogallery == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, videogallery);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_VIDEOGALLERY_WHERE_PKS_IN);

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

			for (videogallery videogallery : (List<videogallery>)q.list()) {
				map.put(videogallery.getPrimaryKeyObj(), videogallery);

				cacheResult(videogallery);

				uncachedPrimaryKeys.remove(videogallery.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(videogalleryModelImpl.ENTITY_CACHE_ENABLED,
					videogalleryImpl.class, primaryKey, _nullvideogallery);
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
	 * Returns all the videogalleries.
	 *
	 * @return the videogalleries
	 */
	@Override
	public List<videogallery> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the videogalleries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of videogalleries
	 * @param end the upper bound of the range of videogalleries (not inclusive)
	 * @return the range of videogalleries
	 */
	@Override
	public List<videogallery> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the videogalleries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of videogalleries
	 * @param end the upper bound of the range of videogalleries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of videogalleries
	 */
	@Override
	public List<videogallery> findAll(int start, int end,
		OrderByComparator<videogallery> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the videogalleries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of videogalleries
	 * @param end the upper bound of the range of videogalleries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of videogalleries
	 */
	@Override
	public List<videogallery> findAll(int start, int end,
		OrderByComparator<videogallery> orderByComparator,
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

		List<videogallery> list = null;

		if (retrieveFromCache) {
			list = (List<videogallery>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_VIDEOGALLERY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_VIDEOGALLERY;

				if (pagination) {
					sql = sql.concat(videogalleryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<videogallery>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<videogallery>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the videogalleries from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (videogallery videogallery : findAll()) {
			remove(videogallery);
		}
	}

	/**
	 * Returns the number of videogalleries.
	 *
	 * @return the number of videogalleries
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_VIDEOGALLERY);

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
		return videogalleryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the videogallery persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(videogalleryImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_VIDEOGALLERY = "SELECT videogallery FROM videogallery videogallery";
	private static final String _SQL_SELECT_VIDEOGALLERY_WHERE_PKS_IN = "SELECT videogallery FROM videogallery videogallery WHERE id_ IN (";
	private static final String _SQL_COUNT_VIDEOGALLERY = "SELECT COUNT(videogallery) FROM videogallery videogallery";
	private static final String _ORDER_BY_ENTITY_ALIAS = "videogallery.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No videogallery exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(videogalleryPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final videogallery _nullvideogallery = new videogalleryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<videogallery> toCacheModel() {
				return _nullvideogalleryCacheModel;
			}
		};

	private static final CacheModel<videogallery> _nullvideogalleryCacheModel = new CacheModel<videogallery>() {
			@Override
			public videogallery toEntityModel() {
				return _nullvideogallery;
			}
		};
}