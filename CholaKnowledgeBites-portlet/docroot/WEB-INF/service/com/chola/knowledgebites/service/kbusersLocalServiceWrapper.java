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

package com.chola.knowledgebites.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link kbusersLocalService}.
 *
 * @author cloverliferay01
 * @see kbusersLocalService
 * @generated
 */
@ProviderType
public class kbusersLocalServiceWrapper implements kbusersLocalService,
	ServiceWrapper<kbusersLocalService> {
	public kbusersLocalServiceWrapper(kbusersLocalService kbusersLocalService) {
		_kbusersLocalService = kbusersLocalService;
	}

	/**
	* Adds the kbusers to the database. Also notifies the appropriate model listeners.
	*
	* @param kbusers the kbusers
	* @return the kbusers that was added
	*/
	@Override
	public com.chola.knowledgebites.model.kbusers addkbusers(
		com.chola.knowledgebites.model.kbusers kbusers) {
		return _kbusersLocalService.addkbusers(kbusers);
	}

	/**
	* Creates a new kbusers with the primary key. Does not add the kbusers to the database.
	*
	* @param id the primary key for the new kbusers
	* @return the new kbusers
	*/
	@Override
	public com.chola.knowledgebites.model.kbusers createkbusers(long id) {
		return _kbusersLocalService.createkbusers(id);
	}

	/**
	* Deletes the kbusers from the database. Also notifies the appropriate model listeners.
	*
	* @param kbusers the kbusers
	* @return the kbusers that was removed
	*/
	@Override
	public com.chola.knowledgebites.model.kbusers deletekbusers(
		com.chola.knowledgebites.model.kbusers kbusers) {
		return _kbusersLocalService.deletekbusers(kbusers);
	}

	/**
	* Deletes the kbusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the kbusers
	* @return the kbusers that was removed
	* @throws PortalException if a kbusers with the primary key could not be found
	*/
	@Override
	public com.chola.knowledgebites.model.kbusers deletekbusers(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kbusersLocalService.deletekbusers(id);
	}

	@Override
	public com.chola.knowledgebites.model.kbusers fetchkbusers(long id) {
		return _kbusersLocalService.fetchkbusers(id);
	}

	/**
	* Returns the kbusers with the primary key.
	*
	* @param id the primary key of the kbusers
	* @return the kbusers
	* @throws PortalException if a kbusers with the primary key could not be found
	*/
	@Override
	public com.chola.knowledgebites.model.kbusers getkbusers(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kbusersLocalService.getkbusers(id);
	}

	/**
	* Updates the kbusers in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param kbusers the kbusers
	* @return the kbusers that was updated
	*/
	@Override
	public com.chola.knowledgebites.model.kbusers updatekbusers(
		com.chola.knowledgebites.model.kbusers kbusers) {
		return _kbusersLocalService.updatekbusers(kbusers);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _kbusersLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _kbusersLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _kbusersLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kbusersLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kbusersLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of kbuserses.
	*
	* @return the number of kbuserses
	*/
	@Override
	public int getkbusersesCount() {
		return _kbusersLocalService.getkbusersesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _kbusersLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _kbusersLocalService.getOSGiServiceIdentifier();
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
		return _kbusersLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.knowledgebites.model.impl.kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _kbusersLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.knowledgebites.model.impl.kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _kbusersLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.chola.knowledgebites.model.kbusers> getKBDetails(
		long bookId) {
		return _kbusersLocalService.getKBDetails(bookId);
	}

	@Override
	public java.util.List<com.chola.knowledgebites.model.kbusers> getKBUsers(
		long user_id) {
		return _kbusersLocalService.getKBUsers(user_id);
	}

	/**
	* Returns a range of all the kbuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.knowledgebites.model.impl.kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kbuserses
	* @param end the upper bound of the range of kbuserses (not inclusive)
	* @return the range of kbuserses
	*/
	@Override
	public java.util.List<com.chola.knowledgebites.model.kbusers> getkbuserses(
		int start, int end) {
		return _kbusersLocalService.getkbuserses(start, end);
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
		return _kbusersLocalService.dynamicQueryCount(dynamicQuery);
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
		return _kbusersLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public kbusersLocalService getWrappedService() {
		return _kbusersLocalService;
	}

	@Override
	public void setWrappedService(kbusersLocalService kbusersLocalService) {
		_kbusersLocalService = kbusersLocalService;
	}

	private kbusersLocalService _kbusersLocalService;
}