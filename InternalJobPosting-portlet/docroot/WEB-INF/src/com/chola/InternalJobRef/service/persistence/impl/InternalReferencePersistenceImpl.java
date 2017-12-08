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

package com.chola.InternalJobRef.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.InternalJobRef.exception.NoSuchInternalReferenceException;
import com.chola.InternalJobRef.model.InternalReference;
import com.chola.InternalJobRef.model.impl.InternalReferenceImpl;
import com.chola.InternalJobRef.model.impl.InternalReferenceModelImpl;
import com.chola.InternalJobRef.service.persistence.InternalReferencePersistence;

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
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the internal reference service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay03
 * @see InternalReferencePersistence
 * @see com.chola.InternalJobRef.service.persistence.InternalReferenceUtil
 * @generated
 */
@ProviderType
public class InternalReferencePersistenceImpl extends BasePersistenceImpl<InternalReference>
	implements InternalReferencePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link InternalReferenceUtil} to access the internal reference persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = InternalReferenceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InternalReferenceModelImpl.ENTITY_CACHE_ENABLED,
			InternalReferenceModelImpl.FINDER_CACHE_ENABLED,
			InternalReferenceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InternalReferenceModelImpl.ENTITY_CACHE_ENABLED,
			InternalReferenceModelImpl.FINDER_CACHE_ENABLED,
			InternalReferenceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InternalReferenceModelImpl.ENTITY_CACHE_ENABLED,
			InternalReferenceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public InternalReferencePersistenceImpl() {
		setModelClass(InternalReference.class);
	}

	/**
	 * Caches the internal reference in the entity cache if it is enabled.
	 *
	 * @param internalReference the internal reference
	 */
	@Override
	public void cacheResult(InternalReference internalReference) {
		entityCache.putResult(InternalReferenceModelImpl.ENTITY_CACHE_ENABLED,
			InternalReferenceImpl.class, internalReference.getPrimaryKey(),
			internalReference);

		internalReference.resetOriginalValues();
	}

	/**
	 * Caches the internal references in the entity cache if it is enabled.
	 *
	 * @param internalReferences the internal references
	 */
	@Override
	public void cacheResult(List<InternalReference> internalReferences) {
		for (InternalReference internalReference : internalReferences) {
			if (entityCache.getResult(
						InternalReferenceModelImpl.ENTITY_CACHE_ENABLED,
						InternalReferenceImpl.class,
						internalReference.getPrimaryKey()) == null) {
				cacheResult(internalReference);
			}
			else {
				internalReference.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all internal references.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(InternalReferenceImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the internal reference.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(InternalReference internalReference) {
		entityCache.removeResult(InternalReferenceModelImpl.ENTITY_CACHE_ENABLED,
			InternalReferenceImpl.class, internalReference.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<InternalReference> internalReferences) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (InternalReference internalReference : internalReferences) {
			entityCache.removeResult(InternalReferenceModelImpl.ENTITY_CACHE_ENABLED,
				InternalReferenceImpl.class, internalReference.getPrimaryKey());
		}
	}

	/**
	 * Creates a new internal reference with the primary key. Does not add the internal reference to the database.
	 *
	 * @param refId the primary key for the new internal reference
	 * @return the new internal reference
	 */
	@Override
	public InternalReference create(long refId) {
		InternalReference internalReference = new InternalReferenceImpl();

		internalReference.setNew(true);
		internalReference.setPrimaryKey(refId);

		return internalReference;
	}

	/**
	 * Removes the internal reference with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param refId the primary key of the internal reference
	 * @return the internal reference that was removed
	 * @throws NoSuchInternalReferenceException if a internal reference with the primary key could not be found
	 */
	@Override
	public InternalReference remove(long refId)
		throws NoSuchInternalReferenceException {
		return remove((Serializable)refId);
	}

	/**
	 * Removes the internal reference with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the internal reference
	 * @return the internal reference that was removed
	 * @throws NoSuchInternalReferenceException if a internal reference with the primary key could not be found
	 */
	@Override
	public InternalReference remove(Serializable primaryKey)
		throws NoSuchInternalReferenceException {
		Session session = null;

		try {
			session = openSession();

			InternalReference internalReference = (InternalReference)session.get(InternalReferenceImpl.class,
					primaryKey);

			if (internalReference == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInternalReferenceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(internalReference);
		}
		catch (NoSuchInternalReferenceException nsee) {
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
	protected InternalReference removeImpl(InternalReference internalReference) {
		internalReference = toUnwrappedModel(internalReference);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(internalReference)) {
				internalReference = (InternalReference)session.get(InternalReferenceImpl.class,
						internalReference.getPrimaryKeyObj());
			}

			if (internalReference != null) {
				session.delete(internalReference);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (internalReference != null) {
			clearCache(internalReference);
		}

		return internalReference;
	}

	@Override
	public InternalReference updateImpl(InternalReference internalReference) {
		internalReference = toUnwrappedModel(internalReference);

		boolean isNew = internalReference.isNew();

		InternalReferenceModelImpl internalReferenceModelImpl = (InternalReferenceModelImpl)internalReference;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (internalReference.getCreateDate() == null)) {
			if (serviceContext == null) {
				internalReference.setCreateDate(now);
			}
			else {
				internalReference.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!internalReferenceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				internalReference.setModifiedDate(now);
			}
			else {
				internalReference.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (internalReference.isNew()) {
				session.save(internalReference);

				internalReference.setNew(false);
			}
			else {
				internalReference = (InternalReference)session.merge(internalReference);
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

		entityCache.putResult(InternalReferenceModelImpl.ENTITY_CACHE_ENABLED,
			InternalReferenceImpl.class, internalReference.getPrimaryKey(),
			internalReference, false);

		internalReference.resetOriginalValues();

		return internalReference;
	}

	protected InternalReference toUnwrappedModel(
		InternalReference internalReference) {
		if (internalReference instanceof InternalReferenceImpl) {
			return internalReference;
		}

		InternalReferenceImpl internalReferenceImpl = new InternalReferenceImpl();

		internalReferenceImpl.setNew(internalReference.isNew());
		internalReferenceImpl.setPrimaryKey(internalReference.getPrimaryKey());

		internalReferenceImpl.setRefId(internalReference.getRefId());
		internalReferenceImpl.setTitle(internalReference.getTitle());
		internalReferenceImpl.setFrom(internalReference.getFrom());
		internalReferenceImpl.setTo(internalReference.getTo());
		internalReferenceImpl.setBody(internalReference.getBody());
		internalReferenceImpl.setFlag(internalReference.getFlag());
		internalReferenceImpl.setCreateDate(internalReference.getCreateDate());
		internalReferenceImpl.setModifiedDate(internalReference.getModifiedDate());

		return internalReferenceImpl;
	}

	/**
	 * Returns the internal reference with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the internal reference
	 * @return the internal reference
	 * @throws NoSuchInternalReferenceException if a internal reference with the primary key could not be found
	 */
	@Override
	public InternalReference findByPrimaryKey(Serializable primaryKey)
		throws NoSuchInternalReferenceException {
		InternalReference internalReference = fetchByPrimaryKey(primaryKey);

		if (internalReference == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchInternalReferenceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return internalReference;
	}

	/**
	 * Returns the internal reference with the primary key or throws a {@link NoSuchInternalReferenceException} if it could not be found.
	 *
	 * @param refId the primary key of the internal reference
	 * @return the internal reference
	 * @throws NoSuchInternalReferenceException if a internal reference with the primary key could not be found
	 */
	@Override
	public InternalReference findByPrimaryKey(long refId)
		throws NoSuchInternalReferenceException {
		return findByPrimaryKey((Serializable)refId);
	}

	/**
	 * Returns the internal reference with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the internal reference
	 * @return the internal reference, or <code>null</code> if a internal reference with the primary key could not be found
	 */
	@Override
	public InternalReference fetchByPrimaryKey(Serializable primaryKey) {
		InternalReference internalReference = (InternalReference)entityCache.getResult(InternalReferenceModelImpl.ENTITY_CACHE_ENABLED,
				InternalReferenceImpl.class, primaryKey);

		if (internalReference == _nullInternalReference) {
			return null;
		}

		if (internalReference == null) {
			Session session = null;

			try {
				session = openSession();

				internalReference = (InternalReference)session.get(InternalReferenceImpl.class,
						primaryKey);

				if (internalReference != null) {
					cacheResult(internalReference);
				}
				else {
					entityCache.putResult(InternalReferenceModelImpl.ENTITY_CACHE_ENABLED,
						InternalReferenceImpl.class, primaryKey,
						_nullInternalReference);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(InternalReferenceModelImpl.ENTITY_CACHE_ENABLED,
					InternalReferenceImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return internalReference;
	}

	/**
	 * Returns the internal reference with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param refId the primary key of the internal reference
	 * @return the internal reference, or <code>null</code> if a internal reference with the primary key could not be found
	 */
	@Override
	public InternalReference fetchByPrimaryKey(long refId) {
		return fetchByPrimaryKey((Serializable)refId);
	}

	@Override
	public Map<Serializable, InternalReference> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, InternalReference> map = new HashMap<Serializable, InternalReference>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			InternalReference internalReference = fetchByPrimaryKey(primaryKey);

			if (internalReference != null) {
				map.put(primaryKey, internalReference);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			InternalReference internalReference = (InternalReference)entityCache.getResult(InternalReferenceModelImpl.ENTITY_CACHE_ENABLED,
					InternalReferenceImpl.class, primaryKey);

			if (internalReference == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, internalReference);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_INTERNALREFERENCE_WHERE_PKS_IN);

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

			for (InternalReference internalReference : (List<InternalReference>)q.list()) {
				map.put(internalReference.getPrimaryKeyObj(), internalReference);

				cacheResult(internalReference);

				uncachedPrimaryKeys.remove(internalReference.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(InternalReferenceModelImpl.ENTITY_CACHE_ENABLED,
					InternalReferenceImpl.class, primaryKey,
					_nullInternalReference);
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
	 * Returns all the internal references.
	 *
	 * @return the internal references
	 */
	@Override
	public List<InternalReference> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the internal references.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InternalReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of internal references
	 * @param end the upper bound of the range of internal references (not inclusive)
	 * @return the range of internal references
	 */
	@Override
	public List<InternalReference> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the internal references.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InternalReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of internal references
	 * @param end the upper bound of the range of internal references (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of internal references
	 */
	@Override
	public List<InternalReference> findAll(int start, int end,
		OrderByComparator<InternalReference> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the internal references.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InternalReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of internal references
	 * @param end the upper bound of the range of internal references (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of internal references
	 */
	@Override
	public List<InternalReference> findAll(int start, int end,
		OrderByComparator<InternalReference> orderByComparator,
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

		List<InternalReference> list = null;

		if (retrieveFromCache) {
			list = (List<InternalReference>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_INTERNALREFERENCE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_INTERNALREFERENCE;

				if (pagination) {
					sql = sql.concat(InternalReferenceModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<InternalReference>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<InternalReference>)QueryUtil.list(q,
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
	 * Removes all the internal references from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (InternalReference internalReference : findAll()) {
			remove(internalReference);
		}
	}

	/**
	 * Returns the number of internal references.
	 *
	 * @return the number of internal references
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_INTERNALREFERENCE);

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
		return InternalReferenceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the internal reference persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(InternalReferenceImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_INTERNALREFERENCE = "SELECT internalReference FROM InternalReference internalReference";
	private static final String _SQL_SELECT_INTERNALREFERENCE_WHERE_PKS_IN = "SELECT internalReference FROM InternalReference internalReference WHERE refId IN (";
	private static final String _SQL_COUNT_INTERNALREFERENCE = "SELECT COUNT(internalReference) FROM InternalReference internalReference";
	private static final String _ORDER_BY_ENTITY_ALIAS = "internalReference.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No InternalReference exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(InternalReferencePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"from", "to"
			});
	private static final InternalReference _nullInternalReference = new InternalReferenceImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<InternalReference> toCacheModel() {
				return _nullInternalReferenceCacheModel;
			}
		};

	private static final CacheModel<InternalReference> _nullInternalReferenceCacheModel =
		new CacheModel<InternalReference>() {
			@Override
			public InternalReference toEntityModel() {
				return _nullInternalReference;
			}
		};
}