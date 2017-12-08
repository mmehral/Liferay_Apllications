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

package com.chola.business.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.business.exception.NoSuchbusinesssopDetailsException;
import com.chola.business.model.businesssopDetails;
import com.chola.business.model.impl.businesssopDetailsImpl;
import com.chola.business.model.impl.businesssopDetailsModelImpl;
import com.chola.business.service.persistence.businesssopDetailsPersistence;

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
 * The persistence implementation for the businesssop details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see businesssopDetailsPersistence
 * @see com.chola.business.service.persistence.businesssopDetailsUtil
 * @generated
 */
@ProviderType
public class businesssopDetailsPersistenceImpl extends BasePersistenceImpl<businesssopDetails>
	implements businesssopDetailsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link businesssopDetailsUtil} to access the businesssop details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = businesssopDetailsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(businesssopDetailsModelImpl.ENTITY_CACHE_ENABLED,
			businesssopDetailsModelImpl.FINDER_CACHE_ENABLED,
			businesssopDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(businesssopDetailsModelImpl.ENTITY_CACHE_ENABLED,
			businesssopDetailsModelImpl.FINDER_CACHE_ENABLED,
			businesssopDetailsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(businesssopDetailsModelImpl.ENTITY_CACHE_ENABLED,
			businesssopDetailsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public businesssopDetailsPersistenceImpl() {
		setModelClass(businesssopDetails.class);
	}

	/**
	 * Caches the businesssop details in the entity cache if it is enabled.
	 *
	 * @param businesssopDetails the businesssop details
	 */
	@Override
	public void cacheResult(businesssopDetails businesssopDetails) {
		entityCache.putResult(businesssopDetailsModelImpl.ENTITY_CACHE_ENABLED,
			businesssopDetailsImpl.class, businesssopDetails.getPrimaryKey(),
			businesssopDetails);

		businesssopDetails.resetOriginalValues();
	}

	/**
	 * Caches the businesssop detailses in the entity cache if it is enabled.
	 *
	 * @param businesssopDetailses the businesssop detailses
	 */
	@Override
	public void cacheResult(List<businesssopDetails> businesssopDetailses) {
		for (businesssopDetails businesssopDetails : businesssopDetailses) {
			if (entityCache.getResult(
						businesssopDetailsModelImpl.ENTITY_CACHE_ENABLED,
						businesssopDetailsImpl.class,
						businesssopDetails.getPrimaryKey()) == null) {
				cacheResult(businesssopDetails);
			}
			else {
				businesssopDetails.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all businesssop detailses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(businesssopDetailsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the businesssop details.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(businesssopDetails businesssopDetails) {
		entityCache.removeResult(businesssopDetailsModelImpl.ENTITY_CACHE_ENABLED,
			businesssopDetailsImpl.class, businesssopDetails.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<businesssopDetails> businesssopDetailses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (businesssopDetails businesssopDetails : businesssopDetailses) {
			entityCache.removeResult(businesssopDetailsModelImpl.ENTITY_CACHE_ENABLED,
				businesssopDetailsImpl.class, businesssopDetails.getPrimaryKey());
		}
	}

	/**
	 * Creates a new businesssop details with the primary key. Does not add the businesssop details to the database.
	 *
	 * @param id the primary key for the new businesssop details
	 * @return the new businesssop details
	 */
	@Override
	public businesssopDetails create(long id) {
		businesssopDetails businesssopDetails = new businesssopDetailsImpl();

		businesssopDetails.setNew(true);
		businesssopDetails.setPrimaryKey(id);

		return businesssopDetails;
	}

	/**
	 * Removes the businesssop details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the businesssop details
	 * @return the businesssop details that was removed
	 * @throws NoSuchbusinesssopDetailsException if a businesssop details with the primary key could not be found
	 */
	@Override
	public businesssopDetails remove(long id)
		throws NoSuchbusinesssopDetailsException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the businesssop details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the businesssop details
	 * @return the businesssop details that was removed
	 * @throws NoSuchbusinesssopDetailsException if a businesssop details with the primary key could not be found
	 */
	@Override
	public businesssopDetails remove(Serializable primaryKey)
		throws NoSuchbusinesssopDetailsException {
		Session session = null;

		try {
			session = openSession();

			businesssopDetails businesssopDetails = (businesssopDetails)session.get(businesssopDetailsImpl.class,
					primaryKey);

			if (businesssopDetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchbusinesssopDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(businesssopDetails);
		}
		catch (NoSuchbusinesssopDetailsException nsee) {
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
	protected businesssopDetails removeImpl(
		businesssopDetails businesssopDetails) {
		businesssopDetails = toUnwrappedModel(businesssopDetails);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(businesssopDetails)) {
				businesssopDetails = (businesssopDetails)session.get(businesssopDetailsImpl.class,
						businesssopDetails.getPrimaryKeyObj());
			}

			if (businesssopDetails != null) {
				session.delete(businesssopDetails);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (businesssopDetails != null) {
			clearCache(businesssopDetails);
		}

		return businesssopDetails;
	}

	@Override
	public businesssopDetails updateImpl(businesssopDetails businesssopDetails) {
		businesssopDetails = toUnwrappedModel(businesssopDetails);

		boolean isNew = businesssopDetails.isNew();

		Session session = null;

		try {
			session = openSession();

			if (businesssopDetails.isNew()) {
				session.save(businesssopDetails);

				businesssopDetails.setNew(false);
			}
			else {
				businesssopDetails = (businesssopDetails)session.merge(businesssopDetails);
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

		entityCache.putResult(businesssopDetailsModelImpl.ENTITY_CACHE_ENABLED,
			businesssopDetailsImpl.class, businesssopDetails.getPrimaryKey(),
			businesssopDetails, false);

		businesssopDetails.resetOriginalValues();

		return businesssopDetails;
	}

	protected businesssopDetails toUnwrappedModel(
		businesssopDetails businesssopDetails) {
		if (businesssopDetails instanceof businesssopDetailsImpl) {
			return businesssopDetails;
		}

		businesssopDetailsImpl businesssopDetailsImpl = new businesssopDetailsImpl();

		businesssopDetailsImpl.setNew(businesssopDetails.isNew());
		businesssopDetailsImpl.setPrimaryKey(businesssopDetails.getPrimaryKey());

		businesssopDetailsImpl.setId(businesssopDetails.getId());
		businesssopDetailsImpl.setBusinesstitle(businesssopDetails.getBusinesstitle());
		businesssopDetailsImpl.setBusinessDesc(businesssopDetails.getBusinessDesc());
		businesssopDetailsImpl.setCreatedDate(businesssopDetails.getCreatedDate());
		businesssopDetailsImpl.setCreatedBy(businesssopDetails.getCreatedBy());
		businesssopDetailsImpl.setModifiedDate(businesssopDetails.getModifiedDate());
		businesssopDetailsImpl.setModifiedBy(businesssopDetails.getModifiedBy());
		businesssopDetailsImpl.setFlag(businesssopDetails.getFlag());

		return businesssopDetailsImpl;
	}

	/**
	 * Returns the businesssop details with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the businesssop details
	 * @return the businesssop details
	 * @throws NoSuchbusinesssopDetailsException if a businesssop details with the primary key could not be found
	 */
	@Override
	public businesssopDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchbusinesssopDetailsException {
		businesssopDetails businesssopDetails = fetchByPrimaryKey(primaryKey);

		if (businesssopDetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchbusinesssopDetailsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return businesssopDetails;
	}

	/**
	 * Returns the businesssop details with the primary key or throws a {@link NoSuchbusinesssopDetailsException} if it could not be found.
	 *
	 * @param id the primary key of the businesssop details
	 * @return the businesssop details
	 * @throws NoSuchbusinesssopDetailsException if a businesssop details with the primary key could not be found
	 */
	@Override
	public businesssopDetails findByPrimaryKey(long id)
		throws NoSuchbusinesssopDetailsException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the businesssop details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the businesssop details
	 * @return the businesssop details, or <code>null</code> if a businesssop details with the primary key could not be found
	 */
	@Override
	public businesssopDetails fetchByPrimaryKey(Serializable primaryKey) {
		businesssopDetails businesssopDetails = (businesssopDetails)entityCache.getResult(businesssopDetailsModelImpl.ENTITY_CACHE_ENABLED,
				businesssopDetailsImpl.class, primaryKey);

		if (businesssopDetails == _nullbusinesssopDetails) {
			return null;
		}

		if (businesssopDetails == null) {
			Session session = null;

			try {
				session = openSession();

				businesssopDetails = (businesssopDetails)session.get(businesssopDetailsImpl.class,
						primaryKey);

				if (businesssopDetails != null) {
					cacheResult(businesssopDetails);
				}
				else {
					entityCache.putResult(businesssopDetailsModelImpl.ENTITY_CACHE_ENABLED,
						businesssopDetailsImpl.class, primaryKey,
						_nullbusinesssopDetails);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(businesssopDetailsModelImpl.ENTITY_CACHE_ENABLED,
					businesssopDetailsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return businesssopDetails;
	}

	/**
	 * Returns the businesssop details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the businesssop details
	 * @return the businesssop details, or <code>null</code> if a businesssop details with the primary key could not be found
	 */
	@Override
	public businesssopDetails fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, businesssopDetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, businesssopDetails> map = new HashMap<Serializable, businesssopDetails>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			businesssopDetails businesssopDetails = fetchByPrimaryKey(primaryKey);

			if (businesssopDetails != null) {
				map.put(primaryKey, businesssopDetails);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			businesssopDetails businesssopDetails = (businesssopDetails)entityCache.getResult(businesssopDetailsModelImpl.ENTITY_CACHE_ENABLED,
					businesssopDetailsImpl.class, primaryKey);

			if (businesssopDetails == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, businesssopDetails);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BUSINESSSOPDETAILS_WHERE_PKS_IN);

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

			for (businesssopDetails businesssopDetails : (List<businesssopDetails>)q.list()) {
				map.put(businesssopDetails.getPrimaryKeyObj(),
					businesssopDetails);

				cacheResult(businesssopDetails);

				uncachedPrimaryKeys.remove(businesssopDetails.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(businesssopDetailsModelImpl.ENTITY_CACHE_ENABLED,
					businesssopDetailsImpl.class, primaryKey,
					_nullbusinesssopDetails);
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
	 * Returns all the businesssop detailses.
	 *
	 * @return the businesssop detailses
	 */
	@Override
	public List<businesssopDetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the businesssop detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of businesssop detailses
	 * @param end the upper bound of the range of businesssop detailses (not inclusive)
	 * @return the range of businesssop detailses
	 */
	@Override
	public List<businesssopDetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the businesssop detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of businesssop detailses
	 * @param end the upper bound of the range of businesssop detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of businesssop detailses
	 */
	@Override
	public List<businesssopDetails> findAll(int start, int end,
		OrderByComparator<businesssopDetails> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the businesssop detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of businesssop detailses
	 * @param end the upper bound of the range of businesssop detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of businesssop detailses
	 */
	@Override
	public List<businesssopDetails> findAll(int start, int end,
		OrderByComparator<businesssopDetails> orderByComparator,
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

		List<businesssopDetails> list = null;

		if (retrieveFromCache) {
			list = (List<businesssopDetails>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BUSINESSSOPDETAILS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BUSINESSSOPDETAILS;

				if (pagination) {
					sql = sql.concat(businesssopDetailsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<businesssopDetails>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<businesssopDetails>)QueryUtil.list(q,
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
	 * Removes all the businesssop detailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (businesssopDetails businesssopDetails : findAll()) {
			remove(businesssopDetails);
		}
	}

	/**
	 * Returns the number of businesssop detailses.
	 *
	 * @return the number of businesssop detailses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BUSINESSSOPDETAILS);

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
		return businesssopDetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the businesssop details persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(businesssopDetailsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_BUSINESSSOPDETAILS = "SELECT businesssopDetails FROM businesssopDetails businesssopDetails";
	private static final String _SQL_SELECT_BUSINESSSOPDETAILS_WHERE_PKS_IN = "SELECT businesssopDetails FROM businesssopDetails businesssopDetails WHERE id_ IN (";
	private static final String _SQL_COUNT_BUSINESSSOPDETAILS = "SELECT COUNT(businesssopDetails) FROM businesssopDetails businesssopDetails";
	private static final String _ORDER_BY_ENTITY_ALIAS = "businesssopDetails.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No businesssopDetails exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(businesssopDetailsPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final businesssopDetails _nullbusinesssopDetails = new businesssopDetailsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<businesssopDetails> toCacheModel() {
				return _nullbusinesssopDetailsCacheModel;
			}
		};

	private static final CacheModel<businesssopDetails> _nullbusinesssopDetailsCacheModel =
		new CacheModel<businesssopDetails>() {
			@Override
			public businesssopDetails toEntityModel() {
				return _nullbusinesssopDetails;
			}
		};
}