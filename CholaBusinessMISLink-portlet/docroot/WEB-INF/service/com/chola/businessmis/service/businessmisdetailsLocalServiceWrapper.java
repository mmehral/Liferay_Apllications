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
 * Provides a wrapper for {@link businessmisdetailsLocalService}.
 *
 * @author CloverLiferay01
 * @see businessmisdetailsLocalService
 * @generated
 */
@ProviderType
public class businessmisdetailsLocalServiceWrapper
	implements businessmisdetailsLocalService,
		ServiceWrapper<businessmisdetailsLocalService> {
	public businessmisdetailsLocalServiceWrapper(
		businessmisdetailsLocalService businessmisdetailsLocalService) {
		_businessmisdetailsLocalService = businessmisdetailsLocalService;
	}

	/**
	* Adds the businessmisdetails to the database. Also notifies the appropriate model listeners.
	*
	* @param businessmisdetails the businessmisdetails
	* @return the businessmisdetails that was added
	*/
	@Override
	public com.chola.businessmis.model.businessmisdetails addbusinessmisdetails(
		com.chola.businessmis.model.businessmisdetails businessmisdetails) {
		return _businessmisdetailsLocalService.addbusinessmisdetails(businessmisdetails);
	}

	/**
	* Creates a new businessmisdetails with the primary key. Does not add the businessmisdetails to the database.
	*
	* @param id the primary key for the new businessmisdetails
	* @return the new businessmisdetails
	*/
	@Override
	public com.chola.businessmis.model.businessmisdetails createbusinessmisdetails(
		long id) {
		return _businessmisdetailsLocalService.createbusinessmisdetails(id);
	}

	/**
	* Deletes the businessmisdetails from the database. Also notifies the appropriate model listeners.
	*
	* @param businessmisdetails the businessmisdetails
	* @return the businessmisdetails that was removed
	*/
	@Override
	public com.chola.businessmis.model.businessmisdetails deletebusinessmisdetails(
		com.chola.businessmis.model.businessmisdetails businessmisdetails) {
		return _businessmisdetailsLocalService.deletebusinessmisdetails(businessmisdetails);
	}

	/**
	* Deletes the businessmisdetails with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the businessmisdetails
	* @return the businessmisdetails that was removed
	* @throws PortalException if a businessmisdetails with the primary key could not be found
	*/
	@Override
	public com.chola.businessmis.model.businessmisdetails deletebusinessmisdetails(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _businessmisdetailsLocalService.deletebusinessmisdetails(id);
	}

	@Override
	public com.chola.businessmis.model.businessmisdetails fetchbusinessmisdetails(
		long id) {
		return _businessmisdetailsLocalService.fetchbusinessmisdetails(id);
	}

	/**
	* Returns the businessmisdetails with the primary key.
	*
	* @param id the primary key of the businessmisdetails
	* @return the businessmisdetails
	* @throws PortalException if a businessmisdetails with the primary key could not be found
	*/
	@Override
	public com.chola.businessmis.model.businessmisdetails getbusinessmisdetails(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _businessmisdetailsLocalService.getbusinessmisdetails(id);
	}

	/**
	* Updates the businessmisdetails in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param businessmisdetails the businessmisdetails
	* @return the businessmisdetails that was updated
	*/
	@Override
	public com.chola.businessmis.model.businessmisdetails updatebusinessmisdetails(
		com.chola.businessmis.model.businessmisdetails businessmisdetails) {
		return _businessmisdetailsLocalService.updatebusinessmisdetails(businessmisdetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _businessmisdetailsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _businessmisdetailsLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _businessmisdetailsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _businessmisdetailsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _businessmisdetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of businessmisdetailses.
	*
	* @return the number of businessmisdetailses
	*/
	@Override
	public int getbusinessmisdetailsesCount() {
		return _businessmisdetailsLocalService.getbusinessmisdetailsesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _businessmisdetailsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _businessmisdetailsLocalService.getOSGiServiceIdentifier();
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
		return _businessmisdetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.businessmis.model.impl.businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _businessmisdetailsLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.businessmis.model.impl.businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _businessmisdetailsLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.chola.businessmis.model.businessmisdetails> getbmisDetail(
		long contentId) {
		return _businessmisdetailsLocalService.getbmisDetail(contentId);
	}

	/**
	* Returns a range of all the businessmisdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.businessmis.model.impl.businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businessmisdetailses
	* @param end the upper bound of the range of businessmisdetailses (not inclusive)
	* @return the range of businessmisdetailses
	*/
	@Override
	public java.util.List<com.chola.businessmis.model.businessmisdetails> getbusinessmisdetailses(
		int start, int end) {
		return _businessmisdetailsLocalService.getbusinessmisdetailses(start,
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
		return _businessmisdetailsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _businessmisdetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public businessmisdetailsLocalService getWrappedService() {
		return _businessmisdetailsLocalService;
	}

	@Override
	public void setWrappedService(
		businessmisdetailsLocalService businessmisdetailsLocalService) {
		_businessmisdetailsLocalService = businessmisdetailsLocalService;
	}

	private businessmisdetailsLocalService _businessmisdetailsLocalService;
}