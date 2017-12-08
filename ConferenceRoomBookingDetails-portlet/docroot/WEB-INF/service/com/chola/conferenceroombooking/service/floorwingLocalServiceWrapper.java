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
 * Provides a wrapper for {@link floorwingLocalService}.
 *
 * @author adms.java1
 * @see floorwingLocalService
 * @generated
 */
@ProviderType
public class floorwingLocalServiceWrapper implements floorwingLocalService,
	ServiceWrapper<floorwingLocalService> {
	public floorwingLocalServiceWrapper(
		floorwingLocalService floorwingLocalService) {
		_floorwingLocalService = floorwingLocalService;
	}

	/**
	* Adds the floorwing to the database. Also notifies the appropriate model listeners.
	*
	* @param floorwing the floorwing
	* @return the floorwing that was added
	*/
	@Override
	public com.chola.conferenceroombooking.model.floorwing addfloorwing(
		com.chola.conferenceroombooking.model.floorwing floorwing) {
		return _floorwingLocalService.addfloorwing(floorwing);
	}

	/**
	* Creates a new floorwing with the primary key. Does not add the floorwing to the database.
	*
	* @param floorwing_id the primary key for the new floorwing
	* @return the new floorwing
	*/
	@Override
	public com.chola.conferenceroombooking.model.floorwing createfloorwing(
		long floorwing_id) {
		return _floorwingLocalService.createfloorwing(floorwing_id);
	}

	/**
	* Deletes the floorwing from the database. Also notifies the appropriate model listeners.
	*
	* @param floorwing the floorwing
	* @return the floorwing that was removed
	*/
	@Override
	public com.chola.conferenceroombooking.model.floorwing deletefloorwing(
		com.chola.conferenceroombooking.model.floorwing floorwing) {
		return _floorwingLocalService.deletefloorwing(floorwing);
	}

	/**
	* Deletes the floorwing with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param floorwing_id the primary key of the floorwing
	* @return the floorwing that was removed
	* @throws PortalException if a floorwing with the primary key could not be found
	*/
	@Override
	public com.chola.conferenceroombooking.model.floorwing deletefloorwing(
		long floorwing_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _floorwingLocalService.deletefloorwing(floorwing_id);
	}

	@Override
	public com.chola.conferenceroombooking.model.floorwing fetchfloorwing(
		long floorwing_id) {
		return _floorwingLocalService.fetchfloorwing(floorwing_id);
	}

	/**
	* Returns the floorwing with the primary key.
	*
	* @param floorwing_id the primary key of the floorwing
	* @return the floorwing
	* @throws PortalException if a floorwing with the primary key could not be found
	*/
	@Override
	public com.chola.conferenceroombooking.model.floorwing getfloorwing(
		long floorwing_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _floorwingLocalService.getfloorwing(floorwing_id);
	}

	/**
	* Updates the floorwing in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param floorwing the floorwing
	* @return the floorwing that was updated
	*/
	@Override
	public com.chola.conferenceroombooking.model.floorwing updatefloorwing(
		com.chola.conferenceroombooking.model.floorwing floorwing) {
		return _floorwingLocalService.updatefloorwing(floorwing);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _floorwingLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _floorwingLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _floorwingLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _floorwingLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _floorwingLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of floorwings.
	*
	* @return the number of floorwings
	*/
	@Override
	public int getfloorwingsCount() {
		return _floorwingLocalService.getfloorwingsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _floorwingLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _floorwingLocalService.getOSGiServiceIdentifier();
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
		return _floorwingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.conferenceroombooking.model.impl.floorwingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _floorwingLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.conferenceroombooking.model.impl.floorwingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _floorwingLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the floorwings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.conferenceroombooking.model.impl.floorwingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of floorwings
	* @param end the upper bound of the range of floorwings (not inclusive)
	* @return the range of floorwings
	*/
	@Override
	public java.util.List<com.chola.conferenceroombooking.model.floorwing> getfloorwings(
		int start, int end) {
		return _floorwingLocalService.getfloorwings(start, end);
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
		return _floorwingLocalService.dynamicQueryCount(dynamicQuery);
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
		return _floorwingLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public floorwingLocalService getWrappedService() {
		return _floorwingLocalService;
	}

	@Override
	public void setWrappedService(floorwingLocalService floorwingLocalService) {
		_floorwingLocalService = floorwingLocalService;
	}

	private floorwingLocalService _floorwingLocalService;
}