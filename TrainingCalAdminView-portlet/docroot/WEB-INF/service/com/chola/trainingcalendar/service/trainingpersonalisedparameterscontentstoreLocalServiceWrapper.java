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
 * Provides a wrapper for {@link trainingpersonalisedparameterscontentstoreLocalService}.
 *
 * @author CloverLiferay01
 * @see trainingpersonalisedparameterscontentstoreLocalService
 * @generated
 */
@ProviderType
public class trainingpersonalisedparameterscontentstoreLocalServiceWrapper
	implements trainingpersonalisedparameterscontentstoreLocalService,
		ServiceWrapper<trainingpersonalisedparameterscontentstoreLocalService> {
	public trainingpersonalisedparameterscontentstoreLocalServiceWrapper(
		trainingpersonalisedparameterscontentstoreLocalService trainingpersonalisedparameterscontentstoreLocalService) {
		_trainingpersonalisedparameterscontentstoreLocalService = trainingpersonalisedparameterscontentstoreLocalService;
	}

	/**
	* Adds the trainingpersonalisedparameterscontentstore to the database. Also notifies the appropriate model listeners.
	*
	* @param trainingpersonalisedparameterscontentstore the trainingpersonalisedparameterscontentstore
	* @return the trainingpersonalisedparameterscontentstore that was added
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore addtrainingpersonalisedparameterscontentstore(
		com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore trainingpersonalisedparameterscontentstore) {
		return _trainingpersonalisedparameterscontentstoreLocalService.addtrainingpersonalisedparameterscontentstore(trainingpersonalisedparameterscontentstore);
	}

	/**
	* Creates a new trainingpersonalisedparameterscontentstore with the primary key. Does not add the trainingpersonalisedparameterscontentstore to the database.
	*
	* @param id the primary key for the new trainingpersonalisedparameterscontentstore
	* @return the new trainingpersonalisedparameterscontentstore
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore createtrainingpersonalisedparameterscontentstore(
		long id) {
		return _trainingpersonalisedparameterscontentstoreLocalService.createtrainingpersonalisedparameterscontentstore(id);
	}

	/**
	* Deletes the trainingpersonalisedparameterscontentstore from the database. Also notifies the appropriate model listeners.
	*
	* @param trainingpersonalisedparameterscontentstore the trainingpersonalisedparameterscontentstore
	* @return the trainingpersonalisedparameterscontentstore that was removed
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore deletetrainingpersonalisedparameterscontentstore(
		com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore trainingpersonalisedparameterscontentstore) {
		return _trainingpersonalisedparameterscontentstoreLocalService.deletetrainingpersonalisedparameterscontentstore(trainingpersonalisedparameterscontentstore);
	}

	/**
	* Deletes the trainingpersonalisedparameterscontentstore with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the trainingpersonalisedparameterscontentstore
	* @return the trainingpersonalisedparameterscontentstore that was removed
	* @throws PortalException if a trainingpersonalisedparameterscontentstore with the primary key could not be found
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore deletetrainingpersonalisedparameterscontentstore(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _trainingpersonalisedparameterscontentstoreLocalService.deletetrainingpersonalisedparameterscontentstore(id);
	}

	@Override
	public com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore fetchtrainingpersonalisedparameterscontentstore(
		long id) {
		return _trainingpersonalisedparameterscontentstoreLocalService.fetchtrainingpersonalisedparameterscontentstore(id);
	}

	/**
	* Returns the trainingpersonalisedparameterscontentstore with the primary key.
	*
	* @param id the primary key of the trainingpersonalisedparameterscontentstore
	* @return the trainingpersonalisedparameterscontentstore
	* @throws PortalException if a trainingpersonalisedparameterscontentstore with the primary key could not be found
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore gettrainingpersonalisedparameterscontentstore(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _trainingpersonalisedparameterscontentstoreLocalService.gettrainingpersonalisedparameterscontentstore(id);
	}

	/**
	* Updates the trainingpersonalisedparameterscontentstore in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param trainingpersonalisedparameterscontentstore the trainingpersonalisedparameterscontentstore
	* @return the trainingpersonalisedparameterscontentstore that was updated
	*/
	@Override
	public com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore updatetrainingpersonalisedparameterscontentstore(
		com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore trainingpersonalisedparameterscontentstore) {
		return _trainingpersonalisedparameterscontentstoreLocalService.updatetrainingpersonalisedparameterscontentstore(trainingpersonalisedparameterscontentstore);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _trainingpersonalisedparameterscontentstoreLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _trainingpersonalisedparameterscontentstoreLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _trainingpersonalisedparameterscontentstoreLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _trainingpersonalisedparameterscontentstoreLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _trainingpersonalisedparameterscontentstoreLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of trainingpersonalisedparameterscontentstores.
	*
	* @return the number of trainingpersonalisedparameterscontentstores
	*/
	@Override
	public int gettrainingpersonalisedparameterscontentstoresCount() {
		return _trainingpersonalisedparameterscontentstoreLocalService.gettrainingpersonalisedparameterscontentstoresCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _trainingpersonalisedparameterscontentstoreLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _trainingpersonalisedparameterscontentstoreLocalService.getOSGiServiceIdentifier();
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
		return _trainingpersonalisedparameterscontentstoreLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.trainingcalendar.model.impl.trainingpersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _trainingpersonalisedparameterscontentstoreLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.trainingcalendar.model.impl.trainingpersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _trainingpersonalisedparameterscontentstoreLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the trainingpersonalisedparameterscontentstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.trainingcalendar.model.impl.trainingpersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingpersonalisedparameterscontentstores
	* @param end the upper bound of the range of trainingpersonalisedparameterscontentstores (not inclusive)
	* @return the range of trainingpersonalisedparameterscontentstores
	*/
	@Override
	public java.util.List<com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore> gettrainingpersonalisedparameterscontentstores(
		int start, int end) {
		return _trainingpersonalisedparameterscontentstoreLocalService.gettrainingpersonalisedparameterscontentstores(start,
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
		return _trainingpersonalisedparameterscontentstoreLocalService.dynamicQueryCount(dynamicQuery);
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
		return _trainingpersonalisedparameterscontentstoreLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public trainingpersonalisedparameterscontentstoreLocalService getWrappedService() {
		return _trainingpersonalisedparameterscontentstoreLocalService;
	}

	@Override
	public void setWrappedService(
		trainingpersonalisedparameterscontentstoreLocalService trainingpersonalisedparameterscontentstoreLocalService) {
		_trainingpersonalisedparameterscontentstoreLocalService = trainingpersonalisedparameterscontentstoreLocalService;
	}

	private trainingpersonalisedparameterscontentstoreLocalService _trainingpersonalisedparameterscontentstoreLocalService;
}