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
 * Provides a wrapper for {@link birthdaywishLocalService}.
 *
 * @author CloverLiferay02
 * @see birthdaywishLocalService
 * @generated
 */
@ProviderType
public class birthdaywishLocalServiceWrapper implements birthdaywishLocalService,
	ServiceWrapper<birthdaywishLocalService> {
	public birthdaywishLocalServiceWrapper(
		birthdaywishLocalService birthdaywishLocalService) {
		_birthdaywishLocalService = birthdaywishLocalService;
	}

	@Override
	public boolean insertData(java.lang.String message,
		java.lang.String postedBy, java.lang.String empId) {
		return _birthdaywishLocalService.insertData(message, postedBy, empId);
	}

	/**
	* Adds the birthdaywish to the database. Also notifies the appropriate model listeners.
	*
	* @param birthdaywish the birthdaywish
	* @return the birthdaywish that was added
	*/
	@Override
	public com.chola.birthday.model.birthdaywish addbirthdaywish(
		com.chola.birthday.model.birthdaywish birthdaywish) {
		return _birthdaywishLocalService.addbirthdaywish(birthdaywish);
	}

	/**
	* Creates a new birthdaywish with the primary key. Does not add the birthdaywish to the database.
	*
	* @param id the primary key for the new birthdaywish
	* @return the new birthdaywish
	*/
	@Override
	public com.chola.birthday.model.birthdaywish createbirthdaywish(long id) {
		return _birthdaywishLocalService.createbirthdaywish(id);
	}

	/**
	* Deletes the birthdaywish from the database. Also notifies the appropriate model listeners.
	*
	* @param birthdaywish the birthdaywish
	* @return the birthdaywish that was removed
	*/
	@Override
	public com.chola.birthday.model.birthdaywish deletebirthdaywish(
		com.chola.birthday.model.birthdaywish birthdaywish) {
		return _birthdaywishLocalService.deletebirthdaywish(birthdaywish);
	}

	/**
	* Deletes the birthdaywish with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the birthdaywish
	* @return the birthdaywish that was removed
	* @throws PortalException if a birthdaywish with the primary key could not be found
	*/
	@Override
	public com.chola.birthday.model.birthdaywish deletebirthdaywish(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _birthdaywishLocalService.deletebirthdaywish(id);
	}

	@Override
	public com.chola.birthday.model.birthdaywish fetchbirthdaywish(long id) {
		return _birthdaywishLocalService.fetchbirthdaywish(id);
	}

	/**
	* Returns the birthdaywish with the primary key.
	*
	* @param id the primary key of the birthdaywish
	* @return the birthdaywish
	* @throws PortalException if a birthdaywish with the primary key could not be found
	*/
	@Override
	public com.chola.birthday.model.birthdaywish getbirthdaywish(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _birthdaywishLocalService.getbirthdaywish(id);
	}

	/**
	* Updates the birthdaywish in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param birthdaywish the birthdaywish
	* @return the birthdaywish that was updated
	*/
	@Override
	public com.chola.birthday.model.birthdaywish updatebirthdaywish(
		com.chola.birthday.model.birthdaywish birthdaywish) {
		return _birthdaywishLocalService.updatebirthdaywish(birthdaywish);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _birthdaywishLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _birthdaywishLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _birthdaywishLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _birthdaywishLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _birthdaywishLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of birthdaywishs.
	*
	* @return the number of birthdaywishs
	*/
	@Override
	public int getbirthdaywishsCount() {
		return _birthdaywishLocalService.getbirthdaywishsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _birthdaywishLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _birthdaywishLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List customFinder(java.lang.String userId) {
		return _birthdaywishLocalService.customFinder(userId);
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
		return _birthdaywishLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.birthday.model.impl.birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _birthdaywishLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.birthday.model.impl.birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _birthdaywishLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List getEmpData(java.lang.String date) {
		return _birthdaywishLocalService.getEmpData(date);
	}

	@Override
	public java.util.List getEmpInfo(java.lang.String empId) {
		return _birthdaywishLocalService.getEmpInfo(empId);
	}

	/**
	* Returns a range of all the birthdaywishs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.birthday.model.impl.birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of birthdaywishs
	* @param end the upper bound of the range of birthdaywishs (not inclusive)
	* @return the range of birthdaywishs
	*/
	@Override
	public java.util.List<com.chola.birthday.model.birthdaywish> getbirthdaywishs(
		int start, int end) {
		return _birthdaywishLocalService.getbirthdaywishs(start, end);
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
		return _birthdaywishLocalService.dynamicQueryCount(dynamicQuery);
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
		return _birthdaywishLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public birthdaywishLocalService getWrappedService() {
		return _birthdaywishLocalService;
	}

	@Override
	public void setWrappedService(
		birthdaywishLocalService birthdaywishLocalService) {
		_birthdaywishLocalService = birthdaywishLocalService;
	}

	private birthdaywishLocalService _birthdaywishLocalService;
}