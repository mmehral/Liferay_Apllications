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

package com.popular.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link popularlinksLocalService}.
 *
 * @author CloverLiferay02
 * @see popularlinksLocalService
 * @generated
 */
@ProviderType
public class popularlinksLocalServiceWrapper implements popularlinksLocalService,
	ServiceWrapper<popularlinksLocalService> {
	public popularlinksLocalServiceWrapper(
		popularlinksLocalService popularlinksLocalService) {
		_popularlinksLocalService = popularlinksLocalService;
	}

	@Override
	public boolean findexternalurl(java.lang.String url, long userid) {
		return _popularlinksLocalService.findexternalurl(url, userid);
	}

	@Override
	public boolean findurl(java.lang.String url, long userid) {
		return _popularlinksLocalService.findurl(url, userid);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _popularlinksLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _popularlinksLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _popularlinksLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _popularlinksLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _popularlinksLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the popularlinks to the database. Also notifies the appropriate model listeners.
	*
	* @param popularlinks the popularlinks
	* @return the popularlinks that was added
	*/
	@Override
	public com.popular.model.popularlinks addpopularlinks(
		com.popular.model.popularlinks popularlinks) {
		return _popularlinksLocalService.addpopularlinks(popularlinks);
	}

	/**
	* Creates a new popularlinks with the primary key. Does not add the popularlinks to the database.
	*
	* @param id the primary key for the new popularlinks
	* @return the new popularlinks
	*/
	@Override
	public com.popular.model.popularlinks createpopularlinks(long id) {
		return _popularlinksLocalService.createpopularlinks(id);
	}

	/**
	* Deletes the popularlinks from the database. Also notifies the appropriate model listeners.
	*
	* @param popularlinks the popularlinks
	* @return the popularlinks that was removed
	*/
	@Override
	public com.popular.model.popularlinks deletepopularlinks(
		com.popular.model.popularlinks popularlinks) {
		return _popularlinksLocalService.deletepopularlinks(popularlinks);
	}

	/**
	* Deletes the popularlinks with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the popularlinks
	* @return the popularlinks that was removed
	* @throws PortalException if a popularlinks with the primary key could not be found
	*/
	@Override
	public com.popular.model.popularlinks deletepopularlinks(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _popularlinksLocalService.deletepopularlinks(id);
	}

	@Override
	public com.popular.model.popularlinks fetchpopularlinks(long id) {
		return _popularlinksLocalService.fetchpopularlinks(id);
	}

	/**
	* Returns the popularlinks with the primary key.
	*
	* @param id the primary key of the popularlinks
	* @return the popularlinks
	* @throws PortalException if a popularlinks with the primary key could not be found
	*/
	@Override
	public com.popular.model.popularlinks getpopularlinks(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _popularlinksLocalService.getpopularlinks(id);
	}

	/**
	* Updates the popularlinks in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param popularlinks the popularlinks
	* @return the popularlinks that was updated
	*/
	@Override
	public com.popular.model.popularlinks updatepopularlinks(
		com.popular.model.popularlinks popularlinks) {
		return _popularlinksLocalService.updatepopularlinks(popularlinks);
	}

	/**
	* Returns the number of popularlinkses.
	*
	* @return the number of popularlinkses
	*/
	@Override
	public int getpopularlinksesCount() {
		return _popularlinksLocalService.getpopularlinksesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _popularlinksLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.lang.Object[] getcount(java.lang.String url, long userid) {
		return _popularlinksLocalService.getcount(url, userid);
	}

	@Override
	public java.lang.String externalurl(java.lang.String url) {
		return _popularlinksLocalService.externalurl(url);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _popularlinksLocalService.getOSGiServiceIdentifier();
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
		return _popularlinksLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.popular.model.impl.popularlinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _popularlinksLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.popular.model.impl.popularlinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _popularlinksLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<java.lang.Object[]> getExtLinks() {
		return _popularlinksLocalService.getExtLinks();
	}

	@Override
	public java.util.List<java.lang.Object[]> getExternallinks(long userid) {
		return _popularlinksLocalService.getExternallinks(userid);
	}

	@Override
	public java.util.List<java.lang.Object[]> getinternallinks(long userid) {
		return _popularlinksLocalService.getinternallinks(userid);
	}

	/**
	* Returns a range of all the popularlinkses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.popular.model.impl.popularlinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of popularlinkses
	* @param end the upper bound of the range of popularlinkses (not inclusive)
	* @return the range of popularlinkses
	*/
	@Override
	public java.util.List<com.popular.model.popularlinks> getpopularlinkses(
		int start, int end) {
		return _popularlinksLocalService.getpopularlinkses(start, end);
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
		return _popularlinksLocalService.dynamicQueryCount(dynamicQuery);
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
		return _popularlinksLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public popularlinksLocalService getWrappedService() {
		return _popularlinksLocalService;
	}

	@Override
	public void setWrappedService(
		popularlinksLocalService popularlinksLocalService) {
		_popularlinksLocalService = popularlinksLocalService;
	}

	private popularlinksLocalService _popularlinksLocalService;
}