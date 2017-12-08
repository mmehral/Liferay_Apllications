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

package com.chola.service.conference.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.service.conference.model.room;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the room service. This utility wraps {@link com.chola.service.conference.service.persistence.impl.roomPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see roomPersistence
 * @see com.chola.service.conference.service.persistence.impl.roomPersistenceImpl
 * @generated
 */
@ProviderType
public class roomUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(room room) {
		getPersistence().clearCache(room);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<room> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<room> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<room> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<room> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static room update(room room) {
		return getPersistence().update(room);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static room update(room room, ServiceContext serviceContext) {
		return getPersistence().update(room, serviceContext);
	}

	/**
	* Caches the room in the entity cache if it is enabled.
	*
	* @param room the room
	*/
	public static void cacheResult(room room) {
		getPersistence().cacheResult(room);
	}

	/**
	* Caches the rooms in the entity cache if it is enabled.
	*
	* @param rooms the rooms
	*/
	public static void cacheResult(List<room> rooms) {
		getPersistence().cacheResult(rooms);
	}

	/**
	* Creates a new room with the primary key. Does not add the room to the database.
	*
	* @param room_id the primary key for the new room
	* @return the new room
	*/
	public static room create(long room_id) {
		return getPersistence().create(room_id);
	}

	/**
	* Removes the room with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param room_id the primary key of the room
	* @return the room that was removed
	* @throws NoSuchroomException if a room with the primary key could not be found
	*/
	public static room remove(long room_id)
		throws com.chola.service.conference.exception.NoSuchroomException {
		return getPersistence().remove(room_id);
	}

	public static room updateImpl(room room) {
		return getPersistence().updateImpl(room);
	}

	/**
	* Returns the room with the primary key or throws a {@link NoSuchroomException} if it could not be found.
	*
	* @param room_id the primary key of the room
	* @return the room
	* @throws NoSuchroomException if a room with the primary key could not be found
	*/
	public static room findByPrimaryKey(long room_id)
		throws com.chola.service.conference.exception.NoSuchroomException {
		return getPersistence().findByPrimaryKey(room_id);
	}

	/**
	* Returns the room with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param room_id the primary key of the room
	* @return the room, or <code>null</code> if a room with the primary key could not be found
	*/
	public static room fetchByPrimaryKey(long room_id) {
		return getPersistence().fetchByPrimaryKey(room_id);
	}

	public static java.util.Map<java.io.Serializable, room> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the rooms.
	*
	* @return the rooms
	*/
	public static List<room> findAll() {
		return getPersistence().findAll();
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
	public static List<room> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<room> findAll(int start, int end,
		OrderByComparator<room> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<room> findAll(int start, int end,
		OrderByComparator<room> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the rooms from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of rooms.
	*
	* @return the number of rooms
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static roomPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (roomPersistence)PortletBeanLocatorUtil.locate(com.chola.service.conference.service.ClpSerializer.getServletContextName(),
					roomPersistence.class.getName());

			ReferenceRegistry.registerReference(roomUtil.class, "_persistence");
		}

		return _persistence;
	}

	private static roomPersistence _persistence;
}