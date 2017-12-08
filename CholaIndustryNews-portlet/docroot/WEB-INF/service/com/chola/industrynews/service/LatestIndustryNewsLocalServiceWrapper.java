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

package com.chola.industrynews.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LatestIndustryNewsLocalService}.
 *
 * @author CloverLiferay01
 * @see LatestIndustryNewsLocalService
 * @generated
 */
@ProviderType
public class LatestIndustryNewsLocalServiceWrapper
	implements LatestIndustryNewsLocalService,
		ServiceWrapper<LatestIndustryNewsLocalService> {
	public LatestIndustryNewsLocalServiceWrapper(
		LatestIndustryNewsLocalService latestIndustryNewsLocalService) {
		_latestIndustryNewsLocalService = latestIndustryNewsLocalService;
	}

	@Override
	public boolean getduplicate(java.lang.String createdate) {
		return _latestIndustryNewsLocalService.getduplicate(createdate);
	}

	/**
	* Adds the latest industry news to the database. Also notifies the appropriate model listeners.
	*
	* @param latestIndustryNews the latest industry news
	* @return the latest industry news that was added
	*/
	@Override
	public com.chola.industrynews.model.LatestIndustryNews addLatestIndustryNews(
		com.chola.industrynews.model.LatestIndustryNews latestIndustryNews) {
		return _latestIndustryNewsLocalService.addLatestIndustryNews(latestIndustryNews);
	}

	/**
	* Creates a new latest industry news with the primary key. Does not add the latest industry news to the database.
	*
	* @param id the primary key for the new latest industry news
	* @return the new latest industry news
	*/
	@Override
	public com.chola.industrynews.model.LatestIndustryNews createLatestIndustryNews(
		long id) {
		return _latestIndustryNewsLocalService.createLatestIndustryNews(id);
	}

	/**
	* Deletes the latest industry news from the database. Also notifies the appropriate model listeners.
	*
	* @param latestIndustryNews the latest industry news
	* @return the latest industry news that was removed
	*/
	@Override
	public com.chola.industrynews.model.LatestIndustryNews deleteLatestIndustryNews(
		com.chola.industrynews.model.LatestIndustryNews latestIndustryNews) {
		return _latestIndustryNewsLocalService.deleteLatestIndustryNews(latestIndustryNews);
	}

	/**
	* Deletes the latest industry news with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the latest industry news
	* @return the latest industry news that was removed
	* @throws PortalException if a latest industry news with the primary key could not be found
	*/
	@Override
	public com.chola.industrynews.model.LatestIndustryNews deleteLatestIndustryNews(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _latestIndustryNewsLocalService.deleteLatestIndustryNews(id);
	}

	@Override
	public com.chola.industrynews.model.LatestIndustryNews fetchLatestIndustryNews(
		long id) {
		return _latestIndustryNewsLocalService.fetchLatestIndustryNews(id);
	}

	/**
	* Returns the latest industry news with the primary key.
	*
	* @param id the primary key of the latest industry news
	* @return the latest industry news
	* @throws PortalException if a latest industry news with the primary key could not be found
	*/
	@Override
	public com.chola.industrynews.model.LatestIndustryNews getLatestIndustryNews(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _latestIndustryNewsLocalService.getLatestIndustryNews(id);
	}

	/**
	* Updates the latest industry news in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param latestIndustryNews the latest industry news
	* @return the latest industry news that was updated
	*/
	@Override
	public com.chola.industrynews.model.LatestIndustryNews updateLatestIndustryNews(
		com.chola.industrynews.model.LatestIndustryNews latestIndustryNews) {
		return _latestIndustryNewsLocalService.updateLatestIndustryNews(latestIndustryNews);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _latestIndustryNewsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _latestIndustryNewsLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _latestIndustryNewsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _latestIndustryNewsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _latestIndustryNewsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of latest industry newses.
	*
	* @return the number of latest industry newses
	*/
	@Override
	public int getLatestIndustryNewsesCount() {
		return _latestIndustryNewsLocalService.getLatestIndustryNewsesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _latestIndustryNewsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _latestIndustryNewsLocalService.getOSGiServiceIdentifier();
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
		return _latestIndustryNewsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.industrynews.model.impl.LatestIndustryNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _latestIndustryNewsLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.industrynews.model.impl.LatestIndustryNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _latestIndustryNewsLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<java.lang.String> getContent(
		java.lang.String createdate) {
		return _latestIndustryNewsLocalService.getContent(createdate);
	}

	@Override
	public java.util.List<java.lang.String> getContentNews() {
		return _latestIndustryNewsLocalService.getContentNews();
	}

	/**
	* Returns a range of all the latest industry newses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.industrynews.model.impl.LatestIndustryNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of latest industry newses
	* @param end the upper bound of the range of latest industry newses (not inclusive)
	* @return the range of latest industry newses
	*/
	@Override
	public java.util.List<com.chola.industrynews.model.LatestIndustryNews> getLatestIndustryNewses(
		int start, int end) {
		return _latestIndustryNewsLocalService.getLatestIndustryNewses(start,
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
		return _latestIndustryNewsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _latestIndustryNewsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public LatestIndustryNewsLocalService getWrappedService() {
		return _latestIndustryNewsLocalService;
	}

	@Override
	public void setWrappedService(
		LatestIndustryNewsLocalService latestIndustryNewsLocalService) {
		_latestIndustryNewsLocalService = latestIndustryNewsLocalService;
	}

	private LatestIndustryNewsLocalService _latestIndustryNewsLocalService;
}