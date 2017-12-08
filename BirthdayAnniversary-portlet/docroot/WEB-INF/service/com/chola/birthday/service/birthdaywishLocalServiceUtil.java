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

package com.chola.birthday.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for birthdaywish. This utility wraps
 * {@link com.chola.birthday.service.impl.birthdaywishLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CloverLiferay02
 * @see birthdaywishLocalService
 * @see com.chola.birthday.service.base.birthdaywishLocalServiceBaseImpl
 * @see com.chola.birthday.service.impl.birthdaywishLocalServiceImpl
 * @generated
 */
@ProviderType
public class birthdaywishLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.chola.birthday.service.impl.birthdaywishLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static boolean insertData(java.lang.String message,
		java.lang.String postedBy, java.lang.String empId) {
		return getService().insertData(message, postedBy, empId);
	}

	/**
	* Adds the birthdaywish to the database. Also notifies the appropriate model listeners.
	*
	* @param birthdaywish the birthdaywish
	* @return the birthdaywish that was added
	*/
	public static com.chola.birthday.model.birthdaywish addbirthdaywish(
		com.chola.birthday.model.birthdaywish birthdaywish) {
		return getService().addbirthdaywish(birthdaywish);
	}

	/**
	* Creates a new birthdaywish with the primary key. Does not add the birthdaywish to the database.
	*
	* @param id the primary key for the new birthdaywish
	* @return the new birthdaywish
	*/
	public static com.chola.birthday.model.birthdaywish createbirthdaywish(
		long id) {
		return getService().createbirthdaywish(id);
	}

	/**
	* Deletes the birthdaywish from the database. Also notifies the appropriate model listeners.
	*
	* @param birthdaywish the birthdaywish
	* @return the birthdaywish that was removed
	*/
	public static com.chola.birthday.model.birthdaywish deletebirthdaywish(
		com.chola.birthday.model.birthdaywish birthdaywish) {
		return getService().deletebirthdaywish(birthdaywish);
	}

	/**
	* Deletes the birthdaywish with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the birthdaywish
	* @return the birthdaywish that was removed
	* @throws PortalException if a birthdaywish with the primary key could not be found
	*/
	public static com.chola.birthday.model.birthdaywish deletebirthdaywish(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletebirthdaywish(id);
	}

	public static com.chola.birthday.model.birthdaywish fetchbirthdaywish(
		long id) {
		return getService().fetchbirthdaywish(id);
	}

	/**
	* Returns the birthdaywish with the primary key.
	*
	* @param id the primary key of the birthdaywish
	* @return the birthdaywish
	* @throws PortalException if a birthdaywish with the primary key could not be found
	*/
	public static com.chola.birthday.model.birthdaywish getbirthdaywish(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getbirthdaywish(id);
	}

	/**
	* Updates the birthdaywish in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param birthdaywish the birthdaywish
	* @return the birthdaywish that was updated
	*/
	public static com.chola.birthday.model.birthdaywish updatebirthdaywish(
		com.chola.birthday.model.birthdaywish birthdaywish) {
		return getService().updatebirthdaywish(birthdaywish);
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
	* Returns the number of birthdaywishs.
	*
	* @return the number of birthdaywishs
	*/
	public static int getbirthdaywishsCount() {
		return getService().getbirthdaywishsCount();
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

	public static java.util.List customFinder(java.lang.String userId) {
		return getService().customFinder(userId);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.birthday.model.impl.birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.birthday.model.impl.birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List getEmpData(java.lang.String date) {
		return getService().getEmpData(date);
	}

	public static java.util.List getEmpInfo(java.lang.String empId) {
		return getService().getEmpInfo(empId);
	}

	/**
	* Returns a range of all the birthdaywishs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.birthday.model.impl.birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of birthdaywishs
	* @param end the upper bound of the range of birthdaywishs (not inclusive)
	* @return the range of birthdaywishs
	*/
	public static java.util.List<com.chola.birthday.model.birthdaywish> getbirthdaywishs(
		int start, int end) {
		return getService().getbirthdaywishs(start, end);
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

	public static birthdaywishLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					birthdaywishLocalService.class.getName());

			if (invokableLocalService instanceof birthdaywishLocalService) {
				_service = (birthdaywishLocalService)invokableLocalService;
			}
			else {
				_service = new birthdaywishLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(birthdaywishLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static birthdaywishLocalService _service;
}