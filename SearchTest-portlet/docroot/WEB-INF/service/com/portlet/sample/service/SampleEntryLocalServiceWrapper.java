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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SampleEntryLocalService}.
 *
 * @author CloverLiferay01
 * @see SampleEntryLocalService
 * @generated
 */
@ProviderType
public class SampleEntryLocalServiceWrapper implements SampleEntryLocalService,
	ServiceWrapper<SampleEntryLocalService> {
	public SampleEntryLocalServiceWrapper(
		SampleEntryLocalService sampleEntryLocalService) {
		_sampleEntryLocalService = sampleEntryLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _sampleEntryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sampleEntryLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _sampleEntryLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _sampleEntryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _sampleEntryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _sampleEntryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the sample entry to the database. Also notifies the appropriate model listeners.
	*
	* @param sampleEntry the sample entry
	* @return the sample entry that was added
	*/
	@Override
	public com.portlet.sample.model.SampleEntry addSampleEntry(
		com.portlet.sample.model.SampleEntry sampleEntry) {
		return _sampleEntryLocalService.addSampleEntry(sampleEntry);
	}

	/**
	* Creates a new sample entry with the primary key. Does not add the sample entry to the database.
	*
	* @param entryId the primary key for the new sample entry
	* @return the new sample entry
	*/
	@Override
	public com.portlet.sample.model.SampleEntry createSampleEntry(long entryId) {
		return _sampleEntryLocalService.createSampleEntry(entryId);
	}

	/**
	* Deletes the sample entry from the database. Also notifies the appropriate model listeners.
	*
	* @param sampleEntry the sample entry
	* @return the sample entry that was removed
	*/
	@Override
	public com.portlet.sample.model.SampleEntry deleteSampleEntry(
		com.portlet.sample.model.SampleEntry sampleEntry) {
		return _sampleEntryLocalService.deleteSampleEntry(sampleEntry);
	}

	/**
	* Deletes the sample entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the sample entry
	* @return the sample entry that was removed
	* @throws PortalException if a sample entry with the primary key could not be found
	*/
	@Override
	public com.portlet.sample.model.SampleEntry deleteSampleEntry(long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _sampleEntryLocalService.deleteSampleEntry(entryId);
	}

	@Override
	public com.portlet.sample.model.SampleEntry fetchSampleEntry(long entryId) {
		return _sampleEntryLocalService.fetchSampleEntry(entryId);
	}

	/**
	* Returns the sample entry matching the UUID and group.
	*
	* @param uuid the sample entry's UUID
	* @param groupId the primary key of the group
	* @return the matching sample entry, or <code>null</code> if a matching sample entry could not be found
	*/
	@Override
	public com.portlet.sample.model.SampleEntry fetchSampleEntryByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _sampleEntryLocalService.fetchSampleEntryByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the sample entry with the primary key.
	*
	* @param entryId the primary key of the sample entry
	* @return the sample entry
	* @throws PortalException if a sample entry with the primary key could not be found
	*/
	@Override
	public com.portlet.sample.model.SampleEntry getSampleEntry(long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _sampleEntryLocalService.getSampleEntry(entryId);
	}

	/**
	* Returns the sample entry matching the UUID and group.
	*
	* @param uuid the sample entry's UUID
	* @param groupId the primary key of the group
	* @return the matching sample entry
	* @throws PortalException if a matching sample entry could not be found
	*/
	@Override
	public com.portlet.sample.model.SampleEntry getSampleEntryByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _sampleEntryLocalService.getSampleEntryByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the sample entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sampleEntry the sample entry
	* @return the sample entry that was updated
	*/
	@Override
	public com.portlet.sample.model.SampleEntry updateSampleEntry(
		com.portlet.sample.model.SampleEntry sampleEntry) {
		return _sampleEntryLocalService.updateSampleEntry(sampleEntry);
	}

	/**
	* Returns the number of sample entries.
	*
	* @return the number of sample entries
	*/
	@Override
	public int getSampleEntriesCount() {
		return _sampleEntryLocalService.getSampleEntriesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sampleEntryLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _sampleEntryLocalService.getOSGiServiceIdentifier();
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
		return _sampleEntryLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _sampleEntryLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _sampleEntryLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
	@Override
	public java.util.List<com.portlet.sample.model.SampleEntry> getSampleEntries(
		int start, int end) {
		return _sampleEntryLocalService.getSampleEntries(start, end);
	}

	/**
	* Returns all the sample entries matching the UUID and company.
	*
	* @param uuid the UUID of the sample entries
	* @param companyId the primary key of the company
	* @return the matching sample entries, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.portlet.sample.model.SampleEntry> getSampleEntriesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _sampleEntryLocalService.getSampleEntriesByUuidAndCompanyId(uuid,
			companyId);
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
	@Override
	public java.util.List<com.portlet.sample.model.SampleEntry> getSampleEntriesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.portlet.sample.model.SampleEntry> orderByComparator) {
		return _sampleEntryLocalService.getSampleEntriesByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
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
		return _sampleEntryLocalService.dynamicQueryCount(dynamicQuery);
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
		return _sampleEntryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public SampleEntryLocalService getWrappedService() {
		return _sampleEntryLocalService;
	}

	@Override
	public void setWrappedService(
		SampleEntryLocalService sampleEntryLocalService) {
		_sampleEntryLocalService = sampleEntryLocalService;
	}

	private SampleEntryLocalService _sampleEntryLocalService;
}