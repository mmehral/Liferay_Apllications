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

package com.chola.businessmis.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link businessmisusersLocalService}.
 *
 * @author CloverLiferay01
 * @see businessmisusersLocalService
 * @generated
 */
@ProviderType
public class businessmisusersLocalServiceWrapper
	implements businessmisusersLocalService,
		ServiceWrapper<businessmisusersLocalService> {
	public businessmisusersLocalServiceWrapper(
		businessmisusersLocalService businessmisusersLocalService) {
		_businessmisusersLocalService = businessmisusersLocalService;
	}

	/**
	* Adds the businessmisusers to the database. Also notifies the appropriate model listeners.
	*
	* @param businessmisusers the businessmisusers
	* @return the businessmisusers that was added
	*/
	@Override
	public com.chola.businessmis.model.businessmisusers addbusinessmisusers(
		com.chola.businessmis.model.businessmisusers businessmisusers) {
		return _businessmisusersLocalService.addbusinessmisusers(businessmisusers);
	}

	/**
	* Creates a new businessmisusers with the primary key. Does not add the businessmisusers to the database.
	*
	* @param id the primary key for the new businessmisusers
	* @return the new businessmisusers
	*/
	@Override
	public com.chola.businessmis.model.businessmisusers createbusinessmisusers(
		long id) {
		return _businessmisusersLocalService.createbusinessmisusers(id);
	}

	/**
	* Deletes the businessmisusers from the database. Also notifies the appropriate model listeners.
	*
	* @param businessmisusers the businessmisusers
	* @return the businessmisusers that was removed
	*/
	@Override
	public com.chola.businessmis.model.businessmisusers deletebusinessmisusers(
		com.chola.businessmis.model.businessmisusers businessmisusers) {
		return _businessmisusersLocalService.deletebusinessmisusers(businessmisusers);
	}

	/**
	* Deletes the businessmisusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the businessmisusers
	* @return the businessmisusers that was removed
	* @throws PortalException if a businessmisusers with the primary key could not be found
	*/
	@Override
	public com.chola.businessmis.model.businessmisusers deletebusinessmisusers(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _businessmisusersLocalService.deletebusinessmisusers(id);
	}

	@Override
	public com.chola.businessmis.model.businessmisusers fetchbusinessmisusers(
		long id) {
		return _businessmisusersLocalService.fetchbusinessmisusers(id);
	}

	/**
	* Returns the businessmisusers with the primary key.
	*
	* @param id the primary key of the businessmisusers
	* @return the businessmisusers
	* @throws PortalException if a businessmisusers with the primary key could not be found
	*/
	@Override
	public com.chola.businessmis.model.businessmisusers getbusinessmisusers(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _businessmisusersLocalService.getbusinessmisusers(id);
	}

	/**
	* Updates the businessmisusers in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param businessmisusers the businessmisusers
	* @return the businessmisusers that was updated
	*/
	@Override
	public com.chola.businessmis.model.businessmisusers updatebusinessmisusers(
		com.chola.businessmis.model.businessmisusers businessmisusers) {
		return _businessmisusersLocalService.updatebusinessmisusers(businessmisusers);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _businessmisusersLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _businessmisusersLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _businessmisusersLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _businessmisusersLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _businessmisusersLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of businessmisuserses.
	*
	* @return the number of businessmisuserses
	*/
	@Override
	public int getbusinessmisusersesCount() {
		return _businessmisusersLocalService.getbusinessmisusersesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _businessmisusersLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _businessmisusersLocalService.getOSGiServiceIdentifier();
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
		return _businessmisusersLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.businessmis.model.impl.businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _businessmisusersLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.businessmis.model.impl.businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _businessmisusersLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.chola.businessmis.model.businessmisusers> getMISUsers(
		long buss_id) {
		return _businessmisusersLocalService.getMISUsers(buss_id);
	}

	@Override
	public java.util.List<com.chola.businessmis.model.businessmisusers> getMISdocuments(
		long sopId) {
		return _businessmisusersLocalService.getMISdocuments(sopId);
	}

	/**
	* Returns a range of all the businessmisuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.businessmis.model.impl.businessmisusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businessmisuserses
	* @param end the upper bound of the range of businessmisuserses (not inclusive)
	* @return the range of businessmisuserses
	*/
	@Override
	public java.util.List<com.chola.businessmis.model.businessmisusers> getbusinessmisuserses(
		int start, int end) {
		return _businessmisusersLocalService.getbusinessmisuserses(start, end);
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
		return _businessmisusersLocalService.dynamicQueryCount(dynamicQuery);
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
		return _businessmisusersLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public businessmisusersLocalService getWrappedService() {
		return _businessmisusersLocalService;
	}

	@Override
	public void setWrappedService(
		businessmisusersLocalService businessmisusersLocalService) {
		_businessmisusersLocalService = businessmisusersLocalService;
	}

	private businessmisusersLocalService _businessmisusersLocalService;
}