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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link predefinedmessagesLocalService}.
 *
 * @author CloverLiferay02
 * @see predefinedmessagesLocalService
 * @generated
 */
@ProviderType
public class predefinedmessagesLocalServiceWrapper
	implements predefinedmessagesLocalService,
		ServiceWrapper<predefinedmessagesLocalService> {
	public predefinedmessagesLocalServiceWrapper(
		predefinedmessagesLocalService predefinedmessagesLocalService) {
		_predefinedmessagesLocalService = predefinedmessagesLocalService;
	}

	/**
	* Adds the predefinedmessages to the database. Also notifies the appropriate model listeners.
	*
	* @param predefinedmessages the predefinedmessages
	* @return the predefinedmessages that was added
	*/
	@Override
	public com.chola.birthday.model.predefinedmessages addpredefinedmessages(
		com.chola.birthday.model.predefinedmessages predefinedmessages) {
		return _predefinedmessagesLocalService.addpredefinedmessages(predefinedmessages);
	}

	/**
	* Creates a new predefinedmessages with the primary key. Does not add the predefinedmessages to the database.
	*
	* @param id the primary key for the new predefinedmessages
	* @return the new predefinedmessages
	*/
	@Override
	public com.chola.birthday.model.predefinedmessages createpredefinedmessages(
		long id) {
		return _predefinedmessagesLocalService.createpredefinedmessages(id);
	}

	/**
	* Deletes the predefinedmessages from the database. Also notifies the appropriate model listeners.
	*
	* @param predefinedmessages the predefinedmessages
	* @return the predefinedmessages that was removed
	*/
	@Override
	public com.chola.birthday.model.predefinedmessages deletepredefinedmessages(
		com.chola.birthday.model.predefinedmessages predefinedmessages) {
		return _predefinedmessagesLocalService.deletepredefinedmessages(predefinedmessages);
	}

	/**
	* Deletes the predefinedmessages with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the predefinedmessages
	* @return the predefinedmessages that was removed
	* @throws PortalException if a predefinedmessages with the primary key could not be found
	*/
	@Override
	public com.chola.birthday.model.predefinedmessages deletepredefinedmessages(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _predefinedmessagesLocalService.deletepredefinedmessages(id);
	}

	@Override
	public com.chola.birthday.model.predefinedmessages fetchpredefinedmessages(
		long id) {
		return _predefinedmessagesLocalService.fetchpredefinedmessages(id);
	}

	/**
	* Returns the predefinedmessages with the primary key.
	*
	* @param id the primary key of the predefinedmessages
	* @return the predefinedmessages
	* @throws PortalException if a predefinedmessages with the primary key could not be found
	*/
	@Override
	public com.chola.birthday.model.predefinedmessages getpredefinedmessages(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _predefinedmessagesLocalService.getpredefinedmessages(id);
	}

	/**
	* Updates the predefinedmessages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param predefinedmessages the predefinedmessages
	* @return the predefinedmessages that was updated
	*/
	@Override
	public com.chola.birthday.model.predefinedmessages updatepredefinedmessages(
		com.chola.birthday.model.predefinedmessages predefinedmessages) {
		return _predefinedmessagesLocalService.updatepredefinedmessages(predefinedmessages);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _predefinedmessagesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _predefinedmessagesLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _predefinedmessagesLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _predefinedmessagesLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _predefinedmessagesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of predefinedmessageses.
	*
	* @return the number of predefinedmessageses
	*/
	@Override
	public int getpredefinedmessagesesCount() {
		return _predefinedmessagesLocalService.getpredefinedmessagesesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _predefinedmessagesLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _predefinedmessagesLocalService.getOSGiServiceIdentifier();
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
		return _predefinedmessagesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.birthday.model.impl.predefinedmessagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _predefinedmessagesLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.birthday.model.impl.predefinedmessagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _predefinedmessagesLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the predefinedmessageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.birthday.model.impl.predefinedmessagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of predefinedmessageses
	* @param end the upper bound of the range of predefinedmessageses (not inclusive)
	* @return the range of predefinedmessageses
	*/
	@Override
	public java.util.List<com.chola.birthday.model.predefinedmessages> getpredefinedmessageses(
		int start, int end) {
		return _predefinedmessagesLocalService.getpredefinedmessageses(start,
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
		return _predefinedmessagesLocalService.dynamicQueryCount(dynamicQuery);
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
		return _predefinedmessagesLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public predefinedmessagesLocalService getWrappedService() {
		return _predefinedmessagesLocalService;
	}

	@Override
	public void setWrappedService(
		predefinedmessagesLocalService predefinedmessagesLocalService) {
		_predefinedmessagesLocalService = predefinedmessagesLocalService;
	}

	private predefinedmessagesLocalService _predefinedmessagesLocalService;
}