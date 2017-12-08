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

package com.chola.popularlinks.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link externallinksLocalService}.
 *
 * @author adms.java1
 * @see externallinksLocalService
 * @generated
 */
@ProviderType
public class externallinksLocalServiceWrapper
	implements externallinksLocalService,
		ServiceWrapper<externallinksLocalService> {
	public externallinksLocalServiceWrapper(
		externallinksLocalService externallinksLocalService) {
		_externallinksLocalService = externallinksLocalService;
	}

	/**
	* Adds the externallinks to the database. Also notifies the appropriate model listeners.
	*
	* @param externallinks the externallinks
	* @return the externallinks that was added
	*/
	@Override
	public com.chola.popularlinks.model.externallinks addexternallinks(
		com.chola.popularlinks.model.externallinks externallinks) {
		return _externallinksLocalService.addexternallinks(externallinks);
	}

	/**
	* Creates a new externallinks with the primary key. Does not add the externallinks to the database.
	*
	* @param id the primary key for the new externallinks
	* @return the new externallinks
	*/
	@Override
	public com.chola.popularlinks.model.externallinks createexternallinks(
		long id) {
		return _externallinksLocalService.createexternallinks(id);
	}

	/**
	* Deletes the externallinks from the database. Also notifies the appropriate model listeners.
	*
	* @param externallinks the externallinks
	* @return the externallinks that was removed
	*/
	@Override
	public com.chola.popularlinks.model.externallinks deleteexternallinks(
		com.chola.popularlinks.model.externallinks externallinks) {
		return _externallinksLocalService.deleteexternallinks(externallinks);
	}

	/**
	* Deletes the externallinks with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the externallinks
	* @return the externallinks that was removed
	* @throws PortalException if a externallinks with the primary key could not be found
	*/
	@Override
	public com.chola.popularlinks.model.externallinks deleteexternallinks(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _externallinksLocalService.deleteexternallinks(id);
	}

	@Override
	public com.chola.popularlinks.model.externallinks fetchexternallinks(
		long id) {
		return _externallinksLocalService.fetchexternallinks(id);
	}

	/**
	* Returns the externallinks with the primary key.
	*
	* @param id the primary key of the externallinks
	* @return the externallinks
	* @throws PortalException if a externallinks with the primary key could not be found
	*/
	@Override
	public com.chola.popularlinks.model.externallinks getexternallinks(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _externallinksLocalService.getexternallinks(id);
	}

	/**
	* Updates the externallinks in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param externallinks the externallinks
	* @return the externallinks that was updated
	*/
	@Override
	public com.chola.popularlinks.model.externallinks updateexternallinks(
		com.chola.popularlinks.model.externallinks externallinks) {
		return _externallinksLocalService.updateexternallinks(externallinks);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _externallinksLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _externallinksLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _externallinksLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _externallinksLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _externallinksLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of externallinkses.
	*
	* @return the number of externallinkses
	*/
	@Override
	public int getexternallinksesCount() {
		return _externallinksLocalService.getexternallinksesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _externallinksLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _externallinksLocalService.getOSGiServiceIdentifier();
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
		return _externallinksLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.popularlinks.model.impl.externallinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _externallinksLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.popularlinks.model.impl.externallinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _externallinksLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the externallinkses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.popularlinks.model.impl.externallinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of externallinkses
	* @param end the upper bound of the range of externallinkses (not inclusive)
	* @return the range of externallinkses
	*/
	@Override
	public java.util.List<com.chola.popularlinks.model.externallinks> getexternallinkses(
		int start, int end) {
		return _externallinksLocalService.getexternallinkses(start, end);
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
		return _externallinksLocalService.dynamicQueryCount(dynamicQuery);
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
		return _externallinksLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public externallinksLocalService getWrappedService() {
		return _externallinksLocalService;
	}

	@Override
	public void setWrappedService(
		externallinksLocalService externallinksLocalService) {
		_externallinksLocalService = externallinksLocalService;
	}

	private externallinksLocalService _externallinksLocalService;
}