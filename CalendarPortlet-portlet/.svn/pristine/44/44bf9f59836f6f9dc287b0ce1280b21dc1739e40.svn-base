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
 * Provides a wrapper for {@link EmpInfoEntityLocalService}.
 *
 * @author adms.java1
 * @see EmpInfoEntityLocalService
 * @generated
 */
@ProviderType
public class EmpInfoEntityLocalServiceWrapper
	implements EmpInfoEntityLocalService,
		ServiceWrapper<EmpInfoEntityLocalService> {
	public EmpInfoEntityLocalServiceWrapper(
		EmpInfoEntityLocalService empInfoEntityLocalService) {
		_empInfoEntityLocalService = empInfoEntityLocalService;
	}

	/**
	* Adds the emp info entity to the database. Also notifies the appropriate model listeners.
	*
	* @param empInfoEntity the emp info entity
	* @return the emp info entity that was added
	*/
	@Override
	public com.chola.calendar.model.EmpInfoEntity addEmpInfoEntity(
		com.chola.calendar.model.EmpInfoEntity empInfoEntity) {
		return _empInfoEntityLocalService.addEmpInfoEntity(empInfoEntity);
	}

	/**
	* Creates a new emp info entity with the primary key. Does not add the emp info entity to the database.
	*
	* @param id the primary key for the new emp info entity
	* @return the new emp info entity
	*/
	@Override
	public com.chola.calendar.model.EmpInfoEntity createEmpInfoEntity(long id) {
		return _empInfoEntityLocalService.createEmpInfoEntity(id);
	}

	/**
	* Deletes the emp info entity from the database. Also notifies the appropriate model listeners.
	*
	* @param empInfoEntity the emp info entity
	* @return the emp info entity that was removed
	*/
	@Override
	public com.chola.calendar.model.EmpInfoEntity deleteEmpInfoEntity(
		com.chola.calendar.model.EmpInfoEntity empInfoEntity) {
		return _empInfoEntityLocalService.deleteEmpInfoEntity(empInfoEntity);
	}

	/**
	* Deletes the emp info entity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the emp info entity
	* @return the emp info entity that was removed
	* @throws PortalException if a emp info entity with the primary key could not be found
	*/
	@Override
	public com.chola.calendar.model.EmpInfoEntity deleteEmpInfoEntity(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _empInfoEntityLocalService.deleteEmpInfoEntity(id);
	}

	@Override
	public com.chola.calendar.model.EmpInfoEntity fetchEmpInfoEntity(long id) {
		return _empInfoEntityLocalService.fetchEmpInfoEntity(id);
	}

	/**
	* Returns the emp info entity with the primary key.
	*
	* @param id the primary key of the emp info entity
	* @return the emp info entity
	* @throws PortalException if a emp info entity with the primary key could not be found
	*/
	@Override
	public com.chola.calendar.model.EmpInfoEntity getEmpInfoEntity(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _empInfoEntityLocalService.getEmpInfoEntity(id);
	}

	/**
	* Updates the emp info entity in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param empInfoEntity the emp info entity
	* @return the emp info entity that was updated
	*/
	@Override
	public com.chola.calendar.model.EmpInfoEntity updateEmpInfoEntity(
		com.chola.calendar.model.EmpInfoEntity empInfoEntity) {
		return _empInfoEntityLocalService.updateEmpInfoEntity(empInfoEntity);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _empInfoEntityLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _empInfoEntityLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _empInfoEntityLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _empInfoEntityLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _empInfoEntityLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of emp info entities.
	*
	* @return the number of emp info entities
	*/
	@Override
	public int getEmpInfoEntitiesCount() {
		return _empInfoEntityLocalService.getEmpInfoEntitiesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _empInfoEntityLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _empInfoEntityLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List customFinder(java.lang.String eventName) {
		return _empInfoEntityLocalService.customFinder(eventName);
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
		return _empInfoEntityLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.EmpInfoEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _empInfoEntityLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.EmpInfoEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _empInfoEntityLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<java.lang.String> getDept() {
		return _empInfoEntityLocalService.getDept();
	}

	/**
	* Returns a range of all the emp info entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.EmpInfoEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp info entities
	* @param end the upper bound of the range of emp info entities (not inclusive)
	* @return the range of emp info entities
	*/
	@Override
	public java.util.List<com.chola.calendar.model.EmpInfoEntity> getEmpInfoEntities(
		int start, int end) {
		return _empInfoEntityLocalService.getEmpInfoEntities(start, end);
	}

	@Override
	public java.util.List<java.lang.String> getLocation() {
		return _empInfoEntityLocalService.getLocation();
	}

	@Override
	public java.util.List<java.lang.String> getSubDept() {
		return _empInfoEntityLocalService.getSubDept();
	}

	@Override
	public java.util.List getUserId(java.lang.String name) {
		return _empInfoEntityLocalService.getUserId(name);
	}

	@Override
	public java.util.List<java.lang.Object[]> getUsers() {
		return _empInfoEntityLocalService.getUsers();
	}

	@Override
	public java.util.List threeParams(java.lang.String[] first,
		java.lang.String[] second, java.lang.String[] third) {
		return _empInfoEntityLocalService.threeParams(first, second, third);
	}

	@Override
	public java.util.List twoParams(java.lang.String[] gender,
		java.lang.String[] age) {
		return _empInfoEntityLocalService.twoParams(gender, age);
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
		return _empInfoEntityLocalService.dynamicQueryCount(dynamicQuery);
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
		return _empInfoEntityLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public EmpInfoEntityLocalService getWrappedService() {
		return _empInfoEntityLocalService;
	}

	@Override
	public void setWrappedService(
		EmpInfoEntityLocalService empInfoEntityLocalService) {
		_empInfoEntityLocalService = empInfoEntityLocalService;
	}

	private EmpInfoEntityLocalService _empInfoEntityLocalService;
}