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

package com.portlet.sample.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the local service utility for SampleEntry. This utility wraps
 * {@link com.portlet.sample.service.impl.SampleEntryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CloverLiferay01
 * @see SampleEntryLocalService
 * @see com.portlet.sample.service.base.SampleEntryLocalServiceBaseImpl
 * @see com.portlet.sample.service.impl.SampleEntryLocalServiceImpl
 * @generated
 */
@ProviderType
public class SampleEntryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.portlet.sample.service.impl.SampleEntryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
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
	* Adds the sample entry to the database. Also notifies the appropriate model listeners.
	*
	* @param sampleEntry the sample entry
	* @return the sample entry that was added
	*/
	public static com.portlet.sample.model.SampleEntry addSampleEntry(
		com.portlet.sample.model.SampleEntry sampleEntry) {
		return getService().addSampleEntry(sampleEntry);
	}

	/**
	* Creates a new sample entry with the primary key. Does not add the sample entry to the database.
	*
	* @param entryId the primary key for the new sample entry
	* @return the new sample entry
	*/
	public static com.portlet.sample.model.SampleEntry createSampleEntry(
		long entryId) {
		return getService().createSampleEntry(entryId);
	}

	/**
	* Deletes the sample entry from the database. Also notifies the appropriate model listeners.
	*
	* @param sampleEntry the sample entry
	* @return the sample entry that was removed
	*/
	public static com.portlet.sample.model.SampleEntry deleteSampleEntry(
		com.portlet.sample.model.SampleEntry sampleEntry) {
		return getService().deleteSampleEntry(sampleEntry);
	}

	/**
	* Deletes the sample entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the sample entry
	* @return the sample entry that was removed
	* @throws PortalException if a sample entry with the primary key could not be found
	*/
	public static com.portlet.sample.model.SampleEntry deleteSampleEntry(
		long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteSampleEntry(entryId);
	}

	public static com.portlet.sample.model.SampleEntry fetchSampleEntry(
		long entryId) {
		return getService().fetchSampleEntry(entryId);
	}

	/**
	* Returns the sample entry matching the UUID and group.
	*
	* @param uuid the sample entry's UUID
	* @param groupId the primary key of the group
	* @return the matching sample entry, or <code>null</code> if a matching sample entry could not be found
	*/
	public static com.portlet.sample.model.SampleEntry fetchSampleEntryByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchSampleEntryByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the sample entry with the primary key.
	*
	* @param entryId the primary key of the sample entry
	* @return the sample entry
	* @throws PortalException if a sample entry with the primary key could not be found
	*/
	public static com.portlet.sample.model.SampleEntry getSampleEntry(
		long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getSampleEntry(entryId);
	}

	/**
	* Returns the sample entry matching the UUID and group.
	*
	* @param uuid the sample entry's UUID
	* @param groupId the primary key of the group
	* @return the matching sample entry
	* @throws PortalException if a matching sample entry could not be found
	*/
	public static com.portlet.sample.model.SampleEntry getSampleEntryByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getSampleEntryByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the sample entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sampleEntry the sample entry
	* @return the sample entry that was updated
	*/
	public static com.portlet.sample.model.SampleEntry updateSampleEntry(
		com.portlet.sample.model.SampleEntry sampleEntry) {
		return getService().updateSampleEntry(sampleEntry);
	}

	/**
	* Returns the number of sample entries.
	*
	* @return the number of sample entries
	*/
	public static int getSampleEntriesCount() {
		return getService().getSampleEntriesCount();
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.portlet.sample.model.impl.SampleEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.portlet.sample.model.impl.SampleEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	/**
	* Returns a range of all the sample entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.portlet.sample.model.impl.SampleEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sample entries
	* @param end the upper bound of the range of sample entries (not inclusive)
	* @return the range of sample entries
	*/
	public static java.util.List<com.portlet.sample.model.SampleEntry> getSampleEntries(
		int start, int end) {
		return getService().getSampleEntries(start, end);
	}

	/**
	* Returns all the sample entries matching the UUID and company.
	*
	* @param uuid the UUID of the sample entries
	* @param companyId the primary key of the company
	* @return the matching sample entries, or an empty list if no matches were found
	*/
	public static java.util.List<com.portlet.sample.model.SampleEntry> getSampleEntriesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getSampleEntriesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of sample entries matching the UUID and company.
	*
	* @param uuid the UUID of the sample entries
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of sample entries
	* @param end the upper bound of the range of sample entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching sample entries, or an empty list if no matches were found
	*/
	public static java.util.List<com.portlet.sample.model.SampleEntry> getSampleEntriesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.portlet.sample.model.SampleEntry> orderByComparator) {
		return getService()
				   .getSampleEntriesByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
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

	public static SampleEntryLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					SampleEntryLocalService.class.getName());

			if (invokableLocalService instanceof SampleEntryLocalService) {
				_service = (SampleEntryLocalService)invokableLocalService;
			}
			else {
				_service = new SampleEntryLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(SampleEntryLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static SampleEntryLocalService _service;
}