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

package com.usertheme.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link themecolorLocalService}.
 *
 * @author CloverLiferay02
 * @see themecolorLocalService
 * @generated
 */
@ProviderType
public class themecolorLocalServiceWrapper implements themecolorLocalService,
	ServiceWrapper<themecolorLocalService> {
	public themecolorLocalServiceWrapper(
		themecolorLocalService themecolorLocalService) {
		_themecolorLocalService = themecolorLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _themecolorLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _themecolorLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _themecolorLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _themecolorLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _themecolorLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the themecolor to the database. Also notifies the appropriate model listeners.
	*
	* @param themecolor the themecolor
	* @return the themecolor that was added
	*/
	@Override
	public com.usertheme.model.themecolor addthemecolor(
		com.usertheme.model.themecolor themecolor) {
		return _themecolorLocalService.addthemecolor(themecolor);
	}

	/**
	* Creates a new themecolor with the primary key. Does not add the themecolor to the database.
	*
	* @param id the primary key for the new themecolor
	* @return the new themecolor
	*/
	@Override
	public com.usertheme.model.themecolor createthemecolor(long id) {
		return _themecolorLocalService.createthemecolor(id);
	}

	/**
	* Deletes the themecolor from the database. Also notifies the appropriate model listeners.
	*
	* @param themecolor the themecolor
	* @return the themecolor that was removed
	*/
	@Override
	public com.usertheme.model.themecolor deletethemecolor(
		com.usertheme.model.themecolor themecolor) {
		return _themecolorLocalService.deletethemecolor(themecolor);
	}

	/**
	* Deletes the themecolor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the themecolor
	* @return the themecolor that was removed
	* @throws PortalException if a themecolor with the primary key could not be found
	*/
	@Override
	public com.usertheme.model.themecolor deletethemecolor(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _themecolorLocalService.deletethemecolor(id);
	}

	@Override
	public com.usertheme.model.themecolor fetchthemecolor(long id) {
		return _themecolorLocalService.fetchthemecolor(id);
	}

	/**
	* Returns the themecolor with the primary key.
	*
	* @param id the primary key of the themecolor
	* @return the themecolor
	* @throws PortalException if a themecolor with the primary key could not be found
	*/
	@Override
	public com.usertheme.model.themecolor getthemecolor(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _themecolorLocalService.getthemecolor(id);
	}

	/**
	* Updates the themecolor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param themecolor the themecolor
	* @return the themecolor that was updated
	*/
	@Override
	public com.usertheme.model.themecolor updatethemecolor(
		com.usertheme.model.themecolor themecolor) {
		return _themecolorLocalService.updatethemecolor(themecolor);
	}

	/**
	* Returns the number of themecolors.
	*
	* @return the number of themecolors
	*/
	@Override
	public int getthemecolorsCount() {
		return _themecolorLocalService.getthemecolorsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _themecolorLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _themecolorLocalService.getOSGiServiceIdentifier();
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
		return _themecolorLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.usertheme.model.impl.themecolorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _themecolorLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.usertheme.model.impl.themecolorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _themecolorLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List getEmpData(java.lang.String empId) {
		return _themecolorLocalService.getEmpData(empId);
	}

	/**
	* Returns a range of all the themecolors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.usertheme.model.impl.themecolorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of themecolors
	* @param end the upper bound of the range of themecolors (not inclusive)
	* @return the range of themecolors
	*/
	@Override
	public java.util.List<com.usertheme.model.themecolor> getthemecolors(
		int start, int end) {
		return _themecolorLocalService.getthemecolors(start, end);
	}

	@Override
	public java.util.List<com.usertheme.model.themecolor> themeFinder(
		java.lang.String userId) {
		return _themecolorLocalService.themeFinder(userId);
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
		return _themecolorLocalService.dynamicQueryCount(dynamicQuery);
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
		return _themecolorLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public themecolorLocalService getWrappedService() {
		return _themecolorLocalService;
	}

	@Override
	public void setWrappedService(themecolorLocalService themecolorLocalService) {
		_themecolorLocalService = themecolorLocalService;
	}

	private themecolorLocalService _themecolorLocalService;
}