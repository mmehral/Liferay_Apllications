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

package com.chola.conferenceroombooking.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link conferenceroombookingdetailsLocalService}.
 *
 * @author adms.java1
 * @see conferenceroombookingdetailsLocalService
 * @generated
 */
@ProviderType
public class conferenceroombookingdetailsLocalServiceWrapper
	implements conferenceroombookingdetailsLocalService,
		ServiceWrapper<conferenceroombookingdetailsLocalService> {
	public conferenceroombookingdetailsLocalServiceWrapper(
		conferenceroombookingdetailsLocalService conferenceroombookingdetailsLocalService) {
		_conferenceroombookingdetailsLocalService = conferenceroombookingdetailsLocalService;
	}

	@Override
	public boolean updateMybooking(int status, long userid, long bookid) {
		return _conferenceroombookingdetailsLocalService.updateMybooking(status,
			userid, bookid);
	}

	/**
	* Adds the conferenceroombookingdetails to the database. Also notifies the appropriate model listeners.
	*
	* @param conferenceroombookingdetails the conferenceroombookingdetails
	* @return the conferenceroombookingdetails that was added
	*/
	@Override
	public com.chola.conferenceroombooking.model.conferenceroombookingdetails addconferenceroombookingdetails(
		com.chola.conferenceroombooking.model.conferenceroombookingdetails conferenceroombookingdetails) {
		return _conferenceroombookingdetailsLocalService.addconferenceroombookingdetails(conferenceroombookingdetails);
	}

	/**
	* Creates a new conferenceroombookingdetails with the primary key. Does not add the conferenceroombookingdetails to the database.
	*
	* @param bookid the primary key for the new conferenceroombookingdetails
	* @return the new conferenceroombookingdetails
	*/
	@Override
	public com.chola.conferenceroombooking.model.conferenceroombookingdetails createconferenceroombookingdetails(
		long bookid) {
		return _conferenceroombookingdetailsLocalService.createconferenceroombookingdetails(bookid);
	}

	/**
	* Deletes the conferenceroombookingdetails from the database. Also notifies the appropriate model listeners.
	*
	* @param conferenceroombookingdetails the conferenceroombookingdetails
	* @return the conferenceroombookingdetails that was removed
	*/
	@Override
	public com.chola.conferenceroombooking.model.conferenceroombookingdetails deleteconferenceroombookingdetails(
		com.chola.conferenceroombooking.model.conferenceroombookingdetails conferenceroombookingdetails) {
		return _conferenceroombookingdetailsLocalService.deleteconferenceroombookingdetails(conferenceroombookingdetails);
	}

	/**
	* Deletes the conferenceroombookingdetails with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookid the primary key of the conferenceroombookingdetails
	* @return the conferenceroombookingdetails that was removed
	* @throws PortalException if a conferenceroombookingdetails with the primary key could not be found
	*/
	@Override
	public com.chola.conferenceroombooking.model.conferenceroombookingdetails deleteconferenceroombookingdetails(
		long bookid) throws com.liferay.portal.kernel.exception.PortalException {
		return _conferenceroombookingdetailsLocalService.deleteconferenceroombookingdetails(bookid);
	}

	@Override
	public com.chola.conferenceroombooking.model.conferenceroombookingdetails fetchconferenceroombookingdetails(
		long bookid) {
		return _conferenceroombookingdetailsLocalService.fetchconferenceroombookingdetails(bookid);
	}

	/**
	* Returns the conferenceroombookingdetails with the primary key.
	*
	* @param bookid the primary key of the conferenceroombookingdetails
	* @return the conferenceroombookingdetails
	* @throws PortalException if a conferenceroombookingdetails with the primary key could not be found
	*/
	@Override
	public com.chola.conferenceroombooking.model.conferenceroombookingdetails getconferenceroombookingdetails(
		long bookid) throws com.liferay.portal.kernel.exception.PortalException {
		return _conferenceroombookingdetailsLocalService.getconferenceroombookingdetails(bookid);
	}

	/**
	* Updates the conferenceroombookingdetails in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param conferenceroombookingdetails the conferenceroombookingdetails
	* @return the conferenceroombookingdetails that was updated
	*/
	@Override
	public com.chola.conferenceroombooking.model.conferenceroombookingdetails updateconferenceroombookingdetails(
		com.chola.conferenceroombooking.model.conferenceroombookingdetails conferenceroombookingdetails) {
		return _conferenceroombookingdetailsLocalService.updateconferenceroombookingdetails(conferenceroombookingdetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _conferenceroombookingdetailsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _conferenceroombookingdetailsLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _conferenceroombookingdetailsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _conferenceroombookingdetailsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _conferenceroombookingdetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of conferenceroombookingdetailses.
	*
	* @return the number of conferenceroombookingdetailses
	*/
	@Override
	public int getconferenceroombookingdetailsesCount() {
		return _conferenceroombookingdetailsLocalService.getconferenceroombookingdetailsesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _conferenceroombookingdetailsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.lang.Object[] getRoomMaster(int stateid, int locid, int id) {
		return _conferenceroombookingdetailsLocalService.getRoomMaster(stateid,
			locid, id);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _conferenceroombookingdetailsLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.lang.String getStatename(long stateId) {
		return _conferenceroombookingdetailsLocalService.getStatename(stateId);
	}

	@Override
	public java.lang.String getfloorname(long floorId) {
		return _conferenceroombookingdetailsLocalService.getfloorname(floorId);
	}

	@Override
	public java.lang.String getlocationname(long locationId) {
		return _conferenceroombookingdetailsLocalService.getlocationname(locationId);
	}

	@Override
	public java.util.List<java.lang.Object[]> allBookingList(
		java.lang.String startdate, java.lang.String endate,
		java.lang.String stateid, java.lang.String locid) {
		return _conferenceroombookingdetailsLocalService.allBookingList(startdate,
			endate, stateid, locid);
	}

	@Override
	public java.util.List<java.lang.Object[]> conferenceroom(int stateid,
		int locationid) {
		return _conferenceroombookingdetailsLocalService.conferenceroom(stateid,
			locationid);
	}

	@Override
	public java.util.List<java.lang.Object[]> defaultallBookingList(
		java.lang.String startdate, java.lang.String endate) {
		return _conferenceroombookingdetailsLocalService.defaultallBookingList(startdate,
			endate);
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
		return _conferenceroombookingdetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.conferenceroombooking.model.impl.conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _conferenceroombookingdetailsLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.conferenceroombooking.model.impl.conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _conferenceroombookingdetailsLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<java.lang.Object[]> getConferenceList(
		java.lang.String startime, java.lang.String endtime, int roomid,
		java.lang.String strtdate) {
		return _conferenceroombookingdetailsLocalService.getConferenceList(startime,
			endtime, roomid, strtdate);
	}

	/**
	* Returns a range of all the conferenceroombookingdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.conferenceroombooking.model.impl.conferenceroombookingdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of conferenceroombookingdetailses
	* @param end the upper bound of the range of conferenceroombookingdetailses (not inclusive)
	* @return the range of conferenceroombookingdetailses
	*/
	@Override
	public java.util.List<com.chola.conferenceroombooking.model.conferenceroombookingdetails> getconferenceroombookingdetailses(
		int start, int end) {
		return _conferenceroombookingdetailsLocalService.getconferenceroombookingdetailses(start,
			end);
	}

	@Override
	public java.util.List<java.lang.Long> getroomId(int stateid, int locid) {
		return _conferenceroombookingdetailsLocalService.getroomId(stateid,
			locid);
	}

	@Override
	public java.util.List<java.lang.Object[]> location(int stateid) {
		return _conferenceroombookingdetailsLocalService.location(stateid);
	}

	@Override
	public java.util.List<java.lang.Object[]> mybookinglist(long userid,
		int status) {
		return _conferenceroombookingdetailsLocalService.mybookinglist(userid,
			status);
	}

	@Override
	public java.util.List<java.lang.Object[]> state() {
		return _conferenceroombookingdetailsLocalService.state();
	}

	@Override
	public java.util.List<java.lang.Object[]> syscodeCustomMsg(int syscode) {
		return _conferenceroombookingdetailsLocalService.syscodeCustomMsg(syscode);
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
		return _conferenceroombookingdetailsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _conferenceroombookingdetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public conferenceroombookingdetailsLocalService getWrappedService() {
		return _conferenceroombookingdetailsLocalService;
	}

	@Override
	public void setWrappedService(
		conferenceroombookingdetailsLocalService conferenceroombookingdetailsLocalService) {
		_conferenceroombookingdetailsLocalService = conferenceroombookingdetailsLocalService;
	}

	private conferenceroombookingdetailsLocalService _conferenceroombookingdetailsLocalService;
}