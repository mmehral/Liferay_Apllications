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

package com.chola.mdspeak.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MdSpeaksLocalService}.
 *
 * @author adms.java1
 * @see MdSpeaksLocalService
 * @generated
 */
@ProviderType
public class MdSpeaksLocalServiceWrapper implements MdSpeaksLocalService,
	ServiceWrapper<MdSpeaksLocalService> {
	public MdSpeaksLocalServiceWrapper(
		MdSpeaksLocalService mdSpeaksLocalService) {
		_mdSpeaksLocalService = mdSpeaksLocalService;
	}

	/**
	* Adds the md speaks to the database. Also notifies the appropriate model listeners.
	*
	* @param mdSpeaks the md speaks
	* @return the md speaks that was added
	*/
	@Override
	public com.chola.mdspeak.model.MdSpeaks addMdSpeaks(
		com.chola.mdspeak.model.MdSpeaks mdSpeaks) {
		return _mdSpeaksLocalService.addMdSpeaks(mdSpeaks);
	}

	/**
	* Creates a new md speaks with the primary key. Does not add the md speaks to the database.
	*
	* @param Id the primary key for the new md speaks
	* @return the new md speaks
	*/
	@Override
	public com.chola.mdspeak.model.MdSpeaks createMdSpeaks(long Id) {
		return _mdSpeaksLocalService.createMdSpeaks(Id);
	}

	/**
	* Deletes the md speaks from the database. Also notifies the appropriate model listeners.
	*
	* @param mdSpeaks the md speaks
	* @return the md speaks that was removed
	*/
	@Override
	public com.chola.mdspeak.model.MdSpeaks deleteMdSpeaks(
		com.chola.mdspeak.model.MdSpeaks mdSpeaks) {
		return _mdSpeaksLocalService.deleteMdSpeaks(mdSpeaks);
	}

	/**
	* Deletes the md speaks with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the md speaks
	* @return the md speaks that was removed
	* @throws PortalException if a md speaks with the primary key could not be found
	*/
	@Override
	public com.chola.mdspeak.model.MdSpeaks deleteMdSpeaks(long Id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mdSpeaksLocalService.deleteMdSpeaks(Id);
	}

	@Override
	public com.chola.mdspeak.model.MdSpeaks fetchMdSpeaks(long Id) {
		return _mdSpeaksLocalService.fetchMdSpeaks(Id);
	}

	/**
	* Returns the md speaks with the primary key.
	*
	* @param Id the primary key of the md speaks
	* @return the md speaks
	* @throws PortalException if a md speaks with the primary key could not be found
	*/
	@Override
	public com.chola.mdspeak.model.MdSpeaks getMdSpeaks(long Id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mdSpeaksLocalService.getMdSpeaks(Id);
	}

	/**
	* Updates the md speaks in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param mdSpeaks the md speaks
	* @return the md speaks that was updated
	*/
	@Override
	public com.chola.mdspeak.model.MdSpeaks updateMdSpeaks(
		com.chola.mdspeak.model.MdSpeaks mdSpeaks) {
		return _mdSpeaksLocalService.updateMdSpeaks(mdSpeaks);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _mdSpeaksLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _mdSpeaksLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _mdSpeaksLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mdSpeaksLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mdSpeaksLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of md speakses.
	*
	* @return the number of md speakses
	*/
	@Override
	public int getMdSpeaksesCount() {
		return _mdSpeaksLocalService.getMdSpeaksesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _mdSpeaksLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _mdSpeaksLocalService.getOSGiServiceIdentifier();
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
		return _mdSpeaksLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.mdspeak.model.impl.MdSpeaksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _mdSpeaksLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.mdspeak.model.impl.MdSpeaksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _mdSpeaksLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the md speakses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.mdspeak.model.impl.MdSpeaksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of md speakses
	* @param end the upper bound of the range of md speakses (not inclusive)
	* @return the range of md speakses
	*/
	@Override
	public java.util.List<com.chola.mdspeak.model.MdSpeaks> getMdSpeakses(
		int start, int end) {
		return _mdSpeaksLocalService.getMdSpeakses(start, end);
	}

	@Override
	public java.util.List<java.lang.Object[]> mdblog(java.lang.String url) {
		return _mdSpeaksLocalService.mdblog(url);
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
		return _mdSpeaksLocalService.dynamicQueryCount(dynamicQuery);
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
		return _mdSpeaksLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public MdSpeaksLocalService getWrappedService() {
		return _mdSpeaksLocalService;
	}

	@Override
	public void setWrappedService(MdSpeaksLocalService mdSpeaksLocalService) {
		_mdSpeaksLocalService = mdSpeaksLocalService;
	}

	private MdSpeaksLocalService _mdSpeaksLocalService;
}