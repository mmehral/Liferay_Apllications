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

package com.chola.conferenceroombooking.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link roomLocalService}.
 *
 * @author adms.java1
 * @see roomLocalService
 * @generated
 */
@ProviderType
public class roomLocalServiceWrapper implements roomLocalService,
	ServiceWrapper<roomLocalService> {
	public roomLocalServiceWrapper(roomLocalService roomLocalService) {
		_roomLocalService = roomLocalService;
	}

	/**
	* Adds the room to the database. Also notifies the appropriate model listeners.
	*
	* @param room the room
	* @return the room that was added
	*/
	@Override
	public com.chola.conferenceroombooking.model.room addroom(
		com.chola.conferenceroombooking.model.room room) {
		return _roomLocalService.addroom(room);
	}

	/**
	* Creates a new room with the primary key. Does not add the room to the database.
	*
	* @param room_id the primary key for the new room
	* @return the new room
	*/
	@Override
	public com.chola.conferenceroombooking.model.room createroom(long room_id) {
		return _roomLocalService.createroom(room_id);
	}

	/**
	* Deletes the room from the database. Also notifies the appropriate model listeners.
	*
	* @param room the room
	* @return the room that was removed
	*/
	@Override
	public com.chola.conferenceroombooking.model.room deleteroom(
		com.chola.conferenceroombooking.model.room room) {
		return _roomLocalService.deleteroom(room);
	}

	/**
	* Deletes the room with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param room_id the primary key of the room
	* @return the room that was removed
	* @throws PortalException if a room with the primary key could not be found
	*/
	@Override
	public com.chola.conferenceroombooking.model.room deleteroom(long room_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _roomLocalService.deleteroom(room_id);
	}

	@Override
	public com.chola.conferenceroombooking.model.room fetchroom(long room_id) {
		return _roomLocalService.fetchroom(room_id);
	}

	/**
	* Returns the room with the primary key.
	*
	* @param room_id the primary key of the room
	* @return the room
	* @throws PortalException if a room with the primary key could not be found
	*/
	@Override
	public com.chola.conferenceroombooking.model.room getroom(long room_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _roomLocalService.getroom(room_id);
	}

	/**
	* Updates the room in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param room the room
	* @return the room that was updated
	*/
	@Override
	public com.chola.conferenceroombooking.model.room updateroom(
		com.chola.conferenceroombooking.model.room room) {
		return _roomLocalService.updateroom(room);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _roomLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _roomLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _roomLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _roomLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _roomLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of rooms.
	*
	* @return the number of rooms
	*/
	@Override
	public int getroomsCount() {
		return _roomLocalService.getroomsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _roomLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _roomLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _roomLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.conferenceroombooking.model.impl.roomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _roomLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.conferenceroombooking.model.impl.roomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _roomLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the rooms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.conferenceroombooking.model.impl.roomModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rooms
	* @param end the upper bound of the range of rooms (not inclusive)
	* @return the range of rooms
	*/
	@Override
	public java.util.List<com.chola.conferenceroombooking.model.room> getrooms(
		int start, int end) {
		return _roomLocalService.getrooms(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _roomLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _roomLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public roomLocalService getWrappedService() {
		return _roomLocalService;
	}

	@Override
	public void setWrappedService(roomLocalService roomLocalService) {
		_roomLocalService = roomLocalService;
	}

	private roomLocalService _roomLocalService;
}