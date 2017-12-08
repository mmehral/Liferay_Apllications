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

package com.chola.calendar.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link corporatepersonalisedparameterscontentstoreLocalService}.
 *
 * @author adms.java1
 * @see corporatepersonalisedparameterscontentstoreLocalService
 * @generated
 */
@ProviderType
public class corporatepersonalisedparameterscontentstoreLocalServiceWrapper
	implements corporatepersonalisedparameterscontentstoreLocalService,
		ServiceWrapper<corporatepersonalisedparameterscontentstoreLocalService> {
	public corporatepersonalisedparameterscontentstoreLocalServiceWrapper(
		corporatepersonalisedparameterscontentstoreLocalService corporatepersonalisedparameterscontentstoreLocalService) {
		_corporatepersonalisedparameterscontentstoreLocalService = corporatepersonalisedparameterscontentstoreLocalService;
	}

	/**
	* Adds the corporatepersonalisedparameterscontentstore to the database. Also notifies the appropriate model listeners.
	*
	* @param corporatepersonalisedparameterscontentstore the corporatepersonalisedparameterscontentstore
	* @return the corporatepersonalisedparameterscontentstore that was added
	*/
	@Override
	public com.chola.calendar.model.corporatepersonalisedparameterscontentstore addcorporatepersonalisedparameterscontentstore(
		com.chola.calendar.model.corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore) {
		return _corporatepersonalisedparameterscontentstoreLocalService.addcorporatepersonalisedparameterscontentstore(corporatepersonalisedparameterscontentstore);
	}

	/**
	* Creates a new corporatepersonalisedparameterscontentstore with the primary key. Does not add the corporatepersonalisedparameterscontentstore to the database.
	*
	* @param id the primary key for the new corporatepersonalisedparameterscontentstore
	* @return the new corporatepersonalisedparameterscontentstore
	*/
	@Override
	public com.chola.calendar.model.corporatepersonalisedparameterscontentstore createcorporatepersonalisedparameterscontentstore(
		long id) {
		return _corporatepersonalisedparameterscontentstoreLocalService.createcorporatepersonalisedparameterscontentstore(id);
	}

	/**
	* Deletes the corporatepersonalisedparameterscontentstore from the database. Also notifies the appropriate model listeners.
	*
	* @param corporatepersonalisedparameterscontentstore the corporatepersonalisedparameterscontentstore
	* @return the corporatepersonalisedparameterscontentstore that was removed
	*/
	@Override
	public com.chola.calendar.model.corporatepersonalisedparameterscontentstore deletecorporatepersonalisedparameterscontentstore(
		com.chola.calendar.model.corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore) {
		return _corporatepersonalisedparameterscontentstoreLocalService.deletecorporatepersonalisedparameterscontentstore(corporatepersonalisedparameterscontentstore);
	}

	/**
	* Deletes the corporatepersonalisedparameterscontentstore with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the corporatepersonalisedparameterscontentstore
	* @return the corporatepersonalisedparameterscontentstore that was removed
	* @throws PortalException if a corporatepersonalisedparameterscontentstore with the primary key could not be found
	*/
	@Override
	public com.chola.calendar.model.corporatepersonalisedparameterscontentstore deletecorporatepersonalisedparameterscontentstore(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _corporatepersonalisedparameterscontentstoreLocalService.deletecorporatepersonalisedparameterscontentstore(id);
	}

	@Override
	public com.chola.calendar.model.corporatepersonalisedparameterscontentstore fetchcorporatepersonalisedparameterscontentstore(
		long id) {
		return _corporatepersonalisedparameterscontentstoreLocalService.fetchcorporatepersonalisedparameterscontentstore(id);
	}

	/**
	* Returns the corporatepersonalisedparameterscontentstore with the primary key.
	*
	* @param id the primary key of the corporatepersonalisedparameterscontentstore
	* @return the corporatepersonalisedparameterscontentstore
	* @throws PortalException if a corporatepersonalisedparameterscontentstore with the primary key could not be found
	*/
	@Override
	public com.chola.calendar.model.corporatepersonalisedparameterscontentstore getcorporatepersonalisedparameterscontentstore(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _corporatepersonalisedparameterscontentstoreLocalService.getcorporatepersonalisedparameterscontentstore(id);
	}

	/**
	* Updates the corporatepersonalisedparameterscontentstore in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param corporatepersonalisedparameterscontentstore the corporatepersonalisedparameterscontentstore
	* @return the corporatepersonalisedparameterscontentstore that was updated
	*/
	@Override
	public com.chola.calendar.model.corporatepersonalisedparameterscontentstore updatecorporatepersonalisedparameterscontentstore(
		com.chola.calendar.model.corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore) {
		return _corporatepersonalisedparameterscontentstoreLocalService.updatecorporatepersonalisedparameterscontentstore(corporatepersonalisedparameterscontentstore);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _corporatepersonalisedparameterscontentstoreLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _corporatepersonalisedparameterscontentstoreLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _corporatepersonalisedparameterscontentstoreLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _corporatepersonalisedparameterscontentstoreLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _corporatepersonalisedparameterscontentstoreLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of corporatepersonalisedparameterscontentstores.
	*
	* @return the number of corporatepersonalisedparameterscontentstores
	*/
	@Override
	public int getcorporatepersonalisedparameterscontentstoresCount() {
		return _corporatepersonalisedparameterscontentstoreLocalService.getcorporatepersonalisedparameterscontentstoresCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _corporatepersonalisedparameterscontentstoreLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _corporatepersonalisedparameterscontentstoreLocalService.getOSGiServiceIdentifier();
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
		return _corporatepersonalisedparameterscontentstoreLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _corporatepersonalisedparameterscontentstoreLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _corporatepersonalisedparameterscontentstoreLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the corporatepersonalisedparameterscontentstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporatepersonalisedparameterscontentstores
	* @param end the upper bound of the range of corporatepersonalisedparameterscontentstores (not inclusive)
	* @return the range of corporatepersonalisedparameterscontentstores
	*/
	@Override
	public java.util.List<com.chola.calendar.model.corporatepersonalisedparameterscontentstore> getcorporatepersonalisedparameterscontentstores(
		int start, int end) {
		return _corporatepersonalisedparameterscontentstoreLocalService.getcorporatepersonalisedparameterscontentstores(start,
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
		return _corporatepersonalisedparameterscontentstoreLocalService.dynamicQueryCount(dynamicQuery);
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
		return _corporatepersonalisedparameterscontentstoreLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public corporatepersonalisedparameterscontentstoreLocalService getWrappedService() {
		return _corporatepersonalisedparameterscontentstoreLocalService;
	}

	@Override
	public void setWrappedService(
		corporatepersonalisedparameterscontentstoreLocalService corporatepersonalisedparameterscontentstoreLocalService) {
		_corporatepersonalisedparameterscontentstoreLocalService = corporatepersonalisedparameterscontentstoreLocalService;
	}

	private corporatepersonalisedparameterscontentstoreLocalService _corporatepersonalisedparameterscontentstoreLocalService;
}