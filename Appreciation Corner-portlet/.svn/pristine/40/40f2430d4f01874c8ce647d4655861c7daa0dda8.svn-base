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

import com.chola.app.exception.NoSuchpostException;
import com.chola.app.model.impl.postImpl;
import com.chola.app.model.impl.postModelImpl;
import com.chola.app.model.post;
import com.chola.app.service.persistence.postPersistence;

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
 * The persistence implementation for the post service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see postPersistence
 * @see com.chola.app.service.persistence.postUtil
 * @generated
 */
@ProviderType
public class postPersistenceImpl extends BasePersistenceImpl<post>
	implements postPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link postUtil} to access the post persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = postImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(postModelImpl.ENTITY_CACHE_ENABLED,
			postModelImpl.FINDER_CACHE_ENABLED, postImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(postModelImpl.ENTITY_CACHE_ENABLED,
			postModelImpl.FINDER_CACHE_ENABLED, postImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(postModelImpl.ENTITY_CACHE_ENABLED,
			postModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public postPersistenceImpl() {
		setModelClass(post.class);
	}

	/**
	 * Caches the post in the entity cache if it is enabled.
	 *
	 * @param post the post
	 */
	@Override
	public void cacheResult(post post) {
		entityCache.putResult(postModelImpl.ENTITY_CACHE_ENABLED,
			postImpl.class, post.getPrimaryKey(), post);

		post.resetOriginalValues();
	}

	/**
	 * Caches the posts in the entity cache if it is enabled.
	 *
	 * @param posts the posts
	 */
	@Override
	public void cacheResult(List<post> posts) {
		for (post post : posts) {
			if (entityCache.getResult(postModelImpl.ENTITY_CACHE_ENABLED,
						postImpl.class, post.getPrimaryKey()) == null) {
				cacheResult(post);
			}
			else {
				post.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all posts.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(postImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the post.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(post post) {
		entityCache.removeResult(postModelImpl.ENTITY_CACHE_ENABLED,
			postImpl.class, post.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<post> posts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (post post : posts) {
			entityCache.removeResult(postModelImpl.ENTITY_CACHE_ENABLED,
				postImpl.class, post.getPrimaryKey());
		}
	}

	/**
	 * Creates a new post with the primary key. Does not add the post to the database.
	 *
	 * @param id the primary key for the new post
	 * @return the new post
	 */
	@Override
	public post create(long id) {
		post post = new postImpl();

		post.setNew(true);
		post.setPrimaryKey(id);

		return post;
	}

	/**
	 * Removes the post with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the post
	 * @return the post that was removed
	 * @throws NoSuchpostException if a post with the primary key could not be found
	 */
	@Override
	public post remove(long id) throws NoSuchpostException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the post with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the post
	 * @return the post that was removed
	 * @throws NoSuchpostException if a post with the primary key could not be found
	 */
	@Override
	public post remove(Serializable primaryKey) throws NoSuchpostException {
		Session session = null;

		try {
			session = openSession();

			post post = (post)session.get(postImpl.class, primaryKey);

			if (post == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchpostException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(post);
		}
		catch (NoSuchpostException nsee) {
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
	protected post removeImpl(post post) {
		post = toUnwrappedModel(post);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(post)) {
				post = (post)session.get(postImpl.class, post.getPrimaryKeyObj());
			}

			if (post != null) {
				session.delete(post);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (post != null) {
			clearCache(post);
		}

		return post;
	}

	@Override
	public post updateImpl(post post) {
		post = toUnwrappedModel(post);

		boolean isNew = post.isNew();

		Session session = null;

		try {
			session = openSession();

			if (post.isNew()) {
				session.save(post);

				post.setNew(false);
			}
			else {
				post = (post)session.merge(post);
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

		entityCache.putResult(postModelImpl.ENTITY_CACHE_ENABLED,
			postImpl.class, post.getPrimaryKey(), post, false);

		post.resetOriginalValues();

		return post;
	}

	protected post toUnwrappedModel(post post) {
		if (post instanceof postImpl) {
			return post;
		}

		postImpl postImpl = new postImpl();

		postImpl.setNew(post.isNew());
		postImpl.setPrimaryKey(post.getPrimaryKey());

		postImpl.setId(post.getId());
		postImpl.setAppTo(post.getAppTo());
		postImpl.setAppBy(post.getAppBy());
		postImpl.setAppMessage(post.getAppMessage());
		postImpl.setAppDate(post.getAppDate());

		return postImpl;
	}

	/**
	 * Returns the post with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the post
	 * @return the post
	 * @throws NoSuchpostException if a post with the primary key could not be found
	 */
	@Override
	public post findByPrimaryKey(Serializable primaryKey)
		throws NoSuchpostException {
		post post = fetchByPrimaryKey(primaryKey);

		if (post == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchpostException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return post;
	}

	/**
	 * Returns the post with the primary key or throws a {@link NoSuchpostException} if it could not be found.
	 *
	 * @param id the primary key of the post
	 * @return the post
	 * @throws NoSuchpostException if a post with the primary key could not be found
	 */
	@Override
	public post findByPrimaryKey(long id) throws NoSuchpostException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the post with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the post
	 * @return the post, or <code>null</code> if a post with the primary key could not be found
	 */
	@Override
	public post fetchByPrimaryKey(Serializable primaryKey) {
		post post = (post)entityCache.getResult(postModelImpl.ENTITY_CACHE_ENABLED,
				postImpl.class, primaryKey);

		if (post == _nullpost) {
			return null;
		}

		if (post == null) {
			Session session = null;

			try {
				session = openSession();

				post = (post)session.get(postImpl.class, primaryKey);

				if (post != null) {
					cacheResult(post);
				}
				else {
					entityCache.putResult(postModelImpl.ENTITY_CACHE_ENABLED,
						postImpl.class, primaryKey, _nullpost);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(postModelImpl.ENTITY_CACHE_ENABLED,
					postImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return post;
	}

	/**
	 * Returns the post with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the post
	 * @return the post, or <code>null</code> if a post with the primary key could not be found
	 */
	@Override
	public post fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, post> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, post> map = new HashMap<Serializable, post>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			post post = fetchByPrimaryKey(primaryKey);

			if (post != null) {
				map.put(primaryKey, post);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			post post = (post)entityCache.getResult(postModelImpl.ENTITY_CACHE_ENABLED,
					postImpl.class, primaryKey);

			if (post == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, post);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_POST_WHERE_PKS_IN);

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

			for (post post : (List<post>)q.list()) {
				map.put(post.getPrimaryKeyObj(), post);

				cacheResult(post);

				uncachedPrimaryKeys.remove(post.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(postModelImpl.ENTITY_CACHE_ENABLED,
					postImpl.class, primaryKey, _nullpost);
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
	 * Returns all the posts.
	 *
	 * @return the posts
	 */
	@Override
	public List<post> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the posts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of posts
	 * @param end the upper bound of the range of posts (not inclusive)
	 * @return the range of posts
	 */
	@Override
	public List<post> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the posts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of posts
	 * @param end the upper bound of the range of posts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of posts
	 */
	@Override
	public List<post> findAll(int start, int end,
		OrderByComparator<post> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the posts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of posts
	 * @param end the upper bound of the range of posts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of posts
	 */
	@Override
	public List<post> findAll(int start, int end,
		OrderByComparator<post> orderByComparator, boolean retrieveFromCache) {
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

		List<post> list = null;

		if (retrieveFromCache) {
			list = (List<post>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_POST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_POST;

				if (pagination) {
					sql = sql.concat(postModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<post>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<post>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the posts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (post post : findAll()) {
			remove(post);
		}
	}

	/**
	 * Returns the number of posts.
	 *
	 * @return the number of posts
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_POST);

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
		return postModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the post persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(postImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_POST = "SELECT post FROM post post";
	private static final String _SQL_SELECT_POST_WHERE_PKS_IN = "SELECT post FROM post post WHERE id_ IN (";
	private static final String _SQL_COUNT_POST = "SELECT COUNT(post) FROM post post";
	private static final String _ORDER_BY_ENTITY_ALIAS = "post.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No post exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(postPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final post _nullpost = new postImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<post> toCacheModel() {
				return _nullpostCacheModel;
			}
		};

	private static final CacheModel<post> _nullpostCacheModel = new CacheModel<post>() {
			@Override
			public post toEntityModel() {
				return _nullpost;
			}
		};
}