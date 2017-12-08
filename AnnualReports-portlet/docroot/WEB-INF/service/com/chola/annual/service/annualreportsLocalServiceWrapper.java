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

package com.chola.annual.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link annualreportsLocalService}.
 *
 * @author CloverLiferay02
 * @see annualreportsLocalService
 * @generated
 */
@ProviderType
public class annualreportsLocalServiceWrapper
	implements annualreportsLocalService,
		ServiceWrapper<annualreportsLocalService> {
	public annualreportsLocalServiceWrapper(
		annualreportsLocalService annualreportsLocalService) {
		_annualreportsLocalService = annualreportsLocalService;
	}

	/**
	* Adds the annualreports to the database. Also notifies the appropriate model listeners.
	*
	* @param annualreports the annualreports
	* @return the annualreports that was added
	*/
	@Override
	public com.chola.annual.model.annualreports addannualreports(
		com.chola.annual.model.annualreports annualreports) {
		return _annualreportsLocalService.addannualreports(annualreports);
	}

	/**
	* Creates a new annualreports with the primary key. Does not add the annualreports to the database.
	*
	* @param id the primary key for the new annualreports
	* @return the new annualreports
	*/
	@Override
	public com.chola.annual.model.annualreports createannualreports(long id) {
		return _annualreportsLocalService.createannualreports(id);
	}

	/**
	* Deletes the annualreports from the database. Also notifies the appropriate model listeners.
	*
	* @param annualreports the annualreports
	* @return the annualreports that was removed
	*/
	@Override
	public com.chola.annual.model.annualreports deleteannualreports(
		com.chola.annual.model.annualreports annualreports) {
		return _annualreportsLocalService.deleteannualreports(annualreports);
	}

	/**
	* Deletes the annualreports with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the annualreports
	* @return the annualreports that was removed
	* @throws PortalException if a annualreports with the primary key could not be found
	*/
	@Override
	public com.chola.annual.model.annualreports deleteannualreports(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _annualreportsLocalService.deleteannualreports(id);
	}

	@Override
	public com.chola.annual.model.annualreports fetchannualreports(long id) {
		return _annualreportsLocalService.fetchannualreports(id);
	}

	/**
	* Returns the annualreports with the primary key.
	*
	* @param id the primary key of the annualreports
	* @return the annualreports
	* @throws PortalException if a annualreports with the primary key could not be found
	*/
	@Override
	public com.chola.annual.model.annualreports getannualreports(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _annualreportsLocalService.getannualreports(id);
	}

	/**
	* Updates the annualreports in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param annualreports the annualreports
	* @return the annualreports that was updated
	*/
	@Override
	public com.chola.annual.model.annualreports updateannualreports(
		com.chola.annual.model.annualreports annualreports) {
		return _annualreportsLocalService.updateannualreports(annualreports);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _annualreportsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _annualreportsLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _annualreportsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _annualreportsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _annualreportsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of annualreportses.
	*
	* @return the number of annualreportses
	*/
	@Override
	public int getannualreportsesCount() {
		return _annualreportsLocalService.getannualreportsesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _annualreportsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _annualreportsLocalService.getOSGiServiceIdentifier();
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
		return _annualreportsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.annual.model.impl.annualreportsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _annualreportsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.annual.model.impl.annualreportsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _annualreportsLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the annualreportses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.annual.model.impl.annualreportsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of annualreportses
	* @param end the upper bound of the range of annualreportses (not inclusive)
	* @return the range of annualreportses
	*/
	@Override
	public java.util.List<com.chola.annual.model.annualreports> getannualreportses(
		int start, int end) {
		return _annualreportsLocalService.getannualreportses(start, end);
	}

	@Override
	public java.util.List<java.lang.String> getdata() {
		return _annualreportsLocalService.getdata();
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
		return _annualreportsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _annualreportsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public annualreportsLocalService getWrappedService() {
		return _annualreportsLocalService;
	}

	@Override
	public void setWrappedService(
		annualreportsLocalService annualreportsLocalService) {
		_annualreportsLocalService = annualreportsLocalService;
	}

	private annualreportsLocalService _annualreportsLocalService;
}