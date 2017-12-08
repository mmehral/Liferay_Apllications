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

package com.chola.book.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link bookusersLocalService}.
 *
 * @author CloverLiferay02
 * @see bookusersLocalService
 * @generated
 */
@ProviderType
public class bookusersLocalServiceWrapper implements bookusersLocalService,
	ServiceWrapper<bookusersLocalService> {
	public bookusersLocalServiceWrapper(
		bookusersLocalService bookusersLocalService) {
		_bookusersLocalService = bookusersLocalService;
	}

	/**
	* Adds the bookusers to the database. Also notifies the appropriate model listeners.
	*
	* @param bookusers the bookusers
	* @return the bookusers that was added
	*/
	@Override
	public com.chola.book.model.bookusers addbookusers(
		com.chola.book.model.bookusers bookusers) {
		return _bookusersLocalService.addbookusers(bookusers);
	}

	/**
	* Creates a new bookusers with the primary key. Does not add the bookusers to the database.
	*
	* @param id the primary key for the new bookusers
	* @return the new bookusers
	*/
	@Override
	public com.chola.book.model.bookusers createbookusers(long id) {
		return _bookusersLocalService.createbookusers(id);
	}

	/**
	* Deletes the bookusers from the database. Also notifies the appropriate model listeners.
	*
	* @param bookusers the bookusers
	* @return the bookusers that was removed
	*/
	@Override
	public com.chola.book.model.bookusers deletebookusers(
		com.chola.book.model.bookusers bookusers) {
		return _bookusersLocalService.deletebookusers(bookusers);
	}

	/**
	* Deletes the bookusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bookusers
	* @return the bookusers that was removed
	* @throws PortalException if a bookusers with the primary key could not be found
	*/
	@Override
	public com.chola.book.model.bookusers deletebookusers(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookusersLocalService.deletebookusers(id);
	}

	@Override
	public com.chola.book.model.bookusers fetchbookusers(long id) {
		return _bookusersLocalService.fetchbookusers(id);
	}

	/**
	* Returns the bookusers with the primary key.
	*
	* @param id the primary key of the bookusers
	* @return the bookusers
	* @throws PortalException if a bookusers with the primary key could not be found
	*/
	@Override
	public com.chola.book.model.bookusers getbookusers(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookusersLocalService.getbookusers(id);
	}

	/**
	* Updates the bookusers in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bookusers the bookusers
	* @return the bookusers that was updated
	*/
	@Override
	public com.chola.book.model.bookusers updatebookusers(
		com.chola.book.model.bookusers bookusers) {
		return _bookusersLocalService.updatebookusers(bookusers);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _bookusersLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bookusersLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _bookusersLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookusersLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookusersLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of bookuserses.
	*
	* @return the number of bookuserses
	*/
	@Override
	public int getbookusersesCount() {
		return _bookusersLocalService.getbookusersesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _bookusersLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _bookusersLocalService.getOSGiServiceIdentifier();
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
		return _bookusersLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.book.model.impl.bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bookusersLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.book.model.impl.bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bookusersLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.chola.book.model.bookusers> getBookDetails(
		long bookId) {
		return _bookusersLocalService.getBookDetails(bookId);
	}

	@Override
	public java.util.List<com.chola.book.model.bookusers> getSOPUsers(
		long user_id) {
		return _bookusersLocalService.getSOPUsers(user_id);
	}

	/**
	* Returns a range of all the bookuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.book.model.impl.bookusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookuserses
	* @param end the upper bound of the range of bookuserses (not inclusive)
	* @return the range of bookuserses
	*/
	@Override
	public java.util.List<com.chola.book.model.bookusers> getbookuserses(
		int start, int end) {
		return _bookusersLocalService.getbookuserses(start, end);
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
		return _bookusersLocalService.dynamicQueryCount(dynamicQuery);
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
		return _bookusersLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public bookusersLocalService getWrappedService() {
		return _bookusersLocalService;
	}

	@Override
	public void setWrappedService(bookusersLocalService bookusersLocalService) {
		_bookusersLocalService = bookusersLocalService;
	}

	private bookusersLocalService _bookusersLocalService;
}