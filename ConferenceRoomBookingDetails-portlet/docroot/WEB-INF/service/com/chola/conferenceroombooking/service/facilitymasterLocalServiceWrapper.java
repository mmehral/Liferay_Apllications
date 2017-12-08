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
 * Provides a wrapper for {@link facilitymasterLocalService}.
 *
 * @author adms.java1
 * @see facilitymasterLocalService
 * @generated
 */
@ProviderType
public class facilitymasterLocalServiceWrapper
	implements facilitymasterLocalService,
		ServiceWrapper<facilitymasterLocalService> {
	public facilitymasterLocalServiceWrapper(
		facilitymasterLocalService facilitymasterLocalService) {
		_facilitymasterLocalService = facilitymasterLocalService;
	}

	/**
	* Adds the facilitymaster to the database. Also notifies the appropriate model listeners.
	*
	* @param facilitymaster the facilitymaster
	* @return the facilitymaster that was added
	*/
	@Override
	public com.chola.conferenceroombooking.model.facilitymaster addfacilitymaster(
		com.chola.conferenceroombooking.model.facilitymaster facilitymaster) {
		return _facilitymasterLocalService.addfacilitymaster(facilitymaster);
	}

	/**
	* Creates a new facilitymaster with the primary key. Does not add the facilitymaster to the database.
	*
	* @param facility_id the primary key for the new facilitymaster
	* @return the new facilitymaster
	*/
	@Override
	public com.chola.conferenceroombooking.model.facilitymaster createfacilitymaster(
		long facility_id) {
		return _facilitymasterLocalService.createfacilitymaster(facility_id);
	}

	/**
	* Deletes the facilitymaster from the database. Also notifies the appropriate model listeners.
	*
	* @param facilitymaster the facilitymaster
	* @return the facilitymaster that was removed
	*/
	@Override
	public com.chola.conferenceroombooking.model.facilitymaster deletefacilitymaster(
		com.chola.conferenceroombooking.model.facilitymaster facilitymaster) {
		return _facilitymasterLocalService.deletefacilitymaster(facilitymaster);
	}

	/**
	* Deletes the facilitymaster with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param facility_id the primary key of the facilitymaster
	* @return the facilitymaster that was removed
	* @throws PortalException if a facilitymaster with the primary key could not be found
	*/
	@Override
	public com.chola.conferenceroombooking.model.facilitymaster deletefacilitymaster(
		long facility_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _facilitymasterLocalService.deletefacilitymaster(facility_id);
	}

	@Override
	public com.chola.conferenceroombooking.model.facilitymaster fetchfacilitymaster(
		long facility_id) {
		return _facilitymasterLocalService.fetchfacilitymaster(facility_id);
	}

	/**
	* Returns the facilitymaster with the primary key.
	*
	* @param facility_id the primary key of the facilitymaster
	* @return the facilitymaster
	* @throws PortalException if a facilitymaster with the primary key could not be found
	*/
	@Override
	public com.chola.conferenceroombooking.model.facilitymaster getfacilitymaster(
		long facility_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _facilitymasterLocalService.getfacilitymaster(facility_id);
	}

	/**
	* Updates the facilitymaster in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param facilitymaster the facilitymaster
	* @return the facilitymaster that was updated
	*/
	@Override
	public com.chola.conferenceroombooking.model.facilitymaster updatefacilitymaster(
		com.chola.conferenceroombooking.model.facilitymaster facilitymaster) {
		return _facilitymasterLocalService.updatefacilitymaster(facilitymaster);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _facilitymasterLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _facilitymasterLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _facilitymasterLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _facilitymasterLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _facilitymasterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of facilitymasters.
	*
	* @return the number of facilitymasters
	*/
	@Override
	public int getfacilitymastersCount() {
		return _facilitymasterLocalService.getfacilitymastersCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _facilitymasterLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _facilitymasterLocalService.getOSGiServiceIdentifier();
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
		return _facilitymasterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.conferenceroombooking.model.impl.facilitymasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _facilitymasterLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.conferenceroombooking.model.impl.facilitymasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _facilitymasterLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the facilitymasters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.conferenceroombooking.model.impl.facilitymasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of facilitymasters
	* @param end the upper bound of the range of facilitymasters (not inclusive)
	* @return the range of facilitymasters
	*/
	@Override
	public java.util.List<com.chola.conferenceroombooking.model.facilitymaster> getfacilitymasters(
		int start, int end) {
		return _facilitymasterLocalService.getfacilitymasters(start, end);
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
		return _facilitymasterLocalService.dynamicQueryCount(dynamicQuery);
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
		return _facilitymasterLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public facilitymasterLocalService getWrappedService() {
		return _facilitymasterLocalService;
	}

	@Override
	public void setWrappedService(
		facilitymasterLocalService facilitymasterLocalService) {
		_facilitymasterLocalService = facilitymasterLocalService;
	}

	private facilitymasterLocalService _facilitymasterLocalService;
}