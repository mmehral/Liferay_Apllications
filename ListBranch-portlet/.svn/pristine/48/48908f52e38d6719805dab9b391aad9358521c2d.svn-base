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

package com.chola.listbranch.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link cityLocalService}.
 *
 * @author adms.java1
 * @see cityLocalService
 * @generated
 */
@ProviderType
public class cityLocalServiceWrapper implements cityLocalService,
	ServiceWrapper<cityLocalService> {
	public cityLocalServiceWrapper(cityLocalService cityLocalService) {
		_cityLocalService = cityLocalService;
	}

	/**
	* Adds the city to the database. Also notifies the appropriate model listeners.
	*
	* @param city the city
	* @return the city that was added
	*/
	@Override
	public com.chola.listbranch.model.city addcity(
		com.chola.listbranch.model.city city) {
		return _cityLocalService.addcity(city);
	}

	/**
	* Creates a new city with the primary key. Does not add the city to the database.
	*
	* @param city_id the primary key for the new city
	* @return the new city
	*/
	@Override
	public com.chola.listbranch.model.city createcity(long city_id) {
		return _cityLocalService.createcity(city_id);
	}

	/**
	* Deletes the city from the database. Also notifies the appropriate model listeners.
	*
	* @param city the city
	* @return the city that was removed
	*/
	@Override
	public com.chola.listbranch.model.city deletecity(
		com.chola.listbranch.model.city city) {
		return _cityLocalService.deletecity(city);
	}

	/**
	* Deletes the city with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param city_id the primary key of the city
	* @return the city that was removed
	* @throws PortalException if a city with the primary key could not be found
	*/
	@Override
	public com.chola.listbranch.model.city deletecity(long city_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cityLocalService.deletecity(city_id);
	}

	@Override
	public com.chola.listbranch.model.city fetchcity(long city_id) {
		return _cityLocalService.fetchcity(city_id);
	}

	/**
	* Returns the city with the primary key.
	*
	* @param city_id the primary key of the city
	* @return the city
	* @throws PortalException if a city with the primary key could not be found
	*/
	@Override
	public com.chola.listbranch.model.city getcity(long city_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cityLocalService.getcity(city_id);
	}

	/**
	* Updates the city in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param city the city
	* @return the city that was updated
	*/
	@Override
	public com.chola.listbranch.model.city updatecity(
		com.chola.listbranch.model.city city) {
		return _cityLocalService.updatecity(city);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _cityLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cityLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _cityLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cityLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cityLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of cities.
	*
	* @return the number of cities
	*/
	@Override
	public int getcitiesCount() {
		return _cityLocalService.getcitiesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _cityLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _cityLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.lang.String getbranchName(long branchId) {
		return _cityLocalService.getbranchName(branchId);
	}

	@Override
	public java.lang.String getcityName(long cityId) {
		return _cityLocalService.getcityName(cityId);
	}

	@Override
	public java.lang.String getproductName(long productId) {
		return _cityLocalService.getproductName(productId);
	}

	@Override
	public java.lang.String getstateName(long stateId) {
		return _cityLocalService.getstateName(stateId);
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
		return _cityLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.listbranch.model.impl.cityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cityLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.listbranch.model.impl.cityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cityLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List getBranchNamedetails(long cityId) {
		return _cityLocalService.getBranchNamedetails(cityId);
	}

	@Override
	public java.util.List<java.lang.String> getCities(long stateID) {
		return _cityLocalService.getCities(stateID);
	}

	@Override
	public java.util.List<java.lang.String> getCity() {
		return _cityLocalService.getCity();
	}

	@Override
	public java.util.List<java.lang.String> getProduct() {
		return _cityLocalService.getProduct();
	}

	@Override
	public java.util.List<java.lang.String> getState() {
		return _cityLocalService.getState();
	}

	/**
	* Returns a range of all the cities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.listbranch.model.impl.cityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cities
	* @param end the upper bound of the range of cities (not inclusive)
	* @return the range of cities
	*/
	@Override
	public java.util.List<com.chola.listbranch.model.city> getcities(
		int start, int end) {
		return _cityLocalService.getcities(start, end);
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
		return _cityLocalService.dynamicQueryCount(dynamicQuery);
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
		return _cityLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public cityLocalService getWrappedService() {
		return _cityLocalService;
	}

	@Override
	public void setWrappedService(cityLocalService cityLocalService) {
		_cityLocalService = cityLocalService;
	}

	private cityLocalService _cityLocalService;
}