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
 * Provides a wrapper for {@link CholaContestLocalService}.
 *
 * @author CloverLiferay01
 * @see CholaContestLocalService
 * @generated
 */
@ProviderType
public class CholaContestLocalServiceWrapper implements CholaContestLocalService,
	ServiceWrapper<CholaContestLocalService> {
	public CholaContestLocalServiceWrapper(
		CholaContestLocalService cholaContestLocalService) {
		_cholaContestLocalService = cholaContestLocalService;
	}

	@Override
	public boolean insertNotifyStts(int syscode, int val,
		java.lang.String sysname, int stts, int sttsflag, long usernotifyId) {
		return _cholaContestLocalService.insertNotifyStts(syscode, val,
			sysname, stts, sttsflag, usernotifyId);
	}

	/**
	* Adds the chola contest to the database. Also notifies the appropriate model listeners.
	*
	* @param cholaContest the chola contest
	* @return the chola contest that was added
	*/
	@Override
	public com.contest.model.CholaContest addCholaContest(
		com.contest.model.CholaContest cholaContest) {
		return _cholaContestLocalService.addCholaContest(cholaContest);
	}

	/**
	* Creates a new chola contest with the primary key. Does not add the chola contest to the database.
	*
	* @param Id the primary key for the new chola contest
	* @return the new chola contest
	*/
	@Override
	public com.contest.model.CholaContest createCholaContest(long Id) {
		return _cholaContestLocalService.createCholaContest(Id);
	}

	/**
	* Deletes the chola contest from the database. Also notifies the appropriate model listeners.
	*
	* @param cholaContest the chola contest
	* @return the chola contest that was removed
	*/
	@Override
	public com.contest.model.CholaContest deleteCholaContest(
		com.contest.model.CholaContest cholaContest) {
		return _cholaContestLocalService.deleteCholaContest(cholaContest);
	}

	/**
	* Deletes the chola contest with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the chola contest
	* @return the chola contest that was removed
	* @throws PortalException if a chola contest with the primary key could not be found
	*/
	@Override
	public com.contest.model.CholaContest deleteCholaContest(long Id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cholaContestLocalService.deleteCholaContest(Id);
	}

	@Override
	public com.contest.model.CholaContest fetchCholaContest(long Id) {
		return _cholaContestLocalService.fetchCholaContest(Id);
	}

	/**
	* Returns the chola contest with the primary key.
	*
	* @param Id the primary key of the chola contest
	* @return the chola contest
	* @throws PortalException if a chola contest with the primary key could not be found
	*/
	@Override
	public com.contest.model.CholaContest getCholaContest(long Id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cholaContestLocalService.getCholaContest(Id);
	}

	/**
	* Updates the chola contest in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cholaContest the chola contest
	* @return the chola contest that was updated
	*/
	@Override
	public com.contest.model.CholaContest updateCholaContest(
		com.contest.model.CholaContest cholaContest) {
		return _cholaContestLocalService.updateCholaContest(cholaContest);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _cholaContestLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cholaContestLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _cholaContestLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cholaContestLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cholaContestLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of chola contests.
	*
	* @return the number of chola contests
	*/
	@Override
	public int getCholaContestsCount() {
		return _cholaContestLocalService.getCholaContestsCount();
	}

	@Override
	public java.lang.Integer getContestType(java.lang.String id) {
		return _cholaContestLocalService.getContestType(id);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _cholaContestLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _cholaContestLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<java.lang.Object[]> ContestList() {
		return _cholaContestLocalService.ContestList();
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
		return _cholaContestLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.contest.model.impl.CholaContestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cholaContestLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.contest.model.impl.CholaContestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cholaContestLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<java.lang.String> getAllUser(
		java.lang.String businessId, java.lang.String gender,
		java.lang.String age, java.lang.String option) {
		return _cholaContestLocalService.getAllUser(businessId, gender, age,
			option);
	}

	@Override
	public java.util.List<java.lang.String> getBranch(
		java.lang.String businessId) {
		return _cholaContestLocalService.getBranch(businessId);
	}

	/**
	* Returns a range of all the chola contests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.contest.model.impl.CholaContestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of chola contests
	* @param end the upper bound of the range of chola contests (not inclusive)
	* @return the range of chola contests
	*/
	@Override
	public java.util.List<com.contest.model.CholaContest> getCholaContests(
		int start, int end) {
		return _cholaContestLocalService.getCholaContests(start, end);
	}

	@Override
	public java.util.List<java.lang.String> getCompany() {
		return _cholaContestLocalService.getCompany();
	}

	@Override
	public java.util.List<java.lang.String> getDepart(
		java.lang.String businessId) {
		return _cholaContestLocalService.getDepart(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getDesignation(
		java.lang.String businessId) {
		return _cholaContestLocalService.getDesignation(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getFunction(
		java.lang.String businessId) {
		return _cholaContestLocalService.getFunction(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getGrade(
		java.lang.String businessId) {
		return _cholaContestLocalService.getGrade(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getIntendedUser(
		java.lang.String businessId, java.lang.String[] values,
		java.lang.String gender, java.lang.String age, java.lang.String option) {
		return _cholaContestLocalService.getIntendedUser(businessId, values,
			gender, age, option);
	}

	@Override
	public java.util.List<java.lang.String> getLocation(
		java.lang.String businessId) {
		return _cholaContestLocalService.getLocation(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getProduct(
		java.lang.String businessId) {
		return _cholaContestLocalService.getProduct(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getRegion(
		java.lang.String businessId) {
		return _cholaContestLocalService.getRegion(businessId);
	}

	@Override
	public java.util.List<java.lang.String> getUnit(java.lang.String businessId) {
		return _cholaContestLocalService.getUnit(businessId);
	}

	@Override
	public java.util.List<java.lang.Object[]> getUsers() {
		return _cholaContestLocalService.getUsers();
	}

	@Override
	public java.util.List<java.lang.String> getZone(java.lang.String businessId) {
		return _cholaContestLocalService.getZone(businessId);
	}

	@Override
	public java.util.List<java.lang.Object[]> syscodeCustomMsg(int syscode) {
		return _cholaContestLocalService.syscodeCustomMsg(syscode);
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
		return _cholaContestLocalService.dynamicQueryCount(dynamicQuery);
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
		return _cholaContestLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public CholaContestLocalService getWrappedService() {
		return _cholaContestLocalService;
	}

	@Override
	public void setWrappedService(
		CholaContestLocalService cholaContestLocalService) {
		_cholaContestLocalService = cholaContestLocalService;
	}

	private CholaContestLocalService _cholaContestLocalService;
}