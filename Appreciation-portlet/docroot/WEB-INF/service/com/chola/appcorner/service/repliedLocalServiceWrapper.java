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

package com.chola.appcorner.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link repliedLocalService}.
 *
 * @author CloverLiferay02
 * @see repliedLocalService
 * @generated
 */
@ProviderType
public class repliedLocalServiceWrapper implements repliedLocalService,
	ServiceWrapper<repliedLocalService> {
	public repliedLocalServiceWrapper(repliedLocalService repliedLocalService) {
		_repliedLocalService = repliedLocalService;
	}

	/**
	* Adds the replied to the database. Also notifies the appropriate model listeners.
	*
	* @param replied the replied
	* @return the replied that was added
	*/
	@Override
	public com.chola.appcorner.model.replied addreplied(
		com.chola.appcorner.model.replied replied) {
		return _repliedLocalService.addreplied(replied);
	}

	/**
	* Creates a new replied with the primary key. Does not add the replied to the database.
	*
	* @param id the primary key for the new replied
	* @return the new replied
	*/
	@Override
	public com.chola.appcorner.model.replied createreplied(long id) {
		return _repliedLocalService.createreplied(id);
	}

	/**
	* Deletes the replied from the database. Also notifies the appropriate model listeners.
	*
	* @param replied the replied
	* @return the replied that was removed
	*/
	@Override
	public com.chola.appcorner.model.replied deletereplied(
		com.chola.appcorner.model.replied replied) {
		return _repliedLocalService.deletereplied(replied);
	}

	/**
	* Deletes the replied with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the replied
	* @return the replied that was removed
	* @throws PortalException if a replied with the primary key could not be found
	*/
	@Override
	public com.chola.appcorner.model.replied deletereplied(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _repliedLocalService.deletereplied(id);
	}

	@Override
	public com.chola.appcorner.model.replied fetchreplied(long id) {
		return _repliedLocalService.fetchreplied(id);
	}

	/**
	* Returns the replied with the primary key.
	*
	* @param id the primary key of the replied
	* @return the replied
	* @throws PortalException if a replied with the primary key could not be found
	*/
	@Override
	public com.chola.appcorner.model.replied getreplied(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _repliedLocalService.getreplied(id);
	}

	/**
	* Updates the replied in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param replied the replied
	* @return the replied that was updated
	*/
	@Override
	public com.chola.appcorner.model.replied updatereplied(
		com.chola.appcorner.model.replied replied) {
		return _repliedLocalService.updatereplied(replied);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _repliedLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _repliedLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _repliedLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _repliedLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _repliedLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of replieds.
	*
	* @return the number of replieds
	*/
	@Override
	public int getrepliedsCount() {
		return _repliedLocalService.getrepliedsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _repliedLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _repliedLocalService.getOSGiServiceIdentifier();
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
		return _repliedLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.appcorner.model.impl.repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _repliedLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.appcorner.model.impl.repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _repliedLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.chola.appcorner.model.replied> getRepliedData(
		long postId) {
		return _repliedLocalService.getRepliedData(postId);
	}

	/**
	* Returns a range of all the replieds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.appcorner.model.impl.repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of replieds
	* @param end the upper bound of the range of replieds (not inclusive)
	* @return the range of replieds
	*/
	@Override
	public java.util.List<com.chola.appcorner.model.replied> getreplieds(
		int start, int end) {
		return _repliedLocalService.getreplieds(start, end);
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
		return _repliedLocalService.dynamicQueryCount(dynamicQuery);
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
		return _repliedLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public repliedLocalService getWrappedService() {
		return _repliedLocalService;
	}

	@Override
	public void setWrappedService(repliedLocalService repliedLocalService) {
		_repliedLocalService = repliedLocalService;
	}

	private repliedLocalService _repliedLocalService;
}