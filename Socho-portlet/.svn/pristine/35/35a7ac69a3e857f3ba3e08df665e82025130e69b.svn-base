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

package com.chola.socho.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link topicsLocalService}.
 *
 * @author CloverLiferay02
 * @see topicsLocalService
 * @generated
 */
@ProviderType
public class topicsLocalServiceWrapper implements topicsLocalService,
	ServiceWrapper<topicsLocalService> {
	public topicsLocalServiceWrapper(topicsLocalService topicsLocalService) {
		_topicsLocalService = topicsLocalService;
	}

	/**
	* Adds the topics to the database. Also notifies the appropriate model listeners.
	*
	* @param topics the topics
	* @return the topics that was added
	*/
	@Override
	public com.chola.socho.model.topics addtopics(
		com.chola.socho.model.topics topics) {
		return _topicsLocalService.addtopics(topics);
	}

	/**
	* Creates a new topics with the primary key. Does not add the topics to the database.
	*
	* @param id the primary key for the new topics
	* @return the new topics
	*/
	@Override
	public com.chola.socho.model.topics createtopics(long id) {
		return _topicsLocalService.createtopics(id);
	}

	/**
	* Deletes the topics from the database. Also notifies the appropriate model listeners.
	*
	* @param topics the topics
	* @return the topics that was removed
	*/
	@Override
	public com.chola.socho.model.topics deletetopics(
		com.chola.socho.model.topics topics) {
		return _topicsLocalService.deletetopics(topics);
	}

	/**
	* Deletes the topics with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the topics
	* @return the topics that was removed
	* @throws PortalException if a topics with the primary key could not be found
	*/
	@Override
	public com.chola.socho.model.topics deletetopics(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _topicsLocalService.deletetopics(id);
	}

	@Override
	public com.chola.socho.model.topics fetchtopics(long id) {
		return _topicsLocalService.fetchtopics(id);
	}

	/**
	* Returns the topics with the primary key.
	*
	* @param id the primary key of the topics
	* @return the topics
	* @throws PortalException if a topics with the primary key could not be found
	*/
	@Override
	public com.chola.socho.model.topics gettopics(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _topicsLocalService.gettopics(id);
	}

	/**
	* Updates the topics in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param topics the topics
	* @return the topics that was updated
	*/
	@Override
	public com.chola.socho.model.topics updatetopics(
		com.chola.socho.model.topics topics) {
		return _topicsLocalService.updatetopics(topics);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _topicsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _topicsLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _topicsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _topicsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _topicsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of topicses.
	*
	* @return the number of topicses
	*/
	@Override
	public int gettopicsesCount() {
		return _topicsLocalService.gettopicsesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _topicsLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _topicsLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List customFinder(java.lang.String topicId) {
		return _topicsLocalService.customFinder(topicId);
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
		return _topicsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.socho.model.impl.topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _topicsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.socho.model.impl.topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _topicsLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the topicses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.socho.model.impl.topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of topicses
	* @param end the upper bound of the range of topicses (not inclusive)
	* @return the range of topicses
	*/
	@Override
	public java.util.List<com.chola.socho.model.topics> gettopicses(int start,
		int end) {
		return _topicsLocalService.gettopicses(start, end);
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
		return _topicsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _topicsLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public topicsLocalService getWrappedService() {
		return _topicsLocalService;
	}

	@Override
	public void setWrappedService(topicsLocalService topicsLocalService) {
		_topicsLocalService = topicsLocalService;
	}

	private topicsLocalService _topicsLocalService;
}