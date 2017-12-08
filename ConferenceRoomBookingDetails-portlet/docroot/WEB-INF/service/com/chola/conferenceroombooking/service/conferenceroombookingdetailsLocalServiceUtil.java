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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for conferenceroombookingdetails. This utility wraps
 * {@link com.chola.conferenceroombooking.service.impl.conferenceroombookingdetailsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author adms.java1
 * @see conferenceroombookingdetailsLocalService
 * @see com.chola.conferenceroombooking.service.base.conferenceroombookingdetailsLocalServiceBaseImpl
 * @see com.chola.conferenceroombooking.service.impl.conferenceroombookingdetailsLocalServiceImpl
 * @generated
 */
@ProviderType
public class conferenceroombookingdetailsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.chola.conferenceroombooking.service.impl.conferenceroombookingdetailsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static boolean updateMybooking(int status, long userid, long bookid) {
		return getService().updateMybooking(status, userid, bookid);
	}

	/**
	* Adds the conferenceroombookingdetails to the database. Also notifies the appropriate model listeners.
	*
	* @param conferenceroombookingdetails the conferenceroombookingdetails
	* @return the conferenceroombookingdetails that was added
	*/
	public static com.chola.conferenceroombooking.model.conferenceroombookingdetails addconferenceroombookingdetails(
		com.chola.conferenceroombooking.model.conferenceroombookingdetails conferenceroombookingdetails) {
		return getService()
				   .addconferenceroombookingdetails(conferenceroombookingdetails);
	}

	/**
	* Creates a new conferenceroombookingdetails with the primary key. Does not add the conferenceroombookingdetails to the database.
	*
	* @param bookid the primary key for the new conferenceroombookingdetails
	* @return the new conferenceroombookingdetails
	*/
	public static com.chola.conferenceroombooking.model.conferenceroombookingdetails createconferenceroombookingdetails(
		long bookid) {
		return getService().createconferenceroombookingdetails(bookid);
	}

	/**
	* Deletes the conferenceroombookingdetails from the database. Also notifies the appropriate model listeners.
	*
	* @param conferenceroombookingdetails the conferenceroombookingdetails
	* @return the conferenceroombookingdetails that was removed
	*/
	public static com.chola.conferenceroombooking.model.conferenceroombookingdetails deleteconferenceroombookingdetails(
		com.chola.conferenceroombooking.model.conferenceroombookingdetails conferenceroombookingdetails) {
		return getService()
				   .deleteconferenceroombookingdetails(conferenceroombookingdetails);
	}

	/**
	* Deletes the conferenceroombookingdetails with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bookid the primary key of the conferenceroombookingdetails
	* @return the conferenceroombookingdetails that was removed
	* @throws PortalException if a conferenceroombookingdetails with the primary key could not be found
	*/
	public static com.chola.conferenceroombooking.model.conferenceroombookingdetails deleteconferenceroombookingdetails(
		long bookid) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteconferenceroombookingdetails(bookid);
	}

	public static com.chola.conferenceroombooking.model.conferenceroombookingdetails fetchconferenceroombookingdetails(
		long bookid) {
		return getService().fetchconferenceroombookingdetails(bookid);
	}

	/**
	* Returns the conferenceroombookingdetails with the primary key.
	*
	* @param bookid the primary key of the conferenceroombookingdetails
	* @return the conferenceroombookingdetails
	* @throws PortalException if a conferenceroombookingdetails with the primary key could not be found
	*/
	public static com.chola.conferenceroombooking.model.conferenceroombookingdetails getconferenceroombookingdetails(
		long bookid) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getconferenceroombookingdetails(bookid);
	}

	/**
	* Updates the conferenceroombookingdetails in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param conferenceroombookingdetails the conferenceroombookingdetails
	* @return the conferenceroombookingdetails that was updated
	*/
	public static com.chola.conferenceroombooking.model.conferenceroombookingdetails updateconferenceroombookingdetails(
		com.chola.conferenceroombooking.model.conferenceroombookingdetails conferenceroombookingdetails) {
		return getService()
				   .updateconferenceroombookingdetails(conferenceroombookingdetails);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of conferenceroombookingdetailses.
	*
	* @return the number of conferenceroombookingdetailses
	*/
	public static int getconferenceroombookingdetailsesCount() {
		return getService().getconferenceroombookingdetailsesCount();
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.lang.Object[] getRoomMaster(int stateid, int locid,
		int id) {
		return getService().getRoomMaster(stateid, locid, id);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.lang.String getStatename(long stateId) {
		return getService().getStatename(stateId);
	}

	public static java.lang.String getfloorname(long floorId) {
		return getService().getfloorname(floorId);
	}

	public static java.lang.String getlocationname(long locationId) {
		return getService().getlocationname(locationId);
	}

	public static java.util.List<java.lang.Object[]> allBookingList(
		java.lang.String startdate, java.lang.String endate,
		java.lang.String stateid, java.lang.String locid) {
		return getService().allBookingList(startdate, endate, stateid, locid);
	}

	public static java.util.List<java.lang.Object[]> conferenceroom(
		int stateid, int locationid) {
		return getService().conferenceroom(stateid, locationid);
	}

	public static java.util.List<java.lang.Object[]> defaultallBookingList(
		java.lang.String startdate, java.lang.String endate) {
		return getService().defaultallBookingList(startdate, endate);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<java.lang.Object[]> getConferenceList(
		java.lang.String startime, java.lang.String endtime, int roomid,
		java.lang.String strtdate) {
		return getService()
				   .getConferenceList(startime, endtime, roomid, strtdate);
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
	public static java.util.List<com.chola.conferenceroombooking.model.conferenceroombookingdetails> getconferenceroombookingdetailses(
		int start, int end) {
		return getService().getconferenceroombookingdetailses(start, end);
	}

	public static java.util.List<java.lang.Long> getroomId(int stateid,
		int locid) {
		return getService().getroomId(stateid, locid);
	}

	public static java.util.List<java.lang.Object[]> location(int stateid) {
		return getService().location(stateid);
	}

	public static java.util.List<java.lang.Object[]> mybookinglist(
		long userid, int status) {
		return getService().mybookinglist(userid, status);
	}

	public static java.util.List<java.lang.Object[]> state() {
		return getService().state();
	}

	public static java.util.List<java.lang.Object[]> syscodeCustomMsg(
		int syscode) {
		return getService().syscodeCustomMsg(syscode);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static void clearService() {
		_service = null;
	}

	public static conferenceroombookingdetailsLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					conferenceroombookingdetailsLocalService.class.getName());

			if (invokableLocalService instanceof conferenceroombookingdetailsLocalService) {
				_service = (conferenceroombookingdetailsLocalService)invokableLocalService;
			}
			else {
				_service = new conferenceroombookingdetailsLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(conferenceroombookingdetailsLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static conferenceroombookingdetailsLocalService _service;
}