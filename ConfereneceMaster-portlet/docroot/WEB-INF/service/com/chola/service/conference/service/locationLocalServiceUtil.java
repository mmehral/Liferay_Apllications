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

package com.chola.service.conference.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for location. This utility wraps
 * {@link com.chola.service.conference.service.impl.locationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author adms.java1
 * @see locationLocalService
 * @see com.chola.service.conference.service.base.locationLocalServiceBaseImpl
 * @see com.chola.service.conference.service.impl.locationLocalServiceImpl
 * @generated
 */
@ProviderType
public class locationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.chola.service.conference.service.impl.locationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the location to the database. Also notifies the appropriate model listeners.
	*
	* @param location the location
	* @return the location that was added
	*/
	public static com.chola.service.conference.model.location addlocation(
		com.chola.service.conference.model.location location) {
		return getService().addlocation(location);
	}

	/**
	* Creates a new location with the primary key. Does not add the location to the database.
	*
	* @param location_id the primary key for the new location
	* @return the new location
	*/
	public static com.chola.service.conference.model.location createlocation(
		long location_id) {
		return getService().createlocation(location_id);
	}

	/**
	* Deletes the location from the database. Also notifies the appropriate model listeners.
	*
	* @param location the location
	* @return the location that was removed
	*/
	public static com.chola.service.conference.model.location deletelocation(
		com.chola.service.conference.model.location location) {
		return getService().deletelocation(location);
	}

	/**
	* Deletes the location with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param location_id the primary key of the location
	* @return the location that was removed
	* @throws PortalException if a location with the primary key could not be found
	*/
	public static com.chola.service.conference.model.location deletelocation(
		long location_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletelocation(location_id);
	}

	public static com.chola.service.conference.model.location fetchlocation(
		long location_id) {
		return getService().fetchlocation(location_id);
	}

	/**
	* Returns the location with the primary key.
	*
	* @param location_id the primary key of the location
	* @return the location
	* @throws PortalException if a location with the primary key could not be found
	*/
	public static com.chola.service.conference.model.location getlocation(
		long location_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getlocation(location_id);
	}

	/**
	* Updates the location in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param location the location
	* @return the location that was updated
	*/
	public static com.chola.service.conference.model.location updatelocation(
		com.chola.service.conference.model.location location) {
		return getService().updatelocation(location);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of locations.
	*
	* @return the number of locations
	*/
	public static int getlocationsCount() {
		return getService().getlocationsCount();
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.lang.String getStatename(long stateId) {
		return getService().getStatename(stateId);
	}

	public static java.lang.String getfloorname(long floorId) {
		return getService().getfloorname(floorId);
	}

	public static java.lang.String getlocationname(long locationId) {
		return getService().getlocationname(locationId);
	}

	public static java.lang.String getroomvalues(long roomId) {
		return getService().getroomvalues(roomId);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.service.conference.model.impl.locationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.service.conference.model.impl.locationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<java.lang.String> getState() {
		return getService().getState();
	}

	public static java.util.List<java.lang.String> getfloorname() {
		return getService().getfloorname();
	}

	/**
	* Returns a range of all the locations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.service.conference.model.impl.locationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of locations
	* @param end the upper bound of the range of locations (not inclusive)
	* @return the range of locations
	*/
	public static java.util.List<com.chola.service.conference.model.location> getlocations(
		int start, int end) {
		return getService().getlocations(start, end);
	}

	public static java.util.List<java.lang.String> getlocations(long stateID) {
		return getService().getlocations(stateID);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static void clearService() {
		_service = null;
	}

	public static locationLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					locationLocalService.class.getName());

			if (invokableLocalService instanceof locationLocalService) {
				_service = (locationLocalService)invokableLocalService;
			}
			else {
				_service = new locationLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(locationLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static locationLocalService _service;
}