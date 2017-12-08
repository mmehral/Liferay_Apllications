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

package com.chola.InternalJobRef.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link InternalReferenceLocalService}.
 *
 * @author CloverLiferay03
 * @see InternalReferenceLocalService
 * @generated
 */
@ProviderType
public class InternalReferenceLocalServiceWrapper
	implements InternalReferenceLocalService,
		ServiceWrapper<InternalReferenceLocalService> {
	public InternalReferenceLocalServiceWrapper(
		InternalReferenceLocalService internalReferenceLocalService) {
		_internalReferenceLocalService = internalReferenceLocalService;
	}

	/**
	* Adds the internal reference to the database. Also notifies the appropriate model listeners.
	*
	* @param internalReference the internal reference
	* @return the internal reference that was added
	*/
	@Override
	public com.chola.InternalJobRef.model.InternalReference addInternalReference(
		com.chola.InternalJobRef.model.InternalReference internalReference) {
		return _internalReferenceLocalService.addInternalReference(internalReference);
	}

	/**
	* Creates a new internal reference with the primary key. Does not add the internal reference to the database.
	*
	* @param refId the primary key for the new internal reference
	* @return the new internal reference
	*/
	@Override
	public com.chola.InternalJobRef.model.InternalReference createInternalReference(
		long refId) {
		return _internalReferenceLocalService.createInternalReference(refId);
	}

	/**
	* Deletes the internal reference from the database. Also notifies the appropriate model listeners.
	*
	* @param internalReference the internal reference
	* @return the internal reference that was removed
	*/
	@Override
	public com.chola.InternalJobRef.model.InternalReference deleteInternalReference(
		com.chola.InternalJobRef.model.InternalReference internalReference) {
		return _internalReferenceLocalService.deleteInternalReference(internalReference);
	}

	/**
	* Deletes the internal reference with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param refId the primary key of the internal reference
	* @return the internal reference that was removed
	* @throws PortalException if a internal reference with the primary key could not be found
	*/
	@Override
	public com.chola.InternalJobRef.model.InternalReference deleteInternalReference(
		long refId) throws com.liferay.portal.kernel.exception.PortalException {
		return _internalReferenceLocalService.deleteInternalReference(refId);
	}

	@Override
	public com.chola.InternalJobRef.model.InternalReference fetchInternalReference(
		long refId) {
		return _internalReferenceLocalService.fetchInternalReference(refId);
	}

	/**
	* Returns the internal reference with the primary key.
	*
	* @param refId the primary key of the internal reference
	* @return the internal reference
	* @throws PortalException if a internal reference with the primary key could not be found
	*/
	@Override
	public com.chola.InternalJobRef.model.InternalReference getInternalReference(
		long refId) throws com.liferay.portal.kernel.exception.PortalException {
		return _internalReferenceLocalService.getInternalReference(refId);
	}

	/**
	* Updates the internal reference in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param internalReference the internal reference
	* @return the internal reference that was updated
	*/
	@Override
	public com.chola.InternalJobRef.model.InternalReference updateInternalReference(
		com.chola.InternalJobRef.model.InternalReference internalReference) {
		return _internalReferenceLocalService.updateInternalReference(internalReference);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _internalReferenceLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _internalReferenceLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _internalReferenceLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _internalReferenceLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _internalReferenceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of internal references.
	*
	* @return the number of internal references
	*/
	@Override
	public int getInternalReferencesCount() {
		return _internalReferenceLocalService.getInternalReferencesCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _internalReferenceLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _internalReferenceLocalService.getOSGiServiceIdentifier();
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
		return _internalReferenceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.InternalJobRef.model.impl.InternalReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _internalReferenceLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.InternalJobRef.model.impl.InternalReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _internalReferenceLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the internal references.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.InternalJobRef.model.impl.InternalReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of internal references
	* @param end the upper bound of the range of internal references (not inclusive)
	* @return the range of internal references
	*/
	@Override
	public java.util.List<com.chola.InternalJobRef.model.InternalReference> getInternalReferences(
		int start, int end) {
		return _internalReferenceLocalService.getInternalReferences(start, end);
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
		return _internalReferenceLocalService.dynamicQueryCount(dynamicQuery);
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
		return _internalReferenceLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public InternalReferenceLocalService getWrappedService() {
		return _internalReferenceLocalService;
	}

	@Override
	public void setWrappedService(
		InternalReferenceLocalService internalReferenceLocalService) {
		_internalReferenceLocalService = internalReferenceLocalService;
	}

	private InternalReferenceLocalService _internalReferenceLocalService;
}