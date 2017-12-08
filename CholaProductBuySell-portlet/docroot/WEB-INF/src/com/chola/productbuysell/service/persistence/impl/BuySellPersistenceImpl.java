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

package com.chola.productbuysell.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.productbuysell.exception.NoSuchBuySellException;
import com.chola.productbuysell.model.BuySell;
import com.chola.productbuysell.model.impl.BuySellImpl;
import com.chola.productbuysell.model.impl.BuySellModelImpl;
import com.chola.productbuysell.service.persistence.BuySellPersistence;

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
 * The persistence implementation for the buy sell service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay03
 * @see BuySellPersistence
 * @see com.chola.productbuysell.service.persistence.BuySellUtil
 * @generated
 */
@ProviderType
public class BuySellPersistenceImpl extends BasePersistenceImpl<BuySell>
	implements BuySellPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BuySellUtil} to access the buy sell persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BuySellImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BuySellModelImpl.ENTITY_CACHE_ENABLED,
			BuySellModelImpl.FINDER_CACHE_ENABLED, BuySellImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BuySellModelImpl.ENTITY_CACHE_ENABLED,
			BuySellModelImpl.FINDER_CACHE_ENABLED, BuySellImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BuySellModelImpl.ENTITY_CACHE_ENABLED,
			BuySellModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public BuySellPersistenceImpl() {
		setModelClass(BuySell.class);
	}

	/**
	 * Caches the buy sell in the entity cache if it is enabled.
	 *
	 * @param buySell the buy sell
	 */
	@Override
	public void cacheResult(BuySell buySell) {
		entityCache.putResult(BuySellModelImpl.ENTITY_CACHE_ENABLED,
			BuySellImpl.class, buySell.getPrimaryKey(), buySell);

		buySell.resetOriginalValues();
	}

	/**
	 * Caches the buy sells in the entity cache if it is enabled.
	 *
	 * @param buySells the buy sells
	 */
	@Override
	public void cacheResult(List<BuySell> buySells) {
		for (BuySell buySell : buySells) {
			if (entityCache.getResult(BuySellModelImpl.ENTITY_CACHE_ENABLED,
						BuySellImpl.class, buySell.getPrimaryKey()) == null) {
				cacheResult(buySell);
			}
			else {
				buySell.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all buy sells.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(BuySellImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the buy sell.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BuySell buySell) {
		entityCache.removeResult(BuySellModelImpl.ENTITY_CACHE_ENABLED,
			BuySellImpl.class, buySell.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<BuySell> buySells) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BuySell buySell : buySells) {
			entityCache.removeResult(BuySellModelImpl.ENTITY_CACHE_ENABLED,
				BuySellImpl.class, buySell.getPrimaryKey());
		}
	}

	/**
	 * Creates a new buy sell with the primary key. Does not add the buy sell to the database.
	 *
	 * @param id the primary key for the new buy sell
	 * @return the new buy sell
	 */
	@Override
	public BuySell create(long id) {
		BuySell buySell = new BuySellImpl();

		buySell.setNew(true);
		buySell.setPrimaryKey(id);

		return buySell;
	}

	/**
	 * Removes the buy sell with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the buy sell
	 * @return the buy sell that was removed
	 * @throws NoSuchBuySellException if a buy sell with the primary key could not be found
	 */
	@Override
	public BuySell remove(long id) throws NoSuchBuySellException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the buy sell with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the buy sell
	 * @return the buy sell that was removed
	 * @throws NoSuchBuySellException if a buy sell with the primary key could not be found
	 */
	@Override
	public BuySell remove(Serializable primaryKey)
		throws NoSuchBuySellException {
		Session session = null;

		try {
			session = openSession();

			BuySell buySell = (BuySell)session.get(BuySellImpl.class, primaryKey);

			if (buySell == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBuySellException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(buySell);
		}
		catch (NoSuchBuySellException nsee) {
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
	protected BuySell removeImpl(BuySell buySell) {
		buySell = toUnwrappedModel(buySell);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(buySell)) {
				buySell = (BuySell)session.get(BuySellImpl.class,
						buySell.getPrimaryKeyObj());
			}

			if (buySell != null) {
				session.delete(buySell);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (buySell != null) {
			clearCache(buySell);
		}

		return buySell;
	}

	@Override
	public BuySell updateImpl(BuySell buySell) {
		buySell = toUnwrappedModel(buySell);

		boolean isNew = buySell.isNew();

		Session session = null;

		try {
			session = openSession();

			if (buySell.isNew()) {
				session.save(buySell);

				buySell.setNew(false);
			}
			else {
				buySell = (BuySell)session.merge(buySell);
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

		entityCache.putResult(BuySellModelImpl.ENTITY_CACHE_ENABLED,
			BuySellImpl.class, buySell.getPrimaryKey(), buySell, false);

		buySell.resetOriginalValues();

		return buySell;
	}

	protected BuySell toUnwrappedModel(BuySell buySell) {
		if (buySell instanceof BuySellImpl) {
			return buySell;
		}

		BuySellImpl buySellImpl = new BuySellImpl();

		buySellImpl.setNew(buySell.isNew());
		buySellImpl.setPrimaryKey(buySell.getPrimaryKey());

		buySellImpl.setId(buySell.getId());
		buySellImpl.setName(buySell.getName());

		return buySellImpl;
	}

	/**
	 * Returns the buy sell with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the buy sell
	 * @return the buy sell
	 * @throws NoSuchBuySellException if a buy sell with the primary key could not be found
	 */
	@Override
	public BuySell findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBuySellException {
		BuySell buySell = fetchByPrimaryKey(primaryKey);

		if (buySell == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBuySellException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return buySell;
	}

	/**
	 * Returns the buy sell with the primary key or throws a {@link NoSuchBuySellException} if it could not be found.
	 *
	 * @param id the primary key of the buy sell
	 * @return the buy sell
	 * @throws NoSuchBuySellException if a buy sell with the primary key could not be found
	 */
	@Override
	public BuySell findByPrimaryKey(long id) throws NoSuchBuySellException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the buy sell with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the buy sell
	 * @return the buy sell, or <code>null</code> if a buy sell with the primary key could not be found
	 */
	@Override
	public BuySell fetchByPrimaryKey(Serializable primaryKey) {
		BuySell buySell = (BuySell)entityCache.getResult(BuySellModelImpl.ENTITY_CACHE_ENABLED,
				BuySellImpl.class, primaryKey);

		if (buySell == _nullBuySell) {
			return null;
		}

		if (buySell == null) {
			Session session = null;

			try {
				session = openSession();

				buySell = (BuySell)session.get(BuySellImpl.class, primaryKey);

				if (buySell != null) {
					cacheResult(buySell);
				}
				else {
					entityCache.putResult(BuySellModelImpl.ENTITY_CACHE_ENABLED,
						BuySellImpl.class, primaryKey, _nullBuySell);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(BuySellModelImpl.ENTITY_CACHE_ENABLED,
					BuySellImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return buySell;
	}

	/**
	 * Returns the buy sell with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the buy sell
	 * @return the buy sell, or <code>null</code> if a buy sell with the primary key could not be found
	 */
	@Override
	public BuySell fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, BuySell> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, BuySell> map = new HashMap<Serializable, BuySell>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			BuySell buySell = fetchByPrimaryKey(primaryKey);

			if (buySell != null) {
				map.put(primaryKey, buySell);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			BuySell buySell = (BuySell)entityCache.getResult(BuySellModelImpl.ENTITY_CACHE_ENABLED,
					BuySellImpl.class, primaryKey);

			if (buySell == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, buySell);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BUYSELL_WHERE_PKS_IN);

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

			for (BuySell buySell : (List<BuySell>)q.list()) {
				map.put(buySell.getPrimaryKeyObj(), buySell);

				cacheResult(buySell);

				uncachedPrimaryKeys.remove(buySell.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(BuySellModelImpl.ENTITY_CACHE_ENABLED,
					BuySellImpl.class, primaryKey, _nullBuySell);
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
	 * Returns all the buy sells.
	 *
	 * @return the buy sells
	 */
	@Override
	public List<BuySell> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the buy sells.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of buy sells
	 * @param end the upper bound of the range of buy sells (not inclusive)
	 * @return the range of buy sells
	 */
	@Override
	public List<BuySell> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the buy sells.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of buy sells
	 * @param end the upper bound of the range of buy sells (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of buy sells
	 */
	@Override
	public List<BuySell> findAll(int start, int end,
		OrderByComparator<BuySell> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the buy sells.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BuySellModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of buy sells
	 * @param end the upper bound of the range of buy sells (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of buy sells
	 */
	@Override
	public List<BuySell> findAll(int start, int end,
		OrderByComparator<BuySell> orderByComparator, boolean retrieveFromCache) {
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

		List<BuySell> list = null;

		if (retrieveFromCache) {
			list = (List<BuySell>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BUYSELL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BUYSELL;

				if (pagination) {
					sql = sql.concat(BuySellModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<BuySell>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<BuySell>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the buy sells from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (BuySell buySell : findAll()) {
			remove(buySell);
		}
	}

	/**
	 * Returns the number of buy sells.
	 *
	 * @return the number of buy sells
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BUYSELL);

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
		return BuySellModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the buy sell persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(BuySellImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_BUYSELL = "SELECT buySell FROM BuySell buySell";
	private static final String _SQL_SELECT_BUYSELL_WHERE_PKS_IN = "SELECT buySell FROM BuySell buySell WHERE id_ IN (";
	private static final String _SQL_COUNT_BUYSELL = "SELECT COUNT(buySell) FROM BuySell buySell";
	private static final String _ORDER_BY_ENTITY_ALIAS = "buySell.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BuySell exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(BuySellPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final BuySell _nullBuySell = new BuySellImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<BuySell> toCacheModel() {
				return _nullBuySellCacheModel;
			}
		};

	private static final CacheModel<BuySell> _nullBuySellCacheModel = new CacheModel<BuySell>() {
			@Override
			public BuySell toEntityModel() {
				return _nullBuySell;
			}
		};
}