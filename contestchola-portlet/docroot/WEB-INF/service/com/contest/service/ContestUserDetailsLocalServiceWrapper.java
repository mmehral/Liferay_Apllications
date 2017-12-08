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

package com.contest.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ContestUserDetailsLocalService}.
 *
 * @author CloverLiferay01
 * @see ContestUserDetailsLocalService
 * @generated
 */
@ProviderType
public class ContestUserDetailsLocalServiceWrapper
	implements ContestUserDetailsLocalService,
		ServiceWrapper<ContestUserDetailsLocalService> {
	public ContestUserDetailsLocalServiceWrapper(
		ContestUserDetailsLocalService contestUserDetailsLocalService) {
		_contestUserDetailsLocalService = contestUserDetailsLocalService;
	}

	/**
	* Adds the contest user details to the database. Also notifies the appropriate model listeners.
	*
	* @param contestUserDetails the contest user details
	* @return the contest user details that was added
	*/
	@Override
	public com.contest.model.ContestUserDetails addContestUserDetails(
		com.contest.model.ContestUserDetails contestUserDetails) {
		return _contestUserDetailsLocalService.addContestUserDetails(contestUserDetails);
	}

	/**
	* Creates a new contest user details with the primary key. Does not add the contest user details to the database.
	*
	* @param id the primary key for the new contest user details
	* @return the new contest user details
	*/
	@Override
	public com.contest.model.ContestUserDetails createContestUserDetails(
		long id) {
		return _contestUserDetailsLocalService.createContestUserDetails(id);
	}

	/**
	* Deletes the contest user details from the database. Also notifies the appropriate model listeners.
	*
	* @param contestUserDetails the contest user details
	* @return the contest user details that was removed
	*/
	@Override
	public com.contest.model.ContestUserDetails deleteContestUserDetails(
		com.contest.model.ContestUserDetails contestUserDetails) {
		return _contestUserDetailsLocalService.deleteContestUserDetails(contestUserDetails);
	}

	/**
	* Deletes the contest user details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the contest user details
	* @return the contest user details that was removed
	* @throws PortalException if a contest user details with the primary key could not be found
	*/
	@Override
	public com.contest.model.ContestUserDetails deleteContestUserDetails(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _contestUserDetailsLocalService.deleteContestUserDetails(id);
	}

	@Override
	public com.contest.model.ContestUserDetails fetchContestUserDetails(long id) {
		return _contestUserDetailsLocalService.fetchContestUserDetails(id);
	}

	/**
	* Returns the contest user details with the primary key.
	*
	* @param id the primary key of the contest user details
	* @return the contest user details
	* @throws PortalException if a contest user details with the primary key could not be found
	*/
	@Override
	public com.contest.model.ContestUserDetails getContestUserDetails(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contestUserDetailsLocalService.getContestUserDetails(id);
	}

	/**
	* Updates the contest user details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param contestUserDetails the contest user details
	* @return the contest user details that was updated
	*/
	@Override
	public com.contest.model.ContestUserDetails updateContestUserDetails(
		com.contest.model.ContestUserDetails contestUserDetails) {
		return _contestUserDetailsLocalService.updateContestUserDetails(contestUserDetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _contestUserDetailsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _contestUserDetailsLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _contestUserDetailsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contestUserDetailsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contestUserDetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of contest user detailses.
	*
	* @return the number of contest user detailses
	*/
	@Override
	public int getContestUserDetailsesCount() {
		return _contestUserDetailsLocalService.getContestUserDetailsesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _contestUserDetailsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _contestUserDetailsLocalService.getOSGiServiceIdentifier();
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
		return _contestUserDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.contest.model.impl.ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _contestUserDetailsLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.contest.model.impl.ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _contestUserDetailsLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the contest user detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.contest.model.impl.ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contest user detailses
	* @param end the upper bound of the range of contest user detailses (not inclusive)
	* @return the range of contest user detailses
	*/
	@Override
	public java.util.List<com.contest.model.ContestUserDetails> getContestUserDetailses(
		int start, int end) {
		return _contestUserDetailsLocalService.getContestUserDetailses(start,
			end);
	}

	@Override
	public java.util.List<com.contest.model.ContestUserDetails> getUserIdByContestId(
		long id) {
		return _contestUserDetailsLocalService.getUserIdByContestId(id);
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
		return _contestUserDetailsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _contestUserDetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ContestUserDetailsLocalService getWrappedService() {
		return _contestUserDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		ContestUserDetailsLocalService contestUserDetailsLocalService) {
		_contestUserDetailsLocalService = contestUserDetailsLocalService;
	}

	private ContestUserDetailsLocalService _contestUserDetailsLocalService;
}