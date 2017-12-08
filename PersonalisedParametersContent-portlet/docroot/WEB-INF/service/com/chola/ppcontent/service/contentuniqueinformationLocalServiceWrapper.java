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

package com.chola.ppcontent.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link contentuniqueinformationLocalService}.
 *
 * @author cloverliferay01
 * @see contentuniqueinformationLocalService
 * @generated
 */
@ProviderType
public class contentuniqueinformationLocalServiceWrapper
	implements contentuniqueinformationLocalService,
		ServiceWrapper<contentuniqueinformationLocalService> {
	public contentuniqueinformationLocalServiceWrapper(
		contentuniqueinformationLocalService contentuniqueinformationLocalService) {
		_contentuniqueinformationLocalService = contentuniqueinformationLocalService;
	}

	/**
	* Adds the contentuniqueinformation to the database. Also notifies the appropriate model listeners.
	*
	* @param contentuniqueinformation the contentuniqueinformation
	* @return the contentuniqueinformation that was added
	*/
	@Override
	public com.chola.ppcontent.model.contentuniqueinformation addcontentuniqueinformation(
		com.chola.ppcontent.model.contentuniqueinformation contentuniqueinformation) {
		return _contentuniqueinformationLocalService.addcontentuniqueinformation(contentuniqueinformation);
	}

	/**
	* Creates a new contentuniqueinformation with the primary key. Does not add the contentuniqueinformation to the database.
	*
	* @param id the primary key for the new contentuniqueinformation
	* @return the new contentuniqueinformation
	*/
	@Override
	public com.chola.ppcontent.model.contentuniqueinformation createcontentuniqueinformation(
		long id) {
		return _contentuniqueinformationLocalService.createcontentuniqueinformation(id);
	}

	/**
	* Deletes the contentuniqueinformation from the database. Also notifies the appropriate model listeners.
	*
	* @param contentuniqueinformation the contentuniqueinformation
	* @return the contentuniqueinformation that was removed
	*/
	@Override
	public com.chola.ppcontent.model.contentuniqueinformation deletecontentuniqueinformation(
		com.chola.ppcontent.model.contentuniqueinformation contentuniqueinformation) {
		return _contentuniqueinformationLocalService.deletecontentuniqueinformation(contentuniqueinformation);
	}

	/**
	* Deletes the contentuniqueinformation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the contentuniqueinformation
	* @return the contentuniqueinformation that was removed
	* @throws PortalException if a contentuniqueinformation with the primary key could not be found
	*/
	@Override
	public com.chola.ppcontent.model.contentuniqueinformation deletecontentuniqueinformation(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _contentuniqueinformationLocalService.deletecontentuniqueinformation(id);
	}

	@Override
	public com.chola.ppcontent.model.contentuniqueinformation fetchcontentuniqueinformation(
		long id) {
		return _contentuniqueinformationLocalService.fetchcontentuniqueinformation(id);
	}

	/**
	* Returns the contentuniqueinformation with the primary key.
	*
	* @param id the primary key of the contentuniqueinformation
	* @return the contentuniqueinformation
	* @throws PortalException if a contentuniqueinformation with the primary key could not be found
	*/
	@Override
	public com.chola.ppcontent.model.contentuniqueinformation getcontentuniqueinformation(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _contentuniqueinformationLocalService.getcontentuniqueinformation(id);
	}

	/**
	* Updates the contentuniqueinformation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param contentuniqueinformation the contentuniqueinformation
	* @return the contentuniqueinformation that was updated
	*/
	@Override
	public com.chola.ppcontent.model.contentuniqueinformation updatecontentuniqueinformation(
		com.chola.ppcontent.model.contentuniqueinformation contentuniqueinformation) {
		return _contentuniqueinformationLocalService.updatecontentuniqueinformation(contentuniqueinformation);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _contentuniqueinformationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _contentuniqueinformationLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _contentuniqueinformationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contentuniqueinformationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _contentuniqueinformationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of contentuniqueinformations.
	*
	* @return the number of contentuniqueinformations
	*/
	@Override
	public int getcontentuniqueinformationsCount() {
		return _contentuniqueinformationLocalService.getcontentuniqueinformationsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _contentuniqueinformationLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _contentuniqueinformationLocalService.getOSGiServiceIdentifier();
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
		return _contentuniqueinformationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.ppcontent.model.impl.contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _contentuniqueinformationLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.ppcontent.model.impl.contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _contentuniqueinformationLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.chola.ppcontent.model.contentuniqueinformation> getUniqueContentInfo(
		long contentId) {
		return _contentuniqueinformationLocalService.getUniqueContentInfo(contentId);
	}

	/**
	* Returns a range of all the contentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.ppcontent.model.impl.contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contentuniqueinformations
	* @param end the upper bound of the range of contentuniqueinformations (not inclusive)
	* @return the range of contentuniqueinformations
	*/
	@Override
	public java.util.List<com.chola.ppcontent.model.contentuniqueinformation> getcontentuniqueinformations(
		int start, int end) {
		return _contentuniqueinformationLocalService.getcontentuniqueinformations(start,
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
		return _contentuniqueinformationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _contentuniqueinformationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public contentuniqueinformationLocalService getWrappedService() {
		return _contentuniqueinformationLocalService;
	}

	@Override
	public void setWrappedService(
		contentuniqueinformationLocalService contentuniqueinformationLocalService) {
		_contentuniqueinformationLocalService = contentuniqueinformationLocalService;
	}

	private contentuniqueinformationLocalService _contentuniqueinformationLocalService;
}