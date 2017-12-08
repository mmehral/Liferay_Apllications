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

package com.branchdetails.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.branchdetails.exception.NoSuchproductException;

import com.branchdetails.model.impl.productImpl;
import com.branchdetails.model.impl.productModelImpl;
import com.branchdetails.model.product;

import com.branchdetails.service.persistence.productPersistence;

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
 * The persistence implementation for the product service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see productPersistence
 * @see com.branchdetails.service.persistence.productUtil
 * @generated
 */
@ProviderType
public class productPersistenceImpl extends BasePersistenceImpl<product>
	implements productPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link productUtil} to access the product persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = productImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(productModelImpl.ENTITY_CACHE_ENABLED,
			productModelImpl.FINDER_CACHE_ENABLED, productImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(productModelImpl.ENTITY_CACHE_ENABLED,
			productModelImpl.FINDER_CACHE_ENABLED, productImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(productModelImpl.ENTITY_CACHE_ENABLED,
			productModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public productPersistenceImpl() {
		setModelClass(product.class);
	}

	/**
	 * Caches the product in the entity cache if it is enabled.
	 *
	 * @param product the product
	 */
	@Override
	public void cacheResult(product product) {
		entityCache.putResult(productModelImpl.ENTITY_CACHE_ENABLED,
			productImpl.class, product.getPrimaryKey(), product);

		product.resetOriginalValues();
	}

	/**
	 * Caches the products in the entity cache if it is enabled.
	 *
	 * @param products the products
	 */
	@Override
	public void cacheResult(List<product> products) {
		for (product product : products) {
			if (entityCache.getResult(productModelImpl.ENTITY_CACHE_ENABLED,
						productImpl.class, product.getPrimaryKey()) == null) {
				cacheResult(product);
			}
			else {
				product.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all products.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(productImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the product.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(product product) {
		entityCache.removeResult(productModelImpl.ENTITY_CACHE_ENABLED,
			productImpl.class, product.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<product> products) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (product product : products) {
			entityCache.removeResult(productModelImpl.ENTITY_CACHE_ENABLED,
				productImpl.class, product.getPrimaryKey());
		}
	}

	/**
	 * Creates a new product with the primary key. Does not add the product to the database.
	 *
	 * @param product_id the primary key for the new product
	 * @return the new product
	 */
	@Override
	public product create(long product_id) {
		product product = new productImpl();

		product.setNew(true);
		product.setPrimaryKey(product_id);

		return product;
	}

	/**
	 * Removes the product with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param product_id the primary key of the product
	 * @return the product that was removed
	 * @throws NoSuchproductException if a product with the primary key could not be found
	 */
	@Override
	public product remove(long product_id) throws NoSuchproductException {
		return remove((Serializable)product_id);
	}

	/**
	 * Removes the product with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the product
	 * @return the product that was removed
	 * @throws NoSuchproductException if a product with the primary key could not be found
	 */
	@Override
	public product remove(Serializable primaryKey)
		throws NoSuchproductException {
		Session session = null;

		try {
			session = openSession();

			product product = (product)session.get(productImpl.class, primaryKey);

			if (product == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchproductException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(product);
		}
		catch (NoSuchproductException nsee) {
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
	protected product removeImpl(product product) {
		product = toUnwrappedModel(product);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(product)) {
				product = (product)session.get(productImpl.class,
						product.getPrimaryKeyObj());
			}

			if (product != null) {
				session.delete(product);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (product != null) {
			clearCache(product);
		}

		return product;
	}

	@Override
	public product updateImpl(product product) {
		product = toUnwrappedModel(product);

		boolean isNew = product.isNew();

		Session session = null;

		try {
			session = openSession();

			if (product.isNew()) {
				session.save(product);

				product.setNew(false);
			}
			else {
				product = (product)session.merge(product);
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

		entityCache.putResult(productModelImpl.ENTITY_CACHE_ENABLED,
			productImpl.class, product.getPrimaryKey(), product, false);

		product.resetOriginalValues();

		return product;
	}

	protected product toUnwrappedModel(product product) {
		if (product instanceof productImpl) {
			return product;
		}

		productImpl productImpl = new productImpl();

		productImpl.setNew(product.isNew());
		productImpl.setPrimaryKey(product.getPrimaryKey());

		productImpl.setProduct_id(product.getProduct_id());
		productImpl.setProduct_name(product.getProduct_name());

		return productImpl;
	}

	/**
	 * Returns the product with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the product
	 * @return the product
	 * @throws NoSuchproductException if a product with the primary key could not be found
	 */
	@Override
	public product findByPrimaryKey(Serializable primaryKey)
		throws NoSuchproductException {
		product product = fetchByPrimaryKey(primaryKey);

		if (product == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchproductException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return product;
	}

	/**
	 * Returns the product with the primary key or throws a {@link NoSuchproductException} if it could not be found.
	 *
	 * @param product_id the primary key of the product
	 * @return the product
	 * @throws NoSuchproductException if a product with the primary key could not be found
	 */
	@Override
	public product findByPrimaryKey(long product_id)
		throws NoSuchproductException {
		return findByPrimaryKey((Serializable)product_id);
	}

	/**
	 * Returns the product with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the product
	 * @return the product, or <code>null</code> if a product with the primary key could not be found
	 */
	@Override
	public product fetchByPrimaryKey(Serializable primaryKey) {
		product product = (product)entityCache.getResult(productModelImpl.ENTITY_CACHE_ENABLED,
				productImpl.class, primaryKey);

		if (product == _nullproduct) {
			return null;
		}

		if (product == null) {
			Session session = null;

			try {
				session = openSession();

				product = (product)session.get(productImpl.class, primaryKey);

				if (product != null) {
					cacheResult(product);
				}
				else {
					entityCache.putResult(productModelImpl.ENTITY_CACHE_ENABLED,
						productImpl.class, primaryKey, _nullproduct);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(productModelImpl.ENTITY_CACHE_ENABLED,
					productImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return product;
	}

	/**
	 * Returns the product with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param product_id the primary key of the product
	 * @return the product, or <code>null</code> if a product with the primary key could not be found
	 */
	@Override
	public product fetchByPrimaryKey(long product_id) {
		return fetchByPrimaryKey((Serializable)product_id);
	}

	@Override
	public Map<Serializable, product> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, product> map = new HashMap<Serializable, product>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			product product = fetchByPrimaryKey(primaryKey);

			if (product != null) {
				map.put(primaryKey, product);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			product product = (product)entityCache.getResult(productModelImpl.ENTITY_CACHE_ENABLED,
					productImpl.class, primaryKey);

			if (product == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, product);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PRODUCT_WHERE_PKS_IN);

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

			for (product product : (List<product>)q.list()) {
				map.put(product.getPrimaryKeyObj(), product);

				cacheResult(product);

				uncachedPrimaryKeys.remove(product.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(productModelImpl.ENTITY_CACHE_ENABLED,
					productImpl.class, primaryKey, _nullproduct);
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
	 * Returns all the products.
	 *
	 * @return the products
	 */
	@Override
	public List<product> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the products.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link productModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of products
	 * @param end the upper bound of the range of products (not inclusive)
	 * @return the range of products
	 */
	@Override
	public List<product> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the products.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link productModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of products
	 * @param end the upper bound of the range of products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of products
	 */
	@Override
	public List<product> findAll(int start, int end,
		OrderByComparator<product> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the products.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link productModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of products
	 * @param end the upper bound of the range of products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of products
	 */
	@Override
	public List<product> findAll(int start, int end,
		OrderByComparator<product> orderByComparator, boolean retrieveFromCache) {
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

		List<product> list = null;

		if (retrieveFromCache) {
			list = (List<product>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PRODUCT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PRODUCT;

				if (pagination) {
					sql = sql.concat(productModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<product>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<product>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the products from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (product product : findAll()) {
			remove(product);
		}
	}

	/**
	 * Returns the number of products.
	 *
	 * @return the number of products
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PRODUCT);

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
		return productModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the product persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(productImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_PRODUCT = "SELECT product FROM product product";
	private static final String _SQL_SELECT_PRODUCT_WHERE_PKS_IN = "SELECT product FROM product product WHERE product_id IN (";
	private static final String _SQL_COUNT_PRODUCT = "SELECT COUNT(product) FROM product product";
	private static final String _ORDER_BY_ENTITY_ALIAS = "product.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No product exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(productPersistenceImpl.class);
	private static final product _nullproduct = new productImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<product> toCacheModel() {
				return _nullproductCacheModel;
			}
		};

	private static final CacheModel<product> _nullproductCacheModel = new CacheModel<product>() {
			@Override
			public product toEntityModel() {
				return _nullproduct;
			}
		};
}