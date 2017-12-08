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

package com.chola.anniversary.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link anniversarywishLocalService}.
 *
 * @author CloverLiferay02
 * @see anniversarywishLocalService
 * @generated
 */
@ProviderType
public class anniversarywishLocalServiceWrapper
	implements anniversarywishLocalService,
		ServiceWrapper<anniversarywishLocalService> {
	public anniversarywishLocalServiceWrapper(
		anniversarywishLocalService anniversarywishLocalService) {
		_anniversarywishLocalService = anniversarywishLocalService;
	}

	@Override
	public boolean insertData(java.lang.String message,
		java.lang.String postedBy, java.lang.String empId) {
		return _anniversarywishLocalService.insertData(message, postedBy, empId);
	}

	/**
	* Adds the anniversarywish to the database. Also notifies the appropriate model listeners.
	*
	* @param anniversarywish the anniversarywish
	* @return the anniversarywish that was added
	*/
	@Override
	public com.chola.anniversary.model.anniversarywish addanniversarywish(
		com.chola.anniversary.model.anniversarywish anniversarywish) {
		return _anniversarywishLocalService.addanniversarywish(anniversarywish);
	}

	/**
	* Creates a new anniversarywish with the primary key. Does not add the anniversarywish to the database.
	*
	* @param id the primary key for the new anniversarywish
	* @return the new anniversarywish
	*/
	@Override
	public com.chola.anniversary.model.anniversarywish createanniversarywish(
		long id) {
		return _anniversarywishLocalService.createanniversarywish(id);
	}

	/**
	* Deletes the anniversarywish from the database. Also notifies the appropriate model listeners.
	*
	* @param anniversarywish the anniversarywish
	* @return the anniversarywish that was removed
	*/
	@Override
	public com.chola.anniversary.model.anniversarywish deleteanniversarywish(
		com.chola.anniversary.model.anniversarywish anniversarywish) {
		return _anniversarywishLocalService.deleteanniversarywish(anniversarywish);
	}

	/**
	* Deletes the anniversarywish with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the anniversarywish
	* @return the anniversarywish that was removed
	* @throws PortalException if a anniversarywish with the primary key could not be found
	*/
	@Override
	public com.chola.anniversary.model.anniversarywish deleteanniversarywish(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _anniversarywishLocalService.deleteanniversarywish(id);
	}

	@Override
	public com.chola.anniversary.model.anniversarywish fetchanniversarywish(
		long id) {
		return _anniversarywishLocalService.fetchanniversarywish(id);
	}

	/**
	* Returns the anniversarywish with the primary key.
	*
	* @param id the primary key of the anniversarywish
	* @return the anniversarywish
	* @throws PortalException if a anniversarywish with the primary key could not be found
	*/
	@Override
	public com.chola.anniversary.model.anniversarywish getanniversarywish(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _anniversarywishLocalService.getanniversarywish(id);
	}

	/**
	* Updates the anniversarywish in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param anniversarywish the anniversarywish
	* @return the anniversarywish that was updated
	*/
	@Override
	public com.chola.anniversary.model.anniversarywish updateanniversarywish(
		com.chola.anniversary.model.anniversarywish anniversarywish) {
		return _anniversarywishLocalService.updateanniversarywish(anniversarywish);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _anniversarywishLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _anniversarywishLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _anniversarywishLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _anniversarywishLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _anniversarywishLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of anniversarywishs.
	*
	* @return the number of anniversarywishs
	*/
	@Override
	public int getanniversarywishsCount() {
		return _anniversarywishLocalService.getanniversarywishsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _anniversarywishLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _anniversarywishLocalService.getOSGiServiceIdentifier();
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
		return _anniversarywishLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.anniversary.model.impl.anniversarywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _anniversarywishLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.anniversary.model.impl.anniversarywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _anniversarywishLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List getEmpData(java.lang.String date) {
		return _anniversarywishLocalService.getEmpData(date);
	}

	/**
	* Returns a range of all the anniversarywishs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.anniversary.model.impl.anniversarywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of anniversarywishs
	* @param end the upper bound of the range of anniversarywishs (not inclusive)
	* @return the range of anniversarywishs
	*/
	@Override
	public java.util.List<com.chola.anniversary.model.anniversarywish> getanniversarywishs(
		int start, int end) {
		return _anniversarywishLocalService.getanniversarywishs(start, end);
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
		return _anniversarywishLocalService.dynamicQueryCount(dynamicQuery);
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
		return _anniversarywishLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public anniversarywishLocalService getWrappedService() {
		return _anniversarywishLocalService;
	}

	@Override
	public void setWrappedService(
		anniversarywishLocalService anniversarywishLocalService) {
		_anniversarywishLocalService = anniversarywishLocalService;
	}

	private anniversarywishLocalService _anniversarywishLocalService;
}