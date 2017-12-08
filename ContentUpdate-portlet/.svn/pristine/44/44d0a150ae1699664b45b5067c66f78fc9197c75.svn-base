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

package com.content.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.content.exception.NoSuchcontentupdateException;

import com.content.model.contentupdate;
import com.content.model.impl.contentupdateImpl;
import com.content.model.impl.contentupdateModelImpl;

import com.content.service.persistence.contentupdatePersistence;

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
 * The persistence implementation for the contentupdate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see contentupdatePersistence
 * @see com.content.service.persistence.contentupdateUtil
 * @generated
 */
@ProviderType
public class contentupdatePersistenceImpl extends BasePersistenceImpl<contentupdate>
	implements contentupdatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link contentupdateUtil} to access the contentupdate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = contentupdateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(contentupdateModelImpl.ENTITY_CACHE_ENABLED,
			contentupdateModelImpl.FINDER_CACHE_ENABLED,
			contentupdateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(contentupdateModelImpl.ENTITY_CACHE_ENABLED,
			contentupdateModelImpl.FINDER_CACHE_ENABLED,
			contentupdateImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(contentupdateModelImpl.ENTITY_CACHE_ENABLED,
			contentupdateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public contentupdatePersistenceImpl() {
		setModelClass(contentupdate.class);
	}

	/**
	 * Caches the contentupdate in the entity cache if it is enabled.
	 *
	 * @param contentupdate the contentupdate
	 */
	@Override
	public void cacheResult(contentupdate contentupdate) {
		entityCache.putResult(contentupdateModelImpl.ENTITY_CACHE_ENABLED,
			contentupdateImpl.class, contentupdate.getPrimaryKey(),
			contentupdate);

		contentupdate.resetOriginalValues();
	}

	/**
	 * Caches the contentupdates in the entity cache if it is enabled.
	 *
	 * @param contentupdates the contentupdates
	 */
	@Override
	public void cacheResult(List<contentupdate> contentupdates) {
		for (contentupdate contentupdate : contentupdates) {
			if (entityCache.getResult(
						contentupdateModelImpl.ENTITY_CACHE_ENABLED,
						contentupdateImpl.class, contentupdate.getPrimaryKey()) == null) {
				cacheResult(contentupdate);
			}
			else {
				contentupdate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all contentupdates.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(contentupdateImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the contentupdate.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(contentupdate contentupdate) {
		entityCache.removeResult(contentupdateModelImpl.ENTITY_CACHE_ENABLED,
			contentupdateImpl.class, contentupdate.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<contentupdate> contentupdates) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (contentupdate contentupdate : contentupdates) {
			entityCache.removeResult(contentupdateModelImpl.ENTITY_CACHE_ENABLED,
				contentupdateImpl.class, contentupdate.getPrimaryKey());
		}
	}

	/**
	 * Creates a new contentupdate with the primary key. Does not add the contentupdate to the database.
	 *
	 * @param id the primary key for the new contentupdate
	 * @return the new contentupdate
	 */
	@Override
	public contentupdate create(long id) {
		contentupdate contentupdate = new contentupdateImpl();

		contentupdate.setNew(true);
		contentupdate.setPrimaryKey(id);

		return contentupdate;
	}

	/**
	 * Removes the contentupdate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the contentupdate
	 * @return the contentupdate that was removed
	 * @throws NoSuchcontentupdateException if a contentupdate with the primary key could not be found
	 */
	@Override
	public contentupdate remove(long id) throws NoSuchcontentupdateException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the contentupdate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the contentupdate
	 * @return the contentupdate that was removed
	 * @throws NoSuchcontentupdateException if a contentupdate with the primary key could not be found
	 */
	@Override
	public contentupdate remove(Serializable primaryKey)
		throws NoSuchcontentupdateException {
		Session session = null;

		try {
			session = openSession();

			contentupdate contentupdate = (contentupdate)session.get(contentupdateImpl.class,
					primaryKey);

			if (contentupdate == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcontentupdateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(contentupdate);
		}
		catch (NoSuchcontentupdateException nsee) {
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
	protected contentupdate removeImpl(contentupdate contentupdate) {
		contentupdate = toUnwrappedModel(contentupdate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(contentupdate)) {
				contentupdate = (contentupdate)session.get(contentupdateImpl.class,
						contentupdate.getPrimaryKeyObj());
			}

			if (contentupdate != null) {
				session.delete(contentupdate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (contentupdate != null) {
			clearCache(contentupdate);
		}

		return contentupdate;
	}

	@Override
	public contentupdate updateImpl(contentupdate contentupdate) {
		contentupdate = toUnwrappedModel(contentupdate);

		boolean isNew = contentupdate.isNew();

		Session session = null;

		try {
			session = openSession();

			if (contentupdate.isNew()) {
				session.save(contentupdate);

				contentupdate.setNew(false);
			}
			else {
				contentupdate = (contentupdate)session.merge(contentupdate);
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

		entityCache.putResult(contentupdateModelImpl.ENTITY_CACHE_ENABLED,
			contentupdateImpl.class, contentupdate.getPrimaryKey(),
			contentupdate, false);

		contentupdate.resetOriginalValues();

		return contentupdate;
	}

	protected contentupdate toUnwrappedModel(contentupdate contentupdate) {
		if (contentupdate instanceof contentupdateImpl) {
			return contentupdate;
		}

		contentupdateImpl contentupdateImpl = new contentupdateImpl();

		contentupdateImpl.setNew(contentupdate.isNew());
		contentupdateImpl.setPrimaryKey(contentupdate.getPrimaryKey());

		contentupdateImpl.setId(contentupdate.getId());
		contentupdateImpl.setContent_id(contentupdate.getContent_id());

		return contentupdateImpl;
	}

	/**
	 * Returns the contentupdate with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the contentupdate
	 * @return the contentupdate
	 * @throws NoSuchcontentupdateException if a contentupdate with the primary key could not be found
	 */
	@Override
	public contentupdate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchcontentupdateException {
		contentupdate contentupdate = fetchByPrimaryKey(primaryKey);

		if (contentupdate == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcontentupdateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return contentupdate;
	}

	/**
	 * Returns the contentupdate with the primary key or throws a {@link NoSuchcontentupdateException} if it could not be found.
	 *
	 * @param id the primary key of the contentupdate
	 * @return the contentupdate
	 * @throws NoSuchcontentupdateException if a contentupdate with the primary key could not be found
	 */
	@Override
	public contentupdate findByPrimaryKey(long id)
		throws NoSuchcontentupdateException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the contentupdate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the contentupdate
	 * @return the contentupdate, or <code>null</code> if a contentupdate with the primary key could not be found
	 */
	@Override
	public contentupdate fetchByPrimaryKey(Serializable primaryKey) {
		contentupdate contentupdate = (contentupdate)entityCache.getResult(contentupdateModelImpl.ENTITY_CACHE_ENABLED,
				contentupdateImpl.class, primaryKey);

		if (contentupdate == _nullcontentupdate) {
			return null;
		}

		if (contentupdate == null) {
			Session session = null;

			try {
				session = openSession();

				contentupdate = (contentupdate)session.get(contentupdateImpl.class,
						primaryKey);

				if (contentupdate != null) {
					cacheResult(contentupdate);
				}
				else {
					entityCache.putResult(contentupdateModelImpl.ENTITY_CACHE_ENABLED,
						contentupdateImpl.class, primaryKey, _nullcontentupdate);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(contentupdateModelImpl.ENTITY_CACHE_ENABLED,
					contentupdateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return contentupdate;
	}

	/**
	 * Returns the contentupdate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the contentupdate
	 * @return the contentupdate, or <code>null</code> if a contentupdate with the primary key could not be found
	 */
	@Override
	public contentupdate fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, contentupdate> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, contentupdate> map = new HashMap<Serializable, contentupdate>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			contentupdate contentupdate = fetchByPrimaryKey(primaryKey);

			if (contentupdate != null) {
				map.put(primaryKey, contentupdate);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			contentupdate contentupdate = (contentupdate)entityCache.getResult(contentupdateModelImpl.ENTITY_CACHE_ENABLED,
					contentupdateImpl.class, primaryKey);

			if (contentupdate == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, contentupdate);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CONTENTUPDATE_WHERE_PKS_IN);

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

			for (contentupdate contentupdate : (List<contentupdate>)q.list()) {
				map.put(contentupdate.getPrimaryKeyObj(), contentupdate);

				cacheResult(contentupdate);

				uncachedPrimaryKeys.remove(contentupdate.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(contentupdateModelImpl.ENTITY_CACHE_ENABLED,
					contentupdateImpl.class, primaryKey, _nullcontentupdate);
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
	 * Returns all the contentupdates.
	 *
	 * @return the contentupdates
	 */
	@Override
	public List<contentupdate> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the contentupdates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentupdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contentupdates
	 * @param end the upper bound of the range of contentupdates (not inclusive)
	 * @return the range of contentupdates
	 */
	@Override
	public List<contentupdate> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the contentupdates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentupdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contentupdates
	 * @param end the upper bound of the range of contentupdates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of contentupdates
	 */
	@Override
	public List<contentupdate> findAll(int start, int end,
		OrderByComparator<contentupdate> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the contentupdates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentupdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of contentupdates
	 * @param end the upper bound of the range of contentupdates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of contentupdates
	 */
	@Override
	public List<contentupdate> findAll(int start, int end,
		OrderByComparator<contentupdate> orderByComparator,
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

		List<contentupdate> list = null;

		if (retrieveFromCache) {
			list = (List<contentupdate>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CONTENTUPDATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONTENTUPDATE;

				if (pagination) {
					sql = sql.concat(contentupdateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<contentupdate>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<contentupdate>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the contentupdates from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (contentupdate contentupdate : findAll()) {
			remove(contentupdate);
		}
	}

	/**
	 * Returns the number of contentupdates.
	 *
	 * @return the number of contentupdates
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CONTENTUPDATE);

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
		return contentupdateModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the contentupdate persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(contentupdateImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_CONTENTUPDATE = "SELECT contentupdate FROM contentupdate contentupdate";
	private static final String _SQL_SELECT_CONTENTUPDATE_WHERE_PKS_IN = "SELECT contentupdate FROM contentupdate contentupdate WHERE id_ IN (";
	private static final String _SQL_COUNT_CONTENTUPDATE = "SELECT COUNT(contentupdate) FROM contentupdate contentupdate";
	private static final String _ORDER_BY_ENTITY_ALIAS = "contentupdate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No contentupdate exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(contentupdatePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final contentupdate _nullcontentupdate = new contentupdateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<contentupdate> toCacheModel() {
				return _nullcontentupdateCacheModel;
			}
		};

	private static final CacheModel<contentupdate> _nullcontentupdateCacheModel = new CacheModel<contentupdate>() {
			@Override
			public contentupdate toEntityModel() {
				return _nullcontentupdate;
			}
		};
}