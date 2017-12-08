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

package com.chola.imagegallery.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for imagegallerypath. This utility wraps
 * {@link com.chola.imagegallery.service.impl.imagegallerypathLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CloverLiferay02
 * @see imagegallerypathLocalService
 * @see com.chola.imagegallery.service.base.imagegallerypathLocalServiceBaseImpl
 * @see com.chola.imagegallery.service.impl.imagegallerypathLocalServiceImpl
 * @generated
 */
@ProviderType
public class imagegallerypathLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.chola.imagegallery.service.impl.imagegallerypathLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the imagegallerypath to the database. Also notifies the appropriate model listeners.
	*
	* @param imagegallerypath the imagegallerypath
	* @return the imagegallerypath that was added
	*/
	public static com.chola.imagegallery.model.imagegallerypath addimagegallerypath(
		com.chola.imagegallery.model.imagegallerypath imagegallerypath) {
		return getService().addimagegallerypath(imagegallerypath);
	}

	/**
	* Creates a new imagegallerypath with the primary key. Does not add the imagegallerypath to the database.
	*
	* @param id the primary key for the new imagegallerypath
	* @return the new imagegallerypath
	*/
	public static com.chola.imagegallery.model.imagegallerypath createimagegallerypath(
		long id) {
		return getService().createimagegallerypath(id);
	}

	/**
	* Deletes the imagegallerypath from the database. Also notifies the appropriate model listeners.
	*
	* @param imagegallerypath the imagegallerypath
	* @return the imagegallerypath that was removed
	*/
	public static com.chola.imagegallery.model.imagegallerypath deleteimagegallerypath(
		com.chola.imagegallery.model.imagegallerypath imagegallerypath) {
		return getService().deleteimagegallerypath(imagegallerypath);
	}

	/**
	* Deletes the imagegallerypath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the imagegallerypath
	* @return the imagegallerypath that was removed
	* @throws PortalException if a imagegallerypath with the primary key could not be found
	*/
	public static com.chola.imagegallery.model.imagegallerypath deleteimagegallerypath(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteimagegallerypath(id);
	}

	public static com.chola.imagegallery.model.imagegallerypath fetchimagegallerypath(
		long id) {
		return getService().fetchimagegallerypath(id);
	}

	/**
	* Returns the imagegallerypath with the primary key.
	*
	* @param id the primary key of the imagegallerypath
	* @return the imagegallerypath
	* @throws PortalException if a imagegallerypath with the primary key could not be found
	*/
	public static com.chola.imagegallery.model.imagegallerypath getimagegallerypath(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getimagegallerypath(id);
	}

	/**
	* Updates the imagegallerypath in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param imagegallerypath the imagegallerypath
	* @return the imagegallerypath that was updated
	*/
	public static com.chola.imagegallery.model.imagegallerypath updateimagegallerypath(
		com.chola.imagegallery.model.imagegallerypath imagegallerypath) {
		return getService().updateimagegallerypath(imagegallerypath);
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
	* Returns the number of imagegallerypaths.
	*
	* @return the number of imagegallerypaths
	*/
	public static int getimagegallerypathsCount() {
		return getService().getimagegallerypathsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.imagegallery.model.impl.imagegallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.imagegallery.model.impl.imagegallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.chola.imagegallery.model.imagegallerypath> getAlbumDetails(
		java.lang.String albumId) {
		return getService().getAlbumDetails(albumId);
	}

	/**
	* Returns a range of all the imagegallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.imagegallery.model.impl.imagegallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imagegallerypaths
	* @param end the upper bound of the range of imagegallerypaths (not inclusive)
	* @return the range of imagegallerypaths
	*/
	public static java.util.List<com.chola.imagegallery.model.imagegallerypath> getimagegallerypaths(
		int start, int end) {
		return getService().getimagegallerypaths(start, end);
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

	public static imagegallerypathLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					imagegallerypathLocalService.class.getName());

			if (invokableLocalService instanceof imagegallerypathLocalService) {
				_service = (imagegallerypathLocalService)invokableLocalService;
			}
			else {
				_service = new imagegallerypathLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(imagegallerypathLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static imagegallerypathLocalService _service;
}