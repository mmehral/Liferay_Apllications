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

package com.chola.bsop.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link bsoppathLocalService}.
 *
 * @author cloverliferay01
 * @see bsoppathLocalService
 * @generated
 */
@ProviderType
public class bsoppathLocalServiceWrapper implements bsoppathLocalService,
	ServiceWrapper<bsoppathLocalService> {
	public bsoppathLocalServiceWrapper(
		bsoppathLocalService bsoppathLocalService) {
		_bsoppathLocalService = bsoppathLocalService;
	}

	/**
	* Adds the bsoppath to the database. Also notifies the appropriate model listeners.
	*
	* @param bsoppath the bsoppath
	* @return the bsoppath that was added
	*/
	@Override
	public com.chola.bsop.model.bsoppath addbsoppath(
		com.chola.bsop.model.bsoppath bsoppath) {
		return _bsoppathLocalService.addbsoppath(bsoppath);
	}

	/**
	* Creates a new bsoppath with the primary key. Does not add the bsoppath to the database.
	*
	* @param id the primary key for the new bsoppath
	* @return the new bsoppath
	*/
	@Override
	public com.chola.bsop.model.bsoppath createbsoppath(long id) {
		return _bsoppathLocalService.createbsoppath(id);
	}

	/**
	* Deletes the bsoppath from the database. Also notifies the appropriate model listeners.
	*
	* @param bsoppath the bsoppath
	* @return the bsoppath that was removed
	*/
	@Override
	public com.chola.bsop.model.bsoppath deletebsoppath(
		com.chola.bsop.model.bsoppath bsoppath) {
		return _bsoppathLocalService.deletebsoppath(bsoppath);
	}

	/**
	* Deletes the bsoppath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bsoppath
	* @return the bsoppath that was removed
	* @throws PortalException if a bsoppath with the primary key could not be found
	*/
	@Override
	public com.chola.bsop.model.bsoppath deletebsoppath(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bsoppathLocalService.deletebsoppath(id);
	}

	@Override
	public com.chola.bsop.model.bsoppath fetchbsoppath(long id) {
		return _bsoppathLocalService.fetchbsoppath(id);
	}

	/**
	* Returns the bsoppath with the primary key.
	*
	* @param id the primary key of the bsoppath
	* @return the bsoppath
	* @throws PortalException if a bsoppath with the primary key could not be found
	*/
	@Override
	public com.chola.bsop.model.bsoppath getbsoppath(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bsoppathLocalService.getbsoppath(id);
	}

	/**
	* Updates the bsoppath in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bsoppath the bsoppath
	* @return the bsoppath that was updated
	*/
	@Override
	public com.chola.bsop.model.bsoppath updatebsoppath(
		com.chola.bsop.model.bsoppath bsoppath) {
		return _bsoppathLocalService.updatebsoppath(bsoppath);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _bsoppathLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bsoppathLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _bsoppathLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bsoppathLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bsoppathLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of bsoppaths.
	*
	* @return the number of bsoppaths
	*/
	@Override
	public int getbsoppathsCount() {
		return _bsoppathLocalService.getbsoppathsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _bsoppathLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _bsoppathLocalService.getOSGiServiceIdentifier();
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
		return _bsoppathLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.bsop.model.impl.bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bsoppathLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.bsop.model.impl.bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bsoppathLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.chola.bsop.model.bsoppath> getbsopFileDetail(
		long contentId) {
		return _bsoppathLocalService.getbsopFileDetail(contentId);
	}

	/**
	* Returns a range of all the bsoppaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.bsop.model.impl.bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bsoppaths
	* @param end the upper bound of the range of bsoppaths (not inclusive)
	* @return the range of bsoppaths
	*/
	@Override
	public java.util.List<com.chola.bsop.model.bsoppath> getbsoppaths(
		int start, int end) {
		return _bsoppathLocalService.getbsoppaths(start, end);
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
		return _bsoppathLocalService.dynamicQueryCount(dynamicQuery);
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
		return _bsoppathLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public bsoppathLocalService getWrappedService() {
		return _bsoppathLocalService;
	}

	@Override
	public void setWrappedService(bsoppathLocalService bsoppathLocalService) {
		_bsoppathLocalService = bsoppathLocalService;
	}

	private bsoppathLocalService _bsoppathLocalService;
}