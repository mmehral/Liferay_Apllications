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

package com.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link mappingLocalService}.
 *
 * @author adms.java1
 * @see mappingLocalService
 * @generated
 */
@ProviderType
public class mappingLocalServiceWrapper implements mappingLocalService,
	ServiceWrapper<mappingLocalService> {
	public mappingLocalServiceWrapper(mappingLocalService mappingLocalService) {
		_mappingLocalService = mappingLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _mappingLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _mappingLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _mappingLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mappingLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mappingLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the mapping to the database. Also notifies the appropriate model listeners.
	*
	* @param mapping the mapping
	* @return the mapping that was added
	*/
	@Override
	public com.model.mapping addmapping(com.model.mapping mapping) {
		return _mappingLocalService.addmapping(mapping);
	}

	/**
	* Creates a new mapping with the primary key. Does not add the mapping to the database.
	*
	* @param mapping_id the primary key for the new mapping
	* @return the new mapping
	*/
	@Override
	public com.model.mapping createmapping(long mapping_id) {
		return _mappingLocalService.createmapping(mapping_id);
	}

	/**
	* Deletes the mapping from the database. Also notifies the appropriate model listeners.
	*
	* @param mapping the mapping
	* @return the mapping that was removed
	*/
	@Override
	public com.model.mapping deletemapping(com.model.mapping mapping) {
		return _mappingLocalService.deletemapping(mapping);
	}

	/**
	* Deletes the mapping with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param mapping_id the primary key of the mapping
	* @return the mapping that was removed
	* @throws PortalException if a mapping with the primary key could not be found
	*/
	@Override
	public com.model.mapping deletemapping(long mapping_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mappingLocalService.deletemapping(mapping_id);
	}

	@Override
	public com.model.mapping fetchmapping(long mapping_id) {
		return _mappingLocalService.fetchmapping(mapping_id);
	}

	/**
	* Returns the mapping with the primary key.
	*
	* @param mapping_id the primary key of the mapping
	* @return the mapping
	* @throws PortalException if a mapping with the primary key could not be found
	*/
	@Override
	public com.model.mapping getmapping(long mapping_id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mappingLocalService.getmapping(mapping_id);
	}

	/**
	* Updates the mapping in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param mapping the mapping
	* @return the mapping that was updated
	*/
	@Override
	public com.model.mapping updatemapping(com.model.mapping mapping) {
		return _mappingLocalService.updatemapping(mapping);
	}

	/**
	* Returns the number of mappings.
	*
	* @return the number of mappings
	*/
	@Override
	public int getmappingsCount() {
		return _mappingLocalService.getmappingsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _mappingLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _mappingLocalService.getOSGiServiceIdentifier();
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
		return _mappingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.model.impl.mappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _mappingLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.model.impl.mappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _mappingLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the mappings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.model.impl.mappingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mappings
	* @param end the upper bound of the range of mappings (not inclusive)
	* @return the range of mappings
	*/
	@Override
	public java.util.List<com.model.mapping> getmappings(int start, int end) {
		return _mappingLocalService.getmappings(start, end);
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
		return _mappingLocalService.dynamicQueryCount(dynamicQuery);
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
		return _mappingLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public mappingLocalService getWrappedService() {
		return _mappingLocalService;
	}

	@Override
	public void setWrappedService(mappingLocalService mappingLocalService) {
		_mappingLocalService = mappingLocalService;
	}

	private mappingLocalService _mappingLocalService;
}