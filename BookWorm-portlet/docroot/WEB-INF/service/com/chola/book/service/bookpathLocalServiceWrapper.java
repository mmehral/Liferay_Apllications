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
 * Provides a wrapper for {@link bookpathLocalService}.
 *
 * @author CloverLiferay02
 * @see bookpathLocalService
 * @generated
 */
@ProviderType
public class bookpathLocalServiceWrapper implements bookpathLocalService,
	ServiceWrapper<bookpathLocalService> {
	public bookpathLocalServiceWrapper(
		bookpathLocalService bookpathLocalService) {
		_bookpathLocalService = bookpathLocalService;
	}

	/**
	* Adds the bookpath to the database. Also notifies the appropriate model listeners.
	*
	* @param bookpath the bookpath
	* @return the bookpath that was added
	*/
	@Override
	public com.chola.book.model.bookpath addbookpath(
		com.chola.book.model.bookpath bookpath) {
		return _bookpathLocalService.addbookpath(bookpath);
	}

	/**
	* Creates a new bookpath with the primary key. Does not add the bookpath to the database.
	*
	* @param id the primary key for the new bookpath
	* @return the new bookpath
	*/
	@Override
	public com.chola.book.model.bookpath createbookpath(long id) {
		return _bookpathLocalService.createbookpath(id);
	}

	/**
	* Deletes the bookpath from the database. Also notifies the appropriate model listeners.
	*
	* @param bookpath the bookpath
	* @return the bookpath that was removed
	*/
	@Override
	public com.chola.book.model.bookpath deletebookpath(
		com.chola.book.model.bookpath bookpath) {
		return _bookpathLocalService.deletebookpath(bookpath);
	}

	/**
	* Deletes the bookpath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bookpath
	* @return the bookpath that was removed
	* @throws PortalException if a bookpath with the primary key could not be found
	*/
	@Override
	public com.chola.book.model.bookpath deletebookpath(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookpathLocalService.deletebookpath(id);
	}

	@Override
	public com.chola.book.model.bookpath fetchbookpath(long id) {
		return _bookpathLocalService.fetchbookpath(id);
	}

	/**
	* Returns the bookpath with the primary key.
	*
	* @param id the primary key of the bookpath
	* @return the bookpath
	* @throws PortalException if a bookpath with the primary key could not be found
	*/
	@Override
	public com.chola.book.model.bookpath getbookpath(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookpathLocalService.getbookpath(id);
	}

	/**
	* Updates the bookpath in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bookpath the bookpath
	* @return the bookpath that was updated
	*/
	@Override
	public com.chola.book.model.bookpath updatebookpath(
		com.chola.book.model.bookpath bookpath) {
		return _bookpathLocalService.updatebookpath(bookpath);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _bookpathLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bookpathLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _bookpathLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookpathLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookpathLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of bookpaths.
	*
	* @return the number of bookpaths
	*/
	@Override
	public int getbookpathsCount() {
		return _bookpathLocalService.getbookpathsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _bookpathLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _bookpathLocalService.getOSGiServiceIdentifier();
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
		return _bookpathLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.book.model.impl.bookpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bookpathLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.book.model.impl.bookpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bookpathLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.chola.book.model.bookpath> getBookDetails(
		long bookId) {
		return _bookpathLocalService.getBookDetails(bookId);
	}

	/**
	* Returns a range of all the bookpaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.book.model.impl.bookpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookpaths
	* @param end the upper bound of the range of bookpaths (not inclusive)
	* @return the range of bookpaths
	*/
	@Override
	public java.util.List<com.chola.book.model.bookpath> getbookpaths(
		int start, int end) {
		return _bookpathLocalService.getbookpaths(start, end);
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
		return _bookpathLocalService.dynamicQueryCount(dynamicQuery);
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
		return _bookpathLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public bookpathLocalService getWrappedService() {
		return _bookpathLocalService;
	}

	@Override
	public void setWrappedService(bookpathLocalService bookpathLocalService) {
		_bookpathLocalService = bookpathLocalService;
	}

	private bookpathLocalService _bookpathLocalService;
}