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
 * Provides a wrapper for {@link bookdetailsLocalService}.
 *
 * @author CloverLiferay02
 * @see bookdetailsLocalService
 * @generated
 */
@ProviderType
public class bookdetailsLocalServiceWrapper implements bookdetailsLocalService,
	ServiceWrapper<bookdetailsLocalService> {
	public bookdetailsLocalServiceWrapper(
		bookdetailsLocalService bookdetailsLocalService) {
		_bookdetailsLocalService = bookdetailsLocalService;
	}

	/**
	* Adds the bookdetails to the database. Also notifies the appropriate model listeners.
	*
	* @param bookdetails the bookdetails
	* @return the bookdetails that was added
	*/
	@Override
	public com.chola.book.model.bookdetails addbookdetails(
		com.chola.book.model.bookdetails bookdetails) {
		return _bookdetailsLocalService.addbookdetails(bookdetails);
	}

	/**
	* Creates a new bookdetails with the primary key. Does not add the bookdetails to the database.
	*
	* @param id the primary key for the new bookdetails
	* @return the new bookdetails
	*/
	@Override
	public com.chola.book.model.bookdetails createbookdetails(long id) {
		return _bookdetailsLocalService.createbookdetails(id);
	}

	/**
	* Deletes the bookdetails from the database. Also notifies the appropriate model listeners.
	*
	* @param bookdetails the bookdetails
	* @return the bookdetails that was removed
	*/
	@Override
	public com.chola.book.model.bookdetails deletebookdetails(
		com.chola.book.model.bookdetails bookdetails) {
		return _bookdetailsLocalService.deletebookdetails(bookdetails);
	}

	/**
	* Deletes the bookdetails with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bookdetails
	* @return the bookdetails that was removed
	* @throws PortalException if a bookdetails with the primary key could not be found
	*/
	@Override
	public com.chola.book.model.bookdetails deletebookdetails(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookdetailsLocalService.deletebookdetails(id);
	}

	@Override
	public com.chola.book.model.bookdetails fetchbookdetails(long id) {
		return _bookdetailsLocalService.fetchbookdetails(id);
	}

	/**
	* Returns the bookdetails with the primary key.
	*
	* @param id the primary key of the bookdetails
	* @return the bookdetails
	* @throws PortalException if a bookdetails with the primary key could not be found
	*/
	@Override
	public com.chola.book.model.bookdetails getbookdetails(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookdetailsLocalService.getbookdetails(id);
	}

	/**
	* Updates the bookdetails in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bookdetails the bookdetails
	* @return the bookdetails that was updated
	*/
	@Override
	public com.chola.book.model.bookdetails updatebookdetails(
		com.chola.book.model.bookdetails bookdetails) {
		return _bookdetailsLocalService.updatebookdetails(bookdetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _bookdetailsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bookdetailsLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _bookdetailsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookdetailsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _bookdetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of bookdetailses.
	*
	* @return the number of bookdetailses
	*/
	@Override
	public int getbookdetailsesCount() {
		return _bookdetailsLocalService.getbookdetailsesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _bookdetailsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _bookdetailsLocalService.getOSGiServiceIdentifier();
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
		return _bookdetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.book.model.impl.bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bookdetailsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.book.model.impl.bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bookdetailsLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.chola.book.model.bookdetails> getBookDetail(
		long content_id) {
		return _bookdetailsLocalService.getBookDetail(content_id);
	}

	/**
	* Returns a range of all the bookdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.book.model.impl.bookdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bookdetailses
	* @param end the upper bound of the range of bookdetailses (not inclusive)
	* @return the range of bookdetailses
	*/
	@Override
	public java.util.List<com.chola.book.model.bookdetails> getbookdetailses(
		int start, int end) {
		return _bookdetailsLocalService.getbookdetailses(start, end);
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
		return _bookdetailsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _bookdetailsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public bookdetailsLocalService getWrappedService() {
		return _bookdetailsLocalService;
	}

	@Override
	public void setWrappedService(
		bookdetailsLocalService bookdetailsLocalService) {
		_bookdetailsLocalService = bookdetailsLocalService;
	}

	private bookdetailsLocalService _bookdetailsLocalService;
}