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

package com.chola.conferenceroombooking.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.conferenceroombooking.exception.NoSuchroomException;
import com.chola.conferenceroombooking.model.impl.roomImpl;
import com.chola.conferenceroombooking.model.impl.roomModelImpl;
import com.chola.conferenceroombooking.model.room;
import com.chola.conferenceroombooking.service.persistence.roomPersistence;

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
 * The persistence implementation for the room service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see roomPersistence
 * @see com.chola.conferenceroombooking.service.persistence.roomUtil
 * @generated
 */
@ProviderType
public class roomPersistenceImpl extends BasePersistenceImpl<room>
	implements roomPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link roomUtil} to access the room persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = roomImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(roomModelImpl.ENTITY_CACHE_ENABLED,
			roomModelImpl.FINDER_CACHE_ENABLED, roomImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(roomModelImpl.ENTITY_CACHE_ENABLED,
			roomModelImpl.FINDER_CACHE_ENABLED, roomImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(roomModelImpl.ENTITY_CACHE_ENABLED,
			roomModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public roomPersistenceImpl() {
		setModelClass(room.class);
	}

	/**
	 * Caches the room in the entity cache if it is enabled.
	 *
	 * @param room the room
	 */
	@Override
	public void cacheResult(room room) {
		entityCache.putResult(roomModelImpl.ENTITY_CACHE_ENABLED,
			roomImpl.class, room.getPrimaryKey(), room);

		room.resetOriginalValues();
	}

	/**
	 * Caches the rooms in the entity cache if it is enabled.
	 *
	 * @param rooms the rooms
	 */
	@Override
	public void cacheResult(List<room> rooms) {
		for (room room : rooms) {
			if (entityCache.getResult(roomModelImpl.ENTITY_CACHE_ENABLED,
						roomImpl.class, room.getPrimaryKey()) == null) {
				cacheResult(room);
			}
			else {
				room.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all rooms.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(roomImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the room.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(room room) {
		entityCache.removeResult(roomModelImpl.ENTITY_CACHE_ENABLED,
			roomImpl.class, room.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<room> rooms) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (room room : rooms) {
			entityCache.removeResult(roomModelImpl.ENTITY_CACHE_ENABLED,
				roomImpl.class, room.getPrimaryKey());
		}
	}

	/**
	 * Creates a new room with the primary key. Does not add the room to the database.
	 *
	 * @param room_id the primary key for the new room
	 * @return the new room
	 */
	@Override
	public room create(long room_id) {
		room room = new roomImpl();

		room.setNew(true);
		room.setPrimaryKey(room_id);

		return room;
	}

	/**
	 * Removes the room with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param room_id the primary key of the room
	 * @return the room that was removed
	 * @throws NoSuchroomException if a room with the primary key could not be found
	 */
	@Override
	public room remove(long room_id) throws NoSuchroomException {
		return remove((Serializable)room_id);
	}

	/**
	 * Removes the room with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the room
	 * @return the room that was removed
	 * @throws NoSuchroomException if a room with the primary key could not be found
	 */
	@Override
	public room remove(Serializable primaryKey) throws NoSuchroomException {
		Session session = null;

		try {
			session = openSession();

			room room = (room)session.get(roomImpl.class, primaryKey);

			if (room == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchroomException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(room);
		}
		catch (NoSuchroomException nsee) {
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
	protected room removeImpl(room room) {
		room = toUnwrappedModel(room);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(room)) {
				room = (room)session.get(roomImpl.class, room.getPrimaryKeyObj());
			}

			if (room != null) {
				session.delete(room);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (room != null) {
			clearCache(room);
		}

		return room;
	}

	@Override
	public room updateImpl(room room) {
		room = toUnwrappedModel(room);

		boolean isNew = room.isNew();

		Session session = null;

		try {
			session = openSession();

			if (room.isNew()) {
				session.save(room);

				room.setNew(false);
			}
			else {
				room = (room)session.merge(room);
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

		entityCache.putResult(roomModelImpl.ENTITY_CACHE_ENABLED,
			roomImpl.class, room.getPrimaryKey(), room, false);

		room.resetOriginalValues();

		return room;
	}

	protected room toUnwrappedModel(room room) {
		if (room instanceof roomImpl) {
			return room;
		}

		roomImpl roomImpl = new roomImpl();

		roomImpl.setNew(room.isNew());
		roomImpl.setPrimaryKey(room.getPrimaryKey());

		roomImpl.setRoom_id(room.getRoom_id());
		roomImpl.setState_id(room.getState_id());
		roomImpl.setLocation_id(room.getLocation_id());
		roomImpl.setFloor_id(room.getFloor_id());
		roomImpl.setRoom_name(room.getRoom_name());
		roomImpl.setRoom_capacity(room.getRoom_capacity());
		roomImpl.setRoom_extension(room.getRoom_extension());
		roomImpl.setRoom_values(room.getRoom_values());

		return roomImpl;
	}

	/**
	 * Returns the room with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the room
	 * @return the room
	 * @throws NoSuchroomException if a room with the primary key could not be found
	 */
	@Override
	public room findByPrimaryKey(Serializable primaryKey)
		throws NoSuchroomException {
		room room = fetchByPrimaryKey(primaryKey);

		if (room == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchroomException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return room;
	}

	/**
	 * Returns the room with the primary key or throws a {@link NoSuchroomException} if it could not be found.
	 *
	 * @param room_id the primary key of the room
	 * @return the room
	 * @throws NoSuchroomException if a room with the primary key could not be found
	 */
	@Override
	public room findByPrimaryKey(long room_id) throws NoSuchroomException {
		return findByPrimaryKey((Serializable)room_id);
	}

	/**
	 * Returns the room with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the room
	 * @return the room, or <code>null</code> if a room with the primary key could not be found
	 */
	@Override
	public room fetchByPrimaryKey(Serializable primaryKey) {
		room room = (room)entityCache.getResult(roomModelImpl.ENTITY_CACHE_ENABLED,
				roomImpl.class, primaryKey);

		if (room == _nullroom) {
			return null;
		}

		if (room == null) {
			Session session = null;

			try {
				session = openSession();

				room = (room)session.get(roomImpl.class, primaryKey);

				if (room != null) {
					cacheResult(room);
				}
				else {
					entityCache.putResult(roomModelImpl.ENTITY_CACHE_ENABLED,
						roomImpl.class, primaryKey, _nullroom);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(roomModelImpl.ENTITY_CACHE_ENABLED,
					roomImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return room;
	}

	/**
	 * Returns the room with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param room_id the primary key of the room
	 * @return the room, or <code>null</code> if a room with the primary key could not be found
	 */
	@Override
	public room fetchByPrimaryKey(long room_id) {
		return fetchByPrimaryKey((Serializable)room_id);
	}

	@Override
	public Map<Serializable, room> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, room> map = new HashMap<Serializable, room>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			room room = fetchByPrimaryKey(primaryKey);

			if (room != null) {
				map.put(primaryKey, room);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			room room = (room)entityCache.getResult(roomModelImpl.ENTITY_CACHE_ENABLED,
					roomImpl.class, primaryKey);

			if (room == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, room);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ROOM_WHERE_PKS_IN);

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

			for (room room : (List<room>)q.list()) {
				map.put(room.getPrimaryKeyObj(), room);

				cacheResult(room);

				uncachedPrimaryKeys.remove(room.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(roomModelImpl.ENTITY_CACHE_ENABLED,
					roomImpl.class, primaryKey, _nullroom);
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
	 * Returns all the rooms.
	 *
	 * @return the rooms
	 */
	@Override
	public List<room> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rooms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link roomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @return the range of rooms
	 */
	@Override
	public List<room> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rooms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link roomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rooms
	 */
	@Override
	public List<room> findAll(int start, int end,
		OrderByComparator<room> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the rooms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link roomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of rooms
	 */
	@Override
	public List<room> findAll(int start, int end,
		OrderByComparator<room> orderByComparator, boolean retrieveFromCache) {
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

		List<room> list = null;

		if (retrieveFromCache) {
			list = (List<room>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ROOM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ROOM;

				if (pagination) {
					sql = sql.concat(roomModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<room>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<room>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the rooms from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (room room : findAll()) {
			remove(room);
		}
	}

	/**
	 * Returns the number of rooms.
	 *
	 * @return the number of rooms
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ROOM);

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
		return roomModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the room persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(roomImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_ROOM = "SELECT room FROM room room";
	private static final String _SQL_SELECT_ROOM_WHERE_PKS_IN = "SELECT room FROM room room WHERE room_id IN (";
	private static final String _SQL_COUNT_ROOM = "SELECT COUNT(room) FROM room room";
	private static final String _ORDER_BY_ENTITY_ALIAS = "room.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No room exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(roomPersistenceImpl.class);
	private static final room _nullroom = new roomImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<room> toCacheModel() {
				return _nullroomCacheModel;
			}
		};

	private static final CacheModel<room> _nullroomCacheModel = new CacheModel<room>() {
			@Override
			public room toEntityModel() {
				return _nullroom;
			}
		};
}