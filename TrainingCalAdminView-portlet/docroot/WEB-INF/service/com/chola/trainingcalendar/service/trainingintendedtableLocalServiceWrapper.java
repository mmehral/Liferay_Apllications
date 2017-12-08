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
 * Provides a wrapper for {@link trainingintendedtableLocalService}.
 *
 * @author CloverLiferay01
 * @see trainingintendedtableLocalService
 * @generated
 */
@ProviderType
public class trainingintendedtableLocalServiceWrapper
	implements trainingintendedtableLocalService,
		ServiceWrapper<trainingintendedtableLocalService> {
	public trainingintendedtableLocalServiceWrapper(
		trainingintendedtableLocalService trainingintendedtableLocalService) {
		_trainingintendedtableLocalService = trainingintendedtableLocalService;
	}

	/**
	* Adds the trainingintendedtable to the database. Also notifies the appropriate model listeners.
	*
	* @param trainingintendedtable the trainingintendedtable
	* @return the trainingintendedtable that was added
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingintendedtable addtrainingintendedtable(
		com.chola.trainingcalendar.model.trainingintendedtable trainingintendedtable) {
		return _trainingintendedtableLocalService.addtrainingintendedtable(trainingintendedtable);
	}

	/**
	* Creates a new trainingintendedtable with the primary key. Does not add the trainingintendedtable to the database.
	*
	* @param id the primary key for the new trainingintendedtable
	* @return the new trainingintendedtable
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingintendedtable createtrainingintendedtable(
		long id) {
		return _trainingintendedtableLocalService.createtrainingintendedtable(id);
	}

	/**
	* Deletes the trainingintendedtable from the database. Also notifies the appropriate model listeners.
	*
	* @param trainingintendedtable the trainingintendedtable
	* @return the trainingintendedtable that was removed
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingintendedtable deletetrainingintendedtable(
		com.chola.trainingcalendar.model.trainingintendedtable trainingintendedtable) {
		return _trainingintendedtableLocalService.deletetrainingintendedtable(trainingintendedtable);
	}

	/**
	* Deletes the trainingintendedtable with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the trainingintendedtable
	* @return the trainingintendedtable that was removed
	* @throws PortalException if a trainingintendedtable with the primary key could not be found
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingintendedtable deletetrainingintendedtable(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _trainingintendedtableLocalService.deletetrainingintendedtable(id);
	}

	@Override
	public com.chola.trainingcalendar.model.trainingintendedtable fetchtrainingintendedtable(
		long id) {
		return _trainingintendedtableLocalService.fetchtrainingintendedtable(id);
	}

	/**
	* Returns the trainingintendedtable with the primary key.
	*
	* @param id the primary key of the trainingintendedtable
	* @return the trainingintendedtable
	* @throws PortalException if a trainingintendedtable with the primary key could not be found
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingintendedtable gettrainingintendedtable(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _trainingintendedtableLocalService.gettrainingintendedtable(id);
	}

	/**
	* Updates the trainingintendedtable in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param trainingintendedtable the trainingintendedtable
	* @return the trainingintendedtable that was updated
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingintendedtable updatetrainingintendedtable(
		com.chola.trainingcalendar.model.trainingintendedtable trainingintendedtable) {
		return _trainingintendedtableLocalService.updatetrainingintendedtable(trainingintendedtable);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _trainingintendedtableLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _trainingintendedtableLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _trainingintendedtableLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _trainingintendedtableLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _trainingintendedtableLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of trainingintendedtables.
	*
	* @return the number of trainingintendedtables
	*/
	@Override
	public int gettrainingintendedtablesCount() {
		return _trainingintendedtableLocalService.gettrainingintendedtablesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _trainingintendedtableLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _trainingintendedtableLocalService.getOSGiServiceIdentifier();
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
		return _trainingintendedtableLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.trainingcalendar.model.impl.trainingintendedtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _trainingintendedtableLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.trainingcalendar.model.impl.trainingintendedtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _trainingintendedtableLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the trainingintendedtables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.trainingcalendar.model.impl.trainingintendedtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingintendedtables
	* @param end the upper bound of the range of trainingintendedtables (not inclusive)
	* @return the range of trainingintendedtables
	*/
	@Override
	public java.util.List<com.chola.trainingcalendar.model.trainingintendedtable> gettrainingintendedtables(
		int start, int end) {
		return _trainingintendedtableLocalService.gettrainingintendedtables(start,
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
		return _trainingintendedtableLocalService.dynamicQueryCount(dynamicQuery);
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
		return _trainingintendedtableLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public trainingintendedtableLocalService getWrappedService() {
		return _trainingintendedtableLocalService;
	}

	@Override
	public void setWrappedService(
		trainingintendedtableLocalService trainingintendedtableLocalService) {
		_trainingintendedtableLocalService = trainingintendedtableLocalService;
	}

	private trainingintendedtableLocalService _trainingintendedtableLocalService;
}