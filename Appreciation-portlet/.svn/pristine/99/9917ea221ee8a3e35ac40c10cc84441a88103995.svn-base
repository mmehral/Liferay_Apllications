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

package com.chola.appcorner.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link postLocalService}.
 *
 * @author CloverLiferay02
 * @see postLocalService
 * @generated
 */
@ProviderType
public class postLocalServiceWrapper implements postLocalService,
	ServiceWrapper<postLocalService> {
	public postLocalServiceWrapper(postLocalService postLocalService) {
		_postLocalService = postLocalService;
	}

	@Override
	public boolean insertNotificationData(int syscode, int val,
		java.lang.String sysname, int status, int sttsflag, long usernotifyId) {
		return _postLocalService.insertNotificationData(syscode, val, sysname,
			status, sttsflag, usernotifyId);
	}

	/**
	* Adds the post to the database. Also notifies the appropriate model listeners.
	*
	* @param post the post
	* @return the post that was added
	*/
	@Override
	public com.chola.appcorner.model.post addpost(
		com.chola.appcorner.model.post post) {
		return _postLocalService.addpost(post);
	}

	/**
	* Creates a new post with the primary key. Does not add the post to the database.
	*
	* @param id the primary key for the new post
	* @return the new post
	*/
	@Override
	public com.chola.appcorner.model.post createpost(long id) {
		return _postLocalService.createpost(id);
	}

	/**
	* Deletes the post from the database. Also notifies the appropriate model listeners.
	*
	* @param post the post
	* @return the post that was removed
	*/
	@Override
	public com.chola.appcorner.model.post deletepost(
		com.chola.appcorner.model.post post) {
		return _postLocalService.deletepost(post);
	}

	/**
	* Deletes the post with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the post
	* @return the post that was removed
	* @throws PortalException if a post with the primary key could not be found
	*/
	@Override
	public com.chola.appcorner.model.post deletepost(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _postLocalService.deletepost(id);
	}

	@Override
	public com.chola.appcorner.model.post fetchpost(long id) {
		return _postLocalService.fetchpost(id);
	}

	/**
	* Returns the post with the primary key.
	*
	* @param id the primary key of the post
	* @return the post
	* @throws PortalException if a post with the primary key could not be found
	*/
	@Override
	public com.chola.appcorner.model.post getpost(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _postLocalService.getpost(id);
	}

	/**
	* Updates the post in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param post the post
	* @return the post that was updated
	*/
	@Override
	public com.chola.appcorner.model.post updatepost(
		com.chola.appcorner.model.post post) {
		return _postLocalService.updatepost(post);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _postLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _postLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _postLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _postLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _postLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of posts.
	*
	* @return the number of posts
	*/
	@Override
	public int getpostsCount() {
		return _postLocalService.getpostsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _postLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _postLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<java.lang.Object[]> SyscodeCustomMsg(int syscode) {
		return _postLocalService.SyscodeCustomMsg(syscode);
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
		return _postLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.appcorner.model.impl.postModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _postLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.appcorner.model.impl.postModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _postLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.chola.appcorner.model.post> getAppToData(
		long appTo) {
		return _postLocalService.getAppToData(appTo);
	}

	/**
	* Returns a range of all the posts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.appcorner.model.impl.postModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of posts
	* @param end the upper bound of the range of posts (not inclusive)
	* @return the range of posts
	*/
	@Override
	public java.util.List<com.chola.appcorner.model.post> getposts(int start,
		int end) {
		return _postLocalService.getposts(start, end);
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
		return _postLocalService.dynamicQueryCount(dynamicQuery);
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
		return _postLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public postLocalService getWrappedService() {
		return _postLocalService;
	}

	@Override
	public void setWrappedService(postLocalService postLocalService) {
		_postLocalService = postLocalService;
	}

	private postLocalService _postLocalService;
}