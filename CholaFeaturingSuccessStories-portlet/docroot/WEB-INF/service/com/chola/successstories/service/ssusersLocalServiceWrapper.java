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

package com.chola.successstories.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ssusersLocalService}.
 *
 * @author cloverliferay01
 * @see ssusersLocalService
 * @generated
 */
@ProviderType
public class ssusersLocalServiceWrapper implements ssusersLocalService,
	ServiceWrapper<ssusersLocalService> {
	public ssusersLocalServiceWrapper(ssusersLocalService ssusersLocalService) {
		_ssusersLocalService = ssusersLocalService;
	}

	/**
	* Adds the ssusers to the database. Also notifies the appropriate model listeners.
	*
	* @param ssusers the ssusers
	* @return the ssusers that was added
	*/
	@Override
	public com.chola.successstories.model.ssusers addssusers(
		com.chola.successstories.model.ssusers ssusers) {
		return _ssusersLocalService.addssusers(ssusers);
	}

	/**
	* Creates a new ssusers with the primary key. Does not add the ssusers to the database.
	*
	* @param id the primary key for the new ssusers
	* @return the new ssusers
	*/
	@Override
	public com.chola.successstories.model.ssusers createssusers(long id) {
		return _ssusersLocalService.createssusers(id);
	}

	/**
	* Deletes the ssusers from the database. Also notifies the appropriate model listeners.
	*
	* @param ssusers the ssusers
	* @return the ssusers that was removed
	*/
	@Override
	public com.chola.successstories.model.ssusers deletessusers(
		com.chola.successstories.model.ssusers ssusers) {
		return _ssusersLocalService.deletessusers(ssusers);
	}

	/**
	* Deletes the ssusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ssusers
	* @return the ssusers that was removed
	* @throws PortalException if a ssusers with the primary key could not be found
	*/
	@Override
	public com.chola.successstories.model.ssusers deletessusers(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ssusersLocalService.deletessusers(id);
	}

	@Override
	public com.chola.successstories.model.ssusers fetchssusers(long id) {
		return _ssusersLocalService.fetchssusers(id);
	}

	/**
	* Returns the ssusers with the primary key.
	*
	* @param id the primary key of the ssusers
	* @return the ssusers
	* @throws PortalException if a ssusers with the primary key could not be found
	*/
	@Override
	public com.chola.successstories.model.ssusers getssusers(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ssusersLocalService.getssusers(id);
	}

	/**
	* Updates the ssusers in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ssusers the ssusers
	* @return the ssusers that was updated
	*/
	@Override
	public com.chola.successstories.model.ssusers updatessusers(
		com.chola.successstories.model.ssusers ssusers) {
		return _ssusersLocalService.updatessusers(ssusers);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _ssusersLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ssusersLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _ssusersLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ssusersLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ssusersLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of ssuserses.
	*
	* @return the number of ssuserses
	*/
	@Override
	public int getssusersesCount() {
		return _ssusersLocalService.getssusersesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _ssusersLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _ssusersLocalService.getOSGiServiceIdentifier();
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
		return _ssusersLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.successstories.model.impl.ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ssusersLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.successstories.model.impl.ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ssusersLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.chola.successstories.model.ssusers> getSSDetails(
		long ssId) {
		return _ssusersLocalService.getSSDetails(ssId);
	}

	@Override
	public java.util.List<com.chola.successstories.model.ssusers> getSSUsers(
		long user_id) {
		return _ssusersLocalService.getSSUsers(user_id);
	}

	/**
	* Returns a range of all the ssuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.successstories.model.impl.ssusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ssuserses
	* @param end the upper bound of the range of ssuserses (not inclusive)
	* @return the range of ssuserses
	*/
	@Override
	public java.util.List<com.chola.successstories.model.ssusers> getssuserses(
		int start, int end) {
		return _ssusersLocalService.getssuserses(start, end);
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
		return _ssusersLocalService.dynamicQueryCount(dynamicQuery);
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
		return _ssusersLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public ssusersLocalService getWrappedService() {
		return _ssusersLocalService;
	}

	@Override
	public void setWrappedService(ssusersLocalService ssusersLocalService) {
		_ssusersLocalService = ssusersLocalService;
	}

	private ssusersLocalService _ssusersLocalService;
}