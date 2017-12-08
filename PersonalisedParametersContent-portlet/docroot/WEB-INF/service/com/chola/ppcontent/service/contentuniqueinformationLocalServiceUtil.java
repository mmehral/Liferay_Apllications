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

package com.chola.ppcontent.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for contentuniqueinformation. This utility wraps
 * {@link com.chola.ppcontent.service.impl.contentuniqueinformationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author cloverliferay01
 * @see contentuniqueinformationLocalService
 * @see com.chola.ppcontent.service.base.contentuniqueinformationLocalServiceBaseImpl
 * @see com.chola.ppcontent.service.impl.contentuniqueinformationLocalServiceImpl
 * @generated
 */
@ProviderType
public class contentuniqueinformationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.chola.ppcontent.service.impl.contentuniqueinformationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the contentuniqueinformation to the database. Also notifies the appropriate model listeners.
	*
	* @param contentuniqueinformation the contentuniqueinformation
	* @return the contentuniqueinformation that was added
	*/
	public static com.chola.ppcontent.model.contentuniqueinformation addcontentuniqueinformation(
		com.chola.ppcontent.model.contentuniqueinformation contentuniqueinformation) {
		return getService().addcontentuniqueinformation(contentuniqueinformation);
	}

	/**
	* Creates a new contentuniqueinformation with the primary key. Does not add the contentuniqueinformation to the database.
	*
	* @param id the primary key for the new contentuniqueinformation
	* @return the new contentuniqueinformation
	*/
	public static com.chola.ppcontent.model.contentuniqueinformation createcontentuniqueinformation(
		long id) {
		return getService().createcontentuniqueinformation(id);
	}

	/**
	* Deletes the contentuniqueinformation from the database. Also notifies the appropriate model listeners.
	*
	* @param contentuniqueinformation the contentuniqueinformation
	* @return the contentuniqueinformation that was removed
	*/
	public static com.chola.ppcontent.model.contentuniqueinformation deletecontentuniqueinformation(
		com.chola.ppcontent.model.contentuniqueinformation contentuniqueinformation) {
		return getService()
				   .deletecontentuniqueinformation(contentuniqueinformation);
	}

	/**
	* Deletes the contentuniqueinformation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the contentuniqueinformation
	* @return the contentuniqueinformation that was removed
	* @throws PortalException if a contentuniqueinformation with the primary key could not be found
	*/
	public static com.chola.ppcontent.model.contentuniqueinformation deletecontentuniqueinformation(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletecontentuniqueinformation(id);
	}

	public static com.chola.ppcontent.model.contentuniqueinformation fetchcontentuniqueinformation(
		long id) {
		return getService().fetchcontentuniqueinformation(id);
	}

	/**
	* Returns the contentuniqueinformation with the primary key.
	*
	* @param id the primary key of the contentuniqueinformation
	* @return the contentuniqueinformation
	* @throws PortalException if a contentuniqueinformation with the primary key could not be found
	*/
	public static com.chola.ppcontent.model.contentuniqueinformation getcontentuniqueinformation(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getcontentuniqueinformation(id);
	}

	/**
	* Updates the contentuniqueinformation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param contentuniqueinformation the contentuniqueinformation
	* @return the contentuniqueinformation that was updated
	*/
	public static com.chola.ppcontent.model.contentuniqueinformation updatecontentuniqueinformation(
		com.chola.ppcontent.model.contentuniqueinformation contentuniqueinformation) {
		return getService()
				   .updatecontentuniqueinformation(contentuniqueinformation);
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
	* Returns the number of contentuniqueinformations.
	*
	* @return the number of contentuniqueinformations
	*/
	public static int getcontentuniqueinformationsCount() {
		return getService().getcontentuniqueinformationsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.ppcontent.model.impl.contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.ppcontent.model.impl.contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.chola.ppcontent.model.contentuniqueinformation> getUniqueContentInfo(
		long contentId) {
		return getService().getUniqueContentInfo(contentId);
	}

	/**
	* Returns a range of all the contentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.ppcontent.model.impl.contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contentuniqueinformations
	* @param end the upper bound of the range of contentuniqueinformations (not inclusive)
	* @return the range of contentuniqueinformations
	*/
	public static java.util.List<com.chola.ppcontent.model.contentuniqueinformation> getcontentuniqueinformations(
		int start, int end) {
		return getService().getcontentuniqueinformations(start, end);
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

	public static contentuniqueinformationLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					contentuniqueinformationLocalService.class.getName());

			if (invokableLocalService instanceof contentuniqueinformationLocalService) {
				_service = (contentuniqueinformationLocalService)invokableLocalService;
			}
			else {
				_service = new contentuniqueinformationLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(contentuniqueinformationLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static contentuniqueinformationLocalService _service;
}