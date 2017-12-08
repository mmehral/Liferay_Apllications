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

package com.popular.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for popularlinks. This utility wraps
 * {@link com.popular.service.impl.popularlinksLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CloverLiferay02
 * @see popularlinksLocalService
 * @see com.popular.service.base.popularlinksLocalServiceBaseImpl
 * @see com.popular.service.impl.popularlinksLocalServiceImpl
 * @generated
 */
@ProviderType
public class popularlinksLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.popular.service.impl.popularlinksLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static boolean findexternalurl(java.lang.String url, long userid) {
		return getService().findexternalurl(url, userid);
	}

	public static boolean findurl(java.lang.String url, long userid) {
		return getService().findurl(url, userid);
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
	* Adds the popularlinks to the database. Also notifies the appropriate model listeners.
	*
	* @param popularlinks the popularlinks
	* @return the popularlinks that was added
	*/
	public static com.popular.model.popularlinks addpopularlinks(
		com.popular.model.popularlinks popularlinks) {
		return getService().addpopularlinks(popularlinks);
	}

	/**
	* Creates a new popularlinks with the primary key. Does not add the popularlinks to the database.
	*
	* @param id the primary key for the new popularlinks
	* @return the new popularlinks
	*/
	public static com.popular.model.popularlinks createpopularlinks(long id) {
		return getService().createpopularlinks(id);
	}

	/**
	* Deletes the popularlinks from the database. Also notifies the appropriate model listeners.
	*
	* @param popularlinks the popularlinks
	* @return the popularlinks that was removed
	*/
	public static com.popular.model.popularlinks deletepopularlinks(
		com.popular.model.popularlinks popularlinks) {
		return getService().deletepopularlinks(popularlinks);
	}

	/**
	* Deletes the popularlinks with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the popularlinks
	* @return the popularlinks that was removed
	* @throws PortalException if a popularlinks with the primary key could not be found
	*/
	public static com.popular.model.popularlinks deletepopularlinks(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletepopularlinks(id);
	}

	public static com.popular.model.popularlinks fetchpopularlinks(long id) {
		return getService().fetchpopularlinks(id);
	}

	/**
	* Returns the popularlinks with the primary key.
	*
	* @param id the primary key of the popularlinks
	* @return the popularlinks
	* @throws PortalException if a popularlinks with the primary key could not be found
	*/
	public static com.popular.model.popularlinks getpopularlinks(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getpopularlinks(id);
	}

	/**
	* Updates the popularlinks in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param popularlinks the popularlinks
	* @return the popularlinks that was updated
	*/
	public static com.popular.model.popularlinks updatepopularlinks(
		com.popular.model.popularlinks popularlinks) {
		return getService().updatepopularlinks(popularlinks);
	}

	/**
	* Returns the number of popularlinkses.
	*
	* @return the number of popularlinkses
	*/
	public static int getpopularlinksesCount() {
		return getService().getpopularlinksesCount();
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.lang.Object[] getcount(java.lang.String url, long userid) {
		return getService().getcount(url, userid);
	}

	public static java.lang.String externalurl(java.lang.String url) {
		return getService().externalurl(url);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.popular.model.impl.popularlinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.popular.model.impl.popularlinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<java.lang.Object[]> getExtLinks() {
		return getService().getExtLinks();
	}

	public static java.util.List<java.lang.Object[]> getExternallinks(
		long userid) {
		return getService().getExternallinks(userid);
	}

	public static java.util.List<java.lang.Object[]> getinternallinks(
		long userid) {
		return getService().getinternallinks(userid);
	}

	/**
	* Returns a range of all the popularlinkses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.popular.model.impl.popularlinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of popularlinkses
	* @param end the upper bound of the range of popularlinkses (not inclusive)
	* @return the range of popularlinkses
	*/
	public static java.util.List<com.popular.model.popularlinks> getpopularlinkses(
		int start, int end) {
		return getService().getpopularlinkses(start, end);
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

	public static popularlinksLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					popularlinksLocalService.class.getName());

			if (invokableLocalService instanceof popularlinksLocalService) {
				_service = (popularlinksLocalService)invokableLocalService;
			}
			else {
				_service = new popularlinksLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(popularlinksLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static popularlinksLocalService _service;
}