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

package com.chola.knowledgebites.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link kbpathLocalService}.
 *
 * @author cloverliferay01
 * @see kbpathLocalService
 * @generated
 */
@ProviderType
public class kbpathLocalServiceWrapper implements kbpathLocalService,
	ServiceWrapper<kbpathLocalService> {
	public kbpathLocalServiceWrapper(kbpathLocalService kbpathLocalService) {
		_kbpathLocalService = kbpathLocalService;
	}

	/**
	* Adds the kbpath to the database. Also notifies the appropriate model listeners.
	*
	* @param kbpath the kbpath
	* @return the kbpath that was added
	*/
	@Override
	public com.chola.knowledgebites.model.kbpath addkbpath(
		com.chola.knowledgebites.model.kbpath kbpath) {
		return _kbpathLocalService.addkbpath(kbpath);
	}

	/**
	* Creates a new kbpath with the primary key. Does not add the kbpath to the database.
	*
	* @param id the primary key for the new kbpath
	* @return the new kbpath
	*/
	@Override
	public com.chola.knowledgebites.model.kbpath createkbpath(long id) {
		return _kbpathLocalService.createkbpath(id);
	}

	/**
	* Deletes the kbpath from the database. Also notifies the appropriate model listeners.
	*
	* @param kbpath the kbpath
	* @return the kbpath that was removed
	*/
	@Override
	public com.chola.knowledgebites.model.kbpath deletekbpath(
		com.chola.knowledgebites.model.kbpath kbpath) {
		return _kbpathLocalService.deletekbpath(kbpath);
	}

	/**
	* Deletes the kbpath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the kbpath
	* @return the kbpath that was removed
	* @throws PortalException if a kbpath with the primary key could not be found
	*/
	@Override
	public com.chola.knowledgebites.model.kbpath deletekbpath(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kbpathLocalService.deletekbpath(id);
	}

	@Override
	public com.chola.knowledgebites.model.kbpath fetchkbpath(long id) {
		return _kbpathLocalService.fetchkbpath(id);
	}

	/**
	* Returns the kbpath with the primary key.
	*
	* @param id the primary key of the kbpath
	* @return the kbpath
	* @throws PortalException if a kbpath with the primary key could not be found
	*/
	@Override
	public com.chola.knowledgebites.model.kbpath getkbpath(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kbpathLocalService.getkbpath(id);
	}

	/**
	* Updates the kbpath in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param kbpath the kbpath
	* @return the kbpath that was updated
	*/
	@Override
	public com.chola.knowledgebites.model.kbpath updatekbpath(
		com.chola.knowledgebites.model.kbpath kbpath) {
		return _kbpathLocalService.updatekbpath(kbpath);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _kbpathLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _kbpathLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _kbpathLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kbpathLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kbpathLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of kbpaths.
	*
	* @return the number of kbpaths
	*/
	@Override
	public int getkbpathsCount() {
		return _kbpathLocalService.getkbpathsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _kbpathLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _kbpathLocalService.getOSGiServiceIdentifier();
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
		return _kbpathLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.knowledgebites.model.impl.kbpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _kbpathLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.knowledgebites.model.impl.kbpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _kbpathLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.chola.knowledgebites.model.kbpath> getKBDetails(
		long contentId) {
		return _kbpathLocalService.getKBDetails(contentId);
	}

	/**
	* Returns a range of all the kbpaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.knowledgebites.model.impl.kbpathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kbpaths
	* @param end the upper bound of the range of kbpaths (not inclusive)
	* @return the range of kbpaths
	*/
	@Override
	public java.util.List<com.chola.knowledgebites.model.kbpath> getkbpaths(
		int start, int end) {
		return _kbpathLocalService.getkbpaths(start, end);
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
		return _kbpathLocalService.dynamicQueryCount(dynamicQuery);
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
		return _kbpathLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public kbpathLocalService getWrappedService() {
		return _kbpathLocalService;
	}

	@Override
	public void setWrappedService(kbpathLocalService kbpathLocalService) {
		_kbpathLocalService = kbpathLocalService;
	}

	private kbpathLocalService _kbpathLocalService;
}