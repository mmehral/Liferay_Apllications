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
 * Provides a wrapper for {@link ideaLocalService}.
 *
 * @author CloverLiferay02
 * @see ideaLocalService
 * @generated
 */
@ProviderType
public class ideaLocalServiceWrapper implements ideaLocalService,
	ServiceWrapper<ideaLocalService> {
	public ideaLocalServiceWrapper(ideaLocalService ideaLocalService) {
		_ideaLocalService = ideaLocalService;
	}

	/**
	* Adds the idea to the database. Also notifies the appropriate model listeners.
	*
	* @param idea the idea
	* @return the idea that was added
	*/
	@Override
	public com.chola.socho.model.idea addidea(com.chola.socho.model.idea idea) {
		return _ideaLocalService.addidea(idea);
	}

	/**
	* Creates a new idea with the primary key. Does not add the idea to the database.
	*
	* @param id the primary key for the new idea
	* @return the new idea
	*/
	@Override
	public com.chola.socho.model.idea createidea(long id) {
		return _ideaLocalService.createidea(id);
	}

	/**
	* Deletes the idea from the database. Also notifies the appropriate model listeners.
	*
	* @param idea the idea
	* @return the idea that was removed
	*/
	@Override
	public com.chola.socho.model.idea deleteidea(
		com.chola.socho.model.idea idea) {
		return _ideaLocalService.deleteidea(idea);
	}

	/**
	* Deletes the idea with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the idea
	* @return the idea that was removed
	* @throws PortalException if a idea with the primary key could not be found
	*/
	@Override
	public com.chola.socho.model.idea deleteidea(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ideaLocalService.deleteidea(id);
	}

	@Override
	public com.chola.socho.model.idea fetchidea(long id) {
		return _ideaLocalService.fetchidea(id);
	}

	/**
	* Returns the idea with the primary key.
	*
	* @param id the primary key of the idea
	* @return the idea
	* @throws PortalException if a idea with the primary key could not be found
	*/
	@Override
	public com.chola.socho.model.idea getidea(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ideaLocalService.getidea(id);
	}

	/**
	* Updates the idea in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param idea the idea
	* @return the idea that was updated
	*/
	@Override
	public com.chola.socho.model.idea updateidea(
		com.chola.socho.model.idea idea) {
		return _ideaLocalService.updateidea(idea);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _ideaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ideaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _ideaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ideaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ideaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of ideas.
	*
	* @return the number of ideas
	*/
	@Override
	public int getideasCount() {
		return _ideaLocalService.getideasCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _ideaLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _ideaLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.chola.socho.model.idea> customFinder(
		java.lang.String topicId) {
		return _ideaLocalService.customFinder(topicId);
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
		return _ideaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.socho.model.impl.ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ideaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.socho.model.impl.ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ideaLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the ideas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.socho.model.impl.ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ideas
	* @param end the upper bound of the range of ideas (not inclusive)
	* @return the range of ideas
	*/
	@Override
	public java.util.List<com.chola.socho.model.idea> getideas(int start,
		int end) {
		return _ideaLocalService.getideas(start, end);
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
		return _ideaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _ideaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public ideaLocalService getWrappedService() {
		return _ideaLocalService;
	}

	@Override
	public void setWrappedService(ideaLocalService ideaLocalService) {
		_ideaLocalService = ideaLocalService;
	}

	private ideaLocalService _ideaLocalService;
}