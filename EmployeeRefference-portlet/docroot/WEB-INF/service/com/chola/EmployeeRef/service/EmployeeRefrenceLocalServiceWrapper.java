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

package com.chola.EmployeeRef.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployeeRefrenceLocalService}.
 *
 * @author CloverLiferay03
 * @see EmployeeRefrenceLocalService
 * @generated
 */
@ProviderType
public class EmployeeRefrenceLocalServiceWrapper
	implements EmployeeRefrenceLocalService,
		ServiceWrapper<EmployeeRefrenceLocalService> {
	public EmployeeRefrenceLocalServiceWrapper(
		EmployeeRefrenceLocalService employeeRefrenceLocalService) {
		_employeeRefrenceLocalService = employeeRefrenceLocalService;
	}

	/**
	* Adds the employee refrence to the database. Also notifies the appropriate model listeners.
	*
	* @param employeeRefrence the employee refrence
	* @return the employee refrence that was added
	*/
	@Override
	public com.chola.EmployeeRef.model.EmployeeRefrence addEmployeeRefrence(
		com.chola.EmployeeRef.model.EmployeeRefrence employeeRefrence) {
		return _employeeRefrenceLocalService.addEmployeeRefrence(employeeRefrence);
	}

	/**
	* Creates a new employee refrence with the primary key. Does not add the employee refrence to the database.
	*
	* @param refId the primary key for the new employee refrence
	* @return the new employee refrence
	*/
	@Override
	public com.chola.EmployeeRef.model.EmployeeRefrence createEmployeeRefrence(
		long refId) {
		return _employeeRefrenceLocalService.createEmployeeRefrence(refId);
	}

	/**
	* Deletes the employee refrence from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeRefrence the employee refrence
	* @return the employee refrence that was removed
	*/
	@Override
	public com.chola.EmployeeRef.model.EmployeeRefrence deleteEmployeeRefrence(
		com.chola.EmployeeRef.model.EmployeeRefrence employeeRefrence) {
		return _employeeRefrenceLocalService.deleteEmployeeRefrence(employeeRefrence);
	}

	/**
	* Deletes the employee refrence with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param refId the primary key of the employee refrence
	* @return the employee refrence that was removed
	* @throws PortalException if a employee refrence with the primary key could not be found
	*/
	@Override
	public com.chola.EmployeeRef.model.EmployeeRefrence deleteEmployeeRefrence(
		long refId) throws com.liferay.portal.kernel.exception.PortalException {
		return _employeeRefrenceLocalService.deleteEmployeeRefrence(refId);
	}

	@Override
	public com.chola.EmployeeRef.model.EmployeeRefrence fetchEmployeeRefrence(
		long refId) {
		return _employeeRefrenceLocalService.fetchEmployeeRefrence(refId);
	}

	/**
	* Returns the employee refrence with the primary key.
	*
	* @param refId the primary key of the employee refrence
	* @return the employee refrence
	* @throws PortalException if a employee refrence with the primary key could not be found
	*/
	@Override
	public com.chola.EmployeeRef.model.EmployeeRefrence getEmployeeRefrence(
		long refId) throws com.liferay.portal.kernel.exception.PortalException {
		return _employeeRefrenceLocalService.getEmployeeRefrence(refId);
	}

	/**
	* Updates the employee refrence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employeeRefrence the employee refrence
	* @return the employee refrence that was updated
	*/
	@Override
	public com.chola.EmployeeRef.model.EmployeeRefrence updateEmployeeRefrence(
		com.chola.EmployeeRef.model.EmployeeRefrence employeeRefrence) {
		return _employeeRefrenceLocalService.updateEmployeeRefrence(employeeRefrence);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _employeeRefrenceLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _employeeRefrenceLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _employeeRefrenceLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _employeeRefrenceLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _employeeRefrenceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of employee refrences.
	*
	* @return the number of employee refrences
	*/
	@Override
	public int getEmployeeRefrencesCount() {
		return _employeeRefrenceLocalService.getEmployeeRefrencesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _employeeRefrenceLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _employeeRefrenceLocalService.getOSGiServiceIdentifier();
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
		return _employeeRefrenceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.EmployeeRef.model.impl.EmployeeRefrenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _employeeRefrenceLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.EmployeeRef.model.impl.EmployeeRefrenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _employeeRefrenceLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the employee refrences.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.EmployeeRef.model.impl.EmployeeRefrenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee refrences
	* @param end the upper bound of the range of employee refrences (not inclusive)
	* @return the range of employee refrences
	*/
	@Override
	public java.util.List<com.chola.EmployeeRef.model.EmployeeRefrence> getEmployeeRefrences(
		int start, int end) {
		return _employeeRefrenceLocalService.getEmployeeRefrences(start, end);
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
		return _employeeRefrenceLocalService.dynamicQueryCount(dynamicQuery);
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
		return _employeeRefrenceLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public EmployeeRefrenceLocalService getWrappedService() {
		return _employeeRefrenceLocalService;
	}

	@Override
	public void setWrappedService(
		EmployeeRefrenceLocalService employeeRefrenceLocalService) {
		_employeeRefrenceLocalService = employeeRefrenceLocalService;
	}

	private EmployeeRefrenceLocalService _employeeRefrenceLocalService;
}