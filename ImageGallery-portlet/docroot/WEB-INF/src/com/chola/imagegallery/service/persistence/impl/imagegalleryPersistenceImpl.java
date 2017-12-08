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

package com.chola.imagegallery.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.imagegallery.exception.NoSuchimagegalleryException;
import com.chola.imagegallery.model.imagegallery;
import com.chola.imagegallery.model.impl.imagegalleryImpl;
import com.chola.imagegallery.model.impl.imagegalleryModelImpl;
import com.chola.imagegallery.service.persistence.imagegalleryPersistence;

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
 * The persistence implementation for the imagegallery service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see imagegalleryPersistence
 * @see com.chola.imagegallery.service.persistence.imagegalleryUtil
 * @generated
 */
@ProviderType
public class imagegalleryPersistenceImpl extends BasePersistenceImpl<imagegallery>
	implements imagegalleryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link imagegalleryUtil} to access the imagegallery persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = imagegalleryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(imagegalleryModelImpl.ENTITY_CACHE_ENABLED,
			imagegalleryModelImpl.FINDER_CACHE_ENABLED, imagegalleryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(imagegalleryModelImpl.ENTITY_CACHE_ENABLED,
			imagegalleryModelImpl.FINDER_CACHE_ENABLED, imagegalleryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(imagegalleryModelImpl.ENTITY_CACHE_ENABLED,
			imagegalleryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public imagegalleryPersistenceImpl() {
		setModelClass(imagegallery.class);
	}

	/**
	 * Caches the imagegallery in the entity cache if it is enabled.
	 *
	 * @param imagegallery the imagegallery
	 */
	@Override
	public void cacheResult(imagegallery imagegallery) {
		entityCache.putResult(imagegalleryModelImpl.ENTITY_CACHE_ENABLED,
			imagegalleryImpl.class, imagegallery.getPrimaryKey(), imagegallery);

		imagegallery.resetOriginalValues();
	}

	/**
	 * Caches the imagegalleries in the entity cache if it is enabled.
	 *
	 * @param imagegalleries the imagegalleries
	 */
	@Override
	public void cacheResult(List<imagegallery> imagegalleries) {
		for (imagegallery imagegallery : imagegalleries) {
			if (entityCache.getResult(
						imagegalleryModelImpl.ENTITY_CACHE_ENABLED,
						imagegalleryImpl.class, imagegallery.getPrimaryKey()) == null) {
				cacheResult(imagegallery);
			}
			else {
				imagegallery.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all imagegalleries.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(imagegalleryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the imagegallery.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(imagegallery imagegallery) {
		entityCache.removeResult(imagegalleryModelImpl.ENTITY_CACHE_ENABLED,
			imagegalleryImpl.class, imagegallery.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<imagegallery> imagegalleries) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (imagegallery imagegallery : imagegalleries) {
			entityCache.removeResult(imagegalleryModelImpl.ENTITY_CACHE_ENABLED,
				imagegalleryImpl.class, imagegallery.getPrimaryKey());
		}
	}

	/**
	 * Creates a new imagegallery with the primary key. Does not add the imagegallery to the database.
	 *
	 * @param id the primary key for the new imagegallery
	 * @return the new imagegallery
	 */
	@Override
	public imagegallery create(long id) {
		imagegallery imagegallery = new imagegalleryImpl();

		imagegallery.setNew(true);
		imagegallery.setPrimaryKey(id);

		return imagegallery;
	}

	/**
	 * Removes the imagegallery with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the imagegallery
	 * @return the imagegallery that was removed
	 * @throws NoSuchimagegalleryException if a imagegallery with the primary key could not be found
	 */
	@Override
	public imagegallery remove(long id) throws NoSuchimagegalleryException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the imagegallery with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the imagegallery
	 * @return the imagegallery that was removed
	 * @throws NoSuchimagegalleryException if a imagegallery with the primary key could not be found
	 */
	@Override
	public imagegallery remove(Serializable primaryKey)
		throws NoSuchimagegalleryException {
		Session session = null;

		try {
			session = openSession();

			imagegallery imagegallery = (imagegallery)session.get(imagegalleryImpl.class,
					primaryKey);

			if (imagegallery == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchimagegalleryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(imagegallery);
		}
		catch (NoSuchimagegalleryException nsee) {
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
	protected imagegallery removeImpl(imagegallery imagegallery) {
		imagegallery = toUnwrappedModel(imagegallery);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(imagegallery)) {
				imagegallery = (imagegallery)session.get(imagegalleryImpl.class,
						imagegallery.getPrimaryKeyObj());
			}

			if (imagegallery != null) {
				session.delete(imagegallery);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (imagegallery != null) {
			clearCache(imagegallery);
		}

		return imagegallery;
	}

	@Override
	public imagegallery updateImpl(imagegallery imagegallery) {
		imagegallery = toUnwrappedModel(imagegallery);

		boolean isNew = imagegallery.isNew();

		Session session = null;

		try {
			session = openSession();

			if (imagegallery.isNew()) {
				session.save(imagegallery);

				imagegallery.setNew(false);
			}
			else {
				imagegallery = (imagegallery)session.merge(imagegallery);
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

		entityCache.putResult(imagegalleryModelImpl.ENTITY_CACHE_ENABLED,
			imagegalleryImpl.class, imagegallery.getPrimaryKey(), imagegallery,
			false);

		imagegallery.resetOriginalValues();

		return imagegallery;
	}

	protected imagegallery toUnwrappedModel(imagegallery imagegallery) {
		if (imagegallery instanceof imagegalleryImpl) {
			return imagegallery;
		}

		imagegalleryImpl imagegalleryImpl = new imagegalleryImpl();

		imagegalleryImpl.setNew(imagegallery.isNew());
		imagegalleryImpl.setPrimaryKey(imagegallery.getPrimaryKey());

		imagegalleryImpl.setId(imagegallery.getId());
		imagegalleryImpl.setContent_id(imagegallery.getContent_id());
		imagegalleryImpl.setAlbumName(imagegallery.getAlbumName());
		imagegalleryImpl.setAlbumDesc(imagegallery.getAlbumDesc());
		imagegalleryImpl.setAlbumId(imagegallery.getAlbumId());
		imagegalleryImpl.setCreatedDate(imagegallery.getCreatedDate());
		imagegalleryImpl.setCreatedBy(imagegallery.getCreatedBy());
		imagegalleryImpl.setFlag(imagegallery.getFlag());

		return imagegalleryImpl;
	}

	/**
	 * Returns the imagegallery with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the imagegallery
	 * @return the imagegallery
	 * @throws NoSuchimagegalleryException if a imagegallery with the primary key could not be found
	 */
	@Override
	public imagegallery findByPrimaryKey(Serializable primaryKey)
		throws NoSuchimagegalleryException {
		imagegallery imagegallery = fetchByPrimaryKey(primaryKey);

		if (imagegallery == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchimagegalleryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return imagegallery;
	}

	/**
	 * Returns the imagegallery with the primary key or throws a {@link NoSuchimagegalleryException} if it could not be found.
	 *
	 * @param id the primary key of the imagegallery
	 * @return the imagegallery
	 * @throws NoSuchimagegalleryException if a imagegallery with the primary key could not be found
	 */
	@Override
	public imagegallery findByPrimaryKey(long id)
		throws NoSuchimagegalleryException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the imagegallery with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the imagegallery
	 * @return the imagegallery, or <code>null</code> if a imagegallery with the primary key could not be found
	 */
	@Override
	public imagegallery fetchByPrimaryKey(Serializable primaryKey) {
		imagegallery imagegallery = (imagegallery)entityCache.getResult(imagegalleryModelImpl.ENTITY_CACHE_ENABLED,
				imagegalleryImpl.class, primaryKey);

		if (imagegallery == _nullimagegallery) {
			return null;
		}

		if (imagegallery == null) {
			Session session = null;

			try {
				session = openSession();

				imagegallery = (imagegallery)session.get(imagegalleryImpl.class,
						primaryKey);

				if (imagegallery != null) {
					cacheResult(imagegallery);
				}
				else {
					entityCache.putResult(imagegalleryModelImpl.ENTITY_CACHE_ENABLED,
						imagegalleryImpl.class, primaryKey, _nullimagegallery);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(imagegalleryModelImpl.ENTITY_CACHE_ENABLED,
					imagegalleryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return imagegallery;
	}

	/**
	 * Returns the imagegallery with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the imagegallery
	 * @return the imagegallery, or <code>null</code> if a imagegallery with the primary key could not be found
	 */
	@Override
	public imagegallery fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, imagegallery> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, imagegallery> map = new HashMap<Serializable, imagegallery>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			imagegallery imagegallery = fetchByPrimaryKey(primaryKey);

			if (imagegallery != null) {
				map.put(primaryKey, imagegallery);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			imagegallery imagegallery = (imagegallery)entityCache.getResult(imagegalleryModelImpl.ENTITY_CACHE_ENABLED,
					imagegalleryImpl.class, primaryKey);

			if (imagegallery == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, imagegallery);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_IMAGEGALLERY_WHERE_PKS_IN);

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

			for (imagegallery imagegallery : (List<imagegallery>)q.list()) {
				map.put(imagegallery.getPrimaryKeyObj(), imagegallery);

				cacheResult(imagegallery);

				uncachedPrimaryKeys.remove(imagegallery.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(imagegalleryModelImpl.ENTITY_CACHE_ENABLED,
					imagegalleryImpl.class, primaryKey, _nullimagegallery);
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
	 * Returns all the imagegalleries.
	 *
	 * @return the imagegalleries
	 */
	@Override
	public List<imagegallery> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the imagegalleries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of imagegalleries
	 * @param end the upper bound of the range of imagegalleries (not inclusive)
	 * @return the range of imagegalleries
	 */
	@Override
	public List<imagegallery> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the imagegalleries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of imagegalleries
	 * @param end the upper bound of the range of imagegalleries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of imagegalleries
	 */
	@Override
	public List<imagegallery> findAll(int start, int end,
		OrderByComparator<imagegallery> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the imagegalleries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of imagegalleries
	 * @param end the upper bound of the range of imagegalleries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of imagegalleries
	 */
	@Override
	public List<imagegallery> findAll(int start, int end,
		OrderByComparator<imagegallery> orderByComparator,
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

		List<imagegallery> list = null;

		if (retrieveFromCache) {
			list = (List<imagegallery>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_IMAGEGALLERY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_IMAGEGALLERY;

				if (pagination) {
					sql = sql.concat(imagegalleryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<imagegallery>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<imagegallery>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the imagegalleries from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (imagegallery imagegallery : findAll()) {
			remove(imagegallery);
		}
	}

	/**
	 * Returns the number of imagegalleries.
	 *
	 * @return the number of imagegalleries
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_IMAGEGALLERY);

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
		return imagegalleryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the imagegallery persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(imagegalleryImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_IMAGEGALLERY = "SELECT imagegallery FROM imagegallery imagegallery";
	private static final String _SQL_SELECT_IMAGEGALLERY_WHERE_PKS_IN = "SELECT imagegallery FROM imagegallery imagegallery WHERE id_ IN (";
	private static final String _SQL_COUNT_IMAGEGALLERY = "SELECT COUNT(imagegallery) FROM imagegallery imagegallery";
	private static final String _ORDER_BY_ENTITY_ALIAS = "imagegallery.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No imagegallery exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(imagegalleryPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final imagegallery _nullimagegallery = new imagegalleryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<imagegallery> toCacheModel() {
				return _nullimagegalleryCacheModel;
			}
		};

	private static final CacheModel<imagegallery> _nullimagegalleryCacheModel = new CacheModel<imagegallery>() {
			@Override
			public imagegallery toEntityModel() {
				return _nullimagegallery;
			}
		};
}