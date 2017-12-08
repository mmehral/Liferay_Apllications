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

package com.chola.knowledgebites.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for kbpath. This utility wraps
 * {@link com.chola.knowledgebites.service.impl.kbpathLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author cloverliferay01
 * @see kbpathLocalService
 * @see com.chola.knowledgebites.service.base.kbpathLocalServiceBaseImpl
 * @see com.chola.knowledgebites.service.impl.kbpathLocalServiceImpl
 * @generated
 */
@ProviderType
public class kbpathLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.chola.knowledgebites.service.impl.kbpathLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the kbpath to the database. Also notifies the appropriate model listeners.
	*
	* @param kbpath the kbpath
	* @return the kbpath that was added
	*/
	public static com.chola.knowledgebites.model.kbpath addkbpath(
		com.chola.knowledgebites.model.kbpath kbpath) {
		return getService().addkbpath(kbpath);
	}

	/**
	* Creates a new kbpath with the primary key. Does not add the kbpath to the database.
	*
	* @param id the primary key for the new kbpath
	* @return the new kbpath
	*/
	public static com.chola.knowledgebites.model.kbpath createkbpath(long id) {
		return getService().createkbpath(id);
	}

	/**
	* Deletes the kbpath from the database. Also notifies the appropriate model listeners.
	*
	* @param kbpath the kbpath
	* @return the kbpath that was removed
	*/
	public static com.chola.knowledgebites.model.kbpath deletekbpath(
		com.chola.knowledgebites.model.kbpath kbpath) {
		return getService().deletekbpath(kbpath);
	}

	/**
	* Deletes the kbpath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the kbpath
	* @return the kbpath that was removed
	* @throws PortalException if a kbpath with the primary key could not be found
	*/
	public static com.chola.knowledgebites.model.kbpath deletekbpath(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletekbpath(id);
	}

	public static com.chola.knowledgebites.model.kbpath fetchkbpath(long id) {
		return getService().fetchkbpath(id);
	}

	/**
	* Returns the kbpath with the primary key.
	*
	* @param id the primary key of the kbpath
	* @return the kbpath
	* @throws PortalException if a kbpath with the primary key could not be found
	*/
	public static com.chola.knowledgebites.model.kbpath getkbpath(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getkbpath(id);
	}

	/**
	* Updates the kbpath in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param kbpath the kbpath
	* @return the kbpath that was updated
	*/
	public static com.chola.knowledgebites.model.kbpath updatekbpath(
		com.chola.knowledgebites.model.kbpath kbpath) {
		return getService().updatekbpath(kbpath);
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
	* Returns the number of kbpaths.
	*
	* @return the number of kbpaths
	*/
	public static int getkbpathsCount() {
		return getService().getkbpathsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.knowledgebites.model.impl.kbpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.knowledgebites.model.impl.kbpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.chola.knowledgebites.model.kbpath> getKBDetails(
		long contentId) {
		return getService().getKBDetails(contentId);
	}

	/**
	* Returns a range of all the kbpaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.knowledgebites.model.impl.kbpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kbpaths
	* @param end the upper bound of the range of kbpaths (not inclusive)
	* @return the range of kbpaths
	*/
	public static java.util.List<com.chola.knowledgebites.model.kbpath> getkbpaths(
		int start, int end) {
		return getService().getkbpaths(start, end);
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

	public static kbpathLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					kbpathLocalService.class.getName());

			if (invokableLocalService instanceof kbpathLocalService) {
				_service = (kbpathLocalService)invokableLocalService;
			}
			else {
				_service = new kbpathLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(kbpathLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static kbpathLocalService _service;
}