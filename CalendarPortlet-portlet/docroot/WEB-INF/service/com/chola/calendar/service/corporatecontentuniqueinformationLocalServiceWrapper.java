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
 * Provides a wrapper for {@link corporatecontentuniqueinformationLocalService}.
 *
 * @author adms.java1
 * @see corporatecontentuniqueinformationLocalService
 * @generated
 */
@ProviderType
public class corporatecontentuniqueinformationLocalServiceWrapper
	implements corporatecontentuniqueinformationLocalService,
		ServiceWrapper<corporatecontentuniqueinformationLocalService> {
	public corporatecontentuniqueinformationLocalServiceWrapper(
		corporatecontentuniqueinformationLocalService corporatecontentuniqueinformationLocalService) {
		_corporatecontentuniqueinformationLocalService = corporatecontentuniqueinformationLocalService;
	}

	/**
	* Adds the corporatecontentuniqueinformation to the database. Also notifies the appropriate model listeners.
	*
	* @param corporatecontentuniqueinformation the corporatecontentuniqueinformation
	* @return the corporatecontentuniqueinformation that was added
	*/
	@Override
	public com.chola.calendar.model.corporatecontentuniqueinformation addcorporatecontentuniqueinformation(
		com.chola.calendar.model.corporatecontentuniqueinformation corporatecontentuniqueinformation) {
		return _corporatecontentuniqueinformationLocalService.addcorporatecontentuniqueinformation(corporatecontentuniqueinformation);
	}

	/**
	* Creates a new corporatecontentuniqueinformation with the primary key. Does not add the corporatecontentuniqueinformation to the database.
	*
	* @param id the primary key for the new corporatecontentuniqueinformation
	* @return the new corporatecontentuniqueinformation
	*/
	@Override
	public com.chola.calendar.model.corporatecontentuniqueinformation createcorporatecontentuniqueinformation(
		long id) {
		return _corporatecontentuniqueinformationLocalService.createcorporatecontentuniqueinformation(id);
	}

	/**
	* Deletes the corporatecontentuniqueinformation from the database. Also notifies the appropriate model listeners.
	*
	* @param corporatecontentuniqueinformation the corporatecontentuniqueinformation
	* @return the corporatecontentuniqueinformation that was removed
	*/
	@Override
	public com.chola.calendar.model.corporatecontentuniqueinformation deletecorporatecontentuniqueinformation(
		com.chola.calendar.model.corporatecontentuniqueinformation corporatecontentuniqueinformation) {
		return _corporatecontentuniqueinformationLocalService.deletecorporatecontentuniqueinformation(corporatecontentuniqueinformation);
	}

	/**
	* Deletes the corporatecontentuniqueinformation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the corporatecontentuniqueinformation
	* @return the corporatecontentuniqueinformation that was removed
	* @throws PortalException if a corporatecontentuniqueinformation with the primary key could not be found
	*/
	@Override
	public com.chola.calendar.model.corporatecontentuniqueinformation deletecorporatecontentuniqueinformation(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _corporatecontentuniqueinformationLocalService.deletecorporatecontentuniqueinformation(id);
	}

	@Override
	public com.chola.calendar.model.corporatecontentuniqueinformation fetchcorporatecontentuniqueinformation(
		long id) {
		return _corporatecontentuniqueinformationLocalService.fetchcorporatecontentuniqueinformation(id);
	}

	/**
	* Returns the corporatecontentuniqueinformation with the primary key.
	*
	* @param id the primary key of the corporatecontentuniqueinformation
	* @return the corporatecontentuniqueinformation
	* @throws PortalException if a corporatecontentuniqueinformation with the primary key could not be found
	*/
	@Override
	public com.chola.calendar.model.corporatecontentuniqueinformation getcorporatecontentuniqueinformation(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _corporatecontentuniqueinformationLocalService.getcorporatecontentuniqueinformation(id);
	}

	/**
	* Updates the corporatecontentuniqueinformation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param corporatecontentuniqueinformation the corporatecontentuniqueinformation
	* @return the corporatecontentuniqueinformation that was updated
	*/
	@Override
	public com.chola.calendar.model.corporatecontentuniqueinformation updatecorporatecontentuniqueinformation(
		com.chola.calendar.model.corporatecontentuniqueinformation corporatecontentuniqueinformation) {
		return _corporatecontentuniqueinformationLocalService.updatecorporatecontentuniqueinformation(corporatecontentuniqueinformation);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _corporatecontentuniqueinformationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _corporatecontentuniqueinformationLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _corporatecontentuniqueinformationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _corporatecontentuniqueinformationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _corporatecontentuniqueinformationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of corporatecontentuniqueinformations.
	*
	* @return the number of corporatecontentuniqueinformations
	*/
	@Override
	public int getcorporatecontentuniqueinformationsCount() {
		return _corporatecontentuniqueinformationLocalService.getcorporatecontentuniqueinformationsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _corporatecontentuniqueinformationLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _corporatecontentuniqueinformationLocalService.getOSGiServiceIdentifier();
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
		return _corporatecontentuniqueinformationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _corporatecontentuniqueinformationLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _corporatecontentuniqueinformationLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.chola.calendar.model.corporatecontentuniqueinformation> getCorporateEventId(
		long contentId) {
		return _corporatecontentuniqueinformationLocalService.getCorporateEventId(contentId);
	}

	/**
	* Returns a range of all the corporatecontentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporatecontentuniqueinformations
	* @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	* @return the range of corporatecontentuniqueinformations
	*/
	@Override
	public java.util.List<com.chola.calendar.model.corporatecontentuniqueinformation> getcorporatecontentuniqueinformations(
		int start, int end) {
		return _corporatecontentuniqueinformationLocalService.getcorporatecontentuniqueinformations(start,
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
		return _corporatecontentuniqueinformationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _corporatecontentuniqueinformationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public corporatecontentuniqueinformationLocalService getWrappedService() {
		return _corporatecontentuniqueinformationLocalService;
	}

	@Override
	public void setWrappedService(
		corporatecontentuniqueinformationLocalService corporatecontentuniqueinformationLocalService) {
		_corporatecontentuniqueinformationLocalService = corporatecontentuniqueinformationLocalService;
	}

	private corporatecontentuniqueinformationLocalService _corporatecontentuniqueinformationLocalService;
}