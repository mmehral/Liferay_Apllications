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

package com.chola.livefeed.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LiveFeedLocalService}.
 *
 * @author adms.java1
 * @see LiveFeedLocalService
 * @generated
 */
@ProviderType
public class LiveFeedLocalServiceWrapper implements LiveFeedLocalService,
	ServiceWrapper<LiveFeedLocalService> {
	public LiveFeedLocalServiceWrapper(
		LiveFeedLocalService liveFeedLocalService) {
		_liveFeedLocalService = liveFeedLocalService;
	}

	@Override
	public boolean getduplicate(java.lang.String createdate) {
		return _liveFeedLocalService.getduplicate(createdate);
	}

	/**
	* Adds the live feed to the database. Also notifies the appropriate model listeners.
	*
	* @param liveFeed the live feed
	* @return the live feed that was added
	*/
	@Override
	public com.chola.livefeed.model.LiveFeed addLiveFeed(
		com.chola.livefeed.model.LiveFeed liveFeed) {
		return _liveFeedLocalService.addLiveFeed(liveFeed);
	}

	/**
	* Creates a new live feed with the primary key. Does not add the live feed to the database.
	*
	* @param id the primary key for the new live feed
	* @return the new live feed
	*/
	@Override
	public com.chola.livefeed.model.LiveFeed createLiveFeed(long id) {
		return _liveFeedLocalService.createLiveFeed(id);
	}

	/**
	* Deletes the live feed from the database. Also notifies the appropriate model listeners.
	*
	* @param liveFeed the live feed
	* @return the live feed that was removed
	*/
	@Override
	public com.chola.livefeed.model.LiveFeed deleteLiveFeed(
		com.chola.livefeed.model.LiveFeed liveFeed) {
		return _liveFeedLocalService.deleteLiveFeed(liveFeed);
	}

	/**
	* Deletes the live feed with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the live feed
	* @return the live feed that was removed
	* @throws PortalException if a live feed with the primary key could not be found
	*/
	@Override
	public com.chola.livefeed.model.LiveFeed deleteLiveFeed(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _liveFeedLocalService.deleteLiveFeed(id);
	}

	@Override
	public com.chola.livefeed.model.LiveFeed fetchLiveFeed(long id) {
		return _liveFeedLocalService.fetchLiveFeed(id);
	}

	/**
	* Returns the live feed with the primary key.
	*
	* @param id the primary key of the live feed
	* @return the live feed
	* @throws PortalException if a live feed with the primary key could not be found
	*/
	@Override
	public com.chola.livefeed.model.LiveFeed getLiveFeed(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _liveFeedLocalService.getLiveFeed(id);
	}

	/**
	* Updates the live feed in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param liveFeed the live feed
	* @return the live feed that was updated
	*/
	@Override
	public com.chola.livefeed.model.LiveFeed updateLiveFeed(
		com.chola.livefeed.model.LiveFeed liveFeed) {
		return _liveFeedLocalService.updateLiveFeed(liveFeed);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _liveFeedLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _liveFeedLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _liveFeedLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _liveFeedLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _liveFeedLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of live feeds.
	*
	* @return the number of live feeds
	*/
	@Override
	public int getLiveFeedsCount() {
		return _liveFeedLocalService.getLiveFeedsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _liveFeedLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _liveFeedLocalService.getOSGiServiceIdentifier();
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
		return _liveFeedLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.livefeed.model.impl.LiveFeedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _liveFeedLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.livefeed.model.impl.LiveFeedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _liveFeedLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<java.lang.String> getContentLiveNews() {
		return _liveFeedLocalService.getContentLiveNews();
	}

	@Override
	public java.util.List<java.lang.String> getLiveContent(
		java.lang.String createdate) {
		return _liveFeedLocalService.getLiveContent(createdate);
	}

	/**
	* Returns a range of all the live feeds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.livefeed.model.impl.LiveFeedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of live feeds
	* @param end the upper bound of the range of live feeds (not inclusive)
	* @return the range of live feeds
	*/
	@Override
	public java.util.List<com.chola.livefeed.model.LiveFeed> getLiveFeeds(
		int start, int end) {
		return _liveFeedLocalService.getLiveFeeds(start, end);
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
		return _liveFeedLocalService.dynamicQueryCount(dynamicQuery);
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
		return _liveFeedLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public LiveFeedLocalService getWrappedService() {
		return _liveFeedLocalService;
	}

	@Override
	public void setWrappedService(LiveFeedLocalService liveFeedLocalService) {
		_liveFeedLocalService = liveFeedLocalService;
	}

	private LiveFeedLocalService _liveFeedLocalService;
}