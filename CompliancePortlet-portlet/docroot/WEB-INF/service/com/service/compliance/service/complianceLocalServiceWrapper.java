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

package com.service.compliance.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link complianceLocalService}.
 *
 * @author adms.java1
 * @see complianceLocalService
 * @generated
 */
@ProviderType
public class complianceLocalServiceWrapper implements complianceLocalService,
	ServiceWrapper<complianceLocalService> {
	public complianceLocalServiceWrapper(
		complianceLocalService complianceLocalService) {
		_complianceLocalService = complianceLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _complianceLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _complianceLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _complianceLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _complianceLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _complianceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the compliance to the database. Also notifies the appropriate model listeners.
	*
	* @param compliance the compliance
	* @return the compliance that was added
	*/
	@Override
	public com.service.compliance.model.compliance addcompliance(
		com.service.compliance.model.compliance compliance) {
		return _complianceLocalService.addcompliance(compliance);
	}

	/**
	* Creates a new compliance with the primary key. Does not add the compliance to the database.
	*
	* @param compliance_id the primary key for the new compliance
	* @return the new compliance
	*/
	@Override
	public com.service.compliance.model.compliance createcompliance(
		long compliance_id) {
		return _complianceLocalService.createcompliance(compliance_id);
	}

	/**
	* Deletes the compliance from the database. Also notifies the appropriate model listeners.
	*
	* @param compliance the compliance
	* @return the compliance that was removed
	*/
	@Override
	public com.service.compliance.model.compliance deletecompliance(
		com.service.compliance.model.compliance compliance) {
		return _complianceLocalService.deletecompliance(compliance);
	}

	/**
	* Deletes the compliance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param compliance_id the primary key of the compliance
	* @return the compliance that was removed
	* @throws PortalException if a compliance with the primary key could not be found
	*/
	@Override
	public com.service.compliance.model.compliance deletecompliance(
		long compliance_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _complianceLocalService.deletecompliance(compliance_id);
	}

	@Override
	public com.service.compliance.model.compliance fetchcompliance(
		long compliance_id) {
		return _complianceLocalService.fetchcompliance(compliance_id);
	}

	/**
	* Returns the compliance with the primary key.
	*
	* @param compliance_id the primary key of the compliance
	* @return the compliance
	* @throws PortalException if a compliance with the primary key could not be found
	*/
	@Override
	public com.service.compliance.model.compliance getcompliance(
		long compliance_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _complianceLocalService.getcompliance(compliance_id);
	}

	/**
	* Updates the compliance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param compliance the compliance
	* @return the compliance that was updated
	*/
	@Override
	public com.service.compliance.model.compliance updatecompliance(
		com.service.compliance.model.compliance compliance) {
		return _complianceLocalService.updatecompliance(compliance);
	}

	/**
	* Returns the number of compliances.
	*
	* @return the number of compliances
	*/
	@Override
	public int getcompliancesCount() {
		return _complianceLocalService.getcompliancesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _complianceLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _complianceLocalService.getOSGiServiceIdentifier();
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
		return _complianceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.service.compliance.model.impl.complianceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _complianceLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.service.compliance.model.impl.complianceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _complianceLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the compliances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.service.compliance.model.impl.complianceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of compliances
	* @param end the upper bound of the range of compliances (not inclusive)
	* @return the range of compliances
	*/
	@Override
	public java.util.List<com.service.compliance.model.compliance> getcompliances(
		int start, int end) {
		return _complianceLocalService.getcompliances(start, end);
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
		return _complianceLocalService.dynamicQueryCount(dynamicQuery);
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
		return _complianceLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public complianceLocalService getWrappedService() {
		return _complianceLocalService;
	}

	@Override
	public void setWrappedService(complianceLocalService complianceLocalService) {
		_complianceLocalService = complianceLocalService;
	}

	private complianceLocalService _complianceLocalService;
}