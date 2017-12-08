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

package com.chola.trainingcalendar.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link trainingcalendardataLocalService}.
 *
 * @author CloverLiferay01
 * @see trainingcalendardataLocalService
 * @generated
 */
@ProviderType
public class trainingcalendardataLocalServiceWrapper
	implements trainingcalendardataLocalService,
		ServiceWrapper<trainingcalendardataLocalService> {
	public trainingcalendardataLocalServiceWrapper(
		trainingcalendardataLocalService trainingcalendardataLocalService) {
		_trainingcalendardataLocalService = trainingcalendardataLocalService;
	}

	/**
	* Adds the trainingcalendardata to the database. Also notifies the appropriate model listeners.
	*
	* @param trainingcalendardata the trainingcalendardata
	* @return the trainingcalendardata that was added
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingcalendardata addtrainingcalendardata(
		com.chola.trainingcalendar.model.trainingcalendardata trainingcalendardata) {
		return _trainingcalendardataLocalService.addtrainingcalendardata(trainingcalendardata);
	}

	/**
	* Creates a new trainingcalendardata with the primary key. Does not add the trainingcalendardata to the database.
	*
	* @param id the primary key for the new trainingcalendardata
	* @return the new trainingcalendardata
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingcalendardata createtrainingcalendardata(
		long id) {
		return _trainingcalendardataLocalService.createtrainingcalendardata(id);
	}

	/**
	* Deletes the trainingcalendardata from the database. Also notifies the appropriate model listeners.
	*
	* @param trainingcalendardata the trainingcalendardata
	* @return the trainingcalendardata that was removed
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingcalendardata deletetrainingcalendardata(
		com.chola.trainingcalendar.model.trainingcalendardata trainingcalendardata) {
		return _trainingcalendardataLocalService.deletetrainingcalendardata(trainingcalendardata);
	}

	/**
	* Deletes the trainingcalendardata with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the trainingcalendardata
	* @return the trainingcalendardata that was removed
	* @throws PortalException if a trainingcalendardata with the primary key could not be found
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingcalendardata deletetrainingcalendardata(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _trainingcalendardataLocalService.deletetrainingcalendardata(id);
	}

	@Override
	public com.chola.trainingcalendar.model.trainingcalendardata fetchtrainingcalendardata(
		long id) {
		return _trainingcalendardataLocalService.fetchtrainingcalendardata(id);
	}

	/**
	* Returns the trainingcalendardata with the primary key.
	*
	* @param id the primary key of the trainingcalendardata
	* @return the trainingcalendardata
	* @throws PortalException if a trainingcalendardata with the primary key could not be found
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingcalendardata gettrainingcalendardata(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _trainingcalendardataLocalService.gettrainingcalendardata(id);
	}

	/**
	* Updates the trainingcalendardata in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param trainingcalendardata the trainingcalendardata
	* @return the trainingcalendardata that was updated
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingcalendardata updatetrainingcalendardata(
		com.chola.trainingcalendar.model.trainingcalendardata trainingcalendardata) {
		return _trainingcalendardataLocalService.updatetrainingcalendardata(trainingcalendardata);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _trainingcalendardataLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _trainingcalendardataLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _trainingcalendardataLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _trainingcalendardataLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _trainingcalendardataLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of trainingcalendardatas.
	*
	* @return the number of trainingcalendardatas
	*/
	@Override
	public int gettrainingcalendardatasCount() {
		return _trainingcalendardataLocalService.gettrainingcalendardatasCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _trainingcalendardataLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _trainingcalendardataLocalService.getOSGiServiceIdentifier();
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
		return _trainingcalendardataLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.trainingcalendar.model.impl.trainingcalendardataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _trainingcalendardataLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.trainingcalendar.model.impl.trainingcalendardataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _trainingcalendardataLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the trainingcalendardatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.trainingcalendar.model.impl.trainingcalendardataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcalendardatas
	* @param end the upper bound of the range of trainingcalendardatas (not inclusive)
	* @return the range of trainingcalendardatas
	*/
	@Override
	public java.util.List<com.chola.trainingcalendar.model.trainingcalendardata> gettrainingcalendardatas(
		int start, int end) {
		return _trainingcalendardataLocalService.gettrainingcalendardatas(start,
			end);
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
		return _trainingcalendardataLocalService.dynamicQueryCount(dynamicQuery);
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
		return _trainingcalendardataLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public trainingcalendardataLocalService getWrappedService() {
		return _trainingcalendardataLocalService;
	}

	@Override
	public void setWrappedService(
		trainingcalendardataLocalService trainingcalendardataLocalService) {
		_trainingcalendardataLocalService = trainingcalendardataLocalService;
	}

	private trainingcalendardataLocalService _trainingcalendardataLocalService;
}