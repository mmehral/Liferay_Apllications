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

package com.chola.learningbites.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link lbdetailsLocalService}.
 *
 * @author cloverliferay01
 * @see lbdetailsLocalService
 * @generated
 */
@ProviderType
public class lbdetailsLocalServiceWrapper implements lbdetailsLocalService,
	ServiceWrapper<lbdetailsLocalService> {
	public lbdetailsLocalServiceWrapper(
		lbdetailsLocalService lbdetailsLocalService) {
		_lbdetailsLocalService = lbdetailsLocalService;
	}

	/**
	* Adds the lbdetails to the database. Also notifies the appropriate model listeners.
	*
	* @param lbdetails the lbdetails
	* @return the lbdetails that was added
	*/
	@Override
	public com.chola.learningbites.model.lbdetails addlbdetails(
		com.chola.learningbites.model.lbdetails lbdetails) {
		return _lbdetailsLocalService.addlbdetails(lbdetails);
	}

	/**
	* Creates a new lbdetails with the primary key. Does not add the lbdetails to the database.
	*
	* @param id the primary key for the new lbdetails
	* @return the new lbdetails
	*/
	@Override
	public com.chola.learningbites.model.lbdetails createlbdetails(long id) {
		return _lbdetailsLocalService.createlbdetails(id);
	}

	/**
	* Deletes the lbdetails from the database. Also notifies the appropriate model listeners.
	*
	* @param lbdetails the lbdetails
	* @return the lbdetails that was removed
	*/
	@Override
	public com.chola.learningbites.model.lbdetails deletelbdetails(
		com.chola.learningbites.model.lbdetails lbdetails) {
		return _lbdetailsLocalService.deletelbdetails(lbdetails);
	}

	/**
	* Deletes the lbdetails with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the lbdetails
	* @return the lbdetails that was removed
	* @throws PortalException if a lbdetails with the primary key could not be found
	*/
	@Override
	public com.chola.learningbites.model.lbdetails deletelbdetails(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _lbdetailsLocalService.deletelbdetails(id);
	}

	@Override
	public com.chola.learningbites.model.lbdetails fetchlbdetails(long id) {
		return _lbdetailsLocalService.fetchlbdetails(id);
	}

	/**
	* Returns the lbdetails with the primary key.
	*
	* @param id the primary key of the lbdetails
	* @return the lbdetails
	* @throws PortalException if a lbdetails with the primary key could not be found
	*/
	@Override
	public com.chola.learningbites.model.lbdetails getlbdetails(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _lbdetailsLocalService.getlbdetails(id);
	}

	/**
	* Updates the lbdetails in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param lbdetails the lbdetails
	* @return the lbdetails that was updated
	*/
	@Override
	public com.chola.learningbites.model.lbdetails updatelbdetails(
		com.chola.learningbites.model.lbdetails lbdetails) {
		return _lbdetailsLocalService.updatelbdetails(lbdetails);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _lbdetailsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _lbdetailsLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _lbdetailsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _lbdetailsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _lbdetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of lbdetailses.
	*
	* @return the number of lbdetailses
	*/
	@Override
	public int getlbdetailsesCount() {
		return _lbdetailsLocalService.getlbdetailsesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _lbdetailsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _lbdetailsLocalService.getOSGiServiceIdentifier();
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
		return _lbdetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.learningbites.model.impl.lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _lbdetailsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.learningbites.model.impl.lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _lbdetailsLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.chola.learningbites.model.lbdetails> getLBDetails(
		long contentId) {
		return _lbdetailsLocalService.getLBDetails(contentId);
	}

	/**
	* Returns a range of all the lbdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.learningbites.model.impl.lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lbdetailses
	* @param end the upper bound of the range of lbdetailses (not inclusive)
	* @return the range of lbdetailses
	*/
	@Override
	public java.util.List<com.chola.learningbites.model.lbdetails> getlbdetailses(
		int start, int end) {
		return _lbdetailsLocalService.getlbdetailses(start, end);
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
		return _lbdetailsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _lbdetailsLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public lbdetailsLocalService getWrappedService() {
		return _lbdetailsLocalService;
	}

	@Override
	public void setWrappedService(lbdetailsLocalService lbdetailsLocalService) {
		_lbdetailsLocalService = lbdetailsLocalService;
	}

	private lbdetailsLocalService _lbdetailsLocalService;
}