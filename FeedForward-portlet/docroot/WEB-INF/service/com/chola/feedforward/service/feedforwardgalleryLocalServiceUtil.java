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

package com.chola.feedforward.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for feedforwardgallery. This utility wraps
 * {@link com.chola.feedforward.service.impl.feedforwardgalleryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CloverLiferay02
 * @see feedforwardgalleryLocalService
 * @see com.chola.feedforward.service.base.feedforwardgalleryLocalServiceBaseImpl
 * @see com.chola.feedforward.service.impl.feedforwardgalleryLocalServiceImpl
 * @generated
 */
@ProviderType
public class feedforwardgalleryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.chola.feedforward.service.impl.feedforwardgalleryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the feedforwardgallery to the database. Also notifies the appropriate model listeners.
	*
	* @param feedforwardgallery the feedforwardgallery
	* @return the feedforwardgallery that was added
	*/
	public static com.chola.feedforward.model.feedforwardgallery addfeedforwardgallery(
		com.chola.feedforward.model.feedforwardgallery feedforwardgallery) {
		return getService().addfeedforwardgallery(feedforwardgallery);
	}

	/**
	* Creates a new feedforwardgallery with the primary key. Does not add the feedforwardgallery to the database.
	*
	* @param id the primary key for the new feedforwardgallery
	* @return the new feedforwardgallery
	*/
	public static com.chola.feedforward.model.feedforwardgallery createfeedforwardgallery(
		long id) {
		return getService().createfeedforwardgallery(id);
	}

	/**
	* Deletes the feedforwardgallery from the database. Also notifies the appropriate model listeners.
	*
	* @param feedforwardgallery the feedforwardgallery
	* @return the feedforwardgallery that was removed
	*/
	public static com.chola.feedforward.model.feedforwardgallery deletefeedforwardgallery(
		com.chola.feedforward.model.feedforwardgallery feedforwardgallery) {
		return getService().deletefeedforwardgallery(feedforwardgallery);
	}

	/**
	* Deletes the feedforwardgallery with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the feedforwardgallery
	* @return the feedforwardgallery that was removed
	* @throws PortalException if a feedforwardgallery with the primary key could not be found
	*/
	public static com.chola.feedforward.model.feedforwardgallery deletefeedforwardgallery(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletefeedforwardgallery(id);
	}

	public static com.chola.feedforward.model.feedforwardgallery fetchfeedforwardgallery(
		long id) {
		return getService().fetchfeedforwardgallery(id);
	}

	/**
	* Returns the feedforwardgallery with the primary key.
	*
	* @param id the primary key of the feedforwardgallery
	* @return the feedforwardgallery
	* @throws PortalException if a feedforwardgallery with the primary key could not be found
	*/
	public static com.chola.feedforward.model.feedforwardgallery getfeedforwardgallery(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getfeedforwardgallery(id);
	}

	/**
	* Updates the feedforwardgallery in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param feedforwardgallery the feedforwardgallery
	* @return the feedforwardgallery that was updated
	*/
	public static com.chola.feedforward.model.feedforwardgallery updatefeedforwardgallery(
		com.chola.feedforward.model.feedforwardgallery feedforwardgallery) {
		return getService().updatefeedforwardgallery(feedforwardgallery);
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
	* Returns the number of feedforwardgalleries.
	*
	* @return the number of feedforwardgalleries
	*/
	public static int getfeedforwardgalleriesCount() {
		return getService().getfeedforwardgalleriesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.feedforward.model.impl.feedforwardgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.feedforward.model.impl.feedforwardgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.chola.feedforward.model.feedforwardgallery> getFeedForwards(
		long content_id) {
		return getService().getFeedForwards(content_id);
	}

	/**
	* Returns a range of all the feedforwardgalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.feedforward.model.impl.feedforwardgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedforwardgalleries
	* @param end the upper bound of the range of feedforwardgalleries (not inclusive)
	* @return the range of feedforwardgalleries
	*/
	public static java.util.List<com.chola.feedforward.model.feedforwardgallery> getfeedforwardgalleries(
		int start, int end) {
		return getService().getfeedforwardgalleries(start, end);
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

	public static feedforwardgalleryLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					feedforwardgalleryLocalService.class.getName());

			if (invokableLocalService instanceof feedforwardgalleryLocalService) {
				_service = (feedforwardgalleryLocalService)invokableLocalService;
			}
			else {
				_service = new feedforwardgalleryLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(feedforwardgalleryLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static feedforwardgalleryLocalService _service;
}