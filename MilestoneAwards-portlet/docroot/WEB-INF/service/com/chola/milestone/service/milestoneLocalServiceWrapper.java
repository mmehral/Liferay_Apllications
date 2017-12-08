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

package com.chola.milestone.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link milestoneLocalService}.
 *
 * @author CloverLiferay02
 * @see milestoneLocalService
 * @generated
 */
@ProviderType
public class milestoneLocalServiceWrapper implements milestoneLocalService,
	ServiceWrapper<milestoneLocalService> {
	public milestoneLocalServiceWrapper(
		milestoneLocalService milestoneLocalService) {
		_milestoneLocalService = milestoneLocalService;
	}

	@Override
	public boolean insertData(java.lang.String message,
		java.lang.String postedBy, java.lang.String empId) {
		return _milestoneLocalService.insertData(message, postedBy, empId);
	}

	/**
	* Adds the milestone to the database. Also notifies the appropriate model listeners.
	*
	* @param milestone the milestone
	* @return the milestone that was added
	*/
	@Override
	public com.chola.milestone.model.milestone addmilestone(
		com.chola.milestone.model.milestone milestone) {
		return _milestoneLocalService.addmilestone(milestone);
	}

	/**
	* Creates a new milestone with the primary key. Does not add the milestone to the database.
	*
	* @param id the primary key for the new milestone
	* @return the new milestone
	*/
	@Override
	public com.chola.milestone.model.milestone createmilestone(long id) {
		return _milestoneLocalService.createmilestone(id);
	}

	/**
	* Deletes the milestone from the database. Also notifies the appropriate model listeners.
	*
	* @param milestone the milestone
	* @return the milestone that was removed
	*/
	@Override
	public com.chola.milestone.model.milestone deletemilestone(
		com.chola.milestone.model.milestone milestone) {
		return _milestoneLocalService.deletemilestone(milestone);
	}

	/**
	* Deletes the milestone with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the milestone
	* @return the milestone that was removed
	* @throws PortalException if a milestone with the primary key could not be found
	*/
	@Override
	public com.chola.milestone.model.milestone deletemilestone(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _milestoneLocalService.deletemilestone(id);
	}

	@Override
	public com.chola.milestone.model.milestone fetchmilestone(long id) {
		return _milestoneLocalService.fetchmilestone(id);
	}

	/**
	* Returns the milestone with the primary key.
	*
	* @param id the primary key of the milestone
	* @return the milestone
	* @throws PortalException if a milestone with the primary key could not be found
	*/
	@Override
	public com.chola.milestone.model.milestone getmilestone(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _milestoneLocalService.getmilestone(id);
	}

	/**
	* Updates the milestone in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param milestone the milestone
	* @return the milestone that was updated
	*/
	@Override
	public com.chola.milestone.model.milestone updatemilestone(
		com.chola.milestone.model.milestone milestone) {
		return _milestoneLocalService.updatemilestone(milestone);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _milestoneLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _milestoneLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _milestoneLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _milestoneLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _milestoneLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of milestones.
	*
	* @return the number of milestones
	*/
	@Override
	public int getmilestonesCount() {
		return _milestoneLocalService.getmilestonesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _milestoneLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _milestoneLocalService.getOSGiServiceIdentifier();
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
		return _milestoneLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.milestone.model.impl.milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _milestoneLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.milestone.model.impl.milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _milestoneLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List getEmpData(java.lang.String date) {
		return _milestoneLocalService.getEmpData(date);
	}

	@Override
	public java.util.List getEmpProfile(java.lang.String empId) {
		return _milestoneLocalService.getEmpProfile(empId);
	}

	/**
	* Returns a range of all the milestones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.milestone.model.impl.milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of milestones
	* @param end the upper bound of the range of milestones (not inclusive)
	* @return the range of milestones
	*/
	@Override
	public java.util.List<com.chola.milestone.model.milestone> getmilestones(
		int start, int end) {
		return _milestoneLocalService.getmilestones(start, end);
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
		return _milestoneLocalService.dynamicQueryCount(dynamicQuery);
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
		return _milestoneLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public milestoneLocalService getWrappedService() {
		return _milestoneLocalService;
	}

	@Override
	public void setWrappedService(milestoneLocalService milestoneLocalService) {
		_milestoneLocalService = milestoneLocalService;
	}

	private milestoneLocalService _milestoneLocalService;
}