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

package com.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link cholatalkiesusersLocalService}.
 *
 * @author adms.java1
 * @see cholatalkiesusersLocalService
 * @generated
 */
@ProviderType
public class cholatalkiesusersLocalServiceWrapper
	implements cholatalkiesusersLocalService,
		ServiceWrapper<cholatalkiesusersLocalService> {
	public cholatalkiesusersLocalServiceWrapper(
		cholatalkiesusersLocalService cholatalkiesusersLocalService) {
		_cholatalkiesusersLocalService = cholatalkiesusersLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _cholatalkiesusersLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cholatalkiesusersLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _cholatalkiesusersLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cholatalkiesusersLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cholatalkiesusersLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the cholatalkiesusers to the database. Also notifies the appropriate model listeners.
	*
	* @param cholatalkiesusers the cholatalkiesusers
	* @return the cholatalkiesusers that was added
	*/
	@Override
	public com.model.cholatalkiesusers addcholatalkiesusers(
		com.model.cholatalkiesusers cholatalkiesusers) {
		return _cholatalkiesusersLocalService.addcholatalkiesusers(cholatalkiesusers);
	}

	/**
	* Creates a new cholatalkiesusers with the primary key. Does not add the cholatalkiesusers to the database.
	*
	* @param id the primary key for the new cholatalkiesusers
	* @return the new cholatalkiesusers
	*/
	@Override
	public com.model.cholatalkiesusers createcholatalkiesusers(long id) {
		return _cholatalkiesusersLocalService.createcholatalkiesusers(id);
	}

	/**
	* Deletes the cholatalkiesusers from the database. Also notifies the appropriate model listeners.
	*
	* @param cholatalkiesusers the cholatalkiesusers
	* @return the cholatalkiesusers that was removed
	*/
	@Override
	public com.model.cholatalkiesusers deletecholatalkiesusers(
		com.model.cholatalkiesusers cholatalkiesusers) {
		return _cholatalkiesusersLocalService.deletecholatalkiesusers(cholatalkiesusers);
	}

	/**
	* Deletes the cholatalkiesusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the cholatalkiesusers
	* @return the cholatalkiesusers that was removed
	* @throws PortalException if a cholatalkiesusers with the primary key could not be found
	*/
	@Override
	public com.model.cholatalkiesusers deletecholatalkiesusers(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cholatalkiesusersLocalService.deletecholatalkiesusers(id);
	}

	@Override
	public com.model.cholatalkiesusers fetchcholatalkiesusers(long id) {
		return _cholatalkiesusersLocalService.fetchcholatalkiesusers(id);
	}

	/**
	* Returns the cholatalkiesusers with the primary key.
	*
	* @param id the primary key of the cholatalkiesusers
	* @return the cholatalkiesusers
	* @throws PortalException if a cholatalkiesusers with the primary key could not be found
	*/
	@Override
	public com.model.cholatalkiesusers getcholatalkiesusers(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cholatalkiesusersLocalService.getcholatalkiesusers(id);
	}

	/**
	* Updates the cholatalkiesusers in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cholatalkiesusers the cholatalkiesusers
	* @return the cholatalkiesusers that was updated
	*/
	@Override
	public com.model.cholatalkiesusers updatecholatalkiesusers(
		com.model.cholatalkiesusers cholatalkiesusers) {
		return _cholatalkiesusersLocalService.updatecholatalkiesusers(cholatalkiesusers);
	}

	/**
	* Returns the number of cholatalkiesuserses.
	*
	* @return the number of cholatalkiesuserses
	*/
	@Override
	public int getcholatalkiesusersesCount() {
		return _cholatalkiesusersLocalService.getcholatalkiesusersesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _cholatalkiesusersLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _cholatalkiesusersLocalService.getOSGiServiceIdentifier();
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
		return _cholatalkiesusersLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.model.impl.cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cholatalkiesusersLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.model.impl.cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cholatalkiesusersLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.model.cholatalkiesusers> getCTDetails(long ctId) {
		return _cholatalkiesusersLocalService.getCTDetails(ctId);
	}

	@Override
	public java.util.List<com.model.cholatalkiesusers> getCTUsers(long user_id) {
		return _cholatalkiesusersLocalService.getCTUsers(user_id);
	}

	/**
	* Returns a range of all the cholatalkiesuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.model.impl.cholatalkiesusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cholatalkiesuserses
	* @param end the upper bound of the range of cholatalkiesuserses (not inclusive)
	* @return the range of cholatalkiesuserses
	*/
	@Override
	public java.util.List<com.model.cholatalkiesusers> getcholatalkiesuserses(
		int start, int end) {
		return _cholatalkiesusersLocalService.getcholatalkiesuserses(start, end);
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
		return _cholatalkiesusersLocalService.dynamicQueryCount(dynamicQuery);
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
		return _cholatalkiesusersLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public cholatalkiesusersLocalService getWrappedService() {
		return _cholatalkiesusersLocalService;
	}

	@Override
	public void setWrappedService(
		cholatalkiesusersLocalService cholatalkiesusersLocalService) {
		_cholatalkiesusersLocalService = cholatalkiesusersLocalService;
	}

	private cholatalkiesusersLocalService _cholatalkiesusersLocalService;
}