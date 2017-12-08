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

package com.chola.mdspeak.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.mdspeak.exception.NoSuchMdSpeaksException;
import com.chola.mdspeak.model.MdSpeaks;
import com.chola.mdspeak.model.impl.MdSpeaksImpl;
import com.chola.mdspeak.model.impl.MdSpeaksModelImpl;
import com.chola.mdspeak.service.persistence.MdSpeaksPersistence;

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
 * The persistence implementation for the md speaks service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see MdSpeaksPersistence
 * @see com.chola.mdspeak.service.persistence.MdSpeaksUtil
 * @generated
 */
@ProviderType
public class MdSpeaksPersistenceImpl extends BasePersistenceImpl<MdSpeaks>
	implements MdSpeaksPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MdSpeaksUtil} to access the md speaks persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MdSpeaksImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MdSpeaksModelImpl.ENTITY_CACHE_ENABLED,
			MdSpeaksModelImpl.FINDER_CACHE_ENABLED, MdSpeaksImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MdSpeaksModelImpl.ENTITY_CACHE_ENABLED,
			MdSpeaksModelImpl.FINDER_CACHE_ENABLED, MdSpeaksImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MdSpeaksModelImpl.ENTITY_CACHE_ENABLED,
			MdSpeaksModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public MdSpeaksPersistenceImpl() {
		setModelClass(MdSpeaks.class);
	}

	/**
	 * Caches the md speaks in the entity cache if it is enabled.
	 *
	 * @param mdSpeaks the md speaks
	 */
	@Override
	public void cacheResult(MdSpeaks mdSpeaks) {
		entityCache.putResult(MdSpeaksModelImpl.ENTITY_CACHE_ENABLED,
			MdSpeaksImpl.class, mdSpeaks.getPrimaryKey(), mdSpeaks);

		mdSpeaks.resetOriginalValues();
	}

	/**
	 * Caches the md speakses in the entity cache if it is enabled.
	 *
	 * @param mdSpeakses the md speakses
	 */
	@Override
	public void cacheResult(List<MdSpeaks> mdSpeakses) {
		for (MdSpeaks mdSpeaks : mdSpeakses) {
			if (entityCache.getResult(MdSpeaksModelImpl.ENTITY_CACHE_ENABLED,
						MdSpeaksImpl.class, mdSpeaks.getPrimaryKey()) == null) {
				cacheResult(mdSpeaks);
			}
			else {
				mdSpeaks.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all md speakses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MdSpeaksImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the md speaks.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MdSpeaks mdSpeaks) {
		entityCache.removeResult(MdSpeaksModelImpl.ENTITY_CACHE_ENABLED,
			MdSpeaksImpl.class, mdSpeaks.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<MdSpeaks> mdSpeakses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MdSpeaks mdSpeaks : mdSpeakses) {
			entityCache.removeResult(MdSpeaksModelImpl.ENTITY_CACHE_ENABLED,
				MdSpeaksImpl.class, mdSpeaks.getPrimaryKey());
		}
	}

	/**
	 * Creates a new md speaks with the primary key. Does not add the md speaks to the database.
	 *
	 * @param Id the primary key for the new md speaks
	 * @return the new md speaks
	 */
	@Override
	public MdSpeaks create(long Id) {
		MdSpeaks mdSpeaks = new MdSpeaksImpl();

		mdSpeaks.setNew(true);
		mdSpeaks.setPrimaryKey(Id);

		return mdSpeaks;
	}

	/**
	 * Removes the md speaks with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the md speaks
	 * @return the md speaks that was removed
	 * @throws NoSuchMdSpeaksException if a md speaks with the primary key could not be found
	 */
	@Override
	public MdSpeaks remove(long Id) throws NoSuchMdSpeaksException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the md speaks with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the md speaks
	 * @return the md speaks that was removed
	 * @throws NoSuchMdSpeaksException if a md speaks with the primary key could not be found
	 */
	@Override
	public MdSpeaks remove(Serializable primaryKey)
		throws NoSuchMdSpeaksException {
		Session session = null;

		try {
			session = openSession();

			MdSpeaks mdSpeaks = (MdSpeaks)session.get(MdSpeaksImpl.class,
					primaryKey);

			if (mdSpeaks == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMdSpeaksException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(mdSpeaks);
		}
		catch (NoSuchMdSpeaksException nsee) {
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
	protected MdSpeaks removeImpl(MdSpeaks mdSpeaks) {
		mdSpeaks = toUnwrappedModel(mdSpeaks);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(mdSpeaks)) {
				mdSpeaks = (MdSpeaks)session.get(MdSpeaksImpl.class,
						mdSpeaks.getPrimaryKeyObj());
			}

			if (mdSpeaks != null) {
				session.delete(mdSpeaks);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (mdSpeaks != null) {
			clearCache(mdSpeaks);
		}

		return mdSpeaks;
	}

	@Override
	public MdSpeaks updateImpl(MdSpeaks mdSpeaks) {
		mdSpeaks = toUnwrappedModel(mdSpeaks);

		boolean isNew = mdSpeaks.isNew();

		Session session = null;

		try {
			session = openSession();

			if (mdSpeaks.isNew()) {
				session.save(mdSpeaks);

				mdSpeaks.setNew(false);
			}
			else {
				mdSpeaks = (MdSpeaks)session.merge(mdSpeaks);
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

		entityCache.putResult(MdSpeaksModelImpl.ENTITY_CACHE_ENABLED,
			MdSpeaksImpl.class, mdSpeaks.getPrimaryKey(), mdSpeaks, false);

		mdSpeaks.resetOriginalValues();

		return mdSpeaks;
	}

	protected MdSpeaks toUnwrappedModel(MdSpeaks mdSpeaks) {
		if (mdSpeaks instanceof MdSpeaksImpl) {
			return mdSpeaks;
		}

		MdSpeaksImpl mdSpeaksImpl = new MdSpeaksImpl();

		mdSpeaksImpl.setNew(mdSpeaks.isNew());
		mdSpeaksImpl.setPrimaryKey(mdSpeaks.getPrimaryKey());

		mdSpeaksImpl.setId(mdSpeaks.getId());
		mdSpeaksImpl.setUsername(mdSpeaks.getUsername());

		return mdSpeaksImpl;
	}

	/**
	 * Returns the md speaks with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the md speaks
	 * @return the md speaks
	 * @throws NoSuchMdSpeaksException if a md speaks with the primary key could not be found
	 */
	@Override
	public MdSpeaks findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMdSpeaksException {
		MdSpeaks mdSpeaks = fetchByPrimaryKey(primaryKey);

		if (mdSpeaks == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMdSpeaksException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return mdSpeaks;
	}

	/**
	 * Returns the md speaks with the primary key or throws a {@link NoSuchMdSpeaksException} if it could not be found.
	 *
	 * @param Id the primary key of the md speaks
	 * @return the md speaks
	 * @throws NoSuchMdSpeaksException if a md speaks with the primary key could not be found
	 */
	@Override
	public MdSpeaks findByPrimaryKey(long Id) throws NoSuchMdSpeaksException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the md speaks with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the md speaks
	 * @return the md speaks, or <code>null</code> if a md speaks with the primary key could not be found
	 */
	@Override
	public MdSpeaks fetchByPrimaryKey(Serializable primaryKey) {
		MdSpeaks mdSpeaks = (MdSpeaks)entityCache.getResult(MdSpeaksModelImpl.ENTITY_CACHE_ENABLED,
				MdSpeaksImpl.class, primaryKey);

		if (mdSpeaks == _nullMdSpeaks) {
			return null;
		}

		if (mdSpeaks == null) {
			Session session = null;

			try {
				session = openSession();

				mdSpeaks = (MdSpeaks)session.get(MdSpeaksImpl.class, primaryKey);

				if (mdSpeaks != null) {
					cacheResult(mdSpeaks);
				}
				else {
					entityCache.putResult(MdSpeaksModelImpl.ENTITY_CACHE_ENABLED,
						MdSpeaksImpl.class, primaryKey, _nullMdSpeaks);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(MdSpeaksModelImpl.ENTITY_CACHE_ENABLED,
					MdSpeaksImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return mdSpeaks;
	}

	/**
	 * Returns the md speaks with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the md speaks
	 * @return the md speaks, or <code>null</code> if a md speaks with the primary key could not be found
	 */
	@Override
	public MdSpeaks fetchByPrimaryKey(long Id) {
		return fetchByPrimaryKey((Serializable)Id);
	}

	@Override
	public Map<Serializable, MdSpeaks> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, MdSpeaks> map = new HashMap<Serializable, MdSpeaks>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			MdSpeaks mdSpeaks = fetchByPrimaryKey(primaryKey);

			if (mdSpeaks != null) {
				map.put(primaryKey, mdSpeaks);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			MdSpeaks mdSpeaks = (MdSpeaks)entityCache.getResult(MdSpeaksModelImpl.ENTITY_CACHE_ENABLED,
					MdSpeaksImpl.class, primaryKey);

			if (mdSpeaks == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, mdSpeaks);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_MDSPEAKS_WHERE_PKS_IN);

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

			for (MdSpeaks mdSpeaks : (List<MdSpeaks>)q.list()) {
				map.put(mdSpeaks.getPrimaryKeyObj(), mdSpeaks);

				cacheResult(mdSpeaks);

				uncachedPrimaryKeys.remove(mdSpeaks.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(MdSpeaksModelImpl.ENTITY_CACHE_ENABLED,
					MdSpeaksImpl.class, primaryKey, _nullMdSpeaks);
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
	 * Returns all the md speakses.
	 *
	 * @return the md speakses
	 */
	@Override
	public List<MdSpeaks> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the md speakses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MdSpeaksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of md speakses
	 * @param end the upper bound of the range of md speakses (not inclusive)
	 * @return the range of md speakses
	 */
	@Override
	public List<MdSpeaks> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the md speakses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MdSpeaksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of md speakses
	 * @param end the upper bound of the range of md speakses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of md speakses
	 */
	@Override
	public List<MdSpeaks> findAll(int start, int end,
		OrderByComparator<MdSpeaks> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the md speakses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MdSpeaksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of md speakses
	 * @param end the upper bound of the range of md speakses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of md speakses
	 */
	@Override
	public List<MdSpeaks> findAll(int start, int end,
		OrderByComparator<MdSpeaks> orderByComparator, boolean retrieveFromCache) {
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

		List<MdSpeaks> list = null;

		if (retrieveFromCache) {
			list = (List<MdSpeaks>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_MDSPEAKS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MDSPEAKS;

				if (pagination) {
					sql = sql.concat(MdSpeaksModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MdSpeaks>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<MdSpeaks>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the md speakses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MdSpeaks mdSpeaks : findAll()) {
			remove(mdSpeaks);
		}
	}

	/**
	 * Returns the number of md speakses.
	 *
	 * @return the number of md speakses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MDSPEAKS);

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
		return MdSpeaksModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the md speaks persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(MdSpeaksImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_MDSPEAKS = "SELECT mdSpeaks FROM MdSpeaks mdSpeaks";
	private static final String _SQL_SELECT_MDSPEAKS_WHERE_PKS_IN = "SELECT mdSpeaks FROM MdSpeaks mdSpeaks WHERE Id IN (";
	private static final String _SQL_COUNT_MDSPEAKS = "SELECT COUNT(mdSpeaks) FROM MdSpeaks mdSpeaks";
	private static final String _ORDER_BY_ENTITY_ALIAS = "mdSpeaks.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MdSpeaks exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(MdSpeaksPersistenceImpl.class);
	private static final MdSpeaks _nullMdSpeaks = new MdSpeaksImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MdSpeaks> toCacheModel() {
				return _nullMdSpeaksCacheModel;
			}
		};

	private static final CacheModel<MdSpeaks> _nullMdSpeaksCacheModel = new CacheModel<MdSpeaks>() {
			@Override
			public MdSpeaks toEntityModel() {
				return _nullMdSpeaks;
			}
		};
}