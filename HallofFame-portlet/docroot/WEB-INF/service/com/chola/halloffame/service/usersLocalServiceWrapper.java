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

package com.chola.halloffame.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link usersLocalService}.
 *
 * @author CloverLiferay02
 * @see usersLocalService
 * @generated
 */
@ProviderType
public class usersLocalServiceWrapper implements usersLocalService,
	ServiceWrapper<usersLocalService> {
	public usersLocalServiceWrapper(usersLocalService usersLocalService) {
		_usersLocalService = usersLocalService;
	}

	@Override
	public boolean insertData(java.lang.String message,
		java.lang.String postedBy, java.lang.String postedOn) {
		return _usersLocalService.insertData(message, postedBy, postedOn);
	}

	/**
	* Adds the users to the database. Also notifies the appropriate model listeners.
	*
	* @param users the users
	* @return the users that was added
	*/
	@Override
	public com.chola.halloffame.model.users addusers(
		com.chola.halloffame.model.users users) {
		return _usersLocalService.addusers(users);
	}

	/**
	* Creates a new users with the primary key. Does not add the users to the database.
	*
	* @param Id the primary key for the new users
	* @return the new users
	*/
	@Override
	public com.chola.halloffame.model.users createusers(long Id) {
		return _usersLocalService.createusers(Id);
	}

	/**
	* Deletes the users from the database. Also notifies the appropriate model listeners.
	*
	* @param users the users
	* @return the users that was removed
	*/
	@Override
	public com.chola.halloffame.model.users deleteusers(
		com.chola.halloffame.model.users users) {
		return _usersLocalService.deleteusers(users);
	}

	/**
	* Deletes the users with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the users
	* @return the users that was removed
	* @throws PortalException if a users with the primary key could not be found
	*/
	@Override
	public com.chola.halloffame.model.users deleteusers(long Id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _usersLocalService.deleteusers(Id);
	}

	@Override
	public com.chola.halloffame.model.users fetchusers(long Id) {
		return _usersLocalService.fetchusers(Id);
	}

	/**
	* Returns the users with the primary key.
	*
	* @param Id the primary key of the users
	* @return the users
	* @throws PortalException if a users with the primary key could not be found
	*/
	@Override
	public com.chola.halloffame.model.users getusers(long Id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _usersLocalService.getusers(Id);
	}

	/**
	* Updates the users in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param users the users
	* @return the users that was updated
	*/
	@Override
	public com.chola.halloffame.model.users updateusers(
		com.chola.halloffame.model.users users) {
		return _usersLocalService.updateusers(users);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _usersLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _usersLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _usersLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _usersLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _usersLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of userses.
	*
	* @return the number of userses
	*/
	@Override
	public int getusersesCount() {
		return _usersLocalService.getusersesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _usersLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _usersLocalService.getOSGiServiceIdentifier();
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
		return _usersLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.halloffame.model.impl.usersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _usersLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.halloffame.model.impl.usersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _usersLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List getEmpData(java.lang.String date) {
		return _usersLocalService.getEmpData(date);
	}

	/**
	* Returns a range of all the userses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.halloffame.model.impl.usersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of userses
	* @param end the upper bound of the range of userses (not inclusive)
	* @return the range of userses
	*/
	@Override
	public java.util.List<com.chola.halloffame.model.users> getuserses(
		int start, int end) {
		return _usersLocalService.getuserses(start, end);
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
		return _usersLocalService.dynamicQueryCount(dynamicQuery);
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
		return _usersLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public usersLocalService getWrappedService() {
		return _usersLocalService;
	}

	@Override
	public void setWrappedService(usersLocalService usersLocalService) {
		_usersLocalService = usersLocalService;
	}

	private usersLocalService _usersLocalService;
}