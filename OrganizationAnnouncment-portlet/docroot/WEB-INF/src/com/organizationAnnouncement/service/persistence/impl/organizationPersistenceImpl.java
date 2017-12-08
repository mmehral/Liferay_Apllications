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

package com.organizationAnnouncement.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.organizationAnnouncement.exception.NoSuchorganizationException;

import com.organizationAnnouncement.model.impl.organizationImpl;
import com.organizationAnnouncement.model.impl.organizationModelImpl;
import com.organizationAnnouncement.model.organization;

import com.organizationAnnouncement.service.persistence.organizationPersistence;

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
 * The persistence implementation for the organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see organizationPersistence
 * @see com.organizationAnnouncement.service.persistence.organizationUtil
 * @generated
 */
@ProviderType
public class organizationPersistenceImpl extends BasePersistenceImpl<organization>
	implements organizationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link organizationUtil} to access the organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = organizationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(organizationModelImpl.ENTITY_CACHE_ENABLED,
			organizationModelImpl.FINDER_CACHE_ENABLED, organizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(organizationModelImpl.ENTITY_CACHE_ENABLED,
			organizationModelImpl.FINDER_CACHE_ENABLED, organizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(organizationModelImpl.ENTITY_CACHE_ENABLED,
			organizationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public organizationPersistenceImpl() {
		setModelClass(organization.class);
	}

	/**
	 * Caches the organization in the entity cache if it is enabled.
	 *
	 * @param organization the organization
	 */
	@Override
	public void cacheResult(organization organization) {
		entityCache.putResult(organizationModelImpl.ENTITY_CACHE_ENABLED,
			organizationImpl.class, organization.getPrimaryKey(), organization);

		organization.resetOriginalValues();
	}

	/**
	 * Caches the organizations in the entity cache if it is enabled.
	 *
	 * @param organizations the organizations
	 */
	@Override
	public void cacheResult(List<organization> organizations) {
		for (organization organization : organizations) {
			if (entityCache.getResult(
						organizationModelImpl.ENTITY_CACHE_ENABLED,
						organizationImpl.class, organization.getPrimaryKey()) == null) {
				cacheResult(organization);
			}
			else {
				organization.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all organizations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(organizationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the organization.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(organization organization) {
		entityCache.removeResult(organizationModelImpl.ENTITY_CACHE_ENABLED,
			organizationImpl.class, organization.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<organization> organizations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (organization organization : organizations) {
			entityCache.removeResult(organizationModelImpl.ENTITY_CACHE_ENABLED,
				organizationImpl.class, organization.getPrimaryKey());
		}
	}

	/**
	 * Creates a new organization with the primary key. Does not add the organization to the database.
	 *
	 * @param organization_id the primary key for the new organization
	 * @return the new organization
	 */
	@Override
	public organization create(long organization_id) {
		organization organization = new organizationImpl();

		organization.setNew(true);
		organization.setPrimaryKey(organization_id);

		return organization;
	}

	/**
	 * Removes the organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param organization_id the primary key of the organization
	 * @return the organization that was removed
	 * @throws NoSuchorganizationException if a organization with the primary key could not be found
	 */
	@Override
	public organization remove(long organization_id)
		throws NoSuchorganizationException {
		return remove((Serializable)organization_id);
	}

	/**
	 * Removes the organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the organization
	 * @return the organization that was removed
	 * @throws NoSuchorganizationException if a organization with the primary key could not be found
	 */
	@Override
	public organization remove(Serializable primaryKey)
		throws NoSuchorganizationException {
		Session session = null;

		try {
			session = openSession();

			organization organization = (organization)session.get(organizationImpl.class,
					primaryKey);

			if (organization == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchorganizationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(organization);
		}
		catch (NoSuchorganizationException nsee) {
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
	protected organization removeImpl(organization organization) {
		organization = toUnwrappedModel(organization);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(organization)) {
				organization = (organization)session.get(organizationImpl.class,
						organization.getPrimaryKeyObj());
			}

			if (organization != null) {
				session.delete(organization);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (organization != null) {
			clearCache(organization);
		}

		return organization;
	}

	@Override
	public organization updateImpl(organization organization) {
		organization = toUnwrappedModel(organization);

		boolean isNew = organization.isNew();

		organizationModelImpl organizationModelImpl = (organizationModelImpl)organization;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (organization.getCreateDate() == null)) {
			if (serviceContext == null) {
				organization.setCreateDate(now);
			}
			else {
				organization.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!organizationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				organization.setModifiedDate(now);
			}
			else {
				organization.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (organization.isNew()) {
				session.save(organization);

				organization.setNew(false);
			}
			else {
				organization = (organization)session.merge(organization);
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

		entityCache.putResult(organizationModelImpl.ENTITY_CACHE_ENABLED,
			organizationImpl.class, organization.getPrimaryKey(), organization,
			false);

		organization.resetOriginalValues();

		return organization;
	}

	protected organization toUnwrappedModel(organization organization) {
		if (organization instanceof organizationImpl) {
			return organization;
		}

		organizationImpl organizationImpl = new organizationImpl();

		organizationImpl.setNew(organization.isNew());
		organizationImpl.setPrimaryKey(organization.getPrimaryKey());

		organizationImpl.setOrganization_id(organization.getOrganization_id());
		organizationImpl.setOrganization_tite(organization.getOrganization_tite());
		organizationImpl.setOrganization_description(organization.getOrganization_description());
		organizationImpl.setOrganization_image_name(organization.getOrganization_image_name());
		organizationImpl.setOrganization_image_path(organization.getOrganization_image_path());
		organizationImpl.setCreateDate(organization.getCreateDate());
		organizationImpl.setModifiedDate(organization.getModifiedDate());

		return organizationImpl;
	}

	/**
	 * Returns the organization with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the organization
	 * @return the organization
	 * @throws NoSuchorganizationException if a organization with the primary key could not be found
	 */
	@Override
	public organization findByPrimaryKey(Serializable primaryKey)
		throws NoSuchorganizationException {
		organization organization = fetchByPrimaryKey(primaryKey);

		if (organization == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchorganizationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return organization;
	}

	/**
	 * Returns the organization with the primary key or throws a {@link NoSuchorganizationException} if it could not be found.
	 *
	 * @param organization_id the primary key of the organization
	 * @return the organization
	 * @throws NoSuchorganizationException if a organization with the primary key could not be found
	 */
	@Override
	public organization findByPrimaryKey(long organization_id)
		throws NoSuchorganizationException {
		return findByPrimaryKey((Serializable)organization_id);
	}

	/**
	 * Returns the organization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the organization
	 * @return the organization, or <code>null</code> if a organization with the primary key could not be found
	 */
	@Override
	public organization fetchByPrimaryKey(Serializable primaryKey) {
		organization organization = (organization)entityCache.getResult(organizationModelImpl.ENTITY_CACHE_ENABLED,
				organizationImpl.class, primaryKey);

		if (organization == _nullorganization) {
			return null;
		}

		if (organization == null) {
			Session session = null;

			try {
				session = openSession();

				organization = (organization)session.get(organizationImpl.class,
						primaryKey);

				if (organization != null) {
					cacheResult(organization);
				}
				else {
					entityCache.putResult(organizationModelImpl.ENTITY_CACHE_ENABLED,
						organizationImpl.class, primaryKey, _nullorganization);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(organizationModelImpl.ENTITY_CACHE_ENABLED,
					organizationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return organization;
	}

	/**
	 * Returns the organization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param organization_id the primary key of the organization
	 * @return the organization, or <code>null</code> if a organization with the primary key could not be found
	 */
	@Override
	public organization fetchByPrimaryKey(long organization_id) {
		return fetchByPrimaryKey((Serializable)organization_id);
	}

	@Override
	public Map<Serializable, organization> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, organization> map = new HashMap<Serializable, organization>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			organization organization = fetchByPrimaryKey(primaryKey);

			if (organization != null) {
				map.put(primaryKey, organization);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			organization organization = (organization)entityCache.getResult(organizationModelImpl.ENTITY_CACHE_ENABLED,
					organizationImpl.class, primaryKey);

			if (organization == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, organization);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ORGANIZATION_WHERE_PKS_IN);

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

			for (organization organization : (List<organization>)q.list()) {
				map.put(organization.getPrimaryKeyObj(), organization);

				cacheResult(organization);

				uncachedPrimaryKeys.remove(organization.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(organizationModelImpl.ENTITY_CACHE_ENABLED,
					organizationImpl.class, primaryKey, _nullorganization);
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
	 * Returns all the organizations.
	 *
	 * @return the organizations
	 */
	@Override
	public List<organization> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link organizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of organizations
	 * @param end the upper bound of the range of organizations (not inclusive)
	 * @return the range of organizations
	 */
	@Override
	public List<organization> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link organizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of organizations
	 * @param end the upper bound of the range of organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of organizations
	 */
	@Override
	public List<organization> findAll(int start, int end,
		OrderByComparator<organization> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link organizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of organizations
	 * @param end the upper bound of the range of organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of organizations
	 */
	@Override
	public List<organization> findAll(int start, int end,
		OrderByComparator<organization> orderByComparator,
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

		List<organization> list = null;

		if (retrieveFromCache) {
			list = (List<organization>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ORGANIZATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ORGANIZATION;

				if (pagination) {
					sql = sql.concat(organizationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<organization>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<organization>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the organizations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (organization organization : findAll()) {
			remove(organization);
		}
	}

	/**
	 * Returns the number of organizations.
	 *
	 * @return the number of organizations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ORGANIZATION);

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
		return organizationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the organization persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(organizationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_ORGANIZATION = "SELECT organization FROM organization organization";
	private static final String _SQL_SELECT_ORGANIZATION_WHERE_PKS_IN = "SELECT organization FROM organization organization WHERE organization_id IN (";
	private static final String _SQL_COUNT_ORGANIZATION = "SELECT COUNT(organization) FROM organization organization";
	private static final String _ORDER_BY_ENTITY_ALIAS = "organization.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No organization exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(organizationPersistenceImpl.class);
	private static final organization _nullorganization = new organizationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<organization> toCacheModel() {
				return _nullorganizationCacheModel;
			}
		};

	private static final CacheModel<organization> _nullorganizationCacheModel = new CacheModel<organization>() {
			@Override
			public organization toEntityModel() {
				return _nullorganization;
			}
		};
}